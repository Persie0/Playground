package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import bn.InterfaceC1622f;
import cm.InterfaceC2041a;
import cn.C2064a;
import co.InterfaceC2073e;
import co.InterfaceC2074f;
import dm.C5207g;
import dm.C5209i;
import fo.C5602h;
import gn.InterfaceC5820a;
import gn.InterfaceC5822b;
import gn.InterfaceC5823c;
import gn.InterfaceC5825e;
import gn.InterfaceC5828h;
import gn.InterfaceC5833m;
import gn.InterfaceC5835o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p101en.C5435b;
import p123fn.InterfaceC5593a;
import p260m8.C7499b;
import p266n.C7669f;
import p338qd.C8573r0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p373rn.AbstractC8875g;
import p373rn.C8869a;
import p373rn.C8877i;
import p373rn.C8883o;
import p373rn.C8885q;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.InterfaceC5246n0;
import sm.InterfaceC9075c;
import tl.C9325m;
import zm.C10534s;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotationDescriptor implements InterfaceC9075c, InterfaceC1622f {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38692i = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a */
    public final C7669f f38693a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5820a f38694b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2074f f38695c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e f38696d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5593a f38697e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2073e f38698f;

    /* JADX INFO: renamed from: g */
    public final boolean f38699g;

    /* JADX INFO: renamed from: h */
    public final boolean f38700h;

    public LazyJavaAnnotationDescriptor(C7669f c7669f, InterfaceC5820a interfaceC5820a, boolean z10) {
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(interfaceC5820a, "javaAnnotation");
        this.f38693a = c7669f;
        this.f38694b = interfaceC5820a;
        this.f38695c = c7669f.m15268b().mo6219d(new InterfaceC2041a<C7646c>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C7646c mo807E() {
                C7645b c7645bMo12233j = this.f38702b.f38694b.mo12233j();
                if (c7645bMo12233j != null) {
                    return c7645bMo12233j.m15204b();
                }
                return null;
            }
        });
        this.f38696d = c7669f.m15268b().mo6217b(new InterfaceC2041a<AbstractC5265x>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC5265x mo807E() {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f38703b;
                C7646c c7646cMo12515e = lazyJavaAnnotationDescriptor.mo12515e();
                InterfaceC5820a interfaceC5820a2 = lazyJavaAnnotationDescriptor.f38694b;
                if (c7646cMo12515e == null) {
                    return C5602h.m11912c(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, interfaceC5820a2.toString());
                }
                C8573r0 c8573r0 = C8573r0.f45963O;
                C7669f c7669f2 = lazyJavaAnnotationDescriptor.f38693a;
                InterfaceC8830c interfaceC8830cM16676H0 = C8573r0.m16676H0(c8573r0, c7646cMo12515e, c7669f2.m15267a().mo11877o());
                if (interfaceC8830cM16676H0 == null) {
                    C6831a c6831aMo12231I = interfaceC5820a2.mo12231I();
                    Object obj = c7669f2.f42146a;
                    InterfaceC8830c interfaceC8830cMo6214a = c6831aMo12231I != null ? ((C2064a) obj).f10505k.mo6214a(c6831aMo12231I) : null;
                    if (interfaceC8830cMo6214a == null) {
                        interfaceC8830cM16676H0 = FindClassInModuleKt.m13586c(c7669f2.m15267a(), C7645b.m15203l(c7646cMo12515e), ((C2064a) obj).f10498d.m13769c().f52590l);
                    } else {
                        interfaceC8830cM16676H0 = interfaceC8830cMo6214a;
                    }
                }
                return interfaceC8830cM16676H0.mo5316v();
            }
        });
        this.f38697e = ((C2064a) c7669f.f42146a).f10504j.mo11843a(interfaceC5820a);
        this.f38698f = c7669f.m15268b().mo6217b(new InterfaceC2041a<Map<C7648e, ? extends AbstractC8875g<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<C7648e, ? extends AbstractC8875g<?>> mo807E() {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f38701b;
                ArrayList<InterfaceC5822b> arrayListMo12232d = lazyJavaAnnotationDescriptor.f38694b.mo12232d();
                ArrayList arrayList = new ArrayList();
                for (InterfaceC5822b interfaceC5822b : arrayListMo12232d) {
                    C7648e c7648eMo12237a = interfaceC5822b.mo12237a();
                    if (c7648eMo12237a == null) {
                        c7648eMo12237a = C10534s.f52535b;
                    }
                    AbstractC8875g<?> abstractC8875gM13686b = lazyJavaAnnotationDescriptor.m13686b(interfaceC5822b);
                    Pair pair = abstractC8875gM13686b != null ? new Pair(c7648eMo12237a, abstractC8875gM13686b) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return C6753d.m13464Q0(arrayList);
            }
        });
        interfaceC5820a.mo12234k();
        this.f38699g = false;
        interfaceC5820a.mo12230C();
        this.f38700h = z10;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: a */
    public final Map<C7648e, AbstractC8875g<?>> mo12513a() {
        return (Map) C0062b.m366l1(this.f38698f, f38692i[2]);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC8875g<?> m13686b(InterfaceC5822b interfaceC5822b) {
        AbstractC8875g<?> c8883o;
        AbstractC5257t abstractC5257tM13551h;
        if (interfaceC5822b instanceof InterfaceC5835o) {
            return ConstantValueFactory.m14102c(((InterfaceC5835o) interfaceC5822b).getValue());
        }
        C8877i c8877i = null;
        if (interfaceC5822b instanceof InterfaceC5833m) {
            InterfaceC5833m interfaceC5833m = (InterfaceC5833m) interfaceC5822b;
            C7645b c7645bMo12267c = interfaceC5833m.mo12267c();
            C7648e c7648eMo12268e = interfaceC5833m.mo12268e();
            if (c7645bMo12267c != null && c7648eMo12268e != null) {
                c8877i = new C8877i(c7645bMo12267c, c7648eMo12268e);
            }
        } else {
            boolean z10 = interfaceC5822b instanceof InterfaceC5825e;
            C7669f c7669f = this.f38693a;
            if (!z10) {
                if (interfaceC5822b instanceof InterfaceC5823c) {
                    c8883o = new C8869a(new LazyJavaAnnotationDescriptor(c7669f, ((InterfaceC5823c) interfaceC5822b).mo12238b(), false));
                } else if (interfaceC5822b instanceof InterfaceC5828h) {
                    AbstractC5257t abstractC5257tM13735e = ((C6859a) c7669f.f42150e).m13735e(((InterfaceC5828h) interfaceC5822b).mo12260d(), C5435b.m11586b(TypeUsage.COMMON, false, null, 3));
                    if (!C7499b.m14926X(abstractC5257tM13735e)) {
                        AbstractC5257t abstractC5257tMo11236c = abstractC5257tM13735e;
                        int i10 = 0;
                        while (AbstractC6795c.m13546z(abstractC5257tMo11236c)) {
                            abstractC5257tMo11236c = ((InterfaceC5246n0) C6752c.m13443k0(abstractC5257tMo11236c.mo11240V0())).mo11236c();
                            C5207g.m11110e(abstractC5257tMo11236c, "type.arguments.single().type");
                            i10++;
                        }
                        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257tMo11236c.mo11250X0().mo11235q();
                        if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
                            C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8834eMo11235q);
                            if (c7645bM14109f != null) {
                                return new C8883o(c7645bM14109f, i10);
                            }
                            c8883o = new C8883o(new C8883o.a.C10669a(abstractC5257tM13735e));
                        } else if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                            return new C8883o(C7645b.m15203l(C6797e.a.f38375a.m15229h()), 0);
                        }
                    }
                }
                return c8883o;
            }
            InterfaceC5825e interfaceC5825e = (InterfaceC5825e) interfaceC5822b;
            C7648e c7648eMo12237a = interfaceC5825e.mo12237a();
            if (c7648eMo12237a == null) {
                c7648eMo12237a = C10534s.f52535b;
            }
            C5207g.m11110e(c7648eMo12237a, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList arrayListMo12242f = interfaceC5825e.mo12242f();
            AbstractC5265x abstractC5265x = (AbstractC5265x) C0062b.m366l1(this.f38696d, f38692i[1]);
            C5207g.m11110e(abstractC5265x, "type");
            if (!C7499b.m14926X(abstractC5265x)) {
                InterfaceC8830c interfaceC8830cM14107d = DescriptorUtilsKt.m14107d(this);
                C5207g.m11108c(interfaceC8830cM14107d);
                InterfaceC8853n0 interfaceC8853n0M322X0 = C0062b.m322X0(c7648eMo12237a, interfaceC8830cM14107d);
                if (interfaceC8853n0M322X0 == null || (abstractC5257tM13551h = interfaceC8853n0M322X0.mo11884c()) == null) {
                    abstractC5257tM13551h = ((C2064a) c7669f.f42146a).f10509o.mo11877o().m13551h(C5602h.m11912c(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), Variance.INVARIANT);
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListMo12242f, 10));
                Iterator it = arrayListMo12242f.iterator();
                while (it.hasNext()) {
                    AbstractC8875g<?> abstractC8875gM13686b = m13686b((InterfaceC5822b) it.next());
                    if (abstractC8875gM13686b == null) {
                        abstractC8875gM13686b = new C8885q();
                    }
                    arrayList.add(abstractC8875gM13686b);
                }
                return ConstantValueFactory.m14100a(arrayList, abstractC5257tM13551h);
            }
        }
        return c8877i;
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo12514c() {
        return (AbstractC5265x) C0062b.m366l1(this.f38696d, f38692i[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: e */
    public final C7646c mo12515e() {
        InterfaceC6727j<Object> interfaceC6727j = f38692i[0];
        InterfaceC2074f interfaceC2074f = this.f38695c;
        C5207g.m11111f(interfaceC2074f, "<this>");
        C5207g.m11111f(interfaceC6727j, "p");
        return (C7646c) interfaceC2074f.mo807E();
    }

    @Override // sm.InterfaceC9075c
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo12516j() {
        return this.f38697e;
    }

    @Override // bn.InterfaceC1622f
    /* JADX INFO: renamed from: k */
    public final boolean mo5290k() {
        return this.f38699g;
    }

    public final String toString() {
        return DescriptorRenderer.f39546a.mo13981p(this, null);
    }
}
