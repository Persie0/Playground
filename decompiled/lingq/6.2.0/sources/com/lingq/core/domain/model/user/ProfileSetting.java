package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ProfileSetting {
    public static final C1508j Companion = new C1508j();

    /* JADX INFO: renamed from: a */
    public ProfileSettingType f19691a;

    /* JADX INFO: renamed from: b */
    public ProfileSettingType f19692b;

    /* JADX INFO: renamed from: c */
    public ProfileSettingType f19693c;

    /* JADX INFO: renamed from: d */
    public ProfileSettingType f19694d;

    /* JADX INFO: renamed from: e */
    public ProfileSettingType f19695e;

    /* JADX INFO: renamed from: f */
    public ProfileSettingType f19696f;

    /* JADX INFO: renamed from: g */
    public ProfileSettingType f19697g;

    /* JADX INFO: renamed from: h */
    public ProfileSettingType f19698h;

    /* JADX INFO: renamed from: i */
    public Integer f19699i;

    public ProfileSetting(ProfileSettingType profileSettingType, ProfileSettingType profileSettingType2, ProfileSettingType profileSettingType3, ProfileSettingType profileSettingType4, ProfileSettingType profileSettingType5, ProfileSettingType profileSettingType6, ProfileSettingType profileSettingType7, ProfileSettingType profileSettingType8, Integer num) {
        this.f19691a = profileSettingType;
        this.f19692b = profileSettingType2;
        this.f19693c = profileSettingType3;
        this.f19694d = profileSettingType4;
        this.f19695e = profileSettingType5;
        this.f19696f = profileSettingType6;
        this.f19697g = profileSettingType7;
        this.f19698h = profileSettingType8;
        this.f19699i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSetting)) {
            return false;
        }
        ProfileSetting profileSetting = (ProfileSetting) obj;
        return fa4.m11650l(this.f19691a, profileSetting.f19691a) && fa4.m11650l(this.f19692b, profileSetting.f19692b) && fa4.m11650l(this.f19693c, profileSetting.f19693c) && fa4.m11650l(this.f19694d, profileSetting.f19694d) && fa4.m11650l(this.f19695e, profileSetting.f19695e) && fa4.m11650l(this.f19696f, profileSetting.f19696f) && fa4.m11650l(this.f19697g, profileSetting.f19697g) && fa4.m11650l(this.f19698h, profileSetting.f19698h) && fa4.m11650l(this.f19699i, profileSetting.f19699i);
    }

    public final int hashCode() {
        ProfileSettingType profileSettingType = this.f19691a;
        int iHashCode = (profileSettingType == null ? 0 : profileSettingType.hashCode()) * 31;
        ProfileSettingType profileSettingType2 = this.f19692b;
        int iHashCode2 = (iHashCode + (profileSettingType2 == null ? 0 : profileSettingType2.hashCode())) * 31;
        ProfileSettingType profileSettingType3 = this.f19693c;
        int iHashCode3 = (iHashCode2 + (profileSettingType3 == null ? 0 : profileSettingType3.hashCode())) * 31;
        ProfileSettingType profileSettingType4 = this.f19694d;
        int iHashCode4 = (iHashCode3 + (profileSettingType4 == null ? 0 : profileSettingType4.hashCode())) * 31;
        ProfileSettingType profileSettingType5 = this.f19695e;
        int iHashCode5 = (iHashCode4 + (profileSettingType5 == null ? 0 : profileSettingType5.hashCode())) * 31;
        ProfileSettingType profileSettingType6 = this.f19696f;
        int iHashCode6 = (iHashCode5 + (profileSettingType6 == null ? 0 : profileSettingType6.hashCode())) * 31;
        ProfileSettingType profileSettingType7 = this.f19697g;
        int iHashCode7 = (iHashCode6 + (profileSettingType7 == null ? 0 : profileSettingType7.hashCode())) * 31;
        ProfileSettingType profileSettingType8 = this.f19698h;
        int iHashCode8 = (iHashCode7 + (profileSettingType8 == null ? 0 : profileSettingType8.hashCode())) * 31;
        Integer num = this.f19699i;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileSetting(flashcard=" + this.f19691a + ", reverseFlashcard=" + this.f19692b + ", cloze=" + this.f19693c + ", dictation=" + this.f19694d + ", multiple=" + this.f19695e + ", unscramble=" + this.f19696f + ", matching=" + this.f19697g + ", speaking=" + this.f19698h + ", cardsLimit=" + this.f19699i + ")";
    }

    public /* synthetic */ ProfileSetting() {
        this(null, null, null, null, null, null, null, null, null);
    }
}
