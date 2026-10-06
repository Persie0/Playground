package p000;

import android.hardware.camera2.CameraDevice;
import android.os.LocaleList;
import android.os.SystemClock;
import android.os.Trace;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: jm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0746jm {
    /* JADX INFO: renamed from: a */
    static LocaleList m13346a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    static void m13347b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13348c(CameraDevice cameraDevice) {
        if (cameraDevice != null) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            cameraDevice.getId();
            try {
                Trace.beginSection("CameraDevice-" + cameraDevice.getId() + "#close");
                cameraDevice.close();
                Trace.endSection();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                cameraDevice.getId();
                double d = jElapsedRealtimeNanos2;
                Double.isNaN(d);
                String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1)).getClass();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }
}
