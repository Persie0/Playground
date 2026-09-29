package p000;

import com.google.android.gms.internal.measurement.zzabz;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes.dex */
public final class jib extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final hib f45591a;

    /* JADX INFO: renamed from: b */
    public final iib f45592b;

    public jib(hib hibVar, iib iibVar) {
        this.f45591a = hibVar;
        this.f45592b = iibVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM24522g = ((xhb) this.f45591a).m24522g(i);
        ((gr7) this.f45592b).getClass();
        zzabz zzabzVarZzb = zzabz.zzb(iM24522g);
        return zzabzVarZzb == null ? zzabz.UNKNOWN : zzabzVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45591a.size();
    }
}
