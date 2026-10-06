package p000;

import android.os.UserManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14730a;

    public emu(oju ojuVar) {
        this.f14730a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserManager get() {
        UserManager userManager = (UserManager) ((emj) this.f14730a.get()).mo7509a(emj.f14720m);
        userManager.getClass();
        return userManager;
    }
}
