package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.lesson.data.StaticLayoutTextView;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8274e0;
import ph.C8324m2;
import ph.C8347q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8274e0> {

    /* JADX INFO: renamed from: j */
    public static final LessonFragment$binding$2 f27070j = new LessonFragment$binding$2();

    public LessonFragment$binding$2() {
        super(1, C8274e0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8274e0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.btnClose);
        if (imageView != null) {
            i10 = R.id.btnCompleteLesson;
            MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnCompleteLesson);
            if (materialButton != null) {
                i10 = R.id.btnMenu;
                ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.btnMenu);
                if (imageView2 != null) {
                    i10 = R.id.btnYoutubeClose;
                    ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.btnYoutubeClose);
                    if (imageView3 != null) {
                        i10 = R.id.btnYoutubeExpand;
                        ImageView imageView4 = (ImageView) C0062b.m298P0(view2, R.id.btnYoutubeExpand);
                        if (imageView4 != null) {
                            i10 = R.id.cardView;
                            MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.cardView);
                            if (materialCardView != null) {
                                i10 = R.id.fragment_menu;
                                if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_menu)) != null) {
                                    i10 = R.id.fragment_top;
                                    if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_top)) != null) {
                                        i10 = R.id.fragment_upgrade;
                                        if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_upgrade)) != null) {
                                            i10 = R.id.headerContent;
                                            View viewM298P0 = C0062b.m298P0(view2, R.id.headerContent);
                                            if (viewM298P0 != null) {
                                                C8347q2 c8347q2M16410a = C8347q2.m16410a(viewM298P0);
                                                i10 = R.id.lesson_layout;
                                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.lesson_layout);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.lessonPageStatic;
                                                    StaticLayoutTextView staticLayoutTextView = (StaticLayoutTextView) C0062b.m298P0(view2, R.id.lessonPageStatic);
                                                    if (staticLayoutTextView != null) {
                                                        i10 = R.id.loadingViews;
                                                        View viewM298P1 = C0062b.m298P0(view2, R.id.loadingViews);
                                                        if (viewM298P1 != null) {
                                                            int i11 = R.id.btnQuitWhileLoading;
                                                            ImageView imageView5 = (ImageView) C0062b.m298P0(viewM298P1, R.id.btnQuitWhileLoading);
                                                            if (imageView5 != null) {
                                                                i11 = R.id.tbLoadingBottom;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) C0062b.m298P0(viewM298P1, R.id.tbLoadingBottom);
                                                                if (relativeLayout2 != null) {
                                                                    i11 = R.id.viewHeader;
                                                                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM298P1, R.id.viewHeader);
                                                                    if (linearLayout != null) {
                                                                        LinearLayout linearLayout2 = (LinearLayout) viewM298P1;
                                                                        C8324m2 c8324m2 = new C8324m2(linearLayout2, imageView5, relativeLayout2, linearLayout, linearLayout2);
                                                                        i10 = R.id.lpbLessonProgress;
                                                                        LessonProgressBar lessonProgressBar = (LessonProgressBar) C0062b.m298P0(view2, R.id.lpbLessonProgress);
                                                                        if (lessonProgressBar != null) {
                                                                            i10 = R.id.pagerLesson;
                                                                            ViewPager2 viewPager2 = (ViewPager2) C0062b.m298P0(view2, R.id.pagerLesson);
                                                                            if (viewPager2 != null) {
                                                                                i10 = R.id.progress_view;
                                                                                LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.progress_view);
                                                                                if (linearLayout3 != null) {
                                                                                    i10 = R.id.tbBottom;
                                                                                    if (((FrameLayout) C0062b.m298P0(view2, R.id.tbBottom)) != null) {
                                                                                        i10 = R.id.tbOptions;
                                                                                        if (((RelativeLayout) C0062b.m298P0(view2, R.id.tbOptions)) != null) {
                                                                                            i10 = R.id.tbPlay;
                                                                                            ImageView imageView6 = (ImageView) C0062b.m298P0(view2, R.id.tbPlay);
                                                                                            if (imageView6 != null) {
                                                                                                i10 = R.id.tbPlayDownloadProgress;
                                                                                                TextView textView = (TextView) C0062b.m298P0(view2, R.id.tbPlayDownloadProgress);
                                                                                                if (textView != null) {
                                                                                                    i10 = R.id.tbPlayVideo;
                                                                                                    ImageView imageView7 = (ImageView) C0062b.m298P0(view2, R.id.tbPlayVideo);
                                                                                                    if (imageView7 != null) {
                                                                                                        i10 = R.id.tbReview;
                                                                                                        ImageView imageView8 = (ImageView) C0062b.m298P0(view2, R.id.tbReview);
                                                                                                        if (imageView8 != null) {
                                                                                                            i10 = R.id.tbReviewDesc;
                                                                                                            TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tbReviewDesc);
                                                                                                            if (textView2 != null) {
                                                                                                                i10 = R.id.tbSentence;
                                                                                                                FrameLayout frameLayout = (FrameLayout) C0062b.m298P0(view2, R.id.tbSentence);
                                                                                                                if (frameLayout != null) {
                                                                                                                    i10 = R.id.tbSentenceModeDesc;
                                                                                                                    TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tbSentenceModeDesc);
                                                                                                                    if (textView3 != null) {
                                                                                                                        i10 = R.id.tbSentenceModeView;
                                                                                                                        ImageView imageView9 = (ImageView) C0062b.m298P0(view2, R.id.tbSentenceModeView);
                                                                                                                        if (imageView9 != null) {
                                                                                                                            i10 = R.id.topBar;
                                                                                                                            if (((LinearLayout) C0062b.m298P0(view2, R.id.topBar)) != null) {
                                                                                                                                i10 = R.id.viewPlay;
                                                                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) C0062b.m298P0(view2, R.id.viewPlay);
                                                                                                                                if (relativeLayout3 != null) {
                                                                                                                                    i10 = R.id.viewPlayer;
                                                                                                                                    LessonPlayerView lessonPlayerView = (LessonPlayerView) C0062b.m298P0(view2, R.id.viewPlayer);
                                                                                                                                    if (lessonPlayerView != null) {
                                                                                                                                        i10 = R.id.viewReview;
                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(view2, R.id.viewReview);
                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                            i10 = R.id.viewTopBar;
                                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) C0062b.m298P0(view2, R.id.viewTopBar);
                                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                                i10 = R.id.viewYoutubePlayer;
                                                                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) C0062b.m298P0(view2, R.id.viewYoutubePlayer);
                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                    i10 = R.id.youtube_player_view;
                                                                                                                                                    YouTubePlayerView youTubePlayerView = (YouTubePlayerView) C0062b.m298P0(view2, R.id.youtube_player_view);
                                                                                                                                                    if (youTubePlayerView != null) {
                                                                                                                                                        return new C8274e0(imageView, materialButton, imageView2, imageView3, imageView4, materialCardView, c8347q2M16410a, relativeLayout, staticLayoutTextView, c8324m2, lessonProgressBar, viewPager2, linearLayout3, imageView6, textView, imageView7, imageView8, textView2, frameLayout, textView3, imageView9, relativeLayout3, lessonPlayerView, linearLayout4, frameLayout2, relativeLayout4, youTubePlayerView);
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
                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewM298P1.getResources().getResourceName(i11)));
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
