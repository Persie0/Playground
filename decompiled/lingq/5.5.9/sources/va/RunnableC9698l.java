package va;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p051ui.C2517d;
import java.util.ArrayList;

/* JADX INFO: renamed from: va.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9698l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9701o f49633b;

    public /* synthetic */ RunnableC9698l(C9701o c9701o, int i10) {
        this.f49632a = i10;
        this.f49633b = c9701o;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0 A[LOOP:3: B:35:0x00c9->B:37:0x00d0, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f49632a;
        C9701o c9701o = this.f49633b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                c9701o.f49651l.start();
                c9701o.f49640a.postDelayed(c9701o.f49660u, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                break;
            default:
                ViewGroup viewGroup2 = c9701o.f49645f;
                if (viewGroup2 != null && (viewGroup = c9701o.f49646g) != null) {
                    C2517d c2517d = c9701o.f49640a;
                    int width = (c2517d.getWidth() - c2517d.getPaddingLeft()) - c2517d.getPaddingRight();
                    while (true) {
                        if (viewGroup.getChildCount() <= 1) {
                            View view = c9701o.f49650k;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            int iM18203d = C9701o.m18203d(c9701o.f49648i);
                            int childCount = viewGroup2.getChildCount() - 1;
                            for (int i11 = 0; i11 < childCount; i11++) {
                                iM18203d += C9701o.m18203d(viewGroup2.getChildAt(i11));
                            }
                            if (iM18203d > width) {
                                if (view != null) {
                                    view.setVisibility(0);
                                    iM18203d += C9701o.m18203d(view);
                                }
                                ArrayList arrayList = new ArrayList();
                                for (int i12 = 0; i12 < childCount; i12++) {
                                    View childAt = viewGroup2.getChildAt(i12);
                                    iM18203d -= C9701o.m18203d(childAt);
                                    arrayList.add(childAt);
                                    if (iM18203d <= width) {
                                        if (!arrayList.isEmpty()) {
                                            viewGroup2.removeViews(0, arrayList.size());
                                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                                viewGroup.addView((View) arrayList.get(i13), viewGroup.getChildCount() - 1);
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    viewGroup2.removeViews(0, arrayList.size());
                                    while (i13 < arrayList.size()) {
                                        viewGroup.addView((View) arrayList.get(i13), viewGroup.getChildCount() - 1);
                                    }
                                }
                                break;
                            } else {
                                ViewGroup viewGroup3 = c9701o.f49647h;
                                if (viewGroup3 != null && viewGroup3.getVisibility() == 0) {
                                    ValueAnimator valueAnimator = c9701o.f49657r;
                                    if (!valueAnimator.isStarted()) {
                                        c9701o.f49656q.cancel();
                                        valueAnimator.start();
                                    }
                                    break;
                                }
                            }
                        } else {
                            int childCount2 = viewGroup.getChildCount() - 2;
                            View childAt2 = viewGroup.getChildAt(childCount2);
                            viewGroup.removeViewAt(childCount2);
                            viewGroup2.addView(childAt2, 0);
                        }
                    }
                }
                break;
        }
    }
}
