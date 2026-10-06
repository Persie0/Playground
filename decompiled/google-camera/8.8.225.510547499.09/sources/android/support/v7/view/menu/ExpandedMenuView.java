package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.wear.ambient.AmbientDelegate;
import p000.C0225gw;
import p000.C0227gy;
import p000.InterfaceC0224gv;
import p000.InterfaceC0241hl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, InterfaceC0224gv, InterfaceC0241hl {

    /* JADX INFO: renamed from: a */
    private static final int[] f919a = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b */
    private C0225gw f920b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // p000.InterfaceC0241hl
    /* JADX INFO: renamed from: a */
    public final void mo1036a(C0225gw c0225gw) {
        this.f920b = c0225gw;
    }

    @Override // p000.InterfaceC0224gv
    /* JADX INFO: renamed from: b */
    public final boolean mo1037b(C0227gy c0227gy) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f920b.m9846z((C0227gy) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, f919a, i, 0);
        if (ambientDelegateM1568D.m1575A(0)) {
            setBackgroundDrawable(ambientDelegateM1568D.m1618u(0));
        }
        if (ambientDelegateM1568D.m1575A(1)) {
            setDivider(ambientDelegateM1568D.m1618u(1));
        }
        ambientDelegateM1568D.m1622y();
    }
}
