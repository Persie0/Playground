package p119ff;

import ae.C0065e;
import ae.C0066f;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: ff.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5529a {

    /* JADX INFO: renamed from: c */
    public static final String[] f34209c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f34210a;

    /* JADX INFO: renamed from: b */
    public final String f34211b;

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    public C5529a(C0065e c0065e) {
        c0065e.m437a();
        this.f34210a = c0065e.f171a.getSharedPreferences("com.google.android.gms.appid", 0);
        c0065e.m437a();
        C0066f c0066f = c0065e.f173c;
        String str = c0066f.f187e;
        if (str == null) {
            c0065e.m437a();
            str = c0066f.f184b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f34211b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final String m11767a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f34210a) {
            String strEncodeToString = null;
            String string = this.f34210a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
