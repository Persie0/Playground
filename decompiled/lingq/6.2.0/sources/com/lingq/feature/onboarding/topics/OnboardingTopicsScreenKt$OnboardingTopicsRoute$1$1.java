package com.lingq.feature.onboarding.topics;

import com.lingq.core.domain.model.FeedTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.cx6;
import p000.gm5;
import p000.m7a;
import p000.o7a;
import p000.u91;
import p000.v91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class OnboardingTopicsScreenKt$OnboardingTopicsRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        ArrayList arrayList;
        o7a o7aVar = (o7a) obj;
        o7aVar.getClass();
        OnboardingTopicsViewModel onboardingTopicsViewModel = (OnboardingTopicsViewModel) this.f47704b;
        onboardingTopicsViewModel.getClass();
        if (!(o7aVar instanceof o7a)) {
            gm5.m12750e();
            return null;
        }
        FeedTopic feedTopic = o7aVar.f53956a;
        C3244l c3244l = onboardingTopicsViewModel.f27285b;
        do {
            value = c3244l.getValue();
            List<m7a> list = (List) value;
            arrayList = new ArrayList(v91.m23189q0(list, 10));
            for (m7a m7aVar : list) {
                FeedTopic feedTopic2 = m7aVar.f50736a;
                if (feedTopic2 == feedTopic) {
                    boolean z = !m7aVar.f50737b;
                    feedTopic2.getClass();
                    m7aVar = new m7a(feedTopic2, z);
                }
                arrayList.add(m7aVar);
            }
        } while (!c3244l.m15570h(value, arrayList));
        String str = cx6.f34682a;
        Iterable iterable = (Iterable) c3244l.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            if (((m7a) obj2).f50737b) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC3184kh.m15203K(((m7a) it.next()).f50736a));
        }
        cx6.f34685d = u91.m22626r1(arrayList3);
        return xfa.f68157a;
    }
}
