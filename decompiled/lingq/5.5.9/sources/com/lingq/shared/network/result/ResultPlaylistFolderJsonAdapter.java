package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultPlaylistFolderJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultPlaylistFolder;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultPlaylistFolderJsonAdapter extends AbstractC4949k<ResultPlaylistFolder> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18891a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f18892b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f18893c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f18894d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<ResultPlaylistFolder> f18895e;

    public ResultPlaylistFolderJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18891a = JsonReader.C4932a.m10513a("pk", "title", "isDefault", "isFeatured");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18892b = c4955q.m10565c(cls, emptySet, "pk");
        this.f18893c = c4955q.m10565c(String.class, emptySet, "title");
        this.f18894d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDefault");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultPlaylistFolder mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        String strMo9385a = null;
        while (jsonReader.mo10511w()) {
            int iMo10512y0 = jsonReader.mo10512y0(this.f18891a);
            if (iMo10512y0 == -1) {
                jsonReader.mo10496G0();
                jsonReader.mo10498I0();
            } else if (iMo10512y0 == 0) {
                numMo9385a = this.f18892b.mo9385a(jsonReader);
                if (numMo9385a == null) {
                    throw C9756b.m18254m("pk", "pk", jsonReader);
                }
                i10 &= -2;
            } else if (iMo10512y0 == 1) {
                strMo9385a = this.f18893c.mo9385a(jsonReader);
                if (strMo9385a == null) {
                    throw C9756b.m18254m("title", "title", jsonReader);
                }
            } else if (iMo10512y0 == 2) {
                boolMo9385a = this.f18894d.mo9385a(jsonReader);
                if (boolMo9385a == null) {
                    throw C9756b.m18254m("isDefault", "isDefault", jsonReader);
                }
                i10 &= -5;
            } else if (iMo10512y0 == 3) {
                boolMo9385a2 = this.f18894d.mo9385a(jsonReader);
                if (boolMo9385a2 == null) {
                    throw C9756b.m18254m("isFeatured", "isFeatured", jsonReader);
                }
                i10 &= -9;
            } else {
                continue;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -14) {
            int iIntValue = numMo9385a.intValue();
            if (strMo9385a != null) {
                return new ResultPlaylistFolder(strMo9385a, iIntValue, boolMo9385a.booleanValue(), boolMo9385a2.booleanValue());
            }
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        Constructor<ResultPlaylistFolder> declaredConstructor = this.f18895e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = ResultPlaylistFolder.class.getDeclaredConstructor(cls, String.class, cls2, cls2, cls, C9756b.f49813c);
            this.f18895e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultPlaylistFolder::cl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        objArr[0] = numMo9385a;
        if (strMo9385a == null) {
            throw C9756b.m18248g("title", "title", jsonReader);
        }
        objArr[1] = strMo9385a;
        objArr[2] = boolMo9385a;
        objArr[3] = boolMo9385a2;
        objArr[4] = Integer.valueOf(i10);
        objArr[5] = null;
        ResultPlaylistFolder resultPlaylistFolderNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(resultPlaylistFolderNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultPlaylistFolderNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultPlaylistFolder resultPlaylistFolder) throws IOException {
        ResultPlaylistFolder resultPlaylistFolder2 = resultPlaylistFolder;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultPlaylistFolder2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pk");
        this.f18892b.mo9386f(abstractC9310n, Integer.valueOf(resultPlaylistFolder2.f18887a));
        abstractC9310n.mo10551C("title");
        this.f18893c.mo9386f(abstractC9310n, resultPlaylistFolder2.f18888b);
        abstractC9310n.mo10551C("isDefault");
        Boolean boolValueOf = Boolean.valueOf(resultPlaylistFolder2.f18889c);
        AbstractC4949k<Boolean> abstractC4949k = this.f18894d;
        abstractC4949k.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("isFeatured");
        abstractC4949k.mo9386f(abstractC9310n, Boolean.valueOf(resultPlaylistFolder2.f18890d));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultPlaylistFolder)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
