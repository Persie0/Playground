package com.lingq.shared.uimodel.library;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryShelfJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryShelfJsonAdapter extends AbstractC4949k<LibraryShelf> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22054a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<Boolean> f22055b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<List<LibraryTab>> f22056c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<String> f22057d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f22058e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<LibraryShelf> f22059f;

    public LibraryShelfJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22054a = JsonReader.C4932a.m10513a("pinned", "tabs", "code", "id", "title", "order");
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.f38034a;
        this.f22055b = c4955q.m10565c(cls, emptySet, "pinned");
        this.f22056c = c4955q.m10565c(C9312p.m17659d(List.class, LibraryTab.class), emptySet, "tabs");
        this.f22057d = c4955q.m10565c(String.class, emptySet, "code");
        this.f22058e = c4955q.m10565c(Integer.TYPE, emptySet, "id");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibraryShelf mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        Boolean boolMo9385a = Boolean.FALSE;
        Integer numMo9385a = 0;
        jsonReader.mo10504b();
        int i10 = -1;
        List<LibraryTab> listMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        Integer numMo9385a2 = numMo9385a;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22054a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    boolMo9385a = this.f22055b.mo9385a(jsonReader);
                    if (boolMo9385a == null) {
                        throw C9756b.m18254m("pinned", "pinned", jsonReader);
                    }
                    i10 &= -2;
                    break;
                    break;
                case 1:
                    listMo9385a = this.f22056c.mo9385a(jsonReader);
                    if (listMo9385a == null) {
                        throw C9756b.m18254m("tabs", "tabs", jsonReader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    strMo9385a = this.f22057d.mo9385a(jsonReader);
                    if (strMo9385a == null) {
                        throw C9756b.m18254m("code", "code", jsonReader);
                    }
                    break;
                    break;
                case 3:
                    numMo9385a = this.f22058e.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("id", "id", jsonReader);
                    }
                    i10 &= -9;
                    break;
                    break;
                case 4:
                    strMo9385a2 = this.f22057d.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("title", "title", jsonReader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    numMo9385a2 = this.f22058e.mo9385a(jsonReader);
                    if (numMo9385a2 == null) {
                        throw C9756b.m18254m("order", "order", jsonReader);
                    }
                    i10 &= -33;
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -60) {
            boolean zBooleanValue = boolMo9385a.booleanValue();
            C5207g.m11109d(listMo9385a, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.library.LibraryTab>");
            if (strMo9385a == null) {
                throw C9756b.m18248g("code", "code", jsonReader);
            }
            int iIntValue = numMo9385a.intValue();
            C5207g.m11109d(strMo9385a2, "null cannot be cast to non-null type kotlin.String");
            return new LibraryShelf(zBooleanValue, listMo9385a, strMo9385a, iIntValue, strMo9385a2, numMo9385a2.intValue());
        }
        Constructor<LibraryShelf> declaredConstructor = this.f22059f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = LibraryShelf.class.getDeclaredConstructor(Boolean.TYPE, List.class, String.class, cls, String.class, cls, cls, C9756b.f49813c);
            this.f22059f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LibraryShelf::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        objArr[0] = boolMo9385a;
        objArr[1] = listMo9385a;
        if (strMo9385a == null) {
            throw C9756b.m18248g("code", "code", jsonReader);
        }
        objArr[2] = strMo9385a;
        objArr[3] = numMo9385a;
        objArr[4] = strMo9385a2;
        objArr[5] = numMo9385a2;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        LibraryShelf libraryShelfNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(libraryShelfNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return libraryShelfNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibraryShelf libraryShelf) throws IOException {
        LibraryShelf libraryShelf2 = libraryShelf;
        C5207g.m11111f(abstractC9310n, "writer");
        if (libraryShelf2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("pinned");
        this.f22055b.mo9386f(abstractC9310n, Boolean.valueOf(libraryShelf2.f22048a));
        abstractC9310n.mo10551C("tabs");
        this.f22056c.mo9386f(abstractC9310n, libraryShelf2.f22049b);
        abstractC9310n.mo10551C("code");
        String str = libraryShelf2.f22050c;
        AbstractC4949k<String> abstractC4949k = this.f22057d;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("id");
        Integer numValueOf = Integer.valueOf(libraryShelf2.f22051d);
        AbstractC4949k<Integer> abstractC4949k2 = this.f22058e;
        abstractC4949k2.mo9386f(abstractC9310n, numValueOf);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, libraryShelf2.f22052e);
        abstractC9310n.mo10551C("order");
        abstractC4949k2.mo9386f(abstractC9310n, Integer.valueOf(libraryShelf2.f22053f));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(34, "GeneratedJsonAdapter(LibraryShelf)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
