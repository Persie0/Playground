package p016an;

import bn.InterfaceC1622f;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5824d;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p266n.C7669f;
import zm.C10534s;

/* JADX INFO: renamed from: an.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0128b {

    /* JADX INFO: renamed from: a */
    public static final C7648e f332a = C7648e.m15232l("message");

    /* JADX INFO: renamed from: b */
    public static final C7648e f333b = C7648e.m15232l("allowedTargets");

    /* JADX INFO: renamed from: c */
    public static final C7648e f334c = C7648e.m15232l("value");

    /* JADX INFO: renamed from: d */
    public static final Map<C7646c, C7646c> f335d = C6753d.m13462O0(new Pair(C6797e.a.f38397t, C10534s.f52536c), new Pair(C6797e.a.f38400w, C10534s.f52537d), new Pair(C6797e.a.f38401x, C10534s.f52539f));

    /* JADX INFO: renamed from: a */
    public static InterfaceC1622f m529a(C7646c c7646c, InterfaceC5824d interfaceC5824d, C7669f c7669f) {
        InterfaceC5820a interfaceC5820aMo12239h;
        C5207g.m11111f(c7646c, "kotlinName");
        C5207g.m11111f(interfaceC5824d, "annotationOwner");
        C5207g.m11111f(c7669f, "c");
        if (C5207g.m11106a(c7646c, C6797e.a.f38390m)) {
            C7646c c7646c2 = C10534s.f52538e;
            C5207g.m11110e(c7646c2, "DEPRECATED_ANNOTATION");
            InterfaceC5820a interfaceC5820aMo12239h2 = interfaceC5824d.mo12239h(c7646c2);
            if (interfaceC5820aMo12239h2 != null) {
                return new JavaDeprecatedAnnotationDescriptor(interfaceC5820aMo12239h2, c7669f);
            }
            interfaceC5824d.mo12241x();
        }
        C7646c c7646c3 = f335d.get(c7646c);
        if (c7646c3 == null || (interfaceC5820aMo12239h = interfaceC5824d.mo12239h(c7646c3)) == null) {
            return null;
        }
        return m530b(c7669f, interfaceC5820aMo12239h, false);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1622f m530b(C7669f c7669f, InterfaceC5820a interfaceC5820a, boolean z10) {
        C5207g.m11111f(interfaceC5820a, "annotation");
        C5207g.m11111f(c7669f, "c");
        C7645b c7645bMo12233j = interfaceC5820a.mo12233j();
        if (C5207g.m11106a(c7645bMo12233j, C7645b.m15203l(C10534s.f52536c))) {
            return new JavaTargetAnnotationDescriptor(interfaceC5820a, c7669f);
        }
        if (C5207g.m11106a(c7645bMo12233j, C7645b.m15203l(C10534s.f52537d))) {
            return new JavaRetentionAnnotationDescriptor(interfaceC5820a, c7669f);
        }
        if (C5207g.m11106a(c7645bMo12233j, C7645b.m15203l(C10534s.f52539f))) {
            return new JavaAnnotationDescriptor(c7669f, interfaceC5820a, C6797e.a.f38401x);
        }
        if (C5207g.m11106a(c7645bMo12233j, C7645b.m15203l(C10534s.f52538e))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c7669f, interfaceC5820a, z10);
    }
}
