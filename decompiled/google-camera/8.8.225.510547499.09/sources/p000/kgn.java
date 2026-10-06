package p000;

import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kgn implements kex {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kgo f35929a;

    public kgn(kgo kgoVar) {
        this.f35929a = kgoVar;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: a */
    public final Integer mo14091a() {
        return this.f35929a.f35934e;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: b */
    public final Integer mo14092b() {
        return this.f35929a.f35933d;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: c */
    public final Integer mo14093c() {
        return this.f35929a.f35935f;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: d */
    public final Integer mo14094d() {
        return this.f35929a.f35932c;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: e */
    public final Integer mo14095e() {
        return this.f35929a.f35936g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kex) {
            kex kexVar = (kex) obj;
            if (Objects.equals(mo14094d(), kexVar.mo14094d()) && Objects.equals(mo14092b(), kexVar.mo14092b()) && Objects.equals(mo14091a(), kexVar.mo14091a()) && Objects.equals(mo14093c(), kexVar.mo14093c()) && Objects.equals(mo14095e(), kexVar.mo14095e()) && Arrays.equals(mo14097g(), kexVar.mo14097g()) && Arrays.equals(mo14096f(), kexVar.mo14096f()) && Arrays.equals(mo14098h(), kexVar.mo14098h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: f */
    public final MeteringRectangle[] mo14096f() {
        return this.f35929a.f35938i;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: g */
    public final MeteringRectangle[] mo14097g() {
        return this.f35929a.f35937h;
    }

    @Override // p000.kex
    /* JADX INFO: renamed from: h */
    public final MeteringRectangle[] mo14098h() {
        return this.f35929a.f35939j;
    }

    public final int hashCode() {
        kgo kgoVar = this.f35929a;
        return Objects.hash(kgoVar.f35932c, kgoVar.f35933d, kgoVar.f35934e, kgoVar.f35935f, kgoVar.f35936g, Integer.valueOf(Arrays.hashCode(kgoVar.f35937h)), Integer.valueOf(Arrays.hashCode(this.f35929a.f35938i)), Integer.valueOf(Arrays.hashCode(this.f35929a.f35939j)));
    }
}
