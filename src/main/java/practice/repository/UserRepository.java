package practice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import practice.domain.UserInfo;

/**DBにアクセスするリポジトリクラス.
 * 
 * @author yu.terauchi
 *
 */
@Repository
@Transactional
public class UserRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/**
	 * 1行分のデータを1つのオブジェクトに変換してくれるフレームワーク
	 */
	private static final RowMapper<UserInfo> USERINFOROWMAPPER = (rs, i) -> {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(rs.getInt("id"));
		userInfo.setName(rs.getString("name"));
		userInfo.setAge(rs.getInt("age"));
		userInfo.setAddress(rs.getString("address"));
		return userInfo;
	};

	/**
	 * フォームで受け取ったidの値をコントローラクラスから受け取りDBのinfoテーブルに参照するメソッド.
	 * 
	 * @param id フォームから受け取った値が入る引数
	 * @return　一行分のデータが入ったuserInfoオブジェクト
	 */
	public UserInfo load(Integer id) {
		String sql = "SELECT id,name,age,address FROM info WHERE id = :id ";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		UserInfo userInfo = template.queryForObject(sql, param, USERINFOROWMAPPER);
		return userInfo;
	}
}
