package ao;

import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: ao.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1271c {
    /* JADX INFO: renamed from: a */
    public static InputStream m4771a(String str) throws IOException {
        C5207g.m11111f(str, "path");
        ClassLoader classLoader = C1271c.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
