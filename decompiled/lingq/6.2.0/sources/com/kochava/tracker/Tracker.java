package com.kochava.tracker;

import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.log.LogLevel;
import com.kochava.tracker.modules.internal.Module;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import p000.AbstractC0808bf;
import p000.ae4;
import p000.bq1;
import p000.cl8;
import p000.cy5;
import p000.d74;
import p000.dd4;
import p000.de4;
import p000.dm1;
import p000.ed4;
import p000.fe4;
import p000.g9c;
import p000.gd4;
import p000.ge4;
import p000.hd4;
import p000.he4;
import p000.id4;
import p000.ix3;
import p000.kd4;
import p000.ke4;
import p000.ld4;
import p000.md4;
import p000.me4;
import p000.nd4;
import p000.ob2;
import p000.od4;
import p000.p58;
import p000.pb2;
import p000.pd4;
import p000.pvc;
import p000.r46;
import p000.rd4;
import p000.re4;
import p000.se4;
import p000.sj5;
import p000.sq5;
import p000.t9a;
import p000.tb2;
import p000.td4;
import p000.thb;
import p000.tr3;
import p000.ub2;
import p000.ud4;
import p000.ux5;
import p000.v8a;
import p000.vb2;
import p000.wb2;
import p000.wq1;
import p000.xb2;
import p000.xo3;
import p000.yb2;
import p000.zd4;

/* JADX INFO: loaded from: classes.dex */
public final class Tracker extends Module<dm1> implements v8a {

    /* JADX INFO: renamed from: i */
    public static final sq5 f14106i;

    /* JADX INFO: renamed from: j */
    public static final Object f14107j;

    /* JADX INFO: renamed from: k */
    public static Tracker f14108k;

    /* JADX INFO: renamed from: g */
    public final g9c f14109g;

