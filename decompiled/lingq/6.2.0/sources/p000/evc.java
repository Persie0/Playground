package p000;

import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.network.api.result.ResultTokenMeaning;
import com.lingq.core.network.api.result.ResultTokenReadings;
import com.lingq.core.network.api.result.ResultWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class evc {

    /* JADX INFO: renamed from: a */
    public static final int[] f37960a = {13, 15, 14};

    /* JADX INFO: renamed from: a */
    public static final WordEntity m11366a(ResultWord resultWord, String str) {
        String str2 = resultWord.f21725a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ArrayList arrayListM22587E0 = u91.m22587E0(resultWord.f21730f);
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22587E0, 10));
        Iterator it = arrayListM22587E0.iterator();
        while (it.hasNext()) {
            arrayList.add(ouc.m18521a((ResultTokenMeaning) it.next()));
        }
        List list = resultWord.f21731g;
        String str4 = resultWord.f21727c;
        int i = resultWord.f21728d;
        int i2 = resultWord.f21726b;
        int i3 = resultWord.f21732h;
        ResultTokenReadings resultTokenReadings = resultWord.f21733i;
        return new WordEntity(i2, i, i3, str, str3, str4, arrayList, list, EmptyList.f47638a, resultTokenReadings != null ? resultTokenReadings.f21598a : null, resultTokenReadings != null ? resultTokenReadings.f21599b : null, resultTokenReadings != null ? resultTokenReadings.f21600c : null, resultTokenReadings != null ? resultTokenReadings.f21601d : null, resultTokenReadings != null ? resultTokenReadings.f21602e : null, resultTokenReadings != null ? resultTokenReadings.f21603f : null, false);
    }
}
