package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Size;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ick extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public static final nbh f30339a = nbh.m17259h("com/google/android/apps/camera/ui/modeswitcher/ModeList");

    /* JADX INFO: renamed from: p */
    private static final ilh f30340p = new ilh();

    /* JADX INFO: renamed from: b */
    public final mtz f30341b;

    /* JADX INFO: renamed from: c */
    public final HashMap f30342c;

    /* JADX INFO: renamed from: d */
    public final EnumSet f30343d;

    /* JADX INFO: renamed from: e */
    public final EnumMap f30344e;

    /* JADX INFO: renamed from: f */
    public boolean f30345f;

    /* JADX INFO: renamed from: g */
    public TextView f30346g;

    /* JADX INFO: renamed from: h */
    public int f30347h;

    /* JADX INFO: renamed from: i */
    public int f30348i;

    /* JADX INFO: renamed from: j */
    public int f30349j;

    /* JADX INFO: renamed from: k */
    public ikw f30350k;

    /* JADX INFO: renamed from: l */
    public final Drawable f30351l;

    /* JADX INFO: renamed from: m */
    public Animator f30352m;

    /* JADX INFO: renamed from: n */
    public mrm f30353n;

    /* JADX INFO: renamed from: o */
    public int f30354o;

    /* JADX INFO: renamed from: q */
    private Animator f30355q;

    /* JADX INFO: renamed from: r */
    private final int f30356r;

    /* JADX WARN: Multi-variable type inference failed */
    public ick(Context context) {
        super(context);
        this.f30341b = new mvh(ikw.class);
        this.f30342c = new HashMap();
        this.f30343d = EnumSet.noneOf(ikw.class);
        this.f30344e = new EnumMap(ikw.class);
        this.f30354o = 1;
        this.f30353n = mqu.f41450a;
        jvd.m13538a();
        Resources resources = context.getResources();
        if (context instanceof cdp) {
            dhv dhvVarMo3499a = ((cdp) context).mo3499a();
            int i = dia.f11213a;
            dhvVarMo3499a.mo6175c();
        }
        setVisibility(4);
        setAlpha(0.0f);
        this.f30347h = kxk.m15024q(this, C0100R.attr.colorOnSecondary);
        this.f30348i = kxk.m15024q(this, C0100R.attr.colorOnSurface);
        this.f30349j = kxk.m15024q(this, C0100R.attr.colorSecondary);
        this.f30356r = resources.getInteger(C0100R.integer.move_accent_animation_duration);
        Drawable drawable = getContext().getResources().getDrawable(C0100R.drawable.mode_chip, null);
        this.f30351l = drawable;
        drawable.setVisible(true, true);
        m11063a().setColor(this.f30349j);
        addOnLayoutChangeListener(new hdf(this, 5));
    }

    /* JADX INFO: renamed from: f */
    private static Rect m11060f(TextView textView) {
        return new Rect(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
    }

    /* JADX INFO: renamed from: g */
    private final void m11061g(TextView textView) {
        TextView textView2 = this.f30346g;
        if (textView2 != null) {
            textView2.setSelected(false);
            m11062h(this.f30346g, false);
        }
        this.f30346g = textView;
        textView.setSelected(true);
        m11062h(this.f30346g, true);
    }

    /* JADX INFO: renamed from: h */
    private final void m11062h(TextView textView, boolean z) {
        String strM11413c;
        if (textView != null) {
            if (z) {
                strM11413c = textView.getText().toString();
            } else {
                ikw ikwVar = (ikw) ((msv) this.f30341b).f41564b.get(textView);
                ikwVar.getClass();
                strM11413c = iku.m11410b(ikwVar).m11413c(getContext().getResources());
            }
            textView.setContentDescription(strM11413c);
        }
    }

    /* JADX INFO: renamed from: a */
    final ila m11063a() {
        return new ici(this, 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m11064b(ikw ikwVar, boolean z) {
        jvd.m13538a();
        if (this.f30341b.isEmpty()) {
            return;
        }
        TextView textView = (TextView) this.f30341b.get(ikwVar);
        lku.m15670x(textView != null, "attempted to activate non-existent mode ".concat(String.valueOf(String.valueOf(ikwVar))));
        if (textView.getWidth() == 0) {
            return;
        }
        if (this.f30346g != textView) {
            if (z) {
                m11066d(ikwVar);
            } else {
                m11067e(textView);
            }
        }
        textView.getText();
        textView.getLeft();
        textView.getRight();
        if (this.f30353n.mo16813g()) {
            ((ModeSwitcher) ((AmbientModeSupport.AmbientController) this.f30353n.mo16809c()).f1702a).m4392f((textView.getLeft() + textView.getRight()) / 2, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11066d(ikw ikwVar) {
        Animator animator = this.f30352m;
        if (animator != null) {
            animator.end();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.f30356r);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f30351l, voNZjxiJou.etnvU, f30340p, this.f30351l.getBounds(), m11060f((TextView) this.f30341b.get(ikwVar)));
        objectAnimatorOfObject.addUpdateListener(new ibw(this, 3));
        objectAnimatorOfObject.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(this.f30346g, "textColor", this.f30347h, this.f30348i);
        objectAnimatorOfArgb.setInterpolator(new DecelerateInterpolator());
        m11061g((TextView) this.f30341b.get(ikwVar));
        ObjectAnimator objectAnimatorOfArgb2 = ObjectAnimator.ofArgb(this.f30346g, "textColor", this.f30348i, this.f30347h);
        objectAnimatorOfArgb2.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfObject).with(objectAnimatorOfArgb2).with(objectAnimatorOfArgb);
        invalidate();
        animatorSet.start();
        this.f30352m = animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public final void m11067e(TextView textView) {
        Animator animator = this.f30352m;
        if (animator != null) {
            animator.end();
        }
        TextView textView2 = this.f30346g;
        if (textView2 != null) {
            textView2.setTextColor(this.f30348i);
        }
        textView.setTextColor(this.f30347h);
        this.f30351l.setBounds(m11060f(textView));
        m11061g(textView);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.f30351l.isVisible()) {
            this.f30351l.draw(canvas);
        } else {
            ((nbe) ((nbe) f30339a.m17252c()).mo17276G((char) 4129)).mo17290o("highlight chip is not visible");
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EnumSet enumSetCopyOf;
        idn idnVar;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f30354o;
        if (i5 == 2 || i5 == 3) {
            jvd.m13538a();
            synchronized (this) {
                if (this.f30345f) {
                    enumSetCopyOf = EnumSet.copyOf(this.f30343d);
                    this.f30345f = false;
                } else {
                    enumSetCopyOf = null;
                }
            }
            if (enumSetCopyOf != null) {
                for (ikw ikwVar : this.f30341b.keySet()) {
                    boolean z2 = ((TextView) this.f30341b.get(ikwVar)).getForeground() != null;
                    boolean zContains = enumSetCopyOf.contains(ikwVar);
                    if (z2 != zContains && (idnVar = (idn) this.f30344e.get(ikwVar)) != null) {
                        if (zContains) {
                            idnVar.m11121b();
                        } else {
                            idnVar.m11120a(true);
                        }
                    }
                }
            }
        }
        if (this.f30354o == 2) {
            lku.m15613H(true);
            int iM442c = afc.m442c(this);
            ikw ikwVar2 = this.f30350k;
            ikwVar2.getClass();
            m11064b(ikwVar2, iM442c == 1);
            if (isEnabled()) {
                setVisibility(0);
                m11065c(true, false);
            }
            this.f30354o = 3;
        }
        TextView textView = this.f30346g;
        if (textView != null) {
            this.f30351l.setBounds(m11060f(textView));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        jvd.m13538a();
        Size size = new Size(i, i2);
        icj icjVar = (icj) this.f30342c.get(size);
        if (icjVar == null) {
            icjVar = new icj();
            int i3 = 0;
            int measuredWidth2 = 0;
            int iMax = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                measuredWidth2 += getChildAt(i4).getMeasuredWidth();
                iMax = Math.max(iMax, getChildAt(i4).getMeasuredHeight());
            }
            icjVar.f30335a = measuredWidth2;
            icjVar.f30336b = iMax;
            boolean z = measuredWidth2 > 0 && iMax > 0;
            int size2 = View.MeasureSpec.getSize(i);
            int iM442c = afc.m442c(this);
            if (getChildCount() > 0) {
                boolean z2 = iM442c == 1;
                View childAt = z2 ? getChildAt(getChildCount() - 1) : getChildAt(0);
                View childAt2 = z2 ? getChildAt(0) : getChildAt(getChildCount() - 1);
                if (childAt != null && childAt2 != null && childAt.getMeasuredWidth() > 0 && childAt2.getMeasuredWidth() > 0) {
                    int measuredWidth3 = size2 - childAt.getMeasuredWidth();
                    measuredWidth = (size2 - childAt2.getMeasuredWidth()) / 2;
                    i3 = measuredWidth3 / 2;
                } else if (z && i3 != 0) {
                    this.f30342c.put(size, icjVar);
                }
            } else {
                measuredWidth = 0;
            }
            icjVar.f30337c = i3;
            icjVar.f30338d = measuredWidth;
            i3 = 1;
            if (z) {
                this.f30342c.put(size, icjVar);
            }
        }
        setPadding(icjVar.f30337c, getPaddingTop(), icjVar.f30338d, getPaddingBottom());
        setMeasuredDimension(resolveSize(icjVar.f30335a + icjVar.f30337c + icjVar.f30338d, i), resolveSize(icjVar.f30336b, i2));
    }

    /* JADX INFO: renamed from: c */
    public final void m11065c(boolean z, boolean z2) {
        if (!z2) {
            setAlpha(true != z ? 0.0f : 1.0f);
            return;
        }
        Animator animator = this.f30355q;
        if (animator != null) {
            animator.end();
        }
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f) : ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setStartDelay(217L);
        objectAnimatorOfFloat.start();
        this.f30355q = objectAnimatorOfFloat;
    }
}
