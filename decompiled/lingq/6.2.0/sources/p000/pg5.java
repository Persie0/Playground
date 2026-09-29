package p000;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pg5 {

    /* JADX INFO: renamed from: a */
    public final Context f56131a;

    /* JADX INFO: renamed from: b */
    public final WorkerParameters f56132b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f56133c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d */
    public boolean f56134d;

    public pg5(Context context, WorkerParameters workerParameters) {
        this.f56131a = context;
        this.f56132b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public abstract gm0 mo2899a();

    /* JADX INFO: renamed from: b */
    public final boolean m19129b() {
        return this.f56134d;
    }

    /* JADX INFO: renamed from: c */
    public abstract gm0 mo2900c();
}
