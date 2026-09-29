package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y77 extends AbstractC0003a1 {

    /* JADX INFO: renamed from: c */
    public final Object[] f69416c;

    /* JADX INFO: renamed from: d */
    public final xba f69417d;

    public y77(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.f69416c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f69417d = new xba(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uk9.m22784s();
            return null;
        }
        xba xbaVar = this.f69417d;
        if (xbaVar.hasNext()) {
            this.f41a++;
            return xbaVar.next();
        }
        int i = this.f41a;
        this.f41a = i + 1;
        return this.f69416c[i - xbaVar.f42b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            uk9.m22784s();
            return null;
        }
        int i = this.f41a;
        xba xbaVar = this.f69417d;
        int i2 = xbaVar.f42b;
        if (i <= i2) {
            this.f41a = i - 1;
            return xbaVar.previous();
        }
        int i3 = i - 1;
        this.f41a = i3;
        return this.f69416c[i3 - i2];
    }
}
