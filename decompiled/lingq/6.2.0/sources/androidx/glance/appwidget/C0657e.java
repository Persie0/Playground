package androidx.glance.appwidget;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.C3050gt;
import p000.C3386nv;
import p000.eh0;
import p000.gl1;
import p000.in1;
import p000.jn1;
import p000.kl7;
import p000.kn1;
import p000.ll7;
import p000.qm0;
import p000.sm0;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.appwidget.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0657e implements gl1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f6008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ll7 f6009b;

    public C0657e(AtomicReference atomicReference, ll7 ll7Var) {
        this.f6008a = atomicReference;
        this.f6009b = ll7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.gl1
    /* JADX INFO: renamed from: J */
    public final CoroutineSingletons mo2215J(zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1;
        if (continuationImpl instanceof AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = (AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1) continuationImpl;
            int i = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.f5835c;
            if ((i & Integer.MIN_VALUE) != 0) {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.f5835c = i - Integer.MIN_VALUE;
            } else {
                appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, continuationImpl);
            }
        } else {
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1 = new AppWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1(this, continuationImpl);
        }
        Object obj = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.f5833a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.f5835c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1.f5835c = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(appWidgetUtilsKt$runGlance$1$receiver$1$provideContent$1));
            sm0Var.m21468u();
            ll7 ll7Var = this.f6009b;
            sm0Var.m21470w(new C3050gt(ll7Var, 0));
            qm0 qm0Var = (qm0) this.f6008a.getAndSet(sm0Var);
            if (qm0Var != null) {
                qm0Var.mo10141l(null);
            }
            ((kl7) ll7Var).mo4677k(zi3Var);
            if (sm0Var.m21466r() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
