package p008a7;

import com.clevertap.android.sdk.pushnotification.PushConstants;
import p003a2.C0009a;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5747c;

/* JADX INFO: renamed from: a7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0047a implements InterfaceC5747c<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0048b f56a;

    public C0047a(C0048b c0048b) {
        this.f56a = c0048b;
    }

    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public final void mo205e(AbstractC5751g<String> abstractC5751g) {
        boolean zMo12111m = abstractC5751g.mo12111m();
        C0048b c0048b = this.f56a;
        if (!zMo12111m) {
            c0048b.f57a.m6435d(C0009a.m23l(new StringBuilder(), PushConstants.f11331a, "FCM token using googleservices.json failed"), abstractC5751g.mo12106h());
            c0048b.f59c.mo6568a(null, PushConstants.PushType.FCM);
            return;
        }
        String strMo12107i = abstractC5751g.mo12107i() != null ? abstractC5751g.mo12107i() : null;
        c0048b.f57a.m6434c("PushProvider", PushConstants.f11331a + "FCM token using googleservices.json - " + strMo12107i);
        c0048b.f59c.mo6568a(strMo12107i, PushConstants.PushType.FCM);
    }
}
