package p239l9;

import android.media.MediaDrm;
import p479xa.C10134c0;

/* JADX INFO: renamed from: l9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7289d {
    /* JADX INFO: renamed from: a */
    public static boolean m14664a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    /* JADX INFO: renamed from: b */
    public static int m14665b(Throwable th2) {
        return C10134c0.m19050q(C10134c0.m19051r(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
