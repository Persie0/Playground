package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bnp implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f3889a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f3890b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f3891c;

    public bnp(bmz bmzVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = bmzVar;
        this.f3889a = z;
    }

    public bnp(bnq bnqVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = bnqVar;
        this.f3889a = z;
    }

    public bnp(bzl bzlVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = bzlVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(ckw ckwVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = ckwVar;
        this.f3889a = z;
    }

    public bnp(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = photoSphereMessageOverlay;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(cpw cpwVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = cpwVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(cqm cqmVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = cqmVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(cra craVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = craVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(euf eufVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = eufVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(eum eumVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = eumVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(ewa ewaVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = ewaVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(ges gesVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = gesVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(hff hffVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = hffVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(hpu hpuVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = hpuVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(hqk hqkVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = hqkVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(ige igeVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = igeVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(irg irgVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = irgVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(khj khjVar, boolean z, int i) {
        this.f3891c = i;
        this.f3890b = khjVar;
        this.f3889a = z;
    }

    public /* synthetic */ bnp(boolean z, String str, int i) {
        this.f3891c = i;
        this.f3889a = z;
        this.f3890b = str;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [byw, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3891c) {
            case 0:
                ((bnq) this.f3890b).mo2718c().obtainMessage(501, this.f3889a ? 1 : 0, 0).sendToTarget();
                break;
            case 1:
                bmz bmzVar = (bmz) this.f3890b;
                bmzVar.f3851b.mo2767a(this.f3889a, bmzVar.f3852c);
                break;
            case 2:
                Object obj = this.f3890b;
                boolean z = this.f3889a;
                cbi.m3387h();
                jwl jwlVar = ((bzl) obj).f4817a;
                boolean z2 = jwlVar.f34954a;
                jwlVar.f34954a = z;
                if (z2 != z) {
                    jwlVar.f34956c.mo2860a(z);
                }
                break;
            case 3:
                Object obj2 = this.f3890b;
                ckw ckwVar = (ckw) obj2;
                ckwVar.f6066y.m13090Z(true != this.f3889a ? "catshark_toggle_tooltip" : KMNlNMe.bBQrfP);
                ckwVar.f6059r = true;
                break;
            case 4:
                Object obj3 = this.f3890b;
                boolean z3 = this.f3889a;
                cpw cpwVar = (cpw) obj3;
                cpwVar.f8691g.f9279i.mo3415bf(true);
                cpwVar.m5271m(false, 4);
                cpwVar.f8688d.m5363d(z3);
                break;
            case 5:
                Object obj4 = this.f3890b;
                boolean z4 = this.f3889a;
                cqm cqmVar = (cqm) obj4;
                cqmVar.f8970y.mo5722b();
                if (cqmVar.f8956k.m5716a().equals(cxk.DEFAULT) && cqm.m5361n(cqmVar.f8969x)) {
                    cqmVar.f8950e.mo11761l(true);
                }
                cqmVar.m5372m(z4);
                break;
            case 6:
                Object obj5 = this.f3890b;
                if (!this.f3889a) {
                    cra craVar = (cra) obj5;
                    craVar.f9066a.m3465b(craVar.f9078m);
                } else {
                    cra craVar2 = (cra) obj5;
                    craVar2.f9066a.m3465b(craVar2.f9077l);
                }
                break;
            case 7:
                boolean z5 = this.f3889a;
                Object obj6 = this.f3890b;
                if (!z5) {
                    ((nbe) ((nbe) dct.f10527a.m17251b()).mo17276G((char) 831)).mo17293r("Not showing \"%s\" warning since the app is in the background", obj6);
                } else {
                    ((nbe) ((nbe) dct.f10527a.m17251b()).mo17276G((char) 830)).mo17293r("showing \"%s\" warning", obj6);
                }
                break;
            case 8:
                Object obj7 = this.f3890b;
                if (!this.f3889a) {
                    ((euf) obj7).f19920G.m10883f();
                } else {
                    euf eufVar = (euf) obj7;
                    eufVar.f20000g.mo13961e("resume#startHotshot");
                    eufVar.f19920G.m10882e();
                    eufVar.f20000g.mo13962f();
                }
                break;
            case 9:
                Object obj8 = this.f3890b;
                boolean z6 = this.f3889a;
                euf eufVar2 = (euf) obj8;
                eufVar2.f19978am = null;
                eufVar2.f19966aa.mo3415bf(false);
                eufVar2.f19915B.mo3693g().mo3716f();
                if (!z6) {
                    if (eufVar2.f20018y.mo16813g()) {
                        ((cld) eufVar2.f20018y.mo16809c()).mo3900d();
                    }
                    eufVar2.m7892B(eufVar2.f19934U.mo3831be().booleanValue());
                    if (!eufVar2.f19931R.m3926e()) {
                        eufVar2.f20013t.mo11013l(true);
                    }
                    if (eufVar2.f20018y.mo16813g()) {
                        ((cld) eufVar2.f20018y.mo16809c()).mo3909m();
                    }
                    eufVar2.f19917D.m8582c();
                    eufVar2.f20004k.mo11728I(true);
                    eufVar2.f20004k.mo11765p();
                }
                eufVar2.f19985at.m10148g();
                if (eufVar2.f19975aj.mo16813g()) {
                    hms hmsVar = (hms) eufVar2.f19975aj.mo16809c();
                    eufVar2.f19915B.mo3698l();
                    eufVar2.f19976ak.m9469m();
                    hmsVar.m10470a();
                }
                break;
            case 10:
                Object obj9 = this.f3890b;
                if (this.f3889a) {
                    fdl fdlVar = ((eum) obj9).f20122a.f20152N;
                    fdlVar.m11105g(fdlVar.f21444c);
                }
                eum eumVar = (eum) obj9;
                eus eusVar = eumVar.f20122a;
                if (eusVar.f20146H) {
                    if (eusVar.f20197o.mo3831be() == gzp.OFF) {
                        eumVar.f20122a.f20201s.mo11238j();
                    } else {
                        eus eusVar2 = eumVar.f20122a;
                        eusVar2.f20201s.mo11227ai((gzp) eusVar2.f20197o.mo3831be());
                    }
                    eumVar.f20122a.m7910C(false);
                    eus eusVar3 = eumVar.f20122a;
                    if (eusVar3.f20141C.f13306h && eusVar3.f20143E.mo16813g()) {
                        ((clc) eumVar.f20122a.f20143E.mo16809c()).mo3883n();
                    }
                    if (eumVar.f20122a.f20144F.mo16813g()) {
                        ((hnn) eumVar.f20122a.f20144F.mo16809c()).mo10510s();
                        ((hnn) eumVar.f20122a.f20144F.mo16809c()).mo10504m(mqu.f41450a);
                    }
                    iuj iujVar = eumVar.f20122a.f20193k;
                    ((ite) iujVar).f32085ai = 0;
                    if (iujVar.mo11754e() == eus.f20138c.floatValue()) {
                        eumVar.f20122a.f20193k.mo11775z();
                    }
                    eumVar.f20122a.f20193k.mo11765p();
                    eumVar.f20122a.f20146H = false;
                }
                break;
            case 11:
                Object obj10 = this.f3890b;
                if (!this.f3889a) {
                    ((ewa) obj10).f20502E.m10883f();
                } else {
                    ewa ewaVar = (ewa) obj10;
                    ewaVar.f20545c.mo13961e("resume#startHotshot");
                    ewaVar.f20502E.m10882e();
                    ewaVar.f20545c.mo13962f();
                }
                break;
            case 12:
                ImageView imageView = (ImageView) ((PhotoSphereMessageOverlay) this.f3890b).findViewById(C0100R.id.rotate_device_icon);
                PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.f3890b;
                boolean z7 = photoSphereMessageOverlay.f6811b;
                boolean z8 = this.f3889a;
                if (z7 != z8) {
                    photoSphereMessageOverlay.f6811b = z8;
                    imageView.setImageResource(true != z8 ? C0100R.drawable.ic_pano_rotate_error_ccw : C0100R.drawable.ic_pano_rotate_error_cw);
                }
                PhotoSphereMessageOverlay photoSphereMessageOverlay2 = (PhotoSphereMessageOverlay) this.f3890b;
                if (!photoSphereMessageOverlay2.f6810a) {
                    photoSphereMessageOverlay2.f6810a = true;
                    imageView.setVisibility(0);
                    imageView.announceForAccessibility(((PhotoSphereMessageOverlay) this.f3890b).getResources().getString(true != this.f3889a ? C0100R.string.rotate_ccw_description : C0100R.string.rotate_cw_description));
                }
                break;
            case 13:
                Object obj11 = this.f3890b;
                if (this.f3889a) {
                    ((ges) obj11).f24432i.setVisibility(0);
                }
                break;
            case 14:
                Object obj12 = this.f3890b;
                if (!this.f3889a) {
                    ((ges) obj12).f24432i.setVisibility(8);
                }
                break;
            case 15:
                Object obj13 = this.f3890b;
                if (this.f3889a) {
                    FrameLayout frameLayout = ((hff) obj13).f27541g;
                    frameLayout.getClass();
                    frameLayout.announceForAccessibility(frameLayout.getResources().getText(C0100R.string.accessibility_close_social_share));
                }
                break;
            case 16:
                Object obj14 = this.f3890b;
                if (this.f3889a) {
                    hpu hpuVar = (hpu) obj14;
                    hpuVar.f29005k = hpuVar.f29009o.m13081P(new cdo(hpuVar, 16));
                } else {
                    hpu hpuVar2 = (hpu) obj14;
                    hpuVar2.f29005k = hpuVar2.f29009o.m13082Q(new cdo(hpuVar2, 17));
                }
                hpu hpuVar3 = (hpu) obj14;
                hpuVar3.f29005k.setOnDismissListener(new csq(hpuVar3, 2));
                if (!hpuVar3.f29005k.isShowing()) {
                    hpuVar3.f29005k.show();
                    TextView textView = (TextView) hpuVar3.f29005k.findViewById(R.id.message);
                    textView.getClass();
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                break;
            case 17:
                Object obj15 = this.f3890b;
                boolean z9 = this.f3889a;
                hqk hqkVar = (hqk) obj15;
                idb idbVar = hqkVar.f29059G;
                if (idbVar != null) {
                    hqkVar.f29089l.mo7485g(idbVar);
                }
                View view = hqkVar.f29066N;
                if (view != null) {
                    view.setVisibility(8);
                    hqkVar.f29066N.setAlpha(0.0f);
                }
                FrameLayout frameLayout2 = hqkVar.f29058F;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                    hqkVar.f29058F.setAlpha(0.0f);
                }
                View view2 = hqkVar.f29067O;
                if (view2 != null) {
                    view2.setVisibility(8);
                    hqkVar.f29067O.setAlpha(0.0f);
                }
                ObjectAnimator objectAnimator = hqkVar.f29060H;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                if (z9) {
                    hqkVar.f29053A.m11595e();
                    if (hqkVar.f29070R.indexOfChild(hqkVar.f29066N) != -1) {
                        hqkVar.f29070R.removeView(hqkVar.f29066N);
                    }
                    if (hqkVar.f29068P.indexOfChild(hqkVar.f29058F) != -1) {
                        hqkVar.f29068P.removeView(hqkVar.f29058F);
                    }
                    if (hqkVar.f29069Q.indexOfChild(hqkVar.f29067O) != -1) {
                        hqkVar.f29069Q.removeView(hqkVar.f29067O);
                    }
                }
                break;
            case 18:
                Object obj16 = this.f3890b;
                boolean z10 = this.f3889a;
                ige igeVar = (ige) obj16;
                if (igeVar.f30726a.isClickEnabled() != z10) {
                    igeVar.f30726a.setClickEnabled(z10);
                }
                break;
            case 19:
                ((irg) this.f3890b).f31886j.m11615d("/shutter_button_mode_changed", String.valueOf(this.f3889a).getBytes());
                break;
            default:
                Object obj17 = this.f3890b;
                boolean z11 = this.f3889a;
                try {
                    khf khfVar = ((khj) obj17).f36024b;
                    kgd kgdVarM14187a = kge.m14187a();
                    kgdVarM14187a.m14184c(true != z11 ? 1 : 4);
                    kgdVarM14187a.m14183b(1);
                    kgdVarM14187a.m14186e(4);
                    khfVar.m14260b(kgdVarM14187a.m14182a());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((khj) obj17).f36023a.mo13941c(HRLmc.GMP, e);
                    return;
                } catch (kec e2) {
                    ((khj) obj17).f36023a.mo13941c("FrameServer was closed when calling trigger3A.", e2);
                    return;
                }
                break;
        }
    }
}
