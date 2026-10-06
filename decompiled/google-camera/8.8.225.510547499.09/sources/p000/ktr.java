package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktr {

    /* JADX INFO: renamed from: a */
    public final ksr f37184a;

    /* JADX INFO: renamed from: b */
    public final ksz f37185b;

    protected ktr(Context context, ksz kszVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        ktu ktuVar = new ktu();
        ksq ksqVar = new ksq(null);
        ksqVar.m14820a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        ksqVar.f37121a = applicationContext;
        ksqVar.f37123c = mrm.m16829i(ktuVar);
        ksqVar.m14820a();
        if (ksqVar.f37125e == 1 && (context2 = ksqVar.f37121a) != null) {
            this.f37184a = new ksr(context2, ksqVar.f37122b, ksqVar.f37123c, ksqVar.f37124d);
            this.f37185b = kszVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (ksqVar.f37121a == null) {
            sb.append(" context");
        }
        if (ksqVar.f37125e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: a */
    public static ktr m14843a(Context context, ksp kspVar) {
        return new ktr(context, new ksz(kspVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.f37184a + ", basis=" + this.f37185b + "}";
    }
}
