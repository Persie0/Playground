package p000;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5744a;

    /* JADX INFO: renamed from: b */
    private final oju f5745b;

    /* JADX INFO: renamed from: c */
    private final oju f5746c;

    /* JADX INFO: renamed from: d */
    private final oju f5747d;

    /* JADX INFO: renamed from: e */
    private final oju f5748e;

    /* JADX INFO: renamed from: f */
    private final oju f5749f;

    /* JADX INFO: renamed from: g */
    private final oju f5750g;

    /* JADX INFO: renamed from: h */
    private final oju f5751h;

    /* JADX INFO: renamed from: i */
    private final oju f5752i;

    /* JADX INFO: renamed from: j */
    private final /* synthetic */ int f5753j;

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i) {
        this.f5753j = i;
        this.f5744a = ojuVar;
        this.f5745b = ojuVar2;
        this.f5746c = ojuVar3;
        this.f5747d = ojuVar4;
        this.f5748e = ojuVar5;
        this.f5749f = ojuVar6;
        this.f5750g = ojuVar7;
        this.f5751h = ojuVar8;
        this.f5752i = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, byte[] bArr) {
        this.f5753j = i;
        this.f5752i = ojuVar;
        this.f5748e = ojuVar2;
        this.f5751h = ojuVar3;
        this.f5750g = ojuVar4;
        this.f5747d = ojuVar5;
        this.f5744a = ojuVar6;
        this.f5745b = ojuVar7;
        this.f5749f = ojuVar8;
        this.f5746c = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, char[] cArr) {
        this.f5753j = i;
        this.f5752i = ojuVar;
        this.f5745b = ojuVar2;
        this.f5746c = ojuVar3;
        this.f5744a = ojuVar4;
        this.f5749f = ojuVar5;
        this.f5747d = ojuVar6;
        this.f5751h = ojuVar7;
        this.f5748e = ojuVar8;
        this.f5750g = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, float[] fArr) {
        this.f5753j = i;
        this.f5746c = ojuVar;
        this.f5750g = ojuVar2;
        this.f5744a = ojuVar3;
        this.f5747d = ojuVar4;
        this.f5751h = ojuVar5;
        this.f5752i = ojuVar6;
        this.f5749f = ojuVar7;
        this.f5748e = ojuVar8;
        this.f5745b = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, int[] iArr) {
        this.f5753j = i;
        this.f5745b = ojuVar;
        this.f5749f = ojuVar2;
        this.f5747d = ojuVar3;
        this.f5746c = ojuVar4;
        this.f5744a = ojuVar5;
        this.f5751h = ojuVar6;
        this.f5752i = ojuVar7;
        this.f5748e = ojuVar8;
        this.f5750g = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, short[] sArr) {
        this.f5753j = i;
        this.f5752i = ojuVar;
        this.f5748e = ojuVar2;
        this.f5745b = ojuVar3;
        this.f5746c = ojuVar4;
        this.f5749f = ojuVar5;
        this.f5747d = ojuVar6;
        this.f5751h = ojuVar7;
        this.f5744a = ojuVar8;
        this.f5750g = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, boolean[] zArr) {
        this.f5753j = i;
        this.f5749f = ojuVar;
        this.f5747d = ojuVar2;
        this.f5751h = ojuVar3;
        this.f5744a = ojuVar4;
        this.f5745b = ojuVar5;
        this.f5752i = ojuVar6;
        this.f5748e = ojuVar7;
        this.f5746c = ojuVar8;
        this.f5750g = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, byte[][] bArr) {
        this.f5753j = i;
        this.f5748e = ojuVar;
        this.f5752i = ojuVar2;
        this.f5749f = ojuVar3;
        this.f5751h = ojuVar4;
        this.f5750g = ojuVar5;
        this.f5746c = ojuVar6;
        this.f5745b = ojuVar7;
        this.f5744a = ojuVar8;
        this.f5747d = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, char[][] cArr) {
        this.f5753j = i;
        this.f5751h = ojuVar;
        this.f5748e = ojuVar2;
        this.f5750g = ojuVar3;
        this.f5749f = ojuVar4;
        this.f5752i = ojuVar5;
        this.f5746c = ojuVar6;
        this.f5745b = ojuVar7;
        this.f5747d = ojuVar8;
        this.f5744a = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, float[][] fArr) {
        this.f5753j = i;
        this.f5749f = ojuVar;
        this.f5750g = ojuVar2;
        this.f5746c = ojuVar3;
        this.f5752i = ojuVar4;
        this.f5747d = ojuVar5;
        this.f5748e = ojuVar6;
        this.f5744a = ojuVar7;
        this.f5751h = ojuVar8;
        this.f5745b = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, int[][] iArr) {
        this.f5753j = i;
        this.f5748e = ojuVar;
        this.f5752i = ojuVar2;
        this.f5750g = ojuVar3;
        this.f5747d = ojuVar4;
        this.f5746c = ojuVar5;
        this.f5744a = ojuVar6;
        this.f5749f = ojuVar7;
        this.f5745b = ojuVar8;
        this.f5751h = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, short[][] sArr) {
        this.f5753j = i;
        this.f5751h = ojuVar;
        this.f5748e = ojuVar2;
        this.f5750g = ojuVar3;
        this.f5749f = ojuVar4;
        this.f5752i = ojuVar5;
        this.f5746c = ojuVar6;
        this.f5745b = ojuVar7;
        this.f5747d = ojuVar8;
        this.f5744a = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, boolean[][] zArr) {
        this.f5753j = i;
        this.f5745b = ojuVar;
        this.f5752i = ojuVar2;
        this.f5748e = ojuVar3;
        this.f5750g = ojuVar4;
        this.f5746c = ojuVar5;
        this.f5744a = ojuVar6;
        this.f5747d = ojuVar7;
        this.f5751h = ojuVar8;
        this.f5749f = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, byte[][][] bArr) {
        this.f5753j = i;
        this.f5749f = ojuVar;
        this.f5751h = ojuVar2;
        this.f5750g = ojuVar3;
        this.f5744a = ojuVar4;
        this.f5752i = ojuVar5;
        this.f5748e = ojuVar6;
        this.f5745b = ojuVar7;
        this.f5747d = ojuVar8;
        this.f5746c = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, char[][][] cArr) {
        this.f5753j = i;
        this.f5746c = ojuVar;
        this.f5744a = ojuVar2;
        this.f5750g = ojuVar3;
        this.f5751h = ojuVar4;
        this.f5747d = ojuVar5;
        this.f5748e = ojuVar6;
        this.f5749f = ojuVar7;
        this.f5745b = ojuVar8;
        this.f5752i = ojuVar9;
    }

    public chh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, int i, short[][][] sArr) {
        this.f5753j = i;
        this.f5746c = ojuVar;
        this.f5748e = ojuVar2;
        this.f5745b = ojuVar3;
        this.f5744a = ojuVar4;
        this.f5749f = ojuVar5;
        this.f5750g = ojuVar6;
        this.f5752i = ojuVar7;
        this.f5747d = ojuVar8;
        this.f5751h = ojuVar9;
    }

    /* JADX INFO: renamed from: a */
    public static chh m3682a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static chh m3683b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static chh m3684c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static chh m3685d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static chh m3686e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 9, (short[][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static chh m3687f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static chh m3688g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static chh m3689h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: i */
    public static chh m3690i(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: j */
    public static chh m3691j(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9) {
        return new chh(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, 15, (short[][][]) null);
    }

    /* JADX WARN: Type inference failed for: r1v153, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        String str;
        fsd fsjVar;
        mrm mrmVar;
        switch (this.f5753j) {
            case 0:
                Handler handlerM9735q = gtd.m9735q();
                chf chfVar = (chf) this.f5744a.get();
                kcu kcuVar = (kcu) this.f5745b.get();
                kme kmeVar = ((kak) this.f5746c).get();
                AmbientDelegate ambientDelegate = (AmbientDelegate) this.f5747d.get();
                cwd cwdVar = (cwd) this.f5748e.get();
                Executor executor = (Executor) this.f5749f.get();
                Semaphore semaphore = (Semaphore) this.f5750g.get();
                nqf nqfVar = (nqf) this.f5751h.get();
                cdu cduVar = ((err) this.f5752i).get();
                chg chgVar = new chg(handlerM9735q, chfVar, kcuVar, kmeVar, ambientDelegate, cwdVar.m5648F(), executor, semaphore, null, null, null);
                cduVar.m3529i().m13537d(chfVar);
                nqfVar.mo14894e(chgVar);
                return chgVar;
            case 1:
                return new cgm(((dws) this.f5752i).m6830a(), (jwn) this.f5748e.get(), this.f5751h, (cgk) this.f5750g.get(), (ggm) this.f5747d.get(), (jwn) this.f5744a.get(), (djm) this.f5745b.get(), (jwn) this.f5749f.get(), (dhv) this.f5746c.get(), null, null, null);
            case 2:
                return new crl(((err) this.f5752i).get(), (dhv) this.f5745b.get(), (crh) this.f5746c.get(), ((crz) this.f5744a).get(), ((hfb) this.f5749f).m10179a(), ((hfb) this.f5747d).m10179a(), ((hfb) this.f5751h).m10179a(), ((crv) this.f5748e).m5442a(), new hjj(), ((cze) this.f5750g).get(), null);
            case 3:
                return new dah(((err) this.f5752i).get(), (BottomBarController) this.f5748e.get(), (elx) this.f5745b.get(), (eoq) this.f5746c.get(), (jvd) this.f5749f.get(), (icf) this.f5747d.get(), (igb) this.f5751h.get(), (jfs) this.f5744a.get(), ((emc) this.f5750g).get(), null, null, null);
            case 4:
                gva gvaVar = (gva) this.f5745b.get();
                nta ntaVar = ((ntb) this.f5749f).get();
                mrm mrmVarM5442a = ((crv) this.f5747d).m5442a();
                return new epf(gvaVar, ntaVar, mrmVarM5442a, (jvb) this.f5744a.get(), ((eql) this.f5751h).get(), ((epi) this.f5752i).get(), (dhv) this.f5748e.get(), (kbz) this.f5750g.get(), null, null, null, null);
            case 5:
                return new mca(this.f5749f, ohl.m18489b(this.f5747d), ohl.m18489b(this.f5751h), ohl.m18489b(this.f5744a), ohl.m18489b(this.f5745b), this.f5752i, this.f5748e, this.f5746c, this.f5750g, null);
            case 6:
                bko bkoVar = (bko) this.f5746c.get();
                fgy fgyVar = (fgy) this.f5750g.get();
                fiq fiqVar = (fiq) this.f5744a.get();
                fid fidVar = (fid) this.f5747d.get();
                fie fieVar = (fie) this.f5751h.get();
                mrm mrmVar2 = (mrm) this.f5752i.get();
                return new fiv(bkoVar, fgyVar, fiqVar, fidVar, fieVar, mrmVar2, ((fjc) this.f5748e).get(), (dhv) this.f5745b.get(), null, null, null);
            case 7:
                Context contextM6830a = ((dws) this.f5748e).m6830a();
                kmd kmdVar = ((fxk) this.f5752i).get();
                dhv dhvVar = (dhv) this.f5749f.get();
                Executor executor2 = (Executor) this.f5751h.get();
                kbz kbzVar = (kbz) this.f5750g.get();
                jww jwwVar = (jww) this.f5746c.get();
                oju ojuVar = this.f5745b;
                jvb jvbVar = (jvb) this.f5744a.get();
                kcf kcfVar = new kcf(executor2, kbzVar, "SmartCaptureFQS");
                boolean zBooleanValue = ((Boolean) jwwVar.mo3831be()).booleanValue();
                mrm mrmVarM16829i = dhvVar.mo6184l(dhs.f11167e) ? mrm.m16829i((dyl) ojuVar.get()) : mqu.f41450a;
                dhw dhwVar = dij.f11577a;
                dhvVar.mo6177e();
                gtw gtwVarM9769a = gtw.m9769a(contextM6830a, dhvVar, kmdVar, kcfVar, kbzVar, zBooleanValue, mrmVarM16829i, mqu.f41450a);
                jvbVar.m13537d(gtwVarM9769a);
                return gtwVarM9769a;
            case 8:
                MediaFormat mediaFormat = (MediaFormat) this.f5751h.get();
                Handler handler = (Handler) this.f5748e.get();
                jvb jvbVar2 = (jvb) this.f5750g.get();
                nsz nszVar = (nsz) this.f5749f.get();
                kmd kmdVar2 = ((fxk) this.f5752i).get();
                bko bkoVar2 = (bko) this.f5746c.get();
                dhv dhvVar2 = (dhv) this.f5745b.get();
                kbo kboVar = ((kbm) this.f5747d).get();
                gvw gvwVar = (gvw) this.f5744a.get();
                lby lbyVarM2626t = bkoVar2.m2626t("mts-long");
                lea leaVarM15230a = lea.m15230a(lbyVarM2626t);
                gqw gqwVar = new gqw(nszVar, leaVarM15230a);
                jvbVar2.m13537d(new ezc(leaVarM15230a, 10));
                fsj fsjVar2 = new fsj(mediaFormat, handler, gqwVar, kmdVar2, lbyVarM2626t, dhvVar2, kboVar, gvwVar);
                jvbVar2.m13537d(fsjVar2);
                return fsjVar2;
            case 9:
                MediaFormat mediaFormat2 = (MediaFormat) this.f5751h.get();
                Handler handler2 = (Handler) this.f5748e.get();
                jvb jvbVar3 = (jvb) this.f5750g.get();
                nsz nszVar2 = (nsz) this.f5749f.get();
                kmd kmdVar3 = ((fxk) this.f5752i).get();
                bko bkoVar3 = (bko) this.f5746c.get();
                dhv dhvVar3 = (dhv) this.f5745b.get();
                kbo kboVar2 = ((kbm) this.f5747d).get();
                gvw gvwVar2 = (gvw) this.f5744a.get();
                if (gew.m9152c(dhvVar3)) {
                    dhw dhwVar2 = dij.f11577a;
                    dhvVar3.mo6177e();
                    str = "-fi";
                } else {
                    str = "-v1";
                }
                lby lbyVarM2626t2 = bkoVar3.m2626t("mts-top".concat(str));
                if (gew.m9152c(dhvVar3)) {
                    dhw dhwVar3 = dij.f11577a;
                    dhvVar3.mo6177e();
                    fsjVar = new fsk(mediaFormat2, lbyVarM2626t2, gvwVar2, kmdVar3);
                } else {
                    lea leaVarM15230a2 = lea.m15230a(lbyVarM2626t2);
                    fsjVar = new fsj(mediaFormat2, handler2, new gqw(nszVar2, leaVarM15230a2), kmdVar3, lbyVarM2626t2, dhvVar3, kboVar2, gvwVar2);
                    jvbVar3.m13537d(new ezc(leaVarM15230a2, 10));
                }
                fss fssVar = new fss(fsjVar);
                jvbVar3.m13537d(fssVar);
                return fssVar;
            case 10:
                kfk kfkVar = (kfk) this.f5748e.get();
                oju ojuVar2 = this.f5752i;
                oju ojuVar3 = this.f5750g;
                long jLongValue = ((ehk) this.f5747d).get().longValue();
                mrm mrmVar3 = (mrm) this.f5746c.get();
                oju ojuVar4 = this.f5744a;
                oju ojuVar5 = this.f5749f;
                ebv ebvVar = (ebv) this.f5745b.get();
                ecj ecjVar = (ecj) this.f5751h.get();
                if (mrmVar3.mo16813g()) {
                    return ((gjg) ojuVar2).get().m10142a(jLongValue, kfkVar.mo14131r((kho) mrmVar3.mo16809c(), ebvVar.f13300b), ecjVar, 2);
                }
                if (((mrm) ojuVar5.get()).mo16813g()) {
                    return ((gjg) ojuVar2).get().m10142a(jLongValue, kfkVar.mo14131r((kho) ((mrm) ojuVar5.get()).mo16809c(), ebvVar.f13300b), ecjVar, 2);
                }
                if (((Map) ojuVar4.get()).size() == 1) {
                    return ((gjg) ojuVar2).get().m10142a(jLongValue, kfkVar.mo14131r((kho) ((Map) ojuVar4.get()).values().iterator().next(), ebvVar.f13300b), ecjVar, 2);
                }
                lku.m15669w(((Map) ojuVar4.get()).size() > 1);
                return ((gjb) ojuVar3).get().m19486n(jLongValue, ebvVar.f13300b, ecjVar);
            case 11:
                dhv dhvVar4 = (dhv) this.f5745b.get();
                oju ojuVar6 = this.f5752i;
                oju ojuVar7 = this.f5748e;
                oju ojuVar8 = this.f5750g;
                gdc gdcVar = (gdc) this.f5746c.get();
                gbi gbiVarM10144c = (gbi) this.f5744a.get();
                hee heeVar = (hee) this.f5747d.get();
                iay iayVar = (iay) this.f5751h.get();
                bkn bknVar = (bkn) this.f5749f.get();
                if (dhvVar4.mo6184l(dib.f11334bo)) {
                    C1058va c1058va = ((glg) ojuVar7).get();
                    kho khoVar = (kho) ojuVar8.get();
                    gcs gcsVar = new gcs(gdcVar);
                    kfk kfkVar2 = (kfk) c1058va.f47803b.get();
                    kfkVar2.getClass();
                    jvb jvbVar4 = (jvb) c1058va.f47804c.get();
                    jvbVar4.getClass();
                    Executor executor3 = (Executor) c1058va.f47802a.get();
                    executor3.getClass();
                    khoVar.getClass();
                    gbiVarM10144c = ((git) ojuVar6).get().m10144c(new glf(kfkVar2, jvbVar4, executor3, khoVar, gcsVar), gbiVarM10144c);
                }
                return heeVar.m10145d(iayVar.m10996a(bknVar.m2561J(gbiVarM10144c)));
            case 12:
                float fFloatValue = ((Float) this.f5749f.get()).floatValue();
                jwn jwnVar = (jwn) this.f5750g.get();
                kmd kmdVar4 = ((fxk) this.f5746c).get();
                kan kanVar = ((gea) this.f5752i).get();
                kpb kpbVar = (kpb) this.f5747d.get();
                dbr dbrVar = ((fwv) this.f5748e).get();
                jvb jvbVar5 = (jvb) this.f5744a.get();
                dhv dhvVar5 = (dhv) this.f5751h.get();
                kme kmeVar2 = ((kak) this.f5745b).get();
                geg gegVar = kpbVar.m14667g() ? new geg(fFloatValue, jwnVar, kmdVar4, dhvVar5, kmeVar2) : new geg(fFloatValue, jwnVar, kmdVar4, kanVar, dhvVar5, kmeVar2);
                jvbVar5.m13537d(dbrVar.mo3830a(new gcu(gegVar, 2), not.INSTANCE));
                return gegVar;
            case 13:
                jvb jvbVar6 = (jvb) this.f5749f.get();
                oju ojuVar9 = this.f5751h;
                oju ojuVar10 = this.f5750g;
                oju ojuVar11 = this.f5744a;
                mrm mrmVar4 = (mrm) this.f5752i.get();
                mrm mrmVar5 = (mrm) this.f5748e.get();
                mrm mrmVarM10179a = ((hfb) this.f5745b).m10179a();
                oju ojuVar12 = this.f5747d;
                fvu fvuVarM8922a = ((fxj) this.f5746c).m8922a();
                if (!fvuVarM8922a.mo14537F()) {
                    return ((ghr) ojuVar11).get();
                }
                if (fvuVarM8922a.mo14558k() != kmq.BACK || !mrmVar4.mo16813g() || !mrmVar5.mo16813g() || !mrmVarM10179a.mo16813g()) {
                    return ((gho) ojuVar9).get();
                }
                jvbVar6.m13537d(((hrx) mrmVarM10179a.mo16809c()).mo10658d(mqu.f41450a, (mrm) ojuVar12.get()));
                ((kfc) mrmVar4.mo16809c()).mo9411k(new ctr(mrmVar5, mrmVarM10179a, 4));
                ghy ghyVar = ((ghz) ojuVar10).get();
                jvbVar6.m13537d(ghyVar);
                return ghyVar;
            case 14:
                kfk kfkVar3 = (kfk) this.f5746c.get();
                Map map = (Map) this.f5744a.get();
                mrm mrmVar6 = (mrm) this.f5750g.get();
                oju ojuVar13 = this.f5751h;
                oju ojuVar14 = this.f5747d;
                fvu fvuVarM8922a2 = ((fxj) this.f5748e).m8922a();
                dhv dhvVar6 = (dhv) this.f5749f.get();
                oju ojuVar15 = this.f5745b;
                ikw ikwVarM11415a = ((ikv) this.f5752i).m11415a();
                if (!map.containsKey(gnf.f25701c)) {
                    return mzw.f41870a;
                }
                EnumMap enumMap = new EnumMap(gnf.class);
                for (gnf gnfVar : map.keySet()) {
                    mxi mxiVarM17132D = mxk.m17132D();
                    kgg kggVar = (kgg) map.get(gnfVar);
                    kggVar.getClass();
                    mxiVarM17132D.mo17072d(kggVar);
                    if (fvuVarM8922a2.mo14558k() == kmq.BACK) {
                        if (dhvVar6.mo6184l(dht.f11176d) && gnfVar.equals(gnf.f25701c) && ikwVarM11415a.equals(ikw.PHOTO) && map.containsKey(gnf.RAW_ULTRAWIDE)) {
                            kgg kggVar2 = (kgg) map.get(gnf.RAW_ULTRAWIDE);
                            kggVar2.getClass();
                            mxiVarM17132D.mo17072d(kggVar2);
                        }
                        if (dhvVar6.mo6184l(dht.f11186n) && ((gnfVar.equals(gnf.RAW_WIDE_UPPER) || gnfVar.equals(gnf.RAW_WIDE_ZOOM_UPPER)) && dht.m6171a(dhvVar6).contains(ikwVarM11415a) && map.containsKey(gnf.RAW_TELE))) {
                            kgg kggVar3 = (kgg) map.get(gnf.RAW_TELE);
                            kggVar3.getClass();
                            mxiVarM17132D.mo17072d(kggVar3);
                        }
                    }
                    mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
                    Set set = ((ohm) ojuVar14).get();
                    mxi mxiVar = new mxi();
                    if (ikwVarM11415a.equals(ikw.PHOTO) && gnfVar != gnf.f25701c && dhvVar6.mo6184l(dht.f11176d) && ivw.f32429o != null) {
                        mxiVar.mo17072d(kgq.m14215e(ivw.f32429o, 0));
                    }
                    mxiVar.m17129h(set);
                    mxk mxkVarMo17127f2 = mxiVar.mo17127f();
                    mrm mrmVar7 = gnfVar == gnf.f25701c ? (mrm) ojuVar13.get() : mqu.f41450a;
                    if (dhvVar6.mo6184l(did.f11436ao) || ((djm) ojuVar15.get()).m6222C()) {
                        if (!ikwVarM11415a.equals(ikw.MOTION_BLUR)) {
                            mrmVar = mrmVar6;
                        }
                        Map map2 = map;
                        EnumMap enumMap2 = enumMap;
                        kho khoVar2 = (kho) gmz.m9536d(kfkVar3, mxkVarMo17127f, mrmVar, mrmVar7, mqu.f41450a, mxkVarMo17127f2).mo16812f();
                        khoVar2.getClass();
                        enumMap2.put(gnfVar, khoVar2);
                        enumMap = enumMap2;
                        ikwVarM11415a = ikwVarM11415a;
                        kfkVar3 = kfkVar3;
                        map = map2;
                    } else {
                        gmz.m9537e(ikwVarM11415a, dhvVar6);
                    }
                    mrmVar = mqu.f41450a;
                    Map map3 = map;
                    EnumMap enumMap3 = enumMap;
                    kho khoVar3 = (kho) gmz.m9536d(kfkVar3, mxkVarMo17127f, mrmVar, mrmVar7, mqu.f41450a, mxkVarMo17127f2).mo16812f();
                    khoVar3.getClass();
                    enumMap3.put(gnfVar, khoVar3);
                    enumMap = enumMap3;
                    ikwVarM11415a = ikwVarM11415a;
                    kfkVar3 = kfkVar3;
                    map = map3;
                }
                return enumMap;
            default:
                Object obj = this.f5746c.get();
                ikw ikwVarM11415a2 = ((ikv) this.f5748e).m11415a();
                kmd kmdVar5 = (kmd) this.f5745b.get();
                gdz gdzVar = ((geb) this.f5744a).get();
                dhv dhvVar7 = (dhv) this.f5749f.get();
                oju ojuVar16 = this.f5750g;
                int iIntValue = ((Integer) this.f5752i.get()).intValue();
                long jLongValue2 = ((Long) this.f5747d.get()).longValue();
                fuf fufVar = (fuf) this.f5751h.get();
                djm djmVar = (djm) obj;
                kna knaVar = new kna(iIntValue, (ikwVarM11415a2 != ikw.PHOTO || dhvVar7.mo6184l(did.f11414Y)) ? ((fwz) ojuVar16).get() : kan.f35487b.m13883m(kan.m13873j(gdzVar.f24348b)) ? dye.f12882b : dye.f12881a);
                int i = ikwVarM11415a2.equals(ikw.MOTION_BLUR) ? fufVar.f23585b : 50;
                gmy gmyVarM6226G = djmVar.m6226G();
                gmyVarM6226G.f25660a = kmdVar5.mo14556i();
                gmyVarM6226G.f25661b = knaVar;
                gmyVarM6226G.f25662c = i;
                gmyVarM6226G.f25664e = true;
                gmyVarM6226G.f25665f = jLongValue2 == 0 ? null : Long.valueOf(jLongValue2);
                return gmyVarM6226G.m9532a();
        }
    }
}
