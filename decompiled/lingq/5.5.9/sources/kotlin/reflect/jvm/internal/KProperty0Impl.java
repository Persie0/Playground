package kotlin.reflect.jvm.internal;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import km.InterfaceC6724g;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import p247lm.C7396i;
import p247lm.C7398k;
import p260m8.C7499b;
import p372rm.InterfaceC8829b0;

/* JADX INFO: loaded from: classes2.dex */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements InterfaceC6724g<V> {

    /* JADX INFO: renamed from: i */
    public final C7396i.b<C6777a<V>> f38240i;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KProperty0Impl$a */
    public static final class C6777a<R> extends KPropertyImpl.Getter<R> implements InterfaceC2041a {

        /* JADX INFO: renamed from: e */
        public final KProperty0Impl<R> f38242e;

        /* JADX WARN: Multi-variable type inference failed */
        public C6777a(KProperty0Impl<? extends R> kProperty0Impl) {
            C5207g.m11111f(kProperty0Impl, "property");
            this.f38242e = kProperty0Impl;
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final R mo807E() {
            return this.f38242e.get();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.AbstractC6780a
        /* JADX INFO: renamed from: j */
        public final KPropertyImpl mo13509j() {
            return this.f38242e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "signature");
        this.f38240i = C7396i.m14784b(new InterfaceC2041a<C6777a<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty0Impl<V> f38241b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38241b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty0Impl.C6777a(this.f38241b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty0Impl<V> f38243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38243b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() throws IllegalPropertyDelegateAccessException {
                KPropertyImpl kPropertyImpl = this.f38243b;
                Member memberM13512i = kPropertyImpl.m13512i();
                try {
                    Object obj2 = KPropertyImpl.f38252h;
                    Object objM14947k = kPropertyImpl.mo13490g() ? C7499b.m14947k(kPropertyImpl.f38256e, kPropertyImpl.mo13488e()) : null;
                    if (!(objM14947k != obj2)) {
                        objM14947k = null;
                    }
                    kPropertyImpl.mo13490g();
                    if (memberM13512i == null) {
                        return null;
                    }
                    if (memberM13512i instanceof Field) {
                        return ((Field) memberM13512i).get(objM14947k);
                    }
                    if (!(memberM13512i instanceof Method)) {
                        throw new AssertionError("delegate field/method " + memberM13512i + " neither field nor method");
                    }
                    int length = ((Method) memberM13512i).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) memberM13512i).invoke(null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) memberM13512i;
                        Object[] objArr = new Object[1];
                        if (objM14947k == null) {
                            Class<?> cls = ((Method) memberM13512i).getParameterTypes()[0];
                            C5207g.m11110e(cls, "fieldOrMethod.parameterTypes[0]");
                            objM14947k = C7398k.m14792c(cls);
                        }
                        objArr[0] = objM14947k;
                        return method.invoke(null, objArr);
                    }
                    if (length == 2) {
                        Method method2 = (Method) memberM13512i;
                        Class<?> cls2 = ((Method) memberM13512i).getParameterTypes()[1];
                        C5207g.m11110e(cls2, "fieldOrMethod.parameterTypes[1]");
                        return method2.invoke(null, objM14947k, C7398k.m14792c(cls2));
                    }
                    throw new AssertionError("delegate method " + memberM13512i + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e10) {
                    throw new IllegalPropertyDelegateAccessException(e10);
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, InterfaceC8829b0 interfaceC8829b0) {
        super(kDeclarationContainerImpl, interfaceC8829b0);
        C5207g.m11111f(kDeclarationContainerImpl, "container");
        C5207g.m11111f(interfaceC8829b0, "descriptor");
        this.f38240i = C7396i.m14784b(new InterfaceC2041a<C6777a<? extends V>>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty0Impl<V> f38241b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38241b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                return new KProperty0Impl.C6777a(this.f38241b);
            }
        });
        C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<Object>(this) { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ KProperty0Impl<V> f38243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f38243b = this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() throws IllegalPropertyDelegateAccessException {
                KPropertyImpl kPropertyImpl = this.f38243b;
                Member memberM13512i = kPropertyImpl.m13512i();
                try {
                    Object obj2 = KPropertyImpl.f38252h;
                    Object objM14947k = kPropertyImpl.mo13490g() ? C7499b.m14947k(kPropertyImpl.f38256e, kPropertyImpl.mo13488e()) : null;
                    if (!(objM14947k != obj2)) {
                        objM14947k = null;
                    }
                    kPropertyImpl.mo13490g();
                    if (memberM13512i == null) {
                        return null;
                    }
                    if (memberM13512i instanceof Field) {
                        return ((Field) memberM13512i).get(objM14947k);
                    }
                    if (!(memberM13512i instanceof Method)) {
                        throw new AssertionError("delegate field/method " + memberM13512i + " neither field nor method");
                    }
                    int length = ((Method) memberM13512i).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) memberM13512i).invoke(null, new Object[0]);
                    }
                    if (length == 1) {
                        Method method = (Method) memberM13512i;
                        Object[] objArr = new Object[1];
                        if (objM14947k == null) {
                            Class<?> cls = ((Method) memberM13512i).getParameterTypes()[0];
                            C5207g.m11110e(cls, "fieldOrMethod.parameterTypes[0]");
                            objM14947k = C7398k.m14792c(cls);
                        }
                        objArr[0] = objM14947k;
                        return method.invoke(null, objArr);
                    }
                    if (length == 2) {
                        Method method2 = (Method) memberM13512i;
                        Class<?> cls2 = ((Method) memberM13512i).getParameterTypes()[1];
                        C5207g.m11110e(cls2, "fieldOrMethod.parameterTypes[1]");
                        return method2.invoke(null, objM14947k, C7398k.m14792c(cls2));
                    }
                    throw new AssertionError("delegate method " + memberM13512i + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e10) {
                    throw new IllegalPropertyDelegateAccessException(e10);
                }
            }
        });
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final V mo807E() {
        return get();
    }

    @Override // km.InterfaceC6724g
    public final V get() {
        C6777a<V> c6777aM14786E = this.f38240i.m14786E();
        C5207g.m11110e(c6777aM14786E, "_getter()");
        return c6777aM14786E.mo13337b(new Object[0]);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: k */
    public final KPropertyImpl.Getter mo13511k() {
        C6777a<V> c6777aM14786E = this.f38240i.m14786E();
        C5207g.m11110e(c6777aM14786E, "_getter()");
        return c6777aM14786E;
    }
}
