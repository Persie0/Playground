package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kny extends koa {

    /* JADX INFO: renamed from: a */
    private final oju f36665a;

    /* JADX INFO: renamed from: c */
    private int f36667c = 0;

    /* JADX INFO: renamed from: b */
    private Map f36666b = new HashMap();

    public kny(oju ojuVar) {
        this.f36665a = ojuVar;
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: a */
    public final void mo14611a(Object obj, kod kodVar) {
        synchronized (this) {
            koi koiVar = (koi) this.f36666b.get(kodVar);
            if (koiVar == null) {
                koiVar = (koi) this.f36665a.get();
                this.f36666b.put(kodVar, koiVar);
            }
            koiVar.mo14614a(obj);
            this.f36667c++;
        }
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: b */
    public final void mo14612b(kon konVar, ktz ktzVar) {
        synchronized (this) {
            if (this.f36667c == 0) {
                return;
            }
            Map map = this.f36666b;
            this.f36666b = new HashMap();
            this.f36667c = 0;
            konVar.m14625a(ktzVar);
            for (Map.Entry entry : map.entrySet()) {
                ((koi) entry.getValue()).mo14615b(konVar, ((kod) entry.getKey()).f36677b);
            }
        }
    }
}
