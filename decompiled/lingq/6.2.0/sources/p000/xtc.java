package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.network.api.result.ResultMeaning;
import com.lingq.core.network.api.result.ResultRelatedPhrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xtc {
    /* JADX INFO: renamed from: a */
    public static final e16 m24701a(e16 e16Var, C0097e c0097e, Orientation orientation, zi3 zi3Var) {
        return e16Var.mo3161g(new cl2(c0097e, zi3Var, orientation));
    }

    /* JADX INFO: renamed from: b */
    public static final TokenRelatedPhrase m24702b(ResultRelatedPhrase resultRelatedPhrase) {
        resultRelatedPhrase.getClass();
        String str = resultRelatedPhrase.f21485a;
        if (str == null) {
            str = "";
        }
        String str2 = resultRelatedPhrase.f21486b;
        String str3 = str2 != null ? str2 : "";
        List list = resultRelatedPhrase.f21487c;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(psc.m19473a((ResultMeaning) it.next()));
        }
        return new TokenRelatedPhrase(str, str3, arrayList);
    }
}
