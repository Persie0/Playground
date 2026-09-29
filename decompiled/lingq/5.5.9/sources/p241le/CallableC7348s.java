package p241le;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.C3213b;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: le.s */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7348s implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f41087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3213b f41088b;

    public CallableC7348s(C3213b c3213b, long j10) {
        this.f41088b = c3213b;
        this.f41087a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f41087a);
        this.f41088b.f16215k.mo13074p(bundle);
        return null;
    }
}
