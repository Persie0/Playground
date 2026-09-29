package p000;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.p002ui.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dh8 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final int f35659a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f35660b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35661c;

    /* JADX INFO: renamed from: d */
    public final fs6 f35662d;

    /* JADX INFO: renamed from: e */
    public int f35663e;

    public dh8(Context context) {
        super(context);
        this.f35659a = 5;
        ArrayList arrayList = new ArrayList();
        this.f35660b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f35661c = arrayList2;
        this.f35662d = new fs6(15);
        setClipChildren(false);
        eh8 eh8Var = new eh8(context);
        addView(eh8Var);
        arrayList.add(eh8Var);
        arrayList2.add(eh8Var);
        this.f35663e = 1;
        setTag(R$id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
