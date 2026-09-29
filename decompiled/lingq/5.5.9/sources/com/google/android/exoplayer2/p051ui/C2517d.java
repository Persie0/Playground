package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.RunnableC0183b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.google.android.exoplayer2.source.ads.C2473a;
import com.google.common.collect.ImmutableList;
import com.linguist.R;
import ga.C5735r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p067d8.ViewOnClickListenerC5062d0;
import p150h9.C5941x;
import p274n8.ViewOnClickListenerC7718c;
import p286o2.C7906f;
import p479xa.C10129a;
import p479xa.C10134c0;
import ua.C9507p;
import ua.C9508q;
import va.C9690d;
import va.C9691e;
import va.C9701o;
import va.ViewOnClickListenerC9693g;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2517d extends FrameLayout {

    /* JADX INFO: renamed from: S0 */
    public static final float[] f13570S0;

    /* JADX INFO: renamed from: A0 */
    public final String f13571A0;

    /* JADX INFO: renamed from: B0 */
    public final String f13572B0;

    /* JADX INFO: renamed from: C0 */
    public InterfaceC2532v f13573C0;

    /* JADX INFO: renamed from: D0 */
    public c f13574D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f13575E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f13576F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f13577G0;

    /* JADX INFO: renamed from: H */
    public final View f13578H;

    /* JADX INFO: renamed from: H0 */
    public boolean f13579H0;

    /* JADX INFO: renamed from: I */
    public final View f13580I;

    /* JADX INFO: renamed from: I0 */
    public boolean f13581I0;

    /* JADX INFO: renamed from: J */
    public final View f13582J;

    /* JADX INFO: renamed from: J0 */
    public int f13583J0;

    /* JADX INFO: renamed from: K */
    public final View f13584K;

    /* JADX INFO: renamed from: K0 */
    public int f13585K0;

    /* JADX INFO: renamed from: L */
    public final View f13586L;

    /* JADX INFO: renamed from: L0 */
    public int f13587L0;

    /* JADX INFO: renamed from: M */
    public final TextView f13588M;

    /* JADX INFO: renamed from: M0 */
    public long[] f13589M0;

    /* JADX INFO: renamed from: N */
    public final TextView f13590N;

    /* JADX INFO: renamed from: N0 */
    public boolean[] f13591N0;

    /* JADX INFO: renamed from: O */
    public final ImageView f13592O;

    /* JADX INFO: renamed from: O0 */
    public long[] f13593O0;

    /* JADX INFO: renamed from: P */
    public final ImageView f13594P;

    /* JADX INFO: renamed from: P0 */
    public boolean[] f13595P0;

    /* JADX INFO: renamed from: Q */
    public final View f13596Q;

    /* JADX INFO: renamed from: Q0 */
    public long f13597Q0;

    /* JADX INFO: renamed from: R */
    public final ImageView f13598R;

    /* JADX INFO: renamed from: R0 */
    public boolean f13599R0;

    /* JADX INFO: renamed from: S */
    public final ImageView f13600S;

    /* JADX INFO: renamed from: T */
    public final ImageView f13601T;

    /* JADX INFO: renamed from: U */
    public final View f13602U;

    /* JADX INFO: renamed from: V */
    public final View f13603V;

    /* JADX INFO: renamed from: W */
    public final View f13604W;

    /* JADX INFO: renamed from: a */
    public final C9701o f13605a;

    /* JADX INFO: renamed from: a0 */
    public final TextView f13606a0;

    /* JADX INFO: renamed from: b */
    public final Resources f13607b;

    /* JADX INFO: renamed from: b0 */
    public final TextView f13608b0;

    /* JADX INFO: renamed from: c */
    public final b f13609c;

    /* JADX INFO: renamed from: c0 */
    public final InterfaceC2518e f13610c0;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList<l> f13611d;

    /* JADX INFO: renamed from: d0 */
    public final StringBuilder f13612d0;

    /* JADX INFO: renamed from: e */
    public final RecyclerView f13613e;

    /* JADX INFO: renamed from: e0 */
    public final Formatter f13614e0;

    /* JADX INFO: renamed from: f */
    public final g f13615f;

    /* JADX INFO: renamed from: f0 */
    public final AbstractC2382c0.b f13616f0;

    /* JADX INFO: renamed from: g */
    public final d f13617g;

    /* JADX INFO: renamed from: g0 */
    public final AbstractC2382c0.c f13618g0;

    /* JADX INFO: renamed from: h */
    public final i f13619h;

    /* JADX INFO: renamed from: h0 */
    public final RunnableC0183b f13620h0;

    /* JADX INFO: renamed from: i */
    public final a f13621i;

    /* JADX INFO: renamed from: i0 */
    public final Drawable f13622i0;

    /* JADX INFO: renamed from: j */
    public final C9690d f13623j;

    /* JADX INFO: renamed from: j0 */
    public final Drawable f13624j0;

    /* JADX INFO: renamed from: k */
    public final PopupWindow f13625k;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f13626k0;

    /* JADX INFO: renamed from: l */
    public final int f13627l;

    /* JADX INFO: renamed from: l0 */
    public final String f13628l0;

    /* JADX INFO: renamed from: m0 */
    public final String f13629m0;

    /* JADX INFO: renamed from: n0 */
    public final String f13630n0;

    /* JADX INFO: renamed from: o0 */
    public final Drawable f13631o0;

    /* JADX INFO: renamed from: p0 */
    public final Drawable f13632p0;

    /* JADX INFO: renamed from: q0 */
    public final float f13633q0;

    /* JADX INFO: renamed from: r0 */
    public final float f13634r0;

    /* JADX INFO: renamed from: s0 */
    public final String f13635s0;

    /* JADX INFO: renamed from: t0 */
    public final String f13636t0;

    /* JADX INFO: renamed from: u0 */
    public final Drawable f13637u0;

    /* JADX INFO: renamed from: v0 */
    public final Drawable f13638v0;

    /* JADX INFO: renamed from: w0 */
    public final String f13639w0;

    /* JADX INFO: renamed from: x0 */
    public final String f13640x0;

    /* JADX INFO: renamed from: y0 */
    public final Drawable f13641y0;

    /* JADX INFO: renamed from: z0 */
    public final Drawable f13642z0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$a */
    public final class a extends k {
        public a() {
            super();
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.k
        /* JADX INFO: renamed from: q */
        public final void mo7451q(h hVar) {
            hVar.f13658u.setText(R.string.exo_track_selection_auto);
            InterfaceC2532v interfaceC2532v = C2517d.this.f13573C0;
            interfaceC2532v.getClass();
            hVar.f13659v.setVisibility(m7453s(interfaceC2532v.getTrackSelectionParameters()) ? 4 : 0);
            hVar.f7054a.setOnClickListener(new ViewOnClickListenerC5062d0(1, this));
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.k
        /* JADX INFO: renamed from: r */
        public final void mo7452r(String str) {
            C2517d.this.f13615f.f13655e[1] = str;
        }

        /* JADX INFO: renamed from: s */
        public final boolean m7453s(C9508q c9508q) {
            for (int i10 = 0; i10 < this.f13664d.size(); i10++) {
                if (c9508q.f48969T.containsKey(this.f13664d.get(i10).f13661a.f12111b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$b */
    public final class b implements InterfaceC2532v.c, InterfaceC2518e.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e.a
        /* JADX INFO: renamed from: G */
        public final void mo7454G(long j10, boolean z10) {
            InterfaceC2532v interfaceC2532v;
            C2517d c2517d = C2517d.this;
            int i10 = 0;
            c2517d.f13581I0 = false;
            if (!z10 && (interfaceC2532v = c2517d.f13573C0) != null) {
                if (c2517d.f13579H0) {
                    if (interfaceC2532v.isCommandAvailable(17) && interfaceC2532v.isCommandAvailable(10)) {
                        AbstractC2382c0 currentTimeline = interfaceC2532v.getCurrentTimeline();
                        int iMo6909o = currentTimeline.mo6909o();
                        while (true) {
                            long jM19033R = C10134c0.m19033R(currentTimeline.m6908m(i10, c2517d.f13618g0).f12087I);
                            if (j10 < jM19033R) {
                                break;
                            }
                            if (i10 == iMo6909o - 1) {
                                j10 = jM19033R;
                                break;
                            } else {
                                j10 -= jM19033R;
                                i10++;
                            }
                        }
                        interfaceC2532v.seekTo(i10, j10);
                    }
                    c2517d.m7445p();
                } else if (interfaceC2532v.isCommandAvailable(5)) {
                    interfaceC2532v.seekTo(j10);
                }
                c2517d.m7445p();
            }
            c2517d.f13605a.m18209g();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.exoplayer2.InterfaceC2532v.c
        /* JADX INFO: renamed from: T */
        public final void mo7455T(InterfaceC2532v.b bVar) {
            boolean zM7483a = bVar.m7483a(4, 5, 13);
            C2517d c2517d = C2517d.this;
            if (zM7483a) {
                c2517d.m7443n();
            }
            if (bVar.m7483a(4, 5, 7, 13)) {
                c2517d.m7445p();
            }
            if (bVar.m7483a(8, 13)) {
                c2517d.m7446q();
            }
            if (bVar.m7483a(9, 13)) {
                c2517d.m7448s();
            }
            if (bVar.m7483a(8, 9, 11, 0, 16, 17, 13)) {
                c2517d.m7442m();
            }
            if (bVar.m7483a(11, 0, 13)) {
                c2517d.m7449t();
            }
            if (bVar.m7483a(12, 13)) {
                c2517d.m7444o();
            }
            if (bVar.m7483a(2, 13)) {
                c2517d.m7450u();
            }
        }

        /* JADX WARN: Code duplicated, block: B:67:0x00d6 A[LOOP:0: B:46:0x00ae->B:67:0x00d6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:87:0x00d4 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10;
            C2517d c2517d = C2517d.this;
            InterfaceC2532v interfaceC2532v = c2517d.f13573C0;
            if (interfaceC2532v == null) {
                return;
            }
            C9701o c9701o = c2517d.f13605a;
            c9701o.m18209g();
            if (c2517d.f13580I == view) {
                if (interfaceC2532v.isCommandAvailable(9)) {
                    interfaceC2532v.seekToNext();
                    return;
                }
                return;
            }
            if (c2517d.f13578H == view) {
                if (interfaceC2532v.isCommandAvailable(7)) {
                    interfaceC2532v.seekToPrevious();
                    return;
                }
                return;
            }
            if (c2517d.f13584K == view) {
                if (interfaceC2532v.getPlaybackState() == 4 || !interfaceC2532v.isCommandAvailable(12)) {
                    return;
                }
                interfaceC2532v.seekForward();
                return;
            }
            if (c2517d.f13586L == view) {
                if (interfaceC2532v.isCommandAvailable(11)) {
                    interfaceC2532v.seekBack();
                    return;
                }
                return;
            }
            if (c2517d.f13582J == view) {
                int playbackState = interfaceC2532v.getPlaybackState();
                if (playbackState != 1 && playbackState != 4) {
                    if (interfaceC2532v.getPlayWhenReady()) {
                        if (interfaceC2532v.isCommandAvailable(1)) {
                            interfaceC2532v.pause();
                            return;
                        }
                        return;
                    }
                }
                C2517d.m7433e(interfaceC2532v);
                return;
            }
            if (c2517d.f13592O != view) {
                if (c2517d.f13594P == view) {
                    if (interfaceC2532v.isCommandAvailable(14)) {
                        interfaceC2532v.setShuffleModeEnabled(!interfaceC2532v.getShuffleModeEnabled());
                        return;
                    }
                    return;
                }
                View view2 = c2517d.f13602U;
                if (view2 == view) {
                    c9701o.m18208f();
                    c2517d.m7435f(c2517d.f13615f, view2);
                    return;
                }
                View view3 = c2517d.f13603V;
                if (view3 == view) {
                    c9701o.m18208f();
                    c2517d.m7435f(c2517d.f13617g, view3);
                    return;
                }
                View view4 = c2517d.f13604W;
                if (view4 == view) {
                    c9701o.m18208f();
                    c2517d.m7435f(c2517d.f13621i, view4);
                    return;
                }
                ImageView imageView = c2517d.f13598R;
                if (imageView == view) {
                    c9701o.m18208f();
                    c2517d.m7435f(c2517d.f13619h, imageView);
                    return;
                }
                return;
            }
            if (interfaceC2532v.isCommandAvailable(15)) {
                int repeatMode = interfaceC2532v.getRepeatMode();
                int i10 = c2517d.f13587L0;
                for (int i11 = 1; i11 <= 2; i11++) {
                    int i12 = (repeatMode + i11) % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                if ((i10 & 2) != 0) {
                                }
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                repeatMode = i12;
                                break;
                            }
                        } else {
                            if ((i10 & 1) == 0) {
                                z10 = false;
                            }
                            if (z10) {
                                repeatMode = i12;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        repeatMode = i12;
                        break;
                    }
                }
                interfaceC2532v.setRepeatMode(repeatMode);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C2517d c2517d = C2517d.this;
            if (c2517d.f13599R0) {
                c2517d.f13605a.m18209g();
            }
        }

        @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e.a
        /* JADX INFO: renamed from: x */
        public final void mo7456x(long j10) {
            C2517d c2517d = C2517d.this;
            TextView textView = c2517d.f13608b0;
            if (textView != null) {
                textView.setText(C10134c0.m19058y(c2517d.f13612d0, c2517d.f13614e0, j10));
            }
        }

        @Override // com.google.android.exoplayer2.p051ui.InterfaceC2518e.a
        /* JADX INFO: renamed from: y */
        public final void mo7457y(long j10) {
            C2517d c2517d = C2517d.this;
            c2517d.f13581I0 = true;
            TextView textView = c2517d.f13608b0;
            if (textView != null) {
                textView.setText(C10134c0.m19058y(c2517d.f13612d0, c2517d.f13614e0, j10));
            }
            c2517d.f13605a.m18208f();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$c */
    @Deprecated
    public interface c {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$d */
    public final class d extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: d */
        public final String[] f13645d;

        /* JADX INFO: renamed from: e */
        public final float[] f13646e;

        /* JADX INFO: renamed from: f */
        public int f13647f;

        public d(String[] strArr, float[] fArr) {
            this.f13645d = strArr;
            this.f13646e = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e */
        public final int mo4226e() {
            return this.f13645d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i */
        public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
            h hVar = (h) abstractC1109b0;
            String[] strArr = this.f13645d;
            if (i10 < strArr.length) {
                hVar.f13658u.setText(strArr[i10]);
            }
            int i11 = this.f13647f;
            View view = hVar.f13659v;
            View view2 = hVar.f7054a;
            int i12 = 0;
            if (i10 == i11) {
                view2.setSelected(true);
                view.setVisibility(0);
            } else {
                view2.setSelected(false);
                view.setVisibility(4);
            }
            view2.setOnClickListener(new ViewOnClickListenerC9693g(i10, i12, this));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j */
        public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
            return new h(LayoutInflater.from(C2517d.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$e */
    public interface e {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$f */
    public final class f extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: y */
        public static final /* synthetic */ int f13649y = 0;

        /* JADX INFO: renamed from: u */
        public final TextView f13650u;

        /* JADX INFO: renamed from: v */
        public final TextView f13651v;

        /* JADX INFO: renamed from: w */
        public final ImageView f13652w;

        public f(View view) {
            super(view);
            if (C10134c0.f51354a < 26) {
                view.setFocusable(true);
            }
            this.f13650u = (TextView) view.findViewById(R.id.exo_main_text);
            this.f13651v = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f13652w = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new ViewOnClickListenerC2239y(2, this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$g */
    public class g extends RecyclerView.Adapter<f> {

        /* JADX INFO: renamed from: d */
        public final String[] f13654d;

        /* JADX INFO: renamed from: e */
        public final String[] f13655e;

        /* JADX INFO: renamed from: f */
        public final Drawable[] f13656f;

        public g(String[] strArr, Drawable[] drawableArr) {
            this.f13654d = strArr;
            this.f13655e = new String[strArr.length];
            this.f13656f = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e */
        public final int mo4226e() {
            return this.f13654d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: f */
        public final long mo4227f(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i */
        public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
            f fVar = (f) abstractC1109b0;
            boolean zM7458p = m7458p(i10);
            View view = fVar.f7054a;
            if (zM7458p) {
                view.setLayoutParams(new RecyclerView.C1121n(-1, -2));
            } else {
                view.setLayoutParams(new RecyclerView.C1121n(0, 0));
            }
            fVar.f13650u.setText(this.f13654d[i10]);
            String str = this.f13655e[i10];
            TextView textView = fVar.f13651v;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f13656f[i10];
            ImageView imageView = fVar.f13652w;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j */
        public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
            C2517d c2517d = C2517d.this;
            return c2517d.new f(LayoutInflater.from(c2517d.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) recyclerView, false));
        }

        /* JADX INFO: renamed from: p */
        public final boolean m7458p(int i10) {
            C2517d c2517d = C2517d.this;
            InterfaceC2532v interfaceC2532v = c2517d.f13573C0;
            if (interfaceC2532v == null) {
                return false;
            }
            if (i10 == 0) {
                return interfaceC2532v.isCommandAvailable(13);
            }
            if (i10 != 1) {
                return true;
            }
            return interfaceC2532v.isCommandAvailable(30) && c2517d.f13573C0.isCommandAvailable(29);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$h */
    public static class h extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f13658u;

        /* JADX INFO: renamed from: v */
        public final View f13659v;

        public h(View view) {
            super(view);
            if (C10134c0.f51354a < 26) {
                view.setFocusable(true);
            }
            this.f13658u = (TextView) view.findViewById(R.id.exo_text);
            this.f13659v = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$i */
    public final class i extends k {
        public i() {
            super();
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.k, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final void mo478i(h hVar, int i10) {
            super.mo478i(hVar, i10);
            if (i10 > 0) {
                j jVar = this.f13664d.get(i10 - 1);
                hVar.f13659v.setVisibility(jVar.f13661a.f12114e[jVar.f13662b] ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.k
        /* JADX INFO: renamed from: q */
        public final void mo7451q(h hVar) {
            boolean z10;
            hVar.f13658u.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f13664d.size()) {
                    z10 = true;
                    break;
                }
                j jVar = this.f13664d.get(i11);
                if (jVar.f13661a.f12114e[jVar.f13662b]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (!z10) {
                i10 = 4;
            }
            hVar.f13659v.setVisibility(i10);
            hVar.f7054a.setOnClickListener(new ViewOnClickListenerC7718c(2, this));
        }

        @Override // com.google.android.exoplayer2.p051ui.C2517d.k
        /* JADX INFO: renamed from: r */
        public final void mo7452r(String str) {
        }

        /* JADX INFO: renamed from: s */
        public final void m7460s(List<j> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                j jVar = list.get(i10);
                if (jVar.f13661a.f12114e[jVar.f13662b]) {
                    z10 = true;
                    break;
                }
            }
            C2517d c2517d = C2517d.this;
            ImageView imageView = c2517d.f13598R;
            if (imageView != null) {
                imageView.setImageDrawable(z10 ? c2517d.f13637u0 : c2517d.f13638v0);
                c2517d.f13598R.setContentDescription(z10 ? c2517d.f13639w0 : c2517d.f13640x0);
            }
            this.f13664d = list;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$j */
    public static final class j {

        /* JADX INFO: renamed from: a */
        public final C2384d0.a f13661a;

        /* JADX INFO: renamed from: b */
        public final int f13662b;

        /* JADX INFO: renamed from: c */
        public final String f13663c;

        public j(C2384d0 c2384d0, int i10, int i11, String str) {
            this.f13661a = c2384d0.f12105a.get(i10);
            this.f13662b = i11;
            this.f13663c = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$k */
    public abstract class k extends RecyclerView.Adapter<h> {

        /* JADX INFO: renamed from: d */
        public List<j> f13664d = new ArrayList();

        public k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e */
        public final int mo4226e() {
            if (this.f13664d.isEmpty()) {
                return 0;
            }
            return this.f13664d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j */
        public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
            return new h(LayoutInflater.from(C2517d.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: p */
        public void mo478i(h hVar, int i10) {
            final InterfaceC2532v interfaceC2532v = C2517d.this.f13573C0;
            if (interfaceC2532v == null) {
                return;
            }
            if (i10 == 0) {
                mo7451q(hVar);
                return;
            }
            boolean z10 = true;
            final j jVar = this.f13664d.get(i10 - 1);
            final C5735r c5735r = jVar.f13661a.f12111b;
            int i11 = 0;
            if (interfaceC2532v.getTrackSelectionParameters().f48969T.get(c5735r) == null || !jVar.f13661a.f12114e[jVar.f13662b]) {
                z10 = false;
            }
            hVar.f13658u.setText(jVar.f13663c);
            if (!z10) {
                i11 = 4;
            }
            hVar.f13659v.setVisibility(i11);
            hVar.f7054a.setOnClickListener(new View.OnClickListener() { // from class: va.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2517d.k kVar = this.f49622a;
                    kVar.getClass();
                    InterfaceC2532v interfaceC2532v2 = interfaceC2532v;
                    if (interfaceC2532v2.isCommandAvailable(29)) {
                        C9508q.a aVarMo17949a = interfaceC2532v2.getTrackSelectionParameters().mo17949a();
                        C2517d.j jVar2 = jVar;
                        interfaceC2532v2.setTrackSelectionParameters(aVarMo17949a.mo17953f(new C9507p(c5735r, ImmutableList.m9064b0(Integer.valueOf(jVar2.f13662b)))).mo17954g(jVar2.f13661a.f12111b.f34802c).mo17950a());
                        kVar.mo7452r(jVar2.f13663c);
                        C2517d.this.f13625k.dismiss();
                    }
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public abstract void mo7451q(h hVar);

        /* JADX INFO: renamed from: r */
        public abstract void mo7452r(String str);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.d$l */
    @Deprecated
    public interface l {
        /* JADX INFO: renamed from: x */
        void mo7413x(int i10);
    }

    static {
        C5941x.m12374a("goog.exo.ui");
        f13570S0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C2517d(Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        super(context, null, 0);
        this.f13583J0 = 5000;
        this.f13587L0 = 0;
        this.f13585K0 = 200;
        int i10 = 2;
        int resourceId = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9691e.f49616c, 0, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f13583J0 = typedArrayObtainStyledAttributes.getInt(21, this.f13583J0);
                this.f13587L0 = typedArrayObtainStyledAttributes.getInt(9, this.f13587L0);
                z11 = typedArrayObtainStyledAttributes.getBoolean(18, true);
                z12 = typedArrayObtainStyledAttributes.getBoolean(15, true);
                z13 = typedArrayObtainStyledAttributes.getBoolean(17, true);
                z14 = typedArrayObtainStyledAttributes.getBoolean(16, true);
                z16 = typedArrayObtainStyledAttributes.getBoolean(19, false);
                z17 = typedArrayObtainStyledAttributes.getBoolean(20, false);
                z15 = typedArrayObtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(23, this.f13585K0));
                z10 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = false;
            z16 = false;
            z17 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        b bVar = new b();
        this.f13609c = bVar;
        this.f13611d = new CopyOnWriteArrayList<>();
        this.f13616f0 = new AbstractC2382c0.b();
        this.f13618g0 = new AbstractC2382c0.c();
        StringBuilder sb2 = new StringBuilder();
        this.f13612d0 = sb2;
        this.f13614e0 = new Formatter(sb2, Locale.getDefault());
        this.f13589M0 = new long[0];
        this.f13591N0 = new boolean[0];
        this.f13593O0 = new long[0];
        this.f13595P0 = new boolean[0];
        this.f13620h0 = new RunnableC0183b(14, this);
        this.f13606a0 = (TextView) findViewById(R.id.exo_duration);
        this.f13608b0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f13598R = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f13600S = imageView2;
        ViewOnClickListenerC2238x viewOnClickListenerC2238x = new ViewOnClickListenerC2238x(i10, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC2238x);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f13601T = imageView3;
        ViewOnClickListenerC2239y viewOnClickListenerC2239y = new ViewOnClickListenerC2239y(1, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC2239y);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f13602U = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(bVar);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f13603V = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f13604W = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        InterfaceC2518e interfaceC2518e = (InterfaceC2518e) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC2518e != null) {
            this.f13610c0 = interfaceC2518e;
        } else if (viewFindViewById4 != null) {
            C2515b c2515b = new C2515b(context, attributeSet);
            c2515b.setId(R.id.exo_progress);
            c2515b.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c2515b, iIndexOfChild);
            this.f13610c0 = c2515b;
        } else {
            this.f13610c0 = null;
        }
        InterfaceC2518e interfaceC2518e2 = this.f13610c0;
        if (interfaceC2518e2 != null) {
            interfaceC2518e2.mo7422a(bVar);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.f13582J = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.f13578H = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f13580I = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        Typeface typefaceM15674a = C7906f.m15674a(R.font.roboto_medium_numbers, context);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.f13590N = textView;
        if (textView != null) {
            textView.setTypeface(typefaceM15674a);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f13586L = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(bVar);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.f13588M = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceM15674a);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f13584K = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(bVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f13592O = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(bVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f13594P = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(bVar);
        }
        Resources resources = context.getResources();
        this.f13607b = resources;
        boolean z19 = z17;
        this.f13633q0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f13634r0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.f13596Q = viewFindViewById10;
        if (viewFindViewById10 != null) {
            m7441l(viewFindViewById10, false);
        }
        C9701o c9701o = new C9701o(this);
        this.f13605a = c9701o;
        c9701o.f49639C = z10;
        boolean z20 = z16;
        g gVar = new g(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_speed), C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f13615f = gVar;
        this.f13627l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f13613e = recyclerView;
        recyclerView.setAdapter(gVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f13625k = popupWindow;
        if (C10134c0.f51354a < 23) {
            z18 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z18 = false;
        }
        popupWindow.setOnDismissListener(bVar);
        this.f13599R0 = true;
        this.f13623j = new C9690d(getResources());
        this.f13637u0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.f13638v0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.f13639w0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f13640x0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f13619h = new i();
        this.f13621i = new a();
        this.f13617g = new d(resources.getStringArray(R.array.exo_controls_playback_speeds), f13570S0);
        this.f13641y0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.f13642z0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.f13622i0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.f13624j0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.f13626k0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.f13631o0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.f13632p0 = C10134c0.m19049p(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.f13571A0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f13572B0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f13628l0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f13629m0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f13630n0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f13635s0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f13636t0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c9701o.m18210h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c9701o.m18210h(viewFindViewById9, z12);
        c9701o.m18210h(viewFindViewById8, z11);
        c9701o.m18210h(viewFindViewById6, z13);
        c9701o.m18210h(viewFindViewById7, z14);
        c9701o.m18210h(imageView5, z20);
        c9701o.m18210h(imageView, z19);
        c9701o.m18210h(viewFindViewById10, z15);
        c9701o.m18210h(imageView4, this.f13587L0 == 0 ? z18 : true);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: va.f
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                C2517d c2517d = this.f49618a;
                c2517d.getClass();
                int i19 = i14 - i12;
                int i20 = i18 - i16;
                if (i13 - i11 != i17 - i15 || i19 != i20) {
                    PopupWindow popupWindow2 = c2517d.f13625k;
                    if (popupWindow2.isShowing()) {
                        c2517d.m7447r();
                        int width = c2517d.getWidth() - popupWindow2.getWidth();
                        int i21 = c2517d.f13627l;
                        popupWindow2.update(view, width - i21, (-popupWindow2.getHeight()) - i21, -1, -1);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m7430a(C2517d c2517d) {
        if (c2517d.f13574D0 == null) {
            return;
        }
        boolean z10 = !c2517d.f13575E0;
        c2517d.f13575E0 = z10;
        String str = c2517d.f13571A0;
        Drawable drawable = c2517d.f13641y0;
        String str2 = c2517d.f13572B0;
        Drawable drawable2 = c2517d.f13642z0;
        ImageView imageView = c2517d.f13600S;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        boolean z11 = c2517d.f13575E0;
        ImageView imageView2 = c2517d.f13601T;
        if (imageView2 != null) {
            if (z11) {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            } else {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            }
        }
        c cVar = c2517d.f13574D0;
        if (cVar != null) {
            StyledPlayerView.access$1500(StyledPlayerView.this);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7432c(InterfaceC2532v interfaceC2532v, AbstractC2382c0.c cVar) {
        AbstractC2382c0 currentTimeline;
        int iMo6909o;
        if (!interfaceC2532v.isCommandAvailable(17) || (iMo6909o = (currentTimeline = interfaceC2532v.getCurrentTimeline()).mo6909o()) <= 1 || iMo6909o > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iMo6909o; i10++) {
            if (currentTimeline.m6908m(i10, cVar).f12087I == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m7433e(InterfaceC2532v interfaceC2532v) {
        int playbackState = interfaceC2532v.getPlaybackState();
        if (playbackState == 1 && interfaceC2532v.isCommandAvailable(2)) {
            interfaceC2532v.prepare();
        } else if (playbackState == 4 && interfaceC2532v.isCommandAvailable(4)) {
            interfaceC2532v.seekToDefaultPosition();
        }
        if (interfaceC2532v.isCommandAvailable(1)) {
            interfaceC2532v.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f3) {
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        if (interfaceC2532v == null || !interfaceC2532v.isCommandAvailable(13)) {
            return;
        }
        InterfaceC2532v interfaceC2532v2 = this.f13573C0;
        interfaceC2532v2.setPlaybackParameters(new C2505u(f3, interfaceC2532v2.getPlaybackParameters().f13475b));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX INFO: renamed from: d */
    public final boolean m7434d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        if (interfaceC2532v != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (interfaceC2532v.getPlaybackState() != 4 && interfaceC2532v.isCommandAvailable(12)) {
                            interfaceC2532v.seekForward();
                        }
                    } else if (keyCode == 89 && interfaceC2532v.isCommandAvailable(11)) {
                        interfaceC2532v.seekBack();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int playbackState = interfaceC2532v.getPlaybackState();
                            if (playbackState == 1 || playbackState == 4 || !interfaceC2532v.getPlayWhenReady()) {
                                m7433e(interfaceC2532v);
                            } else if (interfaceC2532v.isCommandAvailable(1)) {
                                interfaceC2532v.pause();
                            }
                        } else if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode == 126) {
                                    m7433e(interfaceC2532v);
                                } else if (keyCode == 127) {
                                    if (interfaceC2532v.isCommandAvailable(1)) {
                                        interfaceC2532v.pause();
                                    }
                                }
                            } else if (interfaceC2532v.isCommandAvailable(7)) {
                                interfaceC2532v.seekToPrevious();
                            }
                        } else if (interfaceC2532v.isCommandAvailable(9)) {
                            interfaceC2532v.seekToNext();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7434d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public final void m7435f(RecyclerView.Adapter<?> adapter, View view) {
        this.f13613e.setAdapter(adapter);
        m7447r();
        this.f13599R0 = false;
        PopupWindow popupWindow = this.f13625k;
        popupWindow.dismiss();
        this.f13599R0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.f13627l;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    /* JADX INFO: renamed from: g */
    public final ImmutableList<j> m7436g(C2384d0 c2384d0, int i10) {
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        ImmutableList<C2384d0.a> immutableList = c2384d0.f12105a;
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            C2384d0.a aVar = immutableList.get(i11);
            if (aVar.f12111b.f34802c == i10) {
                for (int i12 = 0; i12 < aVar.f12110a; i12++) {
                    if (aVar.f12113d[i12] == 4) {
                        C2416m c2416m = aVar.f12111b.f34803d[i12];
                        if ((c2416m.f12476d & 2) == 0) {
                            c3146a.m9055b(new j(c2384d0, i11, i12, this.f13623j.mo18197a(c2416m)));
                        }
                    }
                }
            }
        }
        return c3146a.m9068e();
    }

    public InterfaceC2532v getPlayer() {
        return this.f13573C0;
    }

    public int getRepeatToggleModes() {
        return this.f13587L0;
    }

    public boolean getShowShuffleButton() {
        return this.f13605a.m18207c(this.f13594P);
    }

    public boolean getShowSubtitleButton() {
        return this.f13605a.m18207c(this.f13598R);
    }

    public int getShowTimeoutMs() {
        return this.f13583J0;
    }

    public boolean getShowVrButton() {
        return this.f13605a.m18207c(this.f13596Q);
    }

    /* JADX INFO: renamed from: h */
    public final void m7437h() {
        C9701o c9701o = this.f13605a;
        int i10 = c9701o.f49665z;
        if (i10 != 3 && i10 != 2) {
            c9701o.m18208f();
            if (!c9701o.f49639C) {
                c9701o.m18211i(2);
            } else if (c9701o.f49665z == 1) {
                c9701o.f49652m.start();
            } else {
                c9701o.f49653n.start();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7438i() {
        C9701o c9701o = this.f13605a;
        return c9701o.f49665z == 0 && c9701o.f49640a.m7439j();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7439j() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m7440k() {
        m7443n();
        m7442m();
        m7446q();
        m7448s();
        m7450u();
        m7444o();
        m7449t();
    }

    /* JADX INFO: renamed from: l */
    public final void m7441l(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f13633q0 : this.f13634r0);
    }

    /* JADX INFO: renamed from: m */
    public final void m7442m() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (m7439j()) {
            if (!this.f13576F0) {
                return;
            }
            InterfaceC2532v interfaceC2532v = this.f13573C0;
            if (interfaceC2532v != null) {
                zIsCommandAvailable2 = (this.f13577G0 && m7432c(interfaceC2532v, this.f13618g0)) ? interfaceC2532v.isCommandAvailable(10) : interfaceC2532v.isCommandAvailable(5);
                zIsCommandAvailable3 = interfaceC2532v.isCommandAvailable(7);
                zIsCommandAvailable4 = interfaceC2532v.isCommandAvailable(11);
                zIsCommandAvailable5 = interfaceC2532v.isCommandAvailable(12);
                zIsCommandAvailable = interfaceC2532v.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.f13607b;
            View view = this.f13586L;
            if (zIsCommandAvailable4) {
                InterfaceC2532v interfaceC2532v2 = this.f13573C0;
                int seekBackIncrement = (int) ((interfaceC2532v2 != null ? interfaceC2532v2.getSeekBackIncrement() : 5000L) / 1000);
                TextView textView = this.f13590N;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view2 = this.f13584K;
            if (zIsCommandAvailable5) {
                InterfaceC2532v interfaceC2532v3 = this.f13573C0;
                int seekForwardIncrement = (int) ((interfaceC2532v3 != null ? interfaceC2532v3.getSeekForwardIncrement() : 15000L) / 1000);
                TextView textView2 = this.f13588M;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            m7441l(this.f13578H, zIsCommandAvailable3);
            m7441l(view, zIsCommandAvailable4);
            m7441l(view2, zIsCommandAvailable5);
            m7441l(this.f13580I, zIsCommandAvailable);
            InterfaceC2518e interfaceC2518e = this.f13610c0;
            if (interfaceC2518e != null) {
                interfaceC2518e.setEnabled(zIsCommandAvailable2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7443n() {
        if (m7439j()) {
            if (!this.f13576F0) {
                return;
            }
            View view = this.f13582J;
            if (view != null) {
                InterfaceC2532v interfaceC2532v = this.f13573C0;
                boolean z10 = true;
                boolean z11 = (interfaceC2532v == null || interfaceC2532v.getPlaybackState() == 4 || this.f13573C0.getPlaybackState() == 1 || !this.f13573C0.getPlayWhenReady()) ? false : true;
                int i10 = z11 ? R.drawable.exo_styled_controls_pause : R.drawable.exo_styled_controls_play;
                int i11 = z11 ? R.string.exo_controls_pause_description : R.string.exo_controls_play_description;
                Context context = getContext();
                Resources resources = this.f13607b;
                ((ImageView) view).setImageDrawable(C10134c0.m19049p(context, resources, i10));
                view.setContentDescription(resources.getString(i11));
                InterfaceC2532v interfaceC2532v2 = this.f13573C0;
                if (interfaceC2532v2 == null || !interfaceC2532v2.isCommandAvailable(1) || (this.f13573C0.isCommandAvailable(17) && this.f13573C0.getCurrentTimeline().m6910p())) {
                    z10 = false;
                }
                m7441l(view, z10);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7444o() {
        d dVar;
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        if (interfaceC2532v == null) {
            return;
        }
        float f3 = interfaceC2532v.getPlaybackParameters().f13474a;
        boolean z10 = false;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            dVar = this.f13617g;
            float[] fArr = dVar.f13646e;
            if (i10 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f3 - fArr[i10]);
            if (fAbs < f10) {
                i11 = i10;
                f10 = fAbs;
            }
            i10++;
        }
        dVar.f13647f = i11;
        String str = dVar.f13645d[i11];
        g gVar = this.f13615f;
        gVar.f13655e[0] = str;
        if (gVar.m7458p(1) || gVar.m7458p(0)) {
            z10 = true;
        }
        m7441l(this.f13602U, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9701o c9701o = this.f13605a;
        c9701o.f49640a.addOnLayoutChangeListener(c9701o.f49663x);
        this.f13576F0 = true;
        if (m7438i()) {
            c9701o.m18209g();
        }
        m7440k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9701o c9701o = this.f13605a;
        c9701o.f49640a.removeOnLayoutChangeListener(c9701o.f49663x);
        this.f13576F0 = false;
        removeCallbacks(this.f13620h0);
        c9701o.m18208f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f13605a.f49641b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7445p() {
        long contentPosition;
        long contentBufferedPosition;
        if (m7439j() && this.f13576F0) {
            InterfaceC2532v interfaceC2532v = this.f13573C0;
            if (interfaceC2532v == null || !interfaceC2532v.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = interfaceC2532v.getContentPosition() + this.f13597Q0;
                contentBufferedPosition = interfaceC2532v.getContentBufferedPosition() + this.f13597Q0;
            }
            TextView textView = this.f13608b0;
            if (textView != null && !this.f13581I0) {
                textView.setText(C10134c0.m19058y(this.f13612d0, this.f13614e0, contentPosition));
            }
            InterfaceC2518e interfaceC2518e = this.f13610c0;
            if (interfaceC2518e != null) {
                interfaceC2518e.setPosition(contentPosition);
                interfaceC2518e.setBufferedPosition(contentBufferedPosition);
            }
            RunnableC0183b runnableC0183b = this.f13620h0;
            removeCallbacks(runnableC0183b);
            int playbackState = interfaceC2532v == null ? 1 : interfaceC2532v.getPlaybackState();
            if (interfaceC2532v != null && interfaceC2532v.isPlaying()) {
                long jMin = Math.min(interfaceC2518e != null ? interfaceC2518e.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f3 = interfaceC2532v.getPlaybackParameters().f13474a;
                postDelayed(runnableC0183b, C10134c0.m19042i(f3 > 0.0f ? (long) (jMin / f3) : 1000L, this.f13585K0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(runnableC0183b, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7446q() {
        if (m7439j() && this.f13576F0) {
            ImageView imageView = this.f13592O;
            if (imageView == null) {
                return;
            }
            if (this.f13587L0 == 0) {
                m7441l(imageView, false);
                return;
            }
            InterfaceC2532v interfaceC2532v = this.f13573C0;
            String str = this.f13628l0;
            Drawable drawable = this.f13622i0;
            if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(15)) {
                m7441l(imageView, true);
                int repeatMode = interfaceC2532v.getRepeatMode();
                if (repeatMode == 0) {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                    return;
                } else if (repeatMode == 1) {
                    imageView.setImageDrawable(this.f13624j0);
                    imageView.setContentDescription(this.f13629m0);
                    return;
                } else {
                    if (repeatMode != 2) {
                        return;
                    }
                    imageView.setImageDrawable(this.f13626k0);
                    imageView.setContentDescription(this.f13630n0);
                    return;
                }
            }
            m7441l(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7447r() {
        RecyclerView recyclerView = this.f13613e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.f13627l;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.f13625k;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: s */
    public final void m7448s() {
        if (m7439j() && this.f13576F0) {
            ImageView imageView = this.f13594P;
            if (imageView == null) {
                return;
            }
            InterfaceC2532v interfaceC2532v = this.f13573C0;
            if (!this.f13605a.m18207c(imageView)) {
                m7441l(imageView, false);
                return;
            }
            String str = this.f13636t0;
            Drawable drawable = this.f13632p0;
            if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(14)) {
                m7441l(imageView, true);
                if (interfaceC2532v.getShuffleModeEnabled()) {
                    drawable = this.f13631o0;
                }
                imageView.setImageDrawable(drawable);
                if (interfaceC2532v.getShuffleModeEnabled()) {
                    str = this.f13635s0;
                }
                imageView.setContentDescription(str);
                return;
            }
            m7441l(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f13605a.f49639C = z10;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(c cVar) {
        this.f13574D0 = cVar;
        boolean z10 = cVar != null;
        ImageView imageView = this.f13600S;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z11 = cVar != null;
        ImageView imageView2 = this.f13601T;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC2532v interfaceC2532v) {
        boolean z10 = true;
        C10129a.m18992d(Looper.myLooper() == Looper.getMainLooper());
        if (interfaceC2532v != null && interfaceC2532v.getApplicationLooper() != Looper.getMainLooper()) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        InterfaceC2532v interfaceC2532v2 = this.f13573C0;
        if (interfaceC2532v2 == interfaceC2532v) {
            return;
        }
        b bVar = this.f13609c;
        if (interfaceC2532v2 != null) {
            interfaceC2532v2.removeListener(bVar);
        }
        this.f13573C0 = interfaceC2532v;
        if (interfaceC2532v != null) {
            interfaceC2532v.addListener(bVar);
        }
        m7440k();
    }

    public void setProgressUpdateListener(e eVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f13587L0 = i10;
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        boolean z10 = false;
        if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(15)) {
            int repeatMode = this.f13573C0.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f13573C0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f13573C0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f13573C0.setRepeatMode(2);
            }
        }
        if (i10 != 0) {
            z10 = true;
        }
        this.f13605a.m18210h(this.f13592O, z10);
        m7446q();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f13605a.m18210h(this.f13584K, z10);
        m7442m();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f13577G0 = z10;
        m7449t();
    }

    public void setShowNextButton(boolean z10) {
        this.f13605a.m18210h(this.f13580I, z10);
        m7442m();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f13605a.m18210h(this.f13578H, z10);
        m7442m();
    }

    public void setShowRewindButton(boolean z10) {
        this.f13605a.m18210h(this.f13586L, z10);
        m7442m();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f13605a.m18210h(this.f13594P, z10);
        m7448s();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f13605a.m18210h(this.f13598R, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f13583J0 = i10;
        if (m7438i()) {
            this.f13605a.m18209g();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f13605a.m18210h(this.f13596Q, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f13585K0 = C10134c0.m19041h(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f13596Q;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m7441l(view, onClickListener != null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x015e  */
    /* JADX INFO: renamed from: t */
    public final void m7449t() {
        long jM19026K;
        long j10;
        int i10;
        AbstractC2382c0 abstractC2382c0;
        AbstractC2382c0 abstractC2382c1;
        boolean z10;
        boolean z11;
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        if (interfaceC2532v == null) {
            return;
        }
        boolean z12 = this.f13577G0;
        boolean z13 = false;
        boolean z14 = true;
        AbstractC2382c0.c cVar = this.f13618g0;
        this.f13579H0 = z12 && m7432c(interfaceC2532v, cVar);
        this.f13597Q0 = 0L;
        AbstractC2382c0 currentTimeline = interfaceC2532v.isCommandAvailable(17) ? interfaceC2532v.getCurrentTimeline() : AbstractC2382c0.f12057a;
        long j11 = -9223372036854775807L;
        if (currentTimeline.m6910p()) {
            if (interfaceC2532v.isCommandAvailable(16)) {
                long contentDuration = interfaceC2532v.getContentDuration();
                if (contentDuration != -9223372036854775807L) {
                    jM19026K = C10134c0.m19026K(contentDuration);
                } else {
                    jM19026K = 0;
                }
            } else {
                jM19026K = 0;
            }
            j10 = jM19026K;
            i10 = 0;
        } else {
            int currentMediaItemIndex = interfaceC2532v.getCurrentMediaItemIndex();
            boolean z15 = this.f13579H0;
            int i11 = z15 ? 0 : currentMediaItemIndex;
            int iMo6909o = z15 ? currentTimeline.mo6909o() - 1 : currentMediaItemIndex;
            i10 = 0;
            j10 = 0;
            while (i11 <= iMo6909o) {
                if (i11 == currentMediaItemIndex) {
                    this.f13597Q0 = C10134c0.m19033R(j10);
                }
                currentTimeline.m6908m(i11, cVar);
                if (cVar.f12087I == j11) {
                    C10129a.m18992d(this.f13579H0 ^ z14);
                    break;
                }
                int i12 = cVar.f12088J;
                while (i12 <= cVar.f12089K) {
                    AbstractC2382c0.b bVar = this.f13616f0;
                    currentTimeline.mo6777f(i12, bVar, z13);
                    C2473a c2473a = bVar.f12069g;
                    int i13 = c2473a.f13044e;
                    while (i13 < c2473a.f13041b) {
                        long jM6914d = bVar.m6914d(i13);
                        int i14 = currentMediaItemIndex;
                        if (jM6914d == Long.MIN_VALUE) {
                            abstractC2382c0 = currentTimeline;
                            long j12 = bVar.f12066d;
                            if (j12 == j11) {
                                abstractC2382c1 = abstractC2382c0;
                            } else {
                                jM6914d = j12;
                            }
                            i13++;
                            currentMediaItemIndex = i14;
                            currentTimeline = abstractC2382c1;
                            j11 = -9223372036854775807L;
                        } else {
                            abstractC2382c0 = currentTimeline;
                        }
                        long j13 = jM6914d + bVar.f12067e;
                        if (j13 >= 0) {
                            long[] jArr = this.f13589M0;
                            if (i10 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f13589M0 = Arrays.copyOf(jArr, length);
                                this.f13591N0 = Arrays.copyOf(this.f13591N0, length);
                            }
                            this.f13589M0[i10] = C10134c0.m19033R(j10 + j13);
                            boolean[] zArr = this.f13591N0;
                            C2473a.a aVarM7248a = bVar.f12069g.m7248a(i13);
                            int i15 = aVarM7248a.f13056b;
                            if (i15 == -1) {
                                abstractC2382c1 = abstractC2382c0;
                            } else {
                                int i16 = 0;
                                while (true) {
                                    abstractC2382c1 = abstractC2382c0;
                                    if (i16 < i15) {
                                        int i17 = aVarM7248a.f13059e[i16];
                                        if (i17 != 0) {
                                            C2473a.a aVar = aVarM7248a;
                                            z10 = true;
                                            if (i17 != 1) {
                                                i16++;
                                                abstractC2382c0 = abstractC2382c1;
                                                aVarM7248a = aVar;
                                            }
                                        }
                                        z11 = z10;
                                    } else {
                                        z10 = true;
                                        z11 = false;
                                    }
                                    zArr[i10] = z11 ^ z10;
                                    i10++;
                                }
                            }
                            z10 = true;
                            z11 = z10;
                            zArr[i10] = z11 ^ z10;
                            i10++;
                        } else {
                            abstractC2382c1 = abstractC2382c0;
                        }
                        i13++;
                        currentMediaItemIndex = i14;
                        currentTimeline = abstractC2382c1;
                        j11 = -9223372036854775807L;
                    }
                    i12++;
                    z14 = true;
                    currentTimeline = currentTimeline;
                    z13 = false;
                    j11 = -9223372036854775807L;
                }
                j10 += cVar.f12087I;
                i11++;
                z14 = z14;
                currentTimeline = currentTimeline;
                z13 = false;
                j11 = -9223372036854775807L;
            }
        }
        long jM19033R = C10134c0.m19033R(j10);
        TextView textView = this.f13606a0;
        if (textView != null) {
            textView.setText(C10134c0.m19058y(this.f13612d0, this.f13614e0, jM19033R));
        }
        InterfaceC2518e interfaceC2518e = this.f13610c0;
        if (interfaceC2518e != null) {
            interfaceC2518e.setDuration(jM19033R);
            int length2 = this.f13593O0.length;
            int i18 = i10 + length2;
            long[] jArr2 = this.f13589M0;
            if (i18 > jArr2.length) {
                this.f13589M0 = Arrays.copyOf(jArr2, i18);
                this.f13591N0 = Arrays.copyOf(this.f13591N0, i18);
            }
            System.arraycopy(this.f13593O0, 0, this.f13589M0, i10, length2);
            System.arraycopy(this.f13595P0, 0, this.f13591N0, i10, length2);
            interfaceC2518e.mo7423b(this.f13589M0, this.f13591N0, i18);
        }
        m7445p();
    }

    /* JADX INFO: renamed from: u */
    public final void m7450u() {
        i iVar = this.f13619h;
        iVar.getClass();
        iVar.f13664d = Collections.emptyList();
        a aVar = this.f13621i;
        aVar.getClass();
        aVar.f13664d = Collections.emptyList();
        InterfaceC2532v interfaceC2532v = this.f13573C0;
        ImageView imageView = this.f13598R;
        if (interfaceC2532v != null && interfaceC2532v.isCommandAvailable(30) && this.f13573C0.isCommandAvailable(29)) {
            C2384d0 currentTracks = this.f13573C0.getCurrentTracks();
            ImmutableList<j> immutableListM7436g = m7436g(currentTracks, 1);
            aVar.f13664d = immutableListM7436g;
            C2517d c2517d = C2517d.this;
            InterfaceC2532v interfaceC2532v2 = c2517d.f13573C0;
            interfaceC2532v2.getClass();
            C9508q trackSelectionParameters = interfaceC2532v2.getTrackSelectionParameters();
            boolean zIsEmpty = immutableListM7436g.isEmpty();
            g gVar = c2517d.f13615f;
            if (zIsEmpty) {
                gVar.f13655e[1] = c2517d.getResources().getString(R.string.exo_track_selection_none);
            } else if (aVar.m7453s(trackSelectionParameters)) {
                for (int i10 = 0; i10 < immutableListM7436g.size(); i10++) {
                    j jVar = immutableListM7436g.get(i10);
                    if (jVar.f13661a.f12114e[jVar.f13662b]) {
                        gVar.f13655e[1] = jVar.f13663c;
                        break;
                    }
                }
            } else {
                gVar.f13655e[1] = c2517d.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f13605a.m18207c(imageView)) {
                iVar.m7460s(m7436g(currentTracks, 3));
            } else {
                iVar.m7460s(ImmutableList.m9062Y());
            }
        }
        m7441l(imageView, iVar.mo4226e() > 0);
        g gVar2 = this.f13615f;
        m7441l(this.f13602U, gVar2.m7458p(1) || gVar2.m7458p(0));
    }
}
