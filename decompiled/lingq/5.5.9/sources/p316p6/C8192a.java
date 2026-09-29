package p316p6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0979t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.linguist.R;
import p150h9.C5909e;
import p286o2.C7906f;
import p408u6.C9467f;
import p408u6.ViewOnClickListenerC9466e;
import p454wa.C9887l;
import p454wa.C9888m;
import p454wa.C9889n;
import p479xa.C10129a;
import p479xa.C10134c0;
import ua.C9492a;
import ua.C9496e;

/* JADX INFO: renamed from: p6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8192a extends RecyclerView {

    /* JADX INFO: renamed from: e1 */
    public C2413j f44366e1;

    /* JADX INFO: renamed from: f1 */
    public Context f44367f1;

    /* JADX INFO: renamed from: g1 */
    public C9467f f44368g1;

    /* JADX INFO: renamed from: h1 */
    public StyledPlayerView f44369h1;

    /* JADX INFO: renamed from: p6.a$a */
    public class a extends RecyclerView.AbstractC1125r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: a */
        public final void mo4339a(int i10, RecyclerView recyclerView) {
            if (i10 == 0) {
                C8192a.this.m16316q0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: b */
        public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* JADX INFO: renamed from: p6.a$b */
    public class b implements RecyclerView.InterfaceC1122o {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
        /* JADX INFO: renamed from: b */
        public final void mo66b(View view) {
            C8192a c8192a = C8192a.this;
            C9467f c9467f = c8192a.f44368g1;
            if (c9467f == null || !c9467f.f7054a.equals(view)) {
                return;
            }
            C2413j c2413j = c8192a.f44366e1;
            if (c2413j != null) {
                c2413j.stop();
            }
            c8192a.f44368g1 = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1122o
        /* JADX INFO: renamed from: d */
        public final void mo67d(View view) {
        }
    }

    /* JADX INFO: renamed from: p6.a$c */
    public class c implements InterfaceC2532v.c {
        public c() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: J */
        public final void mo7408J(int i10) {
            FrameLayout frameLayout;
            C2413j c2413j;
            C8192a c8192a = C8192a.this;
            if (i10 == 2) {
                C9467f c9467f = c8192a.f44368g1;
                if (c9467f == null || (frameLayout = c9467f.f48522B) == null) {
                    return;
                }
                frameLayout.setVisibility(0);
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (c2413j = c8192a.f44366e1) != null) {
                    c2413j.m6922b(5, 0L);
                    c8192a.f44366e1.setPlayWhenReady(false);
                    StyledPlayerView styledPlayerView = c8192a.f44369h1;
                    if (styledPlayerView != null) {
                        styledPlayerView.showController();
                        return;
                    }
                    return;
                }
                return;
            }
            C9467f c9467f2 = c8192a.f44368g1;
            if (c9467f2 != null) {
                c9467f2.f48533x.setVisibility(0);
                ImageView imageView = c9467f2.f48526F;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                FrameLayout frameLayout2 = c9467f2.f48522B;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
        }
    }

    public C8192a(ActivityC0979t activityC0979t) {
        super(activityC0979t, null);
        m16315p0(activityC0979t);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m16315p0(Context context) {
        this.f44367f1 = context.getApplicationContext();
        StyledPlayerView styledPlayerView = new StyledPlayerView(this.f44367f1);
        this.f44369h1 = styledPlayerView;
        styledPlayerView.setBackgroundColor(0);
        if (CTInboxActivity.f11259b0 == 2) {
            this.f44369h1.setResizeMode(3);
        } else {
            this.f44369h1.setResizeMode(0);
        }
        this.f44369h1.setUseArtwork(true);
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        this.f44369h1.setDefaultArtwork(C7906f.a.m15676a(resources, R.drawable.ct_audio, null));
        C9496e c9496e = new C9496e(this.f44367f1, new C9492a.b());
        ExoPlayer.C2348c c2348c = new ExoPlayer.C2348c(context);
        C10129a.m18992d(!c2348c.f11816t);
        c2348c.f11801e = new C5909e(0, c9496e);
        C2413j c2413jM6769a = c2348c.m6769a();
        this.f44366e1 = c2413jM6769a;
        c2413jM6769a.setVolume(0.0f);
        this.f44369h1.setUseController(true);
        this.f44369h1.setControllerAutoShow(false);
        this.f44369h1.setPlayer(this.f44366e1);
        m4203i(new a());
        m4201h(new b());
        this.f44366e1.addListener(new c());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m16316q0() {
        FrameLayout frameLayout;
        int measuredHeight;
        int iRound;
        C9467f c9467f;
        if (this.f44369h1 == null) {
            return;
        }
        int iM4121R0 = ((LinearLayoutManager) getLayoutManager()).m4121R0();
        int iM4122S0 = ((LinearLayoutManager) getLayoutManager()).m4122S0();
        int i10 = 0;
        C9467f c9467f2 = null;
        int i11 = 0;
        for (int i12 = iM4121R0; i12 <= iM4122S0; i12++) {
            View childAt = getChildAt(i12 - iM4121R0);
            if (childAt != null && (c9467f = (C9467f) childAt.getTag()) != null && c9467f.f48528H) {
                Rect rect = new Rect();
                int iHeight = c9467f.f7054a.getGlobalVisibleRect(rect) ? rect.height() : 0;
                if (iHeight > i11) {
                    c9467f2 = c9467f;
                    i11 = iHeight;
                }
            }
        }
        if (c9467f2 == null) {
            C2413j c2413j = this.f44366e1;
            if (c2413j != null) {
                c2413j.stop();
            }
            this.f44368g1 = null;
            m16317r0();
            return;
        }
        C9467f c9467f3 = this.f44368g1;
        if (c9467f3 != null && c9467f3.f7054a.equals(c9467f2.f7054a)) {
            Rect rect2 = new Rect();
            int iHeight2 = this.f44368g1.f7054a.getGlobalVisibleRect(rect2) ? rect2.height() : 0;
            C2413j c2413j2 = this.f44366e1;
            if (c2413j2 != null) {
                if (!(iHeight2 >= 400)) {
                    c2413j2.setPlayWhenReady(false);
                } else if (this.f44368g1.f48524D.m6553n()) {
                    this.f44366e1.setPlayWhenReady(true);
                    return;
                }
            }
            return;
        }
        m16317r0();
        StyledPlayerView styledPlayerView = this.f44369h1;
        if (c9467f2.f48528H && (frameLayout = c9467f2.f48533x) != null) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
            Resources resources = c9467f2.f48530u.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (CTInboxActivity.f11259b0 != 2) {
                measuredHeight = resources.getDisplayMetrics().widthPixels;
                iRound = c9467f2.f48525E.f11271H.equalsIgnoreCase("l") ? Math.round(measuredHeight * 0.5625f) : measuredHeight;
            } else if (c9467f2.f48525E.f11271H.equalsIgnoreCase("l")) {
                measuredHeight = Math.round(c9467f2.f48534y.getMeasuredHeight() * 1.76f);
                iRound = c9467f2.f48534y.getMeasuredHeight();
            } else {
                measuredHeight = c9467f2.f48535z.getMeasuredHeight();
            }
            styledPlayerView.setLayoutParams(new FrameLayout.LayoutParams(measuredHeight, iRound));
            frameLayout.addView(styledPlayerView);
            frameLayout.setBackgroundColor(Color.parseColor(c9467f2.f48525E.f11277b));
            FrameLayout frameLayout2 = c9467f2.f48522B;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            ExoPlayer exoPlayer = (ExoPlayer) styledPlayerView.getPlayer();
            float volume = exoPlayer != null ? exoPlayer.getVolume() : 0.0f;
            if (c9467f2.f48524D.m6553n()) {
                ImageView imageView = new ImageView(c9467f2.f48530u);
                c9467f2.f48526F = imageView;
                imageView.setVisibility(8);
                if (volume > 0.0f) {
                    ImageView imageView2 = c9467f2.f48526F;
                    Resources resources2 = c9467f2.f48530u.getResources();
                    ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
                    imageView2.setImageDrawable(C7906f.a.m15676a(resources2, R.drawable.ct_volume_on, null));
                } else {
                    ImageView imageView3 = c9467f2.f48526F;
                    Resources resources3 = c9467f2.f48530u.getResources();
                    ThreadLocal<TypedValue> threadLocal2 = C7906f.f43056a;
                    imageView3.setImageDrawable(C7906f.a.m15676a(resources3, R.drawable.ct_volume_off, null));
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, displayMetrics), (int) TypedValue.applyDimension(1, 30.0f, displayMetrics));
                layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, displayMetrics), (int) TypedValue.applyDimension(1, 2.0f, displayMetrics), 0);
                layoutParams.gravity = 8388613;
                c9467f2.f48526F.setLayoutParams(layoutParams);
                c9467f2.f48526F.setOnClickListener(new ViewOnClickListenerC9466e(c9467f2, i10, exoPlayer));
                frameLayout.addView(c9467f2.f48526F);
            }
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
            C9887l c9887lM18389a = new C9887l.a(c9467f2.f48530u).m18389a();
            Context context = c9467f2.f48530u;
            String strM19017B = C10134c0.m19017B(context, context.getPackageName());
            String str = c9467f2.f48524D.f11294g;
            C2466p c2466p = C2466p.f12765g;
            C2466p.a aVar = new C2466p.a();
            aVar.f12778b = str != null ? Uri.parse(str) : null;
            C2466p c2466pM7213a = aVar.m7213a();
            C9889n.a aVar2 = new C9889n.a();
            aVar2.f50507c = strM19017B;
            aVar2.f50506b = c9887lM18389a;
            C9888m.a aVar3 = new C9888m.a(context, aVar2);
            if (str != null) {
                HlsMediaSource hlsMediaSourceMo7269a = new HlsMediaSource.Factory(aVar3).mo7269a(c2466pM7213a);
                if (exoPlayer != null) {
                    exoPlayer.setMediaSource(hlsMediaSourceMo7269a);
                    exoPlayer.prepare();
                    if (c9467f2.f48524D.m6550j()) {
                        styledPlayerView.showController();
                        exoPlayer.setPlayWhenReady(false);
                        exoPlayer.setVolume(1.0f);
                    } else if (c9467f2.f48524D.m6553n()) {
                        exoPlayer.setPlayWhenReady(true);
                        exoPlayer.setVolume(volume);
                    }
                }
            }
            i10 = 1;
        }
        if (i10 != 0) {
            this.f44368g1 = c9467f2;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m16317r0() {
        ViewGroup viewGroup;
        StyledPlayerView styledPlayerView = this.f44369h1;
        if (styledPlayerView != null && (viewGroup = (ViewGroup) styledPlayerView.getParent()) != null) {
            int iIndexOfChild = viewGroup.indexOfChild(this.f44369h1);
            if (iIndexOfChild >= 0) {
                viewGroup.removeViewAt(iIndexOfChild);
                C2413j c2413j = this.f44366e1;
                if (c2413j != null) {
                    c2413j.stop();
                }
                C9467f c9467f = this.f44368g1;
                if (c9467f != null) {
                    FrameLayout frameLayout = c9467f.f48522B;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    ImageView imageView = c9467f.f48526F;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    FrameLayout frameLayout2 = c9467f.f48533x;
                    if (frameLayout2 != null) {
                        frameLayout2.removeAllViews();
                    }
                    this.f44368g1 = null;
                }
            }
        }
    }
}
