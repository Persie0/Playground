package p463wk;

import com.kochava.core.BuildConfig;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.EmptyList;
import p122fl.C5579b;
import p122fl.InterfaceC5586i;
import p260m8.C7499b;

/* JADX INFO: renamed from: wk.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9965h implements Downloader<HttpURLConnection, Void> {

    /* JADX INFO: renamed from: a */
    public final a f50681a;

    /* JADX INFO: renamed from: b */
    public final Map<Downloader.C4979a, HttpURLConnection> f50682b;

    /* JADX INFO: renamed from: c */
    public final CookieManager f50683c;

    /* JADX INFO: renamed from: d */
    public final Downloader.FileDownloaderType f50684d;

    /* JADX INFO: renamed from: wk.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f50685a = BuildConfig.SDK_DEFAULT_NETWORK_TIMEOUT_MILLIS;

        /* JADX INFO: renamed from: b */
        public final int f50686b = 15000;

        /* JADX INFO: renamed from: c */
        public final boolean f50687c = true;
    }

    public C9965h() {
        Downloader.FileDownloaderType fileDownloaderType = Downloader.FileDownloaderType.SEQUENTIAL;
        C5207g.m11112g(fileDownloaderType, "fileDownloaderType");
        this.f50684d = fileDownloaderType;
        this.f50681a = new a();
        Map<Downloader.C4979a, HttpURLConnection> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        C5207g.m11107b(mapSynchronizedMap, "Collections.synchronized…se, HttpURLConnection>())");
        this.f50682b = mapSynchronizedMap;
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        this.f50683c = cookieManager;
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap m18547a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                Collection collection = (List) entry.getValue();
                if (collection == null) {
                    collection = EmptyList.f38032a;
                }
                linkedHashMap.put(str, collection);
            }
        }
        return linkedHashMap;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: D0 */
    public final void mo10672D0(Downloader.C4980b c4980b) {
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: K */
    public final boolean mo10673K(Downloader.C4980b c4980b, String str) {
        C5207g.m11112g(c4980b, "request");
        C5207g.m11112g(str, "hash");
        if (str.length() == 0) {
            return true;
        }
        String strM11818j = C5579b.m11818j(c4980b.f32533d);
        return strM11818j != null ? strM11818j.contentEquals(str) : true;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: Y0 */
    public final Set<Downloader.FileDownloaderType> mo10674Y0(Downloader.C4980b c4980b) {
        Downloader.FileDownloaderType fileDownloaderType = Downloader.FileDownloaderType.SEQUENTIAL;
        Downloader.FileDownloaderType fileDownloaderType2 = this.f50684d;
        if (fileDownloaderType2 == fileDownloaderType) {
            return C7499b.m14946j0(fileDownloaderType2);
        }
        try {
            return C5579b.m11824p(c4980b, this);
        } catch (Exception unused) {
            return C7499b.m14946j0(fileDownloaderType2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18548b(HttpURLConnection httpURLConnection, Downloader.C4980b c4980b) throws ProtocolException {
        httpURLConnection.setRequestMethod(c4980b.f32537h);
        a aVar = this.f50681a;
        httpURLConnection.setReadTimeout(aVar.f50685a);
        httpURLConnection.setConnectTimeout(aVar.f50686b);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(aVar.f50687c);
        httpURLConnection.setDoInput(true);
        Iterator<T> it = c4980b.f32532c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map<Downloader.C4979a, HttpURLConnection> map = this.f50682b;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    map.clear();
                    return;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((Map.Entry) it.next()).getValue();
                if (httpURLConnection == null) {
                    break;
                } else {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p */
    public final Downloader.C4979a mo10675p(Downloader.C4980b c4980b, InterfaceC5586i interfaceC5586i) throws IOException {
        HttpURLConnection httpURLConnection;
        LinkedHashMap linkedHashMapM18547a;
        int responseCode;
        long jM11814f;
        String strM11812d;
        InputStream inputStream;
        C5207g.m11112g(interfaceC5586i, "interruptMonitor");
        CookieHandler.setDefault(this.f50683c);
        String str = c4980b.f32531b;
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
        m18548b(httpURLConnection2, c4980b);
        if (httpURLConnection2.getRequestProperty("Referer") == null) {
            httpURLConnection2.addRequestProperty("Referer", C5579b.m11823o(str));
        }
        httpURLConnection2.connect();
        Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
        C5207g.m11107b(headerFields, "client.headerFields");
        LinkedHashMap linkedHashMapM18547a2 = m18547a(headerFields);
        int responseCode2 = httpURLConnection2.getResponseCode();
        String str2 = "";
        if ((responseCode2 == 302 || responseCode2 == 301 || responseCode2 == 303) && C5579b.m11821m(linkedHashMapM18547a2, "Location") != null) {
            try {
                httpURLConnection2.disconnect();
            } catch (Exception unused) {
            }
            String strM11821m = C5579b.m11821m(linkedHashMapM18547a2, "Location");
            if (strM11821m == null) {
                strM11821m = "";
            }
            URLConnection uRLConnectionOpenConnection2 = new URL(strM11821m).openConnection();
            if (uRLConnectionOpenConnection2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) uRLConnectionOpenConnection2;
            m18548b(httpURLConnection3, c4980b);
            if (httpURLConnection3.getRequestProperty("Referer") == null) {
                httpURLConnection3.addRequestProperty("Referer", C5579b.m11823o(str));
            }
            httpURLConnection3.connect();
            Map<String, List<String>> headerFields2 = httpURLConnection3.getHeaderFields();
            C5207g.m11107b(headerFields2, "client.headerFields");
            httpURLConnection = httpURLConnection3;
            linkedHashMapM18547a = m18547a(headerFields2);
            responseCode = httpURLConnection3.getResponseCode();
        } else {
            httpURLConnection = httpURLConnection2;
            linkedHashMapM18547a = linkedHashMapM18547a2;
            responseCode = responseCode2;
        }
        boolean z10 = true;
        if (200 <= responseCode && 299 >= responseCode) {
            jM11814f = C5579b.m11814f(linkedHashMapM18547a);
            InputStream inputStream2 = httpURLConnection.getInputStream();
            String strM11821m2 = C5579b.m11821m(linkedHashMapM18547a, "Content-MD5");
            str2 = strM11821m2 != null ? strM11821m2 : "";
            inputStream = inputStream2;
            strM11812d = null;
        } else {
            jM11814f = -1;
            strM11812d = C5579b.m11812d(httpURLConnection.getErrorStream());
            z10 = false;
            inputStream = null;
        }
        long j10 = jM11814f;
        boolean zM11809a = C5579b.m11809a(responseCode, linkedHashMapM18547a);
        C5207g.m11107b(httpURLConnection.getHeaderFields(), "client.headerFields");
        Downloader.C4979a c4979a = new Downloader.C4979a(responseCode, z10, j10, inputStream, c4980b, str2, linkedHashMapM18547a, zM11809a, strM11812d);
        this.f50682b.put(c4979a, httpURLConnection);
        return c4979a;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p0 */
    public final void mo10676p0(Downloader.C4979a c4979a) {
        Map<Downloader.C4979a, HttpURLConnection> map = this.f50682b;
        if (map.containsKey(c4979a)) {
            HttpURLConnection httpURLConnection = map.get(c4979a);
            map.remove(c4979a);
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: s */
    public final void mo10677s(Downloader.C4980b c4980b) {
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: t0 */
    public final void mo10678t0(Downloader.C4980b c4980b) {
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: u0 */
    public final Downloader.FileDownloaderType mo10679u0(Downloader.C4980b c4980b, Set<? extends Downloader.FileDownloaderType> set) {
        C5207g.m11112g(set, "supportedFileDownloaderTypes");
        return this.f50684d;
    }
}
