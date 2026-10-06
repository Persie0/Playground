package p000;

import android.graphics.Rect;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axg {

    /* JADX INFO: renamed from: a */
    private static final String f2648a = axg.class.getSimpleName();

    public axg() {
    }

    public /* synthetic */ axg(byte[] bArr) {
    }

    /* JADX INFO: renamed from: a */
    public static final awx m2082a(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        awp awpVar;
        awo awoVar;
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new awx(okv.f46215a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        int iM1664a = SharedLibraryVersion.m1664a(sidecarDeviceState);
        try {
            sidecarDeviceState2.posture = iM1664a;
        } catch (NoSuchFieldError e) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState2, Integer.valueOf(iM1664a));
            } catch (IllegalAccessException e2) {
            } catch (NoSuchMethodException e3) {
            } catch (InvocationTargetException e4) {
            }
        }
        List<SidecarDisplayFeature> listM1665b = SharedLibraryVersion.m1665b(sidecarWindowLayoutInfo);
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature sidecarDisplayFeature : listM1665b) {
            sidecarDisplayFeature.getClass();
            f2648a.getClass();
            Object objMo2073b = new awg(sidecarDisplayFeature).mo2072a("Type must be either TYPE_FOLD or TYPE_HINGE", axf.f2637a).mo2072a(zuAgeeF.QAkGHhI, axf.f2639c).mo2072a("TYPE_FOLD must have 0 area", axf.f2640d).mo2072a("Feature be pinned to either left or top", axf.f2641e).mo2073b();
            awq awqVar = null;
            if (objMo2073b != null) {
                switch (((SidecarDisplayFeature) objMo2073b).getType()) {
                    case 1:
                        awpVar = awp.f2604a;
                        break;
                    case 2:
                        awpVar = awp.f2605b;
                        break;
                }
                switch (SharedLibraryVersion.m1664a(sidecarDeviceState2)) {
                    case 2:
                        awoVar = awo.f2602b;
                        break;
                    case 3:
                        awoVar = awo.f2601a;
                        break;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                awqVar = new awq(new avy(rect), awpVar, awoVar);
            }
            if (awqVar != null) {
                arrayList.add(awqVar);
            }
        }
        return new awx(arrayList);
    }
}
