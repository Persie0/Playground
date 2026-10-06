package p000;

import android.os.UserManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ino implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31610a;

    public ino(oju ojuVar) {
        this.f31610a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean get() {
        return Boolean.valueOf(((UserManager) ((dws) this.f31610a).m6830a().getSystemService("user")).isDemoUser());
    }
}
