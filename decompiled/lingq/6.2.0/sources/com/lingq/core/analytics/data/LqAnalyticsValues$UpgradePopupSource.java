package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum LqAnalyticsValues$UpgradePopupSource {
    BlueWordClick("Blue Word Click"),
    Registration("Registration"),
    ImportAfterLimit("Import After Limit"),
    SentenceTranslation("Sentence Translation"),
    HomeScreenButtonClick("Home Screen Button Click"),
    ChallengeSignupPopup("Challenge Signup Popup"),
    PlaylistCreate("Playlist Create"),
    Campaign("Campaign"),
    SettingsButtonClick("Settings Button Click"),
    TranscriptionLimit("Audio Transcription Limit"),
    Chat("Chat Click"),
    Transcribe("Audio Transcription"),
    TranscribePlus("Audio Transcription Plus"),
    ChatMode("AI Chat Response Style"),
    GenerateTTS("Generate TTS"),
    AiVoices("AI Voices"),
    Simplify("Simplify Lessons"),
    PremiumVoices("Premium Voices");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$UpgradePopupSource(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
