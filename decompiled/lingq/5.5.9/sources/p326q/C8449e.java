package p326q;

import ae.C0062b;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8449e<E> implements Cloneable {

    /* JADX INFO: renamed from: e */
    public static final Object f45588e = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f45589a = false;

    /* JADX INFO: renamed from: b */
    public long[] f45590b;

    /* JADX INFO: renamed from: c */
    public Object[] f45591c;

    /* JADX INFO: renamed from: d */
    public int f45592d;

    public C8449e() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f45590b = new long[i13];
        this.f45591c = new Object[i13];
    }

    /* JADX INFO: renamed from: b */
    public final void m16507b() {
        int i10 = this.f45592d;
        Object[] objArr = this.f45591c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f45592d = 0;
        this.f45589a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C8449e<E> clone() {
        try {
            C8449e<E> c8449e = (C8449e) super.clone();
            c8449e.f45590b = (long[]) this.f45590b.clone();
            c8449e.f45591c = (Object[]) this.f45591c.clone();
            return c8449e;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16509d() {
        int i10 = this.f45592d;
        long[] jArr = this.f45590b;
        Object[] objArr = this.f45591c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f45588e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f45589a = false;
        this.f45592d = i11;
    }

    /* JADX INFO: renamed from: e */
    public final Object m16510e(long j10, Long l10) {
        Object obj;
        int iM324Y = C0062b.m324Y(this.f45590b, this.f45592d, j10);
        return (iM324Y < 0 || (obj = this.f45591c[iM324Y]) == f45588e) ? l10 : obj;
    }

    /* JADX INFO: renamed from: f */
    public final long m16511f(int i10) {
        if (this.f45589a) {
            m16509d();
        }
        return this.f45590b[i10];
    }

    /* JADX INFO: renamed from: g */
    public final void m16512g(long j10, E e10) {
        int iM324Y = C0062b.m324Y(this.f45590b, this.f45592d, j10);
        if (iM324Y >= 0) {
            this.f45591c[iM324Y] = e10;
            return;
        }
        int i10 = ~iM324Y;
        int i11 = this.f45592d;
        if (i10 < i11) {
            Object[] objArr = this.f45591c;
            if (objArr[i10] == f45588e) {
                this.f45590b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f45589a && i11 >= this.f45590b.length) {
            m16509d();
            i10 = ~C0062b.m324Y(this.f45590b, this.f45592d, j10);
        }
        int i12 = this.f45592d;
        if (i12 >= this.f45590b.length) {
            int i13 = (i12 + 1) * 8;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f45590b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f45591c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f45590b = jArr;
            this.f45591c = objArr2;
        }
        int i17 = this.f45592d - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f45590b;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f45591c;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f45592d - i10);
        }
        this.f45590b[i10] = j10;
        this.f45591c[i10] = e10;
        this.f45592d++;
    }

    /* JADX INFO: renamed from: h */
    public final void m16513h(long j10) {
        int iM324Y = C0062b.m324Y(this.f45590b, this.f45592d, j10);
        if (iM324Y >= 0) {
            Object[] objArr = this.f45591c;
            Object obj = objArr[iM324Y];
            Object obj2 = f45588e;
            if (obj != obj2) {
                objArr[iM324Y] = obj2;
                this.f45589a = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m16514i() {
        if (this.f45589a) {
            m16509d();
        }
        return this.f45592d;
    }

    /* JADX INFO: renamed from: j */
    public final E m16515j(int i10) {
        if (this.f45589a) {
            m16509d();
        }
        return (E) this.f45591c[i10];
    }

    public final String toString() {
        if (m16514i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f45592d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f45592d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m16511f(i10));
            sb2.append('=');
            E eM16515j = m16515j(i10);
            if (eM16515j != this) {
                sb2.append(eM16515j);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
