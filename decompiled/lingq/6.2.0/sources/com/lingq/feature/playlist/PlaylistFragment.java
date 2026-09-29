package com.lingq.feature.playlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.dua;
import p000.gr3;
import p000.ht6;
import p000.hz4;
import p000.lda;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaylistFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final w41 f27589C0;

    /* JADX INFO: renamed from: D0 */
    public w41 f27590D0;

    public PlaylistFragment() {
        final hz4 hz4Var = new hz4(this, 13);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.playlist.PlaylistFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) hz4Var.mo0a();
            }
        });
        this.f27589C0 = new w41(y38.m24933a(C2255e.class), new ui3() { // from class: com.lingq.feature.playlist.PlaylistFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.playlist.PlaylistFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27594b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.playlist.PlaylistFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(1853647414, true, new ht6(this, 8)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        w41 w41Var = this.f27589C0;
        Object value = ((C2255e) w41Var.getValue()).f27826c.mo9214t2().getValue();
        PlayingFrom playingFrom = PlayingFrom.Playlist;
        if (value != playingFrom) {
            C2255e c2255e = (C2255e) w41Var.getValue();
            c2255e.getClass();
            c2255e.mo9211g0(playingFrom);
            C1808b c1808b = c2255e.f27845v;
            c1808b.m8450M(true);
            c1808b.m8447J();
            wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$resetAndSet$1(c2255e, null), 3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23636i0(this);
    }
}
