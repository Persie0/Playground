package com.lingq.p055ui.home.library;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getGoals$1", m19206f = "LibraryViewModel.kt", m19207l = {724}, m19208m = "invokeSuspend")
final class LibraryViewModel$getGoals$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24836e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24837f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getGoals$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/language/UserLanguageProgress;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getGoals$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37861 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super UserLanguageProgress>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LibraryViewModel f24838e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37861(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C37861> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24838e = libraryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37861(this.f24838e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super UserLanguageProgress> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37861) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24838e.f24783m0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getGoals$1$a */
    public static final class C3787a implements InterfaceC7117d<UserLanguageProgress> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LibraryViewModel f24839a;

        public C3787a(LibraryViewModel libraryViewModel) {
            this.f24839a = libraryViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(UserLanguageProgress userLanguageProgress, InterfaceC9968c interfaceC9968c) {
            UserLanguageProgress userLanguageProgress2 = userLanguageProgress;
            if (userLanguageProgress2 != null) {
                LibraryViewModel libraryViewModel = this.f24839a;
                libraryViewModel.f24783m0.setValue(Resource.Status.SUCCESS);
                libraryViewModel.f24784n0.setValue(new Pair(new Integer(userLanguageProgress2.f21764m), new Double(userLanguageProgress2.f21768q)));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$getGoals$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$getGoals$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24837f = libraryViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$getGoals$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$getGoals$1(this.f24837f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24836e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24837f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37861(libraryViewModel, null), libraryViewModel.f24771g.mo6044e(libraryViewModel.mo498E1(), LanguageProgressSort.Today.getKey()));
            C3787a c3787a = new C3787a(libraryViewModel);
            this.f24836e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c3787a, this) == coroutineSingletons) {
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
