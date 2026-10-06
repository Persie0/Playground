package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ihf implements ihb {

    /* JADX INFO: renamed from: a */
    private final int f30948a;

    /* JADX INFO: renamed from: b */
    private final Object[] f30949b;

    public ihf(int i, Object... objArr) {
        this.f30948a = i;
        this.f30949b = objArr;
    }

    @Override // p000.ihb
    /* JADX INFO: renamed from: a */
    public final String mo11322a(Resources resources) {
        return resources.getString(this.f30948a, this.f30949b);
    }
}
