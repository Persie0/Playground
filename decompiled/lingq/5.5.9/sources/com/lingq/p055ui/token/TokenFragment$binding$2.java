package com.lingq.p055ui.token;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8336o2;
import ph.C8371v1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class TokenFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8371v1> {

    /* JADX INFO: renamed from: j */
    public static final TokenFragment$binding$2 f31222j = new TokenFragment$binding$2();

    public TokenFragment$binding$2() {
        super(1, C8371v1.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentTokenBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8371v1 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btnClose;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btnClose);
        if (imageButton != null) {
            i10 = R.id.btnDictionariesManage;
            TextView textView = (TextView) C0062b.m298P0(view2, R.id.btnDictionariesManage);
            if (textView != null) {
                i10 = R.id.btnHintBottom;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btnHintBottom);
                if (imageButton2 != null) {
                    i10 = R.id.btnHintBottomAdd;
                    ImageButton imageButton3 = (ImageButton) C0062b.m298P0(view2, R.id.btnHintBottomAdd);
                    if (imageButton3 != null) {
                        i10 = R.id.btnHintTop;
                        ImageButton imageButton4 = (ImageButton) C0062b.m298P0(view2, R.id.btnHintTop);
                        if (imageButton4 != null) {
                            i10 = R.id.btnHintTopAdd;
                            ImageButton imageButton5 = (ImageButton) C0062b.m298P0(view2, R.id.btnHintTopAdd);
                            if (imageButton5 != null) {
                                i10 = R.id.btnStatusWithImage;
                                ImageButton imageButton6 = (ImageButton) C0062b.m298P0(view2, R.id.btnStatusWithImage);
                                if (imageButton6 != null) {
                                    i10 = R.id.btnStatusWithText;
                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.btnStatusWithText);
                                    if (textView2 != null) {
                                        i10 = R.id.btnStatusWordIgnore;
                                        ImageButton imageButton7 = (ImageButton) C0062b.m298P0(view2, R.id.btnStatusWordIgnore);
                                        if (imageButton7 != null) {
                                            i10 = R.id.btnStatusWordKnown;
                                            ImageButton imageButton8 = (ImageButton) C0062b.m298P0(view2, R.id.btnStatusWordKnown);
                                            if (imageButton8 != null) {
                                                i10 = R.id.btnTts;
                                                ImageButton imageButton9 = (ImageButton) C0062b.m298P0(view2, R.id.btnTts);
                                                if (imageButton9 != null) {
                                                    i10 = R.id.cardView;
                                                    MaterialCardView materialCardView = (MaterialCardView) C0062b.m298P0(view2, R.id.cardView);
                                                    if (materialCardView != null) {
                                                        i10 = R.id.etMeaning;
                                                        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(view2, R.id.etMeaning);
                                                        if (textInputEditText != null) {
                                                            i10 = R.id.etNotes;
                                                            AppCompatEditText appCompatEditText = (AppCompatEditText) C0062b.m298P0(view2, R.id.etNotes);
                                                            if (appCompatEditText != null) {
                                                                i10 = R.id.ivHintBottomLocale;
                                                                ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.ivHintBottomLocale);
                                                                if (imageView != null) {
                                                                    i10 = R.id.ivHintTopLocale;
                                                                    ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.ivHintTopLocale);
                                                                    if (imageView2 != null) {
                                                                        TokenMotionLayout tokenMotionLayout = (TokenMotionLayout) view2;
                                                                        i10 = R.id.rvDictionaries;
                                                                        RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvDictionaries);
                                                                        if (recyclerView != null) {
                                                                            i10 = R.id.rvDictionariesSmall;
                                                                            RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(view2, R.id.rvDictionariesSmall);
                                                                            if (recyclerView2 != null) {
                                                                                i10 = R.id.rvPopularMeanings;
                                                                                RecyclerView recyclerView3 = (RecyclerView) C0062b.m298P0(view2, R.id.rvPopularMeanings);
                                                                                if (recyclerView3 != null) {
                                                                                    i10 = R.id.rvRelatedPhrases;
                                                                                    RecyclerView recyclerView4 = (RecyclerView) C0062b.m298P0(view2, R.id.rvRelatedPhrases);
                                                                                    if (recyclerView4 != null) {
                                                                                        i10 = R.id.rvSavedMeanings;
                                                                                        RecyclerView recyclerView5 = (RecyclerView) C0062b.m298P0(view2, R.id.rvSavedMeanings);
                                                                                        if (recyclerView5 != null) {
                                                                                            i10 = R.id.rvTags;
                                                                                            RecyclerView recyclerView6 = (RecyclerView) C0062b.m298P0(view2, R.id.rvTags);
                                                                                            if (recyclerView6 != null) {
                                                                                                i10 = R.id.spinner_content;
                                                                                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(view2, R.id.spinner_content);
                                                                                                if (appCompatSpinner != null) {
                                                                                                    i10 = R.id.spinnerLayout;
                                                                                                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.spinnerLayout);
                                                                                                    if (linearLayout != null) {
                                                                                                        i10 = R.id.tlMeaning;
                                                                                                        TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(view2, R.id.tlMeaning);
                                                                                                        if (textInputLayout != null) {
                                                                                                            i10 = R.id.topSeparator;
                                                                                                            if (C0062b.m298P0(view2, R.id.topSeparator) != null) {
                                                                                                                i10 = R.id.tvCancel;
                                                                                                                TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvCancel);
                                                                                                                if (textView3 != null) {
                                                                                                                    i10 = R.id.tvCoins;
                                                                                                                    TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvCoins);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i10 = R.id.tvCoinsSeparator;
                                                                                                                        TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tvCoinsSeparator);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i10 = R.id.tvDictionaries;
                                                                                                                            if (((TextView) C0062b.m298P0(view2, R.id.tvDictionaries)) != null) {
                                                                                                                                i10 = R.id.tvDictionariesAndMeanings;
                                                                                                                                TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tvDictionariesAndMeanings);
                                                                                                                                if (textView6 != null) {
                                                                                                                                    i10 = R.id.tvHintBottom;
                                                                                                                                    TextView textView7 = (TextView) C0062b.m298P0(view2, R.id.tvHintBottom);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        i10 = R.id.tvHintTop;
                                                                                                                                        TextView textView8 = (TextView) C0062b.m298P0(view2, R.id.tvHintTop);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            i10 = R.id.tvPopularMeanings;
                                                                                                                                            if (((RelativeLayout) C0062b.m298P0(view2, R.id.tvPopularMeanings)) != null) {
                                                                                                                                                i10 = R.id.tvPopularMeaningsEmpty;
                                                                                                                                                TextView textView9 = (TextView) C0062b.m298P0(view2, R.id.tvPopularMeaningsEmpty);
                                                                                                                                                if (textView9 != null) {
                                                                                                                                                    i10 = R.id.tvRelatedPhrasesEmpty;
                                                                                                                                                    TextView textView10 = (TextView) C0062b.m298P0(view2, R.id.tvRelatedPhrasesEmpty);
                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                        i10 = R.id.tvRelatedPhrasesTitle;
                                                                                                                                                        TextView textView11 = (TextView) C0062b.m298P0(view2, R.id.tvRelatedPhrasesTitle);
                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                            i10 = R.id.tvSavedMeaningsLabel;
                                                                                                                                                            TextView textView12 = (TextView) C0062b.m298P0(view2, R.id.tvSavedMeaningsLabel);
                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                i10 = R.id.tvTerm;
                                                                                                                                                                TextView textView13 = (TextView) C0062b.m298P0(view2, R.id.tvTerm);
                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                    i10 = R.id.tvTermAlt;
                                                                                                                                                                    TextView textView14 = (TextView) C0062b.m298P0(view2, R.id.tvTermAlt);
                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                        i10 = R.id.tvTranslationLoading;
                                                                                                                                                                        TextView textView15 = (TextView) C0062b.m298P0(view2, R.id.tvTranslationLoading);
                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                            i10 = R.id.viewBottom;
                                                                                                                                                                            if (((LinearLayout) C0062b.m298P0(view2, R.id.viewBottom)) != null) {
                                                                                                                                                                                i10 = R.id.viewCoinsTags;
                                                                                                                                                                                LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.viewCoinsTags);
                                                                                                                                                                                if (linearLayout2 != null) {
                                                                                                                                                                                    i10 = R.id.viewDictionariesAndMeanings;
                                                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.viewDictionariesAndMeanings);
                                                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                                                        i10 = R.id.view_drag;
                                                                                                                                                                                        View viewM298P0 = C0062b.m298P0(view2, R.id.view_drag);
                                                                                                                                                                                        if (viewM298P0 != null) {
                                                                                                                                                                                            i10 = R.id.viewExpanded;
                                                                                                                                                                                            NestedScrollView nestedScrollView = (NestedScrollView) C0062b.m298P0(view2, R.id.viewExpanded);
                                                                                                                                                                                            if (nestedScrollView != null) {
                                                                                                                                                                                                i10 = R.id.viewHintBottom;
                                                                                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(view2, R.id.viewHintBottom);
                                                                                                                                                                                                if (relativeLayout != null) {
                                                                                                                                                                                                    i10 = R.id.viewHintSeparator;
                                                                                                                                                                                                    View viewM298P1 = C0062b.m298P0(view2, R.id.viewHintSeparator);
                                                                                                                                                                                                    if (viewM298P1 != null) {
                                                                                                                                                                                                        i10 = R.id.viewHintTop;
                                                                                                                                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C0062b.m298P0(view2, R.id.viewHintTop);
                                                                                                                                                                                                        if (relativeLayout2 != null) {
                                                                                                                                                                                                            i10 = R.id.viewHints;
                                                                                                                                                                                                            if (((LinearLayout) C0062b.m298P0(view2, R.id.viewHints)) != null) {
                                                                                                                                                                                                                i10 = R.id.viewLearn;
                                                                                                                                                                                                                ViewLearnProgress viewLearnProgress = (ViewLearnProgress) C0062b.m298P0(view2, R.id.viewLearn);
                                                                                                                                                                                                                if (viewLearnProgress != null) {
                                                                                                                                                                                                                    i10 = R.id.viewLearnCollapsed;
                                                                                                                                                                                                                    ViewLearnProgress viewLearnProgress2 = (ViewLearnProgress) C0062b.m298P0(view2, R.id.viewLearnCollapsed);
                                                                                                                                                                                                                    if (viewLearnProgress2 != null) {
                                                                                                                                                                                                                        i10 = R.id.viewLoadingPopularMeanings;
                                                                                                                                                                                                                        View viewM298P2 = C0062b.m298P0(view2, R.id.viewLoadingPopularMeanings);
                                                                                                                                                                                                                        if (viewM298P2 != null) {
                                                                                                                                                                                                                            C8336o2 c8336o2 = new C8336o2((LinearLayout) viewM298P2);
                                                                                                                                                                                                                            View viewM298P3 = C0062b.m298P0(view2, R.id.viewLoadingRelatedPhrases);
                                                                                                                                                                                                                            if (viewM298P3 != null) {
                                                                                                                                                                                                                                C8336o2 c8336o3 = new C8336o2((LinearLayout) viewM298P3);
                                                                                                                                                                                                                                int i11 = R.id.view_term;
                                                                                                                                                                                                                                if (((ConstraintLayout) C0062b.m298P0(view2, R.id.view_term)) != null) {
                                                                                                                                                                                                                                    i11 = R.id.viewTop;
                                                                                                                                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(view2, R.id.viewTop);
                                                                                                                                                                                                                                    if (linearLayout4 != null) {
                                                                                                                                                                                                                                        i11 = R.id.viewTopAnchor;
                                                                                                                                                                                                                                        if (C0062b.m298P0(view2, R.id.viewTopAnchor) != null) {
                                                                                                                                                                                                                                            i11 = R.id.viewWordStatus;
                                                                                                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(view2, R.id.viewWordStatus);
                                                                                                                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                                                                                                                return new C8371v1(imageButton, textView, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, textView2, imageButton7, imageButton8, imageButton9, materialCardView, textInputEditText, appCompatEditText, imageView, imageView2, tokenMotionLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, appCompatSpinner, linearLayout, textInputLayout, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, linearLayout2, linearLayout3, viewM298P0, nestedScrollView, relativeLayout, viewM298P1, relativeLayout2, viewLearnProgress, viewLearnProgress2, c8336o2, c8336o3, linearLayout4, linearLayout5);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                i10 = i11;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                i10 = R.id.viewLoadingRelatedPhrases;
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
