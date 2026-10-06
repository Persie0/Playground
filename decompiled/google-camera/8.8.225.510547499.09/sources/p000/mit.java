package p000;

import android.graphics.Typeface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mit implements mkm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ miu f40640a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f40641b;

    public mit(miu miuVar, int i) {
        this.f40641b = i;
        this.f40640a = miuVar;
    }

    @Override // p000.mkm
    /* JADX INFO: renamed from: a */
    public final void mo16417a(Typeface typeface) {
        switch (this.f40641b) {
            case 0:
                miu miuVar = this.f40640a;
                bzm bzmVar = miuVar.f40648G;
                if (bzmVar != null) {
                    bzmVar.m3221d();
                }
                if (miuVar.f40701t != typeface) {
                    miuVar.f40701t = typeface;
                    miuVar.f40700s = mkv.m16538b(miuVar.f40668a.getContext().getResources().getConfiguration(), typeface);
                    Typeface typeface2 = miuVar.f40700s;
                    if (typeface2 == null) {
                        typeface2 = miuVar.f40701t;
                    }
                    miuVar.f40699r = typeface2;
                    miuVar.m16432f();
                }
                break;
            default:
                miu miuVar2 = this.f40640a;
                bzm bzmVar2 = miuVar2.f40649H;
                if (bzmVar2 != null) {
                    bzmVar2.m3221d();
                }
                if (miuVar2.f40698q != typeface) {
                    miuVar2.f40698q = typeface;
                    miuVar2.f40697p = mkv.m16538b(miuVar2.f40668a.getContext().getResources().getConfiguration(), typeface);
                    Typeface typeface3 = miuVar2.f40697p;
                    if (typeface3 == null) {
                        typeface3 = miuVar2.f40698q;
                    }
                    miuVar2.f40696o = typeface3;
                    miuVar2.m16432f();
                }
                break;
        }
    }
}
