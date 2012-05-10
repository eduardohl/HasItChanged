package com.hasitchanged.service;

import com.hasitchanged.model.Notifier;
import com.hasitchanged.model.NotifierDAO;
import com.hasitchanged.model.User;

public class NotifierServiceImpl implements NotifierService {

	private NotifierDAO notifierDAO;
	
	@Override
	public Integer addNotifier(Notifier notifier) {
		return notifierDAO.store(notifier);
	}

	@Override
	public void listNotifiers(User user) {
		notifierDAO.getByUser(user);
	}
}