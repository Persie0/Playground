package com.lingq.feature.widget.layout.collections.layout;

import p000.bk2;
import p000.tj3;
import p000.xj2;
import p000.ye1;
import p000.yf1;

/* JADX INFO: renamed from: com.lingq.feature.widget.layout.collections.layout.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2869e {
    /* JADX INFO: renamed from: a */
    public static ImageTextListLayoutSize m9785a(ye1 ye1Var) {
        float fM3806b = bk2.m3806b(((bk2) ((tj3) ye1Var).m22128k(yf1.f69762a)).f8632a);
        ImageTextListLayoutSize imageTextListLayoutSize = ImageTextListLayoutSize.Medium;
        if (xj2.m24559a(fM3806b, imageTextListLayoutSize.m25920getMaxWidthD9Ej5fM()) >= 0) {
            return ImageTextListLayoutSize.Large;
        }
        ImageTextListLayoutSize imageTextListLayoutSize2 = ImageTextListLayoutSize.Small;
        return xj2.m24559a(fM3806b, imageTextListLayoutSize2.m25920getMaxWidthD9Ej5fM()) >= 0 ? imageTextListLayoutSize : imageTextListLayoutSize2;
    }
}
