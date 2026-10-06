package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmj extends cbq implements jmk {
    public jmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: e */
    public final int mo13364e(Intent intent, int i, int i2) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        parcelM3398a.writeInt(i);
        parcelM3398a.writeInt(i2);
        Parcel parcelM3399y = m3399y(5, parcelM3398a);
        int i3 = parcelM3399y.readInt();
        parcelM3399y.recycle();
        return i3;
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: f */
    public final IBinder mo13365f(Intent intent) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        Parcel parcelM3399y = m3399y(3, parcelM3398a);
        IBinder strongBinder = parcelM3399y.readStrongBinder();
        parcelM3399y.recycle();
        return strongBinder;
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: g */
    public final void mo13366g(jjc jjcVar) {
        Parcel parcelM3398a = m3398a();
        cbs.m3405d(parcelM3398a, jjcVar);
        m3400z(1, parcelM3398a);
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: h */
    public final void mo13367h() {
        m3400z(2, m3398a());
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: i */
    public final void mo13368i(Intent intent) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        m3400z(7, parcelM3398a);
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: j */
    public final void mo13369j(int i) {
        Parcel parcelM3398a = m3398a();
        parcelM3398a.writeInt(i);
        m3400z(4, parcelM3398a);
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: k */
    public final boolean mo13370k(Intent intent) {
        Parcel parcelM3398a = m3398a();
        cbs.m3404c(parcelM3398a, intent);
        Parcel parcelM3399y = m3399y(6, parcelM3398a);
        boolean zM3406e = cbs.m3406e(parcelM3399y);
        parcelM3399y.recycle();
        return zM3406e;
    }

    @Override // p000.jmk
    /* JADX INFO: renamed from: l */
    public final void mo13371l(jmf jmfVar) {
        Parcel parcelM3398a = m3398a();
        parcelM3398a.writeString(hsSUWRJfoeC.LDSVBVqzFh);
        cbs.m3405d(parcelM3398a, jmfVar);
        m3400z(9, parcelM3398a);
    }
}
