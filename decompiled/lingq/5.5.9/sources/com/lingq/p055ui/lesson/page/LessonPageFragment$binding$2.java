package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8286g0;
import ph.C8347q2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonPageFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8286g0> {

    /* JADX INFO: renamed from: j */
    public static final LessonPageFragment$binding$2 f28350j = new LessonPageFragment$binding$2();

    public LessonPageFragment$binding$2() {
        super(1, C8286g0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonContentPageBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8286g0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnCompleteLesson;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnCompleteLesson);
        if (materialButton != null) {
            i10 = R.id.btn_sentence_notes;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.btn_sentence_notes);
            if (textView != null) {
                i10 = R.id.btn_translate_sentence;
                TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btn_translate_sentence);
                if (textView2 != null) {
                    i10 = R.id.ivPlaybackSpeed;
                    ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.ivPlaybackSpeed);
                    if (imageButton != null) {
                        i10 = R.id.iv_tts_sentence;
                        ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.iv_tts_sentence);
                        if (imageButton2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view2;
                            i10 = R.id.parentScroller;
                            NestedScrollView nestedScrollView = (NestedScrollView) C0062b.m298P0(view2, R.id.parentScroller);
                            if (nestedScrollView != null) {
                                i10 = R.id.phrases_container;
                                LessonTextView lessonTextView = (LessonTextView) C0062b.m298P0(view2, R.id.phrases_container);
                                if (lessonTextView != null) {
                                    i10 = R.id.phrases_container_sentence;
                                    LessonTextView lessonTextView2 = (LessonTextView) C0062b.m298P0(view2, R.id.phrases_container_sentence);
                                    if (lessonTextView2 != null) {
                                        i10 = R.id.related_container;
                                        LessonTextView lessonTextView3 = (LessonTextView) C0062b.m298P0(view2, R.id.related_container);
                                        if (lessonTextView3 != null) {
                                            i10 = R.id.related_container_sentence;
                                            LessonTextView lessonTextView4 = (LessonTextView) C0062b.m298P0(view2, R.id.related_container_sentence);
                                            if (lessonTextView4 != null) {
                                                i10 = R.id.text_container;
                                                LessonTextView lessonTextView5 = (LessonTextView) C0062b.m298P0(view2, R.id.text_container);
                                                if (lessonTextView5 != null) {
                                                    i10 = R.id.text_container_sentence;
                                                    LessonTextView lessonTextView6 = (LessonTextView) C0062b.m298P0(view2, R.id.text_container_sentence);
                                                    if (lessonTextView6 != null) {
                                                        i10 = R.id.tv_notes;
                                                        TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tv_notes);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_translate_sentence;
                                                            TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tv_translate_sentence);
                                                            if (textView4 != null) {
                                                                i10 = R.id.viewComposeVocabulary;
                                                                ComposeView composeView = (ComposeView) C0062b.m298P0(view2, R.id.viewComposeVocabulary);
                                                                if (composeView != null) {
                                                                    i10 = R.id.viewHeader;
                                                                    View viewM298P0 = C0062b.m298P0(view2, R.id.viewHeader);
                                                                    if (viewM298P0 != null) {
                                                                        C8347q2 c8347q2M16410a = C8347q2.m16410a(viewM298P0);
                                                                        i10 = R.id.view_inner;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C0062b.m298P0(view2, R.id.view_inner);
                                                                        if (relativeLayout2 != null) {
                                                                            i10 = R.id.view_inner_sentence;
                                                                            if (((RelativeLayout) C0062b.m298P0(view2, R.id.view_inner_sentence)) != null) {
                                                                                i10 = R.id.view_sentence_mode;
                                                                                NestedScrollView nestedScrollView2 = (NestedScrollView) C0062b.m298P0(view2, R.id.view_sentence_mode);
                                                                                if (nestedScrollView2 != null) {
                                                                                    i10 = R.id.viewTtsSentence;
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) C0062b.m298P0(view2, R.id.viewTtsSentence);
                                                                                    if (constraintLayout != null) {
                                                                                        return new C8286g0(materialButton, textView, textView2, imageButton, imageButton2, relativeLayout, nestedScrollView, lessonTextView, lessonTextView2, lessonTextView3, lessonTextView4, lessonTextView5, lessonTextView6, textView3, textView4, composeView, c8347q2M16410a, relativeLayout2, nestedScrollView2, constraintLayout);
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
