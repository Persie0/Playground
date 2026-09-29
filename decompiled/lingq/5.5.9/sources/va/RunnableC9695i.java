package va;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.p051ui.C2515b;
import com.linguist.R;

/* JADX INFO: renamed from: va.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC9695i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9701o f49627b;

    public /* synthetic */ RunnableC9695i(C9701o c9701o, int i10) {
        this.f49626a = i10;
        this.f49627b = c9701o;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f49626a;
        C9701o c9701o = this.f49627b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                c9701o.m18212k();
                break;
            case 1:
                c9701o.f49652m.start();
                break;
            default:
                ViewGroup viewGroup = c9701o.f49644e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(c9701o.f49637A ? 0 : 4);
                }
                View view = c9701o.f49649j;
                if (view != null) {
                    int dimensionPixelSize = c9701o.f49640a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (c9701o.f49637A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof C2515b) {
                        C2515b c2515b = (C2515b) view;
                        boolean z10 = c9701o.f49637A;
                        Rect rect = c2515b.f13534a;
                        ValueAnimator valueAnimator = c2515b.f13539c0;
                        if (z10) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c2515b.f13543e0 = true;
                            c2515b.f13541d0 = 0.0f;
                            c2515b.invalidate(rect);
                        } else {
                            int i11 = c9701o.f49665z;
                            if (i11 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c2515b.f13543e0 = false;
                                c2515b.f13541d0 = 0.0f;
                                c2515b.invalidate(rect);
                            } else if (i11 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                c2515b.f13543e0 = false;
                                c2515b.f13541d0 = 1.0f;
                                c2515b.invalidate(c2515b.f13534a);
                            }
                        }
                    }
                }
                for (View view2 : c9701o.f49664y) {
                    view2.setVisibility((c9701o.f49637A && C9701o.m18205j(view2)) ? 4 : 0);
                }
                break;
        }
    }
}
