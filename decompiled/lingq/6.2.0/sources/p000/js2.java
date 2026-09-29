package p000;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class js2 {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f46061a;

    /* JADX INFO: renamed from: b */
    public final is2 f46062b;

    /* JADX INFO: renamed from: c */
    public final Context f46063c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f46064d;

    public js2(is2 is2Var) {
        this.f46061a = is2Var.f44492a;
        this.f46062b = is2Var;
        this.f46063c = is2Var.getContext();
        this.f46064d = is2Var.f44498g;
    }

    /* JADX INFO: renamed from: a */
    public void mo14630a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo3301b() {
    }

    /* JADX INFO: renamed from: c */
    public int mo3302c() {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int mo3303d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo14631e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo3304f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo14632g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo14633h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo14634i(int i) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo3305j() {
        return this instanceof ym2;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo3306k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public void mo3307l(EditText editText) {
    }

    /* JADX INFO: renamed from: m */
    public void mo14635m(C0797b4 c0797b4) {
    }

    /* JADX INFO: renamed from: n */
    public void mo14636n(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: o */
    public void mo14637o(boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public final void m14638p() {
        this.f46062b.m14118f(false);
    }

    /* JADX INFO: renamed from: q */
    public void mo3308q() {
    }

    /* JADX INFO: renamed from: r */
    public void mo3309r() {
    }
}
