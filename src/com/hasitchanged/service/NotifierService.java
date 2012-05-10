package com.hasitchanged.service;

import com.hasitchanged.model.Notifier;
import com.hasitchanged.model.User;

public interface NotifierService {
	public Integer addNotifier(Notifier notifier);
	public void listNotifiers(User user);
}
