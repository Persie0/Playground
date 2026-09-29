package com.lingq.player;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/player/PlayerContentController_PlayerContentItemJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlayerContentController_PlayerContentItemJsonAdapter extends AbstractC4949k<PlayerContentController.PlayerContentItem> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17610a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Integer> f17611b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f17612c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17613d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<AbstractC3299d> f17614e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<PlayerContentController.PlayerContentItem> f17615f;

    public PlayerContentController_PlayerContentItemJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17610a = JsonReader.C4932a.m10513a("lessonId", "audio", "lessonTitle", "courseTitle", "duration", "imageUrl", "isDownloaded", "courseId", "language", "inPlaylistType");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f17611b = c4955q.m10565c(cls, emptySet, "lessonId");
        this.f17612c = c4955q.m10565c(String.class, emptySet, "audio");
        this.f17613d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDownloaded");
        this.f17614e = c4955q.m10565c(AbstractC3299d.class, emptySet, "inPlaylistType");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final PlayerContentController.PlayerContentItem mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Integer numMo9385a = null;
        Boolean bool = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Integer num = null;
        String str = null;
        Integer numMo9385a2 = null;
        String strMo9385a4 = null;
        AbstractC3299d abstractC3299dMo9385a = null;
        while (true) {
            AbstractC3299d abstractC3299d = abstractC3299dMo9385a;
            String str2 = strMo9385a4;
            Integer num2 = numMo9385a;
            Boolean bool2 = bool;
            String str3 = str;
            Integer num3 = num;
            String str4 = strMo9385a3;
            if (!jsonReader.mo10511w()) {
                jsonReader.mo10508q();
                if (i10 == -513) {
                    if (numMo9385a2 == null) {
                        throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
                    }
                    int iIntValue = numMo9385a2.intValue();
                    if (strMo9385a == null) {
                        throw C9756b.m18248g("audio", "audio", jsonReader);
                    }
                    if (strMo9385a2 == null) {
                        throw C9756b.m18248g("lessonTitle", "lessonTitle", jsonReader);
                    }
                    if (str4 == null) {
                        throw C9756b.m18248g("courseTitle", "courseTitle", jsonReader);
                    }
                    if (num3 == null) {
                        throw C9756b.m18248g("duration", "duration", jsonReader);
                    }
                    int iIntValue2 = num3.intValue();
                    if (str3 == null) {
                        throw C9756b.m18248g("imageUrl", "imageUrl", jsonReader);
                    }
                    if (bool2 == null) {
                        throw C9756b.m18248g("isDownloaded", "isDownloaded", jsonReader);
                    }
                    boolean zBooleanValue = bool2.booleanValue();
                    if (num2 == null) {
                        throw C9756b.m18248g("courseId", "courseId", jsonReader);
                    }
                    int iIntValue3 = num2.intValue();
                    if (str2 == null) {
                        throw C9756b.m18248g("language", "language", jsonReader);
                    }
                    C5207g.m11109d(abstractC3299d, "null cannot be cast to non-null type com.lingq.player.PlayerContract.PlayerType");
                    return new PlayerContentController.PlayerContentItem(iIntValue, strMo9385a, strMo9385a2, str4, iIntValue2, str3, zBooleanValue, iIntValue3, str2, abstractC3299d);
                }
                Constructor<PlayerContentController.PlayerContentItem> declaredConstructor = this.f17615f;
                int i11 = 12;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    declaredConstructor = PlayerContentController.PlayerContentItem.class.getDeclaredConstructor(cls, String.class, String.class, String.class, cls, String.class, Boolean.TYPE, cls, String.class, AbstractC3299d.class, cls, C9756b.f49813c);
                    this.f17615f = declaredConstructor;
                    C5207g.m11110e(declaredConstructor, "PlayerContentController.…his.constructorRef = it }");
                    i11 = 12;
                }
                Object[] objArr = new Object[i11];
                if (numMo9385a2 == null) {
                    throw C9756b.m18248g("lessonId", "lessonId", jsonReader);
                }
                objArr[0] = Integer.valueOf(numMo9385a2.intValue());
                if (strMo9385a == null) {
                    throw C9756b.m18248g("audio", "audio", jsonReader);
                }
                objArr[1] = strMo9385a;
                if (strMo9385a2 == null) {
                    throw C9756b.m18248g("lessonTitle", "lessonTitle", jsonReader);
                }
                objArr[2] = strMo9385a2;
                if (str4 == null) {
                    throw C9756b.m18248g("courseTitle", "courseTitle", jsonReader);
                }
                objArr[3] = str4;
                if (num3 == null) {
                    throw C9756b.m18248g("duration", "duration", jsonReader);
                }
                objArr[4] = Integer.valueOf(num3.intValue());
                if (str3 == null) {
                    throw C9756b.m18248g("imageUrl", "imageUrl", jsonReader);
                }
                objArr[5] = str3;
                if (bool2 == null) {
                    throw C9756b.m18248g("isDownloaded", "isDownloaded", jsonReader);
                }
                objArr[6] = Boolean.valueOf(bool2.booleanValue());
                if (num2 == null) {
                    throw C9756b.m18248g("courseId", "courseId", jsonReader);
                }
                objArr[7] = Integer.valueOf(num2.intValue());
                if (str2 == null) {
                    throw C9756b.m18248g("language", "language", jsonReader);
                }
                objArr[8] = str2;
                objArr[9] = abstractC3299d;
                objArr[10] = Integer.valueOf(i10);
                objArr[11] = null;
                PlayerContentController.PlayerContentItem playerContentItemNewInstance = declaredConstructor.newInstance(objArr);
                C5207g.m11110e(playerContentItemNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return playerContentItemNewInstance;
            }
            switch (jsonReader.mo10512y0(this.f17610a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    numMo9385a2 = this.f17611b.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("lessonId", "lessonId", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                case 1:
                    strMo9385a = this.f17612c.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("audio", "audio", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                case 2:
                    strMo9385a2 = this.f17612c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("lessonTitle", "lessonTitle", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                case 3:
                    strMo9385a3 = this.f17612c.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("courseTitle", "courseTitle", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    break;
                    break;
                case 4:
                    Integer numMo9385a3 = this.f17611b.mo9385a(jsonReader);
                    if (numMo9385a3 == null) {
                        throw C9756b.m18254m("duration", "duration", jsonReader);
                    }
                    num = numMo9385a3;
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    strMo9385a3 = str4;
                    break;
                    break;
                case 5:
                    String strMo9385a5 = this.f17612c.mo9385a(jsonReader);
                    if (strMo9385a5 == null) {
                        throw C9756b.m18254m("imageUrl", "imageUrl", jsonReader);
                    }
                    str = strMo9385a5;
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    Boolean boolMo9385a = this.f17613d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isDownloaded", "isDownloaded", jsonReader);
                    }
                    bool = boolMo9385a;
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    numMo9385a = this.f17611b.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("courseId", "courseId", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                    break;
                case 8:
                    strMo9385a4 = this.f17612c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    abstractC3299dMo9385a = abstractC3299d;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                    break;
                case 9:
                    abstractC3299dMo9385a = this.f17614e.mo9385a(jsonReader);
                    if (abstractC3299dMo9385a == null) {
                        throw C9756b.m18254m("inPlaylistType", "inPlaylistType", jsonReader);
                    }
                    i10 &= -513;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
                    break;
                default:
                    abstractC3299dMo9385a = abstractC3299d;
                    strMo9385a4 = str2;
                    numMo9385a = num2;
                    bool = bool2;
                    str = str3;
                    num = num3;
                    strMo9385a3 = str4;
                    break;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, PlayerContentController.PlayerContentItem playerContentItem) throws IOException {
        PlayerContentController.PlayerContentItem playerContentItem2 = playerContentItem;
        C5207g.m11111f(abstractC9310n, "writer");
        if (playerContentItem2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("lessonId");
        Integer numValueOf = Integer.valueOf(playerContentItem2.f17600a);
        AbstractC4949k<Integer> abstractC4949k = this.f17611b;
        abstractC4949k.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("audio");
        String str = playerContentItem2.f17601b;
        AbstractC4949k<String> abstractC4949k2 = this.f17612c;
        abstractC4949k2.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("lessonTitle");
        abstractC4949k2.mo9386f(abstractC9310n, playerContentItem2.f17602c);
        abstractC9310n.mo10551C("courseTitle");
        abstractC4949k2.mo9386f(abstractC9310n, playerContentItem2.f17603d);
        abstractC9310n.mo10551C("duration");
        C0166e.m775v(playerContentItem2.f17604e, abstractC4949k, abstractC9310n, "imageUrl");
        abstractC4949k2.mo9386f(abstractC9310n, playerContentItem2.f17605f);
        abstractC9310n.mo10551C("isDownloaded");
        this.f17613d.mo9386f(abstractC9310n, Boolean.valueOf(playerContentItem2.f17606g));
        abstractC9310n.mo10551C("courseId");
        C0166e.m775v(playerContentItem2.f17607h, abstractC4949k, abstractC9310n, "language");
        abstractC4949k2.mo9386f(abstractC9310n, playerContentItem2.f17608i);
        abstractC9310n.mo10551C("inPlaylistType");
        this.f17614e.mo9386f(abstractC9310n, playerContentItem2.f17609j);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(63, "GeneratedJsonAdapter(PlayerContentController.PlayerContentItem)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
