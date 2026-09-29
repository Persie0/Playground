package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jp9 {

    /* JADX INFO: renamed from: a */
    public final hp9 f45972a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f45973b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public l64 f45974c;

    /* JADX INFO: renamed from: d */
    public l64 f45975d;

    /* JADX INFO: renamed from: e */
    public int f45976e;

    public jp9(ViewGroup viewGroup) {
        View childAt;
        l64 l64Var = l64.f49115e;
        this.f45974c = l64Var;
        this.f45975d = l64Var;
        Drawable background = viewGroup.getBackground();
        this.f45976e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        hp9 hp9Var = new hp9(this, viewGroup.getContext(), viewGroup);
        this.f45972a = hp9Var;
        hp9Var.setVisibility(8);
        hp9Var.setWillNotDraw(true);
        dw6 dw6Var = new dw6(this, 13);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(hp9Var, dw6Var);
        dta.m10642m(hp9Var, new ip9(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(hp9Var, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new x69(viewGroup, hp9Var));
        }
    }
}
