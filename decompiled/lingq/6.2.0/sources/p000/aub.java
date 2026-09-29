package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class aub extends wpb implements eub {
    public static eub asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof eub ? (eub) iInterfaceQueryLocalInterface : new vtb(iBinder);
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        oub lubVar = null;
        cvb subVar = null;
        oub lubVar2 = null;
        oub lubVar3 = null;
        oub lubVar4 = null;
        oub lubVar5 = null;
        nvb dvbVar = null;
        nvb dvbVar2 = null;
        nvb dvbVar3 = null;
        oub lubVar6 = null;
        oub lubVar7 = null;
        oub lubVar8 = null;
        oub lubVar9 = null;
        oub lubVar10 = null;
        oub lubVar11 = null;
        kwb rvbVar = null;
        oub lubVar12 = null;
        oub lubVar13 = null;
        oub lubVar14 = null;
        oub lubVar15 = null;
        oub lubVar16 = null;
        switch (i) {
            case 1:
                by3 by3VarM16421H = lp6.m16421H(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) bqb.m4105b(parcel, zzdb.CREATOR);
                long j = parcel.readLong();
                bqb.m4109f(parcel);
                initialize(by3VarM16421H, zzdbVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                boolean zM4104a = bqb.m4104a(parcel);
                boolean zM4104a2 = bqb.m4104a(parcel);
                long j2 = parcel.readLong();
                bqb.m4109f(parcel);
                logEvent(string, string2, bundle, zM4104a, zM4104a2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar = iInterfaceQueryLocalInterface instanceof oub ? (oub) iInterfaceQueryLocalInterface : new lub(strongBinder);
                }
                long j3 = parcel.readLong();
                bqb.m4109f(parcel);
                logEventAndBundle(string3, string4, bundle2, lubVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                by3 by3VarM16421H2 = lp6.m16421H(parcel.readStrongBinder());
                boolean zM4104a3 = bqb.m4104a(parcel);
                long j4 = parcel.readLong();
                bqb.m4109f(parcel);
                setUserProperty(string5, string6, by3VarM16421H2, zM4104a3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM4104a4 = bqb.m4104a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar16 = iInterfaceQueryLocalInterface2 instanceof oub ? (oub) iInterfaceQueryLocalInterface2 : new lub(strongBinder2);
                }
                bqb.m4109f(parcel);
                getUserProperties(string7, string8, zM4104a4, lubVar16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar15 = iInterfaceQueryLocalInterface3 instanceof oub ? (oub) iInterfaceQueryLocalInterface3 : new lub(strongBinder3);
                }
                bqb.m4109f(parcel);
                getMaxUserProperties(string9, lubVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                bqb.m4109f(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                bqb.m4109f(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                bqb.m4109f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar14 = iInterfaceQueryLocalInterface4 instanceof oub ? (oub) iInterfaceQueryLocalInterface4 : new lub(strongBinder4);
                }
                bqb.m4109f(parcel);
                getConditionalUserProperties(string13, string14, lubVar14);
                break;
            case 11:
                boolean zM4104a5 = bqb.m4104a(parcel);
                long j7 = parcel.readLong();
                bqb.m4109f(parcel);
                setMeasurementEnabled(zM4104a5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                bqb.m4109f(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                bqb.m4109f(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                bqb.m4109f(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                by3 by3VarM16421H3 = lp6.m16421H(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                bqb.m4109f(parcel);
                setCurrentScreen(by3VarM16421H3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar13 = iInterfaceQueryLocalInterface5 instanceof oub ? (oub) iInterfaceQueryLocalInterface5 : new lub(strongBinder5);
                }
                bqb.m4109f(parcel);
                getCurrentScreenName(lubVar13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar12 = iInterfaceQueryLocalInterface6 instanceof oub ? (oub) iInterfaceQueryLocalInterface6 : new lub(strongBinder6);
                }
                bqb.m4109f(parcel);
                getCurrentScreenClass(lubVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    rvbVar = iInterfaceQueryLocalInterface7 instanceof kwb ? (kwb) iInterfaceQueryLocalInterface7 : new rvb(strongBinder7);
                }
                bqb.m4109f(parcel);
                setInstanceIdProvider(rvbVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar11 = iInterfaceQueryLocalInterface8 instanceof oub ? (oub) iInterfaceQueryLocalInterface8 : new lub(strongBinder8);
                }
                bqb.m4109f(parcel);
                getCachedAppInstanceId(lubVar11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar10 = iInterfaceQueryLocalInterface9 instanceof oub ? (oub) iInterfaceQueryLocalInterface9 : new lub(strongBinder9);
                }
                bqb.m4109f(parcel);
                getAppInstanceId(lubVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar9 = iInterfaceQueryLocalInterface10 instanceof oub ? (oub) iInterfaceQueryLocalInterface10 : new lub(strongBinder10);
                }
                bqb.m4109f(parcel);
                getGmpAppId(lubVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar8 = iInterfaceQueryLocalInterface11 instanceof oub ? (oub) iInterfaceQueryLocalInterface11 : new lub(strongBinder11);
                }
                bqb.m4109f(parcel);
                generateEventId(lubVar8);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                bqb.m4109f(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                bqb.m4109f(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                by3 by3VarM16421H4 = lp6.m16421H(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityStarted(by3VarM16421H4, j14);
                break;
            case 26:
                by3 by3VarM16421H5 = lp6.m16421H(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityStopped(by3VarM16421H5, j15);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                by3 by3VarM16421H6 = lp6.m16421H(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityCreated(by3VarM16421H6, bundle5, j16);
                break;
            case 28:
                by3 by3VarM16421H7 = lp6.m16421H(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityDestroyed(by3VarM16421H7, j17);
                break;
            case 29:
                by3 by3VarM16421H8 = lp6.m16421H(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityPaused(by3VarM16421H8, j18);
                break;
            case 30:
                by3 by3VarM16421H9 = lp6.m16421H(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityResumed(by3VarM16421H9, j19);
                break;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                by3 by3VarM16421H10 = lp6.m16421H(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar7 = iInterfaceQueryLocalInterface12 instanceof oub ? (oub) iInterfaceQueryLocalInterface12 : new lub(strongBinder12);
                }
                long j20 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivitySaveInstanceState(by3VarM16421H10, lubVar7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar6 = iInterfaceQueryLocalInterface13 instanceof oub ? (oub) iInterfaceQueryLocalInterface13 : new lub(strongBinder13);
                }
                long j21 = parcel.readLong();
                bqb.m4109f(parcel);
                performAction(bundle6, lubVar6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                by3 by3VarM16421H11 = lp6.m16421H(parcel.readStrongBinder());
                by3 by3VarM16421H12 = lp6.m16421H(parcel.readStrongBinder());
                by3 by3VarM16421H13 = lp6.m16421H(parcel.readStrongBinder());
                bqb.m4109f(parcel);
                logHealthData(i2, string19, by3VarM16421H11, by3VarM16421H12, by3VarM16421H13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dvbVar3 = iInterfaceQueryLocalInterface14 instanceof nvb ? (nvb) iInterfaceQueryLocalInterface14 : new dvb(strongBinder14);
                }
                bqb.m4109f(parcel);
                setEventInterceptor(dvbVar3);
                break;
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dvbVar2 = iInterfaceQueryLocalInterface15 instanceof nvb ? (nvb) iInterfaceQueryLocalInterface15 : new dvb(strongBinder15);
                }
                bqb.m4109f(parcel);
                registerOnMeasurementEventListener(dvbVar2);
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    dvbVar = iInterfaceQueryLocalInterface16 instanceof nvb ? (nvb) iInterfaceQueryLocalInterface16 : new dvb(strongBinder16);
                }
                bqb.m4109f(parcel);
                unregisterOnMeasurementEventListener(dvbVar);
                break;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                HashMap mapM4108e = bqb.m4108e(parcel);
                bqb.m4109f(parcel);
                initForTests(mapM4108e);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar5 = iInterfaceQueryLocalInterface17 instanceof oub ? (oub) iInterfaceQueryLocalInterface17 : new lub(strongBinder17);
                }
                int i3 = parcel.readInt();
                bqb.m4109f(parcel);
                getTestFlag(lubVar5, i3);
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                boolean zM4104a6 = bqb.m4104a(parcel);
                bqb.m4109f(parcel);
                setDataCollectionEnabled(zM4104a6);
                break;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar4 = iInterfaceQueryLocalInterface18 instanceof oub ? (oub) iInterfaceQueryLocalInterface18 : new lub(strongBinder18);
                }
                bqb.m4109f(parcel);
                isDataCollectionEnabled(lubVar4);
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                bqb.m4109f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                bqb.m4109f(parcel);
                clearMeasurementEnabled(j22);
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                Bundle bundle8 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                bqb.m4109f(parcel);
                setConsent(bundle8, j23);
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                bqb.m4109f(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar3 = iInterfaceQueryLocalInterface19 instanceof oub ? (oub) iInterfaceQueryLocalInterface19 : new lub(strongBinder19);
                }
                bqb.m4109f(parcel);
                getSessionId(lubVar3);
                break;
            case eda.f37086g /* 48 */:
                Intent intent = (Intent) bqb.m4105b(parcel, Intent.CREATOR);
                bqb.m4109f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdd zzddVar = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                bqb.m4109f(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, string20, string21, j25);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                long j26 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, j26);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                long j27 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, j27);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, j28);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                long j29 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, j29);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                long j30 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, j30);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                long j31 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, j31);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) bqb.m4105b(parcel, zzdd.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    lubVar2 = iInterfaceQueryLocalInterface20 instanceof oub ? (oub) iInterfaceQueryLocalInterface20 : new lub(strongBinder20);
                }
                long j32 = parcel.readLong();
                bqb.m4109f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, lubVar2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    subVar = iInterfaceQueryLocalInterface21 instanceof cvb ? (cvb) iInterfaceQueryLocalInterface21 : new sub(strongBinder21);
                }
                bqb.m4109f(parcel);
                retrieveAndUploadBatches(subVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
                boolean zM4104a7 = bqb.m4104a(parcel);
                boolean zM4104a8 = bqb.m4104a(parcel);
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                bqb.m4109f(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, zM4104a7, zM4104a8, j33, j34);
                break;
            case 60:
                by3 by3VarM16421H14 = lp6.m16421H(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) bqb.m4105b(parcel, zzdb.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                bqb.m4109f(parcel);
                initializeWithElapsedTime(by3VarM16421H14, zzdbVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                bqb.m4109f(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
