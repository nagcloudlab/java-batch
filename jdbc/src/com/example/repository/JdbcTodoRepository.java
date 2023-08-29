package com.example.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.db.DataSourceConnectionFactory;
import com.example.entity.Todo;
import com.mysql.cj.xdevapi.Result;

public class JdbcTodoRepository implements TodoRepository {

	@Override
	public void save(Todo todo) {
		Connection connection = null;
		try {
			connection = DataSourceConnectionFactory.getConnection();
			String sql = "insert into todos(title,completed) values(?,?)";

			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, todo.getTitle());
			ps.setBoolean(2, todo.isCompleted());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public List<Todo> findAll() {
		Connection connection = null;
		List<Todo> todos = new ArrayList<>();
		try {
			connection = DataSourceConnectionFactory.getConnection();
			String sql = "select * from todos";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Todo todo = new Todo();
				todo.setId(rs.getInt(1));
				todo.setTitle(rs.getString(2));
				todo.setCompleted(rs.getBoolean(3));
				todos.add(todo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return todos;
	}

	public void update(Todo todo) {
		Connection connection = null;
		try {
			connection = DataSourceConnectionFactory.getConnection();
			String sql = "update todos set title=?,completed=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, todo.getTitle());
			ps.setBoolean(2, todo.isCompleted());
			ps.setInt(3, todo.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public void delete(int id) {
		Connection connection = null;
		try {
			connection = DataSourceConnectionFactory.getConnection();
			String sql = "delete from todos where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
