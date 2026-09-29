package com.lingq.core.promotions;

import kotlin.enums.AbstractC3201a;
import p000.y52;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ONGOING' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class SaleEventType {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ SaleEventType[] $VALUES;
    public static final SaleEventType BLACK_FRIDAY;
    public static final SaleEventType BLACK_FRIDAY_EXTENDED;
    public static final SaleEventType CHINESE_NEW_YEARS;
    public static final SaleEventType CYBER_MONDAY;
    public static final SaleEventType FLASH;
    public static final SaleEventType LANGUAGES50;
    public static final SaleEventType NEW_YEARS;
    public static final SaleEventType NEW_YEARS_EXTENDED;
    public static final SaleEventType ONGOING;
    public static final SaleEventType POSITIVE;
    public static final SaleEventType SPRING;
    public static final SaleEventType SUMMER;
    public static final SaleEventType VALENTINES;
    public static final SaleEventType WELCOME;
    private final int color;
    private final int colorDark;
    private final int freeTrialImageId;
    private final boolean isExtended;
    private final int libraryImageId;
    private final String promoCode;
    private final boolean tagFreeTrial;
    private final boolean taglineSplit;
    private final int upgradeImageId;

    private static final /* synthetic */ SaleEventType[] $values() {
        return new SaleEventType[]{ONGOING, BLACK_FRIDAY, BLACK_FRIDAY_EXTENDED, CYBER_MONDAY, NEW_YEARS, NEW_YEARS_EXTENDED, CHINESE_NEW_YEARS, VALENTINES, SPRING, WELCOME, SUMMER, FLASH, POSITIVE, LANGUAGES50};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ONGOING = new SaleEventType("ONGOING", 0, "lq-12month5off", 0, i, i2, i3, false, false, false, 0, 510, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        BLACK_FRIDAY = new SaleEventType("BLACK_FRIDAY", 1, null, i, i2, i3, objArr, objArr2, objArr3, objArr4, 0, 511, null);
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        BLACK_FRIDAY_EXTENDED = new SaleEventType("BLACK_FRIDAY_EXTENDED", 2, null, i2, i3, objArr5, objArr6, objArr7, objArr8, objArr9, 0, 511, null);
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        CYBER_MONDAY = new SaleEventType("CYBER_MONDAY", 3, null, i3, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, 0, 511, null);
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        NEW_YEARS = new SaleEventType("NEW_YEARS", 4, null, objArr16, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, 0, 511, null);
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        NEW_YEARS_EXTENDED = new SaleEventType("NEW_YEARS_EXTENDED", 5, null, objArr23, objArr24, objArr25, objArr26, objArr27, objArr28, objArr29, 0, 511, null);
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        CHINESE_NEW_YEARS = new SaleEventType("CHINESE_NEW_YEARS", 6, null, objArr30, objArr31, objArr32, objArr33, objArr34, objArr35, objArr36, 0, 511, null);
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        VALENTINES = new SaleEventType("VALENTINES", 7, null, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, 0, 511, null);
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        SPRING = new SaleEventType("SPRING", 8, null, objArr44, objArr45, objArr46, objArr47, objArr48, objArr49, objArr50, 0, 511, null);
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        WELCOME = new SaleEventType("WELCOME", 9, null, objArr51, objArr52, objArr53, objArr54, objArr55, objArr56, objArr57, 0, 511, null);
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        SUMMER = new SaleEventType("SUMMER", 10, null, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, objArr64, 0, 511, null);
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        Object[] objArr69 = 0 == true ? 1 : 0;
        Object[] objArr70 = 0 == true ? 1 : 0;
        Object[] objArr71 = 0 == true ? 1 : 0;
        FLASH = new SaleEventType("FLASH", 11, null, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, objArr71, 0, 511, null);
        Object[] objArr72 = 0 == true ? 1 : 0;
        Object[] objArr73 = 0 == true ? 1 : 0;
        Object[] objArr74 = 0 == true ? 1 : 0;
        Object[] objArr75 = 0 == true ? 1 : 0;
        Object[] objArr76 = 0 == true ? 1 : 0;
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        POSITIVE = new SaleEventType("POSITIVE", 12, null, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, 0, 511, null);
        Object[] objArr79 = 0 == true ? 1 : 0;
        Object[] objArr80 = 0 == true ? 1 : 0;
        Object[] objArr81 = 0 == true ? 1 : 0;
        Object[] objArr82 = 0 == true ? 1 : 0;
        Object[] objArr83 = 0 == true ? 1 : 0;
        Object[] objArr84 = 0 == true ? 1 : 0;
        Object[] objArr85 = 0 == true ? 1 : 0;
        LANGUAGES50 = new SaleEventType("LANGUAGES50", 13, null, objArr79, objArr80, objArr81, objArr82, objArr83, objArr84, objArr85, 0, 511, null);
        SaleEventType[] saleEventTypeArr$values = $values();
        $VALUES = saleEventTypeArr$values;
        $ENTRIES = AbstractC3201a.m15404a(saleEventTypeArr$values);
    }

    public /* synthetic */ SaleEventType(String str, int i, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, int i6, int i7, y52 y52Var) {
        this(str, i, (i7 & 1) != 0 ? "lq-12month5off" : str2, (i7 & 2) != 0 ? R$drawable.im_flash25_upgrade : i2, (i7 & 4) != 0 ? R$drawable.im_flash25_library : i3, (i7 & 8) != 0 ? -16777216 : i4, (i7 & 16) != 0 ? -16777216 : i5, (i7 & 32) != 0 ? false : z, (i7 & 64) != 0 ? false : z2, (i7 & 128) != 0 ? false : z3, (i7 & 256) != 0 ? R$drawable.im_flash25_trial : i6);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static SaleEventType valueOf(String str) {
        return (SaleEventType) Enum.valueOf(SaleEventType.class, str);
    }

    public static SaleEventType[] values() {
        return (SaleEventType[]) $VALUES.clone();
    }

    public final int getColor() {
        return this.color;
    }

    public final int getColorDark() {
        return this.colorDark;
    }

    public final int getFreeTrialImageId() {
        return this.freeTrialImageId;
    }

    public final int getLibraryImageId() {
        return this.libraryImageId;
    }

    public final String getPromoCode() {
        return this.promoCode;
    }

    public final boolean getTagFreeTrial() {
        return this.tagFreeTrial;
    }

    public final boolean getTaglineSplit() {
        return this.taglineSplit;
    }

    public final int getUpgradeImageId() {
        return this.upgradeImageId;
    }

    public final boolean isExtended() {
        return this.isExtended;
    }

    private SaleEventType(String str, int i, String str2, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, int i6) {
        super(str, i);
        this.promoCode = str2;
        this.upgradeImageId = i2;
        this.libraryImageId = i3;
        this.color = i4;
        this.colorDark = i5;
        this.isExtended = z;
        this.taglineSplit = z2;
        this.tagFreeTrial = z3;
        this.freeTrialImageId = i6;
    }
}
