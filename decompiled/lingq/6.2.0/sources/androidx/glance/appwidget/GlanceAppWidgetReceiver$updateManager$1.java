package androidx.glance.appwidget;

import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y2d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidgetReceiver$updateManager$1", m4291f = "GlanceAppWidgetReceiver.kt", m4292l = {183}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidgetReceiver$updateManager$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f5945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0661i f5946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidgetReceiver$updateManager$1(Context context, AbstractC0661i abstractC0661i, Continuation continuation) {
        super(2, continuation);
        this.f5945b = context;
        this.f5946c = abstractC0661i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlanceAppWidgetReceiver$updateManager$1(this.f5945b, this.f5946c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidgetReceiver$updateManager$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5944a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Context context = this.f5945b;
                AbstractC0661i abstractC0661i = this.f5946c;
                C0660h c0660h = new C0660h(context);
                AbstractC0659g abstractC0659gMo2247e = abstractC0661i.mo2247e();
                this.f5944a = 1;
                if (c0660h.m2242e(abstractC0661i, abstractC0659gMo2247e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            y2d.m24916g(th);
        }
        return xfa.f68157a;
    }
}
