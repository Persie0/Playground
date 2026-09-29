package p491xm;

import dm.C5207g;
import gn.InterfaceC5831k;
import gn.InterfaceC5846z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import tl.C9322j;

/* JADX INFO: renamed from: xm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10237l extends AbstractC10242q implements InterfaceC5831k {

    /* JADX INFO: renamed from: a */
    public final Constructor<?> f51669a;

    public C10237l(Constructor<?> constructor) {
        C5207g.m11111f(constructor, "member");
        this.f51669a = constructor;
    }

    @Override // p491xm.AbstractC10242q
    /* JADX INFO: renamed from: Y */
    public final Member mo19214Y() {
        return this.f51669a;
    }

    @Override // gn.InterfaceC5831k
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC5846z> mo12266i() {
        Constructor<?> constructor = this.f51669a;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        C5207g.m11110e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return EmptyList.f38032a;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C9322j.m17677e0(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                parameterAnnotations = (Annotation[][]) C9322j.m17677e0(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
            }
            return m19215Z(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }

    @Override // gn.InterfaceC5845y
    /* JADX INFO: renamed from: r */
    public final ArrayList mo12287r() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f51669a.getTypeParameters();
        C5207g.m11110e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C10249x(typeVariable));
        }
        return arrayList;
    }
}
