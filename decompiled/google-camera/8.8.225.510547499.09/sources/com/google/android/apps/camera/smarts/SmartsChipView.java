package com.google.android.apps.camera.smarts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.abw;
import p000.cln;
import p000.djm;
import p000.ggf;
import p000.gmb;
import p000.hcj;
import p000.hcy;
import p000.hcz;
import p000.hda;
import p000.hdl;
import p000.heo;
import p000.hev;
import p000.iae;
import p000.ihk;
import p000.ilk;
import p000.ill;
import p000.jvb;
import p000.jwf;
import p000.jww;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SmartsChipView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6927a;

    /* JADX INFO: renamed from: b */
    public TextView f6928b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6929c;

    /* JADX INFO: renamed from: d */
    public boolean f6930d;

    /* JADX INFO: renamed from: e */
    public boolean f6931e;

    /* JADX INFO: renamed from: f */
    public Runnable f6932f;

    /* JADX INFO: renamed from: g */
    public Runnable f6933g;

    /* JADX INFO: renamed from: h */
    public CharSequence f6934h;

    /* JADX INFO: renamed from: i */
    public boolean f6935i;

    /* JADX INFO: renamed from: j */
    public boolean f6936j;

    /* JADX INFO: renamed from: k */
    public boolean f6937k;

    /* JADX INFO: renamed from: l */
    public jvb f6938l;

    /* JADX INFO: renamed from: m */
    public int f6939m;

    /* JADX INFO: renamed from: n */
    private ImageView f6940n;

    /* JADX INFO: renamed from: o */
    private ImageView f6941o;

    /* JADX INFO: renamed from: p */
    private int f6942p;

    /* JADX INFO: renamed from: q */
    private int f6943q;

    /* JADX INFO: renamed from: r */
    private int f6944r;

    /* JADX INFO: renamed from: s */
    private int f6945s;

    /* JADX INFO: renamed from: t */
    private int f6946t;

    public SmartsChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6930d = false;
        this.f6931e = false;
        this.f6934h = "";
        this.f6939m = 1;
        this.f6935i = true;
        this.f6936j = true;
        this.f6938l = new jvb();
    }

    /* JADX INFO: renamed from: a */
    public final void m4289a(int i) {
        animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration(this.f6946t).setListener(new hda(this, i)).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m4290b() {
        this.f6934h = "";
        this.f6931e = false;
        this.f6930d = false;
        m4289a(8);
        Runnable runnable = this.f6933g;
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.f6932f;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f6938l.close();
        this.f6932f = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4291c(jww jwwVar, heo heoVar) {
        this.f6938l.m13537d(jwwVar.mo3830a(new gmb(this, heoVar, 4), abw.m168a(getContext())));
    }

    /* JADX INFO: renamed from: d */
    public final void m4292d(heo heoVar) {
        if (heoVar.mo10126s()) {
            hev hevVar = ((hdl) heoVar).f27352b;
            String str = hevVar.f27507c;
            Drawable drawable = hevVar.f27508d;
            Runnable runnable = hevVar.f27509e;
            Runnable runnable2 = hevVar.f27512h;
            if (str != null) {
                this.f6928b.setText(str);
                this.f6928b.setVisibility(0);
            } else {
                this.f6928b.setVisibility(8);
            }
            if (drawable != null) {
                this.f6940n.setImageDrawable(drawable);
                this.f6940n.setVisibility(0);
            } else {
                this.f6940n.setVisibility(8);
            }
            int i = 1;
            if (runnable != null) {
                this.f6927a.setClickable(true);
                ggf ggfVar = new ggf(heoVar, runnable, 3);
                cln clnVar = new cln(this, 7);
                this.f6927a.setOnClickListener(ggfVar);
                this.f6927a.setOnTouchListener(clnVar);
                this.f6928b.setOnClickListener(ggfVar);
                this.f6928b.setOnTouchListener(clnVar);
            } else {
                this.f6927a.setClickable(false);
            }
            if (runnable2 != null) {
                this.f6941o.setVisibility(0);
                this.f6941o.setClickable(true);
                this.f6941o.setOnClickListener(new iae(this, heoVar, runnable2, i));
                this.f6941o.setContentDescription(getResources().getString(C0100R.string.dialog_dismiss));
                TextView textView = this.f6928b;
                textView.setPaddingRelative(textView.getPaddingLeft(), this.f6928b.getPaddingTop(), 0, this.f6928b.getPaddingBottom());
            } else {
                this.f6941o.setVisibility(8);
                this.f6941o.setContentDescription("");
                TextView textView2 = this.f6928b;
                textView2.setPaddingRelative(textView2.getPaddingLeft(), this.f6928b.getPaddingTop(), this.f6945s, this.f6928b.getPaddingBottom());
            }
            this.f6927a.setVisibility(0);
            this.f6927a.setContentDescription(hevVar.f27511g);
        } else {
            this.f6927a.setVisibility(8);
            this.f6927a.setContentDescription("");
        }
        this.f6928b.setMaxWidth(this.f6942p);
        this.f6929c.setVisibility(8);
        this.f6929c.setContentDescription("");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX INFO: renamed from: e */
    public final void m4293e(hcj hcjVar) {
        boolean z;
        boolean z2;
        boolean z3;
        heo heoVar = hcjVar.f27246a;
        boolean z4 = hcjVar.f27247b;
        this.f6936j = hcjVar.f27249d;
        this.f6937k = hcjVar.f27250e;
        this.f6939m = hcjVar.f27251f;
        this.f6935i = hcjVar.f27248c;
        hdl hdlVar = (hdl) heoVar;
        boolean zM11427e = ilk.m11427e(ilk.m11425a(hdlVar.f27355e.mo9216f().f35503e));
        boolean zEquals = ilk.m11425a(hdlVar.f27355e.mo9216f().f35503e).equals(ilk.REVERSE_LANDSCAPE);
        boolean zEquals2 = ilk.m11425a(hdlVar.f27355e.mo9216f().f35503e).equals(ilk.LANDSCAPE);
        if (this.f6937k) {
            z = true;
        } else {
            int i = this.f6939m;
            if (i == 0) {
                throw null;
            }
            z = i != 1;
        }
        djm djmVar = hdlVar.f27357g;
        ihk ihkVar = hdlVar.f27359i;
        if (zEquals && ((Boolean) ((jwf) djmVar.f11788b).f34942d).booleanValue()) {
            z2 = true;
        } else {
            if (zM11427e) {
                int i2 = this.f6939m;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 4) {
                    z2 = true;
                }
            }
            z2 = zEquals2 && ((Boolean) ((jwf) ihkVar.f30967b).f34942d).booleanValue();
        }
        if ((zEquals && ((Boolean) ((jwf) djmVar.f11787a).f34942d).booleanValue()) || ((zM11427e && z && this.f6935i) || (zM11427e && this.f6936j))) {
            z3 = true;
        } else {
            z3 = zEquals2 && ((Boolean) ((jwf) ihkVar.f30966a).f34942d).booleanValue();
        }
        int i3 = this.f6943q;
        if (zM11427e && z && this.f6935i && this.f6936j) {
            i3 += this.f6944r;
        } else if (zM11427e && this.f6936j) {
            i3 = this.f6944r;
        }
        if (!z2 && !z3) {
            i3 = 0;
        }
        boolean z5 = !z4 && hdlVar.f27356f;
        float f = i3;
        if (f != getTranslationY()) {
            if (z5) {
                animate().translationY(f).setDuration(this.f6946t).start();
            } else {
                setTranslationY(f);
            }
        }
        if (hdlVar.f27356f) {
            if (z2 && getVisibility() == 0) {
                m4289a(8);
            } else {
                if (z2 || getVisibility() != 8) {
                    return;
                }
                m4289a(0);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6927a = (FrameLayout) findViewById(C0100R.id.smarts_chip);
        this.f6940n = (ImageView) findViewById(C0100R.id.smarts_chip_icon);
        this.f6928b = (TextView) findViewById(C0100R.id.smarts_chip_text);
        this.f6941o = (ImageView) findViewById(C0100R.id.smarts_chip_dismiss_button);
        this.f6929c = (FrameLayout) findViewById(C0100R.id.smarts_action_button);
        this.f6943q = getContext().getResources().getDimensionPixelSize(C0100R.dimen.smarts_notification_drawables_slide_up_y_translation);
        this.f6944r = -ill.m11431b(56.0f);
        this.f6946t = getResources().getInteger(C0100R.integer.smarts_ui_animation_duration_ms);
        getResources().getDimensionPixelSize(C0100R.dimen.smarts_notification_chip_max_width_with_button);
        this.f6942p = getResources().getDimensionPixelSize(C0100R.dimen.smarts_notification_chip_max_width_without_button);
        this.f6945s = getResources().getDimensionPixelSize(C0100R.dimen.smarts_notification_chip_text_padding_right);
        hcy hcyVar = new hcy(this);
        this.f6927a.setAccessibilityDelegate(new hcz(this, hcyVar));
        this.f6929c.setAccessibilityDelegate(hcyVar);
        this.f6928b.setMovementMethod(new ScrollingMovementMethod());
    }
}
