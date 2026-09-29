package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageAction;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton;
import com.lingq.core.analytics.embedded.EmbeddedMessageElements;
import com.lingq.core.analytics.embedded.EmbeddedMessageMetadata;
import com.lingq.core.analytics.embedded.EmbeddedMessagePayload;
import com.lingq.core.analytics.embedded.EmbeddedMessageText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f49872a = new C0282a(-1642941234, false, new jx0(18));

    /* JADX INFO: renamed from: b */
    public static final C0282a f49873b = new C0282a(1370665006, false, new jx0(19));

    /* JADX INFO: renamed from: c */
    public static final C0282a f49874c = new C0282a(1303139556, false, new z70(20));

    /* JADX INFO: renamed from: a */
    public static final EmbeddedMessage m16397a(rb4 rb4Var, df4 df4Var) {
        EmptyList emptyList;
        List list;
        List list2;
        List list3;
        List list4;
        mp2 mp2Var;
        String str;
        String str2;
        String str3;
        String str4;
        up2 up2Var = rb4Var.f59022a;
        t33 t33Var = rb4Var.f59023b;
        EmbeddedMessageMetadata embeddedMessageMetadata = new EmbeddedMessageMetadata(((Integer) up2Var.f64167d).intValue(), up2Var.f64164a, (String) up2Var.f64166c, rb4Var.f59022a.f64165b);
        String str5 = (t33Var == null || (str4 = t33Var.f61786a) == null) ? "" : str4;
        String str6 = (t33Var == null || (str3 = (String) t33Var.f61787b) == null) ? "" : str3;
        String str7 = (t33Var == null || (str2 = (String) t33Var.f61788c) == null) ? "" : str2;
        String str8 = (t33Var == null || (str = (String) t33Var.f61789d) == null) ? "" : str;
        EmbeddedMessageAction embeddedMessageAction = (t33Var == null || (mp2Var = (mp2) t33Var.f61790e) == null) ? new EmbeddedMessageAction("", "") : new EmbeddedMessageAction(mp2Var.f51686b, mp2Var.f51687c);
        EmptyList emptyList2 = EmptyList.f47638a;
        if (t33Var == null || (list4 = (List) t33Var.f61791f) == null) {
            emptyList = emptyList2;
            list = emptyList;
        } else {
            List list5 = list4;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list5, 10));
            for (Iterator it = list5.iterator(); it.hasNext(); it = it) {
                lp2 lp2Var = (lp2) it.next();
                String str9 = lp2Var.f49974b;
                sc2 sc2Var = lp2Var.f49975c;
                EmptyList emptyList3 = emptyList2;
                arrayList.add(new EmbeddedMessageButton(str9, sc2Var != null ? new EmbeddedMessageAction(sc2Var.f60665a, sc2Var.f60666b) : new EmbeddedMessageAction("", ""), lp2Var.f49973a));
                emptyList2 = emptyList3;
            }
            emptyList = emptyList2;
            list = arrayList;
        }
        if (t33Var == null || (list3 = (List) t33Var.f61792g) == null) {
            list2 = emptyList;
        } else {
            List<np2> list6 = list3;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list6, 10));
            for (np2 np2Var : list6) {
                arrayList2.add(new EmbeddedMessageText(np2Var.f53089b, np2Var.f53090c, np2Var.f53088a));
            }
            list2 = arrayList2;
        }
        String strValueOf = String.valueOf(rb4Var.f59024c);
        df4Var.getClass();
        return new EmbeddedMessage(embeddedMessageMetadata, new EmbeddedMessageElements(str5, str6, str7, str8, embeddedMessageAction, list, list2, (EmbeddedMessagePayload) df4Var.m10321a(strValueOf, EmbeddedMessagePayload.Companion.serializer())));
    }
}
