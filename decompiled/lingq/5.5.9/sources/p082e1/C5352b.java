package p082e1;

import com.google.android.play.core.assetpacks.C3118i;
import dm.C5207g;
import p338qd.InterfaceC8585v0;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: loaded from: classes.dex */
public class C5352b implements InterfaceC8585v0 {

    /* JADX INFO: renamed from: a */
    public int f33656a;

    /* JADX INFO: renamed from: b */
    public final Object f33657b;

    public C5352b(int i10, int i11) {
        if (i11 == 3) {
            this.f33657b = new byte[i10];
            this.f33656a = 0;
            return;
        }
        this.f33656a = i10;
        Float[] fArr = new Float[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = Float.valueOf(0.0f);
        }
        this.f33657b = fArr;
    }

    public C5352b(String str, int i10) {
        this.f33656a = i10;
        this.f33657b = str;
    }

    /* JADX INFO: renamed from: a */
    public final float m11476a(C5352b c5352b) {
        C5207g.m11111f(c5352b, "a");
        int i10 = this.f33656a;
        float fFloatValue = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            fFloatValue += ((Float[]) c5352b.f33657b)[i11].floatValue() * ((Float[]) this.f33657b)[i11].floatValue();
        }
        return fFloatValue;
    }

    @Override // p338qd.InterfaceC8585v0
    public final Object zza() {
        ((C3118i) this.f33657b).m8990c(this.f33656a).f46010c.f45995d = 5;
        return null;
    }
}
