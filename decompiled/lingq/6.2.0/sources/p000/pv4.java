package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pv4 implements uo7 {

    /* JADX INFO: renamed from: a */
    public volatile Set f56853a;

    /* JADX INFO: renamed from: b */
    public volatile Set f56854b;

    @Override // p000.uo7
    public final Object get() {
        if (this.f56854b == null) {
            synchronized (this) {
                try {
                    if (this.f56854b == null) {
                        this.f56854b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f56853a.iterator();
                                while (it.hasNext()) {
                                    this.f56854b.add(((uo7) it.next()).get());
                                }
                                this.f56853a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f56854b);
    }
}
