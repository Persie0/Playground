package p161hl;

import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.C6753d;
import mo.C7661i;
import p122fl.C5579b;
import p122fl.InterfaceC5586i;
import p260m8.C7499b;
import p467wo.C9990e;
import so.AbstractC9107y;
import so.C9096n;
import so.C9100r;
import so.C9101s;
import so.C9106x;

/* JADX INFO: renamed from: hl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6078a implements Downloader<C9100r, C9101s> {

    /* JADX INFO: renamed from: a */
    public final Map<Downloader.C4979a, C9106x> f35813a;

    /* JADX INFO: renamed from: b */
    public volatile C9100r f35814b;

    /* JADX INFO: renamed from: c */
    public final Downloader.FileDownloaderType f35815c;

    public C6078a(C9100r c9100r) {
        Downloader.FileDownloaderType fileDownloaderType = Downloader.FileDownloaderType.SEQUENTIAL;
        C5207g.m11112g(fileDownloaderType, "fileDownloaderType");
        this.f35815c = fileDownloaderType;
        Map<Downloader.C4979a, C9106x> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        C5207g.m11107b(mapSynchronizedMap, "Collections.synchronized…er.Response, Response>())");
        this.f35813a = mapSynchronizedMap;
        this.f35814b = c9100r;
    }

    /* JADX INFO: renamed from: a */
    public static C9101s m12508a(C9100r c9100r, Downloader.C4980b c4980b) {
        C5207g.m11112g(c9100r, "client");
        C9101s.a aVar = new C9101s.a();
        String strM11116k = c4980b.f32531b;
        C5207g.m11111f(strM11116k, "url");
        if (C7661i.m15256V2(strM11116k, "ws:", true)) {
            String strSubstring = strM11116k.substring(3);
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            strM11116k = C5207g.m11116k(strSubstring, "http:");
        } else if (C7661i.m15256V2(strM11116k, "wss:", true)) {
            String strSubstring2 = strM11116k.substring(4);
            C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            strM11116k = C5207g.m11116k(strSubstring2, "https:");
        }
        C5207g.m11111f(strM11116k, "<this>");
        C9096n.a aVar2 = new C9096n.a();
        aVar2.m17331d(null, strM11116k);
        aVar.f47548a = aVar2.m17328a();
        aVar.m17346d(c4980b.f32537h, null);
        Iterator<T> it = c4980b.f32532c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.m17343a((String) entry.getKey(), (String) entry.getValue());
        }
        return aVar.m17344b();
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
        boolean zContentEquals = true;
        if (str.length() == 0) {
            return true;
        }
        String strM11818j = C5579b.m11818j(c4980b.f32533d);
        if (strM11818j != null) {
            zContentEquals = strM11818j.contentEquals(str);
        }
        return zContentEquals;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: Y0 */
    public final Set<Downloader.FileDownloaderType> mo10674Y0(Downloader.C4980b c4980b) {
        Downloader.FileDownloaderType fileDownloaderType = Downloader.FileDownloaderType.SEQUENTIAL;
        Downloader.FileDownloaderType fileDownloaderType2 = this.f35815c;
        if (fileDownloaderType2 == fileDownloaderType) {
            return C7499b.m14946j0(fileDownloaderType2);
        }
        try {
            return C5579b.m11824p(c4980b, this);
        } catch (Exception unused) {
            return C7499b.m14946j0(fileDownloaderType2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map<Downloader.C4979a, C9106x> map = this.f35813a;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    map.clear();
                    return;
                }
                C9106x c9106x = (C9106x) ((Map.Entry) it.next()).getValue();
                if (c9106x == null) {
                    break;
                } else {
                    try {
                        c9106x.close();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p */
    public final Downloader.C4979a mo10675p(Downloader.C4980b c4980b, InterfaceC5586i interfaceC5586i) {
        C6078a c6078a;
        int i10;
        TreeMap treeMap;
        C9106x c9106x;
        C5207g.m11112g(interfaceC5586i, "interruptMonitor");
        C9101s c9101sM12508a = m12508a(this.f35814b, c4980b);
        if (c9101sM12508a.f47544c.m17305a("Referer") == null) {
            String strM11823o = C5579b.m11823o(c4980b.f32531b);
            C9101s.a aVar = new C9101s.a(c9101sM12508a);
            aVar.m17343a("Referer", strM11823o);
            c9101sM12508a = aVar.m17344b();
        }
        C9100r c9100r = this.f35814b;
        c9100r.getClass();
        C9106x c9106xM18572e = new C9990e(c9100r, c9101sM12508a, false).m18572e();
        TreeMap treeMapM17308i = c9106xM18572e.f47568f.m17308i();
        int i11 = c9106xM18572e.f47566d;
        if ((i11 == 302 || i11 == 301 || i11 == 303) && C5579b.m11821m(treeMapM17308i, "Location") != null) {
            C9100r c9100r2 = this.f35814b;
            String strM11821m = C5579b.m11821m(treeMapM17308i, "Location");
            C9101s c9101sM12508a2 = m12508a(c9100r2, new Downloader.C4980b(c4980b.f32530a, c4980b.f32531b, c4980b.f32532c, c4980b.f32533d, c4980b.f32534e, c4980b.f32535f, c4980b.f32536g, c4980b.f32537h, c4980b.f32538i, strM11821m != null ? strM11821m : "", c4980b.f32539j));
            if (c9101sM12508a2.f47544c.m17305a("Referer") == null) {
                String strM11823o2 = C5579b.m11823o(c4980b.f32531b);
                C9101s.a aVar2 = new C9101s.a(c9101sM12508a2);
                aVar2.m17343a("Referer", strM11823o2);
                c9101sM12508a2 = aVar2.m17344b();
            }
            try {
                c9106xM18572e.close();
            } catch (Exception unused) {
            }
            c6078a = this;
            C9100r c9100r3 = c6078a.f35814b;
            c9100r3.getClass();
            C9106x c9106xM18572e2 = new C9990e(c9100r3, c9101sM12508a2, false).m18572e();
            TreeMap treeMapM17308i2 = c9106xM18572e2.f47568f.m17308i();
            i10 = c9106xM18572e2.f47566d;
            treeMap = treeMapM17308i2;
            c9106x = c9106xM18572e2;
        } else {
            c6078a = this;
            c9106x = c9106xM18572e;
            treeMap = treeMapM17308i;
            i10 = i11;
        }
        boolean zM17350l = c9106x.m17350l();
        long jM11814f = C5579b.m11814f(treeMap);
        AbstractC9107y abstractC9107y = c9106x.f47569g;
        InputStream inputStreamMo11975x1 = abstractC9107y != null ? abstractC9107y.mo13138q().mo11975x1() : null;
        String strM11812d = !zM17350l ? C5579b.m11812d(inputStreamMo11975x1) : null;
        String strM11821m2 = C5579b.m11821m(C6753d.m13467T0(treeMap), "Content-MD5");
        Downloader.C4979a c4979a = new Downloader.C4979a(i10, zM17350l, jM11814f, inputStreamMo11975x1, c4980b, strM11821m2 != null ? strM11821m2 : "", treeMap, C5579b.m11809a(i10, treeMap), strM11812d);
        c6078a.f35813a.put(c4979a, c9106x);
        return c4979a;
    }

    @Override // com.tonyodev.fetch2core.Downloader
    /* JADX INFO: renamed from: p0 */
    public final void mo10676p0(Downloader.C4979a c4979a) {
        Map<Downloader.C4979a, C9106x> map = this.f35813a;
        if (map.containsKey(c4979a)) {
            C9106x c9106x = map.get(c4979a);
            map.remove(c4979a);
            if (c9106x != null) {
                try {
                    c9106x.close();
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
        return this.f35815c;
    }
}
