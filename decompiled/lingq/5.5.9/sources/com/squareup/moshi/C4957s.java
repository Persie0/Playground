package com.squareup.moshi;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: renamed from: com.squareup.moshi.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C4957s {

    /* JADX INFO: renamed from: a */
    public static final c f32285a = new c();

    /* JADX INFO: renamed from: b */
    public static final d f32286b = new d();

    /* JADX INFO: renamed from: c */
    public static final e f32287c = new e();

    /* JADX INFO: renamed from: d */
    public static final f f32288d = new f();

    /* JADX INFO: renamed from: e */
    public static final g f32289e = new g();

    /* JADX INFO: renamed from: f */
    public static final h f32290f = new h();

    /* JADX INFO: renamed from: g */
    public static final i f32291g = new i();

    /* JADX INFO: renamed from: h */
    public static final j f32292h = new j();

    /* JADX INFO: renamed from: i */
    public static final k f32293i = new k();

    /* JADX INFO: renamed from: j */
    public static final a f32294j = new a();

    /* JADX INFO: renamed from: com.squareup.moshi.s$a */
    public class a extends AbstractC4949k<String> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final String mo9385a(JsonReader jsonReader) throws IOException {
            return jsonReader.mo10502U();
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, String str) throws IOException {
            abstractC9310n.mo10558m0(str);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32295a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f32295a = iArr;
            try {
                iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32295a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32295a[JsonReader.Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32295a[JsonReader.Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32295a[JsonReader.Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32295a[JsonReader.Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$c */
    public class c implements AbstractC4949k.a {
        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            AbstractC4949k<?> abstractC4949kM10534d;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            Class<?> cls = null;
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C4957s.f32286b;
            }
            if (type == Byte.TYPE) {
                return C4957s.f32287c;
            }
            if (type == Character.TYPE) {
                return C4957s.f32288d;
            }
            if (type == Double.TYPE) {
                return C4957s.f32289e;
            }
            if (type == Float.TYPE) {
                return C4957s.f32290f;
            }
            if (type == Integer.TYPE) {
                return C4957s.f32291g;
            }
            if (type == Long.TYPE) {
                return C4957s.f32292h;
            }
            if (type == Short.TYPE) {
                return C4957s.f32293i;
            }
            if (type == Boolean.class) {
                return C4957s.f32286b.m10534d();
            }
            if (type == Byte.class) {
                return C4957s.f32287c.m10534d();
            }
            if (type == Character.class) {
                return C4957s.f32288d.m10534d();
            }
            if (type == Double.class) {
                return C4957s.f32289e.m10534d();
            }
            if (type == Float.class) {
                return C4957s.f32290f.m10534d();
            }
            if (type == Integer.class) {
                return C4957s.f32291g.m10534d();
            }
            if (type == Long.class) {
                return C4957s.f32292h.m10534d();
            }
            if (type == Short.class) {
                return C4957s.f32293i.m10534d();
            }
            if (type == String.class) {
                return C4957s.f32294j.m10534d();
            }
            if (type == Object.class) {
                return new m(c4955q).m10534d();
            }
            Class<?> clsM17658c = C9312p.m17658c(type);
            Set<Annotation> set2 = C9756b.f49811a;
            InterfaceC9307k interfaceC9307k = (InterfaceC9307k) clsM17658c.getAnnotation(InterfaceC9307k.class);
            if (interfaceC9307k == null || !interfaceC9307k.generateAdapter()) {
                abstractC4949kM10534d = null;
            } else {
                try {
                    try {
                        Class<?> cls2 = Class.forName(clsM17658c.getName().replace("$", "_") + "JsonAdapter", true, clsM17658c.getClassLoader());
                        try {
                            if (type instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                try {
                                    declaredConstructor = cls2.getDeclaredConstructor(C4955q.class, Type[].class);
                                    objArr = new Object[]{c4955q, actualTypeArguments};
                                } catch (NoSuchMethodException unused) {
                                    declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                    objArr = new Object[]{actualTypeArguments};
                                }
                            } else {
                                try {
                                    declaredConstructor = cls2.getDeclaredConstructor(C4955q.class);
                                    objArr = new Object[]{c4955q};
                                } catch (NoSuchMethodException unused2) {
                                    declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                                    objArr = new Object[0];
                                }
                            }
                            declaredConstructor.setAccessible(true);
                            abstractC4949kM10534d = ((AbstractC4949k) declaredConstructor.newInstance(objArr)).m10534d();
                        } catch (NoSuchMethodException e10) {
                            e = e10;
                            cls = cls2;
                            if ((type instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                            }
                            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                        }
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                    }
                } catch (ClassNotFoundException e12) {
                    throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
                } catch (IllegalAccessException e13) {
                    throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
                } catch (InstantiationException e14) {
                    throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
                } catch (InvocationTargetException e15) {
                    C9756b.m18251j(e15);
                    throw null;
                }
            }
            if (abstractC4949kM10534d != null) {
                return abstractC4949kM10534d;
            }
            if (clsM17658c.isEnum()) {
                return new l(clsM17658c).m10534d();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$d */
    public class d extends AbstractC4949k<Boolean> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Boolean mo9385a(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo10493C());
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Boolean bool) throws IOException {
            abstractC9310n.mo10561s0(bool.booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$e */
    public class e extends AbstractC4949k<Byte> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Byte mo9385a(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C4957s.m10572a(jsonReader, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Byte b10) throws IOException {
            abstractC9310n.mo10554U(b10.intValue() & 255);
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$f */
    public class f extends AbstractC4949k<Character> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Character mo9385a(JsonReader jsonReader) throws IOException {
            String strMo10502U = jsonReader.mo10502U();
            if (strMo10502U.length() <= 1) {
                return Character.valueOf(strMo10502U.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", "\"" + strMo10502U + '\"', jsonReader.m10509r()));
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Character ch2) throws IOException {
            abstractC9310n.mo10558m0(ch2.toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$g */
    public class g extends AbstractC4949k<Double> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Double mo9385a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo10494E());
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Double d10) throws IOException {
            abstractC9310n.mo10553Q(d10.doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$h */
    public class h extends AbstractC4949k<Float> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Float mo9385a(JsonReader jsonReader) throws IOException {
            float fMo10494E = (float) jsonReader.mo10494E();
            if (jsonReader.f32179e || !Float.isInfinite(fMo10494E)) {
                return Float.valueOf(fMo10494E);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fMo10494E + " at path " + jsonReader.m10509r());
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Float f3) throws IOException {
            Float f10 = f3;
            f10.getClass();
            abstractC9310n.mo10557d0(f10);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$i */
    public class i extends AbstractC4949k<Integer> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Integer mo9385a(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo10495G());
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Integer num) throws IOException {
            abstractC9310n.mo10554U(num.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$j */
    public class j extends AbstractC4949k<Long> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Long mo9385a(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo10497H());
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Long l10) throws IOException {
            abstractC9310n.mo10554U(l10.longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$k */
    public class k extends AbstractC4949k<Short> {
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Short mo9385a(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C4957s.m10572a(jsonReader, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Short sh2) throws IOException {
            abstractC9310n.mo10554U(sh2.intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$l */
    public static final class l<T extends Enum<T>> extends AbstractC4949k<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f32296a;

        /* JADX INFO: renamed from: b */
        public final String[] f32297b;

        /* JADX INFO: renamed from: c */
        public final T[] f32298c;

        /* JADX INFO: renamed from: d */
        public final JsonReader.C4932a f32299d;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public l(Class<T> cls) {
            this.f32296a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f32298c = enumConstants;
                this.f32297b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f32298c;
                    if (i10 >= tArr.length) {
                        this.f32299d = JsonReader.C4932a.m10513a(this.f32297b);
                        return;
                    }
                    String strName = tArr[i10].name();
                    String[] strArr = this.f32297b;
                    Field field = cls.getField(strName);
                    Set<Annotation> set = C9756b.f49811a;
                    InterfaceC9303g interfaceC9303g = (InterfaceC9303g) field.getAnnotation(InterfaceC9303g.class);
                    if (interfaceC9303g != null) {
                        String strName2 = interfaceC9303g.name();
                        if (!"\u0000".equals(strName2)) {
                            strName = strName2;
                        }
                    }
                    strArr[i10] = strName;
                    i10++;
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in ".concat(cls.getName()), e10);
            }
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Object mo9385a(JsonReader jsonReader) throws IOException {
            int iMo10492B0 = jsonReader.mo10492B0(this.f32299d);
            if (iMo10492B0 != -1) {
                return this.f32298c[iMo10492B0];
            }
            String strM10509r = jsonReader.m10509r();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f32297b) + " but was " + jsonReader.mo10502U() + " at path " + strM10509r);
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
            abstractC9310n.mo10558m0(this.f32297b[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return "JsonAdapter(" + this.f32296a.getName() + ")";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.s$m */
    public static final class m extends AbstractC4949k<Object> {

        /* JADX INFO: renamed from: a */
        public final C4955q f32300a;

        /* JADX INFO: renamed from: b */
        public final AbstractC4949k<List> f32301b;

        /* JADX INFO: renamed from: c */
        public final AbstractC4949k<Map> f32302c;

        /* JADX INFO: renamed from: d */
        public final AbstractC4949k<String> f32303d;

        /* JADX INFO: renamed from: e */
        public final AbstractC4949k<Double> f32304e;

        /* JADX INFO: renamed from: f */
        public final AbstractC4949k<Boolean> f32305f;

        public m(C4955q c4955q) {
            this.f32300a = c4955q;
            this.f32301b = c4955q.m10563a(List.class);
            this.f32302c = c4955q.m10563a(Map.class);
            this.f32303d = c4955q.m10563a(String.class);
            this.f32304e = c4955q.m10563a(Double.class);
            this.f32305f = c4955q.m10563a(Boolean.class);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Object mo9385a(JsonReader jsonReader) throws IOException {
            switch (b.f32295a[jsonReader.mo10505d0().ordinal()]) {
                case 1:
                    return this.f32301b.mo9385a(jsonReader);
                case 2:
                    return this.f32302c.mo9385a(jsonReader);
                case 3:
                    return this.f32303d.mo9385a(jsonReader);
                case 4:
                    return this.f32304e.mo9385a(jsonReader);
                case 5:
                    return this.f32305f.mo9385a(jsonReader);
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    jsonReader.mo10501Q();
                    return null;
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.mo10505d0() + " at path " + jsonReader.m10509r());
            }
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                abstractC9310n.mo10556b();
                abstractC9310n.mo10560r();
                return;
            }
            Class<?> cls2 = Map.class;
            if (cls2.isAssignableFrom(cls)) {
                cls = cls2;
            } else {
                cls2 = Collection.class;
                if (cls2.isAssignableFrom(cls)) {
                    cls = cls2;
                }
            }
            this.f32300a.m10565c(cls, C9756b.f49811a, null).mo9386f(abstractC9310n, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10572a(JsonReader jsonReader, String str, int i10, int i11) throws IOException {
        int iMo10495G = jsonReader.mo10495G();
        if (iMo10495G < i10 || iMo10495G > i11) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iMo10495G), jsonReader.m10509r()));
        }
        return iMo10495G;
    }
}
