package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eul implements eop {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ chw f20120a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20121b;

    public eul(euf eufVar, int i) {
        this.f20121b = i;
        this.f20120a = eufVar;
    }

    public eul(eus eusVar, int i) {
        this.f20121b = i;
        this.f20120a = eusVar;
    }

    public eul(eva evaVar, int i) {
        this.f20121b = i;
        this.f20120a = evaVar;
    }

    public eul(evo evoVar, int i) {
        this.f20121b = i;
        this.f20120a = evoVar;
    }

    public eul(ewa ewaVar, int i) {
        this.f20121b = i;
        this.f20120a = ewaVar;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5221a(boolean z) {
        int i = this.f20121b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5222b(boolean z) {
        int i = this.f20121b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo5223c() {
        int i = this.f20121b;
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: e */
    public final void mo5225e(boolean z) {
        switch (this.f20121b) {
            case 0:
                if (((eus) this.f20120a).m7912E() && z) {
                    ((eus) this.f20120a).f20193k.mo11738S();
                    break;
                }
                break;
            case 1:
                euf eufVar = (euf) this.f20120a;
                boolean z2 = eufVar.f19980ao.f31381h;
                if (z) {
                    if (eufVar.m7897G() || z2) {
                        ((euf) this.f20120a).f20004k.mo11738S();
                    }
                }
                break;
            case 2:
                if (z && ((eva) this.f20120a).m7922x()) {
                    ((eva) this.f20120a).f20320n.mo11738S();
                    break;
                }
                break;
            case 3:
                if (z && !((evo) this.f20120a).f20431p.m7926c()) {
                    ((evo) this.f20120a).f20419d.mo11738S();
                    break;
                }
                break;
            default:
                if (z) {
                    ((ewa) this.f20120a).f20560r.mo11738S();
                }
                break;
        }
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: f */
    public final void mo5226f(boolean z) {
        switch (this.f20121b) {
            case 0:
                if (((eus) this.f20120a).m7912E() && z) {
                    ((eus) this.f20120a).f20193k.mo11739T();
                    break;
                }
                break;
            case 1:
                euf eufVar = (euf) this.f20120a;
                boolean z2 = eufVar.f19980ao.f31381h;
                if (z) {
                    if (eufVar.m7897G() || z2) {
                        ((euf) this.f20120a).f20004k.mo11739T();
                    }
                }
                break;
            case 2:
                if (z && ((eva) this.f20120a).m7922x()) {
                    ((eva) this.f20120a).f20320n.mo11739T();
                    break;
                }
                break;
            case 3:
                if (z && !((evo) this.f20120a).f20431p.m7926c()) {
                    ((evo) this.f20120a).f20419d.mo11739T();
                    break;
                }
                break;
            default:
                if (z) {
                    ((ewa) this.f20120a).f20560r.mo11739T();
                }
                break;
        }
    }

    @Override // p000.eop
    /* JADX INFO: renamed from: d */
    public final void mo5224d(boolean z) {
        switch (this.f20121b) {
            case 0:
                if (((eus) this.f20120a).m7912E()) {
                    if (z) {
                        ((eus) this.f20120a).f20189g.onShutterTouchStart();
                    } else {
                        eus eusVar = (eus) this.f20120a;
                        eusVar.f20147I = true;
                        eusVar.f20189g.onShutterButtonClick();
                    }
                }
                ((eus) this.f20120a).f20201s.mo11254z(z);
                return;
            case 1:
                euf eufVar = (euf) this.f20120a;
                if (eufVar.f19929P) {
                    return;
                }
                if (z) {
                    if (!eufVar.f19980ao.f31381h) {
                        boolean z2 = false;
                        if (eufVar.f19936W.mo16813g() && ((Boolean) ((hmu) ((euf) this.f20120a).f19936W.mo16809c()).m10472a().mo3831be()).booleanValue()) {
                            z2 = true;
                        }
                        if (!((euf) this.f20120a).f19931R.m3927f() && !((euf) this.f20120a).f19972ag.m10799h() && !z2 && !((Boolean) ((euf) this.f20120a).f19974ai.mo3831be()).booleanValue()) {
                            eot eotVar = ((euf) this.f20120a).f20001h;
                            ksa ksaVar = eotVar.f14926b;
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            synchronized (eotVar.f14925a) {
                                int i = eotVar.f14930f;
                                if (i == 1) {
                                    eotVar.f14930f = 2;
                                    eotVar.f14929e = jElapsedRealtimeNanos;
                                } else if (jElapsedRealtimeNanos - eotVar.f14929e > eotVar.f14927c && i == 2) {
                                    eotVar.f14930f = 3;
                                    eotVar.f14928d.mo7604a(3);
                                }
                            }
                        }
                        if (((euf) this.f20120a).m7897G()) {
                            ((euf) this.f20120a).f20003j.onShutterTouchStart();
                        }
                    }
                    break;
                } else {
                    eot eotVar2 = eufVar.f20001h;
                    synchronized (eotVar2.f14925a) {
                        int i2 = eotVar2.f14930f;
                        if (i2 == 2) {
                            eotVar2.f14930f = 1;
                        } else if (i2 == 3) {
                            eotVar2.f14930f = 1;
                            eotVar2.f14928d.mo7605b(3);
                        }
                        if (((euf) this.f20120a).f19972ag.m10798g()) {
                            return;
                        }
                        euf eufVar2 = (euf) this.f20120a;
                        if (eufVar2.f19980ao.f31381h) {
                            eufVar2.f20011r.mo7605b(3);
                            return;
                        } else if (eufVar2.m7897G()) {
                            euf eufVar3 = (euf) this.f20120a;
                            eufVar3.f19928O = true;
                            eufVar3.f20003j.onShutterButtonClick();
                        }
                    }
                }
                ((euf) this.f20120a).f20002i.mo11254z(z);
                return;
            case 2:
                eva evaVar = (eva) this.f20120a;
                if (evaVar.f20289J || !evaVar.m7922x()) {
                    return;
                }
                if (z) {
                    ((eva) this.f20120a).f20288I.m10430e();
                } else {
                    eva evaVar2 = (eva) this.f20120a;
                    evaVar2.f20286G = true;
                    evaVar2.f20288I.m10431f();
                    ((eva) this.f20120a).f20324r.m10797f();
                }
                ((eva) this.f20120a).f20315i.mo11254z(z);
                return;
            case 3:
                if (z) {
                    ((evo) this.f20120a).f20418c.onShutterTouchStart();
                    return;
                } else if (((evo) this.f20120a).f20431p.m7926c()) {
                    ((evo) this.f20120a).m7930x();
                    return;
                } else {
                    ((evo) this.f20120a).f20418c.onShutterButtonClick();
                    return;
                }
            default:
                fmd fmdVar = ((ewa) this.f20120a).f20517T;
                if (fmdVar != null && ((Boolean) fmdVar.m8568b().mo3831be()).booleanValue()) {
                    if (z) {
                        ((ewa) this.f20120a).f20551i.onShutterTouchStart();
                    } else {
                        ewa ewaVar = (ewa) this.f20120a;
                        ewaVar.f20505H = true;
                        ewaVar.f20551i.onShutterButtonClick();
                    }
                }
                ((ewa) this.f20120a).f20565w.mo11254z(z);
                return;
        }
    }
}
