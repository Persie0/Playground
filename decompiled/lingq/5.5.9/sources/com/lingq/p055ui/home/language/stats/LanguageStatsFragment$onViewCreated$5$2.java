package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p487xi.C10201i;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$2", m19206f = "LanguageStatsFragment.kt", m19207l = {212}, m19208m = "invokeSuspend")
public final class LanguageStatsFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24261e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsFragment f24262f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C10201i f24263g;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/r;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$2$1", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37091 extends SuspendLambda implements InterfaceC2056p<List<? extends AbstractC7791r>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24264e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C10201i f24265f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37091(C10201i c10201i, InterfaceC9968c<? super C37091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24265f = c10201i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37091 c37091 = new C37091(this.f24265f, interfaceC9968c);
            c37091.f24264e = obj;
            return c37091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends AbstractC7791r> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37091) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24265f.m4529q((List) this.f24264e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsFragment$onViewCreated$5$2(C10201i c10201i, LanguageStatsFragment languageStatsFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24262f = languageStatsFragment;
        this.f24263g = c10201i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsFragment$onViewCreated$5$2(this.f24263g, this.f24262f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24261e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = this.f24262f.m9908p0();
            C37091 c37091 = new C37091(this.f24263g, null);
            this.f24261e = 1;
            if (C0062b.m369m0(languageStatsViewModelM9908p0.f24301Y, c37091, this) == coroutineSingletons) {
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
