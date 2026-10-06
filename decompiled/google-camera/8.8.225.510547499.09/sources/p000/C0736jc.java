package p000;

import android.content.res.Resources;
import android.hardware.camera2.CaptureRequest;
import android.widget.ThemedSpinnerAdapter;
import java.util.Map;

/* JADX INFO: renamed from: jc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0736jc {
    /* JADX INFO: renamed from: a */
    static void m12883a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (aeb.m318b(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12884b(Map map, Map map2) {
        map.putAll(map2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m12885c(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        builder.set((CaptureRequest.Key) obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m12886d(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            m12885c(builder, entry.getKey(), entry.getValue());
        }
    }
}
