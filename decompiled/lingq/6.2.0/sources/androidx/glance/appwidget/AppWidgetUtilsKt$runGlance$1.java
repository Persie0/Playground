package androidx.glance.appwidget;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ll7;
import p000.ln3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1", m4291f = "AppWidgetUtils.kt", m4292l = {236}, m4293m = "invokeSuspend", m4294v = 1)
final class AppWidgetUtilsKt$runGlance$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5824a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0659g f5826c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5827d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ln3 f5828e;

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1 */
    @c32(m4290c = "androidx.glance.appwidget.AppWidgetUtilsKt$runGlance$1$1", m4291f = "AppWidgetUtils.kt", m4292l = {236}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06441 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5829a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0659g f5830b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f5831c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ln3 f5832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06441(AbstractC0659g abstractC0659g, Context context, ln3 ln3Var, Continuation continuation) {
            super(2, continuation);
            this.f5830b = abstractC0659g;
            this.f5831c = context;
            this.f5832d = ln3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06441(this.f5830b, this.f5831c, this.f5832d, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06441) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5829a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f5829a = 1;
                if (this.f5830b.mo2235d(this.f5831c, this) == coroutineSingletons) {
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
    public AppWidgetUtilsKt$runGlance$1(AbstractC0659g abstractC0659g, Context context, ln3 ln3Var, Continuation continuation) {
        super(2, continuation);
        this.f5826c = abstractC0659g;
        this.f5827d = context;
        this.f5828e = ln3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppWidgetUtilsKt$runGlance$1 appWidgetUtilsKt$runGlance$1 = new AppWidgetUtilsKt$runGlance$1(this.f5826c, this.f5827d, this.f5828e, continuation);
        appWidgetUtilsKt$runGlance$1.f5825b = obj;
        return appWidgetUtilsKt$runGlance$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AppWidgetUtilsKt$runGlance$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5824a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0657e c0657e = new C0657e(new AtomicReference(null), (ll7) this.f5825b);
            C06441 c06441 = new C06441(this.f5826c, this.f5827d, this.f5828e, null);
            this.f5824a = 1;
            if (wfb.m23905G(c06441, c0657e, this) == coroutineSingletons) {
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
