package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flk implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22504a;

    /* JADX INFO: renamed from: b */
    private final oju f22505b;

    public flk(oju ojuVar, oju ojuVar2) {
        this.f22504a = ojuVar;
        this.f22505b = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static flk m8552a(oju ojuVar, oju ojuVar2) {
        return new flk(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List get() {
        fkp fkpVar = ((fkq) this.f22504a).get();
        dsx dsxVar = ((dms) this.f22505b).get();
        flp[] flpVarArr = new flp[6];
        flpVarArr[0] = new flm(1);
        flpVarArr[1] = new fll(true != dsxVar.m6694i() ? 0.15f : 0.5f);
        flpVarArr[2] = new flm(0);
        flpVarArr[3] = dsxVar.m6694i() ? gaa.m8993e(fkpVar, flj.f22503b) : gaa.m8993e(fkpVar, flj.f22502a);
        flpVarArr[4] = new flo(fkpVar);
        flpVarArr[5] = new flm(2);
        return mkv.m16501I(flpVarArr);
    }
}
