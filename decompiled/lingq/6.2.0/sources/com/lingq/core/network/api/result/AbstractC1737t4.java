package com.lingq.core.network.api.result;

import com.lingq.core.database.entity.TtsUtteranceEntity;
import com.lingq.core.domain.model.token.C1487c;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import java.util.Locale;
import p000.vk9;

/* JADX INFO: renamed from: com.lingq.core.network.api.result.t4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1737t4 {
    /* JADX INFO: renamed from: a */
    public static final TtsUtteranceEntity m8407a(ResultTtsUtterance resultTtsUtterance, Locale locale, String str, String str2) {
        resultTtsUtterance.getClass();
        ResultTtsUtterance.Requested requested = resultTtsUtterance.f21627b;
        ResultTtsUtterance.Generated generated = resultTtsUtterance.f21628c;
        str.getClass();
        if (str2 == null) {
            str2 = generated.f21632b.f21644c;
            if (vk9.m23391n0(str2)) {
                str2 = requested.f21649d;
            }
        }
        C1487c c1487c = TextToSpeechTokenUtterance.Companion;
        String str3 = requested.f21646a;
        String str4 = requested.f21647b;
        c1487c.getClass();
        return new TtsUtteranceEntity(C1487c.m8136a(locale, str2, str, str3, str4), generated.f21631a, resultTtsUtterance.f21630e, vk9.m23376L0(str).toString());
    }
}
