package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jdb {

    /* JADX INFO: renamed from: a */
    public static final l79 f45444a = new l79(0);

    /* JADX INFO: renamed from: b */
    public static Locale f45445b;

    /* JADX INFO: renamed from: a */
    public static String m14403a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R$string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R$string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R$string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m14410h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m14410h(context, "common_google_play_services_network_error_title");
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
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m14410h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m14410h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m14404b(Context context, int i) {
        String strM14410h = i == 6 ? m14410h(context, "common_google_play_services_resolution_required_title") : m14403a(context, i);
        return strM14410h == null ? context.getResources().getString(R$string.common_google_play_services_notification_ticker) : strM14410h;
    }

    /* JADX INFO: renamed from: c */
    public static String m14405c(Context context, int i) {
        Resources resources = context.getResources();
        String strM14408f = m14408f(context);
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_text, strM14408f);
        }
        if (i == 2) {
            return b34.m3258z(context) ? resources.getString(R$string.common_google_play_services_wear_update_text) : resources.getString(R$string.common_google_play_services_update_text, strM14408f);
        }
        if (i == 3) {
            return resources.getString(R$string.common_google_play_services_enable_text, strM14408f);
        }
        if (i == 5) {
            return m14409g(context, "common_google_play_services_invalid_account_text", strM14408f);
        }
        if (i == 7) {
            return m14409g(context, "common_google_play_services_network_error_text", strM14408f);
        }
        if (i == 9) {
            return resources.getString(R$string.common_google_play_services_unsupported_text, strM14408f);
        }
        if (i == 20) {
            return m14409g(context, "common_google_play_services_restricted_profile_text", strM14408f);
        }
        switch (i) {
            case 16:
                return m14409g(context, "common_google_play_services_api_unavailable_text", strM14408f);
            case 17:
                return m14409g(context, "common_google_play_services_sign_in_failed_text", strM14408f);
            case 18:
                return resources.getString(R$string.common_google_play_services_updating_text, strM14408f);
            default:
                return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, strM14408f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m14406d(Context context, int i) {
        return (i == 6 || i == 19) ? m14409g(context, "common_google_play_services_resolution_required_text", m14408f(context)) : m14405c(context, i);
    }

    /* JADX INFO: renamed from: e */
    public static String m14407e(Activity activity, int i) {
        Resources resources = activity.getResources();
        if (i == 1) {
            return resources.getString(R$string.common_google_play_services_install_button);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(R.string.ok) : resources.getString(R$string.common_google_play_services_enable_button);
        }
        return resources.getString(R$string.common_google_play_services_update_button);
    }

    /* JADX INFO: renamed from: f */
    public static String m14408f(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = m9b.m16702a(context).f66813a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m14409g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM14410h = m14410h(context, str);
        if (strM14410h == null) {
            strM14410h = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM14410h, str2);
    }

    /* JADX INFO: renamed from: h */
    public static String m14410h(Context context, String str) {
        Resources resourcesForApplication;
        l79 l79Var = f45444a;
        synchronized (l79Var) {
            try {
                Locale localeM25155b = new yi5(new zi5(context.getResources().getConfiguration().getLocales())).m25155b(0);
                if (!localeM25155b.equals(f45445b)) {
                    l79Var.clear();
                    f45445b = localeM25155b;
                }
                String str2 = (String) l79Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = to3.f62638e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            l79Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
