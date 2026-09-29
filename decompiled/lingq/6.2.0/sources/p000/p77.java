package p000;

/* JADX INFO: loaded from: classes.dex */
public class p77 extends n77 {

    /* JADX INFO: renamed from: d */
    public final o77 f55696d;

    /* JADX INFO: renamed from: e */
    public Object f55697e;

    /* JADX INFO: renamed from: f */
    public boolean f55698f;

    /* JADX INFO: renamed from: g */
    public int f55699g;

    public p77(o77 o77Var, zba[] zbaVarArr) {
        super(o77Var.f53938c, zbaVarArr);
        this.f55696d = o77Var;
        this.f55699g = o77Var.f53940e;
    }

    /* JADX INFO: renamed from: c */
    public final void m18936c(int i, yba ybaVar, Object obj, int i2) {
        int i3 = i2 * 5;
        zba[] zbaVarArr = this.f52442a;
        if (i3 <= 30) {
            int iM3612e = 1 << bca.m3612e(i, i3);
            if (ybaVar.m25042h(iM3612e)) {
                zbaVarArr[i2].m25541a(ybaVar.f69615d, Integer.bitCount(ybaVar.f69612a) * 2, ybaVar.m25040f(iM3612e));
                this.f52443b = i2;
                return;
            } else {
                int iM25053t = ybaVar.m25053t(iM3612e);
                yba ybaVarM25052s = ybaVar.m25052s(iM25053t);
                zbaVarArr[i2].m25541a(ybaVar.f69615d, Integer.bitCount(ybaVar.f69612a) * 2, iM25053t);
                m18936c(i, ybaVarM25052s, obj, i2 + 1);
                return;
            }
        }
        zba zbaVar = zbaVarArr[i2];
        Object[] objArr = ybaVar.f69615d;
        zbaVar.m25541a(objArr, objArr.length, 0);
        while (true) {
            zba zbaVar2 = zbaVarArr[i2];
            if (fa4.m11650l(zbaVar2.f71319a[zbaVar2.f71321c], obj)) {
                this.f52443b = i2;
                return;
            } else {
                zbaVarArr[i2].f71321c += 2;
            }
        }
    }

    @Override // p000.n77, java.util.Iterator
    public final Object next() {
        if (this.f55696d.f53940e != this.f55699g) {
            C3386nv.m17619e();
            return null;
        }
        if (!this.f52444c) {
            uk9.m22784s();
            return null;
        }
        zba zbaVar = this.f52442a[this.f52443b];
        this.f55697e = zbaVar.f71319a[zbaVar.f71321c];
        this.f55698f = true;
        return super.next();
    }

    @Override // p000.n77, java.util.Iterator
    public final void remove() {
        if (!this.f55698f) {
            uk9.m22770c();
            return;
        }
        boolean z = this.f52444c;
        o77 o77Var = this.f55696d;
        if (!z) {
            lda.m16118d(o77Var).remove(this.f55697e);
        } else {
            if (!z) {
                uk9.m22784s();
                return;
            }
            zba zbaVar = this.f52442a[this.f52443b];
            Object obj = zbaVar.f71319a[zbaVar.f71321c];
            lda.m16118d(o77Var).remove(this.f55697e);
            m18936c(obj != null ? obj.hashCode() : 0, o77Var.f53938c, obj, 0);
        }
        this.f55697e = null;
        this.f55698f = false;
        this.f55699g = o77Var.f53940e;
    }
}
