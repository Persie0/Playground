package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krr extends FileOutputStream {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ krs f37075a;

    /* JADX INFO: renamed from: b */
    private final int f37076b;

    /* JADX INFO: renamed from: c */
    private final FileOutputStream f37077c;

    /* JADX INFO: renamed from: d */
    private boolean f37078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krr(krs krsVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream.getFD());
        this.f37075a = krsVar;
        this.f37076b = krs.f37079a.incrementAndGet();
        this.f37078d = false;
        this.f37077c = fileOutputStream;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        IOException iOException;
        if (this.f37078d) {
            return;
        }
        this.f37078d = true;
        try {
            try {
                krs krsVar = this.f37075a;
                AtomicInteger atomicInteger = krs.f37079a;
                lme lmeVar = krsVar.f37083e;
                Os.fdatasync(getFD());
                iOException = null;
            } catch (ErrnoException e) {
                iOException = new IOException(e);
            }
            try {
                super.close();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = new IOException(e2);
                }
            }
            try {
                this.f37077c.close();
            } catch (IOException e3) {
                if (iOException == null) {
                    iOException = new IOException(e3);
                }
            }
            if (iOException != null) {
                throw iOException;
            }
            krs krsVar2 = this.f37075a;
            AtomicInteger atomicInteger2 = krs.f37079a;
            krsVar2.f37081c.writeLock().unlock();
            this.f37075a.f37082d.mo13944f("Closed ".concat(toString()));
        } catch (Throwable th) {
            krs krsVar3 = this.f37075a;
            AtomicInteger atomicInteger3 = krs.f37079a;
            krsVar3.f37081c.writeLock().unlock();
            this.f37075a.f37082d.mo13944f("Closed ".concat(toString()));
            throw th;
        }
    }

    public final String toString() {
        return "MediaOutputStream-" + this.f37076b;
    }
}
