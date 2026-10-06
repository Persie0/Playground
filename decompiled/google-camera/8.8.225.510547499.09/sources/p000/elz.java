package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elz implements emj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f14696a;

    public elz(Context context) {
        this.f14696a = context;
    }

    @Override // p000.emj
    /* JADX INFO: renamed from: a */
    public final Object mo7509a(lqq lqqVar) {
        try {
            return ((Class) lqqVar.f39002b).cast(this.f14696a.getSystemService((String) lqqVar.f39003c));
        } catch (Exception e) {
            throw new RuntimeException("Unable to create or provide ".concat((String) lqqVar.f39003c), e);
        }
    }
}
