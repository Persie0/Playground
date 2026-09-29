package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getLibraryCounters$1", m19206f = "LibraryViewModel.kt", m19207l = {478}, m19208m = "invokeSuspend")
final class LibraryViewModel$getLibraryCounters$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24846e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24847f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Pair<Integer, String>> f24848g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24849h;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getLibraryCounters$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getLibraryCounters$1$1", m19206f = "LibraryViewModel.kt", m19207l = {480}, m19208m = "invokeSuspend")
    public static final class C37891 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24850e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f24851f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LibraryViewModel f24852g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f24853h;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getLibraryCounters$1$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getLibraryCounters$1$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LibraryViewModel f24854e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String f24855f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ List<LibraryItemCounter> f24856g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, String str, List<LibraryItemCounter> list, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24854e = libraryViewModel;
                this.f24855f = str;
                this.f24856g = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f24854e, this.f24855f, this.f24856g, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = this.f24854e;
                libraryViewModel.f24754S.put(this.f24855f, this.f24856g);
                libraryViewModel.m9949u2();
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37891(LibraryViewModel libraryViewModel, String str, InterfaceC9968c<? super C37891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24852g = libraryViewModel;
            this.f24853h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37891 c37891 = new C37891(this.f24852g, this.f24853h, interfaceC9968c);
            c37891.f24851f = obj;
            return c37891;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37891) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24850e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                List list = (List) this.f24851f;
                if (!list.isEmpty()) {
                    LibraryViewModel libraryViewModel = this.f24852g;
                    CoroutineDispatcher coroutineDispatcher = libraryViewModel.f24744I;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, this.f24853h, list, null);
                    this.f24850e = 1;
                    if (C7828f.m15574h(this, coroutineDispatcher, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$getLibraryCounters$1(LibraryViewModel libraryViewModel, String str, List list, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24847f = libraryViewModel;
        this.f24848g = list;
        this.f24849h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$getLibraryCounters$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        List<Pair<Integer, String>> list = this.f24848g;
        return new LibraryViewModel$getLibraryCounters$1(this.f24847f, this.f24849h, list, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24846e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24847f;
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = libraryViewModel.f24769f.mo6075u(this.f24848g);
            C37891 c37891 = new C37891(libraryViewModel, this.f24849h, null);
            this.f24846e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c37891, this) == coroutineSingletons) {
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
