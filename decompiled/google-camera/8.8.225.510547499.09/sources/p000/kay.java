package p000;

import android.view.Display;
import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kay {
    CLOCKWISE_0(0),
    CLOCKWISE_90(90),
    CLOCKWISE_180(180),
    CLOCKWISE_270(270);


    /* JADX INFO: renamed from: e */
    public final int f35503e;

    kay(int i) {
        this.f35503e = i;
    }

    /* JADX INFO: renamed from: b */
    public static kay m13889b(int i) {
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return CLOCKWISE_0;
            case 0:
                return CLOCKWISE_0;
            case 90:
                return CLOCKWISE_90;
            case 180:
                return CLOCKWISE_180;
            case 270:
                return CLOCKWISE_270;
            default:
                int iAbs = (((Math.abs(i / 360) * 360) + 360) + i) % 360;
                if (iAbs > 315 || iAbs <= 45) {
                    return CLOCKWISE_0;
                }
                if (iAbs > 135) {
                    return iAbs <= 225 ? CLOCKWISE_180 : CLOCKWISE_270;
                }
                return CLOCKWISE_90;
        }
    }

    /* JADX INFO: renamed from: c */
    public static kay m13890c(Display display) {
        return m13892e(display.getRotation());
    }

    /* JADX INFO: renamed from: d */
    public static kay m13891d(int i) {
        return m13889b((360 - i) % 360);
    }

    /* JADX INFO: renamed from: e */
    public static kay m13892e(int i) {
        switch (i) {
            case 0:
                return m13891d(0);
            case 1:
                return m13891d(90);
            case 2:
                return m13891d(180);
            case 3:
                return m13891d(270);
            default:
                return CLOCKWISE_0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13893a() {
        return (360 - this.f35503e) % 360;
    }
}
