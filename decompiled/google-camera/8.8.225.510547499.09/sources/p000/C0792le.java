package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0792le extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0794lg f38011a;

    public C0792le(C0794lg c0794lg) {
        this.f38011a = c0794lg;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f38011a.mo9636u()) {
            this.f38011a.mo9634s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f38011a.mo9626k();
    }
}
