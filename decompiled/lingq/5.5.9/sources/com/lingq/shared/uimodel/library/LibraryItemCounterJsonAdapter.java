package com.lingq.shared.uimodel.library;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryItemCounterJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryItemCounterJsonAdapter extends AbstractC4949k<LibraryItemCounter> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22017a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f22018b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Boolean> f22019c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Float> f22020d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Double> f22021e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Float> f22022f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor<LibraryItemCounter> f22023g;

    public LibraryItemCounterJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22017a = JsonReader.C4932a.m10513a("id", "roseGiven", "progress", "listenTimes", "readTimes", "isTaken", "difficulty", "rosesCount", "lessonsCount", "newWordsCount", "knownWordsCount", "cardsCount", "isCompletelyTaken");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f22018b = c4955q.m10565c(cls, emptySet, "id");
        this.f22019c = c4955q.m10565c(Boolean.TYPE, emptySet, "roseGiven");
        this.f22020d = c4955q.m10565c(Float.class, emptySet, "progress");
        this.f22021e = c4955q.m10565c(Double.class, emptySet, "listenTimes");
        this.f22022f = c4955q.m10565c(Float.TYPE, emptySet, "difficulty");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibraryItemCounter mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
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
        Integer numMo9385a6 = null;
        Float fMo9385a = null;
        Double dMo9385a = null;
        Double dMo9385a2 = null;
        Boolean boolMo9385a2 = boolMo9385a;
        Float fMo9385a2 = fValueOf;
        Boolean boolMo9385a3 = boolMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22017a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a6 = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a6 == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    boolMo9385a = this.f22019c.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("roseGiven", "roseGiven", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    fMo9385a = this.f22020d.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    dMo9385a = this.f22021e.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    dMo9385a2 = this.f22021e.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    boolMo9385a3 = this.f22019c.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isTaken", "isTaken", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    fMo9385a2 = this.f22022f.mo9385a(jsonReader);
                    if (fMo9385a2 == null) {
                        throw C9756b.m18254m("difficulty", "difficulty", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("rosesCount", "rosesCount", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    numMo9385a2 = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("lessonsCount", "lessonsCount", jsonReader);
                    }
                    i10 &= -257;
                    break;
                    break;
                case 9:
                    numMo9385a3 = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("newWordsCount", "newWordsCount", jsonReader);
                    }
                    i10 &= -513;
                    break;
                    break;
                case 10:
                    numMo9385a4 = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("knownWordsCount", "knownWordsCount", jsonReader);
                    }
                    i10 &= -1025;
                    break;
                    break;
                case 11:
                    numMo9385a5 = this.f22018b.mo9385a(jsonReader);
                    if (numMo9385a5 == null) {
                        throw C9756b.m18254m("cardsCount", "cardsCount", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
                case 12:
                    boolMo9385a2 = this.f22019c.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isCompletelyTaken", "isCompletelyTaken", jsonReader);
                    }
                    i10 &= -4097;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -8191) {
            if (numMo9385a6 != null) {
                return new LibraryItemCounter(numMo9385a6.intValue(), boolMo9385a.booleanValue(), fMo9385a, dMo9385a, dMo9385a2, boolMo9385a3.booleanValue(), fMo9385a2.floatValue(), numMo9385a.intValue(), numMo9385a2.intValue(), numMo9385a3.intValue(), numMo9385a4.intValue(), numMo9385a5.intValue(), boolMo9385a2.booleanValue());
            }
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        Constructor<LibraryItemCounter> declaredConstructor = this.f22023g;
        int i11 = 15;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = LibraryItemCounter.class.getDeclaredConstructor(cls, cls2, Float.class, Double.class, Double.class, cls2, Float.TYPE, cls, cls, cls, cls, cls, cls2, cls, C9756b.f49813c);
            this.f22023g = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LibraryItemCounter::clas…his.constructorRef = it }");
            i11 = 15;
        }
        Object[] objArr = new Object[i11];
        if (numMo9385a6 == null) {
            throw C9756b.m18248g("id", "id", jsonReader);
        }
        objArr[0] = Integer.valueOf(numMo9385a6.intValue());
        objArr[1] = boolMo9385a;
        objArr[2] = fMo9385a;
        objArr[3] = dMo9385a;
        objArr[4] = dMo9385a2;
        objArr[5] = boolMo9385a3;
        objArr[6] = fMo9385a2;
        objArr[7] = numMo9385a;
        objArr[8] = numMo9385a2;
        objArr[9] = numMo9385a3;
        objArr[10] = numMo9385a4;
        objArr[11] = numMo9385a5;
        objArr[12] = boolMo9385a2;
        objArr[13] = Integer.valueOf(i10);
        objArr[14] = null;
        LibraryItemCounter libraryItemCounterNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(libraryItemCounterNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return libraryItemCounterNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibraryItemCounter libraryItemCounter) throws IOException {
        LibraryItemCounter libraryItemCounter2 = libraryItemCounter;
        C5207g.m11111f(abstractC9310n, "writer");
        if (libraryItemCounter2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(libraryItemCounter2.f22004a);
        AbstractC4949k<Integer> abstractC4949k = this.f22018b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("roseGiven");
        Boolean boolValueOf = Boolean.valueOf(libraryItemCounter2.f22005b);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f22019c;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("progress");
        this.f22020d.mo9386f(abstractC9310n, libraryItemCounter2.f22006c);
        abstractC9310n.mo10551C("listenTimes");
        Double d10 = libraryItemCounter2.f22007d;
        AbstractC4949k<Double> abstractC4949k3 = this.f22021e;
        abstractC4949k3.mo9386f(abstractC9310n, d10);
        abstractC9310n.mo10551C("readTimes");
        abstractC4949k3.mo9386f(abstractC9310n, libraryItemCounter2.f22008e);
        abstractC9310n.mo10551C("isTaken");
        C0141b.m623s(libraryItemCounter2.f22009f, abstractC4949k2, abstractC9310n, "difficulty");
        this.f22022f.mo9386f(abstractC9310n, Float.valueOf(libraryItemCounter2.f22010g));
        abstractC9310n.mo10551C("rosesCount");
        C0166e.m775v(libraryItemCounter2.f22011h, abstractC4949k, abstractC9310n, "lessonsCount");
        C0166e.m775v(libraryItemCounter2.f22012i, abstractC4949k, abstractC9310n, "newWordsCount");
        C0166e.m775v(libraryItemCounter2.f22013j, abstractC4949k, abstractC9310n, "knownWordsCount");
        C0166e.m775v(libraryItemCounter2.f22014k, abstractC4949k, abstractC9310n, "cardsCount");
        C0166e.m775v(libraryItemCounter2.f22015l, abstractC4949k, abstractC9310n, "isCompletelyTaken");
        abstractC4949k2.mo9386f(abstractC9310n, Boolean.valueOf(libraryItemCounter2.f22016m));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(LibraryItemCounter)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
