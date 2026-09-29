package kotlin.reflect.jvm.internal.calls;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C6740a;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationConstructorCallerKt {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$a */
    public static final class C6787a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Class<T> f38304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map<String, Object> f38305b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC9070c<String> f38306c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC9070c<Integer> f38307d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ List<Method> f38308e;

        public C6787a(Class<T> cls, Map<String, ? extends Object> map, InterfaceC9070c<String> interfaceC9070c, InterfaceC9070c<Integer> interfaceC9070c2, List<Method> list) {
            this.f38304a = cls;
            this.f38305b = map;
            this.f38306c = interfaceC9070c;
            this.f38307d = interfaceC9070c2;
            this.f38308e = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            boolean zM11106a;
            boolean z10;
            String name = method.getName();
            GenericDeclaration genericDeclaration = this.f38304a;
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != 147696667) {
                        if (iHashCode == 1444986633 && name.equals("annotationType")) {
                            return genericDeclaration;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(this.f38307d.getValue().intValue());
                    }
                } else if (name.equals("toString")) {
                    return this.f38306c.getValue();
                }
            }
            boolean zM11106a2 = C5207g.m11106a(name, "equals");
            Map<String, Object> map = this.f38305b;
            boolean z11 = false;
            if (zM11106a2) {
                if (objArr != null && objArr.length == 1) {
                    C5207g.m11110e(objArr, "args");
                    Object objM13388t0 = C6744b.m13388t0(objArr);
                    Class clsM10998T0 = null;
                    Annotation annotation = objM13388t0 instanceof Annotation ? (Annotation) objM13388t0 : null;
                    if (annotation != null) {
                        clsM10998T0 = C5206f.m10998T0(C5206f.m10995P0(annotation));
                    }
                    if (C5207g.m11106a(clsM10998T0, genericDeclaration)) {
                        List<Method> list = this.f38308e;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                Method method2 = (Method) it.next();
                                Object obj2 = map.get(method2.getName());
                                Object objInvoke = method2.invoke(objM13388t0, new Object[0]);
                                if (obj2 instanceof boolean[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                    zM11106a = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                                } else if (obj2 instanceof char[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                                    zM11106a = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                                } else if (obj2 instanceof byte[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                    zM11106a = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                                } else if (obj2 instanceof short[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                    zM11106a = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                                } else if (obj2 instanceof int[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                                    zM11106a = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                                } else if (obj2 instanceof float[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                    zM11106a = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                                } else if (obj2 instanceof long[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                                    zM11106a = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                                } else if (obj2 instanceof double[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                    zM11106a = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                                } else if (obj2 instanceof Object[]) {
                                    C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                    zM11106a = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                                } else {
                                    zM11106a = C5207g.m11106a(obj2, objInvoke);
                                }
                                if (!zM11106a) {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                        if (z10) {
                            z11 = true;
                        }
                    }
                    return Boolean.valueOf(z11);
                }
            }
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(C6744b.m13391w0(objArr));
            sb2.append(')');
            throw new KotlinReflectionInternalError(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> T m13525a(final Class<T> cls, final Map<String, ? extends Object> map, List<Method> list) {
        C5207g.m11111f(cls, "annotationClass");
        C5207g.m11111f(list, "methods");
        InterfaceC9070c interfaceC9070cM13372a = C6740a.m13372a(new InterfaceC2041a<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Integer mo807E() {
                int iHashCode;
                Iterator<T> it = map.entrySet().iterator();
                int iHashCode2 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            }
        });
        T t10 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C6787a(cls, map, C6740a.m13372a(new InterfaceC2041a<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final String mo807E() throws IOException {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(cls.getCanonicalName());
                C6752c.m13429W(map.entrySet(), sb2, ", ", "(", ")", new InterfaceC2052l<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final CharSequence mo528n(Map.Entry<? extends String, ? extends Object> entry) {
                        String string;
                        Map.Entry<? extends String, ? extends Object> entry2 = entry;
                        C5207g.m11111f(entry2, "entry");
                        String key = entry2.getKey();
                        Object value = entry2.getValue();
                        if (value instanceof boolean[]) {
                            string = Arrays.toString((boolean[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof char[]) {
                            string = Arrays.toString((char[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof byte[]) {
                            string = Arrays.toString((byte[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof short[]) {
                            string = Arrays.toString((short[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof int[]) {
                            string = Arrays.toString((int[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof float[]) {
                            string = Arrays.toString((float[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof long[]) {
                            string = Arrays.toString((long[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof double[]) {
                            string = Arrays.toString((double[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else if (value instanceof Object[]) {
                            string = Arrays.toString((Object[]) value);
                            C5207g.m11110e(string, "toString(this)");
                        } else {
                            string = value.toString();
                        }
                        return key + '=' + string;
                    }
                }, 48);
                String string = sb2.toString();
                C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
        }), interfaceC9070cM13372a, list));
        C5207g.m11109d(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }
}
