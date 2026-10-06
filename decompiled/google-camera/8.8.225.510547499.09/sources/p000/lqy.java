package p000;

import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lqy implements lra {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39031a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39032b;

    public /* synthetic */ lqy(Class cls, int i) {
        this.f39032b = i;
        this.f39031a = cls;
    }

    public /* synthetic */ lqy(lra lraVar, int i) {
        this.f39032b = i;
        this.f39031a = lraVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lra] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lra] */
    @Override // p000.lra
    /* JADX INFO: renamed from: a */
    public final Object mo15898a(Object obj) {
        switch (this.f39032b) {
            case 0:
                return this.f39031a.mo15898a((byte[]) obj);
            case 1:
                return this.f39031a.mo15898a(Base64.decode((String) obj, 3));
            case 2:
                return (Double) ((Class) this.f39031a).cast(obj);
            case 3:
                return (Boolean) ((Class) this.f39031a).cast(obj);
            default:
                return (Long) ((Class) this.f39031a).cast(obj);
        }
    }
}
