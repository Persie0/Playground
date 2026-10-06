package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nxo extends nxq implements nyx {

    /* JADX INFO: renamed from: l */
    public nxh f44976l = nxh.f44910a;

    /* JADX INFO: renamed from: c */
    public final nxh m18120c() {
        nxh nxhVar = this.f44976l;
        if (nxhVar.f44912c) {
            this.f44976l = nxhVar.clone();
        }
        return this.f44976l;
    }

    /* JADX INFO: renamed from: e */
    public final void m18121e(ktz ktzVar) {
        if (ktzVar.f37198a != ((nxq) m18143ad(6))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
