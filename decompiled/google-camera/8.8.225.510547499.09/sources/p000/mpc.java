package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mpc implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ onm f41232a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oub f41233b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oyt f41234c;

    /* JADX INFO: renamed from: d */
    private int f41235d;

    public mpc(oub oubVar, oyt oytVar, onm onmVar) {
        this.f41233b = oubVar;
        this.f41234c = oytVar;
        this.f41232a = onmVar;
    }

    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        oxc oxcVar;
        opy opyVar;
        opy opyVar2;
        Object objM18887m;
        int i = this.f41235d;
        this.f41235d = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        oub oubVar = this.f41233b;
        Object obj2 = null;
        ooc.m18746l(oubVar, null, new mpb(this.f41232a, obj, oubVar, i, null), 3);
        oyt oytVar = this.f41234c;
        if (oytVar.f46860c.m18845a() > 0) {
            objM18887m = oki.f46196a;
        } else {
            opy opyVarM18771I = ook.m18771I(omn.m18701f(olsVar));
            while (true) {
                oxc oxcVar2 = (oxc) oytVar.f46858a.f46397a;
                long jM18850b = oytVar.f46859b.m18850b();
                opn opnVar = oytVar.f46858a;
                long j = jM18850b / ((long) oyu.f46870f);
                while (true) {
                    oxcVar = oxcVar2;
                    while (true) {
                        if (oxcVar.f46760b >= j && !oxcVar.m19127g()) {
                            break;
                        }
                        Object objM19121a = oxcVar.m19121a();
                        Object obj3 = oxb.f46758a;
                        if (objM19121a == obj3) {
                            oxcVar = obj3;
                            break;
                        }
                        obj2 = obj2;
                        opyVarM18771I = opyVarM18771I;
                        oxc oxcVar3 = (oxc) objM19121a;
                        if (oxcVar3 != null) {
                            oxcVar = oxcVar3;
                        } else {
                            oxc oxcVarM19209a = oyu.m19209a(oxcVar.f46760b + 1, oxcVar);
                            if (oxcVar.m19125e(oxcVarM19209a)) {
                                if (oxcVar.m19127g()) {
                                    oxcVar.m19123c();
                                }
                                oxcVar = oxcVarM19209a;
                            }
                        }
                    }
                    if (oxx.m19154a(oxcVar)) {
                        opyVar = opyVarM18771I;
                        break;
                    }
                    oxc oxcVarM19155b = oxx.m19155b(oxcVar);
                    while (true) {
                        oxc oxcVar4 = (oxc) opnVar.f46397a;
                        opyVar = opyVarM18771I;
                        if (oxcVar4.f46760b >= oxcVarM19155b.f46760b) {
                            break;
                        }
                        if (!oxcVarM19155b.m19128h()) {
                            break;
                        }
                        if (opnVar.m18856d(oxcVar4, oxcVarM19155b)) {
                            if (!oxcVar4.m19126f()) {
                                break;
                            }
                            oxcVar4.m19123c();
                            break;
                        }
                        if (oxcVarM19155b.m19126f()) {
                            oxcVarM19155b.m19123c();
                        }
                        opyVarM18771I = opyVar;
                    }
                    opyVarM18771I = opyVar;
                    obj2 = null;
                }
                oxc oxcVarM19155b2 = oxx.m19155b(oxcVar);
                int i2 = (int) (jM18850b % ((long) oyu.f46870f));
                opyVar2 = opyVar;
                if (oxcVarM19155b2.f46762d.m15486i(i2).m18856d(null, opyVar2)) {
                    opyVar2.mo18870a(new oys(oxcVarM19155b2, i2));
                    break;
                }
                if (oxcVarM19155b2.f46762d.m15486i(i2).m18856d(oyu.f46866b, oyu.f46867c)) {
                    opyVar2.mo18871b(oki.f46196a, oytVar.f46861d);
                    break;
                }
                boolean z = oqu.f46432a;
                if (oytVar.f46860c.m18845a() > 0) {
                    opyVar2.mo18871b(oki.f46196a, oytVar.f46861d);
                    break;
                }
                opyVarM18771I = opyVar2;
                obj2 = null;
            }
            objM18887m = opyVar2.m18887m();
            oma omaVar = oma.COROUTINE_SUSPENDED;
            if (objM18887m != omaVar) {
                objM18887m = oki.f46196a;
            }
            if (objM18887m != omaVar) {
                objM18887m = oki.f46196a;
            }
        }
        return objM18887m == oma.COROUTINE_SUSPENDED ? objM18887m : oki.f46196a;
    }
}
