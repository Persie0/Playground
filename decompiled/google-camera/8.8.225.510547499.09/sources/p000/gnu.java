package p000;

import android.content.Context;
import android.os.Handler;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25795a;

    /* JADX INFO: renamed from: b */
    private final oju f25796b;

    /* JADX INFO: renamed from: c */
    private final oju f25797c;

    /* JADX INFO: renamed from: d */
    private final oju f25798d;

    /* JADX INFO: renamed from: e */
    private final oju f25799e;

    /* JADX INFO: renamed from: f */
    private final oju f25800f;

    /* JADX INFO: renamed from: g */
    private final oju f25801g;

    /* JADX INFO: renamed from: h */
    private final oju f25802h;

    /* JADX INFO: renamed from: i */
    private final oju f25803i;

    /* JADX INFO: renamed from: j */
    private final oju f25804j;

    /* JADX INFO: renamed from: k */
    private final oju f25805k;

    /* JADX INFO: renamed from: l */
    private final oju f25806l;

    /* JADX INFO: renamed from: m */
    private final /* synthetic */ int f25807m;

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i) {
        this.f25807m = i;
        this.f25795a = ojuVar;
        this.f25796b = ojuVar2;
        this.f25797c = ojuVar3;
        this.f25798d = ojuVar4;
        this.f25799e = ojuVar5;
        this.f25800f = ojuVar6;
        this.f25801g = ojuVar7;
        this.f25802h = ojuVar8;
        this.f25803i = ojuVar9;
        this.f25804j = ojuVar10;
        this.f25805k = ojuVar11;
        this.f25806l = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, byte[] bArr) {
        this.f25807m = i;
        this.f25805k = ojuVar;
        this.f25802h = ojuVar2;
        this.f25804j = ojuVar3;
        this.f25797c = ojuVar4;
        this.f25796b = ojuVar5;
        this.f25806l = ojuVar6;
        this.f25798d = ojuVar7;
        this.f25799e = ojuVar8;
        this.f25801g = ojuVar9;
        this.f25803i = ojuVar10;
        this.f25800f = ojuVar11;
        this.f25795a = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, char[] cArr) {
        this.f25807m = i;
        this.f25802h = ojuVar;
        this.f25797c = ojuVar2;
        this.f25799e = ojuVar3;
        this.f25796b = ojuVar4;
        this.f25798d = ojuVar5;
        this.f25804j = ojuVar6;
        this.f25806l = ojuVar7;
        this.f25800f = ojuVar8;
        this.f25795a = ojuVar9;
        this.f25805k = ojuVar10;
        this.f25801g = ojuVar11;
        this.f25803i = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, float[] fArr) {
        this.f25807m = i;
        this.f25803i = ojuVar;
        this.f25804j = ojuVar2;
        this.f25799e = ojuVar3;
        this.f25806l = ojuVar4;
        this.f25802h = ojuVar5;
        this.f25800f = ojuVar6;
        this.f25797c = ojuVar7;
        this.f25801g = ojuVar8;
        this.f25795a = ojuVar9;
        this.f25805k = ojuVar10;
        this.f25796b = ojuVar11;
        this.f25798d = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, int[] iArr) {
        this.f25807m = i;
        this.f25796b = ojuVar;
        this.f25805k = ojuVar2;
        this.f25795a = ojuVar3;
        this.f25804j = ojuVar4;
        this.f25799e = ojuVar5;
        this.f25797c = ojuVar6;
        this.f25803i = ojuVar7;
        this.f25801g = ojuVar8;
        this.f25800f = ojuVar9;
        this.f25802h = ojuVar10;
        this.f25798d = ojuVar11;
        this.f25806l = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, short[] sArr) {
        this.f25807m = i;
        this.f25803i = ojuVar;
        this.f25799e = ojuVar2;
        this.f25796b = ojuVar3;
        this.f25804j = ojuVar4;
        this.f25805k = ojuVar5;
        this.f25806l = ojuVar6;
        this.f25798d = ojuVar7;
        this.f25800f = ojuVar8;
        this.f25801g = ojuVar9;
        this.f25795a = ojuVar10;
        this.f25797c = ojuVar11;
        this.f25802h = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, boolean[] zArr) {
        this.f25807m = i;
        this.f25802h = ojuVar;
        this.f25795a = ojuVar2;
        this.f25800f = ojuVar3;
        this.f25798d = ojuVar4;
        this.f25797c = ojuVar5;
        this.f25804j = ojuVar6;
        this.f25803i = ojuVar7;
        this.f25805k = ojuVar8;
        this.f25799e = ojuVar9;
        this.f25806l = ojuVar10;
        this.f25801g = ojuVar11;
        this.f25796b = ojuVar12;
    }

    public gnu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, byte[][] bArr) {
        this.f25807m = i;
        this.f25800f = ojuVar;
        this.f25806l = ojuVar2;
        this.f25797c = ojuVar3;
        this.f25801g = ojuVar4;
        this.f25796b = ojuVar5;
        this.f25799e = ojuVar6;
        this.f25798d = ojuVar7;
        this.f25803i = ojuVar8;
        this.f25795a = ojuVar9;
        this.f25805k = ojuVar10;
        this.f25802h = ojuVar11;
        this.f25804j = ojuVar12;
    }

    /* JADX INFO: renamed from: a */
    public static gnu m9567a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12) {
        return new gnu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, 1, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f25807m) {
            case 0:
                return new gnt((gpx) this.f25795a.get(), (dsx) this.f25796b.get(), (DynamicDepthUtils) this.f25797c.get(), (gva) this.f25798d.get(), ((ebo) this.f25799e).get(), (Executor) this.f25800f.get(), (gvw) this.f25801g.get(), ((cen) this.f25802h).get(), ((geb) this.f25803i).get(), (djm) this.f25804j.get(), (kbz) this.f25805k.get(), (bko) this.f25806l.get(), null, null, null, null);
            case 1:
                return new ghg((kbz) this.f25805k.get(), ((dki) this.f25802h).get(), (bkn) this.f25804j.get(), ((dqz) this.f25797c).m6611a(), (jwn) this.f25796b.get(), (imu) this.f25806l.get(), (dhv) this.f25798d.get(), ((fxj) this.f25799e).m8922a(), this.f25801g, (ggs) this.f25803i.get(), (jvb) this.f25800f.get(), ((cjh) this.f25795a).get(), null, null, null);
            case 2:
                return new gva((fca) this.f25802h.get(), ((hlx) this.f25797c).get(), ((gyb) this.f25799e).get(), (gxa) this.f25796b.get(), (gxq) this.f25798d.get(), (jww) this.f25804j.get(), (hah) this.f25806l.get(), (kqj) this.f25800f.get(), (jww) this.f25795a.get(), (jwn) this.f25805k.get(), (jww) this.f25801g.get(), (jwn) this.f25803i.get(), null, null, null, null, null);
            case 3:
                return new gwz(this.f25803i, this.f25799e, this.f25804j, this.f25805k, this.f25806l, this.f25798d, this.f25800f, this.f25801g, this.f25795a, this.f25797c, this.f25802h);
            case 4:
                Context contextM6830a = ((dws) this.f25796b).m6830a();
                Object obj = this.f25805k.get();
                hfo hfoVar = (hfo) this.f25795a.get();
                chv chvVar = (chv) this.f25804j.get();
                Object obj2 = this.f25799e.get();
                return new hfn(contextM6830a, (hgm) obj, hfoVar, chvVar, (hfx) obj2, (Handler) this.f25797c.get(), ((inc) this.f25803i).get(), ((dww) this.f25801g).m6836a(), ((hfz) this.f25800f).get(), (hgb) this.f25802h.get(), (ihk) this.f25798d.get(), (hhi) this.f25806l.get(), null, null, null);
            case 5:
                return new hhr(((Boolean) this.f25802h.get()).booleanValue(), ((ino) this.f25795a).get().booleanValue(), ((dws) this.f25800f).m6830a(), ((cjm) this.f25798d).m3825a(), ((iin) this.f25797c).get(), (BottomBarController) this.f25804j.get(), (dhv) this.f25803i.get(), ((iil) this.f25805k).get(), (hah) this.f25799e.get(), (hai) this.f25806l.get(), ((hzr) this.f25801g).get(), (jwn) this.f25796b.get());
            case 6:
                return new ijv(((dws) this.f25803i).m6830a(), ((ikv) this.f25804j).m11415a(), (iak) this.f25799e.get(), (hai) this.f25806l.get(), (dhv) this.f25802h.get(), this.f25800f, this.f25797c, (jvd) this.f25801g.get(), ((cjm) this.f25795a).m3825a(), (kbz) this.f25805k.get(), ((erq) this.f25796b).get(), (htf) this.f25798d.get());
            default:
                Object obj3 = this.f25800f.get();
                kkk kkkVar = (kkk) this.f25806l.get();
                AmbientDelegate ambientDelegate = (AmbientDelegate) this.f25797c.get();
                khx khxVar = (khx) this.f25801g.get();
                kjm kjmVar = (kjm) this.f25796b.get();
                kie kieVar = (kie) this.f25799e.get();
                khg khgVar = (khg) this.f25798d.get();
                kon konVar = (kon) this.f25803i.get();
                jvb jvbVar = (jvb) this.f25795a.get();
                Integer num = 1;
                num.intValue();
                return new kig((kgt) obj3, kkkVar, ambientDelegate, khxVar, kjmVar, kieVar, khgVar, konVar, jvbVar, (kbz) this.f25805k.get(), ((kbm) this.f25802h).get(), (mrm) this.f25804j.get(), null, null, null);
        }
    }
}
