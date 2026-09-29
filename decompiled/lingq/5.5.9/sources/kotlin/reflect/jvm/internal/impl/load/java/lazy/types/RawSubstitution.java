package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7645b;
import p101en.C5434a;
import p101en.C5435b;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p543do.AbstractC5248o0;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class RawSubstitution extends AbstractC5252q0 {

    /* JADX INFO: renamed from: c */
    public static final C5434a f38818c;

    /* JADX INFO: renamed from: d */
    public static final C5434a f38819d;

    /* JADX INFO: renamed from: b */
    public final TypeParameterUpperBoundEraser f38820b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$a */
    public /* synthetic */ class C6857a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38821a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            f38821a = iArr;
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f38818c = C5435b.m11586b(typeUsage, false, null, 3).m11584b(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f38819d = C5435b.m11586b(typeUsage, false, null, 3).m11584b(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f38820b = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(this) : typeParameterUpperBoundEraser;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC5248o0 m13724g(InterfaceC8847k0 interfaceC8847k0, C5434a c5434a, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(c5434a, "attr");
        C5207g.m11111f(abstractC5257t, "erasedUpperBound");
        int i10 = C6857a.f38821a[c5434a.f33975b.ordinal()];
        if (i10 == 1) {
            return new C5250p0(abstractC5257t, Variance.INVARIANT);
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!interfaceC8847k0.mo17088n().getAllowsOutPosition()) {
            return new C5250p0(DescriptorUtilsKt.m14108e(interfaceC8847k0).m13558o(), Variance.INVARIANT);
        }
        List<InterfaceC8847k0> listMo11260r = abstractC5257t.mo11250X0().mo11260r();
        C5207g.m11110e(listMo11260r, "erasedUpperBound.constructor.parameters");
        return listMo11260r.isEmpty() ^ true ? new C5250p0(abstractC5257t, Variance.OUT_VARIANCE) : C5435b.m11585a(interfaceC8847k0, c5434a);
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
        return new C5250p0(m13726i(abstractC5257t, new C5434a(TypeUsage.COMMON, false, null, 30)));
    }

    /* JADX INFO: renamed from: h */
    public final Pair<AbstractC5265x, Boolean> m13725h(final AbstractC5265x abstractC5265x, final InterfaceC8830c interfaceC8830c, final C5434a c5434a) {
        if (abstractC5265x.mo11250X0().mo11260r().isEmpty()) {
            return new Pair<>(abstractC5265x, Boolean.FALSE);
        }
        if (AbstractC6795c.m13546z(abstractC5265x)) {
            InterfaceC5246n0 interfaceC5246n0 = abstractC5265x.mo11240V0().get(0);
            Variance varianceMo11237d = interfaceC5246n0.mo11237d();
            AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
            C5207g.m11110e(abstractC5257tMo11236c, "componentTypeProjection.type");
            return new Pair<>(KotlinTypeFactory.m14187f(abstractC5265x.mo11241W0(), abstractC5265x.mo11250X0(), C9000b.m17251q(new C5250p0(m13726i(abstractC5257tMo11236c, c5434a), varianceMo11237d)), abstractC5265x.mo11242Y0(), null), Boolean.FALSE);
        }
        if (C7499b.m14926X(abstractC5265x)) {
            return new Pair<>(C5602h.m11912c(ErrorTypeKind.ERROR_RAW_TYPE, abstractC5265x.mo11250X0().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeMo17091T0 = interfaceC8830c.mo17091T0(this);
        C5207g.m11110e(memberScopeMo17091T0, "declaration.getMemberScope(this)");
        C5238j0 c5238j0Mo11241W0 = abstractC5265x.mo11241W0();
        InterfaceC5240k0 interfaceC5240k0Mo13600k = interfaceC8830c.mo13600k();
        C5207g.m11110e(interfaceC5240k0Mo13600k, "declaration.typeConstructor");
        List<InterfaceC8847k0> listMo11260r = interfaceC8830c.mo13600k().mo11260r();
        C5207g.m11110e(listMo11260r, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r, 10));
        for (InterfaceC8847k0 interfaceC8847k0 : listMo11260r) {
            C5207g.m11110e(interfaceC8847k0, "parameter");
            AbstractC5257t abstractC5257tM13730a = this.f38820b.m13730a(interfaceC8847k0, true, c5434a);
            C5207g.m11110e(abstractC5257tM13730a, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
            arrayList.add(m13724g(interfaceC8847k0, c5434a, abstractC5257tM13730a));
        }
        return new Pair<>(KotlinTypeFactory.m14188g(c5238j0Mo11241W0, interfaceC5240k0Mo13600k, arrayList, abstractC5265x.mo11242Y0(), memberScopeMo17091T0, new InterfaceC2052l<AbstractC5439d, AbstractC5265x>(c5434a, this, abstractC5265x) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5265x mo528n(AbstractC5439d abstractC5439d) {
                AbstractC5439d abstractC5439d2 = abstractC5439d;
                C5207g.m11111f(abstractC5439d2, "kotlinTypeRefiner");
                InterfaceC8830c interfaceC8830c2 = this.f38822b;
                if (!(interfaceC8830c2 instanceof InterfaceC8830c)) {
                    interfaceC8830c2 = null;
                }
                if (interfaceC8830c2 != null) {
                    C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c2);
                    if (c7645bM14109f != null) {
                        abstractC5439d2.mo11659k0(c7645bM14109f);
                    }
                }
                return null;
            }
        }), Boolean.TRUE);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final AbstractC5257t m13726i(AbstractC5257t abstractC5257t, C5434a c5434a) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
            AbstractC5257t abstractC5257tM13730a = this.f38820b.m13730a((InterfaceC8847k0) interfaceC8834eMo11235q, true, c5434a);
            C5207g.m11110e(abstractC5257tM13730a, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m13726i(abstractC5257tM13730a, c5434a);
        }
        if (!(interfaceC8834eMo11235q instanceof InterfaceC8830c)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC8834eMo11235q).toString());
        }
        InterfaceC8834e interfaceC8834eMo11235q2 = C0062b.m415x2(abstractC5257t).mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q2 instanceof InterfaceC8830c) {
            Pair<AbstractC5265x, Boolean> pairM13725h = m13725h(C0062b.m262E1(abstractC5257t), (InterfaceC8830c) interfaceC8834eMo11235q, f38818c);
            AbstractC5265x abstractC5265x = pairM13725h.f38012a;
            boolean zBooleanValue = pairM13725h.f38013b.booleanValue();
            Pair<AbstractC5265x, Boolean> pairM13725h2 = m13725h(C0062b.m415x2(abstractC5257t), (InterfaceC8830c) interfaceC8834eMo11235q2, f38819d);
            AbstractC5265x abstractC5265x2 = pairM13725h2.f38012a;
            return (zBooleanValue || pairM13725h2.f38013b.booleanValue()) ? new RawTypeImpl(abstractC5265x, abstractC5265x2) : KotlinTypeFactory.m14184c(abstractC5265x, abstractC5265x2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC8834eMo11235q2 + "\" while for lower it's \"" + interfaceC8834eMo11235q + '\"').toString());
    }
}
