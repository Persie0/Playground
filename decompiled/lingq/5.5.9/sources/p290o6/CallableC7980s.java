package p290o6;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.concurrent.Callable;
import p526z6.C10445a;

/* JADX INFO: renamed from: o6.s */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7980s implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7987z f43407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f43408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f43409c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f43410d = -1000;

    public CallableC7980s(C7987z c7987z, Context context, Bundle bundle) {
        this.f43407a = c7987z;
        this.f43408b = context;
        this.f43409c = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        synchronized (this.f43407a.f43481k.f11349l) {
            C2260f c2260f = this.f43407a.f43481k;
            c2260f.f11346i = new C10445a();
            c2260f.m6574b(this.f43408b, this.f43409c, this.f43410d);
        }
        return null;
    }
}
