package p000;

import java.util.List;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgb {

    /* JADX INFO: renamed from: a */
    public final int f35863a;

    /* JADX INFO: renamed from: b */
    public final mws f35864b;

    /* JADX INFO: renamed from: c */
    public final mws f35865c;

    /* JADX WARN: Illegal instructions before constructor call */
    public kgb(int i) {
        int i2 = mws.f41739d;
        mws mwsVar = mzr.f41857a;
        this(i, mwsVar, mwsVar);
    }

    public kgb(int i, List list) {
        this(i, mws.m17095j(list), mzr.f41857a);
    }

    public kgb(int i, mws mwsVar, mws mwsVar2) {
        this.f35863a = i;
        this.f35864b = mwsVar;
        this.f35865c = mwsVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kgb)) {
            return false;
        }
        kgb kgbVar = (kgb) obj;
        return this.f35863a == kgbVar.f35863a && Objects.equals(this.f35865c, kgbVar.f35865c) && Objects.equals(this.f35864b, kgbVar.f35864b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f35863a), this.f35865c, this.f35864b);
    }
}
