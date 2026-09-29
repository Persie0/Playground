package p290o6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.clevertap.android.sdk.C2181a;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p254m2.C7472a;

/* JADX INFO: renamed from: o6.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7979r0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f43406a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    static {
        boolean z10;
        Class cls = ExoPlayer.class;
        try {
            int i10 = HlsMediaSource.METADATA_TYPE_ID3;
            try {
                cls = StyledPlayerView.class;
                int i11 = StyledPlayerView.SHOW_BUFFERING_NEVER;
                C2181a.m6449a("ExoPlayer is present");
                z10 = true;
            } catch (Throwable unused) {
                cls = HlsMediaSource.class;
                C2181a.m6449a("ExoPlayer library files are missing!!!");
                C2181a.m6449a("Please add ExoPlayer dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation.");
                if (cls != null) {
                    C2181a.m6449a("ExoPlayer classes not found ".concat(cls.getName()));
                } else {
                    C2181a.m6449a("ExoPlayer classes not found");
                }
                z10 = false;
            }
        } catch (Throwable unused2) {
        }
        f43406a = z10;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15834a(String str, HashSet hashSet) {
        if (hashSet != null && str != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<String> m15835b(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getString(i10));
            } catch (JSONException e10) {
                C2181a.m6455h("Could not convert JSONArray to ArrayList - " + e10.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static HashMap<String, Object> m15836c(JSONObject jSONObject) {
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.putAll(m15836c((JSONObject) obj));
                } else {
                    map.put(next, jSONObject.get(next));
                }
            } catch (Throwable unused) {
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m15837d(Drawable drawable) throws NullPointerException {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m15838e(Context context) throws NullPointerException {
        try {
            Drawable applicationLogo = context.getPackageManager().getApplicationLogo(context.getApplicationInfo());
            if (applicationLogo != null) {
                return m15837d(applicationLogo);
            }
            throw new Exception("Logo is null");
        } catch (Exception e10) {
            e10.printStackTrace();
            return m15837d(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static Bitmap m15839f(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        String strReplace = str.replace("///", "/").replace("//", "/").replace("http:/", "http://").replace("https:/", "https://");
        HttpsURLConnection httpsURLConnection = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(strReplace).openConnection();
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        C2181a.m6457j("Couldn't close connection!", th2);
                    }
                    return bitmapDecodeStream;
                } catch (IOException e10) {
                    e = e10;
                    C2181a.m6455h("Couldn't download the notification icon. URL was: " + strReplace);
                    e.printStackTrace();
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable th3) {
                            C2181a.m6457j("Couldn't close connection!", th3);
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpsURLConnection = "https://";
                if (httpsURLConnection != 0) {
                    try {
                        httpsURLConnection.disconnect();
                    } catch (Throwable th5) {
                        C2181a.m6457j("Couldn't close connection!", th5);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            httpURLConnection = null;
        } catch (Throwable th6) {
            th = th6;
            if (httpsURLConnection != 0) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: g */
    public static String m15840g(Context context) {
        int networkType;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "Unavailable";
        }
        if (Build.VERSION.SDK_INT >= 30) {
            networkType = 0;
            try {
                i10 = C7472a.m14841a(context, "android.permission.READ_PHONE_STATE") == 0 ? 1 : networkType;
            } catch (Throwable unused) {
            }
            if (i10 != 0) {
                try {
                    networkType = telephonyManager.getDataNetworkType();
                } catch (SecurityException e10) {
                    C2181a.m6449a("Security Exception caught while fetch network type" + e10.getMessage());
                }
            } else {
                C2181a.m6449a("READ_PHONE_STATE permission not asked by the app or not granted by the user");
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        if (networkType == 20) {
            return "5G";
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 11:
                return "2G";
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m15841h(Context context, String str, boolean z10) throws Throwable {
        Bitmap bitmapM15838e = null;
        if (str != null && !str.equals("")) {
            if (!str.startsWith("http")) {
                str = "http://static.wizrocket.com/android/ico//".concat(str);
            }
            Bitmap bitmapM15839f = m15839f(str);
            if (bitmapM15839f != null) {
                return bitmapM15839f;
            }
            if (z10) {
                return m15838e(context);
            }
        } else if (z10) {
            bitmapM15838e = m15838e(context);
        }
        return bitmapM15838e;
    }

    /* JADX INFO: renamed from: i */
    public static int m15842i(Context context, String str) {
        if (context != null) {
            return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public static void m15843j(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null) {
            String packageName = context.getPackageName();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (packageName.equals(it.next().activityInfo.packageName)) {
                    intent.setPackage(packageName);
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15844k(String str) {
        if (str == null) {
            C2181a.m6454f("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is NULL.");
            return false;
        }
        if (str.isEmpty()) {
            C2181a.m6454f("CLEVERTAP_USE_CUSTOM_ID has been set as 1 in AndroidManifest.xml but custom CleverTap ID passed is empty.");
            return false;
        }
        if (str.length() > 64) {
            C2181a.m6454f("Custom CleverTap ID passed is greater than 64 characters. ");
            return false;
        }
        if (str.matches("[=|<>;+.A-Za-z0-9()!:$@_-]*")) {
            return true;
        }
        C2181a.m6454f("Custom CleverTap ID cannot contain special characters apart from : =,(,),_,!,@,$,|<,>,;,+,. and - ");
        return false;
    }
}
