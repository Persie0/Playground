package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25609a;

    /* JADX INFO: renamed from: b */
    private final oju f25610b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f25611c;

    public gmq(oju ojuVar, oju ojuVar2, int i) {
        this.f25611c = i;
        this.f25609a = ojuVar;
        this.f25610b = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, int[][] iArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    public gmq(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f25611c = i;
        this.f25610b = ojuVar;
        this.f25609a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static gmq m9526a(oju ojuVar, oju ojuVar2) {
        return new gmq(ojuVar, ojuVar2, 2);
    }

    /* JADX INFO: renamed from: b */
    public static gmq m9527b(oju ojuVar, oju ojuVar2) {
        return new gmq(ojuVar, ojuVar2, 3);
    }

    /* JADX INFO: renamed from: c */
    public static gmq m9528c(oju ojuVar, oju ojuVar2) {
        return new gmq(ojuVar, ojuVar2, 4);
    }

    /* JADX INFO: renamed from: d */
    public static gmq m9529d(oju ojuVar, oju ojuVar2) {
        return new gmq(ojuVar, ojuVar2, 13, (byte[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        boolean z = true;
        switch (this.f25611c) {
            case 0:
                mrm mrmVar = (mrm) this.f25609a.get();
                dhv dhvVar = (dhv) this.f25610b.get();
                if (!dhvVar.mo6184l(did.f11425ad) || !dhvVar.mo6184l(dih.f11521i)) {
                    return mqu.f41450a;
                }
                lku.m15669w(mrmVar.mo16813g());
                return mrm.m16829i((kgg) mrmVar.mo16809c());
            case 1:
                return ((mrm) this.f25609a.get()).mo16808b(new etx((kfk) this.f25610b.get(), 17));
            case 2:
                gmt gmtVar = ((gmx) this.f25609a).get();
                ((jvb) this.f25610b.get()).m13537d(gmtVar);
                return gmtVar;
            case 3:
                return dez.m6036f(new fro(this.f25609a, (ggs) this.f25610b.get(), 19), "pckrespman");
            case 4:
                oju ojuVar = this.f25609a;
                Set set = ((ohm) this.f25610b).get();
                mwt mwtVarM17115i = mwx.m17115i();
                mwtVarM17115i.mo17110e(gnf.f25701c, ojuVar);
                mwtVarM17115i.m17111f(set);
                return mwtVarM17115i.mo17059b();
            case 5:
                Object objM17136H = ((dhv) this.f25610b.get()).mo6184l(did.f11421aE) ? mxk.m17136H((ech) this.f25609a.get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 6:
                return new gnz(((knd) this.f25610b).get(), (Executor) this.f25609a.get());
            case 7:
                dhv dhvVar2 = (dhv) this.f25610b.get();
                dhx dhxVar = dib.f11240a;
                dhvVar2.mo6177e();
                dhvVar2.mo6177e();
                return cdw.f5366g;
            case 8:
                jwn jwnVarM13635e = jwr.m13635e(((gdt) this.f25609a.get()).f24337a, Integer.valueOf(((Integer) ((dhv) this.f25610b.get()).mo6173a(dio.f11659a).get()).intValue()));
                jwnVarM13635e.getClass();
                return jwnVarM13635e;
            case 9:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f25610b.get();
                kbz kbzVar = (kbz) this.f25609a.get();
                llh llhVarM15327a = lgy.m15327a();
                llhVarM15327a.f38576e = kxk.m14955A(new dmr(scheduledExecutorService, kbzVar));
                return llhVarM15327a.m15706c();
            case 10:
                return new gqq(((dki) this.f25609a).get(), new gpn(((dws) this.f25610b).m6830a(), 8));
            case 11:
                return ((fpt) this.f25610b).get().m9741f(((ohl) ohl.m18489b(this.f25609a)).get(), new gut(), new guu());
            case 12:
                dhv dhvVar3 = (dhv) this.f25609a.get();
                dhx dhxVar2 = dib.f11240a;
                dhvVar3.mo6179g();
                return ciz.f5911a;
            case 13:
                Activity activity = ((ema) this.f25610b).get();
                KeyguardManager keyguardManager = ((emq) this.f25609a).get();
                if (!gvs.m9801a(activity.getIntent())) {
                    z = false;
                } else if (!keyguardManager.isKeyguardLocked() && !ActivityManager.isRunningInTestHarness()) {
                    ((nbe) ((nbe) gvs.f26521a.m17252c()).mo17276G((char) 3304)).mo17290o("Warning: Overriding the secure camera intent because the keyguard is not currently locked. The camera will open in normal mode.");
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                return new gwr(((emt) this.f25609a).get(), (Executor) this.f25610b.get());
            case 15:
                return new gwu(((emt) this.f25609a).get(), (Executor) this.f25610b.get());
            case 16:
                return new djm(((emt) this.f25609a).get(), (Executor) this.f25610b.get());
            case 17:
                return new hac((dhv) this.f25610b.get(), (SharedPreferences) this.f25609a.get());
            case 18:
                return new hag(((dws) this.f25610b).m6830a(), (SharedPreferences) this.f25609a.get());
            case 19:
                return ((haj) this.f25609a).get().m11350r("pref_mode_vesper_level", ((ftj) this.f25610b).m8789b().intValue());
            default:
                return ((dhv) this.f25610b.get()).mo6184l(dib.f11304bK) ? ((haj) this.f25609a).get().m11349q("pref_camera_cd_indicator_enabled_key", true) : jwv.m13644a(Boolean.FALSE);
        }
    }
}
