package com.lingq.p055ui.settings;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.uimodel.FeedTopic;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p096ei.C5408a;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lnh/p$e;", "", "", "topics", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$13", m19206f = "SettingsSelectionViewModel.kt", m19207l = {456}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$13 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7789p.e>>, Set<? extends String>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31110e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31111f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Set f31112g;

    public SettingsSelectionViewModel$selectionItems$13(InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$13> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7789p.e>> interfaceC7117d, Set<? extends String> set, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$13 settingsSelectionViewModel$selectionItems$13 = new SettingsSelectionViewModel$selectionItems$13(interfaceC9968c);
        settingsSelectionViewModel$selectionItems$13.f31111f = interfaceC7117d;
        settingsSelectionViewModel$selectionItems$13.f31112g = set;
        return settingsSelectionViewModel$selectionItems$13.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31110e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31111f;
            Set set = this.f31112g;
            FeedTopic[] feedTopicArrValues = FeedTopic.values();
            ArrayList arrayList = new ArrayList(feedTopicArrValues.length);
            for (FeedTopic feedTopic : feedTopicArrValues) {
                arrayList.add(new AbstractC7789p.e(ViewKeys.Topics.ordinal(), C5408a.m11574g(feedTopic), set.contains(C5408a.m11574g(feedTopic)), feedTopic));
            }
            this.f31111f = null;
            this.f31110e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
