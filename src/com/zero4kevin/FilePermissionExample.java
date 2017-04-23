package com.zero4kevin;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/**
 * Created by kevin on 4/23/17.
 */
public class FilePermissionExample {
    public static void main(String[] args) throws IOException {
        String srg = "testout.txt";
        FilePermission fPermission= new FilePermission(".", "read");
        PermissionCollection permCollect= fPermission.newPermissionCollection()
    }
}
