package p000;

import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedSwitchPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ggf implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24651b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24652c;

    public /* synthetic */ ggf(FrameLayout frameLayout, ImageView imageView, int i) {
        this.f24652c = i;
        this.f24651b = frameLayout;
        this.f24650a = imageView;
    }

    public ggf(ModeSwitcher modeSwitcher, ikw ikwVar, int i) {
        this.f24652c = i;
        this.f24651b = modeSwitcher;
        this.f24650a = ikwVar;
    }

    public /* synthetic */ ggf(MoreModesGrid moreModesGrid, ikw ikwVar, int i) {
        this.f24652c = i;
        this.f24651b = moreModesGrid;
        this.f24650a = ikwVar;
    }

    public /* synthetic */ ggf(ggg gggVar, gff gffVar, int i) {
        this.f24652c = i;
        this.f24650a = gggVar;
        this.f24651b = gffVar;
    }

    public /* synthetic */ ggf(ggg gggVar, gfm gfmVar, int i) {
        this.f24652c = i;
        this.f24650a = gggVar;
        this.f24651b = gfmVar;
    }

    public /* synthetic */ ggf(heo heoVar, Runnable runnable, int i) {
        this.f24652c = i;
        this.f24651b = heoVar;
        this.f24650a = runnable;
    }

    public /* synthetic */ ggf(hhe hheVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f24652c = i;
        this.f24650a = hheVar;
        this.f24651b = ambientController;
    }

    public /* synthetic */ ggf(hng hngVar, ikw ikwVar, int i) {
        this.f24652c = i;
        this.f24651b = hngVar;
        this.f24650a = ikwVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hnp hnpVar;
        int i = 3;
        switch (this.f24652c) {
            case 0:
                Object obj = this.f24650a;
                Object obj2 = this.f24651b;
                ggg gggVar = (ggg) obj;
                gfd gfdVar = gggVar.f24658f;
                if (gfdVar != null) {
                    gev gevVar = gggVar.f24655c.f24580a;
                    gfc gfcVar = ((gfm) obj2).f24584a;
                    if (gfdVar.mo5833u(gevVar, gfcVar, gggVar.f24659g == gfcVar)) {
                    }
                }
                gfe gfeVar = gggVar.f24657e;
                if (gfeVar != null) {
                    gfeVar.mo9116bM(((gfm) obj2).f24584a, gggVar.f24655c.f24580a, 1);
                }
                break;
            case 1:
                Object obj3 = this.f24650a;
                ?? r0 = this.f24651b;
                if (r0 != 0) {
                    ggg gggVar2 = (ggg) obj3;
                    r0.mo6580a(gggVar2.f24659g, gggVar2.isEnabled());
                }
                break;
            case 2:
                Object obj4 = this.f24650a;
                Object obj5 = this.f24651b;
                ggg gggVar3 = (ggg) obj4;
                gfd gfdVar2 = gggVar3.f24658f;
                if (gfdVar2 != null) {
                    gev gevVar2 = gggVar3.f24655c.f24580a;
                    gfc gfcVar2 = ((gfm) obj5).f24584a;
                    if (gfdVar2.mo5833u(gevVar2, gfcVar2, gggVar3.f24659g == gfcVar2)) {
                    }
                }
                gfe gfeVar2 = gggVar3.f24657e;
                if (gfeVar2 != null) {
                    gfeVar2.mo9116bM(((gfm) obj5).f24584a, gggVar3.f24655c.f24580a, 1);
                }
                break;
            case 3:
                Object obj6 = this.f24651b;
                ?? r1 = this.f24650a;
                hdl hdlVar = (hdl) obj6;
                hdlVar.f27354d.mo8160ae(3, hdlVar.f27351a.f27483a);
                r1.run();
                break;
            case 4:
                Object obj7 = this.f24650a;
                Object obj8 = this.f24651b;
                hhe hheVar = (hhe) obj7;
                if (!hheVar.f27799e) {
                    ResolveInfo resolveInfo = hheVar.f27797c;
                    AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) obj8;
                    ((hfu) ambientController.f1702a).f27598n.mo10033e(gzy.f27009U, true);
                    ((hgk) ((hfu) ambientController.f1702a).f27587c.get()).mo10203l(resolveInfo);
                } else {
                    ((AmbientModeSupport.AmbientController) obj8).m1660j();
                }
                break;
            case 5:
                Object obj9 = this.f24651b;
                Object obj10 = this.f24650a;
                hng hngVar = (hng) obj9;
                if (!((Boolean) ((jwf) hngVar.f28447n.f6694d).f34942d).booleanValue()) {
                    if (!hngVar.f28443j.mo6184l(dib.f11354ch) || !((hnp) hngVar.f28434a.mo3831be()).equals(hnp.ON)) {
                        hngVar.f28443j.mo6177e();
                        if (((hno) hngVar.f28435b.mo3831be()).equals(hno.TRANSITION_TO_ACTIVE)) {
                            hnpVar = hngVar.f28443j.mo6184l(dib.f11354ch) ? hnp.AUTO : hnp.ON;
                        } else if (((hnp) hngVar.f28434a.mo3831be()).equals(hnp.OFF)) {
                            hnpVar = hngVar.f28443j.mo6184l(dib.f11354ch) ? hnp.AUTO : hnp.ON;
                        } else {
                            hnpVar = hnp.OFF;
                        }
                        hngVar.f28459z = hnpVar;
                        hngVar.f28434a.mo3415bf(hnpVar);
                        hngVar.m10507p(hnpVar);
                        if (hngVar.f28443j.mo6184l(dib.f11353cg)) {
                            hngVar.f28445l.mo10033e(gzy.f27028al, Integer.valueOf(hnpVar.f28521d));
                            if (!hnpVar.equals(hnp.ON)) {
                                hngVar.f28445l.mo10033e(gzy.f27055n, Boolean.valueOf(hnp.m10515b(hnpVar)));
                            }
                        }
                        mwn mwnVar = hngVar.f28420B;
                        switch (hnpVar.ordinal()) {
                            case 0:
                                break;
                            case 1:
                                i = 4;
                                break;
                            case 2:
                                i = 2;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        nxl nxlVarM18137O = nly.f43704e.m18137O();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nly nlyVar = (nly) nxlVarM18137O.f44974b;
                        nlyVar.f43707b = i - 1;
                        nlyVar.f43706a |= 1;
                        int iM11411e = iku.m11411e((ikw) obj10);
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar = nxlVarM18137O.f44974b;
                        nly nlyVar2 = (nly) nxqVar;
                        nlyVar2.f43708c = iM11411e - 1;
                        nlyVar2.f43706a |= 2;
                        if (!nxqVar.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nly nlyVar3 = (nly) nxlVarM18137O.f44974b;
                        nlyVar3.f43709d = 1;
                        nlyVar3.f43706a |= 4;
                        mwnVar.m17082g((nly) nxlVarM18137O.mo18103l());
                        hngVar.m10511t();
                    }
                    break;
                }
                break;
            case 6:
                if (!((ModeSwitcher) this.f24651b).f7065f) {
                    ((nbe) ((nbe) ModeSwitcher.f7060a.m17252c()).mo17276G((char) 4134)).mo17290o("Ignore mode chip click, mode switcher is disabled.");
                } else {
                    npk.m17604h(view);
                    ModeSwitcher modeSwitcher = (ModeSwitcher) this.f24651b;
                    fcp fcpVar = modeSwitcher.f7067h;
                    if (fcpVar != null) {
                        fcpVar.mo8158ac(3, modeSwitcher.f7070k.toString(), ((ikw) this.f24650a).toString());
                    }
                    ((ModeSwitcher) this.f24651b).m4394h((ikw) this.f24650a);
                }
                break;
            case 7:
                Object obj11 = this.f24651b;
                Object obj12 = this.f24650a;
                MoreModesGrid moreModesGrid = (MoreModesGrid) obj11;
                if (moreModesGrid.isEnabled() && !moreModesGrid.f7079f.isRunning() && view.getVisibility() == 0 && ((MoreModesGrid) view.getParent()).getVisibility() == 0) {
                    fcp fcpVar2 = moreModesGrid.f7077d;
                    if (fcpVar2 != null) {
                        fcpVar2.mo8158ac(3, ikw.MORE_MODES.toString(), ((ikw) obj12).toString());
                    }
                    npk.m17604h(view);
                    if (moreModesGrid.f7083j.mo16813g()) {
                        ((icy) moreModesGrid.f7083j.mo16809c()).mo11008g((ikw) obj12);
                    }
                    break;
                }
                break;
            case 8:
                Object obj13 = this.f24651b;
                Object obj14 = this.f24650a;
                FrameLayout frameLayout = (FrameLayout) obj13;
                frameLayout.setVisibility(frameLayout.getVisibility() != 0 ? 0 : 8);
                ((ImageView) obj14).setImageResource(ManagedSwitchPreference.m4414c(frameLayout));
                break;
            default:
                Object obj15 = this.f24651b;
                Object obj16 = this.f24650a;
                FrameLayout frameLayout2 = (FrameLayout) obj15;
                frameLayout2.setVisibility(frameLayout2.getVisibility() != 0 ? 0 : 8);
                ((ImageView) obj16).setImageResource(MaterialManagedSwitchPreference.m4422aj(frameLayout2));
                break;
        }
    }
}
