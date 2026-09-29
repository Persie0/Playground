package com.lingq.p055ui.home.language.stats;

import ci.InterfaceC2013f;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import com.lingq.util.C4924a;
import com.linguist.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$updateActivityData$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {480}, m19208m = "invokeSuspend")
public final class LanguageStatsViewModel$updateActivityData$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24384e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$updateActivityData$1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super LanguageStatsViewModel$updateActivityData$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24385f = languageStatsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$updateActivityData$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$updateActivityData$1(this.f24385f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objMo6042c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24384e;
        LanguageStatsViewModel languageStatsViewModel = this.f24385f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2013f interfaceC2013f = languageStatsViewModel.f24302d;
                String strMo498E1 = languageStatsViewModel.mo498E1();
                String key = ((LanguageProgressMetric) languageStatsViewModel.f24299W.getValue()).getKey();
                String key2 = ((LanguageProgressPeriod) languageStatsViewModel.f24300X.getValue()).getKey();
                this.f24384e = 1;
                objMo6042c = interfaceC2013f.mo6042c(strMo498E1, key, key2, this);
                if (objMo6042c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                objMo6042c = obj;
            }
            if (((Boolean) objMo6042c).booleanValue()) {
                UserLanguageProgressChartEntry[] userLanguageProgressChartEntryArr = new UserLanguageProgressChartEntry[3];
                StateFlowImpl stateFlowImpl = languageStatsViewModel.f24299W;
                StateFlowImpl stateFlowImpl2 = languageStatsViewModel.f24299W;
                userLanguageProgressChartEntryArr[0] = new UserLanguageProgressChartEntry(((LanguageProgressMetric) stateFlowImpl.getValue()).getKey(), languageStatsViewModel.mo498E1(), "", 0.0d, 0.0d);
                userLanguageProgressChartEntryArr[1] = new UserLanguageProgressChartEntry(((LanguageProgressMetric) stateFlowImpl2.getValue()).getKey(), languageStatsViewModel.mo498E1(), "", 0.0d, 0.0d);
                userLanguageProgressChartEntryArr[2] = new UserLanguageProgressChartEntry(((LanguageProgressMetric) stateFlowImpl2.getValue()).getKey(), languageStatsViewModel.mo498E1(), "", 0.0d, 0.0d);
                List listM17252r = C9000b.m17252r(userLanguageProgressChartEntryArr);
                languageStatsViewModel.f24293Q.setValue(new Pair(C4924a.m10473m0(R.attr.redTint, listM17252r, true), C4924a.m10473m0(R.attr.blueTint, listM17252r, false)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
