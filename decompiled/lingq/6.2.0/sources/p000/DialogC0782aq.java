package p000;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;

/* JADX INFO: renamed from: aq */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC0782aq extends xc1 implements InterfaceC3046gp {

    /* JADX INFO: renamed from: e */
    public LayoutInflaterFactory2C3804yp f7352e;

    /* JADX INFO: renamed from: f */
    public final C3841zp f7353f;

    public DialogC0782aq(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f7353f = new C3841zp(this);
        AbstractC3343mp abstractC3343mpM2975f = m2975f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R$attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C3804yp) abstractC3343mpM2975f).f70220n0 = i;
        abstractC3343mpM2975f.mo16968c();
    }

    @Override // p000.xc1, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m24446e();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m2975f();
        layoutInflaterFactory2C3804yp.m25236v();
        ((ViewGroup) layoutInflaterFactory2C3804yp.f70198U.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C3804yp.f70185H.m22259b(layoutInflaterFactory2C3804yp.f70217l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2975f().mo16969d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C3841zp c3841zp = this.f7353f;
        if (c3841zp == null) {
            return false;
        }
        return c3841zp.f71927a.m2976g(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3343mp m2975f() {
        if (this.f7352e == null) {
            by8 by8Var = AbstractC3343mp.f51673a;
            this.f7352e = new LayoutInflaterFactory2C3804yp(getContext(), getWindow(), this, this);
        }
        return this.f7352e;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m2975f();
        layoutInflaterFactory2C3804yp.m25236v();
        return layoutInflaterFactory2C3804yp.f70217l.findViewById(i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2976g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m2975f();
        if (layoutInflaterFactory2C3804yp.f70186I != null) {
            layoutInflaterFactory2C3804yp.m25239y();
            layoutInflaterFactory2C3804yp.f70186I.getClass();
            layoutInflaterFactory2C3804yp.m25240z(0);
        }
    }

    @Override // p000.xc1, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m2975f().mo16967a();
        super.onCreate(bundle);
        m2975f().mo16968c();
    }

    @Override // p000.xc1, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) m2975f();
        layoutInflaterFactory2C3804yp.m25239y();
        z4b z4bVar = layoutInflaterFactory2C3804yp.f70186I;
        if (z4bVar != null) {
            z4bVar.f70924t = false;
            yua yuaVar = z4bVar.f70923s;
            if (yuaVar != null) {
                yuaVar.m25346a();
            }
        }
    }

    @Override // p000.xc1, android.app.Dialog
    public void setContentView(int i) {
        m24446e();
        m2975f().mo16971h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m2975f().mo16974k(getContext().getString(i));
    }

    @Override // p000.xc1, android.app.Dialog
    public void setContentView(View view) {
        m24446e();
        m2975f().mo16972i(view);
    }

    @Override // p000.xc1, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m24446e();
        m2975f().mo16973j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2975f().mo16974k(charSequence);
    }
}
