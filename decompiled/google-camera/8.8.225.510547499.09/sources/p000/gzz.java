package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gzz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27068a;

    /* JADX INFO: renamed from: b */
    private final oju f27069b;

    /* JADX INFO: renamed from: c */
    private final oju f27070c;

    /* JADX INFO: renamed from: d */
    private final oju f27071d;

    /* JADX INFO: renamed from: e */
    private final oju f27072e;

    public gzz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f27068a = ojuVar;
        this.f27069b = ojuVar2;
        this.f27070c = ojuVar3;
        this.f27071d = ojuVar4;
        this.f27072e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final drj get() {
        return new drj((SharedPreferences) this.f27068a.get(), (hah) this.f27069b.get(), (jww) this.f27070c.get(), (jww) this.f27071d.get(), (jww) this.f27072e.get());
    }
}
