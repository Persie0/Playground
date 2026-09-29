package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.R$id;
import java.util.ArrayList;
import java.util.List;
import p000.C3386nv;
import p000.jp9;
import p000.mt6;
import p000.na1;
import p000.ux5;
import p000.yn7;

/* JADX INFO: loaded from: classes2.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final Object f5519c = new Object();

    /* JADX INFO: renamed from: a */
    public final ArrayList f5520a;

    /* JADX INFO: renamed from: b */
    public yn7 f5521b;

    public ProtectionLayout(Context context, List list) {
        super(context);
        this.f5520a = new ArrayList();
        setProtections(list);
    }

    private jp9 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R$id.tag_system_bar_state_monitor);
        if (tag instanceof jp9) {
            return (jp9) tag;
        }
        jp9 jp9Var = new jp9(viewGroup);
        viewGroup.setTag(R$id.tag_system_bar_state_monitor, jp9Var);
        return jp9Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2002a() {
        ArrayList arrayList = this.f5520a;
        if (arrayList.isEmpty()) {
            m2003b();
            return;
        }
        jp9 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        m2003b();
        this.f5521b = new yn7(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f5521b.f70110a.size() <= 0) {
            return;
        }
        na1 na1Var = (na1) this.f5521b.f70110a.get(0);
        getContext();
        na1Var.getClass();
        C3386nv.m17626m(ux5.m22988k(0, "Unexpected side: "));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f5519c) {
            yn7 yn7Var = this.f5521b;
            int childCount = getChildCount() - (yn7Var != null ? yn7Var.f70110a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m2003b() {
        if (this.f5521b != null) {
            removeViews(getChildCount() - this.f5521b.f70110a.size(), this.f5521b.f70110a.size());
            int size = this.f5521b.f70110a.size();
            yn7 yn7Var = this.f5521b;
            if (size > 0) {
                ((na1) yn7Var.f70110a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = yn7Var.f70110a;
            if (!yn7Var.f70115f) {
                yn7Var.f70115f = true;
                yn7Var.f70111b.f45973b.remove(yn7Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((na1) arrayList.get(size2)).f52533c = null;
                }
                arrayList.clear();
            }
            this.f5521b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2002a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2003b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R$id.tag_system_bar_state_monitor);
        if (tag instanceof jp9) {
            jp9 jp9Var = (jp9) tag;
            if (jp9Var.f45973b.isEmpty()) {
                jp9Var.f45972a.post(new mt6(jp9Var, 12));
                viewGroup.setTag(R$id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<na1> list) {
        ArrayList arrayList = this.f5520a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m2002a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5520a = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.f5520a = new ArrayList();
    }
}
