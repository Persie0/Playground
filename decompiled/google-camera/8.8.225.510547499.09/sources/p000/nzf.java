package p000;

import java.util.concurrent.ConcurrentMap;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzf {

    /* JADX INFO: renamed from: a */
    public static final nzf f45060a = new nzf();

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f45061b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final nyq f45062c = new nyq();

    private nzf() {
    }

    /* JADX INFO: renamed from: a */
    public final nzm m18259a(Class cls) {
        Class cls2;
        nxz.m18158g(cls);
        nzm nzmVarM18232m = (nzm) this.f45061b.get(cls);
        if (nzmVarM18232m == null) {
            nyq nyqVar = this.f45062c;
            Class cls3 = nzn.f45081a;
            if (!nxq.class.isAssignableFrom(cls) && (cls2 = nzn.f45081a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            nyt nytVarMo18187a = nyqVar.f45032a.mo18187a(cls);
            if (nytVarMo18187a.mo18195b()) {
                nzmVarM18232m = nxq.class.isAssignableFrom(cls) ? nza.m18258c(nzn.f45084d, nxg.f44908a, nytVarMo18187a.mo18194a()) : nza.m18258c(nzn.f45082b, nxg.m18015a(), nytVarMo18187a.mo18194a());
            } else if (nxq.class.isAssignableFrom(cls)) {
                if (nyq.m18189a(nytVarMo18187a)) {
                    lij lijVar = nzc.f45058a;
                    nym nymVar = nym.f45024b;
                    lij lijVar2 = nzn.f45084d;
                    ntw ntwVar = nxg.f44908a;
                    ntw ntwVar2 = nys.f45035a;
                    nzmVarM18232m = nyz.m18232m(nytVarMo18187a, nymVar, lijVar2, ntwVar);
                } else {
                    lij lijVar3 = nzc.f45058a;
                    nym nymVar2 = nym.f45024b;
                    lij lijVar4 = nzn.f45084d;
                    ntw ntwVar3 = nys.f45035a;
                    nzmVarM18232m = nyz.m18232m(nytVarMo18187a, nymVar2, lijVar4, null);
                }
            } else if (nyq.m18189a(nytVarMo18187a)) {
                lij lijVar5 = nzc.f45058a;
                nym nymVar3 = nym.f45023a;
                lij lijVar6 = nzn.f45082b;
                ntw ntwVarM18015a = nxg.m18015a();
                ntw ntwVar4 = nys.f45035a;
                nzmVarM18232m = nyz.m18232m(nytVarMo18187a, nymVar3, lijVar6, ntwVarM18015a);
            } else {
                lij lijVar7 = nzc.f45058a;
                nym nymVar4 = nym.f45023a;
                lij lijVar8 = nzn.f45083c;
                ntw ntwVar5 = nys.f45035a;
                nzmVarM18232m = nyz.m18232m(nytVarMo18187a, nymVar4, lijVar8, null);
            }
            nxz.m18158g(cls);
            nzm nzmVar = (nzm) this.f45061b.putIfAbsent(cls, nzmVarM18232m);
            if (nzmVar != null) {
                return nzmVar;
            }
        }
        return nzmVarM18232m;
    }

    /* JADX INFO: renamed from: b */
    public final nzm m18260b(Object obj) {
        return m18259a(obj.getClass());
    }
}
