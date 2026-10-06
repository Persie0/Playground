package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lln implements lhw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ npv f38588a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ llp f38589b;

    public lln(llp llpVar, npv npvVar) {
        this.f38589b = llpVar;
        this.f38588a = npvVar;
    }

    @Override // p000.lhw
    /* JADX INFO: renamed from: a */
    public final void mo15357a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f38589b.f38591a.mo15708a(4, simpleName);
        this.f38589b.m15709a();
        this.f38589b.f38592b = this.f38588a.schedule(new lll(this, simpleName, 2), 10L, TimeUnit.SECONDS);
    }
}
