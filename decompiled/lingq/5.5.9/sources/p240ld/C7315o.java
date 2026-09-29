package p240ld;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p072dd.C5150c;
import p177ic.C6308a;
import p260m8.C7499b;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p531zc.C10477a;

/* JADX INFO: renamed from: ld.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7315o {

    /* JADX INFO: renamed from: A */
    public ColorStateList f40955A;

    /* JADX INFO: renamed from: B */
    public Typeface f40956B;

    /* JADX INFO: renamed from: a */
    public final int f40957a;

    /* JADX INFO: renamed from: b */
    public final int f40958b;

    /* JADX INFO: renamed from: c */
    public final int f40959c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f40960d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f40961e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f40962f;

    /* JADX INFO: renamed from: g */
    public final Context f40963g;

    /* JADX INFO: renamed from: h */
    public final TextInputLayout f40964h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f40965i;

    /* JADX INFO: renamed from: j */
    public int f40966j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f40967k;

    /* JADX INFO: renamed from: l */
    public Animator f40968l;

    /* JADX INFO: renamed from: m */
    public final float f40969m;

    /* JADX INFO: renamed from: n */
    public int f40970n;

    /* JADX INFO: renamed from: o */
    public int f40971o;

    /* JADX INFO: renamed from: p */
    public CharSequence f40972p;

    /* JADX INFO: renamed from: q */
    public boolean f40973q;

    /* JADX INFO: renamed from: r */
    public AppCompatTextView f40974r;

    /* JADX INFO: renamed from: s */
    public CharSequence f40975s;

    /* JADX INFO: renamed from: t */
    public int f40976t;

    /* JADX INFO: renamed from: u */
    public int f40977u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f40978v;

    /* JADX INFO: renamed from: w */
    public CharSequence f40979w;

    /* JADX INFO: renamed from: x */
    public boolean f40980x;

    /* JADX INFO: renamed from: y */
    public AppCompatTextView f40981y;

    /* JADX INFO: renamed from: z */
    public int f40982z;

    /* JADX INFO: renamed from: ld.o$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f40983a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f40984b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f40985c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f40986d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f40983a = i10;
            this.f40984b = textView;
            this.f40985c = i11;
            this.f40986d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i10 = this.f40983a;
            C7315o c7315o = C7315o.this;
            c7315o.f40970n = i10;
            c7315o.f40968l = null;
            TextView textView = this.f40984b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f40985c == 1 && (appCompatTextView = c7315o.f40974r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f40986d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f40986d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public C7315o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f40963g = context;
        this.f40964h = textInputLayout;
        this.f40969m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f40957a = C10477a.m19428c(R.attr.motionDurationShort4, context, 217);
        this.f40958b = C10477a.m19428c(R.attr.motionDurationMedium4, context, 167);
        this.f40959c = C10477a.m19428c(R.attr.motionDurationShort4, context, 167);
        this.f40960d = C10477a.m19429d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, C6308a.f36526d);
        LinearInterpolator linearInterpolator = C6308a.f36523a;
        this.f40961e = C10477a.m19429d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f40962f = C10477a.m19429d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m14721a(TextView textView, int i10) {
        if (this.f40965i == null && this.f40967k == null) {
            Context context = this.f40963g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f40965i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f40965i;
            TextInputLayout textInputLayout = this.f40964h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f40967k = new FrameLayout(context);
            this.f40965i.addView(this.f40967k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m14722b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f40967k.setVisibility(0);
            this.f40967k.addView(textView);
        } else {
            this.f40965i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f40965i.setVisibility(0);
        this.f40966j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m14722b() {
        LinearLayout linearLayout = this.f40965i;
        TextInputLayout textInputLayout = this.f40964h;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f40963g;
            boolean zM10929e = C5150c.m10929e(context);
            LinearLayout linearLayout2 = this.f40965i;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            int iM18688f = C10029b0.e.m18688f(editText);
            if (zM10929e) {
                iM18688f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (zM10929e) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int iM18687e = C10029b0.e.m18687e(editText);
            if (zM10929e) {
                iM18687e = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            C10029b0.e.m18693k(linearLayout2, iM18688f, dimensionPixelSize, iM18687e, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14723c() {
        Animator animator = this.f40968l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14724d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null) {
            if (!z10) {
                return;
            }
            if (i10 == i12 || i10 == i11) {
                boolean z11 = i12 == i10;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
                int i13 = this.f40959c;
                objectAnimatorOfFloat.setDuration(z11 ? this.f40958b : i13);
                objectAnimatorOfFloat.setInterpolator(z11 ? this.f40961e : this.f40962f);
                if (i10 == i12 && i11 != 0) {
                    objectAnimatorOfFloat.setStartDelay(i13);
                }
                arrayList.add(objectAnimatorOfFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f40969m, 0.0f);
                    objectAnimatorOfFloat2.setDuration(this.f40957a);
                    objectAnimatorOfFloat2.setInterpolator(this.f40960d);
                    objectAnimatorOfFloat2.setStartDelay(i13);
                    arrayList.add(objectAnimatorOfFloat2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final TextView m14725e(int i10) {
        if (i10 == 1) {
            return this.f40974r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f40981y;
    }

    /* JADX INFO: renamed from: f */
    public final void m14726f() {
        this.f40972p = null;
        m14723c();
        if (this.f40970n == 1) {
            if (!this.f40980x || TextUtils.isEmpty(this.f40979w)) {
                this.f40971o = 0;
            } else {
                this.f40971o = 2;
            }
        }
        m14729i(this.f40970n, this.f40971o, m14728h(this.f40974r, ""));
    }

    /* JADX INFO: renamed from: g */
    public final void m14727g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f40965i;
        if (linearLayout == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0) {
            z10 = i10 == 1;
        }
        if (!z10 || (frameLayout = this.f40967k) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f40966j - 1;
        this.f40966j = i11;
        LinearLayout linearLayout2 = this.f40965i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14728h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        TextInputLayout textInputLayout = this.f40964h;
        if (!C10029b0.g.m18699c(textInputLayout) || !textInputLayout.isEnabled() || (this.f40971o == this.f40970n && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m14729i(int i10, int i11, boolean z10) {
        TextView textViewM14725e;
        TextView textViewM14725e2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f40968l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m14724d(arrayList, this.f40980x, this.f40981y, 2, i10, i11);
            m14724d(arrayList, this.f40973q, this.f40974r, 1, i10, i11);
            C7499b.m14952m0(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m14725e(i10), i10, m14725e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewM14725e2 = m14725e(i11)) != null) {
                textViewM14725e2.setVisibility(0);
                textViewM14725e2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewM14725e = m14725e(i10)) != null) {
                textViewM14725e.setVisibility(4);
                if (i10 == 1) {
                    textViewM14725e.setText((CharSequence) null);
                }
            }
            this.f40970n = i11;
        }
        TextInputLayout textInputLayout = this.f40964h;
        textInputLayout.m8898q();
        textInputLayout.m8901t(z10, false);
        textInputLayout.m8904w();
    }
}
