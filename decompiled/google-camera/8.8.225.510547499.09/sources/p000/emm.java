package p000;

import android.media.AudioManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14722a;

    public emm(oju ojuVar) {
        this.f14722a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AudioManager get() {
        AudioManager audioManager = (AudioManager) ((emj) this.f14722a.get()).mo7509a(emj.f14709b);
        audioManager.getClass();
        return audioManager;
    }
}
