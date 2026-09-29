package kotlin.reflect.jvm.internal;

import bo.InterfaceC1626d;
import bo.InterfaceC1627e;
import cm.InterfaceC2041a;
import dm.C5207g;
import dm.C5209i;
import dm.C5214n;
import in.C6363g;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6719b;
import km.InterfaceC6727j;
import km.InterfaceC6728k;
import km.InterfaceC6729l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p247lm.C7388a;
import p247lm.C7396i;
import p247lm.C7398k;
import p247lm.InterfaceC7394g;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p465wm.C9973c;
import p543do.AbstractC5257t;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class KTypeParameterImpl implements InterfaceC6729l {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38283d = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a */
    public final InterfaceC8847k0 f38284a;

    /* JADX INFO: renamed from: b */
    public final C7396i.a f38285b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7394g f38286c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KTypeParameterImpl$a */
    public /* synthetic */ class C6782a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38287a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f38287a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public KTypeParameterImpl(InterfaceC7394g interfaceC7394g, InterfaceC8847k0 interfaceC8847k0) {
        Class<?> cls;
        KClassImpl kClassImplM13516b;
        Object objMo11871C;
        C5207g.m11111f(interfaceC8847k0, "descriptor");
        this.f38284a = interfaceC8847k0;
        this.f38285b = C7396i.m14785c(new InterfaceC2041a<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends KTypeImpl> mo807E() {
                List<AbstractC5257t> upperBounds = this.f38288b.f38284a.getUpperBounds();
                C5207g.m11110e(upperBounds, "descriptor.upperBounds");
                ArrayList arrayList = new ArrayList(C9325m.m17681z(upperBounds, 10));
                Iterator<T> it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KTypeImpl((AbstractC5257t) it.next(), null));
                }
                return arrayList;
            }
        });
        if (interfaceC7394g == null) {
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC8847k0.mo11876g();
            C5207g.m11110e(interfaceC8838gMo11876g, "descriptor.containingDeclaration");
            if (interfaceC8838gMo11876g instanceof InterfaceC8830c) {
                objMo11871C = m13516b((InterfaceC8830c) interfaceC8838gMo11876g);
            } else {
                if (!(interfaceC8838gMo11876g instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + interfaceC8838gMo11876g);
                }
                InterfaceC8838g interfaceC8838gMo11876g2 = ((CallableMemberDescriptor) interfaceC8838gMo11876g).mo11876g();
                C5207g.m11110e(interfaceC8838gMo11876g2, "declaration.containingDeclaration");
                if (interfaceC8838gMo11876g2 instanceof InterfaceC8830c) {
                    kClassImplM13516b = m13516b((InterfaceC8830c) interfaceC8838gMo11876g2);
                } else {
                    InterfaceC6367k interfaceC6367k = null;
                    InterfaceC1627e interfaceC1627e = interfaceC8838gMo11876g instanceof InterfaceC1627e ? (InterfaceC1627e) interfaceC8838gMo11876g : null;
                    if (interfaceC1627e == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + interfaceC8838gMo11876g);
                    }
                    InterfaceC1626d interfaceC1626dMo5300j0 = interfaceC1627e.mo5300j0();
                    C6363g c6363g = (C6363g) (interfaceC1626dMo5300j0 instanceof C6363g ? interfaceC1626dMo5300j0 : null);
                    InterfaceC6367k interfaceC6367k2 = c6363g != null ? c6363g.f36742d : null;
                    if (interfaceC6367k2 instanceof C9973c) {
                        interfaceC6367k = interfaceC6367k2;
                    }
                    C9973c c9973c = (C9973c) interfaceC6367k;
                    if (c9973c == null || (cls = c9973c.f50697a) == null) {
                        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + interfaceC1627e);
                    }
                    InterfaceC6719b interfaceC6719bM11118a = C5209i.m11118a(cls);
                    C5207g.m11109d(interfaceC6719bM11118a, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImplM13516b = (KClassImpl) interfaceC6719bM11118a;
                }
                objMo11871C = interfaceC8838gMo11876g.mo11871C(new C7388a(kClassImplM13516b), C9072e.f47360a);
            }
            C5207g.m11110e(objMo11871C, "when (val declaration = … $declaration\")\n        }");
            interfaceC7394g = (InterfaceC7394g) objMo11871C;
        }
        this.f38286c = interfaceC7394g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static KClassImpl m13516b(InterfaceC8830c interfaceC8830c) {
        Class<?> clsM14797h = C7398k.m14797h(interfaceC8830c);
        KClassImpl kClassImpl = (KClassImpl) (clsM14797h != null ? C5209i.m11118a(clsM14797h) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + interfaceC8830c.mo11876g());
    }

    @Override // km.InterfaceC6729l
    /* JADX INFO: renamed from: a */
    public final String mo13341a() {
        String strM15235f = this.f38284a.mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "descriptor.name.asString()");
        return strM15235f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            if (C5207g.m11106a(this.f38286c, kTypeParameterImpl.f38286c) && C5207g.m11106a(mo13341a(), kTypeParameterImpl.mo13341a())) {
                return true;
            }
        }
        return false;
    }

    @Override // km.InterfaceC6729l
    public final List<InterfaceC6728k> getUpperBounds() {
        InterfaceC6727j<Object> interfaceC6727j = f38283d[0];
        Object objMo807E = this.f38285b.mo807E();
        C5207g.m11110e(objMo807E, "<get-upperBounds>(...)");
        return (List) objMo807E;
    }

    public final int hashCode() {
        return mo13341a().hashCode() + (this.f38286c.hashCode() * 31);
    }

    @Override // km.InterfaceC6729l
    /* JADX INFO: renamed from: n */
    public final KVariance mo13342n() {
        int i10 = C6782a.f38287a[this.f38284a.mo17088n().ordinal()];
        if (i10 == 1) {
            return KVariance.INVARIANT;
        }
        if (i10 == 2) {
            return KVariance.IN;
        }
        if (i10 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = C5214n.f33294a[mo13342n().ordinal()];
        if (i10 == 2) {
            sb2.append("in ");
        } else if (i10 == 3) {
            sb2.append("out ");
        }
        sb2.append(mo13341a());
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
