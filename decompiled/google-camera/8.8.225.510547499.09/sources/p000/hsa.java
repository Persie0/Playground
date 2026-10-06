package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum hsa {
    f29385a,
    OPTICAL_FLOW,
    GYRO,
    GPU_TEMPLATE,
    ML,
    HYBRID;

    /* JADX INFO: renamed from: a */
    public static hsa m10682a(int i) {
        switch (i) {
            case 1:
                return OPTICAL_FLOW;
            case 2:
                return GYRO;
            case 3:
                return GPU_TEMPLATE;
            case 4:
                return ML;
            case 5:
                return HYBRID;
            default:
                return f29385a;
        }
    }
}
