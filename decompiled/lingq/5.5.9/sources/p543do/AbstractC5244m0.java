package p543do;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import p372rm.InterfaceC8847k0;
import tl.C9325m;

/* JADX INFO: renamed from: do.m0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5244m0 extends AbstractC5252q0 {

    /* JADX INFO: renamed from: b */
    public static final a f33335b = new a();

    /* JADX INFO: renamed from: do.m0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public final AbstractC5252q0 m11280a(AbstractC5257t abstractC5257t) {
            return m11281b(abstractC5257t.mo11250X0(), abstractC5257t.mo11240V0());
        }

        /* JADX WARN: Code duplicated, block: B:7:0x002e  */
        /* JADX INFO: renamed from: b */
        public final AbstractC5252q0 m11281b(InterfaceC5240k0 interfaceC5240k0, List<? extends InterfaceC5246n0> list) {
            boolean z10;
            C5207g.m11111f(interfaceC5240k0, "typeConstructor");
            C5207g.m11111f(list, "arguments");
            List<InterfaceC8847k0> listMo11260r = interfaceC5240k0.mo11260r();
            C5207g.m11110e(listMo11260r, "typeConstructor.parameters");
            InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) C6752c.m13433a0(listMo11260r);
            if (interfaceC8847k0 != null) {
                z10 = true;
                if (!interfaceC8847k0.mo17090v0()) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                Object[] array = listMo11260r.toArray(new InterfaceC8847k0[0]);
                C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                Object[] array2 = list.toArray(new InterfaceC5246n0[0]);
                C5207g.m11109d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return new C5255s((InterfaceC8847k0[]) array, (InterfaceC5246n0[]) array2, false);
            }
            List<InterfaceC8847k0> listMo11260r2 = interfaceC5240k0.mo11260r();
            C5207g.m11110e(listMo11260r2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r2, 10));
            Iterator<T> it = listMo11260r2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8847k0) it.next()).mo13600k());
            }
            return new C5242l0(C6753d.m13464Q0(C6752c.m13412A0(arrayList, list)), false);
        }
    }

    @Override // p543do.AbstractC5252q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC5246n0 mo11279d(AbstractC5257t abstractC5257t) {
        return mo11246g(abstractC5257t.mo11250X0());
    }

    /* JADX INFO: renamed from: g */
    public abstract InterfaceC5246n0 mo11246g(InterfaceC5240k0 interfaceC5240k0);
}
