package p000;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class wv3 {

    /* JADX INFO: renamed from: a */
    public final aj0 f67332a;

    /* JADX INFO: renamed from: c */
    public boolean f67334c;

    /* JADX INFO: renamed from: g */
    public int f67338g;

    /* JADX INFO: renamed from: h */
    public int f67339h;

    /* JADX INFO: renamed from: b */
    public int f67333b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f67335d = 4096;

    /* JADX INFO: renamed from: e */
    public jr3[] f67336e = new jr3[8];

    /* JADX INFO: renamed from: f */
    public int f67337f = 7;

    public wv3(aj0 aj0Var) {
        this.f67332a = aj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m24158a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f67336e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f67337f;
                if (length < i2 || i <= 0) {
                    break;
                }
                jr3 jr3Var = this.f67336e[length];
                jr3Var.getClass();
                i -= jr3Var.f46039c;
                int i4 = this.f67339h;
                jr3 jr3Var2 = this.f67336e[length];
                jr3Var2.getClass();
                this.f67339h = i4 - jr3Var2.f46039c;
                this.f67338g--;
                i3++;
                length--;
            }
            jr3[] jr3VarArr = this.f67336e;
            int i5 = i2 + 1;
            System.arraycopy(jr3VarArr, i5, jr3VarArr, i5 + i3, this.f67338g);
            jr3[] jr3VarArr2 = this.f67336e;
            int i6 = this.f67337f + 1;
            Arrays.fill(jr3VarArr2, i6, i6 + i3, (Object) null);
            this.f67337f += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m24159b(jr3 jr3Var) {
        int i = jr3Var.f46039c;
        int i2 = this.f67335d;
        if (i > i2) {
            jr3[] jr3VarArr = this.f67336e;
            AbstractC3550rv.m20833a0(0, jr3VarArr.length, null, jr3VarArr);
            this.f67337f = this.f67336e.length - 1;
            this.f67338g = 0;
            this.f67339h = 0;
            return;
        }
        m24158a((this.f67339h + i) - i2);
        int i3 = this.f67338g + 1;
        jr3[] jr3VarArr2 = this.f67336e;
        if (i3 > jr3VarArr2.length) {
            jr3[] jr3VarArr3 = new jr3[jr3VarArr2.length * 2];
            System.arraycopy(jr3VarArr2, 0, jr3VarArr3, jr3VarArr2.length, jr3VarArr2.length);
            this.f67337f = this.f67336e.length - 1;
            this.f67336e = jr3VarArr3;
        }
        int i4 = this.f67337f;
        this.f67337f = i4 - 1;
        this.f67336e[i4] = jr3Var;
        this.f67338g++;
        this.f67339h += i;
    }

    /* JADX INFO: renamed from: c */
    public final void m24160c(ByteString byteString) throws EOFException {
        byteString.getClass();
        int[] iArr = jx3.f46341a;
        int iMo18078d = byteString.mo18078d();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iMo18078d; i++) {
            byte bMo18082i = byteString.mo18082i(i);
            byte[] bArr = icb.f43946a;
            j2 += (long) jx3.f46342b[bMo18082i & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iMo18078d2 = byteString.mo18078d();
        aj0 aj0Var = this.f67332a;
        if (i2 >= iMo18078d2) {
            m24162e(byteString.mo18078d(), 127, 0);
            aj0Var.m486j0(byteString);
            return;
        }
        aj0 aj0Var2 = new aj0();
        int[] iArr2 = jx3.f46341a;
        int iMo18078d3 = byteString.mo18078d();
        int i3 = 0;
        for (int i4 = 0; i4 < iMo18078d3; i4++) {
            byte bMo18082i2 = byteString.mo18082i(i4);
            byte[] bArr2 = icb.f43946a;
            int i5 = bMo18082i2 & 255;
            int i6 = jx3.f46341a[i5];
            byte b = jx3.f46342b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                aj0Var2.m487k0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            aj0Var2.m487k0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringMo497s = aj0Var2.mo497s(aj0Var2.f723b);
        m24162e(byteStringMo497s.mo18078d(), 127, 128);
        aj0Var.m486j0(byteStringMo497s);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX INFO: renamed from: d */
    public final void m24161d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.f67334c) {
            int i = this.f67333b;
            if (i < this.f67335d) {
                m24162e(i, 31, 32);
            }
            this.f67334c = false;
            this.f67333b = Integer.MAX_VALUE;
            m24162e(this.f67335d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            jr3 jr3Var = (jr3) arrayList.get(i2);
            ByteString byteStringMo18088q = jr3Var.f46037a.mo18088q();
            ByteString byteString = jr3Var.f46038b;
            Integer num = (Integer) xv3.f68842b.get(byteStringMo18088q);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    jr3[] jr3VarArr = xv3.f68841a;
                    if (fa4.m11650l(jr3VarArr[iIntValue].f46038b, byteString)) {
                        length = length2;
                    } else if (fa4.m11650l(jr3VarArr[length2].f46038b, byteString)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.f67336e.length;
                for (int i3 = this.f67337f + 1; i3 < length3; i3++) {
                    jr3 jr3Var2 = this.f67336e[i3];
                    jr3Var2.getClass();
                    if (fa4.m11650l(jr3Var2.f46037a, byteStringMo18088q)) {
                        jr3 jr3Var3 = this.f67336e[i3];
                        jr3Var3.getClass();
                        if (fa4.m11650l(jr3Var3.f46038b, byteString)) {
                            length2 = xv3.f68841a.length + (i3 - this.f67337f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f67337f) + xv3.f68841a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                m24162e(length2, 127, 128);
            } else if (length == -1) {
                this.f67332a.m487k0(64);
                m24160c(byteStringMo18088q);
                m24160c(byteString);
                m24159b(jr3Var);
            } else {
                ByteString byteString2 = jr3.f46031d;
                byteStringMo18088q.getClass();
                byteString2.getClass();
                if (!byteStringMo18088q.mo18084l(0, byteString2, byteString2.mo18078d()) || fa4.m11650l(jr3.f46036i, byteStringMo18088q)) {
                    m24162e(length, 63, 64);
                    m24160c(byteString);
                    m24159b(jr3Var);
                } else {
                    m24162e(length, 15, 0);
                    m24160c(byteString);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24162e(int i, int i2, int i3) {
        aj0 aj0Var = this.f67332a;
        if (i < i2) {
            aj0Var.m487k0(i | i3);
            return;
        }
        aj0Var.m487k0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            aj0Var.m487k0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        aj0Var.m487k0(i4);
    }
}
