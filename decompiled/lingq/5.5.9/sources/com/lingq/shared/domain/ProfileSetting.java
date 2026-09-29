package com.lingq.shared.domain;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileSetting;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ProfileSetting {

    /* JADX INFO: renamed from: a */
    public final ProfileSettingType f17829a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "reverse_flashcard")
    public final ProfileSettingType f17830b;

    /* JADX INFO: renamed from: c */
    public final ProfileSettingType f17831c;

    /* JADX INFO: renamed from: d */
    public final ProfileSettingType f17832d;

    /* JADX INFO: renamed from: e */
    public final ProfileSettingType f17833e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "test_cards_limit")
    public final int f17834f;

    public ProfileSetting(ProfileSettingType profileSettingType, ProfileSettingType profileSettingType2, ProfileSettingType profileSettingType3, ProfileSettingType profileSettingType4, ProfileSettingType profileSettingType5, int i10) {
        this.f17829a = profileSettingType;
        this.f17830b = profileSettingType2;
        this.f17831c = profileSettingType3;
        this.f17832d = profileSettingType4;
        this.f17833e = profileSettingType5;
        this.f17834f = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSetting)) {
            return false;
        }
        ProfileSetting profileSetting = (ProfileSetting) obj;
        return C5207g.m11106a(this.f17829a, profileSetting.f17829a) && C5207g.m11106a(this.f17830b, profileSetting.f17830b) && C5207g.m11106a(this.f17831c, profileSetting.f17831c) && C5207g.m11106a(this.f17832d, profileSetting.f17832d) && C5207g.m11106a(this.f17833e, profileSetting.f17833e) && this.f17834f == profileSetting.f17834f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17834f) + ((this.f17833e.hashCode() + ((this.f17832d.hashCode() + ((this.f17831c.hashCode() + ((this.f17830b.hashCode() + (this.f17829a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileSetting(flashcard=" + this.f17829a + ", reverseFlashcard=" + this.f17830b + ", cloze=" + this.f17831c + ", dictation=" + this.f17832d + ", multiple=" + this.f17833e + ", cardsLimit=" + this.f17834f + ")";
    }
}
