package cc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p041c5.C1702c;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.v5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1961v5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f10260a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1970w5 f10261b;

    /* JADX INFO: renamed from: c */
    public final C1702c f10262c;

    public RunnableC1961v5(C1970w5 c1970w5, String str, URL url, C1702c c1702c) {
        this.f10261b = c1970w5;
        C6272i.m12912f(str);
        this.f10260a = url;
        this.f10262c = c1702c;
    }

    /* JADX INFO: renamed from: a */
    public final void m5899a(final int i10, final IOException iOException, final byte[] bArr, final Map map) {
        C1879m4 c1879m4 = ((C1897o4) this.f10261b.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5753p(new Runnable() { // from class: cc.u5
            /* JADX WARN: Code duplicated, block: B:10:0x0033  */
            /* JADX WARN: Code duplicated, block: B:18:0x0072 A[Catch: JSONException -> 0x013b, TryCatch #0 {JSONException -> 0x013b, blocks: (B:16:0x0055, B:18:0x0072, B:19:0x0082, B:21:0x0089, B:39:0x012e, B:24:0x0092, B:26:0x00b2, B:28:0x00b9, B:32:0x00e2, B:35:0x0105, B:37:0x011a), top: B:48:0x0055, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:19:0x0082 A[Catch: JSONException -> 0x013b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x013b, blocks: (B:16:0x0055, B:18:0x0072, B:19:0x0082, B:21:0x0089, B:39:0x012e, B:24:0x0092, B:26:0x00b2, B:28:0x00b9, B:32:0x00e2, B:35:0x0105, B:37:0x011a), top: B:48:0x0055, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:34:0x0104  */
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArr2;
                String strOptString;
                String strOptString2;
                double dOptDouble;
                InterfaceC1781b5 interfaceC1781b5;
                List<ResolveInfo> listQueryIntentActivities;
                SharedPreferences.Editor editorEdit;
                C1897o4 c1897o4 = (C1897o4) this.f10237a.f10262c.f9487a;
                C1900o7 c1900o7 = c1897o4.f10089l;
                int i11 = i10;
                Exception exc = iOException;
                C1860k3 c1860k3 = c1897o4.f10086i;
                if (i11 == 200 || i11 == 204) {
                    if (exc == null) {
                        C1986y3 c1986y3 = c1897o4.f10085h;
                        C1897o4.m5774i(c1986y3);
                        c1986y3.f10395M.m5889a(true);
                        bArr2 = bArr;
                        if (bArr2 != null && bArr2.length != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(bArr2));
                                strOptString = jSONObject.optString("deeplink", "");
                                strOptString2 = jSONObject.optString("gclid", "");
                                dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                                if (TextUtils.isEmpty(strOptString)) {
                                    C1897o4.m5776k(c1860k3);
                                    c1860k3.f9937H.m5623a("Deferred Deep Link is empty.");
                                } else {
                                    C1897o4.m5774i(c1900o7);
                                    interfaceC1781b5 = c1900o7.f10430a;
                                    if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = ((C1897o4) interfaceC1781b5).f10076a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                                        C1897o4.m5776k(c1860k3);
                                        c1860k3.f9945i.m5625c(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                                    } else {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("gclid", strOptString2);
                                        bundle.putString("_cis", "ddp");
                                        c1897o4.f10060K.m5871o("auto", "_cmp", bundle);
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            try {
                                                editorEdit = ((C1897o4) interfaceC1781b5).f10076a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                                editorEdit.putString("deeplink", strOptString);
                                                editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                                if (editorEdit.commit()) {
                                                    ((C1897o4) interfaceC1781b5).f10076a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                                }
                                            } catch (RuntimeException e10) {
                                                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                                                C1897o4.m5776k(c1860k4);
                                                c1860k4.f9942f.m5624b(e10, "Failed to persist Deferred Deep Link. exception");
                                            }
                                        }
                                    }
                                }
                                return;
                            } catch (JSONException e11) {
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9942f.m5624b(e11, "Failed to parse the Deferred Deep Link response. exception");
                                return;
                            }
                        }
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9937H.m5623a("Deferred Deep Link response empty.");
                        return;
                    }
                } else if (i11 == 304) {
                    i11 = 304;
                    if (exc == null) {
                        C1986y3 c1986y4 = c1897o4.f10085h;
                        C1897o4.m5774i(c1986y4);
                        c1986y4.f10395M.m5889a(true);
                        bArr2 = bArr;
                        if (bArr2 != null) {
                            JSONObject jSONObject2 = new JSONObject(new String(bArr2));
                            strOptString = jSONObject2.optString("deeplink", "");
                            strOptString2 = jSONObject2.optString("gclid", "");
                            dOptDouble = jSONObject2.optDouble("timestamp", 0.0d);
                            if (TextUtils.isEmpty(strOptString)) {
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9937H.m5623a("Deferred Deep Link is empty.");
                            } else {
                                C1897o4.m5774i(c1900o7);
                                interfaceC1781b5 = c1900o7.f10430a;
                                if (TextUtils.isEmpty(strOptString)) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("gclid", strOptString2);
                                    bundle2.putString("_cis", "ddp");
                                    c1897o4.f10060K.m5871o("auto", "_cmp", bundle2);
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        editorEdit = ((C1897o4) interfaceC1781b5).f10076a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        editorEdit.putString("deeplink", strOptString);
                                        editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                        if (editorEdit.commit()) {
                                            ((C1897o4) interfaceC1781b5).f10076a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                        }
                                    }
                                }
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9945i.m5625c(strOptString2, strOptString, "Deferred Deep Link validation failed. gclid, deep link");
                            }
                            return;
                        }
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9937H.m5623a("Deferred Deep Link response empty.");
                        return;
                    }
                }
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5625c(Integer.valueOf(i11), exc, "Network Request for Deferred Deep Link failed. response, exception");
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [cc.v5] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r10;
        ?? r11;
        InputStream inputStream;
        C1970w5 c1970w5 = this.f10261b;
        C1879m4 c1879m4 = ((C1897o4) c1970w5.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.m5749l();
        InterfaceC1781b5 interfaceC1781b5 = c1970w5.f10430a;
        int i10 = 0;
        try {
            URLConnection uRLConnectionOpenConnection = this.f10260a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            ((C1897o4) interfaceC1781b5).getClass();
            ?? r12 = 60000;
            ?? r13 = 60000;
            httpURLConnection.setConnectTimeout(60000);
            ((C1897o4) interfaceC1781b5).getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i11 = inputStream.read(bArr);
                                    if (i11 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        m5899a(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        IOException iOException = e;
                        i10 = responseCode;
                        e = iOException;
                        r11 = r13;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m5899a(i10, e, null, r11);
                    } catch (Throwable th4) {
                        th = th4;
                        Throwable th5 = th;
                        i10 = responseCode;
                        th = th5;
                        r10 = r12;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        m5899a(i10, null, null, r10);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    r13 = 0;
                    IOException iOException2 = e;
                    i10 = responseCode;
                    e = iOException2;
                    r11 = r13;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m5899a(i10, e, null, r11);
                } catch (Throwable th6) {
                    th = th6;
                    r12 = 0;
                    Throwable th7 = th;
                    i10 = responseCode;
                    th = th7;
                    r10 = r12;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m5899a(i10, null, null, r10);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                r11 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m5899a(i10, e, null, r11);
            } catch (Throwable th8) {
                th = th8;
                r10 = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                m5899a(i10, null, null, r10);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            httpURLConnection = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
        }
    }
}
