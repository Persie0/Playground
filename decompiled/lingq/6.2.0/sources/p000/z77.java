package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z77 extends AbstractC0003a1 {

    /* JADX INFO: renamed from: c */
    public final x77 f71024c;

    /* JADX INFO: renamed from: d */
    public int f71025d;

    /* JADX INFO: renamed from: e */
    public xba f71026e;

    /* JADX INFO: renamed from: f */
    public int f71027f;

    public z77(x77 x77Var, int i) {
        super(i, x77Var.f67899h);
        this.f71024c = x77Var;
        this.f71025d = x77Var.m24386i();
        this.f71027f = -1;
        m25487b();
    }

    /* JADX INFO: renamed from: a */
    public final void m25486a() {
        if (this.f71025d == this.f71024c.m24386i()) {
            return;
        }
        C3386nv.m17619e();
    }

    @Override // p000.AbstractC0003a1, java.util.ListIterator
    public final void add(Object obj) {
        m25486a();
        int i = this.f41a;
        x77 x77Var = this.f71024c;
        x77Var.add(i, obj);
        this.f41a++;
        this.f42b = x77Var.mo4182d();
        this.f71025d = x77Var.m24386i();
        this.f71027f = -1;
        m25487b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: b */
    public final void m25487b() {
        x77 x77Var = this.f71024c;
        Object[] objArr = x77Var.f67897f;
        if (objArr == null) {
            this.f71026e = null;
            return;
        }
        int i = (x77Var.f67899h - 1) & (-32);
        int i2 = this.f41a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (x77Var.f67895d / 5) + 1;
        xba xbaVar = this.f71026e;
        if (xbaVar == null) {
            this.f71026e = new xba(objArr, i2, i, i3);
            return;
        }
        xbaVar.f41a = i2;
        xbaVar.f42b = i;
        xbaVar.f68043c = i3;
        if (xbaVar.f68044d.length < i3) {
            xbaVar.f68044d = new Object[i3];
        }
        xbaVar.f68044d[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        xbaVar.f68045e = r0;
        xbaVar.m24442b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m25486a();
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f41a;
        this.f71027f = i;
        xba xbaVar = this.f71026e;
        x77 x77Var = this.f71024c;
        if (xbaVar == null) {
            Object[] objArr = x77Var.f67898g;
            this.f41a = i + 1;
            return objArr[i];
        }
        if (xbaVar.hasNext()) {
            this.f41a++;
            return xbaVar.next();
        }
        Object[] objArr2 = x77Var.f67898g;
        int i2 = this.f41a;
        this.f41a = i2 + 1;
        return objArr2[i2 - xbaVar.f42b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m25486a();
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f41a;
        this.f71027f = i - 1;
        xba xbaVar = this.f71026e;
        x77 x77Var = this.f71024c;
        if (xbaVar == null) {
            Object[] objArr = x77Var.f67898g;
            int i2 = i - 1;
            this.f41a = i2;
            return objArr[i2];
        }
        int i3 = xbaVar.f42b;
        if (i <= i3) {
            this.f41a = i - 1;
            return xbaVar.previous();
        }
        Object[] objArr2 = x77Var.f67898g;
        int i4 = i - 1;
        this.f41a = i4;
        return objArr2[i4 - i3];
    }

    @Override // p000.AbstractC0003a1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m25486a();
        int i = this.f71027f;
        if (i == -1) {
            uk9.m22770c();
            return;
        }
        x77 x77Var = this.f71024c;
        x77Var.mo4183f(i);
        int i2 = this.f71027f;
        if (i2 < this.f41a) {
            this.f41a = i2;
        }
        this.f42b = x77Var.mo4182d();
        this.f71025d = x77Var.m24386i();
        this.f71027f = -1;
        m25487b();
    }

    @Override // p000.AbstractC0003a1, java.util.ListIterator
    public final void set(Object obj) {
        m25486a();
        int i = this.f71027f;
        if (i == -1) {
            uk9.m22770c();
            return;
        }
        x77 x77Var = this.f71024c;
        x77Var.set(i, obj);
        this.f71025d = x77Var.m24386i();
        m25487b();
    }
}
