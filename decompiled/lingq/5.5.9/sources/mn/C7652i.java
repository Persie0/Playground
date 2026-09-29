package mn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p260m8.C7499b;
import tl.C9325m;

/* JADX INFO: renamed from: mn.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7652i {
    static {
        new C7646c("java.lang").m15215c(C7648e.m15232l("annotation"));
    }

    /* JADX INFO: renamed from: a */
    public static final C7645b m15237a(String str) {
        C7646c c7646c = C7651h.f42096a;
        return new C7645b(C7651h.f42096a, C7648e.m15232l(str));
    }

    /* JADX INFO: renamed from: b */
    public static final C7645b m15238b(String str) {
        C7646c c7646c = C7651h.f42096a;
        return new C7645b(C7651h.f42098c, C7648e.m15232l(str));
    }

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap m15239c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(setEntrySet, 10));
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM14941g0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: d */
    public static final C7645b m15240d(C7648e c7648e) {
        C7646c c7646c = C7651h.f42096a;
        C7645b c7645b = C7651h.f42103h;
        return new C7645b(c7645b.m15208h(), C7648e.m15232l(c7648e.m15236g() + c7645b.m15210j().m15236g()));
    }

    /* JADX INFO: renamed from: e */
    public static final void m15241e(String str) {
        C7646c c7646c = C7651h.f42096a;
        new C7645b(C7651h.f42099d, C7648e.m15232l(str));
    }

    /* JADX INFO: renamed from: f */
    public static final C7645b m15242f(String str) {
        C7646c c7646c = C7651h.f42096a;
        return new C7645b(C7651h.f42097b, C7648e.m15232l(str));
    }

    /* JADX INFO: renamed from: g */
    public static final C7645b m15243g(C7645b c7645b) {
        C7646c c7646c = C7651h.f42096a;
        return new C7645b(C7651h.f42096a, C7648e.m15232l("U" + c7645b.m15210j().m15236g()));
    }
}
