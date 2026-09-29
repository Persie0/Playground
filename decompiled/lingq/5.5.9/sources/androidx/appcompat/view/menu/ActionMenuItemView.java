package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0309e1;
import p058d.C4999a;
import p185j.AbstractC6394d;
import p185j.InterfaceC6396f;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0229k.a, View.OnClickListener, ActionMenuView.InterfaceC0245a {

    /* JADX INFO: renamed from: H */
    public AbstractC0218b f602H;

    /* JADX INFO: renamed from: I */
    public boolean f603I;

    /* JADX INFO: renamed from: J */
    public boolean f604J;

    /* JADX INFO: renamed from: K */
    public final int f605K;

    /* JADX INFO: renamed from: L */
    public int f606L;

    /* JADX INFO: renamed from: M */
    public final int f607M;

    /* JADX INFO: renamed from: h */
    public C0226h f608h;

    /* JADX INFO: renamed from: i */
    public CharSequence f609i;

    /* JADX INFO: renamed from: j */
    public Drawable f610j;

    /* JADX INFO: renamed from: k */
    public C0224f.b f611k;

    /* JADX INFO: renamed from: l */
    public C0217a f612l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0217a extends AbstractViewOnTouchListenerC0320i0 {
        public C0217a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
        /* JADX INFO: renamed from: b */
        public final InterfaceC6396f mo887b() {
            ActionMenuPresenter.C0239a c0239a;
            AbstractC0218b abstractC0218b = ActionMenuItemView.this.f602H;
            AbstractC6394d abstractC6394dM950a = null;
            if (abstractC0218b != null && (c0239a = ActionMenuPresenter.this.f849P) != null) {
                abstractC6394dM950a = c0239a.m950a();
            }
            return abstractC6394dM950a;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0320i0
        /* JADX INFO: renamed from: c */
        public final boolean mo888c() {
            InterfaceC6396f interfaceC6396fMo887b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0224f.b bVar = actionMenuItemView.f611k;
            boolean z10 = false;
            if (bVar != null && bVar.mo889a(actionMenuItemView.f608h) && (interfaceC6396fMo887b = mo887b()) != null && interfaceC6396fMo887b.mo893a()) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0218b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f603I = m885m();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32589c, 0, 0);
        this.f605K = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f607M = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f606L = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0245a
    /* JADX INFO: renamed from: a */
    public final boolean mo882a() {
        return m884l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0245a
    /* JADX INFO: renamed from: b */
    public final boolean mo883b() {
        return m884l() && this.f608h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    /* JADX INFO: renamed from: d */
    public final void mo232d(C0226h c0226h) {
        this.f608h = c0226h;
        setIcon(c0226h.getIcon());
        setTitle(c0226h.getTitleCondensed());
        setId(c0226h.f723a);
        setVisibility(c0226h.isVisible() ? 0 : 8);
        setEnabled(c0226h.isEnabled());
        if (c0226h.hasSubMenu() && this.f612l == null) {
            this.f612l = new C0217a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    public C0226h getItemData() {
        return this.f608h;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m884l() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m885m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && (i10 < 640 || i11 < 480)) {
            if (configuration.orientation != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[PHI: r1
      0x002f: PHI (r1v1 boolean) = (r1v0 boolean), (r1v6 boolean), (r1v0 boolean) binds: [B:3:0x000f, B:14:0x002e, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r6.f604J != false) goto L16;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m886n() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f609i);
        if (this.f610j != null) {
            if (!((this.f608h.f747y & 4) == 4)) {
                z10 = false;
            } else if (this.f603I) {
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.f609i : null);
        CharSequence charSequence2 = this.f608h.f739q;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z12 ? null : this.f608h.f727e);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.f608h.f740r;
        if (!TextUtils.isEmpty(charSequence3)) {
            C0309e1.m1185a(this, charSequence3);
            return;
        }
        if (!z12) {
            charSequence = this.f608h.f727e;
        }
        C0309e1.m1185a(this, charSequence);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0224f.b bVar = this.f611k;
        if (bVar != null) {
            bVar.mo889a(this.f608h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f603I = m885m();
        m886n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zM884l = m884l();
        if (zM884l && (i12 = this.f606L) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f605K;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zM884l && this.f610j != null) {
            super.setPadding((getMeasuredWidth() - this.f610j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0217a c0217a;
        if (this.f608h.hasSubMenu() && (c0217a = this.f612l) != null && c0217a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f604J != z10) {
            this.f604J = z10;
            C0226h c0226h = this.f608h;
            if (c0226h != null) {
                C0224f c0224f = c0226h.f736n;
                c0224f.f703k = true;
                c0224f.m932p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f610j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f607M;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m886n();
    }

    public void setItemInvoker(C0224f.b bVar) {
        this.f611k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f606L = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0218b abstractC0218b) {
        this.f602H = abstractC0218b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f609i = charSequence;
        m886n();
    }
}
