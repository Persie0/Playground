package p000;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mia implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51373a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ via f51374b;

    public /* synthetic */ mia(via viaVar, int i) {
        this.f51373a = i;
        this.f51374b = viaVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f51373a;
        xfa xfaVar = xfa.f68157a;
        via viaVar = this.f51374b;
        switch (i) {
            case 0:
                viaVar.m23295d();
                break;
            case 1:
                viaVar.m23295d();
                break;
            case 2:
                Activity activity = viaVar.f65424c;
                if (activity != null) {
                    mbd.m16755c(activity, "https://www.lingq.com/terms/", null, 30);
                }
                break;
            case 3:
                Activity activity2 = viaVar.f65424c;
                if (activity2 != null) {
                    mbd.m16755c(activity2, "https://www.lingq.com/privacy/", null, 30);
                }
                break;
            case 4:
                viaVar.m23293b();
                break;
            default:
                viaVar.m23292a();
                break;
        }
        return xfaVar;
    }
}
