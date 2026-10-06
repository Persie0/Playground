package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nfg extends nez {

    /* JADX INFO: renamed from: b */
    public final MessageDigest f42173b;

    /* JADX INFO: renamed from: c */
    public final int f42174c;

    /* JADX INFO: renamed from: d */
    public boolean f42175d;

    public nfg(MessageDigest messageDigest, int i) {
        this.f42173b = messageDigest;
        this.f42174c = i;
    }

    @Override // p000.nez
    /* JADX INFO: renamed from: u */
    public final void mo17431u(byte[] bArr) {
        m17443v();
        this.f42173b.update(bArr, 0, 2);
    }

    /* JADX INFO: renamed from: v */
    public final void m17443v() {
        lku.m15614I(!this.f42175d, "Cannot re-use a Hasher after calling hash() on it");
    }
}