    /* JADX INFO: renamed from: h */
    public final p58 f14110h;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f14106i = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
        f14107j = new Object();
        f14108k = null;
    }

    public Tracker() {
        super(f14106i);
        this.f14109g = new g9c(15);
        this.f14110h = new p58(12);
    }

    public static v8a getInstance() {
        if (f14108k == null) {
            synchronized (f14107j) {
                try {
                    if (f14108k == null) {
                        f14108k = new Tracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14108k;
    }

    @Override // com.kochava.tracker.modules.internal.Module
    /* JADX INFO: renamed from: d */
    public final void mo6975d() {
        synchronized (this.f14110h) {
        }
        synchronized (this.f14109g) {
        }
    }

    @Override // com.kochava.tracker.modules.internal.Module
    /* JADX INFO: renamed from: e */
    public final void mo6976e(Context context) {
        m6983b(new yb2(yb2.f69596j, yb2.f69595i));
        m6983b(new xb2(xb2.f68020j, xb2.f68019i));
        m6983b(new vb2(vb2.f65159j, vb2.f65158i));
        m6983b(new ob2(ob2.f54128j, ob2.f54127i));
        m6983b(new ub2(ub2.f63667j, ub2.f63666i));
        m6983b(new pb2(pb2.f55926j, pb2.f55925i));
        m6983b(new tb2(tb2.f62094j, tb2.f62093i));
        m6983b(new wb2(wb2.f66582j, wb2.f66581i));
        String str = td4.f62164r;
        List listAsList = Arrays.asList(se4.f60738c);
        JobType jobType = JobType.Persistent;
        TaskQueue taskQueue = TaskQueue.IO;
        td4 td4Var = new td4(str, listAsList, jobType, taskQueue, td4.f62165s);
        td4Var.f62166q = 1;
        m6984c(td4Var);
        String str2 = ud4.f63754r;
        String str3 = se4.f60758w;
        String str4 = se4.f60757v;
        String str5 = se4.f60740e;
        String str6 = se4.f60739d;
        ud4 ud4Var = new ud4(str2, Arrays.asList(str3, str4, "JobInit", "JobBackFillPayloads", str5, str6), jobType, taskQueue, ud4.f63755s);
        ud4Var.f63756q = 1;
        m6984c(ud4Var);
        re4 re4Var = new re4(re4.f59157r, Arrays.asList("JobInstall"), jobType, taskQueue, re4.f59158s);
        re4Var.f59159q = 0L;
        m6984c(re4Var);
        ed4 ed4Var = new ed4(ed4.f37054r, Arrays.asList("JobInit"), jobType, taskQueue, ed4.f37055s);
        ed4Var.f37056q = 0L;
        m6984c(ed4Var);
        String str7 = de4.f35495r;
        String str8 = se4.f60751p;
        String str9 = se4.f60741f;
        de4 de4Var = new de4(str7, Arrays.asList(str8, str9), jobType, taskQueue, de4.f35496s);
        de4Var.f35497q = 1;
        m6984c(de4Var);
        he4 he4Var = new he4(he4.f42254r, Arrays.asList(str9), jobType, taskQueue, he4.f42255s);
        he4Var.f42256q = 1;
        m6984c(he4Var);
        fe4 fe4Var = new fe4(fe4.f38942r, Arrays.asList(str9), jobType, taskQueue, fe4.f38943s);
        fe4Var.f38944q = 1;
        m6984c(fe4Var);
        ge4 ge4Var = new ge4(ge4.f40628r, Arrays.asList(se4.f60760y, se4.f60761z, "JobPayloadQueueClicks", str9), jobType, taskQueue, ge4.f40629s);
        ge4Var.f40630q = 1;
        m6984c(ge4Var);
        m6984c(new kd4(kd4.f47065q, Arrays.asList("JobAmazonAdvertisingId", "JobGoogleAdvertisingId", "JobSamsungCloudAdvertisingId", "JobGoogleAppSetId", "JobGoogleReferrer", "JobHuaweiAdvertisingId", "JobHuaweiReferrer", "JobSamsungReferrer", "JobMetaAttributionId", "JobMetaReferrer"), kd4.f47066r));
        m6984c(new ld4(ld4.f49498q, Arrays.asList(se4.f60759x, "JobInstall", "JobBackFillPayloads"), ld4.f49499r));
        m6984c(new md4(md4.f51103q, Arrays.asList(se4.f60742g, se4.f60749n, se4.f60750o), md4.f51104r));
        m6984c(new nd4(nd4.f52621q, Arrays.asList(se4.f60745j, se4.f60746k, se4.f60743h, se4.f60744i, se4.f60748m, se4.f60747l, se4.f60737b), nd4.f52622r));
        m6984c(new od4(od4.f54209q, Arrays.asList(se4.f60753r, se4.f60754s), od4.f54210r));
        sq5 sq5Var = AbstractC0808bf.f8448a;
        if (Settings.Secure.getString(context.getContentResolver(), "advertising_id") != null) {
            m6984c(dd4.m10293q());
        } else {
            AbstractC0808bf.f8448a.m21555D("Not running on Amazon Kindle device, will not attempt to collect advertising identifier");
        }
        sq5 sq5Var2 = xo3.f68429a;
        if (thb.m22063v("com.android.installreferrer.api.InstallReferrerClient")) {
            id4 id4Var = new id4(id4.f43964s, Arrays.asList("JobInit", str6), jobType, taskQueue, id4.f43965t);
            id4Var.f43967q = 1;
            id4Var.f43968r = null;
            m6984c(id4Var);
        } else {
            xo3.f68429a.m21555D("Google Install Referrer library is missing from the app, will not attempt to collect install referrer");
        }
        if (thb.m22063v("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            gd4 gd4Var = new gd4(gd4.f40567r, Arrays.asList("JobInit", str6), jobType, taskQueue, gd4.f40568s);
            gd4Var.f40569q = 0L;
            m6984c(gd4Var);
        } else {
            xo3.f68429a.m21555D("Google Ads Identifier library is missing from the app, will not attempt to collect advertising identifier");
        }
        if (thb.m22063v("com.google.android.gms.appset.AppSet")) {
            m6984c(hd4.m13205q());
        } else {
            xo3.f68429a.m21555D("Google App Set Identifier library is missing from the app, will not attempt to collect app set identifier");
        }
        sq5 sq5Var3 = ix3.f44728a;
        if (thb.m22063v("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient")) {
            m6984c(rd4.m20583r());
        } else {
            ix3.f44728a.m21555D("Huawei Install Referrer library is missing from the app, will not attempt to collect install referrer");
        }
        if (thb.m22063v("com.huawei.hms.ads.identifier.AdvertisingIdClient")) {
            m6984c(pd4.m19074q());
        } else {
            ix3.f44728a.m21555D("Huawei Ads Identifier library is missing from the app, will not attempt to collect advertising identifier");
        }
        sq5 sq5Var4 = cl8.f10239a;
        if (thb.m22063v("com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient")) {
            m6984c(me4.m16794r());
        } else {
            cl8.f10239a.m21555D("Samsung Install Referrer library is missing from the app, will not attempt to collect install referrer");
        }
        if (thb.m22063v("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk")) {
            m6984c(ke4.m15158r());
        } else {
            cl8.f10239a.m21555D("Samsung CloudDev library is missing from the app or running on Android API less than 23, will not attempt to collect cloud advertising identifier");
        }
        sq5 sq5Var5 = cy5.f34709a;
        if (t9a.m21914d(context, "com.facebook.katana", "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2") || t9a.m21914d(context, "com.instagram.android", "3082024d308201b6a00302010202044f31d2cb300d06092a864886f70d0101050500306a310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d53616e204672616e636973636f31163014060355040a130d496e7374616772616d20496e63311630140603550403130d4b6576696e2053797374726f6d3020170d3132303230383031343133315a180f32313132303131353031343133315a306a310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d53616e204672616e636973636f31163014060355040a130d496e7374616772616d20496e63311630140603550403130d4b6576696e2053797374726f6d30819f300d06092a864886f70d010101050003818d003081890281810089ebcac015660b42a5c080bf694c52e29e9df83a4c94964b022ca38d2ba2157d8e4650955c787906ac344bdb8b7d202a92231403d48e9e2f0df3cb917cfa9b9741314c85052673d42ad00f2c251be4a6b012fb9d5b33131b0e5ca0b9193856dc311dc65dc45f97d2632e72bec2b4964adfd5d30675d5d372fbaf11359a7afb550203010001300d06092a864886f70d0101050500038181002aefd84526b570192967b679a685bcdc12cf40030589594d04d885cfa8a311372fb93f2c1c8ba636f061aeb87207f5a1ad26fe58747c30714f1e9b918ab2e090d5250307655eeab5fede1e6409316c5d29779c037b550f29bcad40fa70c947b616cc05daa5532c0ecc3ece773a71f37287a4ac32f2bd7feede847cbac5671969") || cy5.m9936b(context)) {
            m6984c(ae4.m295q());
        } else {
            cy5.f34709a.m21555D("Facebook, Facebook Lite, or Instagram app is not installed, will not attempt to collect install referrer");
        }
        if (t9a.m21914d(context, "com.facebook.katana", "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) {
            m6984c(zd4.m25558q());
        } else {
            cy5.f34709a.m21555D("Facebook app is not installed, will not attempt to collect attribution identifier");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6977f(Context context, String str) {
        boolean z;
        String str2;
        String packageName;
        sq5 sq5Var = f14106i;
        sq5Var.m21555D(BuildConfig.SDK_VERSION_DECLARATION);
        if (context.getApplicationContext() == null) {
            sq5Var.m21565f("start failure, parameter 'context' is invalid");
            return;
        }
        tr3 tr3VarM22269n = tr3.m22269n();
        Context applicationContext = context.getApplicationContext();
        synchronized (tr3VarM22269n) {
            String packageName2 = applicationContext.getPackageName();
            String strM19526v = pvc.m19526v(applicationContext);
            z = strM19526v.equals(packageName2) || strM19526v.equals(null);
        }
        if (!z) {
            tr3 tr3VarM22269n2 = tr3.m22269n();
            Context applicationContext2 = context.getApplicationContext();
            synchronized (tr3VarM22269n2) {
                packageName = applicationContext2.getPackageName();
            }
            r46.m20374Q(sq5Var, "start", wq1.m24119o("not running in the primary process. Expected ", packageName, " but was ", pvc.m19526v(context)));
            return;
        }
        if (getController() != null) {
            r46.m20374Q(sq5Var, "start", "already started");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SystemClock.elapsedRealtime();
        Context applicationContext3 = context.getApplicationContext();
        synchronized (this.f14109g) {
        }
        synchronized (this.f14109g) {
            Date date = new Date(BuildConfig.SDK_BUILD_TIME_MILLIS);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            str2 = simpleDateFormat.format(date);
        }
        boolean zM18910p = this.f14110h.m18910p(applicationContext3);
        String str3 = zM18910p ? "android-instantapp" : "android";
        String strSubstring = UUID.randomUUID().toString().substring(0, 5);
        this.f14110h.m18905e();
        d74 d74Var = new d74(jCurrentTimeMillis, applicationContext3, str, null, bq1.m4055f0(), strSubstring, zM18910p, str3, this.f14109g.m12441d());
        r46.m20360A(sq5Var, "Started SDK AndroidTracker 5.7.1 published " + str2);
        r46.m20360A(sq5Var, "The log level is set to " + LogLevel.fromLevel(r46.m20396w().f60929a));
        r46.m20394u(sq5Var, "The kochava app GUID provided was ".concat(str));
        try {
            setController(new dm1(d74Var));
            getController().m10463e();
        } catch (Throwable th) {
            sq5 sq5Var2 = f14106i;
            sq5Var2.m21565f("start failure, unknown exception occurred");
            sq5Var2.m21565f(th);
        }
    }
}
