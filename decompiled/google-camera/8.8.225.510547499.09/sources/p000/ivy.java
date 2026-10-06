package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2023.ExperimentalKeys;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivy {

    /* JADX INFO: renamed from: a */
    public static final CaptureRequest.Key f32453a;

    /* JADX INFO: renamed from: b */
    private static final boolean f32454b = ivz.m11820b(10);

    static {
        f32453a = m11818a(1) ? ExperimentalKeys.REQUEST_DEBUG_BASE_FRAME_NUMBER : null;
        if (m11818a(2)) {
            CaptureRequest.Key key = ExperimentalKeys.REQUEST_STAGGERED_HDR_MODE;
        }
        if (m11818a(2)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_STAGGERED_HDR_MODE;
        }
        if (m11818a(3)) {
            CaptureRequest.Key key3 = ExperimentalKeys.REQUEST_VIDEO_BOKEH_BLUR_LEVEL;
        }
        if (m11818a(3)) {
            CaptureResult.Key key4 = ExperimentalKeys.RESULT_VIDEO_BOKEH_BLUR_LEVEL;
        }
        if (m11818a(4)) {
            CaptureRequest.Key key5 = ExperimentalKeys.REQUEST_PROJECT11;
        }
        if (m11818a(4)) {
            CaptureResult.Key key6 = ExperimentalKeys.RESULT_PROJECT11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11818a(int i) {
        if (!f32454b) {
            return false;
        }
        try {
            return i <= ExperimentalKeys.getLibraryVersion();
        } catch (NoSuchFieldError e) {
            return false;
        } catch (NoSuchMethodError e2) {
            return false;
        }
    }
}
