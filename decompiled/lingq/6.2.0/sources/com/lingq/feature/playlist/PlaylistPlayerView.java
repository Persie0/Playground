package com.lingq.feature.playlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.Slider;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import p000.C3386nv;
import p000.lfa;
import p000.wb7;
import p000.wua;
import p000.y52;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final wua f27596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_playlist_player, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R$id.btn_player_back;
        if (((ImageView) lfa.m16159c(viewInflate, i2)) != null) {
            i2 = R$id.btn_player_expand;
            if (((ImageView) lfa.m16159c(viewInflate, i2)) != null) {
                i2 = R$id.btn_player_forward;
                if (((ImageView) lfa.m16159c(viewInflate, i2)) != null) {
                    i2 = R$id.btn_player_pause_play;
                    if (((ImageView) lfa.m16159c(viewInflate, i2)) != null) {
                        i2 = R$id.btn_player_speed;
                        if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                            i2 = R$id.slPlayerProgress;
                            if (((Slider) lfa.m16159c(viewInflate, i2)) != null) {
                                i2 = R$id.tvPlayerEndTime;
                                if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                                    i2 = R$id.tvPlayerStartTime;
                                    if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                                        i2 = R$id.view_controls;
                                        if (((LinearLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                            i2 = R$id.viewTrackInfo;
                                            if (((ConstraintLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                                i2 = R$id.viewYoutubePlayer;
                                                if (((RelativeLayout) lfa.m16159c(viewInflate, i2)) != null) {
                                                    i2 = R$id.youtube_player_view;
                                                    if (((YouTubePlayerView) lfa.m16159c(viewInflate, i2)) != null) {
                                                        this.f27596a = new wua();
                                                        return;
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
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final wua getBinding() {
        return this.f27596a;
    }

    public final void setPlayerControlsListener(wb7 wb7Var) {
        wb7Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaylistPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaylistPlayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PlaylistPlayerView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
