package com.lingq.feature.playlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C3244l;
import p000.C3368nd;
import p000.c18;
import p000.cs4;
import p000.dta;
import p000.dua;
import p000.gr3;
import p000.hm2;
import p000.or1;
import p000.rt3;
import p000.ui3;
import p000.vz1;
import p000.w41;
import p000.wsa;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionPlaylistFragment extends rt3 {

    /* JADX INFO: renamed from: C0 */
    public final w41 f27526C0;

    /* JADX INFO: renamed from: D0 */
    public w41 f27527D0;

    public CollectionPlaylistFragment() {
        super(R$layout.fragment_collection_playlist, 3);
        final CollectionPlaylistFragment$special$$inlined$viewModels$default$1 collectionPlaylistFragment$special$$inlined$viewModels$default$1 = new CollectionPlaylistFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.playlist.CollectionPlaylistFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) collectionPlaylistFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f27526C0 = new w41(y38.m24933a(C2251a.class), new ui3() { // from class: com.lingq.feature.playlist.CollectionPlaylistFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.playlist.CollectionPlaylistFragment$special$$inlined$viewModels$default$5
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
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f27532b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.playlist.CollectionPlaylistFragment$special$$inlined$viewModels$default$4
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
        return vz1.m23648r(this, new C0282a(-865241354, true, new C3368nd(this, 11)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        w41 w41Var = this.f27526C0;
        Object value = ((C2251a) w41Var.getValue()).f27774c.mo9214t2().getValue();
        PlayingFrom playingFrom = PlayingFrom.CoursePlaylist;
        if (value != playingFrom) {
            C2251a c2251a = (C2251a) w41Var.getValue();
            C1808b c1808b = c2251a.f27784m;
            c18 c18Var = c2251a.f27790s;
            if (!((List) ((C3244l) c18Var.f9311a).getValue()).isEmpty()) {
                c1808b.m8461a0(EmptyList.f47638a);
                c1808b.m8450M(true);
                c2251a.m9208a3((List) ((C3244l) c18Var.f9311a).getValue());
            }
        }
        ((C2251a) w41Var.getValue()).mo9211g0(playingFrom);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        hm2 hm2Var = new hm2(8);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, hm2Var);
        vz1.m23640l0(this);
    }
}
