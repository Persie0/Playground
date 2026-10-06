package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohk extends ohf {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f46013b = 0;

    static {
        ohj.m18487a(Collections.emptyMap());
    }

    public ohk(Map map) {
        super(map);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map get() {
        LinkedHashMap linkedHashMapM15561B = lkm.m15561B(this.f46007a.size());
        for (Map.Entry entry : this.f46007a.entrySet()) {
            linkedHashMapM15561B.put(entry.getKey(), ((oju) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMapM15561B);
    }
}
