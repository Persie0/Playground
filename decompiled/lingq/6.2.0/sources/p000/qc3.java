package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc3 extends u33 {

    /* JADX INFO: renamed from: b */
    public final u33 f57562b;

    public qc3(u33 u33Var) {
        u33Var.getClass();
        this.f57562b = u33Var;
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: A */
    public final qg4 mo259A(d57 d57Var) {
        return this.f57562b.mo259A(d57Var);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: N */
    public final yd9 mo261N(d57 d57Var) {
        d57Var.getClass();
        return this.f57562b.mo261N(d57Var);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: a */
    public final t89 mo262a(d57 d57Var) {
        d57Var.getClass();
        return this.f57562b.mo262a(d57Var);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: b */
    public final void mo263b(d57 d57Var, d57 d57Var2) {
        d57Var.getClass();
        d57Var2.getClass();
        this.f57562b.mo263b(d57Var, d57Var2);
    }

    @Override // p000.u33, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57562b.close();
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: e */
    public final void mo264e(d57 d57Var) {
        d57Var.getClass();
        this.f57562b.mo264e(d57Var);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: n */
    public final void mo265n(d57 d57Var) {
        d57Var.getClass();
        this.f57562b.mo265n(d57Var);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: r */
    public final List mo266r(d57 d57Var) {
        List<d57> listMo266r = this.f57562b.mo266r(d57Var);
        ArrayList arrayList = new ArrayList();
        for (d57 d57Var2 : listMo266r) {
            d57Var2.getClass();
            arrayList.add(d57Var2);
        }
        x91.m24413s0(arrayList);
        return arrayList;
    }

    public final String toString() {
        return y38.m24933a(getClass()).m25414c() + '(' + this.f57562b + ')';
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: x */
    public final sb2 mo267x(d57 d57Var) {
        d57Var.getClass();
        sb2 sb2VarMo267x = this.f57562b.mo267x(d57Var);
        if (sb2VarMo267x == null) {
            return null;
        }
        d57 d57Var2 = (d57) sb2VarMo267x.f60614d;
        if (d57Var2 == null) {
            return sb2VarMo267x;
        }
        boolean z = sb2VarMo267x.f60612b;
        boolean z2 = sb2VarMo267x.f60613c;
        Long l = (Long) sb2VarMo267x.f60615e;
        Long l2 = (Long) sb2VarMo267x.f60616f;
        Long l3 = (Long) sb2VarMo267x.f60617g;
        Long l4 = (Long) sb2VarMo267x.f60618h;
        Map map = (Map) sb2VarMo267x.f60619i;
        map.getClass();
        return new sb2(z, z2, d57Var2, l, l2, l3, l4, map);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: z */
    public final qg4 mo268z(d57 d57Var) {
        return this.f57562b.mo268z(d57Var);
    }
}
