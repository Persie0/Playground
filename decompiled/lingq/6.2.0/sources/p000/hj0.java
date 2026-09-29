package p000;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public interface hj0 extends yd9, ReadableByteChannel {
    /* JADX INFO: renamed from: D */
    String mo457D(long j);

    /* JADX INFO: renamed from: E */
    long mo458E(gj0 gj0Var);

    /* JADX INFO: renamed from: K */
    String mo462K(Charset charset);

    /* JADX INFO: renamed from: P */
    boolean mo464P(long j);

    /* JADX INFO: renamed from: Q */
    int mo465Q();

    /* JADX INFO: renamed from: V */
    short mo469V();

    /* JADX INFO: renamed from: b0 */
    void mo475b0(long j);

    /* JADX INFO: renamed from: f0 */
    InputStream mo480f0();

    /* JADX INFO: renamed from: h */
    aj0 mo482h();

    byte readByte();

    int readInt();

    short readShort();

    /* JADX INFO: renamed from: s */
    ByteString mo497s(long j);

    void skip(long j);

    /* JADX INFO: renamed from: w */
    byte[] mo499w();

    /* JADX INFO: renamed from: y */
    int mo501y(rz6 rz6Var);
}
