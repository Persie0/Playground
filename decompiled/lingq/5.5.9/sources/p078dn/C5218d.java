package p078dn;

import cn.C2064a;
import dm.C5207g;
import gn.InterfaceC5830j;
import gn.InterfaceC5844x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p101en.C5435b;
import p266n.C7669f;
import p372rm.InterfaceC8838g;
import p385sf.C9000b;
import p420um.AbstractC9559c;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import tl.C9325m;

/* JADX INFO: renamed from: dn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5218d extends AbstractC9559c {

    /* JADX INFO: renamed from: k */
    public final C7669f f33299k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5844x f33300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5218d(C7669f c7669f, InterfaceC5844x interfaceC5844x, int i10, InterfaceC8838g interfaceC8838g) {
        super(c7669f.m15268b(), interfaceC8838g, new LazyJavaAnnotations(c7669f, interfaceC5844x, false), interfaceC5844x.mo12280a(), Variance.INVARIANT, false, i10, ((C2064a) c7669f.f42146a).f10507m);
        C5207g.m11111f(interfaceC5844x, "javaTypeParameter");
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        this.f33299k = c7669f;
        this.f33300l = interfaceC5844x;
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: P0 */
    public final List<AbstractC5257t> mo11213P0(List<? extends AbstractC5257t> list) {
        C5207g.m11111f(list, "bounds");
        C7669f c7669f = this.f33299k;
        return ((C2064a) c7669f.f42146a).f10512r.m13745d(this, list, c7669f);
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: V0 */
    public final void mo11214V0(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "type");
    }

    @Override // p420um.AbstractC9571i
    /* JADX INFO: renamed from: W0 */
    public final List<AbstractC5257t> mo11215W0() {
        Collection<InterfaceC5830j> upperBounds = this.f33300l.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        C7669f c7669f = this.f33299k;
        if (zIsEmpty) {
            AbstractC5265x abstractC5265xM13549f = c7669f.m15267a().mo11877o().m13549f();
            C5207g.m11110e(abstractC5265xM13549f, "c.module.builtIns.anyType");
            return C9000b.m17251q(KotlinTypeFactory.m14184c(abstractC5265xM13549f, c7669f.m15267a().mo11877o().m13559p()));
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6859a) c7669f.f42150e).m13735e((InterfaceC5830j) it.next(), C5435b.m11586b(TypeUsage.COMMON, false, this, 1)));
        }
        return arrayList;
    }
}
