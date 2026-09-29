package p404u2;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: u2.i */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9389i implements Callable<C9391k.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f48189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f48190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9386f f48191c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f48192d;

    public CallableC9389i(String str, Context context, C9386f c9386f, int i10) {
        this.f48189a = str;
        this.f48190b = context;
        this.f48191c = c9386f;
        this.f48192d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final C9391k.a call() throws Exception {
        try {
            return C9391k.m17755a(this.f48189a, this.f48190b, this.f48191c, this.f48192d);
        } catch (Throwable unused) {
            return new C9391k.a(-3);
        }
    }
}
