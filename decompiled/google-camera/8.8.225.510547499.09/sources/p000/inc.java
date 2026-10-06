package p000;

import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31579a;

    public inc(oju ojuVar) {
        this.f31579a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PackageManager get() {
        PackageManager packageManager = ((dws) this.f31579a).m6830a().getPackageManager();
        packageManager.getClass();
        return packageManager;
    }
}
