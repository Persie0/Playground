package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzx extends mxk {

    /* JADX INFO: renamed from: a */
    public static final mzx f41874a;

    /* JADX INFO: renamed from: e */
    private static final Object[] f41875e;

    /* JADX INFO: renamed from: b */
    final transient Object[] f41876b;

    /* JADX INFO: renamed from: c */
    public final transient int f41877c;

    /* JADX INFO: renamed from: d */
    final transient Object[] f41878d;

    /* JADX INFO: renamed from: f */
    private final transient int f41879f;

    /* JADX INFO: renamed from: g */
    private final transient int f41880g;

    static {
        Object[] objArr = new Object[0];
        f41875e = objArr;
        f41874a = new mzx(objArr, 0, objArr, 0, 0);
    }

    public mzx(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f41876b = objArr;
        this.f41877c = i;
        this.f41878d = objArr2;
        this.f41879f = i2;
        this.f41880g = i3;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: A */
    public final Object[] mo17074A() {
        return this.f41876b;
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: C */
    public final mws mo17143C() {
        return mws.m17093h(this.f41876b, this.f41880g);
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f41878d;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iM16523ae = mkv.m16523ae(obj);
        while (true) {
            int i = iM16523ae & this.f41879f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM16523ae = i + 1;
        }
    }

    @Override // p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr, reason: merged with bridge method [inline-methods] */
    public final naz listIterator() {
        return mo17025v().iterator();
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f41877c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41880g;
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: w */
    public final boolean mo17026w() {
        return true;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: x */
    public final int mo17075x(Object[] objArr, int i) {
        System.arraycopy(this.f41876b, 0, objArr, i, this.f41880g);
        return i + this.f41880g;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: y */
    public final int mo17076y() {
        return this.f41880g;
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: z */
    public final int mo17077z() {
        return 0;
    }
}
