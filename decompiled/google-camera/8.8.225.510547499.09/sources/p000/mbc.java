package p000;

import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mbc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f39762a;

    /* JADX INFO: renamed from: b */
    private final oju f39763b;

    public mbc(oju ojuVar, oju ojuVar2) {
        this.f39762a = ojuVar;
        this.f39763b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbb get() {
        return new mbb((mav) this.f39762a.get(), (AmbientMode.AmbientController) this.f39763b.get(), null, null);
    }
}
