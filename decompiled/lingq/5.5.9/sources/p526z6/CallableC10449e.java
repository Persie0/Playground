package p526z6;

import android.content.Context;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: z6.e */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC10449e implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f52300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2260f f52301b;

    public CallableC10449e(Context context, C2260f c2260f) {
        this.f52301b = c2260f;
        this.f52300a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C2260f c2260f = this.f52301b;
        c2260f.f11344g.m6433b().getClass();
        C2181a.m6458k("Creating job");
        C2260f.m6572c(this.f52300a, c2260f);
        return null;
    }
}
