package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Phaser;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ept extends gnj {

    /* JADX INFO: renamed from: u */
    private static final nbh f15038u = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurInflightShot");

    /* JADX INFO: renamed from: a */
    public boolean f15039a;

    /* JADX INFO: renamed from: b */
    public final eem f15040b;

    /* JADX INFO: renamed from: c */
    public final kba f15041c;

    /* JADX INFO: renamed from: d */
    public final eqz f15042d;

    /* JADX INFO: renamed from: e */
    public final int f15043e;

    /* JADX INFO: renamed from: f */
    public final UUID f15044f;

    /* JADX INFO: renamed from: g */
    public final Phaser f15045g;

    /* JADX INFO: renamed from: h */
    public final int f15046h;

    /* JADX INFO: renamed from: i */
    public Bitmap f15047i;

    /* JADX INFO: renamed from: j */
    public ntx f15048j;

    /* JADX INFO: renamed from: v */
    private final ArrayList f15049v;

    /* JADX INFO: renamed from: w */
    private final drj f15050w;

    public ept(drj drjVar, glk glkVar, ebn ebnVar, BurstSpec burstSpec, kpp kppVar, eem eemVar, kba kbaVar, eqz eqzVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(glkVar, ebnVar, burstSpec, kppVar, null, null);
        this.f15040b = eemVar;
        this.f15046h = eemVar.m7218a();
        this.f15041c = kbaVar;
        this.f15042d = eqzVar;
        this.f15043e = i;
        this.f15044f = UUID.randomUUID();
        this.f15039a = false;
        this.f15045g = new Phaser(2);
        this.f15049v = new ArrayList();
        this.f15048j = null;
        this.f15050w = drjVar;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m7642a() {
        ArrayList arrayList = new ArrayList(this.f15049v);
        this.f15049v.clear();
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [gyh, java.lang.Object] */
    @Override // p000.gnj
    /* JADX INFO: renamed from: b */
    public final void mo7643b() {
        this.f15041c.close();
        m7646e();
        ArrayList arrayListM7642a = m7642a();
        if (arrayListM7642a.isEmpty()) {
            this.f25745t.f25502c.mo9902h();
        } else {
            int size = arrayListM7642a.size();
            for (int i = 0; i < size; i++) {
                ntv ntvVar = (ntv) arrayListM7642a.get(i);
                ntvVar.f44591b.m4953c();
                ntvVar.f44593d.run();
            }
        }
        super.mo7643b();
    }

    @Override // p000.gnj
    /* JADX INFO: renamed from: c */
    public final void mo7644c(key keyVar) {
        super.mo7644c(keyVar);
        ntv ntvVarM6628h = this.f15050w.m6628h(keyVar);
        if (ntvVarM6628h != null) {
            this.f15049v.add(ntvVarM6628h);
            return;
        }
        kfd kfdVarMo7041b = keyVar.mo7041b();
        ((nbe) ((nbe) f15038u.m17252c()).mo17276G(1747)).mo17292q("No valid RAW image found for frame %s, adding empty frame.", kfdVarMo7041b != null ? kfdVarMo7041b.f35812c : -1L);
        this.f15049v.add(ntv.m17691a(new RawWriteView(), new FrameMetadata(), new SpatialGainMap(), cik.f5807o));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m7645d() {
        ntx ntxVar = this.f15048j;
        if (ntxVar == null) {
            this.f25745t.f25502c.mo9902h();
        } else {
            ntxVar.mo5162b();
            this.f15048j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7646e() {
        this.f15045g.arrive();
    }
}
