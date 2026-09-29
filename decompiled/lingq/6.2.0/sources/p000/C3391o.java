package p000;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: classes.dex */
public final class C3391o implements zua {

    /* JADX INFO: renamed from: a */
    public boolean f53483a = false;

    /* JADX INFO: renamed from: b */
    public int f53484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActionBarContextView f53485c;

    public C3391o(ActionBarContextView actionBarContextView) {
        this.f53485c = actionBarContextView;
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: a */
    public final void mo10395a() {
        this.f53483a = true;
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: b */
    public final void mo10396b() {
        super/*android.view.View*/.setVisibility(0);
        this.f53483a = false;
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: c */
    public final void mo17716c() {
        if (this.f53483a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f53485c;
        actionBarContextView.f1069f = null;
        super/*android.view.View*/.setVisibility(this.f53484b);
    }
}
