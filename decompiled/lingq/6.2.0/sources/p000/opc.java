package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.network.api.requests.RequestClozeTest;
import com.lingq.core.network.api.requests.SentenceFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class opc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f54707a = new C0282a(-1544403160, false, new fe1(2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static final sc8 m18203a(RequestClozeTest requestClozeTest) {
        ?? arrayList;
        requestClozeTest.getClass();
        String str = requestClozeTest.f20338a;
        if (str == null) {
            str = "";
        }
        List list = requestClozeTest.f20339b;
        List list2 = EmptyList.f47638a;
        if (list != null) {
            List<SentenceFragment> list3 = list;
            arrayList = new ArrayList(v91.m23189q0(list3, 10));
            for (SentenceFragment sentenceFragment : list3) {
                String str2 = sentenceFragment.f20494a;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new i41(str2, sentenceFragment.f20495b));
            }
        } else {
            arrayList = list2;
        }
        List list4 = requestClozeTest.f20340c;
        if (list4 != null) {
            list2 = list4;
        }
        return new sc8(str, arrayList, list2);
    }
}
