package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eif implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14128a;

    /* JADX INFO: renamed from: b */
    private final oju f14129b;

    /* JADX INFO: renamed from: c */
    private final oju f14130c;

    /* JADX INFO: renamed from: d */
    private final oju f14131d;

    /* JADX INFO: renamed from: e */
    private final oju f14132e;

    public eif(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f14128a = ojuVar;
        this.f14129b = ojuVar2;
        this.f14130c = ojuVar3;
        this.f14131d = ojuVar4;
        this.f14132e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eie get() {
        return new eie((igb) this.f14128a.get(), (BottomBarController) this.f14129b.get(), (gfa) this.f14130c.get(), (eiw) this.f14131d.get(), (jfs) this.f14132e.get(), null, null);
    }
}
