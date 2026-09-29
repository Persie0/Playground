package p465wm;

import dm.C5206f;
import dm.C5207g;
import in.C6357a;
import in.C6361e;
import in.InterfaceC6367k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.C6901a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import mn.C7645b;
import mn.C7648e;
import mn.C7650g;
import mo.C7661i;
import p248ln.C7400a;
import p248ln.C7404e;
import p338qd.C8584v;

/* JADX INFO: renamed from: wm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9973c implements InterfaceC6367k {

    /* JADX INFO: renamed from: a */
    public final Class<?> f50697a;

    /* JADX INFO: renamed from: b */
    public final KotlinClassHeader f50698b;

    /* JADX INFO: renamed from: wm.c$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C9973c m18552a(Class cls) throws InvocationTargetException {
            KotlinClassHeader kotlinClassHeader;
            C5207g.m11111f(cls, "klass");
            C6901a c6901a = new C6901a();
            C8584v.m16797v(cls, c6901a);
            if (c6901a.f38924g == null || c6901a.f38918a == null) {
                kotlinClassHeader = null;
            } else {
                boolean z10 = true;
                C7404e c7404e = new C7404e(c6901a.f38918a, (c6901a.f38920c & 8) != 0);
                if (c7404e.m14806c()) {
                    KotlinClassHeader.Kind kind = c6901a.f38924g;
                    if (kind != KotlinClassHeader.Kind.CLASS && kind != KotlinClassHeader.Kind.FILE_FACADE && kind != KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                        z10 = false;
                    }
                    if (z10 && c6901a.f38921d == null) {
                        kotlinClassHeader = null;
                    }
                } else {
                    c6901a.f38923f = c6901a.f38921d;
                    c6901a.f38921d = null;
                }
                String[] strArr = c6901a.f38925h;
                if (strArr != null) {
                    C7400a.m14800b(strArr);
                }
                kotlinClassHeader = new KotlinClassHeader(c6901a.f38924g, c7404e, c6901a.f38921d, c6901a.f38923f, c6901a.f38922e, c6901a.f38919b, c6901a.f38920c);
            }
            if (kotlinClassHeader == null) {
                return null;
            }
            return new C9973c(cls, kotlinClassHeader);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9973c() {
        throw null;
    }

    public C9973c(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f50697a = cls;
        this.f50698b = kotlinClassHeader;
    }

    @Override // in.InterfaceC6367k
    /* JADX INFO: renamed from: a */
    public final KotlinClassHeader mo12999a() {
        return this.f50698b;
    }

    @Override // in.InterfaceC6367k
    /* JADX INFO: renamed from: b */
    public final void mo13000b(InterfaceC6367k.c cVar) throws InvocationTargetException {
        C8584v.m16797v(this.f50697a, cVar);
    }

    @Override // in.InterfaceC6367k
    /* JADX INFO: renamed from: c */
    public final void mo13001c(C6357a c6357a) throws InvocationTargetException {
        String str;
        String str2;
        String str3;
        Class<?> cls = this.f50697a;
        C5207g.m11111f(cls, "klass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C5207g.m11110e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            str3 = "sb.toString()";
            if (i10 >= length) {
                break;
            }
            Method method = declaredMethods[i10];
            C7648e c7648eM15232l = C7648e.m15232l(method.getName());
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            C5207g.m11110e(parameterTypes, "method.parameterTypes");
            for (Class<?> cls2 : parameterTypes) {
                C5207g.m11110e(cls2, "parameterType");
                sb2.append(ReflectClassUtilKt.m13649b(cls2));
            }
            sb2.append(")");
            Class<?> returnType = method.getReturnType();
            C5207g.m11110e(returnType, "method.returnType");
            sb2.append(ReflectClassUtilKt.m13649b(returnType));
            String string = sb2.toString();
            C5207g.m11110e(string, "sb.toString()");
            C6357a.a aVarM12970b = c6357a.m12970b(c7648eM15232l, string);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            C5207g.m11110e(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                C5207g.m11110e(annotation, "annotation");
                C8584v.m16800y(aVarM12970b, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            C5207g.m11110e(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                Annotation[] annotationArr2 = annotationArr[i11];
                C5207g.m11110e(annotationArr2, "annotations");
                int length3 = annotationArr2.length;
                int i12 = 0;
                while (i12 < length3) {
                    Annotation annotation2 = annotationArr2[i12];
                    Class clsM10998T0 = C5206f.m10998T0(C5206f.m10995P0(annotation2));
                    Method[] methodArr = declaredMethods;
                    C6361e c6361eM12971c = aVarM12970b.m12971c(i11, ReflectClassUtilKt.m13648a(clsM10998T0), new C9971a(annotation2));
                    if (c6361eM12971c != null) {
                        C8584v.m16801z(c6361eM12971c, annotation2, clsM10998T0);
                    }
                    i12++;
                    declaredMethods = methodArr;
                }
            }
            aVarM12970b.mo12972a();
            i10++;
            declaredMethods = declaredMethods;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        C5207g.m11110e(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i13 = 0;
        while (i13 < length4) {
            Constructor<?> constructor = declaredConstructors[i13];
            C7648e c7648e = C7650g.f42093e;
            C5207g.m11110e(constructor, "constructor");
            StringBuilder sb3 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            C5207g.m11110e(parameterTypes2, "constructor.parameterTypes");
            int length5 = parameterTypes2.length;
            int i14 = 0;
            while (i14 < length5) {
                Constructor<?>[] constructorArr = declaredConstructors;
                Class<?> cls3 = parameterTypes2[i14];
                C5207g.m11110e(cls3, str2);
                sb3.append(ReflectClassUtilKt.m13649b(cls3));
                i14++;
                declaredConstructors = constructorArr;
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            sb3.append(")V");
            String string2 = sb3.toString();
            C5207g.m11110e(string2, str3);
            C6357a.a aVarM12970b2 = c6357a.m12970b(c7648e, string2);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            C5207g.m11110e(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                C5207g.m11110e(annotation3, "annotation");
                C8584v.m16800y(aVarM12970b2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            C5207g.m11110e(parameterAnnotations2, "parameterAnnotations");
            if (!(parameterAnnotations2.length == 0)) {
                int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length7 = parameterAnnotations2.length;
                int i15 = 0;
                while (i15 < length7) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i15];
                    C5207g.m11110e(annotationArr3, str);
                    int length8 = annotationArr3.length;
                    int i16 = length4;
                    int i17 = 0;
                    while (i17 < length8) {
                        Annotation[][] annotationArr4 = parameterAnnotations2;
                        Annotation annotation4 = annotationArr3[i17];
                        String str4 = str;
                        Class clsM10998T1 = C5206f.m10998T0(C5206f.m10995P0(annotation4));
                        String str5 = str2;
                        int i18 = length6;
                        String str6 = str3;
                        C6361e c6361eM12971c2 = aVarM12970b2.m12971c(i15 + length6, ReflectClassUtilKt.m13648a(clsM10998T1), new C9971a(annotation4));
                        if (c6361eM12971c2 != null) {
                            C8584v.m16801z(c6361eM12971c2, annotation4, clsM10998T1);
                        }
                        i17++;
                        parameterAnnotations2 = annotationArr4;
                        str2 = str5;
                        str = str4;
                        length6 = i18;
                        str3 = str6;
                    }
                    i15++;
                    length4 = i16;
                }
            }
            aVarM12970b2.mo12972a();
            i13++;
            declaredConstructors = constructorArr2;
            length4 = length4;
            str2 = str2;
            str = str;
            str3 = str3;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        C5207g.m11110e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            C7648e c7648eM15232l2 = C7648e.m15232l(field.getName());
            Class<?> type = field.getType();
            C5207g.m11110e(type, "field.type");
            C6357a.b bVarM12969a = c6357a.m12969a(c7648eM15232l2, ReflectClassUtilKt.m13649b(type));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            C5207g.m11110e(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                C5207g.m11110e(annotation5, "annotation");
                C8584v.m16800y(bVarM12969a, annotation5);
            }
            bVarM12969a.mo12972a();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9973c) {
            if (C5207g.m11106a(this.f50697a, ((C9973c) obj).f50697a)) {
                return true;
            }
        }
        return false;
    }

    @Override // in.InterfaceC6367k
    public final String getLocation() {
        return C7661i.m15253S2(this.f50697a.getName(), '.', '/').concat(".class");
    }

    public final int hashCode() {
        return this.f50697a.hashCode();
    }

    @Override // in.InterfaceC6367k
    /* JADX INFO: renamed from: j */
    public final C7645b mo13002j() {
        return ReflectClassUtilKt.m13648a(this.f50697a);
    }

    public final String toString() {
        return C9973c.class.getName() + ": " + this.f50697a;
    }
}
