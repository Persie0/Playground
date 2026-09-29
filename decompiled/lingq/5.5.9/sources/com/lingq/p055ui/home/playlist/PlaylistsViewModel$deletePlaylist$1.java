package com.lingq.p055ui.home.playlist;

import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$deletePlaylist$1", m19206f = "PlaylistsViewModel.kt", m19207l = {145}, m19208m = "invokeSuspend")
final class PlaylistsViewModel$deletePlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25914e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsViewModel f25915f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25916g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25917h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f25918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsViewModel$deletePlaylist$1(PlaylistsViewModel playlistsViewModel, String str, String str2, int i10, InterfaceC9968c<? super PlaylistsViewModel$deletePlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25915f = playlistsViewModel;
        this.f25916g = str;
        this.f25917h = str2;
        this.f25918i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsViewModel$deletePlaylist$1(this.f25915f, this.f25916g, this.f25917h, this.f25918i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsViewModel$deletePlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25914e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2019l interfaceC2019l = this.f25915f.f25893d;
            this.f25914e = 1;
            if (interfaceC2019l.mo6106a(this.f25918i, this.f25916g, this.f25917h, this) == coroutineSingletons) {
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
