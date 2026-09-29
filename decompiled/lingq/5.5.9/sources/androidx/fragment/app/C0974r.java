package androidx.fragment.app;

import android.content.res.Configuration;
import com.android.installreferrer.api.InstallReferrerClient;
import p446w2.InterfaceC9803a;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0974r implements InterfaceC9803a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6394b;

    public /* synthetic */ C0974r(int i10, Object obj) {
        this.f6393a = i10;
        this.f6394b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p446w2.InterfaceC9803a
    /* JADX INFO: renamed from: a */
    public final void mo3724a(Object obj) {
        int i10 = this.f6393a;
        Object obj2 = this.f6394b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((ActivityC0979t) obj2).f6406N.m3816a();
                break;
            default:
                FragmentManager fragmentManager = (FragmentManager) obj2;
                Configuration configuration = (Configuration) obj;
                if (fragmentManager.m3623M()) {
                    fragmentManager.m3648h(false, configuration);
                }
                break;
        }
    }
}
