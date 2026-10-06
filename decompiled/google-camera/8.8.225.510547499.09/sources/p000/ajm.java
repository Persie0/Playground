package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ajm {
    /* JADX INFO: renamed from: a */
    static long m835a(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }

    /* JADX INFO: renamed from: b */
    static FileDescriptor m836b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    static void m837c(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }
}
