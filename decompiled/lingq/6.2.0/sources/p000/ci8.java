package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.Lifecycle$State;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ci8 {

    /* JADX INFO: renamed from: a */
    public static final C0282a f10117a;

    /* JADX INFO: renamed from: b */
    public static final C0282a f10118b;

    /* JADX INFO: renamed from: e */
    public static final float f10121e = 30.0f;

    /* JADX INFO: renamed from: f */
    public static final u06 f10122f;

    /* JADX INFO: renamed from: g */
    public static final s46 f10123g;

    /* JADX INFO: renamed from: h */
    public static final gr7 f10124h;

    /* JADX INFO: renamed from: j */
    public static boolean f10126j = true;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f10127k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f10128l = 0;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f10129m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f10130n = 0;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f10131o = 0;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f10132p = 0;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f10133q = 0;

    /* JADX INFO: renamed from: c */
    public static final s53 f10119c = new s53(1);

    /* JADX INFO: renamed from: d */
    public static final fg2 f10120d = new fg2(8);

    /* JADX INFO: renamed from: i */
    public static final Type[] f10125i = new Type[0];

    static {
        final int i = 0;
        f10117a = new C0282a(636288403, false, new cj3() { // from class: pd1
            @Override // p000.cj3
            /* JADX INFO: renamed from: i */
            public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int i2 = i;
                xfa xfaVar = xfa.f68157a;
                nt9 nt9Var = (nt9) obj;
                dt9 dt9Var = (dt9) obj2;
                ui3 ui3Var = (ui3) obj3;
                ye1 ye1Var = (ye1) obj4;
                Integer num = (Integer) obj5;
                switch (i2) {
                    case 0:
                        int iIntValue = num.intValue();
                        int i3 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((tj3) ye1Var).m22120g(nt9Var) : ((tj3) ye1Var).m22124i(nt9Var) ? 4 : 2) : iIntValue;
                        if ((iIntValue & 48) == 0) {
                            i3 |= (iIntValue & 64) == 0 ? ((tj3) ye1Var).m22120g(dt9Var) : ((tj3) ye1Var).m22124i(dt9Var) ? 32 : 16;
                        }
                        if ((iIntValue & 384) == 0) {
                            i3 |= ((tj3) ye1Var).m22124i(ui3Var) ? 256 : 128;
                        }
                        tj3 tj3Var = (tj3) ye1Var;
                        if (!tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
                            tj3Var.m22102U();
                        } else {
                            u82.m22534c(nt9Var, dt9Var, ui3Var, tj3Var, i3 & 1022);
                        }
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((tj3) ye1Var).m22120g(nt9Var) : ((tj3) ye1Var).m22124i(nt9Var) ? 4 : 2) : iIntValue2;
                        if ((iIntValue2 & 48) == 0) {
                            i4 |= (iIntValue2 & 64) == 0 ? ((tj3) ye1Var).m22120g(dt9Var) : ((tj3) ye1Var).m22124i(dt9Var) ? 32 : 16;
                        }
                        if ((iIntValue2 & 384) == 0) {
                            i4 |= ((tj3) ye1Var).m22124i(ui3Var) ? 256 : 128;
                        }
                        tj3 tj3Var2 = (tj3) ye1Var;
                        if (!tj3Var2.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
                            tj3Var2.m22102U();
                        } else {
                            u82.m22534c(nt9Var, dt9Var, ui3Var, tj3Var2, i4 & 1022);
                        }
                        break;
                }
                return xfaVar;
            }
        });
        final int i2 = 1;
        f10118b = new C0282a(-1357803046, false, new cj3() { // from class: pd1
            @Override // p000.cj3
            /* JADX INFO: renamed from: i */
            public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int i3 = i2;
                xfa xfaVar = xfa.f68157a;
                nt9 nt9Var = (nt9) obj;
                dt9 dt9Var = (dt9) obj2;
                ui3 ui3Var = (ui3) obj3;
                ye1 ye1Var = (ye1) obj4;
                Integer num = (Integer) obj5;
                switch (i3) {
                    case 0:
                        int iIntValue = num.intValue();
                        int i4 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? ((tj3) ye1Var).m22120g(nt9Var) : ((tj3) ye1Var).m22124i(nt9Var) ? 4 : 2) : iIntValue;
                        if ((iIntValue & 48) == 0) {
                            i4 |= (iIntValue & 64) == 0 ? ((tj3) ye1Var).m22120g(dt9Var) : ((tj3) ye1Var).m22124i(dt9Var) ? 32 : 16;
                        }
                        if ((iIntValue & 384) == 0) {
                            i4 |= ((tj3) ye1Var).m22124i(ui3Var) ? 256 : 128;
                        }
                        tj3 tj3Var = (tj3) ye1Var;
                        if (!tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
                            tj3Var.m22102U();
                        } else {
                            u82.m22534c(nt9Var, dt9Var, ui3Var, tj3Var, i4 & 1022);
                        }
                        break;
                    default:
                        int iIntValue2 = num.intValue();
                        int i5 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? ((tj3) ye1Var).m22120g(nt9Var) : ((tj3) ye1Var).m22124i(nt9Var) ? 4 : 2) : iIntValue2;
                        if ((iIntValue2 & 48) == 0) {
                            i5 |= (iIntValue2 & 64) == 0 ? ((tj3) ye1Var).m22120g(dt9Var) : ((tj3) ye1Var).m22124i(dt9Var) ? 32 : 16;
                        }
                        if ((iIntValue2 & 384) == 0) {
                            i5 |= ((tj3) ye1Var).m22124i(ui3Var) ? 256 : 128;
                        }
                        tj3 tj3Var2 = (tj3) ye1Var;
                        if (!tj3Var2.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
                            tj3Var2.m22102U();
                        } else {
                            u82.m22534c(nt9Var, dt9Var, ui3Var, tj3Var2, i5 & 1022);
                        }
                        break;
                }
                return xfaVar;
            }
        });
        int i3 = 15;
        f10122f = new u06(i3);
        f10123g = new s46(i3);
        f10124h = new gr7(i3);
    }

    /* JADX INFO: renamed from: A */
    public static Type m4688A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m4688A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m4688A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: B */
    public static Type m4689B(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM22998u = ux5.m22998u("Index ", i, " not in range [0,");
        sbM22998u.append(actualTypeArguments.length);
        sbM22998u.append(") for ");
        sbM22998u.append(parameterizedType);
        throw new IllegalArgumentException(sbM22998u.toString());
    }

    /* JADX INFO: renamed from: C */
    public static Class m4690C(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            ij6.m13959q();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m4690C(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m4690C(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        uk9.m22778m(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final sl8 m4691D(dua duaVar) {
        m58 m58VarM21061i = s46.m21061i(duaVar, new ql8(), 4);
        return (sl8) ((ny8) m58VarM21061i.f50618b).m17675B(y38.m24933a(sl8.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX INFO: renamed from: E */
    public static Type m4692E(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m4704Q(type, cls, m4688A(type, cls, Map.class));
        }
        ij6.m13959q();
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m4693F(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return m4693F(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            uk9.m22776j("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (m4693F(type2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static final on3 m4694G(on3 on3Var, float f) {
        return on3Var.mo16935d(new cs3(new ig2(f)));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m4695H(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m4696I(kg7 kg7Var, long j, long j2) {
        int i = kg7Var.f47243i == 1 ? 1 : 0;
        long j3 = kg7Var.f47237c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m4697J(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: K */
    public static IllegalArgumentException m4698K(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM22999v = ux5.m22999v(String.format(str, objArr), "\n    for method ");
        sbM22999v.append(method.getDeclaringClass().getSimpleName());
        sbM22999v.append(".");
        sbM22999v.append(method.getName());
        return new IllegalArgumentException(sbM22999v.toString(), exc);
    }

    /* JADX INFO: renamed from: L */
    public static IllegalArgumentException m4699L(Method method, int i, String str, Object... objArr) {
        return m4698K(method, null, str + " (" + v87.f65023b.mo18904d(i, method) + ")", objArr);
    }

    /* JADX INFO: renamed from: M */
    public static IllegalArgumentException m4700M(Method method, Exception exc, int i, String str, Object... objArr) {
        return m4698K(method, exc, str + " (" + v87.f65023b.mo18904d(i, method) + ")", objArr);
    }

    /* JADX INFO: renamed from: N */
    public static void m4701N(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX INFO: renamed from: O */
    public static final long m4702O(kg7 kg7Var, boolean z) {
        long jM12824e = gq6.m12824e(kg7Var.f47237c, kg7Var.f47241g);
        if (z || !kg7Var.m15191c()) {
            return jM12824e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P */
    public static final C0282a m4703P(int i, xi3 xi3Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            objM22097O = new C0282a(i, true, xi3Var);
            tj3Var.m22131l0(objM22097O);
        }
        C0282a c0282a = (C0282a) objM22097O;
        if (!c0282a.f3782c.equals(xi3Var)) {
            c0282a.f3782c = xi3Var;
            if (c0282a.f3781b) {
                x18 x18Var = c0282a.f3783d;
                if (x18Var != null) {
                    pf1 pf1Var = x18Var.f67639a;
                    if (pf1Var != null) {
                        pf1Var.m19103s(x18Var, null);
                    }
                    c0282a.f3783d = null;
                }
                ArrayList arrayList = c0282a.f3784e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        x18 x18Var2 = (x18) arrayList.get(i2);
                        pf1 pf1Var2 = x18Var2.f67639a;
                        if (pf1Var2 != null) {
                            pf1Var2.m19103s(x18Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c0282a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX INFO: renamed from: Q */
    public static Type m4704Q(Type type, Class cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeM4704Q;
        Type type4;
        Type type5 = type2;
        while (true) {
            int i = 0;
            if (!(type5 instanceof TypeVariable)) {
                if (type5 instanceof Class) {
                    Class cls2 = (Class) type5;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type typeM4704Q2 = m4704Q(type, cls, componentType);
                        return componentType == typeM4704Q2 ? cls2 : new cna(typeM4704Q2);
                    }
                }
                if (type5 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type5;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type typeM4704Q3 = m4704Q(type, cls, genericComponentType);
                    return genericComponentType == typeM4704Q3 ? genericArrayType : new cna(typeM4704Q3);
                }
                if (type5 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type5;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type typeM4704Q4 = m4704Q(type, cls, ownerType);
                    boolean z = typeM4704Q4 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type typeM4704Q5 = m4704Q(type, cls, actualTypeArguments[i]);
                        if (typeM4704Q5 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = typeM4704Q5;
                        }
                        i++;
                    }
                    return z ? new dna(typeM4704Q4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                if (type5 instanceof WildcardType) {
                    wildcardType = (WildcardType) type5;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM4704Q6 = m4704Q(type, cls, lowerBounds[0]);
                        if (typeM4704Q6 != lowerBounds[0]) {
                            type3 = type5;
                            type3 = wildcardType;
                            return new ena(new Type[]{Object.class}, new Type[]{typeM4704Q6});
                        }
                    } else if (upperBounds.length == 1 && (typeM4704Q = m4704Q(type, cls, upperBounds[0])) != upperBounds[0]) {
                        type3 = type5;
                        type3 = wildcardType;
                        type3 = wildcardType;
                        return new ena(new Type[]{typeM4704Q}, f10125i);
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
            if (cls3 == null) {
                type4 = typeVariable;
            } else {
                Type typeM4688A = m4688A(type, cls, cls3);
                if (typeM4688A instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (true) {
                        if (i >= typeParameters.length) {
                            uk9.m22784s();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type4 = ((ParameterizedType) typeM4688A).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type4 = typeVariable;
                }
            }
            if (type4 == typeVariable) {
                return type4;
            }
            type5 = type4;
        }
    }

    /* JADX INFO: renamed from: R */
    public static long m4705R(double d) {
        return Math.round(d * 1000.0d);
    }

    /* JADX INFO: renamed from: S */
    public static final on3 m4706S(on3 on3Var, float f) {
        return m4694G(m4717b0(on3Var, f), f);
    }

    /* JADX INFO: renamed from: T */
    public static final long m4707T(String str, long j, long j2, long j3) {
        String property;
        int i = zp9.f71940a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM4845b0 = cl9.m4845b0(property);
        if (lM4845b0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM4845b0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: U */
    public static int m4708U(int i, String str, int i2) {
        return (int) m4707T(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: V */
    public static void m4709V(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: W */
    public static double m4710W(long j) {
        return Math.round(((System.currentTimeMillis() - j) / 1000.0d) * 10000.0d) / 10000.0d;
    }

    /* JADX INFO: renamed from: X */
    public static String m4711X(char c, Locale locale) {
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c);
            strValueOf2.getClass();
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return cCharAt + lowerCase;
        }
        return upperCase;
    }

    /* JADX INFO: renamed from: Y */
    public static final long m4712Y(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? dk1.m10423a(bk1.m3803k(j), bk1.m3801i(j), bk1.m3802j(j), bk1.m3800h(j)) : dk1.m10423a(bk1.m3802j(j), bk1.m3800h(j), bk1.m3803k(j), bk1.m3801i(j));
    }

    /* JADX INFO: renamed from: Z */
    public static final ExtractedText m4713Z(vv9 vv9Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = vv9Var.f65990a.f54604b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = vv9Var.f65991b;
        extractedText.selectionStart = cx9.m9924f(j);
        extractedText.selectionEnd = cx9.m9923e(j);
        extractedText.flags = !vk9.m23381d0(vv9Var.f65990a.f54604b, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: a */
    public static final vf0 m4714a(float f, long j) {
        return new vf0(f, new pd9(j));
    }

    /* JADX INFO: renamed from: a0 */
    public static String m4715a0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final void m4716b(vn2 vn2Var, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1991437157);
        if (((i | 2) & 19) == 18 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                vn2Var = (vn2) tj3Var.m22128k(yf1.f69766e);
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            pvc.m19507c(yf1.f69766e.mo1265a(vn2Var), c0282a, tj3Var, 48);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3794yf(vn2Var, i, 8, c0282a);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final on3 m4717b0(on3 on3Var, float f) {
        return on3Var.mo16935d(new m4b(new ig2(f)));
    }

    /* JADX INFO: renamed from: c */
    public static final void m4718c(int i, ye1 ye1Var, String str, boolean z) {
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-365358585);
        int i2 = (tj3Var.m22122h(z) ? 4 : 2) | i | (tj3Var.m22120g(str) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, AbstractC0070i.m772g(null, 0.0f, 3).m23531a(AbstractC0070i.m769d()), AbstractC0070i.m773h(null, 3), null, m4703P(-1595306785, new rm0(str, 9), tj3Var), tj3Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rm1(str, i, z2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4719d(yt4 yt4Var, Object obj, int i, Object obj2, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1439843069);
        int i3 = (tj3Var.m22120g(yt4Var) ? 4 : 2) | i2 | (tj3Var.m22120g(obj) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128) | (tj3Var.m22120g(obj2) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            ((fl8) obj).mo11934c(obj2, m4703P(980966366, new C3504qn(i, yt4Var, obj2), tj3Var), tj3Var, 48);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(yt4Var, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m4720e(fb9 fb9Var, List list, pf1 pf1Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iM11729c = fb9Var.m11729c((oj3) list.get(i));
            int iM11719N = fb9Var.m11719N(fb9Var.f38801b, fb9Var.m11743r(iM11729c));
            Object obj = iM11719N < fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(iM11729c + 1)) ? fb9Var.f38802c[fb9Var.m11734h(iM11719N)] : we1.f66679a;
            x18 x18Var = obj instanceof x18 ? (x18) obj : null;
            if (x18Var != null) {
                x18Var.f67639a = pf1Var;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final int m4721f(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m4722g(kg7 kg7Var) {
        return (kg7Var.m15191c() || kg7Var.f47242h || !kg7Var.f47238d) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m4723h(kg7 kg7Var) {
        return !kg7Var.f47242h && kg7Var.f47238d;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m4724i(kg7 kg7Var) {
        return (kg7Var.m15191c() || !kg7Var.f47242h || kg7Var.f47238d) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m4725j(kg7 kg7Var) {
        return kg7Var.f47242h && !kg7Var.f47238d;
    }

    /* JADX INFO: renamed from: k */
    public static void m4726k(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            ij6.m13959q();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4727l(int i) {
        if (2 > i || i >= 37) {
            C3386nv.m17630q(ux5.m22998u("radix ", i, " was not in valid range "), new i84(2, 36, 1));
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m4728m(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return dk1.m10423a(layoutOrientation == layoutOrientation2 ? bk1.m3803k(j) : bk1.m3802j(j), layoutOrientation == layoutOrientation2 ? bk1.m3801i(j) : bk1.m3800h(j), layoutOrientation == layoutOrientation2 ? bk1.m3802j(j) : bk1.m3803k(j), layoutOrientation == layoutOrientation2 ? bk1.m3800h(j) : bk1.m3801i(j));
    }

    /* JADX INFO: renamed from: n */
    public static long m4729n(int i, long j) {
        return dk1.m10423a(0, bk1.m3801i(j), (i & 4) != 0 ? bk1.m3802j(j) : 0, bk1.m3800h(j));
    }

    /* JADX INFO: renamed from: o */
    public static final nl8 m4730o(qr1 qr1Var) {
        nl8 nl8Var;
        qr1Var.getClass();
        vl8 vl8Var = (vl8) qr1Var.mo18287a(f10122f);
        Bundle bundle = null;
        if (vl8Var == null) {
            C3386nv.m17626m("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        dua duaVar = (dua) qr1Var.mo18287a(f10123g);
        if (duaVar == null) {
            C3386nv.m17626m("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) qr1Var.mo18287a(f10124h);
        String str = (String) qr1Var.mo18287a(m58.f50615d);
        if (str == null) {
            C3386nv.m17626m("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        ul8 ul8VarM12116w = vl8Var.mo2118t().m12116w("androidx.lifecycle.internal.SavedStateHandlesProvider");
        rl8 rl8Var = ul8VarM12116w instanceof rl8 ? (rl8) ul8VarM12116w : null;
        if (rl8Var == null) {
            C3386nv.m17633t("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = m4691D(duaVar).f60981b;
        nl8 nl8Var2 = (nl8) linkedHashMap.get(str);
        if (nl8Var2 != null) {
            return nl8Var2;
        }
        rl8Var.m20706b();
        Bundle bundle3 = rl8Var.f59500c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                rl8Var.f59500c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            nl8Var = new nl8();
        } else {
            ClassLoader classLoader = nl8.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                mapBuilder.put(str2, bundle2.get(str2));
            }
            nl8Var = new nl8(mapBuilder.m15392b());
        }
        linkedHashMap.put(str, nl8Var);
        return nl8Var;
    }

    /* JADX INFO: renamed from: p */
    public static final void m4731p(vl8 vl8Var) {
        Lifecycle$State lifecycle$StateMo21327q = vl8Var.mo256K().mo21327q();
        if (lifecycle$StateMo21327q != Lifecycle$State.INITIALIZED && lifecycle$StateMo21327q != Lifecycle$State.CREATED) {
            C3386nv.m17626m("Failed requirement.");
        } else if (vl8Var.mo2118t().m12116w("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            rl8 rl8Var = new rl8(vl8Var.mo2118t(), (dua) vl8Var);
            vl8Var.mo2118t().m12094I("androidx.lifecycle.internal.SavedStateHandlesProvider", rl8Var);
            vl8Var.mo256K().mo21323g(new d28(rl8Var, 5));
        }
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m4732q(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m4733r(Type type, Type type2) {
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
                return m4733r(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: s */
    public static final on3 m4734s(on3 on3Var) {
        return m4735t(on3Var).mo16935d(new cs3(kg2.f47164a));
    }

    /* JADX INFO: renamed from: t */
    public static final on3 m4735t(on3 on3Var) {
        return on3Var.mo16935d(new m4b(kg2.f47164a));
    }

    /* JADX INFO: renamed from: u */
    public static final ud6 m4736u(Activity activity, int i) {
        activity.getClass();
        View viewRequireViewById = activity.requireViewById(i);
        viewRequireViewById.getClass();
        ud6 ud6Var = (ud6) AbstractC3204c.m15415k0(AbstractC3204c.m15420p0(AbstractC3204c.m15418n0(viewRequireViewById, new tf4(26)), new tf4(27)));
        if (ud6Var != null) {
            return ud6Var;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    /* JADX INFO: renamed from: v */
    public static final int m4737v(int i, List list) {
        int i2;
        byte b;
        int i3 = ((f37) u91.m22597O0(list)).f38360c;
        if (i > ((f37) u91.m22597O0(list)).f38360c) {
            j54.m14288a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            f37 f37Var = (f37) list.get(i2);
            if (f37Var.f38359b > i) {
                b = 1;
            } else {
                b = f37Var.f38360c <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbM22998u = ux5.m22998u("Found paragraph index ", i2, " should be in range [0, ");
        sbM22998u.append(list.size());
        sbM22998u.append(").\nDebug info: index=");
        sbM22998u.append(i);
        sbM22998u.append(", paragraphs=[");
        sbM22998u.append(hg5.m13229a(list, null, new tf4(19), 31));
        sbM22998u.append(']');
        j54.m14288a(sbM22998u.toString());
        return i2;
    }

    /* JADX INFO: renamed from: w */
    public static final int m4738w(int i, List list) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            f37 f37Var = (f37) list.get(i3);
            if (f37Var.f38361d > i) {
                b = 1;
            } else {
                b = f37Var.f38362e <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: x */
    public static final int m4739x(ArrayList arrayList, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((f37) u91.m22597O0(arrayList)).f38364g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            f37 f37Var = (f37) arrayList.get(i2);
            if (f37Var.f38363f > f) {
                b = 1;
            } else {
                b = f37Var.f38364g <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: y */
    public static final void m4740y(ArrayList arrayList, long j, vi3 vi3Var) {
        int size = arrayList.size();
        for (int iM4737v = m4737v(cx9.m9924f(j), arrayList); iM4737v < size; iM4737v++) {
            f37 f37Var = (f37) arrayList.get(iM4737v);
            if (f37Var.f38359b >= cx9.m9923e(j)) {
                return;
            }
            if (f37Var.f38359b != f37Var.f38360c) {
                vi3Var.invoke(f37Var);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static Object m4741z(Object obj, Class cls) {
        if (obj instanceof lk3) {
            return cls.cast(obj);
        }
        if (obj instanceof mk3) {
            return m4741z(((mk3) obj).mo6995b(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + lk3.class + " or " + mk3.class);
    }
}
