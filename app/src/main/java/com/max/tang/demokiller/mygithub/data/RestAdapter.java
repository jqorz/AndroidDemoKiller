package com.max.tang.demokiller.mygithub.data;

import com.max.tang.demokiller.mygithub.data.entities.GithubRepo;
import com.max.tang.demokiller.mygithub.data.entities.OwnerResponse;
import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;

public interface RestAdapter {

	class Nodes {
		public static final String users = "/users";
		public static final String username = "/zhihuitang";
		public static final String repos = "/repos";
	}

	@GET(Nodes.users + Nodes.username + Nodes.repos)
	void getGithubRepos(Callback<List<GithubRepo>> callback);

	@GET(Nodes.users + Nodes.username)
	void getOwner(Callback<OwnerResponse> callback);
}
