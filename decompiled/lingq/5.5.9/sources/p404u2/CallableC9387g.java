package p404u2;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: u2.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9387g implements Callable<C9391k.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f48184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f48185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9386f f48186c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f48187d;

    public CallableC9387g(String str, Context context, C9386f c9386f, int i10) {
        this.f48184a = str;
        this.f48185b = context;
        this.f48186c = c9386f;
        this.f48187d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final C9391k.a call() throws Exception {
        return C9391k.m17755a(this.f48184a, this.f48185b, this.f48186c, this.f48187d);
    }
}
