package p000;

import com.google.android.gms.internal.play_billing.zzbp;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class rwb {

    /* JADX INFO: renamed from: a */
    public final zzbp f59982a = new zzbp();

    /* JADX INFO: renamed from: b */
    public final String f59983b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f59984c;

    public rwb(Class cls) {
        this.f59983b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m20965a() {
        Logger logger = this.f59984c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f59982a) {
            try {
                Logger logger2 = this.f59984c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f59983b);
                this.f59984c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
