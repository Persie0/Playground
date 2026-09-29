package com.lingq.feature.chat;

import com.lingq.core.domain.model.theme.ReaderFont;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$setFont$1", m4291f = "ChatViewModel.kt", m4292l = {1891, 1893}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$setFont$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25009a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f25010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f25011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderFont f25012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$setFont$1(boolean z, C2009m c2009m, ReaderFont readerFont, Continuation continuation) {
        super(2, continuation);
        this.f25010b = z;
        this.f25011c = c2009m;
        this.f25012d = readerFont;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$setFont$1(this.f25010b, this.f25011c, this.f25012d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$setFont$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r1).m7893n(r2, r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r4.f25288b.mo8237v1(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25009a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ReaderFont readerFont = this.f25012d;
            boolean z = this.f25010b;
            C2009m c2009m = this.f25011c;
            if (z) {
                si7 si7Var = c2009m.f25272L;
                String strMo4589b2 = c2009m.f25273M.mo4589b2();
                this.f25009a = 1;
            } else {
                this.f25009a = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
