package p102eo;

import ae.C0062b;
import dm.C5207g;
import dm.C5209i;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7646c;
import mn.C7647d;
import p139go.C5859m;
import p139go.InterfaceC5847a;
import p139go.InterfaceC5848b;
import p139go.InterfaceC5849c;
import p139go.InterfaceC5850d;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5854h;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p139go.InterfaceC5858l;
import p139go.InterfaceC5861o;
import p260m8.C7499b;
import p372rm.AbstractC8849l0;
import p372rm.C8858q;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5223c;
import p543do.AbstractC5244m0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5220a0;
import p543do.C5226d0;
import p543do.C5237j;
import p543do.C5238j0;
import p543do.C5247o;
import p543do.C5250p0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import p543do.InterfaceC5263w;
import pn.C8414e;
import tl.C9325m;

/* JADX INFO: renamed from: eo.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5436a extends InterfaceC5858l {

    /* JADX INFO: renamed from: eo.a$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: A */
        public static List m11587A(InterfaceC5857k interfaceC5857k) {
            if (interfaceC5857k instanceof InterfaceC8847k0) {
                List<AbstractC5257t> upperBounds = ((InterfaceC8847k0) interfaceC5857k).getUpperBounds();
                C5207g.m11110e(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
        }

        /* JADX INFO: renamed from: B */
        public static TypeVariance m11588B(InterfaceC5855i interfaceC5855i) {
            C5207g.m11111f(interfaceC5855i, "$receiver");
            if (interfaceC5855i instanceof InterfaceC5246n0) {
                Variance varianceMo11237d = ((InterfaceC5246n0) interfaceC5855i).mo11237d();
                C5207g.m11110e(varianceMo11237d, "this.projectionKind");
                return C5859m.m12291a(varianceMo11237d);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5855i + ", " + C5209i.m11118a(interfaceC5855i.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: C */
        public static TypeVariance m11589C(InterfaceC5857k interfaceC5857k) {
            C5207g.m11111f(interfaceC5857k, "$receiver");
            if (interfaceC5857k instanceof InterfaceC8847k0) {
                Variance varianceMo17088n = ((InterfaceC8847k0) interfaceC5857k).mo17088n();
                C5207g.m11110e(varianceMo17088n, "this.variance");
                return C5859m.m12291a(varianceMo17088n);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
        }

        /* JADX INFO: renamed from: D */
        public static boolean m11590D(InterfaceC5852f interfaceC5852f, C7646c c7646c) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return ((AbstractC5257t) interfaceC5852f).mo11289w().mo5292x(c7646c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: E */
        public static boolean m11591E(InterfaceC5857k interfaceC5857k, InterfaceC5856j interfaceC5856j) {
            if (!(interfaceC5857k instanceof InterfaceC8847k0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
            }
            if (interfaceC5856j == null ? true : interfaceC5856j instanceof InterfaceC5240k0) {
                return TypeUtilsKt.m14233j((InterfaceC8847k0) interfaceC5857k, (InterfaceC5240k0) interfaceC5856j, 4);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: F */
        public static boolean m11592F(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
            C5207g.m11111f(interfaceC5853g, "a");
            C5207g.m11111f(interfaceC5853g2, "b");
            if (!(interfaceC5853g instanceof AbstractC5265x)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
            }
            if (interfaceC5853g2 instanceof AbstractC5265x) {
                return ((AbstractC5265x) interfaceC5853g).mo11240V0() == ((AbstractC5265x) interfaceC5853g2).mo11240V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g2 + ", " + C5209i.m11118a(interfaceC5853g2.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: G */
        public static AbstractC5262v0 m11593G(ArrayList arrayList) {
            AbstractC5265x abstractC5265x;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalStateException("Expected some types".toString());
            }
            if (size == 1) {
                return (AbstractC5262v0) C6752c.m13443k0(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it = arrayList.iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                AbstractC5262v0 abstractC5262v0 = (AbstractC5262v0) it.next();
                z10 = z10 || C7499b.m14926X(abstractC5262v0);
                if (abstractC5262v0 instanceof AbstractC5265x) {
                    abstractC5265x = (AbstractC5265x) abstractC5262v0;
                } else {
                    if (!(abstractC5262v0 instanceof AbstractC5249p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (C7499b.m14925W(abstractC5262v0)) {
                        return abstractC5262v0;
                    }
                    abstractC5265x = ((AbstractC5249p) abstractC5262v0).f33340b;
                    z11 = true;
                }
                arrayList2.add(abstractC5265x);
            }
            if (z10) {
                return C5602h.m11912c(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
            }
            if (!z11) {
                return TypeIntersector.f39914a.m14223b(arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(C0062b.m415x2((AbstractC5262v0) it2.next()));
            }
            TypeIntersector typeIntersector = TypeIntersector.f39914a;
            return KotlinTypeFactory.m14184c(typeIntersector.m14223b(arrayList2), typeIntersector.m14223b(arrayList3));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: H */
        public static boolean m11594H(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return AbstractC6795c.m13538K((InterfaceC5240k0) interfaceC5856j, C6797e.a.f38375a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: I */
        public static boolean m11595I(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return ((InterfaceC5240k0) interfaceC5856j).mo11235q() instanceof InterfaceC8830c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: J */
        public static boolean m11596J(InterfaceC5856j interfaceC5856j) {
            if (!(interfaceC5856j instanceof InterfaceC5240k0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
            }
            InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
            InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
            boolean z10 = false;
            if (interfaceC8830c == null) {
                return false;
            }
            if ((interfaceC8830c.mo11891l() == Modality.FINAL && interfaceC8830c.mo13602u() != ClassKind.ENUM_CLASS) && interfaceC8830c.mo13602u() != ClassKind.ENUM_ENTRY && interfaceC8830c.mo13602u() != ClassKind.ANNOTATION_CLASS) {
                z10 = true;
            }
            return z10;
        }

        /* JADX INFO: renamed from: K */
        public static boolean m11597K(InterfaceC5436a interfaceC5436a, InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            AbstractC5265x abstractC5265xMo11036C = interfaceC5436a.mo11036C(interfaceC5852f);
            return (abstractC5265xMo11036C != null ? interfaceC5436a.mo11082j(abstractC5265xMo11036C) : null) != null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: L */
        public static boolean m11598L(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return ((InterfaceC5240k0) interfaceC5856j).mo11261s();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: M */
        public static boolean m11599M(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return C7499b.m14926X((AbstractC5257t) interfaceC5852f);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: N */
        public static boolean m11600N(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (!(interfaceC5856j instanceof InterfaceC5240k0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
            }
            InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
            AbstractC8849l0<AbstractC5265x> abstractC8849l0Mo13591I0 = null;
            InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
            if (interfaceC8830c != null) {
                abstractC8849l0Mo13591I0 = interfaceC8830c.mo13591I0();
            }
            return abstractC8849l0Mo13591I0 instanceof C8858q;
        }

        /* JADX INFO: renamed from: O */
        public static boolean m11601O(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return interfaceC5856j instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: P */
        public static boolean m11602P(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return interfaceC5856j instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: Q */
        public static boolean m11603Q(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                return ((AbstractC5265x) interfaceC5853g).mo11242Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: R */
        public static boolean m11604R(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return AbstractC6795c.m13538K((InterfaceC5240k0) interfaceC5856j, C6797e.a.f38377b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: S */
        public static boolean m11605S(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return C5258t0.m11296g((AbstractC5257t) interfaceC5852f);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: T */
        public static boolean m11606T(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5257t) {
                return AbstractC6795c.m13535H((AbstractC5257t) interfaceC5853g);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX INFO: renamed from: U */
        public static boolean m11607U(InterfaceC5848b interfaceC5848b) {
            if (interfaceC5848b instanceof C5441f) {
                return ((C5441f) interfaceC5848b).f33990g;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5848b + ", " + C5209i.m11118a(interfaceC5848b.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: V */
        public static boolean m11608V(InterfaceC5855i interfaceC5855i) {
            C5207g.m11111f(interfaceC5855i, "$receiver");
            if (interfaceC5855i instanceof InterfaceC5246n0) {
                return ((InterfaceC5246n0) interfaceC5855i).mo11239f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5855i + ", " + C5209i.m11118a(interfaceC5855i.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: W */
        public static boolean m11609W(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (!(interfaceC5853g instanceof AbstractC5265x)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
            }
            AbstractC5257t abstractC5257t = (AbstractC5257t) interfaceC5853g;
            boolean z10 = true;
            if (!(abstractC5257t instanceof AbstractC5223c)) {
                if (!((abstractC5257t instanceof C5237j) && (((C5237j) abstractC5257t).f33327b instanceof AbstractC5223c))) {
                    z10 = false;
                }
            }
            return z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: X */
        public static boolean m11610X(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (!(interfaceC5853g instanceof AbstractC5265x)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
            }
            AbstractC5257t abstractC5257t = (AbstractC5257t) interfaceC5853g;
            boolean z10 = true;
            if (!(abstractC5257t instanceof C5226d0)) {
                if (!((abstractC5257t instanceof C5237j) && (((C5237j) abstractC5257t).f33327b instanceof C5226d0))) {
                    z10 = false;
                }
            }
            return z10;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: Y */
        public static boolean m11611Y(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
                return interfaceC8834eMo11235q != null && AbstractC6795c.m13539L(interfaceC8834eMo11235q);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: Z */
        public static AbstractC5265x m11612Z(InterfaceC5850d interfaceC5850d) {
            if (interfaceC5850d instanceof AbstractC5249p) {
                return ((AbstractC5249p) interfaceC5850d).f33340b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5850d + ", " + C5209i.m11118a(interfaceC5850d.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static boolean m11613a(InterfaceC5856j interfaceC5856j, InterfaceC5856j interfaceC5856j2) {
            C5207g.m11111f(interfaceC5856j, "c1");
            C5207g.m11111f(interfaceC5856j2, "c2");
            if (!(interfaceC5856j instanceof InterfaceC5240k0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
            }
            if (interfaceC5856j2 instanceof InterfaceC5240k0) {
                return C5207g.m11106a(interfaceC5856j, interfaceC5856j2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j2 + ", " + C5209i.m11118a(interfaceC5856j2.getClass())).toString());
        }

        /* JADX INFO: renamed from: a0 */
        public static InterfaceC5853g m11614a0(InterfaceC5436a interfaceC5436a, InterfaceC5852f interfaceC5852f) {
            AbstractC5265x abstractC5265xMo11036C;
            C5207g.m11111f(interfaceC5852f, "$receiver");
            AbstractC5249p abstractC5249pMo11037D = interfaceC5436a.mo11037D(interfaceC5852f);
            if (abstractC5249pMo11037D == null || (abstractC5265xMo11036C = interfaceC5436a.mo11087m(abstractC5249pMo11037D)) == null) {
                abstractC5265xMo11036C = interfaceC5436a.mo11036C(interfaceC5852f);
                C5207g.m11108c(abstractC5265xMo11036C);
            }
            return abstractC5265xMo11036C;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public static int m11615b(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return ((AbstractC5257t) interfaceC5852f).mo11240V0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: b0 */
        public static AbstractC5262v0 m11616b0(InterfaceC5848b interfaceC5848b) {
            if (interfaceC5848b instanceof C5441f) {
                return ((C5441f) interfaceC5848b).f33987d;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5848b + ", " + C5209i.m11118a(interfaceC5848b.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public static InterfaceC5854h m11617c(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                return (InterfaceC5854h) interfaceC5853g;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c0 */
        public static AbstractC5262v0 m11618c0(InterfaceC5852f interfaceC5852f) {
            if (interfaceC5852f instanceof AbstractC5262v0) {
                return C0062b.m266F1((AbstractC5262v0) interfaceC5852f, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public static InterfaceC5848b m11619d(InterfaceC5436a interfaceC5436a, InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                if (interfaceC5853g instanceof C5220a0) {
                    return interfaceC5436a.mo11060Z(((C5220a0) interfaceC5853g).f33303b);
                }
                if (interfaceC5853g instanceof C5441f) {
                    return (C5441f) interfaceC5853g;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX INFO: renamed from: d0 */
        public static AbstractC5265x m11620d0(InterfaceC5849c interfaceC5849c) {
            if (interfaceC5849c instanceof C5237j) {
                return ((C5237j) interfaceC5849c).f33327b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5849c + ", " + C5209i.m11118a(interfaceC5849c.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: e */
        public static C5237j m11621e(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                if (interfaceC5853g instanceof C5237j) {
                    return (C5237j) interfaceC5853g;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX INFO: renamed from: e0 */
        public static int m11622e0(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                return ((InterfaceC5240k0) interfaceC5856j).mo11260r().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public static C5247o m11623f(InterfaceC5850d interfaceC5850d) {
            if (interfaceC5850d instanceof AbstractC5249p) {
                if (interfaceC5850d instanceof C5247o) {
                    return (C5247o) interfaceC5850d;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5850d + ", " + C5209i.m11118a(interfaceC5850d.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f0 */
        public static Set m11624f0(InterfaceC5436a interfaceC5436a, InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            InterfaceC5240k0 interfaceC5240k0Mo11077h = interfaceC5436a.mo11077h(interfaceC5853g);
            if (interfaceC5240k0Mo11077h instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) interfaceC5240k0Mo11077h).f39650c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: g */
        public static AbstractC5249p m11625g(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                AbstractC5262v0 abstractC5262v0Mo11288a1 = ((AbstractC5257t) interfaceC5852f).mo11288a1();
                if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
                    return (AbstractC5249p) abstractC5262v0Mo11288a1;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: g0 */
        public static InterfaceC5246n0 m11626g0(InterfaceC5847a interfaceC5847a) {
            C5207g.m11111f(interfaceC5847a, "$receiver");
            if (interfaceC5847a instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) interfaceC5847a).f39904a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5847a + ", " + C5209i.m11118a(interfaceC5847a.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static InterfaceC5263w m11627h(AbstractC5249p abstractC5249p) {
            if (abstractC5249p instanceof InterfaceC5263w) {
                return (InterfaceC5263w) abstractC5249p;
            }
            return null;
        }

        /* JADX INFO: renamed from: h0 */
        public static int m11628h0(InterfaceC5436a interfaceC5436a, InterfaceC5854h interfaceC5854h) {
            C5207g.m11111f(interfaceC5854h, "$receiver");
            if (interfaceC5854h instanceof InterfaceC5853g) {
                return interfaceC5436a.mo11046M((InterfaceC5852f) interfaceC5854h);
            }
            if (interfaceC5854h instanceof ArgumentList) {
                return ((ArgumentList) interfaceC5854h).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC5854h + ", " + C5209i.m11118a(interfaceC5854h.getClass())).toString());
        }

        /* JADX INFO: renamed from: i */
        public static AbstractC5265x m11629i(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                AbstractC5262v0 abstractC5262v0Mo11288a1 = ((AbstractC5257t) interfaceC5852f).mo11288a1();
                if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
                    return (AbstractC5265x) abstractC5262v0Mo11288a1;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i0 */
        public static C5437b m11630i0(InterfaceC5436a interfaceC5436a, InterfaceC5853g interfaceC5853g) {
            if (interfaceC5853g instanceof AbstractC5265x) {
                return new C5437b(interfaceC5436a, TypeSubstitutor.m14199e(AbstractC5244m0.f33335b.m11280a((AbstractC5257t) interfaceC5853g)));
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: j */
        public static C5250p0 m11631j(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return TypeUtilsKt.m14224a((AbstractC5257t) interfaceC5852f);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: j0 */
        public static Collection m11632j0(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                Collection<AbstractC5257t> collectionMo11278p = ((InterfaceC5240k0) interfaceC5856j).mo11278p();
                C5207g.m11110e(collectionMo11278p, "this.supertypes");
                return collectionMo11278p;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX INFO: renamed from: k */
        public static AbstractC5265x m11633k(InterfaceC5853g interfaceC5853g, CaptureStatus captureStatus) {
            ArrayList arrayList;
            C5207g.m11111f(captureStatus, "status");
            if (!(interfaceC5853g instanceof AbstractC5265x)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
            }
            AbstractC5265x abstractC5265x = (AbstractC5265x) interfaceC5853g;
            if (abstractC5265x.mo11240V0().size() != abstractC5265x.mo11250X0().mo11260r().size()) {
                arrayList = null;
            } else {
                List<InterfaceC5246n0> listMo11240V0 = abstractC5265x.mo11240V0();
                boolean z10 = true;
                if (!(listMo11240V0 instanceof Collection) || !listMo11240V0.isEmpty()) {
                    Iterator<T> it = listMo11240V0.iterator();
                    while (it.hasNext()) {
                        if (!(((InterfaceC5246n0) it.next()).mo11237d() == Variance.INVARIANT)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (z10) {
                    arrayList = null;
                } else {
                    List<InterfaceC8847k0> listMo11260r = abstractC5265x.mo11250X0().mo11260r();
                    C5207g.m11110e(listMo11260r, "type.constructor.parameters");
                    ArrayList<Pair> arrayListM13412A0 = C6752c.m13412A0(listMo11240V0, listMo11260r);
                    arrayList = new ArrayList(C9325m.m17681z(arrayListM13412A0, 10));
                    for (Pair pair : arrayListM13412A0) {
                        InterfaceC5246n0 interfaceC5246n0M14224a = (InterfaceC5246n0) pair.f38012a;
                        InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) pair.f38013b;
                        if (interfaceC5246n0M14224a.mo11237d() != Variance.INVARIANT) {
                            AbstractC5262v0 abstractC5262v0Mo11288a1 = (interfaceC5246n0M14224a.mo11239f() || interfaceC5246n0M14224a.mo11237d() != Variance.IN_VARIANCE) ? null : interfaceC5246n0M14224a.mo11236c().mo11288a1();
                            C5207g.m11110e(interfaceC8847k0, "parameter");
                            interfaceC5246n0M14224a = TypeUtilsKt.m14224a(new C5441f(captureStatus, new NewCapturedTypeConstructor(interfaceC5246n0M14224a, null, null, interfaceC8847k0, 6), abstractC5262v0Mo11288a1, (C5238j0) null, false, 56));
                        }
                        arrayList.add(interfaceC5246n0M14224a);
                    }
                    TypeSubstitutor typeSubstitutorM14199e = TypeSubstitutor.m14199e(AbstractC5244m0.f33335b.m11281b(abstractC5265x.mo11250X0(), arrayList));
                    int size = listMo11240V0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        InterfaceC5246n0 interfaceC5246n0 = listMo11240V0.get(i10);
                        InterfaceC5246n0 interfaceC5246n1 = (InterfaceC5246n0) arrayList.get(i10);
                        if (interfaceC5246n0.mo11237d() != Variance.INVARIANT) {
                            List<AbstractC5257t> upperBounds = abstractC5265x.mo11250X0().mo11260r().get(i10).getUpperBounds();
                            C5207g.m11110e(upperBounds, "type.constructor.parameters[index].upperBounds");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.C7059a.f39903a.mo590a0(typeSubstitutorM14199e.m14204i((AbstractC5257t) it2.next(), Variance.INVARIANT).mo11288a1()));
                            }
                            if (!interfaceC5246n0.mo11239f() && interfaceC5246n0.mo11237d() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.C7059a.f39903a.mo590a0(interfaceC5246n0.mo11236c().mo11288a1()));
                            }
                            AbstractC5257t abstractC5257tMo11236c = interfaceC5246n1.mo11236c();
                            C5207g.m11109d(abstractC5257tMo11236c, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((C5441f) abstractC5257tMo11236c).f33986c.m14220c(arrayList2);
                        }
                    }
                }
            }
            if (arrayList != null) {
                return KotlinTypeFactory.m14187f(abstractC5265x.mo11241W0(), abstractC5265x.mo11250X0(), arrayList, abstractC5265x.mo11242Y0(), null);
            }
            return null;
        }

        /* JADX INFO: renamed from: k0 */
        public static InterfaceC5240k0 m11634k0(InterfaceC5853g interfaceC5853g) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                return ((AbstractC5265x) interfaceC5853g).mo11250X0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: l */
        public static CaptureStatus m11635l(InterfaceC5848b interfaceC5848b) {
            C5207g.m11111f(interfaceC5848b, "$receiver");
            if (interfaceC5848b instanceof C5441f) {
                return ((C5441f) interfaceC5848b).f33985b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5848b + ", " + C5209i.m11118a(interfaceC5848b.getClass())).toString());
        }

        /* JADX INFO: renamed from: l0 */
        public static InterfaceC5856j m11636l0(InterfaceC5436a interfaceC5436a, InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            InterfaceC5853g interfaceC5853gMo11036C = interfaceC5436a.mo11036C(interfaceC5852f);
            if (interfaceC5853gMo11036C == null) {
                interfaceC5853gMo11036C = interfaceC5436a.mo11071e(interfaceC5852f);
            }
            return interfaceC5436a.mo11077h(interfaceC5853gMo11036C);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: m */
        public static AbstractC5262v0 m11637m(InterfaceC5436a interfaceC5436a, InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
            C5207g.m11111f(interfaceC5853g, "lowerBound");
            C5207g.m11111f(interfaceC5853g2, "upperBound");
            if (!(interfaceC5853g instanceof AbstractC5265x)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5436a + ", " + C5209i.m11118a(interfaceC5436a.getClass())).toString());
            }
            if (interfaceC5853g2 instanceof AbstractC5265x) {
                return KotlinTypeFactory.m14184c((AbstractC5265x) interfaceC5853g, (AbstractC5265x) interfaceC5853g2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5436a + ", " + C5209i.m11118a(interfaceC5436a.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: m0 */
        public static NewCapturedTypeConstructor m11638m0(InterfaceC5848b interfaceC5848b) {
            C5207g.m11111f(interfaceC5848b, "$receiver");
            if (interfaceC5848b instanceof C5441f) {
                return ((C5441f) interfaceC5848b).f33986c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5848b + ", " + C5209i.m11118a(interfaceC5848b.getClass())).toString());
        }

        /* JADX INFO: renamed from: n */
        public static InterfaceC5855i m11639n(InterfaceC5436a interfaceC5436a, InterfaceC5854h interfaceC5854h, int i10) {
            C5207g.m11111f(interfaceC5854h, "$receiver");
            if (interfaceC5854h instanceof InterfaceC5853g) {
                return interfaceC5436a.mo11061a((InterfaceC5852f) interfaceC5854h, i10);
            }
            if (interfaceC5854h instanceof ArgumentList) {
                InterfaceC5855i interfaceC5855i = ((ArgumentList) interfaceC5854h).get(i10);
                C5207g.m11110e(interfaceC5855i, "get(index)");
                return interfaceC5855i;
            }
            throw new IllegalStateException(("unknown type argument list type: " + interfaceC5854h + ", " + C5209i.m11118a(interfaceC5854h.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n0 */
        public static AbstractC5265x m11640n0(InterfaceC5850d interfaceC5850d) {
            if (interfaceC5850d instanceof AbstractC5249p) {
                return ((AbstractC5249p) interfaceC5850d).f33341c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5850d + ", " + C5209i.m11118a(interfaceC5850d.getClass())).toString());
        }

        /* JADX INFO: renamed from: o */
        public static InterfaceC5855i m11641o(InterfaceC5852f interfaceC5852f, int i10) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return ((AbstractC5257t) interfaceC5852f).mo11240V0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: o0 */
        public static InterfaceC5853g m11642o0(InterfaceC5436a interfaceC5436a, InterfaceC5852f interfaceC5852f) {
            AbstractC5265x abstractC5265xMo11069d0;
            C5207g.m11111f(interfaceC5852f, "$receiver");
            AbstractC5249p abstractC5249pMo11037D = interfaceC5436a.mo11037D(interfaceC5852f);
            if (abstractC5249pMo11037D != null && (abstractC5265xMo11069d0 = interfaceC5436a.mo11069d0(abstractC5249pMo11037D)) != null) {
                return abstractC5265xMo11069d0;
            }
            AbstractC5265x abstractC5265xMo11036C = interfaceC5436a.mo11036C(interfaceC5852f);
            C5207g.m11108c(abstractC5265xMo11036C);
            return abstractC5265xMo11036C;
        }

        /* JADX INFO: renamed from: p */
        public static List m11643p(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return ((AbstractC5257t) interfaceC5852f).mo11240V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }

        /* JADX INFO: renamed from: p0 */
        public static AbstractC5265x m11644p0(InterfaceC5853g interfaceC5853g, boolean z10) {
            C5207g.m11111f(interfaceC5853g, "$receiver");
            if (interfaceC5853g instanceof AbstractC5265x) {
                return ((AbstractC5265x) interfaceC5853g).mo11217b1(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5853g + ", " + C5209i.m11118a(interfaceC5853g.getClass())).toString());
        }

        /* JADX INFO: renamed from: q */
        public static C7647d m11645q(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
                C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.m14111h((InterfaceC8830c) interfaceC8834eMo11235q);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: q0 */
        public static InterfaceC5852f m11646q0(InterfaceC5436a interfaceC5436a, InterfaceC5852f interfaceC5852f) {
            if (interfaceC5852f instanceof InterfaceC5853g) {
                return interfaceC5436a.mo11068d((InterfaceC5853g) interfaceC5852f, true);
            }
            if (!(interfaceC5852f instanceof InterfaceC5850d)) {
                throw new IllegalStateException("sealed".toString());
            }
            InterfaceC5850d interfaceC5850d = (InterfaceC5850d) interfaceC5852f;
            return interfaceC5436a.mo11041H(interfaceC5436a.mo11068d(interfaceC5436a.mo11087m(interfaceC5850d), true), interfaceC5436a.mo11068d(interfaceC5436a.mo11069d0(interfaceC5850d), true));
        }

        /* JADX INFO: renamed from: r */
        public static InterfaceC5857k m11647r(InterfaceC5856j interfaceC5856j, int i10) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8847k0 interfaceC8847k0 = ((InterfaceC5240k0) interfaceC5856j).mo11260r().get(i10);
                C5207g.m11110e(interfaceC8847k0, "this.parameters[index]");
                return interfaceC8847k0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: s */
        public static List m11648s(InterfaceC5856j interfaceC5856j) {
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                List<InterfaceC8847k0> listMo11260r = ((InterfaceC5240k0) interfaceC5856j).mo11260r();
                C5207g.m11110e(listMo11260r, "this.parameters");
                return listMo11260r;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: t */
        public static PrimitiveType m11649t(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
                C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC6795c.m13543s((InterfaceC8830c) interfaceC8834eMo11235q);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: u */
        public static PrimitiveType m11650u(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
                C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC6795c.m13544u((InterfaceC8830c) interfaceC8834eMo11235q);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: v */
        public static AbstractC5257t m11651v(InterfaceC5857k interfaceC5857k) {
            if (interfaceC5857k instanceof InterfaceC8847k0) {
                return TypeUtilsKt.m14231h((InterfaceC8847k0) interfaceC5857k);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5857k + ", " + C5209i.m11118a(interfaceC5857k.getClass())).toString());
        }

        /* JADX INFO: renamed from: w */
        public static AbstractC5262v0 m11652w(InterfaceC5855i interfaceC5855i) {
            C5207g.m11111f(interfaceC5855i, "$receiver");
            if (interfaceC5855i instanceof InterfaceC5246n0) {
                return ((InterfaceC5246n0) interfaceC5855i).mo11236c().mo11288a1();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5855i + ", " + C5209i.m11118a(interfaceC5855i.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: x */
        public static InterfaceC8847k0 m11653x(InterfaceC5861o interfaceC5861o) {
            if (interfaceC5861o instanceof InterfaceC5444i) {
                return ((InterfaceC5444i) interfaceC5861o).m11668a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5861o + ", " + C5209i.m11118a(interfaceC5861o.getClass())).toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: y */
        public static InterfaceC8847k0 m11654y(InterfaceC5856j interfaceC5856j) {
            C5207g.m11111f(interfaceC5856j, "$receiver");
            if (interfaceC5856j instanceof InterfaceC5240k0) {
                InterfaceC8834e interfaceC8834eMo11235q = ((InterfaceC5240k0) interfaceC5856j).mo11235q();
                if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                    return (InterfaceC8847k0) interfaceC8834eMo11235q;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5856j + ", " + C5209i.m11118a(interfaceC5856j.getClass())).toString());
        }

        /* JADX INFO: renamed from: z */
        public static AbstractC5265x m11655z(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "$receiver");
            if (interfaceC5852f instanceof AbstractC5257t) {
                return C8414e.m16468e((AbstractC5257t) interfaceC5852f);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC5852f + ", " + C5209i.m11118a(interfaceC5852f.getClass())).toString());
        }
    }

    /* JADX INFO: renamed from: H */
    AbstractC5262v0 mo11041H(InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2);
}
