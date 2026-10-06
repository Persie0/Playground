package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: renamed from: jd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0737jd implements DialogInterface.OnClickListener, InterfaceC0742ji {

    /* JADX INFO: renamed from: a */
    DialogInterfaceC0155eg f33771a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0743jj f33772b;

    /* JADX INFO: renamed from: c */
    private ListAdapter f33773c;

    /* JADX INFO: renamed from: d */
    private CharSequence f33774d;

    public DialogInterfaceOnClickListenerC0737jd(C0743jj c0743jj) {
        this.f33772b = c0743jj;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: a */
    public final int mo12905a() {
        return 0;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: b */
    public final int mo12906b() {
        return 0;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: c */
    public final Drawable mo12907c() {
        return null;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: d */
    public final CharSequence mo12908d() {
        return this.f33774d;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: e */
    public final void mo12909e(ListAdapter listAdapter) {
        this.f33773c = listAdapter;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: f */
    public final void mo12910f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: g */
    public final void mo12911g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: h */
    public final void mo12912h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: i */
    public final void mo12913i(CharSequence charSequence) {
        this.f33774d = charSequence;
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: j */
    public final void mo12914j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: k */
    public final void mo12915k() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f33771a;
        if (dialogInterfaceC0155eg != null) {
            dialogInterfaceC0155eg.dismiss();
            this.f33771a = null;
        }
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: l */
    public final void mo12916l(int i, int i2) {
        if (this.f33773c == null) {
            return;
        }
        C0154ef c0154ef = new C0154ef(this.f33772b.f34155a);
        CharSequence charSequence = this.f33774d;
        if (charSequence != null) {
            c0154ef.m7263i(charSequence);
        }
        ListAdapter listAdapter = this.f33773c;
        int selectedItemPosition = this.f33772b.getSelectedItemPosition();
        C0150eb c0150eb = c0154ef.f13785a;
        c0150eb.f13177o = listAdapter;
        c0150eb.f13178p = this;
        c0150eb.f13184v = selectedItemPosition;
        c0150eb.f13183u = true;
        DialogInterfaceC0155eg dialogInterfaceC0155egMo7256b = c0154ef.mo7256b();
        this.f33771a = dialogInterfaceC0155egMo7256b;
        ListView listView = dialogInterfaceC0155egMo7256b.f13908a.f13563f;
        C0735jb.m12826d(listView, i);
        C0735jb.m12825c(listView, i2);
        this.f33771a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f33772b.setSelection(i);
        if (this.f33772b.getOnItemClickListener() != null) {
            this.f33772b.performItemClick(null, i, this.f33773c.getItemId(i));
        }
        mo12915k();
    }

    @Override // p000.InterfaceC0742ji
    /* JADX INFO: renamed from: u */
    public final boolean mo12917u() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f33771a;
        if (dialogInterfaceC0155eg != null) {
            return dialogInterfaceC0155eg.isShowing();
        }
        return false;
    }
}
