package com.lingq.feature.chat;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.settings.theme.C1882b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3513qw;
import p000.c32;
import p000.dx0;
import p000.lda;
import p000.m83;
import p000.md0;
import p000.p23;
import p000.ul3;
import p000.v94;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$1(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24849b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$1 chatViewModel$1 = new ChatViewModel$1(this.f24849b, continuation);
        chatViewModel$1.f24848a = obj;
        return chatViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChatViewModel$1 chatViewModel$1 = (ChatViewModel$1) create((Language) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Language language = (Language) this.f24848a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str = language.f19024a;
        C2009m c2009m = this.f24849b;
        C3244l c3244l = c2009m.f25281U;
        while (true) {
            Object value = c3244l.getValue();
            String str2 = str;
            if (c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, str2, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -1048577, 1023))) {
                ul3 ul3Var = c2009m.f25302o;
                ul3Var.getClass();
                str2.getClass();
                C1289e c1289e = (C1289e) ul3Var.f64041a;
                c1289e.getClass();
                C1315c c1315c = c1289e.f16467a;
                String strM23629f = vz1.m23629f(str2, "my_lessons_type=lessons_level=0accent=nullisPersonal=nullisPending=null");
                String value2 = LibraryItemType.Content.getValue();
                c1315c.getClass();
                value2.getClass();
                AbstractC1263a.m7050e(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, true, new String[]{"LibraryDataEntity", "LibraryShelfAndContentJoin"}, new md0(strM23629f, 7, value2)))), new ChatViewModel$observeStudyingLessons$1(c2009m, null), 2), lda.m16103C(c2009m), "observeStudyingLessons_".concat(str2));
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(new C3513qw(AbstractC3224d.m15536o(AbstractC3224d.m15546y(c3244l, new ChatViewModel$observeSuggestions$1(2, null))), 1), new ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1(c2009m, null)), new ChatViewModel$observeSuggestions$4(c2009m, null), 2), lda.m16103C(c2009m));
                wfb.m23926u(lda.m16103C(c2009m), null, null, new ChatViewModel$refreshSuggestions$1(c2009m, false, null), 3);
                AbstractC3224d.m15545x(new m83(c2009m.f25263C.m13285v(c2009m.f25273M.mo4589b2()), new ChatViewModel$observeTtsAvailability$1(c2009m, null), 2), lda.m16103C(c2009m));
                C1882b c1882b = c2009m.f25270J;
                c1882b.getClass();
                AbstractC3224d.m15545x(new m83(c1882b.m8683a(str2, true), new ChatViewModel$observeThemeSettings$1(c2009m, null), 2), lda.m16103C(c2009m));
                p23 p23Var = c2009m.f25268H;
                p23Var.getClass();
                C1289e c1289e2 = (C1289e) p23Var.f55480a;
                c1289e2.getClass();
                AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new dx0(c1289e2.f16472f, str2, 0)), new ChatViewModel$observeChatBotConfig$1(c2009m, null), 2), lda.m16103C(c2009m));
                return xfa.f68157a;
            }
            str = str2;
        }
    }
}
