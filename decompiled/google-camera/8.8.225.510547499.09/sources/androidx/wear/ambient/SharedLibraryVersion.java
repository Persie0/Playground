package androidx.wear.ambient;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.wearable.WearableSharedLib;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p000.okv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedLibraryVersion {

    /* JADX INFO: compiled from: PG */
    final class PresenceHolder {

        /* JADX INFO: renamed from: a */
        static final boolean f1703a;

        static {
            boolean z;
            try {
                Class.forName("com.google.android.wearable.compat.WearableActivityController");
                z = true;
            } catch (ClassNotFoundException e) {
                z = false;
            }
            f1703a = z;
        }

        private PresenceHolder() {
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    final class VersionHolder {

        /* JADX INFO: renamed from: a */
        static final int f1704a = WearableSharedLib.version();

        private VersionHolder() {
        }
    }

    private SharedLibraryVersion() {
    }

    /* JADX INFO: renamed from: a */
    public static final int m1664a(SidecarDeviceState sidecarDeviceState) {
        int iIntValue;
        try {
            iIntValue = sidecarDeviceState.posture;
        } catch (NoSuchFieldError e) {
            try {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                objInvoke.getClass();
                iIntValue = ((Integer) objInvoke).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                iIntValue = 0;
            }
        }
        if (iIntValue < 0 || iIntValue > 4) {
            return 0;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public static final List m1665b(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            return list == null ? okv.f46215a : list;
        } catch (NoSuchFieldError e) {
            try {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                objInvoke.getClass();
                return (List) objInvoke;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                return okv.f46215a;
            }
        }
    }

    public static void verifySharedLibraryPresent() {
        if (!PresenceHolder.f1703a) {
            throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
        }
    }

    public static int version() {
        verifySharedLibraryPresent();
        return VersionHolder.f1704a;
    }
}
