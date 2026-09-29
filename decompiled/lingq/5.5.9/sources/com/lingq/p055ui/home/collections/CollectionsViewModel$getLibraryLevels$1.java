package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import dm.C5207g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/LearningLevel;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryLevels$1", m19206f = "CollectionsViewModel.kt", m19207l = {794}, m19208m = "invokeSuspend")
final class CollectionsViewModel$getLibraryLevels$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Pair<? extends LearningLevel, ? extends LearningLevel>>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23390e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLibraryLevels$1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super CollectionsViewModel$getLibraryLevels$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23391f = collectionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$getLibraryLevels$1(this.f23391f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Pair<? extends LearningLevel, ? extends LearningLevel>> interfaceC9968c) {
        return ((CollectionsViewModel$getLibraryLevels$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23390e;
        CollectionsViewModel collectionsViewModel = this.f23391f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i = collectionsViewModel.f23261k.mo9594i();
            this.f23390e = 1;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        Map map = (Map) ((Map) obj).get(collectionsViewModel.mo498E1());
        if (map == null) {
            return new Pair(LearningLevel.Beginner1, LearningLevel.Advanced2);
        }
        LearningLevel learningLevel = LearningLevel.Beginner1;
        LearningLevel learningLevel2 = LearningLevel.Advanced2;
        while (true) {
            Object obj2 = map.get(learningLevel);
            Boolean bool = Boolean.FALSE;
            if (!C5207g.m11106a(obj2, bool) && !C5207g.m11106a(map.get(learningLevel2), bool)) {
                return new Pair(learningLevel, learningLevel2);
            }
            if (C5207g.m11106a(map.get(learningLevel), bool)) {
                learningLevel = LearningLevel.values()[learningLevel.ordinal() + 1];
            }
            if (C5207g.m11106a(map.get(learningLevel2), bool)) {
                learningLevel2 = LearningLevel.values()[learningLevel2.ordinal() - 1];
            }
        }
    }
}
