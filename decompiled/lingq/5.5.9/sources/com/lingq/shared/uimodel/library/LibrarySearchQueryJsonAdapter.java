package com.lingq.shared.uimodel.library;

import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.LearningLevel;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import dm.C5213m;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibrarySearchQueryJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibrarySearchQueryJsonAdapter extends AbstractC4949k<LibrarySearchQuery> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22036a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Map<Resources, Boolean>> f22037b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Map<LearningLevel, Boolean>> f22038c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Integer> f22039d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Sort> f22040e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4949k<Boolean> f22041f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4949k<List<String>> f22042g;

    /* JADX INFO: renamed from: h */
    public final AbstractC4949k<ContentType> f22043h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4949k<CollectionsFilterProvider> f22044i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4949k<CollectionsFilterUser> f22045j;

    /* JADX INFO: renamed from: k */
    public final AbstractC4949k<List<Accent>> f22046k;

    /* JADX INFO: renamed from: l */
    public volatile Constructor<LibrarySearchQuery> f22047l;

    public LibrarySearchQueryJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22036a = JsonReader.C4932a.m10513a("resources", "level", "pageSize", "sortBy", "isFriendsOnly", "isIncludeMedia", "isImportsOnly", "tags", "contentType", "provider", "sharedBy", "accent");
        C9756b.b bVarM17659d = C9312p.m17659d(Map.class, Resources.class, Boolean.class);
        EmptySet emptySet = EmptySet.f38034a;
        this.f22037b = c4955q.m10565c(bVarM17659d, emptySet, "resources");
        this.f22038c = c4955q.m10565c(C9312p.m17659d(Map.class, LearningLevel.class, Boolean.class), emptySet, "level");
        this.f22039d = c4955q.m10565c(Integer.TYPE, emptySet, "pageSize");
        this.f22040e = c4955q.m10565c(Sort.class, emptySet, "sortBy");
        this.f22041f = c4955q.m10565c(Boolean.TYPE, emptySet, "isFriendsOnly");
        this.f22042g = c4955q.m10565c(C9312p.m17659d(List.class, String.class), emptySet, "tags");
        this.f22043h = c4955q.m10565c(ContentType.class, emptySet, "contentType");
        this.f22044i = c4955q.m10565c(CollectionsFilterProvider.class, emptySet, "provider");
        this.f22045j = c4955q.m10565c(CollectionsFilterUser.class, emptySet, "sharedBy");
        this.f22046k = c4955q.m10565c(C9312p.m17659d(List.class, Accent.class), emptySet, "accent");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibrarySearchQuery mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Integer numMo9385a = 0;
        Boolean boolMo9385a = Boolean.FALSE;
        jsonReader.mo10504b();
        Boolean boolMo9385a2 = boolMo9385a;
        int i10 = -1;
        Map<Resources, Boolean> mapMo9385a = null;
        Map<LearningLevel, Boolean> mapMo9385a2 = null;
        List<Accent> listMo9385a = null;
        List<String> listMo9385a2 = null;
        Sort sortMo9385a = null;
        ContentType contentTypeMo9385a = null;
        CollectionsFilterProvider collectionsFilterProviderMo9385a = null;
        CollectionsFilterUser collectionsFilterUserMo9385a = null;
        Boolean boolMo9385a3 = boolMo9385a2;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22036a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    mapMo9385a = this.f22037b.mo9385a(jsonReader);
                    if (mapMo9385a == null) {
                        throw C9756b.m18254m("resources", "resources", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    mapMo9385a2 = this.f22038c.mo9385a(jsonReader);
                    if (mapMo9385a2 == null) {
                        throw C9756b.m18254m("level", "level", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    numMo9385a = this.f22039d.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("pageSize", "pageSize", jsonReader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    sortMo9385a = this.f22040e.mo9385a(jsonReader);
                    if (sortMo9385a == null) {
                        throw C9756b.m18254m("sortBy", "sortBy", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    boolMo9385a = this.f22041f.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("isFriendsOnly", "isFriendsOnly", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    boolMo9385a3 = this.f22041f.mo9385a(jsonReader);
                    if (boolMo9385a3 == null) {
                        throw C9756b.m18254m("isIncludeMedia", "isIncludeMedia", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    boolMo9385a2 = this.f22041f.mo9385a(jsonReader);
                    if (boolMo9385a2 == null) {
                        throw C9756b.m18254m("isImportsOnly", "isImportsOnly", jsonReader);
                    }
                    i10 &= -65;
                    break;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    listMo9385a2 = this.f22042g.mo9385a(jsonReader);
                    if (listMo9385a2 == null) {
                        throw C9756b.m18254m("tags", "tags", jsonReader);
                    }
                    i10 &= -129;
                    break;
                    break;
                case 8:
                    contentTypeMo9385a = this.f22043h.mo9385a(jsonReader);
                    i10 &= -257;
                    break;
                case 9:
                    collectionsFilterProviderMo9385a = this.f22044i.mo9385a(jsonReader);
                    i10 &= -513;
                    break;
                case 10:
                    collectionsFilterUserMo9385a = this.f22045j.mo9385a(jsonReader);
                    i10 &= -1025;
                    break;
                case 11:
                    listMo9385a = this.f22046k.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("accent", "accent", jsonReader);
                    }
                    i10 &= -2049;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 != -4096) {
            List<Accent> list = listMo9385a;
            List<String> list2 = listMo9385a2;
            Constructor<LibrarySearchQuery> declaredConstructor = this.f22047l;
            if (declaredConstructor == null) {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                declaredConstructor = LibrarySearchQuery.class.getDeclaredConstructor(Map.class, Map.class, cls, Sort.class, cls2, cls2, cls2, List.class, ContentType.class, CollectionsFilterProvider.class, CollectionsFilterUser.class, List.class, cls, C9756b.f49813c);
                this.f22047l = declaredConstructor;
                C5207g.m11110e(declaredConstructor, "LibrarySearchQuery::clas…his.constructorRef = it }");
            }
            LibrarySearchQuery librarySearchQueryNewInstance = declaredConstructor.newInstance(mapMo9385a, mapMo9385a2, numMo9385a, sortMo9385a, boolMo9385a, boolMo9385a3, boolMo9385a2, list2, contentTypeMo9385a, collectionsFilterProviderMo9385a, collectionsFilterUserMo9385a, list, Integer.valueOf(i10), null);
            C5207g.m11110e(librarySearchQueryNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return librarySearchQueryNewInstance;
        }
        C5207g.m11109d(mapMo9385a, "null cannot be cast to non-null type kotlin.collections.MutableMap<com.lingq.shared.uimodel.library.Resources, kotlin.Boolean>");
        Map mapM11198c = C5213m.m11198c(mapMo9385a);
        C5207g.m11109d(mapMo9385a2, "null cannot be cast to non-null type kotlin.collections.MutableMap<com.lingq.shared.uimodel.LearningLevel, kotlin.Boolean>");
        Map mapM11198c2 = C5213m.m11198c(mapMo9385a2);
        int iIntValue = numMo9385a.intValue();
        C5207g.m11109d(sortMo9385a, "null cannot be cast to non-null type com.lingq.shared.uimodel.library.Sort");
        boolean zBooleanValue = boolMo9385a.booleanValue();
        boolean zBooleanValue2 = boolMo9385a3.booleanValue();
        boolean zBooleanValue3 = boolMo9385a2.booleanValue();
        C5207g.m11109d(listMo9385a2, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
        C5213m.m11197b(listMo9385a2);
        C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.MutableList<com.lingq.shared.uimodel.library.Accent>");
        C5213m.m11197b(listMo9385a);
        return new LibrarySearchQuery(mapM11198c, mapM11198c2, iIntValue, sortMo9385a, zBooleanValue, zBooleanValue2, zBooleanValue3, listMo9385a2, contentTypeMo9385a, collectionsFilterProviderMo9385a, collectionsFilterUserMo9385a, listMo9385a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibrarySearchQuery librarySearchQuery) throws IOException {
        LibrarySearchQuery librarySearchQuery2 = librarySearchQuery;
        C5207g.m11111f(abstractC9310n, "writer");
        if (librarySearchQuery2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("resources");
        this.f22037b.mo9386f(abstractC9310n, librarySearchQuery2.f22024a);
        abstractC9310n.mo10551C("level");
        this.f22038c.mo9386f(abstractC9310n, librarySearchQuery2.f22025b);
        abstractC9310n.mo10551C("pageSize");
        this.f22039d.mo9386f(abstractC9310n, Integer.valueOf(librarySearchQuery2.f22026c));
        abstractC9310n.mo10551C("sortBy");
        this.f22040e.mo9386f(abstractC9310n, librarySearchQuery2.f22027d);
        abstractC9310n.mo10551C("isFriendsOnly");
        Boolean boolValueOf = Boolean.valueOf(librarySearchQuery2.f22028e);
        AbstractC4949k<Boolean> abstractC4949k = this.f22041f;
        abstractC4949k.mo9386f(abstractC9310n, boolValueOf);
        abstractC9310n.mo10551C("isIncludeMedia");
        C0141b.m623s(librarySearchQuery2.f22029f, abstractC4949k, abstractC9310n, "isImportsOnly");
        C0141b.m623s(librarySearchQuery2.f22030g, abstractC4949k, abstractC9310n, "tags");
        this.f22042g.mo9386f(abstractC9310n, librarySearchQuery2.f22031h);
        abstractC9310n.mo10551C("contentType");
        this.f22043h.mo9386f(abstractC9310n, librarySearchQuery2.f22032i);
        abstractC9310n.mo10551C("provider");
        this.f22044i.mo9386f(abstractC9310n, librarySearchQuery2.f22033j);
        abstractC9310n.mo10551C("sharedBy");
        this.f22045j.mo9386f(abstractC9310n, librarySearchQuery2.f22034k);
        abstractC9310n.mo10551C("accent");
        this.f22046k.mo9386f(abstractC9310n, librarySearchQuery2.f22035l);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(40, "GeneratedJsonAdapter(LibrarySearchQuery)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
