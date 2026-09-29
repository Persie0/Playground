package p241le;

import com.google.firebase.crashlytics.internal.common.C3213b;
import com.google.firebase.crashlytics.internal.common.C3214c;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: le.p */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7345p implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f41078a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f41079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3213b f41080c;

    public CallableC7345p(C3213b c3213b, long j10, String str) {
        this.f41080c = c3213b;
        this.f41078a = j10;
        this.f41079b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C3213b c3213b = this.f41080c;
        C3214c c3214c = c3213b.f16217m;
        if (!(c3214c != null && c3214c.f16225e.get())) {
            c3213b.f16213i.f41626b.mo15051c(this.f41079b, this.f41078a);
        }
        return null;
    }
}
