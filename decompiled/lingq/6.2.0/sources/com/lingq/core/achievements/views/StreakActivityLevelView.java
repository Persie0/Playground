package com.lingq.core.achievements.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.lingq.core.achievements.R$id;
import com.lingq.core.achievements.R$layout;
import p000.C3386nv;
import p000.hva;
import p000.lfa;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class StreakActivityLevelView extends ConstraintLayout {

    /* JADX INFO: renamed from: L */
    public final hva f14279L;

    /* JADX INFO: renamed from: M */
    public int f14280M;

    /* JADX INFO: renamed from: N */
    public int f14281N;

    /* JADX INFO: renamed from: O */
    public int f14282O;

    /* JADX INFO: renamed from: P */
    public int f14283P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakActivityLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_streak_activity_level, (ViewGroup) this, false);
        addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i2 = R$id.cpStreak;
        StreakCircularProgressIndicator streakCircularProgressIndicator = (StreakCircularProgressIndicator) lfa.m16159c(viewInflate, i2);
        if (streakCircularProgressIndicator != null) {
            i2 = R$id.ivCoin;
            ImageView imageView = (ImageView) lfa.m16159c(viewInflate, i2);
            if (imageView != null) {
                i2 = R$id.ivInnerCoin;
                ImageView imageView2 = (ImageView) lfa.m16159c(viewInflate, i2);
                if (imageView2 != null) {
                    i2 = R$id.ivInnerLingq;
                    ImageView imageView3 = (ImageView) lfa.m16159c(viewInflate, i2);
                    if (imageView3 != null) {
                        i2 = R$id.ivLingq;
                        ImageView imageView4 = (ImageView) lfa.m16159c(viewInflate, i2);
                        if (imageView4 != null) {
                            i2 = R$id.streakViewProgress;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) lfa.m16159c(viewInflate, i2);
                            if (constraintLayout2 != null) {
                                i2 = R$id.tvCoins;
                                TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                                if (textView != null) {
                                    i2 = R$id.tvStreak;
                                    TextView textView2 = (TextView) lfa.m16159c(viewInflate, i2);
                                    if (textView2 != null) {
                                        i2 = R$id.viewCoin;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) lfa.m16159c(viewInflate, i2);
                                        if (constraintLayout3 != null) {
                                            i2 = R$id.viewFlashingCoin;
                                            if (((LottieAnimationView) lfa.m16159c(viewInflate, i2)) != null) {
                                                this.f14279L = new hva(constraintLayout, streakCircularProgressIndicator, imageView, imageView2, imageView3, imageView4, constraintLayout2, textView, textView2, constraintLayout3);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final hva getBinding() {
        return this.f14279L;
    }

    public final void setViewForSize(int i) {
        hva hvaVar = this.f14279L;
        hvaVar.f43005b.setTrackThickness(4);
        ConstraintLayout constraintLayout = hvaVar.f43004a;
        constraintLayout.getClass();
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = i;
        layoutParams.width = i;
        constraintLayout.setLayoutParams(layoutParams);
        hvaVar.f43011h.setTextSize(2, 9.0f);
        hvaVar.f43012i.setTextSize(2, 18.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreakActivityLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreakActivityLevelView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ StreakActivityLevelView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
