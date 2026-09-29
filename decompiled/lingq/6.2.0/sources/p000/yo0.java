package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class yo0 implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70136a;

    /* JADX INFO: renamed from: b */
    public final i64 f70137b;

    public yo0(int i, byte[] bArr) {
        this.f70136a = i;
        switch (i) {
            case 1:
                this.f70137b = new i64(1, bArr);
                break;
            default:
                this.f70137b = new i64(0, bArr);
                break;
        }
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.f70136a;
        i64 i64Var = this.f70137b;
        switch (i) {
            case 0:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrM15648a = kq7.m15648a(12);
                byteBufferAllocate.put(bArrM15648a);
                i64Var.m13687b(byteBufferAllocate, bArrM15648a, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrM15648a2 = kq7.m15648a(24);
                byteBufferAllocate2.put(bArrM15648a2);
                i64Var.m13687b(byteBufferAllocate2, bArrM15648a2, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.f70136a;
        i64 i64Var = this.f70137b;
        switch (i) {
            case 0:
                if (bArr.length >= 28) {
                    return i64Var.m13686a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                v63.m23147y("ciphertext too short");
                return null;
            default:
                if (bArr.length >= 40) {
                    return i64Var.m13686a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                v63.m23147y("ciphertext too short");
                return null;
        }
    }
}
