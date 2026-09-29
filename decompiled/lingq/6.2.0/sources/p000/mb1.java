package p000;

import android.content.Context;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mb1 {
    /* JADX INFO: renamed from: a */
    public static File m16741a(Context context) {
        context.getClass();
        return new File(ux5.m22990m(context.getFilesDir().toString(), "/fonts/"));
    }

    /* JADX INFO: renamed from: b */
    public static String m16742b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(yu0.f70463a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strConcat = "";
        for (byte b : bArrDigest) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: c */
    public static File m16743c(Context context) {
        context.getClass();
        return new File(ux5.m22990m(context.getFilesDir().toString(), "/tracks/"));
    }

    /* JADX INFO: renamed from: d */
    public static File m16744d(Context context) {
        return new File(ux5.m22990m(context.getFilesDir().toString(), "/tts/"));
    }
}
