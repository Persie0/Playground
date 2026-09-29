package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class z12 implements Comparable {

    /* JADX INFO: renamed from: a */
    public f12 f70741a;

    /* JADX INFO: renamed from: b */
    public int f70742b;

    /* JADX INFO: renamed from: c */
    public String f70743c;

    /* JADX INFO: renamed from: d */
    public Locale f70744d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f12 f12Var = ((z12) obj).f70741a;
        int iM3180a = b22.m3180a(this.f70741a.mo3736q(), f12Var.mo3736q());
        return iM3180a != 0 ? iM3180a : b22.m3180a(this.f70741a.mo4682i(), f12Var.mo4682i());
    }
}
