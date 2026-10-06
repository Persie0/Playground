package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import p000.jjb;
import p000.jlw;
import p000.jly;
import p000.jma;
import p000.jmc;
import p000.jmk;
import p000.jml;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    jmk dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                return jmkVar.mo13365f(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new jlw("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            jmk jmkVar = (jmk) jma.m13349a(this, xPAWq.CDpWThDUUWUhJ, jml.f34356d);
            try {
                jmkVar.mo13366g(jjb.m13304b(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                jmkVar.mo13371l(new jmc(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = jmkVar;
        } catch (jly e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                jmkVar.mo13367h();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                jmkVar.mo13368i(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                return jmkVar.mo13364e(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, WIxTIdUIdfb.rfRoEMkZZ, e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                jmkVar.mo13369j(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        jmk jmkVar = this.dynamiteImpl;
        if (jmkVar != null) {
            try {
                return jmkVar.mo13370k(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
