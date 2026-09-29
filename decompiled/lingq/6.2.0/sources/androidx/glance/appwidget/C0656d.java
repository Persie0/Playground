package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.runtime.AbstractC0278f;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.action.ActionTrampolineActivity;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import androidx.glance.session.AbstractC0696d;
import androidx.glance.state.C0703a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C0785at;
import p000.C0823bt;
import p000.C2896ct;
import p000.C2939dt;
import p000.C2976et;
import p000.C3329mb;
import p000.C3386nv;
import p000.d99;
import p000.f8a;
import p000.foc;
import p000.g99;
import p000.jc9;
import p000.jq2;
import p000.lda;
import p000.nc9;
import p000.rsb;
import p000.s46;
import p000.s66;
import p000.sd4;
import p000.t66;
import p000.v63;
import p000.w58;
import p000.xc9;
import p000.xfa;
import p000.y2d;
import p000.zi7;

/* JADX INFO: renamed from: androidx.glance.appwidget.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C0656d extends AbstractC0696d {

    /* JADX INFO: renamed from: e */
    public final AbstractC0659g f5998e;

    /* JADX INFO: renamed from: f */
    public final C0785at f5999f;

    /* JADX INFO: renamed from: g */
    public final C0703a f6000g;

    /* JADX INFO: renamed from: h */
    public final g99 f6001h;

    /* JADX INFO: renamed from: i */
    public final boolean f6002i;

    /* JADX INFO: renamed from: j */
    public final t66 f6003j;

    /* JADX INFO: renamed from: k */
    public final t66 f6004k;

    /* JADX INFO: renamed from: l */
    public Map f6005l;

    /* JADX INFO: renamed from: m */
    public final sd4 f6006m;

    /* JADX INFO: renamed from: n */
    public final C3244l f6007n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656d(AbstractC0659g abstractC0659g, C0785at c0785at, Bundle bundle) {
        super(y2d.m24910a(c0785at.f7451a));
        C0703a c0703a = C0703a.f6305a;
        abstractC0659g.getClass();
        this.f5998e = abstractC0659g;
        this.f5999f = c0785at;
        this.f6000g = c0703a;
        this.f6001h = d99.f35221a;
        this.f6002i = true;
        int i = c0785at.f7451a;
        if (Integer.MIN_VALUE <= i && i < -1) {
            C3386nv.m17626m("If the AppWidgetSession is not created for a bound widget, you must provide a lambda action receiver");
            throw null;
        }
        s46 s46Var = s46.f60289d;
        this.f6003j = AbstractC0278f.m1259i(null, s46Var);
        this.f6004k = AbstractC0278f.m1259i(bundle, s46Var);
        this.f6005l = AbstractC3194a.m15360M();
        this.f6006m = AbstractC3208a.m15434a();
        this.f6007n = AbstractC3352my.m17114d(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        if (r3.m2255b(r5) == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
    
        if (r3.m2255b(r5) == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        if (r3.m2255b(r5) == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016e, code lost:
    
        if (r3.m2255b(r5) == r6) goto L65;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m2223d(C0656d c0656d, Context context, jq2 jq2Var, ContinuationImpl continuationImpl) throws Throwable {
        AppWidgetSession$processEmittableTree$1 appWidgetSession$processEmittableTree$1;
        C0656d c0656d2;
        jq2 jq2Var2;
        Context context2;
        C0664l c0664l;
        AppWidgetManager appWidgetManager;
        Context context3 = context;
        if (continuationImpl instanceof AppWidgetSession$processEmittableTree$1) {
            appWidgetSession$processEmittableTree$1 = (AppWidgetSession$processEmittableTree$1) continuationImpl;
            int i = appWidgetSession$processEmittableTree$1.f5802f;
            if ((i & Integer.MIN_VALUE) != 0) {
                appWidgetSession$processEmittableTree$1.f5802f = i - Integer.MIN_VALUE;
            } else {
                appWidgetSession$processEmittableTree$1 = new AppWidgetSession$processEmittableTree$1(c0656d, continuationImpl);
            }
        } else {
            appWidgetSession$processEmittableTree$1 = new AppWidgetSession$processEmittableTree$1(c0656d, continuationImpl);
        }
        Object objM2253c = appWidgetSession$processEmittableTree$1.f5800d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appWidgetSession$processEmittableTree$1.f5802f;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM2253c);
                if (AbstractC0658f.m2230c(jq2Var)) {
                    return Boolean.FALSE;
                }
                jq2Var.getClass();
                int i3 = c0656d.f5999f.f7451a;
                appWidgetSession$processEmittableTree$1.f5797a = c0656d;
                appWidgetSession$processEmittableTree$1.f5798b = context3;
                appWidgetSession$processEmittableTree$1.f5799c = jq2Var;
                appWidgetSession$processEmittableTree$1.f5802f = 1;
                objM2253c = C0664l.f6023g.m2253c(context3, i3, appWidgetSession$processEmittableTree$1);
                if (objM2253c != coroutineSingletons) {
                    c0656d2 = c0656d;
                    jq2Var2 = jq2Var;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    AbstractC3193b.m15359b(objM2253c);
                    f8a.m11600b();
                    return Boolean.TRUE;
                }
                if (i2 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) appWidgetSession$processEmittableTree$1.f5797a;
                AbstractC3193b.m15359b(objM2253c);
                f8a.m11600b();
                throw th;
            }
            jq2Var2 = appWidgetSession$processEmittableTree$1.f5799c;
            context3 = appWidgetSession$processEmittableTree$1.f5798b;
            c0656d2 = (C0656d) appWidgetSession$processEmittableTree$1.f5797a;
            AbstractC3193b.m15359b(objM2253c);
            c0656d2.getClass();
            C0785at c0785at = c0656d2.f5999f;
            AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c0785at.f7451a);
            if (appWidgetInfo == null) {
                throw new IllegalArgumentException(("No app widget info for " + c0785at.f7451a).toString());
            }
            ComponentName componentName = appWidgetInfo.provider;
            rsb.m20770b((w58) jq2Var2, false);
            c0656d2.f6005l = rsb.m20773e(jq2Var2);
            int i4 = c0785at.f7451a;
            w58 w58Var = (w58) jq2Var2;
            int iM2254a = c0664l.m2254a(jq2Var2);
            c0656d2.f5998e.getClass();
            try {
                RemoteViews remoteViewsM11975g = foc.m11975g(context2, i4, w58Var, c0664l, iM2254a, componentName, new C3329mb(new ComponentName(context2, (Class<?>) ActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) InvisibleActionTrampolineActivity.class), new ComponentName(context2, (Class<?>) ActionCallbackBroadcastReceiver.class), new ComponentName(context2, (Class<?>) GlanceRemoteViewsService.class), 6));
                if (c0656d2.f6002i) {
                    appWidgetManager.updateAppWidget(c0785at.f7451a, remoteViewsM11975g);
                }
                c0656d2.f6007n.m15571i(remoteViewsM11975g);
                appWidgetSession$processEmittableTree$1.f5797a = null;
                appWidgetSession$processEmittableTree$1.f5798b = null;
                appWidgetSession$processEmittableTree$1.f5799c = null;
                appWidgetSession$processEmittableTree$1.f5802f = 2;
            } catch (CancellationException unused) {
                c0664l = c0664l;
                appWidgetSession$processEmittableTree$1.f5797a = null;
                appWidgetSession$processEmittableTree$1.f5798b = null;
                appWidgetSession$processEmittableTree$1.f5799c = null;
                appWidgetSession$processEmittableTree$1.f5802f = 3;
            } catch (Throwable th) {
                th = th;
                c0664l = c0664l;
                try {
                    c0656d2.m2226c(context2, th);
                    appWidgetSession$processEmittableTree$1.f5797a = null;
                    appWidgetSession$processEmittableTree$1.f5798b = null;
                    appWidgetSession$processEmittableTree$1.f5799c = null;
                    appWidgetSession$processEmittableTree$1.f5802f = 4;
                } catch (Throwable th2) {
                    th = th2;
                    appWidgetSession$processEmittableTree$1.f5797a = th;
                    appWidgetSession$processEmittableTree$1.f5798b = null;
                    appWidgetSession$processEmittableTree$1.f5799c = null;
                    appWidgetSession$processEmittableTree$1.f5802f = 5;
                }
            }
        } catch (CancellationException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
        context2 = context3;
        c0664l = (C0664l) objM2253c;
        Object systemService = context2.getSystemService("appwidget");
        systemService.getClass();
        appWidgetManager = (AppWidgetManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static Object m2224e(C0656d c0656d, Context context, Object obj, ContinuationImpl continuationImpl) throws Throwable {
        AppWidgetSession$processEvent$1 appWidgetSession$processEvent$1;
        s66 s66VarMo3579C;
        s66 s66VarMo3579C2;
        s66 s66VarMo3579C3;
        if (continuationImpl instanceof AppWidgetSession$processEvent$1) {
            appWidgetSession$processEvent$1 = (AppWidgetSession$processEvent$1) continuationImpl;
            int i = appWidgetSession$processEvent$1.f5806d;
            if ((i & Integer.MIN_VALUE) != 0) {
                appWidgetSession$processEvent$1.f5806d = i - Integer.MIN_VALUE;
            } else {
                appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(c0656d, continuationImpl);
            }
        } else {
            appWidgetSession$processEvent$1 = new AppWidgetSession$processEvent$1(c0656d, continuationImpl);
        }
        Object objM2504c = appWidgetSession$processEvent$1.f5804b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appWidgetSession$processEvent$1.f5806d;
        xfa xfaVar = xfa.f68157a;
        xfa xfaVar2 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2504c);
            if (!(obj instanceof C2939dt)) {
                if (obj instanceof C2896ct) {
                    jc9 jc9VarM17358j = nc9.m17358j();
                    s66 s66Var = jc9VarM17358j instanceof s66 ? (s66) jc9VarM17358j : null;
                    if (s66Var == null || (s66VarMo3579C2 = s66Var.mo3579C(null, null)) == null) {
                        C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
                        return null;
                    }
                    try {
                        jc9 jc9VarM14393j = s66VarMo3579C2.m14393j();
                        try {
                            ((xc9) c0656d.f6004k).setValue(((C2896ct) obj).f34501a);
                            jc9.m14390q(jc9VarM14393j);
                            s66VarMo3579C2.mo3587w().mo3989l();
                            s66VarMo3579C2.mo3162c();
                            return xfaVar;
                        } catch (Throwable th) {
                            jc9.m14390q(jc9VarM14393j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        s66VarMo3579C2.mo3162c();
                        throw th2;
                    }
                }
                if (obj instanceof C0823bt) {
                    jc9 jc9VarM17358j2 = nc9.m17358j();
                    s66 s66Var2 = jc9VarM17358j2 instanceof s66 ? (s66) jc9VarM17358j2 : null;
                    if (s66Var2 == null || (s66VarMo3579C = s66Var2.mo3579C(null, null)) == null) {
                        C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
                        return null;
                    }
                    try {
                        jc9 jc9VarM14393j2 = s66VarMo3579C.m14393j();
                        try {
                            List list = (List) c0656d.f6005l.get(((C0823bt) obj).f8960a);
                            if (list != null) {
                                Iterator it = list.iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                                xfaVar2 = xfaVar;
                            }
                            jc9.m14390q(jc9VarM14393j2);
                            s66VarMo3579C.mo3587w().mo3989l();
                            s66VarMo3579C.mo3162c();
                            if (xfaVar2 == null) {
                                lda.m16121g(Log.w("AppWidgetSession", "Triggering Action(" + ((C0823bt) obj).f8960a + ") for session(" + c0656d.f6261a + ") failed"));
                                return xfaVar;
                            }
                        } catch (Throwable th3) {
                            jc9.m14390q(jc9VarM14393j2);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        s66VarMo3579C.mo3162c();
                        throw th4;
                    }
                } else {
                    if (!(obj instanceof C2976et)) {
                        v63.m23144v("Sent unrecognized event type ", obj.getClass(), " to AppWidgetSession");
                        return null;
                    }
                    sd4 sd4Var = ((C2976et) obj).f37786a;
                    if (sd4Var.mo4538b()) {
                        sd4Var.m15505Y(xfaVar);
                    }
                }
                return xfaVar;
            }
            c0656d.f5998e.getClass();
            C0703a c0703a = c0656d.f6000g;
            String str = c0656d.f6261a;
            appWidgetSession$processEvent$1.f5803a = c0656d;
            appWidgetSession$processEvent$1.f5806d = 1;
            objM2504c = c0703a.m2504c(context, zi7.f71615a, str, appWidgetSession$processEvent$1);
            if (objM2504c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0656d = appWidgetSession$processEvent$1.f5803a;
            AbstractC3193b.m15359b(objM2504c);
        }
        jc9 jc9VarM17358j3 = nc9.m17358j();
        s66 s66Var3 = jc9VarM17358j3 instanceof s66 ? (s66) jc9VarM17358j3 : null;
        if (s66Var3 == null || (s66VarMo3579C3 = s66Var3.mo3579C(null, null)) == null) {
            C3386nv.m17633t("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            jc9 jc9VarM14393j3 = s66VarMo3579C3.m14393j();
            try {
                ((xc9) c0656d.f6003j).setValue(objM2504c);
                jc9.m14390q(jc9VarM14393j3);
                s66VarMo3579C3.mo3587w().mo3989l();
                s66VarMo3579C3.mo3162c();
                return xfaVar;
            } catch (Throwable th5) {
                jc9.m14390q(jc9VarM14393j3);
                throw th5;
            }
        } catch (Throwable th6) {
            s66VarMo3579C3.mo3162c();
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ab -> B:34:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static java.lang.Object m2225f(androidx.glance.appwidget.C0656d r7, java.util.ArrayList r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.glance.appwidget.AppWidgetSession$recreateWithEvents$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.glance.appwidget.AppWidgetSession$recreateWithEvents$1 r0 = (androidx.glance.appwidget.AppWidgetSession$recreateWithEvents$1) r0
            int r1 = r0.f5819h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5819h = r1
            goto L18
        L13:
            androidx.glance.appwidget.AppWidgetSession$recreateWithEvents$1 r0 = new androidx.glance.appwidget.AppWidgetSession$recreateWithEvents$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f5817f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f5819h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L35
            int r7 = r0.f5816e
            int r8 = r0.f5815d
            java.util.List r2 = r0.f5814c
            java.util.List r2 = (java.util.List) r2
            androidx.glance.appwidget.d r3 = r0.f5813b
            androidx.glance.appwidget.d r5 = r0.f5812a
            kotlin.AbstractC3193b.m15359b(r9)
            goto Lae
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            return r3
        L3b:
            kotlin.AbstractC3193b.m15359b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r8.iterator()
        L47:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r2.next()
            boolean r6 = r5 instanceof p000.C0823bt
            if (r6 == 0) goto L47
            r9.add(r5)
            goto L47
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L62:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r8.next()
            boolean r6 = r5 instanceof p000.C2896ct
            if (r6 == 0) goto L62
            r2.add(r5)
            goto L62
        L74:
            java.lang.Object r8 = p000.u91.m22598P0(r2)
            ct r8 = (p000.C2896ct) r8
            if (r8 == 0) goto L7e
            android.os.Bundle r3 = r8.f34501a
        L7e:
            androidx.glance.appwidget.d r8 = new androidx.glance.appwidget.d
            androidx.glance.appwidget.g r2 = r7.f5998e
            at r7 = r7.f5999f
            r8.<init>(r2, r7, r3)
            int r7 = r9.size()
            r2 = 0
            r3 = r8
            r5 = r3
            r8 = r2
            r2 = r9
        L90:
            if (r8 >= r7) goto Lb0
            java.lang.Object r9 = r2.get(r8)
            bt r9 = (p000.C0823bt) r9
            r0.f5812a = r5
            r0.f5813b = r3
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.f5814c = r6
            r0.f5815d = r8
            r0.f5816e = r7
            r0.f5819h = r4
            java.lang.Object r9 = r3.m2493b(r9, r0)
            if (r9 != r1) goto Lae
            return r1
        Lae:
            int r8 = r8 + r4
            goto L90
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.C0656d.m2225f(androidx.glance.appwidget.d, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m2226c(Context context, Throwable th) throws Throwable {
        y2d.m24916g(th);
        if (!this.f6002i) {
            throw th;
        }
        int i = this.f5999f.f7451a;
        int i2 = this.f5998e.f6010a;
        if (i2 == 0) {
            throw th;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(i, new RemoteViews(context.getPackageName(), i2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m2227g(ContinuationImpl continuationImpl) {
        AppWidgetSession$waitForReady$1 appWidgetSession$waitForReady$1;
        C2976et c2976et;
        if (continuationImpl instanceof AppWidgetSession$waitForReady$1) {
            appWidgetSession$waitForReady$1 = (AppWidgetSession$waitForReady$1) continuationImpl;
            int i = appWidgetSession$waitForReady$1.f5823d;
            if ((i & Integer.MIN_VALUE) != 0) {
                appWidgetSession$waitForReady$1.f5823d = i - Integer.MIN_VALUE;
            } else {
                appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, continuationImpl);
            }
        } else {
            appWidgetSession$waitForReady$1 = new AppWidgetSession$waitForReady$1(this, continuationImpl);
        }
        Object obj = appWidgetSession$waitForReady$1.f5821b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appWidgetSession$waitForReady$1.f5823d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            C2976et c2976et2 = new C2976et(new sd4(this.f6006m));
            appWidgetSession$waitForReady$1.f5820a = c2976et2;
            appWidgetSession$waitForReady$1.f5823d = 1;
            if (m2493b(c2976et2, appWidgetSession$waitForReady$1) == obj2) {
                return obj2;
            }
            c2976et = c2976et2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2976et = appWidgetSession$waitForReady$1.f5820a;
            AbstractC3193b.m15359b(obj);
        }
        return c2976et.f37786a;
    }
}
