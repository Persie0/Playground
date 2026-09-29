package com.lingq.feature.chat;

import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import com.lingq.core.common.network.C1262a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.chat.C1373a;
import com.lingq.core.domain.chat.C1374b;
import com.lingq.core.domain.lesson.C1380b;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1537e;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.p012ui.highlightedtext.domain.C1933a;
import com.lingq.core.premium.UpgradeUserType;
import com.lingq.core.settings.theme.C1882b;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.chat.domain.C1996a;
import com.lingq.feature.chat.domain.C1997b;
import com.lingq.feature.chat.domain.C1998c;
import com.lingq.feature.chat.domain.C1999d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3513qw;
import p000.C3540rl;
import p000.a23;
import p000.a7d;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.dz0;
import p000.eh9;
import p000.ez0;
import p000.g41;
import p000.hi8;
import p000.hm5;
import p000.iv0;
import p000.km7;
import p000.kv0;
import p000.l3a;
import p000.lda;
import p000.m58;
import p000.m83;
import p000.nl8;
import p000.nn5;
import p000.nz9;
import p000.p23;
import p000.pha;
import p000.qn3;
import p000.rm3;
import p000.sca;
import p000.si7;
import p000.tx0;
import p000.tz0;
import p000.ul3;
import p000.ux5;
import p000.v14;
import p000.v18;
import p000.v94;
import p000.va3;
import p000.vj6;
import p000.vk9;
import p000.vn5;
import p000.vs3;
import p000.wa2;
import p000.wfb;
import p000.wl3;
import p000.wta;
import p000.wv0;
import p000.wx0;
import p000.wz0;
import p000.xa2;
import p000.xfa;
import p000.xi9;
import p000.xx0;
import p000.yz0;
import p000.yz7;
import p000.z13;
import p000.zw0;

