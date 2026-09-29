package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.p002ui.unit.LayoutDirection;
import com.amplitude.android.storage.C0897a;
import com.amplitude.core.diagnostics.C0905a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.sessions.api.C1165a;
import com.google.firebase.sessions.api.SessionSubscriber$Name;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.lingq.feature.library.preview.LessonPreviewFragment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3487q7 implements InterfaceC2991f7, ld2, InterfaceC3698vu, fn9, w92, zc1, bm1, ur9, js6, gr6, sg6, pp6, gp9, xn9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57333b;

    public /* synthetic */ C3487q7(Object obj, int i) {
        this.f57332a = i;
        this.f57333b = obj;
    }

    @Override // p000.pp6
    /* JADX INFO: renamed from: a */
    public void mo19438a() {
        ke2 ke2Var = (ke2) this.f57333b;
        synchronized (nc9.f52602c) {
            nc9.f52608i = u91.m22602T0(nc9.f52608i, ke2Var);
        }
        nc9.m17349a();
    }

    @Override // p000.InterfaceC3698vu
    /* JADX INFO: renamed from: b */
    public int mo12753b(int i, LayoutDirection layoutDirection) {
        return ((ec0) this.f57333b).mo4499a(0, i, layoutDirection);
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ((vi3) ((t66) this.f57333b).getValue()).invoke(obj);
    }

    @Override // p000.ur9
    /* JADX INFO: renamed from: d */
    public void mo4379d() {
        int i = this.f57332a;
        Object obj = this.f57333b;
        switch (i) {
            case 10:
                ((yd4) obj).m25092m();
                break;
            default:
                bd4 bd4Var = (bd4) obj;
                if (bd4Var.m3644o()) {
                    bd4Var.m3640f(new ie4(JobAction.ResumeAsyncTimeOut, null, -1L), JobState.RunningAsync);
                    break;
                }
                break;
        }
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        int i = this.f57332a;
        Object obj = this.f57333b;
        switch (i) {
            case 8:
                return (Task) ((Callable) obj).call();
            default:
                ((Runnable) obj).run();
                return Tasks.m5975c(null);
        }
    }

    @Override // p000.xn9
    /* JADX INFO: renamed from: f */
    public yn9 mo14502f(wn9 wn9Var) {
        Context context = (Context) this.f57333b;
        String str = (String) wn9Var.f67097d;
        C3126ix c3126ix = (C3126ix) wn9Var.f67098e;
        c3126ix.getClass();
        if (str != null && str.length() != 0) {
            return new ah3(context, str, c3126ix, true, true);
        }
        C3386nv.m17626m("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        boolean z;
        t7a t7aVar = (t7a) obj;
        if (!((FirebaseMessaging) this.f57333b).f13725e.m20974i() || t7aVar.f61962h.m20436a() == null) {
            return;
        }
        synchronized (t7aVar) {
            z = t7aVar.f61961g;
        }
        if (z) {
            return;
        }
        t7aVar.m21893f(0L);
    }

    @Override // p000.ld2
    public C0905a get() {
        int i = this.f57332a;
        C0897a c0897a = (C0897a) this.f57333b;
        switch (i) {
            case 1:
                break;
        }
        return c0897a.f10984b.m5110d();
    }

    @Override // p000.w92
    /* JADX INFO: renamed from: h */
    public void mo13969h(uo7 uo7Var) {
        int i = this.f57332a;
        Object obj = this.f57333b;
        switch (i) {
            case 6:
                up1 up1Var = (up1) obj;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                up1Var.f64163b.set((up1) uo7Var.get());
                break;
            default:
                vp1 vp1Var = (vp1) obj;
                ny8 ny8Var = ((h58) ((m53) uo7Var.get())).m13058b("firebase").f49080i;
                ((Set) ny8Var.f53417e).add(vp1Var);
                Task taskM19940b = ((qg1) ny8Var.f53414b).m19940b();
                taskM19940b.mo5963e((Executor) ny8Var.f53416d, new ar1(ny8Var, taskM19940b, vp1Var, 5));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public C3846zu m19688i(C3309ls c3309ls) throws IOException {
        mo0 mo0Var = (mo0) this.f57333b;
        URL url = (URL) c3309ls.f50064b;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(mo0Var.f51619g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c3309ls.f50066d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    cc4 cc4Var = mo0Var.f51613a;
                    t20 t20Var = (t20) c3309ls.f50065c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    of4 of4Var = (of4) cc4Var.f9881a;
                    pg4 pg4Var = new pg4(bufferedWriter, of4Var.f54269a, of4Var.f54270b, of4Var.f54271c, of4Var.f54272d);
                    pg4Var.m19126h(t20Var);
                    pg4Var.m19128j();
                    pg4Var.f56126b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    x74.m24357n("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    x74.m24357n("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C3846zu(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C3846zu(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C3846zu c3846zu = new C3846zu(responseCode, null, y40.m24935a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f69267a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c3846zu;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException | IOException e) {
            x74.m24359p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C3846zu(400, null, 0L);
        } catch (ConnectException | UnknownHostException e2) {
            x74.m24359p("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
            return new C3846zu(500, null, 0L);
        }
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        return Tasks.m5975c((wg1) this.f57333b);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:114:0x0503  */
    /* JADX WARN: Code duplicated, block: B:118:0x0524  */
    /* JADX WARN: Code duplicated, block: B:124:0x058d  */
    /* JADX WARN: Code duplicated, block: B:126:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x0241  */
    /* JADX WARN: Code duplicated, block: B:51:0x026b  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x031c A[LOOP:3: B:66:0x0316->B:68:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0330  */
    /* JADX WARN: Code duplicated, block: B:72:0x0337  */
    /* JADX WARN: Code duplicated, block: B:83:0x039b  */
    /* JADX WARN: Code duplicated, block: B:86:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x03b0  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x058d, please report this as an issue */
    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        ExecutorService executorService;
        tp1 tp1Var;
        C1149a c1149a;
        int i;
        Throwable th;
        String strM17734i;
        r43 r43Var;
        long jCurrentTimeMillis;
        String str;
        String str2;
        String strM17734i2;
        int iM19015C;
        String string;
        String[] strArr;
        ArrayList arrayList;
        int i2;
        StringBuilder sb;
        Iterator it;
        String string2;
        String strM19028P;
        C1150a c1150a;
        tp1 tp1Var2;
        Context context;
        boolean z;
        String str3;
        C1149a c1149a2;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        String str4;
        String string3;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f57333b;
        int i3 = CrashlyticsRegistrar.f13643d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        q43 q43Var = (q43) co7Var.mo4926a(q43.class);
        x43 x43Var = (x43) co7Var.mo4926a(x43.class);
        qz6 qz6VarM4936o = co7Var.m4936o(up1.class);
        qz6 qz6VarM4936o2 = co7Var.m4936o(InterfaceC3036gf.class);
        qz6 qz6VarM4936o3 = co7Var.m4936o(m53.class);
        ExecutorService executorService2 = (ExecutorService) co7Var.mo4932g(crashlyticsRegistrar.f13644a);
        ExecutorService executorService3 = (ExecutorService) co7Var.mo4932g(crashlyticsRegistrar.f13645b);
        ExecutorService executorService4 = (ExecutorService) co7Var.mo4932g(crashlyticsRegistrar.f13646c);
        q43Var.m19644a();
        Context context2 = q43Var.f57252a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.6 for " + packageName, null);
        C1149a c1149a3 = new C1149a(executorService2, executorService3);
        t33 t33Var = new t33(context2);
        tz1 tz1Var = new tz1(q43Var);
        dz3 dz3Var = new dz3(context2, packageName, x43Var, tz1Var);
        up1 up1Var = new up1(qz6VarM4936o);
        C3370nf c3370nf = new C3370nf(qz6VarM4936o2);
        np1 np1Var = new np1(tz1Var, t33Var);
        C1165a c1165a = C1165a.f13849a;
        SessionSubscriber$Name sessionSubscriber$Name = SessionSubscriber$Name.CRASHLYTICS;
        C1165a c1165a2 = C1165a.f13849a;
        t53 t53VarM6752a = C1165a.m6752a(sessionSubscriber$Name);
        if (t53VarM6752a.f61875b != null) {
            Log.d("FirebaseSessions", "Subscriber " + sessionSubscriber$Name + " already registered.");
        } else {
            t53VarM6752a.f61875b = np1Var;
            Log.d("FirebaseSessions", "Subscriber " + sessionSubscriber$Name + " registered.");
            t53VarM6752a.f61874a.countDown();
        }
        tp1 tp1Var3 = new tp1(q43Var, dz3Var, up1Var, tz1Var, new C3333mf(c3370nf), new C3333mf(c3370nf), t33Var, np1Var, new cc4(qz6VarM4936o3), c1149a3);
        C1149a c1149a4 = tp1Var3.f62668o;
        q43Var.m19644a();
        String str5 = q43Var.f57254c.f261b;
        int iM19015C2 = pb1.m19015C(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM19015C2 == 0) {
            iM19015C2 = pb1.m19015C(context2, "com.crashlytics.android.build_id", "string");
        }
        String string4 = iM19015C2 != 0 ? context2.getResources().getString(iM19015C2) : null;
        ArrayList<mj0> arrayList2 = new ArrayList();
        int iM19015C3 = pb1.m19015C(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iM19015C4 = pb1.m19015C(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iM19015C5 = pb1.m19015C(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            try {
                try {
                    if (iM19015C3 == 0 || iM19015C4 == 0 || iM19015C5 == 0) {
                        executorService = executorService4;
                        tp1Var = tp1Var3;
                        c1149a = c1149a4;
                        String str6 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iM19015C3), Integer.valueOf(iM19015C4), Integer.valueOf(iM19015C5));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str6, null);
                        }
                        strM17734i = AbstractC3393o1.m17734i("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strM17734i, th);
                        }
                        for (mj0 mj0Var : arrayList2) {
                            String strM16849c = mj0Var.m16849c();
                            String strM16847a = mj0Var.m16847a();
                            String strM16848b = mj0Var.m16848b();
                            StringBuilder sbM23000w = ux5.m23000w("Build id for ", strM16849c, " on ", strM16847a, ": ");
                            sbM23000w.append(strM16848b);
                            string3 = sbM23000w.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string3, null);
                            }
                        }
                        b64 b64Var = new b64(context2, 27);
                        String packageName2 = context2.getPackageName();
                        String strM10758d = dz3Var.m10758d();
                        PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
                        String string5 = Long.toString(packageInfo.getLongVersionCode());
                        str2 = packageInfo.versionName;
                        if (str2 == null) {
                            str2 = "0.0";
                        }
                        String str7 = str2;
                        xg1 xg1Var = new xg1(str5, string4, arrayList2, strM10758d, packageName2, string5, str7, b64Var);
                        strM17734i2 = AbstractC3393o1.m17734i("Installer package name is: ", strM10758d);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strM17734i2, null);
                        }
                        nj0 nj0Var = new nj0(12);
                        String strM10758d2 = dz3Var.m10758d();
                        nj0 nj0Var2 = new nj0(17);
                        or3 or3Var = new or3(nj0Var2);
                        qn3 qn3Var = new qn3();
                        qn3Var.f57974a = new File((File) t33Var.f61788c, "com.crashlytics.settings.json");
                        Locale locale = Locale.US;
                        C0842cc c0842cc = new C0842cc(wq1.m24118n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), nj0Var);
                        String str8 = Build.MANUFACTURER;
                        String str9 = dz3.f36449h;
                        String strM17735j = AbstractC3393o1.m17735j(str8.replaceAll(str9, ""), "/", Build.MODEL.replaceAll(str9, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str9, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str9, "");
                        iM19015C = pb1.m19015C(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iM19015C == 0) {
                            iM19015C = pb1.m19015C(context2, "com.crashlytics.android.build_id", "string");
                        }
                        if (iM19015C != 0) {
                            string = context2.getResources().getString(iM19015C);
                        } else {
                            string = null;
                        }
                        strArr = new String[]{string, str5, str7, string5};
                        arrayList = new ArrayList();
                        for (i2 = 0; i2 < 4; i2++) {
                            str4 = strArr[i2];
                            if (str4 != null) {
                                arrayList.add(str4.replace("-", "").toLowerCase(Locale.US));
                            }
                        }
                        Collections.sort(arrayList);
                        sb = new StringBuilder();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                        string2 = sb.toString();
                        if (string2.length() > 0) {
                            strM19028P = pb1.m19028P(string2);
                        } else {
                            strM19028P = null;
                        }
                        c1150a = new C1150a(context2, new s29(str5, strM17735j, strReplaceAll, strReplaceAll2, dz3Var, strM19028P, str7, string5, DeliveryMechanism.determineFrom(strM10758d2).getId()), nj0Var2, or3Var, qn3Var, c0842cc, tz1Var);
                        c1150a.m6685c(c1149a3).mo5962d(executorService, new ho2(22));
                        tp1Var2 = tp1Var;
                        t33 t33Var2 = tp1Var2.f62662i;
                        context = tp1Var2.f62654a;
                        if (context != null || (resources = context.getResources()) == null) {
                            z = true;
                        } else {
                            int iM19015C6 = pb1.m19015C(context, "com.crashlytics.RequireBuildId", "bool");
                            if (iM19015C6 > 0) {
                                z = resources.getBoolean(iM19015C6);
                            } else {
                                int iM19015C7 = pb1.m19015C(context, "com.crashlytics.RequireBuildId", "string");
                                if (iM19015C7 > 0) {
                                    z = Boolean.parseBoolean(context.getString(iM19015C7));
                                } else {
                                    z = true;
                                }
                            }
                        }
                        str3 = (String) xg1Var.f68167b;
                        if (z) {
                            if (TextUtils.isEmpty(str3)) {
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".     |  | ");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                Log.e("FirebaseCrashlytics", ".    \\    /");
                                Log.e("FirebaseCrashlytics", ".     \\  /");
                                Log.e("FirebaseCrashlytics", ".      \\/");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".      /\\");
                                Log.e("FirebaseCrashlytics", ".     /  \\");
                                Log.e("FirebaseCrashlytics", ".    /    \\");
                                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".");
                                C3386nv.m17633t("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                return null;
                            }
                        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                        }
                        String str10 = new bl0().f8653a;
                        tp1Var2.f62659f = new b64("crash_marker", t33Var2);
                        tp1Var2.f62658e = new b64("initialization_marker", t33Var2);
                        c1149a2 = c1149a;
                        t33 t33Var3 = new t33(str10, t33Var2, c1149a2);
                        b64 b64Var2 = new b64(t33Var2);
                        jg9[] jg9VarArr = {new e41(15)};
                        bl2 bl2Var = new bl2();
                        bl2Var.f8655a = jg9VarArr;
                        bl2Var.f8656b = new tr3(13);
                        cc4 cc4Var = tp1Var2.f62667n;
                        cc4Var.getClass();
                        ((qz6) cc4Var.f9881a).m20220a(new C3487q7(new vp1(t33Var3), 19));
                        tp1Var2.f62660g = new C1148a(tp1Var2.f62654a, tp1Var2.f62661h, tp1Var2.f62655b, tp1Var2.f62662i, tp1Var2.f62659f, xg1Var, t33Var3, b64Var2, ed1.m11048l(tp1Var2.f62654a, tp1Var2.f62661h, tp1Var2.f62662i, xg1Var, b64Var2, t33Var3, bl2Var, c1150a, tp1Var2.f62656c, tp1Var2.f62665l, tp1Var2.f62668o), tp1Var2.f62666m, tp1Var2.f62664k, tp1Var2.f62665l, tp1Var2.f62668o);
                        b64 b64Var3 = tp1Var2.f62658e;
                        t33 t33Var4 = (t33) b64Var3.f8007b;
                        String str11 = (String) b64Var3.f8006a;
                        t33Var4.getClass();
                        zExists = new File((File) t33Var4.f61788c, str11).exists();
                        Boolean.TRUE.equals((Boolean) c1149a2.f13668a.f34397a.submit(new ng1(tp1Var2, 1)).get(3L, TimeUnit.SECONDS));
                        C1148a c1148a = tp1Var2.f62660g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        c1148a.f13654e.f13668a.m9855a(new RunnableC3470pr(8, c1148a, str10));
                        br1 br1Var = new br1(new m58(c1148a, 16), c1150a, defaultUncaughtExceptionHandler, c1148a.f13659j);
                        c1148a.f13663n = br1Var;
                        Thread.setDefaultUncaughtExceptionHandler(br1Var);
                        if (zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            c1149a2.f13668a.m9855a(new RunnableC3470pr(9, tp1Var2, c1150a));
                        } else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            tp1Var2.m22261b(c1150a);
                        }
                        r43Var = new r43(tp1Var2);
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        if (jCurrentTimeMillis > 16) {
                            str = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str, null);
                            }
                        }
                        return r43Var;
                    }
                    String[] stringArray = context2.getResources().getStringArray(iM19015C3);
                    String[] stringArray2 = context2.getResources().getStringArray(iM19015C4);
                    String[] stringArray3 = context2.getResources().getStringArray(iM19015C5);
                    c1149a = c1149a4;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i4 = 0;
                        while (i4 < stringArray3.length) {
                            int i5 = i4;
                            arrayList2.add(new mj0(stringArray[i5], stringArray2[i5], stringArray3[i5]));
                            i4 = i5 + 1;
                            tp1Var3 = tp1Var3;
                            executorService4 = executorService4;
                        }
                        executorService = executorService4;
                        tp1Var = tp1Var3;
                    } else {
                        executorService = executorService4;
                        tp1Var = tp1Var3;
                        String str12 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str12, null);
                        }
                    }
                    i = 3;
                    Boolean.TRUE.equals((Boolean) c1149a2.f13668a.f34397a.submit(new ng1(tp1Var2, 1)).get(3L, TimeUnit.SECONDS));
                } catch (Exception unused) {
                }
                tp1Var2.f62659f = new b64("crash_marker", t33Var2);
                tp1Var2.f62658e = new b64("initialization_marker", t33Var2);
                c1149a2 = c1149a;
                t33 t33Var5 = new t33(str10, t33Var2, c1149a2);
                b64 b64Var4 = new b64(t33Var2);
                jg9[] jg9VarArr2 = {new e41(15)};
                bl2 bl2Var2 = new bl2();
                bl2Var2.f8655a = jg9VarArr2;
                bl2Var2.f8656b = new tr3(13);
                cc4 cc4Var2 = tp1Var2.f62667n;
                cc4Var2.getClass();
                ((qz6) cc4Var2.f9881a).m20220a(new C3487q7(new vp1(t33Var5), 19));
                tp1Var2.f62660g = new C1148a(tp1Var2.f62654a, tp1Var2.f62661h, tp1Var2.f62655b, tp1Var2.f62662i, tp1Var2.f62659f, xg1Var, t33Var5, b64Var4, ed1.m11048l(tp1Var2.f62654a, tp1Var2.f62661h, tp1Var2.f62662i, xg1Var, b64Var4, t33Var5, bl2Var2, c1150a, tp1Var2.f62656c, tp1Var2.f62665l, tp1Var2.f62668o), tp1Var2.f62666m, tp1Var2.f62664k, tp1Var2.f62665l, tp1Var2.f62668o);
                b64 b64Var5 = tp1Var2.f62658e;
                t33 t33Var6 = (t33) b64Var5.f8007b;
                String str13 = (String) b64Var5.f8006a;
                t33Var6.getClass();
                zExists = new File((File) t33Var6.f61788c, str13).exists();
                C1148a c1148a2 = tp1Var2.f62660g;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                c1148a2.f13654e.f13668a.m9855a(new RunnableC3470pr(8, c1148a2, str10));
                br1 br1Var2 = new br1(new m58(c1148a2, 16), c1150a, defaultUncaughtExceptionHandler2, c1148a2.f13659j);
                c1148a2.f13663n = br1Var2;
                Thread.setDefaultUncaughtExceptionHandler(br1Var2);
                if (zExists) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    c1149a2.f13668a.m9855a(new RunnableC3470pr(9, tp1Var2, c1150a));
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    c1149a2.f13668a.m9855a(new RunnableC3470pr(9, tp1Var2, c1150a));
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                tp1Var2.f62660g = null;
            }
            String packageName3 = context2.getPackageName();
            String strM10758d3 = dz3Var.m10758d();
            PackageInfo packageInfo2 = context2.getPackageManager().getPackageInfo(packageName3, 0);
            String string6 = Long.toString(packageInfo2.getLongVersionCode());
            str2 = packageInfo2.versionName;
            if (str2 == null) {
                str2 = "0.0";
            }
            String str14 = str2;
            xg1 xg1Var2 = new xg1(str5, string4, arrayList2, strM10758d3, packageName3, string6, str14, b64Var);
            strM17734i2 = AbstractC3393o1.m17734i("Installer package name is: ", strM10758d3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strM17734i2, null);
            }
            nj0 nj0Var3 = new nj0(12);
            String strM10758d4 = dz3Var.m10758d();
            nj0 nj0Var4 = new nj0(17);
            or3 or3Var2 = new or3(nj0Var4);
            qn3 qn3Var2 = new qn3();
            qn3Var2.f57974a = new File((File) t33Var.f61788c, "com.crashlytics.settings.json");
            Locale locale2 = Locale.US;
            C0842cc c0842cc2 = new C0842cc(wq1.m24118n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), nj0Var3);
            String str15 = Build.MANUFACTURER;
            String str16 = dz3.f36449h;
            String strM17735j2 = AbstractC3393o1.m17735j(str15.replaceAll(str16, ""), "/", Build.MODEL.replaceAll(str16, ""));
            String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str16, "");
            String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str16, "");
            iM19015C = pb1.m19015C(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iM19015C == 0) {
                iM19015C = pb1.m19015C(context2, "com.crashlytics.android.build_id", "string");
            }
            if (iM19015C != 0) {
                string = context2.getResources().getString(iM19015C);
            } else {
                string = null;
            }
            strArr = new String[]{string, str5, str14, string6};
            arrayList = new ArrayList();
            while (i2 < 4) {
                str4 = strArr[i2];
                if (str4 != null) {
                    arrayList.add(str4.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            sb = new StringBuilder();
            it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            string2 = sb.toString();
            if (string2.length() > 0) {
                strM19028P = pb1.m19028P(string2);
            } else {
                strM19028P = null;
            }
            c1150a = new C1150a(context2, new s29(str5, strM17735j2, strReplaceAll3, strReplaceAll4, dz3Var, strM19028P, str14, string6, DeliveryMechanism.determineFrom(strM10758d4).getId()), nj0Var4, or3Var2, qn3Var2, c0842cc2, tz1Var);
            c1150a.m6685c(c1149a3).mo5962d(executorService, new ho2(22));
            tp1Var2 = tp1Var;
            t33 t33Var7 = tp1Var2.f62662i;
            context = tp1Var2.f62654a;
            if (context != null) {
                z = true;
            } else {
                z = true;
            }
            str3 = (String) xg1Var2.f68167b;
            if (z) {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                }
            } else if (TextUtils.isEmpty(str3)) {
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", ".     |  | ");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                Log.e("FirebaseCrashlytics", ".    \\    /");
                Log.e("FirebaseCrashlytics", ".     \\  /");
                Log.e("FirebaseCrashlytics", ".      \\/");
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                Log.e("FirebaseCrashlytics", ".");
                Log.e("FirebaseCrashlytics", ".      /\\");
                Log.e("FirebaseCrashlytics", ".     /  \\");
                Log.e("FirebaseCrashlytics", ".    /    \\");
                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".     |  |");
                Log.e("FirebaseCrashlytics", ".");
                C3386nv.m17633t("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                return null;
            }
            String str17 = new bl0().f8653a;
            r43Var = new r43(tp1Var2);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
            r43Var = null;
        }
        th = null;
        strM17734i = AbstractC3393o1.m17734i("Mapping file ID is: ", string4);
        if (Log.isLoggable("FirebaseCrashlytics", i)) {
            Log.d("FirebaseCrashlytics", strM17734i, th);
        }
        while (r0.hasNext()) {
            String strM16849c2 = mj0Var.m16849c();
            String strM16847a2 = mj0Var.m16847a();
            String strM16848b2 = mj0Var.m16848b();
            StringBuilder sbM23000w2 = ux5.m23000w("Build id for ", strM16849c2, " on ", strM16847a2, ": ");
            sbM23000w2.append(strM16848b2);
            string3 = sbM23000w2.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string3, null);
            }
        }
        b64 b64Var6 = new b64(context2, 27);
        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
        if (jCurrentTimeMillis > 16) {
            str = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
        return r43Var;
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        int i = this.f57332a;
        Object obj = this.f57333b;
        switch (i) {
            case 21:
                hk8 hk8Var = (hk8) obj;
                hk8Var.getClass();
                int i2 = r31.f58545e;
                C3329mb c3329mb = new C3329mb(4, false);
                c3329mb.f50860b = null;
                c3329mb.f50861c = new ArrayList();
                c3329mb.f50862d = null;
                c3329mb.f50863e = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM13313a = hk8Var.m13313a();
                sQLiteDatabaseM13313a.beginTransaction();
                try {
                    r31 r31Var = (r31) hk8.m13312r(sQLiteDatabaseM13313a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ah1(hk8Var, map, c3329mb));
                    sQLiteDatabaseM13313a.setTransactionSuccessful();
                    return r31Var;
                } finally {
                    sQLiteDatabaseM13313a.endTransaction();
                }
            default:
                hk8 hk8Var2 = (hk8) ((n16) obj).f52181i;
                SQLiteDatabase sQLiteDatabaseM13313a2 = hk8Var2.m13313a();
                sQLiteDatabaseM13313a2.beginTransaction();
                try {
                    sQLiteDatabaseM13313a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM13313a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hk8Var2.f42544b.mo100g()).execute();
                    sQLiteDatabaseM13313a2.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM13313a2.endTransaction();
                }
        }
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        LessonPreviewFragment lessonPreviewFragment = (LessonPreviewFragment) this.f57333b;
        bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
        view.getClass();
        l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
        l64VarMo136i.getClass();
        RelativeLayout relativeLayout = lessonPreviewFragment.m9082h0().f68095c;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return null;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = l64VarMo136i.f49117b;
        relativeLayout.setLayoutParams(layoutParams2);
        MaterialButton materialButton = lessonPreviewFragment.m9082h0().f68093a;
        ViewGroup.LayoutParams layoutParams3 = materialButton.getLayoutParams();
        if (layoutParams3 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return null;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = l64VarMo136i.f49119d;
        materialButton.setLayoutParams(layoutParams4);
        return f6b.f38535b;
    }
}
