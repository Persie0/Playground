package androidx.emoji2.text;

import android.os.Build;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0891e extends C0892f.i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0892f.a f5982a;

    public C0891e(C0892f.a aVar) {
        this.f5982a = aVar;
    }

    @Override // androidx.emoji2.text.C0892f.i
    /* JADX INFO: renamed from: a */
    public final void mo3517a(Throwable th2) {
        this.f5982a.f5996a.m3523e(th2);
    }

    @Override // androidx.emoji2.text.C0892f.i
    /* JADX INFO: renamed from: b */
    public final void mo3518b(C0901o c0901o) {
        C0892f.a aVar = this.f5982a;
        aVar.f5995c = c0901o;
        C0901o c0901o2 = aVar.f5995c;
        C0892f c0892f = aVar.f5996a;
        aVar.f5994b = new C0897k(c0901o2, c0892f.f5991g, c0892f.f5993i, Build.VERSION.SDK_INT >= 34 ? C0895i.m3529a() : C0896j.m3530a());
        aVar.f5996a.m3524f();
    }
}
