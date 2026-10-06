package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.p024io.DesugarInputStream;
import p021j$.p024io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krq extends FileInputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ krs f37071a;

    /* JADX INFO: renamed from: b */
    private final int f37072b;

    /* JADX INFO: renamed from: c */
    private final FileInputStream f37073c;

    /* JADX INFO: renamed from: d */
    private boolean f37074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krq(krs krsVar, FileInputStream fileInputStream) {
        super(fileInputStream.getFD());
        this.f37071a = krsVar;
        this.f37072b = krs.f37080b.incrementAndGet();
        this.f37074d = false;
        this.f37073c = fileInputStream;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        IOException iOException;
        if (this.f37074d) {
            return;
        }
        this.f37074d = true;
        try {
            try {
                super.close();
                iOException = null;
            } catch (IOException e) {
                iOException = new IOException(e);
            }
            try {
                this.f37073c.close();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = new IOException(e2);
                }
            }
            if (iOException != null) {
                throw iOException;
            }
            krs krsVar = this.f37071a;
            AtomicInteger atomicInteger = krs.f37079a;
            krsVar.f37081c.readLock().unlock();
            this.f37071a.f37082d.mo13944f("Closed ".concat(toString()));
        } catch (Throwable th) {
            krs krsVar2 = this.f37071a;
            AtomicInteger atomicInteger2 = krs.f37079a;
            krsVar2.f37081c.readLock().unlock();
            this.f37071a.f37082d.mo13944f("Closed ".concat(toString()));
            throw th;
        }
    }

    public final String toString() {
        return "MediaInputStream-" + this.f37072b;
    }

    @Override // java.io.InputStream, p021j$.p024io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