/* JADX INFO: renamed from: com.lingq.feature.chat.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C2009m extends wta implements cma, l3a, va3, pha, bia, wv0 {

    /* JADX INFO: renamed from: A */
    public final C1999d f25261A;

    /* JADX INFO: renamed from: B */
    public final C1999d f25262B;

    /* JADX INFO: renamed from: C */
    public final hi8 f25263C;

    /* JADX INFO: renamed from: D */
    public final p23 f25264D;

    /* JADX INFO: renamed from: E */
    public final z13 f25265E;

    /* JADX INFO: renamed from: F */
    public final ul3 f25266F;

    /* JADX INFO: renamed from: G */
    public final C1999d f25267G;

    /* JADX INFO: renamed from: H */
    public final p23 f25268H;

    /* JADX INFO: renamed from: I */
    public final qn3 f25269I;

    /* JADX INFO: renamed from: J */
    public final C1882b f25270J;

    /* JADX INFO: renamed from: K */
    public final sca f25271K;

    /* JADX INFO: renamed from: L */
    public final si7 f25272L;

    /* JADX INFO: renamed from: M */
    public final cma f25273M;

    /* JADX INFO: renamed from: N */
    public final bia f25274N;

    /* JADX INFO: renamed from: O */
    public final l3a f25275O;

    /* JADX INFO: renamed from: P */
    public final C1997b f25276P;

    /* JADX INFO: renamed from: Q */
    public final pha f25277Q;

    /* JADX INFO: renamed from: R */
    public final hm5 f25278R;

    /* JADX INFO: renamed from: S */
    public final wv0 f25279S;

    /* JADX INFO: renamed from: T */
    public final String f25280T;

    /* JADX INFO: renamed from: U */
    public final C3244l f25281U;

    /* JADX INFO: renamed from: V */
    public final C3244l f25282V;

    /* JADX INFO: renamed from: W */
    public final C3244l f25283W;

    /* JADX INFO: renamed from: X */
    public final C3244l f25284X;

    /* JADX INFO: renamed from: Y */
    public final C3244l f25285Y;

    /* JADX INFO: renamed from: Z */
    public final C3244l f25286Z;

    /* JADX INFO: renamed from: a0 */
    public final c18 f25287a0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ va3 f25288b;

    /* JADX INFO: renamed from: b0 */
    public Integer f25289b0;

    /* JADX INFO: renamed from: c */
    public final C1374b f25290c;

    /* JADX INFO: renamed from: d */
    public final C1999d f25291d;

    /* JADX INFO: renamed from: e */
    public final C1996a f25292e;

    /* JADX INFO: renamed from: f */
    public final C1996a f25293f;

    /* JADX INFO: renamed from: g */
    public final C1996a f25294g;

    /* JADX INFO: renamed from: h */
    public final C1373a f25295h;

    /* JADX INFO: renamed from: i */
    public final C1933a f25296i;

    /* JADX INFO: renamed from: j */
    public final C1998c f25297j;

    /* JADX INFO: renamed from: k */
    public final a23 f25298k;

    /* JADX INFO: renamed from: l */
    public final a23 f25299l;

    /* JADX INFO: renamed from: m */
    public final C1533a f25300m;

    /* JADX INFO: renamed from: n */
    public final C1537e f25301n;

    /* JADX INFO: renamed from: o */
    public final ul3 f25302o;

    /* JADX INFO: renamed from: p */
    public final wl3 f25303p;

    /* JADX INFO: renamed from: q */
    public final m58 f25304q;

    /* JADX INFO: renamed from: r */
    public final z13 f25305r;

    /* JADX INFO: renamed from: s */
    public final a23 f25306s;

    /* JADX INFO: renamed from: t */
    public final wa2 f25307t;

    /* JADX INFO: renamed from: u */
    public final C1380b f25308u;

    /* JADX INFO: renamed from: v */
    public final vj6 f25309v;

    /* JADX INFO: renamed from: w */
    public final C1533a f25310w;

    /* JADX INFO: renamed from: x */
    public final xa2 f25311x;

    /* JADX INFO: renamed from: y */
    public final wa2 f25312y;

    /* JADX INFO: renamed from: z */
    public final p23 f25313z;

    /* JADX WARN: Multi-variable type inference failed */
    public C2009m(C1374b c1374b, C1999d c1999d, C1996a c1996a, C1996a c1996a2, C1996a c1996a3, C1373a c1373a, C1933a c1933a, C1998c c1998c, C1998c c1998c2, a23 a23Var, a23 a23Var2, C1533a c1533a, C1537e c1537e, ul3 ul3Var, wl3 wl3Var, m58 m58Var, z13 z13Var, a23 a23Var3, wa2 wa2Var, C1380b c1380b, vj6 vj6Var, C1533a c1533a2, xa2 xa2Var, wa2 wa2Var2, p23 p23Var, C1999d c1999d2, C1999d c1999d3, hi8 hi8Var, rm3 rm3Var, p23 p23Var2, z13 z13Var2, ul3 ul3Var2, C1999d c1999d4, p23 p23Var3, qn3 qn3Var, C1882b c1882b, sca scaVar, si7 si7Var, km7 km7Var, cma cmaVar, bia biaVar, l3a l3aVar, C1262a c1262a, C1997b c1997b, pha phaVar, hm5 hm5Var, wv0 wv0Var, va3 va3Var, nl8 nl8Var) {
        scaVar.getClass();
        si7Var.getClass();
        km7Var.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        l3aVar.getClass();
        phaVar.getClass();
        hm5Var.getClass();
        wv0Var.getClass();
        va3Var.getClass();
        nl8Var.getClass();
        this.f25288b = va3Var;
        this.f25290c = c1374b;
        this.f25291d = c1999d;
        this.f25292e = c1996a;
        this.f25293f = c1996a2;
        this.f25294g = c1996a3;
        this.f25295h = c1373a;
        this.f25296i = c1933a;
        this.f25297j = c1998c2;
        this.f25298k = a23Var;
        this.f25299l = a23Var2;
        this.f25300m = c1533a;
        this.f25301n = c1537e;
        this.f25302o = ul3Var;
        this.f25303p = wl3Var;
        this.f25304q = m58Var;
        this.f25305r = z13Var;
        this.f25306s = a23Var3;
        this.f25307t = wa2Var;
        this.f25308u = c1380b;
        this.f25309v = vj6Var;
        this.f25310w = c1533a2;
        this.f25311x = xa2Var;
        this.f25312y = wa2Var2;
        this.f25313z = p23Var;
        this.f25261A = c1999d2;
        this.f25262B = c1999d3;
        this.f25263C = hi8Var;
        this.f25264D = p23Var2;
        this.f25265E = z13Var2;
        this.f25266F = ul3Var2;
        this.f25267G = c1999d4;
        this.f25268H = p23Var3;
        this.f25269I = qn3Var;
        this.f25270J = c1882b;
        this.f25271K = scaVar;
        this.f25272L = si7Var;
        this.f25273M = cmaVar;
        this.f25274N = biaVar;
        this.f25275O = l3aVar;
        this.f25276P = c1997b;
        this.f25277Q = phaVar;
        this.f25278R = hm5Var;
        this.f25279S = wv0Var;
        String str = (String) nl8Var.m17488b("openLocation");
        this.f25280T = str == null ? "" : str;
        Integer num = (Integer) nl8Var.m17488b("chatId");
        int iIntValue = num != null ? num.intValue() : -1;
        int i = 1;
        boolean z = iIntValue != -1;
        iv0 iv0Var = new iv0(16383);
        Map mapM15360M = AbstractC3194a.m15360M();
        Map mapM15360M2 = AbstractC3194a.m15360M();
        Map mapM15360M3 = AbstractC3194a.m15360M();
        Map mapM15360M4 = AbstractC3194a.m15360M();
        Pair pair = new Pair(-1, null);
        Pair pair2 = new Pair(-1, null);
        Pair pair3 = new Pair(-1, null);
        nz9 nz9Var = new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431);
        UpgradeUserType upgradeUserType = UpgradeUserType.FreeTrial;
        Map mapM15360M5 = AbstractC3194a.m15360M();
        Map mapM15360M6 = AbstractC3194a.m15360M();
        Map mapM15360M7 = AbstractC3194a.m15360M();
        Map mapM15360M8 = AbstractC3194a.m15360M();
        ChatMode chatMode = ChatMode.Standard;
        kv0 kv0Var = new kv0();
        nn5 nn5Var = new nn5(null, null);
        Map mapM15360M9 = AbstractC3194a.m15360M();
        vn5 vn5Var = new vn5(false, true, LqTheme.System, true, true);
        EmptyList emptyList = EmptyList.f47638a;
        xx0 xx0Var = xx0.f68916a;
        v14 v14Var = v14.f64693a;
        a7d a7dVar = ez0.f38099a;
        int i2 = 0;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new v94(emptyList, emptyList, false, false, iv0Var, xx0Var, iIntValue, null, v14Var, z, false, false, mapM15360M, mapM15360M2, mapM15360M3, mapM15360M4, pair, pair2, pair3, nz9Var, "", "", a7dVar, "", null, true, upgradeUserType, mapM15360M5, mapM15360M6, mapM15360M7, mapM15360M8, true, false, chatMode, kv0Var, "", false, nn5Var, false, mapM15360M9, EmptySet.f47640a, vn5Var));
        this.f25281U = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25282V = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25283W = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25284X = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25285Y = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f25286Z = c3244lM17114d6;
        this.f25287a0 = AbstractC3224d.m15520B(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$state$1(this, null)), lda.m16103C(this), xi9.f68262a, new tz0((482 & 1) != 0 ? "en" : cmaVar.mo4589b2(), "en", (482 & 4) != 0 ? xx0.f68916a : wx0.f67466a, (482 & 8) != 0 ? new tx0(null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 65535) : new tx0(null, null == true ? 1 : 0, null == true ? 1 : 0, 65535), (482 & 16) != 0 ? dz0.f36437a : a7dVar, ChatMode.Standard, new kv0(), "", null));
        int i3 = 5;
        int i4 = 2;
        AbstractC3224d.m15545x(new m83(new C3540rl(cmaVar.mo4572B0(), i3), new ChatViewModel$1(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(cmaVar.mo4585R(), new ChatViewModel$2(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(cmaVar.mo4577H(), new ChatViewModel$3(this, null), i4), lda.m16103C(this));
        int i5 = 3;
        AbstractC3224d.m15545x(new m83(new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$4(2, null))), i5), new ChatViewModel$6(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$7(2, null))), new ChatViewModel$8(this, null), i4), lda.m16103C(this));
        AbstractC1263a.m7050e(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$9(2, null))), new ChatViewModel$10(this, null), i4), lda.m16103C(this), "lessonDataForChat");
        AbstractC1263a.m7050e(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$11(2, null))), new ChatViewModel$12(this, null), i4), lda.m16103C(this), "searchChats");
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$13(2, null))), new ChatViewModel$14(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$15(2, null))), new ChatViewModel$16(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$17(2, null))), new ChatViewModel$18(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$19(2, null))), 4), new ChatViewModel$21(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15546y(phaVar.mo8562V0(), new ChatViewModel$22(this, null))), new ChatViewModel$23(this, null), i4), lda.m16103C(this));
        wfb.m23926u(lda.m16103C(this), null, null, new ChatViewModel$24(this, null), 3);
        AbstractC3224d.m15545x(new m83(c1262a.f14392b, new ChatViewModel$25(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new wz0(i, new c83[]{AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$26(2, null))), AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$27(2, null))), ((C1368a) rm3Var.f59534a).f18387Y0, c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, c3244lM17114d6}, this), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15535n(new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15531j(c3244lM17114d, c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, new ChatViewModel$29(5, null))), i4), 750L), new ChatViewModel$31(this, null), i4), lda.m16103C(this));
        C1368a c1368a = (C1368a) si7Var;
        AbstractC3224d.m15545x(new m83(c1368a.f18333D1, new ChatViewModel$32(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1998c.m8861a(), new ChatViewModel$33(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(new wz0(4, new wz0(i4, new yz0(new C3540rl(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$34(2, null))), i5), i2), this), this), new ChatViewModel$special$$inlined$flatMapLatest$1(this, null)), new ChatViewModel$39(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3540rl(new C3540rl(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$40(2, null))), i5), i3), new ChatViewModel$41(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$42(2, null))), i3), new ChatViewModel$44(this, null), i4), lda.m16103C(this));
        AbstractC3224d.m15545x(new m83(c1368a.f18363N1, new ChatViewModel$45(this, null), i4), lda.m16103C(this));
        AbstractC1263a.m7050e(new m83(new wz0(i5, AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244lM17114d, new ChatViewModel$46(2, null))), this), new ChatViewModel$48(this, null), i4), lda.m16103C(this), "lynxModelConfig");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: V2 */
    public static final Object m8916V2(C2009m c2009m, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ChatViewModel$awaitRefreshedSuggestions$1 chatViewModel$awaitRefreshedSuggestions$1;
        Object value;
        Object value2;
        Object value3;
        boolean z2 = z;
        C3244l c3244l = c2009m.f25281U;
        if (continuationImpl instanceof ChatViewModel$awaitRefreshedSuggestions$1) {
            chatViewModel$awaitRefreshedSuggestions$1 = (ChatViewModel$awaitRefreshedSuggestions$1) continuationImpl;
            int i = chatViewModel$awaitRefreshedSuggestions$1.f24929d;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatViewModel$awaitRefreshedSuggestions$1.f24929d = i - Integer.MIN_VALUE;
            } else {
                chatViewModel$awaitRefreshedSuggestions$1 = new ChatViewModel$awaitRefreshedSuggestions$1(c2009m, continuationImpl);
            }
        } else {
            chatViewModel$awaitRefreshedSuggestions$1 = new ChatViewModel$awaitRefreshedSuggestions$1(c2009m, continuationImpl);
        }
        Object obj = chatViewModel$awaitRefreshedSuggestions$1.f24927b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatViewModel$awaitRefreshedSuggestions$1.f24929d;
        Integer num = null;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                String str = ((v94) c3244l.getValue()).f65073u;
                if (!vk9.m23391n0(str)) {
                    v94 v94Var = (v94) c3244l.getValue();
                    int i3 = v94Var.f65057e.f44630b;
                    Integer numValueOf = Integer.valueOf(i3);
                    if (i3 <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        int i4 = v94Var.f65059g;
                        Integer numValueOf2 = Integer.valueOf(i4);
                        if (i4 > 0) {
                            num = numValueOf2;
                        }
                    } else {
                        num = numValueOf;
                    }
                    if (z2) {
                        do {
                            value2 = c3244l.getValue();
                        } while (!c3244l.m15570h(value2, v94.m23191a((v94) value2, null, null, true, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -5, 1023)));
                    }
                    m58 m58Var = c2009m.f25304q;
                    chatViewModel$awaitRefreshedSuggestions$1.f24926a = z2;
                    chatViewModel$awaitRefreshedSuggestions$1.f24929d = 1;
                    Object objM7158h = ((C1289e) ((zw0) m58Var.f50618b)).m7158h(str, num, chatViewModel$awaitRefreshedSuggestions$1);
                    if (objM7158h != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM7158h = xfaVar;
                    }
                    if (objM7158h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfaVar;
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = chatViewModel$awaitRefreshedSuggestions$1.f24926a;
            AbstractC3193b.m15359b(obj);
            if (z2) {
                do {
                    value3 = c3244l.getValue();
                } while (!c3244l.m15570h(value3, v94.m23191a((v94) value3, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -5, 1023)));
            }
            return xfaVar;
        } catch (Throwable th) {
            if (z2) {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -5, 1023)));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: W2 */
    public static final void m8917W2(C2009m c2009m, UpgradeReason upgradeReason) {
        Object value;
        v94 v94Var;
        C3244l c3244l = c2009m.f25281U;
        do {
            value = c3244l.getValue();
            v94Var = (v94) value;
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0.m14155a(v94Var.f65057e, null, null, false, null, 4095), null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, v94Var.f65049M || upgradeReason == UpgradeReason.LYNX_OUT_OF_CREDITS, null, null, null, -1041, 959)));
        c2009m.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f25273M.mo4571A();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f25275O.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f25275O.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f25273M.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f25273M.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f25273M.mo4574C1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: D */
    public final void mo8549D(String str) {
        this.f25277Q.mo8549D(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f25273M.mo4575D0(continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f25275O.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f25275O.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f25275O.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f25273M.mo4576F1(str, continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: F2 */
    public final boolean mo8550F2(String str) {
        return this.f25277Q.mo8550F2(str);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f25273M.mo4577H();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H1 */
    public final String mo8551H1() {
        return this.f25277Q.mo8551H1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: H2 */
    public final void mo8552H2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f25277Q.mo8552H2(str, str2);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I */
    public final void mo8553I() {
        this.f25277Q.mo8553I();
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: I0 */
    public final eh9 mo8236I0() {
        return this.f25288b.mo8236I0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: I1 */
    public final eh9 mo8554I1() {
        return this.f25277Q.mo8554I1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f25275O.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f25273M.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f25273M.mo4579K(continuation);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K0 */
    public final String mo8555K0() {
        return this.f25277Q.mo8555K0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f25273M.mo4580K1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: K2 */
    public final c83 mo8556K2() {
        return this.f25277Q.mo8556K2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f25273M.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f25275O.mo8743L2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f25274N.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f25273M.mo4582N();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: N1 */
    public final c83 mo8557N1() {
        return this.f25277Q.mo8557N1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f25273M.mo4583O1();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: O2 */
    public final void mo8558O2() {
        this.f25277Q.mo8558O2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: P2 */
    public final eh9 mo8559P2() {
        return this.f25277Q.mo8559P2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f25273M.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f25273M.mo4585R();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: R0 */
    public final void mo8560R0(String str) {
        this.f25277Q.mo8560R0(str);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: S0 */
    public final String mo8561S0() {
        return this.f25277Q.mo8561S0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f25275O.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f25273M.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f25275O.mo8747U1();
    }

    @Override // p000.wta
    /* JADX INFO: renamed from: U2 */
    public final void mo8918U2() {
        this.f25279S.mo8929h2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: V0 */
    public final eh9 mo8562V0() {
        return this.f25277Q.mo8562V0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f25275O.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f25275O.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: W1 */
    public final c83 mo8564W1() {
        return this.f25277Q.mo8564W1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f25273M.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m8919X2(LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort) {
        Object value;
        C3244l c3244l = this.f25281U;
        v94 v94Var = (v94) c3244l.getValue();
        int i = v94Var.f65059g;
        String str = v94Var.f65073u;
        if (i != -1 && i != -2 && str.length() > 0) {
            wfb.m23926u(lda.m16103C(this), null, null, new ChatViewModel$applyLynxModelConfig$2(this, str, i, lynxChatModel, lynxReasoningEffort, null), 3);
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, new nn5(lynxChatModel, lynxReasoningEffort), false, null, null, null, -1, 991)));
        }
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: Y */
    public final c83 mo8565Y() {
        return this.f25277Q.mo8565Y();
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m8920Y2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f25281U;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, new Pair(-1, null), new Pair(-1, null), new Pair(-1, null), null, null, null, null, null, false, null, null, null, null, null, false, true, null, null, null, false, null, false, null, null, null, -17235969, 1022)));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f25274N.mo3738Z();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m8921Z2(String str, String str2, String str3) {
        m83 m83Var = new m83(this.f25291d.m8863a(str, str2, str3), new ChatViewModel$observeChats$1(this, str3, null), 2);
        g41 g41VarM16103C = lda.m16103C(this);
        StringBuilder sbM23000w = ux5.m23000w("observeChats_", str, "_", str2, "_");
        sbM23000w.append(str3);
        AbstractC1263a.m7050e(m83Var, g41VarM16103C, sbM23000w.toString());
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f25273M.mo4588a0();
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: a1 */
    public final void mo8922a1(ChatEngagedDataType chatEngagedDataType, Integer num) {
        chatEngagedDataType.getClass();
        this.f25279S.mo8922a1(chatEngagedDataType, num);
    }

    /* JADX INFO: renamed from: a3 */
    public final void m8923a3() {
        C3244l c3244l;
        Object value;
        v94 v94Var;
        iv0 iv0VarM14155a;
        Pair pair;
        Map mapM15360M;
        Pair pair2;
        C3244l c3244l2;
        Object value2;
        C3244l c3244l3;
        Object value3;
        C3244l c3244l4;
        Object value4;
        do {
            c3244l = this.f25281U;
            value = c3244l.getValue();
            v94Var = (v94) value;
            iv0VarM14155a = iv0.m14155a(v94Var.f65057e, AbstractC3194a.m15360M(), AbstractC3194a.m15360M(), false, null, 13310);
            pair = new Pair(-1, null);
            mapM15360M = AbstractC3194a.m15360M();
            pair2 = new Pair(-1, null);
        } while (!c3244l.m15570h(value, v94.m23191a(v94Var, null, null, false, false, iv0VarM14155a, null, 0, new ChatStats(0.0d, 0, 63), null, false, false, false, mapM15360M, AbstractC3194a.m15360M(), null, null, pair2, pair, new Pair(-1, null), null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -17251473, 1023)));
        do {
            c3244l2 = this.f25282V;
            value2 = c3244l2.getValue();
        } while (!c3244l2.m15570h(value2, AbstractC3194a.m15360M()));
        do {
            c3244l3 = this.f25283W;
            value3 = c3244l3.getValue();
        } while (!c3244l3.m15570h(value3, AbstractC3194a.m15360M()));
        do {
            c3244l4 = this.f25284X;
            value4 = c3244l4.getValue();
        } while (!c3244l4.m15570h(value4, AbstractC3194a.m15360M()));
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: b */
    public final void mo8924b(DateTime dateTime) {
        this.f25279S.mo8924b(dateTime);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f25275O.mo8756b0();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: b1 */
    public final eh9 mo8566b1() {
        return this.f25277Q.mo8566b1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f25273M.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m8925b3() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f25281U;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, v14.f64693a, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -257, 1023)));
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f25275O.mo8758c();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: c0 */
    public final void mo8567c0(Purchase purchase) {
        this.f25277Q.mo8567c0(purchase);
    }

    /* JADX INFO: renamed from: c3 */
    public final void m8926c3() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f25281U;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, true, null, null, null, false, null, false, null, null, null, -1, 1022)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f25273M.mo4590d0();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m8927d3(String str) {
        str.getClass();
        v94 v94Var = (v94) this.f25281U.getValue();
        Bundle bundle = new Bundle();
        bundle.putString("chat language", v94Var.f65073u);
        bundle.putString("dictionary language", v94Var.f65074v);
        bundle.putInt("chat id", v94Var.f65059g);
        ((C1240a) this.f25278R).m7025f("chat tts button clicked", bundle);
        int size = (vk9.m23365A0(str, new String[]{" "}, 0, 6).size() * 60) / 150;
        this.f25279S.mo8922a1(ChatEngagedDataType.TimeSpentListening, Integer.valueOf(size));
        wfb.m23926u(lda.m16103C(this), null, null, new ChatViewModel$tts$1(this, str, null), 3);
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: e */
    public final void mo8928e(String str, int i, String str2) {
        this.f25279S.mo8928e(str, i, str2);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f25275O.mo8761f();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: f1 */
    public final String mo8568f1() {
        return this.f25277Q.mo8568f1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f25273M.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: h2 */
    public final void mo8929h2() {
        this.f25279S.mo8929h2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f25275O.mo8765i();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: i2 */
    public final void mo8569i2(int i) {
        this.f25277Q.mo8569i2(i);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f25275O.mo8767j();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f25274N.mo3739j2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: k1 */
    public final void mo8570k1(List list) {
        list.getClass();
        this.f25277Q.mo8570k1(list);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f25274N.mo3740k2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l */
    public final eh9 mo8571l() {
        return this.f25277Q.mo8571l();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: l1 */
    public final eh9 mo8572l1() {
        return this.f25277Q.mo8572l1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f25273M.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f25275O.mo8769n0();
    }

    @Override // p000.wv0
    /* JADX INFO: renamed from: n2 */
    public final void mo8930n2() {
        this.f25279S.mo8930n2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o */
    public final void mo8573o(Purchase purchase, v18 v18Var) {
        this.f25277Q.mo8573o(purchase, v18Var);
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: o0 */
    public final String mo8574o0() {
        return this.f25277Q.mo8574o0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f25273M.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f25275O.mo8770p1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f25275O.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f25275O.mo8773q2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f25274N.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f25273M.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f25275O.mo8774r2(i);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f25274N.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f25273M.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f25275O.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f25273M.mo4596t();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: v */
    public final eh9 mo8575v() {
        return this.f25277Q.mo8575v();
    }

    @Override // p000.va3
    /* JADX INFO: renamed from: v1 */
    public final Object mo8237v1(ReaderFont readerFont, ContinuationImpl continuationImpl) {
        return this.f25288b.mo8237v1(readerFont, continuationImpl);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f25275O.mo8779v2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f25273M.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f25273M.mo4598w2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: x2 */
    public final eh9 mo8576x2() {
        return this.f25277Q.mo8576x2();
    }

    @Override // p000.pha
    /* JADX INFO: renamed from: y2 */
    public final eh9 mo8577y2() {
        return this.f25277Q.mo8577y2();
    }
}
