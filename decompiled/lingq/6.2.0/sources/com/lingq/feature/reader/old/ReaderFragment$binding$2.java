package com.lingq.feature.reader.old;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.shared.p018ui.components.ReaderPlayerView;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import com.lingq.feature.reader.shared.p018ui.components.StaticLayoutTextView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.cq4;
import p000.d34;
import p000.lfa;
import p000.vi3;
import p000.we3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReaderFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReaderFragment$binding$2 f28232i = new ReaderFragment$binding$2(1, we3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentReaderBinding;", 0);

    /* JADX WARN: Code duplicated, block: B:105:0x0262 A[PHI: r12
      0x0262: PHI (r12v8 int) = (r12v7 int), (r12v9 int), (r12v10 int) binds: [B:25:0x0089, B:27:0x0093, B:29:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0267 A[PHI: r11
      0x0267: PHI (r11v1 int) = (r11v0 int), (r11v2 int), (r11v3 int), (r11v4 int) binds: [B:17:0x005f, B:19:0x0069, B:21:0x0073, B:23:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x026c A[PHI: r0
      0x026c: PHI (r0v1 int) = (r0v0 int), (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int), (r0v10 int) binds: [B:3:0x0011, B:5:0x001b, B:7:0x0025, B:9:0x002f, B:11:0x0039, B:13:0x0043, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str;
        Object obj2;
        View viewM16159c;
        View viewM16159c2;
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnClose;
        ImageView imageView = (ImageView) lfa.m16159c(view, i);
        if (imageView != null) {
            i = R$id.btnCompleteLesson;
            MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
            if (materialButton != null) {
                i = R$id.btnMenu;
                ImageView imageView2 = (ImageView) lfa.m16159c(view, i);
                if (imageView2 != null) {
                    i = R$id.btnTheme;
                    ImageView imageView3 = (ImageView) lfa.m16159c(view, i);
                    if (imageView3 != null) {
                        i = R$id.btnYoutubeClose;
                        ImageView imageView4 = (ImageView) lfa.m16159c(view, i);
                        if (imageView4 != null) {
                            i = R$id.btnYoutubeExpand;
                            ImageView imageView5 = (ImageView) lfa.m16159c(view, i);
                            if (imageView5 != null) {
                                i = R$id.cardView;
                                MaterialCardView materialCardView = (MaterialCardView) lfa.m16159c(view, i);
                                if (materialCardView != null) {
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) lfa.m16159c(view, R$id.fragment_container_token);
                                    int i2 = R$id.fragment_menu;
                                    if (((FragmentContainerView) lfa.m16159c(view, i2)) != null) {
                                        i2 = R$id.fragment_top;
                                        if (((FragmentContainerView) lfa.m16159c(view, i2)) != null) {
                                            i2 = R$id.fragment_upgrade;
                                            if (((FragmentContainerView) lfa.m16159c(view, i2)) == null || (viewM16159c = lfa.m16159c(view, (i2 = R$id.headerContent))) == null) {
                                                str = "Missing required view with ID: ";
                                                obj2 = null;
                                                i = i2;
                                            } else {
                                                cq4 cq4VarM9848a = cq4.m9848a(viewM16159c);
                                                int i3 = R$id.lesson_layout;
                                                RelativeLayout relativeLayout = (RelativeLayout) lfa.m16159c(view, i3);
                                                if (relativeLayout != null) {
                                                    i3 = R$id.lessonPageStatic;
                                                    StaticLayoutTextView staticLayoutTextView = (StaticLayoutTextView) lfa.m16159c(view, i3);
                                                    if (staticLayoutTextView != null && (viewM16159c2 = lfa.m16159c(view, (i3 = R$id.loadingViews))) != null) {
                                                        int i4 = R$id.btnQuitWhileLoading;
                                                        obj2 = null;
                                                        ImageView imageView6 = (ImageView) lfa.m16159c(viewM16159c2, i4);
                                                        if (imageView6 != null) {
                                                            i4 = R$id.tbLoadingBottom;
                                                            if (((RelativeLayout) lfa.m16159c(viewM16159c2, i4)) != null) {
                                                                i4 = R$id.viewHeader;
                                                                if (((LinearLayout) lfa.m16159c(viewM16159c2, i4)) != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) viewM16159c2;
                                                                    d34 d34Var = new d34(linearLayout, imageView6, linearLayout);
                                                                    int i5 = R$id.lpbLessonProgress;
                                                                    ReaderProgressBar readerProgressBar = (ReaderProgressBar) lfa.m16159c(view, i5);
                                                                    if (readerProgressBar != null) {
                                                                        i5 = R$id.pagerLesson;
                                                                        ViewPager2 viewPager2 = (ViewPager2) lfa.m16159c(view, i5);
                                                                        if (viewPager2 != null) {
                                                                            i5 = R$id.progress_view;
                                                                            LinearLayout linearLayout2 = (LinearLayout) lfa.m16159c(view, i5);
                                                                            if (linearLayout2 != null) {
                                                                                i5 = R$id.tbBottom;
                                                                                if (((FrameLayout) lfa.m16159c(view, i5)) != null) {
                                                                                    i5 = R$id.tbIvSimplifyAi;
                                                                                    ImageView imageView7 = (ImageView) lfa.m16159c(view, i5);
                                                                                    if (imageView7 != null) {
                                                                                        i5 = R$id.tbOptions;
                                                                                        if (((LinearLayout) lfa.m16159c(view, i5)) != null) {
                                                                                            i5 = R$id.tbPlay;
                                                                                            ImageView imageView8 = (ImageView) lfa.m16159c(view, i5);
                                                                                            if (imageView8 != null) {
                                                                                                i5 = R$id.tbPlayDownloadProgress;
                                                                                                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i5);
                                                                                                if (circularProgressIndicator != null) {
                                                                                                    i5 = R$id.tbPlayVideo;
                                                                                                    ImageView imageView9 = (ImageView) lfa.m16159c(view, i5);
                                                                                                    if (imageView9 != null) {
                                                                                                        i5 = R$id.tbReview;
                                                                                                        ImageView imageView10 = (ImageView) lfa.m16159c(view, i5);
                                                                                                        if (imageView10 != null) {
                                                                                                            i5 = R$id.tbReviewDesc;
                                                                                                            TextView textView = (TextView) lfa.m16159c(view, i5);
                                                                                                            if (textView != null) {
                                                                                                                i5 = R$id.tbSentence;
                                                                                                                LinearLayout linearLayout3 = (LinearLayout) lfa.m16159c(view, i5);
                                                                                                                if (linearLayout3 != null) {
                                                                                                                    i5 = R$id.tbSentenceModeDesc;
                                                                                                                    TextView textView2 = (TextView) lfa.m16159c(view, i5);
                                                                                                                    if (textView2 != null) {
                                                                                                                        i5 = R$id.tbSentenceModeView;
                                                                                                                        ImageView imageView11 = (ImageView) lfa.m16159c(view, i5);
                                                                                                                        if (imageView11 != null) {
                                                                                                                            i5 = R$id.tbSimplifyAi;
                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) lfa.m16159c(view, i5);
                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                i5 = R$id.tbTvSimplifyAi;
                                                                                                                                TextView textView3 = (TextView) lfa.m16159c(view, i5);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    i5 = R$id.topBar;
                                                                                                                                    if (((LinearLayout) lfa.m16159c(view, i5)) != null) {
                                                                                                                                        i5 = R$id.viewBuyLessonDialog;
                                                                                                                                        ComposeView composeView = (ComposeView) lfa.m16159c(view, i5);
                                                                                                                                        if (composeView != null) {
                                                                                                                                            i5 = R$id.viewCompleteLessonLoading;
                                                                                                                                            FrameLayout frameLayout = (FrameLayout) lfa.m16159c(view, i5);
                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                i5 = R$id.viewLippPopup;
                                                                                                                                                ComposeView composeView2 = (ComposeView) lfa.m16159c(view, i5);
                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                    i5 = R$id.viewParent;
                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) lfa.m16159c(view, i5);
                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                        i5 = R$id.viewPlay;
                                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) lfa.m16159c(view, i5);
                                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                                            i5 = R$id.viewPlayer;
                                                                                                                                                            ReaderPlayerView readerPlayerView = (ReaderPlayerView) lfa.m16159c(view, i5);
                                                                                                                                                            if (readerPlayerView != null) {
                                                                                                                                                                i5 = R$id.viewPromotedCourse;
                                                                                                                                                                ComposeView composeView3 = (ComposeView) lfa.m16159c(view, i5);
                                                                                                                                                                if (composeView3 != null) {
                                                                                                                                                                    i5 = R$id.viewReview;
                                                                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) lfa.m16159c(view, i5);
                                                                                                                                                                    if (linearLayout6 != null) {
                                                                                                                                                                        i5 = R$id.viewSentenceAndSimplify;
                                                                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) lfa.m16159c(view, i5);
                                                                                                                                                                        if (linearLayout7 != null) {
                                                                                                                                                                            i5 = R$id.viewStreakChallengeDialog;
                                                                                                                                                                            ComposeView composeView4 = (ComposeView) lfa.m16159c(view, i5);
                                                                                                                                                                            if (composeView4 != null) {
                                                                                                                                                                                i5 = R$id.viewThemeSettings;
                                                                                                                                                                                ComposeView composeView5 = (ComposeView) lfa.m16159c(view, i5);
                                                                                                                                                                                if (composeView5 != null) {
                                                                                                                                                                                    i5 = R$id.viewTopBar;
                                                                                                                                                                                    FrameLayout frameLayout3 = (FrameLayout) lfa.m16159c(view, i5);
                                                                                                                                                                                    if (frameLayout3 != null) {
                                                                                                                                                                                        i5 = R$id.viewWordSplitDialog;
                                                                                                                                                                                        if (((ComposeView) lfa.m16159c(view, i5)) != null) {
                                                                                                                                                                                            i5 = R$id.viewYoutubePlayer;
                                                                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) lfa.m16159c(view, i5);
                                                                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                                                                i5 = R$id.youtube_player_view;
                                                                                                                                                                                                YouTubePlayerView youTubePlayerView = (YouTubePlayerView) lfa.m16159c(view, i5);
                                                                                                                                                                                                if (youTubePlayerView != null) {
                                                                                                                                                                                                    return new we3(view, imageView, materialButton, imageView2, imageView3, imageView4, imageView5, materialCardView, fragmentContainerView, cq4VarM9848a, relativeLayout, staticLayoutTextView, d34Var, readerProgressBar, viewPager2, linearLayout2, imageView7, imageView8, circularProgressIndicator, imageView9, imageView10, textView, linearLayout3, textView2, imageView11, linearLayout4, textView3, composeView, frameLayout, composeView2, frameLayout2, linearLayout5, readerPlayerView, composeView3, linearLayout6, linearLayout7, composeView4, composeView5, frameLayout3, relativeLayout2, youTubePlayerView);
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
                                                                    i = i5;
                                                                    str = "Missing required view with ID: ";
                                                                }
                                                            }
                                                        }
                                                        C3386nv.m17635v("Missing required view with ID: ".concat(viewM16159c2.getResources().getResourceName(i4)));
                                                        return null;
                                                    }
                                                    str = "Missing required view with ID: ";
                                                    obj2 = null;
                                                    i = i3;
                                                } else {
                                                    str = "Missing required view with ID: ";
                                                    obj2 = null;
                                                    i = i3;
                                                }
                                            }
                                        } else {
                                            str = "Missing required view with ID: ";
                                            obj2 = null;
                                            i = i2;
                                        }
                                    } else {
                                        str = "Missing required view with ID: ";
                                        obj2 = null;
                                        i = i2;
                                    }
                                } else {
                                    str = "Missing required view with ID: ";
                                    obj2 = null;
                                }
                            } else {
                                str = "Missing required view with ID: ";
                                obj2 = null;
                            }
                        } else {
                            str = "Missing required view with ID: ";
                            obj2 = null;
                        }
                    } else {
                        str = "Missing required view with ID: ";
                        obj2 = null;
                    }
                } else {
                    str = "Missing required view with ID: ";
                    obj2 = null;
                }
            } else {
                str = "Missing required view with ID: ";
                obj2 = null;
            }
        } else {
            str = "Missing required view with ID: ";
            obj2 = null;
        }
        C3386nv.m17635v(str.concat(view.getResources().getResourceName(i)));
        return obj2;
    }
}
