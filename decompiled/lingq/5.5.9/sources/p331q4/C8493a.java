package p331q4;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8493a {

    /* JADX INFO: renamed from: e */
    public static final HashMap f45688e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final boolean f45689a;

    /* JADX INFO: renamed from: b */
    public final File f45690b;

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SyntheticAccessor"})
    public final Lock f45691c;

    /* JADX INFO: renamed from: d */
    public FileChannel f45692d;

    public C8493a(String str, File file, boolean z10) {
        Lock lock;
        this.f45689a = z10;
        this.f45690b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f45688e;
        synchronized (map) {
            Object reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            lock = (Lock) reentrantLock;
        }
        this.f45691c = lock;
    }

    /* JADX INFO: renamed from: a */
    public final void m16579a(boolean z10) {
        this.f45691c.lock();
        if (z10) {
            File file = this.f45690b;
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
                this.f45692d = channel;
            } catch (IOException e10) {
                this.f45692d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16580b() {
        try {
            FileChannel fileChannel = this.f45692d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f45691c.unlock();
    }
}
