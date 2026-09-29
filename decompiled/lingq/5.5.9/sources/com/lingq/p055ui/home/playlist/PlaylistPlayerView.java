package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import bj.C1595r;
import bj.C1596s;
import bj.ViewOnClickListenerC1585h;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.slider.Slider;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3296a;
import com.lingq.player.C3300e;
import com.lingq.util.C4924a;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import p003a2.C0009a;
import p254m2.C7472a;
import p274n8.ViewOnClickListenerC7718c;
import p304ok.InterfaceC8066b;
import ph.C8314k4;
import pk.AbstractC8400a;
import pk.InterfaceC8402c;
import sh.InterfaceC9008d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistPlayerView;", "Landroid/widget/FrameLayout;", "Lsh/d;", "listener", "Lsl/e;", "setPlayerControlsListener", "Lph/k4;", "a", "Lph/k4;", "getBinding", "()Lph/k4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f25566c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C8314k4 binding;

    /* JADX INFO: renamed from: b */
    public InterfaceC9008d f25568b;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistPlayerView$a */
    public static final class C3915a extends AbstractC8400a {
        public C3915a() {
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: d */
        public final void mo9988d(InterfaceC8066b interfaceC8066b, float f3) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            InterfaceC9008d interfaceC9008d = PlaylistPlayerView.this.f25568b;
            if (interfaceC9008d != null) {
                interfaceC9008d.mo9863a(f3);
            }
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: e */
        public final void mo9989e(InterfaceC8066b interfaceC8066b, float f3) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            InterfaceC9008d interfaceC9008d = PlaylistPlayerView.this.f25568b;
            if (interfaceC9008d != null) {
                interfaceC9008d.mo9865c(f3);
            }
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: i */
        public final void mo9990i(InterfaceC8066b interfaceC8066b, PlayerConstants$PlayerState playerConstants$PlayerState) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            PlayerConstants$PlayerState playerConstants$PlayerState2 = PlayerConstants$PlayerState.ENDED;
            PlaylistPlayerView playlistPlayerView = PlaylistPlayerView.this;
            if (playerConstants$PlayerState == playerConstants$PlayerState2) {
                InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                if (interfaceC9008d != null) {
                    interfaceC9008d.mo9872j();
                    return;
                }
                return;
            }
            if (playerConstants$PlayerState == PlayerConstants$PlayerState.PLAYING) {
                ImageView imageView = playlistPlayerView.getBinding().f44972d;
                Context context = playlistPlayerView.getContext();
                Object obj = C7472a.f41322a;
                imageView.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ic_playlist_pause));
                InterfaceC9008d interfaceC9008d2 = playlistPlayerView.f25568b;
                if (interfaceC9008d2 != null) {
                    interfaceC9008d2.mo9871i();
                    return;
                }
                return;
            }
            if (playerConstants$PlayerState == PlayerConstants$PlayerState.PAUSED) {
                ImageView imageView2 = playlistPlayerView.getBinding().f44972d;
                Context context2 = playlistPlayerView.getContext();
                Object obj2 = C7472a.f41322a;
                imageView2.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_playlist_play));
                InterfaceC9008d interfaceC9008d3 = playlistPlayerView.f25568b;
                if (interfaceC9008d3 != null) {
                    interfaceC9008d3.mo9867e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistPlayerView$b */
    public static final class C3916b implements InterfaceC8402c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6697c f25570a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f25571b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f25572c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f25573d;

        public C3916b(C6697c c6697c, boolean z10, float f3, int i10) {
            this.f25570a = c6697c;
            this.f25571b = z10;
            this.f25572c = f3;
            this.f25573d = i10;
        }

        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            List listM13448p0;
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            String str = this.f25570a.f37870o;
            if (str != null) {
                List listM14273d = new Regex("\\?v=").m14273d(str);
                if (!listM14273d.isEmpty()) {
                    ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listM13448p0 = EmptyList.f38032a;
                            break;
                        } else {
                            if (!(((String) listIterator.previous()).length() == 0)) {
                                listM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                } else {
                    listM13448p0 = EmptyList.f38032a;
                    break;
                }
                String[] strArr = (String[]) listM13448p0.toArray(new String[0]);
                if (strArr.length > 1) {
                    if (this.f25571b) {
                        interfaceC8066b.mo15935f(this.f25572c, (String) new Regex("&").m14273d(strArr[1]).get(0));
                    } else {
                        interfaceC8066b.mo15931b(this.f25573d / 1000.0f, (String) new Regex("&").m14273d(strArr[1]).get(0));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistPlayerView$c */
    public static final class C3917c implements InterfaceC8402c {
        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            interfaceC8066b.pause();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistPlayerView$d */
    public static final class C3918d implements InterfaceC8402c {
        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            interfaceC8066b.pause();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistPlayerView$e */
    public static final class C3919e implements InterfaceC8402c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3296a f25574a;

        public C3919e(C3296a c3296a) {
            this.f25574a = c3296a;
        }

        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            interfaceC8066b.mo15932c(this.f25574a.f17744f / 1000.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_playlist_player, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.btn_player_back;
        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_back);
        if (imageView != null) {
            i10 = R.id.btn_player_expand;
            ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_expand);
            if (imageView2 != null) {
                i10 = R.id.btn_player_forward;
                ImageView imageView3 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_forward);
                if (imageView3 != null) {
                    i10 = R.id.btn_player_pause_play;
                    ImageView imageView4 = (ImageView) C0062b.m298P0(viewInflate, R.id.btn_player_pause_play);
                    if (imageView4 != null) {
                        i10 = R.id.btn_player_speed;
                        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.btn_player_speed);
                        if (textView != null) {
                            i10 = R.id.slPlayerProgress;
                            Slider slider = (Slider) C0062b.m298P0(viewInflate, R.id.slPlayerProgress);
                            if (slider != null) {
                                i10 = R.id.tvPlayerEndTime;
                                TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvPlayerEndTime);
                                if (textView2 != null) {
                                    i10 = R.id.tvPlayerStartTime;
                                    TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvPlayerStartTime);
                                    if (textView3 != null) {
                                        i10 = R.id.view_controls;
                                        if (((LinearLayout) C0062b.m298P0(viewInflate, R.id.view_controls)) != null) {
                                            i10 = R.id.viewTrackInfo;
                                            if (((ConstraintLayout) C0062b.m298P0(viewInflate, R.id.viewTrackInfo)) != null) {
                                                i10 = R.id.viewYoutubePlayer;
                                                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewInflate, R.id.viewYoutubePlayer);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.youtube_player_view;
                                                    YouTubePlayerView youTubePlayerView = (YouTubePlayerView) C0062b.m298P0(viewInflate, R.id.youtube_player_view);
                                                    if (youTubePlayerView != null) {
                                                        this.binding = new C8314k4(imageView, imageView2, imageView3, imageView4, textView, slider, textView2, textView3, relativeLayout, youTubePlayerView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: a */
    public final void m9985a() {
        C8314k4 c8314k4 = this.binding;
        final int i10 = 0;
        c8314k4.f44972d.setOnClickListener(new View.OnClickListener(this) { // from class: bj.q

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlaylistPlayerView f9080b;

            {
                this.f9080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                PlaylistPlayerView playlistPlayerView = this.f9080b;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        int i12 = PlaylistPlayerView.f25566c;
                        C5207g.m11111f(playlistPlayerView, "this$0");
                        InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                        if (interfaceC9008d != null) {
                            interfaceC9008d.mo9866d();
                        }
                        break;
                    default:
                        int i13 = PlaylistPlayerView.f25566c;
                        C5207g.m11111f(playlistPlayerView, "this$0");
                        InterfaceC9008d interfaceC9008d2 = playlistPlayerView.f25568b;
                        if (interfaceC9008d2 != null) {
                            interfaceC9008d2.mo9869g();
                        }
                        break;
                }
            }
        });
        c8314k4.f44969a.setOnClickListener(new ViewOnClickListenerC7718c(18, this));
        final int i11 = 1;
        c8314k4.f44970b.setOnClickListener(new ViewOnClickListenerC1585h(i11, this));
        c8314k4.f44971c.setOnClickListener(new ViewOnClickListenerC2238x(10, this));
        c8314k4.f44973e.setOnClickListener(new View.OnClickListener(this) { // from class: bj.q

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ PlaylistPlayerView f9080b;

            {
                this.f9080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                PlaylistPlayerView playlistPlayerView = this.f9080b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        int i13 = PlaylistPlayerView.f25566c;
                        C5207g.m11111f(playlistPlayerView, "this$0");
                        InterfaceC9008d interfaceC9008d = playlistPlayerView.f25568b;
                        if (interfaceC9008d != null) {
                            interfaceC9008d.mo9866d();
                        }
                        break;
                    default:
                        int i14 = PlaylistPlayerView.f25566c;
                        C5207g.m11111f(playlistPlayerView, "this$0");
                        InterfaceC9008d interfaceC9008d2 = playlistPlayerView.f25568b;
                        if (interfaceC9008d2 != null) {
                            interfaceC9008d2.mo9869g();
                        }
                        break;
                }
            }
        });
        c8314k4.f44978j.f32165b.getWebViewYouTubePlayer$core_release().m17276b(new C3915a());
    }

    /* JADX INFO: renamed from: b */
    public final void m9986b(C6697c c6697c, boolean z10, int i10) {
        C8314k4 c8314k4 = this.binding;
        if (c6697c == null) {
            c8314k4.f44978j.m10491a(new C3918d());
            RelativeLayout relativeLayout = c8314k4.f44977i;
            C5207g.m11110e(relativeLayout, "binding.viewYoutubePlayer");
            C4924a.m10442U(relativeLayout);
            YouTubePlayerView youTubePlayerView = c8314k4.f44978j;
            C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
            C4924a.m10442U(youTubePlayerView);
            return;
        }
        if (c6697c.f37870o == null || c6697c.f37869n != null) {
            c8314k4.f44978j.m10491a(new C3917c());
            RelativeLayout relativeLayout2 = c8314k4.f44977i;
            C5207g.m11110e(relativeLayout2, "binding.viewYoutubePlayer");
            C4924a.m10442U(relativeLayout2);
            YouTubePlayerView youTubePlayerView2 = c8314k4.f44978j;
            C5207g.m11110e(youTubePlayerView2, "binding.youtubePlayerView");
            C4924a.m10442U(youTubePlayerView2);
            return;
        }
        RelativeLayout relativeLayout3 = c8314k4.f44977i;
        C5207g.m11110e(relativeLayout3, "binding.viewYoutubePlayer");
        C4924a.m10457e0(relativeLayout3);
        YouTubePlayerView youTubePlayerView3 = c8314k4.f44978j;
        C5207g.m11110e(youTubePlayerView3, "binding.youtubePlayerView");
        C4924a.m10457e0(youTubePlayerView3);
        youTubePlayerView3.m10491a(new C3916b(c6697c, z10, i10 / 1000.0f, i10));
    }

    /* JADX INFO: renamed from: c */
    public final void m9987c(C3296a c3296a) {
        Drawable drawableM14849b;
        Drawable drawableM14849b2;
        C5207g.m11111f(c3296a, "state");
        C3300e c3300e = c3296a.f17739a;
        boolean zM11106a = C5207g.m11106a(c3300e.f17757a, AbstractC3299d.c.f17756a);
        C8314k4 c8314k4 = this.binding;
        if (zM11106a) {
            boolean zM11106a2 = C5207g.m11106a(c3300e.f17758b, AbstractC3298c.b.f17753a);
            YouTubePlayerView youTubePlayerView = c8314k4.f44978j;
            C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
            if (C4924a.m10427F(youTubePlayerView)) {
                YouTubePlayerView youTubePlayerView2 = c8314k4.f44978j;
                if (zM11106a2) {
                    youTubePlayerView2.m10491a(new C1595r());
                    Context context = getContext();
                    Object obj = C7472a.f41322a;
                    drawableM14849b2 = C7472a.c.m14849b(context, R.drawable.ic_playlist_pause);
                } else {
                    youTubePlayerView2.m10491a(new C1596s());
                    Context context2 = getContext();
                    Object obj2 = C7472a.f41322a;
                    drawableM14849b2 = C7472a.c.m14849b(context2, R.drawable.ic_playlist_play);
                }
                c8314k4.f44972d.setImageDrawable(drawableM14849b2);
            }
            if (c3296a.f17747i) {
                c8314k4.f44978j.m10491a(new C3919e(c3296a));
            }
        } else {
            ImageView imageView = c8314k4.f44972d;
            if (C5207g.m11106a(c3300e.f17758b, AbstractC3298c.b.f17753a)) {
                Context context3 = getContext();
                Object obj3 = C7472a.f41322a;
                drawableM14849b = C7472a.c.m14849b(context3, R.drawable.ic_playlist_pause);
            } else {
                Context context4 = getContext();
                Object obj4 = C7472a.f41322a;
                drawableM14849b = C7472a.c.m14849b(context4, R.drawable.ic_playlist_play);
            }
            imageView.setImageDrawable(drawableM14849b);
        }
        c8314k4.f44974f.setValueFrom(0.0f);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i10 = c3296a.f17744f;
        float seconds = timeUnit.toSeconds(i10);
        int i11 = c3296a.f17743e;
        float seconds2 = timeUnit.toSeconds(i11);
        if (seconds > seconds2) {
            seconds = seconds2;
        }
        c8314k4.f44974f.setValue(seconds);
        if (seconds2 > 0.0f) {
            c8314k4.f44974f.setValueTo(seconds2);
        }
        TextView textView = c8314k4.f44976h;
        Locale locale = Locale.getDefault();
        long seconds3 = timeUnit.toSeconds(i10);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        String str = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(i10)), Long.valueOf(seconds3 - timeUnit2.toSeconds(timeUnit.toMinutes(i10)))}, 2));
        C5207g.m11110e(str, "format(locale, format, *args)");
        textView.setText(str);
        int i12 = i11 - i10;
        if (i12 < 0) {
            i12 = 0;
        }
        long j10 = i12;
        C0009a.m32u(new Object[]{Long.valueOf(timeUnit.toMinutes(j10)), Long.valueOf(timeUnit.toSeconds(j10) - timeUnit2.toSeconds(timeUnit.toMinutes(j10)))}, 2, Locale.getDefault(), "%02d:%02d", "format(locale, format, *args)", c8314k4.f44975g);
        c8314k4.f44973e.setText(c3296a.f17742d.f47231b);
    }

    public final C8314k4 getBinding() {
        return this.binding;
    }

    public final void setPlayerControlsListener(InterfaceC9008d interfaceC9008d) {
        C5207g.m11111f(interfaceC9008d, "listener");
        this.f25568b = interfaceC9008d;
    }
}
