package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ha2 implements na2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42082a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ma2 f42083b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f42084c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TimeUnit f42085d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42086e;

    public /* synthetic */ ha2(ma2 ma2Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f42082a = i;
        this.f42083b = ma2Var;
        this.f42086e = obj;
        this.f42084c = j;
        this.f42085d = timeUnit;
    }

    @Override // p000.na2
    /* JADX INFO: renamed from: a */
    public final ScheduledFuture mo13154a(vqb vqbVar) {
        int i = this.f42082a;
        TimeUnit timeUnit = this.f42085d;
        long j = this.f42084c;
        Object obj = this.f42086e;
        ma2 ma2Var = this.f42083b;
        switch (i) {
            case 0:
                return ma2Var.f50828b.schedule(new ka2(ma2Var, (Runnable) obj, vqbVar, 1), j, timeUnit);
            default:
                return ma2Var.f50828b.schedule(new la2(ma2Var, (Callable) obj, vqbVar, 0), j, timeUnit);
        }
    }
}
