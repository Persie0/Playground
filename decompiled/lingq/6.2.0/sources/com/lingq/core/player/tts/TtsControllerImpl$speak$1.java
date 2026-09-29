package com.lingq.core.player.tts;

import android.content.Context;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.token.C1487c;
import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ada;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.fa4;
import p000.h0a;
import p000.lda;
import p000.mb1;
import p000.ob1;
import p000.ql4;
import p000.si7;
import p000.sm5;
import p000.u91;
import p000.un1;
import p000.vi7;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$speak$1", m4291f = "TtsController.kt", m4292l = {270, 272, 276, 281, 284, 289, 297, 300, 305}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$speak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Object f22121a;

    /* JADX INFO: renamed from: b */
    public TextToSpeechAppVoice f22122b;

    /* JADX INFO: renamed from: c */
    public int f22123c;

    /* JADX INFO: renamed from: d */
    public int f22124d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1819c f22125e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f22126f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f22127g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f22128h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f22129i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$speak$1(C1819c c1819c, String str, float f, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f22125e = c1819c;
        this.f22126f = str;
        this.f22127g = f;
        this.f22128h = z;
        this.f22129i = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$speak$1(this.f22125e, this.f22126f, this.f22127g, this.f22128h, this.f22129i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$speak$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[PHI: r2 r4
      0x00b6: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v14 java.lang.Object) binds: [B:26:0x00b2, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r4v19 android.speech.tts.Voice) = (r4v12 android.speech.tts.Voice), (r4v22 android.speech.tts.Voice) binds: [B:26:0x00b2, B:11:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0117 A[PHI: r2 r7
      0x0117: PHI (r2v15 java.lang.Object) = (r2v9 java.lang.Object), (r2v20 java.lang.Object) binds: [B:43:0x0113, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:43:0x0113, B:10:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[PHI: r1 r2 r7 r15
      0x01b2: PHI (r1v12 java.lang.Object) = (r1v8 java.lang.Object), (r1v23 java.lang.Object) binds: [B:51:0x01ae, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r2v21 com.lingq.core.domain.model.token.TextToSpeechAppVoice) = 
      (r2v16 com.lingq.core.domain.model.token.TextToSpeechAppVoice)
      (r2v24 com.lingq.core.domain.model.token.TextToSpeechAppVoice)
     binds: [B:51:0x01ae, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:51:0x01ae, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01b2: PHI (r15v4 int) = (r15v3 int), (r15v5 int) binds: [B:51:0x01ae, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
    /* JADX WARN: Code duplicated, block: B:76:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x0266 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x011b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x014b, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        C1819c c1819c;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        String str;
        Voice voiceM8487h;
        Object objM15541t2;
        boolean zBooleanValue;
        int i;
        Object objM7391f;
        TextToSpeechAppVoice textToSpeechAppVoice;
        int i2;
        Object objM2861d;
        TextToSpeechTokenUtterance textToSpeechTokenUtterance;
        String str2;
        int i3;
        String str3;
        C3244l c3244l;
        Object value;
        C1819c c1819c2 = this.f22125e;
        C1307w c1307w = c1819c2.f22167e;
        si7 si7Var = c1819c2.f22169g;
        cma cmaVar = c1819c2.f22170h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.f22124d;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f22129i;
        float f = this.f22127g;
        boolean z2 = this.f22128h;
        String str4 = this.f22126f;
        switch (i4) {
            case 0:
                AbstractC3193b.m15359b(obj);
                c83 c83Var = ((C1368a) si7Var).f18379U0;
                this.f22121a = c1819c2;
                this.f22124d = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, this);
                if (objM15541t != coroutineSingletons) {
                    c1819c = c1819c2;
                    localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM15541t).get(cmaVar.mo4589b2());
                    if (localTextToSpeechVoice != null || (str = localTextToSpeechVoice.f19561a) == null) {
                        str = "";
                    }
                    voiceM8487h = c1819c.m8487h(str);
                    if (voiceM8487h == null) {
                        voiceM8487h = c1819c2.m8488i(cmaVar.mo4589b2());
                    }
                    vi7 vi7Var = ((C1368a) si7Var).f18371Q0;
                    this.f22121a = voiceM8487h;
                    this.f22124d = 2;
                    objM15541t2 = AbstractC3224d.m15541t(vi7Var, this);
                    if (objM15541t2 != coroutineSingletons) {
                        zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                        i = !zBooleanValue ? 1 : 0;
                        if (zBooleanValue && voiceM8487h != null) {
                            sm5.Companion.getClass();
                            h0a.f41641a.mo11430a("TTS speak: Using local voice for language=" + cmaVar + ".activeLanguage()", new Object[0]);
                            this.f22121a = null;
                            this.f22123c = i;
                            this.f22124d = 3;
                            if (c1819c2.m8489j(str4, f, z2, this) != coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            if (!c1819c2.f22181s && z) {
                                TextToSpeech textToSpeech = c1819c2.f22173k;
                                if (textToSpeech != null) {
                                    lda.m16121g(textToSpeech.stop());
                                }
                                c1819c2.f22181s = false;
                                return xfaVar;
                            }
                            String strMo4589b2 = cmaVar.mo4589b2();
                            this.f22121a = null;
                            this.f22123c = i;
                            this.f22124d = 4;
                            objM7391f = c1307w.m7391f(strMo4589b2, this);
                            if (objM7391f != coroutineSingletons) {
                                textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f;
                                if (textToSpeechAppVoice != null) {
                                    sm5.Companion.getClass();
                                    h0a.f41641a.mo11431b("TTS speak: No voice found for language=" + cmaVar + ".activeLanguage(), falling back to local TTS", new Object[0]);
                                    this.f22121a = null;
                                    this.f22122b = null;
                                    this.f22123c = i;
                                    this.f22124d = 5;
                                    if (c1819c2.m8489j(str4, f, z2, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                } else {
                                    String str5 = textToSpeechAppVoice.f19564b;
                                    String str6 = textToSpeechAppVoice.f19563a;
                                    sm5.Companion.getClass();
                                    h0a.f41641a.mo11430a("TTS speak: language=" + cmaVar + ".activeLanguage(), voice=" + str6 + ", appName=" + str5, new Object[0]);
                                    String strMo4589b3 = cmaVar.mo4589b2();
                                    this.f22121a = null;
                                    this.f22122b = textToSpeechAppVoice;
                                    this.f22123c = i;
                                    this.f22124d = 6;
                                    c1307w.getClass();
                                    Locale localeForLanguageTag = Locale.forLanguageTag(strMo4589b3);
                                    C1487c c1487c = TextToSpeechTokenUtterance.Companion;
                                    localeForLanguageTag.getClass();
                                    c1487c.getClass();
                                    i2 = 0;
                                    objM2861d = AbstractC0758a.m2861d(new ql4(C1487c.m8136a(localeForLanguageTag, strMo4589b3, str4, str5, str6), 29), c1307w.f16564b.f71369K, this, true, false);
                                    if (objM2861d != coroutineSingletons) {
                                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                                        if (textToSpeechTokenUtterance != null || (str3 = textToSpeechTokenUtterance.f19567c) == null) {
                                            str2 = null;
                                        } else {
                                            str2 = (String) u91.m22597O0(vk9.m23365A0(str3, new String[]{"/"}, i2, 6));
                                        }
                                        mb1 mb1Var = ob1.Companion;
                                        Context context = c1819c2.f22163a;
                                        mb1Var.getClass();
                                        File file = new File(mb1.m16744d(context) + "/" + str2);
                                        if (textToSpeechTokenUtterance == null && file.exists()) {
                                            if ((!fa4.m11650l(str4, c1819c2.f22180r) || z) && !c1819c2.f22181s) {
                                                Uri uriFromFile = Uri.fromFile(file);
                                                uriFromFile.getClass();
                                                this.f22121a = null;
                                                this.f22122b = null;
                                                this.f22123c = i;
                                                this.f22124d = 7;
                                                if (C1819c.m8479e(c1819c2, uriFromFile, this.f22128h, this.f22127g, this.f22126f, this) == coroutineSingletons) {
                                                }
                                            }
                                            return xfaVar;
                                        }
                                        this.f22121a = null;
                                        this.f22122b = textToSpeechAppVoice;
                                        this.f22123c = i;
                                        this.f22124d = 8;
                                        if (C1819c.m8481g(c1819c2, str4, z2, this) != coroutineSingletons) {
                                            i3 = i;
                                            if (z2) {
                                                c3244l = c1819c2.f22174l;
                                                do {
                                                    value = c3244l.getValue();
                                                } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                                            }
                                            this.f22121a = null;
                                            this.f22122b = null;
                                            this.f22123c = i3;
                                            this.f22124d = 9;
                                            if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                                                return xfaVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                C1819c c1819c3 = (C1819c) this.f22121a;
                AbstractC3193b.m15359b(obj);
                c1819c = c1819c3;
                objM15541t = obj;
                localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM15541t).get(cmaVar.mo4589b2());
                if (localTextToSpeechVoice != null) {
                    str = "";
                } else {
                    str = "";
                }
                voiceM8487h = c1819c.m8487h(str);
                if (voiceM8487h == null) {
                    voiceM8487h = c1819c2.m8488i(cmaVar.mo4589b2());
                }
                vi7 vi7Var2 = ((C1368a) si7Var).f18371Q0;
                this.f22121a = voiceM8487h;
                this.f22124d = 2;
                objM15541t2 = AbstractC3224d.m15541t(vi7Var2, this);
                if (objM15541t2 != coroutineSingletons) {
                    zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                    i = !zBooleanValue ? 1 : 0;
                    if (zBooleanValue) {
                    }
                    if (!c1819c2.f22181s) {
                    }
                    String strMo4589b4 = cmaVar.mo4589b2();
                    this.f22121a = null;
                    this.f22123c = i;
                    this.f22124d = 4;
                    objM7391f = c1307w.m7391f(strMo4589b4, this);
                    if (objM7391f != coroutineSingletons) {
                        textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f;
                        if (textToSpeechAppVoice != null) {
                            sm5.Companion.getClass();
                            h0a.f41641a.mo11431b("TTS speak: No voice found for language=" + cmaVar + ".activeLanguage(), falling back to local TTS", new Object[0]);
                            this.f22121a = null;
                            this.f22122b = null;
                            this.f22123c = i;
                            this.f22124d = 5;
                            if (c1819c2.m8489j(str4, f, z2, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            String str7 = textToSpeechAppVoice.f19564b;
                            String str8 = textToSpeechAppVoice.f19563a;
                            sm5.Companion.getClass();
                            h0a.f41641a.mo11430a("TTS speak: language=" + cmaVar + ".activeLanguage(), voice=" + str8 + ", appName=" + str7, new Object[0]);
                            String strMo4589b5 = cmaVar.mo4589b2();
                            this.f22121a = null;
                            this.f22122b = textToSpeechAppVoice;
                            this.f22123c = i;
                            this.f22124d = 6;
                            c1307w.getClass();
                            Locale localeForLanguageTag2 = Locale.forLanguageTag(strMo4589b5);
                            C1487c c1487c2 = TextToSpeechTokenUtterance.Companion;
                            localeForLanguageTag2.getClass();
                            c1487c2.getClass();
                            i2 = 0;
                            objM2861d = AbstractC0758a.m2861d(new ql4(C1487c.m8136a(localeForLanguageTag2, strMo4589b5, str4, str7, str8), 29), c1307w.f16564b.f71369K, this, true, false);
                            if (objM2861d != coroutineSingletons) {
                                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                                if (textToSpeechTokenUtterance != null) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                }
                                mb1 mb1Var2 = ob1.Companion;
                                Context context2 = c1819c2.f22163a;
                                mb1Var2.getClass();
                                File file2 = new File(mb1.m16744d(context2) + "/" + str2);
                                if (textToSpeechTokenUtterance == null) {
                                }
                                this.f22121a = null;
                                this.f22122b = textToSpeechAppVoice;
                                this.f22123c = i;
                                this.f22124d = 8;
                                if (C1819c.m8481g(c1819c2, str4, z2, this) != coroutineSingletons) {
                                    i3 = i;
                                    if (z2) {
                                        c3244l = c1819c2.f22174l;
                                        do {
                                            value = c3244l.getValue();
                                        } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                                    }
                                    this.f22121a = null;
                                    this.f22122b = null;
                                    this.f22123c = i3;
                                    this.f22124d = 9;
                                    if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                Voice voice = (Voice) this.f22121a;
                AbstractC3193b.m15359b(obj);
                voiceM8487h = voice;
                objM15541t2 = obj;
                zBooleanValue = ((Boolean) objM15541t2).booleanValue();
                i = !zBooleanValue ? 1 : 0;
                if (zBooleanValue) {
                }
                if (!c1819c2.f22181s) {
                }
                String strMo4589b6 = cmaVar.mo4589b2();
                this.f22121a = null;
                this.f22123c = i;
                this.f22124d = 4;
                objM7391f = c1307w.m7391f(strMo4589b6, this);
                if (objM7391f != coroutineSingletons) {
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f;
                    if (textToSpeechAppVoice != null) {
                        sm5.Companion.getClass();
                        h0a.f41641a.mo11431b("TTS speak: No voice found for language=" + cmaVar + ".activeLanguage(), falling back to local TTS", new Object[0]);
                        this.f22121a = null;
                        this.f22122b = null;
                        this.f22123c = i;
                        this.f22124d = 5;
                        if (c1819c2.m8489j(str4, f, z2, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        String str9 = textToSpeechAppVoice.f19564b;
                        String str10 = textToSpeechAppVoice.f19563a;
                        sm5.Companion.getClass();
                        h0a.f41641a.mo11430a("TTS speak: language=" + cmaVar + ".activeLanguage(), voice=" + str10 + ", appName=" + str9, new Object[0]);
                        String strMo4589b7 = cmaVar.mo4589b2();
                        this.f22121a = null;
                        this.f22122b = textToSpeechAppVoice;
                        this.f22123c = i;
                        this.f22124d = 6;
                        c1307w.getClass();
                        Locale localeForLanguageTag3 = Locale.forLanguageTag(strMo4589b7);
                        C1487c c1487c3 = TextToSpeechTokenUtterance.Companion;
                        localeForLanguageTag3.getClass();
                        c1487c3.getClass();
                        i2 = 0;
                        objM2861d = AbstractC0758a.m2861d(new ql4(C1487c.m8136a(localeForLanguageTag3, strMo4589b7, str4, str9, str10), 29), c1307w.f16564b.f71369K, this, true, false);
                        if (objM2861d != coroutineSingletons) {
                            textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                            if (textToSpeechTokenUtterance != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            mb1 mb1Var3 = ob1.Companion;
                            Context context3 = c1819c2.f22163a;
                            mb1Var3.getClass();
                            File file3 = new File(mb1.m16744d(context3) + "/" + str2);
                            if (textToSpeechTokenUtterance == null) {
                            }
                            this.f22121a = null;
                            this.f22122b = textToSpeechAppVoice;
                            this.f22123c = i;
                            this.f22124d = 8;
                            if (C1819c.m8481g(c1819c2, str4, z2, this) != coroutineSingletons) {
                                i3 = i;
                                if (z2) {
                                    c3244l = c1819c2.f22174l;
                                    do {
                                        value = c3244l.getValue();
                                    } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                                }
                                this.f22121a = null;
                                this.f22122b = null;
                                this.f22123c = i3;
                                this.f22124d = 9;
                                if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
            case 5:
            case 7:
            case 9:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 4:
                int i5 = this.f22123c;
                AbstractC3193b.m15359b(obj);
                i = i5;
                objM7391f = obj;
                textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f;
                if (textToSpeechAppVoice != null) {
                    String str11 = textToSpeechAppVoice.f19564b;
                    String str12 = textToSpeechAppVoice.f19563a;
                    sm5.Companion.getClass();
                    h0a.f41641a.mo11430a("TTS speak: language=" + cmaVar + ".activeLanguage(), voice=" + str12 + ", appName=" + str11, new Object[0]);
                    String strMo4589b8 = cmaVar.mo4589b2();
                    this.f22121a = null;
                    this.f22122b = textToSpeechAppVoice;
                    this.f22123c = i;
                    this.f22124d = 6;
                    c1307w.getClass();
                    Locale localeForLanguageTag4 = Locale.forLanguageTag(strMo4589b8);
                    C1487c c1487c4 = TextToSpeechTokenUtterance.Companion;
                    localeForLanguageTag4.getClass();
                    c1487c4.getClass();
                    i2 = 0;
                    objM2861d = AbstractC0758a.m2861d(new ql4(C1487c.m8136a(localeForLanguageTag4, strMo4589b8, str4, str11, str12), 29), c1307w.f16564b.f71369K, this, true, false);
                    if (objM2861d != coroutineSingletons) {
                        textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                        if (textToSpeechTokenUtterance != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        mb1 mb1Var4 = ob1.Companion;
                        Context context4 = c1819c2.f22163a;
                        mb1Var4.getClass();
                        File file4 = new File(mb1.m16744d(context4) + "/" + str2);
                        if (textToSpeechTokenUtterance == null) {
                        }
                        this.f22121a = null;
                        this.f22122b = textToSpeechAppVoice;
                        this.f22123c = i;
                        this.f22124d = 8;
                        if (C1819c.m8481g(c1819c2, str4, z2, this) != coroutineSingletons) {
                            i3 = i;
                            if (z2) {
                                c3244l = c1819c2.f22174l;
                                do {
                                    value = c3244l.getValue();
                                } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                            }
                            this.f22121a = null;
                            this.f22122b = null;
                            this.f22123c = i3;
                            this.f22124d = 9;
                            if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                    break;
                } else {
                    sm5.Companion.getClass();
                    h0a.f41641a.mo11431b("TTS speak: No voice found for language=" + cmaVar + ".activeLanguage(), falling back to local TTS", new Object[0]);
                    this.f22121a = null;
                    this.f22122b = null;
                    this.f22123c = i;
                    this.f22124d = 5;
                    if (c1819c2.m8489j(str4, f, z2, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 6:
                int i6 = this.f22123c;
                textToSpeechAppVoice = this.f22122b;
                AbstractC3193b.m15359b(obj);
                i = i6;
                i2 = 0;
                objM2861d = obj;
                textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) objM2861d;
                if (textToSpeechTokenUtterance != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                mb1 mb1Var5 = ob1.Companion;
                Context context5 = c1819c2.f22163a;
                mb1Var5.getClass();
                File file5 = new File(mb1.m16744d(context5) + "/" + str2);
                if (textToSpeechTokenUtterance == null) {
                    break;
                }
                this.f22121a = null;
                this.f22122b = textToSpeechAppVoice;
                this.f22123c = i;
                this.f22124d = 8;
                if (C1819c.m8481g(c1819c2, str4, z2, this) != coroutineSingletons) {
                    i3 = i;
                    if (z2) {
                        c3244l = c1819c2.f22174l;
                        do {
                            value = c3244l.getValue();
                        } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                    }
                    this.f22121a = null;
                    this.f22122b = null;
                    this.f22123c = i3;
                    this.f22124d = 9;
                    if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 8:
                i3 = this.f22123c;
                textToSpeechAppVoice = this.f22122b;
                AbstractC3193b.m15359b(obj);
                if (z2) {
                    c3244l = c1819c2.f22174l;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, new ada(str4, false, z2, true)));
                }
                this.f22121a = null;
                this.f22122b = null;
                this.f22123c = i3;
                this.f22124d = 9;
                if (C1819c.m8477b(c1819c2, this.f22126f, textToSpeechAppVoice, this.f22127g, this.f22128h, this) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
