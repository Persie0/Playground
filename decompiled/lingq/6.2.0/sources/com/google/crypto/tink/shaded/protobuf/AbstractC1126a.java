package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import p000.ij6;
import p000.sx5;
import p000.tk3;
import p000.wm8;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1126a implements sx5 {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public abstract int mo6429a(wm8 wm8Var);

    /* JADX INFO: renamed from: b */
    public final String m6430b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: c */
    public abstract tk3 mo6431c();

    /* JADX INFO: renamed from: d */
    public final byte[] m6432d() {
        try {
            int iMo6429a = ((AbstractC1134i) this).mo6429a(null);
            byte[] bArr = new byte[iMo6429a];
            C1131f c1131f = new C1131f(iMo6429a, bArr);
            mo6433e(c1131f);
            if (iMo6429a - c1131f.f13591d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            ij6.m13958p(m6430b("byte array"), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo6433e(C1131f c1131f);
}
