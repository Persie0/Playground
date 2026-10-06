package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionMergedCropCalculator;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxm implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12838a;

    /* JADX INFO: renamed from: b */
    private final oju f12839b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12840c;

    public dxm(oju ojuVar, oju ojuVar2, int i) {
        this.f12840c = i;
        this.f12838a = ojuVar;
        this.f12839b = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, int[][] iArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    public dxm(oju ojuVar, oju ojuVar2, int i, boolean[][] zArr) {
        this.f12840c = i;
        this.f12839b = ojuVar;
        this.f12838a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static dxm m6848a(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 0);
    }

    /* JADX INFO: renamed from: b */
    public static dxm m6849b(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 2, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dxm m6850c(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 3);
    }

    /* JADX INFO: renamed from: d */
    public static dxm m6851d(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 4, (char[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dxm m6852e(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 6);
    }

    /* JADX INFO: renamed from: f */
    public static dxm m6853f(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 7);
    }

    /* JADX INFO: renamed from: g */
    public static dxm m6854g(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 8);
    }

    /* JADX INFO: renamed from: h */
    public static dxm m6855h(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 9, (int[]) null);
    }

    /* JADX INFO: renamed from: i */
    public static dxm m6856i(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 10, (boolean[]) null);
    }

    /* JADX INFO: renamed from: j */
    public static dxm m6857j(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 13);
    }

    /* JADX INFO: renamed from: k */
    public static dxm m6858k(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 14, (byte[][]) null);
    }

    /* JADX INFO: renamed from: l */
    public static dxm m6859l(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 15);
    }

    /* JADX INFO: renamed from: m */
    public static dxm m6860m(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 16, (char[][]) null);
    }

    /* JADX INFO: renamed from: n */
    public static dxm m6861n(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 19, (int[][]) null);
    }

    /* JADX INFO: renamed from: o */
    public static dxm m6862o(oju ojuVar, oju ojuVar2) {
        return new dxm(ojuVar, ojuVar2, 20, (boolean[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        knh knhVarMo7000a;
        switch (this.f12840c) {
            case 0:
                try {
                    lek lekVar = (lek) this.f12839b.get();
                    int i = dyd.f12880a * 10;
                    long jConvert = TimeUnit.NANOSECONDS.convert(1500000000L, TimeUnit.NANOSECONDS);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    return mrm.m16829i(new dxk(lekVar, i, atomicBoolean, inr.m11545q(new dxj(atomicBoolean, new AtomicBoolean(true), jConvert)), null, null));
                } catch (Exception e) {
                    ((nbe) ((nbe) dxl.f12837a.m17251b()).mo17276G((char) 1169)).mo17290o("Error trying to initialize audio");
                    return mqu.f41450a;
                }
            case 1:
                Context contextM6830a = ((dws) this.f12838a).m6830a();
                glk glkVar = (glk) this.f12839b.get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.passive_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator.addUpdateListener(glkVar.m9429f());
                valueAnimator.addListener(new ilq());
                return inr.m11538j(valueAnimator);
            case 2:
                lem lemVar = new lem(new lel(new AudioRecord.Builder().setAudioSource(5).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(12).build()).setBufferSizeInBytes(dyd.f12880a * 10).build(), 1), ((cjj) this.f12838a).m3824a());
                boolean z = lbo.f37882a;
                return lemVar;
            case 3:
                return new dyb((dxx) this.f12838a.get(), (imu) this.f12839b.get());
            case 4:
                mrm mrmVarM6617a = ((dra) this.f12839b).m6617a();
                mrm mrmVar = (mrm) this.f12838a.get();
                if (mrmVarM6617a.mo16813g()) {
                    return mrm.m16829i((dyp) mrmVarM6617a.mo16809c());
                }
                return mrmVar.mo16813g() ? mrm.m16829i((dyp) mrmVar.mo16809c()) : mqu.f41450a;
            case 5:
                return new dzs(((dzo) this.f12839b).get(), ((dzu) this.f12838a).get());
            case 6:
                return new eal((kni) this.f12838a.get(), (jvb) this.f12839b.get());
            case 7:
                Object objM17136H = ((Integer) this.f12838a.get()).intValue() < 0 ? mzx.f41874a : mxk.m17136H((kfv) this.f12839b.get());
                objM17136H.getClass();
                return objM17136H;
            case 8:
                kni kniVar = (kni) this.f12838a.get();
                dhv dhvVar = (dhv) this.f12839b.get();
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                kniVar.getClass();
                return kniVar;
            case 9:
                Integer num = (Integer) this.f12839b.get();
                return num.intValue() < 0 ? new enh() : new enk(num.intValue(), ((gdz) this.f12838a.get()).m9083b());
            case 10:
                kmd kmdVar = (kmd) this.f12839b.get();
                dhv dhvVar2 = (dhv) this.f12838a.get();
                kmq kmqVarMo14558k = kmdVar.mo14558k();
                kmq kmqVar = kmq.BACK;
                if (dhvVar2.mo6184l(dib.f11256aP) && kmqVarMo14558k == kmqVar) {
                    return (Integer) dhvVar2.mo6173a(dib.f11374p).get();
                }
                return -1;
            case 11:
                return new ebv(((dms) this.f12839b).get(), (dhv) this.f12838a.get(), dvb.m6761a(), null, null);
            case 12:
                return new ebw((Gcam) this.f12838a.get(), (ScheduledExecutorService) this.f12839b.get());
            case 13:
                return new ebz((Handler) this.f12838a.get(), (dhv) this.f12839b.get());
            case 14:
                return new eci(((ohm) this.f12839b).get(), (kbz) this.f12838a.get());
            case 15:
                mrm mrmVar2 = (mrm) this.f12838a.get();
                jvb jvbVar = (jvb) this.f12839b.get();
                if (!mrmVar2.mo16813g() || (knhVarMo7000a = ((kni) mrmVar2.mo16809c()).mo7000a("HdrPlusSession")) == null) {
                    return mqu.f41450a;
                }
                jvbVar.m13537d(knhVarMo7000a);
                return mrm.m16829i(knhVarMo7000a);
            case 16:
                dhv dhvVar3 = (dhv) this.f12839b.get();
                edk edkVar = (edk) this.f12838a.get();
                float fFloatValue = ((Float) dhvVar3.mo6180h(did.f11426ae).get()).floatValue();
                float fMax = Math.max(((Float) dhvVar3.mo6180h(did.f11427af).get()).floatValue(), fFloatValue);
                float fFloatValue2 = ((Float) dhvVar3.mo6180h(did.f11428ag).get()).floatValue();
                float fMax2 = Math.max(((Float) dhvVar3.mo6180h(did.f11429ah).get()).floatValue(), fFloatValue2);
                float fMin = Math.min(((Float) dhvVar3.mo6180h(did.f11430ai).get()).floatValue(), fMax);
                if (edkVar == edk.PORTRAIT) {
                    fFloatValue = fFloatValue2;
                }
                if (edkVar == edk.PORTRAIT) {
                    fMax = fMax2;
                }
                return new eax(fFloatValue, fMax, fMin);
            case 17:
                return ((dhv) this.f12838a.get()).mo6184l(dht.f11176d) ? mrm.m16829i((egk) this.f12839b.get()) : mqu.f41450a;
            case 18:
                return new kcf(kxk.m14956B((Executor) this.f12839b.get()), (kbz) this.f12838a.get(), "FalconProcess");
            case 19:
                return new DeblurFusionMergedCropCalculator((imu) this.f12839b.get(), (Map) this.f12838a.get());
            default:
                return ((egx) this.f12839b).m7318b().booleanValue() ? dez.m6036f((Runnable) this.f12838a.get(), "debfus") : ciz.f5911a;
        }
    }
}
