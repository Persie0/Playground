package com.lingq.p055ui.home.playlist;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import bj.AbstractC1577a;
import bj.C1586i;
import bj.ViewOnClickListenerC1585h;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.text.C7076b;
import mo.C7661i;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8281f1;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/home/playlist/PlaylistAddFragment;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistAddFragment extends AbstractC1577a {

    /* JADX INFO: renamed from: T0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f25416T0 = {C0204c.m857q(PlaylistAddFragment.class, "getBinding()Lcom/lingq/databinding/FragmentPlaylistAddBinding;")};

    /* JADX INFO: renamed from: Q0 */
    public final FragmentViewBindingDelegate f25417Q0 = C4924a.m10477o0(this, PlaylistAddFragment$binding$2.f25420j);

    /* JADX INFO: renamed from: R0 */
    public final C1038i0 f25418R0;

    /* JADX INFO: renamed from: S0 */
    public final C1681f f25419S0;

    public PlaylistAddFragment() {
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f25439b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f25418R0 = C8573r0.m16711Z(this, C5209i.m11118a(PlaylistAddViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f25419S0 = new C1681f(C5209i.m11118a(C1586i.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.home.playlist.PlaylistAddFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public static void m9976u0(PlaylistAddFragment playlistAddFragment) {
        C5207g.m11111f(playlistAddFragment, "this$0");
        String string = C7076b.m14277B3(String.valueOf(playlistAddFragment.m9978w0().f44762c.getText())).toString();
        if (!C7661i.m15250P2(string)) {
            if (playlistAddFragment.m9977v0().f9067b) {
                if (playlistAddFragment.m9977v0().f9068c != 0 && (!C7661i.m15250P2(playlistAddFragment.m9977v0().f9069d))) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("value", true);
                    C0987y.m3824f(bundle, playlistAddFragment, "shouldCloseAfterAdding");
                }
                PlaylistAddViewModel playlistAddViewModelM9979x0 = playlistAddFragment.m9979x0();
                C7828f.m15570d(C8573r0.m16767w0(playlistAddViewModelM9979x0), playlistAddViewModelM9979x0.f25441e, null, new PlaylistAddViewModel$addPlaylist$1(playlistAddViewModelM9979x0, string, null), 2);
            } else if (playlistAddFragment.m9977v0().f9067b || C5207g.m11106a(string, playlistAddFragment.m9977v0().f9066a)) {
                C8573r0.m16725g0(playlistAddFragment).m3995p();
            } else {
                PlaylistAddViewModel playlistAddViewModelM9979x1 = playlistAddFragment.m9979x0();
                String str = playlistAddFragment.m9977v0().f9066a;
                C5207g.m11111f(str, "oldName");
                C7828f.m15570d(C8573r0.m16767w0(playlistAddViewModelM9979x1), playlistAddViewModelM9979x1.f25441e, null, new PlaylistAddViewModel$updatePlaylist$1(playlistAddViewModelM9979x1, string, str, null), 2);
            }
        }
        List<Integer> list = C6716m.f37937a;
        C6716m.m13321f(playlistAddFragment.m3578a0(), playlistAddFragment.m3580c0());
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_playlist_add, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        if (!m9977v0().f9067b) {
            m9978w0().f44763d.setText(m3600t(R.string.playlists_update_playlist));
            m9978w0().f44762c.setText(m9977v0().f9066a);
        }
        m9978w0().f44760a.setOnClickListener(new ViewOnClickListenerC1585h(0, this));
        m9978w0().f44761b.setOnClickListener(new ViewOnClickListenerC2238x(8, this));
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C3892x9a5df242(this, Lifecycle.State.STARTED, null, this), 3);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: o0 */
    public final int mo3768o0() {
        return R.style.AppTheme_BottomSheetDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final C1586i m9977v0() {
        return (C1586i) this.f25419S0.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    public final C8281f1 m9978w0() {
        return (C8281f1) this.f25417Q0.m10489a(this, f25416T0[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public final PlaylistAddViewModel m9979x0() {
        return (PlaylistAddViewModel) this.f25418R0.getValue();
    }
}
