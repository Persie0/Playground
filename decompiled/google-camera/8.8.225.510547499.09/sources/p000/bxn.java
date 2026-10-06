package p000;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxn implements bxa {

    /* JADX INFO: renamed from: a */
    private final bxm f4710a;

    /* JADX INFO: renamed from: b */
    private final cay f4711b;

    public bxn(bxm bxmVar, cay cayVar) {
        this.f4710a = bxmVar;
        this.f4711b = cayVar;
    }

    @Override // p000.bxa
    /* JADX INFO: renamed from: a */
    public final void mo3141a(bti btiVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.f4711b.f4939c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            btiVar.mo3045d(bitmap);
            throw iOException;
        }
    }

    @Override // p000.bxa
    /* JADX INFO: renamed from: b */
    public final void mo3142b() {
        this.f4710a.m3165a();
    }
}
