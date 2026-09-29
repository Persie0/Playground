package p000;

import android.database.DatabaseUtils;
import com.iterable.iterableapi.C1221q;

/* JADX INFO: loaded from: classes2.dex */
public final class sr3 {

    /* JADX INFO: renamed from: a */
    public boolean f61294a;

    /* JADX INFO: renamed from: b */
    public final C1221q f61295b;

    public sr3(C1221q c1221q) {
        this.f61294a = false;
        this.f61295b = c1221q;
        if (c1221q.m6962c()) {
            eh0.m11120Q("HealthMonitor", "DB Ready notified to healthMonitor");
            this.f61294a = false;
        } else {
            eh0.m11135p("HealthMonitor", "DB Error notified to healthMonitor");
            this.f61294a = true;
        }
        c1221q.f14088d.add(this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21668a() {
        eh0.m11133m("HealthMonitor", "canSchedule");
        try {
            C1221q c1221q = this.f61295b;
            if (c1221q.m6962c()) {
                return DatabaseUtils.queryNumEntries(c1221q.f14085a, "OfflineTask") < 1000;
            }
            throw new IllegalStateException("Database is not ready");
        } catch (IllegalStateException e) {
            eh0.m11135p("HealthMonitor", e.getLocalizedMessage());
            this.f61294a = true;
            return false;
        }
    }
}
