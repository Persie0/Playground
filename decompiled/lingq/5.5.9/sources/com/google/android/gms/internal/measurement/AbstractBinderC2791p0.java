package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import p320pb.InterfaceC8214a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2791p0 extends BinderC2639e0 implements InterfaceC2804q0 {
    public AbstractBinderC2791p0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC2804q0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2804q0 ? (InterfaceC2804q0) iInterfaceQueryLocalInterface : new C2778o0(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.BinderC2639e0
    /* JADX INFO: renamed from: h */
    public final boolean mo5490h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        boolean z10;
        InterfaceC2843t0 c2817r0 = null;
        InterfaceC2843t0 c2817r1 = null;
        InterfaceC2843t0 c2817r2 = null;
        InterfaceC2843t0 c2817r3 = null;
        InterfaceC2882w0 c2856u0 = null;
        InterfaceC2882w0 c2856u1 = null;
        InterfaceC2882w0 c2856u2 = null;
        InterfaceC2843t0 c2817r4 = null;
        InterfaceC2843t0 c2817r5 = null;
        InterfaceC2843t0 c2817r6 = null;
        InterfaceC2843t0 c2817r7 = null;
        InterfaceC2843t0 c2817r8 = null;
        InterfaceC2843t0 c2817r9 = null;
        InterfaceC2908y0 c2895x0 = null;
        InterfaceC2843t0 c2817r10 = null;
        InterfaceC2843t0 c2817r11 = null;
        InterfaceC2843t0 c2817r12 = null;
        InterfaceC2843t0 c2817r13 = null;
        InterfaceC2843t0 c2817r14 = null;
        switch (i10) {
            case 1:
                InterfaceC8214a interfaceC8214aM16361j = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) C2653f0.m7797a(parcel, zzcl.CREATOR);
                long j10 = parcel.readLong();
                C2653f0.m7798b(parcel);
                initialize(interfaceC8214aM16361j, zzclVar, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                long j11 = parcel.readLong();
                C2653f0.m7798b(parcel);
                logEvent(string, string2, bundle, z11, z12, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r0 = iInterfaceQueryLocalInterface instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface : new C2817r0(strongBinder);
                }
                long j12 = parcel.readLong();
                C2653f0.m7798b(parcel);
                logEventAndBundle(string3, string4, bundle2, c2817r0, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                InterfaceC8214a interfaceC8214aM16361j2 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                ClassLoader classLoader = C2653f0.f14186a;
                boolean z13 = parcel.readInt() != 0;
                long j13 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setUserProperty(string5, string6, interfaceC8214aM16361j2, z13, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = C2653f0.f14186a;
                z10 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r14 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface2 : new C2817r0(strongBinder2);
                }
                C2653f0.m7798b(parcel);
                getUserProperties(string7, string8, z10, c2817r14);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r13 = iInterfaceQueryLocalInterface3 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface3 : new C2817r0(strongBinder3);
                }
                C2653f0.m7798b(parcel);
                getMaxUserProperties(string9, c2817r13);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                C2653f0.m7798b(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r12 = iInterfaceQueryLocalInterface4 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface4 : new C2817r0(strongBinder4);
                }
                C2653f0.m7798b(parcel);
                getConditionalUserProperties(string13, string14, c2817r12);
                break;
            case 11:
                ClassLoader classLoader3 = C2653f0.f14186a;
                z10 = parcel.readInt() != 0;
                long j16 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setMeasurementEnabled(z10, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                C2653f0.m7798b(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                InterfaceC8214a interfaceC8214aM16361j3 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setCurrentScreen(interfaceC8214aM16361j3, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r11 = iInterfaceQueryLocalInterface5 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface5 : new C2817r0(strongBinder5);
                }
                C2653f0.m7798b(parcel);
                getCurrentScreenName(c2817r11);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r10 = iInterfaceQueryLocalInterface6 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface6 : new C2817r0(strongBinder6);
                }
                C2653f0.m7798b(parcel);
                getCurrentScreenClass(c2817r10);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    c2895x0 = iInterfaceQueryLocalInterface7 instanceof InterfaceC2908y0 ? (InterfaceC2908y0) iInterfaceQueryLocalInterface7 : new C2895x0(strongBinder7);
                }
                C2653f0.m7798b(parcel);
                setInstanceIdProvider(c2895x0);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r9 = iInterfaceQueryLocalInterface8 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface8 : new C2817r0(strongBinder8);
                }
                C2653f0.m7798b(parcel);
                getCachedAppInstanceId(c2817r9);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r8 = iInterfaceQueryLocalInterface9 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface9 : new C2817r0(strongBinder9);
                }
                C2653f0.m7798b(parcel);
                getAppInstanceId(c2817r8);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r7 = iInterfaceQueryLocalInterface10 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface10 : new C2817r0(strongBinder10);
                }
                C2653f0.m7798b(parcel);
                getGmpAppId(c2817r7);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r6 = iInterfaceQueryLocalInterface11 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface11 : new C2817r0(strongBinder11);
                }
                C2653f0.m7798b(parcel);
                generateEventId(c2817r6);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                C2653f0.m7798b(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                C2653f0.m7798b(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                InterfaceC8214a interfaceC8214aM16361j4 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityStarted(interfaceC8214aM16361j4, j23);
                break;
            case 26:
                InterfaceC8214a interfaceC8214aM16361j5 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityStopped(interfaceC8214aM16361j5, j24);
                break;
            case 27:
                InterfaceC8214a interfaceC8214aM16361j6 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityCreated(interfaceC8214aM16361j6, bundle5, j25);
                break;
            case 28:
                InterfaceC8214a interfaceC8214aM16361j7 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityDestroyed(interfaceC8214aM16361j7, j26);
                break;
            case 29:
                InterfaceC8214a interfaceC8214aM16361j8 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityPaused(interfaceC8214aM16361j8, j27);
                break;
            case 30:
                InterfaceC8214a interfaceC8214aM16361j9 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivityResumed(interfaceC8214aM16361j9, j28);
                break;
            case 31:
                InterfaceC8214a interfaceC8214aM16361j10 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r5 = iInterfaceQueryLocalInterface12 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface12 : new C2817r0(strongBinder12);
                }
                long j29 = parcel.readLong();
                C2653f0.m7798b(parcel);
                onActivitySaveInstanceState(interfaceC8214aM16361j10, c2817r5, j29);
                break;
            case 32:
                Bundle bundle6 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r4 = iInterfaceQueryLocalInterface13 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface13 : new C2817r0(strongBinder13);
                }
                long j30 = parcel.readLong();
                C2653f0.m7798b(parcel);
                performAction(bundle6, c2817r4, j30);
                break;
            case 33:
                int i11 = parcel.readInt();
                String string19 = parcel.readString();
                InterfaceC8214a interfaceC8214aM16361j11 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                InterfaceC8214a interfaceC8214aM16361j12 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                InterfaceC8214a interfaceC8214aM16361j13 = InterfaceC8214a.a.m16361j(parcel.readStrongBinder());
                C2653f0.m7798b(parcel);
                logHealthData(i11, string19, interfaceC8214aM16361j11, interfaceC8214aM16361j12, interfaceC8214aM16361j13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2856u2 = iInterfaceQueryLocalInterface14 instanceof InterfaceC2882w0 ? (InterfaceC2882w0) iInterfaceQueryLocalInterface14 : new C2856u0(strongBinder14);
                }
                C2653f0.m7798b(parcel);
                setEventInterceptor(c2856u2);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2856u1 = iInterfaceQueryLocalInterface15 instanceof InterfaceC2882w0 ? (InterfaceC2882w0) iInterfaceQueryLocalInterface15 : new C2856u0(strongBinder15);
                }
                C2653f0.m7798b(parcel);
                registerOnMeasurementEventListener(c2856u1);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c2856u0 = iInterfaceQueryLocalInterface16 instanceof InterfaceC2882w0 ? (InterfaceC2882w0) iInterfaceQueryLocalInterface16 : new C2856u0(strongBinder16);
                }
                C2653f0.m7798b(parcel);
                unregisterOnMeasurementEventListener(c2856u0);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(C2653f0.f14186a);
                C2653f0.m7798b(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r3 = iInterfaceQueryLocalInterface17 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface17 : new C2817r0(strongBinder17);
                }
                int i12 = parcel.readInt();
                C2653f0.m7798b(parcel);
                getTestFlag(c2817r3, i12);
                break;
            case 39:
                ClassLoader classLoader4 = C2653f0.f14186a;
                z10 = parcel.readInt() != 0;
                C2653f0.m7798b(parcel);
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r2 = iInterfaceQueryLocalInterface18 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface18 : new C2817r0(strongBinder18);
                }
                C2653f0.m7798b(parcel);
                isDataCollectionEnabled(c2817r2);
                break;
            case 41:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                C2653f0.m7798b(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                C2653f0.m7798b(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                C2653f0.m7798b(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c2817r1 = iInterfaceQueryLocalInterface19 instanceof InterfaceC2843t0 ? (InterfaceC2843t0) iInterfaceQueryLocalInterface19 : new C2817r0(strongBinder19);
                }
                C2653f0.m7798b(parcel);
                getSessionId(c2817r1);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
