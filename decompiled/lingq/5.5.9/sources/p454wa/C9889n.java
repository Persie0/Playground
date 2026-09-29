package p454wa;

import android.net.Uri;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.AbstractC3192k;
import com.google.common.collect.C3183d0;
import com.google.common.collect.C3184e;
import com.google.common.collect.C3198q;
import com.google.common.collect.ImmutableMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p021b0.C1281f;
import p479xa.C10134c0;
import p479xa.C10145n;
import p482xd.InterfaceC10173e;

/* JADX INFO: renamed from: wa.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9889n extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public final boolean f50491e;

    /* JADX INFO: renamed from: f */
    public final int f50492f;

    /* JADX INFO: renamed from: g */
    public final int f50493g;

    /* JADX INFO: renamed from: h */
    public final String f50494h;

    /* JADX INFO: renamed from: i */
    public final C1281f f50495i;

    /* JADX INFO: renamed from: j */
    public final C1281f f50496j;

    /* JADX INFO: renamed from: k */
    public final boolean f50497k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC10173e<String> f50498l;

    /* JADX INFO: renamed from: m */
    public HttpURLConnection f50499m;

    /* JADX INFO: renamed from: n */
    public InputStream f50500n;

    /* JADX INFO: renamed from: o */
    public boolean f50501o;

    /* JADX INFO: renamed from: p */
    public int f50502p;

    /* JADX INFO: renamed from: q */
    public long f50503q;

    /* JADX INFO: renamed from: r */
    public long f50504r;

    /* JADX INFO: renamed from: wa.n$a */
    public static final class a implements InterfaceC9882g.a {

        /* JADX INFO: renamed from: b */
        public InterfaceC9894s f50506b;

        /* JADX INFO: renamed from: c */
        public String f50507c;

        /* JADX INFO: renamed from: a */
        public final C1281f f50505a = new C1281f(1);

        /* JADX INFO: renamed from: d */
        public final int f50508d = 8000;

        /* JADX INFO: renamed from: e */
        public final int f50509e = 8000;

        @Override // p454wa.InterfaceC9882g.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC9882g mo14771a() {
            C9889n c9889n = new C9889n(this.f50507c, this.f50508d, this.f50509e, this.f50505a);
            InterfaceC9894s interfaceC9894s = this.f50506b;
            if (interfaceC9894s != null) {
                c9889n.mo7274g(interfaceC9894s);
            }
            return c9889n;
        }
    }

    /* JADX INFO: renamed from: wa.n$b */
    public static class b extends AbstractC3192k<String, List<String>> {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<String>> f50510a;

        public b(Map<String, List<String>> map) {
            this.f50510a = map;
        }

        @Override // com.google.common.collect.AbstractC3193l
        /* JADX INFO: renamed from: a */
        public final Object mo9087a() {
            return this.f50510a;
        }

        @Override // com.google.common.collect.AbstractC3192k
        /* JADX INFO: renamed from: b */
        public final Map<String, List<String>> mo9088b() {
            return this.f50510a;
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final boolean containsValue(Object obj) {
            C3198q c3198q = new C3198q(((C3184e) entrySet()).iterator());
            if (obj == null) {
                while (c3198q.hasNext()) {
                    if (c3198q.next() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (c3198q.hasNext()) {
                if (obj.equals(c3198q.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return C3183d0.m9126b(super.entrySet(), new InterfaceC10173e() { // from class: va.q
                @Override // p482xd.InterfaceC10173e
                public final boolean apply(Object obj) {
                    return ((Map.Entry) obj).getKey() != null;
                }
            });
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final boolean equals(Object obj) {
            boolean zEquals;
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                zEquals = true;
            } else if (obj instanceof Map) {
                zEquals = ((C3183d0.a) entrySet()).equals(((Map) obj).entrySet());
            } else {
                zEquals = false;
            }
            return zEquals;
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final int hashCode() {
            return C3183d0.m9127c(entrySet());
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final Set<String> keySet() {
            return C3183d0.m9126b(super.keySet(), new InterfaceC10173e() { // from class: wa.o
                @Override // p482xd.InterfaceC10173e
                public final boolean apply(Object obj) {
                    return ((String) obj) != null;
                }
            });
        }

        @Override // com.google.common.collect.AbstractC3192k, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public C9889n(String str, int i10, int i11, C1281f c1281f) {
        super(true);
        this.f50494h = str;
        this.f50492f = i10;
        this.f50493g = i11;
        this.f50491e = false;
        this.f50495i = c1281f;
        this.f50498l = null;
        this.f50496j = new C1281f(1);
        this.f50497k = false;
    }

    /* JADX INFO: renamed from: v */
    public static void m18392v(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = C10134c0.f51354a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                return;
            }
            Class<? super Object> superclass = inputStream.getClass().getSuperclass();
            superclass.getClass();
            Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(inputStream, new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f50500n;
            if (inputStream != null) {
                long j10 = this.f50503q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f50504r;
                }
                m18392v(this.f50499m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = C10134c0.f51354a;
                    throw new HttpDataSource$HttpDataSourceException(e10, 2000, 3);
                }
            }
            this.f50500n = null;
            m18393r();
            if (this.f50501o) {
                this.f50501o = false;
                m18377o();
            }
        } catch (Throwable th2) {
            this.f50500n = null;
            m18393r();
            if (this.f50501o) {
                this.f50501o = false;
                m18377o();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws HttpDataSource$HttpDataSourceException {
        boolean z10;
        long j10;
        C9889n c9889n;
        HttpURLConnection httpURLConnection;
        long j11;
        long j12;
        long jMax;
        this.f50504r = 0L;
        this.f50503q = 0L;
        m18378p(c9884i);
        try {
            HttpURLConnection httpURLConnectionM18396u = m18396u(c9884i);
            this.f50499m = httpURLConnectionM18396u;
            this.f50502p = httpURLConnectionM18396u.getResponseCode();
            httpURLConnectionM18396u.getResponseMessage();
            int i10 = this.f50502p;
            long j13 = c9884i.f50441f;
            long j14 = c9884i.f50442g;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM18396u.getHeaderFields();
                if (this.f50502p == 416) {
                    String headerField = httpURLConnectionM18396u.getHeaderField("Content-Range");
                    Pattern pattern = C9891p.f50511a;
                    if (TextUtils.isEmpty(headerField)) {
                        z10 = true;
                        j10 = -1;
                    } else {
                        Matcher matcher = C9891p.f50512b.matcher(headerField);
                        if (matcher.matches()) {
                            z10 = true;
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j10 = Long.parseLong(strGroup);
                        } else {
                            z10 = true;
                            j10 = -1;
                        }
                    }
                    if (j13 == j10) {
                        this.f50501o = z10;
                        m18379q(c9884i);
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM18396u.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i11 = C10134c0.f51354a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i12 = errorStream.read(bArr);
                            if (i12 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i12);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i13 = C10134c0.f51354a;
                    }
                } catch (IOException unused) {
                    int i14 = C10134c0.f51354a;
                }
                m18393r();
                throw new HttpDataSource$InvalidResponseCodeException(this.f50502p, this.f50502p == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            final String contentType = httpURLConnectionM18396u.getContentType();
            InterfaceC10173e<String> interfaceC10173e = this.f50498l;
            if (interfaceC10173e != null && !interfaceC10173e.apply(contentType)) {
                m18393r();
                throw new HttpDataSource$HttpDataSourceException(contentType) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                    {
                        super(C0204c.m852k("Invalid content type: ", contentType), 2003);
                    }
                };
            }
            if (this.f50502p != 200 || j13 == 0) {
                j13 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM18396u.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                c9889n = this;
                httpURLConnection = httpURLConnectionM18396u;
                c9889n.f50503q = j14;
            } else if (j14 != -1) {
                this.f50503q = j14;
                c9889n = this;
                httpURLConnection = httpURLConnectionM18396u;
            } else {
                String headerField2 = httpURLConnectionM18396u.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM18396u.getHeaderField("Content-Range");
                Pattern pattern2 = C9891p.f50511a;
                if (TextUtils.isEmpty(headerField2)) {
                    j11 = -1;
                } else {
                    try {
                        j11 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        C10145n.m19095c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                        j11 = -1;
                    }
                }
                long j15 = j11;
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection = httpURLConnectionM18396u;
                    j12 = j15;
                    jMax = j12;
                } else {
                    Matcher matcher2 = C9891p.f50511a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j16 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection = httpURLConnectionM18396u;
                            long j17 = (j16 - Long.parseLong(strGroup3)) + 1;
                            j12 = j15;
                            if (j12 < 0) {
                                jMax = j17;
                            } else if (j12 != j17) {
                                try {
                                    C10145n.m19099g("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(j12, j17);
                                } catch (NumberFormatException unused3) {
                                    C10145n.m19095c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                    jMax = j12;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection = httpURLConnectionM18396u;
                            j12 = j15;
                        }
                    } else {
                        httpURLConnection = httpURLConnectionM18396u;
                        j12 = j15;
                    }
                    jMax = j12;
                }
                c9889n = this;
                c9889n.f50503q = jMax != -1 ? jMax - j13 : -1L;
            }
            try {
                c9889n.f50500n = httpURLConnection.getInputStream();
                if (zEqualsIgnoreCase) {
                    c9889n.f50500n = new GZIPInputStream(c9889n.f50500n);
                }
                c9889n.f50501o = true;
                m18379q(c9884i);
                try {
                    c9889n.m18397w(j13);
                    return c9889n.f50503q;
                } catch (IOException e10) {
                    m18393r();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, 2000, 1);
                }
            } catch (IOException e11) {
                m18393r();
                throw new HttpDataSource$HttpDataSourceException(e11, 2000, 1);
            }
        } catch (IOException e12) {
            m18393r();
            throw HttpDataSource$HttpDataSourceException.m7465a(e12, 1);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> mo7275h() {
        HttpURLConnection httpURLConnection = this.f50499m;
        return httpURLConnection == null ? ImmutableMap.m9070h() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        HttpURLConnection httpURLConnection = this.f50499m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX INFO: renamed from: r */
    public final void m18393r() {
        HttpURLConnection httpURLConnection = this.f50499m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                C10145n.m19096d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f50499m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: IOException -> 0x0045, TRY_LEAVE, TryCatch #0 {IOException -> 0x0045, blocks: (B:6:0x0007, B:8:0x0015, B:11:0x0023, B:12:0x002a, B:16:0x0038), top: B:22:0x0007 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f50503q;
            if (j10 != -1) {
                long j11 = j10 - this.f50504r;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                    InputStream inputStream = this.f50500n;
                    int i13 = C10134c0.f51354a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.f50504r += (long) i12;
                        m18376n(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.f50500n;
                int i14 = C10134c0.f51354a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.f50504r += (long) i12;
                    m18376n(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            int i15 = C10134c0.f51354a;
            throw HttpDataSource$HttpDataSourceException.m7465a(e10, 2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: s */
    public final URL m18394s(URL url, String str) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(C0204c.m852k("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (!this.f50491e && !protocol.equals(url.getProtocol())) {
                throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
            }
            return url2;
        } catch (MalformedURLException e10) {
            throw new HttpDataSource$HttpDataSourceException(e10, 2001, 1);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final HttpURLConnection m18395t(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        Map map2;
        String string;
        String str;
        Map map3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f50492f);
        httpURLConnection.setReadTimeout(this.f50493g);
        HashMap map4 = new HashMap();
        C1281f c1281f = this.f50495i;
        if (c1281f != null) {
            synchronized (c1281f) {
                try {
                    if (c1281f.f7968b == null) {
                        c1281f.f7968b = Collections.unmodifiableMap(new HashMap(c1281f.f7967a));
                    }
                    map3 = c1281f.f7968b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map4.putAll(map3);
        }
        C1281f c1281f2 = this.f50496j;
        synchronized (c1281f2) {
            try {
                if (c1281f2.f7968b == null) {
                    c1281f2.f7968b = Collections.unmodifiableMap(new HashMap(c1281f2.f7967a));
                }
                map2 = c1281f2.f7968b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        map4.putAll(map2);
        map4.putAll(map);
        for (Map.Entry entry : map4.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = C9891p.f50511a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f50494h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = C9884i.f50435k;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: u */
    public final HttpURLConnection m18396u(C9884i c9884i) throws IOException {
        C9884i c9884i2 = c9884i;
        URL url = new URL(c9884i2.f50436a.toString());
        int i10 = c9884i2.f50438c;
        byte[] bArr = c9884i2.f50439d;
        long j10 = c9884i2.f50441f;
        long j11 = c9884i2.f50442g;
        boolean z10 = (c9884i2.f50444i & 1) == 1;
        boolean z11 = this.f50491e;
        boolean z12 = this.f50497k;
        if (!z11 && !z12) {
            return m18395t(url, i10, bArr, j10, j11, z10, true, c9884i2.f50440e);
        }
        URL urlM18394s = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(C0166e.m761g("Too many redirects: ", i13)), 2001, 1);
            }
            Map<String, String> map = c9884i2.f50440e;
            URL url2 = urlM18394s;
            int i14 = i11;
            boolean z13 = z12;
            long j12 = j11;
            HttpURLConnection httpURLConnectionM18395t = m18395t(urlM18394s, i11, bArr2, j10, j11, z10, false, map);
            int responseCode = httpURLConnectionM18395t.getResponseCode();
            String headerField = httpURLConnectionM18395t.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM18395t.disconnect();
                urlM18394s = m18394s(url2, headerField);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM18395t;
                }
                httpURLConnectionM18395t.disconnect();
                if (z13 && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlM18394s = m18394s(url2, headerField);
            }
            c9884i2 = c9884i;
            i12 = i13;
            z12 = z13;
            j11 = j12;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final void m18397w(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f50500n;
            int i10 = C10134c0.f51354a;
            int i11 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j10 -= (long) i11;
            m18376n(i11);
        }
    }
}
