package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class i0c {

    /* JADX INFO: renamed from: b */
    public static final i0c f43302b;

    /* JADX INFO: renamed from: c */
    public static final i0c f43303c;

    /* JADX INFO: renamed from: a */
    public final Throwable f43304a;

    static {
        if (m6d.f50684d) {
            f43303c = null;
            f43302b = null;
        } else {
            f43303c = new i0c(null);
            f43302b = new i0c(null);
        }
    }

    public i0c(CancellationException cancellationException) {
        this.f43304a = cancellationException;
    }
}
