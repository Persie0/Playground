package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import com.google.protobuf.ByteString;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.feature.chat.PhrasesState;
import com.lingq.feature.chat.TranslationState;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u6d {
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX INFO: renamed from: a */
    public static final void m22516a(nz9 nz9Var, jv0 jv0Var, ye1 ye1Var, int i) {
        int i2;
        p84 p84Var;
        boolean z;
        Object objM22097O;
        boolean z2;
        nz9Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-950160342);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(jv0Var) : tj3Var.m22124i(jv0Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            Object objM22097O2 = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O2 == p84Var2) {
                objM22097O2 = ew0.f37974a;
                tj3Var.m22131l0(objM22097O2);
            }
            int i3 = i2;
            e16 e16VarM16957a = mo9.m16957a(b16Var, xfa.f68157a, (PointerInputEventHandler) objM22097O2);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM16957a);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            m22517b(nz9Var, tj3Var, (i3 & 14) | 8);
            tj3Var.m22139q(true);
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.m198b(0.6f, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4211d()), ss5.f61356d);
            ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52812g, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d3);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32 || ((i3 & 64) != 0 && tj3Var.m22124i(jv0Var));
            Object objM22097O3 = tj3Var.m22097O();
            if (z3) {
                p84Var = p84Var2;
            } else {
                p84Var = p84Var2;
                if (objM22097O3 == p84Var) {
                }
                ui3 ui3Var2 = (ui3) objM22097O3;
                if (i4 != 32 || ((i3 & 64) != 0 && tj3Var.m22124i(jv0Var))) {
                    z = true;
                } else {
                    z = false;
                }
                objM22097O = tj3Var.m22097O();
                if (!z || objM22097O == p84Var) {
                    z2 = true;
                    objM22097O = new aw0(jv0Var, 1 == true ? 1 : 0);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    z2 = true;
                }
                m22518c(ui3Var2, (ui3) objM22097O, tj3Var, 0);
                tj3Var.m22139q(z2);
                tj3Var.m22139q(z2);
            }
            objM22097O3 = new aw0(jv0Var, 0);
            tj3Var.m22131l0(objM22097O3);
            ui3 ui3Var3 = (ui3) objM22097O3;
            if (i4 != 32) {
                z = true;
            } else {
                z = true;
            }
            objM22097O = tj3Var.m22097O();
            if (z) {
                z2 = true;
                objM22097O = new aw0(jv0Var, 1 == true ? 1 : 0);
                tj3Var.m22131l0(objM22097O);
            } else {
                z2 = true;
                objM22097O = new aw0(jv0Var, 1 == true ? 1 : 0);
                tj3Var.m22131l0(objM22097O);
            }
            m22518c(ui3Var3, (ui3) objM22097O, tj3Var, 0);
            tj3Var.m22139q(z2);
            tj3Var.m22139q(z2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(nz9Var, i, 4, jv0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m22517b(nz9 nz9Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(942744853);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ChatMessage chatMessage = new ChatMessage(1, 464, "user", "User", "Hola, me gustaría practicar mi nuevo idioma.", "Hello, I would like to practice my new language.", (String) null, (String) null, (List) null);
            int i4 = 0;
            boolean z = false;
            xz7 xz7Var = new xz7(0, 4, 0, 0, "Hola", 1, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092);
            WordStatus wordStatus = WordStatus.Known;
            q7b q7bVar = new q7b(xz7Var, false, true, i4, (Integer) null, wordStatus.getValue(), false, z, 474);
            xz7 xz7Var2 = new xz7(9, 17, 0, 0, "gustaría", 2, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092);
            WordStatus wordStatus2 = WordStatus.New;
            q7b q7bVar2 = new q7b(xz7Var2, false, true, i4, (Integer) null, wordStatus2.getValue(), false, z, 474);
            xz7 xz7Var3 = new xz7(18, 27, 0, 0, "practicar", 3, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092);
            CardStatus cardStatus = CardStatus.New;
            q7b q7bVar3 = new q7b(xz7Var3, true, false, cardStatus.getValue(), (Integer) null, (String) null, false, z, 500);
            q7b q7bVar4 = new q7b(new xz7(30, 36, 0, 0, "nuevo", 4, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), false, true, 0, (Integer) null, wordStatus2.getValue(), false, z, 474);
            xz7 xz7Var4 = new xz7(37, 43, 0, 0, "idioma", 5, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092);
            CardStatus cardStatus2 = CardStatus.Recognized;
            String str = null;
            jw0 jw0Var = new jw0(chatMessage, vz1.m23605K(q7bVar, q7bVar2, q7bVar3, q7bVar4, new q7b(xz7Var4, true, false, cardStatus2.getValue(), (Integer) null, str, false, z, 500)), null, null, null, null, null, null, null, false, false, false, null, 16380);
            boolean z2 = false;
            jw0 jw0Var2 = new jw0(new ChatMessage(2, 464, "tutor", "Lynx AI", "¡Claro! Te puedo ayudar con eso. ¿De qué te gustaría hablar?", "Of course! I can help you with that. What would you like to talk about?", str, (String) null, (List) null), vz1.m23605K(new q7b(new xz7(1, 6, 0, 0, "Claro", 1, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, false, cardStatus2.getValue(), (Integer) null, (String) null, false, z2, 500), new q7b(new xz7(11, 16, 0, 0, "puedo", 2, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), false, true, 0, (Integer) null, wordStatus2.getValue(), false, z2, 474), new q7b(new xz7(17, 23, 0, 0, "ayudar", 3, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, false, cardStatus.getValue(), (Integer) null, (String) null, false, z2, 500), new q7b(new xz7(44, 52, 0, 0, "gustaría", 4, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, false, cardStatus.getValue(), (Integer) null, (String) null, false, z2, 500)), null, null, null, null, TranslationState.Showing, null, null, false, false, false, null, 16316);
            ChatMessage chatMessage2 = new ChatMessage(3, 464, "user", "User", "Hablemos de viajes. ¿Cuál es tu lugar favorito?", "Let's talk about travel. What is your favorite place?", (String) null, (String) null, (List) null);
            boolean z3 = false;
            q7b q7bVar5 = new q7b(new xz7(0, 8, 0, 0, "Hablemos", 1, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), false, true, 0, (Integer) null, wordStatus2.getValue(), false, z3, 474);
            xz7 xz7Var5 = new xz7(12, 18, 0, 0, "viajes", 2, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092);
            CardStatus cardStatus3 = CardStatus.Familiar;
            String str2 = null;
            jw0 jw0Var3 = new jw0(chatMessage2, vz1.m23605K(q7bVar5, new q7b(xz7Var5, true, false, cardStatus3.getValue(), (Integer) null, (String) null, false, z3, 500), new q7b(new xz7(32, 37, 0, 0, "lugar", 3, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, false, cardStatus.getValue(), (Integer) null, (String) null, false, z3, 500), new q7b(new xz7(39, 45, 0, 0, "favorito", 4, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), false, true, 0, (Integer) null, wordStatus.getValue(), false, z3, 474)), null, null, null, null, null, null, null, false, false, false, null, 16380);
            int i5 = 0;
            int i6 = 1019;
            int i7 = 0;
            List listM23605K = vz1.m23605K(new ChatPhrase("una ciudad hermosa", "", 0, "", null, vz1.m23604J(new TokenMeaning(0, null, "a beautiful city", i7, false, str2, false, i5, i6))), new ChatPhrase("mucha historia y arte", "a lot of history and art", cardStatus.getValue(), "", null, vz1.m23604J(new TokenMeaning(0, null, "a lot of history and art", i7, false, str2, false, i5, i6))));
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = true;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = true;
            boolean z11 = false;
            b34.m3232b(thb.m22061t(c99.m4411d(b16.f7762a, 1.0f)), snb.f61073b, snb.f61075d, null, null, 0, 0L, 0L, null, ci8.m4703P(1641196772, new ik0(vz1.m23605K(jw0Var, jw0Var2, jw0Var3, new jw0(new ChatMessage(4, 448, "tutor", "Lynx AI", "Me encanta París. Es una ciudad hermosa con mucha historia y arte.", "I love Paris. It's a beautiful city with a lot of history and art.", (String) null, (String) null, listM23605K), vz1.m23605K(new q7b(new xz7(3, 10, 0, 0, "encanta", 1, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, z5, cardStatus.getValue(), (Integer) null, (String) (0 == true ? 1 : 0), false, z4, 500), new q7b(new xz7(11, 16, 0, 0, "París", 2, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), z5, z7, 0, (Integer) (0 == true ? 1 : 0), wordStatus.getValue(), z4, z6, 474), new q7b(new xz7(25, 31, 0, 0, "ciudad", 3, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), z7, (boolean) (0 == true ? 1 : 0), cardStatus.getValue(), (Integer) null, (String) null, z6, z8, 500), new q7b(new xz7(32, 39, 0, 0, "hermosa", 4, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), (boolean) (0 == true ? 1 : 0), z10, 0, (Integer) (0 == true ? 1 : 0), wordStatus2.getValue(), z8, z9, 474), new q7b(new xz7(49, 58, 0, 0, "historia", 5, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), z10, (boolean) (0 == true ? 1 : 0), cardStatus3.getValue(), (Integer) null, (String) null, z9, z11, 500), new q7b(new xz7(61, 65, 0, 0, "arte", 6, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262092), true, false, cardStatus2.getValue(), (Integer) (0 == true ? 1 : 0), (String) null, z11, false, 500)), null, null, null, null, null, PhrasesState.Showing, null, false, false, false, null, 16252)), nz9Var, new fw0(), i3), tj3Var), tj3Var, 805306800, 504);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zr0(nz9Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22518c(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2030150728);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var2) ? 32 : 16);
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r46.m20381f(AbstractC3584sr.m21609V(c99.m4428u(b16.f7762a, 0.0f, 400.0f, 1), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38962k, 0.0f, 2), null, te1.m22003q(62, 12.0f), te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55825J, 0L, tj3Var2), ci8.m4703P(672691470, new bw0(ui3Var2, ui3Var, i3), tj3Var2), tj3Var2, 24576, 2);
            tj3Var = tj3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m22519d(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bMo6782d = byteString.mo6782d(i);
            if (bMo6782d == 34) {
                sb.append("\\\"");
            } else if (bMo6782d == 39) {
                sb.append("\\'");
            } else if (bMo6782d != 92) {
                switch (bMo6782d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo6782d < 32 || bMo6782d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo6782d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo6782d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo6782d & 7) + 48));
                        } else {
                            sb.append((char) bMo6782d);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
