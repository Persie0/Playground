package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import cm.InterfaceC2052l;
import cn.C2064a;
import dm.C5206f;
import dm.C5207g;
import hn.C6088h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p102eo.InterfaceC5436a;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p543do.AbstractC5249p;
import p543do.AbstractC5262v0;
import tl.C9325m;
import zm.C10517b;
import zm.C10532q;

/* JADX INFO: loaded from: classes2.dex */
final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements InterfaceC2052l<AbstractC6890a.a, Iterable<? extends AbstractC6890a.a>> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC6890a<Object> f38839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractC6890a abstractC6890a) {
        super(1);
        this.f38839b = abstractC6890a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Iterable<? extends AbstractC6890a.a> mo528n(AbstractC6890a.a aVar) {
        InterfaceC5856j interfaceC5856jM11636l0;
        Iterator it;
        ArrayList arrayList;
        InterfaceC5855i interfaceC5855i;
        InterfaceC5857k interfaceC5857k;
        boolean zM11608V;
        C10532q c10532q;
        AbstractC6890a.a aVar2;
        AbstractC5249p abstractC5249pM11625g;
        AbstractC6890a.a aVar3 = aVar;
        C5207g.m11111f(aVar3, "it");
        AbstractC6890a<Object> abstractC6890a = this.f38839b;
        boolean z10 = ((C6088h) abstractC6890a).f35839e;
        C5206f c5206f = C5206f.f33268c;
        ArrayList arrayList2 = null;
        InterfaceC5852f interfaceC5852f = aVar3.f38882a;
        if (z10) {
            if (((interfaceC5852f == null || (abstractC5249pM11625g = InterfaceC5436a.a.m11625g(interfaceC5852f)) == null) ? null : InterfaceC5436a.a.m11627h(abstractC5249pM11625g)) == null) {
                if (interfaceC5852f != null) {
                    List listM11648s = InterfaceC5436a.a.m11648s(interfaceC5856jM11636l0);
                    List listM11643p = InterfaceC5436a.a.m11643p(interfaceC5852f);
                    it = listM11643p.iterator();
                    arrayList = new ArrayList(Math.min(C9325m.m17681z(listM11648s, 10), C9325m.m17681z(listM11643p, 10)));
                    for (Object obj : listM11648s) {
                        interfaceC5855i = (InterfaceC5855i) it.next();
                        interfaceC5857k = (InterfaceC5857k) obj;
                        zM11608V = InterfaceC5436a.a.m11608V(interfaceC5855i);
                        c10532q = aVar3.f38883b;
                        if (zM11608V) {
                            aVar2 = new AbstractC6890a.a(null, c10532q, interfaceC5857k);
                        } else {
                            AbstractC5262v0 abstractC5262v0M11652w = InterfaceC5436a.a.m11652w(interfaceC5855i);
                            abstractC6890a.getClass();
                            C10517b c10517b = ((C2064a) ((C6088h) abstractC6890a).f35837c.f42146a).f10511q;
                            C5207g.m11111f(abstractC5262v0M11652w, "<this>");
                            aVar2 = new AbstractC6890a.a(abstractC5262v0M11652w, c10517b.m13664b(c10532q, abstractC5262v0M11652w.mo11289w()), interfaceC5857k);
                        }
                        arrayList.add(aVar2);
                    }
                    arrayList2 = arrayList;
                }
            }
        } else if (interfaceC5852f != null && (interfaceC5856jM11636l0 = InterfaceC5436a.a.m11636l0(c5206f, interfaceC5852f)) != null) {
            List listM11648s2 = InterfaceC5436a.a.m11648s(interfaceC5856jM11636l0);
            List listM11643p2 = InterfaceC5436a.a.m11643p(interfaceC5852f);
            it = listM11643p2.iterator();
            arrayList = new ArrayList(Math.min(C9325m.m17681z(listM11648s2, 10), C9325m.m17681z(listM11643p2, 10)));
            while (r4.hasNext() && it.hasNext()) {
                interfaceC5855i = (InterfaceC5855i) it.next();
                interfaceC5857k = (InterfaceC5857k) obj;
                zM11608V = InterfaceC5436a.a.m11608V(interfaceC5855i);
                c10532q = aVar3.f38883b;
                if (zM11608V) {
                    aVar2 = new AbstractC6890a.a(null, c10532q, interfaceC5857k);
                } else {
                    AbstractC5262v0 abstractC5262v0M11652w2 = InterfaceC5436a.a.m11652w(interfaceC5855i);
                    abstractC6890a.getClass();
                    C10517b c10517b2 = ((C2064a) ((C6088h) abstractC6890a).f35837c.f42146a).f10511q;
                    C5207g.m11111f(abstractC5262v0M11652w2, "<this>");
                    aVar2 = new AbstractC6890a.a(abstractC5262v0M11652w2, c10517b2.m13664b(c10532q, abstractC5262v0M11652w2.mo11289w()), interfaceC5857k);
                }
                arrayList.add(aVar2);
            }
            arrayList2 = arrayList;
        }
        return arrayList2;
    }
}
