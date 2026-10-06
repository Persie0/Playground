package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ndw extends nea {

    /* JADX INFO: renamed from: a */
    public static final ndw f42066a = new ndw(nec.f42087a);

    /* JADX INFO: renamed from: b */
    public final AtomicReference f42067b;

    public ndw(nea neaVar) {
        this.f42067b = new AtomicReference(neaVar);
    }

    @Override // p000.nea
    /* JADX INFO: renamed from: a */
    public final ncr mo17385a() {
        return ((nea) this.f42067b.get()).mo17385a();
    }

    @Override // p000.nea
    /* JADX INFO: renamed from: b */
    public final nei mo17386b() {
        return ((nea) this.f42067b.get()).mo17386b();
    }

    @Override // p000.nea
    /* JADX INFO: renamed from: c */
    public final void mo17387c(String str, Level level, boolean z) {
        ((nea) this.f42067b.get()).mo17387c(str, level, z);
    }
}
