package p000;

import android.view.InputDevice;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s2d {

    /* JADX INFO: renamed from: a */
    public static p04 f60221a;

    /* JADX INFO: renamed from: a */
    public static final MotionEvent m21011a(C3299li c3299li) {
        return (MotionEvent) c3299li.f49692c;
    }

    /* JADX INFO: renamed from: b */
    public static final int m21012b(MotionEvent motionEvent) {
        if (!motionEvent.isFromSource(2097152)) {
            C3386nv.m17626m("MotionEvent must be a touch navigation source");
            return 0;
        }
        InputDevice device = motionEvent.getDevice();
        if (device != null) {
            InputDevice.MotionRange motionRange = device.getMotionRange(0);
            InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
            if (motionRange == null || motionRange2 != null) {
                if (motionRange2 != null && motionRange == null) {
                    return 2;
                }
                if (motionRange != null && motionRange2 != null) {
                    float range = motionRange.getRange();
                    float range2 = motionRange2.getRange();
                    if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                        if (range2 > range && (range == 0.0f || range2 / range >= 5.0f)) {
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }
        return 0;
    }
}
