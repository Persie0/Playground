package p213k4;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2468r;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.common.collect.ImmutableList;
import dm.C5207g;
import ga.C5726i;
import ge.ScheduledExecutorServiceC5783g;
import ge.ScheduledFutureC5784h;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p128g2.RunnableC5682t;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p241le.C7337h0;
import p288o4.InterfaceC7919e;
import p402u0.C9371n;

/* JADX INFO: renamed from: k4.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6589i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37469c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f37470d;

    public /* synthetic */ RunnableC6589i(int i10, Object obj, Object obj2, Object obj3) {
        this.f37467a = i10;
        this.f37468b = obj;
        this.f37469c = obj2;
        this.f37470d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f37467a;
        Object obj = this.f37470d;
        Object obj2 = this.f37469c;
        Object obj3 = this.f37468b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC7919e interfaceC7919e = (InterfaceC7919e) obj2;
                C5207g.m11111f((C6591k) obj3, "this$0");
                C5207g.m11111f(interfaceC7919e, "$query");
                C5207g.m11111f((C6592l) obj, "$queryInterceptorProgram");
                interfaceC7919e.mo13196b();
                throw null;
            case 1:
                C5207g.m11111f((C6591k) obj3, "this$0");
                C5207g.m11111f((String) obj2, "$sql");
                C5207g.m11111f((List) obj, "$inputArguments");
                throw null;
            case 2:
                C2468r c2468r = (C2468r) obj3;
                c2468r.getClass();
                ImmutableList immutableListM9068e = ((ImmutableList.C3146a) obj2).m9068e();
                c2468r.f12975c.mo12746V(immutableListM9068e, (InterfaceC2492i.b) obj);
                return;
            case 3:
                Pair pair = (Pair) obj2;
                C2469s.this.f12993h.mo7242g0(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, (C5726i) obj);
                return;
            case 4:
                InterfaceC2398b.a aVar = (InterfaceC2398b.a) obj3;
                ((InterfaceC2398b) obj2).mo6966y(aVar.f12200a, aVar.f12201b, (Exception) obj);
                return;
            case 5:
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = (ScheduledExecutorServiceC5783g) obj3;
                scheduledExecutorServiceC5783g.getClass();
                scheduledExecutorServiceC5783g.f34984a.execute(new RunnableC5682t((Runnable) obj2, 15, (ScheduledFutureC5784h.b) obj));
                return;
            default:
                Callable callable = (Callable) obj3;
                Executor executor = (Executor) obj2;
                C5752h c5752h = (C5752h) obj;
                ExecutorService executorService = C7337h0.f41062a;
                try {
                    ((AbstractC5751g) callable.call()).mo12104f(executor, new C9371n(10, c5752h));
                    return;
                } catch (Exception e10) {
                    c5752h.m12113a(e10);
                    return;
                }
        }
    }
}
