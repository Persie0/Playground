package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htj implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f29526a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f29527b;

    public htj(Context context, nqf nqfVar) {
        this.f29526a = context;
        this.f29527b = nqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29527b.mo14894e(bpv.m2885f(new File(this.f29526a.getCacheDir(), "indicatorDiskCache"), 5000000L));
        } catch (IOException e) {
            this.f29527b.mo8566a(e);
        }
    }
}
