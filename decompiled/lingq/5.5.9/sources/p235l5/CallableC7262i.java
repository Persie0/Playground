package p235l5;

import ae.C0062b;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.concurrent.Callable;
import p290o6.C7966l;
import p290o6.C7967l0;
import p290o6.C7977q0;

/* JADX INFO: renamed from: l5.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7262i implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40753b;

    public /* synthetic */ CallableC7262i(int i10, Object obj) {
        this.f40752a = i10;
        this.f40753b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f40752a;
        Object obj = this.f40753b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7967l0 c7967l0 = (C7967l0) obj;
                C5207g.m11111f(c7967l0, "this$0");
                return Integer.valueOf(C0062b.m252C((WorkDatabase) c7967l0.f43382a, "next_alarm_manager_id"));
            default:
                Context context = (Context) obj;
                C5207g.m11111f(context, "$context");
                C7966l.f43364c = C7977q0.m15827e(context, null).getBoolean("firstTimeRequest", true);
                return null;
        }
    }
}
