package p373rn;

import dm.C5207g;
import fo.C5602h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mn.C7645b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8863u;
import p385sf.C9000b;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5238j0;
import p543do.C5250p0;

/* JADX INFO: renamed from: rn.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C8883o extends AbstractC8875g<a> {

    /* JADX INFO: renamed from: rn.o$a */
    public static abstract class a {

        /* JADX INFO: renamed from: rn.o$a$a, reason: collision with other inner class name */
        public static final class C10669a extends a {

            /* JADX INFO: renamed from: a */
            public final AbstractC5257t f46776a;

            public C10669a(AbstractC5257t abstractC5257t) {
                this.f46776a = abstractC5257t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10669a) && C5207g.m11106a(this.f46776a, ((C10669a) obj).f46776a);
            }

            public final int hashCode() {
                return this.f46776a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f46776a + ')';
            }
        }

        /* JADX INFO: renamed from: rn.o$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final C8874f f46777a;

            public b(C8874f c8874f) {
                this.f46777a = c8874f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C5207g.m11106a(this.f46777a, ((b) obj).f46777a);
            }

            public final int hashCode() {
                return this.f46777a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f46777a + ')';
            }
        }
    }

    public C8883o(C7645b c7645b, int i10) {
        super(new a.b(new C8874f(c7645b, i10)));
    }

    public C8883o(C8874f c8874f) {
        super(new a.b(c8874f));
    }

    public C8883o(a.C10669a c10669a) {
        super(c10669a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p373rn.AbstractC8875g
    /* JADX INFO: renamed from: a */
    public final AbstractC5257t mo17121a(InterfaceC8863u interfaceC8863u) {
        AbstractC5257t abstractC5257tM11912c;
        C5207g.m11111f(interfaceC8863u, "module");
        C5238j0.f33329b.getClass();
        C5238j0 c5238j0 = C5238j0.f33330c;
        AbstractC6795c abstractC6795cMo11877o = interfaceC8863u.mo11877o();
        abstractC6795cMo11877o.getClass();
        InterfaceC8830c interfaceC8830cM13553j = abstractC6795cMo11877o.m13553j(C6797e.a.f38364P.m15229h());
        T t10 = this.f46772a;
        a aVar = (a) t10;
        if (aVar instanceof a.C10669a) {
            abstractC5257tM11912c = ((a.C10669a) t10).f46776a;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            C8874f c8874f = ((a.b) t10).f46777a;
            C7645b c7645b = c8874f.f46770a;
            InterfaceC8830c interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863u, c7645b);
            int i10 = c8874f.f46771b;
            if (interfaceC8830cM13584a == null) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String string = c7645b.toString();
                C5207g.m11110e(string, "classId.toString()");
                abstractC5257tM11912c = C5602h.m11912c(errorTypeKind, string, String.valueOf(i10));
            } else {
                AbstractC5265x abstractC5265xMo5316v = interfaceC8830cM13584a.mo5316v();
                C5207g.m11110e(abstractC5265xMo5316v, "descriptor.defaultType");
                AbstractC5262v0 abstractC5262v0M14238o = TypeUtilsKt.m14238o(abstractC5265xMo5316v);
                for (int i11 = 0; i11 < i10; i11++) {
                    abstractC5262v0M14238o = interfaceC8863u.mo11877o().m13551h(abstractC5262v0M14238o, Variance.INVARIANT);
                }
                abstractC5257tM11912c = abstractC5262v0M14238o;
            }
        }
        return KotlinTypeFactory.m14186e(c5238j0, interfaceC8830cM13553j, C9000b.m17251q(new C5250p0(abstractC5257tM11912c)));
    }
}
