package com.lingq.shared.download;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/download/SentenceDownloadItemJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/download/SentenceDownloadItem;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SentenceDownloadItemJsonAdapter extends AbstractC4949k<SentenceDownloadItem> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17991b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17992c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17993d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Double> f17994e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<SentenceDownloadItem> f17995f;

    public SentenceDownloadItemJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17990a = JsonReader.C4932a.m10513a("language", "lessonId", "audioUrl", "sentenceIndex", "currentIndex", "lastIndex", "shouldAutoPlay", "audioDuration");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17991b = c4955q.m10565c(String.class, emptySet, "language");
        this.f17992c = c4955q.m10565c(Integer.TYPE, emptySet, "lessonId");
        this.f17993d = c4955q.m10565c(Boolean.TYPE, emptySet, "shouldAutoPlay");
        this.f17994e = c4955q.m10565c(Double.TYPE, emptySet, "audioDuration");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final SentenceDownloadItem mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Double dValueOf = Double.valueOf(0.0d);
        jsonReader.mo10504b();
        int i10 = -1;
        Boolean boolMo9385a = null;
        Integer numMo9385a = null;
        Integer numMo9385a2 = null;
        String strMo9385a = null;
        Integer numMo9385a3 = null;
        String strMo9385a2 = null;
        Integer numMo9385a4 = null;
        while (true) {
            Double d10 = dValueOf;
            Boolean bool = boolMo9385a;
            Integer num = numMo9385a;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i10 == -129) {
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("language", "language", jsonReader);
                    }
                    if (numMo9385a2 == null) {
                        throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
                    }
                    int iIntValue = numMo9385a2.intValue();
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("audioUrl", "audioUrl", jsonReader);
                    }
                    if (numMo9385a3 == null) {
                        throw C9756b.m18248g("sentenceIndex", "sentenceIndex", jsonReader);
                    }
                    int iIntValue2 = numMo9385a3.intValue();
                    if (numMo9385a4 == null) {
                        throw C9756b.m18248g("currentIndex", "currentIndex", jsonReader);
                    }
                    int iIntValue3 = numMo9385a4.intValue();
                    if (num == null) {
                        throw C9756b.m18248g("lastIndex", "lastIndex", jsonReader);
                    }
                    int iIntValue4 = num.intValue();
                    if (bool != null) {
                        return new SentenceDownloadItem(strMo9385a, iIntValue, strMo9385a2, iIntValue2, iIntValue3, iIntValue4, bool.booleanValue(), d10.doubleValue());
                    }
                    throw C9756b.m18248g("shouldAutoPlay", "shouldAutoPlay", jsonReader);
                }
                Constructor<SentenceDownloadItem> declaredConstructor = this.f17995f;
                int i11 = 10;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = SentenceDownloadItem.class.getDeclaredConstructor(String.class, cls, String.class, cls, cls, cls, Boolean.TYPE, Double.TYPE, cls, C9756b.f49813c);
                    this.f17995f = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "SentenceDownloadItem::cl…his.constructorRef = it }");
                    i11 = 10;
                }
                Object[] objArr = new Object[i11];
                if (strMo9385a == null) {
                    throw C9756b.m18248g("language", "language", jsonReader);
                }
                objArr[0] = strMo9385a;
                if (numMo9385a2 == null) {
                    throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
                }
                objArr[1] = Integer.valueOf(numMo9385a2.intValue());
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("audioUrl", "audioUrl", jsonReader);
                }
                objArr[2] = strMo9385a2;
                if (numMo9385a3 == null) {
                    throw C9756b.m18248g("sentenceIndex", "sentenceIndex", jsonReader);
                }
                objArr[3] = Integer.valueOf(numMo9385a3.intValue());
                if (numMo9385a4 == null) {
                    throw C9756b.m18248g("currentIndex", "currentIndex", jsonReader);
                }
                objArr[4] = Integer.valueOf(numMo9385a4.intValue());
                if (num == null) {
                    throw C9756b.m18248g("lastIndex", "lastIndex", jsonReader);
                }
                objArr[5] = Integer.valueOf(num.intValue());
                if (bool == null) {
                    throw C9756b.m18248g("shouldAutoPlay", "shouldAutoPlay", jsonReader);
                }
                objArr[6] = Boolean.valueOf(bool.booleanValue());
                objArr[7] = d10;
                objArr[8] = Integer.valueOf(i10);
                objArr[9] = null;
                SentenceDownloadItem sentenceDownloadItemNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(sentenceDownloadItemNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return sentenceDownloadItemNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f17990a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17991b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case 1:
                    numMo9385a2 = this.f17992c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("lessonId", "lessonId", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case 2:
                    strMo9385a2 = this.f17991b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("audioUrl", "audioUrl", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case 3:
                    numMo9385a3 = this.f17992c.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("sentenceIndex", "sentenceIndex", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case 4:
                    numMo9385a4 = this.f17992c.mo9385a(jsonReader);
                    if (numMo9385a4 == null) {
                        throw C9756b.m18254m("currentIndex", "currentIndex", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                case 5:
                    numMo9385a = this.f17992c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("lastIndex", "lastIndex", jsonReader);
                    }
                    dValueOf = d10;
                    boolMo9385a = bool;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a = this.f17993d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("shouldAutoPlay", "shouldAutoPlay", jsonReader);
                    }
                    dValueOf = d10;
                    numMo9385a = num;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    dValueOf = this.f17994e.mo9385a(jsonReader);
                    if (dValueOf == null) {
                        throw C9756b.m18254m("audioDuration", "audioDuration", jsonReader);
                    }
                    i10 &= -129;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
                    break;
                default:
                    dValueOf = d10;
                    boolMo9385a = bool;
                    numMo9385a = num;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, SentenceDownloadItem sentenceDownloadItem) throws IOException {
        SentenceDownloadItem sentenceDownloadItem2 = sentenceDownloadItem;
        C5207g.m11111f(abstractC9310n, "writer");
        if (sentenceDownloadItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("language");
        String str = sentenceDownloadItem2.f17982a;
        AbstractC4949k<String> abstractC4949k = this.f17991b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("lessonId");
        Integer numValueOf = Integer.valueOf(sentenceDownloadItem2.f17983b);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17992c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("audioUrl");
        abstractC4949k.mo9386f(abstractC9310n, sentenceDownloadItem2.f17984c);
        abstractC9310n.mo10551C("sentenceIndex");
        C0166e.m775v(sentenceDownloadItem2.f17985d, abstractC4949k2, abstractC9310n, "currentIndex");
        C0166e.m775v(sentenceDownloadItem2.f17986e, abstractC4949k2, abstractC9310n, "lastIndex");
        C0166e.m775v(sentenceDownloadItem2.f17987f, abstractC4949k2, abstractC9310n, "shouldAutoPlay");
        this.f17993d.mo9386f(abstractC9310n, Boolean.valueOf(sentenceDownloadItem2.f17988g));
        abstractC9310n.mo10551C("audioDuration");
        this.f17994e.mo9386f(abstractC9310n, Double.valueOf(sentenceDownloadItem2.f17989h));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(42, "GeneratedJsonAdapter(SentenceDownloadItem)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
