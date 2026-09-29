package com.lingq.p055ui.home.playlist;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1", m19206f = "PlaylistViewModel.kt", m19207l = {773}, m19208m = "invokeSuspend")
final class PlaylistViewModel$getLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25742e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List<Integer> f25743f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlaylistViewModel f25744g;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "list", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$3", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39393 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25745e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ PlaylistViewModel f25746f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39393(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super C39393> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25746f = playlistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39393 c39393 = new C39393(this.f25746f, interfaceC9968c);
            c39393.f25745e = obj;
            return c39393;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter>[] listArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39393) mo1336a(listArr, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List[] listArr = (List[]) this.f25745e;
            if (!(listArr.length == 0)) {
                this.f25746f.f25606e0.setValue(C9325m.m17680A(C6744b.m13391w0(listArr)));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getLessonCounters$1(PlaylistViewModel playlistViewModel, List list, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25743f = list;
        this.f25744g = playlistViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$getLessonCounters$1(this.f25744g, this.f25743f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$getLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        PlaylistViewModel playlistViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25742e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ArrayList arrayListM13414H = C6752c.m13414H(this.f25743f, 100);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM13414H, 10));
            Iterator it = arrayListM13414H.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                playlistViewModel = this.f25744g;
                if (!zHasNext) {
                    break;
                }
                List list = (List) it.next();
                InterfaceC2014g interfaceC2014g = playlistViewModel.f25609g;
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Pair(new Integer(((Number) it2.next()).intValue()), LibraryItemType.Content.getValue()));
                }
                arrayList.add(interfaceC2014g.mo6075u(arrayList2));
            }
            Object[] array = C6752c.m13453u0(arrayList).toArray(new InterfaceC7116c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            final InterfaceC7116c[] interfaceC7116cArr = (InterfaceC7116c[]) array;
            InterfaceC7116c<List<? extends LibraryItemCounter>[]> interfaceC7116c = new InterfaceC7116c<List<? extends LibraryItemCounter>[]>() { // from class: com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$invokeSuspend$$inlined$combine$1

                /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$invokeSuspend$$inlined$combine$1$3, reason: invalid class name */
                @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$invokeSuspend$$inlined$combine$1$3", m19206f = "PlaylistViewModel.kt", m19207l = {292}, m19208m = "invokeSuspend")
                public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LibraryItemCounter>[]>, List<? extends LibraryItemCounter>[], InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public int f25749e;

                    /* JADX INFO: renamed from: f */
                    public /* synthetic */ InterfaceC7117d f25750f;

                    /* JADX INFO: renamed from: g */
                    public /* synthetic */ Object[] f25751g;

                    public AnonymousClass3(InterfaceC9968c interfaceC9968c) {
                        super(3, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final Object mo1343M(InterfaceC7117d<? super List<? extends LibraryItemCounter>[]> interfaceC7117d, List<? extends LibraryItemCounter>[] listArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC9968c);
                        anonymousClass3.f25750f = interfaceC7117d;
                        anonymousClass3.f25751g = listArr;
                        return anonymousClass3.mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f25749e;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            InterfaceC7117d interfaceC7117d = this.f25750f;
                            List[] listArr = (List[]) this.f25751g;
                            this.f25749e = 1;
                            if (interfaceC7117d.mo1339r(listArr, this) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.InterfaceC7116c
                /* JADX INFO: renamed from: a */
                public final Object mo9539a(InterfaceC7117d<? super List<? extends LibraryItemCounter>[]> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                    final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                    Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<List<? extends LibraryItemCounter>[]>() { // from class: com.lingq.ui.home.playlist.PlaylistViewModel$getLessonCounters$1$invokeSuspend$$inlined$combine$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final List<? extends LibraryItemCounter>[] mo807E() {
                            return new List[interfaceC7116cArr2.length];
                        }
                    }, new AnonymousClass3(null), interfaceC7117d, interfaceC7116cArr2);
                    return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
                }
            };
            C39393 c39393 = new C39393(playlistViewModel, null);
            this.f25742e = 1;
            if (C0062b.m369m0(interfaceC7116c, c39393, this) == coroutineSingletons) {
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
