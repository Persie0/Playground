package p000;

import android.animation.AnimatorSet;
import android.widget.PopupWindow;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.p014ui.notificationchip.NotificationChipView;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.util.p015ui.GcaTextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30421a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f30422b;

    public /* synthetic */ idd(NotificationChipView notificationChipView, int i) {
        this.f30422b = i;
        this.f30421a = notificationChipView;
    }

    public /* synthetic */ idd(MainActivityLayout mainActivityLayout, int i) {
        this.f30422b = i;
        this.f30421a = mainActivityLayout;
    }

    public /* synthetic */ idd(GcaTextView gcaTextView, int i) {
        this.f30422b = i;
        this.f30421a = gcaTextView;
    }

    public /* synthetic */ idd(icr icrVar, int i) {
        this.f30422b = i;
        this.f30421a = icrVar;
    }

    public /* synthetic */ idd(idf idfVar, int i) {
        this.f30422b = i;
        this.f30421a = idfVar;
    }

    public /* synthetic */ idd(idu iduVar, int i) {
        this.f30422b = i;
        this.f30421a = iduVar;
    }

    public /* synthetic */ idd(ifa ifaVar, int i) {
        this.f30422b = i;
        this.f30421a = ifaVar;
    }

    public idd(ifa ifaVar, int i, byte[] bArr) {
        this.f30422b = i;
        this.f30421a = ifaVar;
    }

    public /* synthetic */ idd(ika ikaVar, int i) {
        this.f30422b = i;
        this.f30421a = ikaVar;
    }

    public /* synthetic */ idd(imf imfVar, int i) {
        this.f30422b = i;
        this.f30421a = imfVar;
    }

    public /* synthetic */ idd(ipb ipbVar, int i) {
        this.f30422b = i;
        this.f30421a = ipbVar;
    }

    public idd(List list, int i) {
        this.f30422b = i;
        this.f30421a = list;
    }

    public idd(jwl jwlVar, int i, byte[] bArr, byte[] bArr2) {
        this.f30422b = i;
        this.f30421a = jwlVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v55, types: [ioz, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = 8;
        switch (this.f30422b) {
            case 0:
                Object obj = ((NotificationChipView) this.f30421a).f7091h.f33816b;
                if (obj != null) {
                    ((AnimatorSet) obj).start();
                }
                break;
            case 1:
                ((icr) this.f30421a).f30389r.m13090Z("TRANSLATE_TOOLTIP");
                break;
            case 2:
                ((idf) this.f30421a).f30426b.mo3415bf(true);
                break;
            case 3:
                ((PopupWindow) this.f30421a).dismiss();
                break;
            case 4:
                Iterator it = this.f30421a.iterator();
                while (it.hasNext()) {
                    ((iem) it.next()).m11149a();
                }
                break;
            case 5:
                ((ifa) this.f30421a).mo11163f();
                break;
            case 6:
                ifa ifaVar = (ifa) this.f30421a;
                ifaVar.f30593a = 1;
                ifaVar.m11168k();
                break;
            case 7:
                Object obj2 = this.f30421a;
                ((MainActivityLayout) obj2).invalidate();
                ((ConstraintLayout) obj2).requestLayout();
                break;
            case 8:
                ((ika) this.f30421a).f31285h.mo9131r(gzl.OFF);
                break;
            case 9:
                ika ikaVar = (ika) this.f30421a;
                ikaVar.f31279b.m13541c(new idd(ikaVar, 11));
                break;
            case 10:
                ika ikaVar2 = (ika) this.f30421a;
                ikaVar2.f31279b.m13541c(new idd(ikaVar2, 12));
                break;
            case 11:
                ika ikaVar3 = (ika) this.f30421a;
                if (ikaVar3.f31281d.m8363g()) {
                    dhv dhvVar = ikaVar3.f31288k;
                    dhx dhxVar = dii.f11525a;
                    dhvVar.mo6176d();
                    if (jeu.m12986j(((Integer) ikaVar3.f31294q.mo10031c(gzy.f27040ax)).intValue()) == 1 || ((ikaVar3.f31286i.mo5895d() == kmq.f36557a && ((String) ((jwf) ikaVar3.f31290m).f34942d).equals(gcy.ON.f24251d)) || ((ikaVar3.f31286i.mo5895d() == kmq.BACK && ((String) ((jwf) ikaVar3.f31289l).f34942d).equals(gcy.ON.f24251d)) || ((Boolean) ikaVar3.f31291n.f13316b.mo3831be()).booleanValue() || ((Boolean) ikaVar3.f31292o.m10476a().mo3831be()).booleanValue()))) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                gzl gzlVar = (gzl) ikaVar3.f31284g.mo3831be();
                boolean z2 = ikaVar3.f31283f.mo3831be().booleanValue() && ikaVar3.f31288k.mo6184l(dhp.f11148e) && gzlVar != gzl.OFF;
                if (z) {
                    ikaVar3.f31285h.mo9133t();
                }
                if (z2) {
                    ikaVar3.f31285h.mo9131r(gzlVar);
                }
                break;
            case 12:
                ika ikaVar4 = (ika) this.f30421a;
                ikaVar4.f31285h.mo9119e().mo2282d(new idd(ikaVar4, i), not.INSTANCE);
                break;
            case 13:
                ((imf) this.f30421a).f31493b.mo11473f();
                break;
            case 14:
                imf imfVar = (imf) this.f30421a;
                imfVar.f31497f.mo10033e(gzy.f27023ag, Integer.valueOf(((Integer) imfVar.f31496e.mo10031c(gzy.f27023ag)).intValue() + 1));
                imfVar.f31498g.mo8167al(8, imfVar.f31503l, imfVar.f31500i, 0, 0);
                break;
            case 15:
                ((GcaTextView) this.f30421a).setSelected(true);
                break;
            case 16:
                jwl jwlVar = (jwl) this.f30421a;
                if (jwlVar.f34954a) {
                    lku.m15662p(jwlVar.f34955b);
                    lku.m15662p(((jwl) this.f30421a).f34956c);
                    jwl jwlVar2 = (jwl) this.f30421a;
                    jwlVar2.f34956c.mo11574b(((VideoView) jwlVar2.f34955b).getCurrentPosition());
                    ((VideoView) ((jwl) this.f30421a).f34955b).postDelayed(this, 10L);
                    break;
                }
                break;
            case 17:
                ((ipb) this.f30421a).f31683l.setVisibility(8);
                break;
            case 18:
                ((ipb) this.f30421a).f31678g.setVisibility(8);
                break;
            case 19:
                ((ipb) this.f30421a).f31679h.setVisibility(8);
                break;
            default:
                ((ipb) this.f30421a).f31683l.setVisibility(0);
                break;
        }
    }
}
