package p000;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cqr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f9021a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f9022b;

    public /* synthetic */ cqr(cqm cqmVar, int i) {
        this.f9022b = i;
        this.f9021a = cqmVar;
    }

    public /* synthetic */ cqr(cqt cqtVar, int i) {
        this.f9022b = i;
        this.f9021a = cqtVar;
    }

    public cqr(cqt cqtVar, int i, byte[] bArr) {
        this.f9022b = i;
        this.f9021a = cqtVar;
    }

    public /* synthetic */ cqr(cqv cqvVar, int i) {
        this.f9022b = i;
        this.f9021a = cqvVar;
    }

    public /* synthetic */ cqr(cqy cqyVar, int i) {
        this.f9022b = i;
        this.f9021a = cqyVar;
    }

    public cqr(cra craVar, int i) {
        this.f9022b = i;
        this.f9021a = craVar;
    }

    public /* synthetic */ cqr(cru cruVar, int i) {
        this.f9022b = i;
        this.f9021a = cruVar;
    }

    public /* synthetic */ cqr(csd csdVar, int i) {
        this.f9022b = i;
        this.f9021a = csdVar;
    }

    public /* synthetic */ cqr(csr csrVar, int i) {
        this.f9022b = i;
        this.f9021a = csrVar;
    }

    public /* synthetic */ cqr(csv csvVar, int i) {
        this.f9022b = i;
        this.f9021a = csvVar;
    }

    public /* synthetic */ cqr(ctl ctlVar, int i) {
        this.f9022b = i;
        this.f9021a = ctlVar;
    }

    public /* synthetic */ cqr(cuk cukVar, int i) {
        this.f9022b = i;
        this.f9021a = cukVar;
    }

    public /* synthetic */ cqr(hrx hrxVar, int i) {
        this.f9022b = i;
        this.f9021a = hrxVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [hrx, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9022b) {
            case 0:
                Object obj = this.f9021a;
                synchronized (((cqt) obj).f9031f) {
                    ((cqt) obj).f9028c.m3465b(((cqt) obj).f9029d);
                    break;
                }
                return;
            case 1:
                ((cqm) this.f9021a).f8970y.mo5721a();
                return;
            case 2:
                synchronized (((cqt) this.f9021a).f9031f) {
                    Object obj2 = this.f9021a;
                    ((cqt) obj2).f9028c.m3466c(((cqt) obj2).f9029d);
                    nqf nqfVar = ((cqt) this.f9021a).f9030e;
                    if (nqfVar != null) {
                        nqfVar.mo14894e(null);
                    }
                    break;
                }
                return;
            case 3:
                nqf nqfVar2 = ((cqv) this.f9021a).f9045c;
                if (nqfVar2 != null) {
                    nqfVar2.mo14894e(null);
                    return;
                }
                return;
            case 4:
                this.f9021a.mo10673j(hrw.TOUCH_TO_FOCUS);
                return;
            case 5:
                cqy cqyVar = (cqy) this.f9021a;
                ((hrx) cqyVar.f9057b.f9067b.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                cqyVar.f9057b.f9071f.mo14124k(bzq.m3268h());
                return;
            case 6:
                cqy cqyVar2 = (cqy) this.f9021a;
                ((hrx) cqyVar2.f9057b.f9067b.mo16809c()).mo10673j(hrw.TOUCH_TO_FOCUS);
                cqyVar2.f9057b.f9071f.mo14124k(bzq.m3270j());
                return;
            case 7:
                ((cra) this.f9021a).f9074i.mo14894e(null);
                cra craVar = (cra) this.f9021a;
                craVar.f9066a.m3466c(craVar.f9077l);
                ((cra) this.f9021a).f9079n.m5658e(cum.f9657e);
                return;
            case 8:
                cra craVar2 = (cra) this.f9021a;
                craVar2.f9066a.m3466c(craVar2.f9078m);
                ((cra) this.f9021a).f9076k = true;
                return;
            case 9:
                cru cruVar = (cru) this.f9021a;
                cruVar.m5434b(cruVar.f9184g);
                return;
            case 10:
                ((csd) this.f9021a).f9221e.m6430c();
                return;
            case 11:
                csr csrVar = (csr) this.f9021a;
                jfs jfsVar = csrVar.f9381f;
                csrVar.f9380e = jfs.m13060R(jfsVar.m13079N(((Context) jfsVar.f33914a).getResources().getString(C0100R.string.video_storage_full_error_recording_dialog_title), ((Context) jfsVar.f33914a).getResources().getString(C0100R.string.video_storage_max_file_size_dialog_body), csrVar.m5470a()));
                csrVar.m5472c();
                return;
            case 12:
                csr csrVar2 = (csr) this.f9021a;
                csrVar2.f9380e = csrVar2.f9381f.m13082Q(csrVar2.m5471b());
                csrVar2.m5472c();
                return;
            case 13:
                csr csrVar3 = (csr) this.f9021a;
                csrVar3.f9380e = csrVar3.f9381f.m13081P(csrVar3.m5471b());
                csrVar3.m5472c();
                return;
            case 14:
                csr csrVar4 = (csr) this.f9021a;
                DialogInterfaceC0155eg dialogInterfaceC0155eg = csrVar4.f9380e;
                if (dialogInterfaceC0155eg != null) {
                    dialogInterfaceC0155eg.setOnDismissListener(new csq(csrVar4, 0));
                    if (dialogInterfaceC0155eg.isShowing()) {
                        return;
                    }
                    dialogInterfaceC0155eg.show();
                    TextView textView = (TextView) dialogInterfaceC0155eg.findViewById(R.id.message);
                    textView.getClass();
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    chm chmVar = csrVar4.f9379d;
                    if (chmVar != null) {
                        chmVar.mo3720j(false);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                csr csrVar5 = (csr) this.f9021a;
                jfs jfsVar2 = csrVar5.f9381f;
                csrVar5.f9380e = jfs.m13060R(jfsVar2.m13079N(((Context) jfsVar2.f33914a).getResources().getString(C0100R.string.video_storage_full_error_recording_dialog_title), ((Context) jfsVar2.f33914a).getResources().getString(C0100R.string.video_storage_max_duration_dialog_body), csrVar5.m5470a()));
                csrVar5.m5472c();
                return;
            case 16:
                csr csrVar6 = (csr) this.f9021a;
                DialogInterfaceC0155eg dialogInterfaceC0155eg2 = csrVar6.f9380e;
                if (dialogInterfaceC0155eg2 == null || !dialogInterfaceC0155eg2.isShowing()) {
                    return;
                }
                csrVar6.f9380e.dismiss();
                return;
            case 17:
                ((csv) this.f9021a).m5479c(-1.0f);
                return;
            case 18:
                Object obj3 = this.f9021a;
                try {
                    FileOutputStream fileOutputStream = ((ctl) obj3).f9481c;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    ((ctl) obj3).f9480b.m9984d();
                    return;
                } catch (IOException e) {
                    ((nbe) ((nbe) ((nbe) ctl.f9479a.m17251b()).mo17283h(e)).mo17276G((char) 607)).mo17290o("Error closing MediaFile.");
                    return;
                }
            case 19:
                Object obj4 = this.f9021a;
                synchronized (obj4) {
                    try {
                        FileOutputStream fileOutputStream2 = ((ctl) obj4).f9481c;
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                    } catch (IOException e2) {
                        ((nbe) ((nbe) ((nbe) ctl.f9479a.m17251b()).mo17283h(e2)).mo17276G(609)).mo17290o("Error closing MediaFile.");
                    }
                    break;
                }
                return;
            default:
                ((cuk) this.f9021a).f9640a.mo10849b();
                return;
        }
    }
}
