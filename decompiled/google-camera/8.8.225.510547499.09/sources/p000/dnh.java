package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnh {

    /* JADX INFO: renamed from: a */
    public final kdp f12089a;

    /* JADX INFO: renamed from: b */
    public final Handler f12090b;

    /* JADX INFO: renamed from: c */
    public kba f12091c;

    /* JADX INFO: renamed from: d */
    public kba f12092d;

    public dnh(kdp kdpVar, Handler handler) {
        this.f12089a = kdpVar;
        this.f12090b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m6432a() {
        kba kbaVar = this.f12092d;
        if (kbaVar != null) {
            kbaVar.close();
            this.f12092d = null;
        }
    }
}
