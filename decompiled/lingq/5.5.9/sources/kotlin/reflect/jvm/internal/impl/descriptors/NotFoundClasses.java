package kotlin.reflect.jvm.internal.impl.descriptors;

import ae.C0062b;
import cm.InterfaceC2052l;
import co.InterfaceC2071c;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jm.C6525h;
import jm.C6526i;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p260m8.C7499b;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8832d;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p420um.AbstractC9575k;
import p420um.C9576k0;
import p420um.C9583p;
import p543do.AbstractC5265x;
import p543do.C5229f;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2076h f38449a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8863u f38450b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2071c<C7646c, InterfaceC8865w> f38451c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2071c<C6810a, InterfaceC8830c> f38452d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$a */
    public static final class C6810a {

        /* JADX INFO: renamed from: a */
        public final C7645b f38453a;

        /* JADX INFO: renamed from: b */
        public final List<Integer> f38454b;

        public C6810a(C7645b c7645b, List<Integer> list) {
            C5207g.m11111f(c7645b, "classId");
            C5207g.m11111f(list, "typeParametersCount");
            this.f38453a = c7645b;
            this.f38454b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6810a)) {
                return false;
            }
            C6810a c6810a = (C6810a) obj;
            if (C5207g.m11106a(this.f38453a, c6810a.f38453a) && C5207g.m11106a(this.f38454b, c6810a.f38454b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f38454b.hashCode() + (this.f38453a.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.f38453a + ", typeParametersCount=" + this.f38454b + ')';
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$b */
    public static final class C6811b extends AbstractC9575k {

        /* JADX INFO: renamed from: h */
        public final boolean f38455h;

        /* JADX INFO: renamed from: i */
        public final ArrayList f38456i;

        /* JADX INFO: renamed from: j */
        public final C5229f f38457j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6811b(InterfaceC2076h interfaceC2076h, InterfaceC8832d interfaceC8832d, C7648e c7648e, boolean z10, int i10) {
            super(interfaceC2076h, interfaceC8832d, c7648e, InterfaceC8837f0.f46730a);
            C5207g.m11111f(interfaceC2076h, "storageManager");
            C5207g.m11111f(interfaceC8832d, "container");
            this.f38455h = z10;
            C6526i c6526iM411w2 = C0062b.m411w2(0, i10);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(c6526iM411w2, 10));
            C6525h it = c6526iM411w2.iterator();
            while (it.f37168c) {
                int iMo13105a = it.mo13105a();
                arrayList.add(C9576k0.m18034Z0(this, Variance.INVARIANT, C7648e.m15232l("T" + iMo13105a), iMo13105a, interfaceC2076h));
            }
            this.f38456i = arrayList;
            this.f38457j = new C5229f(this, TypeParameterUtilsKt.m13612b(this), C7499b.m14972w0(DescriptorUtilsKt.m14113j(this).mo11877o().m13549f()), interfaceC2076h);
        }

        @Override // p420um.AbstractC9575k, p372rm.InterfaceC8862t
        /* JADX INFO: renamed from: D */
        public final boolean mo5293D() {
            return false;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: E */
        public final boolean mo13589E() {
            return false;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: G */
        public final Collection<InterfaceC8828b> mo13590G() {
            return EmptySet.f38034a;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: I0 */
        public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
            return null;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: J */
        public final boolean mo13592J() {
            return false;
        }

        @Override // p372rm.InterfaceC8862t
        /* JADX INFO: renamed from: O0 */
        public final boolean mo11881O0() {
            return false;
        }

        @Override // p420um.AbstractC9590w
        /* JADX INFO: renamed from: P */
        public final MemberScope mo13593P(AbstractC5439d abstractC5439d) {
            C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
            return MemberScope.C7015a.f39670b;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: S */
        public final boolean mo13594S() {
            return false;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: S0 */
        public final boolean mo13595S0() {
            return false;
        }

        @Override // p372rm.InterfaceC8862t
        /* JADX INFO: renamed from: T */
        public final boolean mo11882T() {
            return false;
        }

        @Override // p372rm.InterfaceC8836f
        /* JADX INFO: renamed from: U */
        public final boolean mo13596U() {
            return this.f38455h;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: Y */
        public final InterfaceC8828b mo13597Y() {
            return null;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: Z */
        public final MemberScope mo13598Z() {
            return MemberScope.C7015a.f39670b;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: b0 */
        public final InterfaceC8830c mo13599b0() {
            return null;
        }

        @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
        /* JADX INFO: renamed from: f */
        public final AbstractC8852n mo11886f() {
            C8850m.h hVar = C8850m.f46738e;
            C5207g.m11110e(hVar, "PUBLIC");
            return hVar;
        }

        @Override // p372rm.InterfaceC8834e
        /* JADX INFO: renamed from: k */
        public final InterfaceC5240k0 mo13600k() {
            return this.f38457j;
        }

        @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
        /* JADX INFO: renamed from: l */
        public final Modality mo11891l() {
            return Modality.FINAL;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: m */
        public final Collection<InterfaceC8830c> mo13601m() {
            return EmptyList.f38032a;
        }

        public final String toString() {
            return "class " + mo11874a() + " (not found)";
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: u */
        public final ClassKind mo13602u() {
            return ClassKind.CLASS;
        }

        @Override // sm.InterfaceC9073a
        /* JADX INFO: renamed from: w */
        public final InterfaceC9077e mo11289w() {
            return InterfaceC9077e.a.f47365a;
        }

        @Override // p372rm.InterfaceC8830c
        /* JADX INFO: renamed from: x */
        public final boolean mo13603x() {
            return false;
        }

        @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
        /* JADX INFO: renamed from: z */
        public final List<InterfaceC8847k0> mo13604z() {
            return this.f38456i;
        }
    }

    public NotFoundClasses(InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8863u, "module");
        this.f38449a = interfaceC2076h;
        this.f38450b = interfaceC8863u;
        this.f38451c = interfaceC2076h.mo6221f(new InterfaceC2052l<C7646c, InterfaceC8865w>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8865w mo528n(C7646c c7646c) {
                C7646c c7646c2 = c7646c;
                C5207g.m11111f(c7646c2, "fqName");
                return new C9583p(this.f38459b.f38450b, c7646c2);
            }
        });
        this.f38452d = interfaceC2076h.mo6221f(new InterfaceC2052l<C6810a, InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8830c mo528n(NotFoundClasses.C6810a c6810a) {
                InterfaceC8832d interfaceC8832dM13588a;
                NotFoundClasses.C6810a c6810a2 = c6810a;
                C5207g.m11111f(c6810a2, "<name for destructuring parameter 0>");
                C7645b c7645b = c6810a2.f38453a;
                if (c7645b.f42075c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + c7645b);
                }
                C7645b c7645bM15207g = c7645b.m15207g();
                NotFoundClasses notFoundClasses = this.f38458b;
                List<Integer> list = c6810a2.f38454b;
                if (c7645bM15207g == null || (interfaceC8832dM13588a = notFoundClasses.m13588a(c7645bM15207g, C6752c.m13417K(list, 1))) == null) {
                    InterfaceC2071c<C7646c, InterfaceC8865w> interfaceC2071c = notFoundClasses.f38451c;
                    C7646c c7646cM15208h = c7645b.m15208h();
                    C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
                    interfaceC8832dM13588a = (InterfaceC8832d) ((LockBasedStorageManager.C7045k) interfaceC2071c).mo528n(c7646cM15208h);
                }
                InterfaceC8832d interfaceC8832d = interfaceC8832dM13588a;
                boolean zM15211k = c7645b.m15211k();
                InterfaceC2076h interfaceC2076h2 = notFoundClasses.f38449a;
                C7648e c7648eM15210j = c7645b.m15210j();
                C5207g.m11110e(c7648eM15210j, "classId.shortClassName");
                Integer num = (Integer) C6752c.m13425S(list);
                return new NotFoundClasses.C6811b(interfaceC2076h2, interfaceC8832d, c7648eM15210j, zM15211k, num != null ? num.intValue() : 0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8830c m13588a(C7645b c7645b, List<Integer> list) {
        C5207g.m11111f(c7645b, "classId");
        C5207g.m11111f(list, "typeParametersCount");
        return (InterfaceC8830c) ((LockBasedStorageManager.C7045k) this.f38452d).mo528n(new C6810a(c7645b, list));
    }
}
