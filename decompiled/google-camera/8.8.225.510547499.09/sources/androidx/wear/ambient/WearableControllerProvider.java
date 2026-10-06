package androidx.wear.ambient;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarProvider;
import com.google.android.wearable.compat.WearableActivityController;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.awh;
import p000.ook;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearableControllerProvider {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f1705a;

    /* JADX INFO: renamed from: androidx.wear.ambient.WearableControllerProvider$1 */
    /* JADX INFO: compiled from: PG */
    final class C00411 extends WearableActivityController.AmbientCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AmbientDelegate.AmbientCallback f1706a;

        public C00411(AmbientDelegate.AmbientCallback ambientCallback) {
            this.f1706a = ambientCallback;
        }

        public final void onEnterAmbient(Bundle bundle) {
            this.f1706a.onEnterAmbient(bundle);
        }

        public final void onExitAmbient() {
            this.f1706a.onExitAmbient();
        }

        public final void onInvalidateAmbientOffload() {
            this.f1706a.onAmbientOffloadInvalidated();
        }

        public final void onUpdateAmbient() {
            this.f1706a.onUpdateAmbient();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final IBinder m1666a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    /* JADX INFO: renamed from: b */
    public static final awh m1667b() {
        String strGroup;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            awh awhVar = awh.f2580a;
            if (apiVersion != null && !ook.m18800n(apiVersion)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                    return null;
                }
                int i = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                if (strGroup2 == null) {
                    return null;
                }
                int i2 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                if (strGroup3 == null) {
                    return null;
                }
                int i3 = Integer.parseInt(strGroup3);
                String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                strGroup4.getClass();
                return new awh(i, i2, i3, strGroup4);
            }
            return null;
        } catch (NoClassDefFoundError e) {
            return null;
        } catch (UnsupportedOperationException e2) {
            return null;
        }
    }

    public final WearableActivityController getWearableController(Activity activity, AmbientDelegate.AmbientCallback ambientCallback) {
        SharedLibraryVersion.verifySharedLibraryPresent();
        C00411 c00411 = new C00411(ambientCallback);
        if (!f1705a) {
            try {
                if (!".onEnterAmbient".equals("." + WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class).getName())) {
                    throw new NoSuchMethodException();
                }
                f1705a = true;
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
            }
        }
        return new WearableActivityController("WearableControllerProvider", activity, c00411);
    }
}
