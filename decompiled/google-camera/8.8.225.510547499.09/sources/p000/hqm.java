package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqm {

    /* JADX INFO: renamed from: l */
    private static final nbh f29134l = nbh.m17259h(CswIK.ssNODSHTzHb);

    /* JADX INFO: renamed from: c */
    public final int f29137c;

    /* JADX INFO: renamed from: d */
    public final boolean f29138d;

    /* JADX INFO: renamed from: e */
    public final HashMap f29139e;

    /* JADX INFO: renamed from: f */
    public final HashMap f29140f;

    /* JADX INFO: renamed from: g */
    public final HashMap f29141g;

    /* JADX INFO: renamed from: h */
    public nma f29142h;

    /* JADX INFO: renamed from: i */
    public boolean f29143i;

    /* JADX INFO: renamed from: j */
    public long f29144j;

    /* JADX INFO: renamed from: k */
    public long f29145k;

    /* JADX INFO: renamed from: a */
    public final Object f29135a = new Object();

    /* JADX INFO: renamed from: m */
    private final ihk f29146m = new ihk();

    /* JADX INFO: renamed from: b */
    public final String f29136b = wUzNh.UNydjrTLgceuML;

    public hqm(hqo hqoVar, boolean z) {
        this.f29138d = z;
        int length = nma.values().length;
        this.f29137c = hqoVar.f29162h;
        this.f29142h = nma.SLOW;
        this.f29143i = false;
        this.f29139e = new HashMap();
        this.f29140f = new HashMap();
        this.f29141g = new HashMap();
        for (hqn hqnVar : hqn.values()) {
            this.f29139e.put(hqnVar, 0);
            this.f29140f.put(hqnVar, 0L);
            this.f29141g.put(hqnVar, 0L);
        }
    }

    /* JADX INFO: renamed from: a */
    public final hqn m10606a(nma nmaVar) {
        return (hqn) ihk.m11329h(nmaVar, (Class) this.f29146m.f30967b);
    }

    /* JADX INFO: renamed from: b */
    final void m10607b(hqn hqnVar) {
        synchronized (this.f29135a) {
            if (!this.f29140f.containsKey(hqnVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.f29140f.put(hqnVar, Long.valueOf(((Long) this.f29140f.get(hqnVar)).longValue() + 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10608c(hqn hqnVar) {
        synchronized (this.f29135a) {
            if (!this.f29141g.containsKey(hqnVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.f29141g.put(hqnVar, Long.valueOf(((Long) this.f29141g.get(hqnVar)).longValue() + 1));
        }
    }

    /* JADX INFO: renamed from: d */
    final void m10609d(hqn hqnVar) {
        synchronized (this.f29135a) {
            if (!this.f29139e.containsKey(hqnVar)) {
                throw new IllegalArgumentException("unsupported speed up ratio");
            }
            this.f29139e.put(hqnVar, Integer.valueOf(((Integer) this.f29139e.get(hqnVar)).intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: e */
    final void m10610e(long j) {
        synchronized (this.f29135a) {
            this.f29144j = j;
        }
    }

    /* JADX INFO: renamed from: f */
    final void m10611f(hqn hqnVar) {
        synchronized (this.f29135a) {
            try {
                this.f29142h = (nma) ihk.m11329h(hqnVar, (Class) this.f29146m.f30966a);
            } catch (IllegalArgumentException e) {
                this.f29142h = nma.SLOW;
                ((nbe) ((nbe) f29134l.m17252c()).mo17276G(3897)).mo17293r("Unsupported speed up ratio: %s", hqnVar.name());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    final void m10612g(long j) {
        synchronized (this.f29135a) {
            this.f29145k = j;
        }
    }

    /* JADX INFO: renamed from: h */
    final void m10613h() {
        synchronized (this.f29135a) {
        }
    }

    /* JADX INFO: renamed from: i */
    final void m10614i() {
        synchronized (this.f29135a) {
        }
    }
}
