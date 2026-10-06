package p000;

import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ViewfinderProcessingOptions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eet implements msi {

    /* JADX INFO: renamed from: a */
    private final ebv f13737a;

    /* JADX INFO: renamed from: b */
    private final edk f13738b;

    /* JADX INFO: renamed from: c */
    private final dhv f13739c;

    /* JADX INFO: renamed from: d */
    private final ebq f13740d;

    /* JADX INFO: renamed from: e */
    private final nrv f13741e;

    /* JADX INFO: renamed from: f */
    private final eby f13742f;

    /* JADX INFO: renamed from: g */
    private final eba f13743g;

    /* JADX INFO: renamed from: h */
    private final jwn f13744h;

    public eet(ebv ebvVar, edk edkVar, dhv dhvVar, ebq ebqVar, nrv nrvVar, eby ebyVar, eba ebaVar, jwn jwnVar) {
        this.f13737a = ebvVar;
        this.f13738b = edkVar;
        this.f13739c = dhvVar;
        this.f13740d = ebqVar;
        this.f13741e = nrvVar;
        this.f13742f = ebyVar;
        this.f13743g = ebaVar;
        this.f13744h = jwnVar;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ViewfinderProcessingOptions mo6051a() {
        ViewfinderProcessingOptions viewfinderProcessingOptions = new ViewfinderProcessingOptions();
        if (this.f13738b == edk.LONG_EXPOSURE || ((Boolean) this.f13742f.f13316b.mo3831be()).booleanValue()) {
            GcamModuleJNI.ViewfinderProcessingOptions_motion_processing_method_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, this.f13741e.f44298c);
            GcamModuleJNI.ViewfinderProcessingOptions_process_gyro_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, true);
            if (this.f13737a.f13306h) {
                GcamModuleJNI.ViewfinderProcessingOptions_compute_total_capture_time_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, true);
                eba ebaVar = this.f13743g;
                ebaVar.f13188c = true;
                ebaVar.f13187b = false;
                ebaVar.f13191f = this.f13737a.m7086e((cle) this.f13744h.mo3831be());
                BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptionsM7037a = ebaVar.m7037a();
                GcamModuleJNI.ViewfinderProcessingOptions_burst_spec_options_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, buildPayloadBurstSpecOptionsM7037a.f8232a, buildPayloadBurstSpecOptionsM7037a);
            }
        }
        dhv dhvVar = this.f13739c;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        GcamModuleJNI.ViewfinderProcessingOptions_verbose_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, false);
        GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_set(viewfinderProcessingOptions.f8379a, viewfinderProcessingOptions, this.f13740d.m7074f(this.f13738b));
        return viewfinderProcessingOptions;
    }
}
