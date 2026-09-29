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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$removeLessonFromPlaylist$1", m19206f = "PlaylistsViewModel.kt", m19207l = {150}, m19208m = "invokeSuspend")
final class PlaylistsViewModel$removeLessonFromPlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25931e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsViewModel f25932f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25933g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f25934h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f25935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsViewModel$removeLessonFromPlaylist$1(PlaylistsViewModel playlistsViewModel, String str, int i10, int i11, InterfaceC9968c<? super PlaylistsViewModel$removeLessonFromPlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25932f = playlistsViewModel;
        this.f25933g = str;
        this.f25934h = i10;
        this.f25935i = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsViewModel$removeLessonFromPlaylist$1(this.f25932f, this.f25933g, this.f25934h, this.f25935i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsViewModel$removeLessonFromPlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25931e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistsViewModel playlistsViewModel = this.f25932f;
            InterfaceC2019l interfaceC2019l = playlistsViewModel.f25893d;
            String strMo498E1 = playlistsViewModel.mo498E1();
            String str = this.f25933g;
            int i11 = this.f25934h;
            int i12 = this.f25935i;
            this.f25931e = 1;
            if (interfaceC2019l.mo6108c(i11, i12, strMo498E1, str, this) == coroutineSingletons) {
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
