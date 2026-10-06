package com.google.googlex.gcam;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class QcColorCalibration {

    /* JADX INFO: renamed from: a */
    public transient long f8343a;

    /* JADX INFO: renamed from: b */
    protected transient boolean f8344b;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public class IlluminantData {

        /* JADX INFO: renamed from: a */
        public transient long f8345a;

        /* JADX INFO: renamed from: b */
        protected transient boolean f8346b;

        public IlluminantData() {
            long jNew_QcColorCalibration_IlluminantData = GcamModuleJNI.new_QcColorCalibration_IlluminantData();
            this.f8346b = true;
            this.f8345a = jNew_QcColorCalibration_IlluminantData;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m5088a() {
            long j = this.f8345a;
            if (j != 0) {
                if (this.f8346b) {
                    this.f8346b = false;
                    GcamModuleJNI.delete_QcColorCalibration_IlluminantData(j);
                }
                this.f8345a = 0L;
            }
        }

        protected final void finalize() {
            m5088a();
        }
    }

    public QcColorCalibration() {
        long jNew_QcColorCalibration = GcamModuleJNI.new_QcColorCalibration();
        this.f8344b = true;
        this.f8343a = jNew_QcColorCalibration;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m5086a() {
        long j = this.f8343a;
        if (j != 0) {
            if (this.f8344b) {
                this.f8344b = false;
                GcamModuleJNI.delete_QcColorCalibration(j);
            }
            this.f8343a = 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5087b(float f) {
        GcamModuleJNI.QcColorCalibration_grgb_ratio_set(this.f8343a, this, f);
    }

    protected final void finalize() {
        m5086a();
    }
}
