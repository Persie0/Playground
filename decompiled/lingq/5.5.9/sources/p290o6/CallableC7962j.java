package p290o6;

import com.clevertap.android.sdk.AnalyticsManager;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o6.j */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7962j implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f43343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AnalyticsManager f43345c;

    public CallableC7962j(AnalyticsManager analyticsManager, String str, ArrayList arrayList) {
        this.f43345c = analyticsManager;
        this.f43343a = arrayList;
        this.f43344b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        AnalyticsManager.m6401q0(this.f43345c, this.f43343a, this.f43344b, "$set");
        return null;
    }
}
