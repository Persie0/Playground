package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kry implements krl {

    /* JADX INFO: renamed from: a */
    private final File f37096a;

    /* JADX INFO: renamed from: b */
    private final krt f37097b;

    /* JADX INFO: renamed from: c */
    private final kbo f37098c;

    public kry(File file, krt krtVar, kbo kboVar) {
        this.f37096a = file;
        this.f37097b = krtVar;
        this.f37098c = kboVar.mo6314a("SimpleFileObject");
    }

    /* JADX INFO: renamed from: l */
    public static kry m14788l(krt krtVar, krj krjVar, kbo kboVar) {
        return new kry(krtVar.m14784b(krjVar), krtVar, kboVar);
    }

    /* JADX INFO: renamed from: m */
    private final void m14789m() throws IOException {
        File parentFile = this.f37096a.getParentFile();
        parentFile.getClass();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Unable to create or find media storage directory");
        }
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: a */
    public final long mo14760a() {
        if (this.f37096a.exists()) {
            return this.f37096a.length();
        }
        return -1L;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: b */
    public final FileInputStream mo14761b() {
        return new FileInputStream(this.f37096a);
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: c */
    public final FileOutputStream mo14762c() {
        throw null;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: d */
    public final void mo14763d() throws IOException {
        m14789m();
        try {
            if (this.f37096a.exists()) {
                return;
            }
            this.f37096a.createNewFile();
        } catch (Throwable th) {
            throw new IOException("Unable to create " + this.f37096a.toString() + "!", th);
        }
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: e */
    public final boolean mo14764e() {
        return this.f37096a.canRead();
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: f */
    public final boolean mo14765f() {
        if (this.f37096a.exists()) {
            return this.f37096a.canWrite();
        }
        File parentFile = this.f37096a.getParentFile();
        while (parentFile != null && !parentFile.exists()) {
            parentFile = parentFile.getParentFile();
        }
        boolean z = parentFile != null && parentFile.canExecute() && parentFile.canWrite();
        if (!z) {
            this.f37098c.mo13944f(String.format(Locale.ROOT, "Cannot write to %s, with earliestExistingParentFolder=%s()", this.f37096a.getAbsoluteFile(), parentFile));
        }
        return z;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: g */
    public final FileOutputStream mo14766g() throws IOException {
        m14789m();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f37096a, "rw");
            return new krx(randomAccessFile.getFD(), randomAccessFile);
        } catch (Throwable th) {
            throw new IOException("Unable to create " + this.f37096a.toString() + "!", th);
        }
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: h */
    public final Uri mo14767h() {
        return Uri.EMPTY;
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: i */
    public final krt mo14768i() {
        return this.f37097b;
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: j */
    public final void mo14769j() {
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: k */
    public final boolean mo14770k() {
        return this.f37096a.canWrite();
    }

    public final String toString() {
        return this.f37097b.toString() + ": " + this.f37096a.getAbsolutePath();
    }
}
