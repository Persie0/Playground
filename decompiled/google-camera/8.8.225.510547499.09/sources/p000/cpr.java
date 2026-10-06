package p000;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpr implements jzg {

    /* JADX INFO: renamed from: a */
    final Map f8665a = new EnumMap(jzf.class);

    /* JADX INFO: renamed from: b */
    public final Object f8666b = new Object();

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
        synchronized (this.f8666b) {
            Integer num = (Integer) this.f8665a.get(jzfVar);
            if (num == null) {
                num = 0;
            }
            this.f8665a.put(jzfVar, Integer.valueOf(num.intValue() + 1));
        }
    }
}
