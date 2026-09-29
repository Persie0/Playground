package androidx.glance.appwidget;

import androidx.compose.runtime.C0281i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$3", m4291f = "AppWidgetComposer.kt", m4292l = {219}, m4293m = "invokeSuspend", m4294v = 1)
final class AppWidgetComposerKt$composeForPreview$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5779a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0281i f5781c;

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$3$1 */
    @c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$3$1", m4291f = "AppWidgetComposer.kt", m4292l = {217}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5782a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0281i f5783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06411(C0281i c0281i, Continuation continuation) {
            super(2, continuation);
            this.f5783b = c0281i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06411(this.f5783b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06411) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5782a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f5782a = 1;
                if (this.f5783b.m1282N(this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetComposerKt$composeForPreview$3(C0281i c0281i, Continuation continuation) {
        super(2, continuation);
        this.f5781c = c0281i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppWidgetComposerKt$composeForPreview$3 appWidgetComposerKt$composeForPreview$3 = new AppWidgetComposerKt$composeForPreview$3(this.f5781c, continuation);
        appWidgetComposerKt$composeForPreview$3.f5780b = obj;
        return appWidgetComposerKt$composeForPreview$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AppWidgetComposerKt$composeForPreview$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5779a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            wfb.m23926u((un1) this.f5780b, null, null, new C06411(this.f5781c, null), 3);
            C0281i c0281i = this.f5781c;
            if (c0281i.f3778y.m15505Y(xfa.f68157a)) {
                synchronized (c0281i.f3757d) {
                    c0281i.f3773t = true;
                }
            }
            C0281i c0281i2 = this.f5781c;
            this.f5779a = 1;
            if (c0281i2.m1273D(this) == coroutineSingletons) {
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
