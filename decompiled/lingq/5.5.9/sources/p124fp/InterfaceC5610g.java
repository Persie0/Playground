package p124fp;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: fp.g */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5610g extends InterfaceC5627x, ReadableByteChannel {
    /* JADX INFO: renamed from: C0 */
    int mo11926C0(C5619p c5619p) throws IOException;

    /* JADX INFO: renamed from: E0 */
    boolean mo11929E0(long j10) throws IOException;

    /* JADX INFO: renamed from: I */
    byte[] mo11933I() throws IOException;

    /* JADX INFO: renamed from: J */
    long mo11935J(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: L */
    boolean mo11936L() throws IOException;

    /* JADX INFO: renamed from: M0 */
    String mo11938M0() throws IOException;

    /* JADX INFO: renamed from: R */
    long mo11943R(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: V */
    String mo11946V(long j10) throws IOException;

    /* JADX INFO: renamed from: X */
    long mo11948X(C5608e c5608e) throws IOException;

    /* JADX INFO: renamed from: e1 */
    boolean mo11955e1(ByteString byteString) throws IOException;

    /* JADX INFO: renamed from: f */
    C5608e mo11956f();

    /* JADX INFO: renamed from: o1 */
    void mo11960o1(long j10) throws IOException;

    /* JADX INFO: renamed from: q0 */
    String mo11962q0(Charset charset) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    /* JADX INFO: renamed from: t */
    ByteString mo11968t(long j10) throws IOException;

    /* JADX INFO: renamed from: w1 */
    long mo11973w1() throws IOException;

    /* JADX INFO: renamed from: x1 */
    InputStream mo11975x1();
}
