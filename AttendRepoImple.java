package org.techhub.JForceSolutionsTaskApplication.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.techhub.JForceSolutionsTaskApplication.Model.Attend;

@Repository("aRepo")
public class AttendRepoImple implements AttendRepo {

    @Autowired
    JdbcTemplate temp;

    public boolean signIn(final int userId, final LocalDate date) {
        int val = temp.update("INSERT INTO attend (userid, date,signin, signout) VALUES(?, ?, ?, TRUE, FALSE) ON DUPLICATE KEY UPDATE signin=TRUE, signout=FALSE",
            new PreparedStatementSetter() {
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setInt(1, userId);
                    ps.setDate(2, java.sql.Date.valueOf(date));
                }
            });
       if(val > 0)
       {
    	   return true;
       }
       else
       {
    	   return false;
       }
    }

    public boolean signOut(final int userId, final LocalDate date) {
        int val = temp.update("UPDATE attend SET signout=true, signout_time=? WHERE userid=? AND date=? AND signin=true",
            new PreparedStatementSetter() {
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setInt(1, userId);
                    ps.setDate(2, java.sql.Date.valueOf(date));
                }
            });
        if(val > 0)
        {
     	   return true;
        }
        else
        {
     	   return false;
        }
    }

    @Override
    public List<Attend> getAttendanceReport(int userId) {
        List<Attend>list= temp.query("SELECT * FROM attend WHERE userid=?", new RowMapper<Attend>() {
            public Attend mapRow(ResultSet rs, int rowNum) throws SQLException {
                Attend attend = new Attend();
                attend.setId(rs.getInt("id"));
                attend.setUserid(rs.getInt("userid"));
                attend.setDate(rs.getDate("date").toLocalDate());
                attend.setSignin(rs.getBoolean("signin"));
                attend.setSignout(rs.getBoolean("signout"));
                return attend;
            }
        });
        return list;
    }
}
