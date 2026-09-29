package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.network.api.result.worldcup.ResultCupPrize;
import com.lingq.core.network.api.result.worldcup.ResultCupPrizes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f64235a = new C0282a(1744189993, false, new ee1(27));

    /* JADX INFO: renamed from: a */
    public static final ArrayList m22872a(ResultCupPrizes resultCupPrizes) {
        resultCupPrizes.getClass();
        List list = resultCupPrizes.f21798a;
        ArrayList<CupPrize> arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(vqc.m23482a((ResultCupPrize) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (CupPrize cupPrize : arrayList) {
            cupPrize.getClass();
            String str = cupPrize.f18987a;
            iu1 iu1Var = str != null ? new iu1(str, cupPrize.f18988b.name(), cupPrize.f18989c.name(), cupPrize.f18990d, cupPrize.f18991e, cupPrize.f18992f) : null;
            if (iu1Var != null) {
                arrayList2.add(iu1Var);
            }
        }
        return arrayList2;
    }
}
