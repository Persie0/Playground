package com.lingq.p055ui.home.vocabulary.filter;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"", "Lnh/l;", "items", "", "query", "", "Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionAdapter$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$selectionItems$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyFilterSelectionViewModel$selectionItems$1 extends SuspendLambda implements InterfaceC2057q<List<? extends C7785l>, String, InterfaceC9968c<? super List<VocabularyFilterSelectionAdapter.AbstractC4037a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f26482e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ String f26483f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyFilterSelectionViewModel f26484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$selectionItems$1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, InterfaceC9968c<? super VocabularyFilterSelectionViewModel$selectionItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f26484g = vocabularyFilterSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends C7785l> list, String str, InterfaceC9968c<? super List<VocabularyFilterSelectionAdapter.AbstractC4037a>> interfaceC9968c) {
        VocabularyFilterSelectionViewModel$selectionItems$1 vocabularyFilterSelectionViewModel$selectionItems$1 = new VocabularyFilterSelectionViewModel$selectionItems$1(this.f26484g, interfaceC9968c);
        vocabularyFilterSelectionViewModel$selectionItems$1.f26482e = list;
        vocabularyFilterSelectionViewModel$selectionItems$1.f26483f = str;
        return vocabularyFilterSelectionViewModel$selectionItems$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f26482e;
        String str = this.f26483f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new VocabularyFilterSelectionAdapter.AbstractC4037a.a((C7785l) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (this.f26484g.f26443k == FilterType.Tags) {
            arrayList.add(0, new VocabularyFilterSelectionAdapter.AbstractC4037a.b(str));
        }
        return arrayList;
    }
}
