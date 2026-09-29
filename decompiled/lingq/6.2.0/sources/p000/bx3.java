package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public abstract class bx3 {

    /* JADX INFO: renamed from: a */
    public final h78 f9129a;

    /* JADX INFO: renamed from: b */
    public final dr6 f9130b;

    /* JADX INFO: renamed from: c */
    public final fm1 f9131c;

    public bx3(h78 h78Var, dr6 dr6Var, fm1 fm1Var) {
        this.f9129a = h78Var;
        this.f9130b = dr6Var;
        this.f9131c = fm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:385:0x08f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:386:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:588:0x0909 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static bx3 m4219b(o98 o98Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC3695vr abstractC3695vr;
        int i;
        AbstractC3695vr[] abstractC3695vrArr;
        int i2;
        int i3;
        AbstractC3695vr t37Var;
        AbstractC3695vr n37Var;
        g78 g78Var = new g78(o98Var, cls, method);
        Annotation[] annotationArr = g78Var.f40336d;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            AbstractC3695vr abstractC3695vr2 = null;
            if (i5 >= length) {
                if (g78Var.f40347o == null) {
                    throw ci8.m4698K(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!g78Var.f40348p) {
                    if (g78Var.f40350r) {
                        throw ci8.m4698K(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (g78Var.f40349q) {
                        throw ci8.m4698K(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = g78Var.f40337e;
                int length2 = annotationArr2.length;
                g78Var.f40355w = new AbstractC3695vr[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    AbstractC3695vr[] abstractC3695vrArr2 = g78Var.f40355w;
                    Type type = g78Var.f40338f[i7];
                    Annotation[] annotationArr3 = annotationArr2[i7];
                    int i8 = i7 == i6 ? 1 : i4;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        abstractC3695vr = abstractC3695vr2;
                        int i9 = i4;
                        while (i9 < length3) {
                            Annotation annotation = annotationArr3[i9];
                            Annotation[][] annotationArr4 = annotationArr2;
                            AbstractC3695vr y37Var = w37.f66331p;
                            int i10 = length2;
                            int i11 = i6;
                            if (annotation instanceof kja) {
                                g78Var.m12412c(i7, type);
                                if (g78Var.f40346n) {
                                    throw ci8.m4699L(method, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (g78Var.f40342j) {
                                    throw ci8.m4699L(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (g78Var.f40343k) {
                                    throw ci8.m4699L(method, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (g78Var.f40344l) {
                                    throw ci8.m4699L(method, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (g78Var.f40345m) {
                                    throw ci8.m4699L(method, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (g78Var.f40351s != null) {
                                    throw ci8.m4699L(method, i7, "@Url cannot be used with @%s URL", g78Var.f40347o);
                                }
                                g78Var.f40346n = true;
                                if (type != ex3.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw ci8.m4699L(method, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                t37Var = new x37(i7, method);
                                i = i9;
                            } else {
                                i = i9;
                                boolean z5 = annotation instanceof e57;
                                o98 o98Var2 = g78Var.f40333a;
                                if (z5) {
                                    g78Var.m12412c(i7, type);
                                    if (g78Var.f40343k) {
                                        throw ci8.m4699L(method, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (g78Var.f40344l) {
                                        throw ci8.m4699L(method, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (g78Var.f40345m) {
                                        throw ci8.m4699L(method, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (g78Var.f40346n) {
                                        throw ci8.m4699L(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (g78Var.f40351s == null) {
                                        throw ci8.m4699L(method, i7, "@Path can only be used with relative url on @%s", g78Var.f40347o);
                                    }
                                    g78Var.f40342j = true;
                                    e57 e57Var = (e57) annotation;
                                    String strValue = e57Var.value();
                                    if (!g78.f40332z.matcher(strValue).matches()) {
                                        throw ci8.m4699L(method, i7, "@Path parameter name must match %s. Found: %s", g78.f40331y.pattern(), strValue);
                                    }
                                    if (!g78Var.f40354v.contains(strValue)) {
                                        throw ci8.m4699L(method, i7, "URL \"%s\" does not contain \"{%s}\".", g78Var.f40351s, strValue);
                                    }
                                    o98Var2.m17880d(type, annotationArr3);
                                    t37Var = new u37(g78Var.f40335c, i7, strValue, e57Var.encoded());
                                } else {
                                    abstractC3695vrArr = abstractC3695vrArr2;
                                    i2 = i8;
                                    if (annotation instanceof sp7) {
                                        g78Var.m12412c(i7, type);
                                        sp7 sp7Var = (sp7) annotation;
                                        String strValue2 = sp7Var.value();
                                        boolean zEncoded = sp7Var.encoded();
                                        Class clsM4690C = ci8.m4690C(type);
                                        i3 = length3;
                                        g78Var.f40343k = true;
                                        if (!Iterable.class.isAssignableFrom(clsM4690C)) {
                                            if (clsM4690C.isArray()) {
                                                o98Var2.m17880d(g78.m12410a(clsM4690C.getComponentType()), annotationArr3);
                                                n37Var = new n37(new p37(strValue2, 1, zEncoded));
                                            } else {
                                                o98Var2.m17880d(type, annotationArr3);
                                                t37Var = new p37(strValue2, 1, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw ci8.m4699L(method, i7, clsM4690C.getSimpleName() + " must include generic type (e.g., " + clsM4690C.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            o98Var2.m17880d(ci8.m4689B(0, (ParameterizedType) type), annotationArr3);
                                            n37Var = new m37(new p37(strValue2, 1, zEncoded));
                                        }
                                        t37Var = n37Var;
                                        str = str;
                                    } else {
                                        i3 = length3;
                                        if (annotation instanceof up7) {
                                            g78Var.m12412c(i7, type);
                                            boolean zEncoded2 = ((up7) annotation).encoded();
                                            Class clsM4690C2 = ci8.m4690C(type);
                                            g78Var.f40344l = true;
                                            if (!Iterable.class.isAssignableFrom(clsM4690C2)) {
                                                if (clsM4690C2.isArray()) {
                                                    o98Var2.m17880d(g78.m12410a(clsM4690C2.getComponentType()), annotationArr3);
                                                    n37Var = new n37(new v37(zEncoded2));
                                                } else {
                                                    o98Var2.m17880d(type, annotationArr3);
                                                    t37Var = new v37(zEncoded2);
                                                }
                                                str = str;
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw ci8.m4699L(method, i7, clsM4690C2.getSimpleName() + " must include generic type (e.g., " + clsM4690C2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                o98Var2.m17880d(ci8.m4689B(0, (ParameterizedType) type), annotationArr3);
                                                n37Var = new m37(new v37(zEncoded2));
                                            }
                                            t37Var = n37Var;
                                            str = str;
                                        } else {
                                            str = str;
                                            if (annotation instanceof tp7) {
                                                g78Var.m12412c(i7, type);
                                                Class clsM4690C3 = ci8.m4690C(type);
                                                g78Var.f40345m = true;
                                                if (!Map.class.isAssignableFrom(clsM4690C3)) {
                                                    throw ci8.m4699L(method, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM4692E = ci8.m4692E(type, clsM4690C3);
                                                if (!(typeM4692E instanceof ParameterizedType)) {
                                                    throw ci8.m4699L(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeM4692E;
                                                Type typeM4689B = ci8.m4689B(0, parameterizedType);
                                                if (String.class != typeM4689B) {
                                                    throw ci8.m4699L(method, i7, "@QueryMap keys must be of type String: " + typeM4689B, new Object[0]);
                                                }
                                                o98Var2.m17880d(ci8.m4689B(1, parameterizedType), annotationArr3);
                                                y37Var = new q37(method, i7, ((tp7) annotation).encoded(), 2);
                                            } else if (annotation instanceof ir3) {
                                                g78Var.m12412c(i7, type);
                                                ir3 ir3Var = (ir3) annotation;
                                                String strValue3 = ir3Var.value();
                                                Class clsM4690C4 = ci8.m4690C(type);
                                                if (Iterable.class.isAssignableFrom(clsM4690C4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ci8.m4699L(method, i7, clsM4690C4.getSimpleName() + " must include generic type (e.g., " + clsM4690C4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    o98Var2.m17880d(ci8.m4689B(0, (ParameterizedType) type), annotationArr3);
                                                    t37Var = new m37(new r37(strValue3, ir3Var.allowUnsafeNonAsciiValues()));
                                                } else if (clsM4690C4.isArray()) {
                                                    o98Var2.m17880d(g78.m12410a(clsM4690C4.getComponentType()), annotationArr3);
                                                    t37Var = new n37(new r37(strValue3, ir3Var.allowUnsafeNonAsciiValues()));
                                                } else {
                                                    o98Var2.m17880d(type, annotationArr3);
                                                    y37Var = new r37(strValue3, ir3Var.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof mr3) {
                                                if (type == qr3.class) {
                                                    t37Var = new s37(i7, method);
                                                } else {
                                                    g78Var.m12412c(i7, type);
                                                    Class clsM4690C5 = ci8.m4690C(type);
                                                    if (!Map.class.isAssignableFrom(clsM4690C5)) {
                                                        throw ci8.m4699L(method, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM4692E2 = ci8.m4692E(type, clsM4690C5);
                                                    if (!(typeM4692E2 instanceof ParameterizedType)) {
                                                        throw ci8.m4699L(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM4692E2;
                                                    Type typeM4689B2 = ci8.m4689B(0, parameterizedType2);
                                                    if (String.class != typeM4689B2) {
                                                        throw ci8.m4699L(method, i7, "@HeaderMap keys must be of type String: " + typeM4689B2, new Object[0]);
                                                    }
                                                    o98Var2.m17880d(ci8.m4689B(1, parameterizedType2), annotationArr3);
                                                    t37Var = new q37(method, i7, ((mr3) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof b33) {
                                                g78Var.m12412c(i7, type);
                                                if (!g78Var.f40349q) {
                                                    throw ci8.m4699L(method, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                b33 b33Var = (b33) annotation;
                                                String strValue4 = b33Var.value();
                                                boolean zEncoded3 = b33Var.encoded();
                                                g78Var.f40339g = true;
                                                Class clsM4690C6 = ci8.m4690C(type);
                                                if (Iterable.class.isAssignableFrom(clsM4690C6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ci8.m4699L(method, i7, clsM4690C6.getSimpleName() + " must include generic type (e.g., " + clsM4690C6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    o98Var2.m17880d(ci8.m4689B(0, (ParameterizedType) type), annotationArr3);
                                                    t37Var = new m37(new p37(strValue4, 0, zEncoded3));
                                                } else if (clsM4690C6.isArray()) {
                                                    o98Var2.m17880d(g78.m12410a(clsM4690C6.getComponentType()), annotationArr3);
                                                    t37Var = new n37(new p37(strValue4, 0, zEncoded3));
                                                } else {
                                                    o98Var2.m17880d(type, annotationArr3);
                                                    t37Var = new p37(strValue4, 0, zEncoded3);
                                                }
                                            } else if (annotation instanceof e33) {
                                                g78Var.m12412c(i7, type);
                                                if (!g78Var.f40349q) {
                                                    throw ci8.m4699L(method, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM4690C7 = ci8.m4690C(type);
                                                if (!Map.class.isAssignableFrom(clsM4690C7)) {
                                                    throw ci8.m4699L(method, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM4692E3 = ci8.m4692E(type, clsM4690C7);
                                                if (!(typeM4692E3 instanceof ParameterizedType)) {
                                                    throw ci8.m4699L(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM4692E3;
                                                int i12 = 0;
                                                Type typeM4689B3 = ci8.m4689B(0, parameterizedType3);
                                                if (String.class != typeM4689B3) {
                                                    throw ci8.m4699L(method, i7, "@FieldMap keys must be of type String: " + typeM4689B3, new Object[0]);
                                                }
                                                o98Var2.m17880d(ci8.m4689B(1, parameterizedType3), annotationArr3);
                                                g78Var.f40339g = true;
                                                t37Var = new q37(method, i7, ((e33) annotation).encoded(), i12);
                                            } else if (annotation instanceof u47) {
                                                g78Var.m12412c(i7, type);
                                                if (!g78Var.f40350r) {
                                                    throw ci8.m4699L(method, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                u47 u47Var = (u47) annotation;
                                                g78Var.f40340h = true;
                                                String strValue5 = u47Var.value();
                                                Class clsM4690C8 = ci8.m4690C(type);
                                                if (!strValue5.isEmpty()) {
                                                    String[] strArr = {"Content-Disposition", wq1.m24118n("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", u47Var.encoding()};
                                                    qr3 qr3Var = qr3.f58109b;
                                                    qr3 qr3VarM19024L = pb1.m19024L(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsM4690C8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw ci8.m4699L(method, i7, clsM4690C8.getSimpleName() + " must include generic type (e.g., " + clsM4690C8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM4689B4 = ci8.m4689B(0, (ParameterizedType) type);
                                                        if (l56.class.isAssignableFrom(ci8.m4690C(typeM4689B4))) {
                                                            throw ci8.m4699L(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        t37Var = new m37(new t37(method, i7, qr3VarM19024L, o98Var2.m17879c(typeM4689B4, annotationArr3, annotationArr)));
                                                    } else if (clsM4690C8.isArray()) {
                                                        Class clsM12410a = g78.m12410a(clsM4690C8.getComponentType());
                                                        if (l56.class.isAssignableFrom(clsM12410a)) {
                                                            throw ci8.m4699L(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        t37Var = new n37(new t37(method, i7, qr3VarM19024L, o98Var2.m17879c(clsM12410a, annotationArr3, annotationArr)));
                                                    } else {
                                                        if (l56.class.isAssignableFrom(clsM4690C8)) {
                                                            throw ci8.m4699L(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        t37Var = new t37(method, i7, qr3VarM19024L, o98Var2.m17879c(type, annotationArr3, annotationArr));
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(clsM4690C8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ci8.m4699L(method, i7, clsM4690C8.getSimpleName() + " must include generic type (e.g., " + clsM4690C8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    if (!l56.class.isAssignableFrom(ci8.m4690C(ci8.m4689B(0, (ParameterizedType) type)))) {
                                                        throw ci8.m4699L(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    t37Var = new m37(y37Var);
                                                } else if (clsM4690C8.isArray()) {
                                                    if (!l56.class.isAssignableFrom(clsM4690C8.getComponentType())) {
                                                        throw ci8.m4699L(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    t37Var = new n37(y37Var);
                                                } else if (!l56.class.isAssignableFrom(clsM4690C8)) {
                                                    throw ci8.m4699L(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (annotation instanceof v47) {
                                                g78Var.m12412c(i7, type);
                                                if (!g78Var.f40350r) {
                                                    throw ci8.m4699L(method, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                g78Var.f40340h = true;
                                                Class clsM4690C9 = ci8.m4690C(type);
                                                if (!Map.class.isAssignableFrom(clsM4690C9)) {
                                                    throw ci8.m4699L(method, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM4692E4 = ci8.m4692E(type, clsM4690C9);
                                                if (!(typeM4692E4 instanceof ParameterizedType)) {
                                                    throw ci8.m4699L(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM4692E4;
                                                Type typeM4689B5 = ci8.m4689B(0, parameterizedType4);
                                                if (String.class != typeM4689B5) {
                                                    throw ci8.m4699L(method, i7, "@PartMap keys must be of type String: " + typeM4689B5, new Object[0]);
                                                }
                                                Type typeM4689B6 = ci8.m4689B(1, parameterizedType4);
                                                if (l56.class.isAssignableFrom(ci8.m4690C(typeM4689B6))) {
                                                    throw ci8.m4699L(method, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                y37Var = new t37(method, i7, o98Var2.m17879c(typeM4689B6, annotationArr3, annotationArr), ((v47) annotation).encoding());
                                            } else if (annotation instanceof be0) {
                                                g78Var.m12412c(i7, type);
                                                if (g78Var.f40349q || g78Var.f40350r) {
                                                    throw ci8.m4699L(method, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (g78Var.f40341i) {
                                                    throw ci8.m4699L(method, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    fm1 fm1VarM17879c = o98Var2.m17879c(type, annotationArr3, annotationArr);
                                                    g78Var.f40341i = true;
                                                    y37Var = new o37(method, i7, fm1VarM17879c);
                                                } catch (RuntimeException e) {
                                                    throw ci8.m4700M(method, e, i7, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof zq9) {
                                                g78Var.m12412c(i7, type);
                                                Class clsM12410a2 = g78.m12410a(ci8.m4690C(type));
                                                for (int i13 = i7 - 1; i13 >= 0; i13--) {
                                                    AbstractC3695vr abstractC3695vr3 = g78Var.f40355w[i13];
                                                    if ((abstractC3695vr3 instanceof y37) && ((y37) abstractC3695vr3).f69245p.equals(clsM12410a2)) {
                                                        throw ci8.m4699L(method, i7, "@Tag type " + clsM12410a2.getName() + " is duplicate of " + v87.f65023b.mo18904d(i13, method) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                y37Var = new y37(clsM12410a2);
                                            } else {
                                                t37Var = null;
                                            }
                                            t37Var = y37Var;
                                        }
                                    }
                                }
                                if (t37Var != null) {
                                    if (abstractC3695vr == null) {
                                        throw ci8.m4699L(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    abstractC3695vr = t37Var;
                                }
                                i9 = i + 1;
                                annotationArr2 = annotationArr4;
                                length2 = i10;
                                i6 = i11;
                                length3 = i3;
                                abstractC3695vrArr2 = abstractC3695vrArr;
                                i8 = i2;
                                str = str;
                            }
                            abstractC3695vrArr = abstractC3695vrArr2;
                            i2 = i8;
                            i3 = length3;
                            if (t37Var != null) {
                                if (abstractC3695vr == null) {
                                    throw ci8.m4699L(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                abstractC3695vr = t37Var;
                            }
                            i9 = i + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i10;
                            i6 = i11;
                            length3 = i3;
                            abstractC3695vrArr2 = abstractC3695vrArr;
                            i8 = i2;
                            str = str;
                        }
                    } else {
                        abstractC3695vr = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str2 = str;
                    int i15 = i6;
                    AbstractC3695vr[] abstractC3695vrArr3 = abstractC3695vrArr2;
                    int i16 = i8;
                    if (abstractC3695vr == null) {
                        if (i16 != 0) {
                            try {
                                if (ci8.m4690C(type) == Continuation.class) {
                                    g78Var.f40356x = true;
                                    abstractC3695vr = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw ci8.m4699L(method, i7, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC3695vrArr3[i7] = abstractC3695vr;
                    i7++;
                    annotationArr2 = annotationArr5;
                    length2 = i14;
                    i6 = i15;
                    str = str2;
                    i4 = 0;
                    abstractC3695vr2 = null;
                }
                String str3 = str;
                if (g78Var.f40351s == null && !g78Var.f40346n) {
                    throw ci8.m4698K(method, null, "Missing either @%s URL or @Url parameter.", g78Var.f40347o);
                }
                boolean z6 = g78Var.f40349q;
                if (!z6 && !g78Var.f40350r && !g78Var.f40348p && g78Var.f40341i) {
                    throw ci8.m4698K(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !g78Var.f40339g) {
                    throw ci8.m4698K(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (g78Var.f40350r && !g78Var.f40340h) {
                    throw ci8.m4698K(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                h78 h78Var = new h78(g78Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (ci8.m4693F(genericReturnType2)) {
                    throw ci8.m4698K(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw ci8.m4698K(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = h78Var.f41897l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM4689B7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM4689B7 instanceof WildcardType) {
                        typeM4689B7 = ((WildcardType) typeM4689B7).getLowerBounds()[0];
                    }
                    if (ci8.m4690C(typeM4689B7) == i88.class && (typeM4689B7 instanceof ParameterizedType)) {
                        typeM4689B7 = ci8.m4689B(0, (ParameterizedType) typeM4689B7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (ci8.m4690C(typeM4689B7) == ul0.class) {
                            throw ci8.m4698K(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", ci8.m4689B(0, (ParameterizedType) typeM4689B7));
                        }
                        z3 = ci8.f10126j && typeM4689B7 == xfa.class;
                        z2 = false;
                    }
                    genericReturnType = new dna(null, ul0.class, typeM4689B7);
                    if (!ci8.m4695H(annotations, o99.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = p99.f55810b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    xl0 xl0VarM17877a = o98Var.m17877a(genericReturnType, annotations);
                    Type typeMo3354g = xl0VarM17877a.mo3354g();
                    if (typeMo3354g == j88.class) {
                        throw ci8.m4698K(method, null, "'" + ci8.m4690C(typeMo3354g).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo3354g == i88.class) {
                        throw ci8.m4698K(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (h78Var.f41889d.equals(str3) && !Void.class.equals(typeMo3354g) && (!ci8.f10126j || typeMo3354g != xfa.class)) {
                        throw ci8.m4698K(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        fm1 fm1VarM17878b = o98Var.m17878b(null, typeMo3354g, method.getAnnotations());
                        dr6 dr6Var = o98Var.f54086b;
                        if (z7) {
                            return z2 ? new zw3(h78Var, dr6Var, fm1VarM17878b, xl0VarM17877a, 1) : new ax3(h78Var, dr6Var, fm1VarM17878b, xl0VarM17877a, z);
                        }
                        return new zw3(h78Var, dr6Var, fm1VarM17878b, xl0VarM17877a, 0);
                    } catch (RuntimeException e2) {
                        throw ci8.m4698K(method, e2, "Unable to create converter for %s", typeMo3354g);
                    }
                } catch (RuntimeException e3) {
                    throw ci8.m4698K(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i5];
            if (annotation2 instanceof ay1) {
                g78Var.m12411b("DELETE", ((ay1) annotation2).value(), false);
            } else if (annotation2 instanceof mj3) {
                g78Var.m12411b("GET", ((mj3) annotation2).value(), false);
            } else if (annotation2 instanceof tq3) {
                g78Var.m12411b("HEAD", ((tq3) annotation2).value(), false);
            } else if (annotation2 instanceof g17) {
                g78Var.m12411b("PATCH", ((g17) annotation2).value(), true);
            } else if (annotation2 instanceof j17) {
                g78Var.m12411b("POST", ((j17) annotation2).value(), true);
            } else if (annotation2 instanceof k17) {
                g78Var.m12411b("PUT", ((k17) annotation2).value(), true);
            } else if (annotation2 instanceof dp6) {
                g78Var.m12411b("OPTIONS", ((dp6) annotation2).value(), false);
            } else if (annotation2 instanceof uq3) {
                uq3 uq3Var = (uq3) annotation2;
                g78Var.m12411b(uq3Var.method(), uq3Var.path(), uq3Var.hasBody());
            } else if (annotation2 instanceof pr3) {
                pr3 pr3Var = (pr3) annotation2;
                String[] strArrValue = pr3Var.value();
                if (strArrValue.length == 0) {
                    throw ci8.m4698K(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = pr3Var.allowUnsafeNonAsciiValues();
                or3 or3Var = new or3(0);
                int length4 = strArrValue.length;
                int i17 = 0;
                while (i17 < length4) {
                    String str4 = strArrValue[i17];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw ci8.m4698K(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Regex regex = xv5.f68845e;
                            g78Var.f40353u = AbstractC3122is.m14103q(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw ci8.m4698K(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        or3Var.m18308v(strSubstring, strTrim);
                    } else {
                        or3Var.m18305j(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                g78Var.f40352t = or3Var.m18309w();
            } else if (annotation2 instanceof k56) {
                if (g78Var.f40349q) {
                    throw ci8.m4698K(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                g78Var.f40350r = true;
            } else if (!(annotation2 instanceof kc3)) {
                continue;
            } else {
                if (g78Var.f40350r) {
                    throw ci8.m4698K(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                g78Var.f40349q = true;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo3111a(br6 br6Var, Object[] objArr);
}
