package com.lingq.core.player.tts;

import android.net.Uri;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import java.io.File;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ada;
import p000.e83;
import p000.fa4;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.player.tts.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1818b implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f22159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f22160b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22161c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f22162d;

    public C1818b(C1819c c1819c, boolean z, String str, float f) {
        this.f22159a = c1819c;
        this.f22160b = z;
        this.f22161c = str;
        this.f22162d = f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(TextToSpeechTokenUtterance textToSpeechTokenUtterance, Continuation continuation) throws Throwable {
        TtsControllerImpl$fetchUtterance$3$emit$1 ttsControllerImpl$fetchUtterance$3$emit$1;
        Object value;
        if (continuation instanceof TtsControllerImpl$fetchUtterance$3$emit$1) {
            ttsControllerImpl$fetchUtterance$3$emit$1 = (TtsControllerImpl$fetchUtterance$3$emit$1) continuation;
            int i = ttsControllerImpl$fetchUtterance$3$emit$1.f22057c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$fetchUtterance$3$emit$1.f22057c = i - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$fetchUtterance$3$emit$1 = new TtsControllerImpl$fetchUtterance$3$emit$1(this, continuation);
            }
        } else {
            ttsControllerImpl$fetchUtterance$3$emit$1 = new TtsControllerImpl$fetchUtterance$3$emit$1(this, continuation);
        }
        TtsControllerImpl$fetchUtterance$3$emit$1 ttsControllerImpl$fetchUtterance$3$emit$2 = ttsControllerImpl$fetchUtterance$3$emit$1;
        Object objM8476a = ttsControllerImpl$fetchUtterance$3$emit$2.f22055a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ttsControllerImpl$fetchUtterance$3$emit$2.f22057c;
        xfa xfaVar = xfa.f68157a;
        C1819c c1819c = this.f22159a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8476a);
            if (textToSpeechTokenUtterance != null) {
                ttsControllerImpl$fetchUtterance$3$emit$2.f22057c = 1;
                objM8476a = C1819c.m8476a(c1819c, textToSpeechTokenUtterance, ttsControllerImpl$fetchUtterance$3$emit$2);
                if (objM8476a != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM8476a);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM8476a);
        File file = (File) objM8476a;
        if (file != null) {
            c1819c.m8491l();
            String str = this.f22161c;
            boolean z = this.f22160b;
            if (z) {
                C3244l c3244l = c1819c.f22174l;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, new ada(str, true, z, false)));
            }
            if (!fa4.m11650l(str, c1819c.f22180r) && !c1819c.f22181s) {
                Uri uriFromFile = Uri.fromFile(file);
                uriFromFile.getClass();
                ttsControllerImpl$fetchUtterance$3$emit$2.f22057c = 2;
                if (C1819c.m8479e(c1819c, uriFromFile, this.f22160b, this.f22162d, this.f22161c, ttsControllerImpl$fetchUtterance$3$emit$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }
}
