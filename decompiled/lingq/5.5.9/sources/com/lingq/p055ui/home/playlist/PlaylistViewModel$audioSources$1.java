package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.PlayerContentController;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C6697c;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "Lki/c;", "lessons", "Lki/d;", "downloads", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "<anonymous parameter 2>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$audioSources$1", m19206f = "PlaylistViewModel.kt", m19207l = {199}, m19208m = "invokeSuspend")
final class PlaylistViewModel$audioSources$1 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super List<? extends PlayerContentController.PlayerContentItem>>, List<? extends C6697c>, List<? extends C6698d>, List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25700e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25701f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f25702g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f25703h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistViewModel f25704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$audioSources$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$audioSources$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f25704i = playlistViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super List<? extends PlayerContentController.PlayerContentItem>> interfaceC7117d, List<? extends C6697c> list, List<? extends C6698d> list2, List<? extends LibraryItemCounter> list3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        PlaylistViewModel$audioSources$1 playlistViewModel$audioSources$1 = new PlaylistViewModel$audioSources$1(this.f25704i, interfaceC9968c);
        playlistViewModel$audioSources$1.f25701f = interfaceC7117d;
        playlistViewModel$audioSources$1.f25702g = list;
        playlistViewModel$audioSources$1.f25703h = list2;
        return playlistViewModel$audioSources$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        PlaylistViewModel playlistViewModel;
        Object next;
        C6698d c6698d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25700e;
        boolean z10 = true;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25701f;
            List list = this.f25702g;
            List list2 = this.f25703h;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                playlistViewModel = this.f25704i;
                if (!zHasNext) {
                    break;
                }
                Object next2 = it.next();
                if (!playlistViewModel.m9995p2(((C6697c) next2).f37856a)) {
                    arrayList.add(next2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C6697c c6697c = (C6697c) it2.next();
                String str = c6697c.f37869n;
                String str2 = str != null ? str : "";
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    c6698d = (C6698d) next;
                } while (!((c6698d == null || c6697c.f37856a != c6698d.f37875a) ? false : z10));
                C6698d c6698d2 = (C6698d) next;
                Boolean boolValueOf = c6698d2 != null ? Boolean.valueOf(c6698d2.f37876b) : null;
                int i11 = c6697c.f37856a;
                String str3 = c6697c.f37863h;
                String str4 = c6697c.f37864i;
                String str5 = str4 == null ? "" : str4;
                int i12 = c6697c.f37868m * 1000;
                String str6 = c6697c.f37861f;
                arrayList2.add(new PlayerContentController.PlayerContentItem(i11, str2, str3, str5, i12, str6 == null ? "" : str6, boolValueOf != null ? boolValueOf.booleanValue() : false, c6697c.f37865j, playlistViewModel.mo498E1(), (c6697c.f37870o == null || c6697c.f37869n != null) ? AbstractC3299d.a.f17754a : AbstractC3299d.c.f17756a));
                z10 = true;
            }
            this.f25701f = null;
            this.f25702g = null;
            this.f25700e = 1;
            if (interfaceC7117d.mo1339r(arrayList2, this) == coroutineSingletons) {
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
