package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.ek2;
import p000.h4d;
import p000.jn3;
import p000.kn3;
import p000.ped;
import p000.ph2;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.y2d;

/* JADX INFO: renamed from: androidx.glance.appwidget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0661i extends AppWidgetProvider {
    public static final kn3 Companion = new kn3();

    /* JADX INFO: renamed from: a */
    public final v72 f6018a = ph2.f56212a;

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005a -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m2243a(p000.un1 r7, android.content.Context r8, int[] r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.glance.appwidget.GlanceAppWidgetReceiver$doDelete$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.appwidget.GlanceAppWidgetReceiver$doDelete$1 r0 = (androidx.glance.appwidget.GlanceAppWidgetReceiver$doDelete$1) r0
            int r1 = r0.f5917g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5917g = r1
            goto L18
        L13:
            androidx.glance.appwidget.GlanceAppWidgetReceiver$doDelete$1 r0 = new androidx.glance.appwidget.GlanceAppWidgetReceiver$doDelete$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f5915e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f5917g
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r7 = r0.f5914d
            int r8 = r0.f5913c
            int[] r9 = r0.f5912b
            android.content.Context r2 = r0.f5911a
            kotlin.AbstractC3193b.m15359b(r10)
            r10 = r9
            r9 = r2
            goto L5d
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r6)
            r6 = 0
            return r6
        L38:
            kotlin.AbstractC3193b.m15359b(r10)
            r6.m2248f(r7, r8)
            int r7 = r9.length
            r10 = 0
            r5 = r9
            r9 = r8
            r8 = r10
            r10 = r5
        L44:
            if (r8 >= r7) goto L5f
            r2 = r10[r8]
            androidx.glance.appwidget.g r4 = r6.mo2247e()
            r0.f5911a = r9
            r0.f5912b = r10
            r0.f5913c = r8
            r0.f5914d = r7
            r0.f5917g = r3
            java.lang.Object r2 = r4.m2232a(r9, r2, r0)
            if (r2 != r1) goto L5d
            return r1
        L5d:
            int r8 = r8 + r3
            goto L44
        L5f:
            xfa r6 = p000.xfa.f68157a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.AbstractC0661i.m2243a(un1, android.content.Context, int[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final Object m2244b(un1 un1Var, Context context, int i, String str, SuspendLambda suspendLambda) {
        m2248f(un1Var, context);
        AbstractC0659g abstractC0659gMo2247e = mo2247e();
        abstractC0659gMo2247e.getClass();
        Object objM2233b = abstractC0659gMo2247e.m2233b(context, new C0785at(i), null, new GlanceAppWidget$triggerAction$2(str, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        xfa xfaVar = xfa.f68157a;
        if (objM2233b != coroutineSingletons) {
            objM2233b = xfaVar;
        }
        return objM2233b == coroutineSingletons ? objM2233b : xfaVar;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2245c(un1 un1Var, Context context, int i, Bundle bundle, SuspendLambda suspendLambda) {
        m2248f(un1Var, context);
        AbstractC0659g abstractC0659gMo2247e = mo2247e();
        abstractC0659gMo2247e.getClass();
        xfa xfaVar = xfa.f68157a;
        Object objM2233b = abstractC0659gMo2247e.m2233b(context, new C0785at(i), bundle, new GlanceAppWidget$resize$2(bundle, null), suspendLambda);
        if (objM2233b != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2233b = xfaVar;
        }
        return objM2233b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2233b : xfaVar;
    }

    /* JADX INFO: renamed from: d */
    public final Object m2246d(un1 un1Var, Context context, int[] iArr, SuspendLambda suspendLambda) {
        m2248f(un1Var, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(wfb.m23910e(un1Var, null, new GlanceAppWidgetReceiver$doUpdate$2$1(this, context, i, null), 3));
        }
        Object objM13055d = h4d.m13055d(arrayList, suspendLambda);
        return objM13055d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM13055d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0659g mo2247e();

    /* JADX INFO: renamed from: f */
    public final void m2248f(un1 un1Var, Context context) {
        wfb.m23926u(un1Var, null, null, new GlanceAppWidgetReceiver$updateManager$1(context, this, null), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        if (ped.m19084b(new ek2(this, i, bundle, 2), context)) {
            return;
        }
        AbstractC0658f.m2229b(this, this.f6018a, new GlanceAppWidgetReceiver$onAppWidgetOptionsChanged$1(this, context, i, bundle, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        if (ped.m19084b(new jn3(this, iArr, 0), context)) {
            return;
        }
        AbstractC0658f.m2229b(this, this.f6018a, new GlanceAppWidgetReceiver$onDeleted$1(this, context, iArr, null));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x00b2, CancellationException -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b7, all -> 0x00b2, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0053, B:24:0x005a, B:25:0x005b, B:26:0x0062, B:27:0x0063, B:43:0x00ae, B:33:0x0079, B:35:0x008b, B:37:0x0096, B:39:0x00a2, B:38:0x009e, B:41:0x00a6, B:42:0x00ad, B:30:0x006e), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[Catch: all -> 0x00b2, CancellationException -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b7, all -> 0x00b2, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0053, B:24:0x005a, B:25:0x005b, B:26:0x0062, B:27:0x0063, B:43:0x00ae, B:33:0x0079, B:35:0x008b, B:37:0x0096, B:39:0x00a2, B:38:0x009e, B:41:0x00a6, B:42:0x00ad, B:30:0x006e), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009e A[Catch: all -> 0x00b2, CancellationException -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b7, all -> 0x00b2, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0053, B:24:0x005a, B:25:0x005b, B:26:0x0062, B:27:0x0063, B:43:0x00ae, B:33:0x0079, B:35:0x008b, B:37:0x0096, B:39:0x00a2, B:38:0x009e, B:41:0x00a6, B:42:0x00ad, B:30:0x006e), top: B:49:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: all -> 0x00b2, CancellationException -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b7, all -> 0x00b2, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0045, B:23:0x0053, B:24:0x005a, B:25:0x005b, B:26:0x0062, B:27:0x0063, B:43:0x00ae, B:33:0x0079, B:35:0x008b, B:37:0x0096, B:39:0x00a2, B:38:0x009e, B:41:0x00a6, B:42:0x00ad, B:30:0x006e), top: B:49:0x0002 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC0661i abstractC0661i;
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action == null) {
                abstractC0661i = this;
                context2 = context;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    abstractC0661i = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = abstractC0661i.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    abstractC0661i.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    abstractC0661i = this;
                    context2 = context;
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = abstractC0661i.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    abstractC0661i.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    if (ped.m19084b(new ek2(this, intExtra, stringExtra, 1), context)) {
                        return;
                    }
                    AbstractC0658f.m2229b(this, this.f6018a, new GlanceAppWidgetReceiver$onReceive$1$1(this, context, intExtra, stringExtra, null));
                    return;
                }
                abstractC0661i = this;
                context2 = context;
            }
            super.onReceive(context2, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            y2d.m24916g(th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (ped.m19084b(new jn3(this, iArr, 1), context)) {
            return;
        }
        AbstractC0658f.m2229b(this, this.f6018a, new GlanceAppWidgetReceiver$onUpdate$1(this, context, iArr, null));
    }
}
