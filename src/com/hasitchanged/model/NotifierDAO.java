package com.hasitchanged.model;

import java.util.List;

public interface NotifierDAO {
	public Integer store(Notifier notifier);
	public List<Notifier> getByUser(User user);
}
