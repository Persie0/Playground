package pm;

import co.InterfaceC2076h;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jm.C6525h;
import jm.C6526i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7645b;
import mn.C7648e;
import om.InterfaceC8084a;
import p102eo.AbstractC5439d;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8843i0;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p385sf.C9000b;
import p420um.AbstractC9557b;
import p420um.C9576k0;
import p543do.AbstractC5221b;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.InterfaceC5240k0;
import sl.C9072e;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: pm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8407b extends AbstractC9557b {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2076h f45529e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8865w f45530f;

    /* JADX INFO: renamed from: g */
    public final FunctionClassKind f45531g;

    /* JADX INFO: renamed from: h */
    public final int f45532h;

    /* JADX INFO: renamed from: i */
    public final a f45533i;

    /* JADX INFO: renamed from: j */
    public final C8408c f45534j;

    /* JADX INFO: renamed from: k */
    public final List<InterfaceC8847k0> f45535k;

    /* JADX INFO: renamed from: l */
    public static final C7645b f45528l = new C7645b(C6797e.f38344j, C7648e.m15232l("Function"));

    /* JADX INFO: renamed from: H */
    public static final C7645b f45527H = new C7645b(C6797e.f38341g, C7648e.m15232l("KFunction"));

    /* JADX INFO: renamed from: pm.b$a */
    public final class a extends AbstractC5221b {

        /* JADX INFO: renamed from: pm.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10668a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f45537a;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                iArr[FunctionClassKind.Function.ordinal()] = 1;
                iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                f45537a = iArr;
            }
        }

        public a() {
            super(C8407b.this.f45529e);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: d */
        public final Collection<AbstractC5257t> mo11258d() {
            List<C7645b> listM17251q;
            C8407b c8407b = C8407b.this;
            int i10 = C10668a.f45537a[c8407b.f45531g.ordinal()];
            if (i10 == 1) {
                listM17251q = C9000b.m17251q(C8407b.f45528l);
            } else if (i10 == 2) {
                listM17251q = C9000b.m17252r(C8407b.f45527H, new C7645b(C6797e.f38344j, FunctionClassKind.Function.numberedClassName(c8407b.f45532h)));
            } else if (i10 == 3) {
                listM17251q = C9000b.m17251q(C8407b.f45528l);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                listM17251q = C9000b.m17252r(C8407b.f45527H, new C7645b(C6797e.f38338d, FunctionClassKind.SuspendFunction.numberedClassName(c8407b.f45532h)));
            }
            InterfaceC8863u interfaceC8863uMo11876g = c8407b.f45530f.mo11876g();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listM17251q, 10));
            for (C7645b c7645b : listM17251q) {
                InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863uMo11876g, c7645b);
                if (interfaceC8830cM13584a == null) {
                    throw new IllegalStateException(("Built-in class " + c7645b + " not found").toString());
                }
                List listM13449q0 = C6752c.m13449q0(interfaceC8830cM13584a.mo13600k().mo11260r().size(), c8407b.f45535k);
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM13449q0, 10));
                Iterator it = listM13449q0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C5250p0(((InterfaceC8847k0) it.next()).mo5316v()));
                }
                C5238j0.f33329b.getClass();
                arrayList.add(KotlinTypeFactory.m14186e(C5238j0.f33330c, interfaceC8830cM13584a, arrayList2));
            }
            return C6752c.m13453u0(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: g */
        public final InterfaceC8843i0 mo11259g() {
            return InterfaceC8843i0.a.f46732a;
        }

        @Override // p543do.AbstractC5221b
        /* JADX INFO: renamed from: l */
        public final InterfaceC8830c mo11235q() {
            return C8407b.this;
        }

        @Override // p543do.AbstractC5221b, p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: q */
        public final InterfaceC8834e mo11235q() {
            return C8407b.this;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: r */
        public final List<InterfaceC8847k0> mo11260r() {
            return C8407b.this.f45535k;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: s */
        public final boolean mo11261s() {
            return true;
        }

        public final String toString() {
            return C8407b.this.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8407b(InterfaceC2076h interfaceC2076h, InterfaceC8084a interfaceC8084a, FunctionClassKind functionClassKind, int i10) {
        super(interfaceC2076h, functionClassKind.numberedClassName(i10));
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8084a, "containingDeclaration");
        C5207g.m11111f(functionClassKind, "functionKind");
        this.f45529e = interfaceC2076h;
        this.f45530f = interfaceC8084a;
        this.f45531g = functionClassKind;
        this.f45532h = i10;
        this.f45533i = new a();
        this.f45534j = new C8408c(interfaceC2076h, this);
        ArrayList arrayList = new ArrayList();
        C6526i c6526i = new C6526i(1, i10);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(c6526i, 10));
        C6525h it = c6526i.iterator();
        while (it.f37168c) {
            int iMo13105a = it.mo13105a();
            arrayList.add(C9576k0.m18034Z0(this, Variance.IN_VARIANCE, C7648e.m15232l("P" + iMo13105a), arrayList.size(), this.f45529e));
            arrayList2.add(C9072e.f47360a);
        }
        arrayList.add(C9576k0.m18034Z0(this, Variance.OUT_VARIANCE, C7648e.m15232l("R"), arrayList.size(), this.f45529e));
        this.f45535k = C6752c.m13453u0(arrayList);
    }

    @Override // p372rm.InterfaceC8862t
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
    public final Collection mo13590G() {
        return EmptyList.f38032a;
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
        return this.f45534j;
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
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final /* bridge */ /* synthetic */ InterfaceC8828b mo13597Y() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        return MemberScope.C7015a.f39670b;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final /* bridge */ /* synthetic */ InterfaceC8830c mo13599b0() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.h hVar = C8850m.f46738e;
        C5207g.m11110e(hVar, "PUBLIC");
        return hVar;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return this.f45530f;
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return InterfaceC8837f0.f46730a;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        return this.f45533i;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        return Modality.ABSTRACT;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection mo13601m() {
        return EmptyList.f38032a;
    }

    public final String toString() {
        String strM15235f = mo11874a().m15235f();
        C5207g.m11110e(strM15235f, "name.asString()");
        return strM15235f;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        return ClassKind.INTERFACE;
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
        return this.f45535k;
    }
}
