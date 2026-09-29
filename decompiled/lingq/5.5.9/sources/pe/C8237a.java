package pe;

import android.support.v4.media.session.C0166e;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p003a2.C0009a;
import p166i1.C6153k;

/* JADX INFO: renamed from: pe.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8237a {

    /* JADX INFO: renamed from: a */
    public final String f44503a;

    /* JADX INFO: renamed from: b */
    public final Map<String, String> f44504b;

    /* JADX INFO: renamed from: c */
    public final HashMap f44505c = new HashMap();

    public C8237a(String str, HashMap map) {
        this.f44503a = str;
        this.f44504b = map;
    }

    /* JADX INFO: renamed from: a */
    public static String m16378a(String str, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return C0009a.m21i(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return C0166e.m765k(str, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C6153k m16379b() throws Throwable {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        String string;
        InputStream inputStream = null;
        try {
            String strM16378a = m16378a(this.f44503a, this.f44504b);
            String str = "GET Request URL: " + strM16378a;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strM16378a).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f44505c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
                if (inputStream2 != null) {
                    string = inputStream;
                    inputStream2.close();
                }
                string = inputStream;
                httpsURLConnection.disconnect();
                return new C6153k(string, responseCode);
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpsURLConnection = null;
        }
    }
}
