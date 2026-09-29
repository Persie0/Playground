package androidx.glance.appwidget;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.nmb;
import p000.pb1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.y38;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$content$1", m4291f = "AppWidgetComposer.kt", m4292l = {204}, m4293m = "invokeSuspend", m4294v = 1)
final class AppWidgetComposerKt$composeForPreview$content$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5784a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0659g f5786c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5787d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5788e;

    /* JADX INFO: renamed from: androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$content$1$1 */
    @c32(m4290c = "androidx.glance.appwidget.AppWidgetComposerKt$composeForPreview$content$1$1", m4291f = "AppWidgetComposer.kt", m4292l = {193, 201}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5789a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0659g f5790b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f5791c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f5792d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3229i f5793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06421(AbstractC0659g abstractC0659g, Context context, int i, C3229i c3229i, Continuation continuation) {
            super(2, continuation);
            this.f5790b = abstractC0659g;
            this.f5791c = context;
            this.f5792d = i;
            this.f5793e = c3229i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06421(this.f5790b, this.f5791c, this.f5792d, this.f5793e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06421) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (r0.emit(r13, r12) == r2) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            C3229i c3229i = this.f5793e;
            AbstractC0659g abstractC0659g = this.f5790b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5789a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Context context = this.f5791c;
                int i2 = this.f5792d;
                this.f5789a = 1;
                if (abstractC0659g.mo2236e(context, i2, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
            synchronized (c3229i) {
                int iM15556n = (int) ((c3229i.m15556n() + ((long) c3229i.f48066k)) - c3229i.f48064i);
                if (iM15556n == 0) {
                    list = EmptyList.f47638a;
                } else {
                    ArrayList arrayList = new ArrayList(iM15556n);
                    Object[] objArr = c3229i.f48063h;
                    objArr.getClass();
                    for (int i3 = 0; i3 < iM15556n; i3++) {
                        arrayList.add(objArr[((int) (c3229i.f48064i + ((long) i3))) & (objArr.length - 1)]);
                    }
                    list = arrayList;
                }
            }
            if (list.isEmpty()) {
                Log.w("GlanceAppWidget", y38.m24933a(abstractC0659g.getClass()) + " did not call provideContent in providePreview");
                C0282a c0282a = nmb.f52975a;
                this.f5789a = 2;
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetComposerKt$composeForPreview$content$1(AbstractC0659g abstractC0659g, Context context, int i, Continuation continuation) {
        super(2, continuation);
        this.f5786c = abstractC0659g;
        this.f5787d = context;
        this.f5788e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppWidgetComposerKt$composeForPreview$content$1 appWidgetComposerKt$composeForPreview$content$1 = new AppWidgetComposerKt$composeForPreview$content$1(this.f5786c, this.f5787d, this.f5788e, continuation);
        appWidgetComposerKt$composeForPreview$content$1.f5785b = obj;
        return appWidgetComposerKt$composeForPreview$content$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AppWidgetComposerKt$composeForPreview$content$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5784a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f5785b;
        C3229i c3229iM19034d = pb1.m19034d(6, null);
        wfb.m23926u(un1Var, new C0650a(c3229iM19034d), null, new C06421(this.f5786c, this.f5787d, this.f5788e, c3229iM19034d, null), 2);
        this.f5784a = 1;
        Object objM15541t = AbstractC3224d.m15541t(c3229iM19034d, this);
        return objM15541t == coroutineSingletons ? coroutineSingletons : objM15541t;
    }
}
