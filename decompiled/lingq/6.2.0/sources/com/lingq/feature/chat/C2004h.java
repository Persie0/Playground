package com.lingq.feature.chat;

import android.content.Context;
import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.chat.domain.C1996a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3489q9;
import p000.c3a;
import p000.cma;
import p000.dh9;
import p000.e05;
import p000.e28;
import p000.fa4;
import p000.h42;
import p000.iv0;
import p000.ja6;
import p000.jv0;
import p000.kk8;
import p000.lda;
import p000.m83;
import p000.n2a;
import p000.nn5;
import p000.pa6;
import p000.r32;
import p000.sw0;
import p000.t31;
import p000.t66;
import p000.tad;
import p000.tz0;
import p000.u32;
import p000.ud6;
import p000.un1;
import p000.v94;
import p000.vi3;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.wv0;
import p000.xz7;

/* JADX INFO: renamed from: com.lingq.feature.chat.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C2004h implements jv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2009m f25242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un1 f25243b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t31 f25244c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f25245d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f25246e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1909e f25247f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ dh9 f25248g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f25249h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w41 f25250i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ r32 f25251j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ud6 f25252k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t66 f25253l;

    public C2004h(C2009m c2009m, un1 un1Var, t31 t31Var, Context context, vi3 vi3Var, C1909e c1909e, t66 t66Var, t66 t66Var2, w41 w41Var, r32 r32Var, ud6 ud6Var, t66 t66Var3) {
        this.f25242a = c2009m;
        this.f25243b = un1Var;
        this.f25244c = t31Var;
        this.f25245d = context;
        this.f25246e = vi3Var;
        this.f25247f = c1909e;
        this.f25248g = t66Var;
        this.f25249h = t66Var2;
        this.f25250i = w41Var;
        this.f25251j = r32Var;
        this.f25252k = ud6Var;
        this.f25253l = t66Var3;
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: A */
    public final void mo8867A() {
        this.f25242a.m8926c3();
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: B */
    public final void mo8868B() {
        Object value;
        C2009m c2009m = this.f25242a;
        c2009m.f25279S.mo8929h2();
        c2009m.m8923a3();
        C3244l c3244l = c2009m.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, new iv0(16383), null, -1, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -593, 1023)));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: C */
    public final void mo8869C() {
        Object value;
        C3244l c3244l = this.f25242a.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1025, 1023)));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: D */
    public final void mo8870D(int i, ChatMessageRating chatMessageRating) {
        Object value;
        v94 v94Var;
        chatMessageRating.getClass();
        C2009m c2009m = this.f25242a;
        C3244l c3244l = c2009m.f25281U;
        v94 v94Var2 = (v94) c3244l.getValue();
        int i2 = v94Var2.f65059g;
        String str = v94Var2.f65073u;
        Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i));
        if (i2 == -1 || i2 == -2 || str.length() == 0 || v94Var2.f65051O.contains(pair)) {
            return;
        }
        Map map = (Map) v94Var2.f65050N.get(Integer.valueOf(i2));
        ChatMessageRating chatMessageRating2 = map != null ? (ChatMessageRating) map.get(Integer.valueOf(i)) : null;
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, AbstractC3489q9.m19765B(v94Var.f65051O, pair), null, -1, 767)));
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$updateMessageRating$2(c2009m, str, i2, i, chatMessageRating2, chatMessageRating, pair, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: E */
    public final void mo8871E(int i, String str) {
        Object value;
        str.getClass();
        C2009m c2009m = this.f25242a;
        cma cmaVar = c2009m.f25273M;
        wv0 wv0Var = c2009m.f25279S;
        C3244l c3244l = c2009m.f25281U;
        v94 v94Var = (v94) c3244l.getValue();
        if (v94Var.f65049M) {
            c2009m.mo3737M1(UpgradeReason.LYNX_OUT_OF_CREDITS);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("chat language", v94Var.f65073u);
        bundle.putString("dictionary language", v94Var.f65074v);
        bundle.putInt("chat id", v94Var.f65059g);
        ((C1240a) c2009m.f25278R).m7025f("chat message sent", bundle);
        wv0Var.mo8922a1(ChatEngagedDataType.UserResponses, 1);
        ChatEngagedDataType chatEngagedDataType = ChatEngagedDataType.WordsWritten;
        List listM23365A0 = vk9.m23365A0(str, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM23365A0) {
            if (!vk9.m23391n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        wv0Var.mo8922a1(chatEngagedDataType, Integer.valueOf(arrayList.size()));
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, true, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -9, 1023)));
        AbstractC1263a.m7050e(new m83(c2009m.f25294g.m8857a(cmaVar.mo4589b2(), i, cmaVar.mo4580K1(), str), new ChatViewModel$sendReply$3(c2009m, null), 2), lda.m16103C(c2009m), "sendReply");
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: F */
    public final void mo8872F() {
        this.f25252k.m22689f();
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: G */
    public final void mo8873G() {
        this.f25250i.m23737z(new pa6(LqAnalyticsValues$UpgradePopupSource.Chat.getValue(), 14, null));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: H */
    public final void mo8874H(int i, xz7 xz7Var, e28 e28Var) {
        if (!((Boolean) this.f25248g.getValue()).booleanValue()) {
            this.f25242a.mo3737M1(UpgradeReason.LIMIT_WORDS);
            return;
        }
        t66 t66Var = this.f25249h;
        Locale localeForLanguageTag = Locale.forLanguageTag(((tz0) t66Var.getValue()).f63113a);
        String str = xz7Var.f69008e;
        localeForLanguageTag.getClass();
        String strM23610P = vz1.m23610P(str, localeForLanguageTag);
        TokenType tokenType = TokenType.NewWordOrPhraseType;
        int i2 = (int) e28Var.f36621b;
        int i3 = (int) e28Var.f36623d;
        int i4 = (int) e28Var.f36620a;
        int i5 = (int) e28Var.f36622c;
        this.f25247f.m8760d3(new c3a(new TokenPopupData(str, strM23610P, tokenType, i2, i3, new TokenFragmentData("", 0), TokenViewState.Collapsed.f23708a, TokenControllerType.Lesson, null, xz7Var.f69009f, xz7Var.f69013j, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, i4, i5, ((tz0) t66Var.getValue()).f63116d.f63041f, i, false, ((tz0) t66Var.getValue()).f63114b, null, false, 6818048, null), true));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: a */
    public final void mo8875a() {
        this.f25253l.setValue(Boolean.TRUE);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: c */
    public final void mo8876c() {
        C2009m c2009m = this.f25242a;
        c2009m.m8920Y2();
        c2009m.m8926c3();
        this.f25252k.m22689f();
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: d */
    public final void mo8877d(String str) {
        str.getClass();
        wfb.m23926u(this.f25243b, null, null, new ChatScreenKt$ChatRoute$5$1$onCopyClicked$1(this.f25244c, str, this.f25245d, this.f25246e, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: e */
    public final void mo8878e(String str) {
        str.getClass();
        this.f25242a.m8927d3(str);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: f */
    public final void mo8879f(String str) {
        Object value;
        Object value2;
        LynxChatModel lynxChatModel;
        kk8 kk8VarM8858b;
        str.getClass();
        sw0 sw0Var = new sw0(str);
        C2009m c2009m = this.f25242a;
        cma cmaVar = c2009m.f25273M;
        C3244l c3244l = c2009m.f25281U;
        v94 v94Var = (v94) c3244l.getValue();
        boolean z = v94Var.f65049M;
        nn5 nn5Var = v94Var.f65048L;
        if (z) {
            c2009m.mo3737M1(UpgradeReason.LYNX_OUT_OF_CREDITS);
            return;
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, true, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -9, 1023)));
        Bundle bundle = new Bundle();
        bundle.putString("chat language", v94Var.f65073u);
        bundle.putString("dictionary language", v94Var.f65074v);
        c2009m.m8923a3();
        do {
            value2 = c3244l.getValue();
        } while (!c3244l.m15570h(value2, v94.m23191a((v94) value2, null, null, false, false, new iv0(12287), null, -2, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -593, 1023)));
        LynxChatModel lynxChatModel2 = nn5Var.f52997a;
        if (!v94Var.f65047K || lynxChatModel2 == null) {
            lynxChatModel = lynxChatModel2;
            kk8VarM8858b = c2009m.f25292e.m8858b(cmaVar.mo4589b2(), cmaVar.mo4580K1(), sw0Var, str);
        } else {
            C1996a c1996a = c2009m.f25293f;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            LynxReasoningEffort lynxReasoningEffort = nn5Var.f52998b;
            lynxChatModel = lynxChatModel2;
            kk8VarM8858b = c1996a.m8859c(strMo4589b2, strMo4580K1, sw0Var, str, lynxChatModel, lynxReasoningEffort);
        }
        AbstractC1263a.m7050e(new m83(kk8VarM8858b, new ChatViewModel$startNewChat$3(lynxChatModel, c2009m, v94Var, null), 2), lda.m16103C(c2009m), "startNewChat");
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: g */
    public final void mo8880g(ChatMessage chatMessage) {
        Object value;
        v94 v94Var;
        LinkedHashMap linkedHashMapM15372Y;
        int i = chatMessage.f18920a;
        C2009m c2009m = this.f25242a;
        C3244l c3244l = c2009m.f25281U;
        v94 v94Var2 = (v94) c3244l.getValue();
        Bundle bundle = new Bundle();
        bundle.putString("chat language", v94Var2.f65073u);
        bundle.putString("dictionary language", v94Var2.f65074v);
        bundle.putInt("chat id", v94Var2.f65059g);
        ((C1240a) c2009m.f25278R).m7025f("chat suggested phrases button clicked", bundle);
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
            linkedHashMapM15372Y = AbstractC3194a.m15372Y(v94Var.f65057e.f44640l);
            Integer numValueOf = Integer.valueOf(i);
            Object obj = linkedHashMapM15372Y.get(Integer.valueOf(i));
            PhrasesState phrasesState = PhrasesState.Hidden;
            if (obj == phrasesState) {
                phrasesState = PhrasesState.Showing;
            }
            linkedHashMapM15372Y.put(numValueOf, phrasesState);
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0.m14155a(v94Var.f65057e, null, linkedHashMapM15372Y, false, null, 14335), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -17, 1023)));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: h */
    public final void mo8881h(int i) {
        int i2 = i;
        C2009m c2009m = this.f25242a;
        wv0 wv0Var = c2009m.f25279S;
        C3244l c3244l = c2009m.f25281U;
        if (((v94) c3244l.getValue()).f65059g == i2) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("chat language", ((v94) c3244l.getValue()).f65073u);
        bundle.putString("dictionary language", ((v94) c3244l.getValue()).f65074v);
        bundle.putInt("chat id", i2);
        ((C1240a) c2009m.f25278R).m7025f("previous chat opened", bundle);
        wv0Var.mo8929h2();
        c2009m.m8923a3();
        wv0Var.mo8928e(((v94) c3244l.getValue()).f65073u, i2, ((v94) c3244l.getValue()).f65074v);
        wv0Var.mo8924b(new DateTime());
        while (true) {
            Object value = c3244l.getValue();
            C3244l c3244l2 = c3244l;
            if (c3244l2.m15570h(value, v94.m23191a((v94) value, null, null, false, false, new iv0(16383), null, i2, null, null, true, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -593, 1023))) {
                return;
            }
            i2 = i;
            c3244l = c3244l2;
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: i */
    public final void mo8882i(int i) {
        C2009m c2009m = this.f25242a;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$importChat$1(c2009m, i, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: j */
    public final void mo8883j() {
        this.f25242a.mo3737M1(UpgradeReason.LYNX_OUT_OF_CREDITS);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: k */
    public final void mo8884k(LynxReasoningEffort lynxReasoningEffort) {
        C2009m c2009m = this.f25242a;
        LynxChatModel lynxChatModel = ((v94) c2009m.f25281U.getValue()).f65048L.f52997a;
        if (lynxChatModel == null) {
            return;
        }
        if (lynxReasoningEffort == null || !lynxChatModel.getSupportedEfforts().contains(lynxReasoningEffort)) {
            lynxReasoningEffort = null;
        }
        c2009m.m8919X2(lynxChatModel, lynxReasoningEffort);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: l */
    public final void mo8885l() {
        Object value;
        C3244l c3244l = this.f25242a.f25281U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1, 1022)));
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: m */
    public final void mo8886m() {
        C2009m c2009m = this.f25242a;
        c2009m.m8920Y2();
        c2009m.m8926c3();
        this.f25247f.m8760d3(n2a.f52243a);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: n */
    public final void mo8887n(int i, xz7 xz7Var, TokenType tokenType, e28 e28Var) {
        tokenType.getClass();
        e28Var.getClass();
        TokenType tokenType2 = TokenType.CardType;
        C2009m c2009m = this.f25242a;
        TokenType tokenType3 = tokenType;
        if (tokenType3 != tokenType2 && !((Boolean) this.f25248g.getValue()).booleanValue()) {
            c2009m.mo3737M1(UpgradeReason.LIMIT_WORDS);
            return;
        }
        C3244l c3244l = c2009m.f25281U;
        while (true) {
            Object value = c3244l.getValue();
            if (c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, new Pair(-1, null), new Pair(Integer.valueOf(i), Integer.valueOf(xz7Var.f69009f)), null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -393217, 1023))) {
                String str = xz7Var.f69008e;
                t66 t66Var = this.f25249h;
                String strM23609O = vz1.m23609O(str, ((tz0) t66Var.getValue()).f63113a);
                int i2 = (int) e28Var.f36621b;
                int i3 = (int) e28Var.f36623d;
                int i4 = (int) e28Var.f36620a;
                int i5 = (int) e28Var.f36622c;
                this.f25247f.m8760d3(new c3a(new TokenPopupData(str, strM23609O, tokenType3, i2, i3, new TokenFragmentData("", 0), TokenViewState.Collapsed.f23708a, TokenControllerType.Lesson, null, xz7Var.f69009f, xz7Var.f69013j, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, i4, i5, ((tz0) t66Var.getValue()).f63116d.f63041f, i, false, ((tz0) t66Var.getValue()).f63114b, null, false, 6818048, null), true));
                return;
            }
            tokenType3 = tokenType;
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: o */
    public final void mo8888o(String str) {
        if (vk9.m23391n0(str)) {
            return;
        }
        tad tadVarM22429b = new u32(str, this.f25242a.f25273M.mo4589b2(), true).m22429b();
        if (!(tadVarM22429b instanceof h42)) {
            mo8876c();
            this.f25251j.mo8247e0(str, 0L);
            return;
        }
        Integer num = ((h42) tadVarM22429b).f41768b;
        if (num != null) {
            this.f25250i.m23737z(new ja6(num.intValue(), 0, "", LqAnalyticsValues$LessonPath.Unknown.f14315a));
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: p */
    public final void mo8889p(int i) {
        C2009m c2009m = this.f25242a;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$deleteChat$1(c2009m, i, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: q */
    public final void mo8890q() {
        C2009m c2009m = this.f25242a;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$clearSearch$1(c2009m, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: r */
    public final void mo8891r(e05 e05Var) {
        e05Var.getClass();
        C2009m c2009m = this.f25242a;
        if (c2009m.f25273M.mo4595s1()) {
            wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$addPhrase$1(c2009m, e05Var, null), 3);
        } else {
            c2009m.mo3737M1(UpgradeReason.LIMIT_WORDS);
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: s */
    public final void mo8892s(String str) {
        str.getClass();
        C2009m c2009m = this.f25242a;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$onSearch$1(c2009m, str, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: t */
    public final void mo8893t(int i, xz7 xz7Var, TokenType tokenType, boolean z, e28 e28Var) {
        C2004h c2004h = this;
        xz7Var.getClass();
        String str = xz7Var.f69008e;
        tokenType.getClass();
        e28Var.getClass();
        TokenType tokenType2 = TokenType.CardType;
        C2009m c2009m = c2004h.f25242a;
        if (tokenType != tokenType2 && !((Boolean) c2004h.f25248g.getValue()).booleanValue()) {
            c2009m.mo3737M1(UpgradeReason.LIMIT_WORDS);
            return;
        }
        boolean z2 = true;
        wv0 wv0Var = c2009m.f25279S;
        String strM23609O = vz1.m23609O(str, c2009m.f25273M.mo4589b2());
        LessonWord lessonWord = (LessonWord) ((Map) c2009m.f25284X.getValue()).get(strM23609O);
        LessonCard lessonCard = (LessonCard) ((Map) c2009m.f25283W.getValue()).get(strM23609O);
        if (lessonWord != null && fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue()) && lessonCard == null) {
            wv0Var.mo8922a1(ChatEngagedDataType.BlueWordsClicked, 1);
        } else if (lessonWord != null && fa4.m11650l(lessonWord.f19322i, WordStatus.Known.getValue()) && lessonCard == null) {
            wv0Var.mo8922a1(ChatEngagedDataType.KnownWordsClicked, 1);
        }
        C3244l c3244l = c2009m.f25281U;
        while (true) {
            Object value = c3244l.getValue();
            v94 v94Var = (v94) value;
            if (c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, new Pair(Integer.valueOf(i), Integer.valueOf(xz7Var.f69009f)), new Pair(Integer.valueOf(z ? ((Number) v94Var.f65071s.f47623a).intValue() : -1), z ? (Integer) v94Var.f65071s.f47624b : null), null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -393217, 1023))) {
                t66 t66Var = c2004h.f25249h;
                this.f25247f.m8760d3(new c3a(new TokenPopupData(str, vz1.m23609O(str, ((tz0) t66Var.getValue()).f63113a), tokenType, (int) e28Var.f36621b, (int) e28Var.f36623d, new TokenFragmentData("", 0), TokenViewState.Collapsed.f23708a, TokenControllerType.Lesson, null, xz7Var.f69009f, xz7Var.f69013j, false, xz7Var.f69010g, xz7Var.f69011h, xz7Var.f69017n, (int) e28Var.f36620a, (int) e28Var.f36622c, ((tz0) t66Var.getValue()).f63116d.f63041f, i, false, ((tz0) t66Var.getValue()).f63114b, null, false, 6818048, null), true));
                return;
            }
            str = str;
            c2004h = c2004h;
            z2 = z2;
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: u */
    public final void mo8894u() {
        C2009m c2009m = this.f25242a;
        wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$refreshSuggestions$1(c2009m, true, null), 3);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: v */
    public final void mo8895v(String str) {
        this.f25242a.m8927d3(str);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: w */
    public final void mo8896w(ChatPhrase chatPhrase, TokenStatus tokenStatus) {
        tokenStatus.getClass();
        C2009m c2009m = this.f25242a;
        boolean zMo4595s1 = c2009m.f25273M.mo4595s1();
        boolean z = chatPhrase.f18941e == null && tokenStatus != TokenStatus.Ignored;
        if (zMo4595s1 || !z) {
            wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$updatePhraseStatus$1(tokenStatus, c2009m, chatPhrase, null), 3);
        } else {
            c2009m.mo3737M1(UpgradeReason.LIMIT_WORDS);
        }
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: x */
    public final void mo8897x() {
        this.f25242a.m8919X2(null, null);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: y */
    public final void mo8898y(LynxChatModel lynxChatModel) {
        lynxChatModel.getClass();
        C2009m c2009m = this.f25242a;
        LynxReasoningEffort lynxReasoningEffort = ((v94) c2009m.f25281U.getValue()).f65048L.f52998b;
        if (lynxReasoningEffort == null || !lynxChatModel.getSupportedEfforts().contains(lynxReasoningEffort)) {
            lynxReasoningEffort = null;
        }
        c2009m.m8919X2(lynxChatModel, lynxReasoningEffort);
    }

    @Override // p000.jv0
    /* JADX INFO: renamed from: z */
    public final void mo8899z(ChatMessage chatMessage) {
        Object value;
        v94 v94Var;
        LinkedHashMap linkedHashMapM15372Y;
        int i = chatMessage.f18920a;
        C2009m c2009m = this.f25242a;
        C3244l c3244l = c2009m.f25281U;
        v94 v94Var2 = (v94) c3244l.getValue();
        Bundle bundle = new Bundle();
        bundle.putString("chat language", v94Var2.f65073u);
        bundle.putString("dictionary language", v94Var2.f65074v);
        bundle.putInt("chat id", v94Var2.f65059g);
        ((C1240a) c2009m.f25278R).m7025f("chat translation button clicked", bundle);
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
            linkedHashMapM15372Y = AbstractC3194a.m15372Y(v94Var.f65057e.f44639k);
            TranslationState translationState = (TranslationState) linkedHashMapM15372Y.get(Integer.valueOf(i));
            boolean z = false;
            if (translationState == null ? !(fa4.m11650l(chatMessage.f18921b, "user") || !v94Var.f65052P.f65661b) : translationState == TranslationState.Showing) {
                z = true;
            }
            linkedHashMapM15372Y.put(Integer.valueOf(i), z ? TranslationState.Hidden : TranslationState.Showing);
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0.m14155a(v94Var.f65057e, linkedHashMapM15372Y, null, false, null, 15359), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -17, 1023)));
    }
}
