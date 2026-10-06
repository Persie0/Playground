package p000;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eua extends igg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ euf f19902a;

    public eua(euf eufVar) {
        this.f19902a = eufVar;
    }

    /* JADX INFO: renamed from: a */
    private final boolean m7882a() {
        gzp gzpVar = (gzp) this.f19902a.f19927N.mo3831be();
        boolean z = this.f19902a.f19936W.mo16813g() && ((Boolean) ((hmu) this.f19902a.f19936W.mo16809c()).m10472a().mo3831be()).booleanValue();
        if (gzpVar != gzp.AUTO && !this.f19902a.f19972ag.m10799h()) {
            euf eufVar = this.f19902a;
            if (eufVar.f19929P && !z && !((Boolean) eufVar.f19974ai.mo3831be()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        euf eufVar = this.f19902a;
        fuc fucVar = eufVar.f19923J;
        if (fucVar == null) {
            ((nbe) ((nbe) euf.f19913b.m17252c()).mo17276G(1909)).mo17293r("Not taking picture since Camera is %s", eufVar.f19922I != null ? "starting" : "closed");
            return;
        }
        mca mcaVarMo8575i = fucVar.mo8575i();
        if (eufVar.f19933T.f13306h && ((Boolean) eufVar.f19970ae.f13316b.mo3831be()).booleanValue() && ((Boolean) ((jwf) mcaVarMo8575i.f39921i).f34942d).booleanValue()) {
            this.f19902a.f20010q.mo8591d(mcaVarMo8575i);
            if (this.f19902a.f20018y.mo16813g()) {
                ((cld) this.f19902a.f20018y.mo16809c()).mo3897a();
                return;
            }
            return;
        }
        this.f19902a.f19925L.m10431f();
        euf eufVar2 = this.f19902a;
        if (eufVar2.f19972ag.m10798g()) {
            return;
        }
        gzp gzpVar = (gzp) eufVar2.f19927N.mo3831be();
        int i = gzpVar.f26960g;
        if (i > 0) {
            eufVar2.m7895E(i);
            return;
        }
        if (gzpVar != gzp.AUTO) {
            eufVar2.mo3783r();
            return;
        }
        if (eufVar2.f19931R.m3926e()) {
            eufVar2.f19932S.mo10751b();
        } else if (eufVar2.f19931R.m3927f()) {
            eufVar2.f19932S.mo10750a();
        } else {
            ((nbe) ((nbe) euf.f19913b.m17252c()).mo17276G((char) 1932)).mo17290o("Not starting or stopping auto-timer capture since the state is disabled.");
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonLongPressRelease() {
        if (m7882a()) {
            this.f19902a.f20012s.mo7605b(2);
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonLongPressUnlock() {
        if (m7882a()) {
            this.f19902a.f20011r.mo7605b(2);
            jvh.m13557e(Looper.getMainLooper()).post(new esc(this, 18));
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonLongPressed() {
        if (m7882a()) {
            this.f19902a.f20012s.mo7604a(2);
        }
    }

    @Override // p000.igg, p000.igf
    public final void onShutterTouchStart() {
        this.f19902a.f19925L.m10430e();
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonPressedStateChanged(boolean z) {
        euf eufVar = this.f19902a;
        eufVar.f19929P = z;
        if (z) {
            if (eufVar.f20014u.mo16813g()) {
                ((fgu) eufVar.f20014u.mo16809c()).mo8360d();
            }
        } else if (eufVar.f20014u.mo16813g()) {
            ((fgu) eufVar.f20014u.mo16809c()).mo8361e();
        }
    }
}
