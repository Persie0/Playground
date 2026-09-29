package p543do;

import dm.C5207g;
import dm.C5209i;
import io.C6385l;
import km.InterfaceC6719b;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference1Impl;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C5227e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f33313a = {C5209i.m11120c(new PropertyReference1Impl(C5209i.f33277a.mo11123c(C5227e.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b */
    public static final C6385l f33314b;

    static {
        C5238j0.a aVar = C5238j0.f33329b;
        InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(C5225d.class);
        aVar.getClass();
        C5207g.m11111f(interfaceC6719bM11118a, "kClass");
        f33314b = new C6385l(interfaceC6719bM11118a, aVar.m14243b(interfaceC6719bM11118a));
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9077e m11251a(C5238j0 c5238j0) {
        InterfaceC9077e interfaceC9077e;
        C5207g.m11111f(c5238j0, "<this>");
        InterfaceC6727j<Object> interfaceC6727j = f33313a[0];
        C6385l c6385l = f33314b;
        c6385l.getClass();
        C5207g.m11111f(interfaceC6727j, "property");
        C5225d c5225d = (C5225d) c5238j0.mo13005a().get(c6385l.f36774b);
        if (c5225d != null && (interfaceC9077e = c5225d.f33310a) != null) {
            return interfaceC9077e;
        }
        return InterfaceC9077e.a.f47365a;
    }
}
