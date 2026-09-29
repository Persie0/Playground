package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xba extends AbstractC0003a1 {

    /* JADX INFO: renamed from: c */
    public int f68043c;

    /* JADX INFO: renamed from: d */
    public Object[] f68044d;

    /* JADX INFO: renamed from: e */
    public boolean f68045e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public xba(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f68043c = i3;
        Object[] objArr2 = new Object[i3];
        this.f68044d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f68045e = r5;
        objArr2[0] = objArr;
        m24442b(i - r5, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m24441a() {
        int i = this.f41a & 31;
        Object obj = this.f68044d[this.f68043c - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    /* JADX INFO: renamed from: b */
    public final void m24442b(int i, int i2) {
        int i3 = (this.f68043c - i2) * 5;
        while (i2 < this.f68043c) {
            Object[] objArr = this.f68044d;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[bca.m3613f(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24443c(int i) {
        int i2 = 0;
        while (bca.m3613f(this.f41a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m24442b(this.f41a, ((this.f68043c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        Object objM24441a = m24441a();
        int i = this.f41a + 1;
        this.f41a = i;
        if (i == this.f42b) {
            this.f68045e = true;
            return objM24441a;
        }
        m24443c(0);
        return objM24441a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        this.f41a--;
        if (this.f68045e) {
            this.f68045e = false;
            return m24441a();
        }
        m24443c(31);
        return m24441a();
    }
}
