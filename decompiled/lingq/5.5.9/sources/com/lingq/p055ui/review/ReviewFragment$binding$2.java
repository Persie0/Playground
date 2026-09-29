package com.lingq.p055ui.review;

import ae.C0062b;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.p055ui.lesson.LessonProgressBar;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8335o1;
import ph.C8342p2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ReviewFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8335o1> {

    /* JADX INFO: renamed from: j */
    public static final ReviewFragment$binding$2 f29437j = new ReviewFragment$binding$2();

    public ReviewFragment$binding$2() {
        super(1, C8335o1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentReviewBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8335o1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.btnClose);
        if (imageView != null) {
            i10 = R.id.btnSettings;
            ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.btnSettings);
            if (imageView2 != null) {
                i10 = R.id.cardView;
                MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.cardView);
                if (materialCardView != null) {
                    i10 = R.id.fragment_container_token;
                    if (((FragmentContainerView) C0062b.m298P0(view2, R.id.fragment_container_token)) != null) {
                        i10 = R.id.lpbReviewProgress;
                        LessonProgressBar lessonProgressBar = (LessonProgressBar) C0062b.m298P0(view2, R.id.lpbReviewProgress);
                        if (lessonProgressBar != null) {
                            i10 = R.id.nav_host_fragment_review;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) C0062b.m298P0(view2, R.id.nav_host_fragment_review);
                            if (fragmentContainerView != null) {
                                i10 = R.id.progress_view;
                                if (((LinearLayout) C0062b.m298P0(view2, R.id.progress_view)) != null) {
                                    i10 = R.id.view_bottom;
                                    View viewM298P0 = C0062b.m298P0(view2, R.id.view_bottom);
                                    if (viewM298P0 != null) {
                                        int i11 = R.id.btnContinue;
                                        Button button = (Button) C0062b.m298P0(viewM298P0, R.id.btnContinue);
                                        if (button != null) {
                                            i11 = R.id.btn_correct;
                                            Button button2 = (Button) C0062b.m298P0(viewM298P0, R.id.btn_correct);
                                            if (button2 != null) {
                                                i11 = R.id.btn_incorrect;
                                                Button button3 = (Button) C0062b.m298P0(viewM298P0, R.id.btn_incorrect);
                                                if (button3 != null) {
                                                    i11 = R.id.btnReturnToLesson;
                                                    Button button4 = (Button) C0062b.m298P0(viewM298P0, R.id.btnReturnToLesson);
                                                    if (button4 != null) {
                                                        i11 = R.id.btnReviewAgain;
                                                        Button button5 = (Button) C0062b.m298P0(viewM298P0, R.id.btnReviewAgain);
                                                        if (button5 != null) {
                                                            i11 = R.id.btnSubmit;
                                                            Button button6 = (Button) C0062b.m298P0(viewM298P0, R.id.btnSubmit);
                                                            if (button6 != null) {
                                                                i11 = R.id.tvDoNotKnow;
                                                                TextView textView = (TextView) C0062b.m298P0(viewM298P0, R.id.tvDoNotKnow);
                                                                if (textView != null) {
                                                                    i11 = R.id.tv_flip;
                                                                    Button button7 = (Button) C0062b.m298P0(viewM298P0, R.id.tv_flip);
                                                                    if (button7 != null) {
                                                                        i11 = R.id.viewCorrectIncorrect;
                                                                        if (((LinearLayout) C0062b.m298P0(viewM298P0, R.id.viewCorrectIncorrect)) != null) {
                                                                            i11 = R.id.view_flip_card;
                                                                            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM298P0, R.id.view_flip_card);
                                                                            if (linearLayout != null) {
                                                                                i11 = R.id.view_session_complete;
                                                                                LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewM298P0, R.id.view_session_complete);
                                                                                if (linearLayout2 != null) {
                                                                                    C8342p2 c8342p2 = new C8342p2((LinearLayout) viewM298P0, button, button2, button3, button4, button5, button6, textView, button7, linearLayout, linearLayout2);
                                                                                    i10 = R.id.viewSuccess;
                                                                                    ComposeView composeView = (ComposeView) C0062b.m298P0(view2, R.id.viewSuccess);
                                                                                    if (composeView != null) {
                                                                                        i10 = R.id.viewToolbar;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.viewToolbar);
                                                                                        if (linearLayout3 != null) {
                                                                                            i10 = R.id.viewUnscrambleFix;
                                                                                            ComposeView composeView2 = (ComposeView) C0062b.m298P0(view2, R.id.viewUnscrambleFix);
                                                                                            if (composeView2 != null) {
                                                                                                return new C8335o1(imageView, imageView2, materialCardView, lessonProgressBar, fragmentContainerView, c8342p2, composeView, linearLayout3, composeView2);
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
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewM298P0.getResources().getResourceName(i11)));
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
