package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class t97 {

    /* JADX INFO: renamed from: a */
    public final Context f62015a;

    /* JADX INFO: renamed from: b */
    public final ypa f62016b;

    /* JADX INFO: renamed from: c */
    public x97 f62017c;

    /* JADX INFO: renamed from: d */
    public boolean f62018d;

    /* JADX INFO: renamed from: f */
    public boolean f62020f;

    /* JADX INFO: renamed from: g */
    public long f62021g = 15000;

    /* JADX INFO: renamed from: h */
    public final zpa f62022h = new zpa();

    /* JADX INFO: renamed from: e */
    public mp9 f62019e = mp9.f51705a;

    public t97(Context context, ypa ypaVar) {
        this.f62015a = context.getApplicationContext();
        this.f62016b = ypaVar;
    }

    /* JADX INFO: renamed from: a */
    public final z97 m21907a() {
        bna.m3987z(!this.f62020f);
        if (this.f62017c == null) {
            this.f62017c = new x97();
        }
        z97 z97Var = new z97(this);
        this.f62020f = true;
        return z97Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m21908b(long j) {
        this.f62021g = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m21909c(mp9 mp9Var) {
        this.f62019e = mp9Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m21910d() {
        this.f62018d = true;
    }
}
