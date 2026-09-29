package com.lingq.shared.uimodel.library;

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
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryTabJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/uimodel/library/LibraryTab;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryTabJsonAdapter extends AbstractC4949k<LibraryTab> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f22066a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<String> f22067b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<String> f22068c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4949k<Boolean> f22069d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4949k<Integer> f22070e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor<LibraryTab> f22071f;

    public LibraryTabJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f22066a = JsonReader.C4932a.m10513a("preview", "display", "title", "selected", "level", "apiUrl");
        EmptySet emptySet = EmptySet.f38034a;
        this.f22067b = c4955q.m10565c(String.class, emptySet, "preview");
        this.f22068c = c4955q.m10565c(String.class, emptySet, "display");
        this.f22069d = c4955q.m10565c(Boolean.class, emptySet, "selected");
        this.f22070e = c4955q.m10565c(Integer.class, emptySet, "level");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final LibraryTab mo9385a(JsonReader jsonReader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        int i10 = -1;
        Boolean boolMo9385a = null;
        Integer numMo9385a = null;
        String strMo9385a = null;
        String strMo9385a2 = null;
        String strMo9385a3 = null;
        String strMo9385a4 = null;
        while (jsonReader.mo10511w()) {
            switch (jsonReader.mo10512y0(this.f22066a)) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    strMo9385a = this.f22067b.mo9385a(jsonReader);
                    i10 &= -2;
                    break;
                case 1:
                    strMo9385a2 = this.f22068c.mo9385a(jsonReader);
                    if (strMo9385a2 == null) {
                        throw C9756b.m18254m("display", "display", jsonReader);
                    }
                    break;
                    break;
                case 2:
                    strMo9385a3 = this.f22067b.mo9385a(jsonReader);
                    i10 &= -5;
                    break;
                case 3:
                    boolMo9385a = this.f22069d.mo9385a(jsonReader);
                    i10 &= -9;
                    break;
                case 4:
                    numMo9385a = this.f22070e.mo9385a(jsonReader);
                    i10 &= -17;
                    break;
                case 5:
                    strMo9385a4 = this.f22068c.mo9385a(jsonReader);
                    if (strMo9385a4 == null) {
                        throw C9756b.m18254m("apiUrl", "apiUrl", jsonReader);
                    }
                    break;
                    break;
            }
        }
        jsonReader.mo10508q();
        if (i10 == -30) {
            if (strMo9385a2 == null) {
                throw C9756b.m18248g("display", "display", jsonReader);
            }
            if (strMo9385a4 != null) {
                return new LibraryTab(boolMo9385a, numMo9385a, strMo9385a, strMo9385a2, strMo9385a3, strMo9385a4);
            }
            throw C9756b.m18248g("apiUrl", "apiUrl", jsonReader);
        }
        Constructor<LibraryTab> declaredConstructor = this.f22071f;
        if (declaredConstructor == null) {
            declaredConstructor = LibraryTab.class.getDeclaredConstructor(String.class, String.class, String.class, Boolean.class, Integer.class, String.class, Integer.TYPE, C9756b.f49813c);
            this.f22071f = declaredConstructor;
            C5207g.m11110e(declaredConstructor, "LibraryTab::class.java.g…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        objArr[0] = strMo9385a;
        if (strMo9385a2 == null) {
            throw C9756b.m18248g("display", "display", jsonReader);
        }
        objArr[1] = strMo9385a2;
        objArr[2] = strMo9385a3;
        objArr[3] = boolMo9385a;
        objArr[4] = numMo9385a;
        if (strMo9385a4 == null) {
            throw C9756b.m18248g("apiUrl", "apiUrl", jsonReader);
        }
        objArr[5] = strMo9385a4;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        LibraryTab libraryTabNewInstance = declaredConstructor.newInstance(objArr);
        C5207g.m11110e(libraryTabNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return libraryTabNewInstance;
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, LibraryTab libraryTab) throws IOException {
        LibraryTab libraryTab2 = libraryTab;
        C5207g.m11111f(abstractC9310n, "writer");
        if (libraryTab2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("preview");
        String str = libraryTab2.f22060a;
        AbstractC4949k<String> abstractC4949k = this.f22067b;
        abstractC4949k.mo9386f(abstractC9310n, str);
        abstractC9310n.mo10551C("display");
        String str2 = libraryTab2.f22061b;
        AbstractC4949k<String> abstractC4949k2 = this.f22068c;
        abstractC4949k2.mo9386f(abstractC9310n, str2);
        abstractC9310n.mo10551C("title");
        abstractC4949k.mo9386f(abstractC9310n, libraryTab2.f22062c);
        abstractC9310n.mo10551C("selected");
        this.f22069d.mo9386f(abstractC9310n, libraryTab2.f22063d);
        abstractC9310n.mo10551C("level");
        this.f22070e.mo9386f(abstractC9310n, libraryTab2.f22064e);
        abstractC9310n.mo10551C("apiUrl");
        abstractC4949k2.mo9386f(abstractC9310n, libraryTab2.f22065f);
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(32, "GeneratedJsonAdapter(LibraryTab)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
