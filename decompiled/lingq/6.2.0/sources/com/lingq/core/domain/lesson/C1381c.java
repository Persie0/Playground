package com.lingq.core.domain.lesson;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.audio.AudioFetchErrorType;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import p000.AbstractC3352my;
import p000.C2981ey;
import p000.C3386nv;
import p000.c25;
import p000.cn2;
import p000.d25;
import p000.d65;
import p000.fa4;
import p000.iy5;
import p000.lj2;
import p000.pk9;
import p000.xd7;
import p000.xfa;
import p000.xm5;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1381c {

    /* JADX INFO: renamed from: a */
    public final d65 f18724a;

    /* JADX INFO: renamed from: b */
    public final C1307w f18725b;

    /* JADX INFO: renamed from: c */
    public final lj2 f18726c;

    /* JADX INFO: renamed from: d */
    public final xd7 f18727d;

    public C1381c(d65 d65Var, C1307w c1307w, lj2 lj2Var, xd7 xd7Var) {
        d65Var.getClass();
        c1307w.getClass();
        lj2Var.getClass();
        xd7Var.getClass();
        this.f18724a = d65Var;
        this.f18725b = c1307w;
        this.f18726c = lj2Var;
        this.f18727d = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m7990a(DownloadItem downloadItem, String str, AudioFetchErrorType audioFetchErrorType, ContinuationImpl continuationImpl) throws Throwable {
        GenerateLessonAudioUseCase$finalizeDownload$1 generateLessonAudioUseCase$finalizeDownload$1;
        if (continuationImpl instanceof GenerateLessonAudioUseCase$finalizeDownload$1) {
            generateLessonAudioUseCase$finalizeDownload$1 = (GenerateLessonAudioUseCase$finalizeDownload$1) continuationImpl;
            int i = generateLessonAudioUseCase$finalizeDownload$1.f18656d;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateLessonAudioUseCase$finalizeDownload$1.f18656d = i - Integer.MIN_VALUE;
            } else {
                generateLessonAudioUseCase$finalizeDownload$1 = new GenerateLessonAudioUseCase$finalizeDownload$1(this, continuationImpl);
            }
        } else {
            generateLessonAudioUseCase$finalizeDownload$1 = new GenerateLessonAudioUseCase$finalizeDownload$1(this, continuationImpl);
        }
        GenerateLessonAudioUseCase$finalizeDownload$1 generateLessonAudioUseCase$finalizeDownload$2 = generateLessonAudioUseCase$finalizeDownload$1;
        Object obj = generateLessonAudioUseCase$finalizeDownload$2.f18654b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = generateLessonAudioUseCase$finalizeDownload$2.f18656d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            String str2 = downloadItem.f18842a;
            int i3 = downloadItem.f18843b;
            int i4 = fa4.m11650l(str, "completed") ? 100 : 0;
            String strName = audioFetchErrorType != null ? audioFetchErrorType.name() : null;
            generateLessonAudioUseCase$finalizeDownload$2.f18653a = downloadItem;
            generateLessonAudioUseCase$finalizeDownload$2.f18656d = 1;
            if (((C1302r) this.f18727d).m7340A(i3, i4, str2, str, strName, generateLessonAudioUseCase$finalizeDownload$2) != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        downloadItem = generateLessonAudioUseCase$finalizeDownload$2.f18653a;
        AbstractC3193b.m15359b(obj);
        int i5 = downloadItem.f18843b;
        generateLessonAudioUseCase$finalizeDownload$2.f18653a = null;
        generateLessonAudioUseCase$finalizeDownload$2.f18656d = 2;
        this.f18726c.m16253a(i5);
        return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[PHI: r1 r2 r3 r5 r6
      0x007d: PHI (r1v27 ??) = (r1v26 ??), (r1v40 ??) binds: [B:21:0x0071, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r2v26 com.lingq.core.domain.model.audio.DownloadItem) = (r2v25 com.lingq.core.domain.model.audio.DownloadItem), (r2v29 com.lingq.core.domain.model.audio.DownloadItem) binds: [B:21:0x0071, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r3v33 java.lang.Object) = (r3v1 java.lang.Object), (r3v45 java.lang.Object) binds: [B:21:0x0071, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r5v32 java.lang.String) = (r5v31 java.lang.String), (r5v34 java.lang.String) binds: [B:21:0x0071, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r6v15 int) = (r6v14 int), (r6v16 int) binds: [B:21:0x0071, B:79:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7 A[PHI: r1 r2 r3 r5 r6 r7 r8
      0x00b7: PHI (r1v14 ??) = (r1v45 ??), (r1v16 ??) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r2v15 ym5) = (r2v12 ym5), (r2v17 ym5) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r3v15 java.lang.Object) = (r3v13 java.lang.Object), (r3v1 java.lang.Object) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r5v18 com.lingq.core.domain.model.token.TextToSpeechAppVoice) = 
      (r5v15 com.lingq.core.domain.model.token.TextToSpeechAppVoice)
      (r5v25 com.lingq.core.domain.model.token.TextToSpeechAppVoice)
     binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r6v7 int) = (r6v4 int), (r6v8 int) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r7v11 com.lingq.core.domain.model.audio.DownloadItem) = (r7v8 com.lingq.core.domain.model.audio.DownloadItem), (r7v17 com.lingq.core.domain.model.audio.DownloadItem) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r8v7 java.lang.String) = (r8v5 java.lang.String), (r8v9 java.lang.String) binds: [B:56:0x01a7, B:25:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x014f  */
    /* JADX WARN: Code duplicated, block: B:48:0x016e  */
    /* JADX WARN: Code duplicated, block: B:51:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0192  */
    /* JADX WARN: Code duplicated, block: B:60:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x024c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0250  */
    /* JADX WARN: Code duplicated, block: B:89:0x0275  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:96:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0297  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0200, code lost:
    
        if (r3 == r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0248, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15438e(r8, r10) == r4) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.lingq.core.domain.lesson.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.lingq.core.domain.model.token.TextToSpeechAppVoice, ym5] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.lingq.core.domain.model.audio.DownloadItem, com.lingq.core.domain.model.token.TextToSpeechAppVoice, java.lang.String, ym5] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.lingq.core.domain.model.token.TextToSpeechAppVoice, ym5] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.lingq.core.domain.model.audio.DownloadItem, com.lingq.core.domain.model.token.TextToSpeechAppVoice, java.lang.String, ym5] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.lingq.core.domain.model.audio.AudioFetchErrorType, com.lingq.core.domain.model.audio.DownloadItem, com.lingq.core.domain.model.token.TextToSpeechAppVoice, java.lang.String, ym5] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0248 -> B:20:0x006c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7991b(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        GenerateLessonAudioUseCase$invoke$1 generateLessonAudioUseCase$invoke$1;
        DownloadItem downloadItem;
        Object objM7391f;
        String str2;
        DownloadItem downloadItem2;
        TextToSpeechAppVoice textToSpeechAppVoice;
        int i2;
        Object obj;
        Object objM7243A;
        DownloadItem downloadItem3;
        TextToSpeechAppVoice textToSpeechAppVoice2;
        AudioFetchErrorType audioFetchErrorType;
        ym5 ym5Var;
        DownloadItem downloadItem4;
        String str3;
        DownloadItem downloadItem5;
        TextToSpeechAppVoice textToSpeechAppVoice3;
        ym5 ym5Var2;
        Object obj2;
        ?? r1;
        String str4;
        ?? r2;
        TextToSpeechAppVoice textToSpeechAppVoice4;
        ?? r3;
        AudioFetchErrorType audioFetchErrorType2;
        ?? r4;
        ym5 ym5Var3;
        ?? r5;
        String str5;
        DownloadItem downloadItem6;
        ym5 ym5Var4;
        ?? r6;
        AudioFetchErrorType audioFetchErrorType3;
        String str6;
        String str7;
        int i3;
        DownloadItem downloadItem7;
        String str8;
        ?? r7;
        ?? r8;
        String str9;
        int i4 = i;
        String str10 = str;
        if (continuationImpl instanceof GenerateLessonAudioUseCase$invoke$1) {
            generateLessonAudioUseCase$invoke$1 = (GenerateLessonAudioUseCase$invoke$1) continuationImpl;
            int i5 = generateLessonAudioUseCase$invoke$1.f18666j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                generateLessonAudioUseCase$invoke$1.f18666j = i5 - Integer.MIN_VALUE;
            } else {
                generateLessonAudioUseCase$invoke$1 = new GenerateLessonAudioUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            generateLessonAudioUseCase$invoke$1 = new GenerateLessonAudioUseCase$invoke$1(this, continuationImpl);
        }
        GenerateLessonAudioUseCase$invoke$1 generateLessonAudioUseCase$invoke$2 = generateLessonAudioUseCase$invoke$1;
        Object objM7391f2 = generateLessonAudioUseCase$invoke$2.f18664h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = generateLessonAudioUseCase$invoke$2.f18666j;
        C1307w c1307w = this.f18725b;
        d65 d65Var = this.f18724a;
        switch (i6) {
            case 0:
                AbstractC3193b.m15359b(objM7391f2);
                downloadItem = new DownloadItem(str10, i4, "");
                C2981ey c2981ey = new C2981ey(i4, str10);
                generateLessonAudioUseCase$invoke$2.f18657a = str10;
                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem;
                generateLessonAudioUseCase$invoke$2.f18663g = i4;
                generateLessonAudioUseCase$invoke$2.f18666j = 1;
                this.f18726c.m16254b(c2981ey);
                if (xfa.f68157a != coroutineSingletons) {
                    generateLessonAudioUseCase$invoke$2.f18657a = str10;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem;
                    generateLessonAudioUseCase$invoke$2.f18663g = i4;
                    generateLessonAudioUseCase$invoke$2.f18666j = 2;
                    objM7391f = c1307w.m7391f(str10, generateLessonAudioUseCase$invoke$2);
                    if (objM7391f != coroutineSingletons) {
                        str2 = str10;
                        downloadItem2 = downloadItem;
                        objM7391f2 = objM7391f;
                        textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f2;
                        if (textToSpeechAppVoice != null) {
                            audioFetchErrorType = AudioFetchErrorType.NoVoiceAvailable;
                            generateLessonAudioUseCase$invoke$2.f18657a = null;
                            generateLessonAudioUseCase$invoke$2.f18658b = null;
                            generateLessonAudioUseCase$invoke$2.f18659c = null;
                            generateLessonAudioUseCase$invoke$2.f18663g = i4;
                            generateLessonAudioUseCase$invoke$2.f18666j = 3;
                            if (m7990a(downloadItem2, "error", audioFetchErrorType, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                                return "";
                            }
                        } else {
                            String str11 = textToSpeechAppVoice.f19564b;
                            String str12 = textToSpeechAppVoice.f19563a;
                            generateLessonAudioUseCase$invoke$2.f18657a = str2;
                            generateLessonAudioUseCase$invoke$2.f18658b = downloadItem2;
                            generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice;
                            generateLessonAudioUseCase$invoke$2.f18663g = i4;
                            generateLessonAudioUseCase$invoke$2.f18666j = 4;
                            i2 = i4;
                            obj = null;
                            objM7243A = ((C1295k) d65Var).m7243A(i2, str2, str11, str12, generateLessonAudioUseCase$invoke$2);
                            if (objM7243A != coroutineSingletons) {
                                downloadItem3 = downloadItem2;
                                textToSpeechAppVoice2 = textToSpeechAppVoice;
                                objM7391f2 = objM7243A;
                                ym5Var = (ym5) objM7391f2;
                                if (!(pk9.m19373k(ym5Var) instanceof d25)) {
                                    generateLessonAudioUseCase$invoke$2.f18657a = str2;
                                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem3;
                                    generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice2;
                                    generateLessonAudioUseCase$invoke$2.f18660d = ym5Var;
                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                    generateLessonAudioUseCase$invoke$2.f18666j = 5;
                                    if (c1307w.m7407v(str2, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                                        str3 = str2;
                                        downloadItem5 = downloadItem3;
                                        textToSpeechAppVoice3 = textToSpeechAppVoice2;
                                        ym5Var2 = ym5Var;
                                        obj2 = obj;
                                        generateLessonAudioUseCase$invoke$2.f18657a = str3;
                                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem5;
                                        generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice3;
                                        generateLessonAudioUseCase$invoke$2.f18660d = ym5Var2;
                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                        generateLessonAudioUseCase$invoke$2.f18666j = 6;
                                        objM7391f2 = c1307w.m7391f(str3, generateLessonAudioUseCase$invoke$2);
                                        r2 = obj2;
                                        if (objM7391f2 != coroutineSingletons) {
                                            Object obj3 = objM7391f2;
                                            ym5Var = ym5Var2;
                                            downloadItem4 = downloadItem5;
                                            TextToSpeechAppVoice textToSpeechAppVoice5 = textToSpeechAppVoice3;
                                            textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj3;
                                            if (textToSpeechAppVoice4 != null || fa4.m11650l(textToSpeechAppVoice4.f19563a, textToSpeechAppVoice5.f19563a)) {
                                                str2 = str3;
                                                r1 = r2;
                                                str4 = str2;
                                                r3 = r1;
                                                ym5Var.getClass();
                                                if (ym5Var instanceof xm5) {
                                                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                                    generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                                } else {
                                                    if (pk9.m19373k(ym5Var) instanceof d25) {
                                                        audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                                    } else {
                                                        audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                                    }
                                                    generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                                    generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                                    if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                                        return "";
                                                    }
                                                }
                                            } else {
                                                String str13 = textToSpeechAppVoice4.f19564b;
                                                String str14 = textToSpeechAppVoice4.f19563a;
                                                generateLessonAudioUseCase$invoke$2.f18657a = str3;
                                                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                                generateLessonAudioUseCase$invoke$2.f18659c = r2;
                                                generateLessonAudioUseCase$invoke$2.f18660d = r2;
                                                generateLessonAudioUseCase$invoke$2.f18661e = r2;
                                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                                generateLessonAudioUseCase$invoke$2.f18666j = 7;
                                                String str15 = str3;
                                                objM7391f2 = ((C1295k) d65Var).m7243A(i2, str15, str13, str14, generateLessonAudioUseCase$invoke$2);
                                                if (objM7391f2 != coroutineSingletons) {
                                                    str4 = str15;
                                                    r4 = r2;
                                                    ym5Var = (ym5) objM7391f2;
                                                    r3 = r4;
                                                    ym5Var.getClass();
                                                    if (ym5Var instanceof xm5) {
                                                        generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                                        generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                                        objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                                    } else {
                                                        if (pk9.m19373k(ym5Var) instanceof d25) {
                                                            audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                                        } else {
                                                            audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                                        }
                                                        generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                                        generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                                        if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                                            return "";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    downloadItem4 = downloadItem3;
                                    r1 = obj;
                                    str4 = str2;
                                    r3 = r1;
                                    ym5Var.getClass();
                                    if (ym5Var instanceof xm5) {
                                        generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                        generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                        objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                    } else {
                                        if (pk9.m19373k(ym5Var) instanceof d25) {
                                            audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                        } else {
                                            audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                        }
                                        generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                        generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                        generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                        if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                            return "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 1:
                i4 = generateLessonAudioUseCase$invoke$2.f18663g;
                DownloadItem downloadItem8 = generateLessonAudioUseCase$invoke$2.f18658b;
                String str16 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                downloadItem = downloadItem8;
                str10 = str16;
                generateLessonAudioUseCase$invoke$2.f18657a = str10;
                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem;
                generateLessonAudioUseCase$invoke$2.f18663g = i4;
                generateLessonAudioUseCase$invoke$2.f18666j = 2;
                objM7391f = c1307w.m7391f(str10, generateLessonAudioUseCase$invoke$2);
                if (objM7391f != coroutineSingletons) {
                    str2 = str10;
                    downloadItem2 = downloadItem;
                    objM7391f2 = objM7391f;
                    textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f2;
                    if (textToSpeechAppVoice != null) {
                        audioFetchErrorType = AudioFetchErrorType.NoVoiceAvailable;
                        generateLessonAudioUseCase$invoke$2.f18657a = null;
                        generateLessonAudioUseCase$invoke$2.f18658b = null;
                        generateLessonAudioUseCase$invoke$2.f18659c = null;
                        generateLessonAudioUseCase$invoke$2.f18663g = i4;
                        generateLessonAudioUseCase$invoke$2.f18666j = 3;
                        if (m7990a(downloadItem2, "error", audioFetchErrorType, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                            return "";
                        }
                    } else {
                        String str17 = textToSpeechAppVoice.f19564b;
                        String str18 = textToSpeechAppVoice.f19563a;
                        generateLessonAudioUseCase$invoke$2.f18657a = str2;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem2;
                        generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice;
                        generateLessonAudioUseCase$invoke$2.f18663g = i4;
                        generateLessonAudioUseCase$invoke$2.f18666j = 4;
                        i2 = i4;
                        obj = null;
                        objM7243A = ((C1295k) d65Var).m7243A(i2, str2, str17, str18, generateLessonAudioUseCase$invoke$2);
                        if (objM7243A != coroutineSingletons) {
                            downloadItem3 = downloadItem2;
                            textToSpeechAppVoice2 = textToSpeechAppVoice;
                            objM7391f2 = objM7243A;
                            ym5Var = (ym5) objM7391f2;
                            if (!(pk9.m19373k(ym5Var) instanceof d25)) {
                                generateLessonAudioUseCase$invoke$2.f18657a = str2;
                                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem3;
                                generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice2;
                                generateLessonAudioUseCase$invoke$2.f18660d = ym5Var;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 5;
                                if (c1307w.m7407v(str2, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                                    str3 = str2;
                                    downloadItem5 = downloadItem3;
                                    textToSpeechAppVoice3 = textToSpeechAppVoice2;
                                    ym5Var2 = ym5Var;
                                    obj2 = obj;
                                    generateLessonAudioUseCase$invoke$2.f18657a = str3;
                                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem5;
                                    generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice3;
                                    generateLessonAudioUseCase$invoke$2.f18660d = ym5Var2;
                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                    generateLessonAudioUseCase$invoke$2.f18666j = 6;
                                    objM7391f2 = c1307w.m7391f(str3, generateLessonAudioUseCase$invoke$2);
                                    r2 = obj2;
                                    if (objM7391f2 != coroutineSingletons) {
                                        Object obj4 = objM7391f2;
                                        ym5Var = ym5Var2;
                                        downloadItem4 = downloadItem5;
                                        TextToSpeechAppVoice textToSpeechAppVoice6 = textToSpeechAppVoice3;
                                        textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj4;
                                        if (textToSpeechAppVoice4 != null) {
                                        }
                                        str2 = str3;
                                        r1 = r2;
                                        str4 = str2;
                                        r3 = r1;
                                        ym5Var.getClass();
                                        if (ym5Var instanceof xm5) {
                                            generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                            generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                            generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                            generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                            generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                            generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                            generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                            objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                        } else {
                                            if (pk9.m19373k(ym5Var) instanceof d25) {
                                                audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                            } else {
                                                audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                            }
                                            generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                            generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                            generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                            generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                            generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                            generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                            generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                            if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                                return "";
                                            }
                                        }
                                    }
                                }
                            } else {
                                downloadItem4 = downloadItem3;
                                r1 = obj;
                                str4 = str2;
                                r3 = r1;
                                ym5Var.getClass();
                                if (ym5Var instanceof xm5) {
                                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                    generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                } else {
                                    if (pk9.m19373k(ym5Var) instanceof d25) {
                                        audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                    } else {
                                        audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                    }
                                    generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                    generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                    generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                    if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                        return "";
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 2:
                i4 = generateLessonAudioUseCase$invoke$2.f18663g;
                downloadItem2 = generateLessonAudioUseCase$invoke$2.f18658b;
                String str19 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                str2 = str19;
                textToSpeechAppVoice = (TextToSpeechAppVoice) objM7391f2;
                if (textToSpeechAppVoice != null) {
                    String str110 = textToSpeechAppVoice.f19564b;
                    String str111 = textToSpeechAppVoice.f19563a;
                    generateLessonAudioUseCase$invoke$2.f18657a = str2;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem2;
                    generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice;
                    generateLessonAudioUseCase$invoke$2.f18663g = i4;
                    generateLessonAudioUseCase$invoke$2.f18666j = 4;
                    i2 = i4;
                    obj = null;
                    objM7243A = ((C1295k) d65Var).m7243A(i2, str2, str110, str111, generateLessonAudioUseCase$invoke$2);
                    if (objM7243A != coroutineSingletons) {
                        downloadItem3 = downloadItem2;
                        textToSpeechAppVoice2 = textToSpeechAppVoice;
                        objM7391f2 = objM7243A;
                        ym5Var = (ym5) objM7391f2;
                        if (!(pk9.m19373k(ym5Var) instanceof d25)) {
                            generateLessonAudioUseCase$invoke$2.f18657a = str2;
                            generateLessonAudioUseCase$invoke$2.f18658b = downloadItem3;
                            generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice2;
                            generateLessonAudioUseCase$invoke$2.f18660d = ym5Var;
                            generateLessonAudioUseCase$invoke$2.f18663g = i2;
                            generateLessonAudioUseCase$invoke$2.f18666j = 5;
                            if (c1307w.m7407v(str2, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                                str3 = str2;
                                downloadItem5 = downloadItem3;
                                textToSpeechAppVoice3 = textToSpeechAppVoice2;
                                ym5Var2 = ym5Var;
                                obj2 = obj;
                                generateLessonAudioUseCase$invoke$2.f18657a = str3;
                                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem5;
                                generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice3;
                                generateLessonAudioUseCase$invoke$2.f18660d = ym5Var2;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 6;
                                objM7391f2 = c1307w.m7391f(str3, generateLessonAudioUseCase$invoke$2);
                                r2 = obj2;
                                if (objM7391f2 != coroutineSingletons) {
                                    Object obj5 = objM7391f2;
                                    ym5Var = ym5Var2;
                                    downloadItem4 = downloadItem5;
                                    TextToSpeechAppVoice textToSpeechAppVoice7 = textToSpeechAppVoice3;
                                    textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj5;
                                    if (textToSpeechAppVoice4 != null) {
                                    }
                                    str2 = str3;
                                    r1 = r2;
                                    str4 = str2;
                                    r3 = r1;
                                    ym5Var.getClass();
                                    if (ym5Var instanceof xm5) {
                                        generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                        generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                        objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                                    } else {
                                        if (pk9.m19373k(ym5Var) instanceof d25) {
                                            audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                        } else {
                                            audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                        }
                                        generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                        generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                        generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                        if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                            return "";
                                        }
                                    }
                                }
                            }
                        } else {
                            downloadItem4 = downloadItem3;
                            r1 = obj;
                            str4 = str2;
                            r3 = r1;
                            ym5Var.getClass();
                            if (ym5Var instanceof xm5) {
                                generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                            } else {
                                if (pk9.m19373k(ym5Var) instanceof d25) {
                                    audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                } else {
                                    audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                }
                                generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                    return "";
                                }
                            }
                        }
                    }
                    break;
                } else {
                    audioFetchErrorType = AudioFetchErrorType.NoVoiceAvailable;
                    generateLessonAudioUseCase$invoke$2.f18657a = null;
                    generateLessonAudioUseCase$invoke$2.f18658b = null;
                    generateLessonAudioUseCase$invoke$2.f18659c = null;
                    generateLessonAudioUseCase$invoke$2.f18663g = i4;
                    generateLessonAudioUseCase$invoke$2.f18666j = 3;
                    if (m7990a(downloadItem2, "error", audioFetchErrorType, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                        return "";
                    }
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 3:
                AbstractC3193b.m15359b(objM7391f2);
                return "";
            case 4:
                int i7 = generateLessonAudioUseCase$invoke$2.f18663g;
                textToSpeechAppVoice2 = generateLessonAudioUseCase$invoke$2.f18659c;
                downloadItem3 = generateLessonAudioUseCase$invoke$2.f18658b;
                str2 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i7;
                obj = null;
                ym5Var = (ym5) objM7391f2;
                if (!(pk9.m19373k(ym5Var) instanceof d25)) {
                    downloadItem4 = downloadItem3;
                    r1 = obj;
                    str4 = str2;
                    r3 = r1;
                    ym5Var.getClass();
                    if (ym5Var instanceof xm5) {
                        generateLessonAudioUseCase$invoke$2.f18657a = str4;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 8;
                        objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    } else {
                        if (pk9.m19373k(ym5Var) instanceof d25) {
                            audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                        } else {
                            audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                        }
                        generateLessonAudioUseCase$invoke$2.f18657a = r3;
                        generateLessonAudioUseCase$invoke$2.f18658b = r3;
                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 14;
                        if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                            return "";
                        }
                    }
                    break;
                } else {
                    generateLessonAudioUseCase$invoke$2.f18657a = str2;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem3;
                    generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice2;
                    generateLessonAudioUseCase$invoke$2.f18660d = ym5Var;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 5;
                    if (c1307w.m7407v(str2, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                        str3 = str2;
                        downloadItem5 = downloadItem3;
                        textToSpeechAppVoice3 = textToSpeechAppVoice2;
                        ym5Var2 = ym5Var;
                        obj2 = obj;
                        generateLessonAudioUseCase$invoke$2.f18657a = str3;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem5;
                        generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice3;
                        generateLessonAudioUseCase$invoke$2.f18660d = ym5Var2;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 6;
                        objM7391f2 = c1307w.m7391f(str3, generateLessonAudioUseCase$invoke$2);
                        r2 = obj2;
                        if (objM7391f2 != coroutineSingletons) {
                            Object obj6 = objM7391f2;
                            ym5Var = ym5Var2;
                            downloadItem4 = downloadItem5;
                            TextToSpeechAppVoice textToSpeechAppVoice8 = textToSpeechAppVoice3;
                            textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj6;
                            if (textToSpeechAppVoice4 != null) {
                            }
                            str2 = str3;
                            r1 = r2;
                            str4 = str2;
                            r3 = r1;
                            ym5Var.getClass();
                            if (ym5Var instanceof xm5) {
                                generateLessonAudioUseCase$invoke$2.f18657a = str4;
                                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                                generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 8;
                                objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                            } else {
                                if (pk9.m19373k(ym5Var) instanceof d25) {
                                    audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                                } else {
                                    audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                                }
                                generateLessonAudioUseCase$invoke$2.f18657a = r3;
                                generateLessonAudioUseCase$invoke$2.f18658b = r3;
                                generateLessonAudioUseCase$invoke$2.f18659c = r3;
                                generateLessonAudioUseCase$invoke$2.f18660d = r3;
                                generateLessonAudioUseCase$invoke$2.f18661e = r3;
                                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                                generateLessonAudioUseCase$invoke$2.f18666j = 14;
                                if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                                    return "";
                                }
                            }
                        }
                    }
                    break;
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 5:
                int i8 = generateLessonAudioUseCase$invoke$2.f18663g;
                ym5Var2 = generateLessonAudioUseCase$invoke$2.f18660d;
                textToSpeechAppVoice3 = generateLessonAudioUseCase$invoke$2.f18659c;
                downloadItem5 = generateLessonAudioUseCase$invoke$2.f18658b;
                str3 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i8;
                obj2 = null;
                generateLessonAudioUseCase$invoke$2.f18657a = str3;
                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem5;
                generateLessonAudioUseCase$invoke$2.f18659c = textToSpeechAppVoice3;
                generateLessonAudioUseCase$invoke$2.f18660d = ym5Var2;
                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                generateLessonAudioUseCase$invoke$2.f18666j = 6;
                objM7391f2 = c1307w.m7391f(str3, generateLessonAudioUseCase$invoke$2);
                r2 = obj2;
                if (objM7391f2 != coroutineSingletons) {
                    Object obj7 = objM7391f2;
                    ym5Var = ym5Var2;
                    downloadItem4 = downloadItem5;
                    TextToSpeechAppVoice textToSpeechAppVoice9 = textToSpeechAppVoice3;
                    textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj7;
                    if (textToSpeechAppVoice4 != null) {
                    }
                    str2 = str3;
                    r1 = r2;
                    str4 = str2;
                    r3 = r1;
                    ym5Var.getClass();
                    if (ym5Var instanceof xm5) {
                        generateLessonAudioUseCase$invoke$2.f18657a = str4;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 8;
                        objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    } else {
                        if (pk9.m19373k(ym5Var) instanceof d25) {
                            audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                        } else {
                            audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                        }
                        generateLessonAudioUseCase$invoke$2.f18657a = r3;
                        generateLessonAudioUseCase$invoke$2.f18658b = r3;
                        generateLessonAudioUseCase$invoke$2.f18659c = r3;
                        generateLessonAudioUseCase$invoke$2.f18660d = r3;
                        generateLessonAudioUseCase$invoke$2.f18661e = r3;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 14;
                        if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                            return "";
                        }
                    }
                    break;
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 6:
                int i9 = generateLessonAudioUseCase$invoke$2.f18663g;
                ym5Var2 = generateLessonAudioUseCase$invoke$2.f18660d;
                textToSpeechAppVoice3 = generateLessonAudioUseCase$invoke$2.f18659c;
                downloadItem5 = generateLessonAudioUseCase$invoke$2.f18658b;
                str3 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i9;
                r2 = 0;
                Object obj8 = objM7391f2;
                ym5Var = ym5Var2;
                downloadItem4 = downloadItem5;
                TextToSpeechAppVoice textToSpeechAppVoice10 = textToSpeechAppVoice3;
                textToSpeechAppVoice4 = (TextToSpeechAppVoice) obj8;
                if (textToSpeechAppVoice4 != null) {
                    break;
                }
                str2 = str3;
                r1 = r2;
                str4 = str2;
                r3 = r1;
                ym5Var.getClass();
                if (ym5Var instanceof xm5) {
                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 8;
                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    break;
                } else {
                    if (pk9.m19373k(ym5Var) instanceof d25) {
                        audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                    } else {
                        audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                    }
                    generateLessonAudioUseCase$invoke$2.f18657a = r3;
                    generateLessonAudioUseCase$invoke$2.f18658b = r3;
                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 14;
                    if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                        return "";
                    }
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 7:
                int i10 = generateLessonAudioUseCase$invoke$2.f18663g;
                downloadItem4 = generateLessonAudioUseCase$invoke$2.f18658b;
                str4 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i10;
                r4 = 0;
                ym5Var = (ym5) objM7391f2;
                r3 = r4;
                ym5Var.getClass();
                if (ym5Var instanceof xm5) {
                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 8;
                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    break;
                } else {
                    if (pk9.m19373k(ym5Var) instanceof d25) {
                        audioFetchErrorType2 = AudioFetchErrorType.WrongVoice;
                    } else {
                        audioFetchErrorType2 = AudioFetchErrorType.TtsApiFailed;
                    }
                    generateLessonAudioUseCase$invoke$2.f18657a = r3;
                    generateLessonAudioUseCase$invoke$2.f18658b = r3;
                    generateLessonAudioUseCase$invoke$2.f18659c = r3;
                    generateLessonAudioUseCase$invoke$2.f18660d = r3;
                    generateLessonAudioUseCase$invoke$2.f18661e = r3;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 14;
                    if (m7990a(downloadItem4, "error", audioFetchErrorType2, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                        return "";
                    }
                }
                 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 8:
                int i11 = generateLessonAudioUseCase$invoke$2.f18663g;
                downloadItem4 = generateLessonAudioUseCase$invoke$2.f18658b;
                str4 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i11;
                ?? r9 = 0;
                r9 = r3;
                ym5Var3 = (ym5) objM7391f2;
                r6 = r9;
                if (pk9.m19373k(ym5Var3) instanceof c25) {
                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 9;
                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    if (objM7391f2 != coroutineSingletons) {
                        r5 = r6;
                        str5 = str4;
                        downloadItem6 = downloadItem4;
                        ym5Var4 = (ym5) objM7391f2;
                        iy5 iy5Var = cn2.f10315b;
                        long jM17117e0 = AbstractC3352my.m17117e0(5, DurationUnit.SECONDS);
                        generateLessonAudioUseCase$invoke$2.f18657a = str5;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem6;
                        generateLessonAudioUseCase$invoke$2.f18659c = r5;
                        generateLessonAudioUseCase$invoke$2.f18660d = r5;
                        generateLessonAudioUseCase$invoke$2.f18661e = ym5Var4;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 10;
                        r7 = r5;
                    }
                    break;
                } else if (ym5Var3 instanceof xm5) {
                    str6 = (String) pk9.m19381x(ym5Var3);
                    str7 = downloadItem4.f18842a;
                    i3 = downloadItem4.f18843b;
                    generateLessonAudioUseCase$invoke$2.f18657a = r6;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18662f = str6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 11;
                    if (((C1295k) d65Var).m7265W(i3, str7, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                        downloadItem7 = downloadItem4;
                        str8 = str6;
                        r8 = r6;
                        generateLessonAudioUseCase$invoke$2.f18657a = r8;
                        generateLessonAudioUseCase$invoke$2.f18658b = r8;
                        generateLessonAudioUseCase$invoke$2.f18659c = r8;
                        generateLessonAudioUseCase$invoke$2.f18660d = r8;
                        generateLessonAudioUseCase$invoke$2.f18661e = r8;
                        generateLessonAudioUseCase$invoke$2.f18662f = str8;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 12;
                        if (m7990a(downloadItem7, "idle", r8, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                            str9 = str8;
                            if (str9 == null) {
                                return "";
                            }
                            return str9;
                        }
                    }
                } else {
                    audioFetchErrorType3 = AudioFetchErrorType.TtsApiFailed;
                    generateLessonAudioUseCase$invoke$2.f18657a = r6;
                    generateLessonAudioUseCase$invoke$2.f18658b = r6;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 13;
                    if (m7990a(downloadItem4, "error", audioFetchErrorType3, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                        return "";
                    }
                }
                r9 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 9:
                int i12 = generateLessonAudioUseCase$invoke$2.f18663g;
                downloadItem4 = generateLessonAudioUseCase$invoke$2.f18658b;
                str4 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i12;
                r5 = 0;
                r5 = r6;
                str5 = str4;
                downloadItem6 = downloadItem4;
                ym5Var4 = (ym5) objM7391f2;
                iy5 iy5Var2 = cn2.f10315b;
                long jM17117e1 = AbstractC3352my.m17117e0(5, DurationUnit.SECONDS);
                generateLessonAudioUseCase$invoke$2.f18657a = str5;
                generateLessonAudioUseCase$invoke$2.f18658b = downloadItem6;
                generateLessonAudioUseCase$invoke$2.f18659c = r5;
                generateLessonAudioUseCase$invoke$2.f18660d = r5;
                generateLessonAudioUseCase$invoke$2.f18661e = ym5Var4;
                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                generateLessonAudioUseCase$invoke$2.f18666j = 10;
                r7 = r5;
                break;
            case 10:
                int i13 = generateLessonAudioUseCase$invoke$2.f18663g;
                ym5Var4 = generateLessonAudioUseCase$invoke$2.f18661e;
                downloadItem6 = generateLessonAudioUseCase$invoke$2.f18658b;
                str5 = generateLessonAudioUseCase$invoke$2.f18657a;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i13;
                r7 = 0;
                ym5Var3 = ym5Var4;
                downloadItem4 = downloadItem6;
                str4 = str5;
                r6 = r7;
                if (pk9.m19373k(ym5Var3) instanceof c25) {
                    generateLessonAudioUseCase$invoke$2.f18657a = str4;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 9;
                    objM7391f2 = ((C1295k) d65Var).m7296q(i2, str4, generateLessonAudioUseCase$invoke$2);
                    if (objM7391f2 != coroutineSingletons) {
                        r5 = r6;
                        str5 = str4;
                        downloadItem6 = downloadItem4;
                        ym5Var4 = (ym5) objM7391f2;
                        iy5 iy5Var3 = cn2.f10315b;
                        long jM17117e2 = AbstractC3352my.m17117e0(5, DurationUnit.SECONDS);
                        generateLessonAudioUseCase$invoke$2.f18657a = str5;
                        generateLessonAudioUseCase$invoke$2.f18658b = downloadItem6;
                        generateLessonAudioUseCase$invoke$2.f18659c = r5;
                        generateLessonAudioUseCase$invoke$2.f18660d = r5;
                        generateLessonAudioUseCase$invoke$2.f18661e = ym5Var4;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 10;
                        r7 = r5;
                    }
                    break;
                } else if (ym5Var3 instanceof xm5) {
                    str6 = (String) pk9.m19381x(ym5Var3);
                    str7 = downloadItem4.f18842a;
                    i3 = downloadItem4.f18843b;
                    generateLessonAudioUseCase$invoke$2.f18657a = r6;
                    generateLessonAudioUseCase$invoke$2.f18658b = downloadItem4;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18662f = str6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 11;
                    if (((C1295k) d65Var).m7265W(i3, str7, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                        downloadItem7 = downloadItem4;
                        str8 = str6;
                        r8 = r6;
                        generateLessonAudioUseCase$invoke$2.f18657a = r8;
                        generateLessonAudioUseCase$invoke$2.f18658b = r8;
                        generateLessonAudioUseCase$invoke$2.f18659c = r8;
                        generateLessonAudioUseCase$invoke$2.f18660d = r8;
                        generateLessonAudioUseCase$invoke$2.f18661e = r8;
                        generateLessonAudioUseCase$invoke$2.f18662f = str8;
                        generateLessonAudioUseCase$invoke$2.f18663g = i2;
                        generateLessonAudioUseCase$invoke$2.f18666j = 12;
                        if (m7990a(downloadItem7, "idle", r8, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                            str9 = str8;
                            if (str9 == null) {
                                return "";
                            }
                            return str9;
                        }
                    }
                } else {
                    audioFetchErrorType3 = AudioFetchErrorType.TtsApiFailed;
                    generateLessonAudioUseCase$invoke$2.f18657a = r6;
                    generateLessonAudioUseCase$invoke$2.f18658b = r6;
                    generateLessonAudioUseCase$invoke$2.f18659c = r6;
                    generateLessonAudioUseCase$invoke$2.f18660d = r6;
                    generateLessonAudioUseCase$invoke$2.f18661e = r6;
                    generateLessonAudioUseCase$invoke$2.f18663g = i2;
                    generateLessonAudioUseCase$invoke$2.f18666j = 13;
                    if (m7990a(downloadItem4, "error", audioFetchErrorType3, generateLessonAudioUseCase$invoke$2) == coroutineSingletons) {
                        return "";
                    }
                }
                r9 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 11:
                int i14 = generateLessonAudioUseCase$invoke$2.f18663g;
                str8 = generateLessonAudioUseCase$invoke$2.f18662f;
                downloadItem7 = generateLessonAudioUseCase$invoke$2.f18658b;
                AbstractC3193b.m15359b(objM7391f2);
                i2 = i14;
                r8 = 0;
                generateLessonAudioUseCase$invoke$2.f18657a = r8;
                generateLessonAudioUseCase$invoke$2.f18658b = r8;
                generateLessonAudioUseCase$invoke$2.f18659c = r8;
                generateLessonAudioUseCase$invoke$2.f18660d = r8;
                generateLessonAudioUseCase$invoke$2.f18661e = r8;
                generateLessonAudioUseCase$invoke$2.f18662f = str8;
                generateLessonAudioUseCase$invoke$2.f18663g = i2;
                generateLessonAudioUseCase$invoke$2.f18666j = 12;
                if (m7990a(downloadItem7, "idle", r8, generateLessonAudioUseCase$invoke$2) != coroutineSingletons) {
                    str9 = str8;
                    if (str9 == null) {
                        return "";
                    }
                    return str9;
                }
                r9 = r3;
                r5 = r6;
                return coroutineSingletons;
            case 12:
                str9 = generateLessonAudioUseCase$invoke$2.f18662f;
                AbstractC3193b.m15359b(objM7391f2);
                if (str9 == null) {
                    return "";
                }
                return str9;
            case 13:
                AbstractC3193b.m15359b(objM7391f2);
                return "";
            case 14:
                AbstractC3193b.m15359b(objM7391f2);
                return "";
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
