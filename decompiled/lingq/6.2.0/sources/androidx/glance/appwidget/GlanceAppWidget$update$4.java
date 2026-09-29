package androidx.glance.appwidget;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2939dt;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget$update$4", m4291f = "GlanceAppWidget.kt", m4292l = {160}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidget$update$4 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f5872a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0656d f5873b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f5874c;

    public GlanceAppWidget$update$4() {
        super(4, null);
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GlanceAppWidget$update$4 glanceAppWidget$update$4 = new GlanceAppWidget$update$4(4, (Continuation) obj4);
        glanceAppWidget$update$4.f5873b = (C0656d) obj2;
        glanceAppWidget$update$4.f5874c = zBooleanValue;
        return glanceAppWidget$update$4.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5872a;
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
        C0656d c0656d = this.f5873b;
        if (this.f5874c) {
            this.f5872a = 1;
            Object objM2493b = c0656d.m2493b(C2939dt.f36189a, this);
            if (objM2493b != coroutineSingletons) {
                objM2493b = xfaVar;
            }
            if (objM2493b == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
