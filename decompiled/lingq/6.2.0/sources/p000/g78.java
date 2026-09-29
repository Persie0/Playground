package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g78 {

    /* JADX INFO: renamed from: y */
    public static final Pattern f40331y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z */
    public static final Pattern f40332z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a */
    public final o98 f40333a;

    /* JADX INFO: renamed from: b */
    public final Class f40334b;

    /* JADX INFO: renamed from: c */
    public final Method f40335c;

    /* JADX INFO: renamed from: d */
    public final Annotation[] f40336d;

    /* JADX INFO: renamed from: e */
    public final Annotation[][] f40337e;

    /* JADX INFO: renamed from: f */
    public final Type[] f40338f;

    /* JADX INFO: renamed from: g */
    public boolean f40339g;

    /* JADX INFO: renamed from: h */
    public boolean f40340h;

    /* JADX INFO: renamed from: i */
    public boolean f40341i;

    /* JADX INFO: renamed from: j */
    public boolean f40342j;

    /* JADX INFO: renamed from: k */
    public boolean f40343k;

    /* JADX INFO: renamed from: l */
    public boolean f40344l;

    /* JADX INFO: renamed from: m */
    public boolean f40345m;

    /* JADX INFO: renamed from: n */
    public boolean f40346n;

    /* JADX INFO: renamed from: o */
    public String f40347o;

    /* JADX INFO: renamed from: p */
    public boolean f40348p;

    /* JADX INFO: renamed from: q */
    public boolean f40349q;

    /* JADX INFO: renamed from: r */
    public boolean f40350r;

    /* JADX INFO: renamed from: s */
    public String f40351s;

    /* JADX INFO: renamed from: t */
    public qr3 f40352t;

    /* JADX INFO: renamed from: u */
    public xv5 f40353u;

    /* JADX INFO: renamed from: v */
    public LinkedHashSet f40354v;

    /* JADX INFO: renamed from: w */
    public AbstractC3695vr[] f40355w;

    /* JADX INFO: renamed from: x */
    public boolean f40356x;

    public g78(o98 o98Var, Class cls, Method method) {
        this.f40333a = o98Var;
        this.f40334b = cls;
        this.f40335c = method;
        this.f40336d = method.getAnnotations();
        this.f40338f = method.getGenericParameterTypes();
        this.f40337e = method.getParameterAnnotations();
    }

    /* JADX INFO: renamed from: a */
    public static Class m12410a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: b */
    public final void m12411b(String str, String str2, boolean z) {
        String str3 = this.f40347o;
        Method method = this.f40335c;
        if (str3 != null) {
            throw ci8.m4698K(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f40347o = str;
        this.f40348p = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f40331y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw ci8.m4698K(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f40351s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f40354v = linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public final void m12412c(int i, Type type) {
        if (ci8.m4693F(type)) {
            throw ci8.m4699L(this.f40335c, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
