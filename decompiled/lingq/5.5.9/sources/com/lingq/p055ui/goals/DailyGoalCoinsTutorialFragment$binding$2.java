package com.lingq.p055ui.goals;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8321m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class DailyGoalCoinsTutorialFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8321m> {

    /* JADX INFO: renamed from: j */
    public static final DailyGoalCoinsTutorialFragment$binding$2 f22494j = new DailyGoalCoinsTutorialFragment$binding$2();

    public DailyGoalCoinsTutorialFragment$binding$2() {
        super(1, C8321m.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentDailyGoalCoinsTutorialBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8321m mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnClose);
        if (imageButton != null) {
            i10 = R.id.btnContinue;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnContinue);
            if (materialButton != null) {
                i10 = R.id.ivArrow1;
                if (((ImageView) C0062b.m298P0(view2, R.id.ivArrow1)) != null) {
                    i10 = R.id.ivArrow2;
                    if (((ImageView) C0062b.m298P0(view2, R.id.ivArrow2)) != null) {
                        i10 = R.id.ivArrow3;
                        if (((ImageView) C0062b.m298P0(view2, R.id.ivArrow3)) != null) {
                            i10 = R.id.ivArrow4;
                            if (((ImageView) C0062b.m298P0(view2, R.id.ivArrow4)) != null) {
                                i10 = R.id.ivArrow5;
                                if (((ImageView) C0062b.m298P0(view2, R.id.ivArrow5)) != null) {
                                    i10 = R.id.tvMessage;
                                    TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvMessage);
                                    if (textView != null) {
                                        i10 = R.id.tvNote;
                                        if (((TextView) C0062b.m298P0(view2, R.id.tvNote)) != null) {
                                            i10 = R.id.tvTitle;
                                            if (((TextView) C0062b.m298P0(view2, R.id.tvTitle)) != null) {
                                                i10 = R.id.tvTitle1;
                                                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle1)) != null) {
                                                    i10 = R.id.tvTitle2;
                                                    if (((TextView) C0062b.m298P0(view2, R.id.tvTitle2)) != null) {
                                                        i10 = R.id.tvTitle3;
                                                        if (((TextView) C0062b.m298P0(view2, R.id.tvTitle3)) != null) {
                                                            i10 = R.id.tvTitle4;
                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvTitle4)) != null) {
                                                                i10 = R.id.tvTitle5;
                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvTitle5)) != null) {
                                                                    i10 = R.id.viewList;
                                                                    if (((ConstraintLayout) C0062b.m298P0(view2, R.id.viewList)) != null) {
                                                                        i10 = R.id.viewStreakActivityLevel;
                                                                        StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) C0062b.m298P0(view2, R.id.viewStreakActivityLevel);
                                                                        if (streakActivityLevelView != null) {
                                                                            return new C8321m(imageButton, materialButton, textView, streakActivityLevelView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
