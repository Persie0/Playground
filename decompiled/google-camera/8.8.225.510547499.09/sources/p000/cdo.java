package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cdo implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5319a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5320b;

    public cdo(Context context, int i) {
        this.f5320b = i;
        this.f5319a = context;
    }

    public cdo(ann annVar, int i) {
        this.f5320b = i;
        this.f5319a = annVar;
    }

    public /* synthetic */ cdo(bko bkoVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5320b = i;
        this.f5319a = bkoVar;
    }

    public /* synthetic */ cdo(cee ceeVar, int i) {
        this.f5320b = i;
        this.f5319a = ceeVar;
    }

    public /* synthetic */ cdo(csr csrVar, int i) {
        this.f5320b = i;
        this.f5319a = csrVar;
    }

    public /* synthetic */ cdo(dnu dnuVar, int i, byte[] bArr) {
        this.f5320b = i;
        this.f5319a = dnuVar;
    }

    public cdo(fit fitVar, int i, byte[] bArr) {
        this.f5320b = i;
        this.f5319a = fitVar;
    }

    public cdo(fit fitVar, int i, char[] cArr) {
        this.f5320b = i;
        this.f5319a = fitVar;
    }

    public cdo(foc focVar, int i) {
        this.f5320b = i;
        this.f5319a = focVar;
    }

    public cdo(hee heeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5320b = i;
        this.f5319a = heeVar;
    }

    public /* synthetic */ cdo(hml hmlVar, int i) {
        this.f5320b = i;
        this.f5319a = hmlVar;
    }

    public /* synthetic */ cdo(hpu hpuVar, int i) {
        this.f5320b = i;
        this.f5319a = hpuVar;
    }

    public /* synthetic */ cdo(hrk hrkVar, int i) {
        this.f5320b = i;
        this.f5319a = hrkVar;
    }

    public /* synthetic */ cdo(jfs jfsVar, int i, byte[] bArr, byte[] bArr2) {
        this.f5320b = i;
        this.f5319a = jfsVar;
    }

    public /* synthetic */ cdo(C1058va c1058va, int i, byte[] bArr) {
        this.f5320b = i;
        this.f5319a = c1058va;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        chm chmVar;
        switch (this.f5320b) {
            case 0:
                Object obj = this.f5319a;
                dialogInterface.dismiss();
                ((cej) ((dnu) obj).f12119a).m3557a(rmwTRjObXLGH.MqjtSqcoMQYqO);
                break;
            case 1:
                Object obj2 = this.f5319a;
                ((ann) obj2).f1842ad = i;
                ((anz) obj2).f1856ah = -1;
                dialogInterface.dismiss();
                break;
            case 2:
                ((cej) ((C1058va) this.f5319a).f47802a).m3557a("ImageIntent: No write permission to intent media output uri.");
                break;
            case 3:
                cee ceeVar = (cee) this.f5319a;
                ceeVar.f5421f.mo14894e(false);
                ceeVar.f5417b.m3557a("Required camera permissions were not granted.");
                break;
            case 4:
                Object obj3 = this.f5319a;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addCategory("android.intent.category.DEFAULT");
                cee ceeVar2 = (cee) obj3;
                intent.setData(Uri.parse("package:".concat(String.valueOf(ceeVar2.f5416a.getPackageName()))));
                ceeVar2.f5423h.m2612f(intent);
                ceeVar2.f5421f.mo14894e(false);
                ceeVar2.f5417b.m3557a("Closing until required permissions are granted.");
                break;
            case 5:
                csr csrVar = (csr) this.f5319a;
                chm chmVar2 = csrVar.f9379d;
                if (chmVar2 != null) {
                    chmVar2.mo3720j(true);
                }
                if (csrVar.f9376a.mo5410p()) {
                    csrVar.f9377b.mo11024w(ikw.PHOTO);
                }
                if (csrVar.f9376a.mo5400f() && (chmVar = csrVar.f9379d) != null) {
                    chmVar.mo3714d();
                }
                dialogInterface.dismiss();
                break;
            case 6:
                chm chmVar3 = ((csr) this.f5319a).f9379d;
                if (chmVar3 != null) {
                    chmVar3.mo3720j(true);
                }
                dialogInterface.dismiss();
                break;
            case 7:
                ((Context) ((bko) this.f5319a).f3652a).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=com.google.android.apps.photos")).addCategory("android.intent.category.BROWSABLE"));
                break;
            case 8:
                ((Context) ((bko) this.f5319a).f3652a).startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:com.google.android.apps.photos")));
                break;
            case 9:
                ((cej) ((hee) this.f5319a).f27439c).m3557a("CaptureModule: Out of storage space on device.");
                break;
            case 10:
                foc focVar = (foc) ((fit) this.f5319a).f22150a;
                exm exmVar = focVar.f22887r;
                if (exmVar == null || exmVar.f20776r) {
                    ((nbe) ((nbe) foc.f22821b.m17252c()).mo17276G((char) 2385)).mo17290o("Photo is being taken, ignoring user's request for cancel.");
                } else {
                    focVar.m8620x();
                }
                break;
            case 11:
                ((foc) ((fit) this.f5319a).f22150a).m8622z();
                break;
            case 12:
                ((foc) this.f5319a).f22888s.mo3693g().mo3714d();
                break;
            case 13:
                ((foc) this.f5319a).f22888s.mo3707u("Fatal error in Panorama module: 2132018098");
                break;
            case 14:
                ((Context) ((jfs) this.f5319a).f33914a).startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
                break;
            case 15:
                hml hmlVar = (hml) this.f5319a;
                Intent intentM10458a = hmk.m10458a(hmlVar.f28329a, hmlVar.f28331c);
                mrm mrmVar = hmlVar.f28330b;
                if (!mrmVar.mo16813g()) {
                    hmlVar.f28329a.startActivity(intentM10458a);
                } else {
                    ((gvo) mrmVar.mo16809c()).mo9799g(intentM10458a);
                }
                break;
            case 16:
                ((hpu) this.f5319a).f28997c.mo3693g().mo3714d();
                dialogInterface.dismiss();
                break;
            case 17:
                ((hpu) this.f5319a).f28997c.mo3693g().mo3714d();
                dialogInterface.dismiss();
                break;
            case 18:
                Object obj4 = this.f5319a;
                dialogInterface.dismiss();
                hrk hrkVar = (hrk) obj4;
                hrkVar.f29298c.mo3415bf(true);
                hrkVar.f29299d.mo9128n(hrkVar.f29304i);
                hrkVar.m10653b();
                break;
            case 19:
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
                intent2.setPackage(hIAHJKEnGsNbz.xPsgVxdDplW);
                try {
                    ((Context) this.f5319a).startActivity(intent2);
                } catch (ActivityNotFoundException e) {
                    Log.e(oev.f45813a, "Google Play Services is not installed, unable to download VrCore.");
                    return;
                }
                break;
            default:
                ((Context) this.f5319a).startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
                break;
        }
    }
}
