package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31577a;

    /* JADX INFO: renamed from: b */
    private final oju f31578b;

    public inb(oju ojuVar, oju ojuVar2) {
        this.f31577a = ojuVar;
        this.f31578b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final PackageInfo get() {
        try {
            PackageInfo packageInfo = ((inc) this.f31577a).get().getPackageInfo(((dws) this.f31578b).m6830a().getPackageName(), 0);
            packageInfo.getClass();
            return packageInfo;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("getPackageInfo for getPackageName should always succeed.", e);
        }
    }
}
