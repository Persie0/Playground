package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R$id;
import androidx.fragment.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.C3386nv;
import p000.ced;
import p000.de3;
import p000.dta;
import p000.f6b;
import p000.g70;
import p000.id3;
import p000.v63;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5625a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5626b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f5627c;

    /* JADX INFO: renamed from: d */
    public boolean f5628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0638f abstractC0638f) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        abstractC0638f.getClass();
        this.f5625a = new ArrayList();
        this.f5626b = new ArrayList();
        this.f5628d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R$styleable.FragmentContainerView;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2136D = abstractC0638f.m2136D(id);
        if (classAttribute != null && abstractComponentCallbacksC0635cM2136D == null) {
            if (id == -1) {
                C3386nv.m17633t(wq1.m24118n("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            de3 de3VarM2140I = abstractC0638f.m2140I();
            context.getClassLoader();
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM10309a = de3VarM2140I.m10309a(classAttribute);
            abstractComponentCallbacksC0635cM10309a.getClass();
            abstractComponentCallbacksC0635cM10309a.f5678T = id;
            abstractComponentCallbacksC0635cM10309a.f5679U = id;
            abstractComponentCallbacksC0635cM10309a.f5680V = string;
            abstractComponentCallbacksC0635cM10309a.f5674P = abstractC0638f;
            abstractComponentCallbacksC0635cM10309a.f5675Q = abstractC0638f.f5763x;
            abstractComponentCallbacksC0635cM10309a.mo2079F(context, attributeSet, null);
            g70 g70Var = new g70(abstractC0638f);
            g70Var.f40302p = true;
            abstractComponentCallbacksC0635cM10309a.f5690c0 = this;
            abstractComponentCallbacksC0635cM10309a.f5670L = true;
            g70Var.m12398h(getId(), abstractComponentCallbacksC0635cM10309a, string, 1);
            if (g70Var.f40293g) {
                C3386nv.m17633t("This transaction is already being added to the back stack");
                throw null;
            }
            g70Var.f40294h = false;
            g70Var.f40304r.m2133A(g70Var, true);
        }
        for (C0639g c0639g : abstractC0638f.f5742c.m17704x()) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
            if (abstractComponentCallbacksC0635c.f5679U == getId() && (view = abstractComponentCallbacksC0635c.f5692d0) != null && view.getParent() == null) {
                abstractComponentCallbacksC0635c.f5690c0 = this;
                c0639g.m2193b();
                c0639g.m2202k();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2063a(View view) {
        if (this.f5626b.contains(view)) {
            this.f5625a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0635c ? (AbstractComponentCallbacksC0635c) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            C3386nv.m17634u("Views added to a FragmentContainerView must be associated with a Fragment. View ", view, " is not associated with a Fragment.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f6b f6bVarM11570g;
        windowInsets.getClass();
        f6b f6bVarM11570g2 = f6b.m11570g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5627c;
        if (onApplyWindowInsetsListener != null) {
            f6bVarM11570g = f6b.m11570g(null, ced.m4603a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            WeakHashMap weakHashMap = dta.f36217a;
            WindowInsets windowInsetsM11575f = f6bVarM11570g2.m11575f();
            if (windowInsetsM11575f != null && !windowInsetsM11575f.equals(windowInsetsM11575f)) {
                f6bVarM11570g2 = f6b.m11570g(this, windowInsetsM11575f);
            }
            f6bVarM11570g = f6bVarM11570g2;
        }
        if (!f6bVarM11570g.f38536a.mo4372s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                dta.m10631b(getChildAt(i), f6bVarM11570g);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f5628d) {
            Iterator it = this.f5625a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f5628d) {
            ArrayList arrayList = this.f5625a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f5626b.remove(view);
        if (this.f5625a.remove(view)) {
            this.f5628d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0635c> F getFragment() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        id3 id3Var;
        AbstractC0638f abstractC0638fM13792j;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC0635c = null;
                break;
            }
            Object tag = view.getTag(R$id.fragment_container_view_tag);
            abstractComponentCallbacksC0635c = tag instanceof AbstractComponentCallbacksC0635c ? (AbstractComponentCallbacksC0635c) tag : null;
            if (abstractComponentCallbacksC0635c != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0635c == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    id3Var = null;
                    break;
                }
                if (context instanceof id3) {
                    id3Var = (id3) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (id3Var == null) {
                v63.m23148z("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
            abstractC0638fM13792j = id3Var.m13792j();
        } else {
            if (!abstractComponentCallbacksC0635c.m2115q()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0635c + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            abstractC0638fM13792j = abstractComponentCallbacksC0635c.m2106h();
        }
        return (F) abstractC0638fM13792j.m2136D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                m2063a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m2063a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m2063a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m2063a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m2063a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m2063a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f5628d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f5627c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f5626b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.f5625a = new ArrayList();
        this.f5626b = new ArrayList();
        this.f5628d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        context.getClass();
        this.f5625a = new ArrayList();
        this.f5626b = new ArrayList();
        this.f5628d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = R$styleable.FragmentContainerView;
            iArr.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
