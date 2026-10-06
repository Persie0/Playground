package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.concurrent.ExecutorService;
import p000.jjb;
import p000.jly;
import p000.jma;
import p000.jmd;
import p000.jmh;
import p000.jml;
import p000.jmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    jmh dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            jmh jmhVar = (jmh) jma.m13349a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", jml.f34353a);
            try {
                if (jmhVar.mo13360i(jjb.m13304b(this), jjb.m13304b(getBgExecutor()))) {
                    this.dynamiteImpl = jmhVar;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (jly e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getBgExecutor() {
        return jmm.f34358a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar != null) {
            try {
                jmhVar.mo13357f();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar != null) {
            try {
                jmhVar.mo13358g(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar != null) {
            try {
                return jmhVar.mo13356e(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, HEePJw.xlcvLy, e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            jmd.m13355a(this, jobParameters);
            return false;
        }
        if (!tryLoadDynamiteImpl()) {
            jmd.m13355a(this, jobParameters);
            return false;
        }
        try {
            return this.dynamiteImpl.mo13361j(jobParameters);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
            }
            jmd.m13355a(this, jobParameters);
            return false;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar == null) {
            return false;
        }
        try {
            return jmhVar.mo13362k(jobParameters);
        } catch (RemoteException e) {
            if (!Log.isLoggable(TAG, 5)) {
                return false;
            }
            Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
            return false;
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar != null) {
            try {
                jmhVar.mo13359h(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        jmh jmhVar = this.dynamiteImpl;
        if (jmhVar != null) {
            try {
                return jmhVar.mo13363l(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
