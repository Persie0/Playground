package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {145}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5922a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0661i f5924c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5925d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5926e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f5927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1(AbstractC0661i abstractC0661i, Context context, int i, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.f5924c = abstractC0661i;
        this.f5925d = context;
        this.f5926e = i;
        this.f5927f = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1 glanceAppWidgetReceiver$onAppWidgetOptionsChanged$1 = new GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1(this.f5924c, this.f5925d, this.f5926e, this.f5927f, continuation);
        glanceAppWidgetReceiver$onAppWidgetOptionsChanged$1.f5923b = obj;
        return glanceAppWidgetReceiver$onAppWidgetOptionsChanged$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5922a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f5923b;
            this.f5922a = 1;
            if (this.f5924c.m2245c(un1Var, this.f5925d, this.f5926e, this.f5927f, this) == coroutineSingletons) {
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
    }
}
