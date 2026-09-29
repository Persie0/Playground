package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.fa4;
import p000.pvc;
import p000.rg1;
import p000.sg1;
import p000.wg1;

/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h */
    public static final Pattern f13792h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a */
    public final Context f13793a;

    /* JADX INFO: renamed from: b */
    public final String f13794b;

    /* JADX INFO: renamed from: c */
    public final String f13795c;

    /* JADX INFO: renamed from: d */
    public final String f13796d;

    /* JADX INFO: renamed from: e */
    public final String f13797e;

    /* JADX INFO: renamed from: f */
    public final long f13798f;

    /* JADX INFO: renamed from: g */
    public final long f13799g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f13793a = context;
        this.f13794b = str;
        this.f13795c = str2;
        Matcher matcher = f13792h.matcher(str);
        this.f13796d = matcher.matches() ? matcher.group(1) : null;
        this.f13797e = str3;
        this.f13798f = j;
        this.f13799g = j2;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m6746c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6747d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m6748a(String str, String str2, Map map, Long l, Map map2) throws FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.f13794b);
        Context context = this.f13793a;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(packageInfo.getLongVersionCode()));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.1.0");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection m6749b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f13796d + "/namespaces/" + this.f13797e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    public wg1 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        String strM19518n;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        boolean z;
        httpURLConnection.setDoOutput(true);
        long j = this.f13798f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f13799g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f13795c);
        Context context = this.f13793a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrM11657s = fa4.m11657s(context, context.getPackageName());
            if (bArrM11657s == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strM19518n = null;
            } else {
                strM19518n = pvc.m19518n(bArrM11657s);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strM19518n);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                m6747d(httpURLConnection, m6748a(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectM6746c = m6746c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    rg1 rg1VarM21346d = sg1.m21346d();
                    rg1VarM21346d.f59231d = date;
                    try {
                        jSONObject = jSONObjectM6746c.getJSONObject("entries");
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            rg1VarM21346d.f59229b = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectM6746c.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            rg1VarM21346d.f59232e = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectM6746c.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            rg1VarM21346d.f59230c = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectM6746c.has("templateVersion") ? jSONObjectM6746c.getString("templateVersion") : null;
                    if (string != null) {
                        rg1VarM21346d.f59228a = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectM6746c.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused8) {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null) {
                        try {
                            rg1VarM21346d.f59233f = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused9) {
                        }
                    }
                    sg1 sg1Var = new sg1((JSONObject) rg1VarM21346d.f59229b, (Date) rg1VarM21346d.f59231d, (JSONArray) rg1VarM21346d.f59232e, (JSONObject) rg1VarM21346d.f59230c, rg1VarM21346d.f59228a, (JSONArray) rg1VarM21346d.f59233f);
                    try {
                        z = !jSONObjectM6746c.get("state").equals("NO_CHANGE");
                    } catch (JSONException unused10) {
                        z = true;
                    }
                    return !z ? new wg1(1, sg1Var, null) : new wg1(0, sg1Var, headerField);
                } catch (JSONException e2) {
                    throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e2);
                }
            } catch (IOException | JSONException e3) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e3);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused11) {
            }
            throw th;
        }
    }
}
