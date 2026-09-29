package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000.gw5;
import p000.hw5;
import p000.ix5;
import p000.mw5;
import p000.sq5;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements gw5, ix5, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f1028b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public hw5 f1029a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, context, attributeSet, f1028b);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(sq5VarM21551w.m21568j(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(sq5VarM21551w.m21568j(1));
        }
        sq5VarM21551w.m21582y();
    }

    @Override // p000.gw5
    /* JADX INFO: renamed from: a */
    public final boolean mo647a(mw5 mw5Var) {
        return this.f1029a.m13534q(mw5Var, null, 0);
    }

    @Override // p000.ix5
    /* JADX INFO: renamed from: b */
    public final void mo648b(hw5 hw5Var) {
        this.f1029a = hw5Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo647a((mw5) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
