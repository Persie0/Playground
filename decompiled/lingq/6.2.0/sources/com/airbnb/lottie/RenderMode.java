package com.airbnb.lottie;

import p000.a68;

/* JADX INFO: loaded from: classes2.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = a68.f297a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
