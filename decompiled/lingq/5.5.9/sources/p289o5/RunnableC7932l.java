package p289o5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.play_billing.zzu;
import p152hb.BinderC5973g1;
import p152hb.C6017v0;
import p402u0.C9370m;

/* JADX INFO: renamed from: o5.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7932l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43223b;

    public /* synthetic */ RunnableC7932l(int i10, Object obj) {
        this.f43222a = i10;
        this.f43223b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43222a;
        Object obj = this.f43223b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C9370m) obj).m17743e(C7939s.f43251k, zzu.m8528Q());
                break;
            default:
                ((C6017v0) ((BinderC5973g1) obj).f35493g).m12468b(new ConnectionResult(4));
                break;
        }
    }
}
