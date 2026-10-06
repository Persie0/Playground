package p000;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmg extends cbq implements jmh {
    public jmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: e */
    public final int mo13356e(Intent intent, int i, int i2) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        parcelM3398a.writeInt(i);
        parcelM3398a.writeInt(i2);
        Parcel parcelM3399y = m3399y(4, parcelM3398a);
        int i3 = parcelM3399y.readInt();
        parcelM3399y.recycle();
        return i3;
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: f */
    public final void mo13357f() {
        m3400z(2, m3398a());
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: g */
    public final void mo13358g(Intent intent) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        m3400z(6, parcelM3398a);
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: h */
    public final void mo13359h(int i) {
        Parcel parcelM3398a = m3398a();
        parcelM3398a.writeInt(i);
        m3400z(3, parcelM3398a);
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: i */
    public final boolean mo13360i(jjc jjcVar, jjc jjcVar2) {
        Parcel parcelM3398a = m3398a();
        cbs.m3405d(parcelM3398a, jjcVar);
        cbs.m3405d(parcelM3398a, jjcVar2);
        Parcel parcelM3399y = m3399y(9, parcelM3398a);
        boolean zM3406e = cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        return zM3406e;
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: j */
    public final boolean mo13361j(JobParameters jobParameters) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, jobParameters);
        Parcel parcelM3399y = m3399y(7, parcelM3398a);
        boolean zM3406e = cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        return zM3406e;
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: k */
    public final boolean mo13362k(JobParameters jobParameters) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, jobParameters);
        Parcel parcelM3399y = m3399y(8, parcelM3398a);
        boolean zM3406e = cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        return zM3406e;
    }

    @Override // p000.jmh
    /* JADX INFO: renamed from: l */
    public final boolean mo13363l(Intent intent) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        Parcel parcelM3399y = m3399y(5, parcelM3398a);
        boolean zM3406e = cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        return zM3406e;
    }
}
