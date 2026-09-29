package androidx.glance.appwidget;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: renamed from: androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1", m4291f = "GlanceRemoteViewsService.kt", m4292l = {128}, m4293m = "invokeSuspend", m4294v = 1)
final class C0648x1c76f406 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f5953a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0656d f5954b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f5955c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C0648x1c76f406 c0648x1c76f406 = new C0648x1c76f406(4, (Continuation) obj4);
        c0648x1c76f406.f5954b = (C0656d) obj2;
        c0648x1c76f406.f5955c = zBooleanValue;
        return c0648x1c76f406.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5953a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C0656d c0656d = this.f5954b;
        if (this.f5955c) {
            return null;
        }
        this.f5953a = 1;
        Object objM2227g = c0656d.m2227g(this);
        return objM2227g == coroutineSingletons ? coroutineSingletons : objM2227g;
    }
}
