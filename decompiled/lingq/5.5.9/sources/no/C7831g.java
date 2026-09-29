package no;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Future;
import sl.C9072e;

/* JADX INFO: renamed from: no.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C7831g extends AbstractC7834h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42928a;

    /* JADX INFO: renamed from: b */
    public final Object f42929b;

    public /* synthetic */ C7831g(int i10, Object obj) {
        this.f42928a = i10;
        this.f42929b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // no.AbstractC7837i
    /* JADX INFO: renamed from: a */
    public final void mo14353a(Throwable th2) {
        int i10 = this.f42928a;
        Object obj = this.f42929b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                if (th2 != null) {
                    ((Future) obj).cancel(false);
                }
                break;
            default:
                ((InterfaceC7838i0) obj).mo14330a();
                break;
        }
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ C9072e mo528n(Throwable th2) {
        switch (this.f42928a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                mo14353a(th2);
                break;
            default:
                mo14353a(th2);
                break;
        }
        return C9072e.f47360a;
    }

    public final String toString() {
        int i10 = this.f42928a;
        Object obj = this.f42929b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC7838i0) obj) + ']';
        }
    }
}
