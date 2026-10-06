package p000;

import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gzp {
    OFF(0),
    THREE(3),
    TEN(10),
    AUTO(-1);


    /* JADX INFO: renamed from: g */
    public final int f26960g;

    /* JADX INFO: renamed from: e */
    public static final gzp f26957e = OFF;

    /* JADX INFO: renamed from: f */
    public static final int[] f26958f = new int[values().length];

    static {
        int i = 0;
        gzp[] gzpVarArrValues = values();
        int length = gzpVarArrValues.length;
        int i2 = 0;
        while (i < length) {
            f26958f[i2] = gzpVarArrValues[i].f26960g;
            i++;
            i2++;
        }
    }

    gzp(int i) {
        this.f26960g = i;
    }

    /* JADX INFO: renamed from: a */
    public static gzp m10019a(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return AUTO;
            case 0:
                return OFF;
            case 3:
                return THREE;
            case 10:
                return TEN;
            default:
                return f26957e;
        }
    }
}
