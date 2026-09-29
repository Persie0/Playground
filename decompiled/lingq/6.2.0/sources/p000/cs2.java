package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class cs2 implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: a */
    public final C3528ra f34482a;

    /* JADX INFO: renamed from: b */
    public final jo5 f34483b;

    /* JADX INFO: renamed from: c */
    public final int f34484c;

    public cs2(C3528ra c3528ra, jo5 jo5Var, int i) {
        this.f34482a = c3528ra;
        this.f34483b = jo5Var;
        this.f34484c = i;
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C3528ra c3528ra = this.f34482a;
        c3528ra.getClass();
        int length = bArr.length;
        int i = c3528ra.f58955b;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(ux5.m22988k(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrM15648a = kq7.m15648a(i);
        System.arraycopy(bArrM15648a, 0, bArr3, 0, i);
        c3528ra.m20487a(bArr, 0, bArr.length, bArr3, c3528ra.f58955b, bArrM15648a, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return AbstractC3184kh.m15213g(bArr3, this.f34483b.mo14571b(AbstractC3184kh.m15213g(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f34484c;
        if (length < i) {
            v63.m23147y("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f34483b.mo14570a(bArrCopyOfRange2, AbstractC3184kh.m15213g(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        C3528ra c3528ra = this.f34482a;
        c3528ra.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = c3528ra.f58955b;
        if (length2 < i2) {
            v63.m23147y("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = c3528ra.f58955b;
        byte[] bArr4 = new byte[length3 - i3];
        c3528ra.m20487a(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
