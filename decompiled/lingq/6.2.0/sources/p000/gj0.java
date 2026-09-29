package p000;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public interface gj0 extends t89, WritableByteChannel {
    /* JADX INFO: renamed from: B */
    long mo456B(yd9 yd9Var);

    /* JADX INFO: renamed from: G */
    gj0 mo460G(int i, byte[] bArr);

    /* JADX INFO: renamed from: H */
    gj0 mo461H(String str);

    /* JADX INFO: renamed from: U */
    gj0 mo468U(ByteString byteString);

    /* JADX INFO: renamed from: c0 */
    gj0 mo477c0(long j);

    /* JADX INFO: renamed from: d0 */
    OutputStream mo478d0();

    @Override // p000.t89, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: h */
    aj0 mo482h();

    gj0 write(byte[] bArr);

    gj0 writeByte(int i);

    gj0 writeInt(int i);

    gj0 writeShort(int i);
}
