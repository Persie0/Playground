package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import fo.C5600f;
import fo.C5602h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C6740a;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p101en.C5434a;
import p101en.C5435b;
import p260m8.C7499b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5244m0;
import p543do.AbstractC5248o0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5242l0;
import sl.InterfaceC9070c;
import tl.C9325m;
import tl.C9338z;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterUpperBoundEraser {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9070c f38824a;

    /* JADX INFO: renamed from: b */
    public final RawSubstitution f38825b;

    /* JADX INFO: renamed from: c */
    public final LockBasedStorageManager.C7045k f38826c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$a */
    public static final class C6858a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8847k0 f38827a;

        /* JADX INFO: renamed from: b */
        public final boolean f38828b;

        /* JADX INFO: renamed from: c */
        public final C5434a f38829c;

        public C6858a(InterfaceC8847k0 interfaceC8847k0, boolean z10, C5434a c5434a) {
            C5207g.m11111f(interfaceC8847k0, "typeParameter");
            C5207g.m11111f(c5434a, "typeAttr");
            this.f38827a = interfaceC8847k0;
            this.f38828b = z10;
            this.f38829c = c5434a;
        }

        public final boolean equals(Object obj) {
            boolean z10 = false;
            if (!(obj instanceof C6858a)) {
                return false;
            }
            C6858a c6858a = (C6858a) obj;
            if (C5207g.m11106a(c6858a.f38827a, this.f38827a) && c6858a.f38828b == this.f38828b) {
                C5434a c5434a = c6858a.f38829c;
                JavaTypeFlexibility javaTypeFlexibility = c5434a.f33975b;
                C5434a c5434a2 = this.f38829c;
                if (javaTypeFlexibility == c5434a2.f33975b && c5434a.f33974a == c5434a2.f33974a && c5434a.f33976c == c5434a2.f33976c && C5207g.m11106a(c5434a.f33978e, c5434a2.f33978e)) {
                    z10 = true;
                }
            }
            return z10;
        }

        public final int hashCode() {
            int iHashCode = this.f38827a.hashCode();
            int i10 = (iHashCode * 31) + (this.f38828b ? 1 : 0) + iHashCode;
            C5434a c5434a = this.f38829c;
            int iHashCode2 = c5434a.f33975b.hashCode() + (i10 * 31) + i10;
            int iHashCode3 = c5434a.f33974a.hashCode() + (iHashCode2 * 31) + iHashCode2;
            int i11 = (iHashCode3 * 31) + (c5434a.f33976c ? 1 : 0) + iHashCode3;
            int i12 = i11 * 31;
            AbstractC5265x abstractC5265x = c5434a.f33978e;
            return i12 + (abstractC5265x != null ? abstractC5265x.hashCode() : 0) + i11;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f38827a + ", isRaw=" + this.f38828b + ", typeAttr=" + this.f38829c + ')';
        }
    }

    public TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution) {
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasion results");
        this.f38824a = C6740a.m13372a(new InterfaceC2041a<C5600f>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C5600f mo807E() {
                return C5602h.m11912c(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.f38830b.toString());
            }
        });
        this.f38825b = rawSubstitution == null ? new RawSubstitution(this) : rawSubstitution;
        this.f38826c = lockBasedStorageManager.mo6221f(new InterfaceC2052l<C6858a, AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final AbstractC5257t mo528n(TypeParameterUpperBoundEraser.C6858a c6858a) {
                Set<InterfaceC8847k0> set;
                AbstractC5262v0 abstractC5262v0M14238o;
                AbstractC5248o0 abstractC5248o0M13724g;
                AbstractC5262v0 abstractC5262v0M14238o2;
                TypeParameterUpperBoundEraser.C6858a c6858a2 = c6858a;
                InterfaceC8847k0 interfaceC8847k0 = c6858a2.f38827a;
                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f38831b;
                typeParameterUpperBoundEraser.getClass();
                C5434a c5434a = c6858a2.f38829c;
                Set<InterfaceC8847k0> set2 = c5434a.f33977d;
                InterfaceC9070c interfaceC9070c = typeParameterUpperBoundEraser.f38824a;
                AbstractC5265x abstractC5265x = c5434a.f33978e;
                if (set2 != null && set2.contains(interfaceC8847k0.mo18004P0())) {
                    return (abstractC5265x == null || (abstractC5262v0M14238o2 = TypeUtilsKt.m14238o(abstractC5265x)) == null) ? (C5600f) interfaceC9070c.getValue() : abstractC5262v0M14238o2;
                }
                AbstractC5265x abstractC5265xMo5316v = interfaceC8847k0.mo5316v();
                C5207g.m11110e(abstractC5265xMo5316v, "typeParameter.defaultType");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                TypeUtilsKt.m14229f(abstractC5265xMo5316v, abstractC5265xMo5316v, linkedHashSet, set2);
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(linkedHashSet, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    set = c5434a.f33977d;
                    if (!zHasNext) {
                        break;
                    }
                    InterfaceC8847k0 interfaceC8847k1 = (InterfaceC8847k0) it.next();
                    if (set2 == null || !set2.contains(interfaceC8847k1)) {
                        boolean z10 = c6858a2.f38828b;
                        C5434a c5434aM11584b = z10 ? c5434a : c5434a.m11584b(JavaTypeFlexibility.INFLEXIBLE);
                        AbstractC5257t abstractC5257tM13730a = typeParameterUpperBoundEraser.m13730a(interfaceC8847k1, z10, C5434a.m11583a(c5434a, null, set != null ? C9338z.m17690M0(set, interfaceC8847k0) : C7499b.m14972w0(interfaceC8847k0), null, 23));
                        C5207g.m11110e(abstractC5257tM13730a, "getErasedUpperBound(it, …Parameter(typeParameter))");
                        typeParameterUpperBoundEraser.f38825b.getClass();
                        abstractC5248o0M13724g = RawSubstitution.m13724g(interfaceC8847k1, c5434aM11584b, abstractC5257tM13730a);
                    } else {
                        abstractC5248o0M13724g = C5435b.m11585a(interfaceC8847k1, c5434a);
                    }
                    linkedHashMap.put(interfaceC8847k1.mo13600k(), abstractC5248o0M13724g);
                }
                AbstractC5244m0.a aVar = AbstractC5244m0.f33335b;
                TypeSubstitutor typeSubstitutorM14199e = TypeSubstitutor.m14199e(new C5242l0(linkedHashMap, false));
                List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
                C5207g.m11110e(upperBounds, "typeParameter.upperBounds");
                AbstractC5257t abstractC5257t = (AbstractC5257t) C6752c.m13423Q(upperBounds);
                if (abstractC5257t.mo11250X0().mo11235q() instanceof InterfaceC8830c) {
                    return TypeUtilsKt.m14237n(abstractC5257t, typeSubstitutorM14199e, linkedHashMap, Variance.OUT_VARIANCE, set);
                }
                Set<InterfaceC8847k0> setM14972w0 = set == null ? C7499b.m14972w0(typeParameterUpperBoundEraser) : set;
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
                C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                while (true) {
                    InterfaceC8847k0 interfaceC8847k2 = (InterfaceC8847k0) interfaceC8834eMo11235q;
                    if (setM14972w0.contains(interfaceC8847k2)) {
                        return (abstractC5265x == null || (abstractC5262v0M14238o = TypeUtilsKt.m14238o(abstractC5265x)) == null) ? (C5600f) interfaceC9070c.getValue() : abstractC5262v0M14238o;
                    }
                    List<AbstractC5257t> upperBounds2 = interfaceC8847k2.getUpperBounds();
                    C5207g.m11110e(upperBounds2, "current.upperBounds");
                    AbstractC5257t abstractC5257t2 = (AbstractC5257t) C6752c.m13423Q(upperBounds2);
                    if (abstractC5257t2.mo11250X0().mo11235q() instanceof InterfaceC8830c) {
                        return TypeUtilsKt.m14237n(abstractC5257t2, typeSubstitutorM14199e, linkedHashMap, Variance.OUT_VARIANCE, set);
                    }
                    interfaceC8834eMo11235q = abstractC5257t2.mo11250X0().mo11235q();
                    C5207g.m11109d(interfaceC8834eMo11235q, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5257t m13730a(InterfaceC8847k0 interfaceC8847k0, boolean z10, C5434a c5434a) {
        C5207g.m11111f(interfaceC8847k0, "typeParameter");
        C5207g.m11111f(c5434a, "typeAttr");
        return (AbstractC5257t) this.f38826c.mo528n(new C6858a(interfaceC8847k0, z10, c5434a));
    }
}
