package jo;

import cm.InterfaceC2052l;

/* JADX INFO: renamed from: jo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6529a extends C6530b.a<Object, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2052l f37184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean[] f37185b;

    public C6529a(InterfaceC2052l interfaceC2052l, boolean[] zArr) {
        this.f37184a = interfaceC2052l;
        this.f37185b = zArr;
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: a */
    public final Object mo11208a() {
        return Boolean.valueOf(this.f37185b[0]);
    }

    @Override // jo.C6530b.c
    /* JADX INFO: renamed from: c */
    public final boolean mo11209c(Object obj) {
        boolean zBooleanValue = ((Boolean) this.f37184a.mo528n(obj)).booleanValue();
        boolean[] zArr = this.f37185b;
        if (zBooleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
