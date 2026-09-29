package p000;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.C1191l;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class u62 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63477a;

    /* JADX INFO: renamed from: b */
    public Object f63478b;

    /* JADX INFO: renamed from: c */
    public final Object f63479c;

    public u62(v4d v4dVar, bzc bzcVar) {
        this.f63477a = 11;
        this.f63478b = bzcVar;
        Objects.requireNonNull(v4dVar);
        this.f63479c = v4dVar;
    }

    /* JADX INFO: renamed from: a */
    private final void m22504a() {
        aec aecVar = (aec) this.f63479c;
        synchronized (aecVar.f563c) {
            try {
                yr6 yr6Var = (yr6) aecVar.f564d;
                if (yr6Var != null) {
                    Exception excMo5966h = ((Task) this.f63478b).mo5966h();
                    lda.m16130p(excMo5966h);
                    yr6Var.mo321m(excMo5966h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m22505b() {
        aec aecVar = (aec) this.f63479c;
        synchronized (aecVar.f563c) {
            try {
                js6 js6Var = (js6) aecVar.f564d;
                if (js6Var != null) {
                    js6Var.mo320g(((Task) this.f63478b).mo5967i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m22506c() {
        e4d e4dVar = (e4d) this.f63479c;
        synchronized (e4dVar) {
            try {
                e4dVar.f36708a = false;
                v4d v4dVar = e4dVar.f36710c;
                if (!v4dVar.m23120U()) {
                    xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("Connected to service");
                    q9c q9cVar = (q9c) this.f63478b;
                    v4dVar.mo12359D();
                    v4dVar.f64866d = q9cVar;
                    v4dVar.m23116Q();
                    v4dVar.m23118S();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02c8 A[Catch: NameNotFoundException -> 0x02f7, TryCatch #12 {NameNotFoundException -> 0x02f7, blocks: (B:101:0x02bc, B:103:0x02c8, B:105:0x02d4), top: B:453:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02d4 A[Catch: NameNotFoundException -> 0x02f7, TRY_LEAVE, TryCatch #12 {NameNotFoundException -> 0x02f7, blocks: (B:101:0x02bc, B:103:0x02c8, B:105:0x02d4), top: B:453:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x0326  */
    /* JADX WARN: Code duplicated, block: B:120:0x0329  */
    /* JADX WARN: Code duplicated, block: B:122:0x032c  */
    /* JADX WARN: Code duplicated, block: B:124:0x032f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0332  */
    /* JADX WARN: Code duplicated, block: B:128:0x0335  */
    /* JADX WARN: Code duplicated, block: B:130:0x0339  */
    /* JADX WARN: Code duplicated, block: B:131:0x034e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0359  */
    /* JADX WARN: Code duplicated, block: B:133:0x0364  */
    /* JADX WARN: Code duplicated, block: B:134:0x036f  */
    /* JADX WARN: Code duplicated, block: B:135:0x037a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0385  */
    /* JADX WARN: Code duplicated, block: B:137:0x0390  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a5 A[Catch: IllegalStateException -> 0x03c7, TryCatch #20 {IllegalStateException -> 0x03c7, blocks: (B:139:0x039c, B:143:0x03ab, B:147:0x03b3, B:149:0x03b7, B:142:0x03a5), top: B:463:0x039c }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:146:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b7 A[Catch: IllegalStateException -> 0x03c7, TRY_LEAVE, TryCatch #20 {IllegalStateException -> 0x03c7, blocks: (B:139:0x039c, B:143:0x03ab, B:147:0x03b3, B:149:0x03b7, B:142:0x03a5), top: B:463:0x039c }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0419  */
    /* JADX WARN: Code duplicated, block: B:165:0x041b A[Catch: NotFoundException -> 0x0420, TRY_LEAVE, TryCatch #6 {NotFoundException -> 0x0420, blocks: (B:162:0x0409, B:165:0x041b), top: B:443:0x0409 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0431  */
    /* JADX WARN: Code duplicated, block: B:173:0x0437  */
    /* JADX WARN: Code duplicated, block: B:174:0x0442  */
    /* JADX WARN: Code duplicated, block: B:177:0x044c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0460  */
    /* JADX WARN: Code duplicated, block: B:182:0x0464  */
    /* JADX WARN: Code duplicated, block: B:183:0x046b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0488  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:189:0x04db  */
    /* JADX WARN: Code duplicated, block: B:192:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:195:0x0547  */
    /* JADX WARN: Code duplicated, block: B:196:0x0549  */
    /* JADX WARN: Code duplicated, block: B:199:0x054e  */
    /* JADX WARN: Code duplicated, block: B:202:0x055a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:203:0x055c  */
    /* JADX WARN: Code duplicated, block: B:204:0x055d A[PHI: r4
      0x055d: PHI (r4v32 boolean) = (r4v18 boolean), (r4v17 boolean) binds: [B:203:0x055c, B:200:0x0557] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:206:0x0589  */
    /* JADX WARN: Code duplicated, block: B:209:0x05c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:214:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f6 A[PHI: r27 r28
      0x05f6: PHI (r27v2 kjc) = (r27v0 kjc), (r27v3 kjc) binds: [B:213:0x05df, B:211:0x05c4] A[DONT_GENERATE, DONT_INLINE]
      0x05f6: PHI (r28v2 occ) = (r28v0 occ), (r28v3 occ) binds: [B:213:0x05df, B:211:0x05c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:217:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0626  */
    /* JADX WARN: Code duplicated, block: B:229:0x062e  */
    /* JADX WARN: Code duplicated, block: B:232:0x0657  */
    /* JADX WARN: Code duplicated, block: B:235:0x0667  */
    /* JADX WARN: Code duplicated, block: B:238:0x0686  */
    /* JADX WARN: Code duplicated, block: B:240:0x0694 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:248:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:250:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:254:0x0703  */
    /* JADX WARN: Code duplicated, block: B:257:0x071d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0738  */
    /* JADX WARN: Code duplicated, block: B:264:0x073e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0746  */
    /* JADX WARN: Code duplicated, block: B:267:0x0751  */
    /* JADX WARN: Code duplicated, block: B:270:0x075b  */
    /* JADX WARN: Code duplicated, block: B:273:0x0771  */
    /* JADX WARN: Code duplicated, block: B:277:0x077d  */
    /* JADX WARN: Code duplicated, block: B:280:0x078b  */
    /* JADX WARN: Code duplicated, block: B:283:0x079f  */
    /* JADX WARN: Code duplicated, block: B:284:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:286:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:288:0x07d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:299:0x0848  */
    /* JADX WARN: Code duplicated, block: B:301:0x0864  */
    /* JADX WARN: Code duplicated, block: B:304:0x0872  */
    /* JADX WARN: Code duplicated, block: B:313:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:315:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:316:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:318:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:322:0x08db  */
    /* JADX WARN: Code duplicated, block: B:326:0x0910  */
    /* JADX WARN: Code duplicated, block: B:328:0x091b  */
    /* JADX WARN: Code duplicated, block: B:330:0x094c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0962  */
    /* JADX WARN: Code duplicated, block: B:336:0x0976  */
    /* JADX WARN: Code duplicated, block: B:443:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0460 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v97, types: [swc] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        String str;
        String str2;
        String installerPackageName;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        String string;
        String str8;
        int iM15283g;
        kjc kjcVar;
        Bundle bundleM4870P;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        oyc oycVar;
        occ occVar;
        occ occVar2;
        occ occVar3;
        occ occVar4;
        String strM21928J;
        int i;
        AtomicInteger atomicInteger;
        long j2;
        final C1043b c1043b;
        zzin zzinVarM18841I;
        zzin zzinVar;
        boolean zM4869O;
        boolean z;
        C3552rx c3552rx;
        npc npcVarM19933K;
        zzji zzjiVarM4874T;
        zzji zzjiVarM4874T2;
        zzji zzjiVar;
        kjc kjcVar2;
        occ occVar5;
        npc npcVar;
        kjc kjcVar3;
        zzji zzjiVarM4874T3;
        zzji zzjiVarM4874T4;
        Boolean boolM4871Q;
        qg9 qg9Var;
        gw9 gw9Var;
        kjc kjcVar4;
        C3552rx c3552rx2;
        xcc xccVar;
        boolean zM15282f;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        occ occVar6;
        Context context;
        boolean z2;
        Iterator it;
        String str9;
        rad radVar;
        String strM6879d;
        Bundle bundle;
        switch (this.f63477a) {
            case 0:
                a72 a72Var = (a72) this.f63479c;
                ArrayList<o38> arrayList = (ArrayList) this.f63478b;
                for (o38 o38Var : arrayList) {
                    a72Var.getClass();
                    View view = o38Var.f53781a;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    a72Var.f314o.add(o38Var);
                    viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(a72Var.f64744c).setListener(new v62(a72Var, o38Var, view, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                a72Var.f311l.remove(arrayList);
                return;
            case 1:
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f63478b).run();
                    } catch (Throwable th) {
                        bq1.m4056g0(EmptyCoroutineContext.f47685a, th);
                    }
                    try {
                        Runnable runnableM12477g0 = ((gc5) this.f63479c).m12477g0();
                        if (runnableM12477g0 == null) {
                            return;
                        }
                        this.f63478b = runnableM12477g0;
                        i2++;
                        if (i2 >= 16) {
                            gc5 gc5Var = (gc5) this.f63479c;
                            if (eh0.m11118O(gc5Var.f40534d, gc5Var)) {
                                gc5 gc5Var2 = (gc5) this.f63479c;
                                eh0.m11117N(gc5Var2.f40534d, gc5Var2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        gc5 gc5Var3 = (gc5) this.f63479c;
                        synchronized (gc5Var3.f40537g) {
                            gc5.f40532h.decrementAndGet(gc5Var3);
                            throw th2;
                        }
                    }
                    break;
                }
                break;
            case 2:
                try {
                    ((Runnable) this.f63479c).run();
                    synchronized (((by8) this.f63478b).f9182e) {
                        ((by8) this.f63478b).m4224a();
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (((by8) this.f63478b).f9182e) {
                        ((by8) this.f63478b).m4224a();
                        throw th3;
                    }
                }
            case 3:
                uoc uocVar = (uoc) this.f63478b;
                uocVar.mo5907a();
                if (s46.m21077y()) {
                    uocVar.mo5913d().m22076M(this);
                    return;
                }
                ynb ynbVar = (ynb) this.f63479c;
                boolean z3 = ynbVar.f70129c != 0;
                ynbVar.f70129c = 0L;
                if (z3) {
                    ynbVar.mo55a();
                    return;
                }
                return;
            case 4:
                Task task = (Task) this.f63478b;
                boolean zMo5969k = task.mo5969k();
                wvb wvbVar = (wvb) this.f63479c;
                if (zMo5969k) {
                    wvbVar.f67399d.m22204s();
                    return;
                }
                try {
                    wvbVar.f67399d.m22201p(wvbVar.f67398c.mo393e(task));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        wvbVar.f67399d.m22203r((Exception) e.getCause());
                        return;
                    } else {
                        wvbVar.f67399d.m22203r(e);
                        return;
                    }
                } catch (Exception e2) {
                    wvbVar.f67399d.m22203r(e2);
                    return;
                }
            case 5:
                wvb wvbVar2 = (wvb) this.f63479c;
                try {
                    Task task2 = (Task) wvbVar2.f67398c.mo393e((Task) this.f63478b);
                    if (task2 == null) {
                        wvbVar2.mo321m(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    qg2 qg2Var = xr9.f68588b;
                    task2.mo5963e(qg2Var, wvbVar2);
                    task2.mo5962d(qg2Var, wvbVar2);
                    task2.mo5959a(qg2Var, wvbVar2);
                    return;
                } catch (RuntimeExecutionException e3) {
                    if (e3.getCause() instanceof Exception) {
                        wvbVar2.f67399d.m22203r((Exception) e3.getCause());
                        return;
                    } else {
                        wvbVar2.f67399d.m22203r(e3);
                        return;
                    }
                } catch (Exception e4) {
                    wvbVar2.f67399d.m22203r(e4);
                    return;
                }
            case 6:
                aec aecVar = (aec) this.f63479c;
                synchronized (aecVar.f563c) {
                    ((tr6) aecVar.f564d).mo4558f((Task) this.f63478b);
                    break;
                }
                return;
            case 7:
                kjc kjcVar5 = (kjc) this.f63479c;
                d74 d74Var = (d74) this.f63478b;
                String string2 = "";
                tic ticVar = kjcVar5.f47439g;
                xcc xccVar2 = kjcVar5.f47438f;
                qfc qfcVar = kjcVar5.f47437e;
                rad radVar2 = kjcVar5.f47441i;
                kjc.m15280l(ticVar);
                ticVar.mo12359D();
                cmb cmbVar = kjcVar5.f47436d;
                ((kjc) cmbVar.f60774a).getClass();
                qob qobVar = new qob(kjcVar5);
                qobVar.m18193G();
                kjcVar5.f47420N = qobVar;
                zzdb zzdbVar = (zzdb) d74Var.f35082f;
                long j3 = zzdbVar == null ? 0L : zzdbVar.f11874a;
                if (zzdbVar == null || (bundle = zzdbVar.f11877d) == null) {
                    j = 0;
                } else {
                    j = 0;
                    string2 = bundle.getString("runtime_google_app_id", "");
                }
                tac tacVar = new tac(kjcVar5, d74Var.f35078b, j3, string2);
                tacVar.m13745F();
                kjcVar5.f47421O = tacVar;
                jbc jbcVar = new jbc(kjcVar5);
                jbcVar.m13745F();
                kjcVar5.f47418L = jbcVar;
                v4d v4dVar = new v4d(kjcVar5);
                v4dVar.m13745F();
                kjcVar5.f47419M = v4dVar;
                boolean z4 = radVar2.f54663b;
                kjc kjcVar6 = (kjc) radVar2.f60774a;
                if (z4) {
                    C3386nv.m17633t("Can't initialize twice");
                    return;
                }
                radVar2.mo12359D();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == j) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == j) {
                        xcc xccVar3 = ((kjc) radVar2.f60774a).f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68083i.m17923a("Utils falling back to Random for random id");
                    }
                }
                radVar2.f59004d.set(jNextLong);
                kjcVar6.f47430X.incrementAndGet();
                radVar2.f54663b = true;
                if (qfcVar.f54663b) {
                    C3386nv.m17633t("Can't initialize twice");
                    return;
                }
                SharedPreferences sharedPreferences2 = ((kjc) qfcVar.f60774a).f47433a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                qfcVar.f57725c = sharedPreferences2;
                boolean z5 = sharedPreferences2.getBoolean("has_been_opened", false);
                qfcVar.f57717M = z5;
                if (!z5) {
                    SharedPreferences.Editor editorEdit = qfcVar.f57725c.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                qfcVar.f57727e = new pz2(qfcVar, Math.max(j, ((Long) z8c.f71162d.m21901a(null)).longValue()));
                ((kjc) qfcVar.f60774a).f47430X.incrementAndGet();
                qfcVar.f54663b = true;
                tac tacVar2 = kjcVar5.f47421O;
                if (tacVar2.f43749b) {
                    C3386nv.m17633t("Can't initialize twice");
                    return;
                }
                String str10 = "";
                kjc kjcVar7 = (kjc) tacVar2.f60774a;
                xcc xccVar4 = kjcVar7.f47438f;
                xcc xccVar5 = kjcVar7.f47438f;
                kjc.m15280l(xccVar4);
                xccVar4.f68076I.m17925c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(tacVar2.f62082j), Long.valueOf(tacVar2.f62081i));
                Context context2 = kjcVar7.f47433a;
                String packageName = context2.getPackageName();
                PackageManager packageManager = context2.getPackageManager();
                int i3 = Integer.MIN_VALUE;
                try {
                    if (packageManager != null) {
                        str = "Unknown";
                        str2 = "Can't initialize twice";
                        try {
                            installerPackageName = packageManager.getInstallerPackageName(packageName);
                            break;
                        } catch (IllegalArgumentException unused) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68080f.m17924b(xcc.m24449L(packageName), "Error retrieving app installer package name. appId");
                            installerPackageName = "unknown";
                        }
                        try {
                            if (installerPackageName != null) {
                                if ("com.android.vending".equals(installerPackageName)) {
                                    str3 = "";
                                }
                                packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                                if (packageInfo != null) {
                                    applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                    if (TextUtils.isEmpty(applicationLabel)) {
                                        string = str;
                                    } else {
                                        string = applicationLabel.toString();
                                    }
                                    try {
                                        str8 = packageInfo.versionName;
                                        try {
                                            int i4 = packageInfo.versionCode;
                                            String str11 = str3;
                                            str7 = str8;
                                            str6 = str11;
                                            packageManager = packageManager;
                                            i3 = i4;
                                            str5 = string;
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            str = str8;
                                            str4 = string;
                                            kjc.m15280l(xccVar5);
                                            packageManager = packageManager;
                                            xccVar5.f68080f.m17925c("Error retrieving package info. appId, appName", xcc.m24449L(packageName), str4);
                                            str5 = str4;
                                            i3 = Integer.MIN_VALUE;
                                            str6 = str3;
                                            str7 = str;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                } else {
                                    str6 = str3;
                                }
                                tacVar2.f62075c = packageName;
                                tacVar2.f62078f = str6;
                                tacVar2.f62076d = str7;
                                tacVar2.f62077e = i3;
                                tacVar2.f62079g = str5;
                                tacVar2.f62080h = 0L;
                                iM15283g = kjcVar7.m15283g();
                                if (iM15283g == 0) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68076I.m17923a("App measurement collection enabled");
                                } else if (iM15283g == 1) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement deactivated via the manifest");
                                } else if (iM15283g == 3) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (iM15283g == 4) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement disabled via the manifest");
                                } else if (iM15283g == 6) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68085k.m17923a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (iM15283g == 7) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement disabled via the global data collection setting");
                                } else if (iM15283g != 8) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement disabled");
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68081g.m17923a("Invalid scion state in identity");
                                } else {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68086l.m17923a("App measurement disabled due to denied storage consent");
                                }
                                tacVar2.f62071J = "";
                                strM6879d = tacVar2.f62069H;
                                if (TextUtils.isEmpty(strM6879d)) {
                                    strM6879d = C1191l.m6879d(context2, kjcVar7.f47417K);
                                }
                                if (!TextUtils.isEmpty(strM6879d)) {
                                    str10 = strM6879d;
                                }
                                tacVar2.f62071J = str10;
                                if (iM15283g == 0) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68076I.m17925c("App measurement enabled for app package, google app id", tacVar2.f62075c, tacVar2.f62071J);
                                    break;
                                }
                                tacVar2.f62083k = null;
                                cmb cmbVar2 = kjcVar7.f47436d;
                                kjcVar = (kjc) cmbVar2.f60774a;
                                lda.m16127m("analytics.safelisted_events");
                                bundleM4870P = cmbVar2.m4870P();
                                if (bundleM4870P != null) {
                                    if (bundleM4870P.containsKey("analytics.safelisted_events")) {
                                        numValueOf = Integer.valueOf(bundleM4870P.getInt("analytics.safelisted_events"));
                                    }
                                    if (numValueOf != null) {
                                        try {
                                            stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                                            if (stringArray == null) {
                                                listAsList = Arrays.asList(stringArray);
                                            } else {
                                                listAsList = null;
                                            }
                                        } catch (Resources.NotFoundException e5) {
                                            xcc xccVar6 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar6);
                                            xccVar6.f68080f.m17924b(e5, "Failed to load string array from metadata: resource not found");
                                        }
                                        break;
                                    } else {
                                        listAsList = null;
                                    }
                                    if (listAsList != null) {
                                        tacVar2.f62083k = listAsList;
                                    } else if (listAsList.isEmpty()) {
                                        kjc.m15280l(xccVar5);
                                        xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                                    } else {
                                        it = listAsList.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                str9 = (String) it.next();
                                                radVar = kjcVar7.f47441i;
                                                kjc.m15278j(radVar);
                                            } else {
                                                tacVar2.f62083k = listAsList;
                                            }
                                        } while (radVar.m20519G0("safelisted event", str9));
                                    }
                                    if (packageManager != null) {
                                        tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                                    } else {
                                        tacVar2.f62070I = 0;
                                    }
                                    ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                                    tacVar2.f43749b = true;
                                    oycVar = new oyc(kjcVar5);
                                    oycVar.m13745F();
                                    kjcVar5.f47422P = oycVar;
                                    if (!oycVar.f43749b) {
                                        C3386nv.m17633t(str2);
                                        return;
                                    }
                                    oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                                    ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                                    oycVar.f43749b = true;
                                    kjc.m15280l(xccVar2);
                                    occVar = xccVar2.f68075H;
                                    occVar2 = xccVar2.f68086l;
                                    occVar3 = xccVar2.f68076I;
                                    occVar4 = xccVar2.f68080f;
                                    cmbVar.m4864J();
                                    occVar2.m17924b(161000L, "App measurement initialized, version");
                                    kjc.m15280l(xccVar2);
                                    occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    strM21928J = tacVar.m21928J();
                                    if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                                        kjc.m15280l(xccVar2);
                                        occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        kjc.m15280l(xccVar2);
                                        occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                                    }
                                    kjc.m15280l(xccVar2);
                                    occVar.m17923a("Debug-level message logging enabled");
                                    i = kjcVar5.f47428V;
                                    atomicInteger = kjcVar5.f47430X;
                                    if (i != atomicInteger.get()) {
                                        kjc.m15280l(xccVar2);
                                        occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                                    }
                                    kjcVar5.f47423Q = true;
                                    j2 = kjcVar5.f47431Y;
                                    c1043b = kjcVar5.f47414H;
                                    tic ticVar2 = kjcVar5.f47439g;
                                    kjc.m15280l(ticVar2);
                                    ticVar2.mo12359D();
                                    kjc.m15277i(kjcVar5.f47422P);
                                    zzinVarM18841I = kjcVar5.f47422P.m18841I();
                                    zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                                    blb.m3870a();
                                    zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                                    if (zzinVarM18841I == zzinVar) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (zM4869O) {
                                        radVar2.mo12359D();
                                        if (radVar2.m20540Z() == 1) {
                                            radVar2.mo12359D();
                                            IntentFilter intentFilter = new IntentFilter();
                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            z2 = z;
                                            do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter);
                                            xcc xccVar7 = kjcVar6.f47438f;
                                            kjc.m15280l(xccVar7);
                                            xccVar7.f68075H.m17923a("Registered app receiver");
                                            if (z2) {
                                                kjc.m15277i(kjcVar5.f47422P);
                                                kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                            }
                                        } else if (z) {
                                            z = true;
                                            radVar2.mo12359D();
                                            IntentFilter intentFilter2 = new IntentFilter();
                                            intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                            z2 = z;
                                            do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter2);
                                            xcc xccVar8 = kjcVar6.f47438f;
                                            kjc.m15280l(xccVar8);
                                            xccVar8.f68075H.m17923a("Registered app receiver");
                                            if (z2) {
                                                kjc.m15277i(kjcVar5.f47422P);
                                                kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                            }
                                        }
                                    } else if (z) {
                                        z = true;
                                        radVar2.mo12359D();
                                        IntentFilter intentFilter3 = new IntentFilter();
                                        intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z2 = z;
                                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter3);
                                        xcc xccVar9 = kjcVar6.f47438f;
                                        kjc.m15280l(xccVar9);
                                        xccVar9.f68075H.m17923a("Registered app receiver");
                                        if (z2) {
                                            kjc.m15277i(kjcVar5.f47422P);
                                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                        }
                                    }
                                    c3552rx = qfcVar.f57729g;
                                    npcVarM19933K = qfcVar.m19933K();
                                    int i5 = npcVarM19933K.f53110b;
                                    zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                                    zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                                    zzjiVar = zzji.UNINITIALIZED;
                                    if (zzjiVarM4874T == zzjiVar || zzjiVarM4874T2 != zzjiVar) {
                                        kjcVar2 = kjcVar5;
                                        occVar5 = occVar4;
                                        if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                            EnumMap enumMap = new EnumMap(zzjk.class);
                                            enumMap.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                            enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                            npcVar = new npc(enumMap, -10);
                                        }
                                        if (npcVar != null) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5869Z(npcVar, true);
                                        } else {
                                            npcVar = npcVarM19933K;
                                        }
                                        kjc.m15279k(c1043b);
                                        kjcVar3 = (kjc) c1043b.f60774a;
                                        c1043b.m5873d0(npcVar);
                                        qfcVar.mo12359D();
                                        int i6 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                                        zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                                        if (zzjiVarM4874T3 != zzjiVar) {
                                            kjc.m15280l(xccVar2);
                                            occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                                        }
                                        zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                                        if (zzjiVarM4874T4 == zzjiVar && npc.m17587l(-10, i6)) {
                                            kjc.m15279k(c1043b);
                                            EnumMap enumMap2 = new EnumMap(zzjk.class);
                                            enumMap2.put(zzjk.AD_USER_DATA, zzjiVarM4874T4);
                                            c1043b.m5868Y(new mob(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K()) && (i6 == 0 || i6 == 30)) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                        boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                                        if (boolM4871Q != null || boolM4871Q.booleanValue()) {
                                            kjc.m15280l(xccVar2);
                                            occVar.m17923a("TCF client enabled.");
                                            kjc.m15279k(c1043b);
                                            c1043b.mo12359D();
                                            xcc xccVar10 = kjcVar3.f47438f;
                                            kjc.m15280l(xccVar10);
                                            xccVar10.f68075H.m17923a("Register tcfPrefChangeListener.");
                                            if (c1043b.f12322O == null) {
                                                c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                                c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str12) {
                                                        C1043b c1043b2 = c1043b;
                                                        c1043b2.getClass();
                                                        if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                            xcc xccVar11 = ((kjc) c1043b2.f60774a).f47438f;
                                                            kjc.m15280l(xccVar11);
                                                            xccVar11.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                            dsc dscVar = c1043b2.f12323P;
                                                            lda.m16130p(dscVar);
                                                            dscVar.m25215b(500L);
                                                        }
                                                    }
                                                };
                                            }
                                            qfc qfcVar2 = kjcVar3.f47437e;
                                            kjc.m15278j(qfcVar2);
                                            qfcVar2.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                            kjc.m15279k(c1043b);
                                            c1043b.m5853J();
                                        }
                                        qg9Var = qfcVar.f57728f;
                                        if (qg9Var.m19952g() == 0) {
                                            kjc.m15280l(xccVar2);
                                            occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                                            qg9Var.m19953h(j2);
                                        }
                                        kjc.m15279k(c1043b);
                                        gw9Var = c1043b.f12319L;
                                        if (gw9Var.m12942m() && gw9Var.m12941l()) {
                                            qfc qfcVar3 = ((kjc) gw9Var.f41432b).f47437e;
                                            kjc.m15278j(qfcVar3);
                                            qfcVar3.f57722R.m20981p(null);
                                        }
                                        if (kjcVar2.m15284h()) {
                                            kjcVar4 = kjcVar2;
                                            if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                                c3552rx2 = c3552rx;
                                            } else {
                                                String strM21929K = kjcVar4.m15289q().m21929K();
                                                qfcVar.mo12359D();
                                                String string3 = qfcVar.m19930H().getString("gmp_app_id", null);
                                                zIsEmpty = TextUtils.isEmpty(strM21929K);
                                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                                if (!zIsEmpty || zIsEmpty2) {
                                                    c3552rx2 = c3552rx;
                                                } else {
                                                    lda.m16130p(strM21929K);
                                                    if (strM21929K.equals(string3)) {
                                                        c3552rx2 = c3552rx;
                                                    } else {
                                                        kjc.m15280l(xccVar2);
                                                        occVar2.m17923a("Rechecking which service to use due to a GMP App Id change");
                                                        qfcVar.mo12359D();
                                                        qfcVar.mo12359D();
                                                        Boolean boolValueOf = qfcVar.m19930H().contains("measurement_enabled") ? Boolean.valueOf(qfcVar.m19930H().getBoolean("measurement_enabled", true)) : null;
                                                        SharedPreferences.Editor editorEdit2 = qfcVar.m19930H().edit();
                                                        editorEdit2.clear();
                                                        editorEdit2.apply();
                                                        if (boolValueOf != null) {
                                                            qfcVar.mo12359D();
                                                            SharedPreferences.Editor editorEdit3 = qfcVar.m19930H().edit();
                                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                            editorEdit3.apply();
                                                        }
                                                        kjcVar4.m15286n().m14375H();
                                                        kjcVar4.f47419M.m23111L();
                                                        kjcVar4.f47419M.m23109J();
                                                        qg9Var.m19953h(j2);
                                                        c3552rx2 = c3552rx;
                                                        c3552rx2.m20981p(null);
                                                    }
                                                }
                                                String strM21929K2 = kjcVar4.m15289q().m21929K();
                                                qfcVar.mo12359D();
                                                SharedPreferences.Editor editorEdit4 = qfcVar.m19930H().edit();
                                                editorEdit4.putString("gmp_app_id", strM21929K2);
                                                editorEdit4.apply();
                                            }
                                            if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                                c3552rx2.m20981p(null);
                                            }
                                            kjc.m15279k(c1043b);
                                            c1043b.f12329g.set(c3552rx2.m20980o());
                                            try {
                                                kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused4) {
                                                C3552rx c3552rx3 = qfcVar.f57721Q;
                                                if (!TextUtils.isEmpty(c3552rx3.m20980o())) {
                                                    kjc.m15280l(xccVar2);
                                                    xccVar = xccVar2;
                                                    xccVar.f68083i.m17923a("Remote config removed with active feature rollouts");
                                                    c3552rx3.m20981p(null);
                                                }
                                                if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                                    zM15282f = kjcVar4.m15282f();
                                                    sharedPreferences = qfcVar.f57725c;
                                                    if (sharedPreferences == null) {
                                                        zContains = false;
                                                    } else {
                                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                    }
                                                    if (!zContains) {
                                                        qfcVar.m19934L(!zM15282f);
                                                    }
                                                    if (zM15282f) {
                                                        kjc.m15279k(c1043b);
                                                        c1043b.m5859P();
                                                    }
                                                    s6d s6dVar = kjcVar4.f47440h;
                                                    kjc.m15279k(s6dVar);
                                                    s6dVar.f60441e.m12936e();
                                                    kjcVar4.m15287o().m23107H(new AtomicReference());
                                                    kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                                                }
                                                blb.m3870a();
                                                if (cmbVar.m4869O(null, z8c.f71132P0)) {
                                                    radVar2.mo12359D();
                                                    if (radVar2.m20540Z() == 1) {
                                                        long jIntValue = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                                        long jNextInt = new Random().nextInt(5000);
                                                        kjcVar4.f47443k.getClass();
                                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                        if (jMax > 500) {
                                                            kjc.m15280l(xccVar);
                                                            occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                        }
                                                        kjc.m15279k(c1043b);
                                                        c1043b.mo12359D();
                                                        if (c1043b.f12334l == null) {
                                                            c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                                        }
                                                        c1043b.f12334l.m25215b(jMax);
                                                    }
                                                }
                                                qfcVar.f57714J.m22720b(true);
                                                return;
                                            }
                                            xccVar = xccVar2;
                                            if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                                zM15282f = kjcVar4.m15282f();
                                                sharedPreferences = qfcVar.f57725c;
                                                if (sharedPreferences == null) {
                                                    zContains = false;
                                                } else {
                                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                                }
                                                if (!zContains && !cmbVar.m4872R()) {
                                                    qfcVar.m19934L(!zM15282f);
                                                }
                                                if (zM15282f) {
                                                    kjc.m15279k(c1043b);
                                                    c1043b.m5859P();
                                                }
                                                s6d s6dVar2 = kjcVar4.f47440h;
                                                kjc.m15279k(s6dVar2);
                                                s6dVar2.f60441e.m12936e();
                                                kjcVar4.m15287o().m23107H(new AtomicReference());
                                                kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                                            }
                                            break;
                                        } else {
                                            if (kjcVar2.m15282f()) {
                                                if (radVar2.m20543f0("android.permission.INTERNET")) {
                                                    occVar6 = occVar5;
                                                } else {
                                                    kjc.m15280l(xccVar2);
                                                    occVar6 = occVar5;
                                                    occVar6.m17923a("App is missing INTERNET permission");
                                                }
                                                if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                                    kjc.m15280l(xccVar2);
                                                    occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                                                }
                                                kjcVar4 = kjcVar2;
                                                context = kjcVar4.f47433a;
                                                if (!m9b.m16702a(context).m23950c() && !cmbVar.m4861G()) {
                                                    if (!rad.m20513x0(context)) {
                                                        kjc.m15280l(xccVar2);
                                                        occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                                    }
                                                    if (!rad.m20506Y(context)) {
                                                        kjc.m15280l(xccVar2);
                                                        occVar6.m17923a("AppMeasurementService not registered/enabled");
                                                    }
                                                }
                                                kjc.m15280l(xccVar2);
                                                occVar6.m17923a("Uploading is not possible. App measurement disabled");
                                            } else {
                                                kjcVar4 = kjcVar2;
                                            }
                                            xccVar = xccVar2;
                                        }
                                        blb.m3870a();
                                        if (cmbVar.m4869O(null, z8c.f71132P0)) {
                                            radVar2.mo12359D();
                                            if (radVar2.m20540Z() == 1) {
                                                long jIntValue2 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                                long jNextInt2 = new Random().nextInt(5000);
                                                kjcVar4.f47443k.getClass();
                                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    kjc.m15280l(xccVar);
                                                    occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                kjc.m15279k(c1043b);
                                                c1043b.mo12359D();
                                                if (c1043b.f12334l == null) {
                                                    c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                                }
                                                c1043b.f12334l.m25215b(jMax);
                                            }
                                        }
                                        qfcVar.f57714J.m22720b(true);
                                        return;
                                    }
                                    occVar5 = occVar4;
                                    kjcVar2 = kjcVar5;
                                    if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K()) && (i5 == 0 || i5 == 30 || i5 == 10 || i5 == 40)) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5869Z(new npc(-10), false);
                                    }
                                    npcVar = null;
                                    if (npcVar != null) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5869Z(npcVar, true);
                                    } else {
                                        npcVar = npcVarM19933K;
                                    }
                                    kjc.m15279k(c1043b);
                                    kjcVar3 = (kjc) c1043b.f60774a;
                                    c1043b.m5873d0(npcVar);
                                    qfcVar.mo12359D();
                                    int i7 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                                    zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (zzjiVarM4874T3 != zzjiVar) {
                                        kjc.m15280l(xccVar2);
                                        occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                                    }
                                    zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                                    if (zzjiVarM4874T4 == zzjiVar) {
                                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                    } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                    boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                                    if (boolM4871Q != null) {
                                        kjc.m15280l(xccVar2);
                                        occVar.m17923a("TCF client enabled.");
                                        kjc.m15279k(c1043b);
                                        c1043b.mo12359D();
                                        xcc xccVar11 = kjcVar3.f47438f;
                                        kjc.m15280l(xccVar11);
                                        xccVar11.f68075H.m17923a("Register tcfPrefChangeListener.");
                                        if (c1043b.f12322O == null) {
                                            c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                            c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str12) {
                                                    C1043b c1043b2 = c1043b;
                                                    c1043b2.getClass();
                                                    if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        xcc xccVar12 = ((kjc) c1043b2.f60774a).f47438f;
                                                        kjc.m15280l(xccVar12);
                                                        xccVar12.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                        dsc dscVar = c1043b2.f12323P;
                                                        lda.m16130p(dscVar);
                                                        dscVar.m25215b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        qfc qfcVar4 = kjcVar3.f47437e;
                                        kjc.m15278j(qfcVar4);
                                        qfcVar4.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                        kjc.m15279k(c1043b);
                                        c1043b.m5853J();
                                    } else {
                                        kjc.m15280l(xccVar2);
                                        occVar.m17923a("TCF client enabled.");
                                        kjc.m15279k(c1043b);
                                        c1043b.mo12359D();
                                        xcc xccVar12 = kjcVar3.f47438f;
                                        kjc.m15280l(xccVar12);
                                        xccVar12.f68075H.m17923a("Register tcfPrefChangeListener.");
                                        if (c1043b.f12322O == null) {
                                            c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                            c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str12) {
                                                    C1043b c1043b2 = c1043b;
                                                    c1043b2.getClass();
                                                    if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        xcc xccVar13 = ((kjc) c1043b2.f60774a).f47438f;
                                                        kjc.m15280l(xccVar13);
                                                        xccVar13.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                        dsc dscVar = c1043b2.f12323P;
                                                        lda.m16130p(dscVar);
                                                        dscVar.m25215b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        qfc qfcVar5 = kjcVar3.f47437e;
                                        kjc.m15278j(qfcVar5);
                                        qfcVar5.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                        kjc.m15279k(c1043b);
                                        c1043b.m5853J();
                                    }
                                    qg9Var = qfcVar.f57728f;
                                    if (qg9Var.m19952g() == 0) {
                                        kjc.m15280l(xccVar2);
                                        occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                                        qg9Var.m19953h(j2);
                                    }
                                    kjc.m15279k(c1043b);
                                    gw9Var = c1043b.f12319L;
                                    if (gw9Var.m12942m()) {
                                        qfc qfcVar6 = ((kjc) gw9Var.f41432b).f47437e;
                                        kjc.m15278j(qfcVar6);
                                        qfcVar6.f57722R.m20981p(null);
                                    }
                                    if (kjcVar2.m15284h()) {
                                        if (kjcVar2.m15282f()) {
                                            if (radVar2.m20543f0("android.permission.INTERNET")) {
                                                kjc.m15280l(xccVar2);
                                                occVar6 = occVar5;
                                                occVar6.m17923a("App is missing INTERNET permission");
                                            } else {
                                                occVar6 = occVar5;
                                            }
                                            if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                                kjc.m15280l(xccVar2);
                                                occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            kjcVar4 = kjcVar2;
                                            context = kjcVar4.f47433a;
                                            if (!m9b.m16702a(context).m23950c()) {
                                                if (!rad.m20513x0(context)) {
                                                    kjc.m15280l(xccVar2);
                                                    occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!rad.m20506Y(context)) {
                                                    kjc.m15280l(xccVar2);
                                                    occVar6.m17923a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            kjc.m15280l(xccVar2);
                                            occVar6.m17923a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            kjcVar4 = kjcVar2;
                                        }
                                        xccVar = xccVar2;
                                    } else {
                                        kjcVar4 = kjcVar2;
                                        if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                            String strM21929K3 = kjcVar4.m15289q().m21929K();
                                            qfcVar.mo12359D();
                                            String string4 = qfcVar.m19930H().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strM21929K3);
                                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                                            if (zIsEmpty) {
                                                c3552rx2 = c3552rx;
                                            } else {
                                                c3552rx2 = c3552rx;
                                            }
                                            String strM21929K4 = kjcVar4.m15289q().m21929K();
                                            qfcVar.mo12359D();
                                            SharedPreferences.Editor editorEdit5 = qfcVar.m19930H().edit();
                                            editorEdit5.putString("gmp_app_id", strM21929K4);
                                            editorEdit5.apply();
                                        } else {
                                            c3552rx2 = c3552rx;
                                        }
                                        if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                            c3552rx2.m20981p(null);
                                        }
                                        kjc.m15279k(c1043b);
                                        c1043b.f12329g.set(c3552rx2.m20980o());
                                        kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        xccVar = xccVar2;
                                        if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                            zM15282f = kjcVar4.m15282f();
                                            sharedPreferences = qfcVar.f57725c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                qfcVar.m19934L(!zM15282f);
                                            }
                                            if (zM15282f) {
                                                kjc.m15279k(c1043b);
                                                c1043b.m5859P();
                                            }
                                            s6d s6dVar3 = kjcVar4.f47440h;
                                            kjc.m15279k(s6dVar3);
                                            s6dVar3.f60441e.m12936e();
                                            kjcVar4.m15287o().m23107H(new AtomicReference());
                                            kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                                        }
                                    }
                                    blb.m3870a();
                                    if (cmbVar.m4869O(null, z8c.f71132P0)) {
                                        radVar2.mo12359D();
                                        if (radVar2.m20540Z() == 1) {
                                            long jIntValue3 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                            long jNextInt3 = new Random().nextInt(5000);
                                            kjcVar4.f47443k.getClass();
                                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                kjc.m15280l(xccVar);
                                                occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            kjc.m15279k(c1043b);
                                            c1043b.mo12359D();
                                            if (c1043b.f12334l == null) {
                                                c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                            }
                                            c1043b.f12334l.m25215b(jMax);
                                        }
                                    }
                                    qfcVar.f57714J.m22720b(true);
                                    return;
                                }
                                xcc xccVar13 = kjcVar.f47438f;
                                kjc.m15280l(xccVar13);
                                xccVar13.f68080f.m17923a("Failed to load metadata: Metadata bundle is null");
                                numValueOf = null;
                                if (numValueOf != null) {
                                    stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = Arrays.asList(stringArray);
                                    } else {
                                        listAsList = null;
                                    }
                                    break;
                                } else {
                                    listAsList = null;
                                }
                                if (listAsList != null) {
                                    tacVar2.f62083k = listAsList;
                                } else if (listAsList.isEmpty()) {
                                    kjc.m15280l(xccVar5);
                                    xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                                } else {
                                    it = listAsList.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            str9 = (String) it.next();
                                            radVar = kjcVar7.f47441i;
                                            kjc.m15278j(radVar);
                                        } else {
                                            tacVar2.f62083k = listAsList;
                                        }
                                    } while (radVar.m20519G0("safelisted event", str9));
                                }
                                if (packageManager != null) {
                                    tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                                } else {
                                    tacVar2.f62070I = 0;
                                }
                                ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                                tacVar2.f43749b = true;
                                oycVar = new oyc(kjcVar5);
                                oycVar.m13745F();
                                kjcVar5.f47422P = oycVar;
                                if (!oycVar.f43749b) {
                                    C3386nv.m17633t(str2);
                                    return;
                                }
                                oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                                ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                                oycVar.f43749b = true;
                                kjc.m15280l(xccVar2);
                                occVar = xccVar2.f68075H;
                                occVar2 = xccVar2.f68086l;
                                occVar3 = xccVar2.f68076I;
                                occVar4 = xccVar2.f68080f;
                                cmbVar.m4864J();
                                occVar2.m17924b(161000L, "App measurement initialized, version");
                                kjc.m15280l(xccVar2);
                                occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                strM21928J = tacVar.m21928J();
                                if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                                    kjc.m15280l(xccVar2);
                                    occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    kjc.m15280l(xccVar2);
                                    occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                                }
                                kjc.m15280l(xccVar2);
                                occVar.m17923a("Debug-level message logging enabled");
                                i = kjcVar5.f47428V;
                                atomicInteger = kjcVar5.f47430X;
                                if (i != atomicInteger.get()) {
                                    kjc.m15280l(xccVar2);
                                    occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                                }
                                kjcVar5.f47423Q = true;
                                j2 = kjcVar5.f47431Y;
                                c1043b = kjcVar5.f47414H;
                                tic ticVar3 = kjcVar5.f47439g;
                                kjc.m15280l(ticVar3);
                                ticVar3.mo12359D();
                                kjc.m15277i(kjcVar5.f47422P);
                                zzinVarM18841I = kjcVar5.f47422P.m18841I();
                                zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                                blb.m3870a();
                                zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                                if (zzinVarM18841I == zzinVar) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (zM4869O) {
                                    radVar2.mo12359D();
                                    if (radVar2.m20540Z() == 1) {
                                        radVar2.mo12359D();
                                        IntentFilter intentFilter4 = new IntentFilter();
                                        intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z2 = z;
                                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter4);
                                        xcc xccVar14 = kjcVar6.f47438f;
                                        kjc.m15280l(xccVar14);
                                        xccVar14.f68075H.m17923a("Registered app receiver");
                                        if (z2) {
                                            kjc.m15277i(kjcVar5.f47422P);
                                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                        }
                                    } else if (z) {
                                        z = true;
                                        radVar2.mo12359D();
                                        IntentFilter intentFilter5 = new IntentFilter();
                                        intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        z2 = z;
                                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter5);
                                        xcc xccVar15 = kjcVar6.f47438f;
                                        kjc.m15280l(xccVar15);
                                        xccVar15.f68075H.m17923a("Registered app receiver");
                                        if (z2) {
                                            kjc.m15277i(kjcVar5.f47422P);
                                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                        }
                                    }
                                } else if (z) {
                                    z = true;
                                    radVar2.mo12359D();
                                    IntentFilter intentFilter6 = new IntentFilter();
                                    intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter6);
                                    xcc xccVar16 = kjcVar6.f47438f;
                                    kjc.m15280l(xccVar16);
                                    xccVar16.f68075H.m17923a("Registered app receiver");
                                    if (z2) {
                                        kjc.m15277i(kjcVar5.f47422P);
                                        kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                    }
                                }
                                c3552rx = qfcVar.f57729g;
                                npcVarM19933K = qfcVar.m19933K();
                                int i8 = npcVarM19933K.f53110b;
                                zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                                zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                                zzjiVar = zzji.UNINITIALIZED;
                                if (zzjiVarM4874T == zzjiVar) {
                                    kjcVar2 = kjcVar5;
                                    occVar5 = occVar4;
                                    if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                        EnumMap enumMap3 = new EnumMap(zzjk.class);
                                        enumMap3.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                        enumMap3.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                        npcVar = new npc(enumMap3, -10);
                                    } else {
                                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5869Z(new npc(-10), false);
                                        }
                                        npcVar = null;
                                    }
                                } else {
                                    kjcVar2 = kjcVar5;
                                    occVar5 = occVar4;
                                    if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                        EnumMap enumMap4 = new EnumMap(zzjk.class);
                                        enumMap4.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                        enumMap4.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                        npcVar = new npc(enumMap4, -10);
                                    } else {
                                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5869Z(new npc(-10), false);
                                        }
                                        npcVar = null;
                                    }
                                }
                                if (npcVar != null) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5869Z(npcVar, true);
                                } else {
                                    npcVar = npcVarM19933K;
                                }
                                kjc.m15279k(c1043b);
                                kjcVar3 = (kjc) c1043b.f60774a;
                                c1043b.m5873d0(npcVar);
                                qfcVar.mo12359D();
                                int i9 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                                zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                                if (zzjiVarM4874T3 != zzjiVar) {
                                    kjc.m15280l(xccVar2);
                                    occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                                }
                                zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                                if (zzjiVarM4874T4 == zzjiVar) {
                                    if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                    }
                                } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                                if (boolM4871Q != null) {
                                    kjc.m15280l(xccVar2);
                                    occVar.m17923a("TCF client enabled.");
                                    kjc.m15279k(c1043b);
                                    c1043b.mo12359D();
                                    xcc xccVar17 = kjcVar3.f47438f;
                                    kjc.m15280l(xccVar17);
                                    xccVar17.f68075H.m17923a("Register tcfPrefChangeListener.");
                                    if (c1043b.f12322O == null) {
                                        c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                        c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str12) {
                                                C1043b c1043b2 = c1043b;
                                                c1043b2.getClass();
                                                if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    xcc xccVar18 = ((kjc) c1043b2.f60774a).f47438f;
                                                    kjc.m15280l(xccVar18);
                                                    xccVar18.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                    dsc dscVar = c1043b2.f12323P;
                                                    lda.m16130p(dscVar);
                                                    dscVar.m25215b(500L);
                                                }
                                            }
                                        };
                                    }
                                    qfc qfcVar7 = kjcVar3.f47437e;
                                    kjc.m15278j(qfcVar7);
                                    qfcVar7.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                    kjc.m15279k(c1043b);
                                    c1043b.m5853J();
                                } else {
                                    kjc.m15280l(xccVar2);
                                    occVar.m17923a("TCF client enabled.");
                                    kjc.m15279k(c1043b);
                                    c1043b.mo12359D();
                                    xcc xccVar18 = kjcVar3.f47438f;
                                    kjc.m15280l(xccVar18);
                                    xccVar18.f68075H.m17923a("Register tcfPrefChangeListener.");
                                    if (c1043b.f12322O == null) {
                                        c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                        c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str12) {
                                                C1043b c1043b2 = c1043b;
                                                c1043b2.getClass();
                                                if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    xcc xccVar19 = ((kjc) c1043b2.f60774a).f47438f;
                                                    kjc.m15280l(xccVar19);
                                                    xccVar19.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                    dsc dscVar = c1043b2.f12323P;
                                                    lda.m16130p(dscVar);
                                                    dscVar.m25215b(500L);
                                                }
                                            }
                                        };
                                    }
                                    qfc qfcVar8 = kjcVar3.f47437e;
                                    kjc.m15278j(qfcVar8);
                                    qfcVar8.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                    kjc.m15279k(c1043b);
                                    c1043b.m5853J();
                                }
                                qg9Var = qfcVar.f57728f;
                                if (qg9Var.m19952g() == 0) {
                                    kjc.m15280l(xccVar2);
                                    occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                                    qg9Var.m19953h(j2);
                                }
                                kjc.m15279k(c1043b);
                                gw9Var = c1043b.f12319L;
                                if (gw9Var.m12942m()) {
                                    qfc qfcVar9 = ((kjc) gw9Var.f41432b).f47437e;
                                    kjc.m15278j(qfcVar9);
                                    qfcVar9.f57722R.m20981p(null);
                                }
                                if (kjcVar2.m15284h()) {
                                    if (kjcVar2.m15282f()) {
                                        if (radVar2.m20543f0("android.permission.INTERNET")) {
                                            kjc.m15280l(xccVar2);
                                            occVar6 = occVar5;
                                            occVar6.m17923a("App is missing INTERNET permission");
                                        } else {
                                            occVar6 = occVar5;
                                        }
                                        if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                            kjc.m15280l(xccVar2);
                                            occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        kjcVar4 = kjcVar2;
                                        context = kjcVar4.f47433a;
                                        if (!m9b.m16702a(context).m23950c()) {
                                            if (!rad.m20513x0(context)) {
                                                kjc.m15280l(xccVar2);
                                                occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!rad.m20506Y(context)) {
                                                kjc.m15280l(xccVar2);
                                                occVar6.m17923a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        kjc.m15280l(xccVar2);
                                        occVar6.m17923a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        kjcVar4 = kjcVar2;
                                    }
                                    xccVar = xccVar2;
                                } else {
                                    kjcVar4 = kjcVar2;
                                    if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                        String strM21929K5 = kjcVar4.m15289q().m21929K();
                                        qfcVar.mo12359D();
                                        String string5 = qfcVar.m19930H().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strM21929K5);
                                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                                        if (zIsEmpty) {
                                            c3552rx2 = c3552rx;
                                        } else {
                                            c3552rx2 = c3552rx;
                                        }
                                        String strM21929K6 = kjcVar4.m15289q().m21929K();
                                        qfcVar.mo12359D();
                                        SharedPreferences.Editor editorEdit6 = qfcVar.m19930H().edit();
                                        editorEdit6.putString("gmp_app_id", strM21929K6);
                                        editorEdit6.apply();
                                    } else {
                                        c3552rx2 = c3552rx;
                                    }
                                    if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                        c3552rx2.m20981p(null);
                                    }
                                    kjc.m15279k(c1043b);
                                    c1043b.f12329g.set(c3552rx2.m20980o());
                                    kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    xccVar = xccVar2;
                                    if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                        zM15282f = kjcVar4.m15282f();
                                        sharedPreferences = qfcVar.f57725c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            qfcVar.m19934L(!zM15282f);
                                        }
                                        if (zM15282f) {
                                            kjc.m15279k(c1043b);
                                            c1043b.m5859P();
                                        }
                                        s6d s6dVar4 = kjcVar4.f47440h;
                                        kjc.m15279k(s6dVar4);
                                        s6dVar4.f60441e.m12936e();
                                        kjcVar4.m15287o().m23107H(new AtomicReference());
                                        kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                                    }
                                }
                                blb.m3870a();
                                if (cmbVar.m4869O(null, z8c.f71132P0)) {
                                    radVar2.mo12359D();
                                    if (radVar2.m20540Z() == 1) {
                                        long jIntValue4 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                        long jNextInt4 = new Random().nextInt(5000);
                                        kjcVar4.f47443k.getClass();
                                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            kjc.m15280l(xccVar);
                                            occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        kjc.m15279k(c1043b);
                                        c1043b.mo12359D();
                                        if (c1043b.f12334l == null) {
                                            c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                        }
                                        c1043b.f12334l.m25215b(jMax);
                                    }
                                }
                                qfcVar.f57714J.m22720b(true);
                                return;
                            }
                            installerPackageName = "manual_install";
                            packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                            if (packageInfo != null) {
                                applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (TextUtils.isEmpty(applicationLabel)) {
                                    string = applicationLabel.toString();
                                } else {
                                    string = str;
                                }
                                str8 = packageInfo.versionName;
                                int i10 = packageInfo.versionCode;
                                String str12 = str3;
                                str7 = str8;
                                str6 = str12;
                                packageManager = packageManager;
                                i3 = i10;
                                str5 = string;
                            } else {
                                str6 = str3;
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            str4 = str;
                        }
                        str3 = installerPackageName;
                        tacVar2.f62075c = packageName;
                        tacVar2.f62078f = str6;
                        tacVar2.f62076d = str7;
                        tacVar2.f62077e = i3;
                        tacVar2.f62079g = str5;
                        tacVar2.f62080h = 0L;
                        iM15283g = kjcVar7.m15283g();
                        if (iM15283g == 0) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68076I.m17923a("App measurement collection enabled");
                        } else if (iM15283g == 1) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement deactivated via the manifest");
                        } else if (iM15283g == 3) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iM15283g == 4) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement disabled via the manifest");
                        } else if (iM15283g == 6) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68085k.m17923a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iM15283g == 7) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement disabled via the global data collection setting");
                        } else if (iM15283g != 8) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement disabled");
                            kjc.m15280l(xccVar5);
                            xccVar5.f68081g.m17923a("Invalid scion state in identity");
                        } else {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68086l.m17923a("App measurement disabled due to denied storage consent");
                        }
                        tacVar2.f62071J = "";
                        strM6879d = tacVar2.f62069H;
                        if (TextUtils.isEmpty(strM6879d)) {
                            strM6879d = C1191l.m6879d(context2, kjcVar7.f47417K);
                        }
                        if (!TextUtils.isEmpty(strM6879d)) {
                            str10 = strM6879d;
                        }
                        tacVar2.f62071J = str10;
                        if (iM15283g == 0) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68076I.m17925c("App measurement enabled for app package, google app id", tacVar2.f62075c, tacVar2.f62071J);
                            break;
                        }
                        tacVar2.f62083k = null;
                        cmb cmbVar3 = kjcVar7.f47436d;
                        kjcVar = (kjc) cmbVar3.f60774a;
                        lda.m16127m("analytics.safelisted_events");
                        bundleM4870P = cmbVar3.m4870P();
                        if (bundleM4870P != null) {
                            if (bundleM4870P.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleM4870P.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                                if (stringArray == null) {
                                    listAsList = Arrays.asList(stringArray);
                                } else {
                                    listAsList = null;
                                }
                                break;
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                tacVar2.f62083k = listAsList;
                            } else if (listAsList.isEmpty()) {
                                kjc.m15280l(xccVar5);
                                xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                            } else {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        str9 = (String) it.next();
                                        radVar = kjcVar7.f47441i;
                                        kjc.m15278j(radVar);
                                    } else {
                                        tacVar2.f62083k = listAsList;
                                    }
                                } while (radVar.m20519G0("safelisted event", str9));
                            }
                            if (packageManager != null) {
                                tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                            } else {
                                tacVar2.f62070I = 0;
                            }
                            ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                            tacVar2.f43749b = true;
                            oycVar = new oyc(kjcVar5);
                            oycVar.m13745F();
                            kjcVar5.f47422P = oycVar;
                            if (!oycVar.f43749b) {
                                C3386nv.m17633t(str2);
                                return;
                            }
                            oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                            ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                            oycVar.f43749b = true;
                            kjc.m15280l(xccVar2);
                            occVar = xccVar2.f68075H;
                            occVar2 = xccVar2.f68086l;
                            occVar3 = xccVar2.f68076I;
                            occVar4 = xccVar2.f68080f;
                            cmbVar.m4864J();
                            occVar2.m17924b(161000L, "App measurement initialized, version");
                            kjc.m15280l(xccVar2);
                            occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM21928J = tacVar.m21928J();
                            if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                                kjc.m15280l(xccVar2);
                                occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                kjc.m15280l(xccVar2);
                                occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                            }
                            kjc.m15280l(xccVar2);
                            occVar.m17923a("Debug-level message logging enabled");
                            i = kjcVar5.f47428V;
                            atomicInteger = kjcVar5.f47430X;
                            if (i != atomicInteger.get()) {
                                kjc.m15280l(xccVar2);
                                occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                            }
                            kjcVar5.f47423Q = true;
                            j2 = kjcVar5.f47431Y;
                            c1043b = kjcVar5.f47414H;
                            tic ticVar4 = kjcVar5.f47439g;
                            kjc.m15280l(ticVar4);
                            ticVar4.mo12359D();
                            kjc.m15277i(kjcVar5.f47422P);
                            zzinVarM18841I = kjcVar5.f47422P.m18841I();
                            zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                            blb.m3870a();
                            zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                            if (zzinVarM18841I == zzinVar) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zM4869O) {
                                radVar2.mo12359D();
                                if (radVar2.m20540Z() == 1) {
                                    radVar2.mo12359D();
                                    IntentFilter intentFilter7 = new IntentFilter();
                                    intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter7);
                                    xcc xccVar19 = kjcVar6.f47438f;
                                    kjc.m15280l(xccVar19);
                                    xccVar19.f68075H.m17923a("Registered app receiver");
                                    if (z2) {
                                        kjc.m15277i(kjcVar5.f47422P);
                                        kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    radVar2.mo12359D();
                                    IntentFilter intentFilter8 = new IntentFilter();
                                    intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter8);
                                    xcc xccVar110 = kjcVar6.f47438f;
                                    kjc.m15280l(xccVar110);
                                    xccVar110.f68075H.m17923a("Registered app receiver");
                                    if (z2) {
                                        kjc.m15277i(kjcVar5.f47422P);
                                        kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                    }
                                }
                            } else if (z) {
                                z = true;
                                radVar2.mo12359D();
                                IntentFilter intentFilter9 = new IntentFilter();
                                intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter9);
                                xcc xccVar111 = kjcVar6.f47438f;
                                kjc.m15280l(xccVar111);
                                xccVar111.f68075H.m17923a("Registered app receiver");
                                if (z2) {
                                    kjc.m15277i(kjcVar5.f47422P);
                                    kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                }
                            }
                            c3552rx = qfcVar.f57729g;
                            npcVarM19933K = qfcVar.m19933K();
                            int i11 = npcVarM19933K.f53110b;
                            zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                            zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                            zzjiVar = zzji.UNINITIALIZED;
                            if (zzjiVarM4874T == zzjiVar) {
                                kjcVar2 = kjcVar5;
                                occVar5 = occVar4;
                                if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                    EnumMap enumMap5 = new EnumMap(zzjk.class);
                                    enumMap5.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                    enumMap5.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                    npcVar = new npc(enumMap5, -10);
                                } else {
                                    if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5869Z(new npc(-10), false);
                                    }
                                    npcVar = null;
                                }
                            } else {
                                kjcVar2 = kjcVar5;
                                occVar5 = occVar4;
                                if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                    EnumMap enumMap6 = new EnumMap(zzjk.class);
                                    enumMap6.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                    enumMap6.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                    npcVar = new npc(enumMap6, -10);
                                } else {
                                    if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5869Z(new npc(-10), false);
                                    }
                                    npcVar = null;
                                }
                            }
                            if (npcVar != null) {
                                kjc.m15279k(c1043b);
                                c1043b.m5869Z(npcVar, true);
                            } else {
                                npcVar = npcVarM19933K;
                            }
                            kjc.m15279k(c1043b);
                            kjcVar3 = (kjc) c1043b.f60774a;
                            c1043b.m5873d0(npcVar);
                            qfcVar.mo12359D();
                            int i12 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                            zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                            if (zzjiVarM4874T3 != zzjiVar) {
                                kjc.m15280l(xccVar2);
                                occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                            }
                            zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                            if (zzjiVarM4874T4 == zzjiVar) {
                                if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                kjc.m15279k(c1043b);
                                c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                            if (boolM4871Q != null) {
                                kjc.m15280l(xccVar2);
                                occVar.m17923a("TCF client enabled.");
                                kjc.m15279k(c1043b);
                                c1043b.mo12359D();
                                xcc xccVar112 = kjcVar3.f47438f;
                                kjc.m15280l(xccVar112);
                                xccVar112.f68075H.m17923a("Register tcfPrefChangeListener.");
                                if (c1043b.f12322O == null) {
                                    c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                    c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                            C1043b c1043b2 = c1043b;
                                            c1043b2.getClass();
                                            if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                                xcc xccVar113 = ((kjc) c1043b2.f60774a).f47438f;
                                                kjc.m15280l(xccVar113);
                                                xccVar113.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                dsc dscVar = c1043b2.f12323P;
                                                lda.m16130p(dscVar);
                                                dscVar.m25215b(500L);
                                            }
                                        }
                                    };
                                }
                                qfc qfcVar10 = kjcVar3.f47437e;
                                kjc.m15278j(qfcVar10);
                                qfcVar10.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                kjc.m15279k(c1043b);
                                c1043b.m5853J();
                            } else {
                                kjc.m15280l(xccVar2);
                                occVar.m17923a("TCF client enabled.");
                                kjc.m15279k(c1043b);
                                c1043b.mo12359D();
                                xcc xccVar113 = kjcVar3.f47438f;
                                kjc.m15280l(xccVar113);
                                xccVar113.f68075H.m17923a("Register tcfPrefChangeListener.");
                                if (c1043b.f12322O == null) {
                                    c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                    c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                            C1043b c1043b2 = c1043b;
                                            c1043b2.getClass();
                                            if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                                xcc xccVar114 = ((kjc) c1043b2.f60774a).f47438f;
                                                kjc.m15280l(xccVar114);
                                                xccVar114.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                                dsc dscVar = c1043b2.f12323P;
                                                lda.m16130p(dscVar);
                                                dscVar.m25215b(500L);
                                            }
                                        }
                                    };
                                }
                                qfc qfcVar11 = kjcVar3.f47437e;
                                kjc.m15278j(qfcVar11);
                                qfcVar11.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                                kjc.m15279k(c1043b);
                                c1043b.m5853J();
                            }
                            qg9Var = qfcVar.f57728f;
                            if (qg9Var.m19952g() == 0) {
                                kjc.m15280l(xccVar2);
                                occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                                qg9Var.m19953h(j2);
                            }
                            kjc.m15279k(c1043b);
                            gw9Var = c1043b.f12319L;
                            if (gw9Var.m12942m()) {
                                qfc qfcVar12 = ((kjc) gw9Var.f41432b).f47437e;
                                kjc.m15278j(qfcVar12);
                                qfcVar12.f57722R.m20981p(null);
                            }
                            if (kjcVar2.m15284h()) {
                                if (kjcVar2.m15282f()) {
                                    if (radVar2.m20543f0("android.permission.INTERNET")) {
                                        kjc.m15280l(xccVar2);
                                        occVar6 = occVar5;
                                        occVar6.m17923a("App is missing INTERNET permission");
                                    } else {
                                        occVar6 = occVar5;
                                    }
                                    if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                        kjc.m15280l(xccVar2);
                                        occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    kjcVar4 = kjcVar2;
                                    context = kjcVar4.f47433a;
                                    if (!m9b.m16702a(context).m23950c()) {
                                        if (!rad.m20513x0(context)) {
                                            kjc.m15280l(xccVar2);
                                            occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!rad.m20506Y(context)) {
                                            kjc.m15280l(xccVar2);
                                            occVar6.m17923a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    kjc.m15280l(xccVar2);
                                    occVar6.m17923a("Uploading is not possible. App measurement disabled");
                                } else {
                                    kjcVar4 = kjcVar2;
                                }
                                xccVar = xccVar2;
                            } else {
                                kjcVar4 = kjcVar2;
                                if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                    String strM21929K7 = kjcVar4.m15289q().m21929K();
                                    qfcVar.mo12359D();
                                    String string6 = qfcVar.m19930H().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strM21929K7);
                                    boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                                    if (zIsEmpty) {
                                        c3552rx2 = c3552rx;
                                    } else {
                                        c3552rx2 = c3552rx;
                                    }
                                    String strM21929K8 = kjcVar4.m15289q().m21929K();
                                    qfcVar.mo12359D();
                                    SharedPreferences.Editor editorEdit7 = qfcVar.m19930H().edit();
                                    editorEdit7.putString("gmp_app_id", strM21929K8);
                                    editorEdit7.apply();
                                } else {
                                    c3552rx2 = c3552rx;
                                }
                                if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                    c3552rx2.m20981p(null);
                                }
                                kjc.m15279k(c1043b);
                                c1043b.f12329g.set(c3552rx2.m20980o());
                                kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                xccVar = xccVar2;
                                if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                    zM15282f = kjcVar4.m15282f();
                                    sharedPreferences = qfcVar.f57725c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        qfcVar.m19934L(!zM15282f);
                                    }
                                    if (zM15282f) {
                                        kjc.m15279k(c1043b);
                                        c1043b.m5859P();
                                    }
                                    s6d s6dVar5 = kjcVar4.f47440h;
                                    kjc.m15279k(s6dVar5);
                                    s6dVar5.f60441e.m12936e();
                                    kjcVar4.m15287o().m23107H(new AtomicReference());
                                    kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                                }
                            }
                            blb.m3870a();
                            if (cmbVar.m4869O(null, z8c.f71132P0)) {
                                radVar2.mo12359D();
                                if (radVar2.m20540Z() == 1) {
                                    long jIntValue5 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                    long jNextInt5 = new Random().nextInt(5000);
                                    kjcVar4.f47443k.getClass();
                                    jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        kjc.m15280l(xccVar);
                                        occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    kjc.m15279k(c1043b);
                                    c1043b.mo12359D();
                                    if (c1043b.f12334l == null) {
                                        c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                    }
                                    c1043b.f12334l.m25215b(jMax);
                                }
                            }
                            qfcVar.f57714J.m22720b(true);
                            return;
                        }
                        xcc xccVar114 = kjcVar.f47438f;
                        kjc.m15280l(xccVar114);
                        xccVar114.f68080f.m17923a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            } else {
                                listAsList = null;
                            }
                            break;
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            tacVar2.f62083k = listAsList;
                        } else if (listAsList.isEmpty()) {
                            kjc.m15280l(xccVar5);
                            xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                        } else {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    str9 = (String) it.next();
                                    radVar = kjcVar7.f47441i;
                                    kjc.m15278j(radVar);
                                } else {
                                    tacVar2.f62083k = listAsList;
                                }
                            } while (radVar.m20519G0("safelisted event", str9));
                        }
                        if (packageManager != null) {
                            tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                        } else {
                            tacVar2.f62070I = 0;
                        }
                        ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                        tacVar2.f43749b = true;
                        oycVar = new oyc(kjcVar5);
                        oycVar.m13745F();
                        kjcVar5.f47422P = oycVar;
                        if (!oycVar.f43749b) {
                            C3386nv.m17633t(str2);
                            return;
                        }
                        oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                        ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                        oycVar.f43749b = true;
                        kjc.m15280l(xccVar2);
                        occVar = xccVar2.f68075H;
                        occVar2 = xccVar2.f68086l;
                        occVar3 = xccVar2.f68076I;
                        occVar4 = xccVar2.f68080f;
                        cmbVar.m4864J();
                        occVar2.m17924b(161000L, "App measurement initialized, version");
                        kjc.m15280l(xccVar2);
                        occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM21928J = tacVar.m21928J();
                        if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                            kjc.m15280l(xccVar2);
                            occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            kjc.m15280l(xccVar2);
                            occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                        }
                        kjc.m15280l(xccVar2);
                        occVar.m17923a("Debug-level message logging enabled");
                        i = kjcVar5.f47428V;
                        atomicInteger = kjcVar5.f47430X;
                        if (i != atomicInteger.get()) {
                            kjc.m15280l(xccVar2);
                            occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                        }
                        kjcVar5.f47423Q = true;
                        j2 = kjcVar5.f47431Y;
                        c1043b = kjcVar5.f47414H;
                        tic ticVar5 = kjcVar5.f47439g;
                        kjc.m15280l(ticVar5);
                        ticVar5.mo12359D();
                        kjc.m15277i(kjcVar5.f47422P);
                        zzinVarM18841I = kjcVar5.f47422P.m18841I();
                        zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                        blb.m3870a();
                        zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                        if (zzinVarM18841I == zzinVar) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zM4869O) {
                            radVar2.mo12359D();
                            if (radVar2.m20540Z() == 1) {
                                radVar2.mo12359D();
                                IntentFilter intentFilter10 = new IntentFilter();
                                intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter10);
                                xcc xccVar115 = kjcVar6.f47438f;
                                kjc.m15280l(xccVar115);
                                xccVar115.f68075H.m17923a("Registered app receiver");
                                if (z2) {
                                    kjc.m15277i(kjcVar5.f47422P);
                                    kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                radVar2.mo12359D();
                                IntentFilter intentFilter11 = new IntentFilter();
                                intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter11);
                                xcc xccVar116 = kjcVar6.f47438f;
                                kjc.m15280l(xccVar116);
                                xccVar116.f68075H.m17923a("Registered app receiver");
                                if (z2) {
                                    kjc.m15277i(kjcVar5.f47422P);
                                    kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                                }
                            }
                        } else if (z) {
                            z = true;
                            radVar2.mo12359D();
                            IntentFilter intentFilter12 = new IntentFilter();
                            intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter12);
                            xcc xccVar117 = kjcVar6.f47438f;
                            kjc.m15280l(xccVar117);
                            xccVar117.f68075H.m17923a("Registered app receiver");
                            if (z2) {
                                kjc.m15277i(kjcVar5.f47422P);
                                kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                            }
                        }
                        c3552rx = qfcVar.f57729g;
                        npcVarM19933K = qfcVar.m19933K();
                        int i13 = npcVarM19933K.f53110b;
                        zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                        zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                        zzjiVar = zzji.UNINITIALIZED;
                        if (zzjiVarM4874T == zzjiVar) {
                            kjcVar2 = kjcVar5;
                            occVar5 = occVar4;
                            if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                EnumMap enumMap7 = new EnumMap(zzjk.class);
                                enumMap7.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                enumMap7.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                npcVar = new npc(enumMap7, -10);
                            } else {
                                if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5869Z(new npc(-10), false);
                                }
                                npcVar = null;
                            }
                        } else {
                            kjcVar2 = kjcVar5;
                            occVar5 = occVar4;
                            if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                                EnumMap enumMap8 = new EnumMap(zzjk.class);
                                enumMap8.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                                enumMap8.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                                npcVar = new npc(enumMap8, -10);
                            } else {
                                if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5869Z(new npc(-10), false);
                                }
                                npcVar = null;
                            }
                        }
                        if (npcVar != null) {
                            kjc.m15279k(c1043b);
                            c1043b.m5869Z(npcVar, true);
                        } else {
                            npcVar = npcVarM19933K;
                        }
                        kjc.m15279k(c1043b);
                        kjcVar3 = (kjc) c1043b.f60774a;
                        c1043b.m5873d0(npcVar);
                        qfcVar.mo12359D();
                        int i14 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                        zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                        if (zzjiVarM4874T3 != zzjiVar) {
                            kjc.m15280l(xccVar2);
                            occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                        }
                        zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                        if (zzjiVarM4874T4 == zzjiVar) {
                            if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                kjc.m15279k(c1043b);
                                c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                            kjc.m15279k(c1043b);
                            c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                        if (boolM4871Q != null) {
                            kjc.m15280l(xccVar2);
                            occVar.m17923a("TCF client enabled.");
                            kjc.m15279k(c1043b);
                            c1043b.mo12359D();
                            xcc xccVar118 = kjcVar3.f47438f;
                            kjc.m15280l(xccVar118);
                            xccVar118.f68075H.m17923a("Register tcfPrefChangeListener.");
                            if (c1043b.f12322O == null) {
                                c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                        C1043b c1043b2 = c1043b;
                                        c1043b2.getClass();
                                        if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                            xcc xccVar119 = ((kjc) c1043b2.f60774a).f47438f;
                                            kjc.m15280l(xccVar119);
                                            xccVar119.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                            dsc dscVar = c1043b2.f12323P;
                                            lda.m16130p(dscVar);
                                            dscVar.m25215b(500L);
                                        }
                                    }
                                };
                            }
                            qfc qfcVar13 = kjcVar3.f47437e;
                            kjc.m15278j(qfcVar13);
                            qfcVar13.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                            kjc.m15279k(c1043b);
                            c1043b.m5853J();
                        } else {
                            kjc.m15280l(xccVar2);
                            occVar.m17923a("TCF client enabled.");
                            kjc.m15279k(c1043b);
                            c1043b.mo12359D();
                            xcc xccVar119 = kjcVar3.f47438f;
                            kjc.m15280l(xccVar119);
                            xccVar119.f68075H.m17923a("Register tcfPrefChangeListener.");
                            if (c1043b.f12322O == null) {
                                c1043b.f12323P = new dsc(c1043b, kjcVar3);
                                c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                        C1043b c1043b2 = c1043b;
                                        c1043b2.getClass();
                                        if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                            xcc xccVar1110 = ((kjc) c1043b2.f60774a).f47438f;
                                            kjc.m15280l(xccVar1110);
                                            xccVar1110.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                            dsc dscVar = c1043b2.f12323P;
                                            lda.m16130p(dscVar);
                                            dscVar.m25215b(500L);
                                        }
                                    }
                                };
                            }
                            qfc qfcVar14 = kjcVar3.f47437e;
                            kjc.m15278j(qfcVar14);
                            qfcVar14.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                            kjc.m15279k(c1043b);
                            c1043b.m5853J();
                        }
                        qg9Var = qfcVar.f57728f;
                        if (qg9Var.m19952g() == 0) {
                            kjc.m15280l(xccVar2);
                            occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                            qg9Var.m19953h(j2);
                        }
                        kjc.m15279k(c1043b);
                        gw9Var = c1043b.f12319L;
                        if (gw9Var.m12942m()) {
                            qfc qfcVar15 = ((kjc) gw9Var.f41432b).f47437e;
                            kjc.m15278j(qfcVar15);
                            qfcVar15.f57722R.m20981p(null);
                        }
                        if (kjcVar2.m15284h()) {
                            if (kjcVar2.m15282f()) {
                                if (radVar2.m20543f0("android.permission.INTERNET")) {
                                    kjc.m15280l(xccVar2);
                                    occVar6 = occVar5;
                                    occVar6.m17923a("App is missing INTERNET permission");
                                } else {
                                    occVar6 = occVar5;
                                }
                                if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                    kjc.m15280l(xccVar2);
                                    occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                kjcVar4 = kjcVar2;
                                context = kjcVar4.f47433a;
                                if (!m9b.m16702a(context).m23950c()) {
                                    if (!rad.m20513x0(context)) {
                                        kjc.m15280l(xccVar2);
                                        occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!rad.m20506Y(context)) {
                                        kjc.m15280l(xccVar2);
                                        occVar6.m17923a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                kjc.m15280l(xccVar2);
                                occVar6.m17923a("Uploading is not possible. App measurement disabled");
                            } else {
                                kjcVar4 = kjcVar2;
                            }
                            xccVar = xccVar2;
                        } else {
                            kjcVar4 = kjcVar2;
                            if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                String strM21929K9 = kjcVar4.m15289q().m21929K();
                                qfcVar.mo12359D();
                                String string7 = qfcVar.m19930H().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strM21929K9);
                                boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                                if (zIsEmpty) {
                                    c3552rx2 = c3552rx;
                                } else {
                                    c3552rx2 = c3552rx;
                                }
                                String strM21929K10 = kjcVar4.m15289q().m21929K();
                                qfcVar.mo12359D();
                                SharedPreferences.Editor editorEdit8 = qfcVar.m19930H().edit();
                                editorEdit8.putString("gmp_app_id", strM21929K10);
                                editorEdit8.apply();
                            } else {
                                c3552rx2 = c3552rx;
                            }
                            if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                                c3552rx2.m20981p(null);
                            }
                            kjc.m15279k(c1043b);
                            c1043b.f12329g.set(c3552rx2.m20980o());
                            kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            xccVar = xccVar2;
                            if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                                zM15282f = kjcVar4.m15282f();
                                sharedPreferences = qfcVar.f57725c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    qfcVar.m19934L(!zM15282f);
                                }
                                if (zM15282f) {
                                    kjc.m15279k(c1043b);
                                    c1043b.m5859P();
                                }
                                s6d s6dVar6 = kjcVar4.f47440h;
                                kjc.m15279k(s6dVar6);
                                s6dVar6.f60441e.m12936e();
                                kjcVar4.m15287o().m23107H(new AtomicReference());
                                kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                            }
                        }
                        blb.m3870a();
                        if (cmbVar.m4869O(null, z8c.f71132P0)) {
                            radVar2.mo12359D();
                            if (radVar2.m20540Z() == 1) {
                                long jIntValue6 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                                long jNextInt6 = new Random().nextInt(5000);
                                kjcVar4.f47443k.getClass();
                                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    kjc.m15280l(xccVar);
                                    occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                kjc.m15279k(c1043b);
                                c1043b.mo12359D();
                                if (c1043b.f12334l == null) {
                                    c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                                }
                                c1043b.f12334l.m25215b(jMax);
                            }
                        }
                        qfcVar.f57714J.m22720b(true);
                        return;
                    }
                    kjc.m15280l(xccVar5);
                    str = "Unknown";
                    str2 = "Can't initialize twice";
                    xccVar5.f68080f.m17924b(xcc.m24449L(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    str6 = "unknown";
                    strM6879d = tacVar2.f62069H;
                    if (TextUtils.isEmpty(strM6879d)) {
                        strM6879d = C1191l.m6879d(context2, kjcVar7.f47417K);
                    }
                    if (!TextUtils.isEmpty(strM6879d)) {
                        str10 = strM6879d;
                    }
                    tacVar2.f62071J = str10;
                    if (iM15283g == 0) {
                        kjc.m15280l(xccVar5);
                        xccVar5.f68076I.m17925c("App measurement enabled for app package, google app id", tacVar2.f62075c, tacVar2.f62071J);
                    }
                    break;
                } catch (IllegalStateException e6) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68080f.m17925c("Fetching Google App Id failed with exception. appId", xcc.m24449L(packageName), e6);
                }
                str7 = str;
                str5 = str7;
                tacVar2.f62075c = packageName;
                tacVar2.f62078f = str6;
                tacVar2.f62076d = str7;
                tacVar2.f62077e = i3;
                tacVar2.f62079g = str5;
                tacVar2.f62080h = 0L;
                iM15283g = kjcVar7.m15283g();
                if (iM15283g == 0) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68076I.m17923a("App measurement collection enabled");
                } else if (iM15283g == 1) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement deactivated via the manifest");
                } else if (iM15283g == 3) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM15283g == 4) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement disabled via the manifest");
                } else if (iM15283g == 6) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68085k.m17923a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM15283g == 7) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement disabled via the global data collection setting");
                } else if (iM15283g != 8) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement disabled");
                    kjc.m15280l(xccVar5);
                    xccVar5.f68081g.m17923a("Invalid scion state in identity");
                } else {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68086l.m17923a("App measurement disabled due to denied storage consent");
                }
                tacVar2.f62071J = "";
                tacVar2.f62083k = null;
                cmb cmbVar4 = kjcVar7.f47436d;
                kjcVar = (kjc) cmbVar4.f60774a;
                lda.m16127m("analytics.safelisted_events");
                bundleM4870P = cmbVar4.m4870P();
                if (bundleM4870P != null) {
                    if (bundleM4870P.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM4870P.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = Arrays.asList(stringArray);
                        } else {
                            listAsList = null;
                        }
                        break;
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        tacVar2.f62083k = listAsList;
                    } else if (listAsList.isEmpty()) {
                        kjc.m15280l(xccVar5);
                        xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                    } else {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                str9 = (String) it.next();
                                radVar = kjcVar7.f47441i;
                                kjc.m15278j(radVar);
                            } else {
                                tacVar2.f62083k = listAsList;
                            }
                        } while (radVar.m20519G0("safelisted event", str9));
                    }
                    if (packageManager != null) {
                        tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                    } else {
                        tacVar2.f62070I = 0;
                    }
                    ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                    tacVar2.f43749b = true;
                    oycVar = new oyc(kjcVar5);
                    oycVar.m13745F();
                    kjcVar5.f47422P = oycVar;
                    if (!oycVar.f43749b) {
                        C3386nv.m17633t(str2);
                        return;
                    }
                    oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                    ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                    oycVar.f43749b = true;
                    kjc.m15280l(xccVar2);
                    occVar = xccVar2.f68075H;
                    occVar2 = xccVar2.f68086l;
                    occVar3 = xccVar2.f68076I;
                    occVar4 = xccVar2.f68080f;
                    cmbVar.m4864J();
                    occVar2.m17924b(161000L, "App measurement initialized, version");
                    kjc.m15280l(xccVar2);
                    occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM21928J = tacVar.m21928J();
                    if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                        kjc.m15280l(xccVar2);
                        occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        kjc.m15280l(xccVar2);
                        occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                    }
                    kjc.m15280l(xccVar2);
                    occVar.m17923a("Debug-level message logging enabled");
                    i = kjcVar5.f47428V;
                    atomicInteger = kjcVar5.f47430X;
                    if (i != atomicInteger.get()) {
                        kjc.m15280l(xccVar2);
                        occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                    }
                    kjcVar5.f47423Q = true;
                    j2 = kjcVar5.f47431Y;
                    c1043b = kjcVar5.f47414H;
                    tic ticVar6 = kjcVar5.f47439g;
                    kjc.m15280l(ticVar6);
                    ticVar6.mo12359D();
                    kjc.m15277i(kjcVar5.f47422P);
                    zzinVarM18841I = kjcVar5.f47422P.m18841I();
                    zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                    blb.m3870a();
                    zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                    if (zzinVarM18841I == zzinVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zM4869O) {
                        radVar2.mo12359D();
                        if (radVar2.m20540Z() == 1) {
                            radVar2.mo12359D();
                            IntentFilter intentFilter13 = new IntentFilter();
                            intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter13);
                            xcc xccVar1110 = kjcVar6.f47438f;
                            kjc.m15280l(xccVar1110);
                            xccVar1110.f68075H.m17923a("Registered app receiver");
                            if (z2) {
                                kjc.m15277i(kjcVar5.f47422P);
                                kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            radVar2.mo12359D();
                            IntentFilter intentFilter14 = new IntentFilter();
                            intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter14);
                            xcc xccVar1111 = kjcVar6.f47438f;
                            kjc.m15280l(xccVar1111);
                            xccVar1111.f68075H.m17923a("Registered app receiver");
                            if (z2) {
                                kjc.m15277i(kjcVar5.f47422P);
                                kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                            }
                        }
                    } else if (z) {
                        z = true;
                        radVar2.mo12359D();
                        IntentFilter intentFilter15 = new IntentFilter();
                        intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter15);
                        xcc xccVar1112 = kjcVar6.f47438f;
                        kjc.m15280l(xccVar1112);
                        xccVar1112.f68075H.m17923a("Registered app receiver");
                        if (z2) {
                            kjc.m15277i(kjcVar5.f47422P);
                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                        }
                    }
                    c3552rx = qfcVar.f57729g;
                    npcVarM19933K = qfcVar.m19933K();
                    int i15 = npcVarM19933K.f53110b;
                    zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                    zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                    zzjiVar = zzji.UNINITIALIZED;
                    if (zzjiVarM4874T == zzjiVar) {
                        kjcVar2 = kjcVar5;
                        occVar5 = occVar4;
                        if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                            EnumMap enumMap9 = new EnumMap(zzjk.class);
                            enumMap9.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                            enumMap9.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                            npcVar = new npc(enumMap9, -10);
                        } else {
                            if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                kjc.m15279k(c1043b);
                                c1043b.m5869Z(new npc(-10), false);
                            }
                            npcVar = null;
                        }
                    } else {
                        kjcVar2 = kjcVar5;
                        occVar5 = occVar4;
                        if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                            EnumMap enumMap10 = new EnumMap(zzjk.class);
                            enumMap10.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                            enumMap10.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                            npcVar = new npc(enumMap10, -10);
                        } else {
                            if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                                kjc.m15279k(c1043b);
                                c1043b.m5869Z(new npc(-10), false);
                            }
                            npcVar = null;
                        }
                    }
                    if (npcVar != null) {
                        kjc.m15279k(c1043b);
                        c1043b.m5869Z(npcVar, true);
                    } else {
                        npcVar = npcVarM19933K;
                    }
                    kjc.m15279k(c1043b);
                    kjcVar3 = (kjc) c1043b.f60774a;
                    c1043b.m5873d0(npcVar);
                    qfcVar.mo12359D();
                    int i16 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                    zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                    if (zzjiVarM4874T3 != zzjiVar) {
                        kjc.m15280l(xccVar2);
                        occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                    }
                    zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                    if (zzjiVarM4874T4 == zzjiVar) {
                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                            kjc.m15279k(c1043b);
                            c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                        kjc.m15279k(c1043b);
                        c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                    if (boolM4871Q != null) {
                        kjc.m15280l(xccVar2);
                        occVar.m17923a("TCF client enabled.");
                        kjc.m15279k(c1043b);
                        c1043b.mo12359D();
                        xcc xccVar1113 = kjcVar3.f47438f;
                        kjc.m15280l(xccVar1113);
                        xccVar1113.f68075H.m17923a("Register tcfPrefChangeListener.");
                        if (c1043b.f12322O == null) {
                            c1043b.f12323P = new dsc(c1043b, kjcVar3);
                            c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                    C1043b c1043b2 = c1043b;
                                    c1043b2.getClass();
                                    if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                        xcc xccVar1114 = ((kjc) c1043b2.f60774a).f47438f;
                                        kjc.m15280l(xccVar1114);
                                        xccVar1114.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                        dsc dscVar = c1043b2.f12323P;
                                        lda.m16130p(dscVar);
                                        dscVar.m25215b(500L);
                                    }
                                }
                            };
                        }
                        qfc qfcVar16 = kjcVar3.f47437e;
                        kjc.m15278j(qfcVar16);
                        qfcVar16.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                        kjc.m15279k(c1043b);
                        c1043b.m5853J();
                    } else {
                        kjc.m15280l(xccVar2);
                        occVar.m17923a("TCF client enabled.");
                        kjc.m15279k(c1043b);
                        c1043b.mo12359D();
                        xcc xccVar1114 = kjcVar3.f47438f;
                        kjc.m15280l(xccVar1114);
                        xccVar1114.f68075H.m17923a("Register tcfPrefChangeListener.");
                        if (c1043b.f12322O == null) {
                            c1043b.f12323P = new dsc(c1043b, kjcVar3);
                            c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                    C1043b c1043b2 = c1043b;
                                    c1043b2.getClass();
                                    if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                        xcc xccVar1115 = ((kjc) c1043b2.f60774a).f47438f;
                                        kjc.m15280l(xccVar1115);
                                        xccVar1115.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                        dsc dscVar = c1043b2.f12323P;
                                        lda.m16130p(dscVar);
                                        dscVar.m25215b(500L);
                                    }
                                }
                            };
                        }
                        qfc qfcVar17 = kjcVar3.f47437e;
                        kjc.m15278j(qfcVar17);
                        qfcVar17.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                        kjc.m15279k(c1043b);
                        c1043b.m5853J();
                    }
                    qg9Var = qfcVar.f57728f;
                    if (qg9Var.m19952g() == 0) {
                        kjc.m15280l(xccVar2);
                        occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                        qg9Var.m19953h(j2);
                    }
                    kjc.m15279k(c1043b);
                    gw9Var = c1043b.f12319L;
                    if (gw9Var.m12942m()) {
                        qfc qfcVar18 = ((kjc) gw9Var.f41432b).f47437e;
                        kjc.m15278j(qfcVar18);
                        qfcVar18.f57722R.m20981p(null);
                    }
                    if (kjcVar2.m15284h()) {
                        if (kjcVar2.m15282f()) {
                            if (radVar2.m20543f0("android.permission.INTERNET")) {
                                kjc.m15280l(xccVar2);
                                occVar6 = occVar5;
                                occVar6.m17923a("App is missing INTERNET permission");
                            } else {
                                occVar6 = occVar5;
                            }
                            if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                                kjc.m15280l(xccVar2);
                                occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            kjcVar4 = kjcVar2;
                            context = kjcVar4.f47433a;
                            if (!m9b.m16702a(context).m23950c()) {
                                if (!rad.m20513x0(context)) {
                                    kjc.m15280l(xccVar2);
                                    occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!rad.m20506Y(context)) {
                                    kjc.m15280l(xccVar2);
                                    occVar6.m17923a("AppMeasurementService not registered/enabled");
                                }
                            }
                            kjc.m15280l(xccVar2);
                            occVar6.m17923a("Uploading is not possible. App measurement disabled");
                        } else {
                            kjcVar4 = kjcVar2;
                        }
                        xccVar = xccVar2;
                    } else {
                        kjcVar4 = kjcVar2;
                        if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                            String strM21929K11 = kjcVar4.m15289q().m21929K();
                            qfcVar.mo12359D();
                            String string8 = qfcVar.m19930H().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strM21929K11);
                            boolean zIsEmpty7 = TextUtils.isEmpty(string8);
                            if (zIsEmpty) {
                                c3552rx2 = c3552rx;
                            } else {
                                c3552rx2 = c3552rx;
                            }
                            String strM21929K12 = kjcVar4.m15289q().m21929K();
                            qfcVar.mo12359D();
                            SharedPreferences.Editor editorEdit9 = qfcVar.m19930H().edit();
                            editorEdit9.putString("gmp_app_id", strM21929K12);
                            editorEdit9.apply();
                        } else {
                            c3552rx2 = c3552rx;
                        }
                        if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                            c3552rx2.m20981p(null);
                        }
                        kjc.m15279k(c1043b);
                        c1043b.f12329g.set(c3552rx2.m20980o());
                        kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        xccVar = xccVar2;
                        if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                            zM15282f = kjcVar4.m15282f();
                            sharedPreferences = qfcVar.f57725c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                qfcVar.m19934L(!zM15282f);
                            }
                            if (zM15282f) {
                                kjc.m15279k(c1043b);
                                c1043b.m5859P();
                            }
                            s6d s6dVar7 = kjcVar4.f47440h;
                            kjc.m15279k(s6dVar7);
                            s6dVar7.f60441e.m12936e();
                            kjcVar4.m15287o().m23107H(new AtomicReference());
                            kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                        }
                    }
                    blb.m3870a();
                    if (cmbVar.m4869O(null, z8c.f71132P0)) {
                        radVar2.mo12359D();
                        if (radVar2.m20540Z() == 1) {
                            long jIntValue7 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                            long jNextInt7 = new Random().nextInt(5000);
                            kjcVar4.f47443k.getClass();
                            jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                kjc.m15280l(xccVar);
                                occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            kjc.m15279k(c1043b);
                            c1043b.mo12359D();
                            if (c1043b.f12334l == null) {
                                c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                            }
                            c1043b.f12334l.m25215b(jMax);
                        }
                    }
                    qfcVar.f57714J.m22720b(true);
                    return;
                }
                xcc xccVar1115 = kjcVar.f47438f;
                kjc.m15280l(xccVar1115);
                xccVar1115.f68080f.m17923a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = kjcVar.f47433a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    } else {
                        listAsList = null;
                    }
                    break;
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    tacVar2.f62083k = listAsList;
                } else if (listAsList.isEmpty()) {
                    kjc.m15280l(xccVar5);
                    xccVar5.f68085k.m17923a("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            str9 = (String) it.next();
                            radVar = kjcVar7.f47441i;
                            kjc.m15278j(radVar);
                        } else {
                            tacVar2.f62083k = listAsList;
                        }
                    } while (radVar.m20519G0("safelisted event", str9));
                }
                if (packageManager != null) {
                    tacVar2.f62070I = InstantApps.isInstantApp(context2) ? 1 : 0;
                } else {
                    tacVar2.f62070I = 0;
                }
                ((kjc) tacVar2.f60774a).f47430X.incrementAndGet();
                tacVar2.f43749b = true;
                oycVar = new oyc(kjcVar5);
                oycVar.m13745F();
                kjcVar5.f47422P = oycVar;
                if (!oycVar.f43749b) {
                    C3386nv.m17633t(str2);
                    return;
                }
                oycVar.f55313c = (JobScheduler) ((kjc) oycVar.f60774a).f47433a.getSystemService("jobscheduler");
                ((kjc) oycVar.f60774a).f47430X.incrementAndGet();
                oycVar.f43749b = true;
                kjc.m15280l(xccVar2);
                occVar = xccVar2.f68075H;
                occVar2 = xccVar2.f68086l;
                occVar3 = xccVar2.f68076I;
                occVar4 = xccVar2.f68080f;
                cmbVar.m4864J();
                occVar2.m17924b(161000L, "App measurement initialized, version");
                kjc.m15280l(xccVar2);
                occVar2.m17923a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM21928J = tacVar.m21928J();
                if (radVar2.m20544h0(strM21928J, cmbVar.f10288c)) {
                    kjc.m15280l(xccVar2);
                    occVar2.m17923a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    kjc.m15280l(xccVar2);
                    occVar2.m17923a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM21928J)));
                }
                kjc.m15280l(xccVar2);
                occVar.m17923a("Debug-level message logging enabled");
                i = kjcVar5.f47428V;
                atomicInteger = kjcVar5.f47430X;
                if (i != atomicInteger.get()) {
                    kjc.m15280l(xccVar2);
                    occVar4.m17925c("Not all components initialized", Integer.valueOf(kjcVar5.f47428V), Integer.valueOf(atomicInteger.get()));
                }
                kjcVar5.f47423Q = true;
                j2 = kjcVar5.f47431Y;
                c1043b = kjcVar5.f47414H;
                tic ticVar7 = kjcVar5.f47439g;
                kjc.m15280l(ticVar7);
                ticVar7.mo12359D();
                kjc.m15277i(kjcVar5.f47422P);
                zzinVarM18841I = kjcVar5.f47422P.m18841I();
                zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
                blb.m3870a();
                zM4869O = cmbVar.m4869O(null, z8c.f71132P0);
                if (zzinVarM18841I == zzinVar) {
                    z = true;
                } else {
                    z = false;
                }
                if (zM4869O) {
                    radVar2.mo12359D();
                    if (radVar2.m20540Z() == 1) {
                        radVar2.mo12359D();
                        IntentFilter intentFilter16 = new IntentFilter();
                        intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter16);
                        xcc xccVar1116 = kjcVar6.f47438f;
                        kjc.m15280l(xccVar1116);
                        xccVar1116.f68075H.m17923a("Registered app receiver");
                        if (z2) {
                            kjc.m15277i(kjcVar5.f47422P);
                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        radVar2.mo12359D();
                        IntentFilter intentFilter17 = new IntentFilter();
                        intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter17);
                        xcc xccVar1117 = kjcVar6.f47438f;
                        kjc.m15280l(xccVar1117);
                        xccVar1117.f68075H.m17923a("Registered app receiver");
                        if (z2) {
                            kjc.m15277i(kjcVar5.f47422P);
                            kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                        }
                    }
                } else if (z) {
                    z = true;
                    radVar2.mo12359D();
                    IntentFilter intentFilter18 = new IntentFilter();
                    intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    do7.m10514A(kjcVar6.f47433a, new C3693vp(kjcVar6), intentFilter18);
                    xcc xccVar1118 = kjcVar6.f47438f;
                    kjc.m15280l(xccVar1118);
                    xccVar1118.f68075H.m17923a("Registered app receiver");
                    if (z2) {
                        kjc.m15277i(kjcVar5.f47422P);
                        kjcVar5.f47422P.m18840H(((Long) z8c.f71105C.m21901a(null)).longValue());
                    }
                }
                c3552rx = qfcVar.f57729g;
                npcVarM19933K = qfcVar.m19933K();
                int i17 = npcVarM19933K.f53110b;
                zzjiVarM4874T = cmbVar.m4874T("google_analytics_default_allow_ad_storage", false);
                zzjiVarM4874T2 = cmbVar.m4874T("google_analytics_default_allow_analytics_storage", false);
                zzjiVar = zzji.UNINITIALIZED;
                if (zzjiVarM4874T == zzjiVar) {
                    kjcVar2 = kjcVar5;
                    occVar5 = occVar4;
                    if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                        EnumMap enumMap11 = new EnumMap(zzjk.class);
                        enumMap11.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                        enumMap11.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                        npcVar = new npc(enumMap11, -10);
                    } else {
                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                            kjc.m15279k(c1043b);
                            c1043b.m5869Z(new npc(-10), false);
                        }
                        npcVar = null;
                    }
                } else {
                    kjcVar2 = kjcVar5;
                    occVar5 = occVar4;
                    if (npc.m17587l(-10, qfcVar.m19930H().getInt("consent_source", 100))) {
                        EnumMap enumMap12 = new EnumMap(zzjk.class);
                        enumMap12.put(zzjk.AD_STORAGE, zzjiVarM4874T);
                        enumMap12.put(zzjk.ANALYTICS_STORAGE, zzjiVarM4874T2);
                        npcVar = new npc(enumMap12, -10);
                    } else {
                        if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                            kjc.m15279k(c1043b);
                            c1043b.m5869Z(new npc(-10), false);
                        }
                        npcVar = null;
                    }
                }
                if (npcVar != null) {
                    kjc.m15279k(c1043b);
                    c1043b.m5869Z(npcVar, true);
                } else {
                    npcVar = npcVarM19933K;
                }
                kjc.m15279k(c1043b);
                kjcVar3 = (kjc) c1043b.f60774a;
                c1043b.m5873d0(npcVar);
                qfcVar.mo12359D();
                int i18 = mob.m16960b(qfcVar.m19930H().getString("dma_consent_settings", null)).f51667a;
                zzjiVarM4874T3 = cmbVar.m4874T("google_analytics_default_allow_ad_personalization_signals", true);
                if (zzjiVarM4874T3 != zzjiVar) {
                    kjc.m15280l(xccVar2);
                    occVar3.m17924b(zzjiVarM4874T3, "Default ad personalization consent from Manifest");
                }
                zzjiVarM4874T4 = cmbVar.m4874T("google_analytics_default_allow_ad_user_data", true);
                if (zzjiVarM4874T4 == zzjiVar) {
                    if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                        kjc.m15279k(c1043b);
                        c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(kjcVar2.m15289q().m21929K())) {
                    kjc.m15279k(c1043b);
                    c1043b.m5868Y(new mob((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolM4871Q = cmbVar.m4871Q("google_analytics_tcf_data_enabled");
                if (boolM4871Q != null) {
                    kjc.m15280l(xccVar2);
                    occVar.m17923a("TCF client enabled.");
                    kjc.m15279k(c1043b);
                    c1043b.mo12359D();
                    xcc xccVar1119 = kjcVar3.f47438f;
                    kjc.m15280l(xccVar1119);
                    xccVar1119.f68075H.m17923a("Register tcfPrefChangeListener.");
                    if (c1043b.f12322O == null) {
                        c1043b.f12323P = new dsc(c1043b, kjcVar3);
                        c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                C1043b c1043b2 = c1043b;
                                c1043b2.getClass();
                                if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                    xcc xccVar11110 = ((kjc) c1043b2.f60774a).f47438f;
                                    kjc.m15280l(xccVar11110);
                                    xccVar11110.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                    dsc dscVar = c1043b2.f12323P;
                                    lda.m16130p(dscVar);
                                    dscVar.m25215b(500L);
                                }
                            }
                        };
                    }
                    qfc qfcVar19 = kjcVar3.f47437e;
                    kjc.m15278j(qfcVar19);
                    qfcVar19.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                    kjc.m15279k(c1043b);
                    c1043b.m5853J();
                } else {
                    kjc.m15280l(xccVar2);
                    occVar.m17923a("TCF client enabled.");
                    kjc.m15279k(c1043b);
                    c1043b.mo12359D();
                    xcc xccVar11110 = kjcVar3.f47438f;
                    kjc.m15280l(xccVar11110);
                    xccVar11110.f68075H.m17923a("Register tcfPrefChangeListener.");
                    if (c1043b.f12322O == null) {
                        c1043b.f12323P = new dsc(c1043b, kjcVar3);
                        c1043b.f12322O = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: swc
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str13) {
                                C1043b c1043b2 = c1043b;
                                c1043b2.getClass();
                                if (Objects.equals(str13, "IABTCF_TCString") || Objects.equals(str13, "IABTCF_gdprApplies") || Objects.equals(str13, "IABTCF_EnableAdvertiserConsentMode")) {
                                    xcc xccVar11111 = ((kjc) c1043b2.f60774a).f47438f;
                                    kjc.m15280l(xccVar11111);
                                    xccVar11111.f68076I.m17923a("IABTCF_TCString change picked up in listener.");
                                    dsc dscVar = c1043b2.f12323P;
                                    lda.m16130p(dscVar);
                                    dscVar.m25215b(500L);
                                }
                            }
                        };
                    }
                    qfc qfcVar110 = kjcVar3.f47437e;
                    kjc.m15278j(qfcVar110);
                    qfcVar110.m19931I().registerOnSharedPreferenceChangeListener(c1043b.f12322O);
                    kjc.m15279k(c1043b);
                    c1043b.m5853J();
                }
                qg9Var = qfcVar.f57728f;
                if (qg9Var.m19952g() == 0) {
                    kjc.m15280l(xccVar2);
                    occVar3.m17924b(Long.valueOf(j2), "Persisting first open");
                    qg9Var.m19953h(j2);
                }
                kjc.m15279k(c1043b);
                gw9Var = c1043b.f12319L;
                if (gw9Var.m12942m()) {
                    qfc qfcVar111 = ((kjc) gw9Var.f41432b).f47437e;
                    kjc.m15278j(qfcVar111);
                    qfcVar111.f57722R.m20981p(null);
                }
                if (kjcVar2.m15284h()) {
                    if (kjcVar2.m15282f()) {
                        if (radVar2.m20543f0("android.permission.INTERNET")) {
                            kjc.m15280l(xccVar2);
                            occVar6 = occVar5;
                            occVar6.m17923a("App is missing INTERNET permission");
                        } else {
                            occVar6 = occVar5;
                        }
                        if (!radVar2.m20543f0("android.permission.ACCESS_NETWORK_STATE")) {
                            kjc.m15280l(xccVar2);
                            occVar6.m17923a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        kjcVar4 = kjcVar2;
                        context = kjcVar4.f47433a;
                        if (!m9b.m16702a(context).m23950c()) {
                            if (!rad.m20513x0(context)) {
                                kjc.m15280l(xccVar2);
                                occVar6.m17923a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!rad.m20506Y(context)) {
                                kjc.m15280l(xccVar2);
                                occVar6.m17923a("AppMeasurementService not registered/enabled");
                            }
                        }
                        kjc.m15280l(xccVar2);
                        occVar6.m17923a("Uploading is not possible. App measurement disabled");
                    } else {
                        kjcVar4 = kjcVar2;
                    }
                    xccVar = xccVar2;
                } else {
                    kjcVar4 = kjcVar2;
                    if (TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                        String strM21929K13 = kjcVar4.m15289q().m21929K();
                        qfcVar.mo12359D();
                        String string9 = qfcVar.m19930H().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strM21929K13);
                        boolean zIsEmpty8 = TextUtils.isEmpty(string9);
                        if (zIsEmpty) {
                            c3552rx2 = c3552rx;
                        } else {
                            c3552rx2 = c3552rx;
                        }
                        String strM21929K14 = kjcVar4.m15289q().m21929K();
                        qfcVar.mo12359D();
                        SharedPreferences.Editor editorEdit10 = qfcVar.m19930H().edit();
                        editorEdit10.putString("gmp_app_id", strM21929K14);
                        editorEdit10.apply();
                    } else {
                        c3552rx2 = c3552rx;
                    }
                    if (!qfcVar.m19933K().m17590i(zzjk.ANALYTICS_STORAGE)) {
                        c3552rx2.m20981p(null);
                    }
                    kjc.m15279k(c1043b);
                    c1043b.f12329g.set(c3552rx2.m20980o());
                    kjcVar6.f47433a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    xccVar = xccVar2;
                    if (!TextUtils.isEmpty(kjcVar4.m15289q().m21929K())) {
                        zM15282f = kjcVar4.m15282f();
                        sharedPreferences = qfcVar.f57725c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            qfcVar.m19934L(!zM15282f);
                        }
                        if (zM15282f) {
                            kjc.m15279k(c1043b);
                            c1043b.m5859P();
                        }
                        s6d s6dVar8 = kjcVar4.f47440h;
                        kjc.m15279k(s6dVar8);
                        s6dVar8.f60441e.m12936e();
                        kjcVar4.m15287o().m23107H(new AtomicReference());
                        kjcVar4.m15287o().m23108I(qfcVar.f57724T.m17688P());
                    }
                }
                blb.m3870a();
                if (cmbVar.m4869O(null, z8c.f71132P0)) {
                    radVar2.mo12359D();
                    if (radVar2.m20540Z() == 1) {
                        long jIntValue8 = ((Integer) z8c.f71208w0.m21901a(null)).intValue();
                        long jNextInt8 = new Random().nextInt(5000);
                        kjcVar4.f47443k.getClass();
                        jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            kjc.m15280l(xccVar);
                            occVar3.m17924b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        kjc.m15279k(c1043b);
                        c1043b.mo12359D();
                        if (c1043b.f12334l == null) {
                            c1043b.f12334l = new tqc(c1043b, (uoc) kjcVar3, 0);
                        }
                        c1043b.f12334l.m25215b(jMax);
                    }
                }
                qfcVar.f57714J.m22720b(true);
                return;
            case 8:
                m22504a();
                return;
            case 9:
                kjc kjcVar8 = (kjc) ((C1043b) this.f63478b).f60774a;
                tac tacVarM15289q = kjcVar8.m15289q();
                String str13 = (String) this.f63479c;
                String str14 = tacVarM15289q.f62074M;
                boolean z6 = (str14 == null || str14.equals(str13)) ? false : true;
                tacVarM15289q.f62074M = str13;
                if (z6) {
                    kjcVar8.m15289q().m21927I();
                    return;
                }
                return;
            case 10:
                m22505b();
                return;
            case 11:
                v4d v4dVar2 = (v4d) this.f63479c;
                q9c q9cVar = v4dVar2.f64866d;
                kjc kjcVar9 = (kjc) v4dVar2.f60774a;
                if (q9cVar == null) {
                    xcc xccVar20 = kjcVar9.f47438f;
                    kjc.m15280l(xccVar20);
                    xccVar20.f68080f.m17923a("Failed to send current screen to service");
                    return;
                }
                try {
                    bzc bzcVar = (bzc) this.f63478b;
                    if (bzcVar == null) {
                        q9cVar.mo11293g(0L, null, null, kjcVar9.f47433a.getPackageName());
                    } else {
                        q9cVar.mo11293g(bzcVar.f9210c, bzcVar.f9208a, bzcVar.f9209b, kjcVar9.f47433a.getPackageName());
                    }
                    v4dVar2.m23116Q();
                    return;
                } catch (RemoteException e7) {
                    xcc xccVar21 = ((kjc) v4dVar2.f60774a).f47438f;
                    kjc.m15280l(xccVar21);
                    xccVar21.f68080f.m17924b(e7, "Failed to send current screen to the service");
                    return;
                }
            case 12:
                m22506c();
                return;
            case 13:
                C1045d c1045d = (C1045d) this.f63478b;
                c1045d.m5902V();
                Runnable runnable = (Runnable) this.f63479c;
                c1045d.mo5913d().mo12359D();
                if (c1045d.f12340K == null) {
                    c1045d.f12340K = new ArrayList();
                }
                c1045d.f12340K.add(runnable);
                c1045d.m5939q();
                return;
            case 14:
                aec aecVar2 = (aec) this.f63479c;
                try {
                    Task taskMo91k = ((fn9) aecVar2.f563c).mo91k(((Task) this.f63478b).mo5967i());
                    if (taskMo91k == null) {
                        ((tld) aecVar2.f564d).m22203r(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    qg2 qg2Var2 = xr9.f68588b;
                    taskMo91k.mo5963e(qg2Var2, aecVar2);
                    taskMo91k.mo5962d(qg2Var2, aecVar2);
                    taskMo91k.mo5959a(qg2Var2, aecVar2);
                    return;
                } catch (RuntimeExecutionException e8) {
                    if (e8.getCause() instanceof Exception) {
                        aecVar2.mo321m((Exception) e8.getCause());
                        return;
                    } else {
                        ((tld) aecVar2.f564d).m22203r(e8);
                        return;
                    }
                } catch (CancellationException unused6) {
                    aecVar2.mo319b();
                    return;
                } catch (Exception e9) {
                    ((tld) aecVar2.f564d).m22203r(e9);
                    return;
                }
            default:
                tld tldVar = (tld) this.f63478b;
                try {
                    tldVar.m22201p(((Callable) this.f63479c).call());
                    return;
                } catch (Exception e10) {
                    tldVar.m22203r(e10);
                    return;
                } catch (Throwable th4) {
                    tldVar.m22203r(new RuntimeException(th4));
                    return;
                }
        }
    }

    public /* synthetic */ u62(Object obj, Object obj2, boolean z, int i) {
        this.f63477a = i;
        this.f63478b = obj;
        this.f63479c = obj2;
    }

    public u62(nr9 nr9Var, C1045d c1045d, Runnable runnable) {
        this.f63477a = 13;
        this.f63478b = c1045d;
        this.f63479c = runnable;
    }

    public /* synthetic */ u62(int i, Object obj, Object obj2) {
        this.f63477a = i;
        this.f63479c = obj;
        this.f63478b = obj2;
    }
}
