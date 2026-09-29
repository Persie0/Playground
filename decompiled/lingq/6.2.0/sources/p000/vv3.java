package p000;

import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class vv3 {

    /* JADX INFO: renamed from: c */
    public final e18 f65976c;

    /* JADX INFO: renamed from: f */
    public int f65979f;

    /* JADX INFO: renamed from: g */
    public int f65980g;

    /* JADX INFO: renamed from: a */
    public int f65974a = 4096;

    /* JADX INFO: renamed from: b */
    public final ArrayList f65975b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public jr3[] f65977d = new jr3[8];

    /* JADX INFO: renamed from: e */
    public int f65978e = 7;

    public vv3(ow3 ow3Var) {
        this.f65976c = new e18(ow3Var);
    }

    /* JADX INFO: renamed from: a */
    public final int m23554a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f65977d.length;
            while (true) {
                length--;
                i2 = this.f65978e;
                if (length < i2 || i <= 0) {
                    break;
                }
                jr3 jr3Var = this.f65977d[length];
                jr3Var.getClass();
                int i4 = jr3Var.f46039c;
                i -= i4;
                this.f65980g -= i4;
                this.f65979f--;
                i3++;
            }
            jr3[] jr3VarArr = this.f65977d;
            System.arraycopy(jr3VarArr, i2 + 1, jr3VarArr, i2 + 1 + i3, this.f65979f);
            this.f65978e += i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final ByteString m23555b(int i) throws IOException {
        if (i >= 0) {
            jr3[] jr3VarArr = xv3.f68841a;
            if (i <= jr3VarArr.length - 1) {
                return jr3VarArr[i].f46037a;
            }
        }
        int length = this.f65978e + 1 + (i - xv3.f68841a.length);
        if (length >= 0) {
            jr3[] jr3VarArr2 = this.f65977d;
            if (length < jr3VarArr2.length) {
                jr3 jr3Var = jr3VarArr2[length];
                jr3Var.getClass();
                return jr3Var.f46037a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m23556c(jr3 jr3Var) {
        this.f65975b.add(jr3Var);
        int i = jr3Var.f46039c;
        int i2 = this.f65974a;
        if (i > i2) {
            jr3[] jr3VarArr = this.f65977d;
            AbstractC3550rv.m20833a0(0, jr3VarArr.length, null, jr3VarArr);
            this.f65978e = this.f65977d.length - 1;
            this.f65979f = 0;
            this.f65980g = 0;
            return;
        }
        m23554a((this.f65980g + i) - i2);
        int i3 = this.f65979f + 1;
        jr3[] jr3VarArr2 = this.f65977d;
        if (i3 > jr3VarArr2.length) {
            jr3[] jr3VarArr3 = new jr3[jr3VarArr2.length * 2];
            System.arraycopy(jr3VarArr2, 0, jr3VarArr3, jr3VarArr2.length, jr3VarArr2.length);
            this.f65978e = this.f65977d.length - 1;
            this.f65977d = jr3VarArr3;
        }
        int i4 = this.f65978e;
        this.f65978e = i4 - 1;
        this.f65977d[i4] = jr3Var;
        this.f65979f++;
        this.f65980g += i;
    }

    /* JADX INFO: renamed from: d */
    public final ByteString m23557d() {
        e18 e18Var = this.f65976c;
        byte b = e18Var.readByte();
        byte[] bArr = icb.f43946a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jM23558e = m23558e(i, 127);
        if (!z) {
            return e18Var.mo497s(jM23558e);
        }
        aj0 aj0Var = new aj0();
        int[] iArr = jx3.f46341a;
        e18Var.getClass();
        sq6 sq6Var = jx3.f46343c;
        sq6 sq6Var2 = sq6Var;
        int i3 = 0;
        for (long j = 0; j < jM23558e; j++) {
            byte b2 = e18Var.readByte();
            byte[] bArr2 = icb.f43946a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                sq6[] sq6VarArr = (sq6[]) sq6Var2.f61255c;
                sq6VarArr.getClass();
                sq6Var2 = sq6VarArr[(i2 >>> (i3 - 8)) & 255];
                sq6Var2.getClass();
                if (((sq6[]) sq6Var2.f61255c) == null) {
                    aj0Var.m487k0(sq6Var2.f61253a);
                    i3 -= sq6Var2.f61254b;
                    sq6Var2 = sq6Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            sq6[] sq6VarArr2 = (sq6[]) sq6Var2.f61255c;
            sq6VarArr2.getClass();
            sq6 sq6Var3 = sq6VarArr2[(i2 << (8 - i3)) & 255];
            sq6Var3.getClass();
            int i4 = sq6Var3.f61254b;
            if (((sq6[]) sq6Var3.f61255c) != null || i4 > i3) {
                break;
            }
            aj0Var.m487k0(sq6Var3.f61253a);
            i3 -= i4;
            sq6Var2 = sq6Var;
        }
        return aj0Var.mo497s(aj0Var.f723b);
    }

    /* JADX INFO: renamed from: e */
    public final int m23558e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f65976c.readByte();
            byte[] bArr = icb.f43946a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
