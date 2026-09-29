package p491xm;

import dm.C5207g;
import gn.InterfaceC5837q;
import gn.InterfaceC5846z;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6719b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: renamed from: xm.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C10243r extends AbstractC10242q implements InterfaceC5837q {

    /* JADX INFO: renamed from: a */
    public final Method f51673a;

    public C10243r(Method method) {
        C5207g.m11111f(method, "member");
        this.f51673a = method;
    }

    @Override // gn.InterfaceC5837q
    /* JADX INFO: renamed from: T */
    public final boolean mo12273T() {
        return m19216a0() != null;
    }

    @Override // p491xm.AbstractC10242q
    /* JADX INFO: renamed from: Y */
    public final Member mo19214Y() {
        return this.f51673a;
    }

    /* JADX INFO: renamed from: a0 */
    public final AbstractC10230e m19216a0() {
        AbstractC10230e c10235j;
        Object defaultValue = this.f51673a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        Class<?> cls = defaultValue.getClass();
        List<InterfaceC6719b<? extends Object>> list = ReflectClassUtilKt.f38580a;
        if (Enum.class.isAssignableFrom(cls)) {
            c10235j = new C10239n(null, (Enum) defaultValue);
        } else if (defaultValue instanceof Annotation) {
            c10235j = new C10231f(null, (Annotation) defaultValue);
        } else if (defaultValue instanceof Object[]) {
            c10235j = new C10233h(null, (Object[]) defaultValue);
        } else {
            c10235j = defaultValue instanceof Class ? new C10235j(null, (Class) defaultValue) : new C10241p(defaultValue, null);
        }
        return c10235j;
    }

    @Override // gn.InterfaceC5837q
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC5846z> mo12274i() {
        Method method = this.f51673a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        C5207g.m11110e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        C5207g.m11110e(parameterAnnotations, "member.parameterAnnotations");
        return m19215Z(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // gn.InterfaceC5837q
    /* JADX INFO: renamed from: m */
    public final AbstractC10248w mo12275m() {
        AbstractC10248w c10234i;
        Type genericReturnType = this.f51673a.getGenericReturnType();
        C5207g.m11110e(genericReturnType, "member.genericReturnType");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C10246u(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z10 && ((Class) genericReturnType).isArray())) {
            c10234i = new C10234i(genericReturnType);
        } else {
            c10234i = genericReturnType instanceof WildcardType ? new C10251z((WildcardType) genericReturnType) : new C10236k(genericReturnType);
        }
        return c10234i;
    }

    @Override // gn.InterfaceC5845y
    /* JADX INFO: renamed from: r */
    public final ArrayList mo12287r() {
        TypeVariable<Method>[] typeParameters = this.f51673a.getTypeParameters();
        C5207g.m11110e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C10249x(typeVariable));
        }
        return arrayList;
    }
}
