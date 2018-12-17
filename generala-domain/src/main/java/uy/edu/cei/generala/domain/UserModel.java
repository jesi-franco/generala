package uy.edu.cei.generala.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQueries({
		@NamedQuery(name = "UserModel.findByUsername", query = "SELECT user FROM UserModel user WHERE user.username = :username"),
		@NamedQuery(name = "UserModel.fetchAll", query = "SELECT user FROM UserModel user") })
public class UserModel implements Serializable {

	/**
	 * Default UID
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getWonMatches() {
		return wonMatches;
	}

	public void setWonMatches(int wonMatches) {
		this.wonMatches = wonMatches;
	}

	public int getLostMatches() {
		return lostMatches;
	}

	public void setLostMatches(int lostMatches) {
		this.lostMatches = lostMatches;
	}

	public int getTieMatches() {
		return tieMatches;
	}

	public void setTieMatches(int tieMatches) {
		this.tieMatches = tieMatches;
	}

	public int getVirtualCoins() {
		return virtualCoins;
	}

	public void setVirtualCoins(int virtualCoins) {
		this.virtualCoins = virtualCoins;
	}

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

	/*
	 * @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "fk_user") private List<Address> addresses;
	 */

	public UserModel() {
	}

	public UserModel(String username, String password, String name, String email) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.virtualCoins = 0;
		this.wonMatches = 0;
		this.lostMatches = 0;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UserModel) {
			UserModel o = (UserModel) obj;
			return this.username.equals(o.username);
		}
		return false;
	}

}