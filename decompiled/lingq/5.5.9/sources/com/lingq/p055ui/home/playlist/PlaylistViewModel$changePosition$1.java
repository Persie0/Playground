package com.lingq.p055ui.home.playlist;

import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.Iterator;
import ki.C6696b;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$changePosition$1", m19206f = "PlaylistViewModel.kt", m19207l = {863}, m19208m = "invokeSuspend")
final class PlaylistViewModel$changePosition$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25711e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlaylistViewModel f25712f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25713g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f25714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$changePosition$1(PlaylistViewModel playlistViewModel, int i10, int i11, InterfaceC9968c<? super PlaylistViewModel$changePosition$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25712f = playlistViewModel;
        this.f25713g = i10;
        this.f25714h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$changePosition$1(this.f25712f, this.f25713g, this.f25714h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$changePosition$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object obj2;
        int i10;
        Object next;
        Object next2;
        int iIntValue;
        C6696b c6696b;
        int i11;
        Object next3;
        int iIntValue2;
        Integer num;
        C6697c c6697c;
        Integer num2;
        Integer num3;
        C6697c c6697c2;
        Integer num4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f25711e;
        if (i12 == 0) {
            C7499b.m14977z0(obj);
            PlaylistViewModel playlistViewModel = this.f25712f;
            UserPlaylist userPlaylist = (UserPlaylist) playlistViewModel.f25620l0.getValue();
            if (userPlaylist != null) {
                InterfaceC2019l interfaceC2019l = playlistViewModel.f25603d;
                StateFlowImpl stateFlowImpl = playlistViewModel.f25604d0;
                Iterator it = ((Iterable) stateFlowImpl.getValue()).iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    obj2 = null;
                    i10 = this.f25713g;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    c6697c2 = (C6697c) next;
                } while (!((c6697c2 == null || (num4 = c6697c2.f37871p) == null || num4.intValue() != i10) ? false : true));
                C6697c c6697c3 = (C6697c) next;
                StateFlowImpl stateFlowImpl2 = playlistViewModel.f25601b0;
                if (c6697c3 == null || (num3 = c6697c3.f37871p) == null) {
                    Iterator it2 = ((Iterable) stateFlowImpl2.getValue()).iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        c6696b = (C6696b) next2;
                    } while (!(c6696b != null && c6696b.f37855c == i10));
                    C6696b c6696b2 = (C6696b) next2;
                    iIntValue = c6696b2 != null ? c6696b2.f37855c : 0;
                } else {
                    iIntValue = num3.intValue();
                }
                Iterator it3 = ((Iterable) stateFlowImpl.getValue()).iterator();
                do {
                    boolean zHasNext2 = it3.hasNext();
                    i11 = this.f25714h;
                    if (!zHasNext2) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    c6697c = (C6697c) next3;
                } while (!((c6697c == null || (num2 = c6697c.f37871p) == null || num2.intValue() != i11) ? false : true));
                C6697c c6697c4 = (C6697c) next3;
                if (c6697c4 == null || (num = c6697c4.f37871p) == null) {
                    for (Object obj3 : (Iterable) stateFlowImpl2.getValue()) {
                        C6696b c6696b3 = (C6696b) obj3;
                        if (c6696b3 != null && c6696b3.f37855c == i11) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    C6696b c6696b4 = (C6696b) obj2;
                    iIntValue2 = c6696b4 != null ? c6696b4.f37855c : 0;
                } else {
                    iIntValue2 = num.intValue();
                }
                String str = userPlaylist.f22077a;
                int i13 = userPlaylist.f22080d;
                this.f25711e = 1;
                if (interfaceC2019l.mo6122q(iIntValue, iIntValue2, str, i13, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
