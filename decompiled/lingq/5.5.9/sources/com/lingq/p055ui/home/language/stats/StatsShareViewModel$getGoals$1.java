package com.lingq.p055ui.home.language.stats;

import ci.InterfaceC2013f;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import com.lingq.util.C4924a;
import com.lingq.util.LanguageProgressGoal;
import com.linguist.R;
import dk.C5196a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareViewModel$getGoals$1", m19206f = "StatsShareViewModel.kt", m19207l = {172}, m19208m = "invokeSuspend")
public final class StatsShareViewModel$getGoals$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24450e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareViewModel f24451f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24452g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24453h;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareViewModel$getGoals$1$a */
    public static final class C3736a implements InterfaceC7117d<UserLanguageProgress> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24454a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StatsShareViewModel f24455b;

        public C3736a(String str, StatsShareViewModel statsShareViewModel) {
            this.f24454a = str;
            this.f24455b = statsShareViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(UserLanguageProgress userLanguageProgress, InterfaceC9968c interfaceC9968c) {
            UserLanguageProgress userLanguageProgress2 = userLanguageProgress;
            if (userLanguageProgress2 != null) {
                String key = LanguageProgressSort.AllTime.getKey();
                String str = this.f24454a;
                boolean zM11106a = C5207g.m11106a(key, str);
                int i10 = userLanguageProgress2.f21764m;
                StatsShareViewModel statsShareViewModel = this.f24455b;
                if (zM11106a) {
                    statsShareViewModel.f24446k.setValue(new Pair(new Integer(i10), statsShareViewModel.mo498E1()));
                } else if (C5207g.m11106a(LanguageProgressSort.LastWeek.getKey(), str)) {
                    statsShareViewModel.f24436K.setValue(new Pair(C9000b.m17252r(new C5196a("Non-editable", i10, userLanguageProgress2.f21760i, C4924a.m10433L(LanguageProgressGoal.WordsKnown), R.attr.greenTint, 0, true, 32), new C5196a("Non-editable", userLanguageProgress2.f21766o, userLanguageProgress2.f21763l, C4924a.m10433L(LanguageProgressGoal.LingQs), R.attr.greenTint, 0, true, 32), new C5196a("Non-editable", userLanguageProgress2.f21768q, userLanguageProgress2.f21761j, C4924a.m10433L(LanguageProgressGoal.HoursListening), R.attr.greenTint, 0, true, 32), new C5196a("Non-editable", userLanguageProgress2.f21757f, userLanguageProgress2.f21767p, C4924a.m10433L(LanguageProgressGoal.WordsReading), R.attr.greenTint, 0, true, 32)), Boolean.FALSE));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareViewModel$getGoals$1(StatsShareViewModel statsShareViewModel, String str, String str2, InterfaceC9968c<? super StatsShareViewModel$getGoals$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24451f = statsShareViewModel;
        this.f24452g = str;
        this.f24453h = str2;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareViewModel$getGoals$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareViewModel$getGoals$1(this.f24451f, this.f24452g, this.f24453h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24450e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            StatsShareViewModel statsShareViewModel = this.f24451f;
            InterfaceC2013f interfaceC2013f = statsShareViewModel.f24439d;
            String str = this.f24452g;
            String str2 = this.f24453h;
            InterfaceC7116c<UserLanguageProgress> interfaceC7116cMo6044e = interfaceC2013f.mo6044e(str, str2);
            C3736a c3736a = new C3736a(str2, statsShareViewModel);
            this.f24450e = 1;
            if (interfaceC7116cMo6044e.mo9539a(c3736a, this) == coroutineSingletons) {
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
