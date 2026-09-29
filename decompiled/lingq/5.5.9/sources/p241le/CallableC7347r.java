package p241le;

import com.google.firebase.crashlytics.internal.common.C3213b;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: le.r */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7347r implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f41085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3213b f41086b;

    public CallableC7347r(C3213b c3213b, String str) {
        this.f41086b = c3213b;
        this.f41085a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C3213b.m9162a(this.f41086b, this.f41085a);
        return null;
    }
}
