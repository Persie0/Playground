package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p320pb.InterfaceC8214a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2804q0 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getAppInstanceId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getCurrentScreenClass(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getCurrentScreenName(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getGmpAppId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getSessionId(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void getTestFlag(InterfaceC2843t0 interfaceC2843t0, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC8214a interfaceC8214a, zzcl zzclVar, long j10) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC2843t0 interfaceC2843t0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException;

    void logHealthData(int i10, String str, InterfaceC8214a interfaceC8214a, InterfaceC8214a interfaceC8214a2, InterfaceC8214a interfaceC8214a3) throws RemoteException;

    void onActivityCreated(InterfaceC8214a interfaceC8214a, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException;

    void onActivityPaused(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException;

    void onActivityResumed(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC8214a interfaceC8214a, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException;

    void onActivityStarted(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException;

    void onActivityStopped(InterfaceC8214a interfaceC8214a, long j10) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC2843t0 interfaceC2843t0, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC2882w0 interfaceC2882w0) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(InterfaceC8214a interfaceC8214a, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC2882w0 interfaceC2882w0) throws RemoteException;

    void setInstanceIdProvider(InterfaceC2908y0 interfaceC2908y0) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC8214a interfaceC8214a, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC2882w0 interfaceC2882w0) throws RemoteException;
}
