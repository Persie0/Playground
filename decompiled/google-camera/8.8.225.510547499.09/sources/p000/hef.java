package p000;

import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hef implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27445a;

    /* JADX INFO: renamed from: b */
    private final oju f27446b;

    /* JADX INFO: renamed from: c */
    private final oju f27447c;

    /* JADX INFO: renamed from: d */
    private final oju f27448d;

    /* JADX INFO: renamed from: e */
    private final oju f27449e;

    /* JADX INFO: renamed from: f */
    private final oju f27450f;

    /* JADX INFO: renamed from: g */
    private final oju f27451g;

    /* JADX INFO: renamed from: h */
    private final oju f27452h;

    /* JADX INFO: renamed from: i */
    private final oju f27453i;

    /* JADX INFO: renamed from: j */
    private final /* synthetic */ int f27454j;

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i) {
        this.f27454j = i;
        this.f27445a = ojuVar;
        this.f27446b = ojuVar2;
        this.f27447c = ojuVar3;
        this.f27448d = ojuVar4;
        this.f27449e = ojuVar5;
        this.f27450f = ojuVar6;
        this.f27451g = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27453i = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, byte[] bArr) {
        this.f27454j = i;
        this.f27448d = ojuVar;
        this.f27446b = ojuVar2;
        this.f27450f = ojuVar3;
        this.f27451g = ojuVar4;
        this.f27447c = ojuVar5;
        this.f27453i = ojuVar6;
        this.f27445a = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27449e = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, char[] cArr) {
        this.f27454j = i;
        this.f27446b = ojuVar;
        this.f27449e = ojuVar2;
        this.f27453i = ojuVar3;
        this.f27445a = ojuVar4;
        this.f27448d = ojuVar5;
        this.f27447c = ojuVar6;
        this.f27450f = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27451g = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, float[] fArr) {
        this.f27454j = i;
        this.f27448d = ojuVar;
        this.f27447c = ojuVar2;
        this.f27452h = ojuVar3;
        this.f27453i = ojuVar4;
        this.f27446b = ojuVar5;
        this.f27450f = ojuVar6;
        this.f27449e = ojuVar7;
        this.f27451g = ojuVar8;
        this.f27445a = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, int[] iArr) {
        this.f27454j = i;
        this.f27446b = ojuVar;
        this.f27447c = ojuVar2;
        this.f27450f = ojuVar3;
        this.f27445a = ojuVar4;
        this.f27453i = ojuVar5;
        this.f27451g = ojuVar6;
        this.f27449e = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27448d = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, short[] sArr) {
        this.f27454j = i;
        this.f27446b = ojuVar;
        this.f27447c = ojuVar2;
        this.f27450f = ojuVar3;
        this.f27445a = ojuVar4;
        this.f27453i = ojuVar5;
        this.f27451g = ojuVar6;
        this.f27449e = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27448d = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, boolean[] zArr) {
        this.f27454j = i;
        this.f27448d = ojuVar;
        this.f27447c = ojuVar2;
        this.f27446b = ojuVar3;
        this.f27445a = ojuVar4;
        this.f27452h = ojuVar5;
        this.f27451g = ojuVar6;
        this.f27453i = ojuVar7;
        this.f27450f = ojuVar8;
        this.f27449e = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, byte[][] bArr) {
        this.f27454j = i;
        this.f27448d = ojuVar;
        this.f27447c = ojuVar2;
        this.f27446b = ojuVar3;
        this.f27445a = ojuVar4;
        this.f27453i = ojuVar5;
        this.f27449e = ojuVar6;
        this.f27451g = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27450f = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, char[][] cArr) {
        this.f27454j = i;
        this.f27446b = ojuVar;
        this.f27451g = ojuVar2;
        this.f27447c = ojuVar3;
        this.f27450f = ojuVar4;
        this.f27448d = ojuVar5;
        this.f27445a = ojuVar6;
        this.f27449e = ojuVar7;
        this.f27453i = ojuVar8;
        this.f27452h = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, int[][] iArr) {
        this.f27454j = i;
        this.f27446b = ojuVar;
        this.f27448d = ojuVar2;
        this.f27449e = ojuVar3;
        this.f27450f = ojuVar4;
        this.f27445a = ojuVar5;
        this.f27451g = ojuVar6;
        this.f27447c = ojuVar7;
        this.f27452h = ojuVar8;
        this.f27453i = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, short[][] sArr) {
        this.f27454j = i;
        this.f27445a = ojuVar;
        this.f27447c = ojuVar2;
        this.f27453i = ojuVar3;
        this.f27451g = ojuVar4;
        this.f27452h = ojuVar5;
        this.f27446b = ojuVar6;
        this.f27449e = ojuVar7;
        this.f27448d = ojuVar8;
        this.f27450f = ojuVar9;
    }

    public hef(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, boolean[][] zArr) {
        this.f27454j = i;
        this.f27445a = ojuVar;
        this.f27450f = ojuVar2;
        this.f27451g = ojuVar3;
        this.f27452h = ojuVar4;
        this.f27446b = ojuVar5;
        this.f27453i = ojuVar6;
        this.f27447c = ojuVar7;
        this.f27448d = ojuVar8;
        this.f27449e = ojuVar9;
    }

    /* JADX INFO: renamed from: a */
    public static hef m10150a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new hef(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 1, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27454j) {
            case 0:
                hen henVar = ((hcn) this.f27445a).get();
                hdt hdtVar = (hdt) this.f27446b.get();
                ((dws) this.f27447c).m6830a();
                return new hee(henVar, hdtVar, ((iih) this.f27448d).get(), (dbr) this.f27449e.get(), (ggm) this.f27450f.get(), (iht) this.f27451g.get(), (kbz) this.f27452h.get(), (elx) this.f27453i.get(), (byte[]) null, (byte[]) null);
            case 1:
                return new gtk((gtc) this.f27448d.get(), (gtl) this.f27446b.get(), (dxx) this.f27450f.get(), (fgy) this.f27451g.get(), (jww) this.f27447c.get(), (dhv) this.f27453i.get(), this.f27445a, (hmw) this.f27452h.get(), (msa) this.f27449e.get(), null);
            case 2:
                return new hfx((hgy) this.f27446b.get(), ((dws) this.f27449e).m6830a(), (gvo) this.f27453i.get(), ((Boolean) this.f27445a.get()).booleanValue(), (chv) this.f27448d.get(), (dhv) this.f27447c.get(), (had) this.f27450f.get(), (hah) this.f27452h.get(), (hai) this.f27451g.get());
            case 3:
                hiz hizVar = (hiz) this.f27446b.get();
                boolean zBooleanValue = ((gck) this.f27447c).m9058b().booleanValue();
                hak hakVar = (hak) this.f27450f.get();
                Executor executorM3825a = ((cjm) this.f27445a).m3825a();
                return new hjd(hizVar, zBooleanValue, true, hakVar, gzo.m10018a(((Integer) gzy.f26995G.m10026c((dhv) this.f27448d.get())).intValue()), (hah) this.f27453i.get(), (har) this.f27451g.get(), (dal) this.f27449e.get(), executorM3825a, ((hip) this.f27452h).get(), null, null);
            case 4:
                hiz hizVar2 = (hiz) this.f27446b.get();
                boolean zBooleanValue2 = ((cde) this.f27447c).m3490a().booleanValue();
                hak hakVar2 = (hak) this.f27450f.get();
                Executor executorM3825a2 = ((cjm) this.f27445a).m3825a();
                return new hjd(hizVar2, zBooleanValue2, false, hakVar2, gzo.m10018a(((Integer) gzy.f26994F.m10026c((dhv) this.f27448d.get())).intValue()), (hah) this.f27453i.get(), (har) this.f27451g.get(), (dal) this.f27449e.get(), executorM3825a2, ((hip) this.f27452h).get(), null, null);
            case 5:
                iid iidVar = ((iig) this.f27448d).get();
                dhv dhvVar = (dhv) this.f27447c.get();
                mrm mrmVarM7866a = ((etl) this.f27446b).m7866a();
                ikt iktVar = (ikt) this.f27452h.get();
                iuj iujVar = ((ity) this.f27451g).get();
                Handler handler = (Handler) this.f27453i.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f27450f);
                jfs jfsVar = ((hsm) this.f27449e).get();
                ShutterButton shutterButton = iidVar.f31069f.getShutterButton();
                lku.m15662p(shutterButton);
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                return new ige(shutterButton, handler, mrmVarM7866a, iidVar.f31078o, iktVar, iujVar, ohbVarM18485a, jfsVar, null);
            case 6:
                return new hvb((clo) this.f27448d.get(), (BottomBarController) this.f27447c.get(), (igb) this.f27452h.get(), (hxp) this.f27453i.get(), (icf) this.f27446b.get(), (gfa) this.f27450f.get(), (bkn) this.f27449e.get(), ((ity) this.f27451g).get(), (hsk) this.f27445a.get(), null, null, null);
            case 7:
                return new kdw(((kdb) this.f27448d).get(), (AmbientDelegate) this.f27447c.get(), (kdp) this.f27446b.get(), (Executor) this.f27445a.get(), (kea) this.f27453i.get(), (kcj) this.f27449e.get(), (kbz) this.f27451g.get(), ((kbm) this.f27452h).get(), ((dcu) this.f27450f).get(), null, null, null, null);
            case 8:
                kbo kboVar = ((kbm) this.f27446b).get();
                kbz kbzVar = (kbz) this.f27451g.get();
                kfn kfnVar = ((khc) this.f27447c).get();
                jvb jvbVar = (jvb) this.f27450f.get();
                kdx kdxVar = (kdx) this.f27448d.get();
                oju ojuVar = this.f27445a;
                ((emn) this.f27449e).get();
                kbzVar.mo13961e("FrameServer");
                kbo kboVarMo6314a = kboVar.mo6314a("FrameServer");
                kbzVar.mo13961e("create");
                khj khjVarM14266a = ((khk) ojuVar).get();
                kboVarMo6314a.getClass();
                khjVarM14266a.mo13885a(new kgz(kboVarMo6314a, 0));
                jvbVar.m13537d(kdxVar.m14009a(kfnVar.f35845i));
                kbzVar.mo13963g("resume");
                khjVarM14266a.mo14120g();
                kbzVar.mo13962f();
                kbzVar.mo13962f();
                return khjVarM14266a;
            case 9:
                return new mca(((knd) this.f27445a).get(), (jvh) this.f27447c.get(), ((kbm) this.f27453i).get(), (kbz) this.f27451g.get(), (lbn) this.f27452h.get(), ((kjb) this.f27446b).get(), (kpa) this.f27449e.get(), ((fne) this.f27448d).m8604a(), (AmbientDelegate) this.f27450f.get(), null, null, null, null, null);
            case 10:
                return new lil(((ljg) this.f27446b).get(), ((dws) this.f27448d).m6830a(), (lhz) this.f27449e.get(), (npv) this.f27450f.get(), ohh.m18485a(this.f27445a), ((liw) this.f27451g).get(), ((lif) this.f27447c).get(), this.f27452h, (Executor) this.f27453i.get());
            default:
                return new mdi((mav) this.f27445a.get(), ((mbc) this.f27450f).get(), (lzv) this.f27451g.get(), ((mdy) this.f27452h).get(), (lwz) this.f27446b.get(), (drj) this.f27453i.get(), (mao) this.f27447c.get(), (ksi) this.f27448d.get(), (AmbientMode.AmbientController) this.f27449e.get(), null, null, null, null);
        }
    }
}
