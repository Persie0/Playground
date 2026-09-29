package p124fp;

import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.text.C7076b;

/* JADX INFO: renamed from: fp.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C5617n {
    /* JADX INFO: renamed from: a */
    public static final boolean m11989a(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        C5207g.m11111f(bArr, "a");
        C5207g.m11111f(bArr2, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final C5621r m11990b(InterfaceC5625v interfaceC5625v) {
        C5207g.m11111f(interfaceC5625v, "<this>");
        return new C5621r(interfaceC5625v);
    }

    /* JADX INFO: renamed from: c */
    public static final C5622s m11991c(InterfaceC5627x interfaceC5627x) {
        C5207g.m11111f(interfaceC5627x, "<this>");
        return new C5622s(interfaceC5627x);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final void m11992d(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m11993e(AssertionError assertionError) {
        Logger logger = C5618o.f34451a;
        boolean z10 = false;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? C7076b.m14278X2(message, "getsockname failed", false) : false) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public static final C5605b m11994f(Socket socket) throws IOException {
        Logger logger = C5618o.f34451a;
        C5626w c5626w = new C5626w(socket);
        OutputStream outputStream = socket.getOutputStream();
        C5207g.m11110e(outputStream, "getOutputStream()");
        return new C5605b(c5626w, new C5620q(outputStream, c5626w));
    }

    /* JADX INFO: renamed from: g */
    public static final C5606c m11995g(Socket socket) throws IOException {
        Logger logger = C5618o.f34451a;
        C5626w c5626w = new C5626w(socket);
        InputStream inputStream = socket.getInputStream();
        C5207g.m11110e(inputStream, "getInputStream()");
        return new C5606c(c5626w, new C5616m(inputStream, c5626w));
    }

    /* JADX INFO: renamed from: h */
    public static final String m11996h(byte b10) {
        char[] cArr = C5206f.f33269d;
        return new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]});
    }
}
