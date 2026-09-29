package p000;

import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes.dex */
public final class cd3 extends bq1 {

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f9914K;

    public cd3(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f9914K = abstractComponentCallbacksC0635c;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: o0 */
    public final View mo293o0(int i) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f9914K;
        View view = abstractComponentCallbacksC0635c.f5692d0;
        if (view != null) {
            return view.findViewById(i);
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " does not have a view"));
        return null;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: p0 */
    public final boolean mo294p0() {
        return this.f9914K.f5692d0 != null;
    }
}
