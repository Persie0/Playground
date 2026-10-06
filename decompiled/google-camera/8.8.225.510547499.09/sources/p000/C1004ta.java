package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1004ta extends ood implements omx {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1005tb f47639a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f47640b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004ta(C1005tb c1005tb, int i) {
        super(0);
        this.f47640b = i;
        this.f47639a = c1005tb;
    }

    @Override // p000.omx
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2077a() {
        switch (this.f47640b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return m19441b();
    }

    /* JADX INFO: renamed from: b */
    public final Set m19441b() {
        switch (this.f47640b) {
            case 0:
                try {
                    String str = "Camera-" + this.f47639a.f47641a + "#physicalCameraIds";
                    C1005tb c1005tb = this.f47639a;
                    try {
                        Trace.beginSection(str);
                        Set<String> setM19433f = C0996st.m19433f(c1005tb.f47642b);
                        ArrayList arrayList = new ArrayList(omn.m18678R(setM19433f));
                        for (String str2 : setM19433f) {
                            str2.getClass();
                            arrayList.add(C0952rc.m19372a(str2));
                        }
                        return omn.m18675O(arrayList);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e) {
                    Log.w("CXCP", "Failed to getPhysicalCameraIds from Camera-".concat(this.f47639a.f47641a), e);
                    return okx.f46217a;
                } catch (NullPointerException e2) {
                    Log.w("CXCP", "Failed to getPhysicalCameraIds from Camera-".concat(this.f47639a.f47641a), e2);
                    return okx.f46217a;
                }
            case 1:
                try {
                    String str3 = "Camera-" + this.f47639a.f47641a + "#keys";
                    C1005tb c1005tb2 = this.f47639a;
                    try {
                        Trace.beginSection(str3);
                        List<CameraCharacteristics.Key<?>> keys = c1005tb2.f47642b.getKeys();
                        if (keys == null) {
                            keys = okv.f46215a;
                        }
                        return omn.m18675O(keys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e3) {
                    Log.w("CXCP", "Failed to getKeys from Camera-".concat(this.f47639a.f47641a), e3);
                    return okx.f46217a;
                }
            case 2:
                try {
                    String str4 = "Camera-" + this.f47639a.f47641a + "#availablePhysicalCameraRequestKeys";
                    C1005tb c1005tb3 = this.f47639a;
                    try {
                        Trace.beginSection(str4);
                        Iterable iterableM19430c = C0996st.m19430c(c1005tb3.f47642b);
                        if (iterableM19430c == null) {
                            iterableM19430c = okv.f46215a;
                        }
                        return omn.m18675O(iterableM19430c);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e4) {
                    Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-".concat(this.f47639a.f47641a), e4);
                    return okx.f46217a;
                }
            case 3:
                try {
                    String str5 = "Camera-" + this.f47639a.f47641a + "#availableCaptureRequestKeys";
                    C1005tb c1005tb4 = this.f47639a;
                    try {
                        Trace.beginSection(str5);
                        List<CaptureRequest.Key<?>> availableCaptureRequestKeys = c1005tb4.f47642b.getAvailableCaptureRequestKeys();
                        if (availableCaptureRequestKeys == null) {
                            availableCaptureRequestKeys = okv.f46215a;
                        }
                        return omn.m18675O(availableCaptureRequestKeys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e5) {
                    Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from Camera-".concat(this.f47639a.f47641a), e5);
                    return okx.f46217a;
                }
            case 4:
                try {
                    String str6 = "Camera-" + this.f47639a.f47641a + "#availableCaptureResultKeys";
                    C1005tb c1005tb5 = this.f47639a;
                    try {
                        Trace.beginSection(str6);
                        List<CaptureResult.Key<?>> availableCaptureResultKeys = c1005tb5.f47642b.getAvailableCaptureResultKeys();
                        if (availableCaptureResultKeys == null) {
                            availableCaptureResultKeys = okv.f46215a;
                        }
                        return omn.m18675O(availableCaptureResultKeys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e6) {
                    Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from Camera-".concat(this.f47639a.f47641a), e6);
                    return okx.f46217a;
                }
            default:
                try {
                    String str7 = "Camera-" + this.f47639a.f47641a + "#availableSessionKeys";
                    C1005tb c1005tb6 = this.f47639a;
                    try {
                        Trace.beginSection(str7);
                        Iterable iterableM19431d = C0996st.m19431d(c1005tb6.f47642b);
                        if (iterableM19431d == null) {
                            iterableM19431d = okv.f46215a;
                        }
                        return omn.m18675O(iterableM19431d);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e7) {
                    Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-".concat(this.f47639a.f47641a), e7);
                    return okx.f46217a;
                }
        }
    }
}
