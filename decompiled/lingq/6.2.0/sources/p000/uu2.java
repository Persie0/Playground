package p000;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class uu2 {

    /* JADX INFO: renamed from: c */
    public static final gna f64361c = new gna();

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f64362d = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f64363a;

    /* JADX INFO: renamed from: b */
    public final p33 f64364b;

    public uu2(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (f64361c) {
            try {
                LinkedHashMap linkedHashMap = f64362d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f64363a = reentrantLock;
        this.f64364b = z ? new p33(str, 0) : null;
    }
}
