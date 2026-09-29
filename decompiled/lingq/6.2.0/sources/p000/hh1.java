package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hh1 {

    /* JADX INFO: renamed from: a */
    public final Executor f42347a;

    /* JADX INFO: renamed from: b */
    public final nn1 f42348b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f42349c;

    /* JADX INFO: renamed from: d */
    public final gr7 f42350d;

    /* JADX INFO: renamed from: e */
    public final lfa f42351e;

    /* JADX INFO: renamed from: f */
    public final g9c f42352f;

    /* JADX INFO: renamed from: g */
    public final qn3 f42353g;

    /* JADX INFO: renamed from: h */
    public final int f42354h;

    /* JADX INFO: renamed from: i */
    public final int f42355i;

    /* JADX INFO: renamed from: j */
    public final int f42356j;

    /* JADX INFO: renamed from: k */
    public final int f42357k;

    /* JADX INFO: renamed from: l */
    public final boolean f42358l;

    /* JADX INFO: renamed from: m */
    public final iy5 f42359m;

    public hh1(gh1 gh1Var) {
        ExecutorService executorServiceM19038h = (ExecutorService) gh1Var.f40792d;
        executorServiceM19038h = executorServiceM19038h == null ? pb1.m19038h(false) : executorServiceM19038h;
        this.f42347a = executorServiceM19038h;
        this.f42348b = ((ExecutorService) gh1Var.f40792d) != null ? bna.m3926O(executorServiceM19038h) : ph2.f56212a;
        this.f42349c = pb1.m19038h(true);
        this.f42350d = new gr7(16);
        lfa lfaVar = (lfa) gh1Var.f40793e;
        this.f42351e = lfaVar == null ? v92.f65035a : lfaVar;
        this.f42352f = g9c.f40430d;
        this.f42353g = new qn3(24);
        this.f42354h = gh1Var.f40790b;
        this.f42355i = Integer.MAX_VALUE;
        this.f42357k = gh1Var.f40791c;
        this.f42356j = 8;
        this.f42358l = true;
        this.f42359m = new iy5(9);
    }
}
