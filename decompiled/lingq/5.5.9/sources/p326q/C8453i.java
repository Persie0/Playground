package p326q;

import ae.C0062b;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8453i<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f45620e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f45621a = false;

    /* JADX INFO: renamed from: b */
    public int[] f45622b;

    /* JADX INFO: renamed from: c */
    public Object[] f45623c;

    /* JADX INFO: renamed from: d */
    public int f45624d;

    public C8453i() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f45622b = new int[i13];
        this.f45623c = new Object[i13];
    }

    /* JADX INFO: renamed from: b */
    public final void m16531b(int i10, E e10) {
        int i11 = this.f45624d;
        if (i11 != 0 && i10 <= this.f45622b[i11 - 1]) {
            m16536g(i10, e10);
            return;
        }
        if (this.f45621a && i11 >= this.f45622b.length) {
            m16534e();
        }
        int i12 = this.f45624d;
        if (i12 >= this.f45622b.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArr = new int[i16];
            Object[] objArr = new Object[i16];
            int[] iArr2 = this.f45622b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f45623c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f45622b = iArr;
            this.f45623c = objArr;
        }
        this.f45622b[i12] = i10;
        this.f45623c[i12] = e10;
        this.f45624d = i12 + 1;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C8453i<E> clone() {
        try {
            C8453i<E> c8453i = (C8453i) super.clone();
            c8453i.f45622b = (int[]) this.f45622b.clone();
            c8453i.f45623c = (Object[]) this.f45623c.clone();
            return c8453i;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16533d(int i10) {
        if (this.f45621a) {
            m16534e();
        }
        return C0062b.m318W(this.f45624d, i10, this.f45622b) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m16534e() {
        int i10 = this.f45624d;
        int[] iArr = this.f45622b;
        Object[] objArr = this.f45623c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f45620e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f45621a = false;
        this.f45624d = i11;
    }

    /* JADX INFO: renamed from: f */
    public final Object m16535f(int i10, Integer num) {
        Object obj;
        int iM318W = C0062b.m318W(this.f45624d, i10, this.f45622b);
        return (iM318W < 0 || (obj = this.f45623c[iM318W]) == f45620e) ? num : obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m16536g(int i10, E e10) {
        int iM318W = C0062b.m318W(this.f45624d, i10, this.f45622b);
        if (iM318W >= 0) {
            this.f45623c[iM318W] = e10;
            return;
        }
        int i11 = ~iM318W;
        int i12 = this.f45624d;
        if (i11 < i12) {
            Object[] objArr = this.f45623c;
            if (objArr[i11] == f45620e) {
                this.f45622b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f45621a && i12 >= this.f45622b.length) {
            m16534e();
            i11 = ~C0062b.m318W(this.f45624d, i10, this.f45622b);
        }
        int i13 = this.f45624d;
        if (i13 >= this.f45622b.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArr = new int[i17];
            Object[] objArr2 = new Object[i17];
            int[] iArr2 = this.f45622b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f45623c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f45622b = iArr;
            this.f45623c = objArr2;
        }
        int i18 = this.f45624d - i11;
        if (i18 != 0) {
            int[] iArr3 = this.f45622b;
            int i19 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i19, i18);
            Object[] objArr4 = this.f45623c;
            System.arraycopy(objArr4, i11, objArr4, i19, this.f45624d - i11);
        }
        this.f45622b[i11] = i10;
        this.f45623c[i11] = e10;
        this.f45624d++;
    }

    /* JADX INFO: renamed from: h */
    public final int m16537h() {
        if (this.f45621a) {
            m16534e();
        }
        return this.f45624d;
    }

    /* JADX INFO: renamed from: i */
    public final E m16538i(int i10) {
        if (this.f45621a) {
            m16534e();
        }
        return (E) this.f45623c[i10];
    }

    public final String toString() {
        if (m16537h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f45624d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f45624d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            if (this.f45621a) {
                m16534e();
            }
            sb2.append(this.f45622b[i10]);
            sb2.append('=');
            E eM16538i = m16538i(i10);
            if (eM16538i != this) {
                sb2.append(eM16538i);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
