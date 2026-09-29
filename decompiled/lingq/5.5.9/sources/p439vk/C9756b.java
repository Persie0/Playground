package p439vk;

import com.kochava.core.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.C9312p;
import tk.InterfaceC9308l;

/* JADX INFO: renamed from: vk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9756b {

    /* JADX INFO: renamed from: a */
    public static final Set<Annotation> f49811a = Collections.emptySet();

    /* JADX INFO: renamed from: b */
    public static final Type[] f49812b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Class<?> f49813c;

    /* JADX INFO: renamed from: d */
    public static final Class<? extends Annotation> f49814d;

    /* JADX INFO: renamed from: e */
    public static final Map<Class<?>, Class<?>> f49815e;

    /* JADX INFO: renamed from: vk.b$a */
    public static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        public final Type f49816a;

        public a(Type type) {
            this.f49816a = C9756b.m18242a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C9312p.m17657b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f49816a;
        }

        public final int hashCode() {
            return this.f49816a.hashCode();
        }

        public final String toString() {
            return C9756b.m18253l(this.f49816a) + BuildConfig.SDK_PERMISSIONS;
        }
    }

    /* JADX INFO: renamed from: vk.b$b */
    public static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        public final Type f49817a;

        /* JADX INFO: renamed from: b */
        public final Type f49818b;

        /* JADX INFO: renamed from: c */
        public final Type[] f49819c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C9312p.m17658c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f49817a = type == null ? null : C9756b.m18242a(type);
            this.f49818b = C9756b.m18242a(type2);
            this.f49819c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f49819c;
                if (i10 >= typeArr2.length) {
                    return;
                }
                Type type3 = typeArr2[i10];
                type3.getClass();
                C9756b.m18243b(type3);
                Type[] typeArr3 = this.f49819c;
                typeArr3[i10] = C9756b.m18242a(typeArr3[i10]);
                i10++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C9312p.m17657b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f49819c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f49817a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f49818b;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f49819c) ^ this.f49818b.hashCode();
            Set<Annotation> set = C9756b.f49811a;
            Type type = this.f49817a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f49819c;
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(C9756b.m18253l(this.f49818b));
            if (typeArr.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(C9756b.m18253l(typeArr[0]));
            for (int i10 = 1; i10 < typeArr.length; i10++) {
                sb2.append(", ");
                sb2.append(C9756b.m18253l(typeArr[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: vk.b$c */
    public static final class c implements WildcardType {

        /* JADX INFO: renamed from: a */
        public final Type f49820a;

        /* JADX INFO: renamed from: b */
        public final Type f49821b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
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
                C9756b.m18243b(type);
                this.f49821b = null;
                this.f49820a = C9756b.m18242a(typeArr[0]);
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            C9756b.m18243b(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f49821b = C9756b.m18242a(typeArr2[0]);
            this.f49820a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C9312p.m17657b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f49821b;
            return type != null ? new Type[]{type} : C9756b.f49812b;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f49820a};
        }

        public final int hashCode() {
            Type type = this.f49821b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f49820a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f49821b;
            if (type != null) {
                return "? super " + C9756b.m18253l(type);
            }
            Type type2 = this.f49820a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + C9756b.m18253l(type2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<? extends Annotation> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = 0;
        }
        f49814d = cls;
        f49813c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f49815e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static Type m18242a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m18242a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof WildcardType) && !(type instanceof c)) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    /* JADX INFO: renamed from: b */
    public static void m18243b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Type m18244c(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m18244c(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return m18244c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18245d(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18246e(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* JADX INFO: renamed from: f */
    public static Set<? extends Annotation> m18247f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC9308l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f49811a;
    }

    /* JADX INFO: renamed from: g */
    public static JsonDataException m18248g(String str, String str2, JsonReader jsonReader) {
        String strM10509r = jsonReader.m10509r();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, strM10509r) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, strM10509r));
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static Type m18249h(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static Type m18250i(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type type3;
        WildcardType wildcardType;
        Type typeM18250i;
        Type[] upperBounds;
        Type[] lowerBounds;
        TypeVariable typeVariable;
        do {
            int i10 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM18250i2 = m18250i(type, cls, componentType, linkedHashSet);
                        return componentType == typeM18250i2 ? cls2 : new a(typeM18250i2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM18250i3 = m18250i(type, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == typeM18250i3 ? genericArrayType : new a(typeM18250i3);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM18250i4 = m18250i(type, cls, ownerType, linkedHashSet);
                    boolean z10 = typeM18250i4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type typeM18250i5 = m18250i(type, cls, actualTypeArguments[i10], linkedHashSet);
                        if (typeM18250i5 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = typeM18250i5;
                        }
                        i10++;
                    }
                    return z10 ? new b(typeM18250i4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type2 instanceof WildcardType) {
                    wildcardType = (WildcardType) type2;
                    Type[] lowerBounds2 = wildcardType.getLowerBounds();
                    Type[] upperBounds2 = wildcardType.getUpperBounds();
                    if (lowerBounds2.length == 1) {
                        Type typeM18250i6 = m18250i(type, cls, lowerBounds2[0], linkedHashSet);
                        if (typeM18250i6 != lowerBounds2[0]) {
                            if (typeM18250i6 instanceof WildcardType) {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = ((WildcardType) typeM18250i6).getLowerBounds();
                            } else {
                                type3 = type2;
                                type3 = wildcardType;
                                lowerBounds = new Type[]{typeM18250i6};
                            }
                            return new c(new Type[]{Object.class}, lowerBounds);
                        }
                    } else if (upperBounds2.length == 1 && (typeM18250i = m18250i(type, cls, upperBounds2[0], linkedHashSet)) != upperBounds2[0]) {
                        if (typeM18250i instanceof WildcardType) {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = ((WildcardType) typeM18250i).getUpperBounds();
                        } else {
                            type3 = type2;
                            type3 = wildcardType;
                            type3 = wildcardType;
                            upperBounds = new Type[]{typeM18250i};
                        }
                        return new c(upperBounds, f49812b);
                    }
                }
                type3 = type2;
                type3 = wildcardType;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                type3 = wildcardType;
                type3 = type2;
                return type3;
            }
            typeVariable = (TypeVariable) type2;
            if (linkedHashSet.contains(typeVariable)) {
                return type2;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 == null) {
                type2 = typeVariable;
            } else {
                Type typeM18244c = m18244c(type, cls, cls3);
                if (typeM18244c instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i10 >= typeParameters.length) {
                            throw new NoSuchElementException();
                        }
                        if (typeVariable.equals(typeParameters[i10])) {
                            type2 = ((ParameterizedType) typeM18244c).getActualTypeArguments()[i10];
                            break;
                        }
                        i10++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: j */
    public static void m18251j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* JADX INFO: renamed from: k */
    public static String m18252k(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m18253l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: m */
    public static JsonDataException m18254m(String str, String str2, JsonReader jsonReader) {
        String strM10509r = jsonReader.m10509r();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, strM10509r) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, strM10509r));
    }
}
