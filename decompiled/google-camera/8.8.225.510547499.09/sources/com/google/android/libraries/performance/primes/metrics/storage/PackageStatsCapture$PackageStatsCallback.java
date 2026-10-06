package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;
import p000.lms;
import p000.nbe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver.Stub {

    /* JADX INFO: renamed from: a */
    private final Semaphore f7960a = new Semaphore(1);

    /* JADX INFO: renamed from: b */
    private volatile PackageStats f7961b;

    private PackageStatsCapture$PackageStatsCallback() {
    }

    public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        if (z) {
            this.f7961b = packageStats;
        } else {
            ((nbe) ((nbe) lms.f38707a.m17252c()).mo17276G((char) 4550)).mo17290o("Failure getting PackageStats");
        }
        this.f7960a.release();
    }
}
