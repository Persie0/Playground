package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.LanguageProgressUpdate;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import com.lingq.util.C4924a;
import com.lingq.util.LanguageProgressGoal;
import com.linguist.R;
import dk.C5196a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getGoals$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {424}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$getGoals$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24343e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24344f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24345g;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$getGoals$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/language/UserLanguageProgress;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getGoals$1$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37181 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super UserLanguageProgress>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LanguageStatsViewModel f24346e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37181(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37181> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24346e = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37181(this.f24346e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super UserLanguageProgress> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37181) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24346e.f24284H.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$getGoals$1$a */
    public static final class C3719a implements InterfaceC7117d<UserLanguageProgress> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LanguageStatsViewModel f24347a;

        public C3719a(LanguageStatsViewModel languageStatsViewModel) {
            this.f24347a = languageStatsViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(UserLanguageProgress userLanguageProgress, InterfaceC9968c interfaceC9968c) {
            UserLanguageProgress userLanguageProgress2 = userLanguageProgress;
            if (userLanguageProgress2 != null) {
                LanguageStatsViewModel languageStatsViewModel = this.f24347a;
                languageStatsViewModel.f24284H.setValue(Resource.Status.SUCCESS);
                if (C5207g.m11106a(userLanguageProgress2.f21752a, languageStatsViewModel.f24309k.getValue())) {
                    languageStatsViewModel.f24294R.setValue(new Triple(C9000b.m17252r(new C5196a("Non-editable", userLanguageProgress2.f21764m, userLanguageProgress2.f21760i, C4924a.m10433L(LanguageProgressGoal.WordsKnown), R.attr.greenTint, 0, false, 96), new C5196a("Non-editable", userLanguageProgress2.f21766o, userLanguageProgress2.f21763l, C4924a.m10433L(LanguageProgressGoal.LingQs), R.attr.yellowWordBorderColor, 0, false, 96), new C5196a("Non-editable", userLanguageProgress2.f21769r, userLanguageProgress2.f21771t, C4924a.m10433L(LanguageProgressGoal.LingQsLearned), R.attr.greenTint, 0, false, 96), new C5196a(LanguageProgressUpdate.HoursListening.getKey(), userLanguageProgress2.f21768q, userLanguageProgress2.f21761j, C4924a.m10433L(LanguageProgressGoal.HoursListening), R.attr.blueStrongColor, 2, false, 64), new C5196a(LanguageProgressUpdate.WordsReading.getKey(), userLanguageProgress2.f21757f, userLanguageProgress2.f21767p, C4924a.m10433L(LanguageProgressGoal.WordsReading), R.attr.greenTint, 1, false, 64), new C5196a(LanguageProgressUpdate.WordsWriting.getKey(), userLanguageProgress2.f21770s, userLanguageProgress2.f21754c, C4924a.m10433L(LanguageProgressGoal.WordsWriting), R.attr.yellowWordBorderColor, 1, false, 64), new C5196a(LanguageProgressUpdate.HoursSpeaking.getKey(), userLanguageProgress2.f21762k, userLanguageProgress2.f21755d, C4924a.m10433L(LanguageProgressGoal.HoursSpeaking), R.attr.redTint, 2, false, 64)), Integer.valueOf(userLanguageProgress2.f21759h), Boolean.FALSE));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$getGoals$1(LanguageStatsViewModel languageStatsViewModel, String str, InterfaceC9968c<? super LanguageStatsViewModel$getGoals$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24344f = languageStatsViewModel;
        this.f24345g = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$getGoals$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$getGoals$1(this.f24344f, this.f24345g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24343e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24344f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37181(languageStatsViewModel, null), languageStatsViewModel.f24302d.mo6044e(this.f24345g, (String) languageStatsViewModel.f24309k.getValue()));
            C3719a c3719a = new C3719a(languageStatsViewModel);
            this.f24343e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c3719a, this) == coroutineSingletons) {
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
