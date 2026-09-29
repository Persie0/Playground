package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import cm.InterfaceC2052l;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2072d;
import dm.C5207g;
import gn.InterfaceC5844x;
import gn.InterfaceC5845y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p078dn.C5218d;
import p266n.C7669f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterResolver implements InterfaceC2068e {

    /* JADX INFO: renamed from: a */
    public final C7669f f38673a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g f38674b;

    /* JADX INFO: renamed from: c */
    public final int f38675c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f38676d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2072d<InterfaceC5844x, C5218d> f38677e;

    public LazyJavaTypeParameterResolver(C7669f c7669f, InterfaceC8838g interfaceC8838g, InterfaceC5845y interfaceC5845y, int i10) {
        C5207g.m11111f(c7669f, "c");
        C5207g.m11111f(interfaceC8838g, "containingDeclaration");
        C5207g.m11111f(interfaceC5845y, "typeParameterOwner");
        this.f38673a = c7669f;
        this.f38674b = interfaceC8838g;
        this.f38675c = i10;
        ArrayList arrayListMo12287r = interfaceC5845y.mo12287r();
        C5207g.m11111f(arrayListMo12287r, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayListMo12287r.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f38676d = linkedHashMap;
        this.f38677e = this.f38673a.m15268b().mo6222g(new InterfaceC2052l<InterfaceC5844x, C5218d>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C5218d mo528n(InterfaceC5844x interfaceC5844x) {
                InterfaceC5844x interfaceC5844x2 = interfaceC5844x;
                C5207g.m11111f(interfaceC5844x2, "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.f38678b;
                Integer num = (Integer) lazyJavaTypeParameterResolver.f38676d.get(interfaceC5844x2);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                C7669f c7669f2 = lazyJavaTypeParameterResolver.f38673a;
                C5207g.m11111f(c7669f2, "<this>");
                C7669f c7669f3 = new C7669f((C2064a) c7669f2.f42146a, lazyJavaTypeParameterResolver, (InterfaceC9070c) c7669f2.f42148c);
                InterfaceC8838g interfaceC8838g2 = lazyJavaTypeParameterResolver.f38674b;
                return new C5218d(ContextKt.m13682b(c7669f3, interfaceC8838g2.mo11289w()), interfaceC5844x2, lazyJavaTypeParameterResolver.f38675c + iIntValue, interfaceC8838g2);
            }
        });
    }

    @Override // cn.InterfaceC2068e
    /* JADX INFO: renamed from: a */
    public final InterfaceC8847k0 mo6215a(InterfaceC5844x interfaceC5844x) {
        C5207g.m11111f(interfaceC5844x, "javaTypeParameter");
        C5218d c5218dMo528n = this.f38677e.mo528n(interfaceC5844x);
        return c5218dMo528n != null ? c5218dMo528n : ((InterfaceC2068e) this.f38673a.f42147b).mo6215a(interfaceC5844x);
    }
}
