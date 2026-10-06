package p000;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dbt implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dbu f10440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10441b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f10442c;

    public /* synthetic */ dbt(dbu dbuVar, int i, int i2) {
        this.f10442c = i2;
        this.f10440a = dbuVar;
        this.f10441b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10442c) {
            case 0:
                dbu dbuVar = this.f10440a;
                dbuVar.m5907d(4, this.f10441b);
                dialogInterface.dismiss();
                dbuVar.f10444b.m3557a("None of the cameras are working. User decided to close the app");
                break;
            case 1:
                dbu dbuVar2 = this.f10440a;
                dbuVar2.m5907d(5, this.f10441b);
                dialogInterface.dismiss();
                dbuVar2.f10444b.m3557a("None of the cameras are working. User decided to close the app");
                break;
            case 2:
                dbu dbuVar3 = this.f10440a;
                int i2 = this.f10441b;
                dbuVar3.f10447e.mo13940b("Hardware help dialog for unavailability of any cameras due to reason: " + dcn.m5925a(i2) + " at stage " + nea.m17402p(4) + "Positive button clicked");
                dbuVar3.f10446d.mo8148W(3, 4, i2, null, 0);
                dbuVar3.f10444b.m3557a("None of the cameras are working. User decided to visit the help center");
                dez.m6033c(dbuVar3.f10443a, Uri.parse(dbuVar3.f10448f.m5670r()));
                break;
            default:
                dbu dbuVar4 = this.f10440a;
                dbuVar4.m5907d(3, this.f10441b);
                dialogInterface.dismiss();
                dbuVar4.f10444b.m3557a("None of the cameras are working. User decided to close the app");
                break;
        }
    }
}
