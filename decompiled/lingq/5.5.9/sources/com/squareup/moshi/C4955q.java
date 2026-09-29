package com.squareup.moshi;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.InterfaceC9302f;
import tk.InterfaceC9311o;
import uk.C9553b;

/* JADX INFO: renamed from: com.squareup.moshi.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C4955q {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f32270d;

    /* JADX INFO: renamed from: a */
    public final List<AbstractC4949k.a> f32271a;

    /* JADX INFO: renamed from: b */
    public final ThreadLocal<c> f32272b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f32273c = new LinkedHashMap();

    /* JADX INFO: renamed from: com.squareup.moshi.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ArrayList f32274a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public int f32275b = 0;

        /* JADX INFO: renamed from: a */
        public final void m10567a(AbstractC4949k.a aVar) {
            ArrayList arrayList = this.f32274a;
            int i10 = this.f32275b;
            this.f32275b = i10 + 1;
            arrayList.add(i10, aVar);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:61:0x0187  */
        /* JADX WARN: Code duplicated, block: B:88:0x00e4 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v22 */
        /* JADX WARN: Type inference failed for: r13v3, types: [int] */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement, java.lang.reflect.Method] */
        /* JADX INFO: renamed from: b */
        public final void m10568b(Object obj) {
            Method[] methodArr;
            Method[] methodArr2;
            String str;
            ?? r10;
            ?? r11;
            char c10;
            C4939a.b c4943e;
            ?? r13;
            Class<AbstractC4949k> cls;
            Method[] methodArr3;
            boolean z10;
            C4939a.b c4941c;
            Method[] methodArr4;
            C4939a.b bVarM10523b;
            Method[] methodArr5;
            boolean z11;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> superclass = obj.getClass();
            while (superclass != Object.class) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int length = declaredMethods.length;
                char c11 = 0;
                int i10 = 0;
                while (i10 < length) {
                    Method method = methodArr[i10];
                    Class<AbstractC4949k> cls2 = AbstractC4949k.class;
                    String str2 = "\n    ";
                    if (method.isAnnotationPresent(InterfaceC9311o.class)) {
                        method.setAccessible(true);
                        Type genericReturnType = method.getGenericReturnType();
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        if (genericParameterTypes.length >= 2 && genericParameterTypes[c11] == AbstractC9310n.class && genericReturnType == Void.TYPE) {
                            int length2 = genericParameterTypes.length;
                            int i11 = 2;
                            while (true) {
                                if (i11 >= length2) {
                                    methodArr = declaredMethods;
                                    methodArr5 = methodArr;
                                    methodArr3 = methodArr5;
                                    z11 = true;
                                    break;
                                }
                                Type type = genericParameterTypes[i11];
                                Method[] methodArr6 = methodArr5;
                                if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != cls2) {
                                    methodArr = declaredMethods;
                                    methodArr5 = methodArr;
                                    z11 = false;
                                    methodArr3 = methodArr6;
                                    break;
                                }
                                methodArr = declaredMethods;
                                methodArr5 = methodArr;
                                i11++;
                                methodArr5 = methodArr6;
                            }
                            if (z11) {
                                str = "Unexpected signature for ";
                                c4941c = new C4940b(genericParameterTypes[1], C9756b.m18247f(parameterAnnotations[1]), obj, method, genericParameterTypes.length);
                                z10 = true;
                                methodArr4 = methodArr3;
                            }
                            bVarM10523b = C4939a.m10523b(arrayList, c4941c.f32218a, c4941c.f32219b);
                            if (bVarM10523b == null) {
                                throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + bVarM10523b.f32221d + str2 + c4941c.f32221d);
                            }
                            arrayList.add(c4941c);
                            r10 = z10;
                            r11 = method;
                            methodArr2 = methodArr4;
                        } else {
                            methodArr = declaredMethods;
                            methodArr = declaredMethods;
                            methodArr = declaredMethods;
                            methodArr3 = methodArr;
                        }
                        str = "Unexpected signature for ";
                        if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
                            throw new IllegalArgumentException(str + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                        }
                        Set<Annotation> set = C9756b.f49811a;
                        Set<? extends Annotation> setM18247f = C9756b.m18247f(method.getAnnotations());
                        Set<? extends Annotation> setM18247f2 = C9756b.m18247f(parameterAnnotations[0]);
                        z10 = true;
                        c4941c = new C4941c(genericParameterTypes[0], setM18247f2, obj, method, genericParameterTypes.length, C9756b.m18245d(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setM18247f2, setM18247f);
                        methodArr4 = methodArr3;
                        bVarM10523b = C4939a.m10523b(arrayList, c4941c.f32218a, c4941c.f32219b);
                        if (bVarM10523b == null) {
                            throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + bVarM10523b.f32221d + str2 + c4941c.f32221d);
                        }
                        arrayList.add(c4941c);
                        r10 = z10;
                        r11 = method;
                        methodArr2 = methodArr4;
                    } else {
                        methodArr = declaredMethods;
                        superclass = superclass;
                        methodArr2 = methodArr;
                        length = length;
                        str = "Unexpected signature for ";
                        str2 = "\n    ";
                        r10 = 1;
                        cls2 = cls2;
                        r11 = method;
                    }
                    if (r11.isAnnotationPresent(InterfaceC9302f.class)) {
                        r11.setAccessible(r10);
                        Type genericReturnType2 = r11.getGenericReturnType();
                        Set<Annotation> set2 = C9756b.f49811a;
                        Set<? extends Annotation> setM18247f3 = C9756b.m18247f(r11.getAnnotations());
                        Type[] genericParameterTypes2 = r11.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = r11.getParameterAnnotations();
                        if (genericParameterTypes2.length >= r10 && genericParameterTypes2[0] == JsonReader.class && genericReturnType2 != Void.TYPE) {
                            int length3 = genericParameterTypes2.length;
                            ?? r14 = r10;
                            while (true) {
                                if (r14 >= length3) {
                                    r13 = r10;
                                    break;
                                }
                                Type type2 = genericParameterTypes2[r14];
                                if (!(type2 instanceof ParameterizedType) || ((ParameterizedType) type2).getRawType() != (cls = cls2)) {
                                    r13 = 0;
                                    break;
                                } else {
                                    cls2 = cls;
                                    r14++;
                                }
                            }
                            if (r13 == 0) {
                                if (genericParameterTypes2.length == r10) {
                                }
                                throw new IllegalArgumentException(str + r11 + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                            }
                            c4943e = new C4942d(genericReturnType2, setM18247f3, obj, r11, genericParameterTypes2.length);
                            c10 = 0;
                        } else {
                            if (genericParameterTypes2.length == r10 || genericReturnType2 == Void.TYPE) {
                                throw new IllegalArgumentException(str + r11 + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                            }
                            c10 = 0;
                            c4943e = new C4943e(genericReturnType2, setM18247f3, obj, r11, genericParameterTypes2.length, C9756b.m18245d(parameterAnnotations2[0]), genericParameterTypes2, genericReturnType2, C9756b.m18247f(parameterAnnotations2[0]), setM18247f3);
                        }
                        C4939a.b bVarM10523b2 = C4939a.m10523b(arrayList2, c4943e.f32218a, c4943e.f32219b);
                        if (bVarM10523b2 != null) {
                            throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + bVarM10523b2.f32221d + str2 + c4943e.f32221d);
                        }
                        arrayList2.add(c4943e);
                    } else {
                        c10 = 0;
                    }
                    i10++;
                    c11 = c10;
                    methodArr = methodArr2;
                    length = length;
                    superclass = superclass;
                }
                methodArr = declaredMethods;
                superclass = superclass.getSuperclass();
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
            }
            m10567a(new C4939a(arrayList, arrayList2));
        }

        /* JADX INFO: renamed from: c */
        public final void m10569c(C9553b c9553b) {
            ArrayList arrayList = C4955q.f32270d;
            m10567a(new C4954p(c9553b));
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.q$b */
    public static final class b<T> extends AbstractC4949k<T> {

        /* JADX INFO: renamed from: a */
        public final Type f32276a;

        /* JADX INFO: renamed from: b */
        public final String f32277b;

        /* JADX INFO: renamed from: c */
        public final Object f32278c;

        /* JADX INFO: renamed from: d */
        public AbstractC4949k<T> f32279d;

        public b(Type type, String str, Object obj) {
            this.f32276a = type;
            this.f32277b = str;
            this.f32278c = obj;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final T mo9385a(JsonReader jsonReader) throws IOException {
            AbstractC4949k<T> abstractC4949k = this.f32279d;
            if (abstractC4949k != null) {
                return abstractC4949k.mo9385a(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, T t10) throws IOException {
            AbstractC4949k<T> abstractC4949k = this.f32279d;
            if (abstractC4949k == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC4949k.mo9386f(abstractC9310n, t10);
        }

        public final String toString() {
            AbstractC4949k<T> abstractC4949k = this.f32279d;
            return abstractC4949k != null ? abstractC4949k.toString() : super.toString();
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.q$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final ArrayList f32280a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final ArrayDeque f32281b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public boolean f32282c;

        public c() {
        }

        /* JADX INFO: renamed from: a */
        public final IllegalArgumentException m10570a(IllegalArgumentException illegalArgumentException) {
            if (this.f32282c) {
                return illegalArgumentException;
            }
            this.f32282c = true;
            ArrayDeque arrayDeque = this.f32281b;
            if (arrayDeque.size() == 1 && ((b) arrayDeque.getFirst()).f32277b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator itDescendingIterator = arrayDeque.descendingIterator();
            while (true) {
                while (itDescendingIterator.hasNext()) {
                    b bVar = (b) itDescendingIterator.next();
                    sb2.append("\nfor ");
                    sb2.append(bVar.f32276a);
                    String str = bVar.f32277b;
                    if (str != null) {
                        sb2.append(' ');
                        sb2.append(str);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m10571b(boolean z10) {
            this.f32281b.removeLast();
            if (this.f32281b.isEmpty()) {
                C4955q.this.f32272b.remove();
                if (z10) {
                    synchronized (C4955q.this.f32273c) {
                        int size = this.f32280a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            b bVar = (b) this.f32280a.get(i10);
                            AbstractC4949k<T> abstractC4949k = (AbstractC4949k) C4955q.this.f32273c.put(bVar.f32278c, bVar.f32279d);
                            if (abstractC4949k != 0) {
                                bVar.f32279d = abstractC4949k;
                                C4955q.this.f32273c.put(bVar.f32278c, abstractC4949k);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f32270d = arrayList;
        arrayList.add(C4957s.f32285a);
        arrayList.add(AbstractC4946h.f32245b);
        arrayList.add(C4953o.f32265c);
        arrayList.add(C4944f.f32235c);
        arrayList.add(C4956r.f32284a);
        arrayList.add(C4945g.f32238d);
    }

    public C4955q(a aVar) {
        ArrayList arrayList = aVar.f32274a;
        int size = arrayList.size();
        ArrayList arrayList2 = f32270d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f32271a = Collections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public final <T> AbstractC4949k<T> m10563a(Class<T> cls) {
        return m10565c(cls, C9756b.f49811a, null);
    }

    /* JADX INFO: renamed from: b */
    public final <T> AbstractC4949k<T> m10564b(Type type) {
        return m10565c(type, C9756b.f49811a, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final <T> AbstractC4949k<T> m10565c(Type type, Set<? extends Annotation> set, String str) {
        AbstractC4949k<T> abstractC4949k;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM18249h = C9756b.m18249h(C9756b.m18242a(type));
        Object objAsList = set.isEmpty() ? typeM18249h : Arrays.asList(typeM18249h, set);
        synchronized (this.f32273c) {
            AbstractC4949k<T> abstractC4949k2 = (AbstractC4949k) this.f32273c.get(objAsList);
            if (abstractC4949k2 != null) {
                return abstractC4949k2;
            }
            c cVar = this.f32272b.get();
            if (cVar == null) {
                cVar = new c();
                this.f32272b.set(cVar);
            }
            ArrayList arrayList = cVar.f32280a;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                ArrayDeque arrayDeque = cVar.f32281b;
                if (i10 < size) {
                    abstractC4949k = (b) arrayList.get(i10);
                    if (abstractC4949k.f32278c.equals(objAsList)) {
                        arrayDeque.add(abstractC4949k);
                        AbstractC4949k<T> abstractC4949k3 = abstractC4949k.f32279d;
                        if (abstractC4949k3 != null) {
                            abstractC4949k = abstractC4949k3;
                            break;
                        }
                    } else {
                        i10++;
                    }
                } else {
                    b bVar = new b(typeM18249h, str, objAsList);
                    arrayList.add(bVar);
                    arrayDeque.add(bVar);
                    abstractC4949k = null;
                }
                break;
            }
            try {
                if (abstractC4949k != null) {
                    cVar.m10571b(false);
                    return abstractC4949k;
                }
                try {
                    int size2 = this.f32271a.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        AbstractC4949k<T> abstractC4949k4 = (AbstractC4949k<T>) this.f32271a.get(i11).mo10524a(typeM18249h, set, this);
                        if (abstractC4949k4 != null) {
                            ((b) cVar.f32281b.getLast()).f32279d = abstractC4949k4;
                            cVar.m10571b(true);
                            return abstractC4949k4;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + C9756b.m18252k(typeM18249h, set));
                } catch (IllegalArgumentException e10) {
                    throw cVar.m10570a(e10);
                }
            } catch (Throwable th2) {
                cVar.m10571b(false);
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final <T> AbstractC4949k<T> m10566d(AbstractC4949k.a aVar, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM18249h = C9756b.m18249h(C9756b.m18242a(type));
        List<AbstractC4949k.a> list = this.f32271a;
        int iIndexOf = list.indexOf(aVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + aVar);
        }
        int size = list.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            AbstractC4949k<T> abstractC4949k = (AbstractC4949k<T>) list.get(i10).mo10524a(typeM18249h, set, this);
            if (abstractC4949k != null) {
                return abstractC4949k;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + C9756b.m18252k(typeM18249h, set));
    }
}
