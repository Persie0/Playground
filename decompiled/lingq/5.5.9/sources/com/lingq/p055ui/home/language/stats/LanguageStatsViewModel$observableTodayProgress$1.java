package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$observableTodayProgress$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {616}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$observableTodayProgress$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24365e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24366f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24367g;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$observableTodayProgress$1$a */
    public static final class C3723a implements InterfaceC7117d<UserLanguageProgress> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LanguageStatsViewModel f24368a;

        public C3723a(LanguageStatsViewModel languageStatsViewModel) {
            this.f24368a = languageStatsViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(UserLanguageProgress userLanguageProgress, InterfaceC9968c interfaceC9968c) {
            UserLanguageProgress userLanguageProgress2 = userLanguageProgress;
            if (userLanguageProgress2 != null) {
                this.f24368a.f24297U.setValue(userLanguageProgress2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$observableTodayProgress$1(LanguageStatsViewModel languageStatsViewModel, String str, InterfaceC9968c<? super LanguageStatsViewModel$observableTodayProgress$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24366f = languageStatsViewModel;
        this.f24367g = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$observableTodayProgress$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$observableTodayProgress$1(this.f24366f, this.f24367g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24365e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24366f;
            InterfaceC7116c<UserLanguageProgress> interfaceC7116cMo6044e = languageStatsViewModel.f24302d.mo6044e(languageStatsViewModel.mo498E1(), this.f24367g);
            C3723a c3723a = new C3723a(languageStatsViewModel);
            this.f24365e = 1;
            if (interfaceC7116cMo6044e.mo9539a(c3723a, this) == coroutineSingletons) {
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
