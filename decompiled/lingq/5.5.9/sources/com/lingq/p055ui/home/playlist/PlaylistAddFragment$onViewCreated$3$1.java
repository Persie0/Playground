package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.snackbar.Snackbar;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistAddFragment$onViewCreated$3$1", m19206f = "PlaylistAddFragment.kt", m19207l = {77}, m19208m = "invokeSuspend")
public final class PlaylistAddFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25427e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistAddFragment f25428f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistAddFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistAddFragment$onViewCreated$3$1$1", m19206f = "PlaylistAddFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38931 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ PlaylistAddFragment f25429e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38931(PlaylistAddFragment playlistAddFragment, InterfaceC9968c<? super C38931> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25429e = playlistAddFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C38931(this.f25429e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38931) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Window window;
            View decorView;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            PlaylistAddFragment playlistAddFragment = this.f25429e;
            Dialog dialog = playlistAddFragment.f6328G0;
            if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                Snackbar.m8842h(decorView, playlistAddFragment.m3600t(R.string.playlists_edit_name_warning), 0).m8844i();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAddFragment$onViewCreated$3$1(PlaylistAddFragment playlistAddFragment, InterfaceC9968c<? super PlaylistAddFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25428f = playlistAddFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistAddFragment$onViewCreated$3$1(this.f25428f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistAddFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25427e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistAddFragment.f25416T0;
            PlaylistAddFragment playlistAddFragment = this.f25428f;
            PlaylistAddViewModel playlistAddViewModelM9979x0 = playlistAddFragment.m9979x0();
            C38931 c38931 = new C38931(playlistAddFragment, null);
            this.f25427e = 1;
            if (C0062b.m369m0(playlistAddViewModelM9979x0.f25446j, c38931, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
