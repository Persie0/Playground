package androidx.glance.appwidget;

import androidx.glance.session.AbstractC0696d;
import androidx.glance.session.C0697e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.y2d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget$deleted$2", m4291f = "GlanceAppWidget.kt", m4292l = {140}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidget$deleted$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5855a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0785at f5857c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$deleted$2(C0785at c0785at, Continuation continuation) {
        super(2, continuation);
        this.f5857c = c0785at;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidget$deleted$2 glanceAppWidget$deleted$2 = new GlanceAppWidget$deleted$2(this.f5857c, continuation);
        glanceAppWidget$deleted$2.f5856b = obj;
        return glanceAppWidget$deleted$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidget$deleted$2) create((C0697e) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5855a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C0697e c0697e = (C0697e) this.f5856b;
        String strM24910a = y2d.m24910a(this.f5857c.f7451a);
        this.f5855a = 1;
        AbstractC0696d abstractC0696d = (AbstractC0696d) c0697e.f6265a.remove(strM24910a);
        if (abstractC0696d != null) {
            abstractC0696d.f6264d.mo15331i(null);
            abstractC0696d.f6262b.set(false);
            ((C0656d) abstractC0696d).f6006m.mo4537a(null);
        }
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
