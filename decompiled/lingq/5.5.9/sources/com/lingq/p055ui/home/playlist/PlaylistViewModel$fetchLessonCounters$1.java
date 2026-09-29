package com.lingq.p055ui.home.playlist;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$fetchLessonCounters$1", m19206f = "PlaylistViewModel.kt", m19207l = {785}, m19208m = "invokeSuspend")
final class PlaylistViewModel$fetchLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25728e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25729f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f25730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$fetchLessonCounters$1(PlaylistViewModel playlistViewModel, List<Integer> list, InterfaceC9968c<? super PlaylistViewModel$fetchLessonCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25729f = playlistViewModel;
        this.f25730g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$fetchLessonCounters$1(this.f25729f, this.f25730g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$fetchLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25728e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                PlaylistViewModel playlistViewModel = this.f25729f;
                InterfaceC2014g interfaceC2014g = playlistViewModel.f25609g;
                String strMo498E1 = playlistViewModel.mo498E1();
                List<Integer> list = this.f25730g;
                this.f25728e = 1;
                if (interfaceC2014g.mo6061g(strMo498E1, list, this) == coroutineSingletons) {
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
