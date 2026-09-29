package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hba {

    /* JADX INFO: renamed from: a */
    public final q50 f42139a;

    /* JADX INFO: renamed from: b */
    public final String f42140b;

    /* JADX INFO: renamed from: c */
    public final bs2 f42141c;

    /* JADX INFO: renamed from: d */
    public final o9a f42142d;

    /* JADX INFO: renamed from: e */
    public final nba f42143e;

    public hba(q50 q50Var, String str, bs2 bs2Var, o9a o9aVar, nba nbaVar) {
        this.f42139a = q50Var;
        this.f42140b = str;
        this.f42141c = bs2Var;
        this.f42142d = o9aVar;
        this.f42143e = nbaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m13185a(j40 j40Var, oba obaVar) {
        String str = this.f42140b;
        if (str == null) {
            C3386nv.m17635v("Null transportName");
            return;
        }
        o9a o9aVar = this.f42142d;
        if (o9aVar == null) {
            C3386nv.m17635v("Null transformer");
            return;
        }
        nba nbaVar = this.f42143e;
        w72 w72Var = nbaVar.f52577c;
        q50 q50VarM19659b = this.f42139a.m19659b(j40Var.f45030b);
        k40 k40Var = new k40();
        k40Var.f46681i = new HashMap();
        k40Var.f46679g = Long.valueOf(nbaVar.f52575a.mo100g());
        k40Var.f46680h = Long.valueOf(nbaVar.f52576b.mo100g());
        k40Var.f46674b = str;
        k40Var.f46678f = new vr2(this.f42141c, (byte[]) o9aVar.apply(j40Var.f45029a));
        k40Var.f46676d = null;
        ml7 ml7Var = j40Var.f45031c;
        if (ml7Var != null) {
            k40Var.f46677e = ml7Var.mo10097a();
        }
        w72Var.f66464b.execute(new u72(w72Var, q50VarM19659b, obaVar, k40Var.m14798c(), 0));
    }
}
