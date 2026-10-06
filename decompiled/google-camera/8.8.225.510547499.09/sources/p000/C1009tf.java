package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: tf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1009tf {

    /* JADX INFO: renamed from: a */
    private final oju f47665a;

    /* JADX INFO: renamed from: b */
    private final Object f47666b;

    public C1009tf(oju ojuVar, drj drjVar, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        drjVar.getClass();
        this.f47665a = ojuVar;
        this.f47666b = new Object();
    }

    /* JADX INFO: renamed from: a */
    public final List m19445a() {
        synchronized (this.f47666b) {
        }
        try {
            String[] cameraIdList = ((CameraManager) this.f47665a.get()).getCameraIdList();
            cameraIdList.getClass();
            int length = cameraIdList.length;
            if (length == 0) {
                Log.w("CXCP", "Failed to query CameraManager#getCameraIdList: No values returned.");
                return okv.f46215a;
            }
            ArrayList arrayList = new ArrayList(length);
            for (String str : cameraIdList) {
                str.getClass();
                arrayList.add(C0952rc.m19372a(str));
            }
            return arrayList;
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            return null;
        }
    }
}
