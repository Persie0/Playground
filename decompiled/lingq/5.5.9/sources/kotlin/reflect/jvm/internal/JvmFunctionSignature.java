package kotlin.reflect.jvm.internal;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p248ln.AbstractC7403d;
import p260m8.C7499b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmFunctionSignature {

    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a */
        public final List<Method> f38133a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$a */
        public static final class C6765a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C7499b.m14951m(((Method) t10).getName(), ((Method) t11).getName());
            }
        }

        public FakeJavaAnnotationConstructor(Class<?> cls) {
            C5207g.m11111f(cls, "jClass");
            Method[] declaredMethods = cls.getDeclaredMethods();
            C5207g.m11110e(declaredMethods, "jClass.declaredMethods");
            this.f38133a = C6744b.m13389u0(declaredMethods, new C6765a());
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String mo13485a() {
            return C6752c.m13430X(this.f38133a, "", "<init>(", ")V", new InterfaceC2052l<Method, CharSequence>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final CharSequence mo528n(Method method) {
                    Class<?> returnType = method.getReturnType();
                    C5207g.m11110e(returnType, "it.returnType");
                    return ReflectClassUtilKt.m13649b(returnType);
                }
            }, 24);
        }
    }

    public static final class JavaConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a */
        public final Constructor<?> f38135a;

        public JavaConstructor(Constructor<?> constructor) {
            C5207g.m11111f(constructor, "constructor");
            this.f38135a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String mo13485a() {
            Class<?>[] parameterTypes = this.f38135a.getParameterTypes();
            C5207g.m11110e(parameterTypes, "constructor.parameterTypes");
            return C6744b.m13385q0(parameterTypes, "", "<init>(", ")V", new InterfaceC2052l<Class<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor$asString$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final CharSequence mo528n(Class<?> cls) {
                    Class<?> cls2 = cls;
                    C5207g.m11110e(cls2, "it");
                    return ReflectClassUtilKt.m13649b(cls2);
                }
            }, 24);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$a */
    public static final class C6766a extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a */
        public final Method f38137a;

        public C6766a(Method method) {
            this.f38137a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String mo13485a() {
            return C6791d.m13526a(this.f38137a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$b */
    public static final class C6767b extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a */
        public final AbstractC7403d.b f38138a;

        /* JADX INFO: renamed from: b */
        public final String f38139b;

        public C6767b(AbstractC7403d.b bVar) {
            this.f38138a = bVar;
            this.f38139b = bVar.mo14803a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String mo13485a() {
            return this.f38139b;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.JvmFunctionSignature$c */
    public static final class C6768c extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a */
        public final AbstractC7403d.b f38140a;

        /* JADX INFO: renamed from: b */
        public final String f38141b;

        public C6768c(AbstractC7403d.b bVar) {
            this.f38140a = bVar;
            this.f38141b = bVar.mo14803a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String mo13485a() {
            return this.f38141b;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo13485a();
}
