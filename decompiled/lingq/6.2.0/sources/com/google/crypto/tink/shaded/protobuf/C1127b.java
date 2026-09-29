package com.google.crypto.tink.shaded.protobuf;

import p000.C3386nv;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1127b {

    /* JADX INFO: renamed from: a */
    public final C1131f f13565a;

    /* JADX INFO: renamed from: b */
    public final byte[] f13566b;

    public C1127b(int i) {
        byte[] bArr = new byte[i];
        this.f13566b = bArr;
        this.f13565a = new C1131f(i, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final ByteString m6434a() {
        C1131f c1131f = this.f13565a;
        if (c1131f.f13590c - c1131f.f13591d == 0) {
            return new ByteString.LiteralByteString(this.f13566b);
        }
        C3386nv.m17633t("Did not write as much data as expected.");
        return null;
    }
}
