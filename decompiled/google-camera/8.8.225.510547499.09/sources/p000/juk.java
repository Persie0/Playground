package p000;

import java.util.HashMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class juk implements jul {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34835a;

    public juk(int i) {
        this.f34835a = i;
    }

    @Override // p000.jul
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo13510a() {
        switch (this.f34835a) {
            case 0:
                return null;
            default:
                return new TreeMap();
        }
    }

    @Override // p000.jul
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo13511b(int i) {
        switch (this.f34835a) {
            case 0:
                return new HashMap(i, 1.0f);
            default:
                return new TreeMap();
        }
    }
}
