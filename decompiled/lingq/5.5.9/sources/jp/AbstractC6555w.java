package jp;

import android.support.v4.media.C0141b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import p250lp.InterfaceC7424a;
import p250lp.InterfaceC7425b;
import p250lp.InterfaceC7426c;
import p250lp.InterfaceC7427d;
import p250lp.InterfaceC7428e;
import p250lp.InterfaceC7429f;
import p250lp.InterfaceC7430g;
import p250lp.InterfaceC7431h;
import p250lp.InterfaceC7432i;
import p250lp.InterfaceC7433j;
import p250lp.InterfaceC7434k;
import p250lp.InterfaceC7435l;
import p250lp.InterfaceC7436m;
import p250lp.InterfaceC7437n;
import p250lp.InterfaceC7438o;
import p250lp.InterfaceC7439p;
import p250lp.InterfaceC7440q;
import p250lp.InterfaceC7441r;
import p250lp.InterfaceC7442s;
import p250lp.InterfaceC7443t;
import p250lp.InterfaceC7444u;
import p250lp.InterfaceC7445v;
import p250lp.InterfaceC7447x;
import p250lp.InterfaceC7448y;
import p464wl.InterfaceC9968c;
import retrofit2.AbstractC8777a;
import retrofit2.C8778b;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9095m;
import so.C9096n;
import so.C9098p;
import so.C9099q;
import so.C9106x;
import so.InterfaceC9086d;

