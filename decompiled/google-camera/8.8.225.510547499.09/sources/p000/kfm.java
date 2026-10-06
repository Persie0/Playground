package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kfm {

    /* JADX INFO: renamed from: a */
    public kgb f35819a;

    /* JADX INFO: renamed from: b */
    public kgb f35820b;

    /* JADX INFO: renamed from: c */
    public kgb f35821c;

    /* JADX INFO: renamed from: d */
    public long f35822d;

    /* JADX INFO: renamed from: e */
    public int f35823e;

    /* JADX INFO: renamed from: f */
    public byte f35824f;

    /* JADX INFO: renamed from: g */
    private kmg f35825g;

    /* JADX INFO: renamed from: h */
    private kfx f35826h;

    /* JADX INFO: renamed from: i */
    private kgb f35827i;

    /* JADX INFO: renamed from: j */
    private kgb f35828j;

    /* JADX INFO: renamed from: k */
    private mwn f35829k;

    /* JADX INFO: renamed from: l */
    private mws f35830l;

    /* JADX INFO: renamed from: m */
    private mxi f35831m;

    /* JADX INFO: renamed from: n */
    private mxk f35832n;

    /* JADX INFO: renamed from: o */
    private kea f35833o;

    /* JADX INFO: renamed from: p */
    private kev f35834p;

    /* JADX INFO: renamed from: q */
    private mxk f35835q;

    /* JADX INFO: renamed from: r */
    private kfv f35836r;

    /* JADX INFO: renamed from: b */
    public final mxi m14141b() {
        if (this.f35831m == null) {
            this.f35831m = mxk.m17132D();
        }
        return this.f35831m;
    }

    /* JADX INFO: renamed from: c */
    public final void m14142c(Set set) {
        m14141b().m17129h(set);
    }

    /* JADX INFO: renamed from: d */
    public final void m14143d(kgi kgiVar) {
        if (this.f35829k == null) {
            this.f35829k = mws.m17090e();
        }
        this.f35829k.m17082g(kgiVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m14144e(kev kevVar) {
        if (kevVar == null) {
            throw new NullPointerException("Null cameraDeviceErrorListener");
        }
        this.f35834p = kevVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m14145f(kmg kmgVar) {
        if (kmgVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f35825g = kmgVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m14146g(kfx kfxVar) {
        if (kfxVar == null) {
            throw new NullPointerException("Null operatingMode");
        }
        this.f35826h = kfxVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m14147h(mxk mxkVar) {
        if (mxkVar == null) {
            throw new NullPointerException(CswIK.BMIiD);
        }
        this.f35835q = mxkVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m14148i(kgb kgbVar) {
        if (kgbVar == null) {
            throw new NullPointerException("Null repeatingCaptureTemplate");
        }
        this.f35828j = kgbVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m14149j(kgb kgbVar) {
        if (kgbVar == null) {
            throw new NullPointerException("Null template");
        }
        this.f35827i = kgbVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m14150k(kfv kfvVar) {
        if (kfvVar == null) {
            throw new NullPointerException("Null frameListener");
        }
        this.f35836r = kfvVar;
    }

    /* JADX INFO: renamed from: a */
    public final kfn m14140a() {
        kmg kmgVar;
        kfx kfxVar;
        kgb kgbVar;
        kgb kgbVar2;
        kgb kgbVar3;
        kgb kgbVar4;
        kgb kgbVar5;
        kfv kfvVar;
        kea keaVar;
        kev kevVar;
        mxk mxkVar;
        kgj kgjVar;
        kea keaVar2 = this.f35833o;
        if (!(keaVar2 == null ? mqu.f41450a : mrm.m16829i(keaVar2)).mo16813g()) {
            this.f35833o = new keb();
        }
        mwn mwnVar = this.f35829k;
        if (mwnVar != null) {
            this.f35830l = mwnVar.m17081f();
        } else if (this.f35830l == null) {
            int i = mws.f41739d;
            this.f35830l = mzr.f41857a;
        }
        mxi mxiVar = this.f35831m;
        if (mxiVar != null) {
            this.f35832n = mxiVar.mo17127f();
        } else if (this.f35832n == null) {
            this.f35832n = mzx.f41874a;
        }
        if (this.f35824f == 15 && (kmgVar = this.f35825g) != null && (kfxVar = this.f35826h) != null && (kgbVar = this.f35827i) != null && (kgbVar2 = this.f35819a) != null && (kgbVar3 = this.f35820b) != null && (kgbVar4 = this.f35821c) != null && (kgbVar5 = this.f35828j) != null && (kfvVar = this.f35836r) != null && (keaVar = this.f35833o) != null && (kevVar = this.f35834p) != null && (mxkVar = this.f35835q) != null) {
            kfn kfnVar = new kfn(kmgVar, kfxVar, kgbVar, kgbVar2, kgbVar3, kgbVar4, kgbVar5, kfvVar, this.f35830l, this.f35832n, keaVar, kevVar, this.f35822d, this.f35823e, mxkVar, null);
            mws mwsVar = kfnVar.f35843g;
            int i2 = ((mzr) mwsVar).f41859c;
            kfx kfxVar2 = kfnVar.f35838b;
            kfx kfxVar3 = kfx.HIGH_SPEED;
            if (kfxVar2 == kfxVar3) {
                if (i2 > 2) {
                    throw new IllegalStateException(lku.m15665s(VCYBIzY.cpwXuQiF, kfxVar3, Integer.valueOf(i2)));
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    kgi kgiVar = (kgi) mwsVar.get(i3);
                    lku.m15614I((kgiVar.f35899a == kgj.SURFACE || (kgjVar = kgiVar.f35899a) == kgj.SURFACE_DEFERRED || kgjVar == kgj.SURFACE_VIEW) ? true : kgjVar == kgj.SURFACE_TEXTURE, "Streams in highspeed operating mode must be a viewfinder or MediaRecorder/MediaCodec surface.");
                }
            }
            lku.m15614I(i2 > 0, "At least one stream should be provided");
            return kfnVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f35825g == null) {
            sb.append(" cameraId");
        }
        if (this.f35826h == null) {
            sb.append(" operatingMode");
        }
        if (this.f35827i == null) {
            sb.append(" template");
        }
        if (this.f35819a == null) {
            sb.append(" captureTemplate");
        }
        if (this.f35820b == null) {
            sb.append(" reprocessingTemplate");
        }
        if (this.f35821c == null) {
            sb.append(" repeatingTemplate");
        }
        if (this.f35828j == null) {
            sb.append(" repeatingCaptureTemplate");
        }
        if (this.f35836r == null) {
            sb.append(" frameListener");
        }
        if (this.f35833o == null) {
            sb.append(yTyWiTtGtnBhy.tctSZdmkZk);
        }
        if (this.f35834p == null) {
            sb.append(" cameraDeviceErrorListener");
        }
        if ((this.f35824f & 1) == 0) {
            sb.append(" result3ATimeoutNs");
        }
        if ((this.f35824f & 2) == 0) {
            sb.append(" result3ATimeoutFrameCount");
        }
        if (this.f35835q == null) {
            sb.append(" quirks");
        }
        if ((this.f35824f & 4) == 0) {
            sb.append(" autoResume");
        }
        if ((this.f35824f & 8) == 0) {
            sb.append(" useCameraPipe");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
