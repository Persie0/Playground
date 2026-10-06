package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djl {

    /* JADX INFO: renamed from: a */
    private static final nbh f11784a = nbh.m17259h("com/google/android/apps/camera/contentprovider/TrustedPartners");

    /* JADX INFO: renamed from: b */
    private final Set f11785b;

    /* JADX INFO: renamed from: c */
    private final PackageManager f11786c;

    public djl(Context context, Set set) {
        this.f11786c = context.getPackageManager();
        this.f11785b = set;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6214a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((nbe) ((nbe) f11784a.m17252c()).mo17276G((char) 893)).mo17290o("null or empty package name; do not trust");
            return false;
        }
        try {
            PackageInfo packageInfo = this.f11786c.getPackageInfo(str, 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                ((nbe) ((nbe) f11784a.m17252c()).mo17276G(890)).mo17296u("%d signatures found for package (%s); do not trust", packageInfo.signatures.length, str);
                return false;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(packageInfo.signatures[0].toByteArray());
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = ksm.f37117a;
                int length = bArrDigest.length;
                char[] cArr2 = new char[length + length];
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    char[] cArr3 = ksm.f37117a;
                    char c = cArr3[(b >> 4) & 15];
                    char c2 = cArr3[b & 15];
                    int i2 = i + i;
                    cArr2[i2] = c;
                    cArr2[i2 + 1] = c2;
                }
                return this.f11785b.contains(new String(cArr2));
            } catch (NoSuchAlgorithmException e) {
                ((nbe) ((nbe) f11784a.m17251b()).mo17276G((char) 891)).mo17293r("unable to compute hash using %s; do not trust", "SHA1");
                return false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((nbe) ((nbe) f11784a.m17252c()).mo17276G((char) 892)).mo17293r("package not found (%s); do not trust", str);
            return false;
        }
    }
}
