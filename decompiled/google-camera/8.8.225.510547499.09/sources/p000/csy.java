package p000;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class csy extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cta f9401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csy(cta ctaVar, Handler handler) {
        super(handler);
        this.f9401a = ctaVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        cta ctaVar = this.f9401a;
        if (ctaVar.f9411e) {
            ctaVar.f9407a.m5480d(1, false);
        } else {
            if (ctaVar.f9410d) {
                return;
            }
            ctaVar.f9410d = true;
            ctaVar.f9407a.m5478b();
        }
    }
}
