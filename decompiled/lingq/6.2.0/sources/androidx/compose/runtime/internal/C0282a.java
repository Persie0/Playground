package androidx.compose.runtime.internal;

import java.io.Serializable;
import java.util.ArrayList;
import p000.C3125iw;
import p000.C3504qn;
import p000.aj3;
import p000.bj3;
import p000.ci8;
import p000.cj3;
import p000.dj3;
import p000.ej3;
import p000.fa4;
import p000.fd1;
import p000.fj3;
import p000.gd1;
import p000.hd1;
import p000.id1;
import p000.lda;
import p000.tj3;
import p000.x18;
import p000.xi3;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0282a implements fd1 {

    /* JADX INFO: renamed from: a */
    public final int f3780a;

    /* JADX INFO: renamed from: b */
    public final boolean f3781b;

    /* JADX INFO: renamed from: c */
    public xi3 f3782c;

    /* JADX INFO: renamed from: d */
    public x18 f3783d;

    /* JADX INFO: renamed from: e */
    public ArrayList f3784e;

    public C0282a(int i, boolean z, xi3 xi3Var) {
        this.f3780a = i;
        this.f3781b = z;
        this.f3782c = xi3Var;
    }

    @Override // p000.ej3
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo1286b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return m1296n(obj, obj2, obj3, obj4, obj5, (ye1) obj6, ((Number) serializable).intValue());
    }

    /* JADX INFO: renamed from: d */
    public final Object m1287d(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = i | (tj3Var.m22120g(this) ? ci8.m4721f(2, 0) : ci8.m4721f(1, 0));
        xi3 xi3Var = this.f3782c;
        lda.m16119e(2, xi3Var);
        Object objInvoke = ((zi3) xi3Var).invoke(tj3Var, Integer.valueOf(iM4721f));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ComposableLambdaImpl$invoke$1(2, this, C0282a.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        return m1293k(obj, obj2, (ye1) obj3, ((Number) obj4).intValue());
    }

    @Override // p000.fj3
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo1288f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, tj3 tj3Var, Integer num) {
        return m1292j(obj, bool, obj2, obj3, obj4, tj3Var, num.intValue());
    }

    /* JADX INFO: renamed from: g */
    public final Object m1289g(Object obj, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 1) : ci8.m4721f(1, 1);
        xi3 xi3Var = this.f3782c;
        int i2 = 3;
        lda.m16119e(3, xi3Var);
        Object objInvoke = ((aj3) xi3Var).invoke(obj, tj3Var, Integer.valueOf(iM4721f | i));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(this, i, i2, obj);
        }
        return objInvoke;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m1295m(obj, obj2, obj3, obj4, (ye1) obj5, ((Number) obj6).intValue());
    }

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m1294l(obj, obj2, obj3, (ye1) obj4, ((Number) obj5).intValue());
    }

    @Override // p000.zi3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1287d((ye1) obj, ((Number) obj2).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final Object m1292j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 6) : ci8.m4721f(1, 6);
        xi3 xi3Var = this.f3782c;
        lda.m16119e(8, xi3Var);
        Object objMo1288f = ((fj3) xi3Var).mo1288f(obj, bool, obj2, obj3, obj4, tj3Var, Integer.valueOf(i | iM4721f));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new id1(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objMo1288f;
    }

    /* JADX INFO: renamed from: k */
    public final Object m1293k(Object obj, Object obj2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 2) : ci8.m4721f(1, 2);
        xi3 xi3Var = this.f3782c;
        lda.m16119e(4, xi3Var);
        Object objMo825e = ((bj3) xi3Var).mo825e(obj, obj2, tj3Var, Integer.valueOf(iM4721f | i));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(i, 0, this, obj, obj2);
        }
        return objMo825e;
    }

    /* JADX INFO: renamed from: l */
    public final Object m1294l(Object obj, Object obj2, Object obj3, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 3) : ci8.m4721f(1, 3);
        xi3 xi3Var = this.f3782c;
        lda.m16119e(5, xi3Var);
        Object objMo1291i = ((cj3) xi3Var).mo1291i(obj, obj2, obj3, tj3Var, Integer.valueOf(iM4721f | i));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new hd1(this, obj, obj2, obj3, i, 0);
        }
        return objMo1291i;
    }

    /* JADX INFO: renamed from: m */
    public final Object m1295m(Object obj, Object obj2, Object obj3, Object obj4, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 4) : ci8.m4721f(1, 4);
        xi3 xi3Var = this.f3782c;
        lda.m16119e(6, xi3Var);
        Object objMo1290h = ((dj3) xi3Var).mo1290h(obj, obj2, obj3, obj4, tj3Var, Integer.valueOf(i | iM4721f));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3125iw(this, obj, obj2, obj3, obj4, i, 1);
        }
        return objMo1290h;
    }

    /* JADX INFO: renamed from: n */
    public final Object m1296n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(this.f3780a);
        m1297o(tj3Var);
        int iM4721f = tj3Var.m22120g(this) ? ci8.m4721f(2, 5) : ci8.m4721f(1, 5);
        xi3 xi3Var = this.f3782c;
        lda.m16119e(7, xi3Var);
        Object objMo1286b = ((ej3) xi3Var).mo1286b(obj, obj2, obj3, obj4, obj5, tj3Var, Integer.valueOf(i | iM4721f));
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new id1(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objMo1286b;
    }

    /* JADX INFO: renamed from: o */
    public final void m1297o(ye1 ye1Var) {
        x18 x18VarM22083A;
        if (!this.f3781b || (x18VarM22083A = ((tj3) ye1Var).m22083A()) == null) {
            return;
        }
        x18VarM22083A.f67640b |= 1;
        x18 x18Var = this.f3783d;
        if (x18Var == null || !x18Var.m24235a() || x18Var == x18VarM22083A || fa4.m11650l(x18Var.f67641c, x18VarM22083A.f67641c)) {
            this.f3783d = x18VarM22083A;
            return;
        }
        ArrayList arrayList = this.f3784e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3784e = arrayList2;
            arrayList2.add(x18VarM22083A);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x18 x18Var2 = (x18) arrayList.get(i);
            if (x18Var2 == null || !x18Var2.m24235a() || x18Var2 == x18VarM22083A || fa4.m11650l(x18Var2.f67641c, x18VarM22083A.f67641c)) {
                arrayList.set(i, x18VarM22083A);
                return;
            }
        }
        arrayList.add(x18VarM22083A);
    }

    @Override // p000.aj3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1289g(obj, (ye1) obj2, ((Number) obj3).intValue());
    }
}
