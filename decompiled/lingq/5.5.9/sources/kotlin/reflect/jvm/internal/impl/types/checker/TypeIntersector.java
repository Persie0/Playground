package kotlin.reflect.jvm.internal.impl.types.checker;

import ae.C0062b;
import cm.InterfaceC2056p;
import dm.C5206f;
import dm.C5207g;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p102eo.C5441f;
import p102eo.InterfaceC5442g;
import p260m8.C7499b;
import p543do.AbstractC5234h0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5226d0;
import p543do.C5237j;
import p543do.C5238j0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeIntersector {

    /* JADX INFO: renamed from: a */
    public static final TypeIntersector f39914a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResultNullability {
        public static final ResultNullability START = new START();
        public static final ResultNullability ACCEPT_NULL = new ACCEPT_NULL();
        public static final ResultNullability UNKNOWN = new UNKNOWN();
        public static final ResultNullability NOT_NULL = new NOT_NULL();
        private static final /* synthetic */ ResultNullability[] $VALUES = $values();

        public static final class ACCEPT_NULL extends ResultNullability {
            public ACCEPT_NULL() {
                super("ACCEPT_NULL", 1, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(AbstractC5262v0 abstractC5262v0) {
                C5207g.m11111f(abstractC5262v0, "nextType");
                return getResultNullability(abstractC5262v0);
            }
        }

        public static final class NOT_NULL extends ResultNullability {
            public NOT_NULL() {
                super("NOT_NULL", 3, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(AbstractC5262v0 abstractC5262v0) {
                C5207g.m11111f(abstractC5262v0, "nextType");
                return this;
            }
        }

        public static final class START extends ResultNullability {
            public START() {
                super("START", 0, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(AbstractC5262v0 abstractC5262v0) {
                C5207g.m11111f(abstractC5262v0, "nextType");
                return getResultNullability(abstractC5262v0);
            }
        }

        public static final class UNKNOWN extends ResultNullability {
            public UNKNOWN() {
                super("UNKNOWN", 2, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            public final ResultNullability combine(AbstractC5262v0 abstractC5262v0) {
                C5207g.m11111f(abstractC5262v0, "nextType");
                ResultNullability resultNullability = getResultNullability(abstractC5262v0);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ ResultNullability[] $values() {
            return new ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        private ResultNullability(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ ResultNullability(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) $VALUES.clone();
        }

        public abstract ResultNullability combine(AbstractC5262v0 abstractC5262v0);

        public final ResultNullability getResultNullability(AbstractC5262v0 abstractC5262v0) {
            C5207g.m11111f(abstractC5262v0, "<this>");
            if (abstractC5262v0.mo11242Y0()) {
                return ACCEPT_NULL;
            }
            if ((abstractC5262v0 instanceof C5237j) && (((C5237j) abstractC5262v0).f33327b instanceof C5226d0)) {
                return NOT_NULL;
            }
            if (!(abstractC5262v0 instanceof C5226d0) && C7499b.m14920R(C7499b.m14965t(false, true, C5206f.f33268c, null, null, 24), C0062b.m262E1(abstractC5262v0), TypeCheckerState.AbstractC7055b.b.f39891a)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX INFO: renamed from: a */
    public static ArrayList m14222a(AbstractCollection abstractCollection, InterfaceC2056p interfaceC2056p) {
        boolean z10;
        ArrayList<AbstractC5265x> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        C5207g.m11110e(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            AbstractC5265x abstractC5265x = (AbstractC5265x) it.next();
            boolean z11 = false;
            if (!arrayList.isEmpty()) {
                for (AbstractC5265x abstractC5265x2 : arrayList) {
                    if (abstractC5265x2 != abstractC5265x) {
                        C5207g.m11110e(abstractC5265x2, "lower");
                        C5207g.m11110e(abstractC5265x, "upper");
                        if (((Boolean) interfaceC2056p.mo1337m0(abstractC5265x2, abstractC5265x)).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (z11) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [do.j0, io.a, io.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [do.j0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final AbstractC5265x m14223b(ArrayList arrayList) {
        AbstractC5265x abstractC5265xM14179c;
        arrayList.size();
        ArrayList<AbstractC5265x> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5265x abstractC5265x = (AbstractC5265x) it.next();
            if (abstractC5265x.mo11250X0() instanceof IntersectionTypeConstructor) {
                Collection<AbstractC5257t> collectionMo11278p = abstractC5265x.mo11250X0().mo11278p();
                C5207g.m11110e(collectionMo11278p, "type.constructor.supertypes");
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(collectionMo11278p, 10));
                for (AbstractC5257t abstractC5257t : collectionMo11278p) {
                    C5207g.m11110e(abstractC5257t, "it");
                    AbstractC5265x abstractC5265xM415x2 = C0062b.m415x2(abstractC5257t);
                    if (abstractC5265x.mo11242Y0()) {
                        abstractC5265xM415x2 = abstractC5265xM415x2.mo11217b1(true);
                    }
                    arrayList3.add(abstractC5265xM415x2);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC5265x);
            }
        }
        ResultNullability resultNullabilityCombine = ResultNullability.START;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((AbstractC5262v0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC5265x abstractC5265xMo11217b1 : arrayList2) {
            if (resultNullabilityCombine == ResultNullability.NOT_NULL) {
                if (abstractC5265xMo11217b1 instanceof C5441f) {
                    C5441f c5441f = (C5441f) abstractC5265xMo11217b1;
                    C5207g.m11111f(c5441f, "<this>");
                    abstractC5265xMo11217b1 = new C5441f(c5441f.f33985b, c5441f.f33986c, c5441f.f33987d, c5441f.f33988e, c5441f.f33989f, true);
                }
                C5207g.m11111f(abstractC5265xMo11217b1, "<this>");
                AbstractC5265x abstractC5265xM11271a = C5237j.a.m11271a(abstractC5265xMo11217b1, false);
                abstractC5265xMo11217b1 = (abstractC5265xM11271a == null && (abstractC5265xM11271a = C0062b.m270G1(abstractC5265xMo11217b1)) == null) ? abstractC5265xMo11217b1.mo11217b1(false) : abstractC5265xM11271a;
            }
            linkedHashSet.add(abstractC5265xMo11217b1);
        }
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((AbstractC5265x) it3.next()).mo11241W0());
        }
        Iterator it4 = arrayList4.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            C5238j0 c5238j0 = (C5238j0) it4.next();
            next = (C5238j0) next;
            next.getClass();
            C5207g.m11111f(c5238j0, "other");
            if (!next.isEmpty() || !c5238j0.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = C5238j0.f33329b.f39936a.values();
                C5207g.m11110e(collectionValues, "idPerType.values");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    AbstractC5234h0 abstractC5234h0 = (AbstractC5234h0) next.f36779a.get(iIntValue);
                    AbstractC5234h0 abstractC5234h1 = (AbstractC5234h0) c5238j0.f36779a.get(iIntValue);
                    C0062b.m282K(abstractC5234h0 == null ? abstractC5234h1 != null ? abstractC5234h1.mo11249c(abstractC5234h0) : null : abstractC5234h0.mo11249c(abstractC5234h1), arrayList5);
                }
                next = C5238j0.a.m11272c(arrayList5);
            }
        }
        C5238j0 c5238j1 = (C5238j0) next;
        if (linkedHashSet.size() == 1) {
            abstractC5265xM14179c = (AbstractC5265x) C6752c.m13442j0(linkedHashSet);
        } else {
            ArrayList arrayListM14222a = m14222a(linkedHashSet, new C7061x702eebb8(this));
            arrayListM14222a.isEmpty();
            AbstractC5265x abstractC5265xM14103a = IntegerLiteralTypeConstructor.Companion.m14103a(arrayListM14222a);
            if (abstractC5265xM14103a != null) {
                abstractC5265xM14179c = abstractC5265xM14103a;
            } else {
                InterfaceC5442g.f33991b.getClass();
                ArrayList arrayListM14222a2 = m14222a(arrayListM14222a, new C7062xc97d8c34(InterfaceC5442g.a.f33993b));
                arrayListM14222a2.isEmpty();
                abstractC5265xM14179c = arrayListM14222a2.size() < 2 ? (AbstractC5265x) C6752c.m13442j0(arrayListM14222a2) : new IntersectionTypeConstructor(linkedHashSet).m14179c();
            }
        }
        return abstractC5265xM14179c.mo11243d1(c5238j1);
    }
}
