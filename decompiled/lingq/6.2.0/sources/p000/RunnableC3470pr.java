package p000;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.gps.ara.C0923a;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.appevents.internal.AppEventsLoggerUtility$GraphAPIActivityType;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.kochava.core.task.internal.TaskQueue;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: pr */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3470pr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f56709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56710c;

    public /* synthetic */ RunnableC3470pr(tp1 tp1Var, Throwable th) {
        this.f56708a = 11;
        Map map = Collections.EMPTY_MAP;
        this.f56709b = tp1Var;
        this.f56710c = th;
    }

    /* JADX INFO: renamed from: a */
    private final void m19459a() {
        JobState jobState;
        boolean z;
        bd4 bd4Var = (bd4) this.f56709b;
        C3309ls c3309ls = (C3309ls) this.f56710c;
        Object obj = bd4.f8367p;
        synchronized (obj) {
            JobState jobState2 = bd4Var.f8378k;
            jobState = JobState.Pending;
            z = jobState2 == jobState;
        }
        if (z) {
            synchronized (obj) {
                bd4Var.f8377j = 0L;
                bd4Var.f8378k = jobState;
                tr9 tr9Var = bd4Var.f8379l;
                if (tr9Var != null) {
                    tr9Var.m22276a();
                }
                bd4Var.f8379l = null;
                tr9 tr9Var2 = bd4Var.f8381n;
                if (tr9Var2 != null) {
                    tr9Var2.m22276a();
                }
                bd4Var.f8381n = null;
                bd4Var.f8382o = null;
            }
            synchronized (obj) {
                bd4Var.f8377j = System.currentTimeMillis();
                bd4Var.f8378k = JobState.Running;
            }
            bd4Var.f8373f.m21555D("Started at " + bd4Var.m3642k() + " seconds since SDK start and " + ci8.m4710W(bd4Var.f8374g) + " seconds since created");
            bd4Var.mo298i((ce4) c3309ls.f50065c);
            synchronized (obj) {
                try {
                    sq5 sq5Var = new sq5(new ar1(bd4Var, c3309ls, JobAction.Start, 3));
                    ny8 ny8Var = (ny8) c3309ls.f50064b;
                    TaskQueue taskQueue = bd4Var.f8372e;
                    ar1 ar1Var = new ar1(bd4Var, sq5Var, c3309ls, 4);
                    b64 b64Var = (b64) ny8Var.f53415c;
                    Handler handler = (Handler) b64Var.f8007b;
                    Handler handler2 = (Handler) b64Var.f8006a;
                    ExecutorService executorService = b64.f8005f;
                    if (executorService == null) {
                        throw new RuntimeException("Failed to start threadpool");
                    }
                    tr9 tr9Var3 = new tr9(handler, handler2, executorService, taskQueue, ny8Var, sq5Var, ar1Var);
                    tr9Var3.m22280e(0L);
                    bd4Var.f8379l = tr9Var3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m19460b() {
        yd4 yd4Var = (yd4) this.f56709b;
        mb2 mb2Var = (mb2) this.f56710c;
        synchronized (yd4Var.f69685e) {
            try {
                yd4Var.m25085f(mb2Var.f50871a);
                yd4Var.f69684d.add(mb2Var);
                if (yd4Var.f69686f) {
                    mb2Var.m16746g(yd4Var.f69681a);
                    yd4Var.m25089j();
                    yd4Var.m25088i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m19461c() {
        yd4 yd4Var = (yd4) this.f56709b;
        bd4 bd4Var = (bd4) this.f56710c;
        synchronized (yd4Var.f69685e) {
            try {
                yd4Var.m25083c(bd4Var);
                if (yd4Var.f69686f) {
                    bd4Var.m3643m(yd4Var.f69681a);
                    yd4Var.m25089j();
                    yd4Var.m25088i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        w92 w92Var;
        int i = 2;
        boolean zEquals = false;
        Object[] objArr = 0;
        switch (this.f56708a) {
            case 0:
                AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) this.f56709b;
                AppEvent appEvent = (AppEvent) this.f56710c;
                if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                    return;
                }
                try {
                    accessTokenAppIdPair.getClass();
                    qn3 qn3Var = AbstractC3546rr.f59732a;
                    synchronized (qn3Var) {
                        cz8 cz8VarM20075u = qn3Var.m20075u(accessTokenAppIdPair);
                        if (cz8VarM20075u != null) {
                            cz8VarM20075u.m9940a(appEvent);
                        }
                        break;
                    }
                    String str = C3012fs.f39540c;
                    if (iy5.m14194i() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && AbstractC3546rr.f59732a.m20073s() > 100) {
                        AbstractC3546rr.m20755d(FlushReason.EVENT_THRESHOLD);
                        return;
                    } else {
                        if (AbstractC3546rr.f59734c == null) {
                            AbstractC3546rr.f59734c = AbstractC3546rr.f59733b.schedule(AbstractC3546rr.f59735d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    lp1.m16420a(AbstractC3546rr.class, th);
                    return;
                }
            case 1:
                AccessTokenAppIdPair accessTokenAppIdPair2 = (AccessTokenAppIdPair) this.f56709b;
                cz8 cz8Var = (cz8) this.f56710c;
                if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                    return;
                }
                try {
                    AbstractC3584sr.m21615a0(accessTokenAppIdPair2, cz8Var);
                    return;
                } catch (Throwable th2) {
                    lp1.m16420a(AbstractC3546rr.class, th2);
                    return;
                }
            case 2:
                Context context = (Context) this.f56709b;
                C3012fs c3012fs = (C3012fs) this.f56710c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i2 = 0;
                for (int i3 = 0; i3 < 11; i3++) {
                    String str2 = strArr[i3];
                    String str3 = strArr2[i3];
                    try {
                        Class.forName(str2);
                        bundle.putInt(str3, 1);
                        i2 |= 1 << i3;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                    sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                    c3012fs.m12040g("fb_sdk_initialize", bundle);
                    return;
                }
                return;
            case 3:
                Context context2 = (Context) this.f56709b;
                hg1 hg1Var = (hg1) this.f56710c;
                AbstractC3352my.f52014a = (AudioManager) context2.getSystemService("audio");
                hg1Var.m13225b();
                return;
            case 4:
                C3488q8 c3488q8 = (C3488q8) this.f56709b;
                Object obj = this.f56710c;
                if (c3488q8.f57368b == 0) {
                    Object obj2 = c3488q8.f57372f;
                    c3488q8.f57372f = obj;
                    if (obj2.equals(obj)) {
                        return;
                    }
                    ((yv2) c3488q8.f57371e).m25357a(obj2, obj);
                    return;
                }
                return;
            case 5:
                uc1 uc1Var = (uc1) this.f56709b;
                uc1Var.f62130a.mo21323g(new jc1(objArr == true ? 1 : 0, (pr6) this.f56710c, uc1Var));
                return;
            case 6:
                qz6 qz6Var = (qz6) this.f56709b;
                uo7 uo7Var = (uo7) this.f56710c;
                if (qz6Var.f58424b != qz6.f58422d) {
                    C3386nv.m17633t("provide() can be called only once.");
                    return;
                }
                synchronized (qz6Var) {
                    w92Var = qz6Var.f58423a;
                    qz6Var.f58423a = null;
                    qz6Var.f58424b = uo7Var;
                    break;
                }
                w92Var.mo13969h(uo7Var);
                return;
            case 7:
                pv4 pv4Var = (pv4) this.f56709b;
                uo7 uo7Var2 = (uo7) this.f56710c;
                synchronized (pv4Var) {
                    try {
                        if (pv4Var.f56854b == null) {
                            pv4Var.f56853a.add(uo7Var2);
                        } else {
                            pv4Var.f56854b.add(uo7Var2.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 8:
                ((C1148a) this.f56709b).m6673c((String) this.f56710c, Boolean.FALSE);
                return;
            case 9:
                ((tp1) this.f56709b).m22260a((C1150a) this.f56710c);
                return;
            case 10:
                tp1 tp1Var = (tp1) this.f56709b;
                String str4 = (String) this.f56710c;
                t33 t33Var = tp1Var.f62660g.f13653d;
                t33Var.getClass();
                String strM21417a = sj4.m21417a(1024, str4);
                synchronized (((AtomicMarkableReference) t33Var.f61792g)) {
                    try {
                        String str5 = (String) ((AtomicMarkableReference) t33Var.f61792g).getReference();
                        if (strM21417a != null) {
                            zEquals = strM21417a.equals(str5);
                        } else if (str5 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) t33Var.f61792g).set(strM21417a, true);
                        ((C1149a) t33Var.f61788c).f13669b.m9855a(new RunnableC0002a0(t33Var, 18));
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 11:
                tp1 tp1Var2 = (tp1) this.f56709b;
                Throwable th5 = (Throwable) this.f56710c;
                Map map = Collections.EMPTY_MAP;
                C1148a c1148a = tp1Var2.f62660g;
                Thread threadCurrentThread = Thread.currentThread();
                c1148a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                br1 br1Var = c1148a.f13663n;
                if (br1Var == null || !br1Var.f8884e.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strM6675e = c1148a.m6675e();
                    if (strM6675e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    fu2 fu2Var = new fu2(strM6675e, j, map);
                    ed1 ed1Var = c1148a.f13662m;
                    ed1Var.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strM6675e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    ed1Var.m11054q(th5, threadCurrentThread, "error", fu2Var, false);
                    return;
                }
                return;
            case 12:
                sx1 sx1Var = (sx1) this.f56709b;
                Runnable runnable = (Runnable) this.f56710c;
                Process.setThreadPriority(sx1Var.f61539c);
                StrictMode.ThreadPolicy threadPolicy = sx1Var.f61540d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 13:
                wc2 wc2Var = (wc2) this.f56709b;
                Context context3 = (Context) this.f56710c;
                if (wc2Var.f66613a != null || context3 == null) {
                    return;
                }
                wc2Var.f66613a = context3.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 14:
                Context context4 = (Context) this.f56709b;
                String str6 = (String) this.f56710c;
                sy2 sy2Var = sy2.f61585a;
                if (lp1.f49971a.contains(sy2Var)) {
                    return;
                }
                try {
                    C3388nx c3388nxM19782l = AbstractC3489q9.m19782l(context4);
                    SharedPreferences sharedPreferences2 = context4.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String strConcat2 = str6.concat("ping");
                    long j2 = sharedPreferences2.getLong(strConcat2, 0L);
                    try {
                        JSONObject jSONObjectM12857a = AbstractC3049gs.m12857a(AppEventsLoggerUtility$GraphAPIActivityType.MOBILE_INSTALL_EVENT, c3388nxM19782l, thb.m22056o(context4), sy2.m21771f(context4), context4);
                        String str7 = C3012fs.f39540c;
                        String strM14195j = iy5.m14195j();
                        if (strM14195j != null) {
                            jSONObjectM12857a.put("install_referrer", strM14195j);
                        }
                        String str8 = String.format("%s/activities", Arrays.copyOf(new Object[]{str6}, 1));
                        sy2.f61604t.getClass();
                        String str9 = mp3.f51688j;
                        mp3 mp3VarM21069q = s46.m21069q(null, str8, jSONObjectM12857a, null);
                        if (j2 == 0 && mp3VarM21069q.m16982c().f56629c == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                            editorEdit.putLong(strConcat2, System.currentTimeMillis());
                            editorEdit.apply();
                            iy5 iy5Var = qj5.f57852d;
                            iy5.m14197m(LoggingBehavior.APP_EVENTS, "sy2", "MOBILE_APP_INSTALL has been logged");
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        throw new FacebookException("An error occurred while publishing install.", e);
                    }
                } catch (Exception unused2) {
                    return;
                } catch (Throwable th6) {
                    lp1.m16420a(sy2Var, th6);
                    return;
                }
            case 15:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f56709b;
                wr9 wr9Var = (wr9) this.f56710c;
                try {
                    wr9Var.m24138b(firebaseMessaging.m6706a());
                    return;
                } catch (Exception e2) {
                    wr9Var.m24137a(e2);
                    return;
                }
            case 16:
                String str10 = (String) this.f56709b;
                AppEvent appEvent2 = (AppEvent) this.f56710c;
                if (lp1.f49971a.contains(C0923a.class)) {
                    return;
                }
                try {
                    C0923a.f11395a.m5188c(str10, appEvent2);
                    return;
                } catch (Throwable th7) {
                    lp1.m16420a(C0923a.class, th7);
                    return;
                }
            case 17:
                ArrayList<Pair> arrayList = (ArrayList) this.f56709b;
                op3 op3Var = (op3) this.f56710c;
                op3Var.getClass();
                for (Pair pair : arrayList) {
                    kp3 kp3Var = (kp3) pair.first;
                    Object obj3 = pair.second;
                    obj3.getClass();
                    kp3Var.mo3204a((pp3) obj3);
                }
                Iterator it = op3Var.f54679d.iterator();
                while (it.hasNext()) {
                    ((C0833c3) it.next()).m4289a(op3Var);
                }
                return;
            case 18:
                ((sm0) this.f56709b).m21458F((xq3) this.f56710c);
                return;
            case 19:
                InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion = (InAppPurchaseUtils$BillingClientVersion) this.f56709b;
                Context context5 = (Context) this.f56710c;
                if (lp1.f49971a.contains(n24.class)) {
                    return;
                }
                try {
                    n24 n24Var = n24.f52216a;
                    String packageName = context5.getPackageName();
                    packageName.getClass();
                    n24Var.m17186a(inAppPurchaseUtils$BillingClientVersion, packageName);
                    return;
                } catch (Throwable th8) {
                    lp1.m16420a(n24.class, th8);
                    return;
                }
            case 20:
                m19459a();
                return;
            case 21:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f56709b;
                JobParameters jobParameters = (JobParameters) this.f56710c;
                int i4 = JobInfoSchedulerService.f11539a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 22:
                m19460b();
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                m19461c();
                return;
            case 24:
                xd3 xd3Var = (xd3) this.f56709b;
                LessonPreviewFragment lessonPreviewFragment = (LessonPreviewFragment) this.f56710c;
                bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                xd3Var.f68097e.setWebChromeClient(new WebChromeClient());
                WebView webView = xd3Var.f68097e;
                webView.setWebViewClient(new p55(lessonPreviewFragment));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                String str11 = lessonPreviewFragment.m9081g0().f60374b;
                Set setM20855w0 = AbstractC3550rv.m20855w0(new String[]{"tiktok.com", "instagram.com"});
                if (!(setM20855w0 instanceof Collection) || !setM20855w0.isEmpty()) {
                    Iterator it2 = setM20855w0.iterator();
                    while (it2.hasNext()) {
                        if (vk9.m23380c0(str11, (String) it2.next(), false)) {
                            webView.getSettings().setUserAgentString("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36");
                        }
                    }
                }
                webView.setLayerType(2, null);
                webView.setBackgroundColor(Color.argb(1, 0, 0, 0));
                webView.loadUrl(lessonPreviewFragment.m9081g0().f60374b);
                return;
            case 25:
                ((vu5) this.f56709b).f65920d.reportNetworkEvent((NetworkEvent) this.f56710c);
                return;
            case 26:
                ((vu5) this.f56709b).f65920d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f56710c);
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((vu5) this.f56709b).f65920d.reportPlaybackStateEvent((PlaybackStateEvent) this.f56710c);
                return;
            case 28:
                tk6 tk6Var = (tk6) this.f56709b;
                Context context6 = (Context) this.f56710c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context6.registerReceiver(new ce0(tk6Var, i), intentFilter);
                return;
            default:
                ce0 ce0Var = (ce0) this.f56709b;
                Context context7 = (Context) this.f56710c;
                tk6 tk6Var2 = (tk6) ce0Var.f9962b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context7.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        break;
                                    case 20:
                                        i = 9;
                                        break;
                                }
                            } else if (type != 1) {
                                if (type == 4 || type == 5) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            i = 4;
                                            break;
                                        case 13:
                                            i = 5;
                                            break;
                                        case 16:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            break;
                                        case 20:
                                            i = 9;
                                            break;
                                    }
                                } else if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                } else {
                                    i = 5;
                                }
                            }
                        }
                    } catch (SecurityException unused3) {
                        i = 0;
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    tk6Var2.m22186c(i);
                    return;
                } else {
                    csb.m9872a(context7, tk6Var2);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC3470pr(int i, Object obj, Object obj2) {
        this.f56708a = i;
        this.f56709b = obj;
        this.f56710c = obj2;
    }
}
