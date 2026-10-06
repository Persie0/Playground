package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class itd implements iuh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f32047a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32048b;

    public /* synthetic */ itd(ckw ckwVar, int i) {
        this.f32048b = i;
        this.f32047a = ckwVar;
    }

    public itd(ite iteVar, int i) {
        this.f32048b = i;
        this.f32047a = iteVar;
    }

    @Override // p000.iuh
    /* JADX INFO: renamed from: m */
    public final void mo7491m(int i) {
        switch (this.f32048b) {
            case 0:
                if (i == 3) {
                    ite iteVar = (ite) this.f32047a;
                    if (!iteVar.m11744Y() || iteVar.f32087ak.m13088X("wide_selfie_tooltip_display_count") > 2) {
                        i = 3;
                    } else {
                        if (((Float) iteVar.f32103h.mo3831be()).floatValue() < ((Float) ((jwf) iteVar.f32102g).f34942d).floatValue() * ((float) Math.sqrt(iteVar.f32077aa / ((Float) ((jwf) iteVar.f32102g).f34942d).floatValue()))) {
                            iteVar.f32087ak.m13091aa("wide_selfie_tooltip_display_count", 3);
                            i = 3;
                        } else {
                            if (iteVar.f32087ak.m13088X("wide_selfie_tooltip_display_count") < 2) {
                                iteVar.f32087ak.m13090Z("wide_selfie_tooltip_display_count");
                            }
                            igt igtVar = new igt(iteVar.f32059J.getString(C0100R.string.zoom_ffc_wide_tooltip));
                            igtVar.m11313q(iteVar.f32060K);
                            igtVar.mo11305i();
                            igtVar.mo11307k();
                            igtVar.f30869d = 1000;
                            igtVar.f30870e = iteVar.f32059J.getInteger(C0100R.integer.zoom_seekbar_timeout_ms) - 1000;
                            igtVar.mo11300d(new fff(iteVar, 8));
                            igtVar.mo11301e(new ipa(iteVar, 18));
                            igtVar.f30878m = 4;
                            igtVar.f30874i = iteVar.f32106k;
                            igtVar.f30871f = false;
                            igtVar.mo11308l();
                            kba kbaVarMo11297a = igtVar.mo11297a();
                            if (iteVar.f32058I.mo16813g()) {
                                ((kba) iteVar.f32058I.mo16809c()).close();
                            }
                            iteVar.f32058I = mrm.m16829i(kbaVarMo11297a);
                            iteVar.f32100e.m13537d(kbaVarMo11297a);
                            i = 3;
                        }
                    }
                }
                ((ite) this.f32047a).f32072W = i == 7;
                break;
            default:
                ckw ckwVar = (ckw) this.f32047a;
                if (!ckwVar.f6062u && i != 7 && i != 1) {
                    ckwVar.m3874e();
                }
                ckwVar.f6064w = i;
                break;
        }
    }
}
