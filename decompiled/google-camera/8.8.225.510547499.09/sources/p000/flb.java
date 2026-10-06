package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flb implements flf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ flc f22450a;

    /* JADX INFO: renamed from: b */
    private final flf f22451b;

    /* JADX INFO: renamed from: c */
    private final long f22452c;

    /* JADX INFO: renamed from: d */
    private mrm f22453d;

    /* JADX INFO: renamed from: e */
    private mrm f22454e;

    /* JADX INFO: renamed from: f */
    private boolean f22455f;

    public flb(flc flcVar, long j, flf flfVar) {
        this.f22450a = flcVar;
        mqu mquVar = mqu.f41450a;
        this.f22453d = mquVar;
        this.f22454e = mquVar;
        this.f22455f = false;
        this.f22451b = flfVar;
        this.f22452c = j;
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: a */
    public final long mo8530a() {
        long j;
        synchronized (this.f22450a) {
            this.f22450a.f22459d.add(this);
            this.f22451b.mo8530a();
            long j2 = this.f22452c;
            flc flcVar = this.f22450a;
            long j3 = flcVar.f22461f;
            if (j2 <= j3 || !flcVar.f22460e) {
                m8540c(j3);
            }
            j = this.f22452c;
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public final void m8539b() {
        mrm mrmVar;
        mrm mrmVar2;
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        mrm mrmVar3 = mqu.f41450a;
        synchronized (this.f22450a) {
            if (this.f22455f) {
                return;
            }
            if (this.f22454e.mo16813g() && this.f22453d.mo16813g()) {
                if (((Long) this.f22453d.mo16809c()).longValue() <= this.f22452c + this.f22450a.f22458c) {
                    mrmVarM16829i2 = mrm.m16829i(fkv.LONG_PRESS_TOO_SHORT);
                    mrmVarM16829i = mrmVar3;
                } else {
                    mrm mrmVarM16829i3 = mrm.m16829i((Long) this.f22453d.mo16809c());
                    mrmVarM16829i = mrm.m16829i(fli.LONG_SHOT_SHUTTER_RELEASE);
                    mrmVarM16829i2 = mrmVar3;
                    mrmVar3 = mrmVarM16829i3;
                }
                this.f22455f = true;
                this.f22450a.f22459d.remove(this);
                mrm mrmVar4 = mrmVarM16829i2;
                mrmVar = mrmVar3;
                mrmVar3 = mrmVarM16829i;
                mrmVar2 = mrmVar4;
            } else {
                mrmVar = mrmVar3;
                mrmVar2 = mrmVar;
            }
            if (mrmVar3.mo16813g()) {
                this.f22450a.f22456a.mo13940b("Sending out end timestamp: ".concat(mrmVar.mo16809c().toString()));
                ((fle) this.f22454e.mo16809c()).mo8369b(((Long) mrmVar.mo16809c()).longValue(), (fli) mrmVar3.mo16811e(fli.UNKNOWN));
            }
            if (mrmVar2.mo16813g()) {
                this.f22450a.f22456a.mo13940b(PMZiHihxLGEy.cIgHbgiHh);
                ((fle) this.f22454e.mo16809c()).mo8368a((fkv) mrmVar2.mo16809c());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8540c(long j) {
        this.f22453d = mrm.m16829i(Long.valueOf(j));
        m8539b();
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: d */
    public final void mo8533d(fle fleVar) {
        this.f22454e = mrm.m16829i(fleVar);
        this.f22451b.mo8533d(new fla(this, 0));
        m8539b();
    }
}
