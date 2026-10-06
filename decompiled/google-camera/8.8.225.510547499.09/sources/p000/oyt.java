package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyt {

    /* JADX INFO: renamed from: a */
    public final opn f46858a;

    /* JADX INFO: renamed from: c */
    public final opl f46860c;

    /* JADX INFO: renamed from: d */
    public final oni f46861d;

    /* JADX INFO: renamed from: e */
    private final int f46862e;

    /* JADX INFO: renamed from: f */
    private final opn f46863f;

    /* JADX INFO: renamed from: g */
    private final opm f46864g = ook.m18795i(0);

    /* JADX INFO: renamed from: b */
    public final opm f46859b = ook.m18795i(0);

    public oyt(int i) {
        this.f46862e = i;
        oxc oxcVar = new oxc(0L, null, 2);
        this.f46863f = ook.m18796j(oxcVar);
        this.f46858a = ook.m18796j(oxcVar);
        this.f46860c = ook.m18794h(i - 1);
        this.f46861d = new avu(this, 16);
    }

    /* JADX INFO: renamed from: a */
    public final void m19208a() {
        int i;
        oxc oxcVar;
        while (true) {
            opl oplVar = this.f46860c;
            do {
                i = oplVar.f46391b;
                int i2 = this.f46862e;
                if (i >= i2) {
                    throw new IllegalStateException(pIeXJQLZLfgIN.sQyHa + i2);
                }
            } while (!oplVar.m18847c(i, i + 1));
            if (i >= 0) {
                return;
            }
            oxc oxcVar2 = (oxc) this.f46863f.f46397a;
            long jM18850b = this.f46864g.m18850b();
            long j = jM18850b / ((long) oyu.f46870f);
            opn opnVar = this.f46863f;
            while (true) {
                oxcVar = oxcVar2;
                while (true) {
                    if (oxcVar.f46760b >= j && !oxcVar.m19127g()) {
                        break;
                    }
                    Object objM19121a = oxcVar.m19121a();
                    Object obj = oxb.f46758a;
                    if (objM19121a == obj) {
                        oxcVar = obj;
                        break;
                    }
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
                    break;
                }
                oxc oxcVarM19155b = oxx.m19155b(oxcVar);
                while (true) {
                    oxc oxcVar4 = (oxc) opnVar.f46397a;
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
                    } else if (oxcVarM19155b.m19126f()) {
                        oxcVarM19155b.m19123c();
                    }
                }
            }
            oxc oxcVarM19155b2 = oxx.m19155b(oxcVar);
            oxcVarM19155b2.f46759a.m18854b(null);
            if (oxcVarM19155b2.f46760b <= j) {
                int i3 = (int) (jM18850b % ((long) oyu.f46870f));
                Object objM18853a = oxcVarM19155b2.f46762d.m15486i(i3).m18853a(oyu.f46866b);
                if (objM18853a == null) {
                    int i4 = oyu.f46865a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (oxcVarM19155b2.f46762d.m15486i(i3).f46397a == oyu.f46867c) {
                            return;
                        }
                    }
                    if (!oxcVarM19155b2.f46762d.m15486i(i3).m18856d(oyu.f46866b, oyu.f46868d)) {
                        return;
                    }
                } else if (objM18853a != oyu.f46869e) {
                    opx opxVar = (opx) objM18853a;
                    if (opxVar.mo18875j(oki.f46196a, this.f46861d) != null) {
                        opxVar.mo18877l();
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
