package com.amplitude.android.utilities;

import android.app.Activity;
import com.amplitude.android.C0879a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import p000.b34;
import p000.cs4;
import p000.id3;
import p000.jd3;
import p000.pj5;
import p000.r50;
import p000.ui3;

/* JADX INFO: renamed from: com.amplitude.android.utilities.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0900b {

    /* JADX INFO: renamed from: a */
    public final C0879a f10997a;

    /* JADX INFO: renamed from: b */
    public final cs4 f10998b;

    public C0900b(C0879a c0879a) {
        c0879a.getClass();
        this.f10997a = c0879a;
        this.f10998b = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.android.utilities.DefaultEventUtils$isFragmentActivityAvailable$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return Boolean.valueOf(b34.m3253t("androidx.fragment.app.FragmentActivity", this.f10995b.f10997a.m5113g()));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m5105a(Activity activity, ui3 ui3Var) {
        if (((Boolean) this.f10998b.getValue()).booleanValue()) {
            WeakHashMap weakHashMap = jd3.f45439a;
            C0879a c0879a = this.f10997a;
            DefaultEventUtils$startFragmentViewedEventTracking$2 defaultEventUtils$startFragmentViewedEventTracking$2 = new DefaultEventUtils$startFragmentViewedEventTracking$2(2, c0879a, C0879a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
            pj5 pj5VarM5113g = c0879a.m5113g();
            pj5VarM5113g.getClass();
            id3 id3Var = activity instanceof id3 ? (id3) activity : null;
            if (id3Var == null) {
                pj5VarM5113g.mo16256b("Activity is not a FragmentActivity");
                return;
            }
            r50 r50Var = new r50(defaultEventUtils$startFragmentViewedEventTracking$2, pj5VarM5113g, ui3Var);
            id3Var.m13792j().m2152Y(r50Var, true);
            WeakHashMap weakHashMap2 = jd3.f45439a;
            Object arrayList = weakHashMap2.get(id3Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                weakHashMap2.put(id3Var, arrayList);
            }
            ((List) arrayList).add(r50Var);
        }
    }
}
