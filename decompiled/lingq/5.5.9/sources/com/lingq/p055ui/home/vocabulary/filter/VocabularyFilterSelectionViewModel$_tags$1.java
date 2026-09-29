package com.lingq.p055ui.home.vocabulary.filter;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import mo.C7661i;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"", "", "languageTags", "selectedLanguageTags", "query", "", "Lnh/l;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$_tags$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyFilterSelectionViewModel$_tags$1 extends SuspendLambda implements InterfaceC2058r<List<? extends String>, List<? extends String>, String, InterfaceC9968c<? super List<C7785l>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f26453e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f26454f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ String f26455g;

    public VocabularyFilterSelectionViewModel$_tags$1(InterfaceC9968c<? super VocabularyFilterSelectionViewModel$_tags$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(List<? extends String> list, List<? extends String> list2, String str, InterfaceC9968c<? super List<C7785l>> interfaceC9968c) {
        VocabularyFilterSelectionViewModel$_tags$1 vocabularyFilterSelectionViewModel$_tags$1 = new VocabularyFilterSelectionViewModel$_tags$1(interfaceC9968c);
        vocabularyFilterSelectionViewModel$_tags$1.f26453e = list;
        vocabularyFilterSelectionViewModel$_tags$1.f26454f = list2;
        vocabularyFilterSelectionViewModel$_tags$1.f26455g = str;
        return vocabularyFilterSelectionViewModel$_tags$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f26453e;
        List list2 = this.f26454f;
        String str = this.f26455g;
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = (String) next;
            if ((!C7661i.m15250P2(str2)) && C7076b.m14278X2(str2, str, false)) {
                z10 = true;
            }
            if (z10) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(new C7785l(null, str3, list2.contains(str3), str3, 1));
        }
        arrayList.addAll(arrayList3);
        if (C7661i.m15250P2(str)) {
            arrayList.add(0, new C7785l(new Integer(R.string.search_all), null, list2.isEmpty(), "key_all", 2));
        }
        return arrayList;
    }
}
