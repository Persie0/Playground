package com.airbnb.lottie.model.content;

import p000.C3386nv;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public enum ShapeTrimPath$Type {
    SIMULTANEOUSLY,
    INDIVIDUALLY;

    public static ShapeTrimPath$Type forId(int i) {
        if (i == 1) {
            return SIMULTANEOUSLY;
        }
        if (i == 2) {
            return INDIVIDUALLY;
        }
        C3386nv.m17626m(ux5.m22988k(i, "Unknown trim path type "));
        return null;
    }
}
