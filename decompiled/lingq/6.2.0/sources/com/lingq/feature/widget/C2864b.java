package com.lingq.feature.widget;

import android.content.Context;
import androidx.glance.appwidget.C0660h;
import com.lingq.feature.widget.streak.C2871b;
import java.util.Collection;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ph2;
import p000.t62;
import p000.v72;
import p000.vz1;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2864b {

    /* JADX INFO: renamed from: a */
    public final Context f33834a;

    public C2864b(Context context) {
        this.f33834a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m9777a(C2864b c2864b, ContinuationImpl continuationImpl) {
        WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1 widgetUpdateNotifierImpl$hasPinnedStreakWidget$1;
        if (continuationImpl instanceof WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1) {
            widgetUpdateNotifierImpl$hasPinnedStreakWidget$1 = (WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1) continuationImpl;
            int i = widgetUpdateNotifierImpl$hasPinnedStreakWidget$1.f33827c;
            if ((i & Integer.MIN_VALUE) != 0) {
                widgetUpdateNotifierImpl$hasPinnedStreakWidget$1.f33827c = i - Integer.MIN_VALUE;
            } else {
                widgetUpdateNotifierImpl$hasPinnedStreakWidget$1 = new WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1(c2864b, continuationImpl);
            }
        } else {
            widgetUpdateNotifierImpl$hasPinnedStreakWidget$1 = new WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1(c2864b, continuationImpl);
        }
        Object objM2239b = widgetUpdateNotifierImpl$hasPinnedStreakWidget$1.f33825a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = widgetUpdateNotifierImpl$hasPinnedStreakWidget$1.f33827c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2239b);
            C0660h c0660h = new C0660h(c2864b.f33834a);
            widgetUpdateNotifierImpl$hasPinnedStreakWidget$1.f33827c = 1;
            objM2239b = c0660h.m2239b(C2871b.class, widgetUpdateNotifierImpl$hasPinnedStreakWidget$1);
            if (objM2239b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2239b);
        }
        return Boolean.valueOf(!((Collection) objM2239b).isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public final void m9778b(String str) {
        str.getClass();
        v72 v72Var = ph2.f56212a;
        wfb.m23926u(vz1.m23619a(t62.f61909c), null, null, new WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1(this, str, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m9779c() {
        v72 v72Var = ph2.f56212a;
        wfb.m23926u(vz1.m23619a(t62.f61909c), null, null, new WidgetUpdateNotifierImpl$refreshStreakWidget$1(this, null), 3);
    }
}
