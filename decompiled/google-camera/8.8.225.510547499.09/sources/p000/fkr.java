package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkr {

    /* JADX INFO: renamed from: a */
    public static final nbh f22404a = nbh.m17259h("com/google/android/apps/camera/microvideo/tonemap/MeanVarianceToneMapParameterExtractor");

    /* JADX INFO: renamed from: b */
    public final nqf f22405b;

    public fkr(Executor executor, nps npsVar, nps npsVar2, nqf nqfVar) {
        this.f22405b = nqfVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(npsVar);
        arrayList.add(npsVar2);
        kxk.m14971Q(arrayList).mo2282d(new epm(this, npsVar, npsVar2, 8), executor);
    }
}
