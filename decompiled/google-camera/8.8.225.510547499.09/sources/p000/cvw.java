package p000;

import android.content.Intent;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvw implements crh {

    /* JADX INFO: renamed from: a */
    private final dhv f9840a;

    /* JADX INFO: renamed from: b */
    private final bko f9841b;

    public cvw(bko bkoVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f9841b = bkoVar;
        this.f9840a = dhvVar;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: a */
    public final ikw mo5395a() {
        return ikw.VIDEO_INTENT;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: b */
    public final mrm mo5396b() {
        Intent intentM2611e = this.f9841b.m2611e();
        if (intentM2611e == null) {
            return mqu.f41450a;
        }
        return (cds.m3509h(intentM2611e) && cds.m3511j(intentM2611e)) ? mrm.m16829i(kmq.f36557a) : mqu.f41450a;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: c */
    public final boolean mo5397c() {
        return this.f9840a.mo6184l(dib.f11237X);
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: d */
    public final boolean mo5398d() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: e */
    public final boolean mo5399e() {
        return true;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: f */
    public final boolean mo5400f() {
        return true;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: g */
    public final boolean mo5401g() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: h */
    public final boolean mo5402h() {
        return true;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: i */
    public final boolean mo5403i() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: j */
    public final boolean mo5404j() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: k */
    public final boolean mo5405k() {
        return this.f9840a.mo6184l(dhh.f11067T);
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: l */
    public final boolean mo5406l() {
        return true;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: m */
    public final boolean mo5407m() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: n */
    public final boolean mo5408n() {
        Intent intentM2611e = this.f9841b.m2611e();
        if (intentM2611e == null) {
            return false;
        }
        return intentM2611e.getBooleanExtra(JrxsYuVZZqnFC.jCNqFln, false);
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: o */
    public final boolean mo5409o() {
        return false;
    }

    @Override // p000.crh
    /* JADX INFO: renamed from: p */
    public final boolean mo5410p() {
        return false;
    }
}
