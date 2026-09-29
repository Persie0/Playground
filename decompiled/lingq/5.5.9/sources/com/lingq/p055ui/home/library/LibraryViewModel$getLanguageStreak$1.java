package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import gi.C5804b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getLanguageStreak$1", m19206f = "LibraryViewModel.kt", m19207l = {680}, m19208m = "invokeSuspend")
final class LibraryViewModel$getLanguageStreak$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24840e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24841f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getLanguageStreak$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lgi/b;", "streak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getLanguageStreak$1$1", m19206f = "LibraryViewModel.kt", m19207l = {682}, m19208m = "invokeSuspend")
    public static final class C37881 extends SuspendLambda implements InterfaceC2056p<C5804b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public LibraryViewModel f24842e;

        /* JADX INFO: renamed from: f */
        public int f24843f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f24844g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ LibraryViewModel f24845h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37881(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C37881> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24845h = libraryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37881 c37881 = new C37881(this.f24845h, interfaceC9968c);
            c37881.f24844g = obj;
            return c37881;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C5804b c5804b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37881) mo1336a(c5804b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C5804b c5804b;
            LibraryViewModel libraryViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24843f;
            boolean z10 = true;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                c5804b = (C5804b) this.f24844g;
                if (c5804b != null) {
                    LibraryViewModel libraryViewModel2 = this.f24845h;
                    InterfaceC7116c<Map<String, String>> interfaceC7116cMo9692p = libraryViewModel2.f24781l.mo9692p();
                    this.f24844g = c5804b;
                    this.f24842e = libraryViewModel2;
                    this.f24843f = 1;
                    Object objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9692p, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    libraryViewModel = libraryViewModel2;
                    obj = objM14360a;
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            libraryViewModel = this.f24842e;
            c5804b = (C5804b) this.f24844g;
            C7499b.m14977z0(obj);
            String str = (String) ((Map) obj).get(libraryViewModel.mo498E1());
            if (!c5804b.f35075c || ((str != null && str.compareTo(C4924a.m10456e()) >= 0) || c5804b.f35076d <= 5000.0d)) {
                z10 = false;
            }
            libraryViewModel.f24782l0.setValue(z10 ? new Pair(c5804b, libraryViewModel.mo498E1()) : null);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$getLanguageStreak$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$getLanguageStreak$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24841f = libraryViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$getLanguageStreak$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$getLanguageStreak$1(this.f24841f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24840e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24841f;
            InterfaceC7116c<C5804b> interfaceC7116cMo6050k = libraryViewModel.f24771g.mo6050k(libraryViewModel.mo498E1());
            C37881 c37881 = new C37881(libraryViewModel, null);
            this.f24840e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6050k, c37881, this) == coroutineSingletons) {
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
