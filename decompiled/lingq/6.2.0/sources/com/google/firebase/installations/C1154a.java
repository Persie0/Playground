package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.ExecutorC1147c;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;
import com.google.firebase.installations.remote.TokenResult$ResponseCode;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3846zu;
import p000.b50;
import p000.b64;
import p000.c50;
import p000.ds4;
import p000.fs6;
import p000.g9c;
import p000.gm3;
import p000.ina;
import p000.lda;
import p000.lq7;
import p000.mh9;
import p000.ml3;
import p000.mz3;
import p000.p50;
import p000.q43;
import p000.s40;
import p000.tld;
import p000.u43;
import p000.uo7;
import p000.v43;
import p000.w43;
import p000.wr9;
import p000.x43;
import p000.yc1;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1154a implements x43 {

    /* JADX INFO: renamed from: m */
    public static final Object f13703m = new Object();

    /* JADX INFO: renamed from: a */
    public final q43 f13704a;

    /* JADX INFO: renamed from: b */
    public final u43 f13705b;

    /* JADX INFO: renamed from: c */
    public final fs6 f13706c;

    /* JADX INFO: renamed from: d */
    public final ina f13707d;

    /* JADX INFO: renamed from: e */
    public final ds4 f13708e;

    /* JADX INFO: renamed from: f */
    public final lq7 f13709f;

    /* JADX INFO: renamed from: g */
    public final Object f13710g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f13711h;

    /* JADX INFO: renamed from: i */
    public final ExecutorC1147c f13712i;

    /* JADX INFO: renamed from: j */
    public String f13713j;

    /* JADX INFO: renamed from: k */
    public final HashSet f13714k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f13715l;

    static {
        new AtomicInteger(1);
    }

    public C1154a(q43 q43Var, uo7 uo7Var, ExecutorService executorService, ExecutorC1147c executorC1147c) {
        q43Var.m19644a();
        u43 u43Var = new u43(q43Var.f57252a, uo7Var);
        fs6 fs6Var = new fs6(q43Var, 5);
        if (g9c.f40433g == null) {
            g9c.f40433g = new g9c(16);
        }
        g9c g9cVar = g9c.f40433g;
        if (ina.f44330c == null) {
            ina.f44330c = new ina(g9cVar);
        }
        ina inaVar = ina.f44330c;
        ds4 ds4Var = new ds4(new yc1(q43Var, 2));
        lq7 lq7Var = new lq7();
        this.f13710g = new Object();
        this.f13714k = new HashSet();
        this.f13715l = new ArrayList();
        this.f13704a = q43Var;
        this.f13705b = u43Var;
        this.f13706c = fs6Var;
        this.f13707d = inaVar;
        this.f13708e = ds4Var;
        this.f13709f = lq7Var;
        this.f13711h = executorService;
        this.f13712i = executorC1147c;
    }

    /* JADX INFO: renamed from: a */
    public final void m6695a() {
        c50 c50VarM12093H;
        synchronized (f13703m) {
            try {
                q43 q43Var = this.f13704a;
                q43Var.m19644a();
                b64 b64VarM3348b = b64.m3348b(q43Var.f57252a);
                try {
                    c50VarM12093H = this.f13706c.m12093H();
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = c50VarM12093H.f9503b;
                    if (persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.NOT_GENERATED || persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                        String strM6700f = m6700f(c50VarM12093H);
                        fs6 fs6Var = this.f13706c;
                        b50 b50VarM4313a = c50VarM12093H.m4313a();
                        b50VarM4313a.f7945a = strM6700f;
                        b50VarM4313a.m3299b(PersistedInstallation$RegistrationStatus.UNREGISTERED);
                        c50VarM12093H = b50VarM4313a.m3298a();
                        fs6Var.m12118y(c50VarM12093H);
                    }
                    if (b64VarM3348b != null) {
                        b64VarM3348b.m3368u();
                    }
                } catch (Throwable th) {
                    if (b64VarM3348b != null) {
                        b64VarM3348b.m3368u();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m6703i(c50VarM12093H);
        this.f13712i.execute(new v43(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public final c50 m6696b(c50 c50Var) throws FirebaseInstallationsException {
        int i;
        p50 p50Var;
        p50 p50VarM22453f;
        u43 u43Var = this.f13705b;
        q43 q43Var = this.f13704a;
        q43Var.m19644a();
        String str = q43Var.f57254c.f260a;
        String str2 = c50Var.f9502a;
        q43 q43Var2 = this.f13704a;
        q43Var2.m19644a();
        String str3 = q43Var2.f57254c.f266g;
        String str4 = c50Var.f9505d;
        C3846zu c3846zu = u43Var.f63389c;
        if (!c3846zu.m25788a()) {
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM22449a = u43.m22449a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                FirebaseInstallationsException.Status status2 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM22457c = u43Var.m22457c(urlM22449a, str);
            try {
                try {
                    httpURLConnectionM22457c.setRequestMethod("POST");
                    httpURLConnectionM22457c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM22457c.setDoOutput(true);
                    u43.m22455h(httpURLConnectionM22457c);
                    int responseCode = httpURLConnectionM22457c.getResponseCode();
                    c3846zu.m25789b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        p50VarM22453f = u43.m22453f(httpURLConnectionM22457c);
                        httpURLConnectionM22457c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    u43.m22450b(httpURLConnectionM22457c, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            byte b = (byte) (0 | 1);
                            TokenResult$ResponseCode tokenResult$ResponseCode = TokenResult$ResponseCode.AUTH_ERROR;
                            if (b != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            p50Var = new p50(null, 0L, tokenResult$ResponseCode);
                        } else {
                            if (responseCode == 429) {
                                FirebaseInstallationsException.Status status3 = FirebaseInstallationsException.Status.BAD_CONFIG;
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                byte b2 = (byte) (0 | 1);
                                TokenResult$ResponseCode tokenResult$ResponseCode2 = TokenResult$ResponseCode.BAD_CONFIG;
                                if (b2 != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                p50Var = new p50(null, 0L, tokenResult$ResponseCode2);
                            }
                            httpURLConnectionM22457c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionM22457c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        p50VarM22453f = p50Var;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionM22457c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int i3 = w43.f66373b[p50VarM22453f.f55587c.ordinal()];
        if (i3 == 1) {
            String str5 = p50VarM22453f.f55585a;
            long j = p50VarM22453f.f55586b;
            this.f13707d.f44331a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            b50 b50VarM4313a = c50Var.m4313a();
            b50VarM4313a.f7947c = str5;
            b50VarM4313a.f7949e = j;
            byte b3 = (byte) (b50VarM4313a.f7952h | 1);
            b50VarM4313a.f7950f = jCurrentTimeMillis;
            b50VarM4313a.f7952h = (byte) (b3 | 2);
            return b50VarM4313a.m3298a();
        }
        if (i3 == 2) {
            b50 b50VarM4313a2 = c50Var.m4313a();
            b50VarM4313a2.f7951g = "BAD CONFIG";
            b50VarM4313a2.m3299b(PersistedInstallation$RegistrationStatus.REGISTER_ERROR);
            return b50VarM4313a2.m3298a();
        }
        if (i3 != 3) {
            FirebaseInstallationsException.Status status4 = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f13713j = null;
        }
        b50 b50VarM4313a3 = c50Var.m4313a();
        b50VarM4313a3.m3299b(PersistedInstallation$RegistrationStatus.NOT_GENERATED);
        return b50VarM4313a3.m3298a();
    }

    /* JADX INFO: renamed from: c */
    public final tld m6697c() {
        String str;
        m6699e();
        synchronized (this) {
            str = this.f13713j;
        }
        if (str != null) {
            return Tasks.m5975c(str);
        }
        wr9 wr9Var = new wr9();
        gm3 gm3Var = new gm3(wr9Var);
        synchronized (this.f13710g) {
            this.f13715l.add(gm3Var);
        }
        tld tldVar = wr9Var.f67208a;
        this.f13711h.execute(new v43(this, 0));
        return tldVar;
    }

    /* JADX INFO: renamed from: d */
    public final tld m6698d() {
        m6699e();
        wr9 wr9Var = new wr9();
        ml3 ml3Var = new ml3(this.f13707d, wr9Var);
        synchronized (this.f13710g) {
            this.f13715l.add(ml3Var);
        }
        tld tldVar = wr9Var.f67208a;
        this.f13711h.execute(new v43(this, 1));
        return tldVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m6699e() {
        q43 q43Var = this.f13704a;
        q43Var.m19644a();
        lda.m16128n(q43Var.f57254c.f261b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q43Var.m19644a();
        lda.m16128n(q43Var.f57254c.f266g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q43Var.m19644a();
        lda.m16128n(q43Var.f57254c.f260a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        q43Var.m19644a();
        String str = q43Var.f57254c.f261b;
        Pattern pattern = ina.f44329b;
        lda.m16124j("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        q43Var.m19644a();
        lda.m16124j("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", ina.f44329b.matcher(q43Var.f57254c.f260a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0040, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX INFO: renamed from: f */
    public final String m6700f(c50 c50Var) {
        mz3 mz3Var;
        String string;
        q43 q43Var = this.f13704a;
        q43Var.m19644a();
        if (!q43Var.f57253b.equals("CHIME_ANDROID_SDK")) {
            q43 q43Var2 = this.f13704a;
            q43Var2.m19644a();
            if ("[DEFAULT]".equals(q43Var2.f57253b)) {
                if (c50Var.f9503b == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                    mz3Var = (mz3) this.f13708e.get();
                    synchronized (mz3Var.f52062a) {
                        try {
                            synchronized (mz3Var.f52062a) {
                                string = mz3Var.f52062a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = mz3Var.m17158a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f13709f.getClass();
                    return lq7.m16466a();
                }
            }
        } else if (c50Var.f9503b == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
            mz3Var = (mz3) this.f13708e.get();
            synchronized (mz3Var.f52062a) {
                synchronized (mz3Var.f52062a) {
                    string = mz3Var.f52062a.getString("|S|id", null);
                    if (string != null) {
                        string = mz3Var.m17158a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f13709f.getClass();
                    return lq7.m16466a();
                }
            }
        }
        this.f13709f.getClass();
        return lq7.m16466a();
    }

    /* JADX INFO: renamed from: g */
    public final c50 m6701g(c50 c50Var) throws FirebaseInstallationsException {
        s40 s40VarM22452e;
        String str = c50Var.f9502a;
        String string = null;
        if (str != null && str.length() == 11) {
            mz3 mz3Var = (mz3) this.f13708e.get();
            synchronized (mz3Var.f52062a) {
                try {
                    String[] strArr = mz3.f52061c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = mz3Var.f52062a.getString("|T|" + mz3Var.f52063b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        u43 u43Var = this.f13705b;
        q43 q43Var = this.f13704a;
        q43Var.m19644a();
        String str3 = q43Var.f57254c.f260a;
        String str4 = c50Var.f9502a;
        q43 q43Var2 = this.f13704a;
        q43Var2.m19644a();
        String str5 = q43Var2.f57254c.f266g;
        q43 q43Var3 = this.f13704a;
        q43Var3.m19644a();
        String str6 = q43Var3.f57254c.f261b;
        C3846zu c3846zu = u43Var.f63389c;
        if (!c3846zu.m25788a()) {
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM22449a = u43.m22449a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                FirebaseInstallationsException.Status status2 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM22457c = u43Var.m22457c(urlM22449a, str3);
            try {
                try {
                    httpURLConnectionM22457c.setRequestMethod("POST");
                    httpURLConnectionM22457c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM22457c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    u43.m22454g(httpURLConnectionM22457c, str4, str6);
                    int responseCode = httpURLConnectionM22457c.getResponseCode();
                    c3846zu.m25789b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        s40VarM22452e = u43.m22452e(httpURLConnectionM22457c);
                        httpURLConnectionM22457c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    u43.m22450b(httpURLConnectionM22457c, str6, str3, str5);
                    if (responseCode == 429) {
                        FirebaseInstallationsException.Status status3 = FirebaseInstallationsException.Status.BAD_CONFIG;
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        s40 s40Var = new s40(null, null, null, null, InstallationResponse$ResponseCode.BAD_CONFIG);
                        httpURLConnectionM22457c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        s40VarM22452e = s40Var;
                        break;
                    }
                    httpURLConnectionM22457c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionM22457c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int i3 = w43.f66372a[s40VarM22452e.f60262e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                FirebaseInstallationsException.Status status4 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            b50 b50VarM4313a = c50Var.m4313a();
            b50VarM4313a.f7951g = "BAD CONFIG";
            b50VarM4313a.m3299b(PersistedInstallation$RegistrationStatus.REGISTER_ERROR);
            return b50VarM4313a.m3298a();
        }
        String str7 = s40VarM22452e.f60259b;
        String str8 = s40VarM22452e.f60260c;
        this.f13707d.f44331a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        p50 p50Var = s40VarM22452e.f60261d;
        String str9 = p50Var.f55585a;
        long j = p50Var.f55586b;
        b50 b50VarM4313a2 = c50Var.m4313a();
        b50VarM4313a2.f7945a = str7;
        b50VarM4313a2.m3299b(PersistedInstallation$RegistrationStatus.REGISTERED);
        b50VarM4313a2.f7947c = str9;
        b50VarM4313a2.f7948d = str8;
        b50VarM4313a2.f7949e = j;
        byte b = (byte) (b50VarM4313a2.f7952h | 1);
        b50VarM4313a2.f7950f = jCurrentTimeMillis;
        b50VarM4313a2.f7952h = (byte) (b | 2);
        return b50VarM4313a2.m3298a();
    }

    /* JADX INFO: renamed from: h */
    public final void m6702h(Exception exc) {
        synchronized (this.f13710g) {
            try {
                Iterator it = this.f13715l.iterator();
                while (it.hasNext()) {
                    if (((mh9) it.next()).mo12748a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6703i(c50 c50Var) {
        synchronized (this.f13710g) {
            try {
                Iterator it = this.f13715l.iterator();
                while (it.hasNext()) {
                    if (((mh9) it.next()).mo12749b(c50Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
