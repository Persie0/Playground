package p000;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class rg3 implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sg3 f59234a;

    public rg3(sg3 sg3Var) {
        this.f59234a = sg3Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        sg3 sg3Var = this.f59234a;
        if ((sg3Var.f60816b & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) sg3Var.f60817c)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }
}
