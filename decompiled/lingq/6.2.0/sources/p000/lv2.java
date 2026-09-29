package p000;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lv2 {
    /* JADX INFO: renamed from: a */
    public static void m16550a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m16551b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m16552c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
        return Os.lseek(fileDescriptor, j, i);
    }
}
