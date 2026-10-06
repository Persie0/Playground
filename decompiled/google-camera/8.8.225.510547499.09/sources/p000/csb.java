package p000;

import android.util.Range;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csb implements csa {

    /* JADX INFO: renamed from: a */
    private final jxv f9212a;

    public csb(jxv jxvVar) {
        this.f9212a = jxvVar;
    }

    @Override // p000.csa
    /* JADX INFO: renamed from: a */
    public final Range mo5451a() {
        return Range.create(30, Integer.valueOf(this.f9212a.m13669a()));
    }

    @Override // p000.csa
    /* JADX INFO: renamed from: b */
    public final Range mo5452b() {
        Integer numValueOf = Integer.valueOf(this.f9212a.m13669a());
        return Range.create(numValueOf, numValueOf);
    }
}
