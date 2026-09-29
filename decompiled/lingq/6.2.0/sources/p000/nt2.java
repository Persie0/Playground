package p000;

import com.facebook.appevents.codeless.internal.EventBinding$ActionType;
import com.facebook.appevents.codeless.internal.EventBinding$MappingMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nt2 {

    /* JADX INFO: renamed from: a */
    public final String f53229a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f53230b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f53231c;

    /* JADX INFO: renamed from: d */
    public final String f53232d;

    public nt2(String str, EventBinding$MappingMethod eventBinding$MappingMethod, EventBinding$ActionType eventBinding$ActionType, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        eventBinding$MappingMethod.getClass();
        eventBinding$ActionType.getClass();
        this.f53229a = str;
        this.f53230b = arrayList;
        this.f53231c = arrayList2;
        this.f53232d = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m17613a() {
        return this.f53232d;
    }

    /* JADX INFO: renamed from: b */
    public final List m17614b() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f53231c);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: c */
    public final List m17615c() {
        List listUnmodifiableList = Collections.unmodifiableList(this.f53230b);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
