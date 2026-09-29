package p000;

import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class p94 {

    /* JADX INFO: renamed from: a */
    public static final Charset f55800a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f55801b;

    static {
        Charset.forName("US-ASCII");
        f55800a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f55801b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            if (i > Integer.MAX_VALUE) {
                throw new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m18992a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
