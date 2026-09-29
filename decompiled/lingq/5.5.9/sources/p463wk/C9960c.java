package p463wk;

import android.net.Uri;
import com.tonyodev.fetch2core.Downloader;
import com.tonyodev.fetch2core.MutableExtras;
import com.tonyodev.fetch2core.server.FileRequest;
import com.tonyodev.fetch2core.server.FileResponse;
import dm.C5207g;
import gl.C5818a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.text.C7076b;
import mo.C7660h;
import org.json.JSONObject;
import p122fl.C5579b;
import p122fl.InterfaceC5582e;
import p122fl.InterfaceC5586i;
import p260m8.C7499b;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: renamed from: wk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9960c implements InterfaceC5582e {

    /* JADX INFO: renamed from: a */
    public final Map<Downloader.C4979a, C5818a> f50679a;

    /* JADX INFO: renamed from: b */
    public final Downloader.FileDownloaderType f50680b;

    public C9960c() {
        Downloader.FileDownloaderType fileDownloaderType = Downloader.FileDownloaderType.SEQUENTIAL;
        C5207g.m11112g(fileDownloaderType, "fileDownloaderType");
        this.f50680b = fileDownloaderType;
        Map<Downloader.C4979a, C5818a> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        C5207g.m11107b(mapSynchronizedMap, "Collections.synchronized…leResourceTransporter>())");
        this.f50679a = mapSynchronizedMap;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: D0 */
    public final void mo10672D0(Downloader.C4980b c4980b) {
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: K */
    public final boolean mo10673K(Downloader.C4980b c4980b, String str) {
        String strM11818j;
        C5207g.m11112g(c4980b, "request");
        C5207g.m11112g(str, "hash");
        if ((str.length() == 0) || (strM11818j = C5579b.m11818j(c4980b.f32533d)) == null) {
            return true;
        }
        return strM11818j.contentEquals(str);
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: Y0 */
    public final Set<Downloader.FileDownloaderType> mo10674Y0(Downloader.C4980b c4980b) {
        try {
            return C5579b.m11824p(c4980b, this);
        } catch (Exception unused) {
            return C7499b.m14946j0(this.f50680b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map<Downloader.C4979a, C5818a> map = this.f50679a;
        try {
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((C5818a) ((Map.Entry) it.next()).getValue()).m12224a();
            }
            map.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02ab  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p */
    public final Downloader.C4979a mo10675p(Downloader.C4980b c4980b, InterfaceC5586i interfaceC5586i) throws Throwable {
        long j10;
        String str;
        boolean z10;
        Integer numM15246L2;
        Integer numM15246L3;
        C5207g.m11112g(interfaceC5586i, "interruptMonitor");
        C5818a c5818a = new C5818a(0);
        System.nanoTime();
        Map<String, String> map = c4980b.f32532c;
        String str2 = map.get("Range");
        if (str2 == null) {
            str2 = "bytes=0-";
        }
        int iM14288h3 = C7076b.m14288h3(str2, "=", 6);
        int iM14288h4 = C7076b.m14288h3(str2, "-", 6);
        String strSubstring = str2.substring(iM14288h3 + 1, iM14288h4);
        C5207g.m11107b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        long j11 = Long.parseLong(strSubstring);
        try {
            String strSubstring2 = str2.substring(iM14288h4 + 1, str2.length());
            C5207g.m11107b(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            j10 = Long.parseLong(strSubstring2);
        } catch (Exception unused) {
            j10 = -1;
        }
        Pair pair = new Pair(Long.valueOf(j11), Long.valueOf(j10));
        String str3 = map.get("Authorization");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        String str5 = c4980b.f32531b;
        int iM11816h = C5579b.m11816h(str5);
        String strM11815g = C5579b.m11815g(str5);
        MutableExtras mutableExtras = new MutableExtras(C6753d.m13467T0(c4980b.f32538i.f32541a));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C5207g.m11112g(key, "key");
            C5207g.m11112g(value, "value");
            mutableExtras.f32543c.put(key, value);
        }
        InterfaceC5582e.a aVar = new InterfaceC5582e.a();
        aVar.f34390a = new InetSocketAddress(strM11815g, iM11816h);
        Uri uri = Uri.parse(str5);
        C5207g.m11107b(uri, "Uri.parse(url)");
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "-1";
        }
        String str6 = lastPathSegment;
        long jLongValue = ((Number) pair.f38012a).longValue();
        long jLongValue2 = ((Number) pair.f38013b).longValue();
        String string = map.get("Client");
        if (string == null) {
            string = UUID.randomUUID().toString();
            C5207g.m11107b(string, "UUID.randomUUID().toString()");
        }
        String str7 = string;
        String str8 = map.get("Page");
        int iIntValue = (str8 == null || (numM15246L3 = C7660h.m15246L2(str8)) == null) ? 0 : numM15246L3.intValue();
        String str9 = map.get("Size");
        aVar.f34391b = new FileRequest(1, str6, jLongValue, jLongValue2, str4, str7, mutableExtras, iIntValue, (str9 == null || (numM15246L2 = C7660h.m15246L2(str9)) == null) ? 0 : numM15246L2.intValue(), false);
        InetSocketAddress inetSocketAddress = aVar.f34390a;
        C5207g.m11112g(inetSocketAddress, "socketAddress");
        synchronized (c5818a.f35125c) {
            c5818a.m12225b();
            c5818a.f35127e.connect(inetSocketAddress);
            c5818a.f35123a = new DataInputStream(c5818a.f35127e.getInputStream());
            c5818a.f35124b = new DataOutputStream(c5818a.f35127e.getOutputStream());
            C9072e c9072e = C9072e.f47360a;
        }
        FileRequest fileRequest = aVar.f34391b;
        C5207g.m11112g(fileRequest, "fileRequest");
        synchronized (c5818a.f35125c) {
            try {
                c5818a.m12225b();
                c5818a.m12226c();
                DataOutputStream dataOutputStream = c5818a.f35124b;
                try {
                    if (dataOutputStream == null) {
                        C5207g.m11117l("dataOutput");
                        throw null;
                    }
                    dataOutputStream.writeUTF(fileRequest.m10688a());
                    DataOutputStream dataOutputStream2 = c5818a.f35124b;
                    if (dataOutputStream2 == null) {
                        C5207g.m11117l("dataOutput");
                        throw null;
                    }
                    dataOutputStream2.flush();
                    if (interfaceC5586i.mo431i()) {
                        return null;
                    }
                    synchronized (c5818a.f35125c) {
                        try {
                            c5818a.m12225b();
                            c5818a.m12226c();
                            DataInputStream dataInputStream = c5818a.f35123a;
                            if (dataInputStream != null) {
                                String utf = dataInputStream.readUTF();
                                C5207g.m11107b(utf, "dataInput.readUTF()");
                                String lowerCase = utf.toLowerCase();
                                C5207g.m11107b(lowerCase, "(this as java.lang.String).toLowerCase()");
                                JSONObject jSONObject = new JSONObject(lowerCase);
                                int i10 = jSONObject.getInt("status");
                                int i11 = jSONObject.getInt("type");
                                int i12 = jSONObject.getInt("connection");
                                long j12 = jSONObject.getLong("date");
                                long j13 = jSONObject.getLong("content-length");
                                String string2 = jSONObject.getString("md5");
                                String string3 = jSONObject.getString("sessionid");
                                C5207g.m11107b(string2, "md5");
                                C5207g.m11107b(string3, "sessionId");
                                FileResponse fileResponse = new FileResponse(i10, i11, i12, j12, j13, string2, string3);
                                int i13 = fileResponse.f32559a;
                                boolean z11 = fileResponse.f32561c == 1 && fileResponse.f32560b == 1 && i13 == 206;
                                long j14 = fileResponse.f32563e;
                                synchronized (c5818a.f35125c) {
                                    try {
                                        c5818a.m12225b();
                                        c5818a.m12226c();
                                        DataInputStream dataInputStream2 = c5818a.f35123a;
                                        if (dataInputStream2 == null) {
                                            try {
                                                C5207g.m11117l("dataInput");
                                                throw null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                        }
                                        String strM11812d = !z11 ? C5579b.m11812d(dataInputStream2) : null;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        try {
                                            JSONObject jSONObject2 = new JSONObject(fileResponse.m10689a());
                                            Iterator<String> itKeys = jSONObject2.keys();
                                            C5207g.m11107b(itKeys, "json.keys()");
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                C5207g.m11107b(next, "it");
                                                linkedHashMap.put(next, C9000b.m17251q(jSONObject2.get(next).toString()));
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        if (!linkedHashMap.containsKey("Content-MD5")) {
                                            linkedHashMap.put("Content-MD5", C9000b.m17251q(fileResponse.f32564f));
                                        }
                                        List list = (List) linkedHashMap.get("Content-MD5");
                                        if (list == null || (str = (String) C6752c.m13425S(list)) == null) {
                                            str = "";
                                        }
                                        String str10 = str;
                                        if (i13 == 206) {
                                            z10 = true;
                                        } else {
                                            List list2 = (List) linkedHashMap.get("Accept-Ranges");
                                            if (C5207g.m11106a(list2 != null ? (String) C6752c.m13425S(list2) : null, "bytes")) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        Downloader.C4979a c4979a = new Downloader.C4979a(i13, z11, j14, dataInputStream2, c4980b, str10, linkedHashMap, z10, strM11812d);
                                        this.f50679a.put(c4979a, c5818a);
                                        return c4979a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } else {
                                try {
                                    C5207g.m11117l("dataInput");
                                    throw null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
            throw th;
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p0 */
    public final void mo10676p0(Downloader.C4979a c4979a) {
        Map<Downloader.C4979a, C5818a> map = this.f50679a;
        if (map.containsKey(c4979a)) {
            C5818a c5818a = map.get(c4979a);
            map.remove(c4979a);
            if (c5818a != null) {
                c5818a.m12224a();
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
        return this.f50680b;
    }
}
