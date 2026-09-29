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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/LibraryCounterJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/LibraryCounter;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryCounterJsonAdapter extends AbstractC4949k<LibraryCounter> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17214a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17215b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17216c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17217d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Float> f17218e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Double> f17219f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<Float> f17220g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor<LibraryCounter> f17221h;

    public LibraryCounterJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17214a = JsonReader.C4932a.m10513a("id", "type", "roseGiven", "progress", "listenTimes", "readTimes", "isTaken", "difficulty", "rosesCount", "newWordsCount", "knownWordsCount", "cardsCount", "lessonsCount", "isCompletelyTaken");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17215b = c4955q.m10565c(cls, emptySet, "id");
        this.f17216c = c4955q.m10565c(String.class, emptySet, "type");
        this.f17217d = c4955q.m10565c(Boolean.TYPE, emptySet, "roseGiven");
        this.f17218e = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f17219f = c4955q.m10565c(Double.class, emptySet, "listenTimes");
        this.f17220g = c4955q.m10565c(Float.TYPE, emptySet, "difficulty");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibraryCounter mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        int i10;
        int i11;
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        Float fValueOf = Float.valueOf(0.0f);
        jsonReader.mo10504b();
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i12 = -1;
        Integer numMo9385a = null;
        String strMo9385a = null;
        Float fMo9385a = null;
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        Boolean bool = boolMo9385a;
        Float f3 = fValueOf;
        Boolean boolMo9385a2 = bool;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17214a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a = this.f17216c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("type", "type", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    boolMo9385a = this.f17217d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("roseGiven", "roseGiven", jsonReader);
                    }
                    i10 = i12 & (-5);
                    i12 = i10;
                    break;
                    break;
                case 3:
                    fMo9385a = this.f17218e.mo9385a(jsonReader);
                    i10 = i12 & (-9);
                    i12 = i10;
                    break;
                case 4:
                    dMo9385a = this.f17219f.mo9385a(jsonReader);
                    i10 = i12 & (-17);
                    i12 = i10;
                    break;
                case 5:
                    dMo9385a2 = this.f17219f.mo9385a(jsonReader);
                    i10 = i12 & (-33);
                    i12 = i10;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a2 = this.f17217d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isTaken", "isTaken", jsonReader);
                    }
                    i10 = i12 & (-65);
                    i12 = i10;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    Float fMo9385a2 = this.f17220g.mo9385a(jsonReader);
                    if (fMo9385a2 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i11 = i12 & (-129);
                    f3 = fMo9385a2;
                    i12 = i11;
                    break;
                    break;
                case 8:
                    Integer numMo9385a2 = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i11 = i12 & (-257);
                    num = numMo9385a2;
                    i12 = i11;
                    break;
                    break;
                case 9:
                    Integer numMo9385a3 = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i11 = i12 & (-513);
                    num2 = numMo9385a3;
                    i12 = i11;
                    break;
                    break;
                case 10:
                    Integer numMo9385a4 = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("knownWordsCount", "knownWordsCount", jsonReader);
                    }
                    i11 = i12 & (-1025);
                    num3 = numMo9385a4;
                    i12 = i11;
                    break;
                    break;
                case 11:
                    Integer numMo9385a5 = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i11 = i12 & (-2049);
                    num4 = numMo9385a5;
                    i12 = i11;
                    break;
                    break;
                case 12:
                    Integer numMo9385a6 = this.f17215b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    i11 = i12 & (-4097);
                    num5 = numMo9385a6;
                    i12 = i11;
                    break;
                    break;
                case 13:
                    Boolean boolMo9385a3 = this.f17217d.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isCompletelyTaken", "isCompletelyTaken", jsonReader);
                    }
                    i12 &= -8193;
                    bool = boolMo9385a3;
                    break;
                    break;
                default:
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i12 == -16381) {
            if (numMo9385a == null) {
                throw C9756b.m18248g("id", "id", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            if (strMo9385a != null) {
                return new LibraryCounter(iIntValue, strMo9385a, boolMo9385a.booleanValue(), fMo9385a, dMo9385a, dMo9385a2, boolMo9385a2.booleanValue(), f3.floatValue(), num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), bool.booleanValue());
            }
            throw C9756b.m18248g("type", "type", jsonReader);
        }
        Constructor<LibraryCounter> declaredConstructor = this.f17221h;
        int i13 = 16;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = LibraryCounter.class.getDeclaredConstructor(cls, String.class, cls2, Float.class, Double.class, Double.class, cls2, Float.TYPE, cls, cls, cls, cls, cls, cls2, cls, C9756b.f49813c);
            this.f17221h = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LibraryCounter::class.ja…his.constructorRef = it }");
            i13 = 16;
        }
        Object[] objArr = new Object[i13];
        if (numMo9385a == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a.intValue());
        if (strMo9385a == null) {
            throw C9756b.m18248g("type", "type", jsonReader);
        }
        objArr[1] = strMo9385a;
        objArr[2] = boolMo9385a;
        objArr[3] = fMo9385a;
        objArr[4] = dMo9385a;
        objArr[5] = dMo9385a2;
        objArr[6] = boolMo9385a2;
        objArr[7] = f3;
        objArr[8] = num;
        objArr[9] = num2;
        objArr[10] = num3;
        objArr[11] = num4;
        objArr[12] = num5;
        objArr[13] = bool;
        objArr[14] = Integer.valueOf(i12);
        objArr[15] = null;
        LibraryCounter libraryCounterNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(libraryCounterNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return libraryCounterNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibraryCounter libraryCounter) throws IOException {
        LibraryCounter libraryCounter2 = libraryCounter;
        C5207g.m11111f(abstractC9310n, "writer");
        if (libraryCounter2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(libraryCounter2.f17200a);
        AbstractC4949k<Integer> abstractC4949k = this.f17215b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("type");
        this.f17216c.mo9386f(abstractC9310n, libraryCounter2.f17201b);
        abstractC9310n.mo10551C("roseGiven");
        Boolean boolValueOf = Boolean.valueOf(libraryCounter2.f17202c);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f17217d;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("progress");
        this.f17218e.mo9386f(abstractC9310n, libraryCounter2.f17203d);
        abstractC9310n.mo10551C("listenTimes");
        Double d10 = libraryCounter2.f17204e;
        AbstractC4949k<Double> abstractC4949k3 = this.f17219f;
        abstractC4949k3.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("readTimes");
        abstractC4949k3.mo9386f(abstractC9310n, libraryCounter2.f17205f);
        abstractC9310n.mo10551C("isTaken");
        C0141b.m623s(libraryCounter2.f17206g, abstractC4949k2, abstractC9310n, "difficulty");
        this.f17220g.mo9386f(abstractC9310n, Float.valueOf(libraryCounter2.f17207h));
        abstractC9310n.mo10551C("rosesCount");
        C0166e.m775v(libraryCounter2.f17208i, abstractC4949k, abstractC9310n, "newWordsCount");
        C0166e.m775v(libraryCounter2.f17209j, abstractC4949k, abstractC9310n, "knownWordsCount");
        C0166e.m775v(libraryCounter2.f17210k, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(libraryCounter2.f17211l, abstractC4949k, abstractC9310n, "lessonsCount");
        C0166e.m775v(libraryCounter2.f17212m, abstractC4949k, abstractC9310n, "isCompletelyTaken");
        abstractC4949k2.mo9386f(abstractC9310n, Boolean.valueOf(libraryCounter2.f17213n));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(LibraryCounter)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
