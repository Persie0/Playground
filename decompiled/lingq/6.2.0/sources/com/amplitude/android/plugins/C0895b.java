package com.amplitude.android.plugins;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0881c;
import com.amplitude.android.C0882d;
import com.amplitude.android.internal.gestures.C0888c;
import com.amplitude.android.storage.C0898b;
import com.amplitude.android.utilities.C0900b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.Storage$Constants;
import com.amplitude.core.platform.Plugin$Type;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3600t6;
import p000.dp5;
import p000.fa4;
import p000.gu2;
import p000.id3;
import p000.iu2;
import p000.jd3;
import p000.l70;
import p000.pj5;
import p000.r50;
import p000.t50;
import p000.ui3;
import p000.un1;
import p000.v50;
import p000.wfb;
import p000.xq3;
import p000.zf7;

/* JADX INFO: renamed from: com.amplitude.android.plugins.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0895b implements Application.ActivityLifecycleCallbacks, zf7 {

    /* JADX INFO: renamed from: H */
    public boolean f10953H;

    /* JADX INFO: renamed from: I */
    public volatile String f10954I;

    /* JADX INFO: renamed from: J */
    public volatile String f10955J;

    /* JADX INFO: renamed from: a */
    public final C3600t6 f10956a;

    /* JADX INFO: renamed from: b */
    public final Plugin$Type f10957b;

    /* JADX INFO: renamed from: c */
    public AbstractC0903a f10958c;

    /* JADX INFO: renamed from: d */
    public PackageInfo f10959d;

    /* JADX INFO: renamed from: e */
    public C0879a f10960e;

    /* JADX INFO: renamed from: f */
    public C0881c f10961f;

    /* JADX INFO: renamed from: g */
    public C0888c f10962g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f10963h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f10964i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f10965j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f10966k;

    /* JADX INFO: renamed from: l */
    public boolean f10967l;

    public C0895b(C3600t6 c3600t6) {
        c3600t6.getClass();
        this.f10956a = c3600t6;
        this.f10957b = Plugin$Type.Utility;
        this.f10963h = new LinkedHashMap();
        this.f10964i = new LinkedHashSet();
        this.f10965j = new LinkedHashSet();
        this.f10966k = new LinkedHashMap();
    }

    @Override // p000.zf7
    /* JADX INFO: renamed from: a */
    public final void mo5089a(AbstractC0903a abstractC0903a) {
        PackageInfo packageInfo;
        this.f10958c = abstractC0903a;
        this.f10960e = (C0879a) abstractC0903a;
        Context context = abstractC0903a.f11016a.f10789b;
        context.getClass();
        Application application = (Application) context;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            packageInfo.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            abstractC0903a.m5113g().mo16255a("Cannot find package with application.packageName: " + application.getPackageName());
            packageInfo = new PackageInfo();
        }
        this.f10959d = packageInfo;
        String str = packageInfo.versionName;
        if (str == null) {
            str = "Unknown";
        }
        String string = Long.valueOf(packageInfo.getLongVersionCode()).toString();
        C0898b c0898bM5114h = m5090c().m5114h();
        this.f10954I = c0898bM5114h.m5096a(Storage$Constants.APP_VERSION);
        this.f10955J = c0898bM5114h.m5096a(Storage$Constants.APP_BUILD);
        wfb.m23926u(m5090c().f11018c, m5090c().f11021f, null, new AndroidLifecyclePlugin$snapshotAndPersistAppVersionInfo$1(this, c0898bM5114h, str, string, null), 2);
        un1 un1Var = abstractC0903a.f11018c;
        xq3 xq3Var = dp5.f36000a;
        wfb.m23926u(un1Var, xq3Var, null, new AndroidLifecyclePlugin$setup$1(this, application, null), 2);
        wfb.m23926u(abstractC0903a.f11018c, xq3Var, null, new AndroidLifecyclePlugin$setup$2(this, null), 2);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC0903a m5090c() {
        AbstractC0903a abstractC0903a = this.f10958c;
        if (abstractC0903a != null) {
            return abstractC0903a;
        }
        fa4.m11636J("amplitude");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final v50 m5091d() {
        C0879a c0879a = this.f10960e;
        if (c0879a != null) {
            return (v50) ((C3244l) ((t50) c0879a.f10785r.getValue()).f61871d.f9311a).getValue();
        }
        fa4.m11636J("androidAmplitude");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5092e(Activity activity) {
        int iHashCode = activity.hashCode();
        Integer numValueOf = Integer.valueOf(iHashCode);
        LinkedHashSet linkedHashSet = this.f10964i;
        if (linkedHashSet.contains(numValueOf)) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(iHashCode));
        C0879a c0879a = this.f10960e;
        if (c0879a != null) {
            new C0900b(c0879a).m5105a(activity, new ui3() { // from class: com.amplitude.android.plugins.AndroidLifecyclePlugin$registerFragmentTracking$1
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return Boolean.valueOf(this.f10935b.m5091d().f64876c);
                }
            });
        } else {
            fa4.m11636J("androidAmplitude");
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5093f(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        int iIdentityHashCode = System.identityHashCode(intent);
        int iHashCode = activity.hashCode();
        Integer numValueOf = Integer.valueOf(iHashCode);
        LinkedHashMap linkedHashMap = this.f10966k;
        Integer num = (Integer) linkedHashMap.get(numValueOf);
        if (num != null && num.intValue() == iIdentityHashCode) {
            return;
        }
        linkedHashMap.put(Integer.valueOf(iHashCode), Integer.valueOf(iIdentityHashCode));
        C0879a c0879a = this.f10960e;
        if (c0879a == null) {
            fa4.m11636J("androidAmplitude");
            throw null;
        }
        new C0900b(c0879a);
        Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            Uri referrer = activity.getReferrer();
            String string = referrer != null ? referrer.toString() : null;
            Uri data = intent2.getData();
            if (data != null) {
                String string2 = data.toString();
                string2.getClass();
                AbstractC0903a.m5107l(c0879a, "[Amplitude] Deep Link Opened", AbstractC3194a.m15365R(new Pair("[Amplitude] Link URL", string2), new Pair("[Amplitude] Link Referrer", string)), 4);
            }
        }
    }

    @Override // p000.zf7
    public final Plugin$Type getType() {
        return this.f10957b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.f10963h.put(Integer.valueOf(activity.hashCode()), new WeakReference(activity));
        if (m5091d().f64876c) {
            m5092e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        int iHashCode = activity.hashCode();
        this.f10963h.remove(Integer.valueOf(iHashCode));
        this.f10964i.remove(Integer.valueOf(iHashCode));
        this.f10966k.remove(Integer.valueOf(iHashCode));
        C0879a c0879a = this.f10960e;
        if (c0879a == null) {
            fa4.m11636J("androidAmplitude");
            throw null;
        }
        if (((Boolean) new C0900b(c0879a).f10998b.getValue()).booleanValue()) {
            WeakHashMap weakHashMap = jd3.f45439a;
            pj5 pj5VarM5113g = c0879a.m5113g();
            pj5VarM5113g.getClass();
            id3 id3Var = activity instanceof id3 ? (id3) activity : null;
            if (id3Var == null) {
                pj5VarM5113g.mo16256b("Activity is not a FragmentActivity");
                return;
            }
            List list = (List) jd3.f45439a.remove(id3Var);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    id3Var.m13792j().m2176l0((r50) it.next());
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (m5091d().f64877d) {
            m5093f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (!this.f10963h.containsKey(Integer.valueOf(activity.hashCode()))) {
            Intent intent = activity.getIntent();
            onActivityCreated(activity, intent != null ? intent.getExtras() : null);
        }
        LinkedHashSet linkedHashSet = this.f10965j;
        if (linkedHashSet.isEmpty()) {
            C0879a c0879a = this.f10960e;
            if (c0879a == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0882d c0882d = c0879a.f11022g;
            c0882d.getClass();
            c0882d.f10816d.mo4677k(new gu2(jCurrentTimeMillis));
        }
        linkedHashSet.add(Integer.valueOf(activity.hashCode()));
        if (m5091d().f64875b && linkedHashSet.size() == 1) {
            C0879a c0879a2 = this.f10960e;
            if (c0879a2 == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            new C0900b(c0879a2);
            PackageInfo packageInfo = this.f10959d;
            if (packageInfo == null) {
                fa4.m11636J("packageInfo");
                throw null;
            }
            AbstractC0903a.m5107l(c0879a2, "[Amplitude] Application Opened", AbstractC3194a.m15365R(new Pair("[Amplitude] From Background", Boolean.valueOf(this.f10967l)), new Pair("[Amplitude] Version", packageInfo.versionName), new Pair("[Amplitude] Build", Long.valueOf(packageInfo.getLongVersionCode()).toString())), 4);
        }
        if (linkedHashSet.size() == 1) {
            this.f10967l = false;
        }
        if (m5091d().f64877d) {
            m5093f(activity);
        }
        if (m5091d().f64876c) {
            C0879a c0879a3 = this.f10960e;
            if (c0879a3 == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            C0900b c0900b = new C0900b(c0879a3);
            try {
                AbstractC0903a.m5107l(c0879a3, "[Amplitude] Screen Viewed", AbstractC3194a.m15364Q(new Pair("[Amplitude] Screen Name", l70.m15958u(activity))), 4);
            } catch (Exception e) {
                c0900b.f10997a.m5113g().mo16255a("Failed to track screen viewed event: " + e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.f10965j;
        linkedHashSet.remove(numValueOf);
        if (m5091d().f64875b && linkedHashSet.isEmpty()) {
            C0879a c0879a = this.f10960e;
            if (c0879a == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            new C0900b(c0879a);
            AbstractC0903a.m5107l(c0879a, "[Amplitude] Application Backgrounded", null, 6);
        }
        if (linkedHashSet.isEmpty()) {
            this.f10967l = true;
            C0879a c0879a2 = this.f10960e;
            if (c0879a2 == null) {
                fa4.m11636J("androidAmplitude");
                throw null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0882d c0882d = c0879a2.f11022g;
            c0882d.getClass();
            c0882d.f10816d.mo4677k(new iu2(jCurrentTimeMillis));
            if (c0879a2.f11016a.f10798k) {
                c0879a2.m5109c();
            }
        }
    }
}
