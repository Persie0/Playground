package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cbw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f4973a;

    /* JADX INFO: renamed from: b */
    private final oju f4974b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f4975c;

    public cbw(oju ojuVar, oju ojuVar2, int i) {
        this.f4975c = i;
        this.f4973a = ojuVar;
        this.f4974b = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, float[][] fArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, int[][] iArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, boolean[][] zArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, byte[][][] bArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    public cbw(oju ojuVar, oju ojuVar2, int i, char[][][] cArr) {
        this.f4975c = i;
        this.f4974b = ojuVar;
        this.f4973a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static cbw m3411a(oju ojuVar, oju ojuVar2) {
        return new cbw(ojuVar, ojuVar2, 1);
    }

    /* JADX INFO: renamed from: b */
    public static cbw m3412b(oju ojuVar, oju ojuVar2) {
        return new cbw(ojuVar, ojuVar2, 5, (short[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static cbw m3413c(oju ojuVar, oju ojuVar2) {
        return new cbw(ojuVar, ojuVar2, 13, (char[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static cbw m3414d(oju ojuVar, oju ojuVar2) {
        return new cbw(ojuVar, ojuVar2, 14, (short[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f4975c) {
            case 0:
                return new cbv((djm) this.f4973a.get(), (chx) this.f4974b.get(), null, null, null);
            case 1:
                Object objM17136H = !((fxj) this.f4973a).m8922a().mo14537F() ? mzx.f41874a : mxk.m17136H(fxo.m8932f(CaptureRequest.CONTROL_AF_REGIONS, ((fum) this.f4974b).get()));
                objM17136H.getClass();
                return objM17136H;
            case 2:
                Object obj = ((ikv) this.f4973a).m11415a() != ikw.PHOTO ? cdw.f5360a : (hjk) this.f4974b.get();
                obj.getClass();
                return obj;
            case 3:
                return jbx.m12870o(this.f4974b, (kbz) this.f4973a.get(), "lslogging");
            case 4:
                return new ceh((ceb) this.f4973a.get(), (CameraActivityTiming) this.f4974b.get());
            case 5:
                return new cej(((emg) this.f4974b).get(), (jvd) this.f4973a.get());
            case 6:
                return new cer(this.f4973a, this.f4974b);
            case 7:
                dhv dhvVar = (dhv) this.f4974b.get();
                oju ojuVar = this.f4973a;
                dhx dhxVar = dhf.f11040a;
                dhvVar.mo6176d();
                cgb cgbVar = (cgb) ojuVar.get();
                Object objM17136H2 = cgbVar.f5557b.mo3592c() ? mxk.m17136H(cgbVar) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 8:
                dhv dhvVar2 = (dhv) this.f4973a.get();
                return new bko(dhvVar2);
            case 9:
                return new cfs((cfv) this.f4974b.get(), (dhv) this.f4973a.get());
            case 10:
                jww jwwVar = (jww) this.f4973a.get();
                chx chxVar = (chx) this.f4974b.get();
                jwf jwfVar = new jwf(false);
                chxVar.f5767b.m13537d(jwj.m13624c(jwr.m13640j(jwwVar, cgh.f5585a)).mo3830a(jwfVar, not.INSTANCE));
                return jwfVar;
            case 11:
                jwn jwnVarM13640j = jwr.m13640j(jwr.m13632b((jwf) this.f4974b.get(), (jwn) this.f4973a.get()), cgh.f5587c);
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 12:
                return new cke((Executor) this.f4974b.get(), (nps) this.f4973a.get());
            case 13:
                return new cke(((cjm) this.f4974b).m3825a(), (nps) this.f4973a.get());
            case 14:
                Object obj2 = this.f4974b.get();
                grz grzVar = (grz) this.f4973a.get();
                nps npsVar = ((cka) obj2).f5957d;
                npsVar.mo2282d(new cei(grzVar.m9694c(), 15), not.INSTANCE);
                return npsVar;
            case 15:
                return new cke((Executor) this.f4974b.get(), (nps) this.f4973a.get());
            case 16:
                return new kcf(((ckl) this.f4974b).m3838a(), (kbz) this.f4973a.get(), "IOTask");
            case 17:
                return new grz((kbz) this.f4973a.get(), (ScheduledExecutorService) this.f4974b.get());
            case 18:
                return ((grz) this.f4973a.get()).m9693b((Executor) this.f4974b.get());
            case 19:
                return new ckf((Executor) this.f4974b.get(), (ScheduledExecutorService) this.f4973a.get());
            default:
                return ((dhv) this.f4973a.get()).mo6184l(did.f11424ac) ? ((etl) this.f4974b).m7866a() : mqu.f41450a;
        }
    }
}
