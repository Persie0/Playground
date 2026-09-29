package com.lingq.p055ui.lesson.edit;

import android.R;
import android.widget.ArrayAdapter;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$2$2", m19206f = "SentenceEditPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class SentenceEditPageFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28006e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SentenceEditPageFragment f28007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageFragment$onViewCreated$2$2(SentenceEditPageFragment sentenceEditPageFragment, InterfaceC9968c<? super SentenceEditPageFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28007f = sentenceEditPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SentenceEditPageFragment$onViewCreated$2$2 sentenceEditPageFragment$onViewCreated$2$2 = new SentenceEditPageFragment$onViewCreated$2$2(this.f28007f, interfaceC9968c);
        sentenceEditPageFragment$onViewCreated$2$2.f28006e = obj;
        return sentenceEditPageFragment$onViewCreated$2$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SentenceEditPageFragment$onViewCreated$2$2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = (List) this.f28006e;
        if (list != null) {
            SentenceEditPageFragment sentenceEditPageFragment = this.f28007f;
            sentenceEditPageFragment.f27991D0 = new ArrayAdapter<>(sentenceEditPageFragment.m3578a0(), R.layout.simple_list_item_1);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C4924a.m10439R(sentenceEditPageFragment.m3578a0(), ((UserDictionaryLocale) it.next()).f21721a));
            }
            C9326n.m17682B(arrayList, new SentenceEditPageFragment.C4296c(new InterfaceC2056p<String, String, Integer>() { // from class: com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$2$2$1$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(String str, String str2) {
                    String str3 = str2;
                    C5207g.m11110e(str3, "t1");
                    return Integer.valueOf(str.compareTo(str3));
                }
            }));
            ArrayAdapter<String> arrayAdapter = sentenceEditPageFragment.f27991D0;
            if (arrayAdapter == null) {
                C5207g.m11117l("localesAdapter");
                throw null;
            }
            arrayAdapter.addAll(arrayList);
        }
        return C9072e.f47360a;
    }
}
