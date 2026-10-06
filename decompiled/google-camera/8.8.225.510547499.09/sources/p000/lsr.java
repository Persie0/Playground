package p000;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsr implements lsa {

    /* JADX INFO: renamed from: a */
    public boolean f39140a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lsx] */
    @Override // p000.lsa
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15928a(lie lieVar) throws IOException {
        if (this.f39140a) {
            if (lieVar.f38297d.isEmpty()) {
                return lieVar.f38295b.mo15935c((Uri) lieVar.f38294a);
            }
            throw new lsl("Short circuit would skip transforms.");
        }
        lsk lskVar = new lsk(lst.m15950b(lieVar));
        try {
            Closeable closeable = lskVar.f39134a;
            if (!(closeable instanceof lsh)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileMo15948a = ((lsh) closeable).mo15948a();
            lskVar.close();
            return fileMo15948a;
        } catch (Throwable th) {
            try {
                lskVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }
}
