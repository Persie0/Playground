package com.lingq.entity;

import android.support.v4.media.C0141b;
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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/entity/PlaylistJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/entity/Playlist;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class PlaylistJsonAdapter extends AbstractC4949k<Playlist> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17356a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f17357b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17358c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f17359d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<Playlist> f17360e;

    public PlaylistJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17356a = JsonReader.C4932a.m10513a("nameWithLanguage", "language", "name", "pk", "isDefault", "isFeatured", "order");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17357b = c4955q.m10565c(String.class, emptySet, "nameWithLanguage");
        this.f17358c = c4955q.m10565c(Integer.TYPE, emptySet, "pk");
        this.f17359d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDefault");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final Playlist mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean bool = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a = bool;
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Integer numMo9385a2 = numMo9385a;
        Boolean boolMo9385a2 = boolMo9385a;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f17356a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f17357b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("nameWithLanguage", "nameWithLanguage", jsonReader);
                    }
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f17357b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a3 = this.f17357b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                    break;
                    break;
                case 3:
                    numMo9385a = this.f17358c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    boolMo9385a2 = this.f17359d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isDefault", "isDefault", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a = this.f17359d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isFeatured", "isFeatured", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    numMo9385a2 = this.f17358c.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -121) {
            if (strMo9385a == null) {
                throw C9756b.m18248g("nameWithLanguage", "nameWithLanguage", jsonReader);
            }
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("language", "language", jsonReader);
            }
            if (strMo9385a3 != null) {
                return new Playlist(strMo9385a, strMo9385a2, strMo9385a3, numMo9385a.intValue(), boolMo9385a2.booleanValue(), boolMo9385a.booleanValue(), numMo9385a2.intValue());
            }
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        Constructor<Playlist> declaredConstructor = this.f17360e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = Playlist.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls2, cls2, cls, cls, C9756b.f49813c);
            this.f17360e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "Playlist::class.java.get…his.constructorRef = it }");
        }
        Object[] objArr = new Object[9];
        if (strMo9385a == null) {
            throw C9756b.m18248g("nameWithLanguage", "nameWithLanguage", jsonReader);
        }
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("language", "language", jsonReader);
        }
        objArr[1] = strMo9385a2;
        if (strMo9385a3 == null) {
            throw C9756b.m18248g("name", "name", jsonReader);
        }
        objArr[2] = strMo9385a3;
        objArr[3] = numMo9385a;
        objArr[4] = boolMo9385a2;
        objArr[5] = boolMo9385a;
        objArr[6] = numMo9385a2;
        objArr[7] = Integer.valueOf(i10);
        objArr[8] = null;
        Playlist playlistNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(playlistNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return playlistNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, Playlist playlist) throws IOException {
        Playlist playlist2 = playlist;
        C5207g.m11111f(abstractC9310n, "writer");
        if (playlist2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("nameWithLanguage");
        String str = playlist2.f17349a;
        AbstractC4949k<String> abstractC4949k = this.f17357b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, playlist2.f17350b);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, playlist2.f17351c);
        abstractC9310n.mo10551C("pk");
        Integer numValueOf = Integer.valueOf(playlist2.f17352d);
        AbstractC4949k<Integer> abstractC4949k2 = this.f17358c;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("isDefault");
        Boolean boolValueOf = Boolean.valueOf(playlist2.f17353e);
        AbstractC4949k<Boolean> abstractC4949k3 = this.f17359d;
        abstractC4949k3.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("isFeatured");
        C0141b.m623s(playlist2.f17354f, abstractC4949k3, abstractC9310n, "order");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(playlist2.f17355g));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(30, "GeneratedJsonAdapter(Playlist)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
