package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import p021j$.net.URLEncoder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jat extends izs {

    /* JADX INFO: renamed from: a */
    public static final byte[] f33621a = "\n".getBytes();

    /* JADX INFO: renamed from: c */
    public final jay f33622c;

    /* JADX INFO: renamed from: d */
    private final String f33623d;

    public jat(izv izvVar) {
        super(izvVar);
        String str = izt.f32725a;
        String str2 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String string = null;
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                string = sb.toString();
            }
        }
        this.f33623d = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str, str2, string, Build.MODEL, Build.ID);
        this.f33622c = new jay();
    }

    /* JADX INFO: renamed from: I */
    private static final void m12798I(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX INFO: renamed from: C */
    public final URL m12799C() {
        try {
            return new URL(jah.m12775f().concat((String) jam.f33590l.m11334D()));
        } catch (MalformedURLException e) {
            m11934o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public final URL m12800D(jao jaoVar) {
        try {
            return new URL(jaoVar.f33614e ? jah.m12775f().concat(jah.m12776g()) : jah.m12777h().concat(jah.m12776g()));
        } catch (MalformedURLException e) {
            m11934o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public final URL m12801E(jao jaoVar, String str) {
        String str2;
        if (jaoVar.f33614e) {
            str2 = jah.m12775f() + jah.m12776g() + "?" + str;
        } else {
            str2 = jah.m12777h() + jah.m12776g() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            m11934o("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m12802F(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        m11934o("Error closing http connection input stream", e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        m11934o("Error closing http connection input stream", e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12803G() {
        NetworkInfo activeNetworkInfo;
        izo.m11916a();
        m11946z();
        try {
            activeNetworkInfo = ((ConnectivityManager) m11924d().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        m11936q("No network connectivity");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public final int m12804H(URL url, byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnectionM12806c;
        jib.m13205j(bArr);
        int length = bArr.length;
        super.m11942w(3, "POST bytes, url", Integer.valueOf(length), url, null);
        m11923x();
        OutputStream outputStream = null;
        try {
            httpURLConnectionM12806c = m12806c(url);
            try {
                httpURLConnectionM12806c.setDoOutput(true);
                httpURLConnectionM12806c.setFixedLengthStreamingMode(length);
                httpURLConnectionM12806c.connect();
                outputStream = httpURLConnectionM12806c.getOutputStream();
                outputStream.write(bArr);
                m12802F(httpURLConnectionM12806c);
                int responseCode = httpURLConnectionM12806c.getResponseCode();
                if (responseCode == 200) {
                    m11926f().m11920c();
                    responseCode = 200;
                }
                m11932m("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        m11934o("Error closing http post connection output stream", e);
                    }
                }
                if (httpURLConnectionM12806c != null) {
                    httpURLConnectionM12806c.disconnect();
                }
                return responseCode;
            } catch (IOException e2) {
                e = e2;
                try {
                    m11940u("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            m11934o("Error closing http post connection output stream", e3);
                        }
                    }
                    if (httpURLConnectionM12806c == null) {
                        return 0;
                    }
                    httpURLConnectionM12806c.disconnect();
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e4) {
                            m11934o("Error closing http post connection output stream", e4);
                        }
                    }
                    if (httpURLConnectionM12806c != null) {
                        throw th;
                    }
                    httpURLConnectionM12806c.disconnect();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnectionM12806c != null) {
                    throw th;
                }
                httpURLConnectionM12806c.disconnect();
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnectionM12806c = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionM12806c = null;
        }
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        m11937r("Network initialized. User agent", this.f33623d);
    }

    /* JADX INFO: renamed from: b */
    final String m12805b(jao jaoVar, boolean z) {
        long j;
        jib.m13205j(jaoVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : jaoVar.f33610a.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    m12798I(sb, str, (String) entry.getValue());
                }
            }
            m12798I(sb, "ht", String.valueOf(jaoVar.f33612c));
            m12798I(sb, "qt", String.valueOf(System.currentTimeMillis() - jaoVar.f33612c));
            if (z) {
                jib.m13203h("_s");
                jib.m13197b(true, "Short param name required");
                String str2 = (String) jaoVar.f33610a.get("_s");
                try {
                    j = Long.parseLong(str2 != null ? str2 : "0");
                } catch (NumberFormatException e) {
                    j = 0;
                }
                m12798I(sb, "z", j != 0 ? String.valueOf(j) : String.valueOf(jaoVar.f33611b));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            m11934o("Failed to encode name or value", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    final HttpURLConnection m12806c(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(((Integer) jam.f33599u.m11334D()).intValue());
        httpURLConnection.setReadTimeout(((Integer) jam.f33600v.m11334D()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.f33623d);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }
}
