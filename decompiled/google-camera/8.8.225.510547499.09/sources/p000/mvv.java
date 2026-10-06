package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mvv extends mto {

    /* JADX INFO: renamed from: a */
    final Object f41692a;

    /* JADX INFO: renamed from: b */
    int f41693b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mwb f41694c;

    public mvv(mwb mwbVar, int i) {
        this.f41694c = mwbVar;
        this.f41692a = mwbVar.f41706a[i];
        this.f41693b = i;
    }

    /* JADX INFO: renamed from: a */
    final void m17038a() {
        int i = this.f41693b;
        if (i != -1) {
            mwb mwbVar = this.f41694c;
            if (i <= mwbVar.f41708c && mpw.m16768g(mwbVar.f41706a[i], this.f41692a)) {
                return;
            }
        }
        this.f41693b = this.f41694c.m17049b(this.f41692a);
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getKey() {
        return this.f41692a;
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object getValue() {
        m17038a();
        int i = this.f41693b;
        if (i == -1) {
            return null;
        }
        return this.f41694c.f41707b[i];
    }

    @Override // p000.mto, java.util.Map.Entry
    public final Object setValue(Object obj) {
        m17038a();
        int i = this.f41693b;
        if (i == -1) {
            this.f41694c.put(this.f41692a, obj);
            return null;
        }
        Object obj2 = this.f41694c.f41707b[i];
        if (mpw.m16768g(obj2, obj)) {
            return obj;
        }
        this.f41694c.m17055j(this.f41693b, obj, false);
        return obj2;
    }
}
