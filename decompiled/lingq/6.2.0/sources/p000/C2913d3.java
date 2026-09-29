package p000;

import android.net.Uri;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2913d3 implements j02 {

    /* JADX INFO: renamed from: a */
    public int f34882a;

    /* JADX INFO: renamed from: b */
    public int f34883b;

    /* JADX INFO: renamed from: c */
    public Object f34884c;

    /* JADX INFO: renamed from: d */
    public Object f34885d;

    /* JADX INFO: renamed from: e */
    public Serializable f34886e;

    @Override // p000.j02
    /* JADX INFO: renamed from: b */
    public long mo10000b(k02 k02Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.j02
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.j02
    public Uri getUri() {
        return ((j02) this.f34884c).getUri();
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: h */
    public Map mo10001h() {
        return ((j02) this.f34884c).mo10001h();
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: l */
    public void mo10002l(u52 u52Var) {
        u52Var.getClass();
        ((j02) this.f34884c).mo10002l(u52Var);
    }

    @Override // p000.h02
    public int read(byte[] bArr, int i, int i2) {
        j02 j02Var = (j02) this.f34884c;
        if (this.f34883b == 0) {
            byte[] bArr2 = (byte[]) this.f34886e;
            int i3 = 0;
            if (j02Var.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    while (i5 > 0) {
                        int i6 = j02Var.read(bArr3, i3, i5);
                        if (i6 != -1) {
                            i3 += i6;
                            i5 -= i6;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        in7 in7Var = (in7) this.f34885d;
                        k47 k47Var = new k47(i4, bArr3);
                        long jMax = !in7Var.f44320l ? in7Var.f44317i : Math.max(in7Var.f44321m.m2560s(true), in7Var.f44317i);
                        int iM14820a = k47Var.m14820a();
                        n8a n8aVar = in7Var.f44319k;
                        n8aVar.getClass();
                        n8aVar.mo2535e(iM14820a, k47Var);
                        n8aVar.mo2531a(jMax, 1, iM14820a, 0, null);
                        in7Var.f44320l = true;
                    }
                }
                this.f34883b = this.f34882a;
            }
            return -1;
        }
        int i7 = j02Var.read(bArr, i, Math.min(this.f34883b, i2));
        if (i7 != -1) {
            this.f34883b -= i7;
        }
        return i7;
    }
}
