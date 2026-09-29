package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.media.C0141b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import p313p3.C8183a;
import p471x2.C10029b0;
import p471x2.C10063s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m13365d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lsl/e;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6140a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6141b;

    /* JADX INFO: renamed from: c */
    public View.OnApplyWindowInsetsListener f6142c;

    /* JADX INFO: renamed from: d */
    public boolean f6143d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f6140a = new ArrayList();
        this.f6141b = new ArrayList();
        this.f6143d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        this.f6140a = new ArrayList();
        this.f6141b = new ArrayList();
        this.f6143d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8183a.f44325b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute != null) {
                if (isInEditMode()) {
                    return;
                }
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        View view;
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(attributeSet, "attrs");
        C5207g.m11111f(fragmentManager, "fm");
        this.f6140a = new ArrayList();
        this.f6141b = new ArrayList();
        this.f6143d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8183a.f44325b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentM3615C = fragmentManager.m3615C(id2);
        if (classAttribute != null && fragmentM3615C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(C0141b.m611g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0985w c0985wM3619G = fragmentManager.m3619G();
            context.getClassLoader();
            Fragment fragmentMo3674a = c0985wM3619G.mo3674a(classAttribute);
            C5207g.m11110e(fragmentMo3674a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentMo3674a.mo3565N(context, attributeSet, null);
            C0940a c0940a = new C0940a(fragmentManager);
            c0940a.f6359p = true;
            fragmentMo3674a.f6092b0 = this;
            c0940a.mo3695f(getId(), fragmentMo3674a, string, 1);
            if (c0940a.f6350g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0940a.f6351h = false;
            c0940a.f6250q.m3668y(c0940a, true);
        }
        for (C0959j0 c0959j0 : fragmentManager.f6160c.m3760d()) {
            Fragment fragment = c0959j0.f6311c;
            if (fragment.f6082T == getId() && (view = fragment.f6094c0) != null && view.getParent() == null) {
                fragment.f6092b0 = this;
                c0959j0.m3739b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3607a(View view) {
        if (this.f6141b.contains(view)) {
            this.f6140a.add(view);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        C5207g.m11111f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C10063s0 c10063s0M18653i;
        C5207g.m11111f(windowInsets, "insets");
        C10063s0 c10063s0M18863i = C10063s0.m18863i(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f6142c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C5207g.m11110e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c10063s0M18653i = C10063s0.m18863i(null, windowInsetsOnApplyWindowInsets);
        } else {
            c10063s0M18653i = C10029b0.m18653i(this, c10063s0M18863i);
        }
        C5207g.m11110e(c10063s0M18653i, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c10063s0M18653i.f51077a.mo18896m()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C10029b0.m18646b(getChildAt(i10), c10063s0M18653i);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C5207g.m11111f(canvas, "canvas");
        if (this.f6143d) {
            Iterator it = this.f6140a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        C5207g.m11111f(canvas, "canvas");
        C5207g.m11111f(view, "child");
        if (this.f6143d) {
            ArrayList arrayList = this.f6140a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C5207g.m11111f(view, "view");
        this.f6141b.remove(view);
        if (this.f6140a.remove(view)) {
            this.f6143d = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final <F extends Fragment> F getFragment() {
        ActivityC0979t activityC0979t;
        Fragment fragment;
        FragmentManager fragmentManagerM3805K;
        View view = this;
        while (true) {
            activityC0979t = null;
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof ActivityC0979t) {
                    activityC0979t = (ActivityC0979t) context;
                    break;
                }
            }
            if (activityC0979t == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            fragmentManagerM3805K = activityC0979t.m3805K();
        } else {
            if (!fragment.m3604y()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            fragmentManagerM3805K = fragment.m3594l();
        }
        return (F) fragmentManagerM3805K.m3615C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C5207g.m11111f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            C5207g.m11110e(childAt, "view");
            m3607a(childAt);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C5207g.m11111f(view, "view");
        m3607a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        C5207g.m11110e(childAt, "view");
        m3607a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C5207g.m11111f(view, "view");
        m3607a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C5207g.m11110e(childAt, "view");
            m3607a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C5207g.m11110e(childAt, "view");
            m3607a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f6143d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C5207g.m11111f(onApplyWindowInsetsListener, "listener");
        this.f6142c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C5207g.m11111f(view, "view");
        if (view.getParent() == this) {
            this.f6141b.add(view);
        }
        super.startViewTransition(view);
    }
}
