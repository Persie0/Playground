package td;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import p338qd.BinderC8575s;
import p338qd.ServiceConnectionC8552k0;

/* JADX INFO: renamed from: td.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC9253b0 extends BinderC9273u {
    public AbstractBinderC9253b0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // td.BinderC9273u
    /* JADX INFO: renamed from: h */
    public final boolean mo17617h(int i10, Parcel parcel) throws RemoteException {
        C9255c0 c9255c0 = null;
        if (i10 == 2) {
            Bundle bundle = (Bundle) C9274v.m17634a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                c9255c0 = iInterfaceQueryLocalInterface instanceof C9255c0 ? (C9255c0) iInterfaceQueryLocalInterface : new C9255c0(strongBinder);
            }
            BinderC8575s binderC8575s = (BinderC8575s) this;
            synchronized (binderC8575s) {
                try {
                    binderC8575s.f45986a.m15811l("updateServiceState AIDL call", new Object[0]);
                    if (C9264l.m17625b(binderC8575s.f45987b) && C9264l.m17624a(binderC8575s.f45987b)) {
                        int i11 = bundle.getInt("action_type");
                        ServiceConnectionC8552k0 serviceConnectionC8552k0 = binderC8575s.f45990e;
                        synchronized (serviceConnectionC8552k0.f45898b) {
                            try {
                                serviceConnectionC8552k0.f45898b.add(c9255c0);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i11 == 1) {
                            String string = bundle.getString("notification_channel_name");
                            synchronized (binderC8575s) {
                                if (string == null) {
                                    string = "File downloads by Play";
                                }
                                try {
                                    binderC8575s.f45991f.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                                    binderC8575s.f45989d.m16660a(true);
                                    ServiceConnectionC8552k0 serviceConnectionC8552k1 = binderC8575s.f45990e;
                                    String string2 = bundle.getString("notification_title");
                                    String string3 = bundle.getString("notification_subtext");
                                    long j10 = bundle.getLong("notification_timeout", 600000L);
                                    Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                                    Notification.Builder timeoutAfter = new Notification.Builder(binderC8575s.f45987b, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j10);
                                    if (parcelable instanceof PendingIntent) {
                                        timeoutAfter.setContentIntent((PendingIntent) parcelable);
                                    }
                                    Notification.Builder ongoing = timeoutAfter.setSmallIcon(R.drawable.stat_sys_download).setOngoing(false);
                                    if (string2 == null) {
                                        string2 = "Downloading additional file";
                                    }
                                    Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                                    if (string3 == null) {
                                        string3 = "Transferring";
                                    }
                                    contentTitle.setSubText(string3);
                                    int i12 = bundle.getInt("notification_color");
                                    if (i12 != 0) {
                                        timeoutAfter.setColor(i12).setVisibility(-1);
                                    }
                                    serviceConnectionC8552k1.f45901e = timeoutAfter.build();
                                    binderC8575s.f45987b.bindService(new Intent(binderC8575s.f45987b, (Class<?>) ExtractionForegroundService.class), binderC8575s.f45990e, 1);
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } else if (i11 == 2) {
                            binderC8575s.f45989d.m16660a(false);
                            ServiceConnectionC8552k0 serviceConnectionC8552k2 = binderC8575s.f45990e;
                            serviceConnectionC8552k2.f45897a.m15811l("Stopping foreground installation service.", new Object[0]);
                            serviceConnectionC8552k2.f45899c.unbindService(serviceConnectionC8552k2);
                            ExtractionForegroundService extractionForegroundService = serviceConnectionC8552k2.f45900d;
                            if (extractionForegroundService != null) {
                                synchronized (extractionForegroundService) {
                                    extractionForegroundService.stopForeground(true);
                                    extractionForegroundService.stopSelf();
                                }
                            }
                            serviceConnectionC8552k2.m16657a();
                        } else {
                            binderC8575s.f45986a.m15812m("Unknown action type received: %d", Integer.valueOf(i11));
                            c9255c0.m17618e(new Bundle());
                        }
                    } else {
                        c9255c0.m17618e(new Bundle());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                c9255c0 = iInterfaceQueryLocalInterface2 instanceof C9255c0 ? (C9255c0) iInterfaceQueryLocalInterface2 : new C9255c0(strongBinder2);
            }
            BinderC8575s binderC8575s2 = (BinderC8575s) this;
            binderC8575s2.f45986a.m15811l("clearAssetPackStorage AIDL call", new Object[0]);
            Context context = binderC8575s2.f45987b;
            if (C9264l.m17625b(context) && C9264l.m17624a(context)) {
                C3112c.m8967g(binderC8575s2.f45988c.m8970d());
                Bundle bundle2 = new Bundle();
                Parcel parcelM17632h = c9255c0.m17632h();
                parcelM17632h.writeInt(1);
                bundle2.writeToParcel(parcelM17632h, 0);
                c9255c0.m17633j(parcelM17632h, 4);
            } else {
                c9255c0.m17618e(new Bundle());
            }
        }
        return true;
    }
}
