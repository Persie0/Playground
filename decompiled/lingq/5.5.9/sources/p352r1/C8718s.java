package p352r1;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.C0689a;
import dm.C5207g;

/* JADX INFO: renamed from: r1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8718s implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final C0689a f46310a;

    /* JADX INFO: renamed from: b */
    public final int f46311b;

    public C8718s(String str, int i10) {
        this.f46310a = new C0689a(str);
        this.f46311b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8718s)) {
            return false;
        }
        C8718s c8718s = (C8718s) obj;
        return C5207g.m11106a(this.f46310a.f4523a, c8718s.f46310a.f4523a) && this.f46311b == c8718s.f46311b;
    }

    public final int hashCode() {
        return (this.f46310a.f4523a.hashCode() * 31) + this.f46311b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f46310a.f4523a);
        sb2.append("', newCursorPosition=");
        return C0204c.m853l(sb2, this.f46311b, ')');
    }
}
