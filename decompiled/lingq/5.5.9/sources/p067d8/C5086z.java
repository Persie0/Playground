package p067d8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import dm.C5207g;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7653a;
import mo.C7661i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p173i8.C6205a;
import p291o7.C8004n;
import p291o7.C8006p;
import p291o7.C8010t;

/* JADX INFO: renamed from: d8.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5086z {

    /* JADX INFO: renamed from: b */
    public static int f33016b;

    /* JADX INFO: renamed from: a */
    public static final C5086z f33015a = new C5086z();

    /* JADX INFO: renamed from: c */
    public static long f33017c = -1;

    /* JADX INFO: renamed from: d */
    public static long f33018d = -1;

    /* JADX INFO: renamed from: e */
    public static long f33019e = -1;

    /* JADX INFO: renamed from: f */
    public static String f33020f = "";

    /* JADX INFO: renamed from: g */
    public static String f33021g = "";

    /* JADX INFO: renamed from: h */
    public static String f33022h = "NoCarrier";

    /* JADX INFO: renamed from: d8.z$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        void mo10842d(JSONObject jSONObject);

        /* JADX INFO: renamed from: f */
        void mo10843f(FacebookException facebookException);
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m10802A(String str) {
        if (str != null) {
            return str.length() == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m10803B(Uri uri) {
        return uri != null && (C7661i.m15249O2("http", uri.getScheme()) || C7661i.m15249O2("https", uri.getScheme()) || C7661i.m15249O2("fbstaging", uri.getScheme()));
    }

    /* JADX INFO: renamed from: C */
    public static final ArrayList m10804C(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jSONArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static final HashMap m10805D(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C5207g.m11110e(next, "key");
                String string = jSONObject.getString(next);
                C5207g.m11110e(string, "jsonObject.getString(key)");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m10806E(String str, Exception exc) {
        C8004n c8004n = C8004n.f43550a;
        if (!C8004n.f43559j || str == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    /* JADX INFO: renamed from: F */
    public static final void m10807F(String str, String str2) {
        C8004n c8004n = C8004n.f43550a;
        if (C8004n.f43559j && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final String m10808G(Map<String, String> map) {
        C5207g.m11111f(map, "map");
        String string = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                string = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C5207g.m11110e(string, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: H */
    public static final Bundle m10809H(String str) {
        Bundle bundle = new Bundle();
        if (!m10802A(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Object[] array = C7076b.m14299s3(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                Object[] array2 = C7076b.m14299s3(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    m10806E("FacebookSDK", e10);
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public static final void m10810I(Bundle bundle, JSONArray jSONArray) {
        C5207g.m11111f(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
            return;
        }
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
            return;
        }
        if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    /* JADX INFO: renamed from: J */
    public static final HashMap m10811J(Parcel parcel) {
        C5207g.m11111f(parcel, "parcel");
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        if (i10 > 0) {
            int i11 = 0;
            do {
                i11++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i11 < i10);
        }
        return map;
    }

    /* JADX INFO: renamed from: K */
    public static final String m10812K(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i10 = inputStreamReader.read(cArr);
                        if (i10 == -1) {
                            String string = sb2.toString();
                            C5207g.m11110e(string, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            m10820e(bufferedInputStream);
                            m10820e(inputStreamReader);
                            return string;
                        }
                        sb2.append(cArr, 0, i10);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    m10820e(bufferedInputStream);
                    m10820e(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0182 A[Catch: Exception -> 0x01a8, TryCatch #4 {Exception -> 0x01a8, blocks: (B:39:0x0174, B:41:0x0182, B:47:0x0193, B:45:0x018b), top: B:81:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0187  */
    /* JADX WARN: Code duplicated, block: B:44:0x018a  */
    /* JADX WARN: Code duplicated, block: B:45:0x018b A[Catch: Exception -> 0x01a8, TryCatch #4 {Exception -> 0x01a8, blocks: (B:39:0x0174, B:41:0x0182, B:47:0x0193, B:45:0x018b), top: B:81:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0193 A[Catch: Exception -> 0x01a8, TRY_LEAVE, TryCatch #4 {Exception -> 0x01a8, blocks: (B:39:0x0174, B:41:0x0182, B:47:0x0193, B:45:0x018b), top: B:81:0x0174 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01db A[Catch: Exception -> 0x01df, TRY_LEAVE, TryCatch #0 {Exception -> 0x01df, blocks: (B:56:0x01c5, B:58:0x01db), top: B:73:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: L */
    public static final void m10813L(Context context, JSONObject jSONObject) throws JSONException {
        int i10;
        String str;
        Locale locale;
        double d10;
        int i11;
        int i12;
        int i13;
        File[] fileArrListFiles;
        Object systemService;
        Display display;
        DisplayManager displayManager;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f33015a.getClass();
        int i14 = 0;
        if (f33017c == -1 || System.currentTimeMillis() - f33017c >= 1800000) {
            f33017c = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                C5207g.m11110e(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
                f33020f = displayName;
                String id2 = timeZone.getID();
                C5207g.m11110e(id2, "tz.id");
                f33021g = id2;
            } catch (AssertionError | Exception unused) {
            }
            if (C5207g.m11106a(f33022h, "NoCarrier")) {
                try {
                    Object systemService2 = context.getSystemService("phone");
                    if (systemService2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String networkOperatorName = ((TelephonyManager) systemService2).getNetworkOperatorName();
                    C5207g.m11110e(networkOperatorName, "telephonyManager.networkOperatorName");
                    f33022h = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if (C5207g.m11106a("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f33018d = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                f33018d = Math.round(f33018d / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if (C5207g.m11106a("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    f33019e = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                f33019e = Math.round(f33019e / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        try {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                try {
                    if (packageInfo == null) {
                        return;
                    }
                    i10 = packageInfo.versionCode;
                    try {
                        str = packageInfo.versionName;
                    } catch (PackageManager.NameNotFoundException unused5) {
                        str = "";
                    }
                    jSONArray.put(packageName);
                    jSONArray.put(i10);
                    jSONArray.put(str);
                    jSONArray.put(Build.VERSION.RELEASE);
                    jSONArray.put(Build.MODEL);
                    locale = context.getResources().getConfiguration().locale;
                    jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                    jSONArray.put(f33020f);
                    jSONArray.put(f33022h);
                    d10 = 0.0d;
                    systemService = context.getSystemService("display");
                    display = null;
                    if (systemService instanceof DisplayManager) {
                        displayManager = (DisplayManager) systemService;
                    } else {
                        displayManager = null;
                    }
                    if (displayManager == null) {
                        display = displayManager.getDisplay(0);
                    }
                    if (display != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        display.getMetrics(displayMetrics);
                        i11 = displayMetrics.widthPixels;
                        try {
                            i12 = displayMetrics.heightPixels;
                            try {
                                d10 = displayMetrics.density;
                            } catch (Exception unused6) {
                            }
                        } catch (Exception unused7) {
                            i12 = 0;
                        }
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    jSONArray.put(i11);
                    jSONArray.put(i12);
                    jSONArray.put(new DecimalFormat("#.##").format(d10));
                    i13 = f33016b;
                    if (i13 <= 0) {
                        try {
                            fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new C5085y(i14));
                            if (fileArrListFiles != null) {
                                f33016b = fileArrListFiles.length;
                            }
                        } catch (Exception unused8) {
                        }
                        if (f33016b <= 0) {
                            f33016b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                        }
                        i13 = f33016b;
                    }
                    jSONArray.put(i13);
                    jSONArray.put(f33018d);
                    jSONArray.put(f33019e);
                    jSONArray.put(f33021g);
                    jSONObject.put("extinfo", jSONArray.toString());
                    locale = context.getResources().getConfiguration().locale;
                } catch (Exception unused9) {
                    locale = Locale.getDefault();
                }
            } catch (PackageManager.NameNotFoundException unused10) {
                i10 = -1;
            }
            systemService = context.getSystemService("display");
            display = null;
            if (systemService instanceof DisplayManager) {
                displayManager = (DisplayManager) systemService;
            } else {
                displayManager = null;
            }
            if (displayManager == null) {
                display = displayManager.getDisplay(0);
            }
            if (display != null) {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                display.getMetrics(displayMetrics2);
                i11 = displayMetrics2.widthPixels;
                i12 = displayMetrics2.heightPixels;
                d10 = displayMetrics2.density;
            } else {
                i11 = 0;
                i12 = 0;
            }
        } catch (Exception unused11) {
        }
        str = "";
        jSONArray.put(packageName);
        jSONArray.put(i10);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
        jSONArray.put(f33020f);
        jSONArray.put(f33022h);
        d10 = 0.0d;
        jSONArray.put(i11);
        jSONArray.put(i12);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        i13 = f33016b;
        if (i13 <= 0) {
            fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new C5085y(i14));
            if (fileArrListFiles != null) {
                f33016b = fileArrListFiles.length;
            }
            if (f33016b <= 0) {
                f33016b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i13 = f33016b;
        }
        jSONArray.put(i13);
        jSONArray.put(f33018d);
        jSONArray.put(f33019e);
        jSONArray.put(f33021g);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* JADX INFO: renamed from: M */
    public static final String m10814M(String str) {
        if (str == null) {
            return null;
        }
        f33015a.getClass();
        byte[] bytes = str.getBytes(C7653a.f42116b);
        C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
        return m10836u("SHA-256", bytes);
    }

    /* JADX INFO: renamed from: N */
    public static final void m10815N(Parcel parcel, Map<String, String> map) {
        C5207g.m11111f(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> boolean m10816a(T t10, T t11) {
        if (t10 == null) {
            return t11 == null;
        }
        return C5207g.m11106a(t10, t11);
    }

    /* JADX INFO: renamed from: b */
    public static final Uri m10817b(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    Object obj = bundle.get(next);
                    if (obj instanceof String) {
                        builder.appendQueryParameter(next, (String) obj);
                    }
                }
            }
        }
        Uri uriBuild = builder.build();
        C5207g.m11110e(uriBuild, "builder.build()");
        return uriBuild;
    }

    /* JADX INFO: renamed from: c */
    public static void m10818c(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = C7076b.m14299s3(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            Object[] array2 = C7076b.m14299s3(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = C5207g.m11113h(str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, C5207g.m11116k("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i11, length2 + 1).toString()));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: renamed from: d */
    public static final void m10819d(Context context) {
        try {
            f33015a.getClass();
            m10818c(context, "facebook.com");
            m10818c(context, ".facebook.com");
            m10818c(context, "https://facebook.com");
            m10818c(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10820e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m10821f(String str) {
        String str2 = str;
        if (m10802A(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public static final ArrayList m10822g(JSONArray jSONArray) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jSONArray.getString(i10);
                    C5207g.m11110e(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
        } catch (JSONException unused) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final HashMap m10823h(JSONObject jSONObject) {
        int length;
        C5207g.m11111f(jSONObject, "jsonObject");
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null && (length = jSONArrayNames.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = jSONArrayNames.getString(i10);
                    C5207g.m11110e(string, "keys.getString(i)");
                    Object objM10823h = jSONObject.get(string);
                    if (objM10823h instanceof JSONObject) {
                        objM10823h = m10823h((JSONObject) objM10823h);
                    }
                    C5207g.m11110e(objM10823h, "value");
                    map.put(string, objM10823h);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static final HashMap m10824i(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                C5207g.m11110e(next, "key");
                map.put(next, strOptString);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static final int m10825j(InputStream inputStream, OutputStream outputStream) throws Throwable {
        C5207g.m11111f(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = bufferedInputStream2.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    i10 += i11;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m10826k(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final String m10827l(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: m */
    public static final String m10828m(Context context) {
        String string;
        try {
            C8004n c8004n = C8004n.f43550a;
            C5056a0.m10747e();
            String str = C8004n.f43555f;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                C5207g.m11110e(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Date m10829n(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    /* JADX INFO: renamed from: o */
    public static final JSONObject m10830o() {
        if (C6205a.m12742b(C5086z.class)) {
            return null;
        }
        try {
            String string = C8004n.m15871a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(C5086z.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m10831p(final a aVar, final String str) {
        String str2;
        C5207g.m11111f(str, "accessToken");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = C5082v.f33010a;
        JSONObject jSONObject = C5082v.f33010a.get(str);
        if (jSONObject != null) {
            aVar.mo10842d(jSONObject);
            return;
        }
        GraphRequest.InterfaceC2278b interfaceC2278b = new GraphRequest.InterfaceC2278b() { // from class: d8.x
            @Override // com.facebook.GraphRequest.InterfaceC2278b
            /* JADX INFO: renamed from: a */
            public final void mo6614a(C8010t c8010t) {
                C5086z.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$callback");
                String str3 = str;
                C5207g.m11111f(str3, "$accessToken");
                FacebookRequestError facebookRequestError = c8010t.f43588c;
                if (facebookRequestError != null) {
                    aVar2.mo10843f(facebookRequestError.f11446i);
                    return;
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = C5082v.f33010a;
                JSONObject jSONObject2 = c8010t.f43589d;
                if (jSONObject2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                C5082v.f33010a.put(str3, jSONObject2);
                aVar2.mo10842d(jSONObject2);
            }
        };
        f33015a.getClass();
        Bundle bundle = new Bundle();
        Date date = AccessToken.f11370l;
        AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
        if (accessTokenM6595b == null || (str2 = accessTokenM6595b.f11381k) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", C5207g.m11106a(str2, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        GraphRequest graphRequest = new GraphRequest(null, "me", null, null, new C8006p(0, null), 32);
        graphRequest.f11454d = bundle;
        graphRequest.m6613k(HttpMethod.GET);
        graphRequest.m6612j(interfaceC2278b);
        graphRequest.m6607d();
    }

    /* JADX INFO: renamed from: q */
    public static final String m10832q(Context context) {
        String str = C5056a0.f32910a;
        if (context != null) {
            return C8004n.m15872b();
        }
        throw new NullPointerException("Argument 'context' cannot be null");
    }

    /* JADX INFO: renamed from: r */
    public static final Method m10833r(Class<?> cls, String str, Class<?>... clsArr) {
        C5207g.m11111f(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final Method m10834s(String str, String str2, Class<?>... clsArr) {
        try {
            return m10833r(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public static final Object m10835t(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, objOpt);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: u */
    public static String m10836u(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            C5207g.m11110e(messageDigest, "hash");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            C5207g.m11110e(bArrDigest, "digest");
            int length = bArrDigest.length;
            int i10 = 0;
            while (i10 < length) {
                byte b10 = bArrDigest[i10];
                i10++;
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString((b10 >> 0) & 15));
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "builder.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Object m10837v(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m10838w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
            C5207g.m11110e(str, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(str));
            Context contextM15871a = C8004n.m15871a();
            PackageManager packageManager = contextM15871a.getPackageManager();
            String packageName = contextM15871a.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            C5207g.m11110e(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (C5207g.m11106a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m10839x(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && new Regex(".+_cheets|cheets_.+").m14271b(str);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m10840y() {
        if (C6205a.m12742b(C5086z.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectM10830o = m10830o();
            if (jSONObjectM10830o == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectM10830o.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        C5207g.m11110e(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (C5207g.m11106a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            C6205a.m12741a(C5086z.class, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10841z(Context context) {
        Method methodM10834s = m10834s("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM10834s == null) {
            return false;
        }
        Object objM10837v = m10837v(null, methodM10834s, context);
        return (objM10837v instanceof Integer) && C5207g.m11106a(objM10837v, 0);
    }
}
