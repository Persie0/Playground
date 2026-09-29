package p000;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class nv4 {

    /* JADX INFO: renamed from: a */
    public final Object f53285a = new Object();

    /* JADX INFO: renamed from: b */
    public final String f53286b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f53287c;

    public nv4(Class cls) {
        this.f53286b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m17640a() {
        Logger logger = this.f53287c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f53285a) {
            try {
                Logger logger2 = this.f53287c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f53286b);
                this.f53287c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
