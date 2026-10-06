package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jha {

    /* JADX INFO: renamed from: a */
    private static final C1117xf f34023a = new C1117xf();

    /* JADX INFO: renamed from: b */
    private static Locale f34024b;

    /* JADX INFO: renamed from: a */
    public static String m13176a(Context context) {
        String packageName = context.getPackageName();
        try {
            khb khbVarM13300b = jiz.m13300b(context);
            return ((Context) khbVarM13300b.f36008a).getPackageManager().getApplicationLabel(((Context) khbVarM13300b.f36008a).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m13177b(Context context, int i) {
        Resources resources = context.getResources();
        String strM13176a = m13176a(context);
        switch (i) {
            case 1:
                return resources.getString(C0100R.string.common_google_play_services_install_text, strM13176a);
            case 2:
                return jit.m13235c(context) ? resources.getString(C0100R.string.common_google_play_services_wear_update_text) : resources.getString(C0100R.string.common_google_play_services_update_text, strM13176a);
            case 3:
                return resources.getString(C0100R.string.common_google_play_services_enable_text, strM13176a);
            case 5:
                return m13179d(context, "common_google_play_services_invalid_account_text", strM13176a);
            case 7:
                return m13179d(context, "common_google_play_services_network_error_text", strM13176a);
            case 9:
                return resources.getString(C0100R.string.common_google_play_services_unsupported_text, strM13176a);
            case 16:
                return m13179d(context, "common_google_play_services_api_unavailable_text", strM13176a);
            case 17:
                return m13179d(context, "common_google_play_services_sign_in_failed_text", strM13176a);
            case 18:
                return resources.getString(C0100R.string.common_google_play_services_updating_text, strM13176a);
            case 20:
                return m13179d(context, "common_google_play_services_restricted_profile_text", strM13176a);
            default:
                return resources.getString(C0100R.string.common_google_play_services_unknown_issue, strM13176a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m13178c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0100R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0100R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0100R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m13180e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m13180e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m13180e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m13180e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m13179d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM13180e = m13180e(context, str);
        if (strM13180e == null) {
            strM13180e = resources.getString(C0100R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM13180e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m13180e(Context context, String str) {
        Resources resourcesForApplication;
        C1117xf c1117xf = f34023a;
        synchronized (c1117xf) {
            Locale locale = adn.m301b(adk.m292a(context.getResources().getConfiguration())).f165b.f166a.get(0);
            if (!locale.equals(f34024b)) {
                c1117xf.clear();
                f34024b = locale;
            }
            String str2 = (String) c1117xf.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = jdm.f33802c;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resourcesForApplication.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f34023a.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
