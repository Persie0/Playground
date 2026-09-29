package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.C1165p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$6", m19206f = "PlaylistFragment.kt", m19207l = {422}, m19208m = "invokeSuspend")
public final class PlaylistFragment$onViewCreated$2$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25539e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistFragment f25540f;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistFragment$onViewCreated$2$6$1", m19206f = "PlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39111 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f25541e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistFragment f25542f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39111(PlaylistFragment playlistFragment, InterfaceC9968c<? super C39111> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25542f = playlistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39111 c39111 = new C39111(this.f25542f, interfaceC9968c);
            c39111.f25541e = ((Boolean) obj).booleanValue();
            return c39111;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39111) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f25541e;
            PlaylistFragment playlistFragment = this.f25542f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
                ImageButton imageButton = playlistFragment.m9981o0().f45450c;
                C5207g.m11110e(imageButton, "binding.btnEdit");
                C4924a.m10422A(imageButton);
                ImageButton imageButton2 = playlistFragment.m9981o0().f45451d;
                C5207g.m11110e(imageButton2, "binding.btnMenu");
                C4924a.m10422A(imageButton2);
                TextView textView = playlistFragment.m9981o0().f45457j;
                C5207g.m11110e(textView, "binding.tvDone");
                C4924a.m10457e0(textView);
                C1165p c1165p = playlistFragment.f25458A0;
                if (c1165p == null) {
                    C5207g.m11117l("itemTouchHelper");
                    throw null;
                }
                c1165p.m4508i(playlistFragment.m9981o0().f45454g);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = PlaylistFragment.f25457H0;
                ImageButton imageButton3 = playlistFragment.m9981o0().f45450c;
                C5207g.m11110e(imageButton3, "binding.btnEdit");
                C4924a.m10457e0(imageButton3);
                ImageButton imageButton4 = playlistFragment.m9981o0().f45451d;
                C5207g.m11110e(imageButton4, "binding.btnMenu");
                C4924a.m10457e0(imageButton4);
                TextView textView2 = playlistFragment.m9981o0().f45457j;
                C5207g.m11110e(textView2, "binding.tvDone");
                C4924a.m10422A(textView2);
                C1165p c1165p2 = playlistFragment.f25458A0;
                if (c1165p2 == null) {
                    C5207g.m11117l("itemTouchHelper");
                    throw null;
                }
                c1165p2.m4508i(null);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFragment$onViewCreated$2$6(PlaylistFragment playlistFragment, InterfaceC9968c<? super PlaylistFragment$onViewCreated$2$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25540f = playlistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistFragment$onViewCreated$2$6(this.f25540f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistFragment$onViewCreated$2$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25539e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = PlaylistFragment.f25457H0;
            PlaylistFragment playlistFragment = this.f25540f;
            PlaylistViewModel playlistViewModelM9984r0 = playlistFragment.m9984r0();
            C39111 c39111 = new C39111(playlistFragment, null);
            this.f25539e = 1;
            if (C0062b.m369m0(playlistViewModelM9984r0.f25627s0, c39111, this) == coroutineSingletons) {
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
