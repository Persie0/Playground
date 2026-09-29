package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/ShelfJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Shelf;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ShelfJsonAdapter extends AbstractC4949k<Shelf> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17434a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17435b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f17436c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<List<Tab>> f17437d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17438e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<Shelf> f17439f;

    public ShelfJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17434a = JsonReader.C4932a.m10513a("codeWithLanguage", "language", "pinned", "tabs", "code", "id", "title", "order", "levels");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17435b = c4955q.m10565c(String.class, emptySet, "codeWithLanguage");
        this.f17436c = c4955q.m10565c(Boolean.class, emptySet, "pinned");
        this.f17437d = c4955q.m10565c(C9312p.m17659d(List.class, Tab.class), emptySet, "tabs");
        this.f17438e = c4955q.m10565c(Integer.TYPE, emptySet, "id");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Shelf mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Boolean boolMo9385a = null;
        List<Tab> listMo9385a = null;
        String strMo9385a3 = null;
        Integer numMo9385a2 = null;
        String strMo9385a4 = null;
        String strMo9385a5 = null;
        while (true) {
            Boolean bool = boolMo9385a;
            String str = strMo9385a5;
            Integer num = numMo9385a;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i10 == -265) {
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("codeWithLanguage", "codeWithLanguage", jsonReader);
                    }
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("language", "language", jsonReader);
                    }
                    C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.entity.Tab>");
                    if (strMo9385a3 == null) {
                        throw C9756b.m18248g("code", "code", jsonReader);
                    }
                    if (numMo9385a2 == null) {
                        throw C9756b.m18248g("id", "id", jsonReader);
                    }
                    int iIntValue = numMo9385a2.intValue();
                    if (strMo9385a4 == null) {
                        throw C9756b.m18248g("title", "title", jsonReader);
                    }
                    if (num == null) {
                        throw C9756b.m18248g("order", "order", jsonReader);
                    }
                    int iIntValue2 = num.intValue();
                    C5207g.m11109d(str, "null cannot be cast to non-null type kotlin.String");
                    return new Shelf(strMo9385a, strMo9385a2, bool, listMo9385a, strMo9385a3, iIntValue, strMo9385a4, iIntValue2, str);
                }
                Constructor<Shelf> declaredConstructor = this.f17439f;
                int i11 = 11;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = Shelf.class.getDeclaredConstructor(String.class, String.class, Boolean.class, List.class, String.class, cls, String.class, cls, String.class, cls, C9756b.f49813c);
                    this.f17439f = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "Shelf::class.java.getDec…his.constructorRef = it }");
                    i11 = 11;
                }
                Object[] objArr = new Object[i11];
                if (strMo9385a == null) {
                    throw C9756b.m18248g("codeWithLanguage", "codeWithLanguage", jsonReader);
                }
                objArr[0] = strMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("language", "language", jsonReader);
                }
                objArr[1] = strMo9385a2;
                objArr[2] = bool;
                objArr[3] = listMo9385a;
                if (strMo9385a3 == null) {
                    throw C9756b.m18248g("code", "code", jsonReader);
                }
                objArr[4] = strMo9385a3;
                if (numMo9385a2 == null) {
                    throw C9756b.m18248g("id", "id", jsonReader);
                }
                objArr[5] = Integer.valueOf(numMo9385a2.intValue());
                if (strMo9385a4 == null) {
                    throw C9756b.m18248g("title", "title", jsonReader);
                }
                objArr[6] = strMo9385a4;
                if (num == null) {
                    throw C9756b.m18248g("order", "order", jsonReader);
                }
                objArr[7] = Integer.valueOf(num.intValue());
                objArr[8] = str;
                objArr[9] = Integer.valueOf(i10);
                objArr[10] = null;
                Shelf shelfNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(shelfNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return shelfNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f17434a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17435b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("codeWithLanguage", "codeWithLanguage", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case 1:
                    strMo9385a2 = this.f17435b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case 2:
                    boolMo9385a = this.f17436c.mo9385a(jsonReader);
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case 3:
                    listMo9385a = this.f17437d.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tabs", "tabs", jsonReader);
                    }
                    i10 &= -9;
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                    break;
                case 4:
                    strMo9385a3 = this.f17435b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case 5:
                    numMo9385a2 = this.f17438e.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a4 = this.f17435b.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a = this.f17438e.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    break;
                    break;
                case 8:
                    strMo9385a5 = this.f17435b.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("levels", "levels", jsonReader);
                    }
                    i10 &= -257;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                    break;
                default:
                    boolMo9385a = bool;
                    strMo9385a5 = str;
                    numMo9385a = num;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Shelf shelf) throws IOException {
        Shelf shelf2 = shelf;
        C5207g.m11111f(abstractC9310n, "writer");
        if (shelf2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("codeWithLanguage");
        String str = shelf2.f17425a;
        AbstractC4949k<String> abstractC4949k = this.f17435b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, shelf2.f17426b);
        abstractC9310n.mo10551C("pinned");
        this.f17436c.mo9386f(abstractC9310n, shelf2.f17427c);
        abstractC9310n.mo10551C("tabs");
        this.f17437d.mo9386f(abstractC9310n, shelf2.f17428d);
        abstractC9310n.mo10551C("code");
        abstractC4949k.mo9386f(abstractC9310n, shelf2.f17429e);
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(shelf2.f17430f);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17438e;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, shelf2.f17431g);
        abstractC9310n.mo10551C("order");
        C0166e.m775v(shelf2.f17432h, abstractC4949k2, abstractC9310n, "levels");
        abstractC4949k.mo9386f(abstractC9310n, shelf2.f17433i);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(27, "GeneratedJsonAdapter(Shelf)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
