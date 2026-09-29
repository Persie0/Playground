package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import ki.C6697c;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$setSelectedLesson$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class PlaylistViewModel$setSelectedLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f25820e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25821f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25822g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setSelectedLesson$1(boolean z10, PlaylistViewModel playlistViewModel, int i10, InterfaceC9968c<? super PlaylistViewModel$setSelectedLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25820e = z10;
        this.f25821f = playlistViewModel;
        this.f25822g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$setSelectedLesson$1(this.f25820e, this.f25821f, this.f25822g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$setSelectedLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        boolean z10 = this.f25820e;
        Object obj2 = null;
        int i10 = this.f25822g;
        PlaylistViewModel playlistViewModel = this.f25821f;
        if (z10) {
            List list = (List) playlistViewModel.f25600a0.get(new Integer(i10));
            if (list != null) {
                for (Object obj3 : list) {
                    if (((C6697c) obj3).f37865j == i10) {
                        obj2 = obj3;
                        break;
                    }
                }
                C6697c c6697c = (C6697c) obj2;
                if (c6697c != null) {
                    int i11 = c6697c.f37856a;
                    if (playlistViewModel.m9995p2(i11)) {
                        playlistViewModel.m9998s2(i11);
                    } else {
                        playlistViewModel.f25598Y.mo14371k(new Integer(i11));
                    }
                }
            }
        } else if (playlistViewModel.m9995p2(i10)) {
            for (Object obj4 : (Iterable) playlistViewModel.f25612h0.getValue()) {
                if (((C6697c) obj4).f37856a == i10) {
                    obj2 = obj4;
                    break;
                }
            }
            if (((C6697c) obj2) != null) {
                playlistViewModel.m9998s2(i10);
            }
        } else {
            playlistViewModel.f25598Y.mo14371k(new Integer(i10));
        }
        return C9072e.f47360a;
    }
}
