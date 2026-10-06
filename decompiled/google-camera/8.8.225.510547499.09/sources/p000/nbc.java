package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nbc {

    /* JADX INFO: renamed from: a */
    public final ncn f41933a;

    protected nbc(ncn ncnVar) {
        this.f41933a = ncnVar;
    }

    /* JADX INFO: renamed from: e */
    public static void m17249e(String str, ncm ncmVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(ncmVar.mo17280e()))));
        sb.append(": logging error [");
        nbq nbqVarMo17281f = ncmVar.mo17281f();
        if (nbqVarMo17281f != nbq.f41957a) {
            sb.append(nbqVarMo17281f.mo17303b());
            sb.append('.');
            sb.append(nbqVarMo17281f.mo17305d());
            sb.append(':');
            sb.append(nbqVarMo17281f.mo17302a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    /* JADX INFO: renamed from: a */
    public abstract nbw mo17250a(Level level);

    /* JADX INFO: renamed from: b */
    public final nbw m17251b() {
        return mo17250a(Level.SEVERE);
    }

    /* JADX INFO: renamed from: c */
    public final nbw m17252c() {
        return mo17250a(Level.WARNING);
    }

    /* JADX INFO: renamed from: d */
    protected final String m17253d() {
        return this.f41933a.mo17338a();
    }

    /* JADX INFO: renamed from: f */
    protected final boolean m17254f(Level level) {
        return this.f41933a.mo17341d(level);
    }
}
