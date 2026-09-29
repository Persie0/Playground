package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class m9c {

    /* JADX INFO: renamed from: a */
    public static final Charset f50823a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f50824b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f50824b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static int m16703a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
