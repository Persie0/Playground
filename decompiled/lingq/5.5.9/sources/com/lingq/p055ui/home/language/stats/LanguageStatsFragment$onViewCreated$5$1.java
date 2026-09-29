package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$1", m19206f = "LanguageStatsFragment.kt", m19207l = {200}, m19208m = "invokeSuspend")
public final class LanguageStatsFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24257e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsFragment f24258f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$1$1", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37081 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24259e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsFragment f24260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37081(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super C37081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24260f = languageStatsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37081 c37081 = new C37081(this.f24260f, interfaceC9968c);
            c37081.f24259e = obj;
            return c37081;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37081) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguage userLanguage = (UserLanguage) this.f24259e;
            if (userLanguage != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
                LanguageStatsFragment languageStatsFragment = this.f24260f;
                MaterialToolbar materialToolbar = languageStatsFragment.m9907o0().f44663c;
                String strM3600t = languageStatsFragment.m3600t(R.string.stats_language_stats);
                C5207g.m11110e(strM3600t, "getString(R.string.stats_language_stats)");
                String str = String.format(strM3600t, Arrays.copyOf(new Object[]{C4924a.m10439R(languageStatsFragment.m3578a0(), userLanguage.f21726a)}, 1));
                C5207g.m11110e(str, "format(format, *args)");
                materialToolbar.setTitle(str);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsFragment$onViewCreated$5$1(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super LanguageStatsFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24258f = languageStatsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsFragment$onViewCreated$5$1(this.f24258f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24257e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsFragment languageStatsFragment = this.f24258f;
            InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = ((HomeViewModel) languageStatsFragment.f24242C0.getValue()).mo509w0();
            C37081 c37081 = new C37081(languageStatsFragment, null);
            this.f24257e = 1;
            if (C0062b.m369m0(interfaceC7142wMo509w0, c37081, this) == coroutineSingletons) {
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
