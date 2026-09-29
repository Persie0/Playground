package p491xm;

import dm.C5207g;
import gn.InterfaceC5833m;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mn.C7645b;
import mn.C7648e;

/* JADX INFO: renamed from: xm.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C10239n extends AbstractC10230e implements InterfaceC5833m {

    /* JADX INFO: renamed from: b */
    public final Enum<?> f51670b;

    public C10239n(C7648e c7648e, Enum<?> r10) {
        super(c7648e);
        this.f51670b = r10;
    }

    @Override // gn.InterfaceC5833m
    /* JADX INFO: renamed from: c */
    public final C7645b mo12267c() {
        Class<?> enclosingClass = this.f51670b.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        C5207g.m11110e(enclosingClass, "enumClass");
        return ReflectClassUtilKt.m13648a(enclosingClass);
    }

    @Override // gn.InterfaceC5833m
    /* JADX INFO: renamed from: e */
    public final C7648e mo12268e() {
        return C7648e.m15232l(this.f51670b.name());
    }
}
