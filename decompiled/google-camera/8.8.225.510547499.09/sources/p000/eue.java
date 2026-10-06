package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eue extends fug {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ euf f19911a;

    /* JADX INFO: renamed from: b */
    private final boolean f19912b;

    public eue(euf eufVar, boolean z) {
        this.f19911a = eufVar;
        this.f19912b = z;
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: a */
    public final void mo7883a() {
        this.f19911a.m7899x(false);
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: b */
    public final void mo7884b(long j) {
        if (this.f19911a.f20018y.mo16813g()) {
            ((cld) this.f19911a.f20018y.mo16809c()).mo3899c(this.f19912b);
        }
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: c */
    public final void mo7885c() {
        euf eufVar = this.f19911a;
        if (eufVar.f19914A) {
            return;
        }
        eufVar.f19997d.execute(new esc(this, 19));
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: d */
    public final void mo7886d(float f) {
        mo7888f(f, -1L);
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: e */
    public final void mo7887e(float f, int i) {
    }

    @Override // p000.fug, p000.fub
    /* JADX INFO: renamed from: f */
    public final void mo7888f(float f, long j) {
        if (!((Boolean) this.f19911a.f19970ae.f13316b.mo3831be()).booleanValue()) {
            this.f19911a.f19917D.m8585f((int) (100.0f * f));
            if (f == 0.0f) {
                if (!this.f19911a.f19931R.m3926e()) {
                    this.f19911a.f19915B.mo3693g().mo3722l();
                }
                this.f19911a.m7893C(true);
            } else if (f == 1.0f) {
                if (!this.f19911a.f19931R.m3926e()) {
                    this.f19911a.f19915B.mo3693g().mo3723m();
                }
                this.f19911a.m7893C(false);
            }
        } else if (this.f19911a.f20018y.mo16813g()) {
            ((cld) this.f19911a.f20018y.mo16809c()).mo3905i(f, j);
        }
        if (f == 1.0f) {
            this.f19911a.f19916C.mo10316b(C0100R.raw.camera_shutter);
        }
    }
}
