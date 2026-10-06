package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brf {

    /* JADX INFO: renamed from: a */
    private static final brb f4215a = new brd();

    /* JADX INFO: renamed from: b */
    private final Map f4216b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized brc m2951a(Object obj) {
        brb brbVar;
        bzq.m3278r(obj);
        brbVar = (brb) this.f4216b.get(obj.getClass());
        if (brbVar == null) {
            for (brb brbVar2 : this.f4216b.values()) {
                if (brbVar2.mo2948b().isAssignableFrom(obj.getClass())) {
                    brbVar = brbVar2;
                    break;
                }
            }
        }
        if (brbVar == null) {
            brbVar = f4215a;
        }
        return brbVar.mo2947a(obj);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2952b(brb brbVar) {
        this.f4216b.put(brbVar.mo2948b(), brbVar);
    }
}
