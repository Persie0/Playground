package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.List;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0995ss {
    /* JADX INFO: renamed from: a */
    public static final OutputConfiguration m19419a(Size size, Class cls) {
        size.getClass();
        cls.getClass();
        return new OutputConfiguration(size, cls);
    }

    /* JADX INFO: renamed from: b */
    public static final List m19420b(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        List<Surface> surfaces = outputConfiguration.getSurfaces();
        surfaces.getClass();
        return surfaces;
    }

    /* JADX INFO: renamed from: c */
    public static final void m19421c(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.getClass();
        surface.getClass();
        outputConfiguration.addSurface(surface);
    }

    /* JADX INFO: renamed from: d */
    public static final void m19422d(OutputConfiguration outputConfiguration) {
        outputConfiguration.getClass();
        outputConfiguration.enableSurfaceSharing();
    }

    /* JADX INFO: renamed from: e */
    public static final void m19423e(CameraCaptureSession cameraCaptureSession, List list) throws CameraAccessException {
        cameraCaptureSession.getClass();
        list.getClass();
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    /* JADX INFO: renamed from: f */
    public static Intent m19424f(Activity activity) {
        Intent intentM66a = aax.m66a(activity);
        if (intentM66a != null) {
            return intentM66a;
        }
        String strM19426h = m19426h(activity);
        if (strM19426h == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM19426h);
        try {
            return m19427i(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM19426h + "' in manifest");
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static Intent m19425g(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM19427i = m19427i(context, componentName);
        if (strM19427i == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM19427i);
        return m19427i(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: h */
    public static String m19426h(Activity activity) {
        try {
            return m19427i(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m19427i(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString(yTyWiTtGtnBhy.wPU)) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? String.valueOf(context.getPackageName()).concat(string) : string;
    }
}
