package p000;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ndx implements ndp {

    /* JADX INFO: renamed from: a */
    public final String f42068a;

    /* JADX INFO: renamed from: b */
    public final boolean f42069b;

    /* JADX INFO: renamed from: c */
    public final Level f42070c;

    /* JADX INFO: renamed from: d */
    public final boolean f42071d;

    /* JADX INFO: renamed from: e */
    public final Set f42072e;

    /* JADX INFO: renamed from: f */
    public final ncy f42073f;

    /* JADX INFO: renamed from: g */
    private volatile ndy f42074g;

    public ndx() {
        this("", true, Level.ALL, false, ndz.f42081a, ndz.f42082b);
    }

    public ndx(String str, boolean z, Level level, boolean z2, Set set, ncy ncyVar) {
        this.f42068a = str;
        this.f42069b = z;
        this.f42070c = level;
        this.f42071d = z2;
        this.f42072e = set;
        this.f42073f = ncyVar;
    }

    @Override // p000.ndp
    /* JADX INFO: renamed from: a */
    public final ncn mo17375a(String str) {
        if (!this.f42071d || !str.contains(".")) {
            return new ndz(this.f42068a, str, this.f42069b, this.f42070c, this.f42072e, this.f42073f);
        }
        ndy ndyVar = this.f42074g;
        if (ndyVar == null) {
            synchronized (this) {
                ndyVar = this.f42074g;
                if (ndyVar == null) {
                    ndyVar = new ndy(this.f42068a, null, this.f42069b, this.f42070c, false, this.f42072e, this.f42073f);
                    this.f42074g = ndyVar;
                }
            }
        }
        return ndyVar;
    }
}
