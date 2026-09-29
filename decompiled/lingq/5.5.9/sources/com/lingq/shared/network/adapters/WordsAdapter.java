package com.lingq.shared.network.adapters;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultWord;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p260m8.C7499b;
import p511yh.C10368e;
import tk.InterfaceC9302f;
import tk.InterfaceC9311o;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\f"}, m13365d2 = {"Lcom/lingq/shared/network/adapters/WordsAdapter;", "", "", "", "Lcom/lingq/shared/network/result/ResultWord;", "data", "Lyh/e;", "wordsFromJson", "words", "wordsToJson", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class WordsAdapter {
    @InterfaceC9302f
    public final C10368e wordsFromJson(Map<Integer, ResultWord> data) {
        C5207g.m11111f(data, "data");
        ArrayList arrayList = new ArrayList(data.size());
        for (Map.Entry<Integer, ResultWord> entry : data.entrySet()) {
            entry.getValue().f19117b = entry.getKey().intValue();
            arrayList.add(entry.getValue());
        }
        return new C10368e(arrayList);
    }

    @InterfaceC9311o
    public final Map<Integer, ResultWord> wordsToJson(C10368e words) {
        C5207g.m11111f(words, "words");
        List<ResultWord> list = words.f52120a;
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(list, 10));
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((ResultWord) obj).f19117b), obj);
        }
        return linkedHashMap;
    }
}
