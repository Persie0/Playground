package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26715a;

    public gxd(oju ojuVar) {
        this.f26715a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final File get() {
        File cacheDir = ((dws) this.f26715a).m6830a().getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }
}
