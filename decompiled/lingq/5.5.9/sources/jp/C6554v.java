package jp;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9096n;
import so.InterfaceC9086d;

/* JADX INFO: renamed from: jp.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C6554v {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9086d.a f37342b;

    /* JADX INFO: renamed from: c */
    public final C9096n f37343c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC6538f.a> f37344d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC6535c.a> f37345e;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f37341a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final boolean f37346f = false;

    /* JADX INFO: renamed from: jp.v$a */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final C6550r f37347a = C6550r.f37283c;

        /* JADX INFO: renamed from: b */
        public final Object[] f37348b = new Object[0];

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Class f37349c;

        public a(Class cls) {
            this.f37349c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f37348b;
            }
            C6550r c6550r = this.f37347a;
            return c6550r.f37284a && method.isDefault() ? c6550r.mo13141b(this.f37349c, obj, method, objArr) : C6554v.this.m13153c(method).mo13158a(objArr);
        }
    }

    public C6554v(InterfaceC9086d.a aVar, C9096n c9096n, List list, List list2) {
        this.f37342b = aVar;
        this.f37343c = c9096n;
        this.f37344d = list;
        this.f37345e = list2;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC6535c<?, ?> m13151a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC6535c.a> list = this.f37345e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC6535c<?, ?> interfaceC6535cMo13128a = list.get(i10).mo13128a(type, annotationArr);
            if (interfaceC6535cMo13128a != null) {
                return interfaceC6535cMo13128a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final <T> T m13152b(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f37346f) {
            C6550r c6550r = C6550r.f37283c;
            for (Method method : cls.getDeclaredMethods()) {
                if (!(c6550r.f37284a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    m13153c(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC6555w<?> m13153c(Method method) {
        AbstractC6555w<?> abstractC6555wM13157b;
        AbstractC6555w<?> abstractC6555w = (AbstractC6555w) this.f37341a.get(method);
        if (abstractC6555w != null) {
            return abstractC6555w;
        }
        synchronized (this.f37341a) {
            abstractC6555wM13157b = (AbstractC6555w) this.f37341a.get(method);
            if (abstractC6555wM13157b == null) {
                abstractC6555wM13157b = AbstractC6555w.m13157b(this, method);
                this.f37341a.put(method, abstractC6555wM13157b);
            }
        }
        return abstractC6555wM13157b;
    }

    /* JADX INFO: renamed from: d */
    public final <T> InterfaceC6538f<AbstractC9107y, T> m13154d(InterfaceC6538f.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC6538f.a> list = this.f37344d;
        int iIndexOf = list.indexOf(aVar) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC6538f<AbstractC9107y, T> interfaceC6538f = (InterfaceC6538f<AbstractC9107y, T>) list.get(i10).mo13121b(type, annotationArr, this);
            if (interfaceC6538f != null) {
                return interfaceC6538f;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(list.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final <T> InterfaceC6538f<T, AbstractC9105w> m13155e(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<InterfaceC6538f.a> list = this.f37344d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            InterfaceC6538f<T, AbstractC9105w> interfaceC6538fMo13120a = list.get(i10).mo13120a(type, annotationArr);
            if (interfaceC6538fMo13120a != null) {
                return interfaceC6538fMo13120a;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: f */
    public final void m13156f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<InterfaceC6538f.a> list = this.f37344d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).getClass();
        }
    }
}
