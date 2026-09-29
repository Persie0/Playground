package p000;

import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.lingq.p020ui.MainActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: nf */
/* JADX INFO: loaded from: classes.dex */
public final class C3370nf {

    /* JADX INFO: renamed from: a */
    public volatile Object f52662a;

    /* JADX INFO: renamed from: b */
    public final Object f52663b;

    /* JADX INFO: renamed from: c */
    public volatile Object f52664c;

    public C3370nf(qz6 qz6Var) {
        tg2 tg2Var = new tg2();
        tr3 tr3Var = new tr3(17);
        this.f52664c = tg2Var;
        this.f52663b = new ArrayList();
        this.f52662a = tr3Var;
        qz6Var.m20220a(new C3333mf(this));
    }

    /* JADX INFO: renamed from: a */
    public boolean m17404a() {
        try {
            MainActivity mainActivity = (MainActivity) this.f52663b;
            return mainActivity.getPackageManager().getApplicationInfo(mainActivity.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            AbstractC0985a.m5509j("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public /* synthetic */ C3370nf(Object obj) {
        this.f52663b = obj;
    }
}
