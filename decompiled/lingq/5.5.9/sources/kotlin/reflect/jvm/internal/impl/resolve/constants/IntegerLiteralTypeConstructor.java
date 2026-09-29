package kotlin.reflect.jvm.internal.impl.resolve.constants;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C6740a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8863u;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import sl.InterfaceC9070c;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
public final class IntegerLiteralTypeConstructor implements InterfaceC5240k0 {

    /* JADX INFO: renamed from: a */
    public final long f39648a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8863u f39649b;

    /* JADX INFO: renamed from: c */
    public final Set<AbstractC5257t> f39650c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5265x f39651d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9070c f39652e;

    public static final class Companion {

        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$Companion$a */
        public /* synthetic */ class C7013a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f39653a;

            static {
                int[] iArr = new int[Mode.values().length];
                iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                f39653a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v17, types: [do.x] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [do.t, do.x, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static AbstractC5265x m14103a(ArrayList arrayList) {
            Set setM13456x0;
            Mode mode = Mode.INTERSECTION_TYPE;
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                AbstractC5265x abstractC5265x = (AbstractC5265x) it.next();
                next = (AbstractC5265x) next;
                if (next != 0 && abstractC5265x != null) {
                    InterfaceC5240k0 interfaceC5240k0Mo11250X0 = next.mo11250X0();
                    InterfaceC5240k0 interfaceC5240k0Mo11250X1 = abstractC5265x.mo11250X0();
                    boolean z10 = interfaceC5240k0Mo11250X0 instanceof IntegerLiteralTypeConstructor;
                    if (z10 && (interfaceC5240k0Mo11250X1 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) interfaceC5240k0Mo11250X0;
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (IntegerLiteralTypeConstructor) interfaceC5240k0Mo11250X1;
                        int i10 = C7013a.f39653a[mode.ordinal()];
                        if (i10 == 1) {
                            Set<AbstractC5257t> set = integerLiteralTypeConstructor.f39650c;
                            Set<AbstractC5257t> set2 = integerLiteralTypeConstructor2.f39650c;
                            C5207g.m11111f(set, "<this>");
                            C5207g.m11111f(set2, "other");
                            setM13456x0 = C6752c.m13456x0(set);
                            setM13456x0.retainAll(set2);
                        } else {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Set<AbstractC5257t> set3 = integerLiteralTypeConstructor.f39650c;
                            Set<AbstractC5257t> set4 = integerLiteralTypeConstructor2.f39650c;
                            C5207g.m11111f(set3, "<this>");
                            C5207g.m11111f(set4, "other");
                            setM13456x0 = C6752c.m13456x0(set3);
                            C9327o.m17684D(set4, setM13456x0);
                        }
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor3 = new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f39648a, integerLiteralTypeConstructor.f39649b, setM13456x0);
                        C5238j0.f33329b.getClass();
                        next = KotlinTypeFactory.m14185d(C5238j0.f33330c, integerLiteralTypeConstructor3);
                    } else if (z10) {
                        if (((IntegerLiteralTypeConstructor) interfaceC5240k0Mo11250X0).f39650c.contains(abstractC5265x)) {
                            next = abstractC5265x;
                        }
                    } else if (!(interfaceC5240k0Mo11250X1 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) interfaceC5240k0Mo11250X1).f39650c.contains(next)) {
                    }
                }
                next = 0;
            }
            return (AbstractC5265x) next;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public IntegerLiteralTypeConstructor() {
        throw null;
    }

