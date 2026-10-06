package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class llm implements lhv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ npv f38586a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ llp f38587b;

    public llm(llp llpVar, npv npvVar) {
        this.f38587b = llpVar;
        this.f38586a = npvVar;
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public final void mo15356d(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f38587b.f38591a.mo15708a(3, simpleName);
        this.f38587b.m15709a();
        this.f38587b.f38593c = this.f38586a.schedule(new lll(this, simpleName, 0), 10L, TimeUnit.SECONDS);
    }
}
