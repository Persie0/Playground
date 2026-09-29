package com.lingq.p055ui.home.playlist;

import bj.C1586i;
import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistAddViewModel$addPlaylist$1", m19206f = "PlaylistAddViewModel.kt", m19207l = {37, 39}, m19208m = "invokeSuspend")
final class PlaylistAddViewModel$addPlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25449e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistAddViewModel f25450f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25451g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAddViewModel$addPlaylist$1(PlaylistAddViewModel playlistAddViewModel, String str, InterfaceC9968c<? super PlaylistAddViewModel$addPlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25450f = playlistAddViewModel;
        this.f25451g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistAddViewModel$addPlaylist$1(this.f25450f, this.f25451g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistAddViewModel$addPlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25449e;
        String str = this.f25451g;
        PlaylistAddViewModel playlistAddViewModel = this.f25450f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            playlistAddViewModel.f25447k.mo16479j(C9072e.f47360a);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2019l interfaceC2019l = playlistAddViewModel.f25440d;
        String strMo498E1 = playlistAddViewModel.mo498E1();
        this.f25449e = 1;
        obj = interfaceC2019l.mo6113h(strMo498E1, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((UserPlaylist) obj) == null) {
            InterfaceC2019l interfaceC2019l2 = playlistAddViewModel.f25440d;
            String strMo498E2 = playlistAddViewModel.mo498E1();
            String string = C7076b.m14277B3(str).toString();
            C1586i c1586i = playlistAddViewModel.f25444h;
            Integer num = new Integer(c1586i.f9068c);
            Integer num2 = num.intValue() != -1 ? num : null;
            String str2 = c1586i.f9069d;
            String str3 = C7661i.m15250P2(str2) ^ true ? str2 : null;
            this.f25449e = 2;
            if (interfaceC2019l2.mo6121p(strMo498E2, string, str3, num2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            playlistAddViewModel.f25447k.mo16479j(C9072e.f47360a);
        } else {
            playlistAddViewModel.f25445i.mo16479j(C9072e.f47360a);
        }
        return C9072e.f47360a;
    }
}
