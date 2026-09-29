package com.lingq.core.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.df4;
import p000.je5;
import p000.nn1;
import p000.rz0;
import p000.si7;
import p000.sk9;
import p000.vi7;
import p000.wi7;
import p000.xfa;
import p000.xv7;
import p000.yi7;

/* JADX INFO: renamed from: com.lingq.core.datastore.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1368a implements si7 {

    /* JADX INFO: renamed from: A0 */
    public final wi7 f18323A0;

    /* JADX INFO: renamed from: A1 */
    public final wi7 f18324A1;

    /* JADX INFO: renamed from: B0 */
    public final wi7 f18326B0;

    /* JADX INFO: renamed from: B1 */
    public final wi7 f18327B1;

    /* JADX INFO: renamed from: C0 */
    public final yi7 f18329C0;

    /* JADX INFO: renamed from: C1 */
    public final c83 f18330C1;

    /* JADX INFO: renamed from: D0 */
    public final yi7 f18332D0;

    /* JADX INFO: renamed from: D1 */
    public final wi7 f18333D1;

    /* JADX INFO: renamed from: E0 */
    public final yi7 f18335E0;

    /* JADX INFO: renamed from: E1 */
    public final wi7 f18336E1;

    /* JADX INFO: renamed from: F0 */
    public final yi7 f18338F0;

    /* JADX INFO: renamed from: F1 */
    public final wi7 f18339F1;

    /* JADX INFO: renamed from: G0 */
    public final vi7 f18341G0;

    /* JADX INFO: renamed from: G1 */
    public final wi7 f18342G1;

    /* JADX INFO: renamed from: H0 */
    public final c83 f18344H0;

    /* JADX INFO: renamed from: H1 */
    public final wi7 f18345H1;

    /* JADX INFO: renamed from: I0 */
    public final vi7 f18347I0;

    /* JADX INFO: renamed from: I1 */
    public final wi7 f18348I1;

    /* JADX INFO: renamed from: J0 */
    public final vi7 f18350J0;

    /* JADX INFO: renamed from: J1 */
    public final yi7 f18351J1;

    /* JADX INFO: renamed from: K0 */
    public final vi7 f18353K0;

    /* JADX INFO: renamed from: K1 */
    public final yi7 f18354K1;

    /* JADX INFO: renamed from: L0 */
    public final vi7 f18356L0;

    /* JADX INFO: renamed from: L1 */
    public final yi7 f18357L1;

    /* JADX INFO: renamed from: M0 */
    public final vi7 f18359M0;

    /* JADX INFO: renamed from: M1 */
    public final yi7 f18360M1;

    /* JADX INFO: renamed from: N0 */
    public final vi7 f18362N0;

    /* JADX INFO: renamed from: N1 */
    public final yi7 f18363N1;

    /* JADX INFO: renamed from: O0 */
    public final vi7 f18365O0;

    /* JADX INFO: renamed from: O1 */
    public final yi7 f18366O1;

    /* JADX INFO: renamed from: P0 */
    public final vi7 f18368P0;

    /* JADX INFO: renamed from: P1 */
    public final yi7 f18369P1;

    /* JADX INFO: renamed from: Q0 */
    public final vi7 f18371Q0;

    /* JADX INFO: renamed from: R0 */
    public final c83 f18373R0;

    /* JADX INFO: renamed from: S0 */
    public final c83 f18375S0;

    /* JADX INFO: renamed from: T0 */
    public final c83 f18377T0;

    /* JADX INFO: renamed from: U0 */
    public final c83 f18379U0;

    /* JADX INFO: renamed from: V0 */
    public final vi7 f18381V0;

    /* JADX INFO: renamed from: W0 */
    public final vi7 f18383W0;

    /* JADX INFO: renamed from: X0 */
    public final vi7 f18385X0;

    /* JADX INFO: renamed from: Y0 */
    public final vi7 f18387Y0;

    /* JADX INFO: renamed from: Z0 */
    public final vi7 f18389Z0;

    /* JADX INFO: renamed from: a */
    public final df4 f18390a;

    /* JADX INFO: renamed from: a1 */
    public final vi7 f18392a1;

    /* JADX INFO: renamed from: b */
    public final DataStore f18393b;

    /* JADX INFO: renamed from: b1 */
    public final vi7 f18395b1;

    /* JADX INFO: renamed from: c1 */
    public final vi7 f18398c1;

    /* JADX INFO: renamed from: d1 */
    public final vi7 f18401d1;

    /* JADX INFO: renamed from: e0 */
    public final Preferences.Key f18403e0;

    /* JADX INFO: renamed from: e1 */
    public final vi7 f18404e1;

    /* JADX INFO: renamed from: f0 */
    public final Preferences.Key f18406f0;

    /* JADX INFO: renamed from: f1 */
    public final c83 f18407f1;

    /* JADX INFO: renamed from: g0 */
    public final Preferences.Key f18409g0;

    /* JADX INFO: renamed from: g1 */
    public final vi7 f18410g1;

    /* JADX INFO: renamed from: h0 */
    public final Preferences.Key f18412h0;

    /* JADX INFO: renamed from: h1 */
    public final vi7 f18413h1;

    /* JADX INFO: renamed from: i0 */
    public final Preferences.Key f18415i0;

    /* JADX INFO: renamed from: i1 */
    public final wi7 f18416i1;

    /* JADX INFO: renamed from: j0 */
    public final Preferences.Key f18418j0;

    /* JADX INFO: renamed from: j1 */
    public final wi7 f18419j1;

    /* JADX INFO: renamed from: k0 */
    public final Preferences.Key f18421k0;

    /* JADX INFO: renamed from: k1 */
    public final wi7 f18422k1;

    /* JADX INFO: renamed from: l0 */
    public final Preferences.Key f18424l0;

    /* JADX INFO: renamed from: l1 */
    public final wi7 f18425l1;

    /* JADX INFO: renamed from: m0 */
    public final Preferences.Key f18427m0;

    /* JADX INFO: renamed from: m1 */
    public final wi7 f18428m1;

    /* JADX INFO: renamed from: n0 */
    public final Preferences.Key f18430n0;

    /* JADX INFO: renamed from: n1 */
    public final wi7 f18431n1;

    /* JADX INFO: renamed from: o0 */
    public final Preferences.Key f18433o0;

    /* JADX INFO: renamed from: o1 */
    public final wi7 f18434o1;

    /* JADX INFO: renamed from: p0 */
    public final Preferences.Key f18436p0;

    /* JADX INFO: renamed from: p1 */
    public final wi7 f18437p1;

    /* JADX INFO: renamed from: q0 */
    public final Preferences.Key f18439q0;

    /* JADX INFO: renamed from: q1 */
    public final wi7 f18440q1;

    /* JADX INFO: renamed from: r0 */
    public final Preferences.Key f18442r0;

    /* JADX INFO: renamed from: r1 */
    public final wi7 f18443r1;

    /* JADX INFO: renamed from: s0 */
    public final Preferences.Key f18445s0;

    /* JADX INFO: renamed from: s1 */
    public final wi7 f18446s1;

    /* JADX INFO: renamed from: t0 */
    public final Preferences.Key f18448t0;

    /* JADX INFO: renamed from: t1 */
    public final wi7 f18449t1;

    /* JADX INFO: renamed from: u0 */
    public final Preferences.Key f18451u0;

    /* JADX INFO: renamed from: u1 */
    public final wi7 f18452u1;

    /* JADX INFO: renamed from: v0 */
    public final Preferences.Key f18454v0;

    /* JADX INFO: renamed from: v1 */
    public final wi7 f18455v1;

    /* JADX INFO: renamed from: w0 */
    public final Preferences.Key f18457w0;

    /* JADX INFO: renamed from: w1 */
    public final c83 f18458w1;

    /* JADX INFO: renamed from: x0 */
    public final vi7 f18460x0;

    /* JADX INFO: renamed from: x1 */
    public final wi7 f18461x1;

    /* JADX INFO: renamed from: y0 */
    public final vi7 f18463y0;

    /* JADX INFO: renamed from: y1 */
    public final wi7 f18464y1;

    /* JADX INFO: renamed from: z0 */
    public final c83 f18466z0;

    /* JADX INFO: renamed from: z1 */
    public final wi7 f18467z1;

    /* JADX INFO: renamed from: c */
    public final Preferences.Key f18396c = PreferencesKeys.stringKey("theme");

    /* JADX INFO: renamed from: d */
    public final Preferences.Key f18399d = PreferencesKeys.stringKey("reader_theme");

    /* JADX INFO: renamed from: e */
    public final Preferences.Key f18402e = PreferencesKeys.stringKey("lesson_font_preference_3");

    /* JADX INFO: renamed from: f */
    public final Preferences.Key f18405f = PreferencesKeys.stringKey("text_highlight_style");

    /* JADX INFO: renamed from: g */
    public final Preferences.Key f18408g = PreferencesKeys.stringKey("text_highlight_color");

    /* JADX INFO: renamed from: h */
    public final Preferences.Key f18411h = PreferencesKeys.intKey("karaoke_text_size_preference");

    /* JADX INFO: renamed from: i */
    public final Preferences.Key f18414i = rz0.f60061a;

    /* JADX INFO: renamed from: j */
    public final Preferences.Key f18417j = PreferencesKeys.stringKey("chat_font_preference");

    /* JADX INFO: renamed from: k */
    public final Preferences.Key f18420k = rz0.f60063c;

    /* JADX INFO: renamed from: l */
    public final Preferences.Key f18423l = rz0.f60064d;

    /* JADX INFO: renamed from: m */
    public final Preferences.Key f18426m = PreferencesKeys.booleanKey("known_words_preference");

    /* JADX INFO: renamed from: n */
    public final Preferences.Key f18429n = PreferencesKeys.stringKey("interface_language");

    /* JADX INFO: renamed from: o */
    public final Preferences.Key f18432o = PreferencesKeys.booleanKey("download_mobile");

    /* JADX INFO: renamed from: p */
    public final Preferences.Key f18435p = PreferencesKeys.booleanKey("auto_tts_preference");

    /* JADX INFO: renamed from: q */
    public final Preferences.Key f18438q = PreferencesKeys.booleanKey("use_device_tts_preference");

    /* JADX INFO: renamed from: r */
    public final Preferences.Key f18441r = PreferencesKeys.booleanKey("use_web_voices_preference");

    /* JADX INFO: renamed from: s */
    public final Preferences.Key f18444s = PreferencesKeys.stringKey("tts_voice");

    /* JADX INFO: renamed from: t */
    public final Preferences.Key f18447t = PreferencesKeys.stringKey("tts_voice_name");

    /* JADX INFO: renamed from: u */
    public final Preferences.Key f18450u = PreferencesKeys.booleanKey("tts_voices_migrated_to_api");

    /* JADX INFO: renamed from: v */
    public final Preferences.Key f18453v = PreferencesKeys.stringSetKey("tts_voice_dirty_languages");

    /* JADX INFO: renamed from: w */
    public final Preferences.Key f18456w = PreferencesKeys.stringKey("local_tts_voice");

    /* JADX INFO: renamed from: x */
    public final Preferences.Key f18459x = PreferencesKeys.booleanKey("auto_lingq_creation");

    /* JADX INFO: renamed from: y */
    public final Preferences.Key f18462y = PreferencesKeys.booleanKey("status_bar_preference");

    /* JADX INFO: renamed from: z */
    public final Preferences.Key f18465z = PreferencesKeys.intKey("text_size_preference_2");

    /* JADX INFO: renamed from: A */
    public final Preferences.Key f18322A = rz0.f60062b;

    /* JADX INFO: renamed from: B */
    public final Preferences.Key f18325B = PreferencesKeys.booleanKey("reader_sentence_translation_preference");

    /* JADX INFO: renamed from: C */
    public final Preferences.Key f18328C = PreferencesKeys.stringKey("asian_chinese_type_preference");

    /* JADX INFO: renamed from: D */
    public final Preferences.Key f18331D = PreferencesKeys.stringKey("asian_japanese_type_preference");

    /* JADX INFO: renamed from: E */
    public final Preferences.Key f18334E = PreferencesKeys.stringKey("asian_chinese_traditional_type_preference");

    /* JADX INFO: renamed from: F */
    public final Preferences.Key f18337F = PreferencesKeys.stringKey("asian_cantonese_type_preference");

    /* JADX INFO: renamed from: G */
    public final Preferences.Key f18340G = PreferencesKeys.stringKey("latin_type_preference");

    /* JADX INFO: renamed from: H */
    public final Preferences.Key f18343H = PreferencesKeys.booleanKey("asian_show_spaces_preference");

    /* JADX INFO: renamed from: I */
    public final Preferences.Key f18346I = PreferencesKeys.booleanKey("disableDownloadsPlaylist");

    /* JADX INFO: renamed from: J */
    public final Preferences.Key f18349J = PreferencesKeys.stringKey("languageFeedLevels");

    /* JADX INFO: renamed from: K */
    public final Preferences.Key f18352K = PreferencesKeys.booleanKey("tapToPage_preference");

    /* JADX INFO: renamed from: L */
    public final Preferences.Key f18355L = PreferencesKeys.booleanKey("showStreakMilestones_preference");

    /* JADX INFO: renamed from: M */
    public final Preferences.Key f18358M = PreferencesKeys.stringSetKey("topics_preference");

    /* JADX INFO: renamed from: N */
    public final Preferences.Key f18361N = PreferencesKeys.booleanKey("showVocabulary_preference");

    /* JADX INFO: renamed from: O */
    public final Preferences.Key f18364O = PreferencesKeys.booleanKey("autoGrammarTagging_preference");

    /* JADX INFO: renamed from: P */
    public final Preferences.Key f18367P = PreferencesKeys.floatKey("playbackSpeed_preference_2");

    /* JADX INFO: renamed from: Q */
    public final Preferences.Key f18370Q = PreferencesKeys.floatKey("sentencePlaybackSpeed_preference");

    /* JADX INFO: renamed from: R */
    public final Preferences.Key f18372R = PreferencesKeys.floatKey("videoPlaybackSpeed_preference");

    /* JADX INFO: renamed from: S */
    public final Preferences.Key f18374S = PreferencesKeys.booleanKey("transliterationStatus_preference");

    /* JADX INFO: renamed from: T */
    public final Preferences.Key f18376T = PreferencesKeys.booleanKey("showRelatedPhraseHighlight_preference");

    /* JADX INFO: renamed from: U */
    public final Preferences.Key f18378U = PreferencesKeys.stringKey("token_asian_chinese_type_preference");

    /* JADX INFO: renamed from: V */
    public final Preferences.Key f18380V = PreferencesKeys.stringKey("token_asian_japanese_type_preference");

    /* JADX INFO: renamed from: W */
    public final Preferences.Key f18382W = PreferencesKeys.stringKey("token_asian_chinese_traditional_type_preference");

    /* JADX INFO: renamed from: X */
    public final Preferences.Key f18384X = PreferencesKeys.stringKey("token_asian_cantonese_type_preference");

    /* JADX INFO: renamed from: Y */
    public final Preferences.Key f18386Y = PreferencesKeys.stringKey("token_latin_type_preference");

    /* JADX INFO: renamed from: Z */
    public final Preferences.Key f18388Z = PreferencesKeys.booleanKey("audio_underline_preference");

    /* JADX INFO: renamed from: a0 */
    public final Preferences.Key f18391a0 = PreferencesKeys.intKey("audio_underline_mode_preference");

    /* JADX INFO: renamed from: b0 */
    public final Preferences.Key f18394b0 = PreferencesKeys.booleanKey("showTimezoneAlert_preference");

    /* JADX INFO: renamed from: c0 */
    public final Preferences.Key f18397c0 = PreferencesKeys.stringKey("beta_language_warning_preference");

    /* JADX INFO: renamed from: d0 */
    public final Preferences.Key f18400d0 = PreferencesKeys.booleanKey("seen_streak_challenge");

    public C1368a(df4 df4Var, DataStore dataStore, nn1 nn1Var) {
        this.f18390a = df4Var;
        this.f18393b = dataStore;
        PreferencesKeys.booleanKey("optimize_word_splitting");
        this.f18403e0 = PreferencesKeys.booleanKey("stop_audio_to_play_tts");
        this.f18406f0 = PreferencesKeys.booleanKey("secondary_meanings_preference");
        this.f18409g0 = PreferencesKeys.booleanKey("cwt_preference");
        this.f18412h0 = PreferencesKeys.stringKey("default_shelf_tab");
        this.f18415i0 = PreferencesKeys.stringKey("chat_mode");
        this.f18418j0 = PreferencesKeys.booleanKey("chat_autoplay_tts");
        this.f18421k0 = PreferencesKeys.booleanKey("chat_memory_enabled");
        this.f18424l0 = PreferencesKeys.booleanKey("chat_data_improvement_opt_in");
        this.f18427m0 = PreferencesKeys.booleanKey("chat_auto_open_translation");
        this.f18430n0 = PreferencesKeys.booleanKey("dock_token_popup");
        this.f18433o0 = PreferencesKeys.stringKey("reader_page_view_mode");
        PreferencesKeys.booleanKey("use_compose_reader");
        this.f18436p0 = PreferencesKeys.stringKey("last_import_language");
        this.f18439q0 = PreferencesKeys.stringKey("last_import_course");
        this.f18442r0 = PreferencesKeys.stringKey("last_import_level");
        this.f18445s0 = PreferencesKeys.stringSetKey("last_import_tags");
        this.f18448t0 = PreferencesKeys.booleanKey("auto_open_after_import");
        this.f18451u0 = PreferencesKeys.stringKey("server_environment");
        this.f18454v0 = PreferencesKeys.booleanKey("sentence_auto_play_tts");
        this.f18457w0 = PreferencesKeys.booleanKey("sentence_auto_show_translation");
        int i = 10;
        this.f18460x0 = new vi7(dataStore.getData(), this, i);
        this.f18463y0 = new vi7(dataStore.getData(), this, 21);
        int i2 = 2;
        this.f18466z0 = AbstractC3224d.m15544w(new wi7(dataStore.getData(), this, i2), nn1Var);
        int i3 = 13;
        this.f18323A0 = new wi7(dataStore.getData(), this, i3);
        int i4 = 24;
        this.f18326B0 = new wi7(dataStore.getData(), this, i4);
        int i5 = 5;
        this.f18329C0 = new yi7(dataStore.getData(), this, i5);
        int i6 = 8;
        this.f18332D0 = new yi7(dataStore.getData(), this, i6);
        int i7 = 9;
        this.f18335E0 = new yi7(dataStore.getData(), this, i7);
        this.f18338F0 = new yi7(dataStore.getData(), this, i);
        int i8 = 0;
        this.f18341G0 = new vi7(dataStore.getData(), this, i8);
        int i9 = 1;
        this.f18344H0 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, i9), nn1Var);
        this.f18347I0 = new vi7(dataStore.getData(), this, i2);
        int i10 = 3;
        this.f18350J0 = new vi7(dataStore.getData(), this, i10);
        int i11 = 4;
        this.f18353K0 = new vi7(dataStore.getData(), this, i11);
        this.f18356L0 = new vi7(dataStore.getData(), this, i5);
        int i12 = 6;
        this.f18359M0 = new vi7(dataStore.getData(), this, i12);
        int i13 = 7;
        this.f18362N0 = new vi7(dataStore.getData(), this, i13);
        this.f18365O0 = new vi7(dataStore.getData(), this, i6);
        this.f18368P0 = new vi7(dataStore.getData(), this, i7);
        this.f18371Q0 = new vi7(dataStore.getData(), this, 11);
        int i14 = 12;
        this.f18373R0 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, i14), nn1Var);
        this.f18375S0 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, i3), nn1Var);
        this.f18377T0 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, 14), nn1Var);
        this.f18379U0 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, 15), nn1Var);
        this.f18381V0 = new vi7(dataStore.getData(), this, 16);
        this.f18383W0 = new vi7(dataStore.getData(), this, 17);
        this.f18385X0 = new vi7(dataStore.getData(), this, 18);
        this.f18387Y0 = new vi7(dataStore.getData(), this, 19);
        this.f18389Z0 = new vi7(dataStore.getData(), this, 20);
        this.f18392a1 = new vi7(dataStore.getData(), this, 22);
        this.f18395b1 = new vi7(dataStore.getData(), this, 23);
        this.f18398c1 = new vi7(dataStore.getData(), this, i4);
        this.f18401d1 = new vi7(dataStore.getData(), this, 25);
        this.f18404e1 = new vi7(dataStore.getData(), this, 26);
        this.f18407f1 = AbstractC3224d.m15544w(new vi7(dataStore.getData(), this, 27), nn1Var);
        this.f18410g1 = new vi7(dataStore.getData(), this, 28);
        this.f18413h1 = new vi7(dataStore.getData(), this, 29);
        this.f18416i1 = new wi7(dataStore.getData(), this, i8);
        this.f18419j1 = new wi7(dataStore.getData(), this, i9);
        this.f18422k1 = new wi7(dataStore.getData(), this, i10);
        this.f18425l1 = new wi7(dataStore.getData(), this, i11);
        this.f18428m1 = new wi7(dataStore.getData(), this, i5);
        this.f18431n1 = new wi7(dataStore.getData(), this, i12);
        this.f18434o1 = new wi7(dataStore.getData(), this, i13);
        this.f18437p1 = new wi7(dataStore.getData(), this, i6);
        this.f18440q1 = new wi7(dataStore.getData(), this, 9);
        this.f18443r1 = new wi7(dataStore.getData(), this, 10);
        this.f18446s1 = new wi7(dataStore.getData(), this, 11);
        this.f18449t1 = new wi7(dataStore.getData(), this, i14);
        this.f18452u1 = new wi7(dataStore.getData(), this, 14);
        this.f18455v1 = new wi7(dataStore.getData(), this, 15);
        this.f18458w1 = AbstractC3224d.m15544w(new wi7(dataStore.getData(), this, 16), nn1Var);
        this.f18461x1 = new wi7(dataStore.getData(), this, 17);
        this.f18464y1 = new wi7(dataStore.getData(), this, 18);
        this.f18467z1 = new wi7(dataStore.getData(), this, 19);
        this.f18324A1 = new wi7(dataStore.getData(), this, 20);
        this.f18327B1 = new wi7(dataStore.getData(), this, 21);
        this.f18330C1 = AbstractC3224d.m15544w(new wi7(dataStore.getData(), this, 22), nn1Var);
        this.f18333D1 = new wi7(dataStore.getData(), this, 23);
        this.f18336E1 = new wi7(dataStore.getData(), this, 25);
        this.f18339F1 = new wi7(dataStore.getData(), this, 26);
        this.f18342G1 = new wi7(dataStore.getData(), this, 27);
        this.f18345H1 = new wi7(dataStore.getData(), this, 28);
        this.f18348I1 = new wi7(dataStore.getData(), this, 29);
        this.f18351J1 = new yi7(dataStore.getData(), this, i8);
        this.f18354K1 = new yi7(dataStore.getData(), this, i9);
        this.f18357L1 = new yi7(dataStore.getData(), this, 2);
        this.f18360M1 = new yi7(dataStore.getData(), this, i10);
        this.f18363N1 = new yi7(dataStore.getData(), this, i11);
        this.f18366O1 = new yi7(dataStore.getData(), this, i12);
        this.f18369P1 = new yi7(dataStore.getData(), this, i13);
    }

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m7841a(C1368a c1368a, String str) {
        df4 df4Var = c1368a.f18390a;
        if (str == null) {
            str = "{}";
        }
        sk9 sk9Var = sk9.f60959a;
        Map map = (Map) df4Var.m10321a(str, new je5(sk9Var, sk9Var));
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3194a.m15363P(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            xv7 xv7Var = ReaderFont.Companion;
            String str2 = (String) entry.getValue();
            xv7Var.getClass();
            linkedHashMap.put(key, xv7.m24711b(str2));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: A */
    public final Object m7842A(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setJapaneseScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: B */
    public final Object m7843B(int i, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setKaraokeFontSize$2(this, i, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m7844C(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLanguageFeedLevels$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m7845D(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLastImportCourse$2(this, str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: E */
    public final Object m7846E(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLastImportLanguage$2(this, str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: F */
    public final Object m7847F(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLastImportLevel$2(this, str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: G */
    public final Object m7848G(Set set, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLastImportTags$2(this, set, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: H */
    public final Object m7849H(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLatinScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: I */
    public final Object m7850I(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setLocalTTSVoice$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: J */
    public final Object m7851J(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setMandarinScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: K */
    public final Object m7852K(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setMoveBlueWordsToKnown$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: L */
    public final Object m7853L(float f, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setPlaybackSpeed$2(this, f, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: M */
    public final Object m7854M(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderFont$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: N */
    public final Object m7855N(int i, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderFontSize$2(this, i, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: O */
    public final Object m7856O(double d, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderLineSpacing$2(this, d, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: P */
    public final Object m7857P(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderSentenceTranslation$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: Q */
    public final Object m7858Q(int i, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderTextFontSize$2(this, i, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: R */
    public final Object m7859R(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setReaderTheme$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: S */
    public final Object m7860S(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setSecondaryMeanings$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: T */
    public final Object m7861T(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setSentenceAutoPlayTts$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: U */
    public final Object m7862U(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setSentenceAutoShowTranslation$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: V */
    public final Object m7863V(float f, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setSentencePlaybackSpeed$2(this, f, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: W */
    public final Object m7864W(ServerEnvironment serverEnvironment, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setServerEnvironment$2(this, serverEnvironment, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: X */
    public final Object m7865X(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setShowRelatedPhraseHighlight$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: Y */
    public final Object m7866Y(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setShowSpacesBetweenWords$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: Z */
    public final Object m7867Z(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setShowStreakMilestones$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: a0 */
    public final Object m7868a0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setShowTimezoneAlert$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final c83 m7869b() {
        return this.f18458w1;
    }

    /* JADX INFO: renamed from: b0 */
    public final Object m7870b0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setShowVocabulary$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final vi7 m7871c() {
        return this.f18463y0;
    }

    /* JADX INFO: renamed from: c0 */
    public final Object m7872c0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setStatusBar$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m7873d(AudioUnderlineMode audioUnderlineMode, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setAudioUnderlineMode$2(this, audioUnderlineMode, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d0 */
    public final Object m7874d0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setStopAudioToPlayTTS$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m7875e(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setAutoGrammarTagging$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m7876e0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTapToPage$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m7877f(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setAutoLingQCreation$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m7878f0(String str, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTextHighlightColor$2(this, str, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m7879g(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setAutoOpenAfterImport$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m7880g0(TextHighlightStyle textHighlightStyle, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTextHighlightStyle$2(this, textHighlightStyle, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7881h(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setAutoTTS$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h0 */
    public final Object m7882h0(LqTheme lqTheme, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTheme$2(this, lqTheme, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m7883i(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setBetaLanguageWarning$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i0 */
    public final Object m7884i0(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTokenCantoneseScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7885j(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setCantoneseScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j0 */
    public final Object m7886j0(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTokenChineseTraditionalScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m7887k(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatAutoOpenTranslation$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: k0 */
    public final Object m7888k0(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTokenJapaneseScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m7889l(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatAutoplayTts$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l0 */
    public final Object m7890l0(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTokenLatinScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m7891m(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatDataImprovementOptIn$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: m0 */
    public final Object m7892m0(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTokenMandarinScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    public final Object m7893n(String str, ReaderFont readerFont, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatFont$2(this, str, readerFont, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: n0 */
    public final Object m7894n0(Set set, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTopics$2(this, set, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    public final Object m7895o(int i, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatFontSize$2(this, i, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: o0 */
    public final Object m7896o0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTransliterationStatus$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    public final Object m7897p(double d, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatLineSpacing$2(this, d, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m7898p0(Set set, ContinuationImpl continuationImpl) throws Throwable {
        PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1 preferenceStoreImpl$setTtsVoiceDirtyLanguages$1;
        if (continuationImpl instanceof PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1) {
            preferenceStoreImpl$setTtsVoiceDirtyLanguages$1 = (PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1) continuationImpl;
            int i = preferenceStoreImpl$setTtsVoiceDirtyLanguages$1.f17706c;
            if ((i & Integer.MIN_VALUE) != 0) {
                preferenceStoreImpl$setTtsVoiceDirtyLanguages$1.f17706c = i - Integer.MIN_VALUE;
            } else {
                preferenceStoreImpl$setTtsVoiceDirtyLanguages$1 = new PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1(this, continuationImpl);
            }
        } else {
            preferenceStoreImpl$setTtsVoiceDirtyLanguages$1 = new PreferenceStoreImpl$setTtsVoiceDirtyLanguages$1(this, continuationImpl);
        }
        Object objEdit = preferenceStoreImpl$setTtsVoiceDirtyLanguages$1.f17704a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = preferenceStoreImpl$setTtsVoiceDirtyLanguages$1.f17706c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objEdit);
            PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2 preferenceStoreImpl$setTtsVoiceDirtyLanguages$2 = new PreferenceStoreImpl$setTtsVoiceDirtyLanguages$2(this, set, null);
            preferenceStoreImpl$setTtsVoiceDirtyLanguages$1.f17706c = 1;
            objEdit = PreferencesKt.edit(this.f18393b, preferenceStoreImpl$setTtsVoiceDirtyLanguages$2, preferenceStoreImpl$setTtsVoiceDirtyLanguages$1);
            if (objEdit == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objEdit);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    public final Object m7899q(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatMemoryEnabled$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: q0 */
    public final Object m7900q0(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setTtsVoiceName$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    public final Object m7901r(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChatMode$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r0 */
    public final Object m7902r0(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        PreferenceStoreImpl$setTtsVoicesMigratedToApi$1 preferenceStoreImpl$setTtsVoicesMigratedToApi$1;
        if (continuationImpl instanceof PreferenceStoreImpl$setTtsVoicesMigratedToApi$1) {
            preferenceStoreImpl$setTtsVoicesMigratedToApi$1 = (PreferenceStoreImpl$setTtsVoicesMigratedToApi$1) continuationImpl;
            int i = preferenceStoreImpl$setTtsVoicesMigratedToApi$1.f17715c;
            if ((i & Integer.MIN_VALUE) != 0) {
                preferenceStoreImpl$setTtsVoicesMigratedToApi$1.f17715c = i - Integer.MIN_VALUE;
            } else {
                preferenceStoreImpl$setTtsVoicesMigratedToApi$1 = new PreferenceStoreImpl$setTtsVoicesMigratedToApi$1(this, continuationImpl);
            }
        } else {
            preferenceStoreImpl$setTtsVoicesMigratedToApi$1 = new PreferenceStoreImpl$setTtsVoicesMigratedToApi$1(this, continuationImpl);
        }
        Object objEdit = preferenceStoreImpl$setTtsVoicesMigratedToApi$1.f17713a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = preferenceStoreImpl$setTtsVoicesMigratedToApi$1.f17715c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objEdit);
            PreferenceStoreImpl$setTtsVoicesMigratedToApi$2 preferenceStoreImpl$setTtsVoicesMigratedToApi$2 = new PreferenceStoreImpl$setTtsVoicesMigratedToApi$2(this, z, null);
            preferenceStoreImpl$setTtsVoicesMigratedToApi$1.f17715c = 1;
            objEdit = PreferencesKt.edit(this.f18393b, preferenceStoreImpl$setTtsVoicesMigratedToApi$2, preferenceStoreImpl$setTtsVoicesMigratedToApi$1);
            if (objEdit == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objEdit);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    public final Object m7903s(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setChineseTraditionalScript$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: s0 */
    public final Object m7904s0(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setUseDeviceTts$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    public final Object m7905t(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setCwtMeanings$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: t0 */
    public final Object m7906t0(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setUseWebVoices$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    public final Object m7907u(Map map, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setDefaultShelfTab$2(this, map, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: u0 */
    public final Object m7908u0(float f, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setVideoPlaybackSpeed$2(this, f, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: v */
    public final Object m7909v(boolean z, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setDisableDownloadsPlaylist$2(this, z, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: w */
    public final Object m7910w(boolean z, SuspendLambda suspendLambda) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setDockTokenPopup$2(this, z, null), suspendLambda);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: x */
    public final Object m7911x(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setDownloadOnMobile$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: y */
    public final Object m7912y(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setHasSeenStreakChallenge$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: z */
    public final Object m7913z(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18393b, new PreferenceStoreImpl$setInterfaceLanguage$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }
}
