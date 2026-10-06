package p000;

import android.media.AudioManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cve implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9772a;

    /* JADX INFO: renamed from: b */
    private final oju f9773b;

    /* JADX INFO: renamed from: c */
    private final oju f9774c;

    /* JADX INFO: renamed from: d */
    private final oju f9775d;

    public cve(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f9772a = ojuVar;
        this.f9773b = ojuVar2;
        this.f9774c = ojuVar3;
        this.f9775d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cvd get() {
        cwd cwdVar = ((cvf) this.f9772a).get();
        AudioManager audioManager = ((emm) this.f9773b).get();
        gyz gyzVar = (gyz) this.f9774c.get();
        return new cvd(cwdVar, audioManager, gyzVar, null);
    }
}
