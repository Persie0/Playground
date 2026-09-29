package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.CollectionsFilterLessonTag;
import com.linguist.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/CollectionsFilterLessonTag;", "collectionsFilterLessonTags", "", "selectedLessonTag", "query", "", "isEmpty", "", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$_lessonTags$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$_lessonTags$1 extends SuspendLambda implements InterfaceC2059s<List<? extends CollectionsFilterLessonTag>, List<? extends String>, String, Boolean, InterfaceC9968c<? super List<CollectionsSearchFilterSelectionAdapter.AbstractC3585b>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f23574e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f23575f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ String f23576g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean f23577h;

    public CollectionsSearchFilterSelectionViewModel$_lessonTags$1(InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$_lessonTags$1> interfaceC9968c) {
        super(5, interfaceC9968c);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(List<? extends CollectionsFilterLessonTag> list, List<? extends String> list2, String str, Boolean bool, InterfaceC9968c<? super List<CollectionsSearchFilterSelectionAdapter.AbstractC3585b>> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        CollectionsSearchFilterSelectionViewModel$_lessonTags$1 collectionsSearchFilterSelectionViewModel$_lessonTags$1 = new CollectionsSearchFilterSelectionViewModel$_lessonTags$1(interfaceC9968c);
        collectionsSearchFilterSelectionViewModel$_lessonTags$1.f23574e = list;
        collectionsSearchFilterSelectionViewModel$_lessonTags$1.f23575f = list2;
        collectionsSearchFilterSelectionViewModel$_lessonTags$1.f23576g = str;
        collectionsSearchFilterSelectionViewModel$_lessonTags$1.f23577h = zBooleanValue;
        return collectionsSearchFilterSelectionViewModel$_lessonTags$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List<CollectionsFilterLessonTag> list = this.f23574e;
        List<String> list2 = this.f23575f;
        String str = this.f23576g;
        boolean z10 = this.f23577h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CollectionsSearchFilterSelectionAdapter.AbstractC3585b.b(R.string.lingq_tags));
        if (C7661i.m15250P2(str)) {
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
            for (String str2 : list2) {
                arrayList2.add(new CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c(new C7785l(null, str2, list2.contains(str2), str2, 1)));
            }
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
            for (CollectionsFilterLessonTag collectionsFilterLessonTag : list) {
                String str3 = collectionsFilterLessonTag.f21922a;
                String str4 = str3 == null ? "" : str3;
                boolean zM13415I = C6752c.m13415I(list2, str3);
                String str5 = collectionsFilterLessonTag.f21922a;
                if (str5 == null) {
                    str5 = "";
                }
                arrayList3.add(new CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c(new C7785l(null, str4, zM13415I, str5, 1)));
            }
            arrayList.addAll(arrayList3);
        }
        if (z10) {
            arrayList.add(new CollectionsSearchFilterSelectionAdapter.AbstractC3585b.a());
        }
        return arrayList;
    }
}
