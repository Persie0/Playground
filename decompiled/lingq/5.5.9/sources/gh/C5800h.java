package gh;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.tracker.BuildConfig;
import p003a2.C0009a;
import p157hg.InterfaceC6044b;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p338qd.C8573r0;
import p485xg.C10188d;
import p534zf.C10487e;
import p535zg.C10489a;

/* JADX INFO: renamed from: gh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5800h {

    /* JADX INFO: renamed from: a */
    public static final C0076c f35051a;

    /* JADX INFO: renamed from: gh.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f35052a;

        /* JADX INFO: renamed from: b */
        public final long f35053b;

        /* JADX INFO: renamed from: c */
        public final long f35054c;

        /* JADX INFO: renamed from: d */
        public final long f35055d;

        /* JADX INFO: renamed from: e */
        public final long f35056e;

        /* JADX INFO: renamed from: f */
        public C10487e f35057f = null;

        /* JADX INFO: renamed from: g */
        public Boolean f35058g = null;

        /* JADX INFO: renamed from: h */
        public String f35059h = null;

        /* JADX INFO: renamed from: i */
        public String f35060i = null;

        /* JADX INFO: renamed from: j */
        public Boolean f35061j = null;

        public a(String str, long j10, long j11, long j12, long j13) {
            this.f35052a = str;
            this.f35053b = j10;
            this.f35054c = j11;
            this.f35055d = j12;
            this.f35056e = j13;
        }
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f35051a = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "ProfileMigration");
    }

    /* JADX WARN: Unreachable blocks removed: 7, instructions: 7 */
    /* JADX INFO: renamed from: a */
    public static void m12217a(a aVar, InterfaceC5799g interfaceC5799g, C5797e c5797e, C5795c c5795c) {
        String str = aVar.f35052a;
        C5798f c5798f = (C5798f) interfaceC5799g;
        synchronized (c5798f) {
            try {
                c5798f.f35049g = str;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5798f.f40719a)).m12488k("main.device_id", str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str2 = aVar.f35052a;
        synchronized (c5798f) {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5798f.f40719a)).m12488k("main.device_id_original", str2);
        }
        long j10 = aVar.f35053b;
        synchronized (c5798f) {
            c5798f.f35045c = j10;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5798f.f40719a)).m12487j("main.first_start_time_millis", j10);
        }
        long j11 = aVar.f35054c;
        synchronized (c5798f) {
            try {
                c5798f.f35046d = j11;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5798f.f40719a)).m12487j("main.start_count", j11);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        long j12 = aVar.f35055d;
        synchronized (c5797e) {
            c5797e.f35032e = j12;
            ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797e.f40719a)).m12487j("install.sent_count", j12);
        }
        c5797e.m12206o(aVar.f35056e);
        if (!C8573r0.m16662A0(aVar.f35059h)) {
            c5798f.m12214m(aVar.f35059h);
        }
        Boolean bool = aVar.f35058g;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            synchronized (c5797e) {
                c5797e.f35035h = zBooleanValue;
                ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5797e.f40719a)).m12484g("install.app_limit_ad_tracking", zBooleanValue);
            }
        }
        C10487e c10487e = aVar.f35057f;
        if (c10487e == null || c10487e.length() <= 0) {
            C10487e c10487eM19445u = C10487e.m19445u();
            c10487eM19445u.m19449C("count", aVar.f35055d);
            c5797e.m12203l(C10188d.m19199a(c10487eM19445u));
        } else {
            c5797e.m12203l(C10188d.m19199a(aVar.f35057f));
        }
        if (!C8573r0.m16662A0(aVar.f35060i)) {
            String str3 = aVar.f35060i;
            synchronized (c5795c) {
                try {
                    c5795c.f35018d = str3;
                    if (str3 == null) {
                        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5795c.f40719a)).m12483f("engagement.push_token");
                    } else {
                        ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5795c.f40719a)).m12488k("engagement.push_token", str3);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        Boolean bool2 = aVar.f35061j;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            synchronized (c5795c) {
                try {
                    c5795c.f35019e = zBooleanValue2;
                    ((SharedPreferencesOnSharedPreferenceChangeListenerC6043a) ((InterfaceC6044b) c5795c.f40719a)).m12484g("engagement.push_enabled", zBooleanValue2);
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e A[Catch: Exception -> 0x015a, TRY_LEAVE, TryCatch #2 {Exception -> 0x015a, blocks: (B:49:0x010b, B:51:0x012b, B:62:0x0148, B:64:0x014e), top: B:78:0x010b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX INFO: renamed from: b */
    public static void m12218b(Context context, long j10, InterfaceC5799g interfaceC5799g, C5797e c5797e, C5795c c5795c) {
        long j11;
        boolean z10;
        a aVar;
        a aVar2;
        SharedPreferences sharedPreferences;
        String strReplace;
        boolean z11;
        long j12;
        long j13;
        Boolean boolValueOf;
        C0076c c0076c = f35051a;
        c0076c.m459c("Checking if this install is a migration from a previous SDK version");
        long j14 = j10 - 3600000;
        try {
            int i10 = (int) (j14 / 1000);
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("kosp", 0);
            String strReplace2 = sharedPreferences2.getString("kochava_device_id", "").replace("STR::", "");
            long j15 = ((long) sharedPreferences2.getInt("first_launch_time", i10)) * 1000;
            try {
                j11 = j14;
                long j16 = sharedPreferences2.getInt("launch_count", 1);
                try {
                    int i11 = !sharedPreferences2.getBoolean("initial_needs_sent", true) ? 1 : 0;
                    try {
                        long j17 = sharedPreferences2.getInt("install_count", i11);
                        if (i11 == 0) {
                            i10 = 0;
                        }
                        long j18 = ((long) sharedPreferences2.getInt("initial_sent_time", i10)) * 1000;
                        String strReplace3 = sharedPreferences2.getString("kochava_app_id_override", "").replace("STR::", "");
                        Boolean boolValueOf2 = sharedPreferences2.contains("app_limit_tracking") ? Boolean.valueOf(sharedPreferences2.getBoolean("app_limit_tracking", false)) : null;
                        try {
                            C10487e c10487eM19446v = C10487e.m19446v(sharedPreferences2.getString("last_install", "").replace("JSO::", ""), true);
                            String strReplace4 = sharedPreferences2.getString("push_token", "").replace("STR::", "");
                            if (sharedPreferences2.contains("push_token_enable")) {
                                z10 = true;
                                try {
                                    boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("push_token_enable", true));
                                } catch (Exception e10) {
                                    e = e10;
                                    c0076c.m459c("Unable to migrate data from V3 SDK: " + e.getMessage());
                                }
                            } else {
                                z10 = true;
                                boolValueOf = null;
                            }
                            if (C8573r0.m16662A0(strReplace2)) {
                                aVar = null;
                            } else {
                                aVar = new a(strReplace2, j15, j16, j17, j18);
                                aVar.f35059h = strReplace3;
                                aVar.f35058g = boolValueOf2;
                                aVar.f35057f = c10487eM19446v;
                                aVar.f35060i = strReplace4;
                                aVar.f35061j = boolValueOf;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z10 = true;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z10 = true;
                        c0076c.m459c("Unable to migrate data from V3 SDK: " + e.getMessage());
                        aVar = null;
                        if (aVar != null) {
                            c0076c.m459c("Data migrated from V3 SDK");
                            m12217a(aVar, interfaceC5799g, c5797e, c5795c);
                            return;
                        }
                        try {
                            sharedPreferences = context.getSharedPreferences("ko.tr", 0);
                            strReplace = context.getSharedPreferences("ko.dt.pt", 0).getString("kochava_device_id", "").replace("STR::", "");
                            if (sharedPreferences.getBoolean("initial_sent", false)) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                j12 = 1;
                            } else {
                                j12 = 0;
                            }
                            if (z11) {
                                j13 = j11;
                            } else {
                                j13 = 0;
                            }
                            if (C8573r0.m16662A0(strReplace)) {
                                aVar2 = null;
                            } else {
                                aVar2 = new a(strReplace, j11, 1L, j12, j13);
                            }
                        } catch (Exception e13) {
                            c0076c.m459c("Unable to migrate data from V2 SDK: " + e13.getMessage());
                        }
                        if (aVar2 != null) {
                            c0076c.m459c("No previous SDK data was found to migrate");
                        } else {
                            c0076c.m459c("Data migrated from V2 SDK");
                            m12217a(aVar2, interfaceC5799g, c5797e, c5795c);
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    z10 = true;
                }
            } catch (Exception e15) {
                e = e15;
                z10 = true;
                j11 = j14;
            }
        } catch (Exception e16) {
            e = e16;
            j11 = j14;
        }
        if (aVar != null) {
            c0076c.m459c("Data migrated from V3 SDK");
            m12217a(aVar, interfaceC5799g, c5797e, c5795c);
            return;
        }
        sharedPreferences = context.getSharedPreferences("ko.tr", 0);
        strReplace = context.getSharedPreferences("ko.dt.pt", 0).getString("kochava_device_id", "").replace("STR::", "");
        if (sharedPreferences.getBoolean("initial_sent", false) || sharedPreferences.contains("initial")) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (z11) {
            j12 = 1;
        } else {
            j12 = 0;
        }
        if (z11) {
            j13 = j11;
        } else {
            j13 = 0;
        }
        if (C8573r0.m16662A0(strReplace)) {
            aVar2 = new a(strReplace, j11, 1L, j12, j13);
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            c0076c.m459c("No previous SDK data was found to migrate");
        } else {
            c0076c.m459c("Data migrated from V2 SDK");
            m12217a(aVar2, interfaceC5799g, c5797e, c5795c);
        }
    }
}
