package p000;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcx {

    /* JADX INFO: renamed from: a */
    public static final Charset f21334a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d */
    private static fcx f21335d;

    /* JADX INFO: renamed from: b */
    public final MessageDigest f21336b;

    /* JADX INFO: renamed from: c */
    public final Object f21337c = new Object();

    public fcx(MessageDigest messageDigest) {
        this.f21336b = messageDigest;
    }

    /* JADX INFO: renamed from: a */
    public static fcx m8224a() {
        if (f21335d == null) {
            try {
                f21335d = new fcx(MessageDigest.getInstance("SHA-1"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Cannot initialize file name hasher", e);
            }
        }
        return f21335d;
    }
}
