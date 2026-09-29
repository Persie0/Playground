package kotlin.reflect.jvm.internal.impl.types;

import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5602h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p102eo.AbstractC5439d;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import p420um.AbstractC9590w;
import p543do.AbstractC5244m0;
import p543do.AbstractC5252q0;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5228e0;
import p543do.C5230f0;
import p543do.C5238j0;
import p543do.C5251q;
import p543do.C5266y;
import p543do.C5267z;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeFactory {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f39870a = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$a */
    public static final class C7053a {
    }

    static {
        int i10 = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.f39871b;
    }

    /* JADX INFO: renamed from: a */
    public static final C7053a m14182a(InterfaceC5240k0 interfaceC5240k0, AbstractC5439d abstractC5439d, List list) {
        InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
        if (interfaceC8834eMo11235q != null) {
            abstractC5439d.mo11661m0(interfaceC8834eMo11235q);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC5265x m14183b(InterfaceC8845j0 interfaceC8845j0, List<? extends InterfaceC5246n0> list) {
        C5207g.m11111f(interfaceC8845j0, "<this>");
        C5207g.m11111f(list, "arguments");
        C5228e0 c5228e0 = new C5228e0();
        C5230f0 c5230f0M11263a = C5230f0.a.m11263a(null, interfaceC8845j0, list);
        C5238j0.f33329b.getClass();
        C5238j0 c5238j0 = C5238j0.f33330c;
        C5207g.m11111f(c5238j0, "attributes");
        return c5228e0.m11254c(c5230f0M11263a, c5238j0, false, 0, true);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC5262v0 m14184c(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        C5207g.m11111f(abstractC5265x, "lowerBound");
        C5207g.m11111f(abstractC5265x2, "upperBound");
        return C5207g.m11106a(abstractC5265x, abstractC5265x2) ? abstractC5265x : new C5251q(abstractC5265x, abstractC5265x2);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC5265x m14185d(C5238j0 c5238j0, IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        C5207g.m11111f(c5238j0, "attributes");
        C5207g.m11111f(integerLiteralTypeConstructor, "constructor");
        return m14189h(EmptyList.f38032a, C5602h.m11910a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), c5238j0, integerLiteralTypeConstructor, false);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC5265x m14186e(C5238j0 c5238j0, InterfaceC8830c interfaceC8830c, List<? extends InterfaceC5246n0> list) {
        C5207g.m11111f(c5238j0, "attributes");
        C5207g.m11111f(interfaceC8830c, "descriptor");
        C5207g.m11111f(list, "arguments");
        InterfaceC5240k0 interfaceC5240k0Mo13600k = interfaceC8830c.mo13600k();
        C5207g.m11110e(interfaceC5240k0Mo13600k, "descriptor.typeConstructor");
        return m14187f(c5238j0, interfaceC5240k0Mo13600k, list, false, null);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC5265x m14187f(final C5238j0 c5238j0, final InterfaceC5240k0 interfaceC5240k0, final List<? extends InterfaceC5246n0> list, final boolean z10, AbstractC5439d abstractC5439d) {
        MemberScope memberScopeM14120a;
        C5207g.m11111f(c5238j0, "attributes");
        C5207g.m11111f(interfaceC5240k0, "constructor");
        C5207g.m11111f(list, "arguments");
        if (c5238j0.isEmpty() && list.isEmpty() && !z10 && interfaceC5240k0.mo11235q() != null) {
            InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
            C5207g.m11108c(interfaceC8834eMo11235q);
            AbstractC5265x abstractC5265xMo5316v = interfaceC8834eMo11235q.mo5316v();
            C5207g.m11110e(abstractC5265xMo5316v, "constructor.declarationDescriptor!!.defaultType");
            return abstractC5265xMo5316v;
        }
        InterfaceC8834e interfaceC8834eMo11235q2 = interfaceC5240k0.mo11235q();
        if (interfaceC8834eMo11235q2 instanceof InterfaceC8847k0) {
            memberScopeM14120a = ((InterfaceC8847k0) interfaceC8834eMo11235q2).mo5316v().mo11245q();
        } else if (interfaceC8834eMo11235q2 instanceof InterfaceC8830c) {
            if (abstractC5439d == null) {
                abstractC5439d = DescriptorUtilsKt.m14112i(DescriptorUtilsKt.m14113j(interfaceC8834eMo11235q2));
            }
            AbstractC9590w abstractC9590w = null;
            if (list.isEmpty()) {
                InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo11235q2;
                C5207g.m11111f(interfaceC8830c, "<this>");
                C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
                if (interfaceC8830c instanceof AbstractC9590w) {
                    abstractC9590w = (AbstractC9590w) interfaceC8830c;
                }
                if (abstractC9590w == null || (memberScopeM14120a = abstractC9590w.mo13593P(abstractC5439d)) == null) {
                    memberScopeM14120a = interfaceC8830c.mo13688N0();
                    C5207g.m11110e(memberScopeM14120a, "this.unsubstitutedMemberScope");
                }
            } else {
                InterfaceC8830c interfaceC8830c2 = (InterfaceC8830c) interfaceC8834eMo11235q2;
                AbstractC5252q0 abstractC5252q0M11281b = AbstractC5244m0.f33335b.m11281b(interfaceC5240k0, list);
                C5207g.m11111f(interfaceC8830c2, "<this>");
                C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
                if (interfaceC8830c2 instanceof AbstractC9590w) {
                    abstractC9590w = (AbstractC9590w) interfaceC8830c2;
                }
                if (abstractC9590w == null || (memberScopeM14120a = abstractC9590w.mo11844N(abstractC5252q0M11281b, abstractC5439d)) == null) {
                    memberScopeM14120a = interfaceC8830c2.mo17091T0(abstractC5252q0M11281b);
                    C5207g.m11110e(memberScopeM14120a, "this.getMemberScope(\n   …ubstitution\n            )");
                }
            }
        } else if (interfaceC8834eMo11235q2 instanceof InterfaceC8845j0) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String str = ((InterfaceC8845j0) interfaceC8834eMo11235q2).mo11874a().f42086a;
            C5207g.m11110e(str, "descriptor.name.toString()");
            memberScopeM14120a = C5602h.m11910a(errorScopeKind, true, str);
        } else {
            if (!(interfaceC5240k0 instanceof IntersectionTypeConstructor)) {
                throw new IllegalStateException("Unsupported classifier: " + interfaceC8834eMo11235q2 + " for constructor: " + interfaceC5240k0);
            }
            memberScopeM14120a = TypeIntersectionScope.C7016a.m14120a("member scope for intersection type", ((IntersectionTypeConstructor) interfaceC5240k0).f39864b);
        }
        return m14188g(c5238j0, interfaceC5240k0, list, z10, memberScopeM14120a, new InterfaceC2052l<AbstractC5439d, AbstractC5265x>(list, c5238j0, interfaceC5240k0, z10) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5240k0 f39872b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List<InterfaceC5246n0> f39873c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f39872b = interfaceC5240k0;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5265x mo528n(AbstractC5439d abstractC5439d2) {
                AbstractC5439d abstractC5439d3 = abstractC5439d2;
                C5207g.m11111f(abstractC5439d3, "refiner");
                int i10 = KotlinTypeFactory.f39870a;
                KotlinTypeFactory.m14182a(this.f39872b, abstractC5439d3, this.f39873c);
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC5265x m14188g(C5238j0 c5238j0, InterfaceC5240k0 interfaceC5240k0, List<? extends InterfaceC5246n0> list, boolean z10, MemberScope memberScope, InterfaceC2052l<? super AbstractC5439d, ? extends AbstractC5265x> interfaceC2052l) {
        C5207g.m11111f(c5238j0, "attributes");
        C5207g.m11111f(interfaceC5240k0, "constructor");
        C5207g.m11111f(list, "arguments");
        C5207g.m11111f(memberScope, "memberScope");
        C5207g.m11111f(interfaceC2052l, "refinedTypeFactory");
        C5266y c5266y = new C5266y(interfaceC5240k0, list, z10, memberScope, interfaceC2052l);
        return c5238j0.isEmpty() ? c5266y : new C5267z(c5266y, c5238j0);
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC5265x m14189h(final List list, final MemberScope memberScope, final C5238j0 c5238j0, final InterfaceC5240k0 interfaceC5240k0, final boolean z10) {
        C5207g.m11111f(c5238j0, "attributes");
        C5207g.m11111f(interfaceC5240k0, "constructor");
        C5207g.m11111f(list, "arguments");
        C5207g.m11111f(memberScope, "memberScope");
        C5266y c5266y = new C5266y(interfaceC5240k0, list, z10, memberScope, new InterfaceC2052l<AbstractC5439d, AbstractC5265x>(list, memberScope, c5238j0, interfaceC5240k0, z10) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC5240k0 f39874b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List<InterfaceC5246n0> f39875c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ MemberScope f39876d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f39874b = interfaceC5240k0;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5265x mo528n(AbstractC5439d abstractC5439d) {
                AbstractC5439d abstractC5439d2 = abstractC5439d;
                C5207g.m11111f(abstractC5439d2, "kotlinTypeRefiner");
                int i10 = KotlinTypeFactory.f39870a;
                KotlinTypeFactory.m14182a(this.f39874b, abstractC5439d2, this.f39875c);
                return null;
            }
        });
        return c5238j0.isEmpty() ? c5266y : new C5267z(c5266y, c5238j0);
    }
}
