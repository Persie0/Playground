package p000;

import android.app.KeyguardManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14726a;

    public emq(oju ojuVar) {
        this.f14726a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final KeyguardManager get() {
        KeyguardManager keyguardManager = (KeyguardManager) ((emj) this.f14726a.get()).mo7509a(emj.f14714g);
        keyguardManager.getClass();
        return keyguardManager;
    }
}
