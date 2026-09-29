package com.lingq.p055ui.home.library;

import ae.C0062b;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$7", m19206f = "LibraryFragment.kt", m19207l = {424}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24704e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24705f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$7$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/ui/tooltips/TooltipStep;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$7$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37741 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends TooltipStep>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24706e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24707f;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$7$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24708a;

            static {
                int[] iArr = new int[TooltipStep.values().length];
                try {
                    iArr[TooltipStep.ChooseFirstLesson.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f24708a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37741(LibraryFragment libraryFragment, InterfaceC9968c<? super C37741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24707f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37741 c37741 = new C37741(this.f24707f, interfaceC9968c);
            c37741.f24706e = obj;
            return c37741;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends TooltipStep> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37741) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24706e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            TooltipStep tooltipStep = (TooltipStep) pair.f38013b;
            if (tooltipStep != null && a.f24708a[tooltipStep.ordinal()] == 1) {
                LibraryFragment libraryFragment = this.f24707f;
                if (libraryFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    LibraryFragment.m9935p0(libraryFragment, tooltipStep, iIntValue);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$7(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24705f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$7(this.f24705f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24704e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24705f;
            LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
            C37741 c37741 = new C37741(libraryFragment, null);
            this.f24704e = 1;
            if (C0062b.m369m0(libraryViewModelM9938s0.f24762a0, c37741, this) == coroutineSingletons) {
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
