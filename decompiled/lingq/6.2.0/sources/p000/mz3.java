package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class mz3 {

    /* JADX INFO: renamed from: c */
    public static final String[] f52061c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f52062a;

    /* JADX INFO: renamed from: b */
    public final String f52063b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public mz3(q43 q43Var) {
        q43Var.m19644a();
        this.f52062a = q43Var.f57252a.getSharedPreferences("com.google.android.gms.appid", 0);
        q43Var.m19644a();
        a53 a53Var = q43Var.f57254c;
        String str = a53Var.f264e;
        if (str == null) {
            q43Var.m19644a();
            str = a53Var.f261b;
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
        this.f52063b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m17158a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f52062a) {
            String strEncodeToString = null;
            String string = this.f52062a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
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
