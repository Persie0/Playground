package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gui extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RemoteControlService f26432a;

    public gui() {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9775b() {
        RemoteControlService remoteControlService = this.f26432a;
        return remoteControlService.m4286f() && remoteControlService.f6896b.f21141c > 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gui(RemoteControlService remoteControlService) {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
        this.f26432a = remoteControlService;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(2);
                return true;
            case 2:
                boolean zM4286f = this.f26432a.m4286f();
                parcel2.writeNoException();
                int i2 = cbs.f4964a;
                parcel2.writeInt(zM4286f ? 1 : 0);
                return true;
            case 3:
                boolean zM9775b = m9775b();
                parcel2.writeNoException();
                int i3 = cbs.f4964a;
                parcel2.writeInt(zM9775b ? 1 : 0);
                return true;
            case 4:
                int i4 = parcel.readInt();
                cbs.m3403b(parcel);
                if (this.f26432a.m4286f()) {
                    RemoteControlService remoteControlService = this.f26432a;
                    remoteControlService.f6898d = i4;
                    remoteControlService.m4283c().f26434b = 1 == (this.f26432a.f6898d & 1);
                }
                return true;
            case 5:
                int i5 = parcel.readInt();
                boolean zM3406e = cbs.m3406e(parcel);
                cbs.m3403b(parcel);
                if (this.f26432a.m4286f()) {
                    boolean zM9775b2 = m9775b();
                    if (zM9775b2 || i5 == 5) {
                        switch (i5) {
                            case 1:
                                this.f26432a.m4284d(1, zM3406e);
                                break;
                            case 2:
                                this.f26432a.m4284d(2, zM3406e);
                                break;
                            case 3:
                                this.f26432a.m4284d(3, zM3406e);
                                break;
                            case 4:
                                this.f26432a.m4284d(4, zM3406e);
                                break;
                            case 5:
                                if (zM9775b2) {
                                    this.f26432a.m4284d(5, zM3406e);
                                } else if (zM3406e) {
                                    this.f26432a.m4285e(true);
                                }
                                break;
                            case 6:
                                if (zM9775b2) {
                                    this.f26432a.m4284d(6, zM3406e);
                                } else if (zM3406e) {
                                    this.f26432a.m4285e(false);
                                }
                                break;
                            case 7:
                                this.f26432a.m4284d(7, zM3406e);
                                break;
                            default:
                                ((nbe) ((nbe) RemoteControlService.f6895a.m17251b()).mo17276G((char) 3265)).mo17290o("handleRemoteKeyEvent: Unknown Key event received. Ignoring it.");
                                break;
                        }
                    } else if (i5 == 6) {
                        if (zM9775b2) {
                            this.f26432a.m4284d(6, zM3406e);
                        } else if (zM3406e) {
                            this.f26432a.m4285e(false);
                        }
                    }
                }
                return true;
            case 6:
                int i6 = parcel.readInt();
                cbs.m3403b(parcel);
                if (this.f26432a.m4286f()) {
                    if (i6 < 0 || i6 > 100) {
                        ((nbe) ((nbe) RemoteControlService.f6895a.m17251b()).mo17276G(3266)).mo17291p("Ignoring invalid value for external case battery: %d", i6);
                    } else {
                        guk gukVarM4283c = this.f26432a.m4283c();
                        gukVarM4283c.f26435c = i6;
                        Iterator it = gukVarM4283c.f26440h.iterator();
                        while (it.hasNext()) {
                            ((guj) it.next()).mo3461a(i6);
                        }
                    }
                }
                return true;
            case 7:
                float f = parcel.readFloat();
                cbs.m3403b(parcel);
                if (this.f26432a.m4286f()) {
                    guk gukVarM4283c2 = this.f26432a.m4283c();
                    gukVarM4283c2.f26436d = f;
                    gukVarM4283c2.f26437e = System.currentTimeMillis();
                    Iterator it2 = gukVarM4283c2.f26440h.iterator();
                    while (it2.hasNext()) {
                        ((guj) it2.next()).mo3463c(f);
                    }
                }
                return true;
            case 8:
                float f2 = parcel.readFloat();
                cbs.m3403b(parcel);
                if (this.f26432a.m4286f()) {
                    guk gukVarM4283c3 = this.f26432a.m4283c();
                    gukVarM4283c3.f26438f = f2;
                    gukVarM4283c3.f26439g = System.currentTimeMillis();
                    Iterator it3 = gukVarM4283c3.f26440h.iterator();
                    while (it3.hasNext()) {
                        ((guj) it3.next()).mo3464d(f2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
