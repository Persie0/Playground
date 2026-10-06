package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzj extends nwm {

    /* JADX INFO: renamed from: a */
    final nzk f45070a;

    /* JADX INFO: renamed from: b */
    nwo f45071b = m18263b();

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nzl f45072c;

    public nzj(nzl nzlVar) {
        this.f45072c = nzlVar;
        this.f45070a = new nzk(nzlVar);
    }

    /* JADX INFO: renamed from: b */
    private final nwo m18263b() {
        nzk nzkVar = this.f45070a;
        if (nzkVar.hasNext()) {
            return nzkVar.next().iterator();
        }
        return null;
    }

    @Override // p000.nwo
    /* JADX INFO: renamed from: a */
    public final byte mo17779a() {
        nwo nwoVar = this.f45071b;
        if (nwoVar == null) {
            throw new NoSuchElementException();
        }
        byte bMo17779a = nwoVar.mo17779a();
        if (!this.f45071b.hasNext()) {
            this.f45071b = m18263b();
        }
        return bMo17779a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45071b != null;
    }
}
