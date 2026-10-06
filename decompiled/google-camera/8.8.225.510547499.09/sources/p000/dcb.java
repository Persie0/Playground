package p000;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcb implements dcm {

    /* JADX INFO: renamed from: a */
    public final Context f10487a;

    /* JADX INFO: renamed from: b */
    public final cej f10488b;

    /* JADX INFO: renamed from: c */
    public final Activity f10489c;

    /* JADX INFO: renamed from: d */
    public final cwd f10490d;

    /* JADX INFO: renamed from: e */
    private final fcp f10491e;

    /* JADX INFO: renamed from: f */
    private final kbo f10492f;

    public dcb(Context context, cej cejVar, Activity activity, fcp fcpVar, kbo kboVar, cwd cwdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10487a = context;
        this.f10488b = cejVar;
        this.f10489c = activity;
        this.f10491e = fcpVar;
        this.f10490d = cwdVar;
        this.f10492f = kboVar.mo6314a("FallbackHelper");
    }

    /* JADX INFO: renamed from: g */
    private final Runnable m5914g(final kmq kmqVar, final int i, final int i2, final int i3) {
        return new Runnable() { // from class: dbz
            @Override // java.lang.Runnable
            public final void run() {
                dcb dcbVar = this.f10476a;
                kmq kmqVar2 = kmqVar;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                int i7 = cel.f5449a;
                Activity activity = dcbVar.f10489c;
                Context applicationContext = activity.getApplicationContext();
                activity.getPackageName();
                cel.m3561c(applicationContext, activity);
                dcbVar.mo5918d(kmqVar2, i4, i5, i6, 5);
            }
        };
    }

    @Override // p000.dcm
    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0155eg mo5915a(int i, int i2, kmq kmqVar) {
        mhs mhsVar = new mhs(this.f10487a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(this.f10487a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(dez.m6032b(C0100R.string.camera_issue_reboot_message, this.f10487a, m5914g(kmqVar, i, i2, 3)));
        mhsVar.m16389q(C0100R.string.camera_fallback_close_app, new dca(this, kmqVar, i, i2, 1));
        mhsVar.m16386n(C0100R.string.continue_anyway, new dca(this, kmqVar, i, i2, 0));
        return mhsVar.mo7256b();
    }

    @Override // p000.dcm
    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0155eg mo5916b(int i, int i2, kmq kmqVar) {
        mhs mhsVar = new mhs(this.f10487a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(this.f10487a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(dez.m6032b(C0100R.string.camera_issue_restart_message, this.f10487a, m5914g(kmqVar, i, i2, 5)));
        mhsVar.m16389q(C0100R.string.camera_fallback_close_app, new dca(this, kmqVar, i, i2, 4));
        mhsVar.m16386n(C0100R.string.continue_anyway, new dca(this, kmqVar, i, i2, 5));
        return mhsVar.mo7256b();
    }

    @Override // p000.dcm
    /* JADX INFO: renamed from: c */
    public final DialogInterfaceC0155eg mo5917c(int i, int i2, kmq kmqVar) {
        mhs mhsVar = new mhs(this.f10487a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        TextView textViewM6031a = dez.m6031a(this.f10487a);
        textViewM6031a.setText(C0100R.string.camera_issue_contact_message);
        mhsVar.m16392t(this.f10487a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(textViewM6031a);
        mhsVar.m16389q(C0100R.string.contact_us, new dca(this, kmqVar, i, i2, 2));
        mhsVar.m16386n(C0100R.string.continue_anyway, new dca(this, kmqVar, i, i2, 3));
        return mhsVar.mo7256b();
    }

    @Override // p000.dcm
    /* JADX INFO: renamed from: d */
    public final void mo5918d(kmq kmqVar, int i, int i2, int i3, int i4) {
        String str;
        kbo kboVar = this.f10492f;
        String strValueOf = String.valueOf(kmqVar);
        switch (i) {
            case 2:
                str = "AUTOMATIC";
                break;
            default:
                str = "SWITCH";
                break;
        }
        kboVar.mo13940b("Hardware help dialog when falling back to working camera. defective camera: " + strValueOf + " Trigger reason " + str + " Fallback reason " + dcn.m5925a(i2) + " at stage " + nea.m17402p(i3) + " event type " + Integer.toString(i4 - 1));
        this.f10491e.mo8148W(i4, i3, i2, kmqVar, i);
    }

    /* JADX INFO: renamed from: e */
    public final void m5919e(kmq kmqVar, int i, int i2, int i3) {
        mo5918d(kmqVar, i, i2, i3, 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m5920f(kmq kmqVar, int i, int i2, int i3) {
        mo5918d(kmqVar, i, i2, i3, 3);
    }
}
