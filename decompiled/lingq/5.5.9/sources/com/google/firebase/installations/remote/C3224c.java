package com.google.firebase.installations.remote;

import ae.C0062b;
import af.InterfaceC0071d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.activity.result.C0204c;
import cf.InterfaceC2005b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import gf.C5790a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p176ib.C6272i;
import p295ob.C8032b;

/* JADX INFO: renamed from: com.google.firebase.installations.remote.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3224c {

    /* JADX INFO: renamed from: d */
    public static final Pattern f16294d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    public static final Charset f16295e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f16296a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2005b<InterfaceC0071d> f16297b;

    /* JADX INFO: renamed from: c */
    public final C5790a f16298c = new C5790a();

    public C3224c(Context context, InterfaceC2005b<InterfaceC0071d> interfaceC2005b) {
        this.f16296a = context;
        this.f16297b = interfaceC2005b;
    }

    /* JADX INFO: renamed from: a */
    public static URL m9219a(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            String message = e10.getMessage();
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException(message);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9220b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f16295e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : C0204c.m852k(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    /* JADX INFO: renamed from: d */
    public static long m9221d(String str) {
        C6272i.m12907a("Invalid Expiration Timestamp.", f16294d.matcher(str).matches());
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static C3222a m9222e(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f16295e));
        Long lValueOf = 0L;
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        String strNextString4 = null;
        C3223b c3223b = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString4 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        lValueOf = Long.valueOf(m9221d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                String str = lValueOf == null ? " tokenExpirationTimestamp" : "";
                if (!str.isEmpty()) {
                    throw new IllegalStateException("Missing required properties:".concat(str));
                }
                c3223b = new C3223b(strNextString, lValueOf.longValue(), null);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C3222a(strNextString2, strNextString3, strNextString4, c3223b, InstallationResponse.ResponseCode.OK);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static C3223b m9223f(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f16295e));
        Long lValueOf = 0L;
        jsonReader.beginObject();
        String strNextString = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                lValueOf = Long.valueOf(m9221d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        TokenResult.ResponseCode responseCode = TokenResult.ResponseCode.OK;
        String str = lValueOf == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new C3223b(strNextString, lValueOf.longValue(), responseCode);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX INFO: renamed from: g */
    public static void m9224g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            m9226i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static void m9225h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m9226i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static void m9226i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m9227c(URL url, String str) throws FirebaseInstallationsException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f16296a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC0071d interfaceC0071d = this.f16297b.get();
            if (interfaceC0071d != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.m8537a(interfaceC0071d.mo445a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfoM15900b = C8032b.m15902a(context).m15900b(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfoM15900b.signatures;
                if (signatureArr != null && signatureArr.length == 1) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i10++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    bArrDigest = messageDigest == null ? null : messageDigest.digest(packageInfoM15900b.signatures[0].toByteArray());
                }
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb2 = new StringBuilder(length + length);
                    for (int i11 = 0; i11 < length; i11++) {
                        char[] cArr = C0062b.f146H;
                        sb2.append(cArr[(bArrDigest[i11] & 240) >>> 4]);
                        sb2.append(cArr[bArrDigest[i11] & 15]);
                    }
                    string = sb2.toString();
                }
            } catch (PackageManager.NameNotFoundException e12) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
