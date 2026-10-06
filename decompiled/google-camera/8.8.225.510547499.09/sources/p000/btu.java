package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btu implements bts {

    /* JADX INFO: renamed from: a */
    int f4454a;

    /* JADX INFO: renamed from: b */
    public Bitmap.Config f4455b;

    /* JADX INFO: renamed from: c */
    private final btv f4456c;

    public btu(btv btvVar) {
        this.f4456c = btvVar;
    }

    @Override // p000.bts
    /* JADX INFO: renamed from: a */
    public final void mo3054a() {
        this.f4456c.m3041c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btu) {
            btu btuVar = (btu) obj;
            if (this.f4454a == btuVar.f4454a && cbi.m3389j(this.f4455b, btuVar.f4455b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4454a * 31;
        Bitmap.Config config = this.f4455b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return btw.m3065a(this.f4454a, this.f4455b);
    }
}
