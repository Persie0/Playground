package com.lingq.shared.domain;

import com.android.installreferrer.api.InstallReferrerClient;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import p003a2.C0009a;
import p439vk.C9756b;
import tk.AbstractC9310n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileSettingJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/lingq/shared/domain/ProfileSetting;", "Lcom/squareup/moshi/q;", "moshi", "<init>", "(Lcom/squareup/moshi/q;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ProfileSettingJsonAdapter extends AbstractC4949k<ProfileSetting> {

    /* JADX INFO: renamed from: a */
    public final JsonReader.C4932a f17835a;

    /* JADX INFO: renamed from: b */
    public final AbstractC4949k<ProfileSettingType> f17836b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4949k<Integer> f17837c;

    public ProfileSettingJsonAdapter(C4955q c4955q) {
        C5207g.m11111f(c4955q, "moshi");
        this.f17835a = JsonReader.C4932a.m10513a("flashcard", "reverse_flashcard", "cloze", "dictation", "multiple", "test_cards_limit");
        EmptySet emptySet = EmptySet.f38034a;
        this.f17836b = c4955q.m10565c(ProfileSettingType.class, emptySet, "flashcard");
        this.f17837c = c4955q.m10565c(Integer.TYPE, emptySet, "cardsLimit");
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: a */
    public final ProfileSetting mo9385a(JsonReader jsonReader) throws IOException {
        C5207g.m11111f(jsonReader, "reader");
        jsonReader.mo10504b();
        Integer numMo9385a = null;
        ProfileSettingType profileSettingTypeMo9385a = null;
        ProfileSettingType profileSettingTypeMo9385a2 = null;
        ProfileSettingType profileSettingTypeMo9385a3 = null;
        ProfileSettingType profileSettingTypeMo9385a4 = null;
        ProfileSettingType profileSettingTypeMo9385a5 = null;
        while (true) {
            Integer num = numMo9385a;
            if (!jsonReader.mo10511w()) {
                ProfileSettingType profileSettingType = profileSettingTypeMo9385a5;
                jsonReader.mo10508q();
                if (profileSettingTypeMo9385a == null) {
                    throw C9756b.m18248g("flashcard", "flashcard", jsonReader);
                }
                if (profileSettingTypeMo9385a2 == null) {
                    throw C9756b.m18248g("reverseFlashcard", "reverse_flashcard", jsonReader);
                }
                if (profileSettingTypeMo9385a3 == null) {
                    throw C9756b.m18248g("cloze", "cloze", jsonReader);
                }
                if (profileSettingTypeMo9385a4 == null) {
                    throw C9756b.m18248g("dictation", "dictation", jsonReader);
                }
                if (profileSettingType == null) {
                    throw C9756b.m18248g("multiple", "multiple", jsonReader);
                }
                if (num != null) {
                    return new ProfileSetting(profileSettingTypeMo9385a, profileSettingTypeMo9385a2, profileSettingTypeMo9385a3, profileSettingTypeMo9385a4, profileSettingType, num.intValue());
                }
                throw C9756b.m18248g("cardsLimit", "test_cards_limit", jsonReader);
            }
            int iMo10512y0 = jsonReader.mo10512y0(this.f17835a);
            ProfileSettingType profileSettingType2 = profileSettingTypeMo9385a5;
            AbstractC4949k<ProfileSettingType> abstractC4949k = this.f17836b;
            switch (iMo10512y0) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    jsonReader.mo10496G0();
                    jsonReader.mo10498I0();
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    profileSettingTypeMo9385a = abstractC4949k.mo9385a(jsonReader);
                    if (profileSettingTypeMo9385a == null) {
                        throw C9756b.m18254m("flashcard", "flashcard", jsonReader);
                    }
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                case 1:
                    profileSettingTypeMo9385a2 = abstractC4949k.mo9385a(jsonReader);
                    if (profileSettingTypeMo9385a2 == null) {
                        throw C9756b.m18254m("reverseFlashcard", "reverse_flashcard", jsonReader);
                    }
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                case 2:
                    profileSettingTypeMo9385a3 = abstractC4949k.mo9385a(jsonReader);
                    if (profileSettingTypeMo9385a3 == null) {
                        throw C9756b.m18254m("cloze", "cloze", jsonReader);
                    }
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                case 3:
                    profileSettingTypeMo9385a4 = abstractC4949k.mo9385a(jsonReader);
                    if (profileSettingTypeMo9385a4 == null) {
                        throw C9756b.m18254m("dictation", "dictation", jsonReader);
                    }
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                case 4:
                    profileSettingTypeMo9385a5 = abstractC4949k.mo9385a(jsonReader);
                    if (profileSettingTypeMo9385a5 == null) {
                        throw C9756b.m18254m("multiple", "multiple", jsonReader);
                    }
                    numMo9385a = num;
                    break;
                    break;
                case 5:
                    numMo9385a = this.f17837c.mo9385a(jsonReader);
                    if (numMo9385a == null) {
                        throw C9756b.m18254m("cardsLimit", "test_cards_limit", jsonReader);
                    }
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
                default:
                    numMo9385a = num;
                    profileSettingTypeMo9385a5 = profileSettingType2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.AbstractC4949k
    /* JADX INFO: renamed from: f */
    public final void mo9386f(AbstractC9310n abstractC9310n, ProfileSetting profileSetting) throws IOException {
        ProfileSetting profileSetting2 = profileSetting;
        C5207g.m11111f(abstractC9310n, "writer");
        if (profileSetting2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC9310n.mo10556b();
        abstractC9310n.mo10551C("flashcard");
        ProfileSettingType profileSettingType = profileSetting2.f17829a;
        AbstractC4949k<ProfileSettingType> abstractC4949k = this.f17836b;
        abstractC4949k.mo9386f(abstractC9310n, profileSettingType);
        abstractC9310n.mo10551C("reverse_flashcard");
        abstractC4949k.mo9386f(abstractC9310n, profileSetting2.f17830b);
        abstractC9310n.mo10551C("cloze");
        abstractC4949k.mo9386f(abstractC9310n, profileSetting2.f17831c);
        abstractC9310n.mo10551C("dictation");
        abstractC4949k.mo9386f(abstractC9310n, profileSetting2.f17832d);
        abstractC9310n.mo10551C("multiple");
        abstractC4949k.mo9386f(abstractC9310n, profileSetting2.f17833e);
        abstractC9310n.mo10551C("test_cards_limit");
        this.f17837c.mo9386f(abstractC9310n, Integer.valueOf(profileSetting2.f17834f));
        abstractC9310n.mo10560r();
    }

    public final String toString() {
        return C0009a.m19g(36, "GeneratedJsonAdapter(ProfileSetting)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
