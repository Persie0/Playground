package p000;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbs implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f2922a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Notification f2923b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f2924c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ SystemForegroundService f2925d;

    public bbs(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f2925d = systemForegroundService;
        this.f2922a = i;
        this.f2923b = notification;
        this.f2924c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bbu.m2188a(this.f2925d, this.f2922a, this.f2923b, this.f2924c);
    }
}
