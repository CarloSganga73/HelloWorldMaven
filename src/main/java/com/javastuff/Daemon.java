package com.javastuff;

import java.util.concurrent.Semaphore;

public class Daemon implements Runnable {

	private final Semaphore semaphore = new Semaphore(1);

	public void run() {
		while (true) {
			try {
				System.out.println("Still running...");
				// Acquire the semaphore
				// semaphore.acquire();

				// Execute the task
				executeTask();

				// Release the semaphore
				// semaphore.release();

				// Wait before executing the task again
				System.out.println("..Thread.sleep(1000");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Handle the interrupt
				Thread.currentThread().interrupt();
			}
		}
	}

	private void executeTask() throws InterruptedException {
		// Check if the previous execution is still running
		// if (semaphore.availablePermits() == 0) {
		// System.out.println("Previous execution is still running, skipping...");
		// return;
		// }

		System.out.println("Executing task...");

	
		// Simulate the task
		Thread.sleep(5000);
	}
	
	public static void doCall()
	{
		String galenoNewRepositoryReadUrl = "http://127.0.0.1:8080/Galeno/ws/repository/";
		Integer fisIdsmart = 954810;
		String repoAPIKey = "FA662FF6-AB28-42F4-9A78-B101354B7D56";
		System.out.println("Executing task..." + galenoNewRepositoryReadUrl);
		System.out.println("Executing task..." + fisIdsmart);
		System.out.println("Executing task..." + repoAPIKey);

		RepoDocument repoDoc = null;
		try {
			repoDoc = RepoClientWrapper.getRepoDoc(galenoNewRepositoryReadUrl, repoAPIKey, fisIdsmart);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println("...");

		byte[] res = null;
		if(repoDoc!= null) 
			res = repoDoc.getContentBase64();

		System.out.println("Doc retreived was... " + (res != null ? res.length : "??") + " bytes");

	}

}