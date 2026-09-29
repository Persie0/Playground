package p000;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.C1148a;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class pp1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f56620a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1148a f56621b;

    public pp1(C1148a c1148a, long j) {
        this.f56621b = c1148a;
        this.f56620a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f56620a);
        this.f56621b.f13660k.mo16507g(bundle);
        return null;
    }
}
