package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import gi.C5804b;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$5", m19206f = "LibraryFragment.kt", m19207l = {394}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24696e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24697f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lgi/b;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "repairStreak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$5$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37721 extends SuspendLambda implements InterfaceC2056p<Pair<? extends C5804b, ? extends UserLanguageStudyStats>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24698e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37721(LibraryFragment libraryFragment, InterfaceC9968c<? super C37721> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24699f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37721 c37721 = new C37721(this.f24699f, interfaceC9968c);
            c37721.f24698e = obj;
            return c37721;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends C5804b, ? extends UserLanguageStudyStats> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37721) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f24698e;
            if (pair != null) {
                C5804b c5804b = (C5804b) pair.f38012a;
                UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) pair.f38013b;
                RepairStreakFragment repairStreakFragment = new RepairStreakFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("streak", c5804b.f35074b);
                bundle.putInt("previousDayLingqs", userLanguageStudyStats.f21791f.get(5).f21800c);
                bundle.putInt("goal", userLanguageStudyStats.f21787b);
                bundle.putInt("activityLevel", userLanguageStudyStats.f21792g);
                repairStreakFragment.m3583e0(bundle);
                LibraryFragment libraryFragment = this.f24699f;
                repairStreakFragment.mo3772s0(libraryFragment.m3594l(), "repairStreakFragment");
                libraryFragment.m9938s0().f24782l0.setValue(null);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$5(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24697f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$5(this.f24697f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24696e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24697f;
            LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
            C37721 c37721 = new C37721(libraryFragment, null);
            this.f24696e = 1;
            if (C0062b.m369m0(libraryViewModelM9938s0.f24786p0, c37721, this) == coroutineSingletons) {
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
