package p066d7;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.p049db.DBAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p088e7.C5382b;
import p290o6.C7951d0;
import p290o6.C7967l0;

/* JADX INFO: renamed from: d7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5049a {
    /* JADX INFO: renamed from: a */
    public static JSONObject m10722a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String string = bundle.getString("wzrk_adunit");
        C2181a.m6455h("Received Display Unit via push payload: " + string);
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("adUnit_notifs", jSONArray);
        jSONArray.put(new JSONObject(string));
        return jSONObject;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static JSONObject m10723b(C7951d0 c7951d0, boolean z10, boolean z11) throws JSONException {
        String str;
        Boolean boolValueOf;
        BluetoothAdapter defaultAdapter;
        ConnectivityManager connectivityManager;
        String str2;
        boolean z12;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Build", c7951d0.m15764h().f43303b + "");
        jSONObject.put("Version", c7951d0.m15764h().f43315n);
        jSONObject.put("OS Version", c7951d0.m15764h().f43313l);
        jSONObject.put("SDK Version", c7951d0.m15764h().f43314m);
        synchronized (c7951d0.f43291a) {
            str = c7951d0.f43298h;
        }
        if (str != null) {
            String str3 = z11 ? "mt_GoogleAdID" : "GoogleAdID";
            synchronized (c7951d0.f43291a) {
                str2 = c7951d0.f43298h;
            }
            jSONObject.put(str3, str2);
            synchronized (c7951d0.f43291a) {
                try {
                    z12 = c7951d0.f43299i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jSONObject.put("GoogleAdIDLimit", z12);
        }
        try {
            jSONObject.put("Make", c7951d0.m15764h().f43308g);
            jSONObject.put("Model", c7951d0.m15764h().f43309h);
            jSONObject.put("Carrier", c7951d0.m15764h().f43304c);
            jSONObject.put("useIP", z10);
            jSONObject.put("OS", c7951d0.m15764h().f43312k);
            jSONObject.put("wdt", c7951d0.m15764h().f43316o);
            jSONObject.put("hgt", c7951d0.m15764h().f43307f);
            jSONObject.put("dpi", c7951d0.m15764h().f43306e);
            jSONObject.put("dt", C7951d0.m15757k(c7951d0.f43295e));
            if (Build.VERSION.SDK_INT >= 28) {
                jSONObject.put("abckt", c7951d0.m15764h().f43317p);
            }
            C7967l0.m15806h(c7951d0.f43295e).getClass();
            boolean z13 = true;
            if (C7967l0.f43379j) {
                jSONObject.put("sslpin", true);
            }
            C7967l0.m15806h(c7951d0.f43295e).getClass();
            if (!TextUtils.isEmpty(C7967l0.f43365H)) {
                jSONObject.put("fcmsid", true);
            }
            String str4 = c7951d0.m15764h().f43305d;
            if (str4 != null && !str4.equals("")) {
                jSONObject.put("cc", str4);
            }
            if (z10) {
                Context context = c7951d0.f43295e;
                Boolean boolValueOf2 = null;
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                    boolValueOf = null;
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
                        z13 = false;
                    }
                    boolValueOf = Boolean.valueOf(z13);
                }
                if (boolValueOf != null) {
                    jSONObject.put("wifi", boolValueOf);
                }
                Context context2 = c7951d0.f43295e;
                try {
                    if (context2.getPackageManager().checkPermission("android.permission.BLUETOOTH", context2.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                        boolValueOf2 = Boolean.valueOf(defaultAdapter.isEnabled());
                    }
                } catch (Throwable unused) {
                }
                if (boolValueOf2 != null) {
                    jSONObject.put("BluetoothEnabled", boolValueOf2);
                }
                String str5 = c7951d0.m15764h().f43302a;
                if (str5 != null) {
                    jSONObject.put("BluetoothVersion", str5);
                }
                String str6 = c7951d0.m15764h().f43310i;
                if (str6 != null) {
                    jSONObject.put("Radio", str6);
                }
            }
            jSONObject.put("LIAMC", c7951d0.m15764h().f43318q);
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m10724c(C5382b c5382b) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", c5382b.f33797a);
            jSONObject.put("d", c5382b.f33798b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00af A[Catch: all -> 0x00f6, PHI: r11
      0x00af: PHI (r11v3 android.database.Cursor) = (r11v1 android.database.Cursor), (r11v4 android.database.Cursor) binds: [B:24:0x00ad, B:19:0x007f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00f6, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000f, B:18:0x007a, B:26:0x00b2, B:25:0x00af, B:23:0x00a7, B:33:0x00e7, B:35:0x00f0, B:37:0x00f5, B:11:0x001e, B:13:0x003d, B:15:0x0044, B:16:0x0076, B:22:0x0083), top: B:43:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: d */
    public static JSONArray m10725d(DBAdapter dBAdapter) {
        int i10;
        String[] strArr;
        synchronized (dBAdapter) {
            try {
                if (dBAdapter.f11041c) {
                    String name = DBAdapter.Table.PUSH_NOTIFICATIONS.getName();
                    ArrayList arrayList = new ArrayList();
                    Cursor cursorQuery = null;
                    try {
                        try {
                            cursorQuery = dBAdapter.f11040b.getReadableDatabase().query(name, null, "isRead =?", new String[]{"0"}, null, null, null);
                            if (cursorQuery != null) {
                                while (cursorQuery.moveToNext()) {
                                    C2181a.m6455h("Fetching PID - " + cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                                    arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndex("data")));
                                }
                                cursorQuery.close();
                            }
                            dBAdapter.f11040b.close();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th2) {
                            dBAdapter.f11040b.close();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th2;
                        }
                    } catch (SQLiteException e10) {
                        dBAdapter.m6470g().getClass();
                        C2181a.m6459l("Could not fetch records out of database " + name + ".", e10);
                        dBAdapter.f11040b.close();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } else {
                    strArr = new String[0];
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            C2181a.m6455h("RTL IDs -" + str);
            jSONArray.put(str);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m10726e(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (true) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    JSONObject jSONObjectM10726e = m10726e((Bundle) obj);
                    Iterator<String> itKeys = jSONObjectM10726e.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectM10726e.get(next));
                    }
                } else if (str.startsWith("wzrk_")) {
                    jSONObject.put(str, bundle.get(str));
                }
            }
            return jSONObject;
        }
    }
}
