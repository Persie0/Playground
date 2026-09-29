package com.lingq.feature.reader.old;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C3386nv;
import p000.cq4;
import p000.lfa;
import p000.vi3;
import p000.ye3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ReaderPageFragment$binding$2 extends FunctionReferenceImpl implements vi3 {

    /* JADX INFO: renamed from: i */
    public static final ReaderPageFragment$binding$2 f28453i = new ReaderPageFragment$binding$2(1, ye3.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/feature/reader/databinding/FragmentReaderPageBinding;", 0);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        View viewM16159c;
        View view = (View) obj;
        view.getClass();
        int i = R$id.btnCompleteLesson;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(view, i);
        if (materialButton != null) {
            i = R$id.btn_refresh_translate_sentence;
            ImageView imageView = (ImageView) lfa.m16159c(view, i);
            if (imageView != null) {
                i = R$id.btn_sentence_notes;
                TextView textView = (TextView) lfa.m16159c(view, i);
                if (textView != null) {
                    i = R$id.btn_translate_sentence;
                    TextView textView2 = (TextView) lfa.m16159c(view, i);
                    if (textView2 != null) {
                        i = R$id.indicator_sentence_tts;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) lfa.m16159c(view, i);
                        if (circularProgressIndicator != null) {
                            i = R$id.ivPlaybackSpeed;
                            ImageButton imageButton = (ImageButton) lfa.m16159c(view, i);
                            if (imageButton != null) {
                                i = R$id.iv_tts_sentence;
                                ImageButton imageButton2 = (ImageButton) lfa.m16159c(view, i);
                                if (imageButton2 != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view;
                                    i = R$id.ll_translate_sentence;
                                    if (((LinearLayout) lfa.m16159c(view, i)) != null) {
                                        i = R$id.parentScroller;
                                        NestedScrollView nestedScrollView = (NestedScrollView) lfa.m16159c(view, i);
                                        if (nestedScrollView != null) {
                                            i = R$id.text_container;
                                            LessonTextView lessonTextView = (LessonTextView) lfa.m16159c(view, i);
                                            if (lessonTextView != null) {
                                                i = R$id.text_container_sentence;
                                                LessonTextView lessonTextView2 = (LessonTextView) lfa.m16159c(view, i);
                                                if (lessonTextView2 != null) {
                                                    i = R$id.tv_notes;
                                                    TextView textView3 = (TextView) lfa.m16159c(view, i);
                                                    if (textView3 != null) {
                                                        i = R$id.tv_translate_sentence;
                                                        TextView textView4 = (TextView) lfa.m16159c(view, i);
                                                        if (textView4 != null) {
                                                            i = R$id.viewComposeVocabulary;
                                                            ComposeView composeView = (ComposeView) lfa.m16159c(view, i);
                                                            if (composeView != null && (viewM16159c = lfa.m16159c(view, (i = R$id.viewHeader))) != null) {
                                                                cq4 cq4VarM9848a = cq4.m9848a(viewM16159c);
                                                                i = R$id.view_inner;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) lfa.m16159c(view, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = R$id.view_inner_sentence;
                                                                    if (((RelativeLayout) lfa.m16159c(view, i)) != null) {
                                                                        i = R$id.view_sentence_mode;
                                                                        NestedScrollView nestedScrollView2 = (NestedScrollView) lfa.m16159c(view, i);
                                                                        if (nestedScrollView2 != null) {
                                                                            i = R$id.viewTtsSentence;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) lfa.m16159c(view, i);
                                                                            if (constraintLayout != null) {
                                                                                return new ye3(materialButton, imageView, textView, textView2, circularProgressIndicator, imageButton, imageButton2, relativeLayout, nestedScrollView, lessonTextView, lessonTextView2, textView3, textView4, composeView, cq4VarM9848a, relativeLayout2, nestedScrollView2, constraintLayout);
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
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
