package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p104f.C5452a;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0224f.b, InterfaceC0229k, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b */
    public static final int[] f614b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public C0224f f615a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet);
        setOnItemClickListener(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f614b, R.attr.listViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C5452a.m11672a(context, resourceId2));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider((!typedArrayObtainStyledAttributes.hasValue(1) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(1) : C5452a.m11672a(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.C0224f.b
    /* JADX INFO: renamed from: a */
    public final boolean mo889a(C0226h c0226h) {
        return this.f615a.m933q(c0226h, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k
    /* JADX INFO: renamed from: b */
    public final void mo237b(C0224f c0224f) {
        this.f615a = c0224f;
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
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo889a((C0226h) getAdapter().getItem(i10));
    }
}
