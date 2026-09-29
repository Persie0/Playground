package cc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2800p9;
import com.google.android.gms.internal.measurement.InterfaceC2813q9;
import p115fb.RunnableC5491g;
import p115fb.RunnableC5493i;
import p289o5.RunnableC7943w;

/* JADX INFO: renamed from: cc.r5 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class C1925r5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1934s5 f10172a;

    public C1925r5(C1934s5 c1934s5) {
        this.f10172a = c1934s5;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1782b6 c1782b6;
        Uri uri;
        C1897o4 c1897o4;
        C1934s5 c1934s5 = this.f10172a;
        try {
            try {
                C1860k3 c1860k3 = ((C1897o4) c1934s5.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9938I.m5623a("onActivityCreated");
                Intent intent = activity.getIntent();
                InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
                if (intent == null) {
                    c1897o4 = (C1897o4) interfaceC1781b5;
                } else {
                    ((InterfaceC2813q9) C2800p9.f14392b.f14393a.zza()).zza();
                    Uri data = null;
                    if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10386x0)) {
                        Uri data2 = intent.getData();
                        if (data2 == null || !data2.isHierarchical()) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string)) {
                                    data = Uri.parse(string);
                                }
                            }
                        } else {
                            uri = data2;
                        }
                        if (uri == null && uri.isHierarchical()) {
                            C1897o4.m5774i(((C1897o4) interfaceC1781b5).f10089l);
                            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                            String queryParameter = uri.getQueryParameter("referrer");
                            boolean z10 = bundle == null;
                            C1879m4 c1879m4 = ((C1897o4) interfaceC1781b5).f10087j;
                            C1897o4.m5776k(c1879m4);
                            c1879m4.m5753p(new RunnableC5491g(this, z10, uri, str, queryParameter));
                            c1897o4 = (C1897o4) interfaceC1781b5;
                        } else {
                            c1897o4 = (C1897o4) interfaceC1781b5;
                        }
                    } else {
                        data = intent.getData();
                    }
                    uri = data;
                    if (uri == null) {
                        c1897o4 = (C1897o4) interfaceC1781b5;
                    } else {
                        c1897o4 = (C1897o4) interfaceC1781b5;
                    }
                }
                c1782b6 = c1897o4.f10059J;
            } catch (RuntimeException e10) {
                C1860k3 c1860k4 = ((C1897o4) c1934s5.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(e10, "Throwable caught in onActivityCreated");
                c1782b6 = ((C1897o4) c1934s5.f10430a).f10059J;
            }
            C1897o4.m5775j(c1782b6);
            c1782b6.m5524p(activity, bundle);
        } catch (Throwable th2) {
            C1782b6 c1782b7 = ((C1897o4) c1934s5.f10430a).f10059J;
            C1897o4.m5775j(c1782b7);
            c1782b7.m5524p(activity, bundle);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1782b6 c1782b6 = ((C1897o4) this.f10172a.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        synchronized (c1782b6.f9694l) {
            try {
                if (activity == c1782b6.f9689g) {
                    c1782b6.f9689g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((C1897o4) c1782b6.f10430a).f10084g.m5583r()) {
            c1782b6.f9688f.remove(activity);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10;
        C1782b6 c1782b6 = ((C1897o4) this.f10172a.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        synchronized (c1782b6.f9694l) {
            try {
                c1782b6.f9693k = false;
                i10 = 1;
                c1782b6.f9690h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((C1897o4) c1782b6.f10430a).f10058I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((C1897o4) c1782b6.f10430a).f10084g.m5583r()) {
            C1988y5 c1988y5M5525q = c1782b6.m5525q(activity);
            c1782b6.f9686d = c1782b6.f9685c;
            c1782b6.f9685c = null;
            C1879m4 c1879m4 = ((C1897o4) c1782b6.f10430a).f10087j;
            C1897o4.m5776k(c1879m4);
            c1879m4.m5753p(new RunnableC1766a(c1782b6, c1988y5M5525q, jElapsedRealtime, 1));
        } else {
            c1782b6.f9685c = null;
            C1879m4 c1879m5 = ((C1897o4) c1782b6.f10430a).f10087j;
            C1897o4.m5776k(c1879m5);
            c1879m5.m5753p(new RunnableC1773a6(c1782b6, jElapsedRealtime));
        }
        C1971w6 c1971w6 = ((C1897o4) this.f10172a.f10430a).f10088k;
        C1897o4.m5775j(c1971w6);
        ((C1897o4) c1971w6.f10430a).f10058I.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C1879m4 c1879m6 = ((C1897o4) c1971w6.f10430a).f10087j;
        C1897o4.m5776k(c1879m6);
        c1879m6.m5753p(new RunnableC1871l5(c1971w6, jElapsedRealtime2, i10));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i10;
        C1971w6 c1971w6 = ((C1897o4) this.f10172a.f10430a).f10088k;
        C1897o4.m5775j(c1971w6);
        ((C1897o4) c1971w6.f10430a).f10058I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1879m4 c1879m4 = ((C1897o4) c1971w6.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new RunnableC1920r0(c1971w6, jElapsedRealtime, 1));
        C1782b6 c1782b6 = ((C1897o4) this.f10172a.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        synchronized (c1782b6.f9694l) {
            try {
                c1782b6.f9693k = true;
                i10 = 0;
                if (activity != c1782b6.f9689g) {
                    synchronized (c1782b6.f9694l) {
                        c1782b6.f9689g = activity;
                        c1782b6.f9690h = false;
                    }
                    if (((C1897o4) c1782b6.f10430a).f10084g.m5583r()) {
                        c1782b6.f9691i = null;
                        C1879m4 c1879m5 = ((C1897o4) c1782b6.f10430a).f10087j;
                        C1897o4.m5776k(c1879m5);
                        c1879m5.m5753p(new RunnableC7943w(6, c1782b6));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!((C1897o4) c1782b6.f10430a).f10084g.m5583r()) {
            c1782b6.f9685c = c1782b6.f9691i;
            C1879m4 c1879m6 = ((C1897o4) c1782b6.f10430a).f10087j;
            C1897o4.m5776k(c1879m6);
            c1879m6.m5753p(new RunnableC5493i(2, c1782b6));
            return;
        }
        c1782b6.m5526r(activity, c1782b6.m5525q(activity), false);
        C1930s1 c1930s1M5782m = ((C1897o4) c1782b6.f10430a).m5782m();
        ((C1897o4) c1930s1M5782m.f10430a).f10058I.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C1879m4 c1879m7 = ((C1897o4) c1930s1M5782m.f10430a).f10087j;
        C1897o4.m5776k(c1879m7);
        c1879m7.m5753p(new RunnableC1920r0(c1930s1M5782m, jElapsedRealtime2, i10));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1988y5 c1988y5;
        C1782b6 c1782b6 = ((C1897o4) this.f10172a.f10430a).f10059J;
        C1897o4.m5775j(c1782b6);
        if (((C1897o4) c1782b6.f10430a).f10084g.m5583r() && bundle != null && (c1988y5 = (C1988y5) c1782b6.f9688f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", c1988y5.f10416c);
            bundle2.putString("name", c1988y5.f10414a);
            bundle2.putString("referrer_name", c1988y5.f10415b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
