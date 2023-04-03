package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DB와  관련있는 함수 들의 모임
public class MemberDao {
	public boolean insert(Member mem) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into member(id, pass, name, gender, tel, email, picture)"
				+"values(?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,mem.getId());
			pstmt.setString(2,mem.getPass());
			pstmt.setString(3,mem.getName());
			pstmt.setInt(4,mem.getGender());
			pstmt.setString(5,mem.getTel());
			pstmt.setString(6,mem.getEmail());
			pstmt.setString(7,mem.getPicture());
			if(pstmt.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(conn, pstmt, null);
		}
		return false;
	}
	public Member selectOne(String id) {
		Connection conn=DBConnection.getConnection();
		String sql = "select * from member where id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			//rs.next() : select된 결과 정보 조회.
			if(rs.next()) {
				Member mem = new Member();
				mem.setId(rs.getString("id"));
				mem.setPass(rs.getString("pass"));
				mem.setName(rs.getString("name"));
				mem.setGender(rs.getInt("gender"));
				mem.setTel(rs.getString("tel"));
				mem.setEmail(rs.getString("email"));
				mem.setPicture(rs.getString("picture"));
				return mem; //입력된 id 값의 해당 정보를 DB에서 조회된 데이터 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(conn, pstmt, rs);
		}
		return null;
	}
}
