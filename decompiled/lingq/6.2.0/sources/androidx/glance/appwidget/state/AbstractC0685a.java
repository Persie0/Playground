package androidx.glance.appwidget.state;

import android.content.Context;
import androidx.glance.state.C0703a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C0785at;
import p000.C3386nv;
import p000.ln3;
import p000.xfa;
import p000.y2d;
import p000.zi3;
import p000.zi7;

/* JADX INFO: renamed from: androidx.glance.appwidget.state.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0685a {
    /* JADX INFO: renamed from: a */
    public static final Object m2484a(Context context, ln3 ln3Var, zi3 zi3Var, Continuation continuation) {
        GlanceAppWidgetStateKt$updateAppWidgetState$4 glanceAppWidgetStateKt$updateAppWidgetState$4 = new GlanceAppWidgetStateKt$updateAppWidgetState$4(zi3Var, null);
        if (ln3Var instanceof C0785at) {
            Object objM2505d = C0703a.f6305a.m2505d(context, zi7.f71615a, y2d.m24910a(((C0785at) ln3Var).f7451a), glanceAppWidgetStateKt$updateAppWidgetState$4, (ContinuationImpl) continuation);
            return objM2505d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2505d : xfa.f68157a;
        }
        C3386nv.m17626m("The glance ID is not the one of an App Widget");
        return null;
    }
}
