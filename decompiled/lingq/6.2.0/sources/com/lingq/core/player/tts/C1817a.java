package com.lingq.core.player.tts;

import android.content.Context;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import p000.e83;
import p000.mb1;
import p000.ob1;
import p000.u91;
import p000.vk9;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.player.tts.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1817a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f22158a;

    public C1817a(C1819c c1819c) {
        this.f22158a = c1819c;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        mb1 mb1Var = ob1.Companion;
        C1819c c1819c = this.f22158a;
        Context context = c1819c.f22163a;
        mb1Var.getClass();
        File fileM16744d = mb1.m16744d(context);
        for (TextToSpeechTokenUtterance textToSpeechTokenUtterance : (List) obj) {
            File file = new File(fileM16744d, (String) u91.m22597O0(vk9.m23365A0(textToSpeechTokenUtterance.f19567c, new String[]{"/"}, 0, 6)));
            if (!file.exists()) {
                wfb.m23926u(c1819c.f22164b, c1819c.f22166d, null, new TtsControllerImpl$downloadUtterances$1$1(c1819c, textToSpeechTokenUtterance, file, null), 2);
            }
        }
        return xfa.f68157a;
    }
}
