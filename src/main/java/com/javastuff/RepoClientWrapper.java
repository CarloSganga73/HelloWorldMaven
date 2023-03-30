package com.javastuff;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RepoClientWrapper {

	private static final String API_TOKEN_NAME = "X-REPO-API-Key-Token";

	public static RepoDocument getRepoDoc(String galenoRepositoryReadUrl, String apiToken, Integer docId) {
		System.out.println("...ClientBuilder.newClient");
		Client client = null;
		try {
			client = ClientBuilder.newClient();
		} catch (Exception e) {
			e.toString();
		}
		System.out.println("...client.target");
		return client.target(galenoRepositoryReadUrl + "getContent/").path(String.valueOf(docId)).request(MediaType.APPLICATION_JSON).header(API_TOKEN_NAME, apiToken).get(RepoDocument.class);
	}

}
