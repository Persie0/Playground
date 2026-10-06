package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.hotshot.HotshotView;
import com.pairip.VMRunner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hys {

    /* JADX INFO: renamed from: a */
    public static final nbh f29951a = nbh.m17259h("com/google/android/apps/camera/ui/hotshot/HotshotController");

    /* JADX INFO: renamed from: A */
    private final ScheduledExecutorService f29952A;

    /* JADX INFO: renamed from: B */
    private final jwn f29953B;

    /* JADX INFO: renamed from: C */
    private ScheduledFuture f29954C;

    /* JADX INFO: renamed from: b */
    public final AccessibilityManager f29955b;

    /* JADX INFO: renamed from: c */
    public final hht f29956c;

    /* JADX INFO: renamed from: d */
    public final Context f29957d;

    /* JADX INFO: renamed from: e */
    public final dpx f29958e;

    /* JADX INFO: renamed from: f */
    public final hyz f29959f;

    /* JADX INFO: renamed from: h */
    public final jvd f29961h;

    /* JADX INFO: renamed from: i */
    public final gfa f29962i;

    /* JADX INFO: renamed from: j */
    public final jww f29963j;

    /* JADX INFO: renamed from: k */
    public final jwn f29964k;

    /* JADX INFO: renamed from: v */
    public final hyq f29975v;

    /* JADX INFO: renamed from: w */
    private final dbr f29976w;

    /* JADX INFO: renamed from: x */
    private final dhv f29977x;

    /* JADX INFO: renamed from: y */
    private final jwn f29978y;

    /* JADX INFO: renamed from: z */
    private final hah f29979z;

    /* JADX INFO: renamed from: g */
    public final List f29960g = new ArrayList();

    /* JADX INFO: renamed from: l */
    public int f29965l = 10;

    /* JADX INFO: renamed from: m */
    public boolean f29966m = false;

    /* JADX INFO: renamed from: n */
    public boolean f29967n = false;

    /* JADX INFO: renamed from: o */
    public boolean f29968o = false;

    /* JADX INFO: renamed from: p */
    public hyv f29969p = hyv.IDLE;

    /* JADX INFO: renamed from: q */
    public hyv f29970q = hyv.IDLE;

    /* JADX INFO: renamed from: r */
    public long f29971r = 0;

    /* JADX INFO: renamed from: s */
    public int f29972s = 0;

    /* JADX INFO: renamed from: t */
    public long f29973t = 0;

    /* JADX INFO: renamed from: u */
    public long f29974u = Long.MAX_VALUE;

    public hys(Context context, jwn jwnVar, hyz hyzVar, hht hhtVar, AccessibilityManager accessibilityManager, dhv dhvVar, hah hahVar, dpx dpxVar, jww jwwVar, dbr dbrVar, hyq hyqVar, gfa gfaVar, igb igbVar, ScheduledExecutorService scheduledExecutorService, jwn jwnVar2, jwn jwnVar3, jvd jvdVar) {
        this.f29957d = context;
        this.f29978y = jwnVar;
        this.f29959f = hyzVar;
        this.f29956c = hhtVar;
        this.f29955b = accessibilityManager;
        this.f29977x = dhvVar;
        this.f29979z = hahVar;
        this.f29958e = dpxVar;
        this.f29961h = jvdVar;
        hyzVar.f30002d = jwwVar;
        mrm mrmVar = hyzVar.f30000b;
        if (mrmVar.mo16813g()) {
            ((HotshotView) mrmVar.mo16809c()).f7033g = jwwVar;
        }
        mrm mrmVar2 = hyzVar.f30000b;
        if (mrmVar2.mo16813g()) {
            HotshotView hotshotView = (HotshotView) mrmVar2.mo16809c();
            if (!hotshotView.f7031e) {
                hotshotView.f7031e = true;
            }
        }
        dpxVar.f12264q = jwwVar;
        this.f29976w = dbrVar;
        this.f29962i = gfaVar;
        this.f29975v = hyqVar;
        this.f29963j = jwwVar;
        this.f29952A = scheduledExecutorService;
        this.f29964k = jwnVar2;
        this.f29953B = jwnVar3;
        hyqVar.f29946a.m10706e(new hyr(hyqVar, igbVar));
    }

    /* JADX INFO: renamed from: a */
    public final njm m10878a() {
        nxl nxlVarM18137O = njm.f43031f.m18137O();
        boolean zM10885h = m10885h();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njm njmVar = (njm) nxlVarM18137O.f44974b;
        int i = 1;
        njmVar.f43033a |= 1;
        njmVar.f43034b = zM10885h;
        boolean zBooleanValue = ((Boolean) this.f29979z.mo10031c(gzy.f27054m)).booleanValue();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njm njmVar2 = (njm) nxlVarM18137O.f44974b;
        njmVar2.f43033a |= 2;
        njmVar2.f43035c = zBooleanValue;
        hyv hyvVar = this.f29969p;
        hyv hyvVar2 = hyv.READY_TO_CAPTURE;
        switch (hyvVar) {
            case READY_TO_CAPTURE:
                i = 2;
                break;
            case DISTANCE_1:
                i = 3;
                break;
            case DISTANCE_2:
                i = 4;
                break;
            case DISTANCE_3:
                i = 5;
                break;
            case DISTANCE_OUTERMOST:
                i = 6;
                break;
            case FACE_TOO_FAR:
                i = 7;
                break;
            case FACE_TOO_CLOSE:
                i = 8;
                break;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        njm njmVar3 = (njm) nxqVar;
        njmVar3.f43036d = i - 1;
        njmVar3.f43033a = 4 | njmVar3.f43033a;
        boolean z = this.f29967n;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        njm njmVar4 = (njm) nxlVarM18137O.f44974b;
        njmVar4.f43033a = 8 | njmVar4.f43033a;
        njmVar4.f43037e = z;
        return (njm) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: b */
    public final void m10879b() {
        mrm mrmVar = this.f29959f.f30000b;
        if (mrmVar.mo16813g()) {
            ((HotshotView) mrmVar.mo16809c()).announceForAccessibility(this.f29957d.getString(C0100R.string.hotshot_cancel_countdown));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10880c(hyw hywVar) {
        if (this.f29960g.contains(hywVar)) {
            return;
        }
        this.f29960g.add(hywVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m10881d(kbc kbcVar) {
        mrm mrmVar = this.f29959f.f30000b;
        if (!mrmVar.mo16813g()) {
            ((nbe) ((nbe) hyz.f29999a.m17251b()).mo17276G((char) 4040)).mo17290o("setPreviewSize, view is not present.");
            return;
        }
        if (kbcVar == null) {
            ((nbe) ((nbe) hyz.f29999a.m17251b()).mo17276G((char) 4039)).mo17290o("previewSize is null");
            return;
        }
        kcg kcgVar = ((HotshotView) mrmVar.mo16809c()).f12088b;
        if (!kbcVar.equals(kcgVar.f35564e) || kcgVar.f35562c == null) {
            kcgVar.f35564e = kbcVar;
            kcgVar.m13969d();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m10882e() {
        VMRunner.invoke("OF6N1GsRUnWr69EM", new Object[]{this});
    }

    /* JADX INFO: renamed from: f */
    public final void m10883f() {
        if (this.f29966m) {
            this.f29966m = false;
            hyz hyzVar = this.f29959f;
            hyzVar.f30001c = false;
            hyzVar.m10888a(false);
            hyzVar.f30002d.mo3415bf(new hyx[0]);
            this.f29958e.f12259l = false;
            this.f29969p = hyv.IDLE;
            this.f29974u = Long.MAX_VALUE;
            if (this.f29968o) {
                this.f29958e.m6561c();
                this.f29968o = false;
            }
            ScheduledFuture scheduledFuture = this.f29954C;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10884g(hyw hywVar) {
        this.f29960g.remove(hywVar);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10885h() {
        ikw ikwVar = (ikw) this.f29978y.mo3831be();
        if (!this.f29955b.isTouchExplorationEnabled()) {
            dhv dhvVar = this.f29977x;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6175c();
            return false;
        }
        if (!((Boolean) this.f29979z.mo10031c(gzy.f27054m)).booleanValue()) {
            return false;
        }
        dhv dhvVar2 = this.f29977x;
        dhx dhxVar2 = dib.f11240a;
        dhvVar2.mo6175c();
        if (this.f29976w.m5901j() || ((Boolean) this.f29953B.mo3831be()).booleanValue()) {
            return ikwVar == ikw.PHOTO || ikwVar == ikw.PORTRAIT;
        }
        return false;
    }
}
