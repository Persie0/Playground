package cg;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Uri;
import com.kochava.core.BuildConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import mg.C7557a;
import mg.C7558b;
import org.json.JSONArray;
import p338qd.C8573r0;
import p534zf.C10483a;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10486d;

/* JADX INFO: renamed from: cg.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2006a {

    /* JADX INFO: renamed from: a */
    public final Context f10445a;

    /* JADX INFO: renamed from: b */
    public final Uri f10446b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10486d f10447c;

    /* JADX INFO: renamed from: d */
    public HashMap f10448d = null;

    /* JADX INFO: renamed from: e */
    public long[] f10449e = null;

    public AbstractC2006a(Context context, Uri uri, C10485c c10485c) {
        this.f10445a = context;
        this.f10446b = uri;
        this.f10447c = c10485c;
    }

    /* JADX INFO: renamed from: a */
    public static HttpURLConnection m5938a(C10487e c10487e, Uri uri, HashMap map, int i10) throws IOException {
        String property;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS);
        httpURLConnection.setReadTimeout(BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS);
        boolean z10 = true;
        httpURLConnection.setDoInput(true);
        if (i10 < 0) {
            z10 = false;
        }
        httpURLConnection.setDoOutput(z10);
        if (i10 >= 0) {
            httpURLConnection.setFixedLengthStreamingMode(i10);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestMethod("POST");
            c10487e.m19450D("method", "POST");
        } else {
            httpURLConnection.setRequestMethod("GET");
            c10487e.m19450D("method", "GET");
        }
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487e.m19448B(c10487eM19445u, "request_headers");
        if ((map == null || !map.containsKey("User-Agent")) && (property = System.getProperty("http.agent")) != null) {
            httpURLConnection.setRequestProperty("User-Agent", property);
            c10487eM19445u.m19450D("User-Agent", property);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                c10487eM19445u.m19450D((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0065 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10485c m5939b(InputStream inputStream) throws IOException {
        C10483a c10483a;
        StringBuilder sb2 = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, C8573r0.m16736l0());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            } catch (IOException unused) {
                throw new IOException("Failed to read string from input stream");
            }
            try {
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
        try {
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException unused3) {
        }
        String string = sb2.toString();
        Object obj = C10485c.f52415b;
        C10487e c10487eM19446v = C10487e.m19446v(string, false);
        if (c10487eM19446v != null) {
            return new C10485c(c10487eM19446v);
        }
        try {
            c10483a = new C10483a(new JSONArray(string));
        } catch (Exception unused4) {
            c10483a = null;
        }
        return c10483a != null ? new C10485c(c10483a) : new C10485c(string);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static C10485c m5940c(C10487e c10487e, Context context, Uri uri, HashMap map, InterfaceC10486d interfaceC10486d) throws IOException {
        boolean z10;
        byte[] bytes;
        if (interfaceC10486d != null) {
            c10487e.mo19458h("request", interfaceC10486d);
        }
        int i10 = 0;
        do {
            z10 = true;
            i10++;
            if (C7557a.m15078b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                try {
                    NetworkInfo activeNetworkInfo = C7558b.m15079a(context).getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        z10 = false;
                    }
                } catch (Throwable unused) {
                }
            }
            if (!z10) {
                if (i10 > 4) {
                    throw new IOException("No network access");
                }
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused2) {
                }
            }
        } while (!z10);
        HttpURLConnection httpURLConnectionM5938a = null;
        if (interfaceC10486d == null) {
            bytes = null;
        } else {
            try {
                bytes = ((C10485c) interfaceC10486d).toString().getBytes(C8573r0.m16736l0());
            } catch (Throwable th2) {
                try {
                    throw new IOException(th2);
                } catch (Throwable th3) {
                    if (httpURLConnectionM5938a != null) {
                        httpURLConnectionM5938a.disconnect();
                    }
                    throw th3;
                }
            }
        }
        httpURLConnectionM5938a = m5938a(c10487e, uri, map, bytes != null ? bytes.length : -1);
        httpURLConnectionM5938a.connect();
        if (bytes != null) {
            OutputStream outputStream = httpURLConnectionM5938a.getOutputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            try {
                try {
                    bufferedOutputStream.write(bytes);
                    try {
                        bufferedOutputStream.close();
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                } catch (Throwable th4) {
                    try {
                        bufferedOutputStream.close();
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                    throw th4;
                }
            } catch (IOException unused5) {
                throw new IOException("Failed to write output stream");
            }
        }
        C10485c c10485cM5939b = m5939b(httpURLConnectionM5938a.getInputStream());
        httpURLConnectionM5938a.disconnect();
        return c10485cM5939b;
    }
}
