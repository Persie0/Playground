package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Tab;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultShelfJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultShelf;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultShelfJsonAdapter extends AbstractC4949k<ResultShelf> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18955a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Boolean> f18956b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<Tab>> f18957c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f18958d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f18959e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<ResultShelf> f18960f;

    public ResultShelfJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18955a = JsonReader.C4932a.m10513a("pinned", "tabs", "code", "id", "title");
        EmptySet emptySet = EmptySet.f38034a;
        this.f18956b = c4955q.m10565c(Boolean.class, emptySet, "pinned");
        this.f18957c = c4955q.m10565c(C9312p.m17659d(List.class, Tab.class), emptySet, "tabs");
        this.f18958d = c4955q.m10565c(String.class, emptySet, "code");
        this.f18959e = c4955q.m10565c(Integer.TYPE, emptySet, "id");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultShelf mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Boolean boolMo9385a = null;
        List<Tab> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18955a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                boolMo9385a = this.f18956b.mo9385a(jsonReader);
            } else if (iMo10512y0 == 1) {
                listMo9385a = this.f18957c.mo9385a(jsonReader);
                if (listMo9385a == null) {
                    throw C9756b.m18254m("tabs", "tabs", jsonReader);
                }
                i10 &= -3;
            } else if (iMo10512y0 == 2) {
                strMo9385a = this.f18958d.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("code", "code", jsonReader);
                }
            } else if (iMo10512y0 == 3) {
                numMo9385a = this.f18959e.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("id", "id", jsonReader);
                }
            } else if (iMo10512y0 == 4 && (strMo9385a2 = this.f18958d.mo9385a(jsonReader)) == null) {
                throw C9756b.m18254m("title", "title", jsonReader);
            }
        }
        jsonReader.mo10508q();
        if (i10 == -3) {
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Tab>");
            if (strMo9385a == null) {
                throw C9756b.m18248g("code", "code", jsonReader);
            }
            if (numMo9385a == null) {
                throw C9756b.m18248g("id", "id", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (strMo9385a2 != null) {
                return new ResultShelf(boolMo9385a, listMo9385a, strMo9385a, iIntValue, strMo9385a2);
            }
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        Constructor<ResultShelf> declaredConstructor = this.f18960f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = ResultShelf.class.getDeclaredConstructor(Boolean.class, List.class, String.class, cls, String.class, cls, C9756b.f49813c);
            this.f18960f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultShelf::class.java.…his.constructorRef = it }");
        }
        Object[] objArr = new Object[7];
        objArr[0] = boolMo9385a;
        objArr[1] = listMo9385a;
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[2] = strMo9385a;
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[3] = Integer.valueOf(numMo9385a.intValue());
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        objArr[4] = strMo9385a2;
        objArr[5] = Integer.valueOf(i10);
        objArr[6] = null;
        ResultShelf resultShelfNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultShelfNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultShelfNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultShelf resultShelf) throws IOException {
        ResultShelf resultShelf2 = resultShelf;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultShelf2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pinned");
        this.f18956b.mo9386f(abstractC9310n, resultShelf2.f18950a);
        abstractC9310n.mo10551C("tabs");
        this.f18957c.mo9386f(abstractC9310n, resultShelf2.f18951b);
        abstractC9310n.mo10551C("code");
        String str = resultShelf2.f18952c;
        AbstractC4949k<String> abstractC4949k = this.f18958d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("id");
        this.f18959e.mo9386f(abstractC9310n, Integer.valueOf(resultShelf2.f18953d));
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, resultShelf2.f18954e);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(33, "GeneratedJsonAdapter(ResultShelf)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
