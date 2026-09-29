package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLibraryCounterJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/network/result/ResultLibraryCounter;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultLibraryCounterJsonAdapter extends AbstractC4949k<ResultLibraryCounter> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f18679a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Boolean> f18680b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Float> f18681c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Double> f18682d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Float> f18683e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Integer> f18684f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<ResultLibraryCounter> f18685g;

    public ResultLibraryCounterJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f18679a = JsonReader.C4932a.m10513a("roseGiven", "progress", "listenTimes", "readTimes", "isTaken", "difficulty", "rosesCount", "newWordsCount", "knownWordsCount", "cardsCount", "lessonsCount", "isCompletelyTaken");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f18680b = c4955q.m10565c(cls, emptySet, "roseGiven");
        this.f18681c = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f18682d = c4955q.m10565c(Double.class, emptySet, "listenTimes");
        this.f18683e = c4955q.m10565c(Float.TYPE, emptySet, "difficulty");
        this.f18684f = c4955q.m10565c(Integer.TYPE, emptySet, "rosesCount");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ResultLibraryCounter mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        Float fValueOf = Float.valueOf(0.0f);
        jsonReader.mo10504b();
        Integer numMo9385a = 0;
        Integer numMo9385a2 = null;
        Integer numMo9385a3 = null;
        Integer numMo9385a4 = null;
        Integer numMo9385a5 = null;
        int i10 = -1;
        Float fMo9385a = null;
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        Boolean boolMo9385a2 = boolMo9385a;
        Float fMo9385a2 = fValueOf;
        Boolean boolMo9385a3 = boolMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f18679a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    boolMo9385a = this.f18680b.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("roseGiven", "roseGiven", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    fMo9385a = this.f18681c.mo9385a(jsonReader);
                    i10 &= -3;
                    break;
                case 2:
                    dMo9385a = this.f18682d.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    dMo9385a2 = this.f18682d.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    boolMo9385a3 = this.f18680b.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isTaken", "isTaken", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    fMo9385a2 = this.f18683e.mo9385a(jsonReader);
                    if (fMo9385a2 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a = this.f18684f.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a2 = this.f18684f.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    numMo9385a3 = this.f18684f.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("knownWordsCount", "knownWordsCount", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    numMo9385a4 = this.f18684f.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    numMo9385a5 = this.f18684f.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    boolMo9385a2 = this.f18680b.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isCompletelyTaken", "isCompletelyTaken", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -4096) {
            return new ResultLibraryCounter(boolMo9385a.booleanValue(), fMo9385a, dMo9385a, dMo9385a2, boolMo9385a3.booleanValue(), fMo9385a2.floatValue(), numMo9385a.intValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), numMo9385a4.intValue(), numMo9385a5.intValue(), boolMo9385a2.booleanValue());
        }
        Constructor<ResultLibraryCounter> declaredConstructor = this.f18685g;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            Class cls2 = Integer.TYPE;
            declaredConstructor = ResultLibraryCounter.class.getDeclaredConstructor(cls, Float.class, Double.class, Double.class, cls, Float.TYPE, cls2, cls2, cls2, cls2, cls2, cls, cls2, C9756b.f49813c);
            this.f18685g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "ResultLibraryCounter::cl…his.constructorRef = it }");
        }
        ResultLibraryCounter resultLibraryCounterNewInstance = declaredConstructor.newInstance(boolMo9385a, fMo9385a, dMo9385a, dMo9385a2, boolMo9385a3, fMo9385a2, numMo9385a, numMo9385a2, numMo9385a3, numMo9385a4, numMo9385a5, boolMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(resultLibraryCounterNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return resultLibraryCounterNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ResultLibraryCounter resultLibraryCounter) throws IOException {
        ResultLibraryCounter resultLibraryCounter2 = resultLibraryCounter;
        C5207g.m11111f(abstractC9310n, "writer");
        if (resultLibraryCounter2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("roseGiven");
        Boolean boolValueOf = Boolean.valueOf(resultLibraryCounter2.f18667a);
        AbstractC4949k<Boolean> abstractC4949k = this.f18680b;
        abstractC4949k.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("progress");
        this.f18681c.mo9386f(abstractC9310n, resultLibraryCounter2.f18668b);
        abstractC9310n.mo10551C("listenTimes");
        Double d10 = resultLibraryCounter2.f18669c;
        AbstractC4949k<Double> abstractC4949k2 = this.f18682d;
        abstractC4949k2.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("readTimes");
        abstractC4949k2.mo9386f(abstractC9310n, resultLibraryCounter2.f18670d);
        abstractC9310n.mo10551C("isTaken");
        C0141b.m623s(resultLibraryCounter2.f18671e, abstractC4949k, abstractC9310n, "difficulty");
        this.f18683e.mo9386f(abstractC9310n, Float.valueOf(resultLibraryCounter2.f18672f));
        abstractC9310n.mo10551C("rosesCount");
        Integer numValueOf = Integer.valueOf(resultLibraryCounter2.f18673g);
        AbstractC4949k<Integer> abstractC4949k3 = this.f18684f;
        abstractC4949k3.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("newWordsCount");
        C0166e.m775v(resultLibraryCounter2.f18674h, abstractC4949k3, abstractC9310n, "knownWordsCount");
        C0166e.m775v(resultLibraryCounter2.f18675i, abstractC4949k3, abstractC9310n, "cardsCount");
        C0166e.m775v(resultLibraryCounter2.f18676j, abstractC4949k3, abstractC9310n, "lessonsCount");
        C0166e.m775v(resultLibraryCounter2.f18677k, abstractC4949k3, abstractC9310n, "isCompletelyTaken");
        abstractC4949k.mo9386f(abstractC9310n, Boolean.valueOf(resultLibraryCounter2.f18678l));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(ResultLibraryCounter)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
