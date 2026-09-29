package p290o6;

import com.clevertap.android.sdk.AnalyticsManager;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o6.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7956g implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f43323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AnalyticsManager f43324c;

    public CallableC7956g(AnalyticsManager analyticsManager, String str, ArrayList arrayList) {
        this.f43324c = analyticsManager;
        this.f43322a = str;
        this.f43323b = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        AnalyticsManager analyticsManager = this.f43324c;
        C7963j0 c7963j0 = analyticsManager.f10954j;
        String str = this.f43322a;
        AnalyticsManager.m6401q0(analyticsManager, this.f43323b, str, c7963j0.m15786f(str) != null ? "$add" : "$set");
        return null;
    }
}
