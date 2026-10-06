package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class evz extends fug {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ewa f20493a;

    /* JADX INFO: renamed from: b */
    private final boolean f20494b;

    public evz(ewa ewaVar, boolean z) {
        this.f20493a = ewaVar;
        this.f20494b = z;
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: a */
    public final void mo7883a() {
        this.f20493a.f20563u.m8580a();
        this.f20493a.f20547e.mo3693g().mo3723m();
        if (this.f20493a.f20501D.mo16813g()) {
            ((cld) this.f20493a.f20501D.mo16809c()).mo3898b(false);
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: b */
    public final void mo7884b(long j) {
        if (this.f20493a.f20501D.mo16813g()) {
            ((cld) this.f20493a.f20501D.mo16809c()).mo3899c(this.f20494b);
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: c */
    public final void mo7885c() {
        this.f20493a.f20548f.execute(new evu(this, 3));
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: d */
    public final void mo7886d(float f) {
        mo7888f(f, -1L);
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: f */
    public final void mo7888f(float f, long j) {
        if (((Boolean) this.f20493a.f20498A.f13316b.mo3831be()).booleanValue() && this.f20493a.f20501D.mo16813g()) {
            ((cld) this.f20493a.f20501D.mo16809c()).mo3905i(f, j);
        } else {
            this.f20493a.f20563u.m8585f((int) (100.0f * f));
            if (f == 0.0f) {
                this.f20493a.f20547e.mo3693g().mo3722l();
            } else if (f == 1.0f) {
                this.f20493a.f20547e.mo3693g().mo3723m();
            }
        }
        if (f == 1.0f) {
            this.f20493a.f20552j.mo10316b(C0100R.raw.camera_shutter);
        }
    }
}
