package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dok extends doq {
    public dok() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dok(int i, Throwable th) {
        String str;
        switch (i) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "CANCEL_AFTER_SHUTDOWN";
                break;
            case 3:
                str = "CANCELLED_EXTERNALLY";
                break;
            case 4:
                str = "STATIC_SCENE_OR_NO_BETTER_FRAME";
                break;
            case 5:
                str = "START_TOO_CLOSE_TO_SHUTTER";
                break;
            case 6:
                str = "TOO_SHORT";
                break;
            case 7:
                str = "LONG_PRESS_TOO_SHORT";
                break;
            case 8:
                str = "TEST_REASON";
                break;
            default:
                str = "null";
                break;
        }
        if (i == 0) {
            throw null;
        }
        super("LongShot Video Cancelled.".concat(str), th);
    }

    public dok(Throwable th) {
        super(PMZiHihxLGEy.wzntqM, th);
    }
}
