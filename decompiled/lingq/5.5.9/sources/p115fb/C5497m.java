package p115fb;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* JADX INFO: renamed from: fb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5497m extends AbstractC5498n<Void> {
    public C5497m(int i10, Bundle bundle) {
        super(i10, 2, bundle);
    }

    @Override // p115fb.AbstractC5498n
    /* JADX INFO: renamed from: a */
    public final void mo11722a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m11725d(null);
        } else {
            m11724c(new zzq("Invalid response to one way request", null));
        }
    }

    @Override // p115fb.AbstractC5498n
    /* JADX INFO: renamed from: b */
    public final boolean mo11723b() {
        return true;
    }
}
