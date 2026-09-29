package mm;

import dm.C5207g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6744b;
import p041c5.C1702c;
import p385sf.C9000b;
import sl.C9072e;
import tl.C9322j;

/* JADX INFO: renamed from: mm.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7640c<M extends Member> implements InterfaceC7639b<M> {

    /* JADX INFO: renamed from: a */
    public final M f42046a;

    /* JADX INFO: renamed from: b */
    public final Type f42047b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f42048c;

    /* JADX INFO: renamed from: d */
    public final List<Type> f42049d;

    /* JADX INFO: renamed from: mm.c$a */
    public static final class a extends AbstractC7640c<Constructor<?>> implements InterfaceC7638a {

        /* JADX INFO: renamed from: e */
        public final Object f42050e;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            C5207g.m11111f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C5207g.m11110e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C5207g.m11110e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : C9322j.m17677e0(1, genericParameterTypes.length - 1, genericParameterTypes)));
            this.f42050e = obj;
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            Constructor constructor = (Constructor) this.f42046a;
            C1702c c1702c = new C1702c(3);
            c1702c.m5436c(this.f42050e);
            c1702c.m5438e(objArr);
            c1702c.m5436c(null);
            return constructor.newInstance(c1702c.m5442i(new Object[c1702c.m5441h()]));
        }
    }

    /* JADX INFO: renamed from: mm.c$b */
    public static final class b extends AbstractC7640c<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor<?> constructor) {
            C5207g.m11111f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C5207g.m11110e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C5207g.m11110e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C9322j.m17677e0(0, genericParameterTypes.length - 1, genericParameterTypes)));
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            Constructor constructor = (Constructor) this.f42046a;
            C1702c c1702c = new C1702c(2);
            c1702c.m5438e(objArr);
            c1702c.m5436c(null);
            return constructor.newInstance(c1702c.m5442i(new Object[c1702c.m5441h()]));
        }
    }

    /* JADX INFO: renamed from: mm.c$c */
    public static final class c extends AbstractC7640c<Constructor<?>> implements InterfaceC7638a {

        /* JADX INFO: renamed from: e */
        public final Object f42051e;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor<?> constructor, Object obj) {
            C5207g.m11111f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C5207g.m11110e(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C5207g.m11110e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, null, genericParameterTypes);
            this.f42051e = obj;
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            Constructor constructor = (Constructor) this.f42046a;
            C1702c c1702c = new C1702c(2);
            c1702c.m5436c(this.f42051e);
            c1702c.m5438e(objArr);
            return constructor.newInstance(c1702c.m5442i(new Object[c1702c.m5441h()]));
        }
    }

    /* JADX INFO: renamed from: mm.c$d */
    public static final class d extends AbstractC7640c<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public d(Constructor<?> constructor) {
            C5207g.m11111f(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            C5207g.m11110e(declaringClass, "constructor.declaringClass");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            declaringClass3 = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C5207g.m11110e(genericParameterTypes, "constructor.genericParameterTypes");
            super(constructor, declaringClass, declaringClass3, genericParameterTypes);
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            return ((Constructor) this.f42046a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: mm.c$e */
    public static abstract class e extends AbstractC7640c<Field> {

        /* JADX INFO: renamed from: mm.c$e$a */
        public static final class a extends e implements InterfaceC7638a {

            /* JADX INFO: renamed from: e */
            public final Object f42052e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false);
                C5207g.m11111f(field, "field");
                this.f42052e = obj;
            }

            @Override // mm.AbstractC7640c.e, mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                return ((Field) this.f42046a).get(this.f42052e);
            }
        }

        /* JADX INFO: renamed from: mm.c$e$b */
        public static final class b extends e implements InterfaceC7638a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false);
                C5207g.m11111f(field, "field");
            }
        }

        /* JADX INFO: renamed from: mm.c$e$c */
        public static final class c extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true);
                C5207g.m11111f(field, "field");
            }
        }

        /* JADX INFO: renamed from: mm.c$e$d */
        public static final class d extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true);
                C5207g.m11111f(field, "field");
            }

            @Override // mm.AbstractC7640c
            /* JADX INFO: renamed from: c */
            public final void mo15197c(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                m15198d(C6744b.m13380l0(objArr));
            }
        }

        /* JADX INFO: renamed from: mm.c$e$e, reason: collision with other inner class name */
        public static final class C10652e extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10652e(Field field) {
                super(field, false);
                C5207g.m11111f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public e(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            C5207g.m11110e(genericType, "field.genericType");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0]);
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public Object mo13523b(Object[] objArr) {
            mo15197c(objArr);
            return ((Field) this.f42046a).get(this.f42048c != null ? C6744b.m13379k0(objArr) : null);
        }
    }

    /* JADX INFO: renamed from: mm.c$f */
    public static abstract class f extends AbstractC7640c<Field> {

        /* JADX INFO: renamed from: e */
        public final boolean f42053e;

        /* JADX INFO: renamed from: mm.c$f$a */
        public static final class a extends f implements InterfaceC7638a {

            /* JADX INFO: renamed from: f */
            public final Object f42054f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false);
                C5207g.m11111f(field, "field");
                this.f42054f = obj;
            }

            @Override // mm.AbstractC7640c.f, mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) throws IllegalAccessException {
                mo15197c(objArr);
                ((Field) this.f42046a).set(this.f42054f, C6744b.m13379k0(objArr));
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: mm.c$f$b */
        public static final class b extends f implements InterfaceC7638a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false);
                C5207g.m11111f(field, "field");
            }

            @Override // mm.AbstractC7640c.f, mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) throws IllegalAccessException {
                mo15197c(objArr);
                ((Field) this.f42046a).set(null, C6744b.m13386r0(objArr));
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: mm.c$f$c */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true);
                C5207g.m11111f(field, "field");
            }
        }

        /* JADX INFO: renamed from: mm.c$f$d */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true);
                C5207g.m11111f(field, "field");
            }

            @Override // mm.AbstractC7640c.f, mm.AbstractC7640c
            /* JADX INFO: renamed from: c */
            public final void mo15197c(Object[] objArr) {
                super.mo15197c(objArr);
                m15198d(C6744b.m13380l0(objArr));
            }
        }

        /* JADX INFO: renamed from: mm.c$f$e */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false);
                C5207g.m11111f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Field field, boolean z10, boolean z11) {
            Class cls = Void.TYPE;
            C5207g.m11110e(cls, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            C5207g.m11110e(genericType, "field.genericType");
            super(field, cls, declaringClass, new Type[]{genericType});
            this.f42053e = z10;
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public Object mo13523b(Object[] objArr) throws IllegalAccessException {
            mo15197c(objArr);
            ((Field) this.f42046a).set(this.f42048c != null ? C6744b.m13379k0(objArr) : null, C6744b.m13386r0(objArr));
            return C9072e.f47360a;
        }

        @Override // mm.AbstractC7640c
        /* JADX INFO: renamed from: c */
        public void mo15197c(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            if (this.f42053e && C6744b.m13386r0(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    /* JADX INFO: renamed from: mm.c$g */
    public static abstract class g extends AbstractC7640c<Method> {

        /* JADX INFO: renamed from: e */
        public final boolean f42055e;

        /* JADX INFO: renamed from: mm.c$g$a */
        public static final class a extends g implements InterfaceC7638a {

            /* JADX INFO: renamed from: f */
            public final Object f42056f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, Method method) {
                super(method, false, 4);
                C5207g.m11111f(method, "method");
                this.f42056f = obj;
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                return m15199e(this.f42056f, objArr);
            }
        }

        /* JADX INFO: renamed from: mm.c$g$b */
        public static final class b extends g implements InterfaceC7638a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, 4);
                C5207g.m11111f(method, "method");
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                return m15199e(null, objArr);
            }
        }

        /* JADX INFO: renamed from: mm.c$g$c */
        public static final class c extends g implements InterfaceC7638a {

            /* JADX INFO: renamed from: f */
            public final Object f42057f;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Object obj, Method method) {
                C5207g.m11111f(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                C5207g.m11110e(genericParameterTypes, "method.genericParameterTypes");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C9322j.m17677e0(1, genericParameterTypes.length, genericParameterTypes)));
                this.f42057f = obj;
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                C1702c c1702c = new C1702c(2);
                c1702c.m5436c(this.f42057f);
                c1702c.m5438e(objArr);
                return m15199e(null, c1702c.m5442i(new Object[c1702c.m5441h()]));
            }
        }

        /* JADX INFO: renamed from: mm.c$g$d */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, 6);
                C5207g.m11111f(method, "method");
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                return m15199e(objArr[0], objArr.length <= 1 ? new Object[0] : C9322j.m17677e0(1, objArr.length, objArr));
            }
        }

        /* JADX INFO: renamed from: mm.c$g$e */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, 4);
                C5207g.m11111f(method, "method");
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                m15198d(C6744b.m13380l0(objArr));
                return m15199e(null, objArr.length <= 1 ? new Object[0] : C9322j.m17677e0(1, objArr.length, objArr));
            }
        }

        /* JADX INFO: renamed from: mm.c$g$f */
        public static final class f extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, 6);
                C5207g.m11111f(method, "method");
            }

            @Override // mm.InterfaceC7639b
            /* JADX INFO: renamed from: b */
            public final Object mo13523b(Object[] objArr) {
                InterfaceC7639b.a.m15196a(this, objArr);
                return m15199e(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ g(Method method, boolean z10, int i10) {
            Type[] genericParameterTypes;
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                genericParameterTypes = method.getGenericParameterTypes();
                C5207g.m11110e(genericParameterTypes, "method.genericParameterTypes");
            } else {
                genericParameterTypes = null;
            }
            this(method, z10, genericParameterTypes);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            C5207g.m11110e(genericReturnType, "method.genericReturnType");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr);
            this.f42055e = C5207g.m11106a(genericReturnType, Void.TYPE);
        }

        /* JADX INFO: renamed from: e */
        public final Object m15199e(Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            C5207g.m11111f(objArr, "args");
            Object objInvoke = ((Method) this.f42046a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (this.f42055e) {
                objInvoke = C9072e.f47360a;
            }
            return objInvoke;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC7640c(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> listM13391w0;
        this.f42046a = member;
        this.f42047b = type;
        this.f42048c = cls;
        if (cls != null) {
            C1702c c1702c = new C1702c(2);
            c1702c.m5436c(cls);
            c1702c.m5438e(typeArr);
            listM13391w0 = C9000b.m17252r(c1702c.m5442i(new Type[c1702c.m5441h()]));
            listM13391w0 = listM13391w0 == null ? C6744b.m13391w0(typeArr) : listM13391w0;
        }
        this.f42049d = listM13391w0;
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: a */
    public final List<Type> mo13522a() {
        return this.f42049d;
    }

    /* JADX INFO: renamed from: c */
    public void mo15197c(Object[] objArr) {
        InterfaceC7639b.a.m15196a(this, objArr);
    }

    /* JADX INFO: renamed from: d */
    public final void m15198d(Object obj) {
        if (obj == null || !this.f42046a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: y */
    public final Type mo13524y() {
        return this.f42047b;
    }
}
