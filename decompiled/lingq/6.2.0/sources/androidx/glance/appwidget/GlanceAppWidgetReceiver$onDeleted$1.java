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
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {170}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetReceiver$onDeleted$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5928a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0661i f5930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5931d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int[] f5932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$onDeleted$1(AbstractC0661i abstractC0661i, Context context, int[] iArr, Continuation continuation) {
        super(2, continuation);
        this.f5930c = abstractC0661i;
        this.f5931d = context;
        this.f5932e = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidgetReceiver$onDeleted$1 glanceAppWidgetReceiver$onDeleted$1 = new GlanceAppWidgetReceiver$onDeleted$1(this.f5930c, this.f5931d, this.f5932e, continuation);
        glanceAppWidgetReceiver$onDeleted$1.f5929b = obj;
        return glanceAppWidgetReceiver$onDeleted$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetReceiver$onDeleted$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5928a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f5929b;
            this.f5928a = 1;
            if (this.f5930c.m2243a(un1Var, this.f5931d, this.f5932e, this) == coroutineSingletons) {
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
