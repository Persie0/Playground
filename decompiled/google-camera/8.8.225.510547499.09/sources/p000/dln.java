package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dln {

    /* JADX INFO: renamed from: a */
    public final long f11954a;

    /* JADX INFO: renamed from: c */
    public Instant f11956c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ dlp f11957d;

    /* JADX INFO: renamed from: e */
    private final gyv f11958e;

    /* JADX INFO: renamed from: f */
    private final Instant f11959f;

    /* JADX INFO: renamed from: g */
    private final gyw f11960g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f11961h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public boolean f11955b = false;

    /* JADX INFO: renamed from: i */
    private Instant f11962i = Instant.MIN;

    /* JADX INFO: renamed from: j */
    private int f11963j = 0;

    /* JADX INFO: renamed from: k */
    private kcc f11964k = kcc.f35555b;

    /* JADX INFO: renamed from: l */
    private kce f11965l = kce.f35556a;

    public dln(dlp dlpVar, gyv gyvVar, Instant instant) {
        this.f11957d = dlpVar;
        this.f11954a = gyvVar.f26876b;
        this.f11958e = gyvVar;
        this.f11959f = instant;
        this.f11960g = gyvVar.f26878d;
        this.f11956c = instant;
    }

    /* JADX INFO: renamed from: a */
    public void mo6342a(boolean z) {
        Instant instant = this.f11957d.f11972f.instant();
        mo6345d(instant, "CANCELED");
        if (!this.f11961h.compareAndSet(false, true)) {
            m6346e("canceled");
            return;
        }
        this.f11957d.f11974h.mo6369b(this.f11954a, instant);
        if (z) {
            this.f11957d.m6364l();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6343b() {
        Instant instant = this.f11957d.f11972f.instant();
        mo6345d(instant, "DELETED");
        if (this.f11961h.compareAndSet(false, true)) {
            this.f11957d.f11974h.mo6370c(this.f11954a, instant);
        } else {
            m6346e("deleted");
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo6344c(String str) {
        mo6345d(this.f11957d.f11972f.instant(), str);
    }

    /* JADX INFO: renamed from: d */
    public void mo6345d(Instant instant, String str) {
        this.f11956c = instant;
        if (this.f11961h.get()) {
            m6347f(str);
        } else {
            this.f11957d.f11974h.mo6371d(this.f11954a, instant, str);
        }
    }

    /* JADX INFO: renamed from: e */
    protected final void m6346e(String str) {
        this.f11957d.f11970d.mo13947i(kfv.m14168E("%s() on shot %d (%s), but it was already finished.", str, Long.valueOf(this.f11954a), this.f11958e));
    }

    /* JADX INFO: renamed from: f */
    protected final void m6347f(String str) {
        this.f11957d.f11970d.mo13946h(kfv.m14168E("On shot %d (%s) tried to log '%s', but shot was already finished.", Long.valueOf(this.f11954a), this.f11958e, str));
    }

    /* JADX INFO: renamed from: g */
    public void mo6348g(Integer num) {
        this.f11963j++;
        Instant instant = this.f11957d.f11972f.instant();
        this.f11956c = instant;
        if (num != null) {
            this.f11965l.mo13955c(num.intValue());
        }
        if (instant.isAfter(this.f11962i)) {
            this.f11957d.f11970d.mo13940b("onShotProgress " + String.valueOf(this.f11958e) + " (" + this.f11963j + ")");
            this.f11962i = instant.plus(dlp.f11967b);
            if (this.f11961h.get()) {
                m6346e("makingProgress");
            } else {
                this.f11957d.f11974h.mo6372e(this.f11954a, instant);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo6349h(Instant instant) {
        if (this.f11961h.get()) {
            m6346e("markStuck");
        } else {
            this.f11955b = true;
            this.f11957d.f11974h.mo6374g(this.f11954a, instant);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo6350i() {
        Instant instant = this.f11957d.f11972f.instant();
        mo6345d(instant, "PERSISTED");
        this.f11964k.mo13952a();
        this.f11964k = kcc.f35555b;
        if (this.f11961h.compareAndSet(false, true)) {
            this.f11957d.f11974h.mo6375h(this.f11954a, instant);
        } else {
            m6346e("persisted");
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo6351j() {
        if (this.f11961h.get()) {
            m6346e("started");
            return;
        }
        this.f11957d.f11974h.mo6376i(this.f11958e, this.f11959f, this.f11960g);
        this.f11964k = this.f11957d.f11971e.mo13957a("Shot #" + this.f11954a);
        this.f11965l = this.f11957d.f11971e.mo13958b("ShotProgress #" + this.f11954a);
    }
}
