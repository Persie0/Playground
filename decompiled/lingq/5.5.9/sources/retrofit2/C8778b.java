package retrofit2;

import android.support.v4.media.C0141b;
import com.kochava.core.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p003a2.C0009a;

/* JADX INFO: renamed from: retrofit2.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8778b {

    /* JADX INFO: renamed from: a */
    public static final Type[] f46528a = new Type[0];

    /* JADX INFO: renamed from: retrofit2.b$a */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        public final Type f46529a;

        public a(Type type) {
            this.f46529a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8778b.m17024b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f46529a;
        }

        public final int hashCode() {
            return this.f46529a.hashCode();
        }

        public final String toString() {
            return C8778b.m17036n(this.f46529a) + BuildConfig.SDK_PERMISSIONS;
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$b */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        public final Type f46530a;

        /* JADX INFO: renamed from: b */
        public final Type f46531b;

        /* JADX INFO: renamed from: c */
        public final Type[] f46532c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                boolean z10 = true;
                boolean z11 = type == null;
                if (((Class) type2).getEnclosingClass() != null) {
                    z10 = false;
                }
                if (z11 != z10) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C8778b.m17023a(type3);
            }
            this.f46530a = type;
            this.f46531b = type2;
            this.f46532c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8778b.m17024b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f46532c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f46530a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f46531b;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f46532c) ^ this.f46531b.hashCode();
            Type type = this.f46530a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f46532c;
            int length = typeArr.length;
            Type type = this.f46531b;
            if (length == 0) {
                return C8778b.m17036n(type);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(C8778b.m17036n(type));
            sb2.append("<");
            sb2.append(C8778b.m17036n(typeArr[0]));
            for (int i10 = 1; i10 < typeArr.length; i10++) {
                sb2.append(", ");
                sb2.append(C8778b.m17036n(typeArr[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$c */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a */
        public final Type f46533a;

        /* JADX INFO: renamed from: b */
        public final Type f46534b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                C8778b.m17023a(type);
                this.f46534b = null;
                this.f46533a = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            C8778b.m17023a(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f46534b = typeArr2[0];
            this.f46533a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8778b.m17024b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f46534b;
            return type != null ? new Type[]{type} : C8778b.f46528a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f46533a};
        }

        public final int hashCode() {
            Type type = this.f46534b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f46533a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f46534b;
            if (type != null) {
                return "? super " + C8778b.m17036n(type);
            }
            Type type2 = this.f46533a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C8778b.m17036n(type2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m17023a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17024b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m17024b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: c */
    public static Type m17025c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m17025c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m17025c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static Type m17026d(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder sbM614j = C0141b.m614j("Index ", i10, " not in range [0,");
        sbM614j.append(actualTypeArguments.length);
        sbM614j.append(") for ");
        sbM614j.append(parameterizedType);
        throw new IllegalArgumentException(sbM614j.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public static Class<?> m17027e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m17027e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m17027e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: f */
    public static Type m17028f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m17034l(type, cls, m17025c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17029g(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m17029g(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m17029g(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof TypeVariable) && !(type instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17030h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static IllegalArgumentException m17031i(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM26o = C0009a.m26o(String.format(str, objArr), "\n    for method ");
        sbM26o.append(method.getDeclaringClass().getSimpleName());
        sbM26o.append(".");
        sbM26o.append(method.getName());
        return new IllegalArgumentException(sbM26o.toString(), exc);
    }

    /* JADX INFO: renamed from: j */
    public static IllegalArgumentException m17032j(Method method, int i10, String str, Object... objArr) {
        StringBuilder sbM26o = C0009a.m26o(str, " (parameter #");
        sbM26o.append(i10 + 1);
        sbM26o.append(")");
        return m17031i(method, null, sbM26o.toString(), objArr);
    }

    /* JADX INFO: renamed from: k */
    public static IllegalArgumentException m17033k(Method method, Exception exc, int i10, String str, Object... objArr) {
        StringBuilder sbM26o = C0009a.m26o(str, " (parameter #");
        sbM26o.append(i10 + 1);
        sbM26o.append(")");
        return m17031i(method, exc, sbM26o.toString(), objArr);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[LOOP:0: B:2:0x0000->B:25:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0055 A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public static Type m17034l(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeM17034l;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i10 = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM17034l2 = m17034l(type, cls, componentType);
                        return componentType == typeM17034l2 ? cls2 : new a(typeM17034l2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM17034l3 = m17034l(type, cls, genericComponentType);
                    return genericComponentType == typeM17034l3 ? genericArrayType : new a(typeM17034l3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM17034l4 = m17034l(type, cls, ownerType);
                    boolean z10 = typeM17034l4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type typeM17034l5 = m17034l(type, cls, actualTypeArguments[i10]);
                        if (typeM17034l5 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = typeM17034l5;
                        }
                        i10++;
                    }
                    return z10 ? new b(typeM17034l4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM17034l6 = m17034l(type, cls, lowerBounds[0]);
                        if (typeM17034l6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new c(new Type[]{Object.class}, new Type[]{typeM17034l6});
                        }
                    } else if (upperBounds.length == 1 && (typeM17034l = m17034l(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new c(new Type[]{typeM17034l}, f46528a);
                    }
                }
                type3 = type5;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                type3 = wildcardType;
                type3 = type5;
                return type3;
            }
            TypeVariable typeVariable = (TypeVariable) type5;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type typeM17025c = m17025c(type, cls, cls3);
                if (typeM17025c instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type4 = ((ParameterizedType) typeM17025c).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                }
                if (type4 == typeVariable) {
                    return type4;
                }
                type5 = type4;
            }
            type4 = typeVariable;
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: m */
    public static void m17035m(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m17036n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
