package p240ld;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.activity.RunnableC0190i;
import com.google.android.material.textfield.C3093a;
import com.linguist.R;
import p067d8.ViewOnClickListenerC5062d0;
import p177ic.C6308a;
import p531zc.C10477a;
import va.C9689c;
import va.C9696j;

/* JADX INFO: renamed from: ld.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7304d extends AbstractC7313m {

    /* JADX INFO: renamed from: e */
    public final int f40918e;

    /* JADX INFO: renamed from: f */
    public final int f40919f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f40920g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f40921h;

    /* JADX INFO: renamed from: i */
    public EditText f40922i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC5062d0 f40923j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC7301a f40924k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f40925l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f40926m;

    /* JADX WARN: Type inference failed for: r0v1, types: [ld.a] */
    public C7304d(C3093a c3093a) {
        super(c3093a);
        this.f40923j = new ViewOnClickListenerC5062d0(2, this);
        this.f40924k = new View.OnFocusChangeListener() { // from class: ld.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7304d c7304d = this.f40915a;
                c7304d.m14703t(c7304d.m14704u());
            }
        };
        this.f40918e = C10477a.m19428c(R.attr.motionDurationShort3, c3093a.getContext(), 100);
        this.f40919f = C10477a.m19428c(R.attr.motionDurationShort3, c3093a.getContext(), 150);
        this.f40920g = C10477a.m19429d(c3093a.getContext(), R.attr.motionEasingLinearInterpolator, C6308a.f36523a);
        this.f40921h = C10477a.m19429d(c3093a.getContext(), R.attr.motionEasingEmphasizedInterpolator, C6308a.f36526d);
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: a */
    public final void mo14693a() {
        if (this.f40952b.f15792K != null) {
            return;
        }
        m14703t(m14704u());
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: c */
    public final int mo14694c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: d */
    public final int mo14695d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo14696e() {
        return this.f40924k;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo14697f() {
        return this.f40923j;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo14698g() {
        return this.f40924k;
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: m */
    public final void mo14699m(EditText editText) {
        this.f40922i = editText;
        this.f40951a.setEndIconVisible(m14704u());
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: p */
    public final void mo14700p(boolean z10) {
        if (this.f40952b.f15792K == null) {
            return;
        }
        m14703t(z10);
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: r */
    public final void mo14701r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f40921h);
        valueAnimatorOfFloat.setDuration(this.f40919f);
        valueAnimatorOfFloat.addUpdateListener(new C9696j(1, this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f40920g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f40918e;
        valueAnimatorOfFloat2.setDuration(i10);
        valueAnimatorOfFloat2.addUpdateListener(new C9689c(1, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f40925l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f40925l.addListener(new C7302b(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new C9689c(1, this));
        this.f40926m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C7303c(this));
    }

    @Override // p240ld.AbstractC7313m
    /* JADX INFO: renamed from: s */
    public final void mo14702s() {
        EditText editText = this.f40922i;
        if (editText != null) {
            editText.post(new RunnableC0190i(17, this));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m14703t(boolean z10) {
        boolean z11 = this.f40952b.m8909c() == z10;
        if (z10 && !this.f40925l.isRunning()) {
            this.f40926m.cancel();
            this.f40925l.start();
            if (z11) {
                this.f40925l.end();
            }
        } else if (!z10) {
            this.f40925l.cancel();
            this.f40926m.start();
            if (z11) {
                this.f40926m.end();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m14704u() {
        EditText editText = this.f40922i;
        return editText != null && (editText.hasFocus() || this.f40954d.hasFocus()) && this.f40922i.getText().length() > 0;
    }
}
