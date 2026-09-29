package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.notification.UserNotice;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getNotices$1", m19206f = "LibraryViewModel.kt", m19207l = {703}, m19208m = "invokeSuspend")
final class LibraryViewModel$getNotices$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24857e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24858f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$getNotices$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/notification/UserNotice;", "notices", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$getNotices$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37901 extends SuspendLambda implements InterfaceC2056p<List<? extends UserNotice>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24859e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryViewModel f24860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37901(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C37901> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24860f = libraryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37901 c37901 = new C37901(this.f24860f, interfaceC9968c);
            c37901.f24859e = obj;
            return c37901;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserNotice> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37901) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserNotice userNotice = (UserNotice) C6752c.m13425S((List) this.f24859e);
            if (userNotice != null) {
                LibraryViewModel libraryViewModel = this.f24860f;
                libraryViewModel.f24787q0.setValue(userNotice);
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), libraryViewModel.f24746K, libraryViewModel.f24745J, "networkMonthlyChallenges", new LibraryViewModel$networkMonthlyChallenges$1(libraryViewModel, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$getNotices$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$getNotices$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24858f = libraryViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$getNotices$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$getNotices$1(this.f24858f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24857e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24858f;
            InterfaceC7116c<List<UserNotice>> interfaceC7116cMo6088c = libraryViewModel.f24775i.mo6088c(libraryViewModel.mo498E1());
            C37901 c37901 = new C37901(libraryViewModel, null);
            this.f24857e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6088c, c37901, this) == coroutineSingletons) {
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
