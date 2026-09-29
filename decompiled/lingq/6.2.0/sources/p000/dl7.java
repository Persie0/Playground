package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class dl7 {

    /* JADX INFO: renamed from: e */
    public static final HashMap f35790e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final boolean f35791a;

    /* JADX INFO: renamed from: b */
    public final File f35792b;

    /* JADX INFO: renamed from: c */
    public final Lock f35793c;

    /* JADX INFO: renamed from: d */
    public FileChannel f35794d;

    public dl7(String str, File file, boolean z) {
        Lock lock;
        this.f35791a = z;
        this.f35792b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f35790e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f35793c = lock;
    }

    /* JADX INFO: renamed from: a */
    public final void m10452a(boolean z) {
        this.f35793c.lock();
        if (z) {
            File file = this.f35792b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f35794d = channel;
            } catch (IOException e) {
                this.f35794d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10453b() {
        try {
            FileChannel fileChannel = this.f35794d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f35793c.unlock();
    }
}
