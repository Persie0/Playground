package p290o6;

import com.clevertap.android.sdk.AnalyticsManager;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o6.h */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7958h implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f43333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AnalyticsManager f43335c;

    public CallableC7958h(AnalyticsManager analyticsManager, String str, ArrayList arrayList) {
        this.f43335c = analyticsManager;
        this.f43333a = arrayList;
        this.f43334b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        AnalyticsManager.m6401q0(this.f43335c, this.f43333a, this.f43334b, "$remove");
        return null;
    }
}
