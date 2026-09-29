package p000;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dz8 {

    /* JADX INFO: renamed from: a */
    public final r0a f36464a;

    /* JADX INFO: renamed from: b */
    public final lna f36465b;

    public dz8(r0a r0aVar, lna lnaVar) {
        r0aVar.getClass();
        lnaVar.getClass();
        this.f36464a = r0aVar;
        this.f36465b = lnaVar;
    }

    /* JADX INFO: renamed from: a */
    public final zy8 m10759a(zy8 zy8Var) {
        String str;
        this.f36465b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = cl9.m4839V(string, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (zy8Var == null || (str = zy8Var.f72389b) == null) ? lowerCase : str;
        int i = zy8Var != null ? zy8Var.f72390c + 1 : 0;
        this.f36464a.getClass();
        return new zy8(lowerCase, str2, i, r0a.m20228a().f46520b);
    }
}
