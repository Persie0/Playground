package p000;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guv implements kfa {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fre f26452a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f26453b;

    public guv(fre freVar, int i) {
        this.f26453b = i;
        this.f26452a = freVar;
    }

    @Override // p000.kfa
    /* JADX INFO: renamed from: a */
    public final kiq mo9781a(Collection collection) {
        switch (this.f26453b) {
            case 0:
                ArrayList arrayList = new ArrayList(collection);
                return (kiq) arrayList.get(this.f26452a.mo8677a(arrayList));
            default:
                ArrayList arrayList2 = new ArrayList(collection);
                return (kiq) arrayList2.get(this.f26452a.mo8677a(arrayList2));
        }
    }
}
