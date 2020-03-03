package com.food.ordering.ssn.service;

import java.util.List;

import com.food.ordering.ssn.model.UserCollegeModel;
import com.food.ordering.ssn.model.UserShopListModel;
import com.food.ordering.ssn.model.UserShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.ordering.ssn.dao.UserDao;
import com.food.ordering.ssn.model.UserModel;
import com.food.ordering.ssn.utils.Response;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public Response<UserCollegeModel> insertCustomer(UserModel user) {
		return userDao.insertCustomer(user);
	}

	public Response<UserShopListModel> insertSeller(UserModel user) {
		return userDao.insertSeller(user);
	}

	public Response<List<UserModel>> getAllUser(String oauthId) {
		return userDao.getAllUser(oauthId);
	}

	public Response<UserModel> getUserByOauthId(String oauthId, String oauthIdRh) {
		return userDao.getUserByOauthId(oauthId, oauthIdRh);
    }

	public Response<String> updateUserByOauthId(UserModel user, String oauthId) {
		return userDao.updateUserByOauthId(user, oauthId);
	}

	public Response<UserModel> deleteUserByOauthId(String oauthId, String oauthIdRh) {
		return userDao.deleteUserByOauthId(oauthId, oauthIdRh);
	}
}
