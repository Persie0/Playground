package p000;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.AbstractC0989c;
import com.google.android.gms.internal.play_billing.C0992d0;
import com.google.android.gms.internal.play_billing.C0995f;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1010u;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;
import com.lingq.p020ui.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class kc0 {

    /* JADX INFO: renamed from: A */
    public final Long f46991A;

    /* JADX INFO: renamed from: B */
    public final sla f46992B;

    /* JADX INFO: renamed from: c */
    public final String f46995c;

    /* JADX INFO: renamed from: d */
    public final String f46996d;

    /* JADX INFO: renamed from: f */
    public volatile tz1 f46998f;

    /* JADX INFO: renamed from: g */
    public final Context f46999g;

    /* JADX INFO: renamed from: h */
    public final qfa f47000h;

    /* JADX INFO: renamed from: i */
    public volatile pmb f47001i;

    /* JADX INFO: renamed from: j */
    public volatile frb f47002j;

    /* JADX INFO: renamed from: k */
    public boolean f47003k;

    /* JADX INFO: renamed from: m */
    public boolean f47005m;

    /* JADX INFO: renamed from: n */
    public boolean f47006n;

    /* JADX INFO: renamed from: o */
    public boolean f47007o;

    /* JADX INFO: renamed from: p */
    public boolean f47008p;

    /* JADX INFO: renamed from: q */
    public boolean f47009q;

    /* JADX INFO: renamed from: r */
    public boolean f47010r;

    /* JADX INFO: renamed from: s */
    public boolean f47011s;

    /* JADX INFO: renamed from: t */
    public boolean f47012t;

    /* JADX INFO: renamed from: u */
    public boolean f47013u;

    /* JADX INFO: renamed from: v */
    public boolean f47014v;

    /* JADX INFO: renamed from: w */
    public boolean f47015w;

    /* JADX INFO: renamed from: x */
    public final e41 f47016x;

    /* JADX INFO: renamed from: y */
    public final boolean f47017y;

    /* JADX INFO: renamed from: z */
    public ExecutorService f47018z;

    /* JADX INFO: renamed from: a */
    public final Object f46993a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile int f46994b = 0;

    /* JADX INFO: renamed from: e */
    public final Handler f46997e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public int f47004l = 0;

    public kc0(e41 e41Var, MainActivity mainActivity, pc0 pc0Var, C3370nf c3370nf) {
        long jNextLong = new Random().nextLong();
        this.f46991A = Long.valueOf(jNextLong);
        this.f46992B = yob.f70177a;
        this.f46995c = "8.3.0";
        String strM15083i = m15083i();
        this.f46996d = strM15083i;
        this.f46999g = mainActivity.getApplicationContext();
        bqc bqcVarM5647z = C1010u.m5647z();
        bqcVarM5647z.m18948b();
        C1010u.m5645x((C1010u) bqcVarM5647z.f55715b);
        if (strM15083i != null) {
            bqcVarM5647z.m18948b();
            C1010u.m5646y((C1010u) bqcVarM5647z.f55715b, strM15083i);
        }
        String packageName = this.f46999g.getPackageName();
        bqcVarM5647z.m18948b();
        C1010u.m5638q((C1010u) bqcVarM5647z.f55715b, packageName);
        bqcVarM5647z.m18948b();
        C1010u.m5635D((C1010u) bqcVarM5647z.f55715b, jNextLong);
        bqcVarM5647z.m18948b();
        C1010u.m5644w((C1010u) bqcVarM5647z.f55715b);
        int i = Build.VERSION.SDK_INT;
        bqcVarM5647z.m18948b();
        C1010u.m5632A((C1010u) bqcVarM5647z.f55715b, i);
        bqcVarM5647z.m4110c();
        m15085x(bqcVarM5647z, mainActivity);
        try {
            int i2 = this.f46999g.getPackageManager().getPackageInfo(this.f46999g.getPackageName(), 0).versionCode;
            bqcVarM5647z.m18948b();
            C1010u.m5633B((C1010u) bqcVarM5647z.f55715b, i2);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Error getting app version code.", th);
        }
        this.f47000h = new qfa(this.f46999g, (C1010u) bqcVarM5647z.m18947a());
        if (pc0Var == null) {
            AbstractC0985a.m5508i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f46998f = new tz1(this.f46999g, pc0Var, this.f47000h);
        this.f47016x = e41Var;
        this.f47017y = false;
        this.f46999g.getPackageName();
    }

    /* JADX INFO: renamed from: g */
    public static Future m15082g(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new kj3(14, futureSubmit, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            AbstractC0985a.m5509j("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m15083i() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m15084k(kc0 kc0Var, int i) {
        if (i != 0) {
            kc0Var.m15101s(0);
            return;
        }
        synchronized (kc0Var.f46993a) {
            try {
                if (kc0Var.f46994b == 3) {
                    return;
                }
                kc0Var.m15101s(2);
                tz1 tz1Var = kc0Var.f46998f != null ? kc0Var.f46998f : null;
                if (tz1Var != null) {
                    boolean z = kc0Var.f47013u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    tz1Var.f63122a = z;
                    qfb qfbVar = (qfb) tz1Var.f63127f;
                    Context context = (Context) tz1Var.f63123b;
                    qfbVar.m19926a(context, intentFilter2);
                    boolean z2 = tz1Var.f63122a;
                    qfb qfbVar2 = (qfb) tz1Var.f63126e;
                    if (!z2) {
                        qfbVar2.m19926a(context, intentFilter);
                        return;
                    }
                    synchronized (qfbVar2) {
                        try {
                            if (qfbVar2.f57708b) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(qfbVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != qfbVar2.f57709c ? 4 : 2);
                            } else {
                                context.registerReceiver(qfbVar2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            qfbVar2.f57708b = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m15085x(bqc bqcVar, MainActivity mainActivity) {
        try {
            ActivityManager activityManager = (ActivityManager) mainActivity.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                bqcVar.m18948b();
                C1010u.m5643v((C1010u) bqcVar.f55715b, i);
                String str = Build.BRAND;
                bqcVar.m18948b();
                C1010u.m5639r((C1010u) bqcVar.f55715b);
                String str2 = Build.MODEL;
                bqcVar.m18948b();
                C1010u.m5642u((C1010u) bqcVar.f55715b);
                String str3 = Build.MANUFACTURER;
                bqcVar.m18948b();
                C1010u.m5641t((C1010u) bqcVar.f55715b);
                String str4 = Build.FINGERPRINT;
                bqcVar.m18948b();
                C1010u.m5640s((C1010u) bqcVar.f55715b);
            }
        } catch (RuntimeException e) {
            AbstractC0985a.m5509j("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m15086A(zzjd zzjdVar, qc0 qc0Var, long j) {
        try {
            int i = qvb.f58258a;
            try {
                this.f47000h.m19919t(qvb.m20182b(zzjdVar, 2, qc0Var, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f47004l, j);
            } catch (Throwable th) {
                AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m15087B(zzjd zzjdVar, int i, qc0 qc0Var, String str) {
        try {
            int i2 = qvb.f58258a;
            m15098p(qvb.m20182b(zzjdVar, i, qc0Var, str, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m15088C(zzjd zzjdVar, qc0 qc0Var, long j, boolean z) {
        try {
            int i = qvb.f58258a;
            try {
                this.f47000h.m19922w(qvb.m20182b(zzjdVar, 2, qc0Var, null, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f47004l, j, z);
            } catch (Throwable th) {
                AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m15089D(zzjd zzjdVar, qc0 qc0Var, String str, long j, boolean z) {
        try {
            int i = qvb.f58258a;
            try {
                this.f47000h.m19922w(qvb.m20182b(zzjdVar, 2, qc0Var, str, zzjk.BROADCAST_ACTION_UNSPECIFIED), this.f47004l, j, z);
            } catch (Throwable th) {
                AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m15090E(qc0 qc0Var) {
        if (Thread.interrupted()) {
            return;
        }
        this.f46997e.post(new gvb(13, this, qc0Var));
    }

    /* JADX INFO: renamed from: a */
    public void mo13513a(gp0 gp0Var, C3440oy c3440oy) {
        if (m15082g(new njb(this, c3440oy, gp0Var, 1), 30000L, new kj3(13, this, c3440oy), m15094l(), m15091f()) == null) {
            qc0 qc0VarM15097o = m15097o();
            m15107z(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, qc0VarM15097o);
            c3440oy.m18570e(qc0VarM15097o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #5 {, blocks: (B:20:0x004f, B:22:0x0053), top: B:50:0x004f, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public void mo13514b() {
        ExecutorService executorService;
        try {
            int i = qvb.f58258a;
            m15099q(qvb.m20183c(12, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f46993a) {
            try {
                if (this.f46998f != null) {
                    tz1 tz1Var = this.f46998f;
                    qfb qfbVar = (qfb) tz1Var.f63126e;
                    Context context = (Context) tz1Var.f63123b;
                    qfbVar.m19928c(context);
                    ((qfb) tz1Var.f63127f).m19928c(context);
                    try {
                        AbstractC0985a.m5507h("BillingClient", "Unbinding from service.");
                        m15103u();
                    } catch (Throwable th2) {
                        AbstractC0985a.m5509j("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.f47018z;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.f47018z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            AbstractC0985a.m5509j("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            m15101s(3);
                            throw th4;
                        }
                    }
                    m15101s(3);
                } else {
                    AbstractC0985a.m5507h("BillingClient", "Unbinding from service.");
                    m15103u();
                    synchronized (this) {
                        executorService = this.f47018z;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f47018z = null;
                        }
                        m15101s(3);
                    }
                }
            } catch (Throwable th5) {
                AbstractC0985a.m5509j("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0340  */
    /* JADX WARN: Code duplicated, block: B:141:0x0345  */
    /* JADX WARN: Code duplicated, block: B:273:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, kc0] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX INFO: renamed from: c */
    public qc0 mo13515c(MainActivity mainActivity, final nc0 nc0Var) {
        long j;
        boolean z;
        String str;
        Future futureM15082g;
        String str2;
        ?? r6;
        ?? r4;
        ?? r7;
        ?? r5;
        zzjd zzjdVarZzb;
        String string;
        Object obj;
        String str3;
        boolean z2;
        String str4;
        String str5;
        String strM17486b;
        boolean z3;
        int i;
        long jNextLong = new Random().nextLong();
        if (this.f46998f == null || ((pc0) this.f46998f.f63124c) == null) {
            zzjd zzjdVar = zzjd.MISSING_LISTENER;
            qc0 qc0Var = wwb.f67452q;
            m15086A(zzjdVar, qc0Var, jNextLong);
            return qc0Var;
        }
        try {
            AbstractC0985a.m5507h("BillingClient", "Already connected or not opted into auto reconnection.");
            int i2 = ((qc0) AbstractC0989c.m5516a(wwb.f67444i).get(3000L, TimeUnit.MILLISECONDS)).f57553a;
            if (i2 == 0) {
                AbstractC0985a.m5507h("BillingClient", "Reconnection succeeded with result: " + i2);
            } else {
                AbstractC0985a.m5508i("BillingClient", "Reconnection failed with result: " + i2);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            AbstractC0985a.m5509j("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!m15105w()) {
            zzjd zzjdVar2 = zzjd.SERVICE_CONNECTION_NOT_READY;
            qc0 qc0Var2 = wwb.f67445j;
            m15086A(zzjdVar2, qc0Var2, jNextLong);
            m15090E(qc0Var2);
            return qc0Var2;
        }
        synchronized (this.f46993a) {
            try {
                if (this.f47002j != null) {
                    this.f47002j.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayListM17340u = nc0Var.m17340u();
        zzbw zzbwVarM17341v = nc0Var.m17341v();
        g9a.m12435l(add.m289b(arrayListM17340u));
        lc0 lc0Var = (lc0) add.m289b(zzbwVarM17341v);
        final String str6 = lc0Var.m16066a().f57906c;
        String str7 = lc0Var.m16066a().f57907d;
        Bundle bundle = null;
        if (str7.equals("subs") && !this.f47003k) {
            AbstractC0985a.m5508i("BillingClient", "Current client doesn't support subscriptions.");
            zzjd zzjdVar3 = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
            qc0 qc0Var3 = wwb.f67447l;
            m15088C(zzjdVar3, qc0Var3, jNextLong, false);
            m15090E(qc0Var3);
            return qc0Var3;
        }
        if (nc0Var.m17342w() && !this.f47005m) {
            AbstractC0985a.m5508i("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzjd zzjdVar4 = zzjd.EXTRA_PARAMS_NOT_SUPPORTED;
            qc0 qc0Var4 = wwb.f67441f;
            m15088C(zzjdVar4, qc0Var4, jNextLong, false);
            m15090E(qc0Var4);
            return qc0Var4;
        }
        if (arrayListM17340u.size() > 1 && !this.f47009q) {
            AbstractC0985a.m5508i("BillingClient", "Current client doesn't support multi-item purchases.");
            zzjd zzjdVar5 = zzjd.MULTI_ITEM_NOT_SUPPORTED;
            qc0 qc0Var5 = wwb.f67448m;
            m15088C(zzjdVar5, qc0Var5, jNextLong, false);
            m15090E(qc0Var5);
            return qc0Var5;
        }
        if (!zzbwVarM17341v.isEmpty() && !this.f47010r) {
            AbstractC0985a.m5508i("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzjd zzjdVar6 = zzjd.PRODUCT_DETAILS_NOT_SUPPORTED;
            qc0 qc0Var6 = wwb.f67450o;
            m15088C(zzjdVar6, qc0Var6, jNextLong, false);
            m15090E(qc0Var6);
            return qc0Var6;
        }
        qc0 qc0VarM17336p = nc0Var.m17336p();
        if (qc0VarM17336p != wwb.f67444i) {
            m15088C(zzjd.INVALID_BILLING_FLOW_PARAMS, qc0VarM17336p, jNextLong, false);
            m15090E(qc0VarM17336p);
            return qc0VarM17336p;
        }
        if (this.f47005m) {
            boolean z4 = this.f47006n;
            this.f47016x.getClass();
            this.f47016x.getClass();
            boolean z5 = this.f47017y;
            String str8 = this.f46995c;
            String str9 = this.f46996d;
            long jLongValue = this.f46991A.longValue();
            this.f46999g.getPackageName();
            Bundle bundle2 = new Bundle();
            AbstractC0985a.m5501b(jLongValue, bundle2, str8, str9);
            bundle2.putLong("billingClientTransactionId", jNextLong);
            nc0Var.m17335o();
            if (TextUtils.isEmpty(null)) {
                str3 = null;
            } else {
                str3 = null;
                bundle2.putString("accountId", null);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle2.putString("obfuscatedProfileId", str3);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str3)));
            }
            if (!TextUtils.isEmpty(nc0Var.m17338s())) {
                bundle2.putString("oldSkuPurchaseToken", nc0Var.m17338s());
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            nc0Var.m17339t();
            if (!TextUtils.isEmpty(null)) {
                nc0Var.m17339t();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z4) {
                z2 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z2 = true;
            }
            if (z5) {
                bundle2.putBoolean("enableAlternativeBilling", z2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = nc0Var.m17341v().iterator();
            while (it.hasNext()) {
                ((lc0) it.next()).getClass();
            }
            if (!arrayList.isEmpty()) {
                fzb fzbVarM5527p = C0995f.m5527p();
                fzbVarM5527p.m12252c(arrayList);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((C0995f) fzbVarM5527p.m18947a()).m5530b());
            }
            if (arrayListM17340u.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(zzbwVarM17341v.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(zzbwVarM17341v.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                j = jNextLong;
                int i3 = 0;
                while (i3 < zzbwVarM17341v.size()) {
                    lc0 lc0Var2 = (lc0) zzbwVarM17341v.get(i3);
                    ql7 ql7VarM16066a = lc0Var2.m16066a();
                    if (!ql7VarM16066a.f57909f.isEmpty()) {
                        arrayList4.add(ql7VarM16066a.f57909f);
                    }
                    String strM16067b = lc0Var2.m16067b();
                    arrayList5.add(strM16067b);
                    if (TextUtils.isEmpty(strM16067b)) {
                        str5 = str7;
                    } else {
                        str5 = str7;
                        ArrayList arrayList8 = ql7VarM16066a.f57912i;
                        if (arrayList8 != null && !arrayList8.isEmpty()) {
                            Iterator it2 = arrayList8.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    nl7 nl7Var = (nl7) it2.next();
                                    if (!TextUtils.isEmpty(nl7Var.m17486b())) {
                                        Iterator it3 = it2;
                                        if (Objects.equals(nl7Var.m17485a(), strM16067b)) {
                                            strM17486b = nl7Var.m17486b();
                                            break;
                                        }
                                        it2 = it3;
                                    }
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strM17486b)) {
                            arrayList6.add(strM17486b);
                        }
                        if (i3 > 0) {
                            arrayList2.add(((lc0) zzbwVarM17341v.get(i3)).m16066a().f57906c);
                            arrayList3.add(((lc0) zzbwVarM17341v.get(i3)).m16066a().f57907d);
                        }
                        i3++;
                        str7 = str5;
                    }
                    strM17486b = ql7VarM16066a.f57910g;
                    if (!TextUtils.isEmpty(strM17486b)) {
                        arrayList6.add(strM17486b);
                    }
                    if (i3 > 0) {
                        arrayList2.add(((lc0) zzbwVarM17341v.get(i3)).m16066a().f57906c);
                        arrayList3.add(((lc0) zzbwVarM17341v.get(i3)).m16066a().f57907d);
                    }
                    i3++;
                    str7 = str5;
                }
                str4 = str7;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList2);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayListM17340u.iterator();
                if (it4.hasNext()) {
                    g9a.m12435l(it4.next());
                    throw null;
                }
                if (!arrayList9.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayListM17340u.size() > 1) {
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayListM17340u.size() - 1);
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayListM17340u.size() - 1);
                    if (1 < arrayListM17340u.size()) {
                        g9a.m12435l(arrayListM17340u.get(1));
                        throw null;
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList10);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                j = jNextLong;
                str4 = str7;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f47007o) {
                zzjd zzjdVar7 = zzjd.OFFER_ID_TOKEN_NOT_SUPPORTED;
                qc0 qc0Var7 = wwb.f67449n;
                m15088C(zzjdVar7, qc0Var7, j, false);
                m15090E(qc0Var7);
                return qc0Var7;
            }
            z = false;
            if (TextUtils.isEmpty(lc0Var.m16066a().f57905b.optString("packageName"))) {
                z3 = false;
            } else {
                bundle2.putString("skuPackageName", lc0Var.m16066a().f57905b.optString("packageName"));
                z3 = true;
            }
            str = null;
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            Intent intent = mainActivity.getIntent();
            if (intent == null) {
                AbstractC0985a.m5508i("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.f46999g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f47010r && !zzbwVarM17341v.isEmpty()) {
                i = 17;
            } else if (this.f47008p && z3) {
                i = 15;
            } else {
                i = this.f47006n ? 9 : 6;
            }
            final int i4 = i;
            final Bundle bundle3 = bundle2;
            final String str10 = str4;
            futureM15082g = m15082g(new Callable(i4, str6, str10, nc0Var, bundle3) { // from class: uib

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f63980b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f63981c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f63982d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Bundle f63983e;

                {
                    this.f63983e = bundle3;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundleM5502c;
                    pmb pmbVar;
                    kc0 kc0Var = this.f63979a;
                    int i5 = this.f63980b;
                    String str11 = this.f63981c;
                    String str12 = this.f63982d;
                    Bundle bundle4 = this.f63983e;
                    try {
                        synchronized (kc0Var.f46993a) {
                            pmbVar = kc0Var.f47001i;
                        }
                        if (pmbVar == null) {
                            return AbstractC0985a.m5502c(wwb.f67445j, zzjd.SERVICE_RESET_TO_NULL);
                        }
                        return ((imb) pmbVar).m14026U(i5, kc0Var.f46999g.getPackageName(), str11, str12, bundle4);
                    } catch (DeadObjectException e2) {
                        qc0 qc0Var8 = wwb.f67445j;
                        zzjd zzjdVar8 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                        String strM20181a = qvb.m20181a(e2);
                        bundleM5502c = AbstractC0985a.m5502c(qc0Var8, zzjdVar8);
                        if (strM20181a != null) {
                            bundleM5502c.putString("ADDITIONAL_LOG_DETAILS", strM20181a);
                        }
                        return bundleM5502c;
                    } catch (Exception e3) {
                        qc0 qc0Var9 = wwb.f67443h;
                        zzjd zzjdVar9 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                        String strM20181a2 = qvb.m20181a(e3);
                        bundleM5502c = AbstractC0985a.m5502c(qc0Var9, zzjdVar9);
                        if (strM20181a2 != null) {
                            bundleM5502c.putString("ADDITIONAL_LOG_DETAILS", strM20181a2);
                        }
                        return bundleM5502c;
                    }
                }
            }, 5000L, null, this.f46997e, m15091f());
            str2 = str10;
            bundle = bundle3;
        } else {
            j = jNextLong;
            z = false;
            String str11 = str7;
            str = null;
            futureM15082g = m15082g(new njb(this, str6, str11, 0), 5000L, null, this.f46997e, m15091f());
            str2 = str11;
        }
        try {
            try {
                if (futureM15082g == null) {
                    try {
                        zzjd zzjdVar8 = zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                        qc0 qc0Var8 = wwb.f67438c;
                        m15088C(zzjdVar8, qc0Var8, j, z);
                        m15090E(qc0Var8);
                        return qc0Var8;
                    } catch (CancellationException | TimeoutException e2) {
                        e = e2;
                        r7 = z;
                        r5 = j;
                        AbstractC0985a.m5509j("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        zzjd zzjdVar9 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                        qc0 qc0Var9 = wwb.f67446k;
                        m15089D(zzjdVar9, qc0Var9, qvb.m20181a(e), r5, r7);
                        m15090E(qc0Var9);
                        return qc0Var9;
                    } catch (Exception e3) {
                        e = e3;
                        r6 = z;
                        r4 = j;
                        AbstractC0985a.m5509j("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        zzjd zzjdVar10 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                        qc0 qc0Var10 = wwb.f67445j;
                        m15089D(zzjdVar10, qc0Var10, qvb.m20181a(e), r4, r6);
                        m15090E(qc0Var10);
                        return qc0Var10;
                    }
                }
                boolean z6 = z;
                long j2 = j;
                Bundle bundle4 = (Bundle) futureM15082g.get(5000L, TimeUnit.MILLISECONDS);
                int iM5500a = AbstractC0985a.m5500a("BillingClient", bundle4);
                String strM5505f = AbstractC0985a.m5505f("BillingClient", bundle4);
                if (iM5500a == 0) {
                    Intent intent2 = new Intent(mainActivity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle4.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", j2);
                    intent2.putExtra("wasServiceAutoReconnected", z6);
                    mainActivity.startActivity(intent2);
                    return wwb.f67444i;
                }
                AbstractC0985a.m5508i("BillingClient", "Unable to buy item, Error response code: " + iM5500a);
                qc0 qc0VarM24184a = wwb.m24184a(iM5500a, strM5505f);
                try {
                    if (bundle4 == null || (obj = bundle4.get("LOG_REASON")) == null) {
                        zzjdVarZzb = zzjd.REASON_UNSPECIFIED;
                    } else if (obj instanceof Integer) {
                        zzjdVarZzb = zzjd.zzb(((Integer) obj).intValue());
                    } else {
                        AbstractC0985a.m5508i("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        zzjdVarZzb = zzjd.REASON_UNSPECIFIED;
                    }
                } catch (Throwable th2) {
                    AbstractC0985a.m5508i("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                    zzjdVarZzb = zzjd.REASON_UNSPECIFIED;
                }
                if (zzjdVarZzb == zzjd.REASON_UNSPECIFIED) {
                    zzjdVarZzb = zzjd.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                zzjd zzjdVar11 = zzjdVarZzb;
                if (bundle4 == null) {
                    string = str;
                } else {
                    try {
                        string = bundle4.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th3) {
                        AbstractC0985a.m5508i("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                        string = str;
                    }
                }
                try {
                    m15089D(zzjdVar11, qc0VarM24184a, string, j2, z6);
                    m15090E(qc0VarM24184a);
                    return qc0VarM24184a;
                } catch (CancellationException | TimeoutException e4) {
                    e = e4;
                    r5 = j2;
                    r7 = z6;
                    AbstractC0985a.m5509j("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar12 = zzjd.LAUNCH_BILLING_FLOW_TIMEOUT;
                    qc0 qc0Var11 = wwb.f67446k;
                    m15089D(zzjdVar12, qc0Var11, qvb.m20181a(e), r5, r7);
                    m15090E(qc0Var11);
                    return qc0Var11;
                } catch (Exception e5) {
                    e = e5;
                    r4 = j2;
                    r6 = z6;
                    AbstractC0985a.m5509j("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjd zzjdVar13 = zzjd.LAUNCH_BILLING_FLOW_EXCEPTION;
                    qc0 qc0Var12 = wwb.f67445j;
                    m15089D(zzjdVar13, qc0Var12, qvb.m20181a(e), r4, r6);
                    m15090E(qc0Var12);
                    return qc0Var12;
                }
            } catch (CancellationException | TimeoutException e6) {
                e = e6;
                r5 = str2;
                r7 = bundle;
            }
        } catch (Exception e7) {
            e = e7;
            r4 = str2;
            r6 = bundle;
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo13516d(cc4 cc4Var, C3440oy c3440oy) {
        if (m15082g(new njb(this, c3440oy, cc4Var, 2), 30000L, new kj3(15, this, c3440oy), m15094l(), m15091f()) == null) {
            qc0 qc0VarM15097o = m15097o();
            m15107z(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, qc0VarM15097o);
            c3440oy.m18571j(qc0VarM15097o, new wp7(zzbw.m5669n(), zzbw.m5669n()));
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo13517e(b64 b64Var) {
        m15102t(b64Var);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ExecutorService m15091f() {
        try {
            if (this.f47018z == null) {
                this.f47018z = Executors.newFixedThreadPool(AbstractC0985a.f12176a, new vpb(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47018z;
    }

    /* JADX INFO: renamed from: h */
    public final void m15092h() {
        if (TextUtils.isEmpty(null)) {
            this.f46999g.getPackageName();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15093j(C3440oy c3440oy, qc0 qc0Var, zzjd zzjdVar, Exception exc) {
        AbstractC0985a.m5509j("BillingClient", "Error in acknowledge purchase!", exc);
        m15087B(zzjdVar, 3, qc0Var, qvb.m20181a(exc));
        c3440oy.m18570e(qc0Var);
    }

    /* JADX INFO: renamed from: l */
    public final Handler m15094l() {
        return Looper.myLooper() == null ? this.f46997e : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: m */
    public final C3299li m15095m(qc0 qc0Var, zzjd zzjdVar, String str, Exception exc) {
        AbstractC0985a.m5509j("BillingClient", str, exc);
        m15087B(zzjdVar, 7, qc0Var, qvb.m20181a(exc));
        return new C3299li(qc0Var.f57553a, qc0Var.f57555c, new ArrayList(), new ArrayList());
    }

    /* JADX INFO: renamed from: n */
    public final qc0 m15096n() {
        AbstractC0985a.m5507h("BillingClient", "Service connection is valid. No need to re-initialize.");
        wmc wmcVarM5616q = C1006q.m5616q();
        wmcVarM5616q.m24058f(6);
        nuc nucVarM5520p = C0992d0.m5520p();
        nucVarM5520p.m18948b();
        C0992d0.m5525u((C0992d0) nucVarM5520p.f55715b);
        nucVarM5520p.m17617c(false);
        nucVarM5520p.m17618d();
        wmcVarM5616q.m24057e(nucVarM5520p);
        m15099q((C1006q) wmcVarM5616q.m18947a());
        return wwb.f67444i;
    }

    /* JADX INFO: renamed from: o */
    public final qc0 m15097o() {
        int[] iArr = {0, 3};
        synchronized (this.f46993a) {
            for (int i = 0; i < 2; i++) {
                if (this.f46994b == iArr[i]) {
                    return wwb.f67445j;
                }
            }
            return wwb.f67443h;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15098p(C1005p c1005p) {
        try {
            qfa qfaVar = this.f47000h;
            int i = this.f47004l;
            qfaVar.getClass();
            try {
                bqc bqcVar = (bqc) ((C1010u) qfaVar.f57705a).m5541l();
                bqcVar.m18948b();
                C1010u.m5634C((C1010u) bqcVar.f55715b, i);
                qfaVar.f57705a = (C1010u) bqcVar.m18947a();
                qfaVar.m19917q(c1005p);
            } catch (Throwable th) {
                AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m15099q(C1006q c1006q) {
        try {
            qfa qfaVar = this.f47000h;
            int i = this.f47004l;
            qfaVar.getClass();
            try {
                bqc bqcVar = (bqc) ((C1010u) qfaVar.f57705a).m5541l();
                bqcVar.m18948b();
                C1010u.m5634C((C1010u) bqcVar.f55715b, i);
                C1010u c1010u = (C1010u) bqcVar.m18947a();
                qfaVar.f57705a = c1010u;
                try {
                    qfaVar.m19905B(c1006q, c1010u);
                } catch (Throwable th) {
                    AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th3);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15100r(qc0 qc0Var, zzjd zzjdVar) {
        try {
            int i = qvb.f58258a;
            imc imcVar = (imc) qvb.m20182b(zzjdVar, 6, qc0Var, null, zzjk.BROADCAST_ACTION_UNSPECIFIED).m5541l();
            nuc nucVarM5520p = C0992d0.m5520p();
            nucVarM5520p.m17617c(false);
            nucVarM5520p.m17618d();
            imcVar.m14031d(nucVarM5520p);
            m15098p((C1005p) imcVar.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15101s(int i) {
        String str;
        String str2;
        synchronized (this.f46993a) {
            try {
                if (this.f46994b == 3) {
                    return;
                }
                int i2 = this.f46994b;
                if (i2 == 0) {
                    str = "DISCONNECTED";
                } else if (i2 != 1) {
                    str = i2 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                AbstractC0985a.m5507h("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f46994b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m15102t(b64 b64Var) {
        zzjd zzjdVar;
        qc0 qc0VarM15096n;
        qc0 qc0Var;
        synchronized (this.f46993a) {
            try {
                if (m15105w()) {
                    qc0VarM15096n = m15096n();
                } else {
                    if (this.f46994b == 1) {
                        AbstractC0985a.m5508i("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzjd zzjdVar2 = zzjd.BILLING_CLIENT_CONNECTING;
                        qc0Var = wwb.f67439d;
                        m15100r(qc0Var, zzjdVar2);
                    } else if (this.f46994b == 3) {
                        AbstractC0985a.m5508i("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzjd zzjdVar3 = zzjd.BILLING_CLIENT_CLOSED;
                        qc0Var = wwb.f67445j;
                        m15100r(qc0Var, zzjdVar3);
                    } else {
                        m15101s(1);
                        m15103u();
                        AbstractC0985a.m5507h("BillingClient", "Starting in-app billing setup.");
                        this.f47002j = new frb(this, b64Var);
                        frb frbVar = this.f47002j;
                        synchronized (frbVar.f39538d.f46993a) {
                            upb upbVar = frbVar.f39536b;
                            upbVar.f64200c = 0L;
                            upbVar.f64199b = false;
                            upbVar.m22855a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f46999g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzjdVar = zzjd.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                    AbstractC0985a.m5508i("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f46995c);
                                    synchronized (this.f46993a) {
                                        try {
                                            if (this.f46994b == 2) {
                                                qc0VarM15096n = m15096n();
                                            } else if (this.f46994b != 1) {
                                                AbstractC0985a.m5508i("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzjd zzjdVar4 = zzjd.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                qc0Var = wwb.f67445j;
                                                m15100r(qc0Var, zzjdVar4);
                                            } else {
                                                frb frbVar2 = this.f47002j;
                                                if (this.f46999g.bindService(intent2, frbVar2, 1)) {
                                                    AbstractC0985a.m5507h("BillingClient", "Service was bonded successfully.");
                                                    qc0VarM15096n = null;
                                                } else {
                                                    zzjdVar = zzjd.BILLING_SERVICE_BLOCKED;
                                                    AbstractC0985a.m5508i("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                zzjdVar = zzjd.INVALID_PHONESKY_PACKAGE;
                                AbstractC0985a.m5508i("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        m15101s(0);
                        AbstractC0985a.m5507h("BillingClient", "Billing service unavailable on device.");
                        qc0 qc0Var2 = wwb.f67437b;
                        m15100r(qc0Var2, zzjdVar);
                        qc0VarM15096n = qc0Var2;
                    }
                    qc0VarM15096n = qc0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qc0VarM15096n != null) {
            b64Var.m3366s(qc0VarM15096n);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m15103u() {
        synchronized (this.f46993a) {
            if (this.f47002j != null) {
                try {
                    this.f46999g.unbindService(this.f47002j);
                    this.f47001i = null;
                    this.f47002j = null;
                } catch (Throwable th) {
                    try {
                        AbstractC0985a.m5509j("BillingClient", "There was an exception while unbinding service!", th);
                        this.f47001i = null;
                        this.f47002j = null;
                    } catch (Throwable th2) {
                        this.f47001i = null;
                        this.f47002j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m15104v() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sla slaVar = this.f46992B;
        if (slaVar == null) {
            C3386nv.m17635v("ticker");
            return false;
        }
        long jMo19435a = slaVar.mo19435a();
        long j = 30000;
        int i = 1;
        long jMo19435a2 = 30000;
        while (i <= 3) {
            try {
                long jMax = Math.max(0L, jMo19435a2);
                if (jMax <= 0) {
                    AbstractC0985a.m5508i("BillingClient", "No time remaining for reconnection attempt.");
                    return m15105w();
                }
                AbstractC0985a.m5507h("BillingClient", "Already connected or not opted into auto reconnection.");
                int i2 = ((qc0) AbstractC0989c.m5516a(wwb.f67444i).get(jMax, timeUnit)).f57553a;
                if (i2 == 0) {
                    AbstractC0985a.m5507h("BillingClient", "Reconnection succeeded with result: " + i2);
                    return m15105w();
                }
                AbstractC0985a.m5508i("BillingClient", "Reconnection failed with result: " + i2);
                jMo19435a2 = j - (((slaVar.mo19435a() - jMo19435a) + 0) / 1000000);
                long j2 = j;
                long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
                if (jMo19435a2 < jPow) {
                    AbstractC0985a.m5508i("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return m15105w();
                }
                if (i < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jMo19435a2 = j2 - (((slaVar.mo19435a() - jMo19435a) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        AbstractC0985a.m5509j("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
                i++;
                j = j2;
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                AbstractC0985a.m5509j("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        AbstractC0985a.m5508i("BillingClient", "Max retries reached.");
        return m15105w();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15105w() {
        boolean z;
        synchronized (this.f46993a) {
            try {
                z = false;
                if (this.f46994b == 2 && this.f47001i != null && this.f47002j != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: y */
    public final cdb m15106y(qc0 qc0Var, zzjd zzjdVar, String str, Exception exc) {
        m15087B(zzjdVar, 9, qc0Var, qvb.m20181a(exc));
        AbstractC0985a.m5509j("BillingClient", str, exc);
        return new cdb(9, qc0Var, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m15107z(zzjd zzjdVar, int i, qc0 qc0Var) {
        try {
            int i2 = qvb.f58258a;
            m15098p(qvb.m20182b(zzjdVar, i, qc0Var, null, zzjk.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Unable to log.", th);
        }
    }

    public kc0(e41 e41Var, MainActivity mainActivity, C3370nf c3370nf) {
        long jNextLong = new Random().nextLong();
        this.f46991A = Long.valueOf(jNextLong);
        this.f46992B = yob.f70177a;
        this.f46995c = "8.3.0";
        String strM15083i = m15083i();
        this.f46996d = strM15083i;
        this.f46999g = mainActivity.getApplicationContext();
        bqc bqcVarM5647z = C1010u.m5647z();
        bqcVarM5647z.m18948b();
        C1010u.m5645x((C1010u) bqcVarM5647z.f55715b);
        if (strM15083i != null) {
            bqcVarM5647z.m18948b();
            C1010u.m5646y((C1010u) bqcVarM5647z.f55715b, strM15083i);
        }
        String packageName = this.f46999g.getPackageName();
        bqcVarM5647z.m18948b();
        C1010u.m5638q((C1010u) bqcVarM5647z.f55715b, packageName);
        bqcVarM5647z.m18948b();
        C1010u.m5635D((C1010u) bqcVarM5647z.f55715b, jNextLong);
        bqcVarM5647z.m18948b();
        C1010u.m5644w((C1010u) bqcVarM5647z.f55715b);
        int i = Build.VERSION.SDK_INT;
        bqcVarM5647z.m18948b();
        C1010u.m5632A((C1010u) bqcVarM5647z.f55715b, i);
        bqcVarM5647z.m4110c();
        m15085x(bqcVarM5647z, mainActivity);
        try {
            int i2 = this.f46999g.getPackageManager().getPackageInfo(this.f46999g.getPackageName(), 0).versionCode;
            bqcVarM5647z.m18948b();
            C1010u.m5633B((C1010u) bqcVarM5647z.f55715b, i2);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingClient", "Error getting app version code.", th);
        }
        this.f47000h = new qfa(this.f46999g, (C1010u) bqcVarM5647z.m18947a());
        AbstractC0985a.m5508i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f46998f = new tz1(this.f46999g, (pc0) null, this.f47000h);
        this.f47016x = e41Var;
        this.f46999g.getPackageName();
    }
}
