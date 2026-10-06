package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FaceInfo {

    /* JADX INFO: renamed from: a */
    public transient long f8247a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8248b;

    /* JADX INFO: compiled from: PG */
    public class Landmark {

        /* JADX INFO: renamed from: a */
        public transient long f8249a;

        /* JADX INFO: renamed from: b */
        protected transient boolean f8250b;

        public Landmark() {
            long jNew_FaceInfo_Landmark = GcamModuleJNI.new_FaceInfo_Landmark();
            this.f8250b = true;
            this.f8249a = jNew_FaceInfo_Landmark;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m4933a() {
            long j = this.f8249a;
            if (j != 0) {
                if (this.f8250b) {
                    this.f8250b = false;
                    GcamModuleJNI.delete_FaceInfo_Landmark(j);
                }
                this.f8249a = 0L;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4934b(float f) {
            GcamModuleJNI.FaceInfo_Landmark_x_set(this.f8249a, this, f);
        }

        /* JADX INFO: renamed from: c */
        public final void m4935c(float f) {
            GcamModuleJNI.FaceInfo_Landmark_y_set(this.f8249a, this, f);
        }

        protected final void finalize() {
            m4933a();
        }
    }

    public FaceInfo() {
        this(GcamModuleJNI.new_FaceInfo__SWIG_0(), true);
    }

    public FaceInfo(long j, boolean z) {
        this.f8248b = z;
        this.f8247a = j;
    }

    /* JADX INFO: renamed from: a */
    public final LandmarkMap m4928a() {
        long jFaceInfo_landmarks_get = GcamModuleJNI.FaceInfo_landmarks_get(this.f8247a, this);
        if (jFaceInfo_landmarks_get == 0) {
            return null;
        }
        return new LandmarkMap(jFaceInfo_landmarks_get);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4929b() {
        long j = this.f8247a;
        if (j != 0) {
            if (this.f8248b) {
                this.f8248b = false;
                GcamModuleJNI.delete_FaceInfo(j);
            }
            this.f8247a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4930c(float f) {
        GcamModuleJNI.FaceInfo_pos_x_set(this.f8247a, this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4931d(float f) {
        GcamModuleJNI.FaceInfo_pos_y_set(this.f8247a, this, f);
    }

    /* JADX INFO: renamed from: e */
    public final void m4932e(float f) {
        GcamModuleJNI.FaceInfo_size_set(this.f8247a, this, f);
    }

    protected final void finalize() {
        m4929b();
    }
}
