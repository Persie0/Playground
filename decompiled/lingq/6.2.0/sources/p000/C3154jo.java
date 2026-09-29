package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: jo */
/* JADX INFO: loaded from: classes2.dex */
public final class C3154jo extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f45893b;

    /* JADX INFO: renamed from: c */
    public final String f45894c;

    /* JADX INFO: renamed from: d */
    public final int f45895d;

    /* JADX INFO: renamed from: e */
    public final byte[] f45896e;

    public C3154jo(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f45893b = str;
        this.f45894c = str2;
        this.f45895d = i;
        this.f45896e = bArr;
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        su5Var.m21744a(this.f45895d, this.f45896e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3154jo.class != obj.getClass()) {
            return false;
        }
        C3154jo c3154jo = (C3154jo) obj;
        return this.f45895d == c3154jo.f45895d && this.f45893b.equals(c3154jo.f45893b) && Objects.equals(this.f45894c, c3154jo.f45894c) && Arrays.equals(this.f45896e, c3154jo.f45896e);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c((527 + this.f45895d) * 31, this.f45893b, 31);
        String str = this.f45894c;
        return Arrays.hashCode(this.f45896e) + ((iM22980c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": mimeType=" + this.f45893b + ", description=" + this.f45894c;
    }
}
