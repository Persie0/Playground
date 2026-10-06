package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mul extends mto {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mun f41641a;

    /* JADX INFO: renamed from: b */
    private final Object f41642b;

    /* JADX INFO: renamed from: c */
    private int f41643c;

    public mul(mun munVar, int i) {
        this.f41641a = munVar;
        this.f41642b = munVar.m16949f(i);
        this.f41643c = i;
    }

    /* JADX INFO: renamed from: a */
    private final void m16941a() {
        int i = this.f41643c;
        if (i == -1 || i >= this.f41641a.size() || !mpw.m16768g(this.f41642b, this.f41641a.m16949f(this.f41643c))) {
            this.f41643c = this.f41641a.m16948d(this.f41642b);
        }
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getKey() {
        return this.f41642b;
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getValue() {
        Map mapM16954k = this.f41641a.m16954k();
        if (mapM16954k != null) {
            return mapM16954k.get(this.f41642b);
        }
        m16941a();
        int i = this.f41643c;
        if (i == -1) {
            return null;
        }
        return this.f41641a.m16952i(i);
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapM16954k = this.f41641a.m16954k();
        if (mapM16954k != null) {
            return mapM16954k.put(this.f41642b, obj);
        }
        m16941a();
        int i = this.f41643c;
        if (i == -1) {
            this.f41641a.put(this.f41642b, obj);
            return null;
        }
        Object objM16952i = this.f41641a.m16952i(i);
        this.f41641a.m16958o(this.f41643c, obj);
        return objM16952i;
    }
}
