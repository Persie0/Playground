package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import p000.bx7;
import p000.c3a;
import p000.dh9;
import p000.j3a;
import p000.kt7;
import p000.lbb;
import p000.lda;
import p000.lt7;
import p000.mqa;
import p000.mt7;
import p000.n2a;
import p000.nt7;
import p000.ot7;
import p000.p2a;
import p000.pt7;
import p000.t66;
import p000.vi3;
import p000.vz1;
import p000.w65;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2584b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31394a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31395b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f31396c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1909e f31397d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dh9 f31398e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f31399f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f31400g;

    public /* synthetic */ C2584b(C2583a c2583a, C1909e c1909e, boolean z, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f31395b = c2583a;
        this.f31397d = c1909e;
        this.f31396c = z;
        this.f31399f = t66Var;
        this.f31398e = t66Var2;
        this.f31400g = t66Var3;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f31394a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f31399f;
        dh9 dh9Var = this.f31398e;
        C1909e c1909e = this.f31397d;
        Object obj2 = this.f31400g;
        C2583a c2583a = this.f31395b;
        switch (i) {
            case 0:
                t66 t66Var2 = (t66) obj2;
                j3a j3aVar = (j3a) obj;
                j3aVar.getClass();
                if ((j3aVar instanceof n2a) || (j3aVar instanceof p2a)) {
                    c2583a.m9509V2(mqa.f51747a);
                    c1909e.m8760d3(j3aVar);
                    if (this.f31396c) {
                        t66Var.setValue(VideoSidePanelContent.Vocabulary);
                    }
                    if (((bx7) dh9Var.getValue()).f9143g) {
                        t66Var2.setValue(lbb.f49418a);
                    }
                } else {
                    c1909e.m8760d3(j3aVar);
                }
                break;
            default:
                String str = (String) obj2;
                pt7 pt7Var = (pt7) obj;
                pt7Var.getClass();
                if (!(pt7Var instanceof ot7)) {
                    if (pt7Var instanceof lt7) {
                        lt7 lt7Var = (lt7) pt7Var;
                        String str2 = lt7Var.f50115a;
                        TokenStatus tokenStatus = lt7Var.f50116b;
                        str2.getClass();
                        tokenStatus.getClass();
                        wfb.m23926u(lda.m16103C(c2583a), null, null, new ReaderVideoComposeViewModel$updateCardStatus$1(c2583a, str2, tokenStatus, null), 3);
                    } else if (pt7Var instanceof kt7) {
                        kt7 kt7Var = (kt7) pt7Var;
                        String str3 = kt7Var.f48414a;
                        String str4 = kt7Var.f48415b;
                        str3.getClass();
                        str4.getClass();
                        wfb.m23926u(lda.m16103C(c2583a), null, null, new ReaderVideoComposeViewModel$moveWordToKnownOrIgnored$1(c2583a, str3, str4, null), 3);
                    } else if (pt7Var instanceof nt7) {
                        w65 w65Var = ((nt7) pt7Var).f53240a;
                        w65Var.getClass();
                        wfb.m23926u(lda.m16103C(c2583a), null, null, new ReaderVideoComposeViewModel$playTts$1(c2583a, w65Var, null), 3);
                    } else if (pt7Var instanceof mt7) {
                        w65 w65Var2 = ((mt7) pt7Var).f51828a;
                        TokenType tokenType = w65Var2 instanceof LessonWord ? TokenType.WordType : ((w65Var2 instanceof LessonCard) && ((LessonCard) w65Var2).f19182e) ? TokenType.NewWordOrPhraseType : TokenType.CardType;
                        TokenType tokenType2 = tokenType;
                        String strMo8037d = w65Var2.mo8037d();
                        String strM23609O = vz1.m23609O(w65Var2.mo8037d(), str);
                        TokenFragmentData tokenFragmentData = new TokenFragmentData();
                        TokenControllerType tokenControllerType = TokenControllerType.LessonVideo;
                        LessonCard lessonCard = w65Var2 instanceof LessonCard ? (LessonCard) w65Var2 : null;
                        boolean z = lessonCard != null && lessonCard.f19182e;
                        TokenViewState.Expanded expanded = TokenViewState.Expanded.f23709a;
                        boolean z2 = this.f31396c;
                        c1909e.m8760d3(new c3a(new TokenPopupData(strMo8037d, strM23609O, tokenType2, 0, 0, tokenFragmentData, expanded, tokenControllerType, null, 0, null, false, 0, 0, null, 0, 0, 0, 0, z2, null, null, z, 3669784, null), false));
                        if (z2) {
                            t66Var.setValue(VideoSidePanelContent.TokenPopup);
                        }
                    }
                } else if (!((Boolean) dh9Var.getValue()).booleanValue()) {
                    c2583a.mo3737M1(UpgradeReason.LIMIT_WORDS);
                } else {
                    LessonWord lessonWord = ((ot7) pt7Var).f54969a;
                    lessonWord.getClass();
                    wfb.m23926u(lda.m16103C(c2583a), null, null, new ReaderVideoComposeViewModel$addWordAsCard$1(lessonWord, c2583a, null), 3);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C2584b(C2583a c2583a, String str, boolean z, C1909e c1909e, t66 t66Var, t66 t66Var2) {
        this.f31395b = c2583a;
        this.f31400g = str;
        this.f31396c = z;
        this.f31397d = c1909e;
        this.f31398e = t66Var;
        this.f31399f = t66Var2;
    }
}
