package androidx.glance.appwidget;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.glance.state.C0703a;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.C0785at;
import p000.C3386nv;
import p000.n94;
import p000.rr4;
import p000.tr4;
import p000.u91;
import p000.v91;
import p000.zr4;

/* JADX INFO: renamed from: androidx.glance.appwidget.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C0663k {
    /* JADX INFO: renamed from: a */
    public static C0664l m2251a(Context context) {
        return new C0664l(context, new LinkedHashMap(), 0, -1, null, 48);
    }

    /* JADX INFO: renamed from: b */
    public static void m2252b(Context context, C0785at c0785at) {
        if (c0785at != null) {
            int i = c0785at.f7451a;
            if (Integer.MIN_VALUE > i || i >= -1) {
                try {
                    AbstractC3584sr.m21592C(context, "appWidgetLayout-" + i).delete();
                } catch (Exception e) {
                    Log.d("GlanceAppWidget", "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id " + c0785at, e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m2253c(Context context, int i, ContinuationImpl continuationImpl) throws Throwable {
        LayoutConfiguration$Companion$load$1 layoutConfiguration$Companion$load$1;
        rr4 rr4VarM20763q;
        if (continuationImpl instanceof LayoutConfiguration$Companion$load$1) {
            layoutConfiguration$Companion$load$1 = (LayoutConfiguration$Companion$load$1) continuationImpl;
            int i2 = layoutConfiguration$Companion$load$1.f5962e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layoutConfiguration$Companion$load$1.f5962e = i2 - Integer.MIN_VALUE;
            } else {
                layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, continuationImpl);
            }
        } else {
            layoutConfiguration$Companion$load$1 = new LayoutConfiguration$Companion$load$1(this, continuationImpl);
        }
        Object objM2504c = layoutConfiguration$Companion$load$1.f5960c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = layoutConfiguration$Companion$load$1.f5962e;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM2504c);
                layoutConfiguration$Companion$load$1.f5958a = context;
                layoutConfiguration$Companion$load$1.f5959b = i;
                layoutConfiguration$Companion$load$1.f5962e = 1;
                objM2504c = C0703a.f6305a.m2504c(context, zr4.f72004a, "appWidgetLayout-" + i, layoutConfiguration$Companion$load$1);
                if (objM2504c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = layoutConfiguration$Companion$load$1.f5959b;
                context = layoutConfiguration$Companion$load$1.f5958a;
                AbstractC3193b.m15359b(objM2504c);
            }
            rr4VarM20763q = (rr4) objM2504c;
        } catch (CorruptionException e) {
            Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + i + " is corrupted", e);
            rr4VarM20763q = rr4.m20763q();
        } catch (IOException e2) {
            Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i, e2);
            rr4VarM20763q = rr4.m20763q();
        }
        Context context2 = context;
        int i4 = i;
        n94<tr4> n94VarM20765r = rr4VarM20763q.m20765r();
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(n94VarM20765r, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (tr4 tr4Var : n94VarM20765r) {
            linkedHashMap.put(tr4Var.m22274p(), new Integer(tr4Var.m22275q()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        return new C0664l(context2, linkedHashMap2, rr4VarM20763q.m20766s(), i4, u91.m22626r1(linkedHashMap2.values()), 16);
    }
}
