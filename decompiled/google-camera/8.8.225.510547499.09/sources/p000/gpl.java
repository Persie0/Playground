package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOutputsInterface;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpl implements gpu {

    /* JADX INFO: renamed from: a */
    public static final nbh f25955a = nbh.m17259h("com/google/android/apps/camera/portrait/PortraitControllerImpl");

    /* JADX INFO: renamed from: b */
    public static final String f25956b = GcamModuleJNI.kRequestCameraPrimary_get();

    /* JADX INFO: renamed from: c */
    public static final String f25957c = GcamModuleJNI.kRequestCameraSecondaryTele_get();

    /* JADX INFO: renamed from: d */
    public static final String f25958d = GcamModuleJNI.kRequestCameraSecondaryWide_get();

    /* JADX INFO: renamed from: e */
    public final Executor f25959e;

    /* JADX INFO: renamed from: f */
    public final dhv f25960f;

    /* JADX INFO: renamed from: g */
    public final Object f25961g;

    /* JADX INFO: renamed from: h */
    public final Object f25962h;

    /* JADX INFO: renamed from: i */
    public final HashMap f25963i;

    /* JADX INFO: renamed from: j */
    public final PortraitOutputsInterface f25964j;

    /* JADX INFO: renamed from: k */
    public boolean f25965k;

    /* JADX INFO: renamed from: l */
    public final gpx f25966l;

    /* JADX INFO: renamed from: m */
    public final gpw f25967m;

    /* JADX INFO: renamed from: n */
    private final fxs f25968n;

    /* JADX INFO: renamed from: o */
    private final ebv f25969o;

    /* JADX INFO: renamed from: p */
    private final boolean f25970p;

    /* JADX INFO: renamed from: q */
    private final gvw f25971q;

    /* JADX INFO: renamed from: r */
    private final oju f25972r;

    public gpl(gpx gpxVar, gpw gpwVar, fxs fxsVar, Executor executor, dhv dhvVar, ebv ebvVar, gvw gvwVar, oju ojuVar) {
        Object obj = new Object();
        this.f25961g = obj;
        this.f25962h = new Object();
        this.f25963i = new HashMap();
        this.f25964j = new PortraitOutputsInterface();
        this.f25965k = false;
        synchronized (obj) {
            this.f25966l = gpxVar;
            this.f25967m = gpwVar;
        }
        this.f25968n = fxsVar;
        this.f25959e = executor;
        this.f25960f = dhvVar;
        this.f25969o = ebvVar;
        this.f25970p = dhvVar.mo6184l(dio.f11663e);
        this.f25971q = gvwVar;
        this.f25972r = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static gpv m9601a(String str, String str2) {
        return enc.m7549e(m9602b(str), m9602b(str2), mqu.f41450a);
    }

    /* JADX INFO: renamed from: b */
    public static mrm m9602b(String str) {
        if (mro.m16832b(str)) {
            return mqu.f41450a;
        }
        try {
            cvy cvyVar = bff.f3083a;
            return mrm.m16829i(bfs.m2325a(str));
        } catch (bfc e) {
            ((nbe) ((nbe) f25955a.m17251b()).mo17276G((char) 3147)).mo17290o("String was not a serialized XMPMeta.");
            return mqu.f41450a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9603f(ihk ihkVar) {
        mrm mrmVar = (mrm) ihkVar.f30967b;
        boolean zMo16813g = mrmVar.mo16813g();
        mrm mrmVar2 = (mrm) ihkVar.f30966a;
        return ((zMo16813g && !((InterleavedImageU8) mrmVar.mo16809c()).m5008h()) || (mrmVar2.mo16813g() && ((HardwareBuffer) mrmVar2.mo16809c()).getWidth() > 0 && ((HardwareBuffer) mrmVar2.mo16809c()).getHeight() > 0)) ? false : true;
    }

    @Override // p000.gpu
    /* JADX INFO: renamed from: c */
    public final void mo9604c() {
        this.f25959e.execute(new ghv(this, 13));
    }

    @Override // p000.gpu
    /* JADX INFO: renamed from: d */
    public final void mo9605d() {
    }

    @Override // p000.gpu
    /* JADX INFO: renamed from: e */
    public final nps mo9606e(long j, InterleavedImageU8 interleavedImageU8, InterleavedImageU16 interleavedImageU16, fvu fvuVar, PortraitRequest portraitRequest, RawReadView rawReadView, ShotMetadata shotMetadata, RawReadView rawReadView2, ShotMetadata shotMetadata2, ehn ehnVar) {
        Object obj = this.f25968n.f23811a.f34942d;
        GcamModuleJNI.PortraitRequest_embed_gdepth_metadata_set(portraitRequest.f8338a, portraitRequest, this.f25970p);
        if (fvuVar.mo14558k().equals(kmq.f36557a)) {
            if (this.f25960f.mo6184l(dio.f11684z)) {
                portraitRequest.m5078c(nrg.f44184c);
            } else {
                portraitRequest.m5078c(nrg.f44182a);
            }
        } else if (this.f25960f.mo6184l(dio.f11683y)) {
            portraitRequest.m5078c(nrg.f44183b);
        }
        GcamModuleJNI.PortraitRequest_allow_raw_blur_rear_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11646C));
        GcamModuleJNI.PortraitRequest_allow_raw_blur_front_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11645B));
        GcamModuleJNI.PortraitRequest_use_opencl_depth_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11682x));
        int iM7550f = this.f25960f.mo6184l(dio.f11648E) ? enc.m7550f(3) : enc.m7550f(1);
        nsb nsbVar = nsb.f44352d[iM7550f];
        if (nsbVar.f44353e != iM7550f) {
            int i = 0;
            while (true) {
                nsb[] nsbVarArr = nsb.f44352d;
                if (i >= 3) {
                    throw new IllegalArgumentException("No enum " + nsb.class.toString() + " with value " + iM7550f);
                }
                nsb nsbVar2 = nsbVarArr[i];
                if (nsbVar2.f44353e == iM7550f) {
                    nsbVar = nsbVar2;
                    break;
                }
                i++;
            }
        }
        GcamModuleJNI.PortraitRequest_relighting_option_set(portraitRequest.f8338a, portraitRequest, nsbVar.f44353e);
        GcamModuleJNI.PortraitRequest_horizontal_flip_set(portraitRequest.f8338a, portraitRequest, this.f25971q.mo9812h(fvuVar.mo14558k()));
        GcamModuleJNI.PortraitRequest_use_spotlight_enhance_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11650G));
        GcamModuleJNI.PortraitRequest_use_spotlight_enhance_v2_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11651H));
        GcamModuleJNI.PortraitRequest_apply_portrait_matting_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11677s) && fvuVar.mo14558k().equals(kmq.f36557a));
        this.f25960f.mo6177e();
        GcamModuleJNI.PortraitRequest_use_gpu_resample_set(portraitRequest.f8338a, portraitRequest, false);
        GcamModuleJNI.PortraitRequest_enable_gpu_boost_set(portraitRequest.f8338a, portraitRequest, this.f25960f.mo6184l(dio.f11654K));
        mrm mrmVarM8495b = ((fjp) this.f25972r).m8495b();
        if (mrmVarM8495b.mo16813g()) {
            GcamModuleJNI.PortraitRequest_cache_directory_set(portraitRequest.f8338a, portraitRequest, ((File) mrmVarM8495b.mo16809c()).getAbsolutePath());
        }
        if (this.f25969o.m7084c()) {
            GcamModuleJNI.PortraitRequest_execute_finish_on_set(portraitRequest.f8338a, portraitRequest, nri.f44215c.f44219f);
        }
        return this.f25968n.m8939a(new gpi(this, j, ehnVar, this.f25960f.mo6184l(dio.f11652I), portraitRequest, rawReadView, shotMetadata, rawReadView2, shotMetadata2, interleavedImageU16, interleavedImageU8));
    }
}
