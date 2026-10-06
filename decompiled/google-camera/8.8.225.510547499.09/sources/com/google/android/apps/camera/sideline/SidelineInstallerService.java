package com.google.android.apps.camera.sideline;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.Service;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.sideline.SidelineInstallerService;
import com.google.common.p019io.ByteStreams;
import com.google.lens.sdk.LensApi;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.djm;
import p000.emp;
import p000.emv;
import p000.fod;
import p000.gxw;
import p000.gzy;
import p000.hbv;
import p000.hbw;
import p000.hca;
import p000.ksa;
import p000.kxk;
import p000.nbe;
import p000.nnj;
import p000.nol;
import p000.not;
import p000.nqf;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SidelineInstallerService extends Service {

    /* JADX INFO: renamed from: a */
    public hbv f6924a;

    /* JADX INFO: renamed from: b */
    public djm f6925b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((hbw) ((emv) getApplicationContext()).mo4193e(hbw.class)).mo7825t(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        byte b;
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "com.google.android.apps.camera.sideline.START_UPDATE":
                b = 0;
                break;
            case "com.google.android.apps.camera.sideline.ON_INSTALL_STATUS_CHANGED":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        int i3 = 2;
        switch (b) {
            case 0:
                djm djmVar = this.f6925b;
                NotificationChannel notificationChannelM6250z = djmVar.m6250z();
                startForeground(42014, new Notification.Builder((Context) djmVar.f11789c, notificationChannelM6250z.getId()).setSmallIcon(R.drawable.stat_sys_download).setContentTitle(((Context) djmVar.f11789c).getString(C0100R.string.installing_updates_notification_title)).setContentText(((Context) djmVar.f11789c).getString(C0100R.string.installing_updates_notification_text)).setOngoing(true).setWhen(System.currentTimeMillis()).setShowWhen(true).setForegroundServiceBehavior(1).build());
                final hbv hbvVar = this.f6924a;
                nqf nqfVar = hbvVar.f27187q;
                if (nqfVar == null || nqfVar.isDone()) {
                    hbvVar.f27187q = nqf.m17621g();
                    hbvVar.f27183m.mo10033e(gzy.f27027ak, Integer.valueOf(((Integer) hbvVar.f27182l.mo10031c(gzy.f27027ak)).intValue() + 1));
                    hca hcaVar = hbvVar.f27181k;
                    long j = hcaVar.f27219b;
                    long j2 = hcaVar.f27220c;
                    ksa ksaVar = hcaVar.f27218a;
                    hcaVar.f27221d = SystemClock.elapsedRealtime();
                    hbvVar.f27190t.m15386c(3);
                    hbvVar.f27176f.execute(new Runnable() { // from class: hbt
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4;
                            hbv hbvVar2 = hbvVar;
                            String str = hbvVar2.f27174d;
                            int i5 = 9;
                            boolean z = false;
                            try {
                                try {
                                    PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
                                    sessionParams.setInstallAsApex();
                                    try {
                                        PackageInstaller.Session sessionOpenSession = hbvVar2.f27179i.openSession(hbvVar2.f27179i.createSession(sessionParams));
                                        i4 = 3;
                                        try {
                                            SystemClock.uptimeMillis();
                                            OutputStream outputStreamOpenWrite = sessionOpenSession.openWrite("package", 0L, -1L);
                                            try {
                                                try {
                                                    pbj pbjVar = new pbj(hbvVar2.f27172b.getAssets().open(str));
                                                    try {
                                                        ByteStreams.copy(pbjVar, outputStreamOpenWrite);
                                                        pbjVar.close();
                                                        if (outputStreamOpenWrite != null) {
                                                            outputStreamOpenWrite.close();
                                                        }
                                                        SystemClock.uptimeMillis();
                                                        try {
                                                            Intent intent2 = new Intent(hbvVar2.f27172b, (Class<?>) SidelineInstallerService.class);
                                                            intent2.setAction("com.google.android.apps.camera.sideline.ON_INSTALL_STATUS_CHANGED");
                                                            Context context = hbvVar2.f27172b;
                                                            lku.m15670x(true, "Cannot set any dangerous parts of intent to be mutable.");
                                                            lku.m15670x(true, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
                                                            lku.m15670x(true, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
                                                            lku.m15670x(true, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
                                                            lku.m15670x(true, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
                                                            lku.m15670x(intent2.getComponent() != null, "Must set component on Intent.");
                                                            if (lrk.m15913a(1, 1)) {
                                                                lku.m15670x(!lrk.m15913a(33554432, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
                                                            } else {
                                                                lku.m15670x(lrk.m15913a(33554432, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
                                                            }
                                                            Intent intent3 = new Intent(intent2);
                                                            if (!lrk.m15913a(33554432, 67108864)) {
                                                                if (intent3.getPackage() == null) {
                                                                    intent3.setPackage(intent3.getComponent().getPackageName());
                                                                }
                                                                if (!lrk.m15913a(1, 3) && intent3.getAction() == null) {
                                                                    intent3.setAction("");
                                                                }
                                                                if (!lrk.m15913a(1, 9) && intent3.getCategories() == null) {
                                                                    intent3.addCategory("");
                                                                }
                                                                if (!lrk.m15913a(1, 5) && intent3.getData() == null) {
                                                                    intent3.setDataAndType(Uri.EMPTY, "*/*");
                                                                }
                                                                if (!lrk.m15913a(1, 17) && intent3.getClipData() == null) {
                                                                    intent3.setClipData(lrk.f39088a);
                                                                }
                                                            }
                                                            PendingIntent service = PendingIntent.getService(context, 0, intent3, 33554432);
                                                            service.getClass();
                                                            try {
                                                                sessionOpenSession.commit(service.getIntentSender());
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                i4 = 5;
                                                                ((nbe) ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17283h(th)).mo17276G(3438)).mo17291p("Exception when trying to install HAL at anchor %d", i4);
                                                                String localizedMessage = th.getLocalizedMessage();
                                                                boolean z2 = th instanceof SecurityException;
                                                                if (z2 && localizedMessage != null && localizedMessage.contains("FRP")) {
                                                                    z = true;
                                                                }
                                                                boolean zEquals = rmwTRjObXLGH.TfdHlO.equals(Build.TYPE);
                                                                int i6 = z ? 11 : 10;
                                                                if (hbvVar2.f27173c.m6200b(dja.DOGFOOD) && (!z || zEquals)) {
                                                                    hbvVar2.f27191u.m6220A();
                                                                }
                                                                if (th instanceof IOException) {
                                                                    i5 = 1;
                                                                } else if (z2) {
                                                                    i5 = 2;
                                                                }
                                                                hbvVar2.f27187q.mo14894e(true);
                                                                int i7 = (i5 * 100) + i4;
                                                                if (z) {
                                                                    i7 = zEquals ? (i7 * 10) + 1 : i7 * 10;
                                                                }
                                                                hbvVar2.f27181k.m10099b(i7, i6);
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            i4 = 4;
                                                        }
                                                    } catch (Throwable th3) {
                                                        try {
                                                            pbjVar.close();
                                                        } catch (Throwable th4) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th5) {
                                                    if (outputStreamOpenWrite != null) {
                                                        try {
                                                            outputStreamOpenWrite.close();
                                                        } catch (Throwable th6) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                                        }
                                                    }
                                                    throw th5;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i4 = 2;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    i4 = 1;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                i4 = 1;
                            }
                        }
                    });
                    hbvVar.f27187q.mo2282d(new gxw(hbvVar, i3), hbvVar.f27178h);
                    nnj.m17523i(kxk.m14972R(hbvVar.f27187q, 70L, TimeUnit.SECONDS, hbvVar.f27177g), TimeoutException.class, fod.f22913r, not.INSTANCE);
                } else {
                    ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17276G((char) 3448)).mo17290o("startHalUpdate called when HAL is still updating!");
                }
                return 2;
            case 1:
                final hbv hbvVar2 = this.f6924a;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i4 = extras.getInt("android.content.pm.extra.STATUS");
                    Optional optionalOfNullable = Optional.ofNullable(extras.getString("android.content.pm.extra.STATUS_MESSAGE"));
                    optionalOfNullable.orElse(null);
                    switch (i4) {
                        case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                            ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17276G((char) 3441)).mo17290o("Package installer is asking user for permission. This should not happen in HAL update!");
                            hbvVar2.m10093a(i4, optionalOfNullable);
                            break;
                        case 0:
                            hbvVar2.m10095c();
                            hca hcaVar2 = hbvVar2.f27181k;
                            ksa ksaVar2 = hcaVar2.f27218a;
                            hcaVar2.f27222e = SystemClock.elapsedRealtime();
                            hbvVar2.f27189s = hbvVar2.f27186p.mo13957a("SidelineInstaller#waitForHalRestart");
                            final long jUptimeMillis = SystemClock.uptimeMillis();
                            kxk.m14967M(new nol() { // from class: hbu
                                @Override // p000.nol
                                /* JADX INFO: renamed from: a */
                                public final nps mo3988a() {
                                    hbv hbvVar3 = hbvVar2;
                                    long j3 = jUptimeMillis;
                                    nps npsVarM6437c = hbvVar3.f27180j.m6437c(60000);
                                    kxk.m14975U(npsVarM6437c, new eho(hbvVar3, j3, 3), hbvVar3.f27178h);
                                    return npsVarM6437c;
                                }
                            }, 3L, TimeUnit.SECONDS, hbvVar2.f27177g);
                            break;
                        case 1:
                            hbvVar2.m10094b();
                            hbvVar2.m10093a(i4, optionalOfNullable);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                            hbvVar2.m10093a(i4, optionalOfNullable);
                            break;
                        case 6:
                            if (((emp) hbvVar2.f27185o).get().schedule(new JobInfo.Builder(58451, new ComponentName(hbvVar2.f27172b, (Class<?>) SidelineJobService.class)).setPersisted(true).setRequiresStorageNotLow(true).build()) != 1) {
                                ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G((char) 3446)).mo17290o("Failed to schedule retry!");
                            }
                            hbvVar2.m10093a(i4, optionalOfNullable);
                            break;
                        default:
                            ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17276G(3440)).mo17291p("Unrecognized status received from installer: %d", i4);
                            break;
                    }
                } else {
                    ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G((char) 3442)).mo17290o("extras is null from PackageInstaller.");
                }
                return 2;
            default:
                return 2;
        }
    }
}
