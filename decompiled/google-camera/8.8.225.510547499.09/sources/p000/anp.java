package p000;

import android.content.DialogInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class anp implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ anq f1846a;

    public anp(anq anqVar) {
        this.f1846a = anqVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        anq anqVar = this.f1846a;
        if (z) {
            anqVar.f1848ae = anqVar.f1847ad.add(anqVar.f1850ag[i].toString()) | anqVar.f1848ae;
        } else {
            anqVar.f1848ae = anqVar.f1847ad.remove(anqVar.f1850ag[i].toString()) | anqVar.f1848ae;
        }
    }
}
