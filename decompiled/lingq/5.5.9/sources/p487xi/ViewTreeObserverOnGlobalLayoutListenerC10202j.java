package p487xi;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import p278nh.AbstractC7791r;

/* JADX INFO: renamed from: xi.j */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC10202j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f51604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC7791r.o f51605b;

    public ViewTreeObserverOnGlobalLayoutListenerC10202j(StreakActivityLevelView streakActivityLevelView, AbstractC7791r.o oVar) {
        this.f51604a = streakActivityLevelView;
        this.f51605b = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.f51604a;
        if (viewGroup.getMeasuredWidth() > 0 && viewGroup.getMeasuredHeight() > 0) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) viewGroup;
            AbstractC7791r.o oVar = this.f51605b;
            streakActivityLevelView.m9375a(oVar.f42857e, oVar.f42858f, oVar.f42859g, false);
            streakActivityLevelView.setViewForSize(Math.min(streakActivityLevelView.getMeasuredWidth(), streakActivityLevelView.getMeasuredHeight()));
        }
    }
}
