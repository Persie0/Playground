package me;

import android.util.Log;
import androidx.activity.result.C0204c;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p339qe.C8597b;

/* JADX INFO: renamed from: me.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7547e {

    /* JADX INFO: renamed from: b */
    public static final Charset f41627b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C8597b f41628a;

    public C7547e(C8597b c8597b) {
        this.f41628a = c8597b;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m15055a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static void m15056d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m15057b(String str, boolean z10) throws Throwable {
        FileInputStream fileInputStream;
        Exception e10;
        C8597b c8597b = this.f41628a;
        File fileM16819b = z10 ? c8597b.m16819b(str, "internal-keys") : c8597b.m16819b(str, "keys");
        if (fileM16819b.exists()) {
            ?? length = fileM16819b.length();
            if (length != 0) {
                ?? r11 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileM16819b);
                        try {
                            HashMap mapM15055a = m15055a(CommonUtils.m9160l(fileInputStream));
                            CommonUtils.m9149a(fileInputStream, "Failed to close user metadata file.");
                            return mapM15055a;
                        } catch (Exception e11) {
                            e10 = e11;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                            m15056d(fileM16819b);
                            CommonUtils.m9149a(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = length;
                        CommonUtils.m9149a(r11, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e12) {
                    fileInputStream = null;
                    e10 = e12;
                } catch (Throwable th3) {
                    th = th3;
                    CommonUtils.m9149a(r11, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m15056d(fileM16819b);
        return Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: c */
    public final String m15058c(String str) {
        FileInputStream fileInputStream;
        File fileM16819b = this.f41628a.m16819b(str, "user-data");
        ?? r10 = 0;
        if (fileM16819b.exists()) {
            ?? r11 = (fileM16819b.length() > 0L ? 1 : (fileM16819b.length() == 0L ? 0 : -1));
            try {
                if (r11 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM16819b);
                        try {
                            JSONObject jSONObject = new JSONObject(CommonUtils.m9160l(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            CommonUtils.m9149a(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            m15056d(fileM16819b);
                            CommonUtils.m9149a(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.m9149a(r10, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r10 = r11;
            }
        }
        String strM852k = C0204c.m852k("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM852k, null);
        }
        m15056d(fileM16819b);
        return null;
    }
}
