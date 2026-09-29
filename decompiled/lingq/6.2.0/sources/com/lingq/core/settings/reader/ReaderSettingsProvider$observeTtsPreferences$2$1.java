package com.lingq.core.settings.reader;

import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bda;
import p000.c32;
import p000.e83;
import p000.rz7;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeTtsPreferences$2$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {85, 87}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeTtsPreferences$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23051a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rz7 f23053c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23054d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1879a f23055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsProvider$observeTtsPreferences$2$1(rz7 rz7Var, String str, C1879a c1879a, Continuation continuation) {
        super(2, continuation);
        this.f23053c = rz7Var;
        this.f23054d = str;
        this.f23055e = c1879a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderSettingsProvider$observeTtsPreferences$2$1 readerSettingsProvider$observeTtsPreferences$2$1 = new ReaderSettingsProvider$observeTtsPreferences$2$1(this.f23053c, this.f23054d, this.f23055e, continuation);
        readerSettingsProvider$observeTtsPreferences$2$1.f23052b = obj;
        return readerSettingsProvider$observeTtsPreferences$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsProvider$observeTtsPreferences$2$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r15 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r0.emit(r7, r14) == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        e83 e83Var = (e83) this.f23052b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23051a;
        rz7 rz7Var = this.f23053c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        Map map5 = rz7Var.f60090d;
        String str2 = this.f23054d;
        String str3 = (String) map5.get(str2);
        if (str2.length() <= 0 || str3 == null || vk9.m23391n0(str3)) {
            str = null;
            boolean z = rz7Var.f60087a;
            boolean z2 = rz7Var.f60088b;
            boolean z3 = rz7Var.f60089c;
            map = rz7Var.f60090d;
            if (map.isEmpty()) {
                map2 = null;
            } else {
                map2 = map;
            }
            map3 = rz7Var.f60091e;
            if (map3.isEmpty()) {
                map4 = null;
            } else {
                map4 = map3;
            }
            bda bdaVar = new bda(z, z2, z3, map2, str, map4);
            this.f23052b = null;
            this.f23051a = 2;
        } else {
            C1307w c1307w = this.f23055e.f23071d;
            this.f23052b = e83Var;
            this.f23051a = 1;
            obj = c1307w.m7403r(str2, str3, true, this);
        }
        return coroutineSingletons;
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) obj;
        if (textToSpeechVoice != null) {
            str = textToSpeechVoice.f19571b;
        } else {
            str = null;
        }
        boolean z4 = rz7Var.f60087a;
        boolean z5 = rz7Var.f60088b;
        boolean z6 = rz7Var.f60089c;
        map = rz7Var.f60090d;
        if (map.isEmpty()) {
            map2 = map;
        } else {
            map2 = null;
        }
        map3 = rz7Var.f60091e;
        if (map3.isEmpty()) {
            map4 = map3;
        } else {
            map4 = null;
        }
        bda bdaVar2 = new bda(z4, z5, z6, map2, str, map4);
        this.f23052b = null;
        this.f23051a = 2;
    }
}
