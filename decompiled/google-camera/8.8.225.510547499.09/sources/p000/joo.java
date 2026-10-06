package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.p020vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joo extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34489a;

    /* JADX INFO: renamed from: b */
    private final Object f34490b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(Context context, int i) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f34489a = i;
        this.f34490b = context;
    }

    /* JADX INFO: renamed from: b */
    private final void m13411b() {
        if (jiy.m13275b((Context) this.f34490b, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(khb khbVar, int i, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.f34489a = i;
        this.f34490b = khbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(jfx jfxVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.f34489a = i;
        this.f34490b = jfxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(lqq lqqVar, int i, byte[] bArr) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.f34489a = i;
        this.f34490b = new WeakReference(lqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(ControllerServiceBridge controllerServiceBridge, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.f34489a = i;
        this.f34490b = new WeakReference(controllerServiceBridge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v70, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r8v47, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v53, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v58, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult jehVar;
        switch (this.f34489a) {
            case 0:
                switch (i) {
                    case 1:
                        Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status, (khb) this.f34490b);
                        return true;
                    case 2:
                        Status status2 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status2, (khb) this.f34490b);
                        return true;
                    case 3:
                        Status status3 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status3, (khb) this.f34490b);
                        return true;
                    case 4:
                        Status status4 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        job jobVar = (job) cbs.m3402a(parcel, job.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status4, jobVar, (khb) this.f34490b);
                        return true;
                    case 5:
                        Status status5 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status5, (khb) this.f34490b);
                        return true;
                    case 6:
                        Status status6 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        jod jodVar = (jod) cbs.m3402a(parcel, jod.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status6, jodVar, (khb) this.f34490b);
                        return true;
                    case 7:
                        Status status7 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        joc jocVar = (joc) cbs.m3402a(parcel, joc.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status7, jocVar, (khb) this.f34490b);
                        return true;
                    case 8:
                        Status status8 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status8, (khb) this.f34490b);
                        return true;
                    case 9:
                        Status status9 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        jof jofVar = (jof) cbs.m3402a(parcel, jof.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status9, jofVar, (khb) this.f34490b);
                        return true;
                    case 10:
                        Status status10 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        job jobVar2 = (job) cbs.m3402a(parcel, job.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status10, jobVar2, (khb) this.f34490b);
                        return true;
                    case 11:
                        Status status11 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        cbs.m3403b(parcel);
                        jib.m13215t(status11, Long.valueOf(j), (khb) this.f34490b);
                        return true;
                    case 12:
                        Status status12 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status12, (khb) this.f34490b);
                        return true;
                    case 13:
                        Status status13 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        joh johVar = (joh) cbs.m3402a(parcel, joh.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13215t(status13, johVar, (khb) this.f34490b);
                        return true;
                    case 14:
                        Status status14 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status14, (khb) this.f34490b);
                        return true;
                    case 15:
                        Status status15 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        cbs.m3403b(parcel);
                        jib.m13214s(status15, (khb) this.f34490b);
                        return true;
                    case 16:
                        Status status16 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                        long j2 = parcel.readLong();
                        cbs.m3403b(parcel);
                        jib.m13215t(status16, Long.valueOf(j2), (khb) this.f34490b);
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i) {
                    case 1:
                        m13411b();
                        jbv jbvVarM12850c = jbv.m12850c((Context) this.f34490b);
                        GoogleSignInAccount googleSignInAccountM12851a = jbvVarM12850c.m12851a();
                        GoogleSignInOptions googleSignInOptionsM12852b = GoogleSignInOptions.f7575f;
                        if (googleSignInAccountM12851a != null) {
                            googleSignInOptionsM12852b = jbvVarM12850c.m12852b();
                        }
                        jbc jbcVarM12858c = jbx.m12858c((Context) this.f34490b, googleSignInOptionsM12852b);
                        if (googleSignInAccountM12851a == null) {
                            jbcVarM12858c.m12828a();
                            return true;
                        }
                        jec jecVar = jbcVarM12858c.f33826i;
                        Context context = jbcVarM12858c.f33820c;
                        int iM12829b = jbcVarM12858c.m12829b();
                        jbo.f33666a.m15892e("Revoking access");
                        String strM12853d = jbv.m12850c(context).m12853d("refreshToken");
                        jbo.m12842a(context);
                        if (iM12829b != 3) {
                            jbm jbmVar = new jbm(jecVar);
                            jecVar.mo12968c(jbmVar);
                            jehVar = jbmVar;
                        } else if (strM12853d == null) {
                            Status status17 = new Status(4);
                            jib.m13197b(!status17.m4645b(), "Status code must not be SUCCESS");
                            jehVar = new jeh(status17);
                            jehVar.m4649i(status17);
                        } else {
                            jbe jbeVar = new jbe(strM12853d);
                            new Thread(jbeVar).start();
                            jehVar = jbeVar.f33656a;
                        }
                        jib.m13208m(jehVar);
                        return true;
                    case 2:
                        m13411b();
                        jbq.m12843c((Context) this.f34490b).m12847d();
                        return true;
                    default:
                        return false;
                }
            case 2:
                if (i != 2) {
                    return false;
                }
                ((jfx) this.f34490b).m13123b(new jqo());
                return true;
            case 3:
                switch (i) {
                    case 1:
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    case 2:
                        int i2 = parcel.readInt();
                        int i3 = parcel.readInt();
                        cbs.m3403b(parcel);
                        lqq lqqVar = (lqq) ((WeakReference) this.f34490b).get();
                        if (lqqVar == null) {
                            return true;
                        }
                        lqqVar.f39002b.mo5200d(i2, i3);
                        return true;
                    case 9:
                        lqq lqqVar2 = (lqq) ((WeakReference) this.f34490b).get();
                        ?? r7 = lqqVar2 == null ? 0 : lqqVar2.f39003c;
                        parcel2.writeNoException();
                        int i4 = cbs.f4964a;
                        if (r7 == 0) {
                            parcel2.writeInt(0);
                            return true;
                        }
                        parcel2.writeInt(1);
                        r7.writeToParcel(parcel2, 1);
                        return true;
                    case 10:
                        ogj ogjVar = (ogj) cbs.m3402a(parcel, ogj.CREATOR);
                        cbs.m3403b(parcel);
                        lqq lqqVar3 = (lqq) ((WeakReference) this.f34490b).get();
                        if (lqqVar3 == null) {
                            return true;
                        }
                        ogjVar.mo18479d(lqqVar3.f39001a);
                        lqqVar3.f39002b.mo5197a(ogjVar);
                        ogjVar.mo18478c();
                        return true;
                    case 11:
                        ogm ogmVar = (ogm) cbs.m3402a(parcel, ogm.CREATOR);
                        cbs.m3403b(parcel);
                        lqq lqqVar4 = (lqq) ((WeakReference) this.f34490b).get();
                        if (lqqVar4 == null) {
                            return true;
                        }
                        ogmVar.f45912e = lqqVar4.f39001a;
                        lqqVar4.f39002b.mo5199c(ogmVar);
                        return true;
                    case 12:
                        ogi ogiVar = (ogi) cbs.m3402a(parcel, ogi.CREATOR);
                        cbs.m3403b(parcel);
                        lqq lqqVar5 = (lqq) ((WeakReference) this.f34490b).get();
                        if (lqqVar5 == null) {
                            return true;
                        }
                        int i5 = ControllerServiceBridge.f8457h;
                        if (ogiVar.f45919g != 0) {
                            long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) - ogiVar.f45919g;
                            if (jConvert > 300) {
                                Log.w("VrCtl.ServiceBridge", "Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: " + jConvert);
                            }
                        }
                        ogiVar.mo18479d(lqqVar5.f39001a);
                        lqqVar5.f39002b.mo5198b(ogiVar);
                        ogiVar.mo18478c();
                        return true;
                    default:
                        return false;
                }
            default:
                switch (i) {
                    case 1:
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    case 2:
                        int i6 = parcel.readInt();
                        cbs.m3403b(parcel);
                        ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) ((WeakReference) this.f34490b).get();
                        if (controllerServiceBridge == null || i6 != 1) {
                            return true;
                        }
                        controllerServiceBridge.f8460b.post(new ofo(controllerServiceBridge, 5));
                        return true;
                    default:
                        return false;
                }
        }
    }
}
