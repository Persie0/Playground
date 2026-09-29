package androidx.glance.appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C0785at;
import p000.C3386nv;
import p000.b58;
import p000.cd4;
import p000.my5;
import p000.v11;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: androidx.glance.appwidget.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0662j implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a */
    public final GlanceRemoteViewsService f6019a;

    /* JADX INFO: renamed from: b */
    public final int f6020b;

    /* JADX INFO: renamed from: c */
    public final int f6021c;

    /* JADX INFO: renamed from: d */
    public final String f6022d;

    public C0662j(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.f6019a = glanceRemoteViewsService;
        this.f6020b = i;
        this.f6021c = i2;
        this.f6022d = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r10 == r12) goto L41;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2249a(C0662j c0662j, C0785at c0785at, ContinuationImpl continuationImpl) throws Throwable {
        C0647x7e842d2d c0647x7e842d2d;
        AbstractC0659g abstractC0659gMo2247e;
        ComponentName componentName;
        String className;
        GlanceRemoteViewsService glanceRemoteViewsService = c0662j.f6019a;
        int i = c0662j.f6020b;
        if (continuationImpl instanceof C0647x7e842d2d) {
            c0647x7e842d2d = (C0647x7e842d2d) continuationImpl;
            int i2 = c0647x7e842d2d.f5952c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0647x7e842d2d.f5952c = i2 - Integer.MIN_VALUE;
            } else {
                c0647x7e842d2d = new C0647x7e842d2d(c0662j, continuationImpl);
            }
        } else {
            c0647x7e842d2d = new C0647x7e842d2d(c0662j, continuationImpl);
        }
        C0647x7e842d2d c0647x7e842d2d2 = c0647x7e842d2d;
        Object objM2233b = c0647x7e842d2d2.f5950a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c0647x7e842d2d2.f5952c;
        xfa xfaVar = xfa.f68157a;
        cd4 cd4Var = null;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC3193b.m15359b(objM2233b);
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        AbstractC3193b.m15359b(objM2233b);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM2233b);
                cd4Var = (cd4) objM2233b;
            }
            if (cd4Var != null) {
                c0647x7e842d2d2.f5952c = 3;
                if (cd4Var.mo4539q(c0647x7e842d2d2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
        }
        AbstractC3193b.m15359b(objM2233b);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(glanceRemoteViewsService).getAppWidgetInfo(i);
        if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
            abstractC0659gMo2247e = null;
        } else {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            abstractC0659gMo2247e = ((AbstractC0661i) objNewInstance).mo2247e();
        }
        if (abstractC0659gMo2247e == null) {
            my5 my5Var = UnmanagedSessionReceiver.f5978a;
            my5.m17153f(i);
            if (cd4Var != null) {
                c0647x7e842d2d2.f5952c = 3;
                if (cd4Var.mo4539q(c0647x7e842d2d2) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        C0648x1c76f406 c0648x1c76f406 = new C0648x1c76f406(4, null);
        c0647x7e842d2d2.f5952c = 1;
        objM2233b = abstractC0659gMo2247e.m2233b(glanceRemoteViewsService, c0785at, null, c0648x1c76f406, c0647x7e842d2d2);
        return coroutineSingletons;
        cd4 cd4Var2 = (cd4) objM2233b;
        if (cd4Var2 == null) {
            my5 my5Var2 = UnmanagedSessionReceiver.f5978a;
            my5.m17153f(i);
        } else {
            cd4Var = cd4Var2;
        }
        if (cd4Var != null) {
            c0647x7e842d2d2.f5952c = 3;
            if (cd4Var.mo4539q(c0647x7e842d2d2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: b */
    public final b58 m2250b() {
        b58 b58Var;
        v11 v11Var = GlanceRemoteViewsService.f5947a;
        int i = this.f6020b;
        int i2 = this.f6021c;
        String str = this.f6022d;
        v11 v11Var2 = GlanceRemoteViewsService.f5947a;
        synchronized (v11Var2) {
            b58Var = (b58) v11Var2.f64686a.get(v11.m23038b(i, str, i2));
            if (b58Var == null) {
                b58Var = b58.f7970e;
            }
        }
        return b58Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return m2250b().f7971a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return m2250b().f7971a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return m2250b().f7972b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f6019a.getPackageName(), R$layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return m2250b().f7974d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return m2250b().f7973c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        wfb.m23899A(new GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        v11 v11Var = GlanceRemoteViewsService.f5947a;
        int i = this.f6020b;
        int i2 = this.f6021c;
        String str = this.f6022d;
        v11 v11Var2 = GlanceRemoteViewsService.f5947a;
        synchronized (v11Var2) {
            v11Var2.f64686a.remove(v11.m23038b(i, str, i2));
        }
    }
}
