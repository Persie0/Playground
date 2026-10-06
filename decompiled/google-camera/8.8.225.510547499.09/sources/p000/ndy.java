package p000;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ndy extends ndn {

    /* JADX INFO: renamed from: a */
    private final String f42075a;

    /* JADX INFO: renamed from: b */
    private final boolean f42076b;

    /* JADX INFO: renamed from: c */
    private final Level f42077c;

    /* JADX INFO: renamed from: d */
    private final boolean f42078d;

    /* JADX INFO: renamed from: e */
    private final Set f42079e;

    /* JADX INFO: renamed from: f */
    private final ncy f42080f;

    public ndy(String str, String str2, boolean z, Level level, boolean z2, Set set, ncy ncyVar) {
        super(str2);
        this.f42075a = str;
        this.f42076b = z;
        this.f42077c = level;
        this.f42078d = z2;
        this.f42079e = set;
        this.f42080f = ncyVar;
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: c */
    public final void mo17340c(ncm ncmVar) {
        String strMo17303b = (String) ncmVar.mo17285j().mo17266d(nch.f41987a);
        if (strMo17303b == null) {
            strMo17303b = mo17338a();
        }
        if (strMo17303b == null) {
            strMo17303b = ncmVar.mo17281f().mo17303b();
            int iIndexOf = strMo17303b.indexOf(36, strMo17303b.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strMo17303b = strMo17303b.substring(0, iIndexOf);
            }
        }
        String strM17390d = nea.m17390d(this.f42075a, strMo17303b, this.f42076b);
        Level levelMo17288m = ncmVar.mo17288m();
        if (!this.f42078d) {
            int iM17391e = nea.m17391e(levelMo17288m);
            if (!Log.isLoggable(strM17390d, iM17391e) && !Log.isLoggable("all", iM17391e)) {
                return;
            }
        }
        ndz.m17388e(ncmVar, strM17390d, this.f42077c, this.f42079e, this.f42080f);
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: d */
    public final boolean mo17341d(Level level) {
        return true;
    }
}
