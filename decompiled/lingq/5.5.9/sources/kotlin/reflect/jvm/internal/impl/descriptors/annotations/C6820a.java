package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7645b;
import mn.C7648e;
import p372rm.InterfaceC8863u;
import p373rn.C8869a;
import p373rn.C8870b;
import p373rn.C8877i;
import p373rn.C8887s;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6820a {

    /* JADX INFO: renamed from: a */
    public static final C7648e f38482a = C7648e.m15232l("message");

    /* JADX INFO: renamed from: b */
    public static final C7648e f38483b = C7648e.m15232l("replaceWith");

    /* JADX INFO: renamed from: c */
    public static final C7648e f38484c = C7648e.m15232l("level");

    /* JADX INFO: renamed from: d */
    public static final C7648e f38485d = C7648e.m15232l("expression");

    /* JADX INFO: renamed from: e */
    public static final C7648e f38486e = C7648e.m15232l("imports");

    /* JADX INFO: renamed from: a */
    public static BuiltInAnnotationDescriptor m13613a(final AbstractC6795c abstractC6795c) {
        C5207g.m11111f(abstractC6795c, "<this>");
        return new BuiltInAnnotationDescriptor(abstractC6795c, C6797e.a.f38390m, C6753d.m13462O0(new Pair(f38482a, new C8887s("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(f38483b, new C8869a(new BuiltInAnnotationDescriptor(abstractC6795c, C6797e.a.f38392o, C6753d.m13462O0(new Pair(f38485d, new C8887s("")), new Pair(f38486e, new C8870b(EmptyList.f38032a, new InterfaceC2052l<InterfaceC8863u, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(InterfaceC8863u interfaceC8863u) {
                InterfaceC8863u interfaceC8863u2 = interfaceC8863u;
                C5207g.m11111f(interfaceC8863u2, "module");
                return interfaceC8863u2.mo11877o().m13551h(abstractC6795c.m13563v(), Variance.INVARIANT);
            }
        })))))), new Pair(f38484c, new C8877i(C7645b.m15203l(C6797e.a.f38391n), C7648e.m15232l("WARNING")))));
    }
}
