package p000;

import com.google.android.gms.internal.play_billing.C0994e0;

/* JADX INFO: loaded from: classes2.dex */
public final class pgd extends m6d {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zid f56193h;

    public pgd(zid zidVar) {
        this.f56193h = zidVar;
    }

    @Override // p000.m6d
    /* JADX INFO: renamed from: c */
    public final String mo16662c() {
        C0994e0 c0994e0 = (C0994e0) this.f56193h.f71628a.get();
        return c0994e0 == null ? "Completer object has been garbage collected, future will fail soon" : wq1.m24118n("tag=[", String.valueOf(c0994e0.f12180a), "]");
    }
}
