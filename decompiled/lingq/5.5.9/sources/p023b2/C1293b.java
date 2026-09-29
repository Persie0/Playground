package p023b2;

import com.google.android.play.core.assetpacks.C3118i;
import p338qd.InterfaceC8585v0;

/* JADX INFO: renamed from: b2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1293b implements InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public int f8007a;

    /* JADX INFO: renamed from: b */
    public final Object f8008b;

    public C1293b() {
        this.f8008b = new Object[256];
    }

    public /* synthetic */ C1293b(C3118i c3118i, int i10) {
        this.f8008b = c3118i;
        this.f8007a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m4797a(Object obj) {
        int i10 = this.f8007a;
        Object[] objArr = (Object[]) this.f8008b;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f8007a = i10 + 1;
        }
    }

    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        ((C3118i) this.f8008b).m8988a(this.f8007a);
        return null;
    }
}
