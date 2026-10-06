package p000;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class arg {

    /* JADX INFO: renamed from: a */
    public static final Map f2186a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f2187b;

    /* JADX INFO: renamed from: c */
    private final File f2188c;

    /* JADX INFO: renamed from: d */
    private final Lock f2189d;

    /* JADX INFO: renamed from: e */
    private FileChannel f2190e;

    public arg(String str, File file) {
        Lock lock;
        str.getClass();
        this.f2187b = false;
        File file2 = new File(file, str.concat(".lck"));
        this.f2188c = file2;
        String absolutePath = file2.getAbsolutePath();
        absolutePath.getClass();
        Map map = f2186a;
        synchronized (map) {
            Object reentrantLock = map.get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(absolutePath, reentrantLock);
            }
            lock = (Lock) reentrantLock;
        }
        this.f2189d = lock;
    }

    /* JADX INFO: renamed from: a */
    public final void m1885a(boolean z) {
        this.f2189d.lock();
        if (z) {
            try {
                File parentFile = this.f2188c.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(this.f2188c).getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
                this.f2190e = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e) {
                this.f2190e = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1886b() {
        try {
            FileChannel fileChannel = this.f2190e;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException e) {
        }
        this.f2189d.unlock();
    }
}
