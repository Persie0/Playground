package p491xm;

import dm.C5206f;
import dm.C5207g;
import gn.InterfaceC5820a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6719b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mn.C7645b;
import mn.C7648e;

/* JADX INFO: renamed from: xm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10229d extends AbstractC10238m implements InterfaceC5820a {

    /* JADX INFO: renamed from: a */
    public final Annotation f51659a;

    public C10229d(Annotation annotation) {
        C5207g.m11111f(annotation, "annotation");
        this.f51659a = annotation;
    }

    @Override // gn.InterfaceC5820a
    /* JADX INFO: renamed from: C */
    public final void mo12230C() {
    }

    @Override // gn.InterfaceC5820a
    /* JADX INFO: renamed from: I */
    public final C6831a mo12231I() {
        return new C6831a(C5206f.m10998T0(C5206f.m10995P0(this.f51659a)));
    }

    @Override // gn.InterfaceC5820a
    /* JADX INFO: renamed from: d */
    public final ArrayList mo12232d() throws IllegalAccessException, InvocationTargetException {
        AbstractC10230e c10235j;
        Annotation annotation = this.f51659a;
        Method[] declaredMethods = C5206f.m10998T0(C5206f.m10995P0(annotation)).getDeclaredMethods();
        C5207g.m11110e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            C5207g.m11110e(objInvoke, "method.invoke(annotation)");
            C7648e c7648eM15232l = C7648e.m15232l(method.getName());
            Class<?> cls = objInvoke.getClass();
            List<InterfaceC6719b<? extends Object>> list = ReflectClassUtilKt.f38580a;
            if (Enum.class.isAssignableFrom(cls)) {
                c10235j = new C10239n(c7648eM15232l, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                c10235j = new C10231f(c7648eM15232l, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                c10235j = new C10233h(c7648eM15232l, (Object[]) objInvoke);
            } else {
                c10235j = objInvoke instanceof Class ? new C10235j(c7648eM15232l, (Class) objInvoke) : new C10241p(objInvoke, c7648eM15232l);
            }
            arrayList.add(c10235j);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10229d) {
            if (this.f51659a == ((C10229d) obj).f51659a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51659a);
    }

    @Override // gn.InterfaceC5820a
    /* JADX INFO: renamed from: j */
    public final C7645b mo12233j() {
        return ReflectClassUtilKt.m13648a(C5206f.m10998T0(C5206f.m10995P0(this.f51659a)));
    }

    @Override // gn.InterfaceC5820a
    /* JADX INFO: renamed from: k */
    public final void mo12234k() {
    }

    public final String toString() {
        return C10229d.class.getName() + ": " + this.f51659a;
    }
}
