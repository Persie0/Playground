package p491xm;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: renamed from: xm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10228c {

    /* JADX INFO: renamed from: a */
    public static final C10228c f51655a = new C10228c();

    /* JADX INFO: renamed from: b */
    public static a f51656b;

    /* JADX INFO: renamed from: xm.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Method f51657a;

        /* JADX INFO: renamed from: b */
        public final Method f51658b;

        public a(Method method, Method method2) {
            this.f51657a = method;
            this.f51658b = method2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19210a(Member member) {
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.m13651d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }
}
