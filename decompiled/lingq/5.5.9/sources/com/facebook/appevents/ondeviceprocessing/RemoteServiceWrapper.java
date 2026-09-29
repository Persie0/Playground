package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.appevents.AppEvent;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p067d8.C5070j;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8004n;
import p318p8.InterfaceC8207a;
import p476x7.C10106e;
import p527z7.C10455c;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteServiceWrapper {

    /* JADX INFO: renamed from: a */
    public static final RemoteServiceWrapper f11538a = new RemoteServiceWrapper();

    /* JADX INFO: renamed from: b */
    public static final String f11539b = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    public static Boolean f11540c;

    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m13365d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            EventType[] eventTypeArrValuesCustom = values();
            return (EventType[]) Arrays.copyOf(eventTypeArrValuesCustom, eventTypeArrValuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ServiceResult[] valuesCustom() {
            ServiceResult[] serviceResultArrValuesCustom = values();
            return (ServiceResult[]) Arrays.copyOf(serviceResultArrValuesCustom, serviceResultArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a */
    public static final class ServiceConnectionC2299a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f11541a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b */
        public IBinder f11542b;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            C5207g.m11111f(componentName, "name");
            this.f11541a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C5207g.m11111f(componentName, "name");
            C5207g.m11111f(iBinder, "serviceBinder");
            this.f11542b = iBinder;
            this.f11541a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C5207g.m11111f(componentName, "name");
        }
    }

    /* JADX INFO: renamed from: a */
    public final Intent m6660a(Context context) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C5070j.m10766a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && C5070j.m10766a(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ServiceResult m6661b(EventType eventType, String str, List<AppEvent> list) {
        ServiceResult serviceResult;
        String str2 = f11539b;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            int i10 = C10106e.f51261a;
            Context contextM15871a = C8004n.m15871a();
            Intent intentM6660a = m6660a(contextM15871a);
            if (intentM6660a != null) {
                ServiceConnectionC2299a serviceConnectionC2299a = new ServiceConnectionC2299a();
                try {
                    if (contextM15871a.bindService(intentM6660a, serviceConnectionC2299a, 1)) {
                        try {
                            try {
                                serviceConnectionC2299a.f11541a.await(5L, TimeUnit.SECONDS);
                                IBinder iBinder = serviceConnectionC2299a.f11542b;
                                if (iBinder != null) {
                                    InterfaceC8207a interfaceC8207aM16351h = InterfaceC8207a.a.m16351h(iBinder);
                                    Bundle bundleM19415a = C10455c.m19415a(eventType, str, list);
                                    if (bundleM19415a != null) {
                                        interfaceC8207aM16351h.mo16350z(bundleM19415a);
                                        C5086z c5086z = C5086z.f33015a;
                                        C5086z.m10807F(str2, C5207g.m11116k(bundleM19415a, "Successfully sent events to the remote service: "));
                                    }
                                    serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                                }
                                contextM15871a.unbindService(serviceConnectionC2299a);
                                C5086z c5086z2 = C5086z.f33015a;
                            } catch (InterruptedException e10) {
                                serviceResult = ServiceResult.SERVICE_ERROR;
                                C5086z.m10806E(str2, e10);
                                contextM15871a.unbindService(serviceConnectionC2299a);
                                serviceResult2 = serviceResult;
                            }
                        } catch (RemoteException e11) {
                            serviceResult = ServiceResult.SERVICE_ERROR;
                            C5086z.m10806E(str2, e11);
                            contextM15871a.unbindService(serviceConnectionC2299a);
                            serviceResult2 = serviceResult;
                        }
                        C5086z.m10807F(str2, "Unbound from the remote service");
                    } else {
                        serviceResult2 = ServiceResult.SERVICE_ERROR;
                    }
                } catch (Throwable th2) {
                    contextM15871a.unbindService(serviceConnectionC2299a);
                    C5086z.m10807F(str2, "Unbound from the remote service");
                    throw th2;
                }
            }
            return serviceResult2;
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }
}
