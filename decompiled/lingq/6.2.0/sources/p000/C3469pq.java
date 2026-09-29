package p000;

import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: renamed from: pq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3469pq extends tc3 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3731wq f56643j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AppCompatSpinner f56644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3469pq(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, C3731wq c3731wq) {
        super(appCompatSpinner2);
        this.f56644k = appCompatSpinner;
        this.f56643j = c3731wq;
    }

    @Override // p000.tc3
    /* JADX INFO: renamed from: b */
    public final k69 mo19446b() {
        return this.f56643j;
    }

    @Override // p000.tc3
    /* JADX INFO: renamed from: c */
    public final boolean mo19447c() {
        AppCompatSpinner appCompatSpinner = this.f56644k;
        if (appCompatSpinner.getInternalPopup().mo21535a()) {
            return true;
        }
        appCompatSpinner.f1134f.mo21544n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
