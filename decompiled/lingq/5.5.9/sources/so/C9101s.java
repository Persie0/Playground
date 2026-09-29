package so;

import android.support.v4.media.C0141b;
import dm.C5207g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import p338qd.C8584v;
import p385sf.C9000b;
import to.C9347b;

/* JADX INFO: renamed from: so.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C9101s {

    /* JADX INFO: renamed from: a */
    public final C9096n f47542a;

    /* JADX INFO: renamed from: b */
    public final String f47543b;

    /* JADX INFO: renamed from: c */
    public final C9095m f47544c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9105w f47545d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f47546e;

    /* JADX INFO: renamed from: f */
    public C9085c f47547f;

    /* JADX INFO: renamed from: so.s$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C9096n f47548a;

        /* JADX INFO: renamed from: b */
        public String f47549b;

        /* JADX INFO: renamed from: c */
        public C9095m.a f47550c;

        /* JADX INFO: renamed from: d */
        public AbstractC9105w f47551d;

        /* JADX INFO: renamed from: e */
        public Map<Class<?>, Object> f47552e;

        public a() {
            this.f47552e = new LinkedHashMap();
            this.f47549b = "GET";
            this.f47550c = new C9095m.a();
        }

        public a(C9101s c9101s) {
            this.f47552e = new LinkedHashMap();
            this.f47548a = c9101s.f47542a;
            this.f47549b = c9101s.f47543b;
            this.f47551d = c9101s.f47545d;
            Map<Class<?>, Object> map = c9101s.f47546e;
            this.f47552e = map.isEmpty() ? new LinkedHashMap() : C6753d.m13467T0(map);
            this.f47550c = c9101s.f47544c.m17307g();
        }

        /* JADX INFO: renamed from: a */
        public final void m17343a(String str, String str2) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(str2, "value");
            this.f47550c.m17311a(str, str2);
        }

        /* JADX INFO: renamed from: b */
        public final C9101s m17344b() {
            Map mapUnmodifiableMap;
            C9096n c9096n = this.f47548a;
            if (c9096n == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f47549b;
            C9095m c9095mM17314d = this.f47550c.m17314d();
            AbstractC9105w abstractC9105w = this.f47551d;
            Map<Class<?>, Object> map = this.f47552e;
            byte[] bArr = C9347b.f48082a;
            C5207g.m11111f(map, "<this>");
            if (map.isEmpty()) {
                mapUnmodifiableMap = C6753d.m13459L0();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                C5207g.m11110e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new C9101s(c9096n, str, c9095mM17314d, abstractC9105w, mapUnmodifiableMap);
        }

        /* JADX INFO: renamed from: c */
        public final void m17345c(String str, String str2) {
            C5207g.m11111f(str2, "value");
            C9095m.a aVar = this.f47550c;
            aVar.getClass();
            C9095m.b.m17317a(str);
            C9095m.b.m17318b(str2, str);
            aVar.m17316f(str);
            aVar.m17313c(str, str2);
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: d */
        public final void m17346d(String str, AbstractC9105w abstractC9105w) {
            C5207g.m11111f(str, "method");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (abstractC9105w == null) {
                if (!(!(C5207g.m11106a(str, "POST") || C5207g.m11106a(str, "PUT") || C5207g.m11106a(str, "PATCH") || C5207g.m11106a(str, "PROPPATCH") || C5207g.m11106a(str, "REPORT")))) {
                    throw new IllegalArgumentException(C0141b.m611g("method ", str, " must have a request body.").toString());
                }
            } else if (!C8584v.m16799x(str)) {
                throw new IllegalArgumentException(C0141b.m611g("method ", str, " must not have a request body.").toString());
            }
            this.f47549b = str;
            this.f47551d = abstractC9105w;
        }

        /* JADX INFO: renamed from: e */
        public final void m17347e(Class cls, Object obj) {
            C5207g.m11111f(cls, "type");
            if (obj == null) {
                this.f47552e.remove(cls);
                return;
            }
            if (this.f47552e.isEmpty()) {
                this.f47552e = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.f47552e;
            Object objCast = cls.cast(obj);
            C5207g.m11108c(objCast);
            map.put(cls, objCast);
        }
    }

    public C9101s(C9096n c9096n, String str, C9095m c9095m, AbstractC9105w abstractC9105w, Map<Class<?>, ? extends Object> map) {
        C5207g.m11111f(str, "method");
        this.f47542a = c9096n;
        this.f47543b = str;
        this.f47544c = c9095m;
        this.f47545d = abstractC9105w;
        this.f47546e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f47543b);
        sb2.append(", url=");
        sb2.append(this.f47542a);
        C9095m c9095m = this.f47544c;
        if (c9095m.f47452a.length / 2 != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : c9095m) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f38012a;
                String str2 = (String) pair2.f38013b;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f47546e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
