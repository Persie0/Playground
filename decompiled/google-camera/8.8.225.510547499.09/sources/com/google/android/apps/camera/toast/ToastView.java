package com.google.android.apps.camera.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import p000.flr;
import p000.hde;
import p000.hps;
import p000.hrg;
import p000.ilk;
import p000.nbh;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ToastView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final Duration f6979d = Duration.ofMillis(300);

    /* JADX INFO: renamed from: e */
    public static final Duration f6980e = Duration.ofMillis(300);

    /* JADX INFO: renamed from: f */
    public static final nbh f6981f = nbh.m17259h(hIAHJKEnGsNbz.jLbmCW);

    /* JADX INFO: renamed from: a */
    private View f6982a;

    /* JADX INFO: renamed from: g */
    public float f6983g;

    /* JADX INFO: renamed from: h */
    public long f6984h;

    /* JADX INFO: renamed from: i */
    public Runnable f6985i;

    /* JADX INFO: renamed from: j */
    public Runnable f6986j;

    /* JADX INFO: renamed from: k */
    public Runnable f6987k;

    /* JADX INFO: renamed from: l */
    public Runnable f6988l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f6989m;

    /* JADX INFO: renamed from: n */
    public View f6990n;

    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6985i = hde.f27303e;
        this.f6986j = hde.f27304f;
        this.f6987k = hde.f27305g;
        this.f6988l = hde.f27306h;
    }

    /* JADX INFO: renamed from: b */
    public void mo4309b(hrg hrgVar) {
        TextView textView = (TextView) findViewById(C0100R.id.toast_text_view);
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = (TextView) findViewById(C0100R.id.toast_learn_more_text_view);
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        this.f6984h = (((long) hrgVar.mo7492a()) - f6980e.toMillis()) - f6979d.toMillis();
        this.f6985i = new hps(this, 11);
        m4314g(hrgVar);
        m4312e();
        this.f6986j = hrgVar.f29276b;
        this.f6987k = hrgVar.f29278d;
        this.f6988l = hrgVar.f29277c;
        View viewFindViewById = findViewById(C0100R.id.toast_inner_layout);
        this.f6982a = viewFindViewById;
        if (viewFindViewById != null) {
            int paddingBottom = viewFindViewById.getPaddingBottom();
            this.f6983g = TypedValue.applyDimension(0, paddingBottom + paddingBottom, getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo4310c() {
        this.f6982a.setOnClickListener(new flr(this, 8));
    }

    /* JADX INFO: renamed from: d */
    public void mo4311d(ilk ilkVar) {
    }

    /* JADX INFO: renamed from: e */
    public final PopupWindow m4312e() {
        PopupWindow popupWindow = new PopupWindow(new View(getContext()), 1, 1);
        this.f6989m = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.f6989m.setOutsideTouchable(true);
        return this.f6989m;
    }

    /* JADX INFO: renamed from: f */
    public final void m4313f() {
        Runnable runnable = this.f6985i;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        setAlpha(0.0f);
        this.f6989m.dismiss();
        removeAllViews();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m4314g(hrg hrgVar) {
        this.f6990n = hrgVar.f29275a;
    }

    /* JADX INFO: renamed from: h */
    public final void m4315h() {
        animate().alpha(1.0f).setDuration(f6979d.toMillis()).withEndAction(new hps(this, 12)).translationYBy(-this.f6983g).start();
    }
}
