package p404u2;

import android.graphics.Typeface;
import p286o2.C7906f;
import p312p2.C8173e;
import p338qd.C8584v;

/* JADX INFO: renamed from: u2.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9381a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8584v f48171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Typeface f48172b;

    public RunnableC9381a(C8584v c8584v, Typeface typeface) {
        this.f48171a = c8584v;
        this.f48172b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7906f.e eVar = ((C8173e.a) this.f48171a).f44311I;
        if (eVar != null) {
            eVar.mo1297d(this.f48172b);
        }
    }
}
