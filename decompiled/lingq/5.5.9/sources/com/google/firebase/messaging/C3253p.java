package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3253p {

    /* JADX INFO: renamed from: a */
    public final Bundle f16414a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C3253p(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f16414a = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9275l(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static String m9276n(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9277a(String str) {
        String strM9286j = m9286j(str);
        return "1".equals(strM9286j) || Boolean.parseBoolean(strM9286j);
    }

    /* JADX INFO: renamed from: b */
    public final Integer m9278b(String str) {
        String strM9286j = m9286j(str);
        if (!TextUtils.isEmpty(strM9286j)) {
            try {
                return Integer.valueOf(Integer.parseInt(strM9286j));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m9276n(str) + "(" + strM9286j + ") into an int");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final JSONArray m9279c(String str) {
        String strM9286j = m9286j(str);
        if (!TextUtils.isEmpty(strM9286j)) {
            try {
                return new JSONArray(strM9286j);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m9276n(str) + ": " + strM9286j + ", falling back to default");
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final int[] m9280d() {
        JSONArray jSONArrayM9279c = m9279c("gcm.n.light_settings");
        if (jSONArrayM9279c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM9279c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM9279c.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM9279c.optInt(1);
            iArr[2] = jSONArrayM9279c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM9279c + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM9279c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Uri m9281e() {
        String strM9286j = m9286j("gcm.n.link_android");
        if (TextUtils.isEmpty(strM9286j)) {
            strM9286j = m9286j("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM9286j)) {
            return null;
        }
        return Uri.parse(strM9286j);
    }

    /* JADX INFO: renamed from: f */
    public final Object[] m9282f(String str) {
        JSONArray jSONArrayM9279c = m9279c(str.concat("_loc_args"));
        if (jSONArrayM9279c == null) {
            return null;
        }
        int length = jSONArrayM9279c.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayM9279c.optString(i10);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: g */
    public final String m9283g(String str) {
        return m9286j(str.concat("_loc_key"));
    }

    /* JADX INFO: renamed from: h */
    public final Long m9284h() {
        String strM9286j = m9286j("gcm.n.event_time");
        if (!TextUtils.isEmpty(strM9286j)) {
            try {
                return Long.valueOf(Long.parseLong(strM9286j));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m9276n("gcm.n.event_time") + "(" + strM9286j + ") into a long");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m9285i(Resources resources, String str, String str2) {
        String strM9286j = m9286j(str2);
        if (!TextUtils.isEmpty(strM9286j)) {
            return strM9286j;
        }
        String strM9283g = m9283g(str2);
        if (!TextUtils.isEmpty(strM9283g)) {
            int identifier = resources.getIdentifier(strM9283g, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", m9276n(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            } else {
                Object[] objArrM9282f = m9282f(str2);
                if (objArrM9282f == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, objArrM9282f);
                } catch (MissingFormatArgumentException e10) {
                    Log.w("NotificationParams", "Missing format argument for " + m9276n(str2) + ": " + Arrays.toString(objArrM9282f) + " Default value will be used.", e10);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final String m9286j(String str) {
        Bundle bundle = this.f16414a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: k */
    public final long[] m9287k() {
        JSONArray jSONArrayM9279c = m9279c("gcm.n.vibrate_timings");
        if (jSONArrayM9279c == null) {
            return null;
        }
        try {
            if (jSONArrayM9279c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM9279c.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayM9279c.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM9279c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final Bundle m9288m() {
        Bundle bundle = this.f16414a;
        Bundle bundle2 = new Bundle(bundle);
        while (true) {
            for (String str : bundle.keySet()) {
                if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                    bundle2.remove(str);
                }
            }
            return bundle2;
        }
    }
}
