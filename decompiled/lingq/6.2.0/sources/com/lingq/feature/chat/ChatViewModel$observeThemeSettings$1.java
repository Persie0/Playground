package com.lingq.feature.chat;

import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.nz9;
import p000.v94;
import p000.vs3;
import p000.xfa;
import p000.yz7;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeThemeSettings$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeThemeSettings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeThemeSettings$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24986b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeThemeSettings$1 chatViewModel$observeThemeSettings$1 = new ChatViewModel$observeThemeSettings$1(this.f24986b, continuation);
        chatViewModel$observeThemeSettings$1.f24985a = obj;
        return chatViewModel$observeThemeSettings$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$observeThemeSettings$1 chatViewModel$observeThemeSettings$1 = (ChatViewModel$observeThemeSettings$1) create((nz9) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeThemeSettings$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        int i;
        double d;
        List list;
        ReaderFont readerFont;
        Pair pair;
        yz7 yz7Var;
        vs3 vs3Var;
        TextHighlightStyle textHighlightStyle;
        boolean z;
        boolean z2;
        ReaderPageMode readerPageMode;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        AudioUnderlineMode audioUnderlineMode;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        List list2;
        String str;
        List list3;
        String str2;
        nz9 nz9Var = (nz9) this.f24985a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C3244l c3244l = this.f24986b.f25281U;
        do {
            value = c3244l.getValue();
            i = nz9Var.f53455a;
            d = nz9Var.f53456b;
            list = nz9Var.f53457c;
            readerFont = nz9Var.f53458d;
            pair = nz9Var.f53459e;
            yz7Var = nz9Var.f53460f;
            vs3Var = nz9Var.f53461g;
            textHighlightStyle = nz9Var.f53462h;
            z = nz9Var.f53463i;
            z2 = nz9Var.f53464j;
            readerPageMode = nz9Var.f53465k;
            z3 = nz9Var.f53466l;
            z4 = nz9Var.f53468n;
            z5 = nz9Var.f53469o;
            z6 = nz9Var.f53470p;
            audioUnderlineMode = nz9Var.f53471q;
            z7 = nz9Var.f53472r;
            z8 = nz9Var.f53473s;
            z9 = nz9Var.f53474t;
            z10 = nz9Var.f53475u;
            list2 = nz9Var.f53476v;
            str = nz9Var.f53477w;
            list3 = nz9Var.f53478x;
            str2 = nz9Var.f53479y;
            list.getClass();
            readerFont.getClass();
            yz7Var.getClass();
            vs3Var.getClass();
            textHighlightStyle.getClass();
            readerPageMode.getClass();
            audioUnderlineMode.getClass();
            list2.getClass();
            str.getClass();
            list3.getClass();
            str2.getClass();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, new nz9(i, d, list, readerFont, pair, yz7Var, vs3Var, textHighlightStyle, z, z2, readerPageMode, z3, false, z4, z5, z6, audioUnderlineMode, z7, z8, z9, z10, list2, str, list3, str2), null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -524289, 1023)));
        return xfa.f68157a;
    }
}
