package p176ib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.linguist.R;
import java.util.Locale;
import p262mb.C7529b;
import p295ob.C8032b;
import p326q.C8452h;
import p389t2.C9186e;

/* JADX INFO: renamed from: ib.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6284o {

    /* JADX INFO: renamed from: a */
    public static final C8452h<String, String> f36477a = new C8452h<>();

    /* JADX INFO: renamed from: b */
    public static Locale f36478b;

    /* JADX INFO: renamed from: a */
    public static String m12923a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C8032b.m15902a(context).f43660a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m12924b(int i10, Context context) {
        Resources resources = context.getResources();
        String strM12923a = m12923a(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM12923a);
        }
        if (i10 == 2) {
            return C7529b.m15041b(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM12923a);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM12923a);
        }
        if (i10 == 5) {
            return m12926d(context, "common_google_play_services_invalid_account_text", strM12923a);
        }
        if (i10 == 7) {
            return m12926d(context, "common_google_play_services_network_error_text", strM12923a);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM12923a);
        }
        if (i10 == 20) {
            return m12926d(context, "common_google_play_services_restricted_profile_text", strM12923a);
        }
        switch (i10) {
            case 16:
                return m12926d(context, "common_google_play_services_api_unavailable_text", strM12923a);
            case 17:
                return m12926d(context, "common_google_play_services_sign_in_failed_text", strM12923a);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM12923a);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM12923a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m12925c(int i10, Context context) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m12927e(context, "common_google_play_services_invalid_account_title");
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m12927e(context, "common_google_play_services_network_error_title");
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
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m12927e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m12927e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m12926d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM12927e = m12927e(context, str);
        if (strM12927e == null) {
            strM12927e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM12927e, str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static String m12927e(Context context, String str) {
        C8452h<String, String> c8452h = f36477a;
        synchronized (c8452h) {
            Locale locale = C9186e.m17521a(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f36478b)) {
                c8452h.clear();
                f36478b = locale;
            }
            String orDefault = c8452h.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            c8452h.put(str, string);
            return string;
        }
    }
}
