package com.google.googlex.gcam;

import p000.nsf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AeShotParams {

    /* JADX INFO: renamed from: a */
    public transient long f8226a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8227b;

    public AeShotParams() {
        this(GcamModuleJNI.new_AeShotParams__SWIG_0(), true);
    }

    public AeShotParams(long j, boolean z) {
        this.f8227b = z;
        this.f8226a = j;
    }

    /* JADX INFO: renamed from: a */
    public final NormalizedRect m4884a() {
        long jAeShotParams_crop_get = GcamModuleJNI.AeShotParams_crop_get(this.f8226a, this);
        if (jAeShotParams_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_crop_get, false);
    }

    /* JADX INFO: renamed from: b */
    public final NormalizedRect m4885b() {
        long jAeShotParams_merged_crop_get = GcamModuleJNI.AeShotParams_merged_crop_get(this.f8226a, this);
        if (jAeShotParams_merged_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_merged_crop_get, false);
    }

    /* JADX INFO: renamed from: c */
    public final WeightedNormalizedRectVector m4886c() {
        long jAeShotParams_weighted_metering_areas_get = GcamModuleJNI.AeShotParams_weighted_metering_areas_get(this.f8226a, this);
        if (jAeShotParams_weighted_metering_areas_get == 0) {
            return null;
        }
        return new WeightedNormalizedRectVector(jAeShotParams_weighted_metering_areas_get);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m4887d() {
        long j = this.f8226a;
        if (j != 0) {
            if (this.f8227b) {
                this.f8227b = false;
                GcamModuleJNI.delete_AeShotParams(j);
            }
            this.f8226a = 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4888e(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_crop_set(this.f8226a, this, NormalizedRect.m5050a(normalizedRect), normalizedRect);
    }

    /* JADX INFO: renamed from: f */
    public final void m4889f(float f) {
        GcamModuleJNI.AeShotParams_exposure_compensation_set(this.f8226a, this, f);
    }

    protected final void finalize() {
        m4887d();
    }

    /* JADX INFO: renamed from: g */
    public final void m4890g(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_merged_crop_set(this.f8226a, this, NormalizedRect.m5050a(normalizedRect), normalizedRect);
    }

    /* JADX INFO: renamed from: h */
    public final void m4891h(boolean z) {
        GcamModuleJNI.AeShotParams_relighting_expected_set(this.f8226a, this, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m4892i(int i) {
        GcamModuleJNI.AeShotParams_target_height_set(this.f8226a, this, i);
    }

    /* JADX INFO: renamed from: j */
    public final void m4893j(int i) {
        GcamModuleJNI.AeShotParams_target_width_set(this.f8226a, this, i);
    }

    /* JADX INFO: renamed from: k */
    public final void m4894k(nsf nsfVar) {
        GcamModuleJNI.AeShotParams_ux_mode_set(this.f8226a, this, nsfVar.f44386e);
    }
}
