package androidx.glance.appwidget;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0823bt;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget$triggerAction$2", m4291f = "GlanceAppWidget.kt", m4292l = {176}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidget$triggerAction$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f5869a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0656d f5870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f5871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$triggerAction$2(String str, Continuation continuation) {
        super(4, continuation);
        this.f5871c = str;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).getClass();
        GlanceAppWidget$triggerAction$2 glanceAppWidget$triggerAction$2 = new GlanceAppWidget$triggerAction$2(this.f5871c, (Continuation) obj4);
        glanceAppWidget$triggerAction$2.f5870b = (C0656d) obj2;
        return glanceAppWidget$triggerAction$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5869a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0656d c0656d = this.f5870b;
            this.f5869a = 1;
            c0656d.getClass();
            Object objM2493b = c0656d.m2493b(new C0823bt(this.f5871c), this);
            if (objM2493b != coroutineSingletons) {
                objM2493b = xfaVar;
            }
            if (objM2493b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
