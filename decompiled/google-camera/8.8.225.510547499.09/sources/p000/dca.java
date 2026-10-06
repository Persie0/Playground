package p000;

import android.content.DialogInterface;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dca implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dcb f10482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kmq f10483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f10484c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10485d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f10486e;

    public /* synthetic */ dca(dcb dcbVar, kmq kmqVar, int i, int i2, int i3) {
        this.f10486e = i3;
        this.f10482a = dcbVar;
        this.f10483b = kmqVar;
        this.f10484c = i;
        this.f10485d = i2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10486e) {
            case 0:
                this.f10482a.m5919e(this.f10483b, this.f10484c, this.f10485d, 3);
                dialogInterface.dismiss();
                break;
            case 1:
                dcb dcbVar = this.f10482a;
                kmq kmqVar = this.f10483b;
                dcbVar.m5920f(kmqVar, this.f10484c, this.f10485d, 3);
                dialogInterface.dismiss();
                dcbVar.f10488b.m3557a(String.valueOf(String.valueOf(kmqVar)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                break;
            case 2:
                dcb dcbVar2 = this.f10482a;
                dcbVar2.m5920f(this.f10483b, this.f10484c, this.f10485d, 4);
                dez.m6033c(dcbVar2.f10487a, Uri.parse(dcbVar2.f10490d.m5670r()));
                break;
            case 3:
                this.f10482a.m5919e(this.f10483b, this.f10484c, this.f10485d, 4);
                dialogInterface.dismiss();
                break;
            case 4:
                dcb dcbVar3 = this.f10482a;
                kmq kmqVar2 = this.f10483b;
                dcbVar3.m5920f(kmqVar2, this.f10484c, this.f10485d, 5);
                dialogInterface.dismiss();
                dcbVar3.f10488b.m3557a(String.valueOf(String.valueOf(kmqVar2)).concat(" camera not working. User decided to close the app instead of using the available camera"));
                break;
            default:
                this.f10482a.m5919e(this.f10483b, this.f10484c, this.f10485d, 5);
                dialogInterface.dismiss();
                break;
        }
    }
}
