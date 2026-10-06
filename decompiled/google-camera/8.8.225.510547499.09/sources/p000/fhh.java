package p000;

import android.media.MediaFormat;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhh implements AutoCloseable {

    /* JADX INFO: renamed from: i */
    private static final nbh f21975i = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/AudioTrackSampler");

    /* JADX INFO: renamed from: a */
    public final mrm f21976a;

    /* JADX INFO: renamed from: c */
    public final mrm f21978c;

    /* JADX INFO: renamed from: d */
    public final Executor f21979d;

    /* JADX INFO: renamed from: g */
    boolean f21982g;

    /* JADX INFO: renamed from: h */
    C1058va f21983h;

    /* JADX INFO: renamed from: j */
    private final dhv f21984j;

    /* JADX INFO: renamed from: k */
    private final MediaFormat f21985k;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f21980e = new AtomicLong();

    /* JADX INFO: renamed from: l */
    private final AtomicLong f21986l = new AtomicLong();

    /* JADX INFO: renamed from: m */
    private final AtomicLong f21987m = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final AtomicLong f21981f = new AtomicLong();

    /* JADX INFO: renamed from: n */
    private final AtomicLong f21988n = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final Handler f21977b = jvh.m13558f(new jvb(), "mv-aud-encoder");

    public fhh(dhv dhvVar, MediaFormat mediaFormat, mrm mrmVar, mrm mrmVar2, Executor executor) {
        this.f21984j = dhvVar;
        this.f21985k = mediaFormat;
        this.f21976a = mrmVar2;
        this.f21978c = mrmVar;
        this.f21979d = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m8419a(boolean z) {
        if (z || System.currentTimeMillis() >= this.f21988n.get() + 1000) {
            this.f21980e.get();
            this.f21987m.get();
            this.f21981f.get();
            this.f21986l.get();
            this.f21988n.set(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8420b(kyt kytVar, fhv fhvVar) {
        if (this.f21978c.mo16813g()) {
            if (this.f21983h != null) {
                ((nbe) ((nbe) f21975i.m17252c()).mo17276G((char) 2268)).mo17290o("Attempting to re-initialize AudioTrackSampler!");
                return;
            }
            ((dxi) this.f21978c.mo16809c()).mo6847d(new fdo(this, 17), this.f21979d);
            lex lexVarM14879r = kua.m14879r(new fii(kytVar));
            lfc lfcVarM15277c = ((lfa) lexVarM14879r).m15277c(this.f21985k);
            lfcVarM15277c.f38113c = this.f21977b;
            lfcVarM15277c.m15279b(new fhg(this));
            lew lewVarM15278a = lfcVarM15277c.m15278a();
            lexVarM14879r.mo15276b();
            this.f21983h = new C1058va(lexVarM14879r, lewVarM15278a, fhvVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [fhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, lew] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m8421c() {
        mrm mrmVarM16829i;
        if (this.f21978c.mo16813g() && !this.f21982g) {
            C1058va c1058va = this.f21983h;
            c1058va.getClass();
            ?? r1 = c1058va.f47803b;
            if (r1 == 0) {
                return;
            }
            try {
                leu leuVarMo15271b = r1.mo15271b();
                if (leuVarMo15271b != null) {
                    try {
                        ?? r0 = c1058va.f47802a;
                        while (true) {
                            Object objB = ((dxi) this.f21978c.mo16809c()).mo6845b();
                            if (objB != null) {
                                this.f21980e.incrementAndGet();
                                oyo oyoVarMo8427f = r0.mo8427f(TimeUnit.MICROSECONDS.convert(((lej) objB).f38034c, TimeUnit.NANOSECONDS));
                                if (!oyoVarMo8427f.m19205l()) {
                                    dhv dhvVar = this.f21984j;
                                    dhx dhxVar = dii.f11525a;
                                    dhvVar.mo6177e();
                                    if (oyoVarMo8427f.m19206m() && this.f21976a.mo16813g() && this.f21980e.get() >= 5) {
                                        ((dyc) this.f21976a.mo16809c()).m6919b();
                                        m8419a(true);
                                        this.f21980e.set(0L);
                                    }
                                    mrmVarM16829i = mrm.m16829i(objB);
                                    break;
                                }
                                this.f21986l.incrementAndGet();
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                                break;
                            }
                        }
                        if (mrmVarM16829i.mo16813g()) {
                            ((leo) leuVarMo15271b).f38067b.put(((lej) mrmVarM16829i.mo16809c()).f38032a.asReadOnlyBuffer());
                            ((leo) leuVarMo15271b).f38067b.position(((lej) mrmVarM16829i.mo16809c()).f38032a.limit());
                            ((leo) leuVarMo15271b).f38066a = TimeUnit.MICROSECONDS.convert(((lej) mrmVarM16829i.mo16809c()).f38034c, TimeUnit.NANOSECONDS);
                            this.f21987m.incrementAndGet();
                            m8419a(false);
                        }
                        leuVarMo15271b.close();
                    } catch (Throwable th) {
                        try {
                            leuVarMo15271b.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IllegalStateException e2) {
                ((nbe) ((nbe) ((nbe) f21975i.m17252c()).mo17283h(e2)).mo17276G((char) 2273)).mo17290o("Error trying to encode audio packet. Possible codec shutdown");
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21982g = true;
        m8419a(true);
        this.f21979d.execute(new ewo(this, this.f21983h, 12, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
    }
}
