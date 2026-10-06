package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqp {

    /* JADX INFO: renamed from: a */
    private static final Charset f44069a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static Long m17625a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(f44069a));
            return Long.valueOf(ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
