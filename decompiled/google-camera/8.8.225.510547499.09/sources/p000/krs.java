package p000;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.StampedLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class krs {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f37079a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f37080b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final ReadWriteLock f37081c = new StampedLock().asReadWriteLock();

    /* JADX INFO: renamed from: d */
    public final kbo f37082d;

    /* JADX INFO: renamed from: e */
    public final lme f37083e;

    /* JADX INFO: renamed from: f */
    private krk f37084f;

    public krs(lme lmeVar, krk krkVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37083e = lmeVar;
        this.f37084f = krkVar;
        this.f37082d = kboVar.mo6314a("MediaMutex");
    }

    /* JADX INFO: renamed from: b */
    public final FileInputStream m14777b() {
        this.f37081c.readLock().lock();
        try {
            lku.m15616K(this.f37084f.mo14764e(), "Unable to read from %s", this);
            return new krq(this, this.f37084f.mo14761b());
        } catch (Throwable th) {
            this.f37081c.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final FileOutputStream m14778c() {
        return m14780g();
    }

    /* JADX INFO: renamed from: d */
    public final void m14779d() {
        this.f37081c.writeLock().lock();
        try {
            this.f37084f.mo14763d();
        } finally {
            this.f37081c.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public final FileOutputStream m14780g() {
        this.f37081c.writeLock().lock();
        try {
            lku.m15616K(this.f37084f.mo14765f(), "Unable to write to %s", this);
            lku.m15616K(true, "Unable to append to %s", this);
            return new krr(this, this.f37084f.mo14766g());
        } catch (Throwable th) {
            this.f37081c.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    protected final synchronized krk m14781l() {
        return this.f37084f;
    }

    /* JADX INFO: renamed from: m */
    final synchronized void m14782m(krk krkVar) {
        lku.m15670x(this.f37084f.getClass().isAssignableFrom(krkVar.getClass()), "The new delegate must be of type ".concat(String.valueOf(String.valueOf(this.f37084f.getClass()))));
        this.f37081c.writeLock().lock();
        try {
            this.f37084f = krkVar;
            this.f37081c.writeLock().unlock();
        } catch (Throwable th) {
            this.f37081c.writeLock().unlock();
            throw th;
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "<MediaMutex: %s>", this.f37084f);
    }
}
