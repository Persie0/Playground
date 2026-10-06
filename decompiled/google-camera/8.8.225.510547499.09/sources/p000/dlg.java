package p000;

import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlg implements dlc {

    /* JADX INFO: renamed from: a */
    public static final nbh f11934a = nbh.m17259h("com/google/android/apps/camera/debug/jankmonitor/limited/JankMonitorFacadeLimited");

    /* JADX INFO: renamed from: f */
    private boolean f11939f = false;

    /* JADX INFO: renamed from: g */
    private final ScheduledExecutorService f11940g = jzn.m13828p("JankReports");

    /* JADX INFO: renamed from: b */
    public final List f11935b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f11936c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public ikw f11937d = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: e */
    protected final kul f11938e = new kul(new AmbientMode.AmbientController(this), null, null, null, null);

    @Override // p000.dlc
    /* JADX INFO: renamed from: a */
    public final synchronized List mo6328a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f11936c);
        this.f11936c.clear();
        Iterator it = this.f11935b.iterator();
        while (it.hasNext()) {
            arrayList.add(((dlf) it.next()).m6334a());
        }
        this.f11935b.clear();
        return arrayList;
    }

    @Override // p000.dlc
    /* JADX INFO: renamed from: b */
    public final void mo6329b(long j, long j2) {
        this.f11938e.m14896a(j, j2);
        synchronized (this) {
            Iterator it = this.f11935b.iterator();
            while (it.hasNext()) {
                ((dlf) it.next()).f11932d++;
            }
        }
    }

    @Override // p000.dlc
    /* JADX INFO: renamed from: c */
    public final void mo6330c() {
    }

    @Override // p000.dlc
    /* JADX INFO: renamed from: d */
    public final synchronized void mo6331d(ikw ikwVar) {
        this.f11937d = ikwVar;
        Iterator it = this.f11935b.iterator();
        while (it.hasNext()) {
            this.f11936c.add(((dlf) it.next()).m6334a());
        }
        this.f11935b.clear();
        this.f11935b.add(new dlf(ikwVar, 2));
        if (!this.f11939f) {
            this.f11939f = true;
            dlf dlfVar = new dlf(this.f11937d, 3);
            this.f11935b.add(dlfVar);
            this.f11940g.schedule(new dgq(this, dlfVar, 3), 5L, TimeUnit.SECONDS);
        }
    }

    @Override // p000.dlc
    /* JADX INFO: renamed from: e */
    public final synchronized void mo6332e() {
        dlf dlfVar = new dlf(this.f11937d, 4);
        this.f11935b.add(dlfVar);
        this.f11940g.schedule(new dgq(this, dlfVar, 4), 5L, TimeUnit.SECONDS);
    }

    @Override // p000.dlc
    /* JADX INFO: renamed from: f */
    public final synchronized void mo6333f() {
    }
}
