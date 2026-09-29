package com.lingq.p055ui.home.playlist;

import ci.InterfaceC2019l;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$updatePlaylistLessons$2", m19206f = "PlaylistViewModel.kt", m19207l = {723}, m19208m = "invokeSuspend")
final class PlaylistViewModel$updatePlaylistLessons$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25845e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25846f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25847g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25848h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$updatePlaylistLessons$2(int i10, PlaylistViewModel playlistViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25846f = playlistViewModel;
        this.f25847g = i10;
        this.f25848h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$updatePlaylistLessons$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$updatePlaylistLessons$2(this.f25847g, this.f25846f, this.f25848h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25845e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25846f;
                InterfaceC2019l interfaceC2019l = playlistViewModel.f25603d;
                String strMo498E1 = playlistViewModel.mo498E1();
                int i11 = this.f25847g;
                String str = this.f25848h;
                this.f25845e = 1;
                if (interfaceC2019l.mo6102H(i11, strMo498E1, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
