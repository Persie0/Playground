package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.slider.Slider;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ph.C8330n2;
import ph.C8355s0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class ListeningModeFragment$binding$2 extends FunctionReferenceImpl implements InterfaceC2052l<View, C8355s0> {

    /* JADX INFO: renamed from: j */
    public static final ListeningModeFragment$binding$2 f28736j = new ListeningModeFragment$binding$2();

    public ListeningModeFragment$binding$2() {
        super(1, C8355s0.class, "bind", "bind(Landroid/view/View;)Lcom/lingq/databinding/FragmentListeningModeBinding;", 0);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final C8355s0 mo528n(View view) {
        View view2 = view;
        C5207g.m11111f(view2, "p0");
        int i10 = R.id.btn_player_close;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view2, R.id.btn_player_close);
        if (linearLayout != null) {
            i10 = R.id.btn_player_forward_five;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(view2, R.id.btn_player_forward_five);
            if (imageButton != null) {
                i10 = R.id.btn_player_next;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(view2, R.id.btn_player_next);
                if (imageButton2 != null) {
                    i10 = R.id.btn_player_pause_play;
                    ImageButton imageButton3 = (ImageButton) C0062b.m298P0(view2, R.id.btn_player_pause_play);
                    if (imageButton3 != null) {
                        i10 = R.id.btn_player_previous;
                        ImageButton imageButton4 = (ImageButton) C0062b.m298P0(view2, R.id.btn_player_previous);
                        if (imageButton4 != null) {
                            i10 = R.id.btn_player_repeat;
                            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(view2, R.id.btn_player_repeat);
                            if (linearLayout2 != null) {
                                i10 = R.id.btn_player_seek_back_five;
                                ImageButton imageButton5 = (ImageButton) C0062b.m298P0(view2, R.id.btn_player_seek_back_five);
                                if (imageButton5 != null) {
                                    i10 = R.id.btn_player_sentence;
                                    LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(view2, R.id.btn_player_sentence);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.btn_player_shuffle;
                                        LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(view2, R.id.btn_player_shuffle);
                                        if (linearLayout4 != null) {
                                            i10 = R.id.btn_player_speed;
                                            TextView textView = (TextView) C0062b.m298P0(view2, R.id.btn_player_speed);
                                            if (textView != null) {
                                                i10 = R.id.guideline;
                                                View viewM298P0 = C0062b.m298P0(view2, R.id.guideline);
                                                if (viewM298P0 != null) {
                                                    i10 = R.id.iv_lesson;
                                                    ImageView imageView = (ImageView) C0062b.m298P0(view2, R.id.iv_lesson);
                                                    if (imageView != null) {
                                                        i10 = R.id.iv_player_repeat;
                                                        ImageView imageView2 = (ImageView) C0062b.m298P0(view2, R.id.iv_player_repeat);
                                                        if (imageView2 != null) {
                                                            i10 = R.id.iv_player_shuffle;
                                                            ImageView imageView3 = (ImageView) C0062b.m298P0(view2, R.id.iv_player_shuffle);
                                                            if (imageView3 != null) {
                                                                i10 = R.id.loadingViews;
                                                                View viewM298P1 = C0062b.m298P0(view2, R.id.loadingViews);
                                                                if (viewM298P1 != null) {
                                                                    LinearLayout linearLayout5 = (LinearLayout) viewM298P1;
                                                                    C8330n2 c8330n2 = new C8330n2(linearLayout5, linearLayout5);
                                                                    int i11 = R.id.player_controls;
                                                                    if (((RelativeLayout) C0062b.m298P0(view2, R.id.player_controls)) != null) {
                                                                        i11 = R.id.player_controls_bottom;
                                                                        LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(view2, R.id.player_controls_bottom);
                                                                        if (linearLayout6 != null) {
                                                                            i11 = R.id.rvSentences;
                                                                            RecyclerView recyclerView = (RecyclerView) C0062b.m298P0(view2, R.id.rvSentences);
                                                                            if (recyclerView != null) {
                                                                                i11 = R.id.slPlayerProgress;
                                                                                Slider slider = (Slider) C0062b.m298P0(view2, R.id.slPlayerProgress);
                                                                                if (slider != null) {
                                                                                    i11 = R.id.tv_close;
                                                                                    TextView textView2 = (TextView) C0062b.m298P0(view2, R.id.tv_close);
                                                                                    if (textView2 != null) {
                                                                                        i11 = R.id.tvPlayerEndTime;
                                                                                        TextView textView3 = (TextView) C0062b.m298P0(view2, R.id.tvPlayerEndTime);
                                                                                        if (textView3 != null) {
                                                                                            i11 = R.id.tvPlayerStartTime;
                                                                                            TextView textView4 = (TextView) C0062b.m298P0(view2, R.id.tvPlayerStartTime);
                                                                                            if (textView4 != null) {
                                                                                                i11 = R.id.tv_subtitle_player;
                                                                                                TextView textView5 = (TextView) C0062b.m298P0(view2, R.id.tv_subtitle_player);
                                                                                                if (textView5 != null) {
                                                                                                    i11 = R.id.tv_title_player;
                                                                                                    TextView textView6 = (TextView) C0062b.m298P0(view2, R.id.tv_title_player);
                                                                                                    if (textView6 != null) {
                                                                                                        i11 = R.id.youtube_player_view;
                                                                                                        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) C0062b.m298P0(view2, R.id.youtube_player_view);
                                                                                                        if (youTubePlayerView != null) {
                                                                                                            return new C8355s0(linearLayout, imageButton, imageButton2, imageButton3, imageButton4, linearLayout2, imageButton5, linearLayout3, linearLayout4, textView, viewM298P0, imageView, imageView2, imageView3, c8330n2, linearLayout6, recyclerView, slider, textView2, textView3, textView4, textView5, textView6, youTubePlayerView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i10)));
    }
}
