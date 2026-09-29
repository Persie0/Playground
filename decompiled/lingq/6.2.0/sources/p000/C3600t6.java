package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.amplitude.android.utilities.ActivityCallbackType;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.measurement.internal.C1043b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: loaded from: classes.dex */
public final class C3600t6 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61896a;

    /* JADX INFO: renamed from: b */
    public final Object f61897b;

    public C3600t6(int i) {
        this.f61896a = i;
        switch (i) {
            case 1:
                this.f61897b = new ArrayDeque(10);
                break;
            default:
                this.f61897b = do7.m10525a(Integer.MAX_VALUE, 6, null);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m21854a(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    private final void m21855b(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    private final void m21856c(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    private final void m21857d(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    private final void m21858e(Activity activity) {
    }

    /* JADX INFO: renamed from: f */
    private final void m21859f(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    private final void m21860g(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    private final void m21861h(Activity activity) {
    }

    /* JADX INFO: renamed from: i */
    private final void m21862i(Activity activity) {
    }

    /* JADX INFO: renamed from: j */
    private final void m21863j(Activity activity) {
    }

    /* JADX INFO: renamed from: k */
    private final void m21864k(Activity activity) {
    }

    /* JADX INFO: renamed from: l */
    public void m21865l(zzdd zzddVar, Bundle bundle) {
        j0d j0dVar;
        kjc kjcVar;
        Uri uri;
        C1043b c1043b = (C1043b) this.f61897b;
        try {
            try {
                kjc kjcVar2 = (kjc) c1043b.f60774a;
                xcc xccVar = kjcVar2.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17923a("onActivityCreated");
                Intent intent = zzddVar.f11881c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        kjc.m15278j(kjcVar2.f47441i);
                        String str = rad.m20500E0(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        tic ticVar = kjcVar2.f47439g;
                        kjc.m15280l(ticVar);
                        ticVar.m22076M(new rtc(this, z, uri, str, queryParameter));
                        kjcVar = (kjc) c1043b.f60774a;
                    }
                    j0dVar = kjcVar.f47444l;
                }
                kjcVar = (kjc) c1043b.f60774a;
            } catch (RuntimeException e) {
                xcc xccVar2 = ((kjc) c1043b.f60774a).f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(e, "Throwable caught in onActivityCreated");
            }
            j0dVar = kjcVar.f47444l;
        } finally {
            j0dVar = ((kjc) c1043b.f60774a).f47444l;
            kjc.m15279k(j0dVar);
            j0dVar.m14240K(zzddVar, bundle);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m21866m(zzdd zzddVar) {
        j0d j0dVar = ((kjc) ((C1043b) this.f61897b).f60774a).f47444l;
        kjc.m15279k(j0dVar);
        synchronized (j0dVar.f44870l) {
            try {
                if (Objects.equals(j0dVar.f44865g, zzddVar)) {
                    j0dVar.f44865g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((kjc) j0dVar.f60774a).f47436d.m4873S()) {
            j0dVar.f44864f.remove(Integer.valueOf(zzddVar.f11879a));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m21867n(zzdd zzddVar) {
        kjc kjcVar = (kjc) ((C1043b) this.f61897b).f60774a;
        j0d j0dVar = kjcVar.f47444l;
        kjc.m15279k(j0dVar);
        synchronized (j0dVar.f44870l) {
            j0dVar.f44869k = false;
            j0dVar.f44866h = true;
        }
        kjc kjcVar2 = (kjc) j0dVar.f60774a;
        kjcVar2.f47443k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (kjcVar2.f47436d.m4873S()) {
            bzc bzcVarM14243N = j0dVar.m14243N(zzddVar);
            j0dVar.f44862d = j0dVar.f44861c;
            j0dVar.f44861c = null;
            tic ticVar = kjcVar2.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new fp9(j0dVar, bzcVarM14243N, jElapsedRealtime));
        } else {
            j0dVar.f44861c = null;
            tic ticVar2 = kjcVar2.f47439g;
            kjc.m15280l(ticVar2);
            ticVar2.m22076M(new asc(j0dVar, jElapsedRealtime));
        }
        s6d s6dVar = kjcVar.f47440h;
        kjc.m15279k(s6dVar);
        kjc kjcVar3 = (kjc) s6dVar.f60774a;
        kjcVar3.f47443k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        tic ticVar3 = kjcVar3.f47439g;
        kjc.m15280l(ticVar3);
        ticVar3.m22076M(new v5d(s6dVar, jElapsedRealtime2, 1));
    }

    /* JADX INFO: renamed from: o */
    public void m21868o(zzdd zzddVar) {
        kjc kjcVar = (kjc) ((C1043b) this.f61897b).f60774a;
        s6d s6dVar = kjcVar.f47440h;
        kjc.m15279k(s6dVar);
        kjc kjcVar2 = (kjc) s6dVar.f60774a;
        kjcVar2.f47443k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tic ticVar = kjcVar2.f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new v5d(s6dVar, jElapsedRealtime, 0));
        j0d j0dVar = kjcVar.f47444l;
        kjc.m15279k(j0dVar);
        Object obj = j0dVar.f44870l;
        synchronized (obj) {
            try {
                j0dVar.f44869k = true;
                if (!Objects.equals(zzddVar, j0dVar.f44865g)) {
                    synchronized (obj) {
                        j0dVar.f44865g = zzddVar;
                        j0dVar.f44866h = false;
                        kjc kjcVar3 = (kjc) j0dVar.f60774a;
                        if (kjcVar3.f47436d.m4873S()) {
                            j0dVar.f44867i = null;
                            tic ticVar2 = kjcVar3.f47439g;
                            kjc.m15280l(ticVar2);
                            ticVar2.m22076M(new RunnableC3795yg(j0dVar));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kjc kjcVar4 = (kjc) j0dVar.f60774a;
        if (!kjcVar4.f47436d.m4873S()) {
            j0dVar.f44861c = j0dVar.f44867i;
            tic ticVar3 = kjcVar4.f47439g;
            kjc.m15280l(ticVar3);
            ticVar3.m22076M(new RunnableC3468pp(j0dVar));
            return;
        }
        j0dVar.m14241L(zzddVar.f11880b, j0dVar.m14243N(zzddVar), false);
        jwb jwbVar = ((kjc) j0dVar.f60774a).f47415I;
        kjc.m15277i(jwbVar);
        kjc kjcVar5 = (kjc) jwbVar.f60774a;
        kjcVar5.f47443k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        tic ticVar4 = kjcVar5.f47439g;
        kjc.m15280l(ticVar4);
        ticVar4.m22076M(new v5d(jwbVar, jElapsedRealtime2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Created));
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) q43.m19641c().m19645b(InterfaceC3036gf.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (interfaceC3036gf != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    C3182kf c3182kf = (C3182kf) interfaceC3036gf;
                                    if (urb.m22874a("fcm") && urb.m22876c("fcm", "_ln")) {
                                        v3c v3cVar = c3182kf.f47117a.f12311a;
                                        v3cVar.m23087c(new dxb(v3cVar, "fcm", "_ln", (Object) string2, true));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    c3182kf.m15167a("fcm", "_cmp", bundle3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        AbstractC3352my.m17095N("_no", bundle2);
                    }
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((v3c) obj).m23087c(new tyb(this, bundle, activity));
                break;
            default:
                m21865l(zzdd.m5439r(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Destroyed));
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((v3c) obj).m23087c(new lxb(this, activity));
                break;
            default:
                m21866m(zzdd.m5439r(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Paused));
                break;
            case 1:
                break;
            case 2:
                bb4 bb4Var = (bb4) obj;
                WeakReference weakReference = bb4Var.f8271b;
                if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                    bb4Var.f8271b = null;
                }
                break;
            case 3:
                ((v3c) obj).m23087c(new c3c(this, activity, 2));
                break;
            default:
                m21867n(zzdd.m5439r(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Resumed));
                break;
            case 1:
                break;
            case 2:
                bb4 bb4Var = (bb4) obj;
                bb4Var.f8271b = new WeakReference(activity);
                if (!bb4Var.f8273d || d32.m10021S(activity.getPackageManager())) {
                    bb4Var.f8273d = true;
                    for (WeakReference weakReference : bb4Var.f8274e) {
                        if (weakReference.get() != null) {
                            ((ab4) weakReference.get()).mo232b();
                        }
                    }
                }
                break;
            case 3:
                ((v3c) obj).m23087c(new c3c(this, activity, 1));
                break;
            default:
                m21868o(zzdd.m5439r(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f61896a) {
            case 0:
                activity.getClass();
                bundle.getClass();
                break;
            case 1:
            case 2:
                break;
            case 3:
                ptb ptbVar = new ptb();
                ((v3c) this.f61897b).m23087c(new tyb(this, activity, ptbVar));
                Bundle bundleM19478G = ptbVar.m19478G(50L);
                if (bundleM19478G != null) {
                    bundle.putAll(bundleM19478G);
                }
                break;
            default:
                m21869p(zzdd.m5439r(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Started));
                break;
            case 2:
                bb4 bb4Var = (bb4) obj;
                bb4Var.f8270a.removeCallbacks(bb4Var.f8275f);
                bb4Var.f8272c++;
                break;
            case 3:
                ((v3c) obj).m23087c(new c3c(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f61896a;
        Object obj = this.f61897b;
        switch (i) {
            case 0:
                activity.getClass();
                ((C3211a) obj).mo4677k(new C3287l6(new WeakReference(activity), ActivityCallbackType.Stopped));
                break;
            case 2:
                bb4 bb4Var = (bb4) obj;
                int i2 = bb4Var.f8272c;
                if (i2 > 0) {
                    bb4Var.f8272c = i2 - 1;
                }
                if (bb4Var.f8272c == 0 && bb4Var.f8273d) {
                    bb4Var.f8270a.postDelayed(bb4Var.f8275f, 1000L);
                    break;
                }
                break;
            case 3:
                ((v3c) obj).m23087c(new c3c(this, activity, 3));
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m21869p(zzdd zzddVar, Bundle bundle) {
        bzc bzcVar;
        j0d j0dVar = ((kjc) ((C1043b) this.f61897b).f60774a).f47444l;
        kjc.m15279k(j0dVar);
        if (!((kjc) j0dVar.f60774a).f47436d.m4873S() || bundle == null || (bzcVar = (bzc) j0dVar.f44864f.get(Integer.valueOf(zzddVar.f11879a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", bzcVar.f9210c);
        bundle2.putString("name", bzcVar.f9208a);
        bundle2.putString("referrer_name", bzcVar.f9209b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public /* synthetic */ C3600t6(Object obj, int i) {
        this.f61896a = i;
        this.f61897b = obj;
    }
}
