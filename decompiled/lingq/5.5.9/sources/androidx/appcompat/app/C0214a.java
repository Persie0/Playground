package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0214a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AlertController f596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AlertController.C0211b f597b;

    public C0214a(AlertController.C0211b c0211b, AlertController alertController) {
        this.f597b = c0211b;
        this.f596a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.C0211b c0211b = this.f597b;
        DialogInterface.OnClickListener onClickListener = c0211b.f591r;
        AlertController alertController = this.f596a;
        onClickListener.onClick(alertController.f546b, i10);
        if (!c0211b.f593t) {
            alertController.f546b.dismiss();
        }
    }
}
