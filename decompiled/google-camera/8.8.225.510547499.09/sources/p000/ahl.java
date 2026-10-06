package p000;

import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahl extends aei {
    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo325a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.m1450b() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        agu.m645c(accessibilityEvent, nestedScrollView.getScrollX());
        agu.m646d(accessibilityEvent, nestedScrollView.m1450b());
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        int iM1450b;
        super.mo326b(view, agtVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        agtVar.m631i(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iM1450b = nestedScrollView.m1450b()) <= 0) {
            return;
        }
        agtVar.m636n(true);
        if (nestedScrollView.getScrollY() > 0) {
            agtVar.m628f(agr.f338n);
            agtVar.m628f(agr.f349y);
        }
        if (nestedScrollView.getScrollY() < iM1450b) {
            agtVar.m628f(agr.f337m);
            agtVar.m628f(agr.f313A);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: h */
    public final boolean mo332h(View view, int i, Bundle bundle) {
        if (super.mo332h(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        switch (i) {
            case 4096:
            case R.id.accessibilityActionScrollDown:
                int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.m1450b());
                if (iMin == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1462s(iMin);
                return true;
            case 8192:
            case R.id.accessibilityActionScrollUp:
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1462s(iMax);
                return true;
            default:
                return false;
        }
    }
}
