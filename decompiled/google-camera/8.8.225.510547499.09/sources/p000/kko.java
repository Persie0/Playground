package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kko implements kiv {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0951rb f36389a;

    /* JADX INFO: renamed from: b */
    private final Map f36390b;

    /* JADX INFO: renamed from: c */
    private final opm f36391c;

    /* JADX INFO: renamed from: d */
    private final opm f36392d;

    /* JADX INFO: renamed from: e */
    private final Map f36393e;

    public kko(InterfaceC0951rb interfaceC0951rb, Map map) {
        interfaceC0951rb.getClass();
        map.getClass();
        this.f36389a = interfaceC0951rb;
        this.f36390b = map;
        this.f36391c = ook.m18795i(0L);
        this.f36392d = ook.m18795i(0L);
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ook.m18789c(omn.m18721z(omn.m18678R(setEntrySet)), 16));
        for (Map.Entry entry : setEntrySet) {
            okb okbVarM15590q = lkm.m15590q(C0979sc.m19386a(((C0959rj) entry.getValue()).f47553a), (kgg) entry.getKey());
            linkedHashMap.put(okbVarM15590q.f46186a, okbVarM15590q.f46187b);
        }
        this.f36393e = linkedHashMap;
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: a */
    public final void mo14366a() {
        throw new oka(null);
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: b */
    public final void mo14367b(kiz kizVar) {
        ooc.m18747m(new kkm(this, kizVar, null));
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: c */
    public final void mo14368c() {
        throw new oka(null);
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: d */
    public final void mo14369d(kiz kizVar) {
        mo14370e(omn.m18666F(kizVar));
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: e */
    public final void mo14370e(List list) {
        ooc.m18747m(new kkn(this, list, null));
    }

    /* JADX INFO: renamed from: f */
    public final List m14450f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kiz kizVar = (kiz) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = kizVar.f36228c.iterator();
            while (it2.hasNext()) {
                C0959rj c0959rj = (C0959rj) this.f36390b.get((kgg) it2.next());
                if (c0959rj != null) {
                    arrayList2.add(C0979sc.m19386a(c0959rj.f47553a));
                }
            }
            kfv kfvVarM14107b = kfi.m14107b(kizVar.f36229d);
            List listM18666F = omn.m18666F(new kkl(kfvVarM14107b, this.f36393e, this.f36392d, null));
            okw okwVar = okw.f46216a;
            arrayList.add(new C0973rx(arrayList2, okwVar, okwVar, listM18666F));
            kfvVarM14107b.mo9228bm(this.f36391c.m18851c(), kizVar.f36228c);
        }
        return arrayList;
    }
}
