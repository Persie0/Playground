package androidx.glance.appwidget;

import android.util.Log;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1", m4291f = "GlanceRemoteViewsService.kt", m4292l = {110}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0662j f5949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(C0662j c0662j, Continuation continuation) {
        super(2, continuation);
        this.f5949b = c0662j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this.f5949b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5948a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0662j c0662j = this.f5949b;
                C0785at c0785at = new C0785at(c0662j.f6020b);
                this.f5948a = 1;
                if (C0662j.m2249a(c0662j, c0785at, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", th));
        }
    }
}
