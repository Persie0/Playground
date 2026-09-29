package com.google.android.gms.internal.clearcut;

import p000.fg2;

/* JADX INFO: loaded from: classes2.dex */
class zzbi extends zzbh {

    /* JADX INFO: renamed from: d */
    public final byte[] f11804d;

    public zzbi(byte[] bArr) {
        this.f11803a = 0;
        this.f11804d = bArr;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbb) && size() == ((zzbb) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof zzbi)) {
                return obj.equals(this);
            }
            zzbi zzbiVar = (zzbi) obj;
            int i = this.f11803a;
            int i2 = zzbiVar.f11803a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > zzbiVar.size()) {
                    int size2 = size();
                    StringBuilder sb = new StringBuilder(40);
                    sb.append("Length too large: ");
                    sb.append(size);
                    sb.append(size2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (size > zzbiVar.size()) {
                    fg2.m11819h(59, size, zzbiVar.size());
                    return false;
                }
                byte[] bArr = zzbiVar.f11804d;
                int iM5344g = m5344g() + size;
                int iM5344g2 = m5344g();
                int iM5344g3 = zzbiVar.m5344g();
                while (iM5344g2 < iM5344g) {
                    if (this.f11804d[iM5344g2] == bArr[iM5344g3]) {
                        iM5344g2++;
                        iM5344g3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    /* JADX INFO: renamed from: f */
    public byte mo5343f(int i) {
        return this.f11804d[i];
    }

    /* JADX INFO: renamed from: g */
    public int m5344g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbb
    public int size() {
        return this.f11804d.length;
    }
}
