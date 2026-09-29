package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.home.playlist.PlaylistPlayerView;
import com.lingq.player.PlayerContentController;
import dm.C5207g;
import java.util.Iterator;
import ki.C6697c;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$1", m19206f = "CoursePlaylistFragment.kt", m19207l = {301}, m19208m = "invokeSuspend")
public final class CoursePlaylistFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistFragment f23784f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistFragment$onViewCreated$5$1$1", m19206f = "CoursePlaylistFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36441 extends SuspendLambda implements InterfaceC2056p<Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23785e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistFragment f23786f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36441(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super C36441> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23786f = coursePlaylistFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36441 c36441 = new C36441(this.f23786f, interfaceC9968c);
            c36441.f23785e = obj;
            return c36441;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36441) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            int i10;
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f23785e;
            PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) triple.f38021a;
            boolean zBooleanValue = ((Boolean) triple.f38022b).booleanValue();
            int iIntValue = ((Number) triple.f38023c).intValue();
            if (playerContentItem != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
                CoursePlaylistFragment coursePlaylistFragment = this.f23786f;
                PlaylistPlayerView playlistPlayerView = coursePlaylistFragment.m9860o0().f44946g;
                Iterator it = ((Iterable) coursePlaylistFragment.m9862q0().f23827P.getValue()).iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    i10 = playerContentItem.f17600a;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((C6697c) next).f37856a == i10));
                playlistPlayerView.m9986b((C6697c) next, zBooleanValue, iIntValue);
                PlaylistAdapter playlistAdapter = coursePlaylistFragment.f23766E0;
                if (playlistAdapter == null) {
                    C5207g.m11117l("playlistAdapter");
                    throw null;
                }
                playlistAdapter.f25400g = i10;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistFragment$onViewCreated$5$1(CoursePlaylistFragment coursePlaylistFragment, InterfaceC9968c<? super CoursePlaylistFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23784f = coursePlaylistFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistFragment$onViewCreated$5$1(this.f23784f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23783e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CoursePlaylistFragment.f23761G0;
            CoursePlaylistFragment coursePlaylistFragment = this.f23784f;
            InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> interfaceC7133nMo9425z0 = coursePlaylistFragment.m9862q0().mo9425z0();
            C36441 c36441 = new C36441(coursePlaylistFragment, null);
            this.f23783e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9425z0, c36441, this) == coroutineSingletons) {
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
