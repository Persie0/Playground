package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.lingq.commons.p053ui.views.StreakView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8366u1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class StatsShareFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8366u1> {

    /* JADX INFO: renamed from: j */
    public static final StatsShareFragment$binding$2 f24396j = new StatsShareFragment$binding$2();

    public StatsShareFragment$binding$2() {
        super(1, C8366u1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentStatsShareBinding;", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8366u1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnShare;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnShare);
        if (materialButton != null) {
            i10 = R.id.ivLanguageFlag;
            ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivLanguageFlag);
            if (imageView != null) {
                i10 = R.id.ivLingqLogo;
                if (((ImageView) C0062b.m298P0(view2, R.id.ivLingqLogo)) != null) {
                    i10 = R.id.llStats;
                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.llStats);
                    if (linearLayout != null) {
                        i10 = R.id.rvGoals;
                        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvGoals);
                        if (recyclerView != null) {
                            i10 = R.id.shimmerLayout;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(view2, R.id.shimmerLayout);
                            if (shimmerFrameLayout != null) {
                                i10 = R.id.streakView;
                                StreakView streakView = (StreakView) C0062b.m298P0(view2, R.id.streakView);
                                if (streakView != null) {
                                    i10 = R.id.tvKnownWords;
                                    TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvKnownWords);
                                    if (textView != null) {
                                        i10 = R.id.tvStreak;
                                        TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvStreak);
                                        if (textView2 != null) {
                                            return new C8366u1(materialButton, imageView, linearLayout, recyclerView, shimmerFrameLayout, streakView, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
