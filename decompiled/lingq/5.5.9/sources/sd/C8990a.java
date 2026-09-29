package sd;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: sd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8990a {

    /* JADX INFO: renamed from: a */
    public final HashMap f47173a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f47174b = new AtomicBoolean(false);

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m17232a() {
        if (!this.f47174b.get()) {
            synchronized (this) {
                this.f47173a.put("assetOnlyUpdates", Boolean.FALSE);
            }
        }
        Object obj = this.f47173a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
