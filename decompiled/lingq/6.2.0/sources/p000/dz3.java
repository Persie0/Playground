package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.installations.C1154a;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class dz3 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f36448g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h */
    public static final String f36449h = Pattern.quote("/");

    /* JADX INFO: renamed from: a */
    public final C0842cc f36450a;

    /* JADX INFO: renamed from: b */
    public final Context f36451b;

    /* JADX INFO: renamed from: c */
    public final String f36452c;

    /* JADX INFO: renamed from: d */
    public final x43 f36453d;

    /* JADX INFO: renamed from: e */
    public final tz1 f36454e;

    /* JADX INFO: renamed from: f */
    public r40 f36455f;

    public dz3(Context context, String str, x43 x43Var, tz1 tz1Var) {
        if (context == null) {
            C3386nv.m17626m("appContext must not be null");
            throw null;
        }
        if (str == null) {
            C3386nv.m17626m("appIdentifier must not be null");
            throw null;
        }
        this.f36451b = context;
        this.f36452c = str;
        this.f36453d = x43Var;
        this.f36454e = tz1Var;
        this.f36450a = new C0842cc(2);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m10755a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f36448g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public final t43 m10756b(boolean z) {
        String str;
        C1149a.m6681c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x43 x43Var = this.f36453d;
        String str2 = null;
        if (z) {
            try {
                str = ((t40) Tasks.await(((C1154a) x43Var).m6698d(), 10000L, timeUnit)).f61836a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((C1154a) x43Var).m6697c(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new t43(str2, str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized r40 m10757c() {
        String str;
        r40 r40Var = this.f36455f;
        if (r40Var != null && (r40Var.f58592b != null || !this.f36454e.m22354a())) {
            return this.f36455f;
        }
        iy5 iy5Var = iy5.f44770f;
        iy5Var.m14207r("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f36451b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        iy5Var.m14207r("Cached Firebase Installation ID: " + string);
        if (this.f36454e.m22354a()) {
            t43 t43VarM10756b = m10756b(false);
            iy5Var.m14207r("Fetched Firebase Installation ID: " + t43VarM10756b.f61849a);
            if (t43VarM10756b.f61849a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                t43VarM10756b = new t43(str, null);
            }
            if (Objects.equals(t43VarM10756b.f61849a, string)) {
                this.f36455f = new r40(sharedPreferences.getString("crashlytics.installation.id", null), t43VarM10756b.f61849a, t43VarM10756b.f61850b);
            } else {
                this.f36455f = new r40(m10755a(sharedPreferences, t43VarM10756b.f61849a), t43VarM10756b.f61849a, t43VarM10756b.f61850b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f36455f = new r40(m10755a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f36455f = new r40(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        iy5Var.m14207r("Install IDs: " + this.f36455f);
        return this.f36455f;
    }

    /* JADX INFO: renamed from: d */
    public final String m10758d() {
        String str;
        C0842cc c0842cc = this.f36450a;
        Context context = this.f36451b;
        synchronized (c0842cc) {
            try {
                if (c0842cc.f9872b == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c0842cc.f9872b = installerPackageName;
                }
                str = "".equals(c0842cc.f9872b) ? null : c0842cc.f9872b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
