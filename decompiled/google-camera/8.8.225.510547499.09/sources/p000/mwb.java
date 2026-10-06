package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mwb extends AbstractMap implements Serializable, mtz {

    /* JADX INFO: renamed from: a */
    transient Object[] f41706a;

    /* JADX INFO: renamed from: b */
    transient Object[] f41707b;

    /* JADX INFO: renamed from: c */
    transient int f41708c;

    /* JADX INFO: renamed from: d */
    transient int f41709d;

    /* JADX INFO: renamed from: e */
    public transient int f41710e;

    /* JADX INFO: renamed from: f */
    public transient int[] f41711f;

    /* JADX INFO: renamed from: g */
    private transient int[] f41712g;

    /* JADX INFO: renamed from: h */
    private transient int[] f41713h;

    /* JADX INFO: renamed from: i */
    private transient int[] f41714i;

    /* JADX INFO: renamed from: j */
    private transient int[] f41715j;

    /* JADX INFO: renamed from: k */
    private transient int f41716k;

    /* JADX INFO: renamed from: l */
    private transient int[] f41717l;

    /* JADX INFO: renamed from: m */
    private transient Set f41718m;

    /* JADX INFO: renamed from: n */
    private transient Set f41719n;

    /* JADX INFO: renamed from: o */
    private transient Set f41720o;

    public mwb() {
        m17056l();
    }

    /* JADX INFO: renamed from: m */
    private final int m17041m(int i) {
        return i & (this.f41712g.length - 1);
    }

    /* JADX INFO: renamed from: n */
    private final void m17042n(int i, int i2) {
        lku.m15669w(i != -1);
        int iM17041m = m17041m(i2);
        int[] iArr = this.f41713h;
        int i3 = iArr[iM17041m];
        if (i3 == i) {
            int[] iArr2 = this.f41715j;
            iArr[iM17041m] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.f41715j[i3];
        int i5 = i3;
        while (i4 != -1) {
            if (i4 == i) {
                int[] iArr3 = this.f41715j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                int i6 = i4;
                i4 = this.f41715j[i4];
                i5 = i6;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to find entry with value ");
        Object obj = this.f41707b[i];
        sb.append(obj);
        throw new AssertionError("Expected to find entry with value ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: o */
    private final void m17043o(int i, int i2) {
        lku.m15669w(i != -1);
        int iM17041m = m17041m(i2);
        int[] iArr = this.f41715j;
        int[] iArr2 = this.f41713h;
        iArr[i] = iArr2[iM17041m];
        iArr2[iM17041m] = i;
    }

    /* JADX INFO: renamed from: p */
    private final void m17044p(int i, int i2, int i3) {
        lku.m15669w(i != -1);
        lku.m15669w(i != -1);
        int iM17041m = m17041m(i2);
        int[] iArr = this.f41712g;
        int i4 = iArr[iM17041m];
        if (i4 == i) {
            int[] iArr2 = this.f41714i;
            iArr[iM17041m] = iArr2[i];
            iArr2[i] = -1;
        } else {
            int i5 = this.f41714i[i4];
            int i6 = i4;
            while (true) {
                if (i5 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to find entry with key ");
                    Object obj = this.f41706a[i];
                    sb.append(obj);
                    throw new AssertionError("Expected to find entry with key ".concat(String.valueOf(obj)));
                }
                if (i5 == i) {
                    int[] iArr3 = this.f41714i;
                    iArr3[i6] = iArr3[i];
                    iArr3[i] = -1;
                    break;
                } else {
                    int i7 = i5;
                    i5 = this.f41714i[i5];
                    i6 = i7;
                }
            }
        }
        m17042n(i, i3);
        m17045q(this.f41717l[i], this.f41711f[i]);
        int i8 = this.f41708c - 1;
        if (i8 != i) {
            int i9 = this.f41717l[i8];
            int i10 = this.f41711f[i8];
            m17045q(i9, i);
            m17045q(i, i10);
            Object[] objArr = this.f41706a;
            Object obj2 = objArr[i8];
            Object[] objArr2 = this.f41707b;
            Object obj3 = objArr2[i8];
            objArr[i] = obj2;
            objArr2[i] = obj3;
            int iM17041m2 = m17041m(mkv.m16523ae(obj2));
            int[] iArr4 = this.f41712g;
            int i11 = iArr4[iM17041m2];
            if (i11 == i8) {
                iArr4[iM17041m2] = i;
            } else {
                int i12 = this.f41714i[i11];
                int i13 = i11;
                while (i12 != i8) {
                    int i14 = i12;
                    i12 = this.f41714i[i12];
                    i13 = i14;
                }
                this.f41714i[i13] = i;
            }
            int[] iArr5 = this.f41714i;
            iArr5[i] = iArr5[i8];
            iArr5[i8] = -1;
            int iM17041m3 = m17041m(mkv.m16523ae(obj3));
            int[] iArr6 = this.f41713h;
            int i15 = iArr6[iM17041m3];
            if (i15 == i8) {
                iArr6[iM17041m3] = i;
            } else {
                int i16 = this.f41715j[i15];
                int i17 = i15;
                while (i16 != i8) {
                    int i18 = i16;
                    i16 = this.f41715j[i16];
                    i17 = i18;
                }
                this.f41715j[i17] = i;
            }
            int[] iArr7 = this.f41715j;
            iArr7[i] = iArr7[i8];
            iArr7[i8] = -1;
        }
        Object[] objArr3 = this.f41706a;
        int i19 = this.f41708c - 1;
        objArr3[i19] = null;
        this.f41707b[i19] = null;
        this.f41708c = i19;
        this.f41709d++;
    }

    /* JADX INFO: renamed from: r */
    private static int[] m17046r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        m17056l();
        mpw.m16755G(this, objectInputStream, i);
    }

    /* JADX INFO: renamed from: s */
    private static int[] m17047s(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        mpw.m16757I(this, objectOutputStream);
    }

    /* JADX INFO: renamed from: a */
    final int m17048a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m17041m(i)];
        while (i2 != -1) {
            if (mpw.m16768g(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    final int m17049b(Object obj) {
        return m17050c(obj, mkv.m16523ae(obj));
    }

    /* JADX INFO: renamed from: c */
    final int m17050c(Object obj, int i) {
        return m17048a(obj, i, this.f41712g, this.f41714i, this.f41706a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f41706a, 0, this.f41708c, (Object) null);
        Arrays.fill(this.f41707b, 0, this.f41708c, (Object) null);
        Arrays.fill(this.f41712g, -1);
        Arrays.fill(this.f41713h, -1);
        Arrays.fill(this.f41714i, 0, this.f41708c, -1);
        Arrays.fill(this.f41715j, 0, this.f41708c, -1);
        Arrays.fill(this.f41717l, 0, this.f41708c, -1);
        Arrays.fill(this.f41711f, 0, this.f41708c, -1);
        this.f41708c = 0;
        this.f41710e = -2;
        this.f41716k = -2;
        this.f41709d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return m17049b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return m17051d(obj, mkv.m16523ae(obj)) != -1;
    }

    /* JADX INFO: renamed from: d */
    final int m17051d(Object obj, int i) {
        return m17048a(obj, i, this.f41713h, this.f41715j, this.f41707b);
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: e */
    public final mtz mo16877e() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f41720o;
        if (set != null) {
            return set;
        }
        mvw mvwVar = new mvw(this);
        this.f41720o = mvwVar;
        return mvwVar;
    }

    /* JADX INFO: renamed from: f */
    final Object m17052f(Object obj, Object obj2, boolean z) {
        int iM16523ae = mkv.m16523ae(obj);
        int iM17050c = m17050c(obj, iM16523ae);
        if (iM17050c != -1) {
            Object obj3 = this.f41707b[iM17050c];
            if (mpw.m16768g(obj3, obj2)) {
                return obj2;
            }
            m17055j(iM17050c, obj2, z);
            return obj3;
        }
        int iM16523ae2 = mkv.m16523ae(obj2);
        int iM17051d = m17051d(obj2, iM16523ae2);
        if (!z) {
            lku.m15607B(iM17051d == -1, "Value already present: %s", obj2);
        } else if (iM17051d != -1) {
            m17054i(iM17051d, iM16523ae2);
        }
        int i = this.f41708c + 1;
        int length = this.f41714i.length;
        if (length < i) {
            int iM17068a = mwi.m17068a(length, i);
            this.f41706a = Arrays.copyOf(this.f41706a, iM17068a);
            this.f41707b = Arrays.copyOf(this.f41707b, iM17068a);
            this.f41714i = m17047s(this.f41714i, iM17068a);
            this.f41715j = m17047s(this.f41715j, iM17068a);
            this.f41717l = m17047s(this.f41717l, iM17068a);
            this.f41711f = m17047s(this.f41711f, iM17068a);
        }
        if (this.f41712g.length < i) {
            int iM16524af = mkv.m16524af(i);
            this.f41712g = m17046r(iM16524af);
            this.f41713h = m17046r(iM16524af);
            for (int i2 = 0; i2 < this.f41708c; i2++) {
                int iM17041m = m17041m(mkv.m16523ae(this.f41706a[i2]));
                int[] iArr = this.f41714i;
                int[] iArr2 = this.f41712g;
                iArr[i2] = iArr2[iM17041m];
                iArr2[iM17041m] = i2;
                int iM17041m2 = m17041m(mkv.m16523ae(this.f41707b[i2]));
                int[] iArr3 = this.f41715j;
                int[] iArr4 = this.f41713h;
                iArr3[i2] = iArr4[iM17041m2];
                iArr4[iM17041m2] = i2;
            }
        }
        Object[] objArr = this.f41706a;
        int i3 = this.f41708c;
        objArr[i3] = obj;
        this.f41707b[i3] = obj2;
        lku.m15669w(i3 != -1);
        int iM17041m3 = m17041m(iM16523ae);
        int[] iArr5 = this.f41714i;
        int[] iArr6 = this.f41712g;
        iArr5[i3] = iArr6[iM17041m3];
        iArr6[iM17041m3] = i3;
        m17043o(this.f41708c, iM16523ae2);
        m17045q(this.f41716k, this.f41708c);
        m17045q(this.f41708c, -2);
        this.f41708c++;
        this.f41709d++;
        return null;
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: g */
    public final Set values() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iM17049b = m17049b(obj);
        if (iM17049b == -1) {
            return null;
        }
        return this.f41707b[iM17049b];
    }

    /* JADX INFO: renamed from: h */
    final void m17053h(int i, int i2) {
        m17044p(i, i2, mkv.m16523ae(this.f41707b[i]));
    }

    /* JADX INFO: renamed from: i */
    final void m17054i(int i, int i2) {
        m17044p(i, mkv.m16523ae(this.f41706a[i]), i2);
    }

    /* JADX INFO: renamed from: j */
    public final void m17055j(int i, Object obj, boolean z) {
        lku.m15669w(i != -1);
        int iM16523ae = mkv.m16523ae(obj);
        int iM17051d = m17051d(obj, iM16523ae);
        if (iM17051d != -1) {
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value already present in map: ");
                sb.append(obj);
                throw new IllegalArgumentException("Value already present in map: ".concat(String.valueOf(obj)));
            }
            m17054i(iM17051d, iM16523ae);
            if (i == this.f41708c) {
                i = iM17051d;
            }
        }
        m17042n(i, mkv.m16523ae(this.f41707b[i]));
        this.f41707b[i] = obj;
        m17043o(i, iM16523ae);
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: k */
    public final void mo16883k(Object obj, Object obj2) {
        m17052f(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f41718m;
        if (set != null) {
            return set;
        }
        mvx mvxVar = new mvx(this);
        this.f41718m = mvxVar;
        return mvxVar;
    }

    /* JADX INFO: renamed from: l */
    final void m17056l() {
        lku.m15655i(16, "expectedSize");
        int iM16524af = mkv.m16524af(16);
        this.f41708c = 0;
        this.f41706a = new Object[16];
        this.f41707b = new Object[16];
        this.f41712g = m17046r(iM16524af);
        this.f41713h = m17046r(iM16524af);
        this.f41714i = m17046r(16);
        this.f41715j = m17046r(16);
        this.f41710e = -2;
        this.f41716k = -2;
        this.f41717l = m17046r(16);
        this.f41711f = m17046r(16);
    }

    @Override // java.util.AbstractMap, java.util.Map, p000.mtz
    public final Object put(Object obj, Object obj2) {
        return m17052f(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iM16523ae = mkv.m16523ae(obj);
        int iM17050c = m17050c(obj, iM16523ae);
        if (iM17050c == -1) {
            return null;
        }
        Object obj2 = this.f41707b[iM17050c];
        m17053h(iM17050c, iM16523ae);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f41708c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        Set set = this.f41719n;
        if (set != null) {
            return set;
        }
        mvy mvyVar = new mvy(this);
        this.f41719n = mvyVar;
        return mvyVar;
    }

    /* JADX INFO: renamed from: q */
    private final void m17045q(int i, int i2) {
        if (i == -2) {
            this.f41710e = i2;
        } else {
            this.f41711f[i] = i2;
        }
        if (i2 == -2) {
            this.f41716k = i;
        } else {
            this.f41717l[i2] = i;
        }
    }
}
