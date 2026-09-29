package androidx.fragment.app;

import com.android.installreferrer.api.InstallReferrerClient;
import p232l2.C7243v;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0972q implements InterfaceC9803a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6391b;

    public /* synthetic */ C0972q(int i10, Object obj) {
        this.f6390a = i10;
        this.f6391b = obj;
    }

    @Override // p446w2.InterfaceC9803a
    /* JADX INFO: renamed from: a */
    public final void mo3724a(Object obj) {
        int i10 = this.f6390a;
        Object obj2 = this.f6391b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((ActivityC0979t) obj2).f6406N.m3816a();
                break;
            default:
                FragmentManager fragmentManager = (FragmentManager) obj2;
                C7243v c7243v = (C7243v) obj;
                if (fragmentManager.m3623M()) {
                    fragmentManager.m3661r(c7243v.f40686a, false);
                }
                break;
        }
    }
}
