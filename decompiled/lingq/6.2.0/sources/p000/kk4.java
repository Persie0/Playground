package p000;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kk4 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f47453a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static C3410oi m15292a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (C3410oi c3410oi : f47453a) {
            synchronized (c3410oi) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return c3410oi;
            }
        }
        throw new GeneralSecurityException(AbstractC3393o1.m17734i("No KMS client does support: ", str));
    }
}