/* JADX INFO: renamed from: jp.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6555w<T> {
    /* JADX WARN: Code duplicated, block: B:388:0x090c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:389:0x090e  */
    /* JADX WARN: Code duplicated, block: B:575:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x0910 A[SYNTHETIC] */
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
    public static AbstractC8777a m13157b(C6554v c6554v, Method method) {
        Type genericReturnType;
        boolean z10;
        C6552t.a aVar;
        int i10;
        int i11;
        boolean z11;
        String str;
        AbstractC6549q<?>[] abstractC6549qArr;
        AbstractC6549q<?> abstractC6549q;
        C6552t.a aVar2;
        String str2;
        AbstractC6549q<?>[] abstractC6549qArr2;
        boolean z12;
        int i12;
        C6552t.a aVar3;
        AbstractC6549q<?> gVar;
        AbstractC6549q<?> oVar;
        AbstractC6549q<?> c6548p;
        AbstractC6549q<?> c6548p2;
        AbstractC6549q<?> c6548p3;
        AbstractC6549q<?> lVar;
        C6552t.a aVar4 = new C6552t.a(c6554v, method);
        Annotation[] annotationArr = aVar4.f37317c;
        int length = annotationArr.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String str3 = "HEAD";
            Method method2 = aVar4.f37316b;
            if (i14 >= length) {
                if (aVar4.f37328n == null) {
                    throw C8778b.m17031i(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar4.f37329o) {
                    if (aVar4.f37331q) {
                        throw C8778b.m17031i(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar4.f37330p) {
                        throw C8778b.m17031i(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = aVar4.f37318d;
                int length2 = annotationArr2.length;
                aVar4.f37336v = new AbstractC6549q[length2];
                int i15 = length2 - 1;
                C6552t.a aVar5 = aVar4;
                boolean z13 = true;
                boolean z14 = false;
                while (i13 < length2) {
                    AbstractC6549q<?>[] abstractC6549qArr3 = aVar5.f37336v;
                    Type type = aVar5.f37319e[i13];
                    Annotation[] annotationArr3 = annotationArr2[i13];
                    if (i13 == i15) {
                        z14 = z13;
                    }
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        abstractC6549q = null;
                        int i16 = 0;
                        C6552t.a aVar6 = aVar5;
                        while (i16 < length3) {
                            int i17 = length2;
                            Annotation annotation = annotationArr3[i16];
                            int i18 = i15;
                            int i19 = length3;
                            if (annotation instanceof InterfaceC7448y) {
                                aVar5.m13150c(i13, type);
                                if (aVar6.f37327m) {
                                    throw C8778b.m17032j(method2, i13, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar6.f37323i) {
                                    throw C8778b.m17032j(method2, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar6.f37324j) {
                                    throw C8778b.m17032j(method2, i13, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar6.f37325k) {
                                    throw C8778b.m17032j(method2, i13, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar6.f37326l) {
                                    throw C8778b.m17032j(method2, i13, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar6.f37332r != null) {
                                    throw C8778b.m17032j(method2, i13, "@Url cannot be used with @%s URL", aVar6.f37328n);
                                }
                                aVar6.f37327m = true;
                                if (type != C9096n.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw C8778b.m17032j(method2, i13, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                gVar = new AbstractC6549q.n(i13, method2);
                                str2 = str3;
                            } else {
                                boolean z15 = annotation instanceof InterfaceC7442s;
                                str2 = str3;
                                C6554v c6554v2 = aVar6.f37315a;
                                if (z15) {
                                    aVar5.m13150c(i13, type);
                                    if (aVar6.f37324j) {
                                        throw C8778b.m17032j(method2, i13, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar6.f37325k) {
                                        throw C8778b.m17032j(method2, i13, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar6.f37326l) {
                                        throw C8778b.m17032j(method2, i13, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar6.f37327m) {
                                        throw C8778b.m17032j(method2, i13, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar6.f37332r == null) {
                                        throw C8778b.m17032j(method2, i13, "@Path can only be used with relative url on @%s", aVar6.f37328n);
                                    }
                                    aVar6.f37323i = true;
                                    InterfaceC7442s interfaceC7442s = (InterfaceC7442s) annotation;
                                    String strValue = interfaceC7442s.value();
                                    if (!C6552t.a.f37314y.matcher(strValue).matches()) {
                                        throw C8778b.m17032j(method2, i13, "@Path parameter name must match %s. Found: %s", C6552t.a.f37313x.pattern(), strValue);
                                    }
                                    if (!aVar6.f37335u.contains(strValue)) {
                                        throw C8778b.m17032j(method2, i13, "URL \"%s\" does not contain \"{%s}\".", aVar6.f37332r, strValue);
                                    }
                                    c6554v2.m13156f(type, annotationArr3);
                                    gVar = new AbstractC6549q.i(aVar6.f37316b, i13, strValue, interfaceC7442s.encoded());
                                } else {
                                    abstractC6549qArr2 = abstractC6549qArr3;
                                    if (annotation instanceof InterfaceC7443t) {
                                        aVar5.m13150c(i13, type);
                                        InterfaceC7443t interfaceC7443t = (InterfaceC7443t) annotation;
                                        String strValue2 = interfaceC7443t.value();
                                        boolean zEncoded = interfaceC7443t.encoded();
                                        Class<?> clsM17027e = C8778b.m17027e(type);
                                        z12 = z14;
                                        aVar6.f37324j = true;
                                        if (Iterable.class.isAssignableFrom(clsM17027e)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw C8778b.m17032j(method2, i13, clsM17027e.getSimpleName() + " must include generic type (e.g., " + clsM17027e.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c6554v2.m13156f(C8778b.m17026d(0, (ParameterizedType) type), annotationArr3);
                                            gVar = new C6547o(new AbstractC6549q.j(strValue2, zEncoded));
                                        } else if (clsM17027e.isArray()) {
                                            c6554v2.m13156f(C6552t.a.m13148a(clsM17027e.getComponentType()), annotationArr3);
                                            gVar = new C6548p(new AbstractC6549q.j(strValue2, zEncoded));
                                        } else {
                                            c6554v2.m13156f(type, annotationArr3);
                                            lVar = new AbstractC6549q.j<>(strValue2, zEncoded);
                                            gVar = lVar;
                                        }
                                        aVar3 = aVar4;
                                        i12 = i16;
                                    } else {
                                        z12 = z14;
                                        if (annotation instanceof InterfaceC7445v) {
                                            aVar5.m13150c(i13, type);
                                            boolean zEncoded2 = ((InterfaceC7445v) annotation).encoded();
                                            Class<?> clsM17027e2 = C8778b.m17027e(type);
                                            aVar6.f37325k = true;
                                            if (Iterable.class.isAssignableFrom(clsM17027e2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw C8778b.m17032j(method2, i13, clsM17027e2.getSimpleName() + " must include generic type (e.g., " + clsM17027e2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c6554v2.m13156f(C8778b.m17026d(0, (ParameterizedType) type), annotationArr3);
                                                gVar = new C6547o(new AbstractC6549q.l(zEncoded2));
                                            } else if (clsM17027e2.isArray()) {
                                                c6554v2.m13156f(C6552t.a.m13148a(clsM17027e2.getComponentType()), annotationArr3);
                                                gVar = new C6548p(new AbstractC6549q.l(zEncoded2));
                                            } else {
                                                c6554v2.m13156f(type, annotationArr3);
                                                lVar = new AbstractC6549q.l<>(zEncoded2);
                                                gVar = lVar;
                                            }
                                            aVar3 = aVar4;
                                            i12 = i16;
                                        } else {
                                            i12 = i16;
                                            if (annotation instanceof InterfaceC7444u) {
                                                aVar5.m13150c(i13, type);
                                                Class<?> clsM17027e3 = C8778b.m17027e(type);
                                                aVar6.f37326l = true;
                                                if (!Map.class.isAssignableFrom(clsM17027e3)) {
                                                    throw C8778b.m17032j(method2, i13, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM17028f = C8778b.m17028f(type, clsM17027e3);
                                                if (!(typeM17028f instanceof ParameterizedType)) {
                                                    throw C8778b.m17032j(method2, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeM17028f;
                                                Type typeM17026d = C8778b.m17026d(0, parameterizedType);
                                                if (String.class != typeM17026d) {
                                                    throw C8778b.m17032j(method2, i13, "@QueryMap keys must be of type String: " + typeM17026d, new Object[0]);
                                                }
                                                c6554v2.m13156f(C8778b.m17026d(1, parameterizedType), annotationArr3);
                                                c6548p2 = new AbstractC6549q.k<>(method2, i13, ((InterfaceC7444u) annotation).encoded());
                                            } else if (annotation instanceof InterfaceC7432i) {
                                                aVar5.m13150c(i13, type);
                                                String strValue3 = ((InterfaceC7432i) annotation).value();
                                                Class<?> clsM17027e4 = C8778b.m17027e(type);
                                                if (Iterable.class.isAssignableFrom(clsM17027e4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw C8778b.m17032j(method2, i13, clsM17027e4.getSimpleName() + " must include generic type (e.g., " + clsM17027e4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c6554v2.m13156f(C8778b.m17026d(0, (ParameterizedType) type), annotationArr3);
                                                    c6548p3 = new C6547o(new AbstractC6549q.d(strValue3));
                                                } else if (clsM17027e4.isArray()) {
                                                    c6554v2.m13156f(C6552t.a.m13148a(clsM17027e4.getComponentType()), annotationArr3);
                                                    c6548p3 = new C6548p(new AbstractC6549q.d(strValue3));
                                                } else {
                                                    c6554v2.m13156f(type, annotationArr3);
                                                    c6548p2 = new AbstractC6549q.d<>(strValue3);
                                                }
                                                c6548p2 = c6548p3;
                                            } else if (annotation instanceof InterfaceC7433j) {
                                                if (type == C9095m.class) {
                                                    c6548p2 = new AbstractC6549q.f(i13, method2);
                                                } else {
                                                    aVar5.m13150c(i13, type);
                                                    Class<?> clsM17027e5 = C8778b.m17027e(type);
                                                    if (!Map.class.isAssignableFrom(clsM17027e5)) {
                                                        throw C8778b.m17032j(method2, i13, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeM17028f2 = C8778b.m17028f(type, clsM17027e5);
                                                    if (!(typeM17028f2 instanceof ParameterizedType)) {
                                                        throw C8778b.m17032j(method2, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM17028f2;
                                                    Type typeM17026d2 = C8778b.m17026d(0, parameterizedType2);
                                                    if (String.class != typeM17026d2) {
                                                        throw C8778b.m17032j(method2, i13, "@HeaderMap keys must be of type String: " + typeM17026d2, new Object[0]);
                                                    }
                                                    c6554v2.m13156f(C8778b.m17026d(1, parameterizedType2), annotationArr3);
                                                    c6548p2 = new AbstractC6549q.e<>(method2, i13);
                                                }
                                            } else if (annotation instanceof InterfaceC7426c) {
                                                aVar5.m13150c(i13, type);
                                                if (!aVar6.f37330p) {
                                                    throw C8778b.m17032j(method2, i13, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC7426c interfaceC7426c = (InterfaceC7426c) annotation;
                                                String strValue4 = interfaceC7426c.value();
                                                boolean zEncoded3 = interfaceC7426c.encoded();
                                                aVar6.f37320f = true;
                                                Class<?> clsM17027e6 = C8778b.m17027e(type);
                                                if (Iterable.class.isAssignableFrom(clsM17027e6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw C8778b.m17032j(method2, i13, clsM17027e6.getSimpleName() + " must include generic type (e.g., " + clsM17027e6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c6554v2.m13156f(C8778b.m17026d(0, (ParameterizedType) type), annotationArr3);
                                                    c6548p3 = new C6547o(new AbstractC6549q.b(strValue4, zEncoded3));
                                                } else if (clsM17027e6.isArray()) {
                                                    c6554v2.m13156f(C6552t.a.m13148a(clsM17027e6.getComponentType()), annotationArr3);
                                                    c6548p3 = new C6548p(new AbstractC6549q.b(strValue4, zEncoded3));
                                                } else {
                                                    c6554v2.m13156f(type, annotationArr3);
                                                    c6548p2 = new AbstractC6549q.b<>(strValue4, zEncoded3);
                                                }
                                                c6548p2 = c6548p3;
                                            } else if (annotation instanceof InterfaceC7427d) {
                                                aVar5.m13150c(i13, type);
                                                if (!aVar6.f37330p) {
                                                    throw C8778b.m17032j(method2, i13, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsM17027e7 = C8778b.m17027e(type);
                                                if (!Map.class.isAssignableFrom(clsM17027e7)) {
                                                    throw C8778b.m17032j(method2, i13, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM17028f3 = C8778b.m17028f(type, clsM17027e7);
                                                if (!(typeM17028f3 instanceof ParameterizedType)) {
                                                    throw C8778b.m17032j(method2, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM17028f3;
                                                Type typeM17026d3 = C8778b.m17026d(0, parameterizedType3);
                                                if (String.class != typeM17026d3) {
                                                    throw C8778b.m17032j(method2, i13, "@FieldMap keys must be of type String: " + typeM17026d3, new Object[0]);
                                                }
                                                c6554v2.m13156f(C8778b.m17026d(1, parameterizedType3), annotationArr3);
                                                aVar6.f37320f = true;
                                                c6548p2 = new AbstractC6549q.c<>(method2, i13, ((InterfaceC7427d) annotation).encoded());
                                            } else {
                                                boolean z16 = annotation instanceof InterfaceC7440q;
                                                Annotation[] annotationArr4 = aVar6.f37317c;
                                                if (z16) {
                                                    aVar5.m13150c(i13, type);
                                                    if (!aVar6.f37331q) {
                                                        throw C8778b.m17032j(method2, i13, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    InterfaceC7440q interfaceC7440q = (InterfaceC7440q) annotation;
                                                    aVar6.f37321g = true;
                                                    String strValue5 = interfaceC7440q.value();
                                                    Class<?> clsM17027e8 = C8778b.m17027e(type);
                                                    if (strValue5.isEmpty()) {
                                                        boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM17027e8);
                                                        AbstractC6549q.m mVar = AbstractC6549q.m.f37279a;
                                                        if (!zIsAssignableFrom) {
                                                            if (clsM17027e8.isArray()) {
                                                                if (!C9099q.c.class.isAssignableFrom(clsM17027e8.getComponentType())) {
                                                                    throw C8778b.m17032j(method2, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                                c6548p2 = new C6548p(mVar);
                                                            } else {
                                                                if (!C9099q.c.class.isAssignableFrom(clsM17027e8)) {
                                                                    throw C8778b.m17032j(method2, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                                gVar = mVar;
                                                            }
                                                            aVar3 = aVar4;
                                                        } else {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw C8778b.m17032j(method2, i13, clsM17027e8.getSimpleName() + " must include generic type (e.g., " + clsM17027e8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!C9099q.c.class.isAssignableFrom(C8778b.m17027e(C8778b.m17026d(0, (ParameterizedType) type)))) {
                                                                throw C8778b.m17032j(method2, i13, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c6548p2 = new C6547o(mVar);
                                                        }
                                                    } else {
                                                        C6552t.a aVar7 = aVar4;
                                                        C9095m c9095mM17319c = C9095m.b.m17319c("Content-Disposition", C0141b.m611g("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC7440q.encoding());
                                                        if (!Iterable.class.isAssignableFrom(clsM17027e8)) {
                                                            if (clsM17027e8.isArray()) {
                                                                Class<?> clsM13148a = C6552t.a.m13148a(clsM17027e8.getComponentType());
                                                                if (C9099q.c.class.isAssignableFrom(clsM13148a)) {
                                                                    throw C8778b.m17032j(method2, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                c6548p = new C6548p(new AbstractC6549q.g(method2, i13, c9095mM17319c, c6554v2.m13155e(clsM13148a, annotationArr3, annotationArr4)));
                                                            } else {
                                                                if (C9099q.c.class.isAssignableFrom(clsM17027e8)) {
                                                                    throw C8778b.m17032j(method2, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                                gVar = new AbstractC6549q.g<>(method2, i13, c9095mM17319c, c6554v2.m13155e(type, annotationArr3, annotationArr4));
                                                            }
                                                            aVar3 = aVar7;
                                                        } else {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw C8778b.m17032j(method2, i13, clsM17027e8.getSimpleName() + " must include generic type (e.g., " + clsM17027e8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type typeM17026d4 = C8778b.m17026d(0, (ParameterizedType) type);
                                                            if (C9099q.c.class.isAssignableFrom(C8778b.m17027e(typeM17026d4))) {
                                                                throw C8778b.m17032j(method2, i13, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c6548p = new C6547o(new AbstractC6549q.g(method2, i13, c9095mM17319c, c6554v2.m13155e(typeM17026d4, annotationArr3, annotationArr4)));
                                                        }
                                                        gVar = c6548p;
                                                        aVar3 = aVar7;
                                                    }
                                                } else {
                                                    C6552t.a aVar8 = aVar4;
                                                    if (annotation instanceof InterfaceC7441r) {
                                                        aVar3 = aVar8;
                                                        aVar3.m13150c(i13, type);
                                                        if (!aVar3.f37331q) {
                                                            throw C8778b.m17032j(method2, i13, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        aVar3.f37321g = true;
                                                        Class<?> clsM17027e9 = C8778b.m17027e(type);
                                                        if (!Map.class.isAssignableFrom(clsM17027e9)) {
                                                            throw C8778b.m17032j(method2, i13, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeM17028f4 = C8778b.m17028f(type, clsM17027e9);
                                                        if (!(typeM17028f4 instanceof ParameterizedType)) {
                                                            throw C8778b.m17032j(method2, i13, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) typeM17028f4;
                                                        Type typeM17026d5 = C8778b.m17026d(0, parameterizedType4);
                                                        if (String.class != typeM17026d5) {
                                                            throw C8778b.m17032j(method2, i13, "@PartMap keys must be of type String: " + typeM17026d5, new Object[0]);
                                                        }
                                                        Type typeM17026d6 = C8778b.m17026d(1, parameterizedType4);
                                                        if (C9099q.c.class.isAssignableFrom(C8778b.m17027e(typeM17026d6))) {
                                                            throw C8778b.m17032j(method2, i13, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        oVar = new AbstractC6549q.h<>(method2, i13, c6554v2.m13155e(typeM17026d6, annotationArr3, annotationArr4), ((InterfaceC7441r) annotation).encoding());
                                                    } else {
                                                        aVar3 = aVar8;
                                                        if (annotation instanceof InterfaceC7424a) {
                                                            aVar3.m13150c(i13, type);
                                                            if (aVar3.f37330p || aVar3.f37331q) {
                                                                throw C8778b.m17032j(method2, i13, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                            }
                                                            if (aVar3.f37322h) {
                                                                throw C8778b.m17032j(method2, i13, "Multiple @Body method annotations found.", new Object[0]);
                                                            }
                                                            try {
                                                                InterfaceC6538f<T, AbstractC9105w> interfaceC6538fM13155e = c6554v2.m13155e(type, annotationArr3, annotationArr4);
                                                                aVar3.f37322h = true;
                                                                oVar = new AbstractC6549q.a<>(method2, i13, interfaceC6538fM13155e);
                                                            } catch (RuntimeException e10) {
                                                                throw C8778b.m17033k(method2, e10, i13, "Unable to create @Body converter for %s", type);
                                                            }
                                                        } else if (annotation instanceof InterfaceC7447x) {
                                                            aVar3.m13150c(i13, type);
                                                            Class<?> clsM17027e10 = C8778b.m17027e(type);
                                                            for (int i20 = i13 - 1; i20 >= 0; i20--) {
                                                                AbstractC6549q<?> abstractC6549q2 = aVar3.f37336v[i20];
                                                                if ((abstractC6549q2 instanceof AbstractC6549q.o) && ((AbstractC6549q.o) abstractC6549q2).f37282a.equals(clsM17027e10)) {
                                                                    throw C8778b.m17032j(method2, i13, "@Tag type " + clsM17027e10.getName() + " is duplicate of parameter #" + (i20 + 1) + " and would always overwrite its value.", new Object[0]);
                                                                }
                                                            }
                                                            oVar = new AbstractC6549q.o<>(clsM17027e10);
                                                        } else {
                                                            gVar = null;
                                                        }
                                                    }
                                                    gVar = oVar;
                                                }
                                                aVar5 = aVar3;
                                                aVar6 = aVar5;
                                            }
                                            gVar = c6548p2;
                                            aVar3 = aVar4;
                                        }
                                    }
                                }
                                if (gVar != null) {
                                    if (abstractC6549q == null) {
                                        throw C8778b.m17032j(method2, i13, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    abstractC6549q = gVar;
                                }
                                i16 = i12 + 1;
                                aVar4 = aVar3;
                                length2 = i17;
                                i15 = i18;
                                length3 = i19;
                                str3 = str2;
                                abstractC6549qArr3 = abstractC6549qArr2;
                                z14 = z12;
                            }
                            z12 = z14;
                            abstractC6549qArr2 = abstractC6549qArr3;
                            aVar3 = aVar4;
                            i12 = i16;
                            if (gVar != null) {
                                if (abstractC6549q == null) {
                                    throw C8778b.m17032j(method2, i13, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                abstractC6549q = gVar;
                            }
                            i16 = i12 + 1;
                            aVar4 = aVar3;
                            length2 = i17;
                            i15 = i18;
                            length3 = i19;
                            str3 = str2;
                            abstractC6549qArr3 = abstractC6549qArr2;
                            z14 = z12;
                        }
                        aVar = aVar4;
                        i10 = length2;
                        i11 = i15;
                        z11 = z14;
                        str = str3;
                        abstractC6549qArr = abstractC6549qArr3;
                        aVar2 = aVar5;
                        aVar5 = aVar6;
                    } else {
                        aVar = aVar4;
                        i10 = length2;
                        i11 = i15;
                        z11 = z14;
                        str = str3;
                        abstractC6549qArr = abstractC6549qArr3;
                        abstractC6549q = null;
                        aVar2 = aVar5;
                    }
                    if (abstractC6549q == null) {
                        if (z11) {
                            try {
                                if (C8778b.m17027e(type) == InterfaceC9968c.class) {
                                    aVar5.f37337w = true;
                                    abstractC6549q = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw C8778b.m17032j(method2, i13, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC6549qArr[i13] = abstractC6549q;
                    i13++;
                    z14 = false;
                    z13 = true;
                    aVar4 = aVar;
                    aVar5 = aVar2;
                    annotationArr2 = annotationArr2;
                    length2 = i10;
                    i15 = i11;
                    str3 = str;
                }
                String str4 = str3;
                if (aVar5.f37332r == null && !aVar5.f37327m) {
                    throw C8778b.m17031i(method2, null, "Missing either @%s URL or @Url parameter.", aVar5.f37328n);
                }
                boolean z17 = aVar5.f37330p;
                if (!z17 && !aVar5.f37331q && !aVar5.f37329o && aVar5.f37322h) {
                    throw C8778b.m17031i(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z17 && !aVar5.f37320f) {
                    throw C8778b.m17031i(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar5.f37331q && !aVar5.f37321g) {
                    throw C8778b.m17031i(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C6552t c6552t = new C6552t(aVar5);
                Type genericReturnType2 = method.getGenericReturnType();
                if (C8778b.m17029g(genericReturnType2)) {
                    throw C8778b.m17031i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw C8778b.m17031i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z18 = c6552t.f37312k;
                if (z18) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM17026d7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM17026d7 instanceof WildcardType) {
                        typeM17026d7 = ((WildcardType) typeM17026d7).getLowerBounds()[0];
                    }
                    if (C8778b.m17027e(typeM17026d7) == C6553u.class && (typeM17026d7 instanceof ParameterizedType)) {
                        typeM17026d7 = C8778b.m17026d(0, (ParameterizedType) typeM17026d7);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    genericReturnType = new C8778b.b(null, InterfaceC6534b.class, typeM17026d7);
                    if (!C8778b.m17030h(annotations, InterfaceC6556x.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = C6557y.f37351a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z10 = false;
                }
                try {
                    InterfaceC6535c<?, ?> interfaceC6535cM13151a = c6554v.m13151a(genericReturnType, annotations);
                    Type typeMo13126a = interfaceC6535cM13151a.mo13126a();
                    if (typeMo13126a == C9106x.class) {
                        throw C8778b.m17031i(method, null, "'" + C8778b.m17027e(typeMo13126a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo13126a == C6553u.class) {
                        throw C8778b.m17031i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c6552t.f37304c.equals(str4) && !Void.class.equals(typeMo13126a)) {
                        throw C8778b.m17031i(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC6538f<AbstractC9107y, T> interfaceC6538fM13154d = c6554v.m13154d(null, typeMo13126a, method.getAnnotations());
                        InterfaceC9086d.a aVar9 = c6554v.f37342b;
                        if (z18) {
                            return z10 ? new AbstractC8777a.c(c6552t, aVar9, interfaceC6538fM13154d, interfaceC6535cM13151a) : new AbstractC8777a.b(c6552t, aVar9, interfaceC6538fM13154d, interfaceC6535cM13151a);
                        }
                        return new AbstractC8777a.a(c6552t, aVar9, interfaceC6538fM13154d, interfaceC6535cM13151a);
                    } catch (RuntimeException e11) {
                        throw C8778b.m17031i(method, e11, "Unable to create converter for %s", typeMo13126a);
                    }
                } catch (RuntimeException e12) {
                    throw C8778b.m17031i(method, e12, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i14];
            if (annotation2 instanceof InterfaceC7425b) {
                aVar4.m13149b("DELETE", ((InterfaceC7425b) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC7429f) {
                aVar4.m13149b("GET", ((InterfaceC7429f) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC7430g) {
                aVar4.m13149b("HEAD", ((InterfaceC7430g) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC7437n) {
                aVar4.m13149b("PATCH", ((InterfaceC7437n) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC7438o) {
                aVar4.m13149b("POST", ((InterfaceC7438o) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC7439p) {
                aVar4.m13149b("PUT", ((InterfaceC7439p) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC7436m) {
                aVar4.m13149b("OPTIONS", ((InterfaceC7436m) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC7431h) {
                InterfaceC7431h interfaceC7431h = (InterfaceC7431h) annotation2;
                aVar4.m13149b(interfaceC7431h.method(), interfaceC7431h.path(), interfaceC7431h.hasBody());
            } else if (annotation2 instanceof InterfaceC7434k) {
                String[] strArrValue = ((InterfaceC7434k) annotation2).value();
                if (strArrValue.length == 0) {
                    throw C8778b.m17031i(method2, null, "@Headers annotation is empty.", new Object[0]);
                }
                C9095m.a aVar10 = new C9095m.a();
                for (String str5 : strArrValue) {
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw C8778b.m17031i(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Pattern pattern = C9098p.f47473d;
                            aVar4.f37334t = C9098p.a.m17339a(strTrim);
                        } catch (IllegalArgumentException e13) {
                            throw C8778b.m17031i(method2, e13, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        aVar10.m17311a(strSubstring, strTrim);
                    }
                }
                aVar4.f37333s = aVar10.m17314d();
            } else if (annotation2 instanceof InterfaceC7435l) {
                if (aVar4.f37330p) {
                    throw C8778b.m17031i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar4.f37331q = true;
            } else if (!(annotation2 instanceof InterfaceC7428e)) {
                continue;
            } else {
                if (aVar4.f37331q) {
                    throw C8778b.m17031i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar4.f37330p = true;
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo13158a(Object[] objArr);
}
