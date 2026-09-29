package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p320pb.InterfaceC8214a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2778o0 extends C2625d0 implements InterfaceC2804q0 {
    public C2778o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 23);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7799c(parcelM7743h, bundle);
        m7744h0(parcelM7743h, 9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 24);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void generateEventId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 22);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getCachedAppInstanceId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 19);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getCurrentScreenClass(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 17);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getCurrentScreenName(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 16);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getGmpAppId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 21);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getMaxUserProperties(String str, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC2843t0 interfaceC2843t0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        ClassLoader classLoader = C2653f0.f14186a;
        parcelM7743h.writeInt(z10 ? 1 : 0);
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        m7744h0(parcelM7743h, 5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void initialize(InterfaceC8214a interfaceC8214a, zzcl zzclVar, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        C2653f0.m7799c(parcelM7743h, zzclVar);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7799c(parcelM7743h, bundle);
        parcelM7743h.writeInt(z10 ? 1 : 0);
        parcelM7743h.writeInt(z11 ? 1 : 0);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void logHealthData(int i10, String str, InterfaceC8214a interfaceC8214a, InterfaceC8214a interfaceC8214a2, InterfaceC8214a interfaceC8214a3) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeInt(5);
        parcelM7743h.writeString(str);
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        C2653f0.m7800d(parcelM7743h, interfaceC8214a2);
        C2653f0.m7800d(parcelM7743h, interfaceC8214a3);
        m7744h0(parcelM7743h, 33);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityCreated(InterfaceC8214a interfaceC8214a, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        C2653f0.m7799c(parcelM7743h, bundle);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 27);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityDestroyed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 28);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityPaused(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 29);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityResumed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 30);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivitySaveInstanceState(InterfaceC8214a interfaceC8214a, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        C2653f0.m7800d(parcelM7743h, interfaceC2843t0);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityStarted(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void onActivityStopped(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 26);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void registerOnMeasurementEventListener(InterfaceC2882w0 interfaceC2882w0) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC2882w0);
        m7744h0(parcelM7743h, 35);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, bundle);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void setCurrentScreen(InterfaceC8214a interfaceC8214a, String str, String str2, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 15);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        ClassLoader classLoader = C2653f0.f14186a;
        parcelM7743h.writeInt(z10 ? 1 : 0);
        m7744h0(parcelM7743h, 39);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2804q0
    public final void setUserProperty(String str, String str2, InterfaceC8214a interfaceC8214a, boolean z10, long j10) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7800d(parcelM7743h, interfaceC8214a);
        parcelM7743h.writeInt(z10 ? 1 : 0);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 4);
    }
}
