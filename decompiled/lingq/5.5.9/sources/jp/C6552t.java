package jp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit2.C8778b;
import so.C9095m;
import so.C9096n;
import so.C9098p;

/* JADX INFO: renamed from: jp.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C6552t {

    /* JADX INFO: renamed from: a */
    public final Method f37302a;

    /* JADX INFO: renamed from: b */
    public final C9096n f37303b;

    /* JADX INFO: renamed from: c */
    public final String f37304c;

    /* JADX INFO: renamed from: d */
    public final String f37305d;

    /* JADX INFO: renamed from: e */
    public final C9095m f37306e;

    /* JADX INFO: renamed from: f */
    public final C9098p f37307f;

    /* JADX INFO: renamed from: g */
    public final boolean f37308g;

    /* JADX INFO: renamed from: h */
    public final boolean f37309h;

    /* JADX INFO: renamed from: i */
    public final boolean f37310i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6549q<?>[] f37311j;

    /* JADX INFO: renamed from: k */
    public final boolean f37312k;

    /* JADX INFO: renamed from: jp.t$a */
    public static final class a {

        /* JADX INFO: renamed from: x */
        public static final Pattern f37313x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: y */
        public static final Pattern f37314y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a */
        public final C6554v f37315a;

        /* JADX INFO: renamed from: b */
        public final Method f37316b;

        /* JADX INFO: renamed from: c */
        public final Annotation[] f37317c;

        /* JADX INFO: renamed from: d */
        public final Annotation[][] f37318d;

        /* JADX INFO: renamed from: e */
        public final Type[] f37319e;

        /* JADX INFO: renamed from: f */
        public boolean f37320f;

        /* JADX INFO: renamed from: g */
        public boolean f37321g;

        /* JADX INFO: renamed from: h */
        public boolean f37322h;

        /* JADX INFO: renamed from: i */
        public boolean f37323i;

        /* JADX INFO: renamed from: j */
        public boolean f37324j;

        /* JADX INFO: renamed from: k */
        public boolean f37325k;

        /* JADX INFO: renamed from: l */
        public boolean f37326l;

        /* JADX INFO: renamed from: m */
        public boolean f37327m;

        /* JADX INFO: renamed from: n */
        public String f37328n;

        /* JADX INFO: renamed from: o */
        public boolean f37329o;

        /* JADX INFO: renamed from: p */
        public boolean f37330p;

        /* JADX INFO: renamed from: q */
        public boolean f37331q;

        /* JADX INFO: renamed from: r */
        public String f37332r;

        /* JADX INFO: renamed from: s */
        public C9095m f37333s;

        /* JADX INFO: renamed from: t */
        public C9098p f37334t;

        /* JADX INFO: renamed from: u */
        public LinkedHashSet f37335u;

        /* JADX INFO: renamed from: v */
        public AbstractC6549q<?>[] f37336v;

        /* JADX INFO: renamed from: w */
        public boolean f37337w;

        public a(C6554v c6554v, Method method) {
            this.f37315a = c6554v;
            this.f37316b = method;
            this.f37317c = method.getAnnotations();
            this.f37319e = method.getGenericParameterTypes();
            this.f37318d = method.getParameterAnnotations();
        }

        /* JADX INFO: renamed from: a */
        public static Class<?> m13148a(Class<?> cls) {
            Class<?> cls2 = cls;
            if (Boolean.TYPE == cls2) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls2) {
                return Byte.class;
            }
            if (Character.TYPE == cls2) {
                return Character.class;
            }
            if (Double.TYPE == cls2) {
                return Double.class;
            }
            if (Float.TYPE == cls2) {
                return Float.class;
            }
            if (Integer.TYPE == cls2) {
                return Integer.class;
            }
            if (Long.TYPE == cls2) {
                return Long.class;
            }
            if (Short.TYPE == cls2) {
                cls2 = Short.class;
            }
            return cls2;
        }

        /* JADX INFO: renamed from: b */
        public final void m13149b(String str, String str2, boolean z10) {
            String str3 = this.f37328n;
            Method method = this.f37316b;
            if (str3 != null) {
                throw C8778b.m17031i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f37328n = str;
            this.f37329o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f37313x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw C8778b.m17031i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f37332r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f37335u = linkedHashSet;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final void m13150c(int i10, Type type) {
            if (C8778b.m17029g(type)) {
                throw C8778b.m17032j(this.f37316b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C6552t(a aVar) {
        this.f37302a = aVar.f37316b;
        this.f37303b = aVar.f37315a.f37343c;
        this.f37304c = aVar.f37328n;
        this.f37305d = aVar.f37332r;
        this.f37306e = aVar.f37333s;
        this.f37307f = aVar.f37334t;
        this.f37308g = aVar.f37329o;
        this.f37309h = aVar.f37330p;
        this.f37310i = aVar.f37331q;
        this.f37311j = aVar.f37336v;
        this.f37312k = aVar.f37337w;
    }
}
