package com.kh.member.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.kh.common.JDBCTemplate.*;

import com.kh.member.model.vo.Friend;
import com.kh.member.model.vo.FriendQueue;
import com.kh.member.model.vo.Member;

public class MemberDao {
    Properties prop = new Properties();
    
    public MemberDao() {
        String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
        try {
            prop.load(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int insertMember(Connection conn, Member m) {
        int result = 0;
        PreparedStatement pstmt = null;
        
        String query = prop.getProperty("insertMember");
       // System.out.println(query);
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, m.getMemberId());
            pstmt.setString(2, m.getMemberPwd());
            pstmt.setString(3, m.getMemberName());
            pstmt.setString(4, m.getMemberGender());
            pstmt.setInt(5, m.getMemberAge());
            pstmt.setString(6, m.getMemberEmail());
            
            result = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
        }
        return result;
    }



	public int loginCheck(Connection conn, Member m) {
		int result = -1;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("loginCheck");		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPwd());
			pstmt.setString(3, m.getMemberId());
			
			rset = pstmt.executeQuery();			
			if(rset.next()) {
				result = rset.getInt("login_check");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);			
		}		
		return result;
	}

	public Member memberOne(Connection conn, String memberId) {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("memberOne");
		
		try{
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				m = new Member();
				//컬럼명은 대소문자 구분이 없다.
				m.setMemberId(rset.getString("member_id"));
				m.setMemberPwd(rset.getString("member_pwd"));
				m.setMemberName(rset.getString("member_name"));
				m.setMemberGender(rset.getString("member_gender"));
				m.setMemberAge(rset.getInt("member_age"));
				m.setMemberEmail(rset.getString("member_email"));
				m.setMemberLoginlog(rset.getInt("member_login_log"));
				m.setMemberStatus(rset.getString("member_status"));
				m.setMemberSnsaccount(rset.getString("Member_sns_account"));
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(rset);
			close(pstmt);
		}		
		return m;
	}


	public Member MemberId(Connection conn, Member member) {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("searchId");
		System.out.println("member="+member);
		try{
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberName());
			pstmt.setString(2, member.getMemberEmail());
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				m = new Member();
				//컬럼명은 대소문자 구분이 없다.
				m.setMemberId(rset.getString("member_id"));
				
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(rset);
			close(pstmt);
		}		
		return m;
	}

	public int updateMember(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("updateMember"); 

		try {
			
			pstmt = conn.prepareStatement(query);
			
			
			pstmt.setString(1, m.getMemberName());
			pstmt.setString(2, m.getMemberEmail());
			pstmt.setString(3, m.getMemberId());
		
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteMember(Connection conn, String memberId) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("deleteMember"); 

		try {
			
			pstmt = conn.prepareStatement(query);
		
			pstmt.setString(1, memberId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}

	public int MemberPwd(Connection conn, Member member) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("searchPwd");
		System.out.println("member="+member);
		try{
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberEmail());
			rset = pstmt.executeQuery();
			
			if(rset.next()){
				member = new Member();
				//컬럼명은 대소문자 구분이 없다.
				member.setMemberPwd(rset.getString("member_pwd"));
				
			}			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			close(rset);
			close(pstmt);
		}		
		return result;


	}

	public int updatePassword(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("updatePassword");
		
		try {
			//1.쿼리객체준비끝
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPwd());
			pstmt.setString(2, m.getMemberId());
			
			//2.실행
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
		
	}


	public int updatePwd(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("updatePwd");
		
		System.out.println(query);
		try {
			//1.쿼리객체준비끝
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPwd());
			pstmt.setString(2, m.getMemberId());
		
			System.out.println("m333="+m);
			//2.실행
			result = pstmt.executeUpdate();
			System.out.println("result2="+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateMemberLog(Connection conn, String memberId) {
		int log = 0;
		PreparedStatement pstmt = null;
		
		String query = prop.getProperty("updateMemberLog");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			
			log = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return log;
	}

	public List<String> selectById(Connection conn, String srchId) {
		List<String> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("selectById");
		
		try {
	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%"+srchId+"%");
			
			rset = pstmt.executeQuery();

			list = new ArrayList<>();
			while(rset.next()) {
				list.add(rset.getString("member_id"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	public int pwdPermute(Connection conn, Member m) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("pwdPermute");
		try {
			//1.쿼리객체준비끝
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMemberPwd());
			pstmt.setString(2, m.getMemberEmail());
			pstmt.setString(3, m.getMemberId());
			System.out.println("dao memberpwd =="+m.getMemberPwd());
			System.out.println("dao memberEmail =="+m.getMemberEmail());
			System.out.println("dao memberId =="+m.getMemberId());
			
			
			//2.실행
			result = pstmt.executeUpdate();
			System.out.println("dao result =="+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	public int insertFriend(Connection conn, Friend f) {
        int result = 0;
        PreparedStatement pstmt = null;
        
        String query = prop.getProperty("insertFriend");
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, f.getMemberId());
            pstmt.setString(2, f.getFriendId());
            result = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
        }
        return result;
	}

	public int insertFriendQueue(Connection conn, FriendQueue fq) throws SQLIntegrityConstraintViolationException {
        int result = 0;
        PreparedStatement pstmt = null;
        
        String query = prop.getProperty("insertFriendQueue");
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, fq.getMemberId());
            pstmt.setString(2, fq.getFriendId());
            result = pstmt.executeUpdate();
            
        } catch (Exception e) {
        } finally {
            close(pstmt);
        }
        return result;

	}

	public List<String> checkFriend(Connection conn, String memberId) {
		List<String> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("checkFriend");
		
		try {
	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			
			rset = pstmt.executeQuery();

			list = new ArrayList<>();
			while(rset.next()) {
				list.add(rset.getString("member_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int deleteFriendQueue(Connection conn, String selectFriend, String memberId) {
		int result = 0;
		PreparedStatement pstmt = null;
		String query = prop.getProperty("deleteFriendQueue"); 

		try {
			// System.out.println("MemberDao@selectFriend/memberId : "+selectFriend+"/"+memberId);
			pstmt = conn.prepareStatement(query);
		
			pstmt.setString(1, selectFriend);
			pstmt.setString(2, memberId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	public int srchIdCheck(Connection conn, String srchId) {
		int srchIdCheck = -1;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("srchIdCheck");
		
		try {
	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, srchId);
			
			rset = pstmt.executeQuery();

			if(rset.next()) {
				srchIdCheck = rset.getInt("cnt");
			}
			System.out.println("srchIdCheck@srchIdCheck = "+srchIdCheck);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return srchIdCheck;
	}

	public int insertFriendMy(Connection conn, String memberId, String selectFriend) {
	      int insertFmy = 0;
	        PreparedStatement pstmt = null;
	        
	        String query = prop.getProperty("insertFriendMy");
	        try {
	            pstmt = conn.prepareStatement(query);
	            pstmt.setString(1, memberId);
	            pstmt.setString(2, selectFriend);

	            
	            insertFmy = pstmt.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally {
	            close(pstmt);
	        }
	        return insertFmy;
	    }

	public int insertFriendSf(Connection conn, String selectFriend, String memberId) {
	      int insertFsf = 0;
	        PreparedStatement pstmt = null;
	        
	        String query = prop.getProperty("insertFriendSf");
	        try {
	            pstmt = conn.prepareStatement(query);
	            pstmt.setString(1, selectFriend);
	            pstmt.setString(2, memberId);

	            
	            insertFsf = pstmt.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally {
	            close(pstmt);
	        }
	        return insertFsf;
	    }

	public List<String> selectFriendList(Connection conn, String memberId) {
		List<String> list = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("selectFriendList");
		
		try {
	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			
			rset = pstmt.executeQuery();

			list = new ArrayList<>();
			while(rset.next()) {
				list.add(rset.getString("friend_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int checkInfo(Connection conn, String memberId, String email) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("checkInfo");
		
		try {
	
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, memberId);
			
			rset = pstmt.executeQuery();

			if(rset.next()) {
				result = rset.getInt("cnt");
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public int alreadyCheckFriend(Connection conn, String myId, String srchId) {
		int alreadyCheckFriend = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = prop.getProperty("alreadyCheckFriend");


		
		try {
	
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, myId);
			pstmt.setString(2, srchId);

			rset = pstmt.executeQuery();

			if(rset.next()) {

				alreadyCheckFriend = rset.getInt("cnt");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alreadyCheckFriend;
	}


}
