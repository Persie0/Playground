package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmn implements kmk {

    /* JADX INFO: renamed from: a */
    private final CameraManager f36547a;

    /* JADX INFO: renamed from: b */
    private final kbo f36548b;

    public kmn(CameraManager cameraManager, kbo kboVar) {
        this.f36547a = cameraManager;
        this.f36548b = kboVar.mo6314a("DefaultCamIdsPrdr");
    }

    @Override // p000.kmk
    /* JADX INFO: renamed from: a */
    public final List mo14578a() {
        try {
            String[] cameraIdList = this.f36547a.getCameraIdList();
            cameraIdList.getClass();
            int length = cameraIdList.length;
            if (length == 0) {
                this.f36548b.mo13942d("No cameras available");
                throw new kmm();
            }
            ArrayList arrayList = new ArrayList(length);
            for (String str : cameraIdList) {
                arrayList.add(kmg.m14575b(str));
            }
            return mws.m17095j(arrayList);
        } catch (CameraAccessException e) {
            this.f36548b.mo13942d("Unable to read camera list.");
            throw new kml("Unable to read camera list.", e.getReason(), e);
        }
    }

    @Override // p000.kmk
    /* JADX INFO: renamed from: b */
    public final List mo14579b() {
        int i = mws.f41739d;
        return mzr.f41857a;
    }
}
