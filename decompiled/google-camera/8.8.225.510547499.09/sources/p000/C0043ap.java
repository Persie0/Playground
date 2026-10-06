package p000;

/* JADX INFO: renamed from: ap */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0043ap extends C0014an {

    /* JADX INFO: renamed from: af */
    public float f1968af = -1.0f;

    /* JADX INFO: renamed from: ag */
    public int f1969ag = -1;

    /* JADX INFO: renamed from: ah */
    public int f1970ah = -1;

    /* JADX INFO: renamed from: aj */
    private C0013am f1972aj = this.f820j;

    /* JADX INFO: renamed from: ai */
    public int f1971ai = 0;

    public C0043ap() {
        this.f827q.clear();
        this.f827q.add(this.f1972aj);
    }

    /* JADX INFO: renamed from: A */
    public final void m1785A(int i) {
        if (this.f1971ai == i) {
            return;
        }
        this.f1971ai = i;
        this.f827q.clear();
        if (this.f1971ai == 1) {
            this.f1972aj = this.f819i;
        } else {
            this.f1972aj = this.f820j;
        }
        this.f827q.add(this.f1972aj);
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: t */
    public final C0013am mo1006t(int i) {
        switch (i - 1) {
            case 1:
            case 3:
                if (this.f1971ai == 1) {
                    return this.f1972aj;
                }
                return null;
            case 2:
            case 4:
                if (this.f1971ai == 0) {
                    return this.f1972aj;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: x */
    public final void mo1010x(C0011ak c0011ak) {
        C0014an c0014an = this.f828r;
        if (c0014an == null) {
            return;
        }
        C0013am c0013amMo1006t = c0014an.mo1006t(2);
        C0013am c0013amMo1006t2 = c0014an.mo1006t(4);
        if (this.f1971ai == 0) {
            c0013amMo1006t = c0014an.mo1006t(3);
            c0013amMo1006t2 = c0014an.mo1006t(5);
        }
        if (this.f1969ag != -1) {
            c0011ak.m854g(C0011ak.m845c(c0011ak, c0011ak.m852e(this.f1972aj), c0011ak.m852e(c0013amMo1006t), this.f1969ag, false));
            return;
        }
        if (this.f1970ah != -1) {
            c0011ak.m854g(C0011ak.m845c(c0011ak, c0011ak.m852e(this.f1972aj), c0011ak.m852e(c0013amMo1006t2), -this.f1970ah, false));
            return;
        }
        if (this.f1968af != -1.0f) {
            C0012al c0012alM852e = c0011ak.m852e(this.f1972aj);
            C0012al c0012alM852e2 = c0011ak.m852e(c0013amMo1006t);
            C0012al c0012alM852e3 = c0011ak.m852e(c0013amMo1006t2);
            float f = this.f1968af;
            C0009ai c0009aiM850a = c0011ak.m850a();
            c0009aiM850a.f399d.m652f(c0012alM852e, -1.0f);
            c0009aiM850a.f399d.m652f(c0012alM852e2, 1.0f - f);
            c0009aiM850a.f399d.m652f(c0012alM852e3, f);
            c0011ak.m854g(c0009aiM850a);
        }
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: y */
    public final void mo1011y() {
        if (this.f828r == null) {
            return;
        }
        int iM846p = C0011ak.m846p(this.f1972aj);
        if (this.f1971ai == 1) {
            this.f833w = iM846p;
            this.f834x = 0;
            m996j(this.f828r.m990d());
            m1002p(0);
            return;
        }
        this.f833w = 0;
        this.f834x = iM846p;
        m1002p(this.f828r.m994h());
        m996j(0);
    }
}
