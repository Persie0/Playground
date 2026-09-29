package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes2.dex */
public final class vtb extends mcb implements eub {
    public vtb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 6);
    }

    @Override // p000.eub
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 23);
    }

    @Override // p000.eub
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4106c(parcelM16773J, bundle);
        m16776M(parcelM16773J, 9);
    }

    @Override // p000.eub
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 24);
    }

    @Override // p000.eub
    public final void generateEventId(oub oubVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 22);
    }

    @Override // p000.eub
    public final void getCachedAppInstanceId(oub oubVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 19);
    }

    @Override // p000.eub
    public final void getConditionalUserProperties(String str, String str2, oub oubVar) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 10);
    }

    @Override // p000.eub
    public final void getCurrentScreenClass(oub oubVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 17);
    }

    @Override // p000.eub
    public final void getCurrentScreenName(oub oubVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 16);
    }

    @Override // p000.eub
    public final void getGmpAppId(oub oubVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 21);
    }

    @Override // p000.eub
    public final void getMaxUserProperties(String str, oub oubVar) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 6);
    }

    @Override // p000.eub
    public final void getUserProperties(String str, String str2, boolean z, oub oubVar) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        ClassLoader classLoader = bqb.f8878a;
        parcelM16773J.writeInt(z ? 1 : 0);
        bqb.m4107d(parcelM16773J, oubVar);
        m16776M(parcelM16773J, 5);
    }

    @Override // p000.eub
    public final void initialize(by3 by3Var, zzdb zzdbVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, by3Var);
        bqb.m4106c(parcelM16773J, zzdbVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 1);
    }

    @Override // p000.eub
    public final void initializeWithElapsedTime(by3 by3Var, zzdb zzdbVar, long j, long j2) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, by3Var);
        bqb.m4106c(parcelM16773J, zzdbVar);
        parcelM16773J.writeLong(j);
        parcelM16773J.writeLong(j2);
        m16776M(parcelM16773J, 60);
    }

    @Override // p000.eub
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4106c(parcelM16773J, bundle);
        parcelM16773J.writeInt(z ? 1 : 0);
        parcelM16773J.writeInt(1);
        parcelM16773J.writeLong(j);
        parcelM16773J.writeLong(j2);
        m16776M(parcelM16773J, 59);
    }

    @Override // p000.eub
    public final void logHealthData(int i, String str, by3 by3Var, by3 by3Var2, by3 by3Var3) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeInt(5);
        parcelM16773J.writeString("Error with data collection. Data lost.");
        bqb.m4107d(parcelM16773J, by3Var);
        bqb.m4107d(parcelM16773J, by3Var2);
        bqb.m4107d(parcelM16773J, by3Var3);
        m16776M(parcelM16773J, 33);
    }

    @Override // p000.eub
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        bqb.m4106c(parcelM16773J, bundle);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 53);
    }

    @Override // p000.eub
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 54);
    }

    @Override // p000.eub
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 55);
    }

    @Override // p000.eub
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 56);
    }

    @Override // p000.eub
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, oub oubVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        bqb.m4107d(parcelM16773J, oubVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 57);
    }

    @Override // p000.eub
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 51);
    }

    @Override // p000.eub
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 52);
    }

    @Override // p000.eub
    public final void registerOnMeasurementEventListener(nvb nvbVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, nvbVar);
        m16776M(parcelM16773J, 35);
    }

    @Override // p000.eub
    public final void retrieveAndUploadBatches(cvb cvbVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4107d(parcelM16773J, cvbVar);
        m16776M(parcelM16773J, 58);
    }

    @Override // p000.eub
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, bundle);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 8);
    }

    @Override // p000.eub
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzddVar);
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 50);
    }

    @Override // p000.eub
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // p000.eub
    public final void setUserId(String str, long j) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 7);
    }

    @Override // p000.eub
    public final void setUserProperty(String str, String str2, by3 by3Var, boolean z, long j) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4107d(parcelM16773J, by3Var);
        parcelM16773J.writeInt(z ? 1 : 0);
        parcelM16773J.writeLong(j);
        m16776M(parcelM16773J, 4);
    }
}
