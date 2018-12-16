package uy.edu.cei.generala.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users")
@NamedQueries({
		@NamedQuery(name = "UserModel.findByUsername", query = "SELECT user FROM UserModel user WHERE user.username = :username"),
		@NamedQuery(name = "UserModel.fetchAll", query = "SELECT user FROM UserModel user")
})
public class UserModel implements Serializable {

	/**
	 * Default UID
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "won_matches")
	private int wonMatches;
	@Column(name = "lost_matches")
	private int lostMatches;
	@Column(name = "tie_matches")
	private int tieMatches;
	@Column(name = "coins")
	private int virtualCoins;
	
	/*@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_user")
	private List<Address> addresses;*/
	
	public UserModel() {
	}

	public UserModel(String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UserModel) {
			UserModel o = (UserModel) obj;
			return this.username.equals(o.username);
		}
		return false;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
