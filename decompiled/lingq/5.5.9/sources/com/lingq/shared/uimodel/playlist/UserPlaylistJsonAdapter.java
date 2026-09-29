package com.lingq.shared.uimodel.playlist;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/playlist/UserPlaylistJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserPlaylistJsonAdapter extends AbstractC4949k<UserPlaylist> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22083a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f22084b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f22085c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f22086d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor<UserPlaylist> f22087e;

    public UserPlaylistJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22083a = JsonReader.C4932a.m10513a("nameWithLanguage", "language", "name", "pk", "isDefault", "isFeatured");
        EmptySet emptySet = EmptySet.f38034a;
        this.f22084b = c4955q.m10565c(String.class, emptySet, "nameWithLanguage");
        this.f22085c = c4955q.m10565c(Integer.TYPE, emptySet, "pk");
        this.f22086d = c4955q.m10565c(Boolean.TYPE, emptySet, "isDefault");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final UserPlaylist mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        int i10 = -1;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        Boolean boolMo9385a2 = boolMo9385a;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22083a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f22084b.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("nameWithLanguage", "nameWithLanguage", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    strMo9385a2 = this.f22084b.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("language", "language", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a3 = this.f22084b.mo9385a(jsonReader);
                    if (strMo9385a3 == null) {
                        throw C9756b.m18254m("name", "name", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    numMo9385a = this.f22085c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pk", "pk", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    boolMo9385a = this.f22086d.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isDefault", "isDefault", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a2 = this.f22086d.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isFeatured", "isFeatured", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -64) {
            C5207g.m11109d(strMo9385a, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            C5207g.m11109d(strMo9385a3, "null cannot be cast to non-null type kotlin.String");
            return new UserPlaylist(strMo9385a, strMo9385a2, strMo9385a3, numMo9385a.intValue(), boolMo9385a.booleanValue(), boolMo9385a2.booleanValue());
        }
        Constructor<UserPlaylist> declaredConstructor = this.f22087e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            declaredConstructor = UserPlaylist.class.getDeclaredConstructor(String.class, String.class, String.class, cls, cls2, cls2, cls, C9756b.f49813c);
            this.f22087e = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "UserPlaylist::class.java…his.constructorRef = it }");
        }
        UserPlaylist userPlaylistNewInstance = declaredConstructor.newInstance(strMo9385a, strMo9385a2, strMo9385a3, numMo9385a, boolMo9385a, boolMo9385a2, Integer.valueOf(i10), null);
        C5207g.m11110e(userPlaylistNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return userPlaylistNewInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, UserPlaylist userPlaylist) throws IOException {
        UserPlaylist userPlaylist2 = userPlaylist;
        C5207g.m11111f(abstractC9310n, "writer");
        if (userPlaylist2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("nameWithLanguage");
        String str = userPlaylist2.f22077a;
        AbstractC4949k<String> abstractC4949k = this.f22084b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("language");
        abstractC4949k.mo9386f(abstractC9310n, userPlaylist2.f22078b);
        abstractC9310n.mo10551C("name");
        abstractC4949k.mo9386f(abstractC9310n, userPlaylist2.f22079c);
        abstractC9310n.mo10551C("pk");
        this.f22085c.mo9386f(abstractC9310n, Integer.valueOf(userPlaylist2.f22080d));
        abstractC9310n.mo10551C("isDefault");
        Boolean boolValueOf = Boolean.valueOf(userPlaylist2.f22081e);
        AbstractC4949k<Boolean> abstractC4949k2 = this.f22086d;
        abstractC4949k2.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("isFeatured");
        abstractC4949k2.mo9386f(abstractC9310n, Boolean.valueOf(userPlaylist2.f22082f));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(UserPlaylist)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
