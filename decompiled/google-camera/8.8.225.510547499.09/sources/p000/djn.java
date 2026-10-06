package p000;

import android.content.pm.ProviderInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djn implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f11790a;

    /* JADX INFO: renamed from: b */
    private final Object f11791b;

    public djn(djm djmVar, int i) {
        this.f11790a = i;
        this.f11791b = djmVar;
    }

    public djn(oju ojuVar, int i) {
        this.f11790a = i;
        this.f11791b = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f11790a) {
            case 0:
                break;
        }
        return m6251a();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: a */
    public final String m6251a() {
        switch (this.f11790a) {
            case 0:
                String str = ((ProviderInfo) ((djm) this.f11791b).f11788b).authority;
                str.getClass();
                return str;
            default:
                String strMo6182j = ((dhv) this.f11791b.get()).mo6182j(dib.f11345bz);
                strMo6182j.getClass();
                return strMo6182j;
        }
    }
}
