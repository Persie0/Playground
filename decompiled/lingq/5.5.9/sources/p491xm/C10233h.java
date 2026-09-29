package p491xm;

import dm.C5207g;
import gn.InterfaceC5825e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6719b;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mn.C7648e;

/* JADX INFO: renamed from: xm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10233h extends AbstractC10230e implements InterfaceC5825e {

    /* JADX INFO: renamed from: b */
    public final Object[] f51662b;

    public C10233h(C7648e c7648e, Object[] objArr) {
        super(c7648e);
        this.f51662b = objArr;
    }

    @Override // gn.InterfaceC5825e
    /* JADX INFO: renamed from: f */
    public final ArrayList mo12242f() {
        AbstractC10230e c10235j;
        Object[] objArr = this.f51662b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            C5207g.m11108c(obj);
            Class<?> cls = obj.getClass();
            List<InterfaceC6719b<? extends Object>> list = ReflectClassUtilKt.f38580a;
            if (Enum.class.isAssignableFrom(cls)) {
                c10235j = new C10239n(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                c10235j = new C10231f(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                c10235j = new C10233h(null, (Object[]) obj);
            } else {
                c10235j = obj instanceof Class ? new C10235j(null, (Class) obj) : new C10241p(obj, null);
            }
            arrayList.add(c10235j);
        }
        return arrayList;
    }
}
