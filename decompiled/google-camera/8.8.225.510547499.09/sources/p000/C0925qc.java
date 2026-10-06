package p000;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: qc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0925qc {

    /* JADX INFO: renamed from: a */
    public Intent f47471a;

    /* JADX INFO: renamed from: b */
    private final IntentSender f47472b;

    /* JADX INFO: renamed from: c */
    private int f47473c;

    /* JADX INFO: renamed from: d */
    private int f47474d;

    public C0925qc(IntentSender intentSender) {
        this.f47472b = intentSender;
    }

    /* JADX INFO: renamed from: a */
    public final C0926qd m19338a() {
        return new C0926qd(this.f47472b, this.f47471a, this.f47473c, this.f47474d);
    }

    /* JADX INFO: renamed from: b */
    public final void m19339b(int i, int i2) {
        this.f47474d = i;
        this.f47473c = i2;
    }
}
