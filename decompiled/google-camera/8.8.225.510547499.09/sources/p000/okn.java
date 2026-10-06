package p000;

import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class okn extends oko implements RandomAccess {

    /* JADX INFO: renamed from: a */
    private final oko f46204a;

    /* JADX INFO: renamed from: b */
    private final int f46205b;

    /* JADX INFO: renamed from: c */
    private final int f46206c;

    public okn(oko okoVar, int i, int i2) {
        this.f46204a = okoVar;
        this.f46205b = i;
        lkm.m15589p(i, i2, okoVar.mo18591a());
        this.f46206c = i2 - i;
    }

    @Override // p000.okj
    /* JADX INFO: renamed from: a */
    public final int mo18591a() {
        return this.f46206c;
    }

    @Override // p000.oko, java.util.List
    public final Object get(int i) {
        lkm.m15587n(i, this.f46206c);
        return this.f46204a.get(this.f46205b + i);
    }
}
