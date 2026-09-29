package p000;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzsk;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class eid implements agd {

    /* JADX INFO: renamed from: a */
    public boolean f37303a;

    static {
        new AtomicInteger();
    }

    @Override // p000.agd
    /* JADX INFO: renamed from: b */
    public final Object mo391b(ny8 ny8Var) throws IOException {
        if (this.f37303a) {
            if (((ImmutableList) ny8Var.f53415c).isEmpty()) {
                return ((uid) ny8Var.f53414b).mo14450d((Uri) ny8Var.f53417e);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        Closeable closeableM11077j = eda.m11077j(ny8Var);
        try {
            if (!(closeableM11077j instanceof bhd)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((bhd) closeableM11077j).zza();
            if (closeableM11077j != null) {
                closeableM11077j.close();
            }
            return fileZza;
        } catch (Throwable th) {
            if (closeableM11077j != null) {
                try {
                    closeableM11077j.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
