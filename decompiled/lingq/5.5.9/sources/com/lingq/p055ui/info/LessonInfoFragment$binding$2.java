package com.lingq.p055ui.info;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8328n0;
import ph.C8336o2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class LessonInfoFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8328n0> {

    /* JADX INFO: renamed from: j */
    public static final LessonInfoFragment$binding$2 f26848j = new LessonInfoFragment$binding$2();

    public LessonInfoFragment$binding$2() {
        super(1, C8328n0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentLessonInfoBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8328n0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnAddLessonToPlaylist;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(view2, R.id.btnAddLessonToPlaylist);
        if (materialButton != null) {
            i10 = R.id.btnAddToContinueStudying;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnAddToContinueStudying);
            if (imageButton != null) {
                i10 = R.id.btnCourse;
                LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.btnCourse);
                if (linearLayout != null) {
                    i10 = R.id.btnDownload;
                    ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnDownload);
                    if (imageButton2 != null) {
                        i10 = R.id.btnLike;
                        ImageButton imageButton3 = (ImageButton) C0062b.m298P0(view2, R.id.btnLike);
                        if (imageButton3 != null) {
                            i10 = R.id.btnMoreFromSource;
                            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.btnMoreFromSource);
                            if (linearLayout2 != null) {
                                i10 = R.id.btnOpenLesson;
                                MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(view2, R.id.btnOpenLesson);
                                if (materialButton2 != null) {
                                    i10 = R.id.btnOriginalUrl;
                                    LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.btnOriginalUrl);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.btnShowAll;
                                        TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnShowAll);
                                        if (textView != null) {
                                            i10 = R.id.container;
                                            if (((NestedScrollView) C0062b.m298P0(view2, R.id.container)) != null) {
                                                i10 = R.id.ivClose;
                                                ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivClose);
                                                if (imageView != null) {
                                                    i10 = R.id.ivLesson;
                                                    ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivLesson);
                                                    if (imageView2 != null) {
                                                        i10 = R.id.ivSharedBy;
                                                        ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.ivSharedBy);
                                                        if (imageView3 != null) {
                                                            i10 = R.id.ivSharedByRole;
                                                            ImageView imageView4 = (ImageView) C0062b.m298P0(view2, R.id.ivSharedByRole);
                                                            if (imageView4 != null) {
                                                                i10 = R.id.rvTags;
                                                                RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvTags);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.tvAudio;
                                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tvAudio);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tvCourse;
                                                                        TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvCourse);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tvCourseTitle;
                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvCourseTitle)) != null) {
                                                                                i10 = R.id.tvKnownWords;
                                                                                TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvKnownWords);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.tvKnownWordsTitle;
                                                                                    if (((TextView) C0062b.m298P0(view2, R.id.tvKnownWordsTitle)) != null) {
                                                                                        i10 = R.id.tvLessonDescription;
                                                                                        TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tvLessonDescription);
                                                                                        if (textView5 != null) {
                                                                                            i10 = R.id.tvLessonDescriptionTitle;
                                                                                            TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tvLessonDescriptionTitle);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.tvLessonPreview;
                                                                                                TextView textView7 = (TextView) C0062b.m298P0(view2, R.id.tvLessonPreview);
                                                                                                if (textView7 != null) {
                                                                                                    i10 = R.id.tvLessonPreviewTitle;
                                                                                                    TextView textView8 = (TextView) C0062b.m298P0(view2, R.id.tvLessonPreviewTitle);
                                                                                                    if (textView8 != null) {
                                                                                                        i10 = R.id.tvLessonTitle;
                                                                                                        TextView textView9 = (TextView) C0062b.m298P0(view2, R.id.tvLessonTitle);
                                                                                                        if (textView9 != null) {
                                                                                                            i10 = R.id.tvLevel;
                                                                                                            TextView textView10 = (TextView) C0062b.m298P0(view2, R.id.tvLevel);
                                                                                                            if (textView10 != null) {
                                                                                                                i10 = R.id.tvLikes;
                                                                                                                TextView textView11 = (TextView) C0062b.m298P0(view2, R.id.tvLikes);
                                                                                                                if (textView11 != null) {
                                                                                                                    i10 = R.id.tvLingqs;
                                                                                                                    TextView textView12 = (TextView) C0062b.m298P0(view2, R.id.tvLingqs);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i10 = R.id.tvLingqsTitle;
                                                                                                                        if (((TextView) C0062b.m298P0(view2, R.id.tvLingqsTitle)) != null) {
                                                                                                                            i10 = R.id.tvMoreFromSource;
                                                                                                                            TextView textView13 = (TextView) C0062b.m298P0(view2, R.id.tvMoreFromSource);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i10 = R.id.tvNewWords;
                                                                                                                                if (((TextView) C0062b.m298P0(view2, R.id.tvNewWords)) != null) {
                                                                                                                                    i10 = R.id.tvOriginalUrl;
                                                                                                                                    TextView textView14 = (TextView) C0062b.m298P0(view2, R.id.tvOriginalUrl);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i10 = R.id.tvSharedBy;
                                                                                                                                        TextView textView15 = (TextView) C0062b.m298P0(view2, R.id.tvSharedBy);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i10 = R.id.tvSharedByTitle;
                                                                                                                                            TextView textView16 = (TextView) C0062b.m298P0(view2, R.id.tvSharedByTitle);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i10 = R.id.tvWords;
                                                                                                                                                TextView textView17 = (TextView) C0062b.m298P0(view2, R.id.tvWords);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i10 = R.id.viewBg;
                                                                                                                                                    ImageView imageView5 = (ImageView) C0062b.m298P0(view2, R.id.viewBg);
                                                                                                                                                    if (imageView5 != null) {
                                                                                                                                                        i10 = R.id.viewDownload;
                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewDownload);
                                                                                                                                                        if (relativeLayout != null) {
                                                                                                                                                            i10 = R.id.viewDummy;
                                                                                                                                                            View viewM298P0 = C0062b.m298P0(view2, R.id.viewDummy);
                                                                                                                                                            if (viewM298P0 != null) {
                                                                                                                                                                i10 = R.id.viewLoadingLessonPreview;
                                                                                                                                                                View viewM298P1 = C0062b.m298P0(view2, R.id.viewLoadingLessonPreview);
                                                                                                                                                                if (viewM298P1 != null) {
                                                                                                                                                                    C8336o2 c8336o2 = new C8336o2((LinearLayout) viewM298P1);
                                                                                                                                                                    int i11 = R.id.viewProgress;
                                                                                                                                                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(view2, R.id.viewProgress);
                                                                                                                                                                    if (circularProgressIndicator != null) {
                                                                                                                                                                        i11 = R.id.viewProgressKnownWords;
                                                                                                                                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(view2, R.id.viewProgressKnownWords);
                                                                                                                                                                        if (linearProgressIndicator != null) {
                                                                                                                                                                            i11 = R.id.viewProgressLingqs;
                                                                                                                                                                            LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) C0062b.m298P0(view2, R.id.viewProgressLingqs);
                                                                                                                                                                            if (linearProgressIndicator2 != null) {
                                                                                                                                                                                i11 = R.id.viewProgressNewWords;
                                                                                                                                                                                LinearProgressIndicator linearProgressIndicator3 = (LinearProgressIndicator) C0062b.m298P0(view2, R.id.viewProgressNewWords);
                                                                                                                                                                                if (linearProgressIndicator3 != null) {
                                                                                                                                                                                    return new C8328n0((RelativeLayout) view2, materialButton, imageButton, linearLayout, imageButton2, imageButton3, linearLayout2, materialButton2, linearLayout3, textView, imageView, imageView2, imageView3, imageView4, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, imageView5, relativeLayout, viewM298P0, c8336o2, circularProgressIndicator, linearProgressIndicator, linearProgressIndicator2, linearProgressIndicator3);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    i10 = i11;
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
