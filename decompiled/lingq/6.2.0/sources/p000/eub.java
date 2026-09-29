package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface eub extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(oub oubVar);

    void getAppInstanceId(oub oubVar);

    void getCachedAppInstanceId(oub oubVar);

    void getConditionalUserProperties(String str, String str2, oub oubVar);

    void getCurrentScreenClass(oub oubVar);

    void getCurrentScreenName(oub oubVar);

    void getGmpAppId(oub oubVar);

    void getMaxUserProperties(String str, oub oubVar);

    void getSessionId(oub oubVar);

    void getTestFlag(oub oubVar, int i);

    void getUserProperties(String str, String str2, boolean z, oub oubVar);

    void initForTests(Map map);

    void initialize(by3 by3Var, zzdb zzdbVar, long j);

    void initializeWithElapsedTime(by3 by3Var, zzdb zzdbVar, long j, long j2);

    void isDataCollectionEnabled(oub oubVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, oub oubVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, by3 by3Var, by3 by3Var2, by3 by3Var3);

    void onActivityCreated(by3 by3Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j);

    void onActivityDestroyed(by3 by3Var, long j);

    void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityPaused(by3 by3Var, long j);

    void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityResumed(by3 by3Var, long j);

    void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivitySaveInstanceState(by3 by3Var, oub oubVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, oub oubVar, long j);

    void onActivityStarted(by3 by3Var, long j);

    void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j);

    void onActivityStopped(by3 by3Var, long j);

    void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j);

    void performAction(Bundle bundle, oub oubVar, long j);

    void registerOnMeasurementEventListener(nvb nvbVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(cvb cvbVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(by3 by3Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(nvb nvbVar);

    void setInstanceIdProvider(kwb kwbVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, by3 by3Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(nvb nvbVar);
}
