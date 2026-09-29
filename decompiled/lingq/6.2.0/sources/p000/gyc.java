package p000;

import com.google.android.gms.internal.measurement.C0962f;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gyc implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ gyc f41537a = new gyc();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = C0962f.f11840j;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
