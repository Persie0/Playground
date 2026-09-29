package com.lingq.core.settings;

import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.settings.domain.C1863b;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$onSelectionItemSelected$2", m4291f = "ReaderSettingsViewModel.kt", m4292l = {353, 363}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$onSelectionItemSelected$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$onSelectionItemSelected$2(C1859b c1859b, String str, Continuation continuation) {
        super(2, continuation);
        this.f22617b = c1859b;
        this.f22618c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$onSelectionItemSelected$2(this.f22617b, this.f22618c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$onSelectionItemSelected$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r9.m8624g(r1, r6, r8) == r0) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object next;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22616a;
        C1859b c1859b = this.f22617b;
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
        C1863b c1863b = c1859b.f22732n;
        String strMo4589b2 = c1859b.f22720b.mo4589b2();
        this.f22616a = 1;
        obj = c1863b.m8618a(strMo4589b2, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        Iterator it = ((Iterable) obj).iterator();
        do {
            boolean zHasNext = it.hasNext();
            str = this.f22618c;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((TextToSpeechVoice) next).f19571b, str));
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) next;
        boolean z = (textToSpeechVoice == null || (list = textToSpeechVoice.f19578i) == null || !list.contains("premium") || c1859b.f22720b.mo4593p0() || c1859b.f22720b.mo4592m0()) ? false : true;
        if (textToSpeechVoice != null && textToSpeechVoice.m8125e() && !c1859b.f22720b.mo4588a0() && !c1859b.f22720b.mo4592m0()) {
            c1859b.mo3737M1(UpgradeReason.VOICES);
        } else if (z) {
            c1859b.mo3737M1(UpgradeReason.VOICES_PREMIUM);
        } else {
            c1859b.f22735q.m15571i(null);
            C3244l c3244l = c1859b.f22736r;
            c3244l.getClass();
            c3244l.m15572j(null, EmptyList.f47638a);
            C1863b c1863b2 = c1859b.f22732n;
            String strMo4589b3 = c1859b.f22720b.mo4589b2();
            this.f22616a = 2;
        }
        return xfa.f68157a;
    }
}
