package com.amplitude.android.plugins;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0881c;
import com.amplitude.android.internal.gestures.C0888c;
import com.amplitude.android.utilities.C0900b;
import com.amplitude.core.AbstractC0903a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import p000.RunnableC0002a0;
import p000.e83;
import p000.fa4;
import p000.mt6;
import p000.r84;
import p000.t84;
import p000.ui3;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.plugins.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0894a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0895b f10951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Application f10952b;

    public C0894a(C0895b c0895b, Application application) {
        this.f10951a = c0895b;
        this.f10952b = application;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        C0888c c0888c;
        C0895b c0895b = this.f10951a;
        if (!c0895b.f10953H && c0895b.m5091d().f64875b) {
            c0895b.f10953H = true;
            C0879a c0879a = c0895b.f10960e;
            if (c0879a == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            new C0900b(c0879a);
            PackageInfo packageInfo = c0895b.f10959d;
            if (packageInfo == null) {
                fa4.m11636J("packageInfo");
                throw null;
            }
            String str = packageInfo.versionName;
            if (str == null) {
                str = "Unknown";
            }
            String string = Long.valueOf(packageInfo.getLongVersionCode()).toString();
            String str2 = c0895b.f10954I;
            String str3 = c0895b.f10955J;
            string.getClass();
            if (str3 == null) {
                AbstractC0903a.m5107l(c0879a, "[Amplitude] Application Installed", AbstractC3194a.m15365R(new Pair("[Amplitude] Version", str), new Pair("[Amplitude] Build", string)), 4);
            } else if (!string.equals(str3)) {
                AbstractC0903a.m5107l(c0879a, "[Amplitude] Application Updated", AbstractC3194a.m15365R(new Pair("[Amplitude] Previous Version", str2), new Pair("[Amplitude] Previous Build", str3), new Pair("[Amplitude] Version", str), new Pair("[Amplitude] Build", string)), 4);
            }
        }
        final C0895b c0895b2 = this.f10951a;
        Application application = this.f10952b;
        if (!c0895b2.m5091d().f64878e.isEmpty()) {
            boolean z = c0895b2.f10961f != null;
            if (!z && (c0895b2.m5091d().f64878e.contains(t84.f61982a) || c0895b2.m5091d().f64878e.contains(r84.f58876a))) {
                C0881c c0881c = new C0881c(c0895b2.m5090c(), c0895b2.m5090c().m5113g(), application.getResources().getDisplayMetrics().density, new ui3() { // from class: com.amplitude.android.plugins.AndroidLifecyclePlugin$startInteractionTrackingIfNeeded$1
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        return c0895b2.m5091d();
                    }
                });
                c0895b2.f10961f = c0881c;
                c0881c.m5062a();
            }
            if (!z && c0895b2.f10961f != null && (c0888c = c0895b2.f10962g) != null) {
                c0888c.f10857g.post(new mt6(c0888c, 17));
                c0895b2.f10962g = null;
            }
            if (c0895b2.f10962g == null) {
                C0879a c0879a2 = c0895b2.f10960e;
                if (c0879a2 == null) {
                    fa4.m11636J("androidAmplitude");
                    throw null;
                }
                C0888c c0888c2 = new C0888c(new AndroidLifecyclePlugin$startInteractionTrackingIfNeeded$2(2, c0879a2, C0879a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8), c0895b2.f10961f, new ui3() { // from class: com.amplitude.android.plugins.AndroidLifecyclePlugin$startInteractionTrackingIfNeeded$3
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        return c0895b2.m5091d();
                    }
                }, c0879a2.m5113g());
                c0895b2.f10962g = c0888c2;
                c0888c2.f10857g.post(new RunnableC0002a0(c0888c2, 20));
            }
        }
        C0895b c0895b3 = this.f10951a;
        if (c0895b3.m5091d().f64876c) {
            Iterator it = c0895b3.f10963h.entrySet().iterator();
            while (it.hasNext()) {
                Activity activity = (Activity) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (activity != null) {
                    c0895b3.m5092e(activity);
                }
            }
        }
        return xfa.f68157a;
    }
}
