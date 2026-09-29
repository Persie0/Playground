package p543do;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import p372rm.InterfaceC8845j0;
import p372rm.InterfaceC8847k0;
import tl.C9325m;

/* JADX INFO: renamed from: do.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5230f0 {

    /* JADX INFO: renamed from: a */
    public final C5230f0 f33320a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8845j0 f33321b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC5246n0> f33322c;

    /* JADX INFO: renamed from: d */
    public final Map<InterfaceC8847k0, InterfaceC5246n0> f33323d;

    /* JADX INFO: renamed from: do.f0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C5230f0 m11263a(C5230f0 c5230f0, InterfaceC8845j0 interfaceC8845j0, List list) {
            C5207g.m11111f(interfaceC8845j0, "typeAliasDescriptor");
            C5207g.m11111f(list, "arguments");
            List<InterfaceC8847k0> listMo11260r = interfaceC8845j0.mo13600k().mo11260r();
            C5207g.m11110e(listMo11260r, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r, 10));
            Iterator<T> it = listMo11260r.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC8847k0) it.next()).mo18004P0());
            }
            return new C5230f0(c5230f0, interfaceC8845j0, list, C6753d.m13464Q0(C6752c.m13412A0(arrayList, list)));
        }
    }

    public C5230f0(C5230f0 c5230f0, InterfaceC8845j0 interfaceC8845j0, List list, Map map) {
        this.f33320a = c5230f0;
        this.f33321b = interfaceC8845j0;
        this.f33322c = list;
        this.f33323d = map;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11262a(InterfaceC8845j0 interfaceC8845j0) {
        boolean z10;
        C5207g.m11111f(interfaceC8845j0, "descriptor");
        if (C5207g.m11106a(this.f33321b, interfaceC8845j0)) {
            z10 = true;
        } else {
            z10 = false;
            C5230f0 c5230f0 = this.f33320a;
            if (c5230f0 != null ? c5230f0.m11262a(interfaceC8845j0) : false) {
                z10 = true;
            }
        }
        return z10;
    }
}
