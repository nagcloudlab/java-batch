package com.example;

public class StorageFactory {

	public static Storage getStorage(String type) {

		if (type.equals("file")) {
			return new FileStorage();
		}
		if (type.equals("s3")) {
			return new S3Storage();
		}

		throw new IllegalArgumentException("invalid storage type");
	}

}
