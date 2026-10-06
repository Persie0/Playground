package p000;

import android.util.Range;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class csh extends csn {
    public csh(kmg kmgVar, kmg kmgVar2, dsx dsxVar, jxn jxnVar, jxp jxpVar, mrm mrmVar, kbc kbcVar, jxv jxvVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, mrm mrmVar5, boolean z, Range range, Range range2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, mws mwsVar, mws mwsVar2, mws mwsVar3, kmq kmqVar, gyw gywVar, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, byte[] bArr, byte[] bArr2) {
        super(kmgVar, kmgVar2, dsxVar, jxnVar, jxpVar, mrmVar, kbcVar, jxvVar, mrmVar2, mrmVar3, mrmVar4, mrmVar5, z, range, range2, z2, z3, z4, z5, z6, z7, mwsVar, mwsVar2, mwsVar3, kmqVar, gywVar, i, z8, z9, z10, z11, z12, z13, null, null);
    }

    /* JADX INFO: renamed from: a */
    private static String m5459a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    private static String m5460b(Object obj, int i) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n".concat(m5459a(i)));
    }

    /* JADX INFO: renamed from: c */
    private static String m5461c(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            jxn jxnVar = (jxn) it.next();
            sb.append("\n");
            sb.append(m5459a(2));
            sb.append(m5460b(jxnVar, 2));
            sb.append(",");
            z = true;
        }
        if (z) {
            sb.append("\n");
            sb.append(m5459a(1));
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.csn
    public final String toString() {
        String str;
        String strM5460b = m5460b(this.f9336a, 1);
        String strM5460b2 = m5460b(this.f9337b, 1);
        String strM5460b3 = m5460b(this.f9335G, 1);
        String strM5460b4 = m5460b(this.f9338c, 1);
        String strM5460b5 = m5460b(this.f9339d, 1);
        mrm mrmVar = this.f9340e;
        String strM5460b6 = mrmVar.mo16813g() ? m5460b(mrmVar.mo16809c(), 1) : "<absent>";
        String strM5460b7 = m5460b(this.f9341f, 1);
        String strM5460b8 = m5460b(this.f9342g, 1);
        mrm mrmVar2 = this.f9343h;
        String strM5460b9 = mrmVar2.mo16813g() ? m5460b(mrmVar2.mo16809c(), 1) : "<absent>";
        mrm mrmVar3 = this.f9344i;
        String strM5460b10 = mrmVar3.mo16813g() ? m5460b(mrmVar3.mo16809c(), 1) : "<absent>";
        mrm mrmVar4 = this.f9345j;
        String strM5460b11 = mrmVar4.mo16813g() ? m5460b(mrmVar4.mo16809c(), 1) : "<absent>";
        mrm mrmVar5 = this.f9346k;
        String strM5460b12 = mrmVar5.mo16813g() ? m5460b(mrmVar5.mo16809c(), 1) : "<absent>";
        boolean z = this.f9347l;
        String strM5460b13 = m5460b(this.f9348m, 1);
        String strM5460b14 = m5460b(this.f9349n, 1);
        boolean z2 = this.f9350o;
        boolean z3 = this.f9351p;
        boolean z4 = this.f9352q;
        boolean z5 = this.f9353r;
        boolean z6 = this.f9354s;
        boolean z7 = this.f9355t;
        String strM5461c = m5461c(this.f9356u);
        String strM5461c2 = m5461c(this.f9357v);
        mws mwsVar = this.f9358w;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        nba it = mwsVar.iterator();
        boolean z8 = false;
        while (true) {
            str = strM5460b12;
            if (!it.hasNext()) {
                break;
            }
            jxp jxpVar = (jxp) it.next();
            sb.append("\n");
            sb.append(m5459a(2));
            sb.append(m5460b(jxpVar, 2));
            sb.append(",");
            it = it;
            strM5460b12 = str;
            z8 = true;
        }
        if (z8) {
            sb.append("\n");
            sb.append(m5459a(1));
        }
        sb.append("]");
        return "CaptureSessionConfig {\n  cameraId = " + strM5460b + ",\n  streamCameraId = " + strM5460b2 + ",\n  camcorderCharacteristics = " + strM5460b3 + ",\n  captureRate = " + strM5460b4 + ",\n  videoResolution = " + strM5460b5 + ",\n  snapshotSize = " + strM5460b6 + ",\n  previewSize = " + strM5460b7 + ",\n  videoEncoderProfile = " + strM5460b8 + ",\n  audioEncoderProfile = " + strM5460b9 + ",\n  uri = " + strM5460b10 + ",\n  maxDuration = " + strM5460b11 + ",\n  maxFileSize = " + str + ",\n  shouldRecordLocationIfPermitted = " + z + ",\n  previewFpsRange = " + strM5460b13 + ",\n  recordFpsRange = " + strM5460b14 + ",\n  useContinuousAutoFocusOnDuringRecording = " + z2 + ",\n  thermalThrottleFps = false,\n  shouldUnlockAfAeWithSceneChange = " + z3 + pIeXJQLZLfgIN.KrmrEjjGfWG + z4 + ",\n  shouldVideoStabilizationOn = " + z5 + DNTdN.jJIJbWpP + z6 + ",\n  useLlv = " + z7 + ",\n  allSupportedCaptureRates = " + strM5461c + ",\n  supportedCaptureRates = " + strM5461c2 + ",\n  supportedVideoResolutions = " + sb.toString() + ",\n  cameraFacing = " + m5460b(this.f9359x, 1) + ",\n  captureSessionType = " + m5460b(this.f9360y, 1) + ",\n  sessionId = " + this.f9361z + ",\n  useMediaCodec = " + this.f9329A + ",\n  topShotEnabled = " + this.f9330B + ",\n  shouldSupportSpeechMode = " + this.f9331C + ",\n  viewfinderEffectEnabled = " + this.f9332D + ",\n  videoEffectEnabled = false,\n  amberEnabled = " + this.f9333E + ",\n  amethystEnabled = " + this.f9334F + ",\n  macroFocusEnabled = false,\n  emeraldEnabled = false,\n  featureCentralEnabled = false,\n}";
    }
}
