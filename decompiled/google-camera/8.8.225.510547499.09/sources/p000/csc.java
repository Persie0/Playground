package p000;

import android.util.Range;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csc implements csa {

    /* JADX INFO: renamed from: a */
    private final Range f9213a;

    /* JADX INFO: renamed from: b */
    private final mrm f9214b;

    /* JADX INFO: renamed from: c */
    private final boolean f9215c;

    public csc(Range range, mrm mrmVar, boolean z) {
        this.f9213a = range;
        this.f9214b = mrmVar;
        this.f9215c = z;
    }

    @Override // p000.csa
    /* JADX INFO: renamed from: a */
    public final Range mo5451a() {
        if (this.f9215c) {
            mrm mrmVar = this.f9214b;
            if (mrmVar.mo16813g()) {
                return (Range) mrmVar.mo16809c();
            }
        }
        return this.f9213a;
    }

    @Override // p000.csa
    /* JADX INFO: renamed from: b */
    public final Range mo5452b() {
        if (this.f9215c) {
            mrm mrmVar = this.f9214b;
            if (mrmVar.mo16813g()) {
                return (Range) mrmVar.mo16809c();
            }
        }
        return this.f9213a;
    }
}
