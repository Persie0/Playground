package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes2.dex */
public final class i64 {

    /* JADX INFO: renamed from: d */
    public static final TinkFipsUtil$AlgorithmFipsCompatibility f43586d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a */
    public final n41 f43587a;

    /* JADX INFO: renamed from: b */
    public final n41 f43588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f43589c;

    public i64(int i, byte[] bArr) throws GeneralSecurityException {
        this.f43589c = i;
        if (!f43586d.isCompatible()) {
            v63.m23147y("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.f43587a = m13688d(1, bArr);
        this.f43588b = m13688d(0, bArr);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m13685c(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m13686a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            v63.m23147y("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f43588b.m17208a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(ifc.m13881a(bArr4, m13685c(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            n41 n41Var = this.f43587a;
            n41Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            n41Var.m17209j(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13687b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            C3386nv.m17626m("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        n41 n41Var = this.f43587a;
        n41Var.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            C3386nv.m17626m("Given ByteBuffer output is too small");
            return;
        }
        n41Var.m17209j(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferM17208a = this.f43588b.m17208a(0, bArr);
        byte[] bArr4 = new byte[32];
        byteBufferM17208a.get(bArr4);
        byte[] bArrM13881a = ifc.m13881a(bArr4, m13685c(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM13881a);
    }

    /* JADX INFO: renamed from: d */
    public final n41 m13688d(int i, byte[] bArr) {
        switch (this.f43589c) {
            case 0:
                return new h64(bArr, i, 0);
            default:
                return new h64(bArr, i, 1);
        }
    }
}
