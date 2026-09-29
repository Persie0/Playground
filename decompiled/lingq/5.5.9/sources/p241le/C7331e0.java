package p241le;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p073df.InterfaceC5162d;
import p387t0.C9166r;

/* JADX INFO: renamed from: le.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7331e0 implements InterfaceC7333f0 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f41042g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h */
    public static final String f41043h = Pattern.quote("/");

    /* JADX INFO: renamed from: a */
    public final C9166r f41044a;

    /* JADX INFO: renamed from: b */
    public final Context f41045b;

    /* JADX INFO: renamed from: c */
    public final String f41046c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5162d f41047d;

    /* JADX INFO: renamed from: e */
    public final C7323a0 f41048e;

    /* JADX INFO: renamed from: f */
    public String f41049f;

    public C7331e0(Context context, String str, InterfaceC5162d interfaceC5162d, C7323a0 c7323a0) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f41045b = context;
        this.f41046c = str;
        this.f41047d = interfaceC5162d;
        this.f41048e = c7323a0;
        this.f41044a = new C9166r(7);
    }

    /* JADX INFO: renamed from: b */
    public static String m14745b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized String m14746a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f41042g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m14747c() {
        String strM14745b;
        String str = this.f41049f;
        if (str != null) {
            return str;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f41045b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        String str2 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        if (this.f41048e.m14737a()) {
            try {
                strM14745b = (String) C7337h0.m14755a(this.f41047d.getId());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                strM14745b = null;
            }
            String str3 = "Fetched Firebase Installation ID: " + strM14745b;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            if (strM14745b == null) {
                if (string == null) {
                    strM14745b = m14745b();
                } else {
                    strM14745b = string;
                }
            }
            if (strM14745b.equals(string)) {
                this.f41049f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f41049f = m14746a(sharedPreferences, strM14745b);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z10 = true;
            }
            if (z10) {
                this.f41049f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f41049f = m14746a(sharedPreferences, m14745b());
            }
        }
        if (this.f41049f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f41049f = m14746a(sharedPreferences, m14745b());
        }
        String str4 = "Crashlytics installation ID: " + this.f41049f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str4, null);
        }
        return this.f41049f;
    }

    /* JADX INFO: renamed from: d */
    public final String m14748d() {
        String str;
        C9166r c9166r = this.f41044a;
        Context context = this.f41045b;
        synchronized (c9166r) {
            if (((String) c9166r.f47694a) == null) {
                context.getPackageManager().getInstallerPackageName(context.getPackageName());
                c9166r.f47694a = "com.android.vending" == null ? "" : "com.android.vending";
            }
            str = "".equals((String) c9166r.f47694a) ? null : (String) c9166r.f47694a;
        }
        return str;
    }
}
