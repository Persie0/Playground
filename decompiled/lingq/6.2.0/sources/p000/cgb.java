package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class cgb extends ggb {

    /* JADX INFO: renamed from: b */
    public static final cgb f10033b = new cgb(hgb.f42340a);

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10034a;

    public cgb(ggb ggbVar) {
        this.f10034a = new AtomicReference(ggbVar);
    }

    @Override // p000.ggb
    /* JADX INFO: renamed from: a */
    public final void mo4643a(String str, Level level, boolean z) {
        ((ggb) this.f10034a.get()).mo4643a(str, level, z);
    }

    @Override // p000.ggb
    /* JADX INFO: renamed from: b */
    public final ngb mo4644b() {
        return ((ggb) this.f10034a.get()).mo4644b();
    }

    @Override // p000.ggb
    /* JADX INFO: renamed from: c */
    public final afa mo4645c() {
        return ((ggb) this.f10034a.get()).mo4645c();
    }
}
