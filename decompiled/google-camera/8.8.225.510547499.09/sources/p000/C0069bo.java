package p000;

import android.os.Bundle;

/* JADX INFO: renamed from: bo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0069bo extends AbstractC0075bu {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ComponentCallbacksC0077bw f3945a;

    public C0069bo(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        this.f3945a = componentCallbacksC0077bw;
    }

    @Override // p000.AbstractC0075bu
    /* JADX INFO: renamed from: a */
    public final void mo2783a() {
        this.f3945a.f4602ac.m3224g();
        all.m913c(this.f3945a);
        Bundle bundle = this.f3945a.f4605g;
        this.f3945a.f4602ac.m3225h(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
