package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d4c implements InterfaceC3434os {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nr9 f34998a;

    public d4c(nr9 nr9Var) {
        this.f34998a = nr9Var;
    }

    @Override // p000.eqc
    /* JADX INFO: renamed from: a */
    public final void mo10094a(long j, Bundle bundle, String str, String str2) {
        if (str == null || urb.f64252a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        ((b64) this.f34998a.f53173a).m3367t(3, bundle2);
    }
}
