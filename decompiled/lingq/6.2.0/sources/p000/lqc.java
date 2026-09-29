package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.network.api.result.ResultCardChat;
import com.lingq.core.network.api.result.ResultTokenMeaning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f50019a = new C0282a(1776998002, false, new ee1(15));

    /* JADX INFO: renamed from: b */
    public static final C0282a f50020b = new C0282a(711259194, false, new ee1(16));

    /* JADX INFO: renamed from: c */
    public static final C0282a f50021c = new C0282a(-422564872, false, new ee1(17));

    /* JADX INFO: renamed from: a */
    public static final CardEntity m16468a(ResultCardChat resultCardChat, String str, boolean z) {
        int i = resultCardChat.f20638b;
        String str2 = resultCardChat.f20637a;
        String str3 = resultCardChat.f20646j;
        List list = resultCardChat.f20648l;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ouc.m18521a((ResultTokenMeaning) it.next()));
        }
        List list2 = resultCardChat.f20649m;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList2));
        List list3 = resultCardChat.f20650n;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList3.add(lowerCase2);
        }
        List listM22622n2 = u91.m22622n1(u91.m22626r1(arrayList3));
        int i2 = resultCardChat.f20641e;
        Integer num = resultCardChat.f20642f;
        String str4 = resultCardChat.f20640d;
        int i3 = resultCardChat.f20647k;
        String str5 = resultCardChat.f20643g;
        String str6 = resultCardChat.f20645i;
        return new CardEntity(str2, str, i, resultCardChat.f20639c, str4, i2, num, str5, resultCardChat.f20644h, str6, str3, i3, arrayList, listM22622n1, listM22622n2, null, null, null, null, null, null, null, null, null, z, null, 134291456);
    }
}
