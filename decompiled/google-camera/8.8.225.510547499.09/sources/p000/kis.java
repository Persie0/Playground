package p000;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kis implements kex {

    /* JADX INFO: renamed from: a */
    public final Boolean f36206a;

    /* JADX INFO: renamed from: b */
    public final Boolean f36207b;

    /* JADX INFO: renamed from: c */
    public final Boolean f36208c;

    /* JADX INFO: renamed from: d */
    public final MeteringRectangle[] f36209d;

    /* JADX INFO: renamed from: e */
    public final MeteringRectangle[] f36210e;

    /* JADX INFO: renamed from: f */
    public final MeteringRectangle[] f36211f;

    /* JADX INFO: renamed from: g */
    private final int f36212g;

    /* JADX INFO: renamed from: h */
    private final int f36213h;

    /* JADX INFO: renamed from: i */
    private final int f36214i;

    /* JADX INFO: renamed from: j */
    private final int f36215j;

    /* JADX INFO: renamed from: k */
    private final int f36216k;

    public kis(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.f36212g = i;
        this.f36213h = i2;
        this.f36214i = i3;
        this.f36215j = i4;
        this.f36216k = i5;
        this.f36206a = Boolean.valueOf(z);
        this.f36207b = Boolean.valueOf(z2);
        this.f36208c = Boolean.valueOf(z3);
        this.f36209d = meteringRectangleArr;
        this.f36210e = meteringRectangleArr2;
        this.f36211f = meteringRectangleArr3;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: a */
    public final Integer mo14091a() {
        return Integer.valueOf(this.f36214i);
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: b */
    public final Integer mo14092b() {
        return Integer.valueOf(this.f36213h);
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: c */
    public final Integer mo14093c() {
        return Integer.valueOf(this.f36215j);
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: d */
    public final Integer mo14094d() {
        return Integer.valueOf(this.f36212g);
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: e */
    public final Integer mo14095e() {
        return Integer.valueOf(this.f36216k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kis) {
            kis kisVar = (kis) obj;
            if (Objects.equals(Integer.valueOf(this.f36212g), kisVar.mo14094d()) && Objects.equals(mo14092b(), kisVar.mo14092b()) && Objects.equals(mo14091a(), kisVar.mo14091a()) && Objects.equals(mo14093c(), kisVar.mo14093c()) && Objects.equals(mo14095e(), kisVar.mo14095e()) && Arrays.equals(this.f36209d, kisVar.f36209d) && Arrays.equals(this.f36210e, kisVar.f36210e) && Arrays.equals(this.f36211f, kisVar.f36211f) && Objects.equals(this.f36206a, kisVar.f36206a) && Objects.equals(this.f36207b, kisVar.f36207b) && Objects.equals(this.f36208c, kisVar.f36208c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: f */
    public final MeteringRectangle[] mo14096f() {
        return this.f36210e;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: g */
    public final MeteringRectangle[] mo14097g() {
        return this.f36209d;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: h */
    public final MeteringRectangle[] mo14098h() {
        return this.f36211f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36212g), Integer.valueOf(this.f36213h), Integer.valueOf(this.f36214i), Integer.valueOf(this.f36215j), Integer.valueOf(this.f36216k), Integer.valueOf(Arrays.hashCode(this.f36209d)), Integer.valueOf(Arrays.hashCode(this.f36210e)), Integer.valueOf(Arrays.hashCode(this.f36211f)), this.f36206a, this.f36207b, this.f36208c);
    }
}
