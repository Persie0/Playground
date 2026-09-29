package jp;

import android.support.v4.media.C0141b;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import p124fp.C5608e;
import retrofit2.C8778b;
import so.AbstractC9105w;
import so.C9095m;
import so.C9099q;

/* JADX INFO: renamed from: jp.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6549q<T> {

    /* JADX INFO: renamed from: jp.q$a */
    public static final class a<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final Method f37244a;

        /* JADX INFO: renamed from: b */
        public final int f37245b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC6538f<T, AbstractC9105w> f37246c;

        public a(Method method, int i10, InterfaceC6538f<T, AbstractC9105w> interfaceC6538f) {
            this.f37244a = method;
            this.f37245b = i10;
            this.f37246c = interfaceC6538f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) {
            int i10 = this.f37245b;
            Method method = this.f37244a;
            if (t10 == null) {
                throw C8778b.m17032j(method, i10, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                c6551s.f37299k = this.f37246c.mo13122a(t10);
            } catch (IOException e10) {
                throw C8778b.m17033k(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$b */
    public static final class b<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final String f37247a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6538f<T, String> f37248b;

        /* JADX INFO: renamed from: c */
        public final boolean f37249c;

        public b(String str, boolean z10) {
            C6533a.d dVar = C6533a.d.f37203a;
            Objects.requireNonNull(str, "name == null");
            this.f37247a = str;
            this.f37248b = dVar;
            this.f37249c = z10;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) throws IOException {
            String strMo13122a;
            if (t10 == null || (strMo13122a = this.f37248b.mo13122a(t10)) == null) {
                return;
            }
            c6551s.m13142a(this.f37247a, strMo13122a, this.f37249c);
        }
    }

    /* JADX INFO: renamed from: jp.q$c */
    public static final class c<T> extends AbstractC6549q<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f37250a;

        /* JADX INFO: renamed from: b */
        public final int f37251b;

        /* JADX INFO: renamed from: c */
        public final boolean f37252c;

        public c(Method method, int i10, boolean z10) {
            this.f37250a = method;
            this.f37251b = i10;
            this.f37252c = z10;
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f37251b;
            Method method = this.f37250a;
            if (map == null) {
                throw C8778b.m17032j(method, i10, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C8778b.m17032j(method, i10, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C8778b.m17032j(method, i10, C0141b.m611g("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw C8778b.m17032j(method, i10, "Field map value '" + value + "' converted to null by " + C6533a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                c6551s.m13142a(str, string, this.f37252c);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$d */
    public static final class d<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final String f37253a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6538f<T, String> f37254b;

        public d(String str) {
            C6533a.d dVar = C6533a.d.f37203a;
            Objects.requireNonNull(str, "name == null");
            this.f37253a = str;
            this.f37254b = dVar;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) throws IOException {
            String strMo13122a;
            if (t10 == null || (strMo13122a = this.f37254b.mo13122a(t10)) == null) {
                return;
            }
            c6551s.m13143b(this.f37253a, strMo13122a);
        }
    }

    /* JADX INFO: renamed from: jp.q$e */
    public static final class e<T> extends AbstractC6549q<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f37255a;

        /* JADX INFO: renamed from: b */
        public final int f37256b;

        public e(Method method, int i10) {
            this.f37255a = method;
            this.f37256b = i10;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f37256b;
            Method method = this.f37255a;
            if (map == null) {
                throw C8778b.m17032j(method, i10, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C8778b.m17032j(method, i10, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C8778b.m17032j(method, i10, C0141b.m611g("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                c6551s.m13143b(str, value.toString());
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$f */
    public static final class f extends AbstractC6549q<C9095m> {

        /* JADX INFO: renamed from: a */
        public final Method f37257a;

        /* JADX INFO: renamed from: b */
        public final int f37258b;

        public f(int i10, Method method) {
            this.f37257a = method;
            this.f37258b = i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, C9095m c9095m) throws IOException {
            C9095m c9095m2 = c9095m;
            if (c9095m2 == null) {
                throw C8778b.m17032j(this.f37257a, this.f37258b, "Headers parameter must not be null.", new Object[0]);
            }
            C9095m.a aVar = c6551s.f37294f;
            aVar.getClass();
            int length = c9095m2.f47452a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                aVar.m17313c(c9095m2.m17306f(i10), c9095m2.m17309l(i10));
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$g */
    public static final class g<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final Method f37259a;

        /* JADX INFO: renamed from: b */
        public final int f37260b;

        /* JADX INFO: renamed from: c */
        public final C9095m f37261c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC6538f<T, AbstractC9105w> f37262d;

        public g(Method method, int i10, C9095m c9095m, InterfaceC6538f<T, AbstractC9105w> interfaceC6538f) {
            this.f37259a = method;
            this.f37260b = i10;
            this.f37261c = c9095m;
            this.f37262d = interfaceC6538f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                AbstractC9105w abstractC9105wMo13122a = this.f37262d.mo13122a(t10);
                C9099q.a aVar = c6551s.f37297i;
                aVar.getClass();
                C5207g.m11111f(abstractC9105wMo13122a, "body");
                aVar.f47489c.add(C9099q.c.a.m17342a(this.f37261c, abstractC9105wMo13122a));
            } catch (IOException e10) {
                throw C8778b.m17032j(this.f37259a, this.f37260b, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$h */
    public static final class h<T> extends AbstractC6549q<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f37263a;

        /* JADX INFO: renamed from: b */
        public final int f37264b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC6538f<T, AbstractC9105w> f37265c;

        /* JADX INFO: renamed from: d */
        public final String f37266d;

        public h(Method method, int i10, InterfaceC6538f<T, AbstractC9105w> interfaceC6538f, String str) {
            this.f37263a = method;
            this.f37264b = i10;
            this.f37265c = interfaceC6538f;
            this.f37266d = str;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f37264b;
            Method method = this.f37263a;
            if (map == null) {
                throw C8778b.m17032j(method, i10, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C8778b.m17032j(method, i10, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C8778b.m17032j(method, i10, C0141b.m611g("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                C9095m c9095mM17319c = C9095m.b.m17319c("Content-Disposition", C0141b.m611g("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f37266d);
                AbstractC9105w abstractC9105wMo13122a = this.f37265c.mo13122a((T) value);
                C9099q.a aVar = c6551s.f37297i;
                aVar.getClass();
                C5207g.m11111f(abstractC9105wMo13122a, "body");
                aVar.f47489c.add(C9099q.c.a.m17342a(c9095mM17319c, abstractC9105wMo13122a));
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$i */
    public static final class i<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final Method f37267a;

        /* JADX INFO: renamed from: b */
        public final int f37268b;

        /* JADX INFO: renamed from: c */
        public final String f37269c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC6538f<T, String> f37270d;

        /* JADX INFO: renamed from: e */
        public final boolean f37271e;

        public i(Method method, int i10, String str, boolean z10) {
            C6533a.d dVar = C6533a.d.f37203a;
            this.f37267a = method;
            this.f37268b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f37269c = str;
            this.f37270d = dVar;
            this.f37271e = z10;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) throws IOException {
            String strM11934I0;
            String str = this.f37269c;
            if (t10 == null) {
                throw C8778b.m17032j(this.f37267a, this.f37268b, C0141b.m611g("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strMo13122a = this.f37270d.mo13122a(t10);
            if (c6551s.f37291c == null) {
                throw new AssertionError();
            }
            int length = strMo13122a.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strM11934I0 = strMo13122a;
                    break;
                }
                int iCodePointAt = strMo13122a.codePointAt(iCharCount);
                int i10 = 47;
                boolean z10 = this.f37271e;
                int i11 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    C5608e c5608e = new C5608e();
                    c5608e.m11977y1(strMo13122a, 0, iCharCount);
                    C5608e c5608e2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strMo13122a.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i11 || (!z10 && (iCodePointAt2 == i10 || iCodePointAt2 == 37))) {
                                if (c5608e2 == null) {
                                    c5608e2 = new C5608e();
                                }
                                c5608e2.m11979z1(iCodePointAt2);
                                while (!c5608e2.mo11936L()) {
                                    int i12 = c5608e2.readByte() & 255;
                                    c5608e.m11954d1(37);
                                    char[] cArr = C6551s.f37287l;
                                    c5608e.m11954d1(cArr[(i12 >> 4) & 15]);
                                    c5608e.m11954d1(cArr[i12 & 15]);
                                }
                            } else {
                                c5608e.m11979z1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    strM11934I0 = c5608e.m11934I0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = c6551s.f37291c.replace("{" + str + "}", strM11934I0);
            if (C6551s.f37288m.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strMo13122a));
            }
            c6551s.f37291c = strReplace;
        }
    }

    /* JADX INFO: renamed from: jp.q$j */
    public static final class j<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final String f37272a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6538f<T, String> f37273b;

        /* JADX INFO: renamed from: c */
        public final boolean f37274c;

        public j(String str, boolean z10) {
            C6533a.d dVar = C6533a.d.f37203a;
            Objects.requireNonNull(str, "name == null");
            this.f37272a = str;
            this.f37273b = dVar;
            this.f37274c = z10;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) throws IOException {
            String strMo13122a;
            if (t10 == null || (strMo13122a = this.f37273b.mo13122a(t10)) == null) {
                return;
            }
            c6551s.m13144c(this.f37272a, strMo13122a, this.f37274c);
        }
    }

    /* JADX INFO: renamed from: jp.q$k */
    public static final class k<T> extends AbstractC6549q<Map<String, T>> {

        /* JADX INFO: renamed from: a */
        public final Method f37275a;

        /* JADX INFO: renamed from: b */
        public final int f37276b;

        /* JADX INFO: renamed from: c */
        public final boolean f37277c;

        public k(Method method, int i10, boolean z10) {
            this.f37275a = method;
            this.f37276b = i10;
            this.f37277c = z10;
        }

        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f37276b;
            Method method = this.f37275a;
            if (map == null) {
                throw C8778b.m17032j(method, i10, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw C8778b.m17032j(method, i10, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw C8778b.m17032j(method, i10, C0141b.m611g("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw C8778b.m17032j(method, i10, "Query map value '" + value + "' converted to null by " + C6533a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                c6551s.m13144c(str, string, this.f37277c);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$l */
    public static final class l<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final boolean f37278a;

        public l(boolean z10) {
            this.f37278a = z10;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            c6551s.m13144c(t10.toString(), null, this.f37278a);
        }
    }

    /* JADX INFO: renamed from: jp.q$m */
    public static final class m extends AbstractC6549q<C9099q.c> {

        /* JADX INFO: renamed from: a */
        public static final m f37279a = new m();

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, C9099q.c cVar) throws IOException {
            C9099q.c cVar2 = cVar;
            if (cVar2 != null) {
                C9099q.a aVar = c6551s.f37297i;
                aVar.getClass();
                aVar.f47489c.add(cVar2);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$n */
    public static final class n extends AbstractC6549q<Object> {

        /* JADX INFO: renamed from: a */
        public final Method f37280a;

        /* JADX INFO: renamed from: b */
        public final int f37281b;

        public n(int i10, Method method) {
            this.f37280a = method;
            this.f37281b = i10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, Object obj) {
            if (obj != null) {
                c6551s.f37291c = obj.toString();
            } else {
                int i10 = this.f37281b;
                throw C8778b.m17032j(this.f37280a, i10, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: jp.q$o */
    public static final class o<T> extends AbstractC6549q<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f37282a;

        public o(Class<T> cls) {
            this.f37282a = cls;
        }

        @Override // jp.AbstractC6549q
        /* JADX INFO: renamed from: a */
        public final void mo13139a(C6551s c6551s, T t10) {
            c6551s.f37293e.m17347e(this.f37282a, t10);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13139a(C6551s c6551s, T t10) throws IOException;
}
