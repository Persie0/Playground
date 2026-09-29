package p000;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s5a implements ex5 {

    /* JADX INFO: renamed from: a */
    public hw5 f60390a;

    /* JADX INFO: renamed from: b */
    public mw5 f60391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Toolbar f60392c;

    public s5a(Toolbar toolbar) {
        this.f60392c = toolbar;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        if (this.f60391b != null) {
            hw5 hw5Var = this.f60390a;
            if (hw5Var != null) {
                int size = hw5Var.f43042f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f60390a.getItem(i) == this.f60391b) {
                        return;
                    }
                }
            }
            mo707g(this.f60391b);
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: g */
    public final boolean mo707g(mw5 mw5Var) {
        Toolbar toolbar = this.f60392c;
        KeyEvent.Callback callback = toolbar.f1184i;
        if (callback instanceof b51) {
            ((ow5) ((b51) callback)).m18534a();
        }
        toolbar.removeView(toolbar.f1184i);
        toolbar.removeView(toolbar.f1182h);
        toolbar.f1184i = null;
        ArrayList arrayList = toolbar.f1173c0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f60391b = null;
        toolbar.requestLayout();
        mw5Var.f51941C = false;
        mw5Var.f51955n.m13533p(false);
        toolbar.m699t();
        return true;
    }

    @Override // p000.ex5
    public final int getId() {
        return 0;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: j */
    public final boolean mo710j(mw5 mw5Var) {
        Toolbar toolbar = this.f60392c;
        toolbar.m686c();
        ViewParent parent = toolbar.f1182h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1182h);
            }
            toolbar.addView(toolbar.f1182h);
        }
        View actionView = mw5Var.getActionView();
        toolbar.f1184i = actionView;
        this.f60391b = mw5Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1184i);
            }
            t5a t5aVarM680h = Toolbar.m680h();
            t5aVarM680h.f61889a = (toolbar.f1153I & 112) | 8388611;
            t5aVarM680h.f61890b = 2;
            toolbar.f1184i.setLayoutParams(t5aVarM680h);
            toolbar.addView(toolbar.f1184i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((t5a) childAt.getLayoutParams()).f61890b != 2 && childAt != toolbar.f1168a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1173c0.add(childAt);
            }
        }
        toolbar.requestLayout();
        mw5Var.f51941C = true;
        mw5Var.f51955n.m13533p(false);
        KeyEvent.Callback callback = toolbar.f1184i;
        if (callback instanceof b51) {
            ((ow5) ((b51) callback)).m18535b();
        }
        toolbar.m699t();
        return true;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: l */
    public final void mo712l(Context context, hw5 hw5Var) {
        mw5 mw5Var;
        hw5 hw5Var2 = this.f60390a;
        if (hw5Var2 != null && (mw5Var = this.f60391b) != null) {
            hw5Var2.mo13521d(mw5Var);
        }
        this.f60390a = hw5Var;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        return null;
    }
}
