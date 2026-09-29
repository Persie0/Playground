package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.util.C4924a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/Accent;", "selectedAccents", "accentsForLanguage", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b$c;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$accents$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$accents$1 extends SuspendLambda implements InterfaceC2057q<List<? extends Accent>, List<? extends Accent>, InterfaceC9968c<? super List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f23592e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f23593f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23594g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionViewModel$accents$1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$accents$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f23594g = collectionsSearchFilterSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends Accent> list, List<? extends Accent> list2, InterfaceC9968c<? super List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c>> interfaceC9968c) {
        CollectionsSearchFilterSelectionViewModel$accents$1 collectionsSearchFilterSelectionViewModel$accents$1 = new CollectionsSearchFilterSelectionViewModel$accents$1(this.f23594g, interfaceC9968c);
        collectionsSearchFilterSelectionViewModel$accents$1.f23592e = list;
        collectionsSearchFilterSelectionViewModel$accents$1.f23593f = list2;
        return collectionsSearchFilterSelectionViewModel$accents$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f23592e;
        List<Accent> list2 = this.f23593f;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
        for (Accent accent : list2) {
            arrayList.add(new CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c(new C7785l(new Integer(C4924a.m10463h0(accent, this.f23594g.mo498E1())), null, list.contains(accent), accent.getValue(), 2)));
        }
        return arrayList;
    }
}
