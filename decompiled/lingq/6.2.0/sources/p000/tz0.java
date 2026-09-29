package p000;

import com.lingq.feature.chat.ChatMode;

/* JADX INFO: loaded from: classes2.dex */
public final class tz0 {

    /* JADX INFO: renamed from: a */
    public final String f63113a;

    /* JADX INFO: renamed from: b */
    public final String f63114b;

    /* JADX INFO: renamed from: c */
    public final yx0 f63115c;

    /* JADX INFO: renamed from: d */
    public final tx0 f63116d;

    /* JADX INFO: renamed from: e */
    public final a7d f63117e;

    /* JADX INFO: renamed from: f */
    public final ChatMode f63118f;

    /* JADX INFO: renamed from: g */
    public final kv0 f63119g;

    /* JADX INFO: renamed from: h */
    public final String f63120h;

    /* JADX INFO: renamed from: i */
    public final qn5 f63121i;

    public tz0(String str, String str2, yx0 yx0Var, tx0 tx0Var, a7d a7dVar, ChatMode chatMode, kv0 kv0Var, String str3, qn5 qn5Var) {
        str.getClass();
        str2.getClass();
        yx0Var.getClass();
        tx0Var.getClass();
        a7dVar.getClass();
        chatMode.getClass();
        this.f63113a = str;
        this.f63114b = str2;
        this.f63115c = yx0Var;
        this.f63116d = tx0Var;
        this.f63117e = a7dVar;
        this.f63118f = chatMode;
        this.f63119g = kv0Var;
        this.f63120h = str3;
        this.f63121i = qn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz0)) {
            return false;
        }
        tz0 tz0Var = (tz0) obj;
        return fa4.m11650l(this.f63113a, tz0Var.f63113a) && fa4.m11650l(this.f63114b, tz0Var.f63114b) && fa4.m11650l(this.f63115c, tz0Var.f63115c) && fa4.m11650l(this.f63116d, tz0Var.f63116d) && fa4.m11650l(this.f63117e, tz0Var.f63117e) && this.f63118f == tz0Var.f63118f && fa4.m11650l(this.f63119g, tz0Var.f63119g) && fa4.m11650l(this.f63120h, tz0Var.f63120h) && fa4.m11650l(this.f63121i, tz0Var.f63121i);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c((this.f63119g.hashCode() + ((this.f63118f.hashCode() + ((this.f63117e.hashCode() + ((this.f63116d.hashCode() + ((this.f63115c.hashCode() + ux5.m22980c(this.f63113a.hashCode() * 31, this.f63114b, 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.f63120h, 31);
        qn5 qn5Var = this.f63121i;
        return iM22980c + (qn5Var == null ? 0 : qn5Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChatUiState(language=", this.f63113a, ", locale=", this.f63114b, ", screenStateType=");
        sbM23000w.append(this.f63115c);
        sbM23000w.append(", screenState=");
        sbM23000w.append(this.f63116d);
        sbM23000w.append(", sidebarState=");
        sbM23000w.append(this.f63117e);
        sbM23000w.append(", chatMode=");
        sbM23000w.append(this.f63118f);
        sbM23000w.append(", chatBotConfig=");
        sbM23000w.append(this.f63119g);
        sbM23000w.append(", welcomeInputLabel=");
        sbM23000w.append(this.f63120h);
        sbM23000w.append(", lynxModelSelector=");
        sbM23000w.append(this.f63121i);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
