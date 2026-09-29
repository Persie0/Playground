package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.C0204c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p258m6.C7483c;
import p258m6.C7488h;
import p474x5.C10082g;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2103j implements InterfaceC2097d<InputStream> {

    /* JADX INFO: renamed from: a */
    public final C10082g f10619a;

    /* JADX INFO: renamed from: b */
    public final int f10620b;

    /* JADX INFO: renamed from: c */
    public HttpURLConnection f10621c;

    /* JADX INFO: renamed from: d */
    public InputStream f10622d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f10623e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.j$a */
    public static class a {
    }

    static {
        new a();
    }

    public C2103j(C10082g c10082g, int i10) {
        this.f10619a = c10082g;
        this.f10620b = i10;
    }

    /* JADX INFO: renamed from: c */
    public static int m6279c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: a */
    public final Class<InputStream> mo6269a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: b */
    public final void mo6272b() {
        InputStream inputStream = this.f10622d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10621c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10621c = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    public final void cancel() {
        this.f10623e = true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: d */
    public final DataSource mo6274d() {
        return DataSource.REMOTE;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: e */
    public final void mo6275e(Priority priority, InterfaceC2097d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        C10082g c10082g = this.f10619a;
        int i10 = C7488h.f41373b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.mo6278f(m6280f(c10082g.m18933d(), 0, null, c10082g.f51156b.mo18934i()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                    sb2.append(C7488h.m14872a(jElapsedRealtimeNanos));
                    Log.v("HttpUrlFetcher", sb2.toString());
                }
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.mo6277c(e10);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                } else {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: f */
    public final InputStream m6280f(URL url, int i10, URL url2, Map<String, String> map) throws HttpException {
        if (i10 >= 5) {
            throw new HttpException(-1, "Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, "In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i11 = this.f10620b;
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f10621c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f10622d = this.f10621c.getInputStream();
                if (this.f10623e) {
                    return null;
                }
                int iM6279c = m6279c(this.f10621c);
                int i12 = iM6279c / 100;
                if (i12 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f10621c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f10622d = new C7483c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f10622d = httpURLConnection2.getInputStream();
                        }
                        return this.f10622d;
                    } catch (IOException e10) {
                        throw new HttpException(m6279c(httpURLConnection2), "Failed to obtain InputStream", e10);
                    }
                }
                if (!(i12 == 3)) {
                    if (iM6279c == -1) {
                        throw new HttpException(iM6279c, "Http request failed", null);
                    }
                    try {
                        throw new HttpException(iM6279c, this.f10621c.getResponseMessage(), null);
                    } catch (IOException e11) {
                        throw new HttpException(iM6279c, "Failed to get a response message", e11);
                    }
                }
                String headerField = this.f10621c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(iM6279c, "Received empty or null redirect url", null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo6272b();
                    return m6280f(url3, i10 + 1, url, map);
                } catch (MalformedURLException e12) {
                    throw new HttpException(iM6279c, C0204c.m852k("Bad redirect url: ", headerField), e12);
                }
            } catch (IOException e13) {
                throw new HttpException(m6279c(this.f10621c), "Failed to connect or obtain data", e13);
            }
        } catch (IOException e14) {
            throw new HttpException(0, "URL.openConnection threw", e14);
        }
    }
}
