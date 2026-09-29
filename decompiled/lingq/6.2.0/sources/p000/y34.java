package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y34 {

    /* JADX INFO: renamed from: A */
    public ColorStateList f69212A;

    /* JADX INFO: renamed from: B */
    public Typeface f69213B;

    /* JADX INFO: renamed from: a */
    public final int f69214a;

    /* JADX INFO: renamed from: b */
    public final int f69215b;

    /* JADX INFO: renamed from: c */
    public final int f69216c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f69217d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f69218e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f69219f;

    /* JADX INFO: renamed from: g */
    public final Context f69220g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f69221h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f69222i;

    /* JADX INFO: renamed from: j */
    public int f69223j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f69224k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f69225l;

    /* JADX INFO: renamed from: m */
    public final float f69226m;

    /* JADX INFO: renamed from: n */
    public int f69227n;

    /* JADX INFO: renamed from: o */
    public int f69228o;

    /* JADX INFO: renamed from: p */
    public CharSequence f69229p;

    /* JADX INFO: renamed from: q */
    public boolean f69230q;

    /* JADX INFO: renamed from: r */
    public C3048gr f69231r;

    /* JADX INFO: renamed from: s */
    public CharSequence f69232s;

    /* JADX INFO: renamed from: t */
    public int f69233t;

    /* JADX INFO: renamed from: u */
    public int f69234u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f69235v;

    /* JADX INFO: renamed from: w */
    public CharSequence f69236w;

    /* JADX INFO: renamed from: x */
    public boolean f69237x;

    /* JADX INFO: renamed from: y */
    public C3048gr f69238y;

    /* JADX INFO: renamed from: z */
    public int f69239z;

    public y34(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f69220g = context;
        this.f69221h = textInputLayout;
        this.f69226m = context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
        this.f69214a = r46.m20364G(context, R$attr.motionDurationShort4, 217);
        this.f69215b = r46.m20364G(context, R$attr.motionDurationMedium4, 167);
        this.f69216c = r46.m20364G(context, R$attr.motionDurationShort4, 167);
        this.f69217d = r46.m20365H(context, R$attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0853cn.f10299d);
        int i = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = AbstractC0853cn.f10296a;
        this.f69218e = r46.m20365H(context, i, linearInterpolator);
        this.f69219f = r46.m20365H(context, R$attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m24924a(C3048gr c3048gr, int i) {
        if (this.f69222i == null && this.f69224k == null) {
            Context context = this.f69220g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f69222i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f69222i;
            TextInputLayout textInputLayout = this.f69221h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f69224k = new FrameLayout(context);
            this.f69222i.addView(this.f69224k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m24925b();
            }
        }
        if (i == 0 || i == 1) {
            this.f69224k.setVisibility(0);
            this.f69224k.addView(c3048gr);
        } else {
            this.f69222i.addView(c3048gr, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f69222i.setVisibility(0);
        this.f69223j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m24925b() {
        if (this.f69222i != null) {
            TextInputLayout textInputLayout = this.f69221h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f69220g;
                boolean zM19020H = pb1.m19020H(context);
                LinearLayout linearLayout = this.f69222i;
                int i = R$dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingStart = editText.getPaddingStart();
                if (zM19020H) {
                    paddingStart = context.getResources().getDimensionPixelSize(i);
                }
                int i2 = R$dimen.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.material_helper_text_default_padding_top);
                if (zM19020H) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
                }
                int i3 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (zM19020H) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i3);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24926c() {
        AnimatorSet animatorSet = this.f69225l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m24927d(ArrayList arrayList, boolean z, C3048gr c3048gr, int i, int i2, int i3) {
        if (c3048gr == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c3048gr, (Property<C3048gr, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.f69216c;
            objectAnimatorOfFloat.setDuration(z2 ? this.f69215b : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f69218e : this.f69219f);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c3048gr, (Property<C3048gr, Float>) View.TRANSLATION_Y, -this.f69226m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f69214a);
            objectAnimatorOfFloat2.setInterpolator(this.f69217d);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m24928e(int i) {
        if (i == 1) {
            return this.f69231r;
        }
        if (i != 2) {
            return null;
        }
        return this.f69238y;
    }

    /* JADX INFO: renamed from: f */
    public final void m24929f() {
        this.f69229p = null;
        m24926c();
        if (this.f69227n == 1) {
            if (!this.f69237x || TextUtils.isEmpty(this.f69236w)) {
                this.f69228o = 0;
            } else {
                this.f69228o = 2;
            }
        }
        m24932i(this.f69227n, this.f69228o, m24931h(this.f69231r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m24930g(C3048gr c3048gr, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f69222i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f69224k) != null) {
            frameLayout.removeView(c3048gr);
        } else {
            linearLayout.removeView(c3048gr);
        }
        int i2 = this.f69223j - 1;
        this.f69223j = i2;
        LinearLayout linearLayout2 = this.f69222i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m24931h(C3048gr c3048gr, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f69221h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f69228o == this.f69227n && c3048gr != null && TextUtils.equals(c3048gr.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m24932i(int i, int i2, boolean z) {
        TextView textViewM24928e;
        TextView textViewM24928e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f69225l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m24927d(arrayList, this.f69237x, this.f69238y, 2, i, i2);
            m24927d(arrayList, this.f69230q, this.f69231r, 1, i, i2);
            ci8.m4701N(animatorSet, arrayList);
            animatorSet.addListener(new x34(this, i2, m24928e(i), i, m24928e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM24928e2 = m24928e(i2)) != null) {
                textViewM24928e2.setVisibility(0);
                textViewM24928e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM24928e = m24928e(i)) != null) {
                textViewM24928e.setVisibility(4);
                if (i == 1) {
                    textViewM24928e.setText((CharSequence) null);
                }
            }
            this.f69227n = i2;
        }
        TextInputLayout textInputLayout = this.f69221h;
        textInputLayout.m6236t();
        textInputLayout.m6239w(z, false);
        textInputLayout.m6242z();
    }
}
