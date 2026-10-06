package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class atv implements aew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager f2389a;

    /* JADX INFO: renamed from: b */
    private final Rect f2390b = new Rect();

    public atv(ViewPager viewPager) {
        this.f2389a = viewPager;
    }

    @Override // p000.aew
    /* JADX INFO: renamed from: a */
    public final ago mo402a(View view, ago agoVar) {
        ago agoVarM543c = afq.m543c(view, agoVar);
        if (agoVarM543c.m616q()) {
            return agoVarM543c;
        }
        Rect rect = this.f2390b;
        rect.left = agoVarM543c.m604b();
        rect.top = agoVarM543c.m606d();
        rect.right = agoVarM543c.m605c();
        rect.bottom = agoVarM543c.m603a();
        int childCount = this.f2389a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ago agoVarM542b = afq.m542b(this.f2389a.getChildAt(i), agoVarM543c);
            rect.left = Math.min(agoVarM542b.m604b(), rect.left);
            rect.top = Math.min(agoVarM542b.m606d(), rect.top);
            rect.right = Math.min(agoVarM542b.m605c(), rect.right);
            rect.bottom = Math.min(agoVarM542b.m603a(), rect.bottom);
        }
        agf agfVar = new agf(agoVarM543c);
        agfVar.mo577c(acr.m219b(rect));
        return agfVar.mo575a();
    }
}
