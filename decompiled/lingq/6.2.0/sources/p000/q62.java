package p000;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class q62 extends v80 {

    /* JADX INFO: renamed from: H */
    public int f57307H;

    /* JADX INFO: renamed from: I */
    public long f57308I;

    /* JADX INFO: renamed from: J */
    public long f57309J;

    /* JADX INFO: renamed from: e */
    public final int f57310e;

    /* JADX INFO: renamed from: f */
    public final int f57311f;

    /* JADX INFO: renamed from: g */
    public final bl2 f57312g;

    /* JADX INFO: renamed from: h */
    public final bl2 f57313h;

    /* JADX INFO: renamed from: i */
    public k02 f57314i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f57315j;

    /* JADX INFO: renamed from: k */
    public InputStream f57316k;

    /* JADX INFO: renamed from: l */
    public boolean f57317l;

    public q62(int i, int i2, bl2 bl2Var) {
        super(true);
        this.f57310e = i;
        this.f57311f = i2;
        this.f57312g = bl2Var;
        this.f57313h = new bl2(14);
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: b */
    public final long mo10000b(k02 k02Var) throws HttpDataSource$HttpDataSourceException {
        boolean z;
        long j;
        long jMax;
        String str;
        this.f57314i = k02Var;
        this.f57309J = 0L;
        this.f57308I = 0L;
        m23166n();
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            HttpURLConnection httpURLConnectionM19679s = m19679s(new URL(k02Var.f46462a.toString()), k02Var.f46463b, k02Var.f46464c, k02Var.f46466e, k02Var.f46467f, k02Var.m14757a(1), true, k02Var.f46465d);
            long j2 = k02Var.f46467f;
            long j3 = k02Var.f46466e;
            this.f57315j = httpURLConnectionM19679s;
            this.f57307H = httpURLConnectionM19679s.getResponseCode();
            httpURLConnectionM19679s.getResponseMessage();
            int i = this.f57307H;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM19679s.getHeaderFields();
                if (this.f57307H == 416) {
                    String headerField = httpURLConnectionM19679s.getHeaderField("Content-Range");
                    Pattern pattern = fx3.f39849a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = fx3.f39850b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j3 == j) {
                        this.f57317l = z;
                        m23167q(k02Var);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM19679s.getErrorStream();
                try {
                    if (errorStream != null) {
                        uk0.m22763b(errorStream);
                    } else {
                        String str2 = uma.f64080a;
                    }
                } catch (IOException unused) {
                    String str3 = uma.f64080a;
                }
                m19678r();
                throw new HttpDataSource$InvalidResponseCodeException(this.f57307H, this.f57307H == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionM19679s.getContentType();
            if (this.f57307H != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM19679s.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.f57308I = j2;
            } else {
                String headerField2 = httpURLConnectionM19679s.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM19679s.getHeaderField("Content-Range");
                Pattern pattern2 = fx3.f39849a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        ss5.m21723u("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = fx3.f39849a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            str = "]";
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                try {
                                    ss5.m21707d0("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + str);
                                    jMax = Math.max(jMax, j5);
                                } catch (NumberFormatException unused3) {
                                    ss5.m21723u("HttpUtil", "Unexpected Content-Range [" + headerField3 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.f57308I = jMax != -1 ? jMax - j3 : -1L;
            }
            try {
                this.f57316k = httpURLConnectionM19679s.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f57316k = new GZIPInputStream(this.f57316k);
                }
                this.f57317l = true;
                m23167q(k02Var);
                try {
                    m19680t(j3);
                    return this.f57308I;
                } catch (IOException e) {
                    m19678r();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
                }
            } catch (IOException e2) {
                m19678r();
                throw new HttpDataSource$HttpDataSourceException(e2, 2000, 1);
            }
        } catch (IOException e3) {
            m19678r();
            throw HttpDataSource$HttpDataSourceException.m2525a(e3, 1);
        }
    }

    @Override // p000.j02
    public final void close() {
        try {
            InputStream inputStream = this.f57316k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = uma.f64080a;
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);
                }
            }
            this.f57316k = null;
            m19678r();
            if (this.f57317l) {
                this.f57317l = false;
                m23165m();
            }
            this.f57315j = null;
            this.f57314i = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.f57316k = null;
            m19678r();
            if (this.f57317l) {
                this.f57317l = false;
                m23165m();
            }
            this.f57315j = null;
            this.f57314i = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // p000.j02
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f57315j;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k02 k02Var = this.f57314i;
        if (k02Var != null) {
            return k02Var.f46462a;
        }
        return null;
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: h */
    public final Map mo10001h() {
        HttpURLConnection httpURLConnection = this.f57315j;
        return httpURLConnection == null ? ImmutableMap.m6298f() : new p62(httpURLConnection.getHeaderFields());
    }

    /* JADX INFO: renamed from: r */
    public final void m19678r() {
        HttpURLConnection httpURLConnection = this.f57315j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ss5.m21724v("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p000.h02
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f57308I;
            if (j != -1) {
                long j2 = j - this.f57309J;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.f57316k;
                    String str = uma.f64080a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.f57309J += (long) i3;
                        m23164j(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.f57316k;
                String str2 = uma.f64080a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.f57309J += (long) i3;
                    m23164j(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = uma.f64080a;
            throw HttpDataSource$HttpDataSourceException.m2525a(e, 2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final HttpURLConnection m19679s(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f57310e);
        httpURLConnection.setReadTimeout(this.f57311f);
        HashMap map2 = new HashMap();
        bl2 bl2Var = this.f57312g;
        if (bl2Var != null) {
            map2.putAll(bl2Var.m3832M());
        }
        map2.putAll(this.f57313h.m3832M());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = fx3.f39849a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbM22996s = ux5.m22996s(j, "bytes=", "-");
            if (j2 != -1) {
                sbM22996s.append((j + j2) - 1);
            }
            string = sbM22996s.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = k02.f46461h;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                uk9.m22770c();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: t */
    public final void m19680t(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.f57316k;
            String str = uma.f64080a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= (long) i;
            m23164j(i);
        }
    }
}
