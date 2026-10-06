package p000;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmr implements jlc {

    /* JADX INFO: renamed from: a */
    private final jmi f34367a;

    public jmr(jmi jmiVar) {
        this.f34367a = jmiVar;
    }

    /* JADX INFO: renamed from: c */
    public static jpp m13372c(final Context context, final Executor executor, final jle jleVar) {
        final khb khbVar = new khb((byte[]) null, (byte[]) null);
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        executor.execute(new Runnable(context, khbVar, executor, jleVar, bArr, bArr2) { // from class: jmn

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f34359a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Executor f34360b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ jle f34361c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ khb f34362d;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Context context2 = this.f34359a;
                khb khbVar2 = this.f34362d;
                Executor executor2 = this.f34360b;
                jle jleVar2 = this.f34361c;
                synchronized (jkw.f34274a) {
                    z = jkw.f34275b;
                }
                if (!z) {
                    Class<?> cls = context2.getApplicationContext().getClass();
                    if (!cls.equals(Application.class) && !"android.support.multidex.MultiDexApplication".equals(cls.getName())) {
                        khbVar2.m14244j(new jdv(new Status(10, "Cannot create in-app trainer: android.app.Application class has been subclassed (" + cls.getName() + ") and BrellaInit.myAppCanHandleMultipleProcesses() was not called")));
                        return;
                    }
                }
                try {
                    jmi jmiVar = (jmi) jma.m13349a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerImpl", jml.f34355c);
                    jmo jmoVar = new jmo(khbVar2, jmiVar, null, null);
                    try {
                        jjc jjcVarM13304b = jjb.m13304b(context2);
                        jjc jjcVarM13304b2 = jjb.m13304b(executor2);
                        Parcel parcelM3398a = jmiVar.m3398a();
                        cbs.m3405d(parcelM3398a, jjcVarM13304b);
                        cbs.m3405d(parcelM3398a, jjcVarM13304b2);
                        cbs.m3404c(parcelM3398a, jleVar2);
                        cbs.m3405d(parcelM3398a, jmoVar);
                        Parcel parcelM3399y = jmiVar.m3399y(12, parcelM3398a);
                        boolean zM3406e = cbs.m3406e(parcelM3399y);
                        parcelM3399y.recycle();
                        if (zM3406e) {
                            return;
                        }
                        if (jmr.m13373d(jleVar2.f34294k) || jmr.m13373d(jleVar2.f34292i) || jmr.m13373d(jleVar2.f34289f)) {
                            khbVar2.m14244j(new jdv(new Status(10, "appdata Uri scheme is not supported.")));
                            return;
                        }
                        try {
                            jjc jjcVarM13304b3 = jjb.m13304b(context2);
                            jjc jjcVarM13304b4 = jjb.m13304b(executor2);
                            Parcel parcelM3398a2 = jmiVar.m3398a();
                            cbs.m3405d(parcelM3398a2, jjcVarM13304b3);
                            cbs.m3405d(parcelM3398a2, jjcVarM13304b4);
                            cbs.m3404c(parcelM3398a2, jleVar2);
                            cbs.m3405d(parcelM3398a2, jmoVar);
                            Parcel parcelM3399y2 = jmiVar.m3399y(10, parcelM3398a2);
                            boolean zM3406e2 = cbs.m3406e(parcelM3399y2);
                            parcelM3399y2.recycle();
                            if (zM3406e2) {
                                return;
                            }
                            if (jleVar2.f34294k != null) {
                                khbVar2.m14244j(new jdv(new Status(10, "local computation plan with TensorflowSpec is not supported.")));
                                return;
                            }
                            try {
                                jjc jjcVarM13304b5 = jjb.m13304b(context2);
                                jjc jjcVarM13304b6 = jjb.m13304b(executor2);
                                Parcel parcelM3398a3 = jmiVar.m3398a();
                                cbs.m3405d(parcelM3398a3, jjcVarM13304b5);
                                cbs.m3405d(parcelM3398a3, jjcVarM13304b6);
                                cbs.m3404c(parcelM3398a3, jleVar2);
                                cbs.m3405d(parcelM3398a3, jmoVar);
                                Parcel parcelM3399y3 = jmiVar.m3399y(9, parcelM3398a3);
                                boolean zM3406e3 = cbs.m3406e(parcelM3399y3);
                                parcelM3399y3.recycle();
                                if (zM3406e3) {
                                    return;
                                }
                                if (jleVar2.m13340b().length > 0) {
                                    khbVar2.m14244j(new jdv(new Status(10, "Context data is not supported.")));
                                    return;
                                }
                                try {
                                    jjc jjcVarM13304b7 = jjb.m13304b(context2);
                                    jjc jjcVarM13304b8 = jjb.m13304b(executor2);
                                    Parcel parcelM3398a4 = jmiVar.m3398a();
                                    cbs.m3405d(parcelM3398a4, jjcVarM13304b7);
                                    cbs.m3405d(parcelM3398a4, jjcVarM13304b8);
                                    cbs.m3404c(parcelM3398a4, jleVar2);
                                    cbs.m3405d(parcelM3398a4, jmoVar);
                                    Parcel parcelM3399y4 = jmiVar.m3399y(8, parcelM3398a4);
                                    boolean zM3406e4 = cbs.m3406e(parcelM3399y4);
                                    parcelM3399y4.recycle();
                                    if (zM3406e4) {
                                        return;
                                    }
                                    if (jleVar2.f34287d != null && jleVar2.f34293j != null) {
                                        khbVar2.m14244j(new jdv(new Status(10, "Training interval is not supported for federated computation.")));
                                        return;
                                    }
                                    try {
                                        jjc jjcVarM13304b9 = jjb.m13304b(context2);
                                        jjc jjcVarM13304b10 = jjb.m13304b(executor2);
                                        Parcel parcelM3398a5 = jmiVar.m3398a();
                                        cbs.m3405d(parcelM3398a5, jjcVarM13304b9);
                                        cbs.m3405d(parcelM3398a5, jjcVarM13304b10);
                                        cbs.m3404c(parcelM3398a5, jleVar2);
                                        cbs.m3405d(parcelM3398a5, jmoVar);
                                        Parcel parcelM3399y5 = jmiVar.m3399y(7, parcelM3398a5);
                                        boolean zM3406e5 = cbs.m3406e(parcelM3399y5);
                                        parcelM3399y5.recycle();
                                        if (zM3406e5) {
                                            return;
                                        }
                                        int i = jleVar2.f34288e;
                                        if (i != 0 && i != 1) {
                                            khbVar2.m14244j(new jdv(new Status(10, "Unsupported AttestationMode")));
                                            return;
                                        }
                                        try {
                                            jjc jjcVarM13304b11 = jjb.m13304b(context2);
                                            jjc jjcVarM13304b12 = jjb.m13304b(executor2);
                                            Parcel parcelM3398a6 = jmiVar.m3398a();
                                            cbs.m3405d(parcelM3398a6, jjcVarM13304b11);
                                            cbs.m3405d(parcelM3398a6, jjcVarM13304b12);
                                            cbs.m3404c(parcelM3398a6, jleVar2);
                                            cbs.m3405d(parcelM3398a6, jmoVar);
                                            Parcel parcelM3399y6 = jmiVar.m3399y(6, parcelM3398a6);
                                            boolean zM3406e6 = cbs.m3406e(parcelM3399y6);
                                            parcelM3399y6.recycle();
                                            if (zM3406e6) {
                                                return;
                                            }
                                            khbVar2.m14244j(new jdv(new Status(17, "Failed to init impl")));
                                        } catch (RemoteException e) {
                                            khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e))));
                                        }
                                    } catch (RemoteException e2) {
                                        khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e2))));
                                    }
                                } catch (RemoteException e3) {
                                    khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e3))));
                                }
                            } catch (RemoteException e4) {
                                khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e4))));
                            }
                        } catch (RemoteException e5) {
                            khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e5))));
                        }
                    } catch (RemoteException e6) {
                        khbVar2.m14244j(new jdv(new Status(8, msm.m16867b(e6))));
                    }
                } catch (jly e7) {
                    khbVar2.m14244j(new jdv(new Status(17, "Cannot create in-app trainer: ".concat(String.valueOf(e7.getMessage())))));
                }
            }
        });
        return (jpp) khbVar.f36008a;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13373d(Uri uri) {
        return uri != null && "appdir".equals(uri.getScheme());
    }

    @Override // p000.jlc
    /* JADX INFO: renamed from: a */
    public final jpp mo13333a() {
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        jmq jmqVar = new jmq(khbVar, null, null);
        try {
            jmi jmiVar = this.f34367a;
            Parcel parcelM3398a = jmiVar.m3398a();
            cbs.m3405d(parcelM3398a, jmqVar);
            jmiVar.m3400z(4, parcelM3398a);
        } catch (RemoteException e) {
            khbVar.m14244j(new jdv(new Status(8, msm.m16867b(e))));
        }
        return (jpp) khbVar.f36008a;
    }

    @Override // p000.jlc
    /* JADX INFO: renamed from: b */
    public final jpp mo13334b() {
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        jmp jmpVar = new jmp(khbVar, null, null);
        try {
            jmi jmiVar = this.f34367a;
            Parcel parcelM3398a = jmiVar.m3398a();
            parcelM3398a.writeInt(0);
            cbs.m3405d(parcelM3398a, jmpVar);
            jmiVar.m3400z(3, parcelM3398a);
        } catch (RemoteException e) {
            khbVar.m14244j(new jdv(new Status(8, msm.m16867b(e))));
        }
        return (jpp) khbVar.f36008a;
    }
}
