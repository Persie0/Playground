package androidx.glance.appwidget;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.widget.C2863a;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3472pt;
import p000.foc;
import p000.gl1;
import p000.ln3;
import p000.pf1;
import p000.rsb;
import p000.si0;
import p000.tr3;
import p000.vz1;
import p000.w58;
import p000.wfb;
import p000.xfa;
import p000.y2d;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.appwidget.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0652b {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m2216a(AbstractC0659g abstractC0659g, Context context, int i, AppWidgetProviderInfo appWidgetProviderInfo, ContinuationImpl continuationImpl) throws Throwable {
        AppWidgetComposerKt$composeForPreview$1 appWidgetComposerKt$composeForPreview$1;
        final AbstractC0659g abstractC0659g2;
        final Context context2;
        AppWidgetProviderInfo appWidgetProviderInfo2;
        w58 w58Var;
        Context context3;
        if (continuationImpl instanceof AppWidgetComposerKt$composeForPreview$1) {
            appWidgetComposerKt$composeForPreview$1 = (AppWidgetComposerKt$composeForPreview$1) continuationImpl;
            int i2 = appWidgetComposerKt$composeForPreview$1.f5778e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appWidgetComposerKt$composeForPreview$1.f5778e = i2 - Integer.MIN_VALUE;
            } else {
                appWidgetComposerKt$composeForPreview$1 = new AppWidgetComposerKt$composeForPreview$1(continuationImpl);
            }
        } else {
            appWidgetComposerKt$composeForPreview$1 = new AppWidgetComposerKt$composeForPreview$1(continuationImpl);
        }
        Object objM23649s = appWidgetComposerKt$composeForPreview$1.f5777d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = appWidgetComposerKt$composeForPreview$1.f5778e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM23649s);
            AppWidgetComposerKt$composeForPreview$content$1 appWidgetComposerKt$composeForPreview$content$1 = new AppWidgetComposerKt$composeForPreview$content$1(abstractC0659g, context, i, null);
            appWidgetComposerKt$composeForPreview$1.f5774a = abstractC0659g;
            appWidgetComposerKt$composeForPreview$1.f5775b = context;
            appWidgetComposerKt$composeForPreview$1.f5776c = appWidgetProviderInfo;
            appWidgetComposerKt$composeForPreview$1.f5778e = 1;
            objM23649s = vz1.m23649s(appWidgetComposerKt$composeForPreview$content$1, appWidgetComposerKt$composeForPreview$1);
            if (objM23649s != coroutineSingletons) {
                abstractC0659g2 = abstractC0659g;
                context2 = context;
                appWidgetProviderInfo2 = appWidgetProviderInfo;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            appWidgetProviderInfo2 = appWidgetComposerKt$composeForPreview$1.f5776c;
            Context context4 = (Context) appWidgetComposerKt$composeForPreview$1.f5775b;
            AbstractC0659g abstractC0659g3 = (AbstractC0659g) appWidgetComposerKt$composeForPreview$1.f5774a;
            AbstractC3193b.m15359b(objM23649s);
            context2 = context4;
            abstractC0659g2 = abstractC0659g3;
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w58Var = (w58) appWidgetComposerKt$composeForPreview$1.f5775b;
            context3 = (Context) appWidgetComposerKt$composeForPreview$1.f5774a;
            AbstractC3193b.m15359b(objM23649s);
        }
        rsb.m20770b(w58Var, true);
        C0664l c0664lM2251a = C0663k.m2251a(context3);
        return foc.m11976h(context3, w58Var, c0664lM2251a, c0664lM2251a.m2254a(w58Var));
        final zi3 zi3Var = (zi3) objM23649s;
        final long jM24914e = appWidgetProviderInfo2 != null ? y2d.m24914e(appWidgetProviderInfo2, context2.getResources().getDisplayMetrics()) : 0L;
        w58Var = new w58(50);
        C3472pt c3472pt = new C3472pt(w58Var);
        C0281i c0281i = new C0281i(appWidgetComposerKt$composeForPreview$1.getContext());
        new pf1(c0281i, c3472pt).m19085A(new C0282a(265674463, true, new zi3() { // from class: zs
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                ye1 ye1Var = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (tj3Var.m22086D()) {
                        tj3Var.m22102U();
                    } else {
                        pvc.m19507c(yf1.f69763b.mo1265a(context2), ci8.m4703P(-1363737697, new C3536rh(abstractC0659g2, jM24914e, zi3Var), ye1Var), ye1Var, 56);
                    }
                } else {
                    pvc.m19507c(yf1.f69763b.mo1265a(context2), ci8.m4703P(-1363737697, new C3536rh(abstractC0659g2, jM24914e, zi3Var), ye1Var), ye1Var, 56);
                }
                return xfa.f68157a;
            }
        }));
        si0 si0Var = new si0(null);
        AppWidgetComposerKt$composeForPreview$3 appWidgetComposerKt$composeForPreview$3 = new AppWidgetComposerKt$composeForPreview$3(c0281i, null);
        appWidgetComposerKt$composeForPreview$1.f5774a = context2;
        appWidgetComposerKt$composeForPreview$1.f5775b = w58Var;
        appWidgetComposerKt$composeForPreview$1.f5776c = null;
        appWidgetComposerKt$composeForPreview$1.f5778e = 2;
        if (wfb.m23905G(appWidgetComposerKt$composeForPreview$3, si0Var, appWidgetComposerKt$composeForPreview$1) != coroutineSingletons) {
            context3 = context2;
            rsb.m20770b(w58Var, true);
            C0664l c0664lM2251a2 = C0663k.m2251a(context3);
            return foc.m11976h(context3, w58Var, c0664lM2251a2, c0664lM2251a2.m2254a(w58Var));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final CoroutineSingletons m2217b(C0282a c0282a, ContinuationImpl continuationImpl) throws Throwable {
        GlanceAppWidgetKt$provideContent$1 glanceAppWidgetKt$provideContent$1;
        if (continuationImpl instanceof GlanceAppWidgetKt$provideContent$1) {
            glanceAppWidgetKt$provideContent$1 = (GlanceAppWidgetKt$provideContent$1) continuationImpl;
            int i = glanceAppWidgetKt$provideContent$1.f5876b;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetKt$provideContent$1.f5876b = i - Integer.MIN_VALUE;
            } else {
                glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(continuationImpl);
            }
        } else {
            glanceAppWidgetKt$provideContent$1 = new GlanceAppWidgetKt$provideContent$1(continuationImpl);
        }
        Object obj = glanceAppWidgetKt$provideContent$1.f5875a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceAppWidgetKt$provideContent$1.f5876b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            gl1 gl1Var = (gl1) glanceAppWidgetKt$provideContent$1.getContext().get(tr3.f62756b);
            if (gl1Var == null) {
                C3386nv.m17633t("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
                return null;
            }
            glanceAppWidgetKt$provideContent$1.f5876b = 1;
            if (gl1Var.mo2215J(c0282a, glanceAppWidgetKt$provideContent$1) == coroutineSingletons) {
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

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0060->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2218c(C2863a c2863a, Context context, ContinuationImpl continuationImpl) throws Throwable {
        GlanceAppWidgetKt$updateAll$1 glanceAppWidgetKt$updateAll$1;
        AbstractC0659g abstractC0659g;
        AbstractC0659g abstractC0659g2;
        Iterator it;
        ln3 ln3Var;
        if (continuationImpl instanceof GlanceAppWidgetKt$updateAll$1) {
            glanceAppWidgetKt$updateAll$1 = (GlanceAppWidgetKt$updateAll$1) continuationImpl;
            int i = glanceAppWidgetKt$updateAll$1.f5881e;
            if ((i & Integer.MIN_VALUE) != 0) {
                glanceAppWidgetKt$updateAll$1.f5881e = i - Integer.MIN_VALUE;
            } else {
                glanceAppWidgetKt$updateAll$1 = new GlanceAppWidgetKt$updateAll$1(continuationImpl);
            }
        } else {
            glanceAppWidgetKt$updateAll$1 = new GlanceAppWidgetKt$updateAll$1(continuationImpl);
        }
        Object objM2239b = glanceAppWidgetKt$updateAll$1.f5880d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = glanceAppWidgetKt$updateAll$1.f5881e;
        if (i2 != 0) {
            if (i2 == 1) {
                context = glanceAppWidgetKt$updateAll$1.f5878b;
                AbstractC0659g abstractC0659g3 = glanceAppWidgetKt$updateAll$1.f5877a;
                AbstractC3193b.m15359b(objM2239b);
                abstractC0659g = abstractC0659g3;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = glanceAppWidgetKt$updateAll$1.f5879c;
                context = glanceAppWidgetKt$updateAll$1.f5878b;
                AbstractC0659g abstractC0659g4 = glanceAppWidgetKt$updateAll$1.f5877a;
                AbstractC3193b.m15359b(objM2239b);
                abstractC0659g2 = abstractC0659g4;
            }
            while (it.hasNext()) {
                ln3Var = (ln3) it.next();
                glanceAppWidgetKt$updateAll$1.f5877a = abstractC0659g2;
                glanceAppWidgetKt$updateAll$1.f5878b = context;
                glanceAppWidgetKt$updateAll$1.f5879c = it;
                glanceAppWidgetKt$updateAll$1.f5881e = 2;
                if (abstractC0659g2.m2237f(context, ln3Var, glanceAppWidgetKt$updateAll$1) == obj) {
                    abstractC0659g = c2863a;
                    return obj;
                }
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2239b);
        C0660h c0660h = new C0660h(context);
        Class<?> cls = c2863a.getClass();
        glanceAppWidgetKt$updateAll$1.f5877a = c2863a;
        glanceAppWidgetKt$updateAll$1.f5878b = context;
        glanceAppWidgetKt$updateAll$1.f5881e = 1;
        objM2239b = c0660h.m2239b(cls, glanceAppWidgetKt$updateAll$1);
        abstractC0659g = c2863a;
        abstractC0659g2 = abstractC0659g;
        it = ((Iterable) objM2239b).iterator();
        while (it.hasNext()) {
            ln3Var = (ln3) it.next();
            glanceAppWidgetKt$updateAll$1.f5877a = abstractC0659g2;
            glanceAppWidgetKt$updateAll$1.f5878b = context;
            glanceAppWidgetKt$updateAll$1.f5879c = it;
            glanceAppWidgetKt$updateAll$1.f5881e = 2;
            if (abstractC0659g2.m2237f(context, ln3Var, glanceAppWidgetKt$updateAll$1) == obj) {
                abstractC0659g = c2863a;
                return obj;
            }
        }
        return xfa.f68157a;
    }
}
