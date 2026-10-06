package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class krv extends krs implements krl {
    public krv(lme lmeVar, krl krlVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(lmeVar, krlVar, kboVar, null, null, null);
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: a */
    public final long mo14760a() {
        return m14781l().mo14760a();
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: e */
    public final boolean mo14764e() {
        return m14781l().mo14764e();
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: f */
    public final boolean mo14765f() {
        return m14781l().mo14765f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [krk, krl] */
    @Override // p000.krl
    /* JADX INFO: renamed from: h */
    public final Uri mo14767h() {
        return m14781l().mo14767h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [krk, krl] */
    @Override // p000.krl
    /* JADX INFO: renamed from: i */
    public final krt mo14768i() {
        return m14781l().mo14768i();
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: j */
    public final void mo14769j() throws InterruptedException {
        this.f37081c.writeLock().lockInterruptibly();
        this.f37081c.writeLock().unlock();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [krk, krl] */
    @Override // p000.krl
    /* JADX INFO: renamed from: k */
    public final boolean mo14770k() {
        return m14781l().mo14770k();
    }

    @Override // p000.krs
    public final String toString() {
        return m14781l().toString();
    }
}
