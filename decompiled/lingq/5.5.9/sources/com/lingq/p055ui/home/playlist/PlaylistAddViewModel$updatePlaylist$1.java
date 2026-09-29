package com.lingq.p055ui.home.playlist;

import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7793a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistAddViewModel$updatePlaylist$1", m19206f = "PlaylistAddViewModel.kt", m19207l = {56, 60}, m19208m = "invokeSuspend")
final class PlaylistAddViewModel$updatePlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f25452e;

    /* JADX INFO: renamed from: f */
    public int f25453f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlaylistAddViewModel f25454g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25455h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f25456i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAddViewModel$updatePlaylist$1(PlaylistAddViewModel playlistAddViewModel, String str, String str2, InterfaceC9968c<? super PlaylistAddViewModel$updatePlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25454g = playlistAddViewModel;
        this.f25455h = str;
        this.f25456i = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistAddViewModel$updatePlaylist$1(this.f25454g, this.f25455h, this.f25456i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistAddViewModel$updatePlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo498E1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25453f;
        String str = this.f25456i;
        String str2 = this.f25455h;
        PlaylistAddViewModel playlistAddViewModel = this.f25454g;
        if (i10 != 0) {
            if (i10 == 1) {
                strMo498E1 = this.f25452e;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            playlistAddViewModel.f25447k.mo16479j(C9072e.f47360a);
            playlistAddViewModel.mo5252q0(str, str2);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        strMo498E1 = playlistAddViewModel.mo498E1();
        this.f25452e = strMo498E1;
        this.f25453f = 1;
        obj = playlistAddViewModel.f25440d.mo6113h(strMo498E1, str2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((UserPlaylist) obj) != null) {
            playlistAddViewModel.f25445i.mo16479j(C9072e.f47360a);
        } else {
            InterfaceC2019l interfaceC2019l = playlistAddViewModel.f25440d;
            String strM15498b = C7793a.m15498b(str, strMo498E1);
            this.f25452e = null;
            this.f25453f = 2;
            if (interfaceC2019l.mo6110e(strMo498E1, strM15498b, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            playlistAddViewModel.f25447k.mo16479j(C9072e.f47360a);
            playlistAddViewModel.mo5252q0(str, str2);
        }
        return C9072e.f47360a;
    }
}
