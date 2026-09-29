package androidx.glance.appwidget;

import android.content.Context;
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
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$doUpdate$2$1", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {124}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetReceiver$doUpdate$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0661i f5919b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f5920c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$doUpdate$2$1(AbstractC0661i abstractC0661i, Context context, int i, Continuation continuation) {
        super(2, continuation);
        this.f5919b = abstractC0661i;
        this.f5920c = context;
        this.f5921d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlanceAppWidgetReceiver$doUpdate$2$1(this.f5919b, this.f5920c, this.f5921d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetReceiver$doUpdate$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5918a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            AbstractC0659g abstractC0659gMo2247e = this.f5919b.mo2247e();
            this.f5918a = 1;
            if (AbstractC0659g.m2231g(abstractC0659gMo2247e, this.f5920c, this.f5921d, this) == coroutineSingletons) {
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
