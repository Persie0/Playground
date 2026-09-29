package com.google.common.hash;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class HashCode$BytesHashCode extends AbstractC1107a implements Serializable {

    /* JADX INFO: renamed from: b */
    public final byte[] f13484b;

    public HashCode$BytesHashCode(byte[] bArr) {
        bArr.getClass();
        this.f13484b = bArr;
    }

    @Override // com.google.common.hash.AbstractC1107a
    /* JADX INFO: renamed from: a */
    public final byte[] mo6354a() {
        return (byte[]) this.f13484b.clone();
    }
}
