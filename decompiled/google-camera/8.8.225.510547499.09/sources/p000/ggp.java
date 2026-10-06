package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f24693a = 0;

    /* JADX INFO: renamed from: b */
    private static final AtomicBoolean f24694b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m9224a(Context context) {
        if (f24694b.compareAndSet(false, true)) {
            lpv.m15843h(context);
        }
    }
}
