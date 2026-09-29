package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: renamed from: sq */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3583sq implements InterfaceC3768xq, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0016ae f61216a;

    /* JADX INFO: renamed from: b */
    public C3620tq f61217b;

    /* JADX INFO: renamed from: c */
    public CharSequence f61218c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppCompatSpinner f61219d;

    public DialogInterfaceOnClickListenerC3583sq(AppCompatSpinner appCompatSpinner) {
        this.f61219d = appCompatSpinner;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: a */
    public final boolean mo21535a() {
        DialogInterfaceC0016ae dialogInterfaceC0016ae = this.f61216a;
        if (dialogInterfaceC0016ae != null) {
            return dialogInterfaceC0016ae.isShowing();
        }
        return false;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: b */
    public final int mo21536b() {
        return 0;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: d */
    public final void mo21537d(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC3768xq
    public final void dismiss() {
        DialogInterfaceC0016ae dialogInterfaceC0016ae = this.f61216a;
        if (dialogInterfaceC0016ae != null) {
            dialogInterfaceC0016ae.dismiss();
            this.f61216a = null;
        }
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: e */
    public final CharSequence mo21538e() {
        return this.f61218c;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: g */
    public final Drawable mo21539g() {
        return null;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: h */
    public final void mo21540h(CharSequence charSequence) {
        this.f61218c = charSequence;
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: i */
    public final void mo21541i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: j */
    public final void mo21542j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: l */
    public final void mo21543l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: n */
    public final void mo21544n(int i, int i2) {
        if (this.f61217b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f61219d;
        C3829zd c3829zd = new C3829zd(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f61218c;
        if (charSequence != null) {
            c3829zd.setTitle(charSequence);
        }
        C3620tq c3620tq = this.f61217b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C3681vd c3681vd = c3829zd.f71376a;
        c3681vd.f65220r = c3620tq;
        c3681vd.f65221s = this;
        c3681vd.f65224v = selectedItemPosition;
        c3681vd.f65223u = true;
        DialogInterfaceC0016ae dialogInterfaceC0016aeCreate = c3829zd.create();
        this.f61216a = dialogInterfaceC0016aeCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC0016aeCreate.f530g.f69651f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f61216a.show();
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: o */
    public final int mo21545o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.f61219d;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.f61217b.getItemId(i));
        }
        dismiss();
    }

    @Override // p000.InterfaceC3768xq
    /* JADX INFO: renamed from: p */
    public final void mo10366p(ListAdapter listAdapter) {
        this.f61217b = (C3620tq) listAdapter;
    }
}
