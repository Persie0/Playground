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
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onReceive$1$1", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {230}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetReceiver$onReceive$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5933a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5934b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0661i f5935c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5936d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5937e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f5938f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onReceive$1$1(AbstractC0661i abstractC0661i, Context context, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f5935c = abstractC0661i;
        this.f5936d = context;
        this.f5937e = i;
        this.f5938f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetReceiver$onReceive$1$1 glanceAppWidgetReceiver$onReceive$1$1 = new GlanceAppWidgetReceiver$onReceive$1$1(this.f5935c, this.f5936d, this.f5937e, this.f5938f, continuation);
        glanceAppWidgetReceiver$onReceive$1$1.f5934b = obj;
        return glanceAppWidgetReceiver$onReceive$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetReceiver$onReceive$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5933a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f5934b;
            this.f5933a = 1;
            if (this.f5935c.m2244b(un1Var, this.f5936d, this.f5937e, this.f5938f, this) == coroutineSingletons) {
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
