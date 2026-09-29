package p073df;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: df.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5166h {

    /* JADX INFO: renamed from: a */
    public static final byte f33165a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    public static final byte f33166b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: a */
    public static String m10943a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b10 = bArrArray[0];
        bArrArray[16] = b10;
        bArrArray[0] = (byte) ((b10 & f33166b) | f33165a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
