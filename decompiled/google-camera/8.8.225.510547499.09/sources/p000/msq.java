package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class msq extends mvo {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ msv f41556a;

    /* JADX INFO: renamed from: b */
    private final Map.Entry f41557b;

    public msq(msv msvVar, Map.Entry entry) {
        this.f41556a = msvVar;
        this.f41557b = entry;
    }

    @Override // p000.mvo, p000.mvq
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo3817b() {
        return this.f41557b;
    }

    @Override // p000.mvo
    /* JADX INFO: renamed from: b */
    protected final Map.Entry mo16873b() {
        return this.f41557b;
    }

    @Override // p000.mvo, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f41556a.mo16876d(obj);
        lku.m15614I(this.f41556a.entrySet().contains(this), "entry no longer in map");
        if (mpw.m16768g(obj, getValue())) {
            return obj;
        }
        lku.m15607B(!this.f41556a.containsValue(obj), "value already present: %s", obj);
        Object value = this.f41557b.setValue(obj);
        lku.m15614I(mpw.m16768g(obj, this.f41556a.get(getKey())), "entry no longer in map");
        this.f41556a.m16882j(getKey(), true, value, obj);
        return value;
    }
}