    public IntegerLiteralTypeConstructor(long j10, InterfaceC8863u interfaceC8863u, Set set) {
        C5238j0.f33329b.getClass();
        this.f39651d = KotlinTypeFactory.m14185d(C5238j0.f33330c, this);
        this.f39652e = C6740a.m13372a(new InterfaceC2041a<List<AbstractC5265x>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$supertypes$2
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<AbstractC5265x> mo807E() {
                boolean z10 = true;
                IntegerLiteralTypeConstructor integerLiteralTypeConstructor = this.f39654b;
                AbstractC5265x abstractC5265xMo5316v = integerLiteralTypeConstructor.mo11234o().m13554k("Comparable").mo5316v();
                C5207g.m11110e(abstractC5265xMo5316v, "builtIns.comparable.defaultType");
                ArrayList arrayListM17254t = C9000b.m17254t(C5206f.m11015n1(abstractC5265xMo5316v, C9000b.m17251q(new C5250p0(integerLiteralTypeConstructor.f39651d, Variance.IN_VARIANCE)), null, 2));
                InterfaceC8863u interfaceC8863u2 = integerLiteralTypeConstructor.f39649b;
                C5207g.m11111f(interfaceC8863u2, "<this>");
                AbstractC5265x[] abstractC5265xArr = new AbstractC5265x[4];
                AbstractC6795c abstractC6795cMo11877o = interfaceC8863u2.mo11877o();
                abstractC6795cMo11877o.getClass();
                AbstractC5265x abstractC5265xM13562t = abstractC6795cMo11877o.m13562t(PrimitiveType.INT);
                if (abstractC5265xM13562t == null) {
                    AbstractC6795c.m13540a(58);
                    throw null;
                }
                abstractC5265xArr[0] = abstractC5265xM13562t;
                AbstractC6795c abstractC6795cMo11877o2 = interfaceC8863u2.mo11877o();
                abstractC6795cMo11877o2.getClass();
                AbstractC5265x abstractC5265xM13562t2 = abstractC6795cMo11877o2.m13562t(PrimitiveType.LONG);
                if (abstractC5265xM13562t2 == null) {
                    AbstractC6795c.m13540a(59);
                    throw null;
                }
                abstractC5265xArr[1] = abstractC5265xM13562t2;
                AbstractC6795c abstractC6795cMo11877o3 = interfaceC8863u2.mo11877o();
                abstractC6795cMo11877o3.getClass();
                AbstractC5265x abstractC5265xM13562t3 = abstractC6795cMo11877o3.m13562t(PrimitiveType.BYTE);
                if (abstractC5265xM13562t3 == null) {
                    AbstractC6795c.m13540a(56);
                    throw null;
                }
                abstractC5265xArr[2] = abstractC5265xM13562t3;
                AbstractC6795c abstractC6795cMo11877o4 = interfaceC8863u2.mo11877o();
                abstractC6795cMo11877o4.getClass();
                AbstractC5265x abstractC5265xM13562t4 = abstractC6795cMo11877o4.m13562t(PrimitiveType.SHORT);
                if (abstractC5265xM13562t4 == null) {
                    AbstractC6795c.m13540a(57);
                    throw null;
                }
                abstractC5265xArr[3] = abstractC5265xM13562t4;
                List listM17252r = C9000b.m17252r(abstractC5265xArr);
                if (!(listM17252r instanceof Collection) || !listM17252r.isEmpty()) {
                    Iterator it = listM17252r.iterator();
                    while (it.hasNext()) {
                        if (!(!integerLiteralTypeConstructor.f39650c.contains((AbstractC5257t) it.next()))) {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10) {
                    AbstractC5265x abstractC5265xMo5316v2 = integerLiteralTypeConstructor.mo11234o().m13554k("Number").mo5316v();
                    if (abstractC5265xMo5316v2 == null) {
                        AbstractC6795c.m13540a(55);
                        throw null;
                    }
                    arrayListM17254t.add(abstractC5265xMo5316v2);
                }
                return arrayListM17254t;
            }
        });
        this.f39648a = j10;
        this.f39649b = interfaceC8863u;
        this.f39650c = set;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        return this.f39649b.mo11877o();
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection<AbstractC5257t> mo11278p() {
        return (List) this.f39652e.getValue();
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: q */
    public final InterfaceC8834e mo11235q() {
        return null;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11260r() {
        return EmptyList.f38032a;
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: s */
    public final boolean mo11261s() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + C6752c.m13430X(this.f39650c, ",", null, null, new InterfaceC2052l<AbstractC5257t, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$valueToString$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(AbstractC5257t abstractC5257t) {
                AbstractC5257t abstractC5257t2 = abstractC5257t;
                C5207g.m11111f(abstractC5257t2, "it");
                return abstractC5257t2.toString();
            }
        }, 30) + ']');
        return sb2.toString();
    }
}
