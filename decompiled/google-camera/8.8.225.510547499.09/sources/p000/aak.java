package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aak implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CoordinatorLayout f13a;

    public aak(CoordinatorLayout coordinatorLayout) {
        this.f13a = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13a.f1452g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.f13a.m1425i(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13a.f1452g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
