package p115fb;

import android.os.Bundle;

/* JADX INFO: renamed from: fb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5499o extends AbstractC5498n<Bundle> {
    public C5499o(int i10, Bundle bundle) {
        super(i10, 1, bundle);
    }

    @Override // p115fb.AbstractC5498n
    /* JADX INFO: renamed from: a */
    public final void mo11722a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m11725d(bundle2);
    }

    @Override // p115fb.AbstractC5498n
    /* JADX INFO: renamed from: b */
    public final boolean mo11723b() {
        return false;
    }
}
