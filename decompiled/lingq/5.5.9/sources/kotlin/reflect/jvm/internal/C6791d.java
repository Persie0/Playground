package kotlin.reflect.jvm.internal;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.lang.reflect.Method;
import kotlin.collections.C6744b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6791d {
    /* JADX INFO: renamed from: a */
    public static final String m13526a(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        C5207g.m11110e(parameterTypes, "parameterTypes");
        sb2.append(C6744b.m13385q0(parameterTypes, "", "(", ")", new InterfaceC2052l<Class<?>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(Class<?> cls) {
                Class<?> cls2 = cls;
                C5207g.m11110e(cls2, "it");
                return ReflectClassUtilKt.m13649b(cls2);
            }
        }, 24));
        Class<?> returnType = method.getReturnType();
        C5207g.m11110e(returnType, "returnType");
        sb2.append(ReflectClassUtilKt.m13649b(returnType));
        return sb2.toString();
    }
}
