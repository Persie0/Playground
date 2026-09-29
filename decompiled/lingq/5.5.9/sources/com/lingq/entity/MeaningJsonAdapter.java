package com.lingq.entity;

import android.support.v4.media.C0141b;
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
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/MeaningJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Meaning;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class MeaningJsonAdapter extends AbstractC4949k<Meaning> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17286a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17287b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17288c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17289d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f17290e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<Meaning> f17291f;

    public MeaningJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17286a = JsonReader.C4932a.m10513a("id", "locale", "text", "term_id", "popularity", "flagged", "detected_locale", "creator_id", "is_google_translate", "word_id");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17287b = c4955q.m10565c(cls, emptySet, "id");
        this.f17288c = c4955q.m10565c(String.class, emptySet, "locale");
        this.f17289d = c4955q.m10565c(Boolean.TYPE, emptySet, "flagged");
        this.f17290e = c4955q.m10565c(Integer.class, emptySet, "creatorId");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Meaning mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Integer numMo9385a2 = numMo9385a;
        Boolean boolMo9385a = bool;
        int i10 = -1;
        Boolean boolMo9385a2 = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Integer numMo9385a3 = null;
        Integer numMo9385a4 = numMo9385a2;
        Integer numMo9385a5 = numMo9385a4;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17286a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17287b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a = this.f17288c.mo9385a(jsonReader);
                    break;
                case 2:
                    strMo9385a2 = this.f17288c.mo9385a(jsonReader);
                    break;
                case 3:
                    numMo9385a4 = this.f17287b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("termId", "term_id", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    numMo9385a5 = this.f17287b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("popularity", "popularity", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a2 = this.f17289d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("flagged", "flagged", jsonReader);
                    }
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strMo9385a3 = this.f17288c.mo9385a(jsonReader);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a3 = this.f17290e.mo9385a(jsonReader);
                    break;
                case 8:
                    boolMo9385a = this.f17289d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isGoogleTranslate", "is_google_translate", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    numMo9385a2 = this.f17287b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("wordId", "word_id", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -794) {
            int iIntValue = numMo9385a.intValue();
            int iIntValue2 = numMo9385a4.intValue();
            int iIntValue3 = numMo9385a5.intValue();
            if (boolMo9385a2 != null) {
                return new Meaning(iIntValue, strMo9385a, strMo9385a2, iIntValue2, iIntValue3, boolMo9385a2.booleanValue(), strMo9385a3, numMo9385a3, boolMo9385a.booleanValue(), numMo9385a2.intValue());
            }
            throw C9756b.m18248g("flagged", "flagged", jsonReader);
        }
        Constructor<Meaning> declaredConstructor = this.f17291f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = Meaning.class.getDeclaredConstructor(cls, String.class, String.class, cls, cls, cls2, String.class, Integer.class, cls2, cls, cls, C9756b.f49813c);
            this.f17291f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Meaning::class.java.getD…his.constructorRef = it }");
        }
        Object[] objArr = new Object[12];
        objArr[0] = numMo9385a;
        objArr[1] = strMo9385a;
        objArr[2] = strMo9385a2;
        objArr[3] = numMo9385a4;
        objArr[4] = numMo9385a5;
        if (boolMo9385a2 == null) {
            throw C9756b.m18248g("flagged", "flagged", jsonReader);
        }
        objArr[5] = Boolean.valueOf(boolMo9385a2.booleanValue());
        objArr[6] = strMo9385a3;
        objArr[7] = numMo9385a3;
        objArr[8] = boolMo9385a;
        objArr[9] = numMo9385a2;
        objArr[10] = Integer.valueOf(i10);
        objArr[11] = null;
        Meaning meaningNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(meaningNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return meaningNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Meaning meaning) throws IOException {
        Meaning meaning2 = meaning;
        C5207g.m11111f(abstractC9310n, "writer");
        if (meaning2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(meaning2.f17276a);
        AbstractC4949k<Integer> abstractC4949k = this.f17287b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("locale");
        String str = meaning2.f17277b;
        AbstractC4949k<String> abstractC4949k2 = this.f17288c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("text");
        abstractC4949k2.mo9386f(abstractC9310n, meaning2.f17278c);
        abstractC9310n.mo10551C("term_id");
        C0166e.m775v(meaning2.f17279d, abstractC4949k, abstractC9310n, "popularity");
        C0166e.m775v(meaning2.f17280e, abstractC4949k, abstractC9310n, "flagged");
        Boolean boolValueOf = Boolean.valueOf(meaning2.f17281f);
        AbstractC4949k<Boolean> abstractC4949k3 = this.f17289d;
        abstractC4949k3.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("detected_locale");
        abstractC4949k2.mo9386f(abstractC9310n, meaning2.f17282g);
        abstractC9310n.mo10551C("creator_id");
        this.f17290e.mo9386f(abstractC9310n, meaning2.f17283h);
        abstractC9310n.mo10551C("is_google_translate");
        C0141b.m623s(meaning2.f17284i, abstractC4949k3, abstractC9310n, "word_id");
        abstractC4949k.mo9386f(abstractC9310n, Integer.valueOf(meaning2.f17285j));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(29, "GeneratedJsonAdapter(Meaning)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
