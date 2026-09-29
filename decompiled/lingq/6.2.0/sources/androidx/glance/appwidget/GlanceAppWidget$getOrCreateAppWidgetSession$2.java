package androidx.glance.appwidget;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.session.AbstractC0696d;
import androidx.glance.session.C0697e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.xfa;
import p000.y2d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.appwidget.GlanceAppWidget$getOrCreateAppWidgetSession$2", m4291f = "GlanceAppWidget.kt", m4292l = {238, 240, 243}, m4293m = "invokeSuspend", m4294v = 1)
final class GlanceAppWidget$getOrCreateAppWidgetSession$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public boolean f5858a;

    /* JADX INFO: renamed from: b */
    public int f5859b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f5860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f5861d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0785at f5862e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0659g f5863f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f5864g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ bj3 f5865h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceAppWidget$getOrCreateAppWidgetSession$2(Context context, C0785at c0785at, AbstractC0659g abstractC0659g, Bundle bundle, bj3 bj3Var, Continuation continuation) {
        super(2, continuation);
        this.f5861d = context;
        this.f5862e = c0785at;
        this.f5863f = abstractC0659g;
        this.f5864g = bundle;
        this.f5865h = bj3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GlanceAppWidget$getOrCreateAppWidgetSession$2 glanceAppWidget$getOrCreateAppWidgetSession$2 = new GlanceAppWidget$getOrCreateAppWidgetSession$2(this.f5861d, this.f5862e, this.f5863f, this.f5864g, this.f5865h, continuation);
        glanceAppWidget$getOrCreateAppWidgetSession$2.f5860c = obj;
        return glanceAppWidget$getOrCreateAppWidgetSession$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlanceAppWidget$getOrCreateAppWidgetSession$2) create((C0697e) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0697e c0697e;
        boolean zBooleanValue;
        C0697e c0697e2;
        boolean z;
        Object objMo825e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5859b;
        C0785at c0785at = this.f5862e;
        Context context = this.f5861d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0697e c0697e3 = (C0697e) this.f5860c;
            String strM24910a = y2d.m24910a(c0785at.f7451a);
            this.f5860c = c0697e3;
            this.f5859b = 1;
            Object objM2494a = c0697e3.m2494a(context, strM24910a, this);
            if (objM2494a != coroutineSingletons) {
                c0697e = c0697e3;
                obj = objM2494a;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            c0697e = (C0697e) this.f5860c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.f5858a;
            c0697e2 = (C0697e) this.f5860c;
            AbstractC3193b.m15359b(obj);
        }
        zBooleanValue = z;
        c0697e = c0697e2;
        AbstractC0696d abstractC0696d = (AbstractC0696d) c0697e.f6265a.get(y2d.m24910a(c0785at.f7451a));
        abstractC0696d.getClass();
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        this.f5860c = null;
        this.f5859b = 3;
        objMo825e = this.f5865h.mo825e(c0697e, (C0656d) abstractC0696d, boolValueOf, this);
        if (objMo825e == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objMo825e;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            AbstractC0696d abstractC0696d2 = (AbstractC0696d) c0697e.f6265a.get(y2d.m24910a(c0785at.f7451a));
            abstractC0696d2.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            this.f5860c = null;
            this.f5859b = 3;
            objMo825e = this.f5865h.mo825e(c0697e, (C0656d) abstractC0696d2, boolValueOf2, this);
            if (objMo825e == coroutineSingletons) {
                return objMo825e;
            }
        } else {
            C0656d c0656d = new C0656d(this.f5863f, c0785at, this.f5864g);
            this.f5860c = c0697e;
            this.f5858a = zBooleanValue;
            this.f5859b = 2;
            if (c0697e.m2496c(context, c0656d, this) != coroutineSingletons) {
                c0697e2 = c0697e;
                z = zBooleanValue;
                zBooleanValue = z;
                c0697e = c0697e2;
                AbstractC0696d abstractC0696d3 = (AbstractC0696d) c0697e.f6265a.get(y2d.m24910a(c0785at.f7451a));
                abstractC0696d3.getClass();
                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                this.f5860c = null;
                this.f5859b = 3;
                objMo825e = this.f5865h.mo825e(c0697e, (C0656d) abstractC0696d3, boolValueOf3, this);
                if (objMo825e == coroutineSingletons) {
                    return objMo825e;
                }
            }
        }
        return coroutineSingletons;
    }
}
