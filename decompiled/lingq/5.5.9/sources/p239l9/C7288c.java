package p239l9;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* JADX INFO: renamed from: l9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7288c {
    /* JADX INFO: renamed from: a */
    public static boolean m14662a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14663b(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
