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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistsViewModel$addCourseToPlaylist$1", m19206f = "PlaylistsViewModel.kt", m19207l = {131}, m19208m = "invokeSuspend")
final class PlaylistsViewModel$addCourseToPlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25902e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistsViewModel f25903f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25904g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f25905h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f25906i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f25907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsViewModel$addCourseToPlaylist$1(PlaylistsViewModel playlistsViewModel, String str, int i10, String str2, int i11, InterfaceC9968c<? super PlaylistsViewModel$addCourseToPlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25903f = playlistsViewModel;
        this.f25904g = str;
        this.f25905h = i10;
        this.f25906i = str2;
        this.f25907j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistsViewModel$addCourseToPlaylist$1(this.f25903f, this.f25904g, this.f25905h, this.f25906i, this.f25907j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistsViewModel$addCourseToPlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25902e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            PlaylistsViewModel playlistsViewModel = this.f25903f;
            InterfaceC2019l interfaceC2019l = playlistsViewModel.f25893d;
            String strMo498E1 = playlistsViewModel.mo498E1();
            String str = this.f25904g;
            int i11 = this.f25905h;
            String str2 = this.f25906i;
            int i12 = this.f25907j;
            this.f25902e = 1;
            if (interfaceC2019l.mo6127v(i11, i12, strMo498E1, str, str2, this) == coroutineSingletons) {
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
