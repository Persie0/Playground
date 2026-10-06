package p000;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brj implements bra {

    /* JADX INFO: renamed from: a */
    private final bvc f4221a;

    /* JADX INFO: renamed from: b */
    private final int f4222b;

    /* JADX INFO: renamed from: c */
    private HttpURLConnection f4223c;

    /* JADX INFO: renamed from: d */
    private InputStream f4224d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f4225e;

    public brj(bvc bvcVar, int i) {
        this.f4221a = bvcVar;
        this.f4222b = i;
    }

    /* JADX INFO: renamed from: b */
    private static int m2953b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    private final InputStream m2954e(URL url, int i, URL url2, Map map) throws bqg {
        if (i >= 5) {
            throw new bqg("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new bqg("In re-direct loop", -1);
                }
            } catch (URISyntaxException e) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(this.f4222b);
            httpURLConnection.setReadTimeout(this.f4222b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f4223c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f4224d = this.f4223c.getInputStream();
                if (this.f4225e) {
                    return null;
                }
                int iM2953b = m2953b(this.f4223c);
                int i2 = iM2953b / 100;
                if (i2 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f4223c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f4224d = new cax(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            this.f4224d = httpURLConnection2.getInputStream();
                        }
                        return this.f4224d;
                    } catch (IOException e2) {
                        throw new bqg("Failed to obtain InputStream", m2953b(httpURLConnection2), e2);
                    }
                }
                if (i2 != 3) {
                    if (iM2953b == -1) {
                        throw new bqg("Http request failed", -1);
                    }
                    try {
                        throw new bqg(this.f4223c.getResponseMessage(), iM2953b);
                    } catch (IOException e3) {
                        throw new bqg("Failed to get a response message", iM2953b, e3);
                    }
                }
                String headerField = this.f4223c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new bqg("Received empty or null redirect url", iM2953b);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo2939d();
                    return m2954e(url3, i + 1, url, map);
                } catch (MalformedURLException e4) {
                    throw new bqg("Bad redirect url: ".concat(String.valueOf(headerField)), iM2953b, e4);
                }
            } catch (IOException e5) {
                throw new bqg("Failed to connect or obtain data", m2953b(this.f4223c), e5);
            }
        } catch (IOException e6) {
            throw new bqg("URL.openConnection threw", 0, e6);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return InputStream.class;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
        this.f4225e = true;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        InputStream inputStream = this.f4224d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4223c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4223c = null;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        SystemClock.elapsedRealtimeNanos();
        try {
            bvc bvcVar = this.f4221a;
            if (bvcVar.f4523f == null) {
                if (TextUtils.isEmpty(bvcVar.f4522e)) {
                    String string = bvcVar.f4521d;
                    if (TextUtils.isEmpty(string)) {
                        URL url = bvcVar.f4520c;
                        bzq.m3278r(url);
                        string = url.toString();
                    }
                    bvcVar.f4522e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                }
                bvcVar.f4523f = new URL(bvcVar.f4522e);
            }
            URL url2 = bvcVar.f4523f;
            bvd bvdVar = this.f4221a.f4519b;
            if (((bvg) bvdVar).f4531c == null) {
                synchronized (bvdVar) {
                    if (((bvg) bvdVar).f4531c == null) {
                        HashMap map = new HashMap();
                        for (Map.Entry entry : ((bvg) bvdVar).f4530b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str = ((bvf) list.get(i)).f4529a;
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append(str);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            if (!TextUtils.isEmpty(string2)) {
                                map.put((String) entry.getKey(), string2);
                            }
                        }
                        ((bvg) bvdVar).f4531c = Collections.unmodifiableMap(map);
                    }
                }
            }
            bqzVar.mo2945b(m2954e(url2, 0, null, ((bvg) bvdVar).f4531c));
        } catch (IOException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 2;
    }
}
