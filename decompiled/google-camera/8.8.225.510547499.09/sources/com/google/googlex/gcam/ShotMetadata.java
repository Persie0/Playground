package com.google.googlex.gcam;

import p000.nrn;
import p000.nrw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ShotMetadata {

    /* JADX INFO: renamed from: a */
    public transient long f8356a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8357b;

    public ShotMetadata() {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_0());
    }

    public ShotMetadata(long j) {
        this.f8357b = true;
        this.f8356a = j;
    }

    public ShotMetadata(ShotMetadata shotMetadata) {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_1(m5095a(shotMetadata), shotMetadata));
    }

    /* JADX INFO: renamed from: a */
    public static long m5095a(ShotMetadata shotMetadata) {
        if (shotMetadata == null) {
            return 0L;
        }
        return shotMetadata.f8356a;
    }

    /* JADX INFO: renamed from: b */
    public final long m5096b() {
        return GcamModuleJNI.ShotMetadata_timestamp_unix_us_get(this.f8356a, this);
    }

    /* JADX INFO: renamed from: c */
    public final AeResults m5097c() {
        long jShotMetadata_ae_results_get = GcamModuleJNI.ShotMetadata_ae_results_get(this.f8356a, this);
        if (jShotMetadata_ae_results_get == 0) {
            return null;
        }
        return new AeResults(jShotMetadata_ae_results_get, false);
    }

    /* JADX INFO: renamed from: d */
    public final FrameMetadata m5098d() {
        long jShotMetadata_frame_metadata_get = GcamModuleJNI.ShotMetadata_frame_metadata_get(this.f8356a, this);
        if (jShotMetadata_frame_metadata_get == 0) {
            return null;
        }
        return new FrameMetadata(jShotMetadata_frame_metadata_get, false);
    }

    /* JADX INFO: renamed from: e */
    public final nrn m5099e() {
        return nrn.m17632a(GcamModuleJNI.ShotMetadata_image_rotation_get(this.f8356a, this));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[LOOP:0: B:10:0x0017->B:15:0x0022, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final nrw m5100f() {
        nrw[] nrwVarArr;
        nrw nrwVar;
        int iShotMetadata_output_color_space_get = GcamModuleJNI.ShotMetadata_output_color_space_get(this.f8356a, this);
        nrw[] nrwVarArr2 = nrw.f44304e;
        int i = 0;
        if (iShotMetadata_output_color_space_get >= 4 || iShotMetadata_output_color_space_get < 0) {
            while (true) {
                nrwVarArr = nrw.f44304e;
                if (i < 4) {
                    throw new IllegalArgumentException("No enum " + nrw.class.toString() + " with value " + iShotMetadata_output_color_space_get);
                }
                nrwVar = nrwVarArr[i];
                if (nrwVar.f44306f == iShotMetadata_output_color_space_get) {
                    i++;
                }
            }
        } else {
            nrwVar = nrwVarArr2[iShotMetadata_output_color_space_get];
            if (nrwVar.f44306f != iShotMetadata_output_color_space_get) {
                while (true) {
                    nrwVarArr = nrw.f44304e;
                    if (i < 4) {
                        throw new IllegalArgumentException("No enum " + nrw.class.toString() + " with value " + iShotMetadata_output_color_space_get);
                    }
                    nrwVar = nrwVarArr[i];
                    if (nrwVar.f44306f == iShotMetadata_output_color_space_get) {
                        i++;
                    }
                }
            }
        }
        return nrwVar;
    }

    protected final void finalize() {
        m5106l();
    }

    /* JADX INFO: renamed from: g */
    public final StaticMetadata m5101g() {
        long jShotMetadata_static_metadata_get = GcamModuleJNI.ShotMetadata_static_metadata_get(this.f8356a, this);
        if (jShotMetadata_static_metadata_get == 0) {
            return null;
        }
        return new StaticMetadata(jShotMetadata_static_metadata_get, false);
    }

    /* JADX INFO: renamed from: h */
    public final String m5102h() {
        return GcamModuleJNI.ShotMetadata_makernote_get(this.f8356a, this);
    }

    /* JADX INFO: renamed from: i */
    public final String m5103i() {
        return GcamModuleJNI.ShotMetadata_software_suffix_get(this.f8356a, this);
    }

    /* JADX INFO: renamed from: j */
    public final String m5104j() {
        return GcamModuleJNI.ShotMetadata_xmp_metadata_extended_get(this.f8356a, this);
    }

    /* JADX INFO: renamed from: k */
    public final String m5105k() {
        return GcamModuleJNI.ShotMetadata_xmp_metadata_main_get(this.f8356a, this);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m5106l() {
        long j = this.f8356a;
        if (j != 0) {
            if (this.f8357b) {
                this.f8357b = false;
                GcamModuleJNI.delete_ShotMetadata(j);
            }
            this.f8356a = 0L;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5107m(String str) {
        GcamModuleJNI.ShotMetadata_makernote_set(this.f8356a, this, str);
    }

    /* JADX INFO: renamed from: n */
    public final void m5108n(String str) {
        GcamModuleJNI.ShotMetadata_software_suffix_set(this.f8356a, this, str);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5109o() {
        return GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_get(this.f8356a, this);
    }
}
