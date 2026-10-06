package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kpt implements kpw {

    /* JADX INFO: renamed from: e */
    protected final kpw f36815e;

    public kpt(kpw kpwVar) {
        this.f36815e = kpwVar;
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: a */
    public final int mo7245a() {
        return this.f36815e.mo7245a();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: b */
    public final int mo7246b() {
        return this.f36815e.mo7246b();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: c */
    public final int mo7247c() {
        return this.f36815e.mo7247c();
    }

    public void close() {
        this.f36815e.close();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: d */
    public long mo7248d() {
        return this.f36815e.mo7248d();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: e */
    public final Rect mo7249e() {
        return this.f36815e.mo7249e();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kpw)) {
            return false;
        }
        kpw kpwVar = (kpw) obj;
        return kpwVar.mo7245a() == mo7245a() && kpwVar.mo7247c() == mo7247c() && kpwVar.mo7246b() == mo7246b() && kpwVar.mo7248d() == mo7248d();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: f */
    public final HardwareBuffer mo7250f() {
        return this.f36815e.mo7250f();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: g */
    public final List mo7251g() {
        return this.f36815e.mo7251g();
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: h */
    public final void mo7252h(Rect rect) {
        this.f36815e.mo7252h(rect);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo7245a()), Integer.valueOf(mo7247c()), Integer.valueOf(mo7246b()), Long.valueOf(mo7248d())});
    }

    @Override // p000.kpw
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo7253i() {
        return false;
    }

    @Override // p000.kpd
    /* JADX INFO: renamed from: j */
    public final khb mo7254j() {
        return this.f36815e.mo7254j();
    }

    public String toString() {
        return this.f36815e.toString();
    }
}
