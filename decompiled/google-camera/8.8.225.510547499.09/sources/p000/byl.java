package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byl extends cah {

    /* JADX INFO: renamed from: a */
    final int f4755a;

    /* JADX INFO: renamed from: b */
    public Bitmap f4756b;

    /* JADX INFO: renamed from: c */
    private final Handler f4757c;

    /* JADX INFO: renamed from: d */
    private final long f4758d;

    public byl(Handler handler, int i, long j) {
        this.f4757c = handler;
        this.f4755a = i;
        this.f4758d = j;
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: a */
    public final void mo3191a(Drawable drawable) {
        this.f4756b = null;
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3192b(Object obj) {
        this.f4756b = (Bitmap) obj;
        this.f4757c.sendMessageAtTime(this.f4757c.obtainMessage(1, this), this.f4758d);
    }
}
