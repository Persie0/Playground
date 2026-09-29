package com.lingq.p055ui.goals;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8315l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class DailyGoalMetFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8315l> {

    /* JADX INFO: renamed from: j */
    public static final DailyGoalMetFragment$binding$2 f22532j = new DailyGoalMetFragment$binding$2();

    public DailyGoalMetFragment$binding$2() {
        super(1, C8315l.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentDailyGoalBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8315l mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.btnClose);
        if (imageView != null) {
            i10 = R.id.card;
            MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.card);
            if (materialCardView != null) {
                i10 = R.id.ivEmail;
                ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivEmail);
                if (imageView2 != null) {
                    i10 = R.id.ivFacebook;
                    ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.ivFacebook);
                    if (imageView3 != null) {
                        i10 = R.id.ivInstagram;
                        ImageView imageView4 = (ImageView) C0062b.m298P0(view2, R.id.ivInstagram);
                        if (imageView4 != null) {
                            i10 = R.id.ivMilestone;
                            ImageView imageView5 = (ImageView) C0062b.m298P0(view2, R.id.ivMilestone);
                            if (imageView5 != null) {
                                i10 = R.id.ivMilestoneLanguageFlag;
                                ImageView imageView6 = (ImageView) C0062b.m298P0(view2, R.id.ivMilestoneLanguageFlag);
                                if (imageView6 != null) {
                                    i10 = R.id.ivTwitter;
                                    ImageView imageView7 = (ImageView) C0062b.m298P0(view2, R.id.ivTwitter);
                                    if (imageView7 != null) {
                                        i10 = R.id.tvMessage;
                                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvMessage);
                                        if (textView != null) {
                                            i10 = R.id.tvNotifications;
                                            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvNotifications);
                                            if (textView2 != null) {
                                                FrameLayout frameLayout = (FrameLayout) view2;
                                                i10 = R.id.viewStreakActivityLevel;
                                                StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) C0062b.m298P0(view2, R.id.viewStreakActivityLevel);
                                                if (streakActivityLevelView != null) {
                                                    return new C8315l(imageView, materialCardView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, textView, textView2, frameLayout, streakActivityLevelView);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
