package com.lingq.core.settings;

import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bda;
import p000.c32;
import p000.cma;
import p000.dj3;
import p000.e29;
import p000.gm5;
import p000.gx8;
import p000.o19;
import p000.q19;
import p000.tz7;
import p000.v7b;
import p000.vz1;
import p000.w08;
import p000.xfa;
import p000.z19;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$_lessonSettings$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$_lessonSettings$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ w08 f22573a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ v7b f22574b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ bda f22575c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ gx8 f22576d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f22577e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1859b f22578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$_lessonSettings$1(C1859b c1859b, Continuation continuation) {
        super(6, continuation);
        this.f22578f = c1859b;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        ReaderSettingsViewModel$_lessonSettings$1 readerSettingsViewModel$_lessonSettings$1 = new ReaderSettingsViewModel$_lessonSettings$1(this.f22578f, (Continuation) obj6);
        readerSettingsViewModel$_lessonSettings$1.f22573a = (w08) obj;
        readerSettingsViewModel$_lessonSettings$1.f22574b = (v7b) obj2;
        readerSettingsViewModel$_lessonSettings$1.f22575c = (bda) obj3;
        readerSettingsViewModel$_lessonSettings$1.f22576d = (gx8) obj4;
        readerSettingsViewModel$_lessonSettings$1.f22577e = zBooleanValue;
        return readerSettingsViewModel$_lessonSettings$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        String str;
        String str2;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        w08 w08Var = this.f22573a;
        v7b v7bVar = this.f22574b;
        bda bdaVar = this.f22575c;
        gx8 gx8Var = this.f22576d;
        boolean z = this.f22577e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        cma cmaVar = this.f22578f.f22720b;
        ListBuilder listBuilderM23650t = vz1.m23650t();
        listBuilderM23650t.add(new o19(R$string.settings_text_to_speech));
        listBuilderM23650t.add(new z19(R$string.settings_autoplay_tts, null, bdaVar.f8394a, ViewKeys.AutoPlayTextToSpeech, false));
        q19 q19Var = q19.f57132a;
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_stop_audio_to_play_tts, null, bdaVar.f8395b, ViewKeys.StopAudioToPlayTTS, false));
        Map map = bdaVar.f8397d;
        if (map != null) {
            listBuilderM23650t.add(q19Var);
            int i2 = R$string.texts_voice;
            ViewKeys viewKeys = ViewKeys.TTSVoice;
            if (bdaVar.f8396c) {
                String str3 = bdaVar.f8398e;
                if (str3 == null) {
                    str2 = (String) map.get(cmaVar.mo4589b2());
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str2;
                } else {
                    str = str3;
                }
            } else {
                Map map2 = bdaVar.f8399f;
                if (map2 == null || (localTextToSpeechVoice = (LocalTextToSpeechVoice) map2.get(cmaVar.mo4589b2())) == null) {
                    str = null;
                } else {
                    str2 = localTextToSpeechVoice.f19562b;
                    str = str2;
                }
            }
            listBuilderM23650t.add(new e29(i2, null, viewKeys, str, null, 104));
        }
        listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.lingq_vocabulary));
        listBuilderM23650t.add(new z19(R$string.settings_paging_moves_known, null, v7bVar.f64992a, ViewKeys.PagesMovesToKnown, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_autocreate_lingqs, null, v7bVar.f64993b, ViewKeys.AutoCreateLingQs, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_cwt, null, v7bVar.f64994c, ViewKeys.CwtMeanings, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_merge_meanings, null, v7bVar.f64995d, ViewKeys.MergeMeanings, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_auto_grammar_tagging, null, v7bVar.f64996e, ViewKeys.AutoGrammarTagging, false));
        listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.settings_reading));
        int i3 = com.lingq.core.p012ui.R$string.upgrade_sentence_translations;
        boolean z2 = w08Var.f66182a;
        AudioUnderlineMode audioUnderlineMode = w08Var.f66186e;
        listBuilderM23650t.add(new z19(i3, null, z2, ViewKeys.SentenceTranslation, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.settings_reader_tap_page, null, w08Var.f66183b, ViewKeys.TapToPage, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.popup_always_show_status, null, w08Var.f66184c, ViewKeys.StatusBar, false));
        listBuilderM23650t.add(q19Var);
        int i4 = com.lingq.core.p012ui.R$string.settings_audio_underline;
        int i5 = tz7.f63148b[audioUnderlineMode.ordinal()];
        if (i5 == 1) {
            i = com.lingq.core.p012ui.R$string.settings_audio_underline_none;
        } else if (i5 == 2) {
            i = com.lingq.core.p012ui.R$string.settings_audio_underline_by_sentence;
        } else {
            if (i5 != 3) {
                gm5.m12750e();
                return null;
            }
            i = com.lingq.core.p012ui.R$string.settings_audio_underline_real_time;
        }
        listBuilderM23650t.add(new e29(i4, Integer.valueOf(i), ViewKeys.AudioUnderline, null, String.valueOf(audioUnderlineMode.getValue()), 88));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(com.lingq.core.p012ui.R$string.lesson_show_vocabulary, null, w08Var.f66185d, ViewKeys.ShowVocabulary, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.phrases_related_setting, Integer.valueOf(R$string.phrases_related_setting_desc), v7bVar.f64997f, ViewKeys.ShowRelatedPhrasesHighlight, false));
        listBuilderM23650t.add(new o19(R$string.settings_sentence_view));
        listBuilderM23650t.add(new z19(R$string.settings_autoplay_tts, null, gx8Var.f41505a, ViewKeys.SentenceAutoPlayTts, false));
        listBuilderM23650t.add(q19Var);
        listBuilderM23650t.add(new z19(R$string.settings_sentence_auto_show_translation, null, gx8Var.f41506b, ViewKeys.SentenceAutoShowTranslation, false));
        listBuilderM23650t.add(new o19(com.lingq.core.p012ui.R$string.settings_text_general));
        listBuilderM23650t.add(new z19(R$string.settings_reader_streak_milestones, null, z, ViewKeys.StreakMilestonesShow, false));
        return vz1.m23635i(listBuilderM23650t);
    }
}
