package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Phaser;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Clock;
import p021j$.time.Duration;
import p021j$.time.Instant;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlp implements dlw {

    /* JADX INFO: renamed from: a */
    static final Duration f11966a = Duration.ofSeconds(5);

    /* JADX INFO: renamed from: b */
    static final Duration f11967b = Duration.ofSeconds(2);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f11968j = 0;

    /* JADX INFO: renamed from: d */
    public final kbo f11970d;

    /* JADX INFO: renamed from: e */
    public final kbz f11971e;

    /* JADX INFO: renamed from: f */
    public final Clock f11972f;

    /* JADX INFO: renamed from: g */
    public final Duration f11973g;

    /* JADX INFO: renamed from: h */
    public final dlv f11974h;

    /* JADX INFO: renamed from: l */
    private final jvd f11977l;

    /* JADX INFO: renamed from: m */
    private final ScheduledExecutorService f11978m;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f11969c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    private final AtomicBoolean f11976k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    private final Phaser f11979n = new Phaser(1);

    /* JADX INFO: renamed from: i */
    public final Map f11975i = new HashMap();

    public dlp(jvd jvdVar, kbo kboVar, kbz kbzVar, Clock clock, Duration duration, ScheduledExecutorService scheduledExecutorService, dlv dlvVar) {
        this.f11977l = jvdVar;
        this.f11970d = kboVar.mo6314a("ShotTracker");
        this.f11971e = kbzVar;
        this.f11972f = clock;
        this.f11973g = duration;
        this.f11978m = scheduledExecutorService;
        this.f11974h = dlvVar;
    }

    /* JADX INFO: renamed from: m */
    private final void m6352m(long j) {
        synchronized (this) {
            if (this.f11975i.remove(Long.valueOf(j)) != null) {
                this.f11979n.arriveAndDeregister();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final dln m6353a(long j) {
        dln dlnVar;
        synchronized (this) {
            dlnVar = (dln) this.f11975i.get(Long.valueOf(j));
        }
        return dlnVar != null ? dlnVar : new dlo(this, j);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: b */
    public final void mo6354b() {
        int size;
        if (!this.f11976k.compareAndSet(false, true)) {
            this.f11970d.mo13940b("oneShotCheckForLostShotsAndNotifyIfFound (requested but already done)");
            return;
        }
        this.f11970d.mo13944f("running checkForLostShotsAndNotifyIfFound");
        Instant instant = this.f11972f.instant();
        try {
            List list = (List) this.f11974h.mo6368a().get();
            HashSet<Long> hashSet = new HashSet();
            synchronized (this) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    Map map = this.f11975i;
                    Long lValueOf = Long.valueOf(jLongValue);
                    if (!map.containsKey(lValueOf)) {
                        hashSet.add(lValueOf);
                    }
                }
            }
            for (Long l : hashSet) {
                this.f11970d.mo13940b(kfv.m14168E("marking shot %d as newly lost", l));
                this.f11974h.mo6373f(l.longValue(), instant);
            }
            size = hashSet.size();
        } catch (InterruptedException | ExecutionException e) {
            this.f11970d.mo13947i("best effort failed to fetch unfinished shots: ".concat(e.toString()));
            size = 0;
        }
        if (size > 0) {
            this.f11970d.mo13947i(kfv.m14168E("Detected %d newly lost shots", Integer.valueOf(size)));
            m6364l();
        }
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: c */
    public final void mo6355c(long j, String str) {
        m6353a(j).mo6344c(str);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: d */
    public final void mo6356d(final long j, final String str) {
        final ArrayList arrayList;
        final Instant instant = this.f11972f.instant();
        synchronized (this) {
            arrayList = new ArrayList(this.f11975i.keySet());
        }
        Collection$EL.removeIf(arrayList, new dll(j, 0));
        this.f11978m.execute(new Runnable() { // from class: dlm
            @Override // java.lang.Runnable
            public final void run() {
                dlp dlpVar = this.f11949a;
                ArrayList arrayList2 = arrayList;
                long j2 = j;
                Instant instant2 = instant;
                String str2 = str;
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                String str3 = null;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) arrayList2.get(i)).longValue();
                    if (jLongValue != j2) {
                        if (str3 == null) {
                            str3 = "watchdog reset (caused by shot " + j2 + ", " + str2 + ")";
                        }
                        dlpVar.m6353a(jLongValue).mo6345d(instant2, str3);
                    } else if (arrayList2.size() > 1) {
                        dlpVar.m6353a(jLongValue).mo6345d(instant2, str2 + " (also resetting watchdog on " + (arrayList2.size() - 1) + " other shots)");
                    } else {
                        dlpVar.m6353a(jLongValue).mo6345d(instant2, str2);
                    }
                }
            }
        });
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: e */
    public final void mo6357e(long j) {
        mo6358f(j, false);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: f */
    public final void mo6358f(long j, boolean z) {
        this.f11970d.mo13940b("onShotCanceled " + j);
        m6353a(j).mo6342a(z);
        m6352m(j);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: g */
    public final void mo6359g(long j) {
        this.f11970d.mo13940b("onShotDeleted " + j);
        m6353a(j).mo6343b();
        m6352m(j);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: h */
    public final void mo6360h(long j, Integer num) {
        m6353a(j).mo6348g(num);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: i */
    public final void mo6361i(long j) {
        this.f11970d.mo13940b("onShotPersisted " + j);
        m6353a(j).mo6350i();
        m6352m(j);
    }

    @Override // p000.dlw
    /* JADX INFO: renamed from: j */
    public final void mo6362j(gyv gyvVar) {
        dln dlnVar;
        this.f11970d.mo13940b("onShotStarted " + String.valueOf(gyvVar) + " " + gyvVar.f26878d.toString());
        synchronized (this) {
            dlnVar = (dln) this.f11975i.get(Long.valueOf(gyvVar.f26876b));
            if (dlnVar == null) {
                dlnVar = new dln(this, gyvVar, this.f11972f.instant());
                boolean zIsEmpty = this.f11975i.isEmpty();
                this.f11975i.put(Long.valueOf(gyvVar.f26876b), dlnVar);
                this.f11979n.register();
                if (zIsEmpty && this.f11969c.compareAndSet(false, true)) {
                    m6363k(0);
                }
            } else {
                dlnVar.mo6344c("create() on a shot that already exists: ".concat(String.valueOf(String.valueOf(gyvVar))));
            }
        }
        dlnVar.mo6351j();
    }

    /* JADX INFO: renamed from: k */
    public final void m6363k(int i) {
        this.f11978m.schedule(new bbt(this, i, 10), f11966a.getSeconds(), TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: l */
    public final void m6364l() {
        this.f11970d.mo13940b("mainThread? " + jvd.m13540d());
        this.f11977l.m13541c(new dgt(this, 7));
    }
}
