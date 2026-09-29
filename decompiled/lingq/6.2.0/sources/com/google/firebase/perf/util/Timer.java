package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p000.C3670v2;

/* JADX INFO: loaded from: classes.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C3670v2(8);

    /* JADX INFO: renamed from: a */
    public long f13787a;

    /* JADX INFO: renamed from: b */
    public long f13788b;

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), SystemClock.elapsedRealtimeNanos() / 1000);
    }

    /* JADX INFO: renamed from: a */
    public final long m6742a() {
        return new Timer().f13788b - this.f13788b;
    }

    /* JADX INFO: renamed from: b */
    public final long m6743b(Timer timer) {
        return timer.f13788b - this.f13788b;
    }

    /* JADX INFO: renamed from: c */
    public final void m6744c() {
        this.f13787a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f13788b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13787a);
        parcel.writeLong(this.f13788b);
    }

    public Timer(long j, long j2) {
        this.f13787a = j;
        this.f13788b = j2;
    }
}
