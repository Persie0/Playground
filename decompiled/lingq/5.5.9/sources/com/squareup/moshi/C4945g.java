package com.squareup.moshi;

import android.support.v4.media.session.C0166e;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p439vk.C9756b;
import tk.AbstractC9301e;
import tk.AbstractC9310n;
import tk.C9297a;
import tk.C9298b;
import tk.C9299c;
import tk.C9300d;
import tk.C9312p;
import tk.InterfaceC9303g;

/* JADX INFO: renamed from: com.squareup.moshi.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4945g<T> extends AbstractC4949k<T> {

    /* JADX INFO: renamed from: d */
    public static final a f32238d = new a();

    /* JADX INFO: renamed from: a */
    public final AbstractC9301e<T> f32239a;

    /* JADX INFO: renamed from: b */
    public final b<?>[] f32240b;

    /* JADX INFO: renamed from: c */
    public final JsonReader.C4932a f32241c;

    /* JADX INFO: renamed from: com.squareup.moshi.g$a */
    public class a implements AbstractC4949k.a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public static void m10529b(Type type, Class cls) {
            Class<?> clsM17658c = C9312p.m17658c(type);
            if (cls.isAssignableFrom(clsM17658c)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM17658c.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x01cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x01ca A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0142  */
        /* JADX WARN: Code duplicated, block: B:55:0x0152  */
        /* JADX WARN: Code duplicated, block: B:72:0x0187  */
        /* JADX WARN: Code duplicated, block: B:76:0x01af  */
        /* JADX WARN: Code duplicated, block: B:79:0x01bc  */
        @Override // com.squareup.moshi.AbstractC4949k.a
        /* JADX INFO: renamed from: a */
        public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
            AbstractC9301e c9300d;
            AbstractC9301e c9299c;
            TreeMap treeMap;
            Class<?> clsM17658c;
            Field[] declaredFields;
            int length;
            int i10;
            Field field;
            int modifiers;
            InterfaceC9303g interfaceC9303g;
            String name;
            b bVar;
            String strName;
            Type typeM18250i = type;
            if (!(typeM18250i instanceof Class) && !(typeM18250i instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsM17658c2 = C9312p.m17658c(type);
            if (clsM17658c2.isInterface() || clsM17658c2.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C9756b.m18246e(clsM17658c2)) {
                m10529b(typeM18250i, List.class);
                m10529b(typeM18250i, Set.class);
                m10529b(typeM18250i, Map.class);
                m10529b(typeM18250i, Collection.class);
                String str = "Platform " + clsM17658c2;
                if (typeM18250i instanceof ParameterizedType) {
                    str = str + " in " + typeM18250i;
                }
                throw new IllegalArgumentException(C0166e.m765k(str, " requires explicit JsonAdapter to be registered"));
            }
            if (clsM17658c2.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsM17658c2.getName()));
            }
            if (clsM17658c2.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class ".concat(clsM17658c2.getName()));
            }
            if (clsM17658c2.getEnclosingClass() != null && !Modifier.isStatic(clsM17658c2.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsM17658c2.getName()));
            }
            if (Modifier.isAbstract(clsM17658c2.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM17658c2.getName()));
            }
            Class<? extends Annotation> cls = C9756b.f49814d;
            int i11 = 0;
            if (cls != null && clsM17658c2.isAnnotationPresent(cls)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM17658c2.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            try {
                try {
                    Constructor<?> declaredConstructor = clsM17658c2.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    c9300d = new C9297a(declaredConstructor, clsM17658c2);
                } catch (NoSuchMethodException unused) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    c9299c = new C9298b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), clsM17658c2);
                    c9300d = c9299c;
                    treeMap = new TreeMap();
                    while (typeM18250i != Object.class) {
                        clsM17658c = C9312p.m17658c(typeM18250i);
                        boolean zM18246e = C9756b.m18246e(clsM17658c);
                        declaredFields = clsM17658c.getDeclaredFields();
                        length = declaredFields.length;
                        i10 = i11;
                        while (i11 < length) {
                            field = declaredFields[i11];
                            modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers)) {
                                i10 = 1;
                            }
                            if (i10 != 0) {
                                Type typeM18250i2 = C9756b.m18250i(typeM18250i, clsM17658c, field.getGenericType(), new LinkedHashSet());
                                Set<? extends Annotation> setM18247f = C9756b.m18247f(field.getAnnotations());
                                name = field.getName();
                                AbstractC4949k<T> abstractC4949kM10565c = c4955q.m10565c(typeM18250i2, setM18247f, name);
                                field.setAccessible(true);
                                if (interfaceC9303g != null) {
                                    strName = interfaceC9303g.name();
                                    if (!"\u0000".equals(strName)) {
                                        name = strName;
                                    }
                                }
                                bVar = (b) treeMap.put(name, new b(name, field, abstractC4949kM10565c));
                                if (bVar == null) {
                                    throw new IllegalArgumentException("Conflicting fields:\n    " + bVar.f32243b + "\n    " + field);
                                }
                            }
                            i11++;
                            i10 = 0;
                        }
                        Class<?> clsM17658c3 = C9312p.m17658c(typeM18250i);
                        typeM18250i = C9756b.m18250i(typeM18250i, clsM17658c3, clsM17658c3.getGenericSuperclass(), new LinkedHashSet());
                        i11 = 0;
                    }
                    return new C4945g(c9300d, treeMap).m10534d();
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        c9299c = new C9299c(declaredMethod2, clsM17658c2, iIntValue);
                        c9300d = c9299c;
                    } catch (Exception unused3) {
                        throw new IllegalArgumentException("cannot construct instances of ".concat(clsM17658c2.getName()));
                    }
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (NoSuchMethodException unused5) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c9300d = new C9300d(declaredMethod3, clsM17658c2);
                } catch (InvocationTargetException e10) {
                    C9756b.m18251j(e10);
                    throw null;
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
            treeMap = new TreeMap();
            while (typeM18250i != Object.class) {
                clsM17658c = C9312p.m17658c(typeM18250i);
                boolean zM18246e2 = C9756b.m18246e(clsM17658c);
                declaredFields = clsM17658c.getDeclaredFields();
                length = declaredFields.length;
                i10 = i11;
                while (i11 < length) {
                    field = declaredFields[i11];
                    modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !zM18246e2)) {
                        i10 = 1;
                    }
                    if (i10 != 0 && ((interfaceC9303g = (InterfaceC9303g) field.getAnnotation(InterfaceC9303g.class)) == null || !interfaceC9303g.ignore())) {
                        Type typeM18250i3 = C9756b.m18250i(typeM18250i, clsM17658c, field.getGenericType(), new LinkedHashSet());
                        Set<? extends Annotation> setM18247f2 = C9756b.m18247f(field.getAnnotations());
                        name = field.getName();
                        AbstractC4949k<T> abstractC4949kM10565c2 = c4955q.m10565c(typeM18250i3, setM18247f2, name);
                        field.setAccessible(true);
                        if (interfaceC9303g != null) {
                            strName = interfaceC9303g.name();
                            if (!"\u0000".equals(strName)) {
                                name = strName;
                            }
                        }
                        bVar = (b) treeMap.put(name, new b(name, field, abstractC4949kM10565c2));
                        if (bVar == null) {
                            throw new IllegalArgumentException("Conflicting fields:\n    " + bVar.f32243b + "\n    " + field);
                        }
                    }
                    i11++;
                    i10 = 0;
                }
                Class<?> clsM17658c4 = C9312p.m17658c(typeM18250i);
                typeM18250i = C9756b.m18250i(typeM18250i, clsM17658c4, clsM17658c4.getGenericSuperclass(), new LinkedHashSet());
                i11 = 0;
            }
            return new C4945g(c9300d, treeMap).m10534d();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.g$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public final String f32242a;

        /* JADX INFO: renamed from: b */
        public final Field f32243b;

        /* JADX INFO: renamed from: c */
        public final AbstractC4949k<T> f32244c;

        public b(String str, Field field, AbstractC4949k<T> abstractC4949k) {
            this.f32242a = str;
            this.f32243b = field;
            this.f32244c = abstractC4949k;
        }
    }

    public C4945g(AbstractC9301e abstractC9301e, TreeMap treeMap) {
        this.f32239a = abstractC9301e;
        this.f32240b = (b[]) treeMap.values().toArray(new b[treeMap.size()]);
        this.f32241c = JsonReader.C4932a.m10513a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final T mo9385a(JsonReader jsonReader) throws IOException {
        try {
            T tMo17646a = this.f32239a.mo17646a();
            try {
                jsonReader.mo10504b();
                while (jsonReader.mo10511w()) {
                    int iMo10512y0 = jsonReader.mo10512y0(this.f32241c);
                    if (iMo10512y0 == -1) {
                        jsonReader.mo10496G0();
                        jsonReader.mo10498I0();
                    } else {
                        b<?> bVar = this.f32240b[iMo10512y0];
                        bVar.f32243b.set(tMo17646a, bVar.f32244c.mo9385a(jsonReader));
                    }
                }
                jsonReader.mo10508q();
                return tMo17646a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            C9756b.m18251j(e11);
            throw null;
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, T t10) throws IOException {
        try {
            abstractC9310n.mo10556b();
            for (b<?> bVar : this.f32240b) {
                abstractC9310n.mo10551C(bVar.f32242a);
                bVar.f32244c.mo9386f(abstractC9310n, bVar.f32243b.get(t10));
            }
            abstractC9310n.mo10560r();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f32239a + ")";
    }
}
