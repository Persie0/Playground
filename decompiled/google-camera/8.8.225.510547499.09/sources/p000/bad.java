package p000;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bad implements Runnable {

    /* JADX INFO: renamed from: a */
    private final bag f2852a;

    /* JADX INFO: renamed from: b */
    private final Intent f2853b;

    /* JADX INFO: renamed from: c */
    private final int f2854c;

    public bad(bag bagVar, Intent intent, int i) {
        this.f2852a = bagVar;
        this.f2853b = intent;
        this.f2854c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2852a.m2156d(this.f2853b, this.f2854c);
    }
}
