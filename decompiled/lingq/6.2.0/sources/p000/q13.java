package p000;

import com.lingq.core.domain.model.FeedTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q13 {
    /* JADX INFO: renamed from: a */
    public static ArrayList m19597a(Set set) {
        set.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            FeedTopic feedTopicM15201I = AbstractC3184kh.m15201I((String) it.next());
            if (feedTopicM15201I != null) {
                arrayList.add(feedTopicM15201I.name());
            }
        }
        return arrayList;
    }
}
