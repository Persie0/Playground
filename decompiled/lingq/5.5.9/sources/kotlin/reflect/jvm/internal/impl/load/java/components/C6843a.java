package kotlin.reflect.jvm.internal.impl.load.java.components;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5602h;
import gn.InterfaceC5833m;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7645b;
import mn.C7648e;
import p016an.C0128b;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8863u;
import p373rn.C8870b;
import p373rn.C8877i;
import p543do.AbstractC5257t;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6843a {

    /* JADX INFO: renamed from: a */
    public static final Map<String, EnumSet<KotlinTarget>> f38654a = C6753d.m13462O0(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b */
    public static final Map<String, KotlinRetention> f38655b = C6753d.m13462O0(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    /* JADX INFO: renamed from: a */
    public static C8870b m13676a(List list) {
        C5207g.m11111f(list, "arguments");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Object next = it.next();
                if (next instanceof InterfaceC5833m) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C7648e c7648eMo12268e = ((InterfaceC5833m) it2.next()).mo12268e();
            Iterable iterable = (EnumSet) f38654a.get(c7648eMo12268e != null ? c7648eMo12268e.m15235f() : null);
            if (iterable == null) {
                iterable = EmptySet.f38034a;
            }
            C9327o.m17684D(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C8877i(C7645b.m15203l(C6797e.a.f38398u), C7648e.m15232l(((KotlinTarget) it3.next()).name())));
        }
        return new C8870b(arrayList3, new InterfaceC2052l<InterfaceC8863u, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$mapJavaTargetArguments$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(InterfaceC8863u interfaceC8863u) {
                InterfaceC8863u interfaceC8863u2 = interfaceC8863u;
                C5207g.m11111f(interfaceC8863u2, "module");
                InterfaceC8853n0 interfaceC8853n0M322X0 = C0062b.m322X0(C0128b.f333b, interfaceC8863u2.mo11877o().m13553j(C6797e.a.f38397t));
                AbstractC5257t abstractC5257tMo11884c = interfaceC8853n0M322X0 != null ? interfaceC8853n0M322X0.mo11884c() : null;
                return abstractC5257tMo11884c == null ? C5602h.m11912c(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : abstractC5257tMo11884c;
            }
        });
    }
}
