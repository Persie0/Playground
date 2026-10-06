package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsm {

    /* JADX INFO: renamed from: a */
    private volatile btx f4336a;

    /* JADX INFO: renamed from: b */
    private final bkn f4337b;

    public bsm(bkn bknVar, byte[] bArr, byte[] bArr2) {
        this.f4337b = bknVar;
    }

    /* JADX INFO: renamed from: a */
    public final btx m2999a() {
        if (this.f4336a == null) {
            synchronized (this) {
                if (this.f4336a == null) {
                    Object obj = this.f4337b.f3651a;
                    File cacheDir = ((bua) obj).f4469a.getCacheDir();
                    btz btzVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, ((bua) obj).f4470b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        btzVar = new btz(file);
                    }
                    this.f4336a = btzVar;
                }
                if (this.f4336a == null) {
                    this.f4336a = new bty();
                }
            }
        }
        return this.f4336a;
    }
}
