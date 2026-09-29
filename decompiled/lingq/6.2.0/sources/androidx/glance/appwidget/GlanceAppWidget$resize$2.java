package androidx.glance.appwidget;

import android.os.Bundle;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2896ct;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget$resize$2", m4291f = "GlanceAppWidget.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidget$resize$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f5866a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0656d f5867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f5868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$resize$2(Bundle bundle, Continuation continuation) {
        super(4, continuation);
        this.f5868c = bundle;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).getClass();
        GlanceAppWidget$resize$2 glanceAppWidget$resize$2 = new GlanceAppWidget$resize$2(this.f5868c, (Continuation) obj4);
        glanceAppWidget$resize$2.f5867b = (C0656d) obj2;
        return glanceAppWidget$resize$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5866a;
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
        C0656d c0656d = this.f5867b;
        this.f5866a = 1;
        c0656d.getClass();
        Object objM2493b = c0656d.m2493b(new C2896ct(this.f5868c), this);
        if (objM2493b != coroutineSingletons) {
            objM2493b = xfaVar;
        }
        return objM2493b == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
