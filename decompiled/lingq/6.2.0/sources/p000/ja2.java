package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ja2 implements na2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ma2 f45328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f45329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f45330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f45331e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimeUnit f45332f;

    public /* synthetic */ ja2(ma2 ma2Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f45327a = i;
        this.f45328b = ma2Var;
        this.f45329c = runnable;
        this.f45330d = j;
        this.f45331e = j2;
        this.f45332f = timeUnit;
    }

    @Override // p000.na2
    /* JADX INFO: renamed from: a */
    public final ScheduledFuture mo13154a(vqb vqbVar) {
        int i = this.f45327a;
        Runnable runnable = this.f45329c;
        ma2 ma2Var = this.f45328b;
        switch (i) {
            case 0:
                return ma2Var.f50828b.scheduleAtFixedRate(new ka2(ma2Var, runnable, vqbVar, 0), this.f45330d, this.f45331e, this.f45332f);
            default:
                return ma2Var.f50828b.scheduleWithFixedDelay(new ka2(ma2Var, runnable, vqbVar, 2), this.f45330d, this.f45331e, this.f45332f);
        }
    }
}
