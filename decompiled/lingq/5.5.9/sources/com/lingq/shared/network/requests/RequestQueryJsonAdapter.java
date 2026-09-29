package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import dm.C5213m;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestQueryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/requests/RequestQuery;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestQueryJsonAdapter extends AbstractC4949k<RequestQuery> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18175a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18176b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18177c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Set<String>> f18178d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Set<Integer>> f18179e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f18180f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Integer> f18181g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<List<String>> f18182h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<List<String>> f18183i;

    /* JADX INFO: renamed from: j */
    public volatile Constructor<RequestQuery> f18184j;

    public RequestQueryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18175a = JsonReader.C4932a.m10513a("pageSize", "sortBy", "sections", "resources", "level", "isExternal", "isPersonal", "provider", "tags", "accents", "sharedBy");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18176b = c4955q.m10565c(cls, emptySet, "pageSize");
        this.f18177c = c4955q.m10565c(String.class, emptySet, "sortBy");
        this.f18178d = c4955q.m10565c(C9312p.m17659d(Set.class, String.class), emptySet, "sections");
        this.f18179e = c4955q.m10565c(C9312p.m17659d(Set.class, Integer.class), emptySet, "level");
        this.f18180f = c4955q.m10565c(Boolean.class, emptySet, "isExternal");
        this.f18181g = c4955q.m10565c(Integer.class, emptySet, "provider");
        this.f18182h = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f18183i = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "accents");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final RequestQuery mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Integer numM850i = C0204c.m850i(jsonReader, "reader", 0);
        int i10 = -1;
        List<String> listMo9385a = null;
        Integer numMo9385a = null;
        List<String> listMo9385a2 = null;
        Integer numMo9385a2 = null;
        Boolean boolMo9385a = null;
        Boolean boolMo9385a2 = null;
        Set<Integer> setMo9385a = null;
        Set<String> setMo9385a2 = null;
        Set<String> setMo9385a3 = null;
        String strMo9385a = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18175a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numM850i = this.f18176b.mo9385a(jsonReader);
                    if (numM850i == null) {
                        throw C9756b.m18254m("pageSize", "pageSize", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f18177c.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    setMo9385a3 = this.f18178d.mo9385a(jsonReader);
                    if (setMo9385a3 == null) {
                        throw C9756b.m18254m("sections", "sections", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    setMo9385a2 = this.f18178d.mo9385a(jsonReader);
                    if (setMo9385a2 == null) {
                        throw C9756b.m18254m("resources", "resources", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    setMo9385a = this.f18179e.mo9385a(jsonReader);
                    if (setMo9385a == null) {
                        throw C9756b.m18254m("level", "level", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a2 = this.f18180f.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a = this.f18180f.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f18181g.mo9385a(jsonReader);
                    break;
                case 8:
                    listMo9385a2 = this.f18182h.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    listMo9385a = this.f18183i.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("accents", "accents", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    numMo9385a = this.f18181g.mo9385a(jsonReader);
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -800) {
            int iIntValue = numM850i.intValue();
            C5207g.m11109d(setMo9385a3, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            C5207g.m11109d(setMo9385a2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            C5207g.m11109d(setMo9385a, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.Int>");
            C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
            C5213m.m11197b(listMo9385a2);
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new RequestQuery(iIntValue, strMo9385a, setMo9385a3, setMo9385a2, setMo9385a, boolMo9385a2, boolMo9385a, numMo9385a2, listMo9385a2, listMo9385a, numMo9385a);
        }
        Constructor<RequestQuery> declaredConstructor = this.f18184j;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = RequestQuery.class.getDeclaredConstructor(cls, String.class, Set.class, Set.class, Set.class, Boolean.class, Boolean.class, Integer.class, List.class, List.class, Integer.class, cls, C9756b.f49813c);
            this.f18184j = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "RequestQuery::class.java…his.constructorRef = it }");
        }
        RequestQuery requestQueryNewInstance = declaredConstructor.newInstance(numM850i, strMo9385a, setMo9385a3, setMo9385a2, setMo9385a, boolMo9385a2, boolMo9385a, numMo9385a2, listMo9385a2, listMo9385a, numMo9385a, Integer.valueOf(i10), null);
        C5207g.m11110e(requestQueryNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return requestQueryNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, RequestQuery requestQuery) throws IOException {
        RequestQuery requestQuery2 = requestQuery;
        C5207g.m11111f(abstractC9310n, "writer");
        if (requestQuery2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pageSize");
        this.f18176b.mo9386f(abstractC9310n, Integer.valueOf(requestQuery2.f18164a));
        abstractC9310n.mo10551C("sortBy");
        this.f18177c.mo9386f(abstractC9310n, requestQuery2.f18165b);
        abstractC9310n.mo10551C("sections");
        Set<String> set = requestQuery2.f18166c;
        AbstractC4949k<Set<String>> abstractC4949k = this.f18178d;
        abstractC4949k.mo9386f(abstractC9310n, set);
        abstractC9310n.mo10551C("resources");
        abstractC4949k.mo9386f(abstractC9310n, requestQuery2.f18167d);
        abstractC9310n.mo10551C("level");
        this.f18179e.mo9386f(abstractC9310n, requestQuery2.f18168e);
        abstractC9310n.mo10551C("isExternal");
        Boolean bool = requestQuery2.f18169f;
        AbstractC4949k<Boolean> abstractC4949k2 = this.f18180f;
        abstractC4949k2.mo9386f(abstractC9310n, bool);
        abstractC9310n.mo10551C("isPersonal");
        abstractC4949k2.mo9386f(abstractC9310n, requestQuery2.f18170g);
        abstractC9310n.mo10551C("provider");
        Integer num = requestQuery2.f18171h;
        AbstractC4949k<Integer> abstractC4949k3 = this.f18181g;
        abstractC4949k3.mo9386f(abstractC9310n, num);
        abstractC9310n.mo10551C("tags");
        this.f18182h.mo9386f(abstractC9310n, requestQuery2.f18172i);
        abstractC9310n.mo10551C("accents");
        this.f18183i.mo9386f(abstractC9310n, requestQuery2.f18173j);
        abstractC9310n.mo10551C("sharedBy");
        abstractC4949k3.mo9386f(abstractC9310n, requestQuery2.f18174k);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(RequestQuery)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
