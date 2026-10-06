package p000;

import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: renamed from: tj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1013tj implements InterfaceC0980sd {

    /* JADX INFO: renamed from: a */
    public final Object f47674a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f47675b;

    public C1013tj(TotalCaptureResult totalCaptureResult, int i) {
        this.f47675b = i;
        this.f47674a = totalCaptureResult;
        Map mapM19432e = C0996st.m19432e(totalCaptureResult);
        if (mapM19432e == null || mapM19432e.isEmpty()) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap(mapM19432e.size());
        for (Map.Entry entry : mapM19432e.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            C0952rc c0952rcM19372a = C0952rc.m19372a(str);
            arrayMap.put(c0952rcM19372a, new C0989sm());
        }
    }

    public C1013tj(C0973rx c0973rx, int i) {
        this.f47675b = i;
        this.f47674a = c0973rx;
    }

    @Override // p000.InterfaceC0980sd
    /* JADX INFO: renamed from: e */
    public final Object mo13866e(oov oovVar) {
        throw null;
    }
}
