package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;
import java.security.SecureRandom;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hja implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27976a;

    /* JADX INFO: renamed from: b */
    private final oju f27977b;

    /* JADX INFO: renamed from: c */
    private final oju f27978c;

    /* JADX INFO: renamed from: d */
    private final oju f27979d;

    /* JADX INFO: renamed from: e */
    private final oju f27980e;

    /* JADX INFO: renamed from: f */
    private final oju f27981f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f27982g;

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i) {
        this.f27982g = i;
        this.f27976a = ojuVar;
        this.f27977b = ojuVar2;
        this.f27978c = ojuVar3;
        this.f27979d = ojuVar4;
        this.f27980e = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr) {
        this.f27982g = i;
        this.f27978c = ojuVar;
        this.f27976a = ojuVar2;
        this.f27981f = ojuVar3;
        this.f27979d = ojuVar4;
        this.f27977b = ojuVar5;
        this.f27980e = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr) {
        this.f27982g = i;
        this.f27977b = ojuVar;
        this.f27976a = ojuVar2;
        this.f27978c = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27981f = ojuVar5;
        this.f27979d = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[] fArr) {
        this.f27982g = i;
        this.f27978c = ojuVar;
        this.f27977b = ojuVar2;
        this.f27980e = ojuVar3;
        this.f27976a = ojuVar4;
        this.f27979d = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[] iArr) {
        this.f27982g = i;
        this.f27978c = ojuVar;
        this.f27979d = ojuVar2;
        this.f27976a = ojuVar3;
        this.f27977b = ojuVar4;
        this.f27980e = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[] sArr) {
        this.f27982g = i;
        this.f27977b = ojuVar;
        this.f27978c = ojuVar2;
        this.f27980e = ojuVar3;
        this.f27981f = ojuVar4;
        this.f27979d = ojuVar5;
        this.f27976a = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[] zArr) {
        this.f27982g = i;
        this.f27980e = ojuVar;
        this.f27977b = ojuVar2;
        this.f27976a = ojuVar3;
        this.f27981f = ojuVar4;
        this.f27979d = ojuVar5;
        this.f27978c = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][] bArr) {
        this.f27982g = i;
        this.f27978c = ojuVar;
        this.f27977b = ojuVar2;
        this.f27981f = ojuVar3;
        this.f27979d = ojuVar4;
        this.f27980e = ojuVar5;
        this.f27976a = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][] cArr) {
        this.f27982g = i;
        this.f27978c = ojuVar;
        this.f27980e = ojuVar2;
        this.f27976a = ojuVar3;
        this.f27977b = ojuVar4;
        this.f27981f = ojuVar5;
        this.f27979d = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][] fArr) {
        this.f27982g = i;
        this.f27976a = ojuVar;
        this.f27977b = ojuVar2;
        this.f27979d = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27978c = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][] iArr) {
        this.f27982g = i;
        this.f27977b = ojuVar;
        this.f27978c = ojuVar2;
        this.f27976a = ojuVar3;
        this.f27979d = ojuVar4;
        this.f27980e = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][] sArr) {
        this.f27982g = i;
        this.f27979d = ojuVar;
        this.f27981f = ojuVar2;
        this.f27978c = ojuVar3;
        this.f27976a = ojuVar4;
        this.f27977b = ojuVar5;
        this.f27980e = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][] zArr) {
        this.f27982g = i;
        this.f27977b = ojuVar;
        this.f27976a = ojuVar2;
        this.f27979d = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27978c = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][][] bArr) {
        this.f27982g = i;
        this.f27976a = ojuVar;
        this.f27977b = ojuVar2;
        this.f27979d = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27978c = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][][] cArr) {
        this.f27982g = i;
        this.f27976a = ojuVar;
        this.f27977b = ojuVar2;
        this.f27979d = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27978c = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][][] iArr) {
        this.f27982g = i;
        this.f27977b = ojuVar;
        this.f27976a = ojuVar2;
        this.f27980e = ojuVar3;
        this.f27981f = ojuVar4;
        this.f27979d = ojuVar5;
        this.f27978c = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][][] sArr) {
        this.f27982g = i;
        this.f27976a = ojuVar;
        this.f27977b = ojuVar2;
        this.f27979d = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27978c = ojuVar5;
        this.f27981f = ojuVar6;
    }

    public hja(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][][] zArr) {
        this.f27982g = i;
        this.f27981f = ojuVar;
        this.f27979d = ojuVar2;
        this.f27976a = ojuVar3;
        this.f27980e = ojuVar4;
        this.f27977b = ojuVar5;
        this.f27978c = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static hja m10364a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new hja(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 5, (boolean[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f27982g) {
            case 0:
                return new hiz((hst) this.f27976a.get(), ((dws) this.f27977b).m6830a(), (ihk) this.f27978c.get(), ((cjm) this.f27979d).m3825a(), (ScheduledExecutorService) this.f27980e.get(), (hai) this.f27981f.get(), null, null);
            case 1:
                Object obj = this.f27978c.get();
                return new hhv((hhx) obj, (hhx) this.f27976a.get(), (kbz) this.f27981f.get(), (jvd) this.f27979d.get(), ((erq) this.f27977b).get(), (hai) this.f27980e.get());
            case 2:
                oju ojuVar = this.f27977b;
                dja djaVarM6761a = dvb.m6761a();
                Context contextM6830a = ((dws) this.f27976a).m6830a();
                Executor executor = (Executor) this.f27978c.get();
                PackageInfo packageInfo = ((inb) this.f27980e).get();
                return new hkh(fcx.m8224a(), contextM6830a, new SecureRandom().nextLong(), TimeZone.getDefault().getID(), Build.DISPLAY, executor, djaVarM6761a, ActivityManager.isRunningInTestHarness(), ojuVar, ((doa) this.f27981f).get(), packageInfo.versionName, ((ino) this.f27979d).get().booleanValue(), null);
            case 3:
                return new hox((dbr) this.f27977b.get(), (jww) this.f27978c.get(), ((esv) this.f27980e).get(), (kbz) this.f27981f.get(), (cvt) this.f27979d.get(), (fna) this.f27976a.get());
            case 4:
                return new hro((jww) this.f27978c.get(), (jww) this.f27979d.get(), (jww) this.f27976a.get(), (elx) this.f27977b.get(), (gfa) this.f27980e.get(), (fcp) this.f27981f.get());
            case 5:
                return new hst((jvd) this.f27980e.get(), (Activity) this.f27977b.get(), (fba) this.f27976a.get(), (fcp) this.f27981f.get(), (dhv) this.f27979d.get(), (jwn) this.f27978c.get());
            case 6:
                Context contextM6830a2 = ((dws) this.f27978c).m6830a();
                BottomBarController bottomBarController = (BottomBarController) this.f27977b.get();
                djm djmVar = (djm) this.f27980e.get();
                fan fanVar = ((erq) this.f27976a).get();
                jvd jvdVar = (jvd) this.f27979d.get();
                hxp hxpVar = new hxp(contextM6830a2, bottomBarController, djmVar, (fcp) this.f27981f.get(), null, null, null);
                fdh.m8265e(jvdVar, fanVar, hxpVar);
                return hxpVar;
            case 7:
                idg idgVar = new idg(((dws) this.f27978c).m6830a(), ((efm) this.f27977b).m7271b(), (had) this.f27981f.get(), (elx) this.f27979d.get(), (Executor) this.f27980e.get(), ((err) this.f27976a).get());
                Context context = idgVar.f30436d;
                idgVar.f30440h = jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.af_ae_lock), context, false, -1, 2);
                jpd.m13426g(false, 3000, null, null, idgVar.f30436d.getResources().getString(C0100R.string.update_camera_to_use_lens), context, false, -1, 8);
                idgVar.f30441i = jpd.m13426g(false, 3000, null, null, idgVar.f30436d.getResources().getString(C0100R.string.thermal_flash_disabled_chip_text), context, false, -1, 12);
                idgVar.f30442j = jpd.m13426g(false, 4000, null, null, idgVar.f30436d.getResources().getString(C0100R.string.thermal_ev_controls_limited_chip_text), context, false, -1, 12);
                return idgVar;
            case 8:
                return new imc(((dws) this.f27978c).m6830a(), (jvd) this.f27980e.get(), ((erq) this.f27976a).get(), ((err) this.f27977b).get(), (elx) this.f27981f.get(), this.f27979d);
            case 9:
                return new kqj(this.f27979d, this.f27981f, this.f27978c, this.f27976a, this.f27977b, this.f27980e, (char[]) null);
            case 10:
                return new kag(((kaj) this.f27977b).get(), ((kmf) this.f27978c).get(), (kpa) this.f27976a.get(), (kpb) this.f27979d.get(), ((kbm) this.f27980e).get(), (kbz) this.f27981f.get(), null, null, null, null);
            case 11:
                return new kqj((kkz) this.f27976a.get(), (AmbientDelegate) this.f27979d.get(), (kqj) this.f27980e.get(), ((kbm) this.f27978c).get(), (kbz) this.f27981f.get(), null, null, null);
            case 12:
                return new kjc(((fne) this.f27976a).m8604a(), ((khc) this.f27977b).get(), (kkz) this.f27979d.get(), (kkk) this.f27980e.get(), ((kbm) this.f27978c).get(), (kbz) this.f27981f.get());
            case 13:
                return new kjg(((fne) this.f27976a).m8604a(), ((khc) this.f27977b).get(), (kkz) this.f27979d.get(), (kkk) this.f27980e.get(), ((kbm) this.f27978c).get(), (kbz) this.f27981f.get());
            case 14:
                return new kjh(((fne) this.f27976a).m8604a(), ((khc) this.f27977b).get(), (kkz) this.f27979d.get(), (kkk) this.f27980e.get(), ((kbm) this.f27978c).get(), (kbz) this.f27981f.get());
            case 15:
                return new kji(((fne) this.f27976a).m8604a(), ((khc) this.f27977b).get(), (kkz) this.f27979d.get(), (kkk) this.f27980e.get(), ((kbm) this.f27978c).get(), (kbz) this.f27981f.get());
            case 16:
                ljf ljfVar = ((ljg) this.f27977b).get();
                npv npvVar = (npv) this.f27976a.get();
                ohh.m18485a(this.f27980e);
                return new lnj(ljfVar, npvVar, ohh.m18485a(this.f27981f), this.f27979d, ((lnp) this.f27978c).get(), null);
            default:
                mrm mrmVar = (mrm) ((ohj) this.f27981f).f46012a;
                lme lmeVar = (lme) this.f27979d.get();
                lvg lvgVar = (lvg) this.f27976a.get();
                lzd lzdVar = (lzd) this.f27980e.get();
                lvh lvhVar = (lvh) this.f27977b.get();
                ((lww) this.f27978c).get();
                return new mbb(mrmVar, lmeVar, lvgVar, lzdVar, lvhVar, null, null, null);
        }
    }
}
