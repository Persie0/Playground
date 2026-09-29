package com.lingq.core.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.df4;
import p000.ig8;
import p000.lg8;
import p000.mg8;
import p000.nn1;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.datastore.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1370c implements ig8 {

    /* JADX INFO: renamed from: L */
    public final c83 f18500L;

    /* JADX INFO: renamed from: M */
    public final lg8 f18501M;

    /* JADX INFO: renamed from: N */
    public final lg8 f18502N;

    /* JADX INFO: renamed from: O */
    public final lg8 f18503O;

    /* JADX INFO: renamed from: P */
    public final mg8 f18504P;

    /* JADX INFO: renamed from: Q */
    public final mg8 f18505Q;

    /* JADX INFO: renamed from: R */
    public final mg8 f18506R;

    /* JADX INFO: renamed from: S */
    public final mg8 f18507S;

    /* JADX INFO: renamed from: T */
    public final mg8 f18508T;

    /* JADX INFO: renamed from: U */
    public final lg8 f18509U;

    /* JADX INFO: renamed from: V */
    public final lg8 f18510V;

    /* JADX INFO: renamed from: W */
    public final lg8 f18511W;

    /* JADX INFO: renamed from: X */
    public final lg8 f18512X;

    /* JADX INFO: renamed from: Y */
    public final c83 f18513Y;

    /* JADX INFO: renamed from: Z */
    public final lg8 f18514Z;

    /* JADX INFO: renamed from: a */
    public final df4 f18515a;

    /* JADX INFO: renamed from: a0 */
    public final lg8 f18516a0;

    /* JADX INFO: renamed from: b */
    public final DataStore f18517b;

    /* JADX INFO: renamed from: b0 */
    public final lg8 f18518b0;

    /* JADX INFO: renamed from: c0 */
    public final lg8 f18520c0;

    /* JADX INFO: renamed from: d0 */
    public final lg8 f18522d0;

    /* JADX INFO: renamed from: e0 */
    public final lg8 f18524e0;

    /* JADX INFO: renamed from: f0 */
    public final lg8 f18526f0;

    /* JADX INFO: renamed from: g0 */
    public final lg8 f18528g0;

    /* JADX INFO: renamed from: h0 */
    public final lg8 f18530h0;

    /* JADX INFO: renamed from: i0 */
    public final lg8 f18532i0;

    /* JADX INFO: renamed from: j0 */
    public final lg8 f18534j0;

    /* JADX INFO: renamed from: k0 */
    public final lg8 f18536k0;

    /* JADX INFO: renamed from: l0 */
    public final lg8 f18538l0;

    /* JADX INFO: renamed from: m0 */
    public final lg8 f18540m0;

    /* JADX INFO: renamed from: n0 */
    public final lg8 f18542n0;

    /* JADX INFO: renamed from: o0 */
    public final lg8 f18544o0;

    /* JADX INFO: renamed from: p0 */
    public final lg8 f18546p0;

    /* JADX INFO: renamed from: q0 */
    public final lg8 f18548q0;

    /* JADX INFO: renamed from: r0 */
    public final lg8 f18550r0;

    /* JADX INFO: renamed from: s0 */
    public final c83 f18552s0;

    /* JADX INFO: renamed from: t0 */
    public final c83 f18554t0;

    /* JADX INFO: renamed from: c */
    public final Preferences.Key f18519c = PreferencesKeys.stringKey("preference_activities_shuffle_cards_3");

    /* JADX INFO: renamed from: d */
    public final Preferences.Key f18521d = PreferencesKeys.intKey("preference_activities_cards_per_session_2");

    /* JADX INFO: renamed from: e */
    public final Preferences.Key f18523e = PreferencesKeys.booleanKey("preference_activities_flashcards");

    /* JADX INFO: renamed from: f */
    public final Preferences.Key f18525f = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards");

    /* JADX INFO: renamed from: g */
    public final Preferences.Key f18527g = PreferencesKeys.booleanKey("preference_activities_cloze");

    /* JADX INFO: renamed from: h */
    public final Preferences.Key f18529h = PreferencesKeys.booleanKey("preference_activities_dictation");

    /* JADX INFO: renamed from: i */
    public final Preferences.Key f18531i = PreferencesKeys.booleanKey("preference_activities_multiple_choice");

    /* JADX INFO: renamed from: j */
    public final Preferences.Key f18533j = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_front_term");

    /* JADX INFO: renamed from: k */
    public final Preferences.Key f18535k = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_front_translation");

    /* JADX INFO: renamed from: l */
    public final Preferences.Key f18537l = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_front_phrase");

    /* JADX INFO: renamed from: m */
    public final Preferences.Key f18539m = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_front_status_bar");

    /* JADX INFO: renamed from: n */
    public final Preferences.Key f18541n = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_back_term");

    /* JADX INFO: renamed from: o */
    public final Preferences.Key f18543o = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_back_translation");

    /* JADX INFO: renamed from: p */
    public final Preferences.Key f18545p = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_back_phrase");

    /* JADX INFO: renamed from: q */
    public final Preferences.Key f18547q = PreferencesKeys.booleanKey("preference_activities_flashcards_settings_back_status_bar");

    /* JADX INFO: renamed from: r */
    public final Preferences.Key f18549r = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_front_term");

    /* JADX INFO: renamed from: s */
    public final Preferences.Key f18551s = PreferencesKeys.booleanKey("preference_activities__flashcards_settings_back_note");

    /* JADX INFO: renamed from: t */
    public final Preferences.Key f18553t = PreferencesKeys.booleanKey("preference_activities__flashcards_settings_front_tags");

    /* JADX INFO: renamed from: u */
    public final Preferences.Key f18555u = PreferencesKeys.booleanKey("preference_activities__flashcards_settings_back_tags");

    /* JADX INFO: renamed from: v */
    public final Preferences.Key f18556v = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_front_translation");

    /* JADX INFO: renamed from: w */
    public final Preferences.Key f18557w = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_front_phrase");

    /* JADX INFO: renamed from: x */
    public final Preferences.Key f18558x = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_front_status_bar");

    /* JADX INFO: renamed from: y */
    public final Preferences.Key f18559y = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_term");

    /* JADX INFO: renamed from: z */
    public final Preferences.Key f18560z = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_translation");

    /* JADX INFO: renamed from: A */
    public final Preferences.Key f18489A = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_phrase");

    /* JADX INFO: renamed from: B */
    public final Preferences.Key f18490B = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_status_bar");

    /* JADX INFO: renamed from: C */
    public final Preferences.Key f18491C = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_note");

    /* JADX INFO: renamed from: D */
    public final Preferences.Key f18492D = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_front_tags");

    /* JADX INFO: renamed from: E */
    public final Preferences.Key f18493E = PreferencesKeys.booleanKey("preference_activities_reverse_flashcards_settings_back_tags");

    /* JADX INFO: renamed from: F */
    public final Preferences.Key f18494F = PreferencesKeys.stringKey("preference_activities_transliteration_scripts_2");

    /* JADX INFO: renamed from: G */
    public final Preferences.Key f18495G = PreferencesKeys.booleanKey("preference_activities_unscramble_status");

    /* JADX INFO: renamed from: H */
    public final Preferences.Key f18496H = PreferencesKeys.booleanKey("preference_activities_speaking_status");

    /* JADX INFO: renamed from: I */
    public final Preferences.Key f18497I = PreferencesKeys.booleanKey("preference_activities_macting_status");

    /* JADX INFO: renamed from: J */
    public final Preferences.Key f18498J = PreferencesKeys.stringKey("preference_autoplay_tts_status_2");

    /* JADX INFO: renamed from: K */
    public final Preferences.Key f18499K = PreferencesKeys.stringKey("key_back_status_2");

    public C1370c(df4 df4Var, DataStore dataStore, nn1 nn1Var) {
        this.f18515a = df4Var;
        this.f18517b = dataStore;
        this.f18500L = AbstractC3224d.m15544w(new lg8(dataStore.getData(), this, 10), nn1Var);
        this.f18501M = new lg8(dataStore.getData(), this, 21);
        this.f18502N = new lg8(dataStore.getData(), this, 28);
        this.f18503O = new lg8(dataStore.getData(), this, 29);
        int i = 0;
        this.f18504P = new mg8(dataStore.getData(), this, i);
        int i2 = 1;
        this.f18505Q = new mg8(dataStore.getData(), this, i2);
        int i3 = 2;
        this.f18506R = new mg8(dataStore.getData(), this, i3);
        int i4 = 3;
        this.f18507S = new mg8(dataStore.getData(), this, i4);
        int i5 = 4;
        this.f18508T = new mg8(dataStore.getData(), this, i5);
        this.f18509U = new lg8(dataStore.getData(), this, i);
        this.f18510V = new lg8(dataStore.getData(), this, i2);
        this.f18511W = new lg8(dataStore.getData(), this, i3);
        this.f18512X = new lg8(dataStore.getData(), this, i4);
        this.f18513Y = AbstractC3224d.m15544w(new lg8(dataStore.getData(), this, i5), nn1Var);
        this.f18514Z = new lg8(dataStore.getData(), this, 5);
        this.f18516a0 = new lg8(dataStore.getData(), this, 6);
        this.f18518b0 = new lg8(dataStore.getData(), this, 7);
        this.f18520c0 = new lg8(dataStore.getData(), this, 8);
        this.f18522d0 = new lg8(dataStore.getData(), this, 9);
        this.f18524e0 = new lg8(dataStore.getData(), this, 11);
        this.f18526f0 = new lg8(dataStore.getData(), this, 12);
        this.f18528g0 = new lg8(dataStore.getData(), this, 13);
        this.f18530h0 = new lg8(dataStore.getData(), this, 14);
        this.f18532i0 = new lg8(dataStore.getData(), this, 15);
        this.f18534j0 = new lg8(dataStore.getData(), this, 16);
        this.f18536k0 = new lg8(dataStore.getData(), this, 17);
        this.f18538l0 = new lg8(dataStore.getData(), this, 18);
        this.f18540m0 = new lg8(dataStore.getData(), this, 19);
        this.f18542n0 = new lg8(dataStore.getData(), this, 20);
        this.f18544o0 = new lg8(dataStore.getData(), this, 22);
        this.f18546p0 = new lg8(dataStore.getData(), this, 23);
        this.f18548q0 = new lg8(dataStore.getData(), this, 24);
        this.f18550r0 = new lg8(dataStore.getData(), this, 25);
        this.f18552s0 = AbstractC3224d.m15544w(new lg8(dataStore.getData(), this, 26), nn1Var);
        this.f18554t0 = AbstractC3224d.m15544w(new lg8(dataStore.getData(), this, 27), nn1Var);
    }

    /* JADX INFO: renamed from: A */
    public final Object m7926A(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseFrontTagsActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: B */
    public final Object m7927B(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseFrontTermActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: C */
    public final Object m7928C(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseFrontTranslationActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: D */
    public final Object m7929D(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsMatchingActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: E */
    public final Object m7930E(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsMultiChoiceActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: F */
    public final Object m7931F(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsSpeakingActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: G */
    public final Object m7932G(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsUnscrambleActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: H */
    public final Object m7933H(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setShouldShuffleCards$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: I */
    public final Object m7934I(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setTransliterationScripts$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7935a(int i, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setActivitiesCardsPerSession$2(this, i, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m7936b(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setAutoplayTTSActive$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7937c(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setBackStatus$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m7938d(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsClozeActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m7939e(boolean z, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsDictationActive$2(this, z, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m7940f(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m7941g(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackNoteActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7942h(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackPhraseActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m7943i(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackStatusActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7944j(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackTagsActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m7945k(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackTermActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m7946l(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardBackTranslationActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m7947m(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardFrontPhraseActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    public final Object m7948n(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardFrontStatusActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    public final Object m7949o(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardFrontTagsActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    public final Object m7950p(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardFrontTermActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    public final Object m7951q(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardFrontTranslationActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    public final Object m7952r(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    public final Object m7953s(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackNoteActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    public final Object m7954t(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackPhraseActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    public final Object m7955u(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackStatusActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: v */
    public final Object m7956v(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackTagsActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: w */
    public final Object m7957w(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackTermActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: x */
    public final Object m7958x(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseBackTranslationActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: y */
    public final Object m7959y(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseFrontPhraseActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: z */
    public final Object m7960z(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18517b, new ReviewStoreImpl$setIsFlashCardReverseFrontStatusActive$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }
}
