package p124fp;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* JADX INFO: renamed from: fp.f */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5609f extends InterfaceC5625v, WritableByteChannel {
    /* JADX INFO: renamed from: D */
    InterfaceC5609f mo11927D(int i10) throws IOException;

    /* JADX INFO: renamed from: M */
    InterfaceC5609f mo11937M(int i10) throws IOException;

    /* JADX INFO: renamed from: O0 */
    long mo11940O0(InterfaceC5627x interfaceC5627x) throws IOException;

    /* JADX INFO: renamed from: S */
    InterfaceC5609f mo11944S() throws IOException;

    /* JADX INFO: renamed from: U0 */
    InterfaceC5609f mo11945U0(byte[] bArr) throws IOException;

    /* JADX INFO: renamed from: Z0 */
    InterfaceC5609f mo11950Z0(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: f */
    C5608e mo11956f();

    @Override // p124fp.InterfaceC5625v, java.io.Flushable
    void flush() throws IOException;

    /* JADX INFO: renamed from: k0 */
    InterfaceC5609f mo11957k0(String str) throws IOException;

    /* JADX INFO: renamed from: s1 */
    InterfaceC5609f mo11967s1(long j10) throws IOException;

    /* JADX INFO: renamed from: v */
    InterfaceC5609f mo11970v(int i10) throws IOException;

    /* JADX INFO: renamed from: v0 */
    InterfaceC5609f mo11971v0(byte[] bArr, int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: x0 */
    InterfaceC5609f mo11974x0(String str, int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: z0 */
    InterfaceC5609f mo11978z0(long j10) throws IOException;
}
