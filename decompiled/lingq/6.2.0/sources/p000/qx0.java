package p000;

import androidx.compose.p002ui.focus.InterfaceC0300b;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qx0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58325a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f58327c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f58328d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f58329e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f58330f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f58331g;

    public /* synthetic */ qx0(jv0 jv0Var, ChatMessage chatMessage, ChatPhrase chatPhrase, d87 d87Var, xz7 xz7Var, t66 t66Var) {
        this.f58326b = jv0Var;
        this.f58328d = chatMessage;
        this.f58329e = chatPhrase;
        this.f58330f = d87Var;
        this.f58331g = xz7Var;
        this.f58327c = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f58325a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f58326b;
        Object obj2 = this.f58330f;
        Object obj3 = this.f58329e;
        Object obj4 = this.f58331g;
        t66 t66Var = this.f58327c;
        Object obj5 = this.f58328d;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj5;
                ld9 ld9Var = (ld9) obj3;
                InterfaceC0300b interfaceC0300b = (InterfaceC0300b) obj2;
                jv0 jv0Var = (jv0) obj;
                t66 t66Var2 = (t66) obj4;
                tx0 tx0Var = tz0Var.f63116d;
                if (tx0Var.f63049n) {
                    if (ld9Var != null) {
                        ((pa2) ld9Var).m19004a();
                    }
                    InterfaceC0300b.m1355a(interfaceC0300b);
                    jv0Var.mo8883j();
                    return xfaVar;
                }
                if (!tx0Var.f63048m || vk9.m23376L0((String) t66Var.getValue()).toString().length() <= 0 || ((Boolean) t66Var2.getValue()).booleanValue()) {
                    return xfaVar;
                }
                if (ld9Var != null) {
                    ((pa2) ld9Var).m19004a();
                }
                InterfaceC0300b.m1355a(interfaceC0300b);
                yx0 yx0Var = tz0Var.f63115c;
                if (fa4.m11650l(yx0Var, ux0.f64483a)) {
                    if (!((Boolean) t66Var2.getValue()).booleanValue()) {
                        jv0Var.mo8871E(tz0Var.f63116d.f63041f, (String) t66Var.getValue());
                    }
                } else if (fa4.m11650l(yx0Var, xx0.f68916a)) {
                    if (!((Boolean) t66Var2.getValue()).booleanValue()) {
                        jv0Var.mo8879f((String) t66Var.getValue());
                    }
                } else if (!fa4.m11650l(yx0Var, wx0.f67466a) && !fa4.m11650l(yx0Var, vx0.f66039a)) {
                    gm5.m12750e();
                    return null;
                }
                t66Var.setValue("");
                return xfaVar;
            case 1:
                jv0 jv0Var2 = (jv0) obj;
                d87 d87Var = (d87) obj2;
                xz7 xz7Var = (xz7) obj4;
                int i2 = ((ChatMessage) obj5).f18920a;
                String str = ((ChatPhrase) obj3).f18937a;
                int i3 = d87Var != null ? d87Var.f35172a : 0;
                jv0Var2.mo8887n(i2, new xz7(d87Var != null ? d87Var.f35173b : 0, d87Var != null ? d87Var.f35174c : 0, 0, 0, str, i3, xz7Var != null ? xz7Var.f69010g : 0, xz7Var != null ? xz7Var.f69011h : 0, (String) null, (TokenTransliteration) null, TextTokenType.PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 260876), TokenType.NewWordOrPhraseType, (e28) t66Var.getValue());
                return xfaVar;
            default:
                ((cj3) obj5).mo1291i(t66Var.getValue(), ((t66) obj4).getValue(), ((t66) obj3).getValue(), ((t66) obj2).getValue(), ((t66) obj).getValue());
                return xfaVar;
        }
    }

    public /* synthetic */ qx0(tz0 tz0Var, ld9 ld9Var, InterfaceC0300b interfaceC0300b, jv0 jv0Var, t66 t66Var, t66 t66Var2) {
        this.f58328d = tz0Var;
        this.f58329e = ld9Var;
        this.f58330f = interfaceC0300b;
        this.f58326b = jv0Var;
        this.f58327c = t66Var;
        this.f58331g = t66Var2;
    }

    public /* synthetic */ qx0(cj3 cj3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5) {
        this.f58328d = cj3Var;
        this.f58327c = t66Var;
        this.f58331g = t66Var2;
        this.f58329e = t66Var3;
        this.f58330f = t66Var4;
        this.f58326b = t66Var5;
    }
}
