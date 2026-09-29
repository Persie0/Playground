package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w69 {
    /* JADX INFO: renamed from: a */
    public static SidecarInterface m23779a(Context context) {
        context.getClass();
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: b */
    public static kpa m23780b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            kpa kpaVar = kpa.f48300f;
            return iad.m13751a(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
