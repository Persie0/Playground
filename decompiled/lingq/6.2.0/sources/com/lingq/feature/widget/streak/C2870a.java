package com.lingq.feature.widget.streak;

import android.content.Context;
import androidx.glance.appwidget.C0660h;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.domain.model.language.Language;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ak1;
import p000.by8;
import p000.cma;
import p000.do7;
import p000.e77;
import p000.f77;
import p000.gk6;
import p000.h5d;
import p000.hi8;
import p000.iy5;
import p000.j4b;
import p000.ky1;
import p000.l70;
import p000.ln3;
import p000.p8b;
import p000.pyb;
import p000.qk9;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.w7b;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.widget.streak.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2870a {
    /* JADX INFO: renamed from: a */
    public static void m9786a(Context context) {
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        h5d.m13072e(c0773bM2910c, "streak_immediate_update");
        h5d.m13072e(c0773bM2910c, "streak_periodic_update");
    }

    /* JADX INFO: renamed from: b */
    public static void m9787b(Context context) {
        String str;
        Language language = (Language) ((cma) ((ky1) ((j4b) do7.m10537m(context, j4b.class))).f48596D.get()).mo4572B0().getValue();
        if (language == null || (str = language.f19024a) == null) {
            return;
        }
        m9788c(context, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m9788c(Context context, String str) {
        str.getClass();
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        networkType2.getClass();
        ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
        tx6 tx6Var = new tx6(StreakDataUpdateWorker.class);
        Pair[] pairArr = {new Pair("language", str)};
        hi8 hi8Var = new hi8(10);
        Pair pair = pairArr[0];
        hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        tx6 tx6Var2 = (tx6) tx6Var.m15008g(hi8Var.m13282k());
        tx6Var2.f46873c.f55781j = ak1Var;
        ux6 ux6Var = (ux6) ((tx6) tx6Var2.m15005d(BackoffPolicy.EXPONENTIAL, 30L, TimeUnit.SECONDS)).m15004a();
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        c0773bM2910c.m2913b("streak_immediate_update", ExistingWorkPolicy.REPLACE, ux6Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m9789d(Context context) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        networkType2.getClass();
        ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
        TimeUnit.MINUTES.getClass();
        e77 e77Var = new e77(StreakDataUpdateWorker.class);
        p8b p8bVar = e77Var.f46873c;
        p8bVar.getClass();
        String str = p8b.f55771z;
        p8bVar.f55779h = 1800000L;
        p8bVar.f55780i = l70.m15947j(1800000L, 300000L, 1800000L);
        e77Var.f46873c.f55781j = ak1Var;
        f77 f77Var = (f77) ((e77) e77Var.m15005d(BackoffPolicy.EXPONENTIAL, 30L, TimeUnit.SECONDS)).m15004a();
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        if (ExistingPeriodicWorkPolicy.KEEP != ExistingPeriodicWorkPolicy.UPDATE) {
            new w7b(c0773bM2910c, "streak_periodic_update", ExistingWorkPolicy.KEEP, Collections.singletonList(f77Var), 0).m23805a();
            return;
        }
        iy5 iy5Var = c0773bM2910c.f7205b.f42359m;
        String strConcat = "enqueueUniquePeriodic_".concat("streak_periodic_update");
        by8 by8Var = c0773bM2910c.f7207d.f36847a;
        by8Var.getClass();
        pyb.m19571a(iy5Var, strConcat, by8Var, new qk9(14, c0773bM2910c, f77Var));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x005e->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r5 == r7) goto L24;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9790e(Context context, ContinuationImpl continuationImpl) throws Throwable {
        StreakDataUpdateWorker$Companion$updateAllWidgets$1 streakDataUpdateWorker$Companion$updateAllWidgets$1;
        Context context2;
        int i;
        Iterator it;
        ln3 ln3Var;
        C2871b c2871b;
        if (continuationImpl instanceof StreakDataUpdateWorker$Companion$updateAllWidgets$1) {
            streakDataUpdateWorker$Companion$updateAllWidgets$1 = (StreakDataUpdateWorker$Companion$updateAllWidgets$1) continuationImpl;
            int i2 = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f = i2 - Integer.MIN_VALUE;
            } else {
                streakDataUpdateWorker$Companion$updateAllWidgets$1 = new StreakDataUpdateWorker$Companion$updateAllWidgets$1(this, continuationImpl);
            }
        } else {
            streakDataUpdateWorker$Companion$updateAllWidgets$1 = new StreakDataUpdateWorker$Companion$updateAllWidgets$1(this, continuationImpl);
        }
        Object objM2239b = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33862d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f;
        if (i3 != 0) {
            if (i3 == 1) {
                context = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33859a;
                AbstractC3193b.m15359b(objM2239b);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33861c;
                it = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33860b;
                context2 = streakDataUpdateWorker$Companion$updateAllWidgets$1.f33859a;
                AbstractC3193b.m15359b(objM2239b);
            }
            while (it.hasNext()) {
                ln3Var = (ln3) it.next();
                c2871b = new C2871b();
                streakDataUpdateWorker$Companion$updateAllWidgets$1.f33859a = context2;
                streakDataUpdateWorker$Companion$updateAllWidgets$1.f33860b = it;
                streakDataUpdateWorker$Companion$updateAllWidgets$1.f33861c = i;
                streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f = 2;
                if (c2871b.m2237f(context2, ln3Var, streakDataUpdateWorker$Companion$updateAllWidgets$1) == obj) {
                    return obj;
                }
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2239b);
        C0660h c0660h = new C0660h(context);
        streakDataUpdateWorker$Companion$updateAllWidgets$1.f33859a = context;
        streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f = 1;
        objM2239b = c0660h.m2239b(C2871b.class, streakDataUpdateWorker$Companion$updateAllWidgets$1);
        context2 = context;
        i = 0;
        it = ((List) objM2239b).iterator();
        while (it.hasNext()) {
            ln3Var = (ln3) it.next();
            c2871b = new C2871b();
            streakDataUpdateWorker$Companion$updateAllWidgets$1.f33859a = context2;
            streakDataUpdateWorker$Companion$updateAllWidgets$1.f33860b = it;
            streakDataUpdateWorker$Companion$updateAllWidgets$1.f33861c = i;
            streakDataUpdateWorker$Companion$updateAllWidgets$1.f33864f = 2;
            if (c2871b.m2237f(context2, ln3Var, streakDataUpdateWorker$Companion$updateAllWidgets$1) == obj) {
                return obj;
            }
        }
        return xfa.f68157a;
    }
}
