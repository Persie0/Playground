package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", m18657c = "WindowInfoTrackerImpl.kt", m18658d = "invokeSuspend", m18659e = {61})
public final class awv extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2616a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ aww f2617b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Activity f2618c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f2619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awv(aww awwVar, Activity activity, ols olsVar) {
        super(2, olsVar);
        this.f2617b = awwVar;
        this.f2618c = activity;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((awv) mo562c((oub) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2616a) {
            case 0:
                lkm.m15592s(obj);
                oub oubVar = (oub) this.f2619d;
                C0078bx c0078bx = new C0078bx(oubVar, 6);
                this.f2617b.f2620a.mo2078a(this.f2618c, ExecutorC0932qj.f47486b, c0078bx);
                awu awuVar = new awu(this.f2617b, c0078bx, 0);
                this.f2616a = 1;
                if (ooc.m18748n(oubVar, awuVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        awv awvVar = new awv(this.f2617b, this.f2618c, olsVar);
        awvVar.f2619d = obj;
        return awvVar;
    }
}
