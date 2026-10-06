package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iic implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31060a;

    /* JADX INFO: renamed from: b */
    private final oju f31061b;

    /* JADX INFO: renamed from: c */
    private final oju f31062c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f31063d;

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f31063d = i;
        this.f31060a = ojuVar;
        this.f31061b = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31060a = ojuVar2;
        this.f31061b = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr, byte[] bArr2) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f31063d = i;
        this.f31060a = ojuVar;
        this.f31062c = ojuVar2;
        this.f31061b = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr, byte[] bArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31062c = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31060a = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31060a = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31060a = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31062c = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31060a = ojuVar2;
        this.f31061b = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31062c = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31060a = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f31063d = i;
        this.f31061b = ojuVar;
        this.f31060a = ojuVar2;
        this.f31062c = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f31063d = i;
        this.f31060a = ojuVar;
        this.f31062c = ojuVar2;
        this.f31061b = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][][] fArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f31063d = i;
        this.f31060a = ojuVar;
        this.f31062c = ojuVar2;
        this.f31061b = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    public iic(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f31063d = i;
        this.f31062c = ojuVar;
        this.f31061b = ojuVar2;
        this.f31060a = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static iic m11376a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new iic(ojuVar, ojuVar2, ojuVar3, 8, (char[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31063d) {
            case 0:
                final ohb ohbVarM18485a = ohh.m18485a(this.f31060a);
                final kbz kbzVar = (kbz) this.f31061b.get();
                Object objM17136H = !((dhv) this.f31062c.get()).mo6184l(dif.f11479c) ? mzx.f41874a : mxk.m17136H(ipn.m11594a(new ipm() { // from class: iib
                    @Override // p000.ipm
                    /* JADX INFO: renamed from: a */
                    public final ipk mo3626a(ipo ipoVar) {
                        ohb ohbVar = ohbVarM18485a;
                        return new iia(ipoVar.mo11583b(), (ihz) ohbVar.get(), kbzVar);
                    }
                }, ((ihz) ohbVarM18485a.get()).f31027a, ipl.BLUR));
                objM17136H.getClass();
                return objM17136H;
            case 1:
                return !((dhv) this.f31062c.get()).mo6184l(dib.f11250aJ) ? ((ihj) this.f31061b).get() : ((ihh) this.f31060a).get();
            case 2:
                return new ijs((mrm) this.f31060a.get(), this.f31062c, ((dws) this.f31061b).m6830a(), 1);
            case 3:
                return new ijs((mrm) this.f31061b.get(), this.f31060a, ((dws) this.f31062c).m6830a(), 0);
            case 4:
                return new ijs((mrm) this.f31061b.get(), this.f31060a, ((dws) this.f31062c).m6830a(), 2);
            case 5:
                return new ijs((mrm) this.f31061b.get(), (hyo) this.f31062c.get(), this.f31060a, 3);
            case 6:
                return new ikn(((ity) this.f31061b).get(), this.f31060a, ((dws) this.f31062c).m6830a());
            case 7:
                return new imn(((ema) this.f31062c).get(), (jvd) this.f31061b.get(), ((erq) this.f31060a).get());
            case 8:
                return new imu(((kak) this.f31062c).get(), (kmd) this.f31060a.get(), (dhv) this.f31061b.get());
            case 9:
                ohb ohbVarM18485a2 = ohh.m18485a(this.f31061b);
                fba fbaVar = ((eru) this.f31060a).get();
                jvd jvdVar = (jvd) this.f31062c.get();
                irg irgVar = (irg) ohbVarM18485a2.get();
                fdh.m8265e(jvdVar, fbaVar, irgVar);
                irgVar.getClass();
                return irgVar;
            case 10:
                return new kdp((ScheduledExecutorService) this.f31061b.get(), ((kbm) this.f31062c).get(), ((etl) this.f31060a).m7866a());
            case 11:
                return new djm((AmbientDelegate) this.f31062c.get(), (ihk) this.f31061b.get(), ((khr) this.f31060a).get(), (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            case 12:
                kpa kpaVar = (kpa) this.f31062c.get();
                ((khc) this.f31061b).get();
                oju ojuVar = this.f31060a;
                boolean z = kpaVar.f36759b;
                kjn kjnVar = (kjn) ojuVar.get();
                kjnVar.getClass();
                return kjnVar;
            case 13:
                SensorManager sensorManager = ((emt) this.f31061b).get();
                kpa kpaVar2 = (kpa) this.f31060a.get();
                oju ojuVar2 = this.f31062c;
                boolean z2 = kpaVar2.f36758a;
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                return (defaultSensor == null || !defaultSensor.isDirectChannelTypeSupported(2) || defaultSensor.getHighestDirectReportRateLevel() < 2 || !ReadHardwareBufferJniFunctions.isSupported()) ? mqu.f41450a : mrm.m16829i((kni) ojuVar2.get());
            case 14:
                Executor executor = ((lgy) this.f31061b.get()).f38248d ? (Executor) this.f31060a.get() : (Executor) this.f31062c.get();
                executor.getClass();
                return executor;
            case 15:
                return new lhj(this.f31062c, this.f31061b, ((ohm) this.f31060a).get());
            case 16:
                return new lji(((dws) this.f31060a).m6830a(), ((fjp) this.f31062c).m8495b(), (String) this.f31061b.get());
            case 17:
                return new lku();
            case 18:
                return new lma((mrm) ((ohj) this.f31061b).f46012a, ohh.m18485a(this.f31060a), ((dws) this.f31062c).m6830a(), msa.m16846b('/').m16848a());
            case 19:
                return new lmu((mrm) ((ohj) this.f31061b).f46012a, ohh.m18485a(this.f31060a), ((dws) this.f31062c).m6830a(), msa.m16846b('/').m16848a());
            default:
                Object objM17136H2 = (((mrm) ((ohj) this.f31061b).f46012a).mo16813g() || ((mrm) ((ohj) this.f31062c).f46012a).mo16813g()) ? mxk.m17136H((ljh) this.f31060a.get()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
        }
    }
}
