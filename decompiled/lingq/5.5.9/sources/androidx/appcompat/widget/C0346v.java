package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import p185j.InterfaceC6396f;

/* JADX INFO: renamed from: androidx.appcompat.widget.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0346v extends AbstractViewOnTouchListenerC0320i0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AppCompatSpinner.C0258g f1343j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AppCompatSpinner f1344k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0346v(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.C0258g c0258g) {
        super(view);
        this.f1344k = appCompatSpinner;
        this.f1343j = c0258g;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
    /* JADX INFO: renamed from: b */
    public final InterfaceC6396f mo887b() {
        return this.f1343j;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: c */
    public final boolean mo888c() {
        AppCompatSpinner appCompatSpinner = this.f1344k;
        if (appCompatSpinner.getInternalPopup().mo998a()) {
            return true;
        }
        appCompatSpinner.f906f.mo1007n(AppCompatSpinner.C0254c.m994b(appCompatSpinner), AppCompatSpinner.C0254c.m993a(appCompatSpinner));
        return true;
    }
}
