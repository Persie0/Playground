package kotlin.reflect.jvm.internal.impl.types.checker;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p102eo.AbstractC5439d;
import p348qn.InterfaceC8652b;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.InterfaceC5246n0;
import sl.InterfaceC9070c;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class NewCapturedTypeConstructor implements InterfaceC8652b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5246n0 f39904a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2041a<? extends List<? extends AbstractC5262v0>> f39905b;

    /* JADX INFO: renamed from: c */
    public final NewCapturedTypeConstructor f39906c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8847k0 f39907d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9070c f39908e;

    public NewCapturedTypeConstructor() {
        throw null;
    }

    public NewCapturedTypeConstructor(InterfaceC5246n0 interfaceC5246n0, InterfaceC2041a<? extends List<? extends AbstractC5262v0>> interfaceC2041a, NewCapturedTypeConstructor newCapturedTypeConstructor, InterfaceC8847k0 interfaceC8847k0) {
        this.f39904a = interfaceC5246n0;
        this.f39905b = interfaceC2041a;
        this.f39906c = newCapturedTypeConstructor;
        this.f39907d = interfaceC8847k0;
        this.f39908e = C6740a.m13373b(LazyThreadSafetyMode.PUBLICATION, new InterfaceC2041a<List<? extends AbstractC5262v0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$_supertypes$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends AbstractC5262v0> mo807E() {
                InterfaceC2041a<? extends List<? extends AbstractC5262v0>> interfaceC2041a2 = this.f39910b.f39905b;
                if (interfaceC2041a2 != null) {
                    return interfaceC2041a2.mo807E();
                }
                return null;
            }
        });
    }

    public /* synthetic */ NewCapturedTypeConstructor(InterfaceC5246n0 interfaceC5246n0, InterfaceC2041a interfaceC2041a, NewCapturedTypeConstructor newCapturedTypeConstructor, InterfaceC8847k0 interfaceC8847k0, int i10) {
        this(interfaceC5246n0, (i10 & 2) != 0 ? null : interfaceC2041a, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : interfaceC8847k0);
    }

    @Override // p348qn.InterfaceC8652b
    /* JADX INFO: renamed from: b */
    public final InterfaceC5246n0 mo14219b() {
        return this.f39904a;
    }

    /* JADX INFO: renamed from: c */
    public final void m14220c(final ArrayList arrayList) {
        this.f39905b = new InterfaceC2041a<List<? extends AbstractC5262v0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$initializeSupertypes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends AbstractC5262v0> mo807E() {
                return arrayList;
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public final NewCapturedTypeConstructor m14221d(final AbstractC5439d abstractC5439d) {
        C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
        InterfaceC5246n0 interfaceC5246n0Mo11238e = this.f39904a.mo11238e(abstractC5439d);
        C5207g.m11110e(interfaceC5246n0Mo11238e, "projection.refine(kotlinTypeRefiner)");
        InterfaceC2041a<List<? extends AbstractC5262v0>> interfaceC2041a = this.f39905b != null ? new InterfaceC2041a<List<? extends AbstractC5262v0>>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$refine$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends AbstractC5262v0> mo807E() {
                Iterable iterable = (List) this.f39912b.f39908e.getValue();
                if (iterable == null) {
                    iterable = EmptyList.f38032a;
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC5262v0) it.next()).mo11216Z0(abstractC5439d));
                }
                return arrayList;
            }
        } : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f39906c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(interfaceC5246n0Mo11238e, interfaceC2041a, newCapturedTypeConstructor, this.f39907d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f39906c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f39906c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f39906c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11234o() {
        AbstractC5257t abstractC5257tMo11236c = this.f39904a.mo11236c();
        C5207g.m11110e(abstractC5257tMo11236c, "projection.type");
        return TypeUtilsKt.m14230g(abstractC5257tMo11236c);
    }

    @Override // p543do.InterfaceC5240k0
    /* JADX INFO: renamed from: p */
    public final Collection mo11278p() {
        Collection collection = (List) this.f39908e.getValue();
        if (collection == null) {
            collection = EmptyList.f38032a;
        }
        return collection;
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
        return "CapturedType(" + this.f39904a + ')';
    }
}
