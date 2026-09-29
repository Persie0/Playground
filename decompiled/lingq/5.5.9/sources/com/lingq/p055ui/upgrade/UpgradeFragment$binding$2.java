package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.AppBarLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8252a2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class UpgradeFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8252a2> {

    /* JADX INFO: renamed from: j */
    public static final UpgradeFragment$binding$2 f31987j = new UpgradeFragment$binding$2();

    public UpgradeFragment$binding$2() {
        super(1, C8252a2.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentUpgradeBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8252a2 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) C0062b.m298P0(view2, R.id.appbar);
        if (appBarLayout != null) {
            i10 = R.id.btnClose;
            if (((ImageView) C0062b.m298P0(view2, R.id.btnClose)) != null) {
                i10 = R.id.centerBar;
                if (C0062b.m298P0(view2, R.id.centerBar) != null) {
                    i10 = R.id.centerDivider;
                    if (C0062b.m298P0(view2, R.id.centerDivider) != null) {
                        i10 = R.id.ivBasic;
                        if (((ImageView) C0062b.m298P0(view2, R.id.ivBasic)) != null) {
                            i10 = R.id.ivBeginner;
                            if (((ImageView) C0062b.m298P0(view2, R.id.ivBeginner)) != null) {
                                i10 = R.id.ivProficient;
                                if (((ImageView) C0062b.m298P0(view2, R.id.ivProficient)) != null) {
                                    i10 = R.id.iv_steve;
                                    if (((ImageView) C0062b.m298P0(view2, R.id.iv_steve)) != null) {
                                        i10 = R.id.scrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) C0062b.m298P0(view2, R.id.scrollView);
                                        if (nestedScrollView != null) {
                                            i10 = R.id.space;
                                            if (((Space) C0062b.m298P0(view2, R.id.space)) != null) {
                                                i10 = R.id.tvBasicTitle;
                                                TextView textView = (TextView) C0062b.m298P0(view2, R.id.tvBasicTitle);
                                                if (textView != null) {
                                                    i10 = R.id.tvBeginnerTitle;
                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvBeginnerTitle);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tvCancelGooglePlay;
                                                        if (((TextView) C0062b.m298P0(view2, R.id.tvCancelGooglePlay)) != null) {
                                                            i10 = R.id.tv_compelling_steve;
                                                            if (((TextView) C0062b.m298P0(view2, R.id.tv_compelling_steve)) != null) {
                                                                i10 = R.id.tvGetStartedFree;
                                                                TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvGetStartedFree);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tvLanguages;
                                                                    if (((TextView) C0062b.m298P0(view2, R.id.tvLanguages)) != null) {
                                                                        i10 = R.id.tvLanguagesDesc;
                                                                        if (((TextView) C0062b.m298P0(view2, R.id.tvLanguagesDesc)) != null) {
                                                                            i10 = R.id.tvLessons;
                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvLessons)) != null) {
                                                                                i10 = R.id.tvLessonsDesc;
                                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvLessonsDesc)) != null) {
                                                                                    i10 = R.id.tvPrivacyPolicy;
                                                                                    TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvPrivacyPolicy);
                                                                                    if (textView4 != null) {
                                                                                        i10 = R.id.tvProficientTitle;
                                                                                        TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tvProficientTitle);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.tvRating;
                                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvRating)) != null) {
                                                                                                i10 = R.id.tvRatingStars;
                                                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvRatingStars)) != null) {
                                                                                                    i10 = R.id.tvReviews;
                                                                                                    TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tvReviews);
                                                                                                    if (textView6 != null) {
                                                                                                        i10 = R.id.tv_speak_steve;
                                                                                                        if (((TextView) C0062b.m298P0(view2, R.id.tv_speak_steve)) != null) {
                                                                                                            i10 = R.id.tv_steve;
                                                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tv_steve)) != null) {
                                                                                                                i10 = R.id.tvTermsOfService;
                                                                                                                TextView textView7 = (TextView) C0062b.m298P0(view2, R.id.tvTermsOfService);
                                                                                                                if (textView7 != null) {
                                                                                                                    i10 = R.id.tv_title;
                                                                                                                    TextView textView8 = (TextView) C0062b.m298P0(view2, R.id.tv_title);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i10 = R.id.tv_title_steve;
                                                                                                                        if (((TextView) C0062b.m298P0(view2, R.id.tv_title_steve)) != null) {
                                                                                                                            i10 = R.id.viewAdvantages;
                                                                                                                            if (((LinearLayout) C0062b.m298P0(view2, R.id.viewAdvantages)) != null) {
                                                                                                                                i10 = R.id.viewClose;
                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewClose);
                                                                                                                                if (relativeLayout != null) {
                                                                                                                                    i10 = R.id.viewFeatures;
                                                                                                                                    if (((ConstraintLayout) C0062b.m298P0(view2, R.id.viewFeatures)) != null) {
                                                                                                                                        i10 = R.id.view_offers;
                                                                                                                                        ComposeView composeView = (ComposeView) C0062b.m298P0(view2, R.id.view_offers);
                                                                                                                                        if (composeView != null) {
                                                                                                                                            i10 = R.id.viewProgress;
                                                                                                                                            FrameLayout frameLayout = (FrameLayout) C0062b.m298P0(view2, R.id.viewProgress);
                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                return new C8252a2(appBarLayout, nestedScrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, relativeLayout, composeView, frameLayout);
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
