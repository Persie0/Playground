package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihe implements ihb {

    /* JADX INFO: renamed from: a */
    private final int f30945a;

    /* JADX INFO: renamed from: b */
    private final int f30946b;

    /* JADX INFO: renamed from: c */
    private final Object[] f30947c;

    public ihe(int i, int i2, Object... objArr) {
        this.f30945a = i;
        this.f30946b = i2;
        this.f30947c = objArr;
    }

    @Override // p000.ihb
    /* JADX INFO: renamed from: a */
    public final String mo11322a(Resources resources) {
        return resources.getQuantityString(this.f30945a, this.f30946b, this.f30947c);
    }
}
