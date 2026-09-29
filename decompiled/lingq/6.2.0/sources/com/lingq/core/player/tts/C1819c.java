package com.lingq.core.player.tts;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.token.LocalTextToSpeechVoice;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import com.lingq.core.download.downloader.C1550a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.C3476px;
import p000.ada;
import p000.bna;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.do7;
import p000.du0;
import p000.dw6;
import p000.eh9;
import p000.fa4;
import p000.fn3;
import p000.h0a;
import p000.h33;
import p000.i62;
import p000.i84;
import p000.jw2;
import p000.k02;
import p000.kk8;
import p000.l83;
import p000.mb1;
import p000.mn7;
import p000.n97;
import p000.nn1;
import p000.ob1;
import p000.oj2;
import p000.pg9;
import p000.pj2;
import p000.pu5;
import p000.rm5;
import p000.sca;
import p000.si7;
import p000.sm5;
import p000.sv2;
import p000.tca;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vi7;
import p000.vk9;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.yd7;

/* JADX INFO: renamed from: com.lingq.core.player.tts.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1819c implements sca, TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: a */
    public final Context f22163a;

    /* JADX INFO: renamed from: b */
    public final un1 f22164b;

    /* JADX INFO: renamed from: c */
    public final nn1 f22165c;

    /* JADX INFO: renamed from: d */
    public final nn1 f22166d;

    /* JADX INFO: renamed from: e */
    public final C1307w f22167e;

    /* JADX INFO: renamed from: f */
    public final d65 f22168f;

    /* JADX INFO: renamed from: g */
    public final si7 f22169g;

    /* JADX INFO: renamed from: h */
    public final cma f22170h;

    /* JADX INFO: renamed from: i */
    public final C1550a f22171i;

    /* JADX INFO: renamed from: j */
    public final jw2 f22172j;

    /* JADX INFO: renamed from: k */
    public final TextToSpeech f22173k;

    /* JADX INFO: renamed from: l */
    public final C3244l f22174l;

    /* JADX INFO: renamed from: m */
    public final c18 f22175m;

    /* JADX INFO: renamed from: n */
    public final C3211a f22176n;

    /* JADX INFO: renamed from: o */
    public final du0 f22177o;

    /* JADX INFO: renamed from: p */
    public pg9 f22178p;

    /* JADX INFO: renamed from: q */
    public pg9 f22179q;

    /* JADX INFO: renamed from: r */
    public String f22180r;

    /* JADX INFO: renamed from: s */
    public boolean f22181s;

    /* JADX INFO: renamed from: t */
    public pg9 f22182t;

    public C1819c(Context context, un1 un1Var, nn1 nn1Var, nn1 nn1Var2, C1307w c1307w, d65 d65Var, si7 si7Var, cma cmaVar, C1550a c1550a) {
        un1Var.getClass();
        c1307w.getClass();
        d65Var.getClass();
        si7Var.getClass();
        cmaVar.getClass();
        c1550a.getClass();
        this.f22163a = context;
        this.f22164b = un1Var;
        this.f22165c = nn1Var;
        this.f22166d = nn1Var2;
        this.f22167e = c1307w;
        this.f22168f = d65Var;
        this.f22169g = si7Var;
        this.f22170h = cmaVar;
        this.f22171i = c1550a;
        sv2 sv2Var = new sv2(context);
        C3476px c3476px = new C3476px(1);
        bna.m3987z(!sv2Var.f61477u);
        sv2Var.f61465i = c3476px;
        bna.m3987z(!sv2Var.f61477u);
        sv2Var.f61477u = true;
        jw2 jw2Var = new jw2(sv2Var);
        this.f22172j = jw2Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new ada("", false, false, false));
        this.f22174l = c3244lM17114d;
        this.f22175m = AbstractC3224d.m15524c(c3244lM17114d);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f22176n = c3211aM10525a;
        this.f22177o = AbstractC3224d.m15519A(c3211aM10525a);
        this.f22180r = "";
        jw2Var.f46295m.m23268a(new tca(this));
        jw2Var.m14697C(new n97(1.0f, 1.0f));
        this.f22173k = new TextToSpeech(context, this);
        wfb.m23926u(un1Var, null, null, new TtsControllerImpl$2(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public static final Object m8476a(C1819c c1819c, TextToSpeechTokenUtterance textToSpeechTokenUtterance, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$downloadUtterance$1 ttsControllerImpl$downloadUtterance$1;
        File file;
        if (continuationImpl instanceof TtsControllerImpl$downloadUtterance$1) {
            ttsControllerImpl$downloadUtterance$1 = (TtsControllerImpl$downloadUtterance$1) continuationImpl;
            int i = ttsControllerImpl$downloadUtterance$1.f22032d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$downloadUtterance$1.f22032d = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$downloadUtterance$1 = new TtsControllerImpl$downloadUtterance$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$downloadUtterance$1 = new TtsControllerImpl$downloadUtterance$1(c1819c, continuationImpl);
        }
        TtsControllerImpl$downloadUtterance$1 ttsControllerImpl$downloadUtterance$2 = ttsControllerImpl$downloadUtterance$1;
        Object objM8238b = ttsControllerImpl$downloadUtterance$2.f22030b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$downloadUtterance$2.f22032d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8238b);
            String str = (String) u91.m22597O0(vk9.m23365A0(textToSpeechTokenUtterance.m8120a(), new String[]{"/"}, 0, 6));
            mb1 mb1Var = ob1.Companion;
            Context context = c1819c.f22163a;
            mb1Var.getClass();
            File file2 = new File(mb1.m16744d(context), str);
            if (file2.exists()) {
                return file2;
            }
            C1550a c1550a = c1819c.f22171i;
            String strM8120a = textToSpeechTokenUtterance.m8120a();
            ttsControllerImpl$downloadUtterance$2.f22029a = file2;
            ttsControllerImpl$downloadUtterance$2.f22032d = 1;
            objM8238b = C1550a.m8238b(c1550a, strM8120a, file2, null, ttsControllerImpl$downloadUtterance$2, 12);
            if (objM8238b == coroutineSingletons) {
                return coroutineSingletons;
            }
            file = file2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = ttsControllerImpl$downloadUtterance$2.f22029a;
            AbstractC3193b.m15359b(objM8238b);
        }
        if (((pj2) objM8238b) instanceof oj2) {
            return file;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        if (r1.collect(r0, r7) == r8) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8477b(C1819c c1819c, String str, TextToSpeechAppVoice textToSpeechAppVoice, float f, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$fetchUtterance$1 ttsControllerImpl$fetchUtterance$1;
        String str2;
        Object obj;
        float f2;
        boolean z2;
        TextToSpeechAppVoice textToSpeechAppVoice2 = textToSpeechAppVoice;
        cma cmaVar = c1819c.f22170h;
        if (continuationImpl instanceof TtsControllerImpl$fetchUtterance$1) {
            ttsControllerImpl$fetchUtterance$1 = (TtsControllerImpl$fetchUtterance$1) continuationImpl;
            int i = ttsControllerImpl$fetchUtterance$1.f22047g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$fetchUtterance$1.f22047g = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$fetchUtterance$1 = new TtsControllerImpl$fetchUtterance$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$fetchUtterance$1 = new TtsControllerImpl$fetchUtterance$1(c1819c, continuationImpl);
        }
        TtsControllerImpl$fetchUtterance$1 ttsControllerImpl$fetchUtterance$2 = ttsControllerImpl$fetchUtterance$1;
        Object obj2 = ttsControllerImpl$fetchUtterance$2.f22045e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$fetchUtterance$2.f22047g;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = ttsControllerImpl$fetchUtterance$2.f22044d;
                float f3 = ttsControllerImpl$fetchUtterance$2.f22043c;
                TextToSpeechAppVoice textToSpeechAppVoice3 = ttsControllerImpl$fetchUtterance$2.f22042b;
                String str3 = ttsControllerImpl$fetchUtterance$2.f22041a;
                AbstractC3193b.m15359b(obj2);
                z2 = z3;
                obj = obj2;
                str2 = str3;
                f2 = f3;
                textToSpeechAppVoice2 = textToSpeechAppVoice3;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj2);
        rm5 rm5Var = sm5.Companion;
        String str4 = "TTS fetchUtterance: language=" + cmaVar + ".activeLanguage(), voice=" + textToSpeechAppVoice2.f19563a + ", appName=" + textToSpeechAppVoice2.f19564b;
        rm5Var.getClass();
        h0a.f41641a.mo11430a(str4, new Object[0]);
        C1307w c1307w = c1819c.f22167e;
        String strMo4589b2 = cmaVar.mo4589b2();
        ttsControllerImpl$fetchUtterance$2.f22041a = str;
        ttsControllerImpl$fetchUtterance$2.f22042b = textToSpeechAppVoice2;
        ttsControllerImpl$fetchUtterance$2.f22043c = f;
        ttsControllerImpl$fetchUtterance$2.f22044d = z;
        ttsControllerImpl$fetchUtterance$2.f22047g = 1;
        kk8 kk8VarM7392g = c1307w.m7392g(strMo4589b2, str, textToSpeechAppVoice2);
        if (kk8VarM7392g != coroutineSingletons) {
            str2 = str;
            obj = kk8VarM7392g;
            f2 = f;
            z2 = z;
        }
        return coroutineSingletons;
        l83 l83Var = new l83((c83) obj, new TtsControllerImpl$fetchUtterance$2(textToSpeechAppVoice2, c1819c, str2, f2, z2, null), 1);
        C1818b c1818b = new C1818b(c1819c, z2, str2, f2);
        ttsControllerImpl$fetchUtterance$2.f22041a = null;
        ttsControllerImpl$fetchUtterance$2.f22042b = null;
        ttsControllerImpl$fetchUtterance$2.f22043c = f2;
        ttsControllerImpl$fetchUtterance$2.f22044d = z2;
        ttsControllerImpl$fetchUtterance$2.f22047g = 2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m8478c(C1819c c1819c, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$initializeLocalVoiceIfNeeded$1 ttsControllerImpl$initializeLocalVoiceIfNeeded$1;
        String strMo4589b2;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        si7 si7Var = c1819c.f22169g;
        if (continuationImpl instanceof TtsControllerImpl$initializeLocalVoiceIfNeeded$1) {
            ttsControllerImpl$initializeLocalVoiceIfNeeded$1 = (TtsControllerImpl$initializeLocalVoiceIfNeeded$1) continuationImpl;
            int i = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$initializeLocalVoiceIfNeeded$1 = new TtsControllerImpl$initializeLocalVoiceIfNeeded$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$initializeLocalVoiceIfNeeded$1 = new TtsControllerImpl$initializeLocalVoiceIfNeeded$1(c1819c, continuationImpl);
        }
        Object objM15541t = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22060c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            strMo4589b2 = c1819c.f22170h.mo4589b2();
            if (!vk9.m23391n0(strMo4589b2)) {
                c83 c83Var = ((C1368a) si7Var).f18379U0;
                ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = strMo4589b2;
                ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, ttsControllerImpl$initializeLocalVoiceIfNeeded$1);
                if (objM15541t != obj) {
                }
            }
        }
        if (i2 == 1) {
            strMo4589b2 = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 == 2) {
                String str = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a;
                AbstractC3193b.m15359b(objM15541t);
                strMo4589b2 = str;
                localTextToSpeechVoice = (LocalTextToSpeechVoice) u91.m22591I0((List) objM15541t);
                if (localTextToSpeechVoice != null) {
                    c83 c83Var2 = ((C1368a) si7Var).f18379U0;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = strMo4589b2;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22059b = localTextToSpeechVoice;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 3;
                    objM15541t = AbstractC3224d.m15541t(c83Var2, ttsControllerImpl$initializeLocalVoiceIfNeeded$1);
                    if (objM15541t != obj) {
                    }
                }
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localTextToSpeechVoice = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22059b;
            strMo4589b2 = ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a;
            AbstractC3193b.m15359b(objM15541t);
        }
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(strMo4589b2, localTextToSpeechVoice);
        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = null;
        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22059b = null;
        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 4;
        return ((C1368a) si7Var).m7850I(linkedHashMapM15372Y, ttsControllerImpl$initializeLocalVoiceIfNeeded$1) == obj ? obj : xfaVar;
        if (((LocalTextToSpeechVoice) ((Map) objM15541t).get(strMo4589b2)) == null) {
            ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = strMo4589b2;
            ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 2;
            objM15541t = c1819c.mo8492m1(ttsControllerImpl$initializeLocalVoiceIfNeeded$1);
            if (objM15541t != obj) {
                localTextToSpeechVoice = (LocalTextToSpeechVoice) u91.m22591I0((List) objM15541t);
                if (localTextToSpeechVoice != null) {
                    c83 c83Var3 = ((C1368a) si7Var).f18379U0;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = strMo4589b2;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22059b = localTextToSpeechVoice;
                    ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 3;
                    objM15541t = AbstractC3224d.m15541t(c83Var3, ttsControllerImpl$initializeLocalVoiceIfNeeded$1);
                    if (objM15541t != obj) {
                        LinkedHashMap linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t);
                        linkedHashMapM15372Y2.put(strMo4589b2, localTextToSpeechVoice);
                        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22058a = null;
                        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22059b = null;
                        ttsControllerImpl$initializeLocalVoiceIfNeeded$1.f22062e = 4;
                        if (((C1368a) si7Var).m7850I(linkedHashMapM15372Y2, ttsControllerImpl$initializeLocalVoiceIfNeeded$1) == obj) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Object m8479e(C1819c c1819c, Uri uri, boolean z, float f, String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$play$1 ttsControllerImpl$play$1;
        if (continuationImpl instanceof TtsControllerImpl$play$1) {
            ttsControllerImpl$play$1 = (TtsControllerImpl$play$1) continuationImpl;
            int i = ttsControllerImpl$play$1.f22083c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$play$1.f22083c = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$play$1 = new TtsControllerImpl$play$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$play$1 = new TtsControllerImpl$play$1(c1819c, continuationImpl);
        }
        TtsControllerImpl$play$1 ttsControllerImpl$play$2 = ttsControllerImpl$play$1;
        Object obj = ttsControllerImpl$play$2.f22081a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$play$2.f22083c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                k02 k02Var = new k02(uri);
                h33 h33Var = new h33();
                h33Var.mo10000b(k02Var);
                dw6 dw6Var = new dw6(h33Var, 2);
                pu5 pu5VarM19482a = pu5.m19482a(uri);
                i62 i62Var = new i62();
                synchronized (i62Var) {
                    i62Var.f43582a = 4;
                }
                synchronized (i62Var) {
                }
                mn7 mn7VarM11952e = new fn3(dw6Var, i62Var).m11952e(pu5VarM19482a);
                nn1 nn1Var = c1819c.f22165c;
                TtsControllerImpl$play$2 ttsControllerImpl$play$3 = new TtsControllerImpl$play$2(c1819c, f, pu5VarM19482a, mn7VarM11952e, str, z, null);
                ttsControllerImpl$play$2.f22083c = 1;
                if (wfb.m23905G(ttsControllerImpl$play$3, nn1Var, ttsControllerImpl$play$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: f */
    public static final Object m8480f(C1819c c1819c, Uri uri, double d, Double d2, int i, float f, String str, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$playClippedSentence$1 ttsControllerImpl$playClippedSentence$1;
        if (continuationImpl instanceof TtsControllerImpl$playClippedSentence$1) {
            ttsControllerImpl$playClippedSentence$1 = (TtsControllerImpl$playClippedSentence$1) continuationImpl;
            int i2 = ttsControllerImpl$playClippedSentence$1.f22092c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$playClippedSentence$1.f22092c = i2 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$playClippedSentence$1 = new TtsControllerImpl$playClippedSentence$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$playClippedSentence$1 = new TtsControllerImpl$playClippedSentence$1(c1819c, continuationImpl);
        }
        TtsControllerImpl$playClippedSentence$1 ttsControllerImpl$playClippedSentence$2 = ttsControllerImpl$playClippedSentence$1;
        Object obj = ttsControllerImpl$playClippedSentence$2.f22090a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = ttsControllerImpl$playClippedSentence$2.f22092c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                k02 k02Var = new k02(uri);
                h33 h33Var = new h33();
                h33Var.mo10000b(k02Var);
                dw6 dw6Var = new dw6(h33Var, 2);
                pu5 pu5VarM19482a = pu5.m19482a(uri);
                i62 i62Var = new i62();
                synchronized (i62Var) {
                    i62Var.f43582a = 4;
                }
                synchronized (i62Var) {
                }
                mn7 mn7VarM11952e = new fn3(dw6Var, i62Var).m11952e(pu5VarM19482a);
                long jDoubleValue = d2 != null ? (long) (d2.doubleValue() * 1000000.0d) : Long.MIN_VALUE;
                nn1 nn1Var = c1819c.f22165c;
                TtsControllerImpl$playClippedSentence$2 ttsControllerImpl$playClippedSentence$3 = new TtsControllerImpl$playClippedSentence$2(c1819c, mn7VarM11952e, d, jDoubleValue, f, pu5VarM19482a, d2, str, i, null);
                ttsControllerImpl$playClippedSentence$2.f22092c = 1;
                if (wfb.m23905G(ttsControllerImpl$playClippedSentence$3, nn1Var, ttsControllerImpl$playClippedSentence$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m8481g(C1819c c1819c, String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        TtsControllerImpl$startTimer$1 ttsControllerImpl$startTimer$1;
        if (continuationImpl instanceof TtsControllerImpl$startTimer$1) {
            ttsControllerImpl$startTimer$1 = (TtsControllerImpl$startTimer$1) continuationImpl;
            int i = ttsControllerImpl$startTimer$1.f22141e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$startTimer$1.f22141e = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$startTimer$1 = new TtsControllerImpl$startTimer$1(c1819c, continuationImpl);
            }
        } else {
            ttsControllerImpl$startTimer$1 = new TtsControllerImpl$startTimer$1(c1819c, continuationImpl);
        }
        Object objM15541t = ttsControllerImpl$startTimer$1.f22139c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$startTimer$1.f22141e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            vi7 vi7Var = ((C1368a) c1819c.f22169g).f18368P0;
            ttsControllerImpl$startTimer$1.f22137a = str;
            ttsControllerImpl$startTimer$1.f22138b = z;
            ttsControllerImpl$startTimer$1.f22141e = 1;
            objM15541t = AbstractC3224d.m15541t(vi7Var, ttsControllerImpl$startTimer$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ttsControllerImpl$startTimer$1.f22138b;
            str = ttsControllerImpl$startTimer$1.f22137a;
            AbstractC3193b.m15359b(objM15541t);
        }
        boolean zBooleanValue = ((Boolean) objM15541t).booleanValue();
        c1819c.m8491l();
        if (zBooleanValue) {
            c1819c.f22178p = wfb.m23926u(c1819c.f22164b, null, null, new TtsControllerImpl$startTimer$2(c1819c, str, z, null), 3);
        }
        return xfa.f68157a;
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: P */
    public final void mo8482P() {
        C3244l c3244l;
        Object value;
        AbstractC1263a.m7046a(this.f22182t);
        m8491l();
        AbstractC1263a.m7046a(this.f22179q);
        TextToSpeech textToSpeech = this.f22173k;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        this.f22181s = false;
        jw2 jw2Var = this.f22172j;
        jw2Var.m14699E();
        jw2Var.m14707c();
        jw2Var.m14726x();
        do {
            c3244l = this.f22174l;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, ada.m287a((ada) value, false)));
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: U0 */
    public final void mo8483U0(int i, double d, Double d2, float f, String str) {
        str.getClass();
        wfb.m23926u(this.f22164b, this.f22166d, null, new TtsControllerImpl$speakSentence$1(this, i, d, d2, f, str, null), 2);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: Y0 */
    public final void mo8484Y0(String str, boolean z, float f, boolean z2) {
        str.getClass();
        if (vk9.m23391n0(this.f22170h.mo4589b2())) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS speak: No language available", new Object[0]);
        } else {
            AbstractC1263a.m7046a(this.f22182t);
            m8491l();
            this.f22182t = wfb.m23926u(this.f22164b, this.f22166d, null, new TtsControllerImpl$speak$1(this, str, f, z2, z, null), 2);
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: c2 */
    public final void mo8485c2() {
        if (vk9.m23391n0(this.f22170h.mo4589b2())) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS updateVoices: No language available", new Object[0]);
        } else {
            wfb.m23926u(this.f22164b, null, null, new TtsControllerImpl$updateVoices$1(this, null), 3);
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: d */
    public final c83 mo8486d() {
        return this.f22177o;
    }

    /* JADX INFO: renamed from: h */
    public final Voice m8487h(String str) {
        Set<Voice> voices;
        Object next;
        try {
            TextToSpeech textToSpeech = this.f22173k;
            if (textToSpeech != null && (voices = textToSpeech.getVoices()) != null) {
                Iterator<T> it = voices.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (fa4.m11650l(((Voice) next).getName(), str)) {
                        return (Voice) next;
                    }
                }
                next = null;
                return (Voice) next;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Voice m8488i(String str) {
        Set<Voice> voices;
        Object next;
        try {
            TextToSpeech textToSpeech = this.f22173k;
            if (textToSpeech != null && (voices = textToSpeech.getVoices()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : voices) {
                    Voice voice = (Voice) obj;
                    if (!fa4.m11650l(voice.getLocale().getLanguage(), str)) {
                        String iSO3Language = voice.getLocale().getISO3Language();
                        iSO3Language.getClass();
                        if (vk9.m23367C0(iSO3Language, new i84(0, 1, 1)).equals(str)) {
                        }
                    }
                    arrayList.add(obj);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        String name = ((Voice) next).getName();
                        do {
                            Object next2 = it.next();
                            String name2 = ((Voice) next2).getName();
                            if (name.compareTo(name2) > 0) {
                                next = next2;
                                name = name2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                return (Voice) next;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[Catch: Exception -> 0x0102, TRY_LEAVE, TryCatch #0 {Exception -> 0x0102, blocks: (B:42:0x00d8, B:44:0x00dc), top: B:59:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a A[Catch: Exception -> 0x0111, TryCatch #1 {Exception -> 0x0111, blocks: (B:15:0x003c, B:48:0x00fb, B:52:0x010a, B:54:0x010d), top: B:61:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010d A[Catch: Exception -> 0x0111, TRY_LEAVE, TryCatch #1 {Exception -> 0x0111, blocks: (B:15:0x003c, B:48:0x00fb, B:52:0x010a, B:54:0x010d), top: B:61:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: j */
    public final Object m8489j(String str, float f, boolean z, Continuation continuation) throws Throwable {
        TtsControllerImpl$localSpeak$1 ttsControllerImpl$localSpeak$1;
        String str2;
        boolean z2;
        float f2;
        boolean z3;
        String str3;
        String str4;
        C1819c c1819c;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        String strM8119a;
        Voice voiceM8487h;
        Voice voice;
        String str5;
        boolean z4;
        TextToSpeech textToSpeech;
        boolean zBooleanValue;
        if (continuation instanceof TtsControllerImpl$localSpeak$1) {
            ttsControllerImpl$localSpeak$1 = (TtsControllerImpl$localSpeak$1) continuation;
            int i = ttsControllerImpl$localSpeak$1.f22071i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$localSpeak$1.f22071i = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$localSpeak$1 = new TtsControllerImpl$localSpeak$1(this, continuation);
            }
        } else {
            ttsControllerImpl$localSpeak$1 = new TtsControllerImpl$localSpeak$1(this, continuation);
        }
        TtsControllerImpl$localSpeak$1 ttsControllerImpl$localSpeak$2 = ttsControllerImpl$localSpeak$1;
        Object objM15541t = ttsControllerImpl$localSpeak$2.f22069g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$localSpeak$2.f22071i;
        si7 si7Var = this.f22169g;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            if (!this.f22181s) {
                vi7 vi7Var = ((C1368a) si7Var).f18368P0;
                str2 = str;
                ttsControllerImpl$localSpeak$2.f22063a = str2;
                ttsControllerImpl$localSpeak$2.f22066d = f;
                z2 = z;
                ttsControllerImpl$localSpeak$2.f22067e = z2;
                ttsControllerImpl$localSpeak$2.f22071i = 1;
                objM15541t = AbstractC3224d.m15541t(vi7Var, ttsControllerImpl$localSpeak$2);
                if (objM15541t != coroutineSingletons) {
                    f2 = f;
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z4 = ttsControllerImpl$localSpeak$2.f22067e;
                str5 = ttsControllerImpl$localSpeak$2.f22063a;
                try {
                    AbstractC3193b.m15359b(objM15541t);
                    zBooleanValue = ((Boolean) objM15541t).booleanValue();
                    if (zBooleanValue) {
                        this.f22180r = str5;
                        return xfaVar;
                    }
                    m8490k(str5, z4);
                    return xfaVar;
                } catch (Exception unused) {
                    m8490k(str5, z4);
                    return xfaVar;
                }
            }
            boolean z5 = ttsControllerImpl$localSpeak$2.f22068f;
            boolean z6 = ttsControllerImpl$localSpeak$2.f22067e;
            float f3 = ttsControllerImpl$localSpeak$2.f22066d;
            C1819c c1819c2 = ttsControllerImpl$localSpeak$2.f22065c;
            String str6 = ttsControllerImpl$localSpeak$2.f22064b;
            String str7 = ttsControllerImpl$localSpeak$2.f22063a;
            AbstractC3193b.m15359b(objM15541t);
            z2 = z6;
            str3 = str6;
            str4 = str7;
            z3 = z5;
            c1819c = c1819c2;
            f2 = f3;
            localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM15541t).get(str3);
            if (localTextToSpeechVoice != null || (strM8119a = localTextToSpeechVoice.m8119a()) == null) {
                strM8119a = "";
            }
            voiceM8487h = c1819c.m8487h(strM8119a);
            if (voiceM8487h == null) {
                voiceM8487h = m8488i(str3);
            }
            voice = voiceM8487h;
            if (z3) {
                try {
                    textToSpeech = this.f22173k;
                    if (textToSpeech != null) {
                        nn1 nn1Var = this.f22165c;
                        TtsControllerImpl$localSpeak$didStart$1$1 ttsControllerImpl$localSpeak$didStart$1$1 = new TtsControllerImpl$localSpeak$didStart$1$1(textToSpeech, str3, voice, f2, this, str4, z2, null);
                        ttsControllerImpl$localSpeak$2.f22063a = str4;
                        ttsControllerImpl$localSpeak$2.f22064b = null;
                        ttsControllerImpl$localSpeak$2.f22065c = null;
                        ttsControllerImpl$localSpeak$2.f22066d = f2;
                        ttsControllerImpl$localSpeak$2.f22067e = z2;
                        ttsControllerImpl$localSpeak$2.f22068f = z3;
                        ttsControllerImpl$localSpeak$2.f22071i = 3;
                        objM15541t = wfb.m23905G(ttsControllerImpl$localSpeak$didStart$1$1, nn1Var, ttsControllerImpl$localSpeak$2);
                        if (objM15541t != coroutineSingletons) {
                            str5 = str4;
                            z4 = z2;
                            zBooleanValue = ((Boolean) objM15541t).booleanValue();
                        }
                        return coroutineSingletons;
                    }
                    zBooleanValue = false;
                    str5 = str4;
                    z4 = z2;
                    if (zBooleanValue) {
                        this.f22180r = str5;
                        return xfaVar;
                    }
                    m8490k(str5, z4);
                    return xfaVar;
                } catch (Exception unused2) {
                    str5 = str4;
                    z4 = z2;
                    m8490k(str5, z4);
                    return xfaVar;
                }
            }
            return xfaVar;
        }
        boolean z7 = ttsControllerImpl$localSpeak$2.f22067e;
        f2 = ttsControllerImpl$localSpeak$2.f22066d;
        String str8 = ttsControllerImpl$localSpeak$2.f22063a;
        AbstractC3193b.m15359b(objM15541t);
        z2 = z7;
        str2 = str8;
        boolean zBooleanValue2 = ((Boolean) objM15541t).booleanValue();
        String strMo4589b2 = this.f22170h.mo4589b2();
        c83 c83Var = ((C1368a) si7Var).f18379U0;
        ttsControllerImpl$localSpeak$2.f22063a = str2;
        ttsControllerImpl$localSpeak$2.f22064b = strMo4589b2;
        ttsControllerImpl$localSpeak$2.f22065c = this;
        ttsControllerImpl$localSpeak$2.f22066d = f2;
        ttsControllerImpl$localSpeak$2.f22067e = z2;
        ttsControllerImpl$localSpeak$2.f22068f = zBooleanValue2;
        ttsControllerImpl$localSpeak$2.f22071i = 2;
        Object objM15541t2 = AbstractC3224d.m15541t(c83Var, ttsControllerImpl$localSpeak$2);
        if (objM15541t2 != coroutineSingletons) {
            z3 = zBooleanValue2;
            objM15541t = objM15541t2;
            str3 = strMo4589b2;
            str4 = str2;
            c1819c = this;
            localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) objM15541t).get(str3);
            if (localTextToSpeechVoice != null) {
                strM8119a = "";
            } else {
                strM8119a = "";
            }
            voiceM8487h = c1819c.m8487h(strM8119a);
            if (voiceM8487h == null) {
                voiceM8487h = m8488i(str3);
            }
            voice = voiceM8487h;
            if (z3) {
                textToSpeech = this.f22173k;
                if (textToSpeech != null) {
                    nn1 nn1Var2 = this.f22165c;
                    TtsControllerImpl$localSpeak$didStart$1$1 ttsControllerImpl$localSpeak$didStart$1$2 = new TtsControllerImpl$localSpeak$didStart$1$1(textToSpeech, str3, voice, f2, this, str4, z2, null);
                    ttsControllerImpl$localSpeak$2.f22063a = str4;
                    ttsControllerImpl$localSpeak$2.f22064b = null;
                    ttsControllerImpl$localSpeak$2.f22065c = null;
                    ttsControllerImpl$localSpeak$2.f22066d = f2;
                    ttsControllerImpl$localSpeak$2.f22067e = z2;
                    ttsControllerImpl$localSpeak$2.f22068f = z3;
                    ttsControllerImpl$localSpeak$2.f22071i = 3;
                    objM15541t = wfb.m23905G(ttsControllerImpl$localSpeak$didStart$1$2, nn1Var2, ttsControllerImpl$localSpeak$2);
                    if (objM15541t != coroutineSingletons) {
                        str5 = str4;
                        z4 = z2;
                        zBooleanValue = ((Boolean) objM15541t).booleanValue();
                    }
                } else {
                    zBooleanValue = false;
                    str5 = str4;
                    z4 = z2;
                }
                if (zBooleanValue) {
                    this.f22180r = str5;
                    return xfaVar;
                }
                m8490k(str5, z4);
                return xfaVar;
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: k */
    public final void m8490k(String str, boolean z) {
        C3244l c3244l;
        Object value;
        this.f22181s = false;
        do {
            c3244l = this.f22174l;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new ada(str, false, z, false)));
    }

    /* JADX INFO: renamed from: l */
    public final void m8491l() {
        AbstractC1263a.m7046a(this.f22178p);
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: m1 */
    public final Object mo8492m1(ContinuationImpl continuationImpl) {
        Set<Voice> voices;
        String strMo4589b2 = this.f22170h.mo4589b2();
        boolean zM23391n0 = vk9.m23391n0(strMo4589b2);
        int i = 0;
        EmptyList emptyList = EmptyList.f47638a;
        if (zM23391n0) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS localVoices: No language available", new Object[0]);
            return emptyList;
        }
        try {
            TextToSpeech textToSpeech = this.f22173k;
            if (textToSpeech == null || (voices = textToSpeech.getVoices()) == null) {
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : voices) {
                Voice voice = (Voice) obj;
                if (!fa4.m11650l(voice.getLocale().getLanguage(), strMo4589b2)) {
                    String iSO3Language = voice.getLocale().getISO3Language();
                    iSO3Language.getClass();
                    if (vk9.m23367C0(iSO3Language, new i84(0, 1, 1)).equals(strMo4589b2)) {
                    }
                }
                arrayList.add(obj);
            }
            List listM22614f1 = u91.m22614f1(arrayList, new yd7(10));
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22614f1, 10));
            for (Object obj2 : listM22614f1) {
                int i2 = i + 1;
                if (i < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                Voice voice2 = (Voice) obj2;
                String name = voice2.getName();
                name.getClass();
                arrayList2.add(new LocalTextToSpeechVoice(name, AbstractC3423or.m18235T(voice2, this.f22163a, strMo4589b2, i2)));
                i = i2;
            }
            return arrayList2;
        } catch (Exception e) {
            e.printStackTrace();
            return emptyList;
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: n */
    public final void mo8493n(double d, Double d2, int i, float f, Long l) {
        double dDoubleValue;
        long jLongValue;
        if (vk9.m23391n0(this.f22170h.mo4589b2())) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS trackSentenceListen: No language available", new Object[0]);
            return;
        }
        if (d2 != null) {
            try {
                dDoubleValue = d2.doubleValue() - d;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            dDoubleValue = 0.0d;
        }
        double d3 = dDoubleValue * 10.0d;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mb1 mb1Var = ob1.Companion;
            Context context = this.f22163a;
            mb1Var.getClass();
            mediaMetadataRetriever.setDataSource(mb1.m16743c(context).toString() + "/" + i + ".mp3");
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            jLongValue = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
        }
        Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
        double d4 = ((d3 / 10.0d) * ((double) f)) / (jLongValue / 1000);
        ref$DoubleRef.f47714a = d4;
        if (!Double.isNaN(d4) && !Double.isInfinite(ref$DoubleRef.f47714a)) {
            double d5 = ref$DoubleRef.f47714a;
            if (d5 <= 1.0d) {
                ref$DoubleRef.f47714a = (d5 * 100.0d) / 100.0d;
            }
        }
        wfb.m23926u(this.f22164b, this.f22166d, null, new TtsControllerImpl$trackSentenceListen$1(this, i, ref$DoubleRef, null), 2);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        if (i == 0) {
            wfb.m23926u(this.f22164b, this.f22166d, null, new TtsControllerImpl$onInit$1(this, null), 2);
        }
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: u */
    public final eh9 mo8494u() {
        return this.f22175m;
    }

    @Override // p000.sca
    /* JADX INFO: renamed from: y1 */
    public final void mo8495y1(Set set) {
        if (vk9.m23391n0(this.f22170h.mo4589b2())) {
            sm5.Companion.getClass();
            h0a.f41641a.mo11431b("TTS fetchBatch: No language available", new Object[0]);
        } else {
            wfb.m23926u(this.f22164b, this.f22166d, null, new TtsControllerImpl$fetchBatch$1(this, set, null), 2);
        }
    }
}
