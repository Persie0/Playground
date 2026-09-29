package com.google.firebase.installations;

import ae.C0065e;
import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.RunnableC0191j;
import cf.InterfaceC2005b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.installations.local.C3220a;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C3222a;
import com.google.firebase.installations.remote.C3223b;
import com.google.firebase.installations.remote.C3224c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import gf.C5790a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p073df.C5163e;
import p073df.C5164f;
import p073df.C5166h;
import p073df.C5168j;
import p073df.InterfaceC5162d;
import p073df.InterfaceC5167i;
import p118fe.C5523o;
import p119ff.C5529a;
import p136gc.C5752h;
import p136gc.C5761q;
import p176ib.C6272i;
import p195j9.RunnableC6431h;
import p290o6.C7968m;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.firebase.installations.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3219a implements InterfaceC5162d {

    /* JADX INFO: renamed from: m */
    public static final Object f16252m = new Object();

    /* JADX INFO: renamed from: a */
    public final C0065e f16253a;

    /* JADX INFO: renamed from: b */
    public final C3224c f16254b;

    /* JADX INFO: renamed from: c */
    public final PersistedInstallation f16255c;

    /* JADX INFO: renamed from: d */
    public final C5168j f16256d;

    /* JADX INFO: renamed from: e */
    public final C5523o<C5529a> f16257e;

    /* JADX INFO: renamed from: f */
    public final C5166h f16258f;

    /* JADX INFO: renamed from: g */
    public final Object f16259g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f16260h;

    /* JADX INFO: renamed from: i */
    public final Executor f16261i;

    /* JADX INFO: renamed from: j */
    public String f16262j;

    /* JADX INFO: renamed from: k */
    public final HashSet f16263k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f16264l;

    /* JADX INFO: renamed from: com.google.firebase.installations.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16265a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16266b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f16266b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16266b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16266b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f16265a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16265a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"ThreadPoolCreation"})
    public C3219a() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C3219a(final C0065e c0065e, InterfaceC2005b interfaceC2005b, ExecutorService executorService, SequentialExecutor sequentialExecutor) {
        c0065e.m437a();
        C3224c c3224c = new C3224c(c0065e.f171a, interfaceC2005b);
        PersistedInstallation persistedInstallation = new PersistedInstallation(c0065e);
        if (C8573r0.f45972i == null) {
            C8573r0.f45972i = new C8573r0();
        }
        C8573r0 c8573r0 = C8573r0.f45972i;
        if (C5168j.f33169d == null) {
            C5168j.f33169d = new C5168j(c8573r0);
        }
        C5168j c5168j = C5168j.f33169d;
        C5523o<C5529a> c5523o = new C5523o<>(new InterfaceC2005b() { // from class: df.b
            @Override // cf.InterfaceC2005b
            public final Object get() {
                return new C5529a(c0065e);
            }
        });
        C5166h c5166h = new C5166h();
        this.f16259g = new Object();
        this.f16263k = new HashSet();
        this.f16264l = new ArrayList();
        this.f16253a = c0065e;
        this.f16254b = c3224c;
        this.f16255c = persistedInstallation;
        this.f16256d = c5168j;
        this.f16257e = c5523o;
        this.f16258f = c5166h;
        this.f16260h = executorService;
        this.f16261i = sequentialExecutor;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p073df.InterfaceC5162d
    /* JADX INFO: renamed from: a */
    public final C5761q mo9190a() {
        m9193d();
        C5752h c5752h = new C5752h();
        C5163e c5163e = new C5163e(this.f16256d, c5752h);
        synchronized (this.f16259g) {
            this.f16264l.add(c5163e);
        }
        this.f16260h.execute(new Runnable() { // from class: df.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f33161b = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.f33160a.m9191b(this.f33161b);
            }
        });
        return c5752h.f34812a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9191b(boolean z10) {
        C3220a c3220aM9200c;
        int i10;
        synchronized (f16252m) {
            C0065e c0065e = this.f16253a;
            c0065e.m437a();
            C7968m c7968mM15816d = C7968m.m15816d(c0065e.f171a);
            try {
                c3220aM9200c = this.f16255c.m9200c();
                PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.NOT_GENERATED;
                PersistedInstallation.RegistrationStatus registrationStatus2 = c3220aM9200c.f16270c;
                i10 = 1;
                if (registrationStatus2 == registrationStatus || registrationStatus2 == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                    String strM9194e = m9194e(c3220aM9200c);
                    PersistedInstallation persistedInstallation = this.f16255c;
                    C3220a.a aVar = new C3220a.a(c3220aM9200c);
                    aVar.f16276a = strM9194e;
                    aVar.m9210b(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                    c3220aM9200c = aVar.m9209a();
                    persistedInstallation.m9199b(c3220aM9200c);
                }
                if (c7968mM15816d != null) {
                    c7968mM15816d.m15818f();
                }
            } catch (Throwable th2) {
                if (c7968mM15816d != null) {
                    c7968mM15816d.m15818f();
                }
                throw th2;
            }
        }
        if (z10) {
            C3220a.a aVar2 = new C3220a.a(c3220aM9200c);
            aVar2.f16278c = null;
            c3220aM9200c = aVar2.m9209a();
        }
        m9197h(c3220aM9200c);
        this.f16261i.execute(new RunnableC6431h(i10, this, z10));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX INFO: renamed from: c */
    public final C3220a m9192c(C3220a c3220a) throws FirebaseInstallationsException {
        ?? r10;
        boolean z10;
        ?? M9227c;
        String str;
        char c10;
        ?? r11;
        String str2;
        C3223b c3223bM9223f;
        C0065e c0065e = this.f16253a;
        c0065e.m437a();
        String str3 = c0065e.f173c.f183a;
        String str4 = c3220a.f16269b;
        C0065e c0065e2 = this.f16253a;
        c0065e2.m437a();
        String str5 = c0065e2.f173c.f189g;
        String str6 = c3220a.f16272e;
        C3224c c3224c = this.f16254b;
        C5790a c5790a = c3224c.f16298c;
        synchronized (c5790a) {
            r10 = 1;
            if (c5790a.f34995c != 0) {
                c5790a.f34993a.f33170a.getClass();
                if (System.currentTimeMillis() > c5790a.f34994b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
        }
        String str7 = "Firebase Installations Service is unavailable. Please try again later.";
        if (!z10) {
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        char c11 = 2;
        URL urlM9219a = C3224c.m9219a(String.format("projects/%s/installations/%s/authTokens:generate", str5, str4));
        int i10 = 0;
        while (true) {
            if (i10 > r10) {
                FirebaseInstallationsException.Status status2 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException(str7);
            }
            TrafficStats.setThreadStatsTag(32771);
            M9227c = c3224c.m9227c(urlM9219a, str3);
            try {
                try {
                    M9227c.setRequestMethod("POST");
                    M9227c.addRequestProperty("Authorization", "FIS_v2 " + str6);
                    M9227c.setDoOutput(r10);
                    C3224c.m9225h(M9227c);
                    int responseCode = M9227c.getResponseCode();
                    c5790a.m12178a(responseCode);
                    if (((responseCode < 200 || responseCode >= 300) ? 0 : r10) != 0) {
                        c3223bM9223f = C3224c.m9223f(M9227c);
                        str = str7;
                        break;
                    }
                    C3224c.m9220b(M9227c, null, str3, str5);
                    if (responseCode == 401 || responseCode == 404) {
                        try {
                            str = str7;
                            Long l10 = 0L;
                            TokenResult.ResponseCode responseCode2 = TokenResult.ResponseCode.AUTH_ERROR;
                            String str8 = l10 == null ? " tokenExpirationTimestamp" : "";
                            if (str8.isEmpty()) {
                                try {
                                    c3223bM9223f = new C3223b(null, l10.longValue(), responseCode2);
                                    break;
                                } catch (IOException | AssertionError unused) {
                                }
                            } else {
                                str3 = str3;
                                urlM9219a = urlM9219a;
                                str2 = str;
                                r11 = 1;
                                c10 = 2;
                                try {
                                    throw new IllegalStateException("Missing required properties:".concat(str8));
                                } catch (IOException | AssertionError unused2) {
                                    continue;
                                }
                            }
                        } catch (IOException | AssertionError unused3) {
                        }
                    } else {
                        if (responseCode == 429) {
                            FirebaseInstallationsException.Status status3 = FirebaseInstallationsException.Status.BAD_CONFIG;
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            try {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                Long l11 = 0L;
                                TokenResult.ResponseCode responseCode3 = TokenResult.ResponseCode.BAD_CONFIG;
                                String str9 = l11 == null ? " tokenExpirationTimestamp" : "";
                                if (!str9.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str9));
                                }
                                str = str7;
                                c3223bM9223f = new C3223b(null, l11.longValue(), responseCode3);
                                break;
                            } catch (IOException | AssertionError unused4) {
                                str = str7;
                                str2 = str;
                                r11 = 1;
                                c10 = 2;
                                M9227c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i10++;
                                r10 = r11;
                                c11 = c10;
                                urlM9219a = urlM9219a;
                                String str10 = str3;
                                str7 = str2;
                                str3 = str10;
                            }
                        }
                        urlM9219a = urlM9219a;
                        c10 = c11;
                        r11 = r10;
                        String str11 = str7;
                        str3 = str3;
                        str2 = str11;
                        M9227c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        r10 = r11;
                        c11 = c10;
                        urlM9219a = urlM9219a;
                        String str12 = str3;
                        str7 = str2;
                        str3 = str12;
                    }
                    str2 = str;
                    r11 = 1;
                    c10 = 2;
                    M9227c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                    r10 = r11;
                    c11 = c10;
                    urlM9219a = urlM9219a;
                    String str13 = str3;
                    str7 = str2;
                    str3 = str13;
                } catch (Throwable th2) {
                    M9227c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused5) {
            }
        }
        M9227c.disconnect();
        TrafficStats.clearThreadStatsTag();
        int i11 = a.f16266b[c3223bM9223f.f16293c.ordinal()];
        if (i11 == 1) {
            C5168j c5168j = this.f16256d;
            c5168j.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c5168j.f33170a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C3220a.a aVar = new C3220a.a(c3220a);
            aVar.f16278c = c3223bM9223f.f16291a;
            aVar.f16280e = Long.valueOf(c3223bM9223f.f16292b);
            aVar.f16281f = Long.valueOf(seconds);
            return aVar.m9209a();
        }
        if (i11 == 2) {
            C3220a.a aVarM9208h = c3220a.m9208h();
            aVarM9208h.f16282g = "BAD CONFIG";
            aVarM9208h.m9210b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return aVarM9208h.m9209a();
        }
        if (i11 != 3) {
            FirebaseInstallationsException.Status status4 = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException(str);
        }
        synchronized (this) {
            this.f16262j = null;
        }
        C3220a.a aVar2 = new C3220a.a(c3220a);
        aVar2.m9210b(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
        return aVar2.m9209a();
    }

    /* JADX INFO: renamed from: d */
    public final void m9193d() {
        C0065e c0065e = this.f16253a;
        c0065e.m437a();
        C6272i.m12913g("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c0065e.f173c.f184b);
        c0065e.m437a();
        C6272i.m12913g("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c0065e.f173c.f189g);
        c0065e.m437a();
        C6272i.m12913g("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", c0065e.f173c.f183a);
        c0065e.m437a();
        String str = c0065e.f173c.f184b;
        Pattern pattern = C5168j.f33168c;
        C6272i.m12907a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        c0065e.m437a();
        C6272i.m12907a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C5168j.f33168c.matcher(c0065e.f173c.f183a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:17:0x0050, B:18:0x0054, B:23:0x0064, B:25:0x0067, B:26:0x006d, B:34:0x0081, B:19:0x0055, B:20:0x0060), top: B:40:0x0050, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public final String m9194e(C3220a c3220a) {
        boolean z10;
        C5529a c5529a;
        String string;
        C0065e c0065e = this.f16253a;
        c0065e.m437a();
        if (c0065e.f172b.equals("CHIME_ANDROID_SDK")) {
            if (c3220a.f16270c == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                c5529a = this.f16257e.get();
                synchronized (c5529a.f34210a) {
                    synchronized (c5529a.f34210a) {
                        string = c5529a.f34210a.getString("|S|id", null);
                        if (string != null) {
                            string = c5529a.m11767a();
                        }
                        if (TextUtils.isEmpty(string)) {
                            return string;
                        }
                        this.f16258f.getClass();
                        return C5166h.m10943a();
                    }
                }
            }
        } else {
            C0065e c0065e2 = this.f16253a;
            c0065e2.m437a();
            if ("[DEFAULT]".equals(c0065e2.f172b)) {
                if (c3220a.f16270c == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    c5529a = this.f16257e.get();
                    synchronized (c5529a.f34210a) {
                        synchronized (c5529a.f34210a) {
                            try {
                                string = c5529a.f34210a.getString("|S|id", null);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (string != null) {
                            string = c5529a.m11767a();
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f16258f.getClass();
                    return C5166h.m10943a();
                }
            }
        }
        this.f16258f.getClass();
        return C5166h.m10943a();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX INFO: renamed from: f */
    public final C3220a m9195f(C3220a c3220a) throws FirebaseInstallationsException {
        boolean z10;
        C3222a c3222aM9222e;
        String str = c3220a.f16269b;
        String string = null;
        if (str != null && str.length() == 11) {
            C5529a c5529a = this.f16257e.get();
            synchronized (c5529a.f34210a) {
                String[] strArr = C5529a.f34209c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String str2 = strArr[i10];
                    String string2 = c5529a.f34210a.getString("|T|" + c5529a.f34211b + "|" + str2, null);
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
                    i10++;
                }
            }
        }
        C3224c c3224c = this.f16254b;
        C0065e c0065e = this.f16253a;
        c0065e.m437a();
        String str3 = c0065e.f173c.f183a;
        String str4 = c3220a.f16269b;
        C0065e c0065e2 = this.f16253a;
        c0065e2.m437a();
        String str5 = c0065e2.f173c.f189g;
        C0065e c0065e3 = this.f16253a;
        c0065e3.m437a();
        String str6 = c0065e3.f173c.f184b;
        C5790a c5790a = c3224c.f16298c;
        synchronized (c5790a) {
            if (c5790a.f34995c != 0) {
                c5790a.f34993a.f33170a.getClass();
                if (System.currentTimeMillis() > c5790a.f34994b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
        }
        if (!z10) {
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM9219a = C3224c.m9219a(String.format("projects/%s/installations", str5));
        int i11 = 0;
        while (true) {
            if (i11 > 1) {
                FirebaseInstallationsException.Status status2 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM9227c = c3224c.m9227c(urlM9219a, str3);
            try {
                try {
                    httpURLConnectionM9227c.setRequestMethod("POST");
                    httpURLConnectionM9227c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM9227c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C3224c.m9224g(httpURLConnectionM9227c, str4, str6);
                    int responseCode = httpURLConnectionM9227c.getResponseCode();
                    c5790a.m12178a(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c3222aM9222e = C3224c.m9222e(httpURLConnectionM9227c);
                        httpURLConnectionM9227c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    C3224c.m9220b(httpURLConnectionM9227c, str6, str3, str5);
                    if (responseCode == 429) {
                        FirebaseInstallationsException.Status status3 = FirebaseInstallationsException.Status.BAD_CONFIG;
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C3222a c3222a = new C3222a(null, null, null, null, InstallationResponse.ResponseCode.BAD_CONFIG);
                        httpURLConnectionM9227c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c3222aM9222e = c3222a;
                        break;
                    }
                    httpURLConnectionM9227c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i11++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th2) {
                httpURLConnectionM9227c.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        int i12 = a.f16265a[c3222aM9222e.f16290e.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                FirebaseInstallationsException.Status status4 = FirebaseInstallationsException.Status.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            C3220a.a aVarM9208h = c3220a.m9208h();
            aVarM9208h.f16282g = "BAD CONFIG";
            aVarM9208h.m9210b(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return aVarM9208h.m9209a();
        }
        String str7 = c3222aM9222e.f16287b;
        String str8 = c3222aM9222e.f16288c;
        C5168j c5168j = this.f16256d;
        c5168j.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c5168j.f33170a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        String strMo9217b = c3222aM9222e.f16289d.mo9217b();
        long jMo9218c = c3222aM9222e.f16289d.mo9218c();
        C3220a.a aVar = new C3220a.a(c3220a);
        aVar.f16276a = str7;
        aVar.m9210b(PersistedInstallation.RegistrationStatus.REGISTERED);
        aVar.f16278c = strMo9217b;
        aVar.f16279d = str8;
        aVar.f16280e = Long.valueOf(jMo9218c);
        aVar.f16281f = Long.valueOf(seconds);
        return aVar.m9209a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m9196g(Exception exc) {
        synchronized (this.f16259g) {
            Iterator it = this.f16264l.iterator();
            while (true) {
                while (true) {
                    if (it.hasNext()) {
                        if (((InterfaceC5167i) it.next()).mo10942b(exc)) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p073df.InterfaceC5162d
    public final C5761q getId() {
        String str;
        m9193d();
        synchronized (this) {
            try {
                str = this.f16262j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str != null) {
            return Tasks.m8539c(str);
        }
        C5752h c5752h = new C5752h();
        C5164f c5164f = new C5164f(c5752h);
        synchronized (this.f16259g) {
            try {
                this.f16264l.add(c5164f);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C5761q c5761q = c5752h.f34812a;
        this.f16260h.execute(new RunnableC0191j(16, this));
        return c5761q;
    }

    /* JADX INFO: renamed from: h */
    public final void m9197h(C3220a c3220a) {
        synchronized (this.f16259g) {
            Iterator it = this.f16264l.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5167i) it.next()).mo10941a(c3220a)) {
                    it.remove();
                }
            }
        }
    }
}
