package com.lingq.core.domain.model.offer;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.AbstractC3201a;
import kotlinx.serialization.KSerializer;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.j80;
import p000.ys2;
import p000.zs2;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public enum BannerType {
    LIBRARY,
    UPGRADE,
    LIBRARY_TABLET,
    TRIAL,
    UNKNOWN;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final j80 Companion = new j80();
    private static final cs4 $cachedSerializer$delegate = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(2));

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        BannerType[] bannerTypeArrValues = values();
        bannerTypeArrValues.getClass();
        return new zs2("com.lingq.core.domain.model.offer.BannerType", bannerTypeArrValues);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
