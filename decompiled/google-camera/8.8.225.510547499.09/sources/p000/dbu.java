package p000;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbu implements dck {

    /* JADX INFO: renamed from: a */
    public final Context f10443a;

    /* JADX INFO: renamed from: b */
    public final cej f10444b;

    /* JADX INFO: renamed from: c */
    public final Activity f10445c;

    /* JADX INFO: renamed from: d */
    public final fcp f10446d;

    /* JADX INFO: renamed from: e */
    public final kbo f10447e;

    /* JADX INFO: renamed from: f */
    public final cwd f10448f;

    public dbu(Context context, cej cejVar, Activity activity, fcp fcpVar, kbo kboVar, cwd cwdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10443a = context;
        this.f10444b = cejVar;
        this.f10445c = activity;
        this.f10446d = fcpVar;
        this.f10448f = cwdVar;
        this.f10447e = kboVar.mo6314a("CamUnavailableHelp");
    }

    /* JADX INFO: renamed from: e */
    private final Runnable m5903e(final int i, final int i2) {
        return new Runnable() { // from class: dbs
            @Override // java.lang.Runnable
            public final void run() {
                dbu dbuVar = this.f10437a;
                int i3 = i;
                int i4 = i2;
                int i5 = cel.f5449a;
                Activity activity = dbuVar.f10445c;
                Context applicationContext = activity.getApplicationContext();
                activity.getPackageName();
                cel.m3561c(applicationContext, activity);
                dbuVar.f10447e.mo13940b("Hardware help dialog for unavailability of any cameras due to reason: " + dcn.m5925a(i4) + YmzeHXaMYOLk.BZM + nea.m17402p(i3) + "Learn more button clicked");
                dbuVar.f10446d.mo8148W(5, i3, i4, null, 0);
            }
        };
    }

    @Override // p000.dck
    /* JADX INFO: renamed from: a */
    public final DialogInterfaceC0155eg mo5904a(int i) {
        mhs mhsVar = new mhs(this.f10443a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        TextView textViewM6031a = dez.m6031a(this.f10443a);
        textViewM6031a.setText(C0100R.string.camera_issue_contact_message);
        mhsVar.m16392t(this.f10443a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(textViewM6031a);
        mhsVar.m16383k(false);
        mhsVar.m16386n(C0100R.string.camera_fallback_close_app, new dbt(this, i, 0));
        mhsVar.m16389q(C0100R.string.contact_us, new dbt(this, i, 2));
        return mhsVar.mo7256b();
    }

    @Override // p000.dck
    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC0155eg mo5905b(int i) {
        mhs mhsVar = new mhs(this.f10443a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(this.f10443a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(dez.m6032b(C0100R.string.camera_issue_restart_message, this.f10443a, m5903e(5, i)));
        mhsVar.m16383k(false);
        mhsVar.m16386n(C0100R.string.camera_fallback_close_app, new dbt(this, i, 1));
        return mhsVar.mo7256b();
    }

    @Override // p000.dck
    /* JADX INFO: renamed from: c */
    public final DialogInterfaceC0155eg mo5906c(int i) {
        mhs mhsVar = new mhs(this.f10443a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(this.f10443a.getResources().getString(C0100R.string.camera_issue_title));
        mhsVar.m16393u(dez.m6032b(C0100R.string.camera_issue_reboot_message, this.f10443a, m5903e(3, i)));
        mhsVar.m16383k(false);
        mhsVar.m16386n(C0100R.string.camera_fallback_close_app, new dbt(this, i, 3));
        return mhsVar.mo7256b();
    }

    /* JADX INFO: renamed from: d */
    public final void m5907d(int i, int i2) {
        this.f10447e.mo13940b("Hardware help dialog for unavailability of any cameras due to reason: " + dcn.m5925a(i2) + " at stage " + nea.m17402p(i) + " Negative button clicked");
        this.f10446d.mo8148W(4, i, i2, null, 0);
    }
}
