package com.lingq.core.domain.model.cup;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.AbstractC3201a;
import kotlinx.serialization.KSerializer;
import p000.cs4;
import p000.ey8;
import p000.lu1;
import p000.wf1;
import p000.ys2;
import p000.zs2;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public enum CupPrizeSource {
    Reading,
    Listening,
    LingQ,
    KnownWord,
    All,
    None;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final lu1 Companion = new lu1();
    private static final cs4 $cachedSerializer$delegate = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(6));

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        CupPrizeSource[] cupPrizeSourceArrValues = values();
        cupPrizeSourceArrValues.getClass();
        return new zs2("com.lingq.core.domain.model.cup.CupPrizeSource", cupPrizeSourceArrValues);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
