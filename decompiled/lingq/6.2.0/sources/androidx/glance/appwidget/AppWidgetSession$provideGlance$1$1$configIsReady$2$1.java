package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.glance.state.C0703a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.bk2;
import p000.c32;
import p000.jc9;
import p000.jl7;
import p000.nc9;
import p000.s66;
import p000.t66;
import p000.xc9;
import p000.xfa;
import p000.y2d;
import p000.zi3;
import p000.zi7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.AppWidgetSession$provideGlance$1$1$configIsReady$2$1", m4291f = "AppWidgetSession.kt", m4292l = {128}, m4293m = "invokeSuspend", m4294v = 1)
final class AppWidgetSession$provideGlance$1$1$configIsReady$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5807a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0656d f5809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f5811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetSession$provideGlance$1$1$configIsReady$2$1(C0656d c0656d, Context context, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f5809c = c0656d;
        this.f5810d = context;
        this.f5811e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppWidgetSession$provideGlance$1$1$configIsReady$2$1 appWidgetSession$provideGlance$1$1$configIsReady$2$1 = new AppWidgetSession$provideGlance$1$1$configIsReady$2$1(this.f5809c, this.f5810d, this.f5811e, continuation);
        appWidgetSession$provideGlance$1$1$configIsReady$2$1.f5808b = obj;
        return appWidgetSession$provideGlance$1$1$configIsReady$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AppWidgetSession$provideGlance$1$1$configIsReady$2$1) create((jl7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jl7 jl7Var;
        s66 s66VarMo3579C;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5807a;
        Context context = this.f5810d;
        C0656d c0656d = this.f5809c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jl7 jl7Var2 = (jl7) this.f5808b;
            if (((xc9) c0656d.f6003j).getValue() == null) {
                c0656d.f5998e.getClass();
                C0703a c0703a = c0656d.f6000g;
                String str = c0656d.f6261a;
                this.f5808b = jl7Var2;
                this.f5807a = 1;
                Object objM2504c = c0703a.m2504c(context, zi7.f71615a, str, this);
                if (objM2504c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jl7Var = jl7Var2;
                obj = objM2504c;
            } else {
                jl7Var = jl7Var2;
                obj = null;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jl7Var = (jl7) this.f5808b;
            AbstractC3193b.m15359b(obj);
        }
        t66 t66Var = this.f5811e;
        jc9 jc9VarM17358j = nc9.m17358j();
        s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
        if (s66Var == null || (s66VarMo3579C = s66Var.mo3579C(null, null)) == null) {
            C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            jc9 jc9VarM14393j = s66VarMo3579C.m14393j();
            try {
                C0785at c0785at = c0656d.f5999f;
                t66 t66Var2 = c0656d.f6004k;
                if (y2d.m24915f(c0785at)) {
                    Object systemService = context.getSystemService("appwidget");
                    systemService.getClass();
                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c0785at.f7451a);
                    t66Var.setValue(new bk2(appWidgetInfo == null ? 0L : y2d.m24914e(appWidgetInfo, displayMetrics)));
                    if (((Bundle) ((xc9) t66Var2).getValue()) == null) {
                        ((xc9) t66Var2).setValue(appWidgetManager.getAppWidgetOptions(c0785at.f7451a));
                    }
                }
                if (obj != null) {
                    ((xc9) c0656d.f6003j).setValue(obj);
                }
                jl7Var.setValue(Boolean.TRUE);
                jc9.m14390q(jc9VarM14393j);
                s66VarMo3579C.mo3587w().mo3989l();
                s66VarMo3579C.mo3162c();
                return xfa.f68157a;
            } catch (Throwable th) {
                jc9.m14390q(jc9VarM14393j);
                throw th;
            }
        } catch (Throwable th2) {
            s66VarMo3579C.mo3162c();
            throw th2;
        }
    }
}
