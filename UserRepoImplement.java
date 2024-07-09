package org.techhub.JForceSolutionsTaskApplication.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.techhub.JForceSolutionsTaskApplication.Model.User;
import org.techhub.JForceSolutionsTaskApplication.Service.UserService;

@Repository("uRepo")
public class UserRepoImplement implements UserRepo {

	@Autowired
	JdbcTemplate temp;
    List<User>list;
	@Override
	public boolean isAdd(final User u) {
		int val=temp.update("insert into user values('0',?,?,?,?)",new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1,u.getUsername());
				ps.setString(2,u.getPassword());
				ps.setString(3,u.getEmailId());
				ps.setString(4,u.getPhoneNo());
			}
		});
		if(val>0)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	@Override
	public User isLogin(User u) {
		List<User>list=temp.query("select * from user where username=? and password=?",new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User us=new User();
				us.setId(rs.getInt(1));
				us.setUsername(rs.getString(2));
				us.setPassword(rs.getString(3));
				us.setEmailId(rs.getString(4));
				us.setPhoneNo(rs.getString(5));
				return us;
			}
			
		});
		return (User) list;
	}

	@Override
	public List<User> getAllUsers() {
		List<User>list=temp.query("select * from user",new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u=new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setEmailId(rs.getString(4));
				u.setPhoneNo(rs.getString(5));
				return u;
			}
			
		});
		return list;
	}
	
}
