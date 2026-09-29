package p000;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f35839b;

    public /* synthetic */ dm7(Context context, int i) {
        this.f35838a = i;
        this.f35839b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35838a;
        int i2 = 1;
        Context context = this.f35839b;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new dm7(context, i2));
                break;
            default:
                d32.m10054n0(context, new o92(1), d32.f34893b, false);
                break;
        }
    }
}
