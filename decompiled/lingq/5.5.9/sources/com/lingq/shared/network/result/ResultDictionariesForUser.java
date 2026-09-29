package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001a\b\u0003\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJM\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\b\u0003\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¨\u0006\f"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultDictionariesForUser;", "", "", "Lcom/lingq/shared/network/result/ResultDictionaryData;", "activeDictionaries", "", "", "availableDictionaries", "dictionaryLanguages", "copy", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultDictionariesForUser {

    /* JADX INFO: renamed from: a */
    public final List<ResultDictionaryData> f18387a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<ResultDictionaryData>> f18388b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f18389c;

    public ResultDictionariesForUser() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResultDictionariesForUser(@InterfaceC9303g(name = "userDicts") List<ResultDictionaryData> list, @InterfaceC9303g(name = "availableDicts") Map<String, ? extends List<ResultDictionaryData>> map, @InterfaceC9303g(name = "langs") Map<String, String> map2) {
        C5207g.m11111f(list, "activeDictionaries");
        C5207g.m11111f(map, "availableDictionaries");
        C5207g.m11111f(map2, "dictionaryLanguages");
        this.f18387a = list;
        this.f18388b = map;
        this.f18389c = map2;
    }

    public ResultDictionariesForUser(List list, Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, (i10 & 2) != 0 ? C6753d.m13459L0() : map, (i10 & 4) != 0 ? C6753d.m13459L0() : map2);
    }

    public final ResultDictionariesForUser copy(@InterfaceC9303g(name = "userDicts") List<ResultDictionaryData> activeDictionaries, @InterfaceC9303g(name = "availableDicts") Map<String, ? extends List<ResultDictionaryData>> availableDictionaries, @InterfaceC9303g(name = "langs") Map<String, String> dictionaryLanguages) {
        C5207g.m11111f(activeDictionaries, "activeDictionaries");
        C5207g.m11111f(availableDictionaries, "availableDictionaries");
        C5207g.m11111f(dictionaryLanguages, "dictionaryLanguages");
        return new ResultDictionariesForUser(activeDictionaries, availableDictionaries, dictionaryLanguages);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultDictionariesForUser)) {
            return false;
        }
        ResultDictionariesForUser resultDictionariesForUser = (ResultDictionariesForUser) obj;
        return C5207g.m11106a(this.f18387a, resultDictionariesForUser.f18387a) && C5207g.m11106a(this.f18388b, resultDictionariesForUser.f18388b) && C5207g.m11106a(this.f18389c, resultDictionariesForUser.f18389c);
    }

    public final int hashCode() {
        return this.f18389c.hashCode() + ((this.f18388b.hashCode() + (this.f18387a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ResultDictionariesForUser(activeDictionaries=" + this.f18387a + ", availableDictionaries=" + this.f18388b + ", dictionaryLanguages=" + this.f18389c + ")";
    }
}
