package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import p000.AbstractC3393o1;
import p000.AbstractC3559s3;
import p000.AbstractC3584sr;
import p000.C3156jq;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3552rx;
import p000.InterfaceC3407of;
import p000.a30;
import p000.a3d;
import p000.aec;
import p000.b64;
import p000.bq7;
import p000.br1;
import p000.dz3;
import p000.ed1;
import p000.f30;
import p000.f40;
import p000.g30;
import p000.gv5;
import p000.h30;
import p000.iy5;
import p000.j30;
import p000.l30;
import p000.l50;
import p000.m30;
import p000.m50;
import p000.mj0;
import p000.mp1;
import p000.n30;
import p000.n50;
import p000.np1;
import p000.o30;
import p000.o50;
import p000.oc0;
import p000.oj5;
import p000.pb1;
import p000.pp1;
import p000.q33;
import p000.r30;
import p000.rk8;
import p000.sc2;
import p000.sj4;
import p000.t33;
import p000.tld;
import p000.tz1;
import p000.up1;
import p000.uq1;
import p000.ux5;
import p000.v30;
import p000.vq1;
import p000.w20;
import p000.w30;
import p000.wq1;
import p000.wr9;
import p000.x20;
import p000.xg1;
import p000.xh8;
import p000.xq1;
import p000.xr9;
import p000.yq1;
import p000.z20;
import p000.zq1;
import p000.zx5;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1148a {

    /* JADX INFO: renamed from: r */
    public static final mp1 f13648r = new mp1(1);

    /* JADX INFO: renamed from: s */
    public static final Charset f13649s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f13650a;

    /* JADX INFO: renamed from: b */
    public final tz1 f13651b;

    /* JADX INFO: renamed from: c */
    public final b64 f13652c;

    /* JADX INFO: renamed from: d */
    public final t33 f13653d;

    /* JADX INFO: renamed from: e */
    public final C1149a f13654e;

    /* JADX INFO: renamed from: f */
    public final dz3 f13655f;

    /* JADX INFO: renamed from: g */
    public final t33 f13656g;

    /* JADX INFO: renamed from: h */
    public final xg1 f13657h;

    /* JADX INFO: renamed from: i */
    public final b64 f13658i;

    /* JADX INFO: renamed from: j */
    public final up1 f13659j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC3407of f13660k;

    /* JADX INFO: renamed from: l */
    public final np1 f13661l;

    /* JADX INFO: renamed from: m */
    public final ed1 f13662m;

    /* JADX INFO: renamed from: n */
    public br1 f13663n;

    /* JADX INFO: renamed from: o */
    public final wr9 f13664o = new wr9();

    /* JADX INFO: renamed from: p */
    public final wr9 f13665p = new wr9();

    /* JADX INFO: renamed from: q */
    public final wr9 f13666q = new wr9();

    public C1148a(Context context, dz3 dz3Var, tz1 tz1Var, t33 t33Var, b64 b64Var, xg1 xg1Var, t33 t33Var2, b64 b64Var2, ed1 ed1Var, up1 up1Var, InterfaceC3407of interfaceC3407of, np1 np1Var, C1149a c1149a) {
        new AtomicBoolean(false);
        this.f13650a = context;
        this.f13655f = dz3Var;
        this.f13651b = tz1Var;
        this.f13656g = t33Var;
        this.f13652c = b64Var;
        this.f13657h = xg1Var;
        this.f13653d = t33Var2;
        this.f13658i = b64Var2;
        this.f13659j = up1Var;
        this.f13660k = interfaceC3407of;
        this.f13661l = np1Var;
        this.f13662m = ed1Var;
        this.f13654e = c1149a;
    }

    /* JADX INFO: renamed from: a */
    public static tld m6671a(C1148a c1148a) {
        tld tldVarM5973a;
        c1148a.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : t33.m21829e(((File) c1148a.f13656g.f61788c).listFiles(f13648r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    tldVarM5973a = Tasks.m5975c(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    tldVarM5973a = Tasks.m5973a(new pp1(c1148a, j), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(tldVarM5973a);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.m5976d(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0534  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [np1] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m6672b(boolean z, C1150a c1150a, boolean z2) throws Throwable {
        ed1 ed1Var;
        int i;
        int i2;
        ?? r11;
        boolean z3;
        String str;
        String strSubstring;
        boolean z4;
        String[] list;
        Object obj;
        List listM25837b;
        ApplicationExitInfo applicationExitInfoM21020d;
        String strM11047k;
        int i3;
        List listUnmodifiableList;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        up1 up1Var = this.f13659j;
        C1149a.m6679a();
        ed1 ed1Var2 = this.f13662m;
        ArrayList arrayList = new ArrayList(((zq1) ed1Var2.f37034b).m25743c());
        if (arrayList.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList.get(z == true ? 1 : 0);
        if (z2 && c1150a.m6684b().f43295b.f40032b) {
            t33 t33Var = this.f13656g;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f13650a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    b64 b64Var = new b64(t33Var);
                    i2 = 4;
                    b64Var.f8007b = b64.f8002c;
                    if (str2 != null) {
                        b64Var.f8007b = new bq7(t33Var.m21831b(str2, "userlog"));
                    }
                    C1149a c1149a = this.f13654e;
                    zx5 zx5Var = new zx5(t33Var);
                    t33 t33Var2 = new t33(str2, t33Var, c1149a);
                    ((sj4) ((AtomicMarkableReference) ((C3552rx) t33Var2.f61789d).f59987b).getReference()).m21419c(zx5Var.m25841c(str2, false));
                    ((sj4) ((AtomicMarkableReference) ((C3552rx) t33Var2.f61790e).f59987b).getReference()).m21419c(zx5Var.m25841c(str2, true));
                    ((AtomicMarkableReference) t33Var2.f61792g).set(zx5Var.m25842d(str2), false);
                    xh8 xh8Var = (xh8) t33Var2.f61791f;
                    File fileM21831b = t33Var.m21831b(str2, "rollouts-state");
                    if (!fileM21831b.exists() || fileM21831b.length() == 0) {
                        zx5.m25840g(fileM21831b, "The file has a length of zero for session: " + str2);
                        listM25837b = Collections.EMPTY_LIST;
                    } else {
                        try {
                            fileInputStream2 = new FileInputStream(fileM21831b);
                            try {
                                try {
                                    listM25837b = zx5.m25837b(pb1.m19029Q(fileInputStream2));
                                    String str3 = "Loaded rollouts state:\n" + listM25837b + "\nfor session " + str2;
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str3, null);
                                    }
                                    pb1.m19047q(fileInputStream2, "Failed to close rollouts state file.");
                                } catch (Exception e) {
                                    e = e;
                                    Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                    zx5.m25839f(fileM21831b);
                                    pb1.m19047q(fileInputStream2, "Failed to close rollouts state file.");
                                    listM25837b = Collections.EMPTY_LIST;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                pb1.m19047q(fileInputStream, "Failed to close rollouts state file.");
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileInputStream2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            pb1.m19047q(fileInputStream, "Failed to close rollouts state file.");
                            throw th;
                        }
                    }
                    xh8Var.m24519b(listM25837b);
                    zq1 zq1Var = (zq1) ed1Var2.f37034b;
                    long jLastModified = zq1Var.f71962b.m21831b(str2, "start-time").lastModified();
                    Iterator it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            applicationExitInfoM21020d = AbstractC3559s3.m21020d(it.next());
                            if (applicationExitInfoM21020d.getTimestamp() < jLastModified) {
                            }
                        }
                        applicationExitInfoM21020d = null;
                        break;
                    } while (applicationExitInfoM21020d.getReason() != 6);
                    if (applicationExitInfoM21020d == null) {
                        String strM17734i = AbstractC3393o1.m17734i("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM17734i, null);
                        }
                        ed1Var = ed1Var2;
                    } else {
                        xq1 xq1Var = (xq1) ed1Var2.f37033a;
                        try {
                            InputStream traceInputStream = applicationExitInfoM21020d.getTraceInputStream();
                            strM11047k = traceInputStream != null ? ed1.m11047k(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoM21020d.toString() + " Error: " + e3, null);
                        }
                        z20 z20Var = new z20();
                        z20Var.m25405c(applicationExitInfoM21020d.getImportance());
                        z20Var.m25407e(applicationExitInfoM21020d.getProcessName());
                        z20Var.m25409g(applicationExitInfoM21020d.getReason());
                        z20Var.m25411i(applicationExitInfoM21020d.getTimestamp());
                        z20Var.m25406d(applicationExitInfoM21020d.getPid());
                        z20Var.m25408f(applicationExitInfoM21020d.getPss());
                        z20Var.m25410h(applicationExitInfoM21020d.getRss());
                        z20Var.m25412j(strM11047k);
                        a30 a30VarM25403a = z20Var.m25403a();
                        int i5 = xq1Var.f68528a.getResources().getConfiguration().orientation;
                        l30 l30Var = new l30();
                        l30Var.f48953b = "anr";
                        long j = a30VarM25403a.f160g;
                        l30Var.f48952a = j;
                        l30Var.f48958g = (byte) (l30Var.f48958g | 1);
                        xg1 xg1Var = xq1Var.f68530c;
                        if (!xq1Var.f68532e.m6684b().f43295b.f40033c || ((ArrayList) xg1Var.f68168c).size() <= 0) {
                            ed1Var = ed1Var2;
                            i3 = i5;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = ((ArrayList) xg1Var.f68168c).iterator();
                            while (it2.hasNext()) {
                                mj0 mj0Var = (mj0) it2.next();
                                int i6 = i5;
                                gv5 gv5Var = new gv5(9, (byte) 0);
                                gv5Var.m12889S(mj0Var.m16849c());
                                gv5Var.m12884N(mj0Var.m16847a());
                                gv5Var.m12885O(mj0Var.m16848b());
                                arrayList2.add(gv5Var.m12911s());
                                it2 = it2;
                                i5 = i6;
                                ed1Var2 = ed1Var2;
                            }
                            ed1Var = ed1Var2;
                            i3 = i5;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                        }
                        z20 z20Var2 = new z20();
                        z20Var2.m25405c(a30VarM25403a.f157d);
                        z20Var2.m25407e(a30VarM25403a.f155b);
                        z20Var2.m25409g(a30VarM25403a.f156c);
                        z20Var2.m25411i(j);
                        z20Var2.m25406d(a30VarM25403a.f154a);
                        z20Var2.m25408f(a30VarM25403a.f158e);
                        z20Var2.m25410h(a30VarM25403a.f159f);
                        z20Var2.m25412j(a30VarM25403a.f161h);
                        z20Var2.m25404b(listUnmodifiableList);
                        a30 a30VarM25403a2 = z20Var2.m25403a();
                        int i7 = a30VarM25403a2.f157d;
                        Boolean boolValueOf = Boolean.valueOf(i7 != 100);
                        String str4 = a30VarM25403a2.f155b;
                        int i8 = a30VarM25403a2.f154a;
                        str4.getClass();
                        v30 v30Var = new v30();
                        v30Var.f64773a = str4;
                        v30Var.f64774b = i8;
                        byte b = (byte) (v30Var.f64777e | 1);
                        v30Var.f64775c = i7;
                        v30Var.f64776d = false;
                        v30Var.f64777e = (byte) (((byte) (b | 2)) | 4);
                        w30 w30VarM23076a = v30Var.m23076a();
                        r30 r30VarM24640e = xq1.m24640e();
                        List listM24641a = xq1Var.m24641a();
                        if (listM24641a == null) {
                            C3386nv.m17635v("Null binaries");
                            return;
                        }
                        l30Var.f48954c = new n30(new o30(null, null, a30VarM25403a2, r30VarM24640e, listM24641a), null, null, boolValueOf, w30VarM23076a, null, i3);
                        l30Var.f48955d = xq1Var.m24642b(i3);
                        m30 m30VarM15768a = l30Var.m15768a();
                        String strM17734i2 = AbstractC3393o1.m17734i("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strM17734i2, null);
                        }
                        zq1Var.m25744d(ed1.m11046i(ed1.m11045h(m30VarM15768a, b64Var, t33Var2, Collections.EMPTY_MAP), t33Var2), str2, true);
                    }
                    i = 2;
                } else {
                    up1Var = up1Var;
                    ed1Var = ed1Var2;
                    i2 = 4;
                    String strM17734i3 = AbstractC3393o1.m17734i("No ApplicationExitInfo available. Session: ", str2);
                    i = 2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        r11 = 0;
                        Log.v("FirebaseCrashlytics", strM17734i3, null);
                    }
                }
                r11 = 0;
            } else {
                up1Var = up1Var;
                ed1Var = ed1Var2;
                i = 2;
                obj = null;
                i2 = 4;
                String strM22988k = ux5.m22988k(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    r11 = obj;
                    Log.v("FirebaseCrashlytics", strM22988k, null);
                    r11 = obj;
                }
            }
        } else {
            up1Var = up1Var;
            ed1Var = ed1Var2;
            i = 2;
            Object obj2 = null;
            i2 = 4;
            r11 = obj2;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
                r11 = obj2;
            }
        }
        if (z2 && up1Var.m22850c()) {
            String strM17734i4 = AbstractC3393o1.m17734i("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", i)) {
                Log.v("FirebaseCrashlytics", strM17734i4, r11);
            }
            up1Var.m22848a().getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, r11);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, r11);
            Log.w("FirebaseCrashlytics", "No native core present", r11);
        }
        if (z != 0) {
            z3 = false;
            str = (String) arrayList.get(0);
        } else {
            z3 = false;
            this.f13661l.m17576a(r11);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        zq1 zq1Var2 = (zq1) ed1Var.f37034b;
        t33 t33Var3 = zq1Var2.f71962b;
        t33Var3.m21830a(".com.google.firebase.crashlytics");
        t33Var3.m21830a(".com.google.firebase.crashlytics-ndk");
        if (!t33Var3.f61786a.isEmpty()) {
            t33Var3.m21830a(".com.google.firebase.crashlytics.files.v1");
            final String str5 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = (File) t33Var3.f61787b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: s33
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str6) {
                    return str6.startsWith(str5);
                }
            })) != null) {
                int length = list.length;
                for (?? r10 = z3; r10 < length; r10++) {
                    t33Var3.m21830a(list[r10]);
                }
            }
        }
        NavigableSet<String> navigableSetM25743c = zq1Var2.m25743c();
        if (str != null) {
            navigableSetM25743c.remove(str);
        }
        if (navigableSetM25743c.size() > 8) {
            while (navigableSetM25743c.size() > 8) {
                String str6 = (String) navigableSetM25743c.last();
                String strM17734i5 = AbstractC3393o1.m17734i("Removing session over cap: ", str6);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strM17734i5, null);
                }
                t33.m21828d(new File((File) t33Var3.f61789d, str6));
                navigableSetM25743c.remove(str6);
            }
        }
        for (String str7 : navigableSetM25743c) {
            String strM17734i6 = AbstractC3393o1.m17734i("Finalizing report for session ", str7);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM17734i6, null);
            }
            yq1 yq1Var = zq1.f71958g;
            mp1 mp1Var = zq1.f71960i;
            File file2 = new File((File) t33Var3.f61789d, str7);
            file2.mkdirs();
            List<File> listM21829e = t33.m21829e(file2.listFiles(mp1Var));
            if (listM21829e.isEmpty()) {
                String strM24118n = wq1.m24118n("Session ", str7, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strM24118n, null);
                }
            } else {
                Collections.sort(listM21829e);
                ArrayList arrayList3 = new ArrayList();
                boolean z5 = z3;
                for (File file3 : listM21829e) {
                    try {
                        String strM25740e = zq1.m25740e(file3);
                        yq1Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strM25740e));
                            try {
                                m30 m30VarM25277e = yq1.m25277e(jsonReader);
                                jsonReader.close();
                                arrayList3.add(m30VarM25277e);
                                if (z5) {
                                    z4 = true;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                z5 = z4;
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList3.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str7, null);
                } else {
                    String strM25842d = new zx5(t33Var3).m25842d(str7);
                    C3309ls c3309ls = zq1Var2.f71964d.f53087b;
                    synchronized (c3309ls) {
                        if (Objects.equals((String) c3309ls.f50065c, str7)) {
                            strSubstring = (String) c3309ls.f50066d;
                        } else {
                            t33 t33Var4 = (t33) c3309ls.f50064b;
                            mp1 mp1Var2 = C3309ls.f50059i;
                            File file4 = new File((File) t33Var4.f61789d, str7);
                            file4.mkdirs();
                            List listM21829e2 = t33.m21829e(file4.listFiles(mp1Var2));
                            if (listM21829e2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listM21829e2, C3309ls.f50060j)).getName().substring(i2);
                            }
                        }
                    }
                    File fileM21831b2 = t33Var3.m21831b(str7, "report");
                    try {
                        String strM25740e2 = zq1.m25740e(fileM21831b2);
                        yq1Var.getClass();
                        x20 x20VarM23464b = yq1.m25281i(strM25740e2).m23464b(jCurrentTimeMillis, strM25842d, z5);
                        w20 w20VarMo23463a = x20VarM23464b.mo23463a();
                        w20VarMo23463a.f66243g = strSubstring;
                        uq1 uq1Var = x20VarM23464b.f67665k;
                        if (uq1Var != null) {
                            f30 f30VarMo12307a = uq1Var.mo12307a();
                            f30VarMo12307a.f38322c = strSubstring;
                            w20VarMo23463a.f66246j = f30VarMo12307a.m11510a();
                        }
                        x20 x20VarM23675a = w20VarMo23463a.m23675a();
                        uq1 uq1Var2 = x20VarM23675a.f67665k;
                        if (uq1Var2 == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        w20 w20VarMo23463a2 = x20VarM23675a.mo23463a();
                        f30 f30VarMo12307a2 = uq1Var2.mo12307a();
                        f30VarMo12307a2.f38330k = arrayList3;
                        w20VarMo23463a2.f66246j = f30VarMo12307a2.m11510a();
                        x20 x20VarM23675a2 = w20VarMo23463a2.m23675a();
                        uq1 uq1Var3 = x20VarM23675a2.f67665k;
                        if (uq1Var3 != null) {
                            String str8 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str8, null);
                                    } catch (IOException e6) {
                                        e = e6;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM21831b2, e);
                                    }
                                }
                                zq1.m25741f(z5 ? new File((File) t33Var3.f61791f, ((g30) uq1Var3).f40093b) : new File((File) t33Var3.f61790e, ((g30) uq1Var3).f40093b), yq1.f70284a.m4509e(x20VarM23675a2));
                            } catch (IOException e7) {
                                e = e7;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM21831b2, e);
                            }
                        }
                        e = e6;
                    } catch (IOException e8) {
                        e = e8;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileM21831b2, e);
                }
                t33.m21828d(new File((File) t33Var3.f61789d, str7));
                z3 = false;
                i2 = 4;
            }
            t33.m21828d(new File((File) t33Var3.f61789d, str7));
            z3 = false;
            i2 = 4;
        }
        oj5 oj5Var = zq1Var2.f71963c.m6684b().f43294a;
        ArrayList arrayListM25742b = zq1Var2.m25742b();
        int size = arrayListM25742b.size();
        if (size <= 4) {
            return;
        }
        Iterator it3 = arrayListM25742b.subList(4, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6673c(String str, Boolean bool) {
        String str2;
        String str3;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strM17734i = AbstractC3393o1.m17734i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM17734i, null);
        }
        Locale locale = Locale.US;
        dz3 dz3Var = this.f13655f;
        xg1 xg1Var = this.f13657h;
        m50 m50Var = new m50(dz3Var.f36452c, (String) xg1Var.f68171f, (String) xg1Var.f68172g, dz3Var.m10757c().f58591a, DeliveryMechanism.determineFrom((String) xg1Var.f68169d).getId(), (b64) xg1Var.f68173h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        o50 o50Var = new o50(pb1.m19021I());
        Context context = this.f13650a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = CommonUtils$Architecture.getValue().ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jM19043m = pb1.m19043m(context);
        boolean zM19019G = pb1.m19019G();
        int iM19055y = pb1.m19055y();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.f13659j.m22851d(str, jCurrentTimeMillis, new l50(m50Var, o50Var, new n50(iOrdinal, iAvailableProcessors, jM19043m, blockCount, zM19019G, iM19055y)));
        if (!bool.booleanValue() || str == null) {
            str2 = str5;
            str3 = str8;
        } else {
            t33 t33Var = this.f13653d;
            synchronized (t33Var.f61786a) {
                t33Var.f61786a = str;
                sj4 sj4Var = (sj4) ((AtomicMarkableReference) ((C3552rx) t33Var.f61789d).f59987b).getReference();
                synchronized (sj4Var) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sj4Var.f60926a));
                }
                str2 = str5;
                str3 = str8;
                ((C1149a) t33Var.f61788c).f13669b.m9855a(new oc0(t33Var, str, mapUnmodifiableMap, ((xh8) t33Var.f61791f).m24518a(), 4));
            }
        }
        b64 b64Var = this.f13658i;
        ((q33) b64Var.f8007b).mo4101b();
        b64Var.f8007b = b64.f8002c;
        if (str != null) {
            b64Var.f8007b = new bq7(((t33) b64Var.f8006a).m21831b(str, "userlog"));
        }
        this.f13661l.m17576a(str);
        ed1 ed1Var = this.f13662m;
        xq1 xq1Var = (xq1) ed1Var.f37033a;
        Charset charset = vq1.f65777a;
        w20 w20Var = new w20();
        w20Var.f66237a = "20.0.6";
        xg1 xg1Var2 = xq1Var.f68530c;
        String str9 = (String) xg1Var2.f68166a;
        if (str9 == null) {
            C3386nv.m17635v("Null gmpAppId");
            return;
        }
        w20Var.f66238b = str9;
        dz3 dz3Var2 = xq1Var.f68529b;
        String str10 = dz3Var2.m10757c().f58591a;
        if (str10 == null) {
            C3386nv.m17635v("Null installationUuid");
            return;
        }
        w20Var.f66240d = str10;
        w20Var.f66241e = dz3Var2.m10757c().f58592b;
        w20Var.f66242f = dz3Var2.m10757c().f58593c;
        String str11 = (String) xg1Var2.f68171f;
        if (str11 == null) {
            C3386nv.m17635v("Null buildVersion");
            return;
        }
        w20Var.f66244h = str11;
        String str12 = (String) xg1Var2.f68172g;
        if (str12 == null) {
            C3386nv.m17635v("Null displayVersion");
            return;
        }
        w20Var.f66245i = str12;
        w20Var.f66239c = 4;
        w20Var.f66249m = (byte) (w20Var.f66249m | 1);
        f30 f30Var = new f30();
        f30Var.f38325f = false;
        byte b = (byte) (f30Var.f38332m | 2);
        f30Var.f38323d = jCurrentTimeMillis;
        f30Var.f38332m = (byte) (b | 1);
        if (str == null) {
            C3386nv.m17635v("Null identifier");
            return;
        }
        f30Var.f38321b = str;
        String str13 = xq1.f68527g;
        if (str13 == null) {
            C3386nv.m17635v("Null generator");
            return;
        }
        f30Var.f38320a = str13;
        String str14 = dz3Var2.f36452c;
        if (str14 == null) {
            C3386nv.m17635v("Null identifier");
            return;
        }
        String str15 = dz3Var2.m10757c().f58591a;
        b64 b64Var2 = (b64) xg1Var2.f68173h;
        if (((sc2) b64Var2.f8007b) == null) {
            b64Var2.f8007b = new sc2(b64Var2);
        }
        sc2 sc2Var = (sc2) b64Var2.f8007b;
        String str16 = sc2Var.f60665a;
        if (sc2Var == null) {
            b64Var2.f8007b = new sc2(b64Var2);
        }
        f30Var.f38326g = new h30(str14, str11, str12, str15, str16, ((sc2) b64Var2.f8007b).f60666b);
        f40 f40Var = new f40();
        f40Var.f38382a = 3;
        f40Var.f38386e = (byte) (f40Var.f38386e | 1);
        if (str4 == null) {
            C3386nv.m17635v("Null version");
            return;
        }
        f40Var.f38383b = str4;
        String str17 = str2;
        if (str17 == null) {
            C3386nv.m17635v("Null buildVersion");
            return;
        }
        f40Var.f38384c = str17;
        f40Var.f38385d = pb1.m19021I();
        f40Var.f38386e = (byte) (f40Var.f38386e | 2);
        f30Var.f38328i = f40Var.m11529a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str18 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str18) && (num = (Integer) xq1.f68526f.get(str18.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jM19043m2 = pb1.m19043m(xq1Var.f68528a);
        long blockSize = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
        boolean zM19019G2 = pb1.m19019G();
        int iM19055y2 = pb1.m19055y();
        j30 j30Var = new j30();
        j30Var.f44989a = iIntValue;
        byte b2 = (byte) (j30Var.f44998j | 1);
        j30Var.f44998j = b2;
        if (str6 == null) {
            C3386nv.m17635v("Null model");
            return;
        }
        j30Var.f44990b = str6;
        j30Var.f44991c = iAvailableProcessors2;
        j30Var.f44992d = jM19043m2;
        j30Var.f44993e = blockSize;
        j30Var.f44994f = zM19019G2;
        j30Var.f44995g = iM19055y2;
        j30Var.f44998j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str7 == null) {
            C3386nv.m17635v("Null manufacturer");
            return;
        }
        j30Var.f44996h = str7;
        String str19 = str3;
        if (str19 == null) {
            C3386nv.m17635v("Null modelClass");
            return;
        }
        j30Var.f44997i = str19;
        f30Var.f38329j = j30Var.m14280a();
        f30Var.f38331l = 3;
        f30Var.f38332m = (byte) (f30Var.f38332m | 4);
        w20Var.f66246j = f30Var.m11510a();
        x20 x20VarM23675a = w20Var.m23675a();
        t33 t33Var2 = ((zq1) ed1Var.f37034b).f71962b;
        uq1 uq1Var = x20VarM23675a.f67665k;
        if (uq1Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str20 = ((g30) uq1Var).f40093b;
        try {
            zq1.f71958g.getClass();
            zq1.m25741f(t33Var2.m21831b(str20, "report"), yq1.f70284a.m4509e(x20VarM23675a));
            File fileM21831b = t33Var2.m21831b(str20, "start-time");
            long j = ((g30) uq1Var).f40095d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM21831b), zq1.f71956e);
            try {
                outputStreamWriter.write("");
                fileM21831b.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strM17734i2 = AbstractC3393o1.m17734i("Could not persist report for session ", str20);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strM17734i2, e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6674d(C1150a c1150a) throws Throwable {
        C1149a.m6679a();
        br1 br1Var = this.f13663n;
        if (br1Var != null && br1Var.f8884e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            m6672b(true, c1150a, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m6675e() {
        NavigableSet navigableSetM25743c = ((zq1) this.f13662m.f37034b).m25743c();
        if (navigableSetM25743c.isEmpty()) {
            return null;
        }
        return (String) navigableSetM25743c.first();
    }

    /* JADX INFO: renamed from: f */
    public final String m6676f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.f13650a;
        int iM19015C = pb1.m19015C(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iM19015C == 0 ? null : context.getResources().getString(iM19015C);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f13649s), 0);
        }
        ClassLoader classLoader = C1148a.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            resourceAsStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6677g() {
        try {
            String strM6676f = m6676f();
            if (strM6676f != null) {
                try {
                    this.f13653d.m21832f(strM6676f);
                } catch (IllegalArgumentException e) {
                    Context context = this.f13650a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6678h(tld tldVar) {
        tld tldVar2;
        tld tldVarM21619c0;
        wr9 wr9Var = this.f13664o;
        t33 t33Var = ((zq1) this.f13662m.f37034b).f71962b;
        if (t33.m21829e(((File) t33Var.f61790e).listFiles()).isEmpty() && t33.m21829e(((File) t33Var.f61791f).listFiles()).isEmpty() && t33.m21829e(((File) t33Var.f61792g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            wr9Var.m24140d(Boolean.FALSE);
            return;
        }
        iy5 iy5Var = iy5.f44770f;
        iy5Var.m14207r("Crash reports are available to be sent.");
        tz1 tz1Var = this.f13651b;
        if (tz1Var.m22354a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            wr9Var.m24140d(Boolean.FALSE);
            tldVarM21619c0 = Tasks.m5975c(Boolean.TRUE);
        } else {
            iy5Var.m14205e("Automatic data collection is disabled.");
            iy5Var.m14207r("Notifying that unsent reports are available.");
            wr9Var.m24140d(Boolean.TRUE);
            synchronized (tz1Var.f63124c) {
                tldVar2 = ((wr9) tz1Var.f63125d).f67208a;
            }
            a3d a3dVar = new a3d();
            tldVar2.getClass();
            rk8 rk8Var = xr9.f68587a;
            tld tldVar3 = new tld();
            tldVar2.f62491b.m24268e(new aec(rk8Var, a3dVar, tldVar3));
            tldVar2.m22205t();
            iy5Var.m14205e("Waiting for send/deleteUnsentReports to be called.");
            tldVarM21619c0 = AbstractC3584sr.m21619c0(tldVar3, this.f13665p.f67208a);
        }
        tldVarM21619c0.mo5972n(this.f13654e.f13668a, new C3156jq(this, tldVar, false));
    }
}
