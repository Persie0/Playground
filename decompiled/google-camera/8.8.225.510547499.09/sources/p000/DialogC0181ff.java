package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: ff */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0181ff extends DialogC0908pm {

    /* JADX INFO: renamed from: a */
    private AbstractC0160el f21592a;

    /* JADX INFO: renamed from: b */
    private final aen f21593b;

    public DialogC0181ff(Context context, int i) {
        super(context, m8320a(context, i));
        this.f21593b = new aen() { // from class: fe
            @Override // p000.aen
            /* JADX INFO: renamed from: g */
            public final boolean mo354g(KeyEvent keyEvent) {
                return this.f21504a.m8322c(keyEvent);
            }
        };
        AbstractC0160el abstractC0160elM8321b = m8321b();
        ((LayoutInflaterFactory2C0179fd) abstractC0160elM8321b).f21347F = m8320a(context, i);
        abstractC0160elM8321b.mo7444o();
    }

    /* JADX INFO: renamed from: a */
    private static int m8320a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0100R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m8321b().mo7435d(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0160el m8321b() {
        if (this.f21592a == null) {
            int i = AbstractC0160el.f14534b;
            this.f21592a = new LayoutInflaterFactory2C0179fd(getContext(), getWindow(), this);
        }
        return this.f21592a;
    }

    /* JADX INFO: renamed from: c */
    final boolean m8322c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: d */
    public final void m8323d() {
        m8321b().mo7445p(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m8321b().mo7438g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return abg.m102k(this.f21593b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return m8321b().mo7434c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m8321b().mo7437f();
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m8321b().mo7436e();
        super.onCreate(bundle);
        m8321b().mo7444o();
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        m8321b().mo7439h();
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    public void setContentView(int i) {
        m8321b().mo7440j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m8321b().mo7443m(getContext().getString(i));
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    public void setContentView(View view) {
        m8321b().mo7441k(view);
    }

    @Override // p000.DialogC0908pm, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m8321b().mo7442l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m8321b().mo7443m(charSequence);
    }
}
