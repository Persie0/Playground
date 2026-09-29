package p000;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t69 {
    /* JADX INFO: renamed from: a */
    public static int m21875a(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            objInvoke.getClass();
            return ((Integer) objInvoke).intValue();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21876b(SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        int iM21875a = m21875a(sidecarDeviceState);
        if (iM21875a < 0 || iM21875a > 4) {
            return 0;
        }
        return iM21875a;
    }

    /* JADX INFO: renamed from: c */
    public static List m21877c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        EmptyList emptyList = EmptyList.f47638a;
        sidecarWindowLayoutInfo.getClass();
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? emptyList : list;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            objInvoke.getClass();
            return (List) objInvoke;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m21878d(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}
