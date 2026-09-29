package p000;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class qu5 {

    /* JADX INFO: renamed from: a */
    public static final HashSet f58221a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f58222b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m20178a(String str) {
        if (f58221a.add(str)) {
            f58222b += ", " + str;
        }
    }
}
