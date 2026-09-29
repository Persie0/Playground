package p338qd;

import dm.C5212l;
import java.util.Arrays;

/* JADX INFO: renamed from: qd.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8529c1 {

    /* JADX INFO: renamed from: a */
    public byte[] f45807a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f45808b = 0;

    /* JADX INFO: renamed from: e */
    public int f45811e = -1;

    /* JADX INFO: renamed from: c */
    public long f45809c = -1;

    /* JADX INFO: renamed from: h */
    public boolean f45814h = false;

    /* JADX INFO: renamed from: f */
    public int f45812f = 30;

    /* JADX INFO: renamed from: d */
    public long f45810d = -1;

    /* JADX INFO: renamed from: g */
    public int f45813g = -1;

    /* JADX INFO: renamed from: i */
    public String f45815i = null;

    /* JADX INFO: renamed from: a */
    public final int m16647a(byte[] bArr, int i10, int i11) {
        int iM16649c = m16649c(30, i10, i11, bArr);
        if (iM16649c == -1) {
            return -1;
        }
        if (this.f45809c == -1) {
            byte[] bArr2 = this.f45807a;
            long jM11177s0 = ((long) ((C5212l.m11177s0(bArr2, 2) << 16) | C5212l.m11177s0(bArr2, 0))) & 4294967295L;
            this.f45809c = jM11177s0;
            if (jM11177s0 == 67324752) {
                this.f45814h = false;
                byte[] bArr3 = this.f45807a;
                this.f45810d = ((long) ((C5212l.m11177s0(bArr3, 20) << 16) | C5212l.m11177s0(bArr3, 18))) & 4294967295L;
                this.f45813g = C5212l.m11177s0(this.f45807a, 8);
                this.f45811e = C5212l.m11177s0(this.f45807a, 26);
                int iM11177s0 = this.f45811e + 30 + C5212l.m11177s0(this.f45807a, 28);
                this.f45812f = iM11177s0;
                int length = this.f45807a.length;
                if (length < iM11177s0) {
                    do {
                        length += length;
                    } while (length < iM11177s0);
                    this.f45807a = Arrays.copyOf(this.f45807a, length);
                }
            } else {
                this.f45814h = true;
            }
        }
        int iM16649c2 = m16649c(this.f45812f, i10 + iM16649c, i11 - iM16649c, bArr);
        if (iM16649c2 == -1) {
            return -1;
        }
        int i12 = iM16649c + iM16649c2;
        if (!this.f45814h && this.f45815i == null) {
            this.f45815i = new String(this.f45807a, 30, this.f45811e);
        }
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public final C8528c0 m16648b() {
        int i10 = this.f45808b;
        int i11 = this.f45812f;
        if (i10 < i11) {
            return new C8528c0(this.f45815i, this.f45810d, this.f45813g, true, this.f45814h, Arrays.copyOf(this.f45807a, i10));
        }
        C8528c0 c8528c0 = new C8528c0(this.f45815i, this.f45810d, this.f45813g, false, this.f45814h, Arrays.copyOf(this.f45807a, i11));
        this.f45808b = 0;
        this.f45811e = -1;
        this.f45809c = -1L;
        this.f45814h = false;
        this.f45812f = 30;
        this.f45810d = -1L;
        this.f45813g = -1;
        this.f45815i = null;
        return c8528c0;
    }

    /* JADX INFO: renamed from: c */
    public final int m16649c(int i10, int i11, int i12, byte[] bArr) {
        int i13 = this.f45808b;
        if (i13 >= i10) {
            return 0;
        }
        int iMin = Math.min(i12, i10 - i13);
        System.arraycopy(bArr, i11, this.f45807a, this.f45808b, iMin);
        int i14 = this.f45808b + iMin;
        this.f45808b = i14;
        if (i14 < i10) {
            return -1;
        }
        return iMin;
    }
}
